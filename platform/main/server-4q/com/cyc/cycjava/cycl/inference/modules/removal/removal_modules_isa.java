/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_accessors.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-ISA
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-isa.lisp
 * created:     2019/07/03 17:37:44
 */
public final class removal_modules_isa extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_isa();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa";


    // deflexical
    // Slightly favor SBHL isa checking for forts.
    /**
     * Slightly favor SBHL isa checking for forts.
     */
    @LispMethod(comment = "Slightly favor SBHL isa checking for forts.\ndeflexical")
    private static final SubLSymbol $isa_fort_collection_cost$ = makeSymbol("*ISA-FORT-COLLECTION-COST*");

    // deflexical
    // Do not favor SBHL isa checking for non-forts.
    /**
     * Do not favor SBHL isa checking for non-forts.
     */
    @LispMethod(comment = "Do not favor SBHL isa checking for non-forts.\ndeflexical")
    private static final SubLSymbol $isa_non_fort_collection_cost$ = makeSymbol("*ISA-NON-FORT-COLLECTION-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_isa_collection_check_cost$ = makeSymbol("*DEFAULT-NOT-ISA-COLLECTION-CHECK-COST*");

    // deflexical
    // Do not favor defn checking for forts.
    /**
     * Do not favor defn checking for forts.
     */
    @LispMethod(comment = "Do not favor defn checking for forts.\ndeflexical")
    private static final SubLSymbol $isa_fort_defn_cost$ = makeSymbol("*ISA-FORT-DEFN-COST*");

    // deflexical
    // Slightly favor defn checking for non-forts.
    /**
     * Slightly favor defn checking for non-forts.
     */
    @LispMethod(comment = "Slightly favor defn checking for non-forts.\ndeflexical")
    private static final SubLSymbol $isa_non_fort_defn_cost$ = makeSymbol("*ISA-NON-FORT-DEFN-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $all_instances_lazy_iteration_threshold$ = makeSymbol("*ALL-INSTANCES-LAZY-ITERATION-THRESHOLD*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $subcollection_functors$ = makeSymbol("*SUBCOLLECTION-FUNCTORS*");

    // deflexical
    // Slightly favor SBHL quoted isa checking for forts.
    /**
     * Slightly favor SBHL quoted isa checking for forts.
     */
    @LispMethod(comment = "Slightly favor SBHL quoted isa checking for forts.\ndeflexical")
    private static final SubLSymbol $quoted_isa_fort_collection_cost$ = makeSymbol("*QUOTED-ISA-FORT-COLLECTION-COST*");

    // deflexical
    // Do not favor SBHL quoted isa checking for non-forts.
    /**
     * Do not favor SBHL quoted isa checking for non-forts.
     */
    @LispMethod(comment = "Do not favor SBHL quoted isa checking for non-forts.\ndeflexical")
    private static final SubLSymbol $quoted_isa_non_fort_collection_cost$ = makeSymbol("*QUOTED-ISA-NON-FORT-COLLECTION-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_quoted_isa_collection_check_cost$ = makeSymbol("*DEFAULT-NOT-QUOTED-ISA-COLLECTION-CHECK-COST*");

    // deflexical
    // Do not favor quoted defn checking for forts.
    /**
     * Do not favor quoted defn checking for forts.
     */
    @LispMethod(comment = "Do not favor quoted defn checking for forts.\ndeflexical")
    private static final SubLSymbol $quoted_isa_fort_defn_cost$ = makeSymbol("*QUOTED-ISA-FORT-DEFN-COST*");

    // deflexical
    // Slightly favor quoted defn checking for non-forts.
    /**
     * Slightly favor quoted defn checking for non-forts.
     */
    @LispMethod(comment = "Slightly favor quoted defn checking for non-forts.\ndeflexical")
    private static final SubLSymbol $quoted_isa_non_fort_defn_cost$ = makeSymbol("*QUOTED-ISA-NON-FORT-DEFN-COST*");



    private static final SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");

    private static final SubLSymbol $REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");

    private static final SubLSymbol $REMOVAL_ABDUCTION_POS_CHECK = makeKeyword("REMOVAL-ABDUCTION-POS-CHECK");

    private static final SubLSymbol $REMOVAL_ABDUCTION_POS_UNIFY = makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY");

    private static final SubLSymbol $REMOVAL_RELATION_ALL_EXISTS_CHECK = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-CHECK");

    private static final SubLSymbol $REMOVAL_RELATION_ALL_EXISTS_UNIFY = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY");

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_ALL_CHECK = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-CHECK");

    private static final SubLSymbol $REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");

    private static final SubLSymbol $ALL_INSTANCES_POS = makeKeyword("ALL-INSTANCES-POS");

    static private final SubLList $list13 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("ALL-INSTANCES-POS-PREFERENCE"));

    private static final SubLSymbol $ALL_ISA_POS = makeKeyword("ALL-ISA-POS");

    static private final SubLList $list19 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $ALL_ELEMENTOF_POS = makeKeyword("ALL-ELEMENTOF-POS");

    private static final SubLList $list21 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol $REMOVAL_ISA_COLLECTION_CHECK_POS = makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS");

    static private final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$isa #$Dog #$Collection)\n(#$isa (#$JuvenileFn #$Dog) #$Collection)") });

    private static final SubLSymbol $REMOVAL_ISA_COLLECTION_CHECK_NEG = makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-NEG");

    private static final SubLList $list26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa #$Dog #$Predicate))") });



    private static final SubLList $list29 = list(makeSymbol("OBJECT"), makeSymbol("COLLECTION"));

    private static final SubLSymbol $REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS = makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS");

    static private final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), $FORT, makeKeyword("CLOSED-NAUT")), $COST, makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLSymbol $REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS = makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS");

    private static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NOT"), $FORT), makeKeyword("CLOSED-NAUT")), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), $COST, makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLSymbol $REMOVAL_ISA_DEFN_POS = makeKeyword("REMOVAL-ISA-DEFN-POS");

    static private final SubLList $list41 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), $FORT), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ISA-DEFN-POS-REQUIRED"), $COST, makeSymbol("REMOVAL-ISA-DEFN-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-DEFN-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$isa 42 #$Integer)") });

    private static final SubLSymbol $REMOVAL_ISA_DEFN_NEG = makeKeyword("REMOVAL-ISA-DEFN-NEG");

    private static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ISA-DEFN-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-DEFN-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa 42 #$SubLString))") });

    private static final SubLSymbol $REMOVAL_ALL_ISA = makeKeyword("REMOVAL-ALL-ISA");

    private static final SubLList $list46 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$isa #$Dog ?COL)\n(#$isa (#$JuvenileFn #$Cougar) ?COL)") });

    private static final SubLSymbol $sym47$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLSymbol REMOVAL_ALL_ISA_EXPAND = makeSymbol("REMOVAL-ALL-ISA-EXPAND");

    private static final SubLInteger $int$2300 = makeInteger(2300);

    private static final SubLSymbol $REMOVAL_ALL_INSTANCES = makeKeyword("REMOVAL-ALL-INSTANCES");

    private static final SubLList $list53 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ALL-INSTANCES-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-INSTANCES-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-INSTANCES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$isa ?DOG #$Dog)") });



    private static final SubLList $list55 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THESET"), makeSymbol("ELEMENTS")));

    private static final SubLSymbol $REMOVAL_ELEMENTOF_CHECK = makeKeyword("REMOVAL-ELEMENTOF-CHECK");

    private static final SubLList $list59 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog (#$TheSet #$Dog #$Cat))") });

    private static final SubLSymbol $REMOVAL_NOT_ELEMENTOF_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-CHECK");

    private static final SubLList $list61 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> (#$TheSet . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$Bird (#$TheSet #$Dog #$Cat)))") });

    private static final SubLSymbol $REMOVAL_ELEMENTOF_COLLECTION_CHECK = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-CHECK");

    private static final SubLList $list63 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), $FORT, makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <fort>)\n where <fort> is a collection "), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog #$Collection)") });

    private static final SubLSymbol $REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK");

    private static final SubLList $list65 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf 42 #$Integer))\nvia passing a #$defnIff or a #$defnSufficient") });

    private static final SubLSymbol $REMOVAL_ELEMENTOF_SET_CHECK = makeKeyword("REMOVAL-ELEMENTOF-SET-CHECK");

    private static final SubLList $list67 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), list($TEST, makeSymbol("COLLECTION-P"))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETE-PATTERN"), list($TEST, makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ELEMENTOF-SET-CHECK-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is fort set but not a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$GrayColor #$BlackAndWhiteColorScheme) \nvia the KB assertion (#$elementOf #$GrayColor #$BlackAndWhiteColorScheme)") });

    private static final SubLSymbol $REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK");

    private static final SubLList $list69 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), $FORT, makeKeyword("COLLECTION-FORT")), $COST, makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fort> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$Dog #$Predicate))") });

    private static final SubLSymbol $REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK");

    private static final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf 42 #$SubLString))\nvia failing a #$defnIff or a #$defnNecessary") });

    private static final SubLSymbol $REMOVAL_NOT_ELEMENTOF_SET_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-SET-CHECK");

    static private final SubLList $list73 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), list($TEST, makeSymbol("COLLECTION-P"))))), $COST, makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere <fort> is a set but not a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))\nvia the KB assertion\n (#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))") });

    private static final SubLSymbol $REMOVAL_ELEMENTOF_THESETOF_CHECK = makeKeyword("REMOVAL-ELEMENTOF-THESETOF-CHECK");

    private static final SubLList $list76 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$France \n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });

    private static final SubLSymbol $REMOVAL_ISA_THECOLLECTIONOF_CHECK = makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-CHECK");

    static private final SubLList $list78 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-ALL-INSTANCES")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$isa #$France \n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });

    private static final SubLSymbol $REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK");

    private static final SubLList $list81 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$bordersOn ?COUNTRY #$Germany))))") });

    private static final SubLSymbol $REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK = makeKeyword("REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK");

    private static final SubLList $list83 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$politiesBorderEachOther ?COUNTRY #$Germany))))") });

    private static final SubLSymbol $REMOVAL_ALL_ELEMENTOF = makeKeyword("REMOVAL-ALL-ELEMENTOF");

    static private final SubLList $list85 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), $FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ELEMENTOF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog ?WHAT)") });

    private static final SubLSymbol $REMOVAL_NAT_ALL_ELEMENTOF = makeKeyword("REMOVAL-NAT-ALL-ELEMENTOF");

    private static final SubLList $list87 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-ELEMENTOF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf (<fully-bound> . <fully-bound>) <not fully-bound>)\nvia #$resultIsa and #$resultIsaArg"), makeKeyword("EXAMPLE"), makeString("(#$elementOf (#$JuvenileFn #$Cougar) ?WHAT)") });

    static private final SubLList $list88 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLList $list89 = cons(makeSymbol("THESET"), makeSymbol("ELEMENTS"));

    private static final SubLSymbol $REMOVAL_ELEMENTOF_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-UNIFY");

    private static final SubLList $list91 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("NOT-FULLY-BOUND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ELEMENTOF-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT (#$TheSet #$Dog #$Cat))") });

    private static final SubLSymbol $REMOVAL_ELEMENTOF_COLLECTION_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-UNIFY");

    private static final SubLList $list93 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), $COST, makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("elementOf"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?DOG #$Dog)") });

    private static final SubLSymbol $REMOVAL_ELEMENTOF_SET_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-SET-UNIFY");

    private static final SubLList $list95 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), list($TEST, makeSymbol("COLLECTION-P"))))), $COST, makeSymbol("REMOVAL-ELEMENTOF-SET-UNIFY-COST"), makeKeyword("COMPLETE-PATTERN"), list($TEST, makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ELEMENTOF-SET-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is not a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?ELEM #$BlackAndWhiteColorScheme)") });

    private static final SubLSymbol EL_LITERAL_P = makeSymbol("EL-LITERAL-P");

    private static final SubLSymbol $REMOVAL_ELEMENTOF_THESETOF_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-THESETOF-UNIFY");

    private static final SubLList $list99 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("NOT-FULLY-BOUND"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT\n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });

    private static final SubLSymbol $REMOVAL_ISA_THECOLLECTIONOF_UNIFY = makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-UNIFY");

    private static final SubLList $list101 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-ALL-INSTANCES")), $COST, makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$isa ?WHAT\n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });





    private static final SubLString $str104$Expected__s_to_have_only_one_free = makeString("Expected ~s to have only one free variable");

    private static final SubLString $str105$Expected_exactly_one_poslit_in__S = makeString("Expected exactly one poslit in ~S");

    private static final SubLString $str106$Expected_exactly_one___termOfUnit = makeString("Expected exactly one #$termOfUnit neglit in ~S");

    private static final SubLList $list107 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), reader_make_constant_shell("SubcollectionOccursAtFn"), reader_make_constant_shell("CollectionSubsetFn"), reader_make_constant_shell("CollectionIntersection2Fn"), reader_make_constant_shell("CollectionDifferenceFn"));

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-UNIFY");

    private static final SubLList $list109 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-CHECK");

    private static final SubLList $list111 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-UNIFY");

    private static final SubLList $list113 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-CHECK");

    private static final SubLList $list115 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-UNIFY");

    private static final SubLList $list117 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-CHECK");

    private static final SubLList $list119 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-UNIFY");

    private static final SubLList $list121 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-CHECK");

    private static final SubLList $list123 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-UNIFY");

    private static final SubLList $list125 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOccursAtFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-CHECK");

    private static final SubLList $list127 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOccursAtFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY = makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-UNIFY");

    private static final SubLList $list129 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-COLLECTION-SUBSET-FN-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK = makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-CHECK");

    private static final SubLList $list131 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY = makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-UNIFY");

    private static final SubLList $list133 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionIntersection2Fn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK = makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-CHECK");

    private static final SubLList $list135 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionIntersection2Fn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY = makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-UNIFY");

    private static final SubLList $list137 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionDifferenceFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK = makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-CHECK");

    private static final SubLList $list139 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionDifferenceFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_ALL_ISA_OF_TYPE = makeKeyword("REMOVAL-ALL-ISA-OF-TYPE");

    static private final SubLList $list141 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell("isa")), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("TEMPLATE"), list(NIL, list(list(list($BIND, makeSymbol("MT-1")), list($BIND, makeSymbol("ASENT-1"))), list(list($BIND, makeSymbol("MT-2")), list($BIND, makeSymbol("ASENT-2"))))), list($CALL, makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("ASENT-1")), list(makeKeyword("VALUE"), makeSymbol("MT-1")), list(makeKeyword("VALUE"), makeSymbol("ASENT-2")), list(makeKeyword("VALUE"), makeSymbol("MT-2")))), $COST, makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa <fort1> <varN>)\n           (#$isa <varN> <fort2>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa #$AbrahamLincoln ?OCCUPATION)\n           (#$isa ?OCCUPATION #$PersonTypeByOccupation))") });

    private static final SubLSymbol BINARY_CLAUSE_P = makeSymbol("BINARY-CLAUSE-P");

    static private final SubLList $list143 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLList $list145 = list(makeSymbol("CONTEXTUALIZED-ASENT0"), makeSymbol("CONTEXTUALIZED-ASENT1"));

    private static final SubLList $list146 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));

    private static final SubLList $list147 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));



    private static final SubLSymbol $ALL_QUOTED_INSTANCES_POS = makeKeyword("ALL-QUOTED-INSTANCES-POS");

    static private final SubLList $list150 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("ALL-QUOTED-INSTANCES-POS-PREFERENCE"));

    private static final SubLSymbol $ALL_QUOTED_ISA_POS = makeKeyword("ALL-QUOTED-ISA-POS");

    static private final SubLList $list152 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS = makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS");

    static private final SubLList $list154 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <fort>)") });

    private static final SubLSymbol $REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG = makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG");

    static private final SubLList $list156 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedIsa #$Dog #$Predicate))") });

    private static final SubLSymbol $REMOVAL_QUOTED_ISA_DEFN_POS = makeKeyword("REMOVAL-QUOTED-ISA-DEFN-POS");

    static private final SubLList $list158 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("FULLY-BOUND"), $FORT), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED"), $COST, makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa 42 #$SubLInteger)") });

    private static final SubLSymbol $REMOVAL_QUOTED_ISA_DEFN_NEG = makeKeyword("REMOVAL-QUOTED-ISA-DEFN-NEG");

    static private final SubLList $list160 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-QUOTED-ISA-DEFN-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedIsa 42 #$SubLString))") });

    private static final SubLSymbol $REMOVAL_NAT_QUOTED_ISA = makeKeyword("REMOVAL-NAT-QUOTED-ISA");

    static private final SubLList $list162 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <fort>)") });

    private static final SubLSymbol $REMOVAL_ALL_QUOTED_ISA = makeKeyword("REMOVAL-ALL-QUOTED-ISA");

    static private final SubLList $list164 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), $FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa #$Dog ?COL)") });

    private static final SubLSymbol $REMOVAL_NAT_ALL_QUOTED_ISA = makeKeyword("REMOVAL-NAT-ALL-QUOTED-ISA");

    static private final SubLList $list166 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa (#$JuvenileFn #$Cougar) ?COL)") });

    private static final SubLSymbol $REMOVAL_ALL_QUOTED_INSTANCES = makeKeyword("REMOVAL-ALL-QUOTED-INSTANCES");

    static private final SubLList $list168 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <not fully-bound> <fort>)") });

    // Definitions
    public static final SubLObject all_instances_pos_preference_alt(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        {
            SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if ((NIL != cycl_grammar.cycl_nat_p(col)) && (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.subcollection_functor_p(cycl_utilities.nat_functor(col)))) {
                return $PREFERRED;
            } else {
                if (NIL != fort_types_interface.collection_p(col)) {
                    return preference_modules.completeness_to_preference_level(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_collection_iteration_completeness(col));
                } else {
                    return $GROSSLY_DISPREFERRED;
                }
            }
        }
    }

    // Definitions
    public static SubLObject all_instances_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg_bindableP = list_utilities.member_eqP(var, bindable_vars);
        if ((NIL != cycl_grammar.cycl_nat_p(col)) && (NIL != subcollection_functor_p(cycl_utilities.nat_functor(col)))) {
            return $PREFERRED;
        }
        if (NIL != fort_types_interface.collection_p(col)) {
            final SubLObject completeness = inference_collection_iteration_completeness(col);
            SubLObject preference = preference_modules.completeness_to_preference_level(completeness);
            if (((NIL != arg_bindableP) && (NIL != preference_modules.preference_level_LE(preference, $DISPREFERRED))) && (NIL != kb_accessors.check_preferred_collectionP(col, UNPROVIDED))) {
                preference = $DISALLOWED;
            }
            return preference;
        }
        return $GROSSLY_DISPREFERRED;
    }

    public static final SubLObject inference_all_isas_of_type_alt(SubLObject ins, SubLObject type_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if ((NIL != forts.fort_p(ins)) && (NIL != inference_trampolines.inference_collectionP(type_col, UNPROVIDED))) {
                            result = isa.all_isas_wrt(ins, type_col, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject inference_all_isas_of_type(final SubLObject ins, final SubLObject type_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != forts.fort_p(ins)) && (NIL != inference_trampolines.inference_collectionP(type_col, UNPROVIDED))) {
                result = isa.all_isas_wrt(ins, type_col, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject removal_isa_collection_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $isa_fort_collection_cost$.getGlobalValue();
        } else {
            return $isa_non_fort_collection_cost$.getGlobalValue();
        }
    }

    public static SubLObject removal_isa_collection_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $isa_fort_collection_cost$.getGlobalValue();
        }
        return $isa_non_fort_collection_cost$.getGlobalValue();
    }

    public static final SubLObject removal_isa_collection_check_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_not_isa_collection_check_cost(asent);
    }

    public static SubLObject removal_isa_collection_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_isa_collection_check_cost(asent);
    }

    public static final SubLObject removal_isa_collection_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_collection_check_expand(asent);
    }

    public static SubLObject removal_isa_collection_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_collection_check_expand(asent);
    }

    public static final SubLObject removal_isa_collection_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_not_isa_collection_check_expand(asent);
    }

    public static SubLObject removal_isa_collection_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_isa_collection_check_expand(asent);
    }

    public static final SubLObject removal_isa_collection_check_expand_alt(SubLObject asent) {
        {
            SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (!function_terms.term_functional_complexity(v_object).numGE($int$30)) {
                if (NIL != isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                    backward.removal_add_node(arguments.make_hl_support($ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_isa_collection_check_expand(final SubLObject asent) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((!function_terms.term_functional_complexity(v_object).numGE($int$30)) && (NIL != isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_not_isa_collection_check_cost_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $negation_by_failure$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_collection_check_pos_cost(asent, UNPROVIDED);
            }
            return $default_not_isa_collection_check_cost$.getDynamicValue(thread);
        }
    }

    public static SubLObject removal_not_isa_collection_check_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $negation_by_failure$.getDynamicValue(thread)) {
            return removal_isa_collection_check_pos_cost(asent, UNPROVIDED);
        }
        return $default_not_isa_collection_check_cost$.getDynamicValue(thread);
    }

    public static final SubLObject removal_not_isa_collection_check_expand_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject v_object = NIL;
                SubLObject collection = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt27);
                v_object = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt27);
                collection = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED))) {
                        backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } else {
                        if (NIL != isa.not_isa_by_sbhlP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                            backward.removal_add_node(arguments.make_hl_support($ISA, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt27);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_not_isa_collection_check_expand(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != isa.not_isa_by_sbhlP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                    backward.removal_add_node(arguments.make_hl_support($ISA, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }

        } else {
            cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    public static final SubLObject removal_isa_naut_collection_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $hl_module_check_cost$.getDynamicValue(thread);
        }
    }

    public static SubLObject removal_isa_naut_collection_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hl_module_check_cost$.getDynamicValue(thread);
    }

    public static final SubLObject removal_isa_naut_collection_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_naut_collection_lookup_pos_expand(asent, sense);
    }

    public static SubLObject removal_isa_naut_collection_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_naut_collection_lookup_pos_expand(asent, sense);
    }

    public static final SubLObject removal_isa_naut_collection_lookup_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
                return $hl_module_check_cost$.getDynamicValue(thread);
            } else {
                return kb_indexing.num_best_gaf_lookup_index(asent, $TRUE, UNPROVIDED);
            }
        }
    }

    public static SubLObject removal_isa_naut_collection_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $hl_module_check_cost$.getDynamicValue(thread);
        }
        return kb_indexing.num_best_gaf_lookup_index(asent, $TRUE, UNPROVIDED);
    }

    public static final SubLObject removal_isa_naut_collection_lookup_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, sense);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                {
                                                                    SubLObject done_var_1 = NIL;
                                                                    SubLObject token_var_2 = NIL;
                                                                    while (NIL == done_var_1) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                            SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                            if (NIL != valid_3) {
                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                                                            }
                                                                            done_var_1 = makeBoolean(NIL == valid_3);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                {
                                                                    SubLObject done_var_4 = NIL;
                                                                    SubLObject token_var_5 = NIL;
                                                                    while (NIL == done_var_4) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                            SubLObject valid_6 = makeBoolean(token_var_5 != assertion);
                                                                            if (NIL != valid_6) {
                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                                                            }
                                                                            done_var_4 = makeBoolean(NIL == valid_6);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            }
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                {
                                                                    SubLObject done_var_7 = NIL;
                                                                    SubLObject token_var_8 = NIL;
                                                                    while (NIL == done_var_7) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                            SubLObject valid_9 = makeBoolean(token_var_8 != assertion);
                                                                            if (NIL != valid_9) {
                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                                                            }
                                                                            done_var_7 = makeBoolean(NIL == valid_9);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                                {
                                                                    SubLObject done_var_10 = NIL;
                                                                    SubLObject token_var_11 = NIL;
                                                                    while (NIL == done_var_10) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                            SubLObject valid_12 = makeBoolean(token_var_11 != assertion);
                                                                            if (NIL != valid_12) {
                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                                                            }
                                                                            done_var_10 = makeBoolean(NIL == valid_12);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                        {
                                                            SubLObject done_var_13 = NIL;
                                                            SubLObject token_var_14 = NIL;
                                                            while (NIL == done_var_13) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                    SubLObject valid_15 = makeBoolean(token_var_14 != assertion);
                                                                    if (NIL != valid_15) {
                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                                                    }
                                                                    done_var_13 = makeBoolean(NIL == valid_15);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    if ((NIL == enumeration_types.sense_truth(sense)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(sense)))) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_isa_naut_collection_lookup_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$1 = NIL;
                                    final SubLObject token_var_$2 = NIL;
                                    while (NIL == done_var_$1) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                        if (NIL != valid_$3) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$1 = makeBoolean(NIL == valid_$3);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$2 = NIL;
                                    final SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                        if (NIL != valid_$4) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$2 = makeBoolean(NIL == valid_$4);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$3 = NIL;
                                    final SubLObject token_var_$4 = NIL;
                                    while (NIL == done_var_$3) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                        if (NIL != valid_$5) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$3 = makeBoolean(NIL == valid_$5);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                        if (NIL != valid_$6) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$5 = NIL;
                                    final SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                        if (NIL != valid_$7) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion2, asent);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == enumeration_types.sense_truth(sense)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense)))) {
                            removal_modules_lookup.removal_lookup_expand_internal(assertion3, asent);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        return NIL;
    }

    public static final SubLObject removal_isa_defn_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $isa_fort_defn_cost$.getGlobalValue();
        } else {
            return $isa_non_fort_defn_cost$.getGlobalValue();
        }
    }

    public static SubLObject removal_isa_defn_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $isa_fort_defn_cost$.getGlobalValue();
        }
        return $isa_non_fort_defn_cost$.getGlobalValue();
    }

    public static final SubLObject removal_isa_defn_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_defn_pos_cost(asent, UNPROVIDED));
    }

    public static SubLObject removal_isa_defn_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_isa_defn_pos_cost(asent, UNPROVIDED));
    }

    public static final SubLObject removal_isa_defn_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_defn_check_expand(asent);
    }

    public static SubLObject removal_isa_defn_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_defn_check_expand(asent);
    }

    public static final SubLObject removal_isa_defn_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_defn_reject_expand(asent);
    }

    public static SubLObject removal_isa_defn_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_defn_reject_expand(asent);
    }

    /**
     * If there are no sufficient defns, this module does not apply.
     */
    @LispMethod(comment = "If there are no sufficient defns, this module does not apply.")
    public static final SubLObject removal_isa_defn_pos_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean((NIL != at_defns.any_sufficient_defn_anywhereP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) || (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
    }

    /**
     * If there are no sufficient defns, this module does not apply.
     */
    @LispMethod(comment = "If there are no sufficient defns, this module does not apply.")
    public static SubLObject removal_isa_defn_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean((NIL != at_defns.any_sufficient_defn_anywhereP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) || (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))));
    }

    public static final SubLObject removal_isa_defn_check_expand_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject v_object = NIL;
                SubLObject collection = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt27);
                v_object = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt27);
                collection = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                            try {
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                if (NIL != at_defns.quiet_defns_admitP(collection, v_object, NIL)) {
                                    backward.removal_add_node(arguments.make_hl_support($DEFN, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt27);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_isa_defn_check_expand(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                try {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                    if (NIL != at_defns.quiet_defns_admitP(collection, v_object, NIL)) {
                        backward.removal_add_node(arguments.make_hl_support($DEFN, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    public static final SubLObject removal_isa_defn_reject_expand_alt(SubLObject asent) {
        {
            SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != at_defns.quiet_defns_rejectP(collection, v_object, NIL)) {
                backward.removal_add_node(arguments.make_hl_support($DEFN, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_isa_defn_reject_expand(final SubLObject asent) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != at_defns.quiet_defns_rejectP(collection, v_object, NIL)) {
            backward.removal_add_node(arguments.make_hl_support($DEFN, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_all_isa_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject collections = isa.all_isa(v_object, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = collections;
                SubLObject collection = NIL;
                for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject unified_arg2 = bindings.subst_bindings(v_bindings, arg2);
                                SubLObject formula = make_binary_formula(predicate, v_object, unified_arg2);
                                backward.removal_add_node(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_all_isa_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject collections = cdolist_list_var = Sort.sort(isa.all_isa(v_object, UNPROVIDED, UNPROVIDED), $sym47$GENERALITY_ESTIMATE_, UNPROVIDED);
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject unified_arg2 = bindings.subst_bindings(v_bindings, arg2);
                final SubLObject formula = make_binary_formula(predicate, v_object, unified_arg2);
                backward.removal_add_node(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_all_instances_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_all_instances_cost(collection);
        }
    }

    public static SubLObject removal_all_instances_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_all_instances_cost(collection);
    }

    public static final SubLObject removal_all_instances_completeness_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_collection_iteration_completeness(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_instances_completeness(final SubLObject asent) {
        return inference_collection_iteration_completeness(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    /**
     *
     *
     * @return completeness-p ; the inferential completness of iterating over all instances of COLLECTION.
     */
    @LispMethod(comment = "@return completeness-p ; the inferential completness of iterating over all instances of COLLECTION.")
    public static final SubLObject inference_collection_iteration_completeness_alt(SubLObject collection) {
        if (NIL == forts.fort_p(collection)) {
            return $GROSSLY_INCOMPLETE;
        } else {
            if ((NIL != at_defns.any_sufficient_defn_anywhereP(collection)) || (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(collection))) {
                return $GROSSLY_INCOMPLETE;
            } else {
                if (NIL != completely_enumerable_collectionP(collection, UNPROVIDED)) {
                    return $COMPLETE;
                } else {
                    return $GROSSLY_INCOMPLETE;
                }
            }
        }
    }

    /**
     *
     *
     * @return completeness-p ; the inferential completness of iterating over all instances of COLLECTION.
     */
    @LispMethod(comment = "@return completeness-p ; the inferential completness of iterating over all instances of COLLECTION.")
    public static SubLObject inference_collection_iteration_completeness(final SubLObject collection) {
        if (NIL == forts.fort_p(collection)) {
            return $GROSSLY_INCOMPLETE;
        }
        if ((NIL != at_defns.any_sufficient_defn_anywhereP(collection)) || (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(collection))) {
            return $GROSSLY_INCOMPLETE;
        }
        if (NIL != kb_accessors.completely_enumerable_collectionP(collection, UNPROVIDED)) {
            return $COMPLETE;
        }
        return $GROSSLY_INCOMPLETE;
    }

    public static final SubLObject removal_all_instances_iterator_alt(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (cardinality_estimates.instance_cardinality(collection).numG($all_instances_lazy_iteration_threshold$.getDynamicValue(thread))) {
                return kb_iterators.new_instances_iterator(collection);
            }
            return iteration.new_list_iterator(isa.all_instances(collection, UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject removal_all_instances_iterator(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cardinality_estimates.instance_cardinality(collection).numG($all_instances_lazy_iteration_threshold$.getDynamicValue(thread))) {
            return kb_iterators.new_instances_iterator(collection);
        }
        return iteration.new_list_iterator(isa.all_instances(collection, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject inference_all_instances_cost_alt(SubLObject collection) {
        {
            SubLObject instance_iteration_cost = cardinality_estimates.instance_iteration_cost(collection);
            return instance_iteration_cost.isZero() ? ((SubLObject) (kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$isa))) : instance_iteration_cost;
        }
    }

    public static SubLObject inference_all_instances_cost(final SubLObject collection) {
        final SubLObject instance_iteration_cost = cardinality_estimates.instance_iteration_cost(collection);
        return instance_iteration_cost.isZero() ? kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$isa) : instance_iteration_cost;
    }

    public static final SubLObject removal_elementof_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject element = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            element = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt52);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject theset = NIL;
                    SubLObject elements = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt52);
                    theset = current.first();
                    current = current.rest();
                    elements = current;
                    current = temp;
                    if (NIL == current) {
                        if (NIL != subl_promotions.memberP(element, elements, symbol_function(EQUAL), UNPROVIDED)) {
                            backward.removal_add_node(arguments.make_hl_support($ELEMENTOF, asent, mt_relevance_macros.inference_relevant_mt(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt52);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_elementof_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject element = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        element = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject theset = NIL;
        SubLObject elements = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        theset = current.first();
        current = elements = current.rest();
        current = temp;
        if (NIL == current) {
            if (NIL != subl_promotions.memberP(element, elements, symbol_function(EQUAL), UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($ELEMENTOF, asent, mt_relevance_macros.inference_relevant_mt(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list55);
        }
        return NIL;
    }

    public static final SubLObject removal_not_elementof_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject element = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            element = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt52);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject theset = NIL;
                    SubLObject elements = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt52);
                    theset = current.first();
                    current = current.rest();
                    elements = current;
                    current = temp;
                    if (NIL == current) {
                        if (NIL == subl_promotions.memberP(element, elements, symbol_function(EQUAL), UNPROVIDED)) {
                            backward.removal_add_node(arguments.make_hl_support($ELEMENTOF, cycl_utilities.negate(asent), mt_relevance_macros.inference_relevant_mt(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt52);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_not_elementof_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject element = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        element = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject theset = NIL;
        SubLObject elements = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        theset = current.first();
        current = elements = current.rest();
        current = temp;
        if (NIL == current) {
            if (NIL == subl_promotions.memberP(element, elements, symbol_function(EQUAL), UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($ELEMENTOF, cycl_utilities.negate(asent), mt_relevance_macros.inference_relevant_mt(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list55);
        }
        return NIL;
    }

    public static final SubLObject removal_elementof_collection_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_collection_check_expand(asent);
    }

    public static SubLObject removal_elementof_collection_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_collection_check_expand(asent);
    }

    public static final SubLObject removal_elementof_collection_defn_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_defn_check_expand(asent);
    }

    public static SubLObject removal_elementof_collection_defn_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_defn_check_expand(asent);
    }

    public static final SubLObject removal_elementof_set_check_iterator_alt(SubLObject asent) {
        return removal_modules_lookup.removal_lookup_pos_iterator(asent);
    }

    public static SubLObject removal_elementof_set_check_iterator(final SubLObject asent) {
        return removal_modules_lookup.removal_lookup_pos_iterator(asent);
    }

    public static final SubLObject removal_not_elementof_collection_check_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_not_isa_collection_check_cost(asent);
    }

    public static SubLObject removal_not_elementof_collection_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_isa_collection_check_cost(asent);
    }

    public static final SubLObject removal_not_elementof_collection_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_not_isa_collection_check_expand(asent);
    }

    public static SubLObject removal_not_elementof_collection_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_isa_collection_check_expand(asent);
    }

    public static final SubLObject removal_not_elementof_collection_defn_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_defn_reject_expand(asent);
    }

    public static SubLObject removal_not_elementof_collection_defn_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_isa_defn_reject_expand(asent);
    }

    public static final SubLObject removal_not_elementof_set_check_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_modules_lookup.removal_lookup_neg_cost(asent, sense);
    }

    public static SubLObject removal_not_elementof_set_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_modules_lookup.removal_lookup_neg_cost(asent, sense);
    }

    public static final SubLObject removal_not_elementof_set_check_completeness_alt(SubLObject asent) {
        return removal_modules_lookup.removal_lookup_neg_completeness(asent);
    }

    public static SubLObject removal_not_elementof_set_check_completeness(final SubLObject asent) {
        return removal_modules_lookup.removal_lookup_neg_completeness(asent);
    }

    public static final SubLObject removal_not_elementof_set_check_iterator_alt(SubLObject asent) {
        return removal_modules_lookup.removal_lookup_neg_iterator(asent);
    }

    public static SubLObject removal_not_elementof_set_check_iterator(final SubLObject asent) {
        return removal_modules_lookup.removal_lookup_neg_iterator(asent);
    }

    public static final SubLObject removal_elementof_thesetof_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_elementof_thesetof_check(element, the_set_of, UNPROVIDED);
                    SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != results) && (NIL != validP)) {
                        backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_elementof_thesetof_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject element = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = inference_elementof_thesetof_check(element, the_set_of, UNPROVIDED);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != results) && (NIL != validP)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject inference_elementof_thesetof_check_alt(SubLObject element, SubLObject the_set_of, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject variable = cycl_utilities.nat_arg1(the_set_of, UNPROVIDED);
                SubLObject formula = cycl_utilities.nat_arg2(the_set_of, UNPROVIDED);
                SubLObject ask_formula = subst(element, variable, formula, UNPROVIDED, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject results = inference_trampolines.inference_true_sentence_recursive_query(ask_formula, mt, UNPROVIDED);
                    SubLObject halt_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason)) {
                        Errors.error(inference_datastructures_enumerated_types.inference_error_suspend_status_message(halt_reason));
                    } else {
                        if (NIL != inference_datastructures_enumerated_types.exhausted_query_halt_reason_p(halt_reason)) {
                            return values(results, T);
                        } else {
                            return values(results, NIL);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject inference_elementof_thesetof_check(final SubLObject element, final SubLObject the_set_of, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variable = cycl_utilities.nat_arg1(the_set_of, UNPROVIDED);
        final SubLObject formula = cycl_utilities.nat_arg2(the_set_of, UNPROVIDED);
        final SubLObject ask_formula = subst(element, variable, formula, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = inference_trampolines.inference_true_sentence_recursive_query(ask_formula, mt, UNPROVIDED, UNPROVIDED);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason)) {
            Errors.error(inference_datastructures_enumerated_types.inference_error_suspend_status_message(halt_reason));
            return NIL;
        }
        if (NIL != inference_datastructures_enumerated_types.exhausted_query_halt_reason_p(halt_reason)) {
            return values(results, T);
        }
        return values(results, NIL);
    }

    public static final SubLObject removal_isa_thecollectionof_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_elementof_thesetof_check_expand(asent, UNPROVIDED);
    }

    public static SubLObject removal_isa_thecollectionof_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_elementof_thesetof_check_expand(asent, UNPROVIDED);
    }

    public static final SubLObject removal_not_elementof_thesetof_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_elementof_thesetof_check(element, the_set_of, UNPROVIDED);
                    SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == results) && (NIL != validP)) {
                        {
                            SubLObject bound_the_set_of = cycl_utilities.expression_subst(element, cycl_utilities.formula_arg1(the_set_of, UNPROVIDED), cycl_utilities.formula_arg2(the_set_of, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                            backward.removal_add_node(arguments.make_hl_support($QUERY, cycl_utilities.negate(bound_the_set_of), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_not_elementof_thesetof_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject element = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = inference_elementof_thesetof_check(element, the_set_of, UNPROVIDED);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == results) && (NIL != validP)) {
            final SubLObject bound_the_set_of = cycl_utilities.expression_subst(element, cycl_utilities.formula_arg1(the_set_of, UNPROVIDED), cycl_utilities.formula_arg2(the_set_of, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(arguments.make_hl_support($QUERY, cycl_utilities.negate(bound_the_set_of), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_not_isa_thecollectionof_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_not_elementof_thesetof_check_expand(asent, UNPROVIDED);
    }

    public static SubLObject removal_not_isa_thecollectionof_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_elementof_thesetof_check_expand(asent, UNPROVIDED);
    }

    public static final SubLObject removal_all_elementof_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_all_isa_expand(asent, UNPROVIDED);
    }

    public static SubLObject removal_all_elementof_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_isa_expand(asent, UNPROVIDED);
    }

    public static final SubLObject removal_nat_all_elementof_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_all_isa_expand(asent, UNPROVIDED);
    }

    public static SubLObject removal_nat_all_elementof_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_isa_expand(asent, UNPROVIDED);
    }

    public static final SubLObject removal_elementof_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return length(cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject removal_elementof_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return length(cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED));
    }

    public static final SubLObject removal_elementof_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt85);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt85);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject datum_16 = arg2;
                        SubLObject current_17 = datum_16;
                        SubLObject theset = NIL;
                        SubLObject elements = NIL;
                        destructuring_bind_must_consp(current_17, datum_16, $list_alt86);
                        theset = current_17.first();
                        current_17 = current_17.rest();
                        elements = current_17;
                        {
                            SubLObject cdolist_list_var = elements;
                            SubLObject element = NIL;
                            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings = unification_utilities.term_unify(arg1, element, T, T);
                                    SubLObject unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != v_bindings) {
                                        {
                                            SubLObject formula = make_binary_formula($$elementOf, bindings.subst_bindings(v_bindings, arg1), arg2);
                                            backward.removal_add_node(arguments.make_hl_support($ELEMENTOF, formula, mt_relevance_macros.inference_relevant_mt(), $TRUE_MON), v_bindings, unify_justification);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt85);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_elementof_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list88);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list88);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$18;
            final SubLObject datum_$17 = current_$18 = arg2;
            SubLObject theset = NIL;
            SubLObject elements = NIL;
            destructuring_bind_must_consp(current_$18, datum_$17, $list89);
            theset = current_$18.first();
            current_$18 = current_$18.rest();
            SubLObject cdolist_list_var;
            elements = cdolist_list_var = current_$18;
            SubLObject element = NIL;
            element = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg1, element, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject formula = make_binary_formula($$elementOf, bindings.subst_bindings(v_bindings, arg1), arg2);
                    backward.removal_add_node(arguments.make_hl_support($ELEMENTOF, formula, mt_relevance_macros.inference_relevant_mt(), $TRUE_MON), v_bindings, unify_justification);
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list88);
        }
        return NIL;
    }

    public static final SubLObject removal_elementof_collection_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_all_instances_cost(asent, sense);
    }

    public static SubLObject removal_elementof_collection_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_instances_cost(asent, sense);
    }

    public static final SubLObject removal_elementof_collection_unify_completeness_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_all_instances_completeness(asent);
    }

    public static SubLObject removal_elementof_collection_unify_completeness(final SubLObject asent) {
        return removal_all_instances_completeness(asent);
    }

    public static final SubLObject removal_elementof_collection_unify_iterator_alt(SubLObject collection) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_all_instances_iterator(collection);
    }

    public static SubLObject removal_elementof_collection_unify_iterator(final SubLObject collection) {
        return removal_all_instances_iterator(collection);
    }

    public static final SubLObject removal_elementof_set_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_modules_lookup.removal_lookup_pos_cost(asent, sense);
    }

    public static SubLObject removal_elementof_set_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_modules_lookup.removal_lookup_pos_cost(asent, sense);
    }

    public static final SubLObject removal_elementof_set_unify_iterator_alt(SubLObject asent) {
        return removal_modules_lookup.removal_lookup_pos_iterator(asent);
    }

    public static SubLObject removal_elementof_set_unify_iterator(final SubLObject asent) {
        return removal_modules_lookup.removal_lookup_pos_iterator(asent);
    }

    public static final SubLObject removal_elementof_thesetof_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject elementof = unmake_binary_formula(asent);
                SubLObject arg1 = thread.secondMultipleValue();
                SubLObject thesetof_nat = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject thesetof = unmake_binary_formula(thesetof_nat);
                    SubLObject var = thread.secondMultipleValue();
                    SubLObject such_that = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject smart_cost = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_elementof_thesetof_unify_cost_smart(var, such_that);
                        return NIL != smart_cost ? ((SubLObject) (smart_cost)) : backward_utilities.$inference_recursive_query_overhead$.getDynamicValue(thread);
                    }
                }
            }
        }
    }

    public static SubLObject removal_elementof_thesetof_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject elementof = unmake_binary_formula(asent);
        final SubLObject arg1 = thread.secondMultipleValue();
        final SubLObject thesetof_nat = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject thesetof = unmake_binary_formula(thesetof_nat);
        final SubLObject var = thread.secondMultipleValue();
        final SubLObject such_that = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject smart_cost = removal_elementof_thesetof_unify_cost_smart(var, such_that);
        return NIL != smart_cost ? smart_cost : backward_utilities.$inference_recursive_query_overhead$.getDynamicValue(thread);
    }

    /**
     * Tries to estimate the cost of a recursive query by finding the estimated cost
     * of its cheapest literal.
     *
     * @return nil or numberp
     */
    @LispMethod(comment = "Tries to estimate the cost of a recursive query by finding the estimated cost\r\nof its cheapest literal.\r\n\r\n@return nil or numberp\nTries to estimate the cost of a recursive query by finding the estimated cost\nof its cheapest literal.")
    public static final SubLObject removal_elementof_thesetof_unify_cost_smart_alt(SubLObject el_var, SubLObject such_that) {
        if (NIL != el_grammar.el_literal_p(such_that)) {
            such_that = make_conjunction(list(such_that));
        }
        if (NIL != el_conjunction_p(such_that)) {
            {
                SubLObject el_literals = cycl_utilities.formula_args(such_that, UNPROVIDED);
                if ((NIL != el_literals) && (NIL != every_in_list(EL_LITERAL_P, cycl_utilities.formula_args(such_that, UNPROVIDED), UNPROVIDED))) {
                    {
                        SubLObject cheapest_literal_cost = number_utilities.positive_infinity();
                        SubLObject cdolist_list_var = el_literals;
                        SubLObject el_literal = NIL;
                        for (el_literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , el_literal = cdolist_list_var.first()) {
                            {
                                SubLObject hl_literal = cycl_utilities.expression_subst(variables.find_variable_by_id(ZERO_INTEGER), el_var, el_literal, UNPROVIDED, UNPROVIDED);
                                SubLObject asent = literal_atomic_sentence(hl_literal);
                                SubLObject sense = literal_sense(hl_literal);
                                SubLObject cost = inference_utilities.literal_removal_cost(asent, sense, UNPROVIDED, UNPROVIDED);
                                if (NIL != number_utilities.potentially_infinite_number_LE(cost, cheapest_literal_cost)) {
                                    cheapest_literal_cost = cost;
                                }
                            }
                        }
                        if (cheapest_literal_cost.isNumber()) {
                            return cheapest_literal_cost;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Tries to estimate the cost of a recursive query by finding the estimated cost
     * of its cheapest literal.
     *
     * @return nil or numberp
     */
    @LispMethod(comment = "Tries to estimate the cost of a recursive query by finding the estimated cost\r\nof its cheapest literal.\r\n\r\n@return nil or numberp\nTries to estimate the cost of a recursive query by finding the estimated cost\nof its cheapest literal.")
    public static SubLObject removal_elementof_thesetof_unify_cost_smart(final SubLObject el_var, SubLObject such_that) {
        if (NIL != el_grammar.el_literal_p(such_that)) {
            such_that = make_conjunction(list(such_that));
        }
        if (NIL != el_conjunction_p(such_that)) {
            final SubLObject el_literals = cycl_utilities.formula_args(such_that, UNPROVIDED);
            if ((NIL != el_literals) && (NIL != list_utilities.every_in_list(EL_LITERAL_P, cycl_utilities.formula_args(such_that, UNPROVIDED), UNPROVIDED))) {
                SubLObject cheapest_literal_cost = number_utilities.positive_infinity();
                SubLObject cdolist_list_var = el_literals;
                SubLObject el_literal = NIL;
                el_literal = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject hl_literal = cycl_utilities.expression_subst(variables.find_variable_by_id(ZERO_INTEGER), el_var, el_literal, UNPROVIDED, UNPROVIDED);
                    final SubLObject asent = literal_atomic_sentence(hl_literal);
                    final SubLObject sense = literal_sense(hl_literal);
                    final SubLObject cost = inference_utilities.literal_removal_cost(asent, sense, UNPROVIDED, UNPROVIDED);
                    if (NIL != number_utilities.potentially_infinite_number_LE(cost, cheapest_literal_cost)) {
                        cheapest_literal_cost = cost;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    el_literal = cdolist_list_var.first();
                } 
                if (cheapest_literal_cost.isNumber()) {
                    return cheapest_literal_cost;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_elementof_thesetof_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject elements = ask_utilities.the_set_of_elements(the_set_of, $HL, UNPROVIDED);
                SubLObject cdolist_list_var = elements;
                SubLObject element = NIL;
                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(arg1, element, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject unified_arg1 = bindings.subst_bindings(v_bindings, arg1);
                                SubLObject formula = make_binary_formula(pred, unified_arg1, the_set_of);
                                backward.removal_add_node(arguments.make_hl_support($OPAQUE, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_elementof_thesetof_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject elements = cdolist_list_var = ask_utilities.the_set_of_elements(the_set_of, $HL, UNPROVIDED);
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, element, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject unified_arg1 = bindings.subst_bindings(v_bindings, arg1);
                final SubLObject formula = make_binary_formula(pred, unified_arg1, the_set_of);
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_isa_thecollectionof_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_elementof_thesetof_unify_cost(asent, UNPROVIDED);
    }

    public static SubLObject removal_isa_thecollectionof_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_elementof_thesetof_unify_cost(asent, UNPROVIDED);
    }

    public static final SubLObject removal_isa_thecollectionof_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_elementof_thesetof_unify_expand(asent, UNPROVIDED);
    }

    public static SubLObject removal_isa_thecollectionof_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_elementof_thesetof_unify_expand(asent, UNPROVIDED);
    }

    /**
     * CollectionSubsetFn has a special cost method for CollectionSubsetFn TheSetOf,
     * but it falls back on the more general cost method if this doesn't apply.
     * Basically it calls the cost method for elementOf TheSetOf with an additional
     * #$isa literal to represent the constraint imposed by the arg1 of CollectionSubsetFn.
     */
    @LispMethod(comment = "CollectionSubsetFn has a special cost method for CollectionSubsetFn TheSetOf,\r\nbut it falls back on the more general cost method if this doesn\'t apply.\r\nBasically it calls the cost method for elementOf TheSetOf with an additional\r\n#$isa literal to represent the constraint imposed by the arg1 of CollectionSubsetFn.\nCollectionSubsetFn has a special cost method for CollectionSubsetFn TheSetOf,\nbut it falls back on the more general cost method if this doesn\'t apply.\nBasically it calls the cost method for elementOf TheSetOf with an additional\n#$isa literal to represent the constraint imposed by the arg1 of CollectionSubsetFn.")
    public static final SubLObject removal_collection_subset_fn_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subcol_nat = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject collectionsubsetfn = unmake_binary_formula(subcol_nat);
                    SubLObject col = thread.secondMultipleValue();
                    SubLObject thesetof_nat = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != el_formula_with_operator_p(thesetof_nat, $$TheSetOf)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject thesetof = unmake_binary_formula(thesetof_nat);
                            SubLObject var = thread.secondMultipleValue();
                            SubLObject explicit_such_that = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject additional_isa_literal = list($$isa, var, col);
                                SubLObject such_that = simplifier.conjoin(list(additional_isa_literal, explicit_such_that), T);
                                SubLObject smart_cost = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_elementof_thesetof_unify_cost_smart(var, such_that);
                                if (NIL != smart_cost) {
                                    return smart_cost;
                                }
                            }
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_subcollection_cost(asent, UNPROVIDED);
        }
    }

    /**
     * CollectionSubsetFn has a special cost method for CollectionSubsetFn TheSetOf,
     * but it falls back on the more general cost method if this doesn't apply.
     * Basically it calls the cost method for elementOf TheSetOf with an additional
     * #$isa literal to represent the constraint imposed by the arg1 of CollectionSubsetFn.
     */
    @LispMethod(comment = "CollectionSubsetFn has a special cost method for CollectionSubsetFn TheSetOf,\r\nbut it falls back on the more general cost method if this doesn\'t apply.\r\nBasically it calls the cost method for elementOf TheSetOf with an additional\r\n#$isa literal to represent the constraint imposed by the arg1 of CollectionSubsetFn.\nCollectionSubsetFn has a special cost method for CollectionSubsetFn TheSetOf,\nbut it falls back on the more general cost method if this doesn\'t apply.\nBasically it calls the cost method for elementOf TheSetOf with an additional\n#$isa literal to represent the constraint imposed by the arg1 of CollectionSubsetFn.")
    public static SubLObject removal_collection_subset_fn_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subcol_nat = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject collectionsubsetfn = unmake_binary_formula(subcol_nat);
        final SubLObject col = thread.secondMultipleValue();
        final SubLObject thesetof_nat = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != el_formula_with_operator_p(thesetof_nat, $$TheSetOf)) {
            thread.resetMultipleValues();
            final SubLObject thesetof = unmake_binary_formula(thesetof_nat);
            final SubLObject var = thread.secondMultipleValue();
            final SubLObject explicit_such_that = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject additional_isa_literal = list($$isa, var, col);
            final SubLObject such_that = simplifier.conjoin(list(additional_isa_literal, explicit_such_that), T);
            final SubLObject smart_cost = removal_elementof_thesetof_unify_cost_smart(var, such_that);
            if (NIL != smart_cost) {
                return smart_cost;
            }
        }
        return removal_isa_subcollection_cost(asent, UNPROVIDED);
    }

    public static final SubLObject removal_isa_subcollection_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject subcol_nat = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject col = cycl_utilities.nat_arg1(subcol_nat, UNPROVIDED);
            return ceiling(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_all_instances_cost(col), TEN_INTEGER);
        }
    }

    public static SubLObject removal_isa_subcollection_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject subcol_nat = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject col = cycl_utilities.nat_arg1(subcol_nat, UNPROVIDED);
        return ceiling(inference_all_instances_cost(col), TEN_INTEGER);
    }

    public static final SubLObject removal_isa_subcollection_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_isa = unmake_binary_formula(asent);
                SubLObject arg1 = thread.secondMultipleValue();
                SubLObject subcol_nat = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject subcol_fn = cycl_utilities.nat_functor(subcol_nat);
                    SubLObject rule = kb_mapping_utilities.fpred_value(subcol_fn, $$subcollectionFunctionDefiningRule, ONE_INTEGER, TWO_INTEGER, $TRUE);
                    if (NIL != rule) {
                        {
                            SubLObject query = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_isa_subcollection_construct_query(rule, asent);
                            SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), ask_utilities.filter_query_properties_for_recursive_query(inference_utilities.current_query_properties()));
                            if (NIL != recursive_results) {
                                {
                                    SubLObject more_supports = list(rule);
                                    if (NIL != cyc_kernel.closed_query_success_token_p(recursive_results)) {
                                        {
                                            SubLObject hl_support = arguments.make_hl_support($QUERY, query, UNPROVIDED, UNPROVIDED);
                                            backward.removal_add_node(hl_support, NIL, more_supports);
                                        }
                                    } else {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL != second(recursive_results.first())) {
                                                Errors.error($str_alt101$Expected__s_to_have_only_one_free, rule);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = recursive_results;
                                            SubLObject v_bindings = NIL;
                                            for (v_bindings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_bindings = cdolist_list_var.first()) {
                                                {
                                                    SubLObject fully_bound_query = bindings.apply_bindings(v_bindings, query);
                                                    SubLObject hl_support = arguments.make_hl_support($QUERY, fully_bound_query, UNPROVIDED, UNPROVIDED);
                                                    SubLObject binding = v_bindings.first();
                                                    SubLObject ins = bindings.variable_binding_value(binding);
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_bindings_18 = unification_utilities.term_unify(ins, arg1, NIL, T);
                                                        SubLObject unify_justification = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != v_bindings_18) {
                                                            backward.removal_add_node(hl_support, v_bindings_18, append(more_supports, unify_justification));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_isa_subcollection_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_isa = unmake_binary_formula(asent);
        final SubLObject arg1 = thread.secondMultipleValue();
        final SubLObject subcol_nat = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject subcol_fn = cycl_utilities.nat_functor(subcol_nat);
        final SubLObject rule = kb_mapping_utilities.fpred_value(subcol_fn, $$subcollectionFunctionDefiningRule, ONE_INTEGER, TWO_INTEGER, $TRUE);
        if (NIL != rule) {
            final SubLObject query = removal_isa_subcollection_construct_query(rule, asent);
            final SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), ask_utilities.filter_query_properties_for_recursive_query(inference_utilities.current_query_properties()));
            if (NIL != recursive_results) {
                final SubLObject more_supports = list(rule);
                if (NIL != cyc_kernel.closed_query_success_token_p(recursive_results)) {
                    final SubLObject hl_support = arguments.make_hl_support($QUERY, query, UNPROVIDED, UNPROVIDED);
                    backward.removal_add_node(hl_support, NIL, more_supports);
                } else {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != second(recursive_results.first()))) {
                        Errors.error($str104$Expected__s_to_have_only_one_free, rule);
                    }
                    SubLObject cdolist_list_var = recursive_results;
                    SubLObject v_bindings = NIL;
                    v_bindings = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject fully_bound_query = bindings.apply_bindings(v_bindings, query);
                        final SubLObject hl_support2 = arguments.make_hl_support($QUERY, fully_bound_query, UNPROVIDED, UNPROVIDED);
                        final SubLObject binding = v_bindings.first();
                        final SubLObject ins = bindings.variable_binding_value(binding);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$19 = unification_utilities.term_unify(ins, arg1, NIL, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings_$19) {
                            backward.removal_add_node(hl_support2, v_bindings_$19, append(more_supports, unify_justification));
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_bindings = cdolist_list_var.first();
                    } 
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_isa_subcollection_construct_query_alt(SubLObject rule, SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnf = assertions_high.assertion_cnf(rule);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == singletonP(clauses.pos_lits(cnf))) {
                        Errors.error($str_alt102$Expected_exactly_one_poslit_in__S, rule);
                    }
                }
                {
                    SubLObject pos_lit = clauses.pos_lits(cnf).first();
                    SubLObject neg_lits = clauses.neg_lits(cnf);
                    SubLObject tou_lits = tou_lits(neg_lits);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == singletonP(tou_lits)) {
                            Errors.error($str_alt103$Expected_exactly_one___termOfUnit, rule);
                        }
                    }
                    {
                        SubLObject tou_lit = tou_lits.first();
                        SubLObject query_neg_lits = remove(tou_lit, neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject termofunit = unmake_binary_formula(tou_lit);
                            SubLObject var = thread.secondMultipleValue();
                            SubLObject unbound_subcol_naut = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject tou_binding = bindings.make_variable_binding(var, unbound_subcol_naut);
                                SubLObject tou_bindings = list(tou_binding);
                                SubLObject fixed_cnf = bindings.apply_bindings(tou_bindings, pos_lit);
                                thread.resetMultipleValues();
                                {
                                    SubLObject unify_bindings = unification.unify(asent, fixed_cnf, NIL, UNPROVIDED);
                                    SubLObject unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject query_lits = bindings.apply_bindings(unify_bindings, query_neg_lits);
                                        SubLObject query = simplifier.conjoin(query_lits, UNPROVIDED);
                                        return query;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject removal_isa_subcollection_construct_query(final SubLObject rule, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(clauses.pos_lits(cnf)))) {
            Errors.error($str105$Expected_exactly_one_poslit_in__S, rule);
        }
        final SubLObject pos_lit = clauses.pos_lits(cnf).first();
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        final SubLObject tou_lits = tou_lits(neg_lits);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(tou_lits))) {
            Errors.error($str106$Expected_exactly_one___termOfUnit, rule);
        }
        final SubLObject tou_lit = tou_lits.first();
        final SubLObject query_neg_lits = remove(tou_lit, neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject termofunit = unmake_binary_formula(tou_lit);
        final SubLObject var = thread.secondMultipleValue();
        final SubLObject unbound_subcol_naut = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject tou_binding = bindings.make_variable_binding(var, unbound_subcol_naut);
        final SubLObject tou_bindings = list(tou_binding);
        final SubLObject fixed_cnf = bindings.apply_bindings(tou_bindings, pos_lit);
        thread.resetMultipleValues();
        final SubLObject unify_bindings = unification.unify(asent, fixed_cnf, NIL, UNPROVIDED);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject query_lits = bindings.apply_bindings(unify_bindings, query_neg_lits);
        final SubLObject query = simplifier.conjoin(query_lits, UNPROVIDED);
        return query;
    }

    public static final SubLObject subcollection_functor_p_alt(SubLObject v_object) {
        return member_eqP(v_object, $subcollection_functors$.getGlobalValue());
    }

    public static SubLObject subcollection_functor_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $subcollection_functors$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_all_isa_of_type_completeness_alt(SubLObject asent_1, SubLObject mt_1, SubLObject asent_2, SubLObject mt_2) {
        {
            SubLObject result = NIL;
            SubLObject completeness_1 = inference_utilities.literal_removal_completeness(asent_1, $POS, mt_1);
            if ($COMPLETE == completeness_1) {
                result = $COMPLETE;
            } else {
                {
                    SubLObject completeness_2 = inference_utilities.literal_removal_completeness(asent_2, $POS, mt_2);
                    result = inference_datastructures_enumerated_types.max2_completeness(completeness_1, completeness_2);
                }
            }
            return result;
        }
    }

    public static SubLObject removal_all_isa_of_type_completeness(final SubLObject asent_1, final SubLObject mt_1, final SubLObject asent_2, final SubLObject mt_2) {
        SubLObject result = NIL;
        final SubLObject completeness_1 = inference_utilities.literal_removal_completeness(asent_1, $POS, mt_1);
        if ($COMPLETE == completeness_1) {
            result = $COMPLETE;
        } else {
            final SubLObject completeness_2 = inference_utilities.literal_removal_completeness(asent_2, $POS, mt_2);
            result = inference_datastructures_enumerated_types.max2_completeness(completeness_1, completeness_2);
        }
        return result;
    }

    public static final SubLObject removal_all_isa_of_type_applicability_alt(SubLObject contextualized_dnf_clause) {
        return removal_modules_genls.removal_sbhl_between_applicability(contextualized_dnf_clause, $$isa);
    }

    public static SubLObject removal_all_isa_of_type_applicability(final SubLObject contextualized_dnf_clause) {
        return removal_modules_genls.removal_sbhl_between_applicability(contextualized_dnf_clause, $$isa);
    }

    public static final SubLObject removal_all_isa_of_type_cost_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(contextualized_dnf_clause, BINARY_CLAUSE_P);
            {
                SubLObject ins = NIL;
                SubLObject type_col = NIL;
                SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
                SubLObject contextualized_asent = NIL;
                for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                    {
                        SubLObject datum = contextualized_asent;
                        SubLObject current = datum;
                        SubLObject mt = NIL;
                        SubLObject asent = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt141);
                        mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt141);
                        asent = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != variables.variable_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) {
                                ins = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                            } else {
                                type_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt141);
                        }
                    }
                }
                SubLTrampolineFile.checkType(ins, FORT_P);
                SubLTrampolineFile.checkType(type_col, FORT_P);
                {
                    SubLObject all_isa_cardinality = $average_all_isa_count$.getDynamicValue(thread);
                    SubLObject all_instances_cardinality = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_all_instances_cost(type_col);
                    SubLObject max_col_cardinality = min(all_isa_cardinality, all_instances_cardinality);
                    return integerDivide(max_col_cardinality, TWO_INTEGER);
                }
            }
        }
    }

    public static SubLObject removal_all_isa_of_type_cost(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clause_utilities.binary_clause_p(contextualized_dnf_clause) : "! clause_utilities.binary_clause_p(contextualized_dnf_clause) " + ("clause_utilities.binary_clause_p(contextualized_dnf_clause) " + "CommonSymbols.NIL != clause_utilities.binary_clause_p(contextualized_dnf_clause) ") + contextualized_dnf_clause;
        SubLObject ins = NIL;
        SubLObject type_col = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list143);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list143);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != variables.variable_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) {
                    ins = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                } else {
                    type_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list143);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        assert NIL != forts.fort_p(ins) : "! forts.fort_p(ins) " + ("forts.fort_p(ins) " + "CommonSymbols.NIL != forts.fort_p(ins) ") + ins;
        assert NIL != forts.fort_p(type_col) : "! forts.fort_p(type_col) " + ("forts.fort_p(type_col) " + "CommonSymbols.NIL != forts.fort_p(type_col) ") + type_col;
        final SubLObject all_isa_cardinality = $average_all_isa_count$.getDynamicValue(thread);
        final SubLObject all_instances_cardinality = inference_all_instances_cost(type_col);
        final SubLObject max_col_cardinality = min(all_isa_cardinality, all_instances_cardinality);
        return integerDivide(max_col_cardinality, TWO_INTEGER);
    }

    public static final SubLObject removal_all_isa_of_type_expand_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = clauses.pos_lits(contextualized_dnf_clause);
                SubLObject current = datum;
                SubLObject contextualized_asent0 = NIL;
                SubLObject contextualized_asent1 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt143);
                contextualized_asent0 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt143);
                contextualized_asent1 = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject datum_19 = contextualized_asent0;
                        SubLObject current_20 = datum_19;
                        SubLObject mt0 = NIL;
                        SubLObject asent0 = NIL;
                        destructuring_bind_must_consp(current_20, datum_19, $list_alt144);
                        mt0 = current_20.first();
                        current_20 = current_20.rest();
                        destructuring_bind_must_consp(current_20, datum_19, $list_alt144);
                        asent0 = current_20.first();
                        current_20 = current_20.rest();
                        if (NIL == current_20) {
                            {
                                SubLObject datum_21 = contextualized_asent1;
                                SubLObject current_22 = datum_21;
                                SubLObject mt1 = NIL;
                                SubLObject asent1 = NIL;
                                destructuring_bind_must_consp(current_22, datum_21, $list_alt145);
                                mt1 = current_22.first();
                                current_22 = current_22.rest();
                                destructuring_bind_must_consp(current_22, datum_21, $list_alt145);
                                asent1 = current_22.first();
                                current_22 = current_22.rest();
                                if (NIL == current_22) {
                                    if (mt0.equal(mt1)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject ins_asent = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_all_isa_of_type_categorize_asents(asent0, asent1);
                                            SubLObject type_col_asent = thread.secondMultipleValue();
                                            SubLObject ins_firstP = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject ins = cycl_utilities.atomic_sentence_arg1(ins_asent, UNPROVIDED);
                                                SubLObject variable = cycl_utilities.atomic_sentence_arg2(ins_asent, UNPROVIDED);
                                                SubLObject type_col = cycl_utilities.atomic_sentence_arg2(type_col_asent, UNPROVIDED);
                                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_all_isas_of_type(ins, type_col, mt0);
                                                SubLObject col = NIL;
                                                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_bindings = unification_utilities.term_unify(variable, col, UNPROVIDED, UNPROVIDED);
                                                        SubLObject unify_justification = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != v_bindings) {
                                                            {
                                                                SubLObject ins_support_formula = make_binary_formula($$isa, ins, col);
                                                                SubLObject type_col_support_formula = make_binary_formula($$isa, col, type_col);
                                                                SubLObject ins_support = arguments.make_hl_support($ISA, ins_support_formula, mt0, UNPROVIDED);
                                                                SubLObject type_col_support = arguments.make_hl_support($ISA, type_col_support_formula, mt0, UNPROVIDED);
                                                                SubLObject ins_supports = list(ins_support);
                                                                SubLObject type_col_supports = list(type_col_support);
                                                                SubLObject justifications = (NIL != ins_firstP) ? ((SubLObject) (list(ins_supports, type_col_supports))) : list(type_col_supports, ins_supports);
                                                                inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_21, $list_alt145);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_19, $list_alt144);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt143);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_all_isa_of_type_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent0 = NIL;
        SubLObject contextualized_asent2 = NIL;
        destructuring_bind_must_consp(current, datum, $list145);
        contextualized_asent0 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list145);
        contextualized_asent2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$21;
            final SubLObject datum_$20 = current_$21 = contextualized_asent0;
            SubLObject mt0 = NIL;
            SubLObject asent0 = NIL;
            destructuring_bind_must_consp(current_$21, datum_$20, $list146);
            mt0 = current_$21.first();
            current_$21 = current_$21.rest();
            destructuring_bind_must_consp(current_$21, datum_$20, $list146);
            asent0 = current_$21.first();
            current_$21 = current_$21.rest();
            if (NIL == current_$21) {
                SubLObject current_$22;
                final SubLObject datum_$21 = current_$22 = contextualized_asent2;
                SubLObject mt2 = NIL;
                SubLObject asent2 = NIL;
                destructuring_bind_must_consp(current_$22, datum_$21, $list147);
                mt2 = current_$22.first();
                current_$22 = current_$22.rest();
                destructuring_bind_must_consp(current_$22, datum_$21, $list147);
                asent2 = current_$22.first();
                current_$22 = current_$22.rest();
                if (NIL == current_$22) {
                    if (mt0.equal(mt2)) {
                        thread.resetMultipleValues();
                        final SubLObject ins_asent = removal_all_isa_of_type_categorize_asents(asent0, asent2);
                        final SubLObject type_col_asent = thread.secondMultipleValue();
                        final SubLObject ins_firstP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject ins = cycl_utilities.atomic_sentence_arg1(ins_asent, UNPROVIDED);
                        final SubLObject variable = cycl_utilities.atomic_sentence_arg2(ins_asent, UNPROVIDED);
                        final SubLObject type_col = cycl_utilities.atomic_sentence_arg2(type_col_asent, UNPROVIDED);
                        SubLObject cdolist_list_var = inference_all_isas_of_type(ins, type_col, mt0);
                        SubLObject col = NIL;
                        col = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject v_bindings = unification_utilities.term_unify(variable, col, UNPROVIDED, UNPROVIDED);
                            final SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                final SubLObject ins_support_formula = make_binary_formula($$isa, ins, col);
                                final SubLObject type_col_support_formula = make_binary_formula($$isa, col, type_col);
                                final SubLObject ins_support = arguments.make_hl_support($ISA, ins_support_formula, mt0, UNPROVIDED);
                                final SubLObject type_col_support = arguments.make_hl_support($ISA, type_col_support_formula, mt0, UNPROVIDED);
                                final SubLObject ins_supports = list(ins_support);
                                final SubLObject type_col_supports = list(type_col_support);
                                final SubLObject justifications = (NIL != ins_firstP) ? list(ins_supports, type_col_supports) : list(type_col_supports, ins_supports);
                                inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            col = cdolist_list_var.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum_$21, $list147);
                }
            } else {
                cdestructuring_bind_error(datum_$20, $list146);
            }
        } else {
            cdestructuring_bind_error(datum, $list145);
        }
        return NIL;
    }

    public static final SubLObject removal_all_isa_of_type_categorize_asents_alt(SubLObject asent0, SubLObject asent1) {
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent0, UNPROVIDED))) {
            return values(asent0, asent1, T);
        } else {
            return values(asent1, asent0, NIL);
        }
    }

    public static SubLObject removal_all_isa_of_type_categorize_asents(final SubLObject asent0, final SubLObject asent1) {
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent0, UNPROVIDED))) {
            return values(asent0, asent1, T);
        }
        return values(asent1, asent0, NIL);
    }

    public static final SubLObject all_quoted_instances_pos_preference_alt(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        {
            SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != fort_types_interface.collection_p(col)) {
                return preference_modules.completeness_to_preference_level(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_quoted_collection_iteration_completeness(col));
            } else {
                return $GROSSLY_DISPREFERRED;
            }
        }
    }

    public static SubLObject all_quoted_instances_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg_bindableP = list_utilities.member_eqP(var, bindable_vars);
        if (NIL != fort_types_interface.collection_p(col)) {
            final SubLObject completeness = inference_quoted_collection_iteration_completeness(col);
            SubLObject preference = preference_modules.completeness_to_preference_level(completeness);
            if (((NIL != arg_bindableP) && (NIL != preference_modules.preference_level_LE(preference, $DISPREFERRED))) && (NIL != kb_accessors.check_preferred_collectionP(col, UNPROVIDED))) {
                preference = $DISALLOWED;
            }
            return preference;
        }
        return $GROSSLY_DISPREFERRED;
    }

    public static final SubLObject removal_quoted_isa_collection_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $quoted_isa_fort_collection_cost$.getGlobalValue();
        } else {
            return $quoted_isa_non_fort_collection_cost$.getGlobalValue();
        }
    }

    public static SubLObject removal_quoted_isa_collection_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $quoted_isa_fort_collection_cost$.getGlobalValue();
        }
        return $quoted_isa_non_fort_collection_cost$.getGlobalValue();
    }

    public static final SubLObject removal_quoted_isa_collection_check_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_not_quoted_isa_collection_check_cost(asent);
    }

    public static SubLObject removal_quoted_isa_collection_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_quoted_isa_collection_check_cost(asent);
    }

    private static final SubLSymbol $ISA_X_Y_POS = makeKeyword("ISA-X-Y-POS");

    static private final SubLList $list_alt11 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    public static final SubLObject removal_quoted_isa_collection_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_quoted_isa_collection_check_expand(asent);
    }

    public static SubLObject removal_quoted_isa_collection_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_quoted_isa_collection_check_expand(asent);
    }

    public static final SubLObject removal_quoted_isa_collection_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_not_quoted_isa_collection_check_expand(asent);
    }

    public static SubLObject removal_quoted_isa_collection_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_not_quoted_isa_collection_check_expand(asent);
    }

    static private final SubLList $list_alt13 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("ALL-INSTANCES-POS-PREFERENCE"));

    public static final SubLObject removal_quoted_isa_collection_check_expand_alt(SubLObject asent) {
        {
            SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_quoted_isa_collection_check_expand(final SubLObject asent) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt17 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    public static final SubLObject removal_not_quoted_isa_collection_check_cost_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $negation_by_failure$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_quoted_isa_collection_check_pos_cost(asent, UNPROVIDED);
            }
            return $default_not_quoted_isa_collection_check_cost$.getDynamicValue(thread);
        }
    }

    public static SubLObject removal_not_quoted_isa_collection_check_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $negation_by_failure$.getDynamicValue(thread)) {
            return removal_quoted_isa_collection_check_pos_cost(asent, UNPROVIDED);
        }
        return $default_not_quoted_isa_collection_check_cost$.getDynamicValue(thread);
    }

    static private final SubLList $list_alt19 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    public static final SubLObject removal_not_quoted_isa_collection_check_expand_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject v_object = NIL;
                SubLObject collection = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt27);
                v_object = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt27);
                collection = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED))) {
                        backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } else {
                        if (NIL != isa.not_quoted_isa_by_sbhlP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                            backward.removal_add_node(arguments.make_hl_support($ISA, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt27);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_not_quoted_isa_collection_check_expand(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != isa.not_quoted_isa_by_sbhlP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                    backward.removal_add_node(arguments.make_hl_support($ISA, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }

        } else {
            cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$isa #$Dog #$Collection)\n(#$isa (#$JuvenileFn #$Dog) #$Collection)") });

    static private final SubLList $list_alt24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa #$Dog #$Predicate))") });

    public static final SubLObject removal_quoted_isa_defn_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $quoted_isa_fort_defn_cost$.getGlobalValue();
        } else {
            return $quoted_isa_non_fort_defn_cost$.getGlobalValue();
        }
    }

    public static SubLObject removal_quoted_isa_defn_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
            return $quoted_isa_fort_defn_cost$.getGlobalValue();
        }
        return $quoted_isa_non_fort_defn_cost$.getGlobalValue();
    }

    public static final SubLObject removal_quoted_isa_defn_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_quoted_isa_defn_pos_cost(asent, UNPROVIDED));
    }

    public static SubLObject removal_quoted_isa_defn_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_quoted_isa_defn_pos_cost(asent, UNPROVIDED));
    }

    static private final SubLList $list_alt27 = list(makeSymbol("OBJECT"), makeSymbol("COLLECTION"));

    static private final SubLList $list_alt30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), $FORT, makeKeyword("CLOSED-NAUT")), $COST, makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });

    public static final SubLObject removal_quoted_isa_defn_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_quoted_isa_defn_check_expand(asent);
    }

    public static SubLObject removal_quoted_isa_defn_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_quoted_isa_defn_check_expand(asent);
    }

    public static final SubLObject removal_quoted_isa_defn_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_quoted_isa_defn_reject_expand(asent);
    }

    public static SubLObject removal_quoted_isa_defn_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_quoted_isa_defn_reject_expand(asent);
    }

    /**
     * If there are no sufficient defns, this module does not apply.
     */
    @LispMethod(comment = "If there are no sufficient defns, this module does not apply.")
    public static final SubLObject removal_quoted_isa_defn_pos_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return at_defns.any_sufficient_quoted_defn_anywhereP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @LispMethod(comment = "If there are no sufficient defns, this module does not apply.")
    public static SubLObject removal_quoted_isa_defn_pos_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return at_defns.any_sufficient_quoted_defn_anywhereP(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    static private final SubLList $list_alt32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NOT"), $FORT), makeKeyword("CLOSED-NAUT")), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), $COST, makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("") });

    public static final SubLObject removal_quoted_isa_defn_check_expand_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject v_object = NIL;
                SubLObject collection = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt27);
                v_object = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt27);
                collection = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (!((NIL != forts.fort_p(v_object)) && (NIL != isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED)))) {
                        {
                            SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                            try {
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                if (NIL != at_defns.quiet_quoted_defns_admitP(collection, v_object, NIL)) {
                                    backward.removal_add_node(arguments.make_hl_support($DEFN, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt27);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_quoted_isa_defn_check_expand(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == forts.fort_p(v_object)) || (NIL == isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED))) {
                final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                try {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                    if (NIL != at_defns.quiet_quoted_defns_admitP(collection, v_object, NIL)) {
                        backward.removal_add_node(arguments.make_hl_support($DEFN, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    static private final SubLList $list_alt39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), $FORT), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ISA-DEFN-POS-REQUIRED"), $COST, makeSymbol("REMOVAL-ISA-DEFN-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-DEFN-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$isa 42 #$Integer)") });

    static private final SubLList $list_alt41 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ISA-DEFN-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-DEFN-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa 42 #$SubLString))") });

    public static final SubLObject removal_quoted_isa_defn_reject_expand_alt(SubLObject asent) {
        {
            SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != at_defns.quiet_quoted_defns_rejectP(collection, v_object, NIL)) {
                backward.removal_add_node(arguments.make_hl_support($DEFN, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_quoted_isa_defn_reject_expand(final SubLObject asent) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != at_defns.quiet_quoted_defns_rejectP(collection, v_object, NIL)) {
            backward.removal_add_node(arguments.make_hl_support($DEFN, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_nat_quoted_isa_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject collection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt27);
            collection = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                    backward.removal_add_node(arguments.make_hl_support($ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt27);
            }
        }
        return NIL;
    }

    public static SubLObject removal_nat_quoted_isa_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_object = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        collection = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != isa.quoted_isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list29);
        }
        return NIL;
    }

    static private final SubLList $list_alt44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$isa #$Dog ?COL)\n(#$isa (#$JuvenileFn #$Cougar) ?COL)") });

    static private final SubLList $list_alt50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ALL-INSTANCES-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-INSTANCES-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-INSTANCES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$isa ?DOG #$Dog)") });

    public static final SubLObject removal_all_quoted_isa_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_fort_all_quoted_isa_expand(asent);
    }

    public static SubLObject removal_all_quoted_isa_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_fort_all_quoted_isa_expand(asent);
    }

    public static final SubLObject removal_fort_all_quoted_isa_expand_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject collections = isa.all_quoted_isa(v_object, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = collections;
                SubLObject collection = NIL;
                for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject unified_arg2 = bindings.subst_bindings(v_bindings, arg2);
                                SubLObject formula = make_binary_formula(predicate, v_object, unified_arg2);
                                backward.removal_add_node(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_fort_all_quoted_isa_expand(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject collections = cdolist_list_var = isa.all_quoted_isa(v_object, UNPROVIDED, UNPROVIDED);
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject unified_arg2 = bindings.subst_bindings(v_bindings, arg2);
                final SubLObject formula = make_binary_formula(predicate, v_object, unified_arg2);
                backward.removal_add_node(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLList $list_alt52 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THESET"), makeSymbol("ELEMENTS")));

    static private final SubLList $list_alt56 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog (#$TheSet #$Dog #$Cat))") });

    public static final SubLObject removal_nat_all_quoted_isa_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.removal_all_quoted_isa_expand(asent, UNPROVIDED);
    }

    public static SubLObject removal_nat_all_quoted_isa_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_quoted_isa_expand(asent, UNPROVIDED);
    }

    public static final SubLObject removal_all_quoted_instances_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_all_quoted_instances_cost(collection);
        }
    }

    public static SubLObject removal_all_quoted_instances_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_all_quoted_instances_cost(collection);
    }

    public static final SubLObject removal_all_quoted_instances_completeness_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa.inference_quoted_collection_iteration_completeness(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_quoted_instances_completeness(final SubLObject asent) {
        return inference_quoted_collection_iteration_completeness(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    /**
     *
     *
     * @return completeness-p ; the inferential completness of iterating over all instances of COLLECTION.
     */
    @LispMethod(comment = "@return completeness-p ; the inferential completness of iterating over all instances of COLLECTION.")
    public static final SubLObject inference_quoted_collection_iteration_completeness_alt(SubLObject collection) {
        if (NIL == forts.fort_p(collection)) {
            return $GROSSLY_INCOMPLETE;
        } else {
            if (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(collection)) {
                return $GROSSLY_INCOMPLETE;
            } else {
                if (NIL != completely_enumerable_collectionP(collection, UNPROVIDED)) {
                    return $COMPLETE;
                } else {
                    return $GROSSLY_INCOMPLETE;
                }
            }
        }
    }

    /**
     *
     *
     * @return completeness-p ; the inferential completness of iterating over all instances of COLLECTION.
     */
    @LispMethod(comment = "@return completeness-p ; the inferential completness of iterating over all instances of COLLECTION.")
    public static SubLObject inference_quoted_collection_iteration_completeness(final SubLObject collection) {
        if (NIL == forts.fort_p(collection)) {
            return $GROSSLY_INCOMPLETE;
        }
        if (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(collection)) {
            return $GROSSLY_INCOMPLETE;
        }
        if (NIL != kb_accessors.completely_enumerable_collectionP(collection, UNPROVIDED)) {
            return $COMPLETE;
        }
        return $GROSSLY_INCOMPLETE;
    }

    static private final SubLList $list_alt58 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> (#$TheSet . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$Bird (#$TheSet #$Dog #$Cat)))") });

    public static final SubLObject removal_all_quoted_instances_iterator_alt(SubLObject collection) {
        return iteration.new_list_iterator(isa.all_quoted_instances(collection, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject removal_all_quoted_instances_iterator(final SubLObject collection) {
        return iteration.new_list_iterator(isa.all_quoted_instances(collection, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject inference_all_quoted_instances_cost_alt(SubLObject collection) {
        return max(cardinality_estimates.quoted_instance_iteration_cost(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$quotedIsa));
    }

    public static SubLObject inference_all_quoted_instances_cost(final SubLObject collection) {
        return max(cardinality_estimates.quoted_instance_iteration_cost(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$quotedIsa));
    }

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), $FORT, makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <fort>)\n where <fort> is a collection "), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog #$Collection)") });

    public static SubLObject declare_removal_modules_isa_file() {
        declareFunction("all_instances_pos_preference", "ALL-INSTANCES-POS-PREFERENCE", 3, 0, false);
        declareFunction("inference_all_isas_of_type", "INFERENCE-ALL-ISAS-OF-TYPE", 2, 1, false);
        declareFunction("removal_isa_collection_check_pos_cost", "REMOVAL-ISA-COLLECTION-CHECK-POS-COST", 1, 1, false);
        new removal_modules_isa.$removal_isa_collection_check_pos_cost$UnaryFunction();
        new removal_modules_isa.$removal_isa_collection_check_pos_cost$BinaryFunction();
        declareFunction("removal_isa_collection_check_neg_cost", "REMOVAL-ISA-COLLECTION-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_isa_collection_check_pos_expand", "REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_isa_collection_check_neg_expand", "REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_isa_collection_check_expand", "REMOVAL-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_not_isa_collection_check_cost", "REMOVAL-NOT-ISA-COLLECTION-CHECK-COST", 1, 0, false);
        declareFunction("removal_not_isa_collection_check_expand", "REMOVAL-NOT-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_isa_naut_collection_check_pos_cost", "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_isa_naut_collection_check_pos_expand", "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_isa_naut_collection_lookup_pos_cost", "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_isa_naut_collection_lookup_pos_expand", "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction("removal_isa_defn_pos_cost", "REMOVAL-ISA-DEFN-POS-COST", 1, 1, false);
        declareFunction("removal_isa_defn_neg_cost", "REMOVAL-ISA-DEFN-NEG-COST", 1, 1, false);
        declareFunction("removal_isa_defn_pos_expand", "REMOVAL-ISA-DEFN-POS-EXPAND", 1, 1, false);
        declareFunction("removal_isa_defn_neg_expand", "REMOVAL-ISA-DEFN-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_isa_defn_pos_required", "REMOVAL-ISA-DEFN-POS-REQUIRED", 1, 1, false);
        declareFunction("removal_isa_defn_check_expand", "REMOVAL-ISA-DEFN-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_isa_defn_reject_expand", "REMOVAL-ISA-DEFN-REJECT-EXPAND", 1, 0, false);
        declareFunction("removal_all_isa_expand", "REMOVAL-ALL-ISA-EXPAND", 1, 1, false);
        declareFunction("removal_all_instances_cost", "REMOVAL-ALL-INSTANCES-COST", 1, 1, false);
        new removal_modules_isa.$removal_all_instances_cost$UnaryFunction();
        new removal_modules_isa.$removal_all_instances_cost$BinaryFunction();
        declareFunction("removal_all_instances_completeness", "REMOVAL-ALL-INSTANCES-COMPLETENESS", 1, 0, false);
        new removal_modules_isa.$removal_all_instances_completeness$UnaryFunction();
        declareFunction("inference_collection_iteration_completeness", "INFERENCE-COLLECTION-ITERATION-COMPLETENESS", 1, 0, false);
        declareFunction("removal_all_instances_iterator", "REMOVAL-ALL-INSTANCES-ITERATOR", 1, 0, false);
        declareFunction("inference_all_instances_cost", "INFERENCE-ALL-INSTANCES-COST", 1, 0, false);
        declareFunction("removal_elementof_check_expand", "REMOVAL-ELEMENTOF-CHECK-EXPAND", 1, 1, false);
        new removal_modules_isa.$removal_elementof_check_expand$UnaryFunction();
        new removal_modules_isa.$removal_elementof_check_expand$BinaryFunction();
        declareFunction("removal_not_elementof_check_expand", "REMOVAL-NOT-ELEMENTOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_collection_check_expand", "REMOVAL-ELEMENTOF-COLLECTION-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_collection_defn_check_expand", "REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_set_check_iterator", "REMOVAL-ELEMENTOF-SET-CHECK-ITERATOR", 1, 0, false);
        declareFunction("removal_not_elementof_collection_check_cost", "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-COST", 1, 1, false);
        declareFunction("removal_not_elementof_collection_check_expand", "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_elementof_collection_defn_check_expand", "REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_elementof_set_check_cost", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COST", 1, 1, false);
        declareFunction("removal_not_elementof_set_check_completeness", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COMPLETENESS", 1, 0, false);
        declareFunction("removal_not_elementof_set_check_iterator", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-ITERATOR", 1, 0, false);
        declareFunction("removal_elementof_thesetof_check_expand", "REMOVAL-ELEMENTOF-THESETOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("inference_elementof_thesetof_check", "INFERENCE-ELEMENTOF-THESETOF-CHECK", 2, 1, false);
        declareFunction("removal_isa_thecollectionof_check_expand", "REMOVAL-ISA-THECOLLECTIONOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_elementof_thesetof_check_expand", "REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_isa_thecollectionof_check_expand", "REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_all_elementof_expand", "REMOVAL-ALL-ELEMENTOF-EXPAND", 1, 1, false);
        declareFunction("removal_nat_all_elementof_expand", "REMOVAL-NAT-ALL-ELEMENTOF-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_unify_cost", "REMOVAL-ELEMENTOF-UNIFY-COST", 1, 1, false);
        declareFunction("removal_elementof_unify_expand", "REMOVAL-ELEMENTOF-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_elementof_collection_unify_cost", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COST", 1, 1, false);
        declareFunction("removal_elementof_collection_unify_completeness", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COMPLETENESS", 1, 0, false);
        declareFunction("removal_elementof_collection_unify_iterator", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-ITERATOR", 1, 0, false);
        declareFunction("removal_elementof_set_unify_cost", "REMOVAL-ELEMENTOF-SET-UNIFY-COST", 1, 1, false);
        declareFunction("removal_elementof_set_unify_iterator", "REMOVAL-ELEMENTOF-SET-UNIFY-ITERATOR", 1, 0, false);
        declareFunction("removal_elementof_thesetof_unify_cost", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST", 1, 1, false);
        declareFunction("removal_elementof_thesetof_unify_cost_smart", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST-SMART", 2, 0, false);
        declareFunction("removal_elementof_thesetof_unify_expand", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_isa_thecollectionof_unify_cost", "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-COST", 1, 1, false);
        declareFunction("removal_isa_thecollectionof_unify_expand", "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_collection_subset_fn_cost", "REMOVAL-COLLECTION-SUBSET-FN-COST", 1, 1, false);
        declareFunction("removal_isa_subcollection_cost", "REMOVAL-ISA-SUBCOLLECTION-COST", 1, 1, false);
        declareFunction("removal_isa_subcollection_unify_expand", "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_isa_subcollection_construct_query", "REMOVAL-ISA-SUBCOLLECTION-CONSTRUCT-QUERY", 2, 0, false);
        declareFunction("subcollection_functor_p", "SUBCOLLECTION-FUNCTOR-P", 1, 0, false);
        declareFunction("removal_all_isa_of_type_completeness", "REMOVAL-ALL-ISA-OF-TYPE-COMPLETENESS", 4, 0, false);
        declareFunction("removal_all_isa_of_type_applicability", "REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY", 1, 0, false);
        new removal_modules_isa.$removal_all_isa_of_type_applicability$UnaryFunction();
        declareFunction("removal_all_isa_of_type_cost", "REMOVAL-ALL-ISA-OF-TYPE-COST", 1, 0, false);
        declareFunction("removal_all_isa_of_type_expand", "REMOVAL-ALL-ISA-OF-TYPE-EXPAND", 1, 0, false);
        declareFunction("removal_all_isa_of_type_categorize_asents", "REMOVAL-ALL-ISA-OF-TYPE-CATEGORIZE-ASENTS", 2, 0, false);
        declareFunction("all_quoted_instances_pos_preference", "ALL-QUOTED-INSTANCES-POS-PREFERENCE", 3, 0, false);
        declareFunction("removal_quoted_isa_collection_check_pos_cost", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST", 1, 1, false);
        new removal_modules_isa.$removal_quoted_isa_collection_check_pos_cost$UnaryFunction();
        new removal_modules_isa.$removal_quoted_isa_collection_check_pos_cost$BinaryFunction();
        declareFunction("removal_quoted_isa_collection_check_neg_cost", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_quoted_isa_collection_check_pos_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND", 1, 1, false);
        new removal_modules_isa.$removal_quoted_isa_collection_check_pos_expand$UnaryFunction();
        new removal_modules_isa.$removal_quoted_isa_collection_check_pos_expand$BinaryFunction();
        declareFunction("removal_quoted_isa_collection_check_neg_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_quoted_isa_collection_check_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_not_quoted_isa_collection_check_cost", "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK-COST", 1, 0, false);
        declareFunction("removal_not_quoted_isa_collection_check_expand", "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_quoted_isa_defn_pos_cost", "REMOVAL-QUOTED-ISA-DEFN-POS-COST", 1, 1, false);
        declareFunction("removal_quoted_isa_defn_neg_cost", "REMOVAL-QUOTED-ISA-DEFN-NEG-COST", 1, 1, false);
        declareFunction("removal_quoted_isa_defn_pos_expand", "REMOVAL-QUOTED-ISA-DEFN-POS-EXPAND", 1, 1, false);
        declareFunction("removal_quoted_isa_defn_neg_expand", "REMOVAL-QUOTED-ISA-DEFN-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_quoted_isa_defn_pos_required", "REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED", 1, 1, false);
        new removal_modules_isa.$removal_quoted_isa_defn_pos_required$UnaryFunction();
        new removal_modules_isa.$removal_quoted_isa_defn_pos_required$BinaryFunction();
        declareFunction("removal_quoted_isa_defn_check_expand", "REMOVAL-QUOTED-ISA-DEFN-CHECK-EXPAND", 1, 0, false);
        declareFunction("removal_quoted_isa_defn_reject_expand", "REMOVAL-QUOTED-ISA-DEFN-REJECT-EXPAND", 1, 0, false);
        declareFunction("removal_nat_quoted_isa_expand", "REMOVAL-NAT-QUOTED-ISA-EXPAND", 1, 1, false);
        declareFunction("removal_all_quoted_isa_expand", "REMOVAL-ALL-QUOTED-ISA-EXPAND", 1, 1, false);
        declareFunction("removal_fort_all_quoted_isa_expand", "REMOVAL-FORT-ALL-QUOTED-ISA-EXPAND", 1, 0, false);
        declareFunction("removal_nat_all_quoted_isa_expand", "REMOVAL-NAT-ALL-QUOTED-ISA-EXPAND", 1, 1, false);
        declareFunction("removal_all_quoted_instances_cost", "REMOVAL-ALL-QUOTED-INSTANCES-COST", 1, 1, false);
        declareFunction("removal_all_quoted_instances_completeness", "REMOVAL-ALL-QUOTED-INSTANCES-COMPLETENESS", 1, 0, false);
        declareFunction("inference_quoted_collection_iteration_completeness", "INFERENCE-QUOTED-COLLECTION-ITERATION-COMPLETENESS", 1, 0, false);
        declareFunction("removal_all_quoted_instances_iterator", "REMOVAL-ALL-QUOTED-INSTANCES-ITERATOR", 1, 0, false);
        declareFunction("inference_all_quoted_instances_cost", "INFERENCE-ALL-QUOTED-INSTANCES-COST", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf 42 #$Integer))\nvia passing a #$defnIff or a #$defnSufficient") });

    static private final SubLList $list_alt64 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), list($TEST, makeSymbol("COLLECTION-P"))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETE-PATTERN"), list($TEST, makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ELEMENTOF-SET-CHECK-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is fort set but not a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$GrayColor #$BlackAndWhiteColorScheme) \nvia the KB assertion (#$elementOf #$GrayColor #$BlackAndWhiteColorScheme)") });

    static private final SubLList $list_alt66 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), $FORT, makeKeyword("COLLECTION-FORT")), $COST, makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fort> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$Dog #$Predicate))") });

    static private final SubLList $list_alt68 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf 42 #$SubLString))\nvia failing a #$defnIff or a #$defnNecessary") });

    static private final SubLList $list_alt70 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), list($TEST, makeSymbol("COLLECTION-P"))))), $COST, makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere <fort> is a set but not a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))\nvia the KB assertion\n (#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))") });

    static private final SubLList $list_alt73 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$France \n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });

    static private final SubLList $list_alt75 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-ALL-INSTANCES")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$isa #$France \n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });

    static private final SubLList $list_alt78 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$bordersOn ?COUNTRY #$Germany))))") });

    static private final SubLList $list_alt80 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$politiesBorderEachOther ?COUNTRY #$Germany))))") });

    static private final SubLList $list_alt82 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), $FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ELEMENTOF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog ?WHAT)") });

    static private final SubLList $list_alt84 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-ELEMENTOF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf (<fully-bound> . <fully-bound>) <not fully-bound>)\nvia #$resultIsa and #$resultIsaArg"), makeKeyword("EXAMPLE"), makeString("(#$elementOf (#$JuvenileFn #$Cougar) ?WHAT)") });

    public static final SubLObject init_removal_modules_isa_file_alt() {
        deflexical("*ISA-FORT-COLLECTION-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        deflexical("*ISA-NON-FORT-COLLECTION-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defparameter("*DEFAULT-NOT-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
        deflexical("*ISA-FORT-DEFN-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*ISA-NON-FORT-DEFN-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        defparameter("*ALL-INSTANCES-LAZY-ITERATION-THRESHOLD*", $int$2300);
        deflexical("*SUBCOLLECTION-FUNCTORS*", $list_alt104);
        deflexical("*QUOTED-ISA-FORT-COLLECTION-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        deflexical("*QUOTED-ISA-NON-FORT-COLLECTION-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defparameter("*DEFAULT-NOT-QUOTED-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
        deflexical("*QUOTED-ISA-FORT-DEFN-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*QUOTED-ISA-NON-FORT-DEFN-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        return NIL;
    }

    public static SubLObject init_removal_modules_isa_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*ISA-FORT-COLLECTION-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
            deflexical("*ISA-NON-FORT-COLLECTION-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defparameter("*DEFAULT-NOT-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
            deflexical("*ISA-FORT-DEFN-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            deflexical("*ISA-NON-FORT-DEFN-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
            defparameter("*ALL-INSTANCES-LAZY-ITERATION-THRESHOLD*", $int$2300);
            deflexical("*SUBCOLLECTION-FUNCTORS*", $list107);
            deflexical("*QUOTED-ISA-FORT-COLLECTION-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
            deflexical("*QUOTED-ISA-NON-FORT-COLLECTION-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            defparameter("*DEFAULT-NOT-QUOTED-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
            deflexical("*QUOTED-ISA-FORT-DEFN-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            deflexical("*QUOTED-ISA-NON-FORT-DEFN-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SUBCOLLECTION-FUNCTORS*", $list_alt104);
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_isa_file_Previous() {
        deflexical("*ISA-FORT-COLLECTION-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        deflexical("*ISA-NON-FORT-COLLECTION-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defparameter("*DEFAULT-NOT-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
        deflexical("*ISA-FORT-DEFN-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*ISA-NON-FORT-DEFN-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        defparameter("*ALL-INSTANCES-LAZY-ITERATION-THRESHOLD*", $int$2300);
        deflexical("*SUBCOLLECTION-FUNCTORS*", $list107);
        deflexical("*QUOTED-ISA-FORT-COLLECTION-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        deflexical("*QUOTED-ISA-NON-FORT-COLLECTION-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defparameter("*DEFAULT-NOT-QUOTED-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
        deflexical("*QUOTED-ISA-FORT-DEFN-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*QUOTED-ISA-NON-FORT-DEFN-COST*", subtract($cheap_hl_module_check_cost$.getGlobalValue(), $float$0_1));
        return NIL;
    }

    static private final SubLList $list_alt85 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list_alt86 = cons(makeSymbol("THESET"), makeSymbol("ELEMENTS"));

    static private final SubLList $list_alt88 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("NOT-FULLY-BOUND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ELEMENTOF-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT (#$TheSet #$Dog #$Cat))") });

    public static final SubLObject setup_removal_modules_isa_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$isa);
        inference_modules.inference_removal_module_use_meta_removal($$isa, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$isa, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_COMPLETELY_DECIDABLE_NEG);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_ABDUCTION_POS_CHECK);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_ABDUCTION_POS_UNIFY);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_ALL_EXISTS_CHECK);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_ALL_EXISTS_UNIFY);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_EXISTS_ALL_CHECK);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
        preference_modules.inference_preference_module($ISA_X_Y_POS, $list_alt11);
        preference_modules.inference_preference_module($ALL_INSTANCES_POS, $list_alt13);
        preference_modules.inference_preference_module($ALL_ISA_POS, $list_alt17);
        preference_modules.inference_preference_module($ALL_ELEMENTOF_POS, $list_alt19);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_POS, $list_alt22);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_NEG, $list_alt24);
        inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS, $list_alt30);
        inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS, $list_alt32);
        inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_POS, $list_alt39);
        inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_NEG, $list_alt41);
        inference_modules.inference_removal_module($REMOVAL_ALL_ISA, $list_alt44);
        note_funcall_helper_function(REMOVAL_ALL_ISA_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_ALL_INSTANCES, $list_alt50);
        inference_modules.register_solely_specific_removal_module_predicate($$elementOf);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_CHECK, $list_alt56);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_CHECK, $list_alt58);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_CHECK, $list_alt60);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK, $list_alt62);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_CHECK, $list_alt64);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK, $list_alt66);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK, $list_alt68);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_SET_CHECK, $list_alt70);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_CHECK, $list_alt73);
        inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_CHECK, $list_alt75);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK, $list_alt78);
        inference_modules.inference_removal_module($REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK, $list_alt80);
        inference_modules.inference_removal_module($REMOVAL_ALL_ELEMENTOF, $list_alt82);
        inference_modules.inference_removal_module($REMOVAL_NAT_ALL_ELEMENTOF, $list_alt84);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_UNIFY, $list_alt88);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_UNIFY, $list_alt90);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_UNIFY, $list_alt92);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_UNIFY, $list_alt96);
        inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_UNIFY, $list_alt98);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY, $list_alt106);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK, $list_alt108);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY, $list_alt110);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK, $list_alt112);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY, $list_alt114);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK, $list_alt116);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY, $list_alt118);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK, $list_alt120);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY, $list_alt122);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK, $list_alt124);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY, $list_alt126);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK, $list_alt128);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY, $list_alt130);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK, $list_alt132);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY, $list_alt134);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK, $list_alt136);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_ALL_ISA_OF_TYPE, $list_alt138);
        inference_modules.register_solely_specific_removal_module_predicate($$quotedIsa);
        inference_modules.inference_removal_module_use_meta_removal($$quotedIsa, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$quotedIsa, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_use_generic($$quotedIsa, $REMOVAL_COMPLETELY_DECIDABLE_NEG);
        preference_modules.inference_preference_module($QUOTED_ISA_X_Y_POS, $list_alt148);
        preference_modules.inference_preference_module($ALL_QUOTED_INSTANCES_POS, $list_alt150);
        preference_modules.inference_preference_module($ALL_QUOTED_ISA_POS, $list_alt152);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS, $list_alt154);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG, $list_alt156);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_DEFN_POS, $list_alt158);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_DEFN_NEG, $list_alt160);
        inference_modules.inference_removal_module($REMOVAL_NAT_QUOTED_ISA, $list_alt162);
        inference_modules.inference_removal_module($REMOVAL_ALL_QUOTED_ISA, $list_alt164);
        inference_modules.inference_removal_module($REMOVAL_NAT_ALL_QUOTED_ISA, $list_alt166);
        inference_modules.inference_removal_module($REMOVAL_ALL_QUOTED_INSTANCES, $list_alt168);
        return NIL;
    }

    public static SubLObject setup_removal_modules_isa_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$isa);
            inference_modules.inference_removal_module_use_meta_removal($$isa, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
            inference_modules.inference_removal_module_use_meta_removal($$isa, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
            inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_COMPLETELY_DECIDABLE_NEG);
            inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_ABDUCTION_POS_CHECK);
            inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_ABDUCTION_POS_UNIFY);
            inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_ALL_EXISTS_CHECK);
            inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_ALL_EXISTS_UNIFY);
            inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_EXISTS_ALL_CHECK);
            inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$isa);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$isa);
            preference_modules.inference_preference_module($ALL_INSTANCES_POS, $list13);
            preference_modules.inference_preference_module($ALL_ISA_POS, $list19);
            preference_modules.inference_preference_module($ALL_ELEMENTOF_POS, $list21);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_POS, $list24);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_NEG, $list26);
            inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS, $list32);
            inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS, $list34);
            inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_POS, $list41);
            inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_NEG, $list43);
            inference_modules.inference_removal_module($REMOVAL_ALL_ISA, $list46);
            note_funcall_helper_function(REMOVAL_ALL_ISA_EXPAND);
            inference_modules.inference_removal_module($REMOVAL_ALL_INSTANCES, $list53);
            inference_modules.register_solely_specific_removal_module_predicate($$elementOf);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$elementOf);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$elementOf);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_CHECK, $list59);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_CHECK, $list61);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_CHECK, $list63);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK, $list65);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_CHECK, $list67);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK, $list69);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK, $list71);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_SET_CHECK, $list73);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_CHECK, $list76);
            inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_CHECK, $list78);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK, $list81);
            inference_modules.inference_removal_module($REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK, $list83);
            inference_modules.inference_removal_module($REMOVAL_ALL_ELEMENTOF, $list85);
            inference_modules.inference_removal_module($REMOVAL_NAT_ALL_ELEMENTOF, $list87);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_UNIFY, $list91);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_UNIFY, $list93);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_UNIFY, $list95);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_UNIFY, $list99);
            inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_UNIFY, $list101);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY, $list109);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK, $list111);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY, $list113);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK, $list115);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY, $list117);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK, $list119);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY, $list121);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK, $list123);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY, $list125);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK, $list127);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY, $list129);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK, $list131);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY, $list133);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK, $list135);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY, $list137);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK, $list139);
            inference_modules.inference_conjunctive_removal_module($REMOVAL_ALL_ISA_OF_TYPE, $list141);
            inference_modules.register_solely_specific_removal_module_predicate($$quotedIsa);
            inference_modules.inference_removal_module_use_meta_removal($$quotedIsa, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
            inference_modules.inference_removal_module_use_meta_removal($$quotedIsa, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
            inference_modules.inference_removal_module_use_generic($$quotedIsa, $REMOVAL_COMPLETELY_DECIDABLE_NEG);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$quotedIsa);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$quotedIsa);
            preference_modules.inference_preference_module($ALL_QUOTED_INSTANCES_POS, $list150);
            preference_modules.inference_preference_module($ALL_QUOTED_ISA_POS, $list152);
            inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS, $list154);
            inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG, $list156);
            inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_DEFN_POS, $list158);
            inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_DEFN_NEG, $list160);
            inference_modules.inference_removal_module($REMOVAL_NAT_QUOTED_ISA, $list162);
            inference_modules.inference_removal_module($REMOVAL_ALL_QUOTED_ISA, $list164);
            inference_modules.inference_removal_module($REMOVAL_NAT_ALL_QUOTED_ISA, $list166);
            inference_modules.inference_removal_module($REMOVAL_ALL_QUOTED_INSTANCES, $list168);
        }
        if (SubLFiles.USE_V2) {
            preference_modules.inference_preference_module($ISA_X_Y_POS, $list_alt11);
            preference_modules.inference_preference_module($ALL_ISA_POS, $list_alt17);
            preference_modules.inference_preference_module($ALL_ELEMENTOF_POS, $list_alt19);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_POS, $list_alt22);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_NEG, $list_alt24);
            inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS, $list_alt30);
            inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS, $list_alt32);
            inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_POS, $list_alt39);
            inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_NEG, $list_alt41);
            inference_modules.inference_removal_module($REMOVAL_ALL_ISA, $list_alt44);
            inference_modules.inference_removal_module($REMOVAL_ALL_INSTANCES, $list_alt50);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_CHECK, $list_alt56);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_CHECK, $list_alt58);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_CHECK, $list_alt60);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK, $list_alt62);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_CHECK, $list_alt64);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK, $list_alt66);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK, $list_alt68);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_SET_CHECK, $list_alt70);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_CHECK, $list_alt73);
            inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_CHECK, $list_alt75);
            inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK, $list_alt78);
            inference_modules.inference_removal_module($REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK, $list_alt80);
            inference_modules.inference_removal_module($REMOVAL_ALL_ELEMENTOF, $list_alt82);
            inference_modules.inference_removal_module($REMOVAL_NAT_ALL_ELEMENTOF, $list_alt84);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_UNIFY, $list_alt88);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_UNIFY, $list_alt90);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_UNIFY, $list_alt92);
            inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_UNIFY, $list_alt96);
            inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_UNIFY, $list_alt98);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY, $list_alt106);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK, $list_alt108);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY, $list_alt110);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK, $list_alt112);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY, $list_alt114);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK, $list_alt116);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY, $list_alt118);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK, $list_alt120);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY, $list_alt122);
            inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK, $list_alt124);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY, $list_alt126);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK, $list_alt128);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY, $list_alt130);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK, $list_alt132);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY, $list_alt134);
            inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK, $list_alt136);
            inference_modules.inference_conjunctive_removal_module($REMOVAL_ALL_ISA_OF_TYPE, $list_alt138);
            preference_modules.inference_preference_module($QUOTED_ISA_X_Y_POS, $list_alt148);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_isa_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$isa);
        inference_modules.inference_removal_module_use_meta_removal($$isa, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$isa, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_COMPLETELY_DECIDABLE_NEG);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_ABDUCTION_POS_CHECK);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_ABDUCTION_POS_UNIFY);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_ALL_EXISTS_CHECK);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_ALL_EXISTS_UNIFY);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_RELATION_EXISTS_ALL_CHECK);
        inference_modules.inference_removal_module_use_generic($$isa, $REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$isa);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$isa);
        preference_modules.inference_preference_module($ALL_INSTANCES_POS, $list13);
        preference_modules.inference_preference_module($ALL_ISA_POS, $list19);
        preference_modules.inference_preference_module($ALL_ELEMENTOF_POS, $list21);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_POS, $list24);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_CHECK_NEG, $list26);
        inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS, $list32);
        inference_modules.inference_removal_module($REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS, $list34);
        inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_POS, $list41);
        inference_modules.inference_removal_module($REMOVAL_ISA_DEFN_NEG, $list43);
        inference_modules.inference_removal_module($REMOVAL_ALL_ISA, $list46);
        note_funcall_helper_function(REMOVAL_ALL_ISA_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_ALL_INSTANCES, $list53);
        inference_modules.register_solely_specific_removal_module_predicate($$elementOf);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$elementOf);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$elementOf);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_CHECK, $list59);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_CHECK, $list61);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_CHECK, $list63);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK, $list65);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_CHECK, $list67);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK, $list69);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK, $list71);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_SET_CHECK, $list73);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_CHECK, $list76);
        inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_CHECK, $list78);
        inference_modules.inference_removal_module($REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK, $list81);
        inference_modules.inference_removal_module($REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK, $list83);
        inference_modules.inference_removal_module($REMOVAL_ALL_ELEMENTOF, $list85);
        inference_modules.inference_removal_module($REMOVAL_NAT_ALL_ELEMENTOF, $list87);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_UNIFY, $list91);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_COLLECTION_UNIFY, $list93);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_SET_UNIFY, $list95);
        inference_modules.inference_removal_module($REMOVAL_ELEMENTOF_THESETOF_UNIFY, $list99);
        inference_modules.inference_removal_module($REMOVAL_ISA_THECOLLECTIONOF_UNIFY, $list101);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY, $list109);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK, $list111);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY, $list113);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK, $list115);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY, $list117);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK, $list119);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY, $list121);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK, $list123);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY, $list125);
        inference_modules.inference_removal_module($REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK, $list127);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY, $list129);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK, $list131);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY, $list133);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK, $list135);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY, $list137);
        inference_modules.inference_removal_module($REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK, $list139);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_ALL_ISA_OF_TYPE, $list141);
        inference_modules.register_solely_specific_removal_module_predicate($$quotedIsa);
        inference_modules.inference_removal_module_use_meta_removal($$quotedIsa, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$quotedIsa, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_use_generic($$quotedIsa, $REMOVAL_COMPLETELY_DECIDABLE_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$quotedIsa);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$quotedIsa);
        preference_modules.inference_preference_module($ALL_QUOTED_INSTANCES_POS, $list150);
        preference_modules.inference_preference_module($ALL_QUOTED_ISA_POS, $list152);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS, $list154);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG, $list156);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_DEFN_POS, $list158);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_ISA_DEFN_NEG, $list160);
        inference_modules.inference_removal_module($REMOVAL_NAT_QUOTED_ISA, $list162);
        inference_modules.inference_removal_module($REMOVAL_ALL_QUOTED_ISA, $list164);
        inference_modules.inference_removal_module($REMOVAL_NAT_ALL_QUOTED_ISA, $list166);
        inference_modules.inference_removal_module($REMOVAL_ALL_QUOTED_INSTANCES, $list168);
        return NIL;
    }

    static private final SubLList $list_alt90 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), $COST, makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("elementOf"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?DOG #$Dog)") });

    static private final SubLList $list_alt92 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), list($TEST, makeSymbol("COLLECTION-P"))))), $COST, makeSymbol("REMOVAL-ELEMENTOF-SET-UNIFY-COST"), makeKeyword("COMPLETE-PATTERN"), list($TEST, makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ELEMENTOF-SET-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is not a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?ELEM #$BlackAndWhiteColorScheme)") });

    static private final SubLList $list_alt96 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("elementOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("elementOf"), makeKeyword("NOT-FULLY-BOUND"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT\n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))") });

    static private final SubLList $list_alt98 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-ALL-INSTANCES")), $COST, makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$isa ?WHAT\n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))") });

    static private final SubLString $str_alt101$Expected__s_to_have_only_one_free = makeString("Expected ~s to have only one free variable");

    static private final SubLString $str_alt102$Expected_exactly_one_poslit_in__S = makeString("Expected exactly one poslit in ~S");

    static private final SubLString $str_alt103$Expected_exactly_one___termOfUnit = makeString("Expected exactly one #$termOfUnit neglit in ~S");

    static private final SubLList $list_alt104 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), reader_make_constant_shell("SubcollectionOccursAtFn"), reader_make_constant_shell("CollectionSubsetFn"), reader_make_constant_shell("CollectionIntersection2Fn"), reader_make_constant_shell("CollectionDifferenceFn"));

    static private final SubLList $list_alt106 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_isa_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_isa_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_isa_file();
    }

    static private final SubLList $list_alt108 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))") });

    static {
    }

    public static final class $removal_isa_collection_check_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_isa_collection_check_pos_cost$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-ISA-COLLECTION-CHECK-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_isa_collection_check_pos_cost(arg1, removal_modules_isa.$removal_isa_collection_check_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    static private final SubLList $list_alt110 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });

    public static final class $removal_isa_collection_check_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_isa_collection_check_pos_cost$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-ISA-COLLECTION-CHECK-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_isa_collection_check_pos_cost(arg1, arg2);
        }
    }

    public static final class $removal_all_instances_cost$UnaryFunction extends UnaryFunction {
        public $removal_all_instances_cost$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-ALL-INSTANCES-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_all_instances_cost(arg1, removal_modules_isa.$removal_all_instances_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_all_instances_cost$BinaryFunction extends BinaryFunction {
        public $removal_all_instances_cost$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-ALL-INSTANCES-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_all_instances_cost(arg1, arg2);
        }
    }

    static private final SubLList $list_alt112 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))") });

    public static final class $removal_all_instances_completeness$UnaryFunction extends UnaryFunction {
        public $removal_all_instances_completeness$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-ALL-INSTANCES-COMPLETENESS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_all_instances_completeness(arg1);
        }
    }

    public static final class $removal_elementof_check_expand$UnaryFunction extends UnaryFunction {
        public $removal_elementof_check_expand$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-ELEMENTOF-CHECK-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_elementof_check_expand(arg1, removal_modules_isa.$removal_elementof_check_expand$UnaryFunction.UNPROVIDED);
        }
    }

    static private final SubLList $list_alt114 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });

    public static final class $removal_elementof_check_expand$BinaryFunction extends BinaryFunction {
        public $removal_elementof_check_expand$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-ELEMENTOF-CHECK-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_elementof_check_expand(arg1, arg2);
        }
    }

    public static final class $removal_all_isa_of_type_applicability$UnaryFunction extends UnaryFunction {
        public $removal_all_isa_of_type_applicability$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_all_isa_of_type_applicability(arg1);
        }
    }

    static private final SubLList $list_alt116 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))") });

    public static final class $removal_quoted_isa_collection_check_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_quoted_isa_collection_check_pos_cost$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_quoted_isa_collection_check_pos_cost(arg1, removal_modules_isa.$removal_quoted_isa_collection_check_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_quoted_isa_collection_check_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_quoted_isa_collection_check_pos_cost$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_quoted_isa_collection_check_pos_cost(arg1, arg2);
        }
    }

    static private final SubLList $list_alt118 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });

    public static final class $removal_quoted_isa_collection_check_pos_expand$UnaryFunction extends UnaryFunction {
        public $removal_quoted_isa_collection_check_pos_expand$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_quoted_isa_collection_check_pos_expand(arg1, removal_modules_isa.$removal_quoted_isa_collection_check_pos_expand$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_quoted_isa_collection_check_pos_expand$BinaryFunction extends BinaryFunction {
        public $removal_quoted_isa_collection_check_pos_expand$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_quoted_isa_collection_check_pos_expand(arg1, arg2);
        }
    }

    static private final SubLList $list_alt120 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))") });

    public static final class $removal_quoted_isa_defn_pos_required$UnaryFunction extends UnaryFunction {
        public $removal_quoted_isa_defn_pos_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_quoted_isa_defn_pos_required(arg1, removal_modules_isa.$removal_quoted_isa_defn_pos_required$UnaryFunction.UNPROVIDED);
        }
    }

    static private final SubLList $list_alt122 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOccursAtFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });

    public static final class $removal_quoted_isa_defn_pos_required$BinaryFunction extends BinaryFunction {
        public $removal_quoted_isa_defn_pos_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_quoted_isa_defn_pos_required(arg1, arg2);
        }
    }

    static private final SubLList $list_alt124 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("SubcollectionOccursAtFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))") });

    static private final SubLList $list_alt126 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-COLLECTION-SUBSET-FN-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });

    static private final SubLList $list_alt128 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionSubsetFn . <fully-bound>))") });

    static private final SubLList $list_alt130 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionIntersection2Fn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });

    static private final SubLList $list_alt132 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionIntersection2Fn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))") });

    static private final SubLList $list_alt134 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionDifferenceFn"), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });

    static private final SubLList $list_alt136 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionDifferenceFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionDifferenceFn . <fully-bound>))") });

    static private final SubLList $list_alt138 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell("isa")), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("TEMPLATE"), list(NIL, list(list(list($BIND, makeSymbol("MT-1")), list($BIND, makeSymbol("ASENT-1"))), list(list($BIND, makeSymbol("MT-2")), list($BIND, makeSymbol("ASENT-2"))))), list($CALL, makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("ASENT-1")), list(makeKeyword("VALUE"), makeSymbol("MT-1")), list(makeKeyword("VALUE"), makeSymbol("ASENT-2")), list(makeKeyword("VALUE"), makeSymbol("MT-2")))), $COST, makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa <fort1> <varN>)\n           (#$isa <varN> <fort2>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa #$AbrahamLincoln ?OCCUPATION)\n           (#$isa ?OCCUPATION #$PersonTypeByOccupation))") });

    static private final SubLList $list_alt141 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLList $list_alt143 = list(makeSymbol("CONTEXTUALIZED-ASENT0"), makeSymbol("CONTEXTUALIZED-ASENT1"));

    static private final SubLList $list_alt144 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));

    static private final SubLList $list_alt145 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));

    private static final SubLSymbol $QUOTED_ISA_X_Y_POS = makeKeyword("QUOTED-ISA-X-Y-POS");

    static private final SubLList $list_alt148 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt150 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("ALL-QUOTED-INSTANCES-POS-PREFERENCE"));

    static private final SubLList $list_alt152 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    static private final SubLList $list_alt154 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <fort>)") });

    static private final SubLList $list_alt156 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedIsa #$Dog #$Predicate))") });

    static private final SubLList $list_alt158 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("FULLY-BOUND"), $FORT), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED"), $COST, makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa 42 #$SubLInteger)") });

    static private final SubLList $list_alt160 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-QUOTED-ISA-DEFN-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedIsa 42 #$SubLString))") });

    static private final SubLList $list_alt162 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <fort>)") });

    static private final SubLList $list_alt164 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), $FORT, makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa #$Dog ?COL)") });

    static private final SubLList $list_alt166 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa (#$JuvenileFn #$Cougar) ?COL)") });

    static private final SubLList $list_alt168 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("quotedIsa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("quotedIsa"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <not fully-bound> <fort>)") });
}

/**
 * Total time: 925 ms
 */
