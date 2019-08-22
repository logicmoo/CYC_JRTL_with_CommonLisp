/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.canonical_extensional_set_p;
import static com.cyc.cycjava.cycl.el_utilities.canonicalize_extensional_set;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_p;
import static com.cyc.cycjava.cycl.el_utilities.extensional_set_elements;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-SUBSET-OF
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-subset-of.lisp
 * created:     2019/07/03 17:37:45
 */
public final class removal_modules_subset_of extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_subset_of();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $removal_subsetof_theset_theset_cost$ = makeSymbol("*REMOVAL-SUBSETOF-THESET-THESET-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $removal_subsetof_theset_thesetof_cost$ = makeSymbol("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_subsetof_thesetof_hypothesize_cost$ = makeSymbol("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_genls_thecollectionof_hypothesize_cost$ = makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_subsetof_thesetof_check_cost$ = makeSymbol("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_genls_thecollectionof_check_cost$ = makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_subsetof_unbound_theset_max_cardinality$ = makeSymbol("*DEFAULT-SUBSETOF-UNBOUND-THESET-MAX-CARDINALITY*");



    private static final SubLSymbol $REMOVAL_SUBSETOF_THESET_THESET_POS = makeKeyword("REMOVAL-SUBSETOF-THESET-THESET-POS");

    private static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESET-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESET-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf (#$TheSet 1 2)(#$TheSet 1 2 3))") });

    private static final SubLSymbol $REMOVAL_SUBSETOF_THESET_THESET_NEG = makeKeyword("REMOVAL-SUBSETOF-THESET-THESET-NEG");

    private static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESET-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESET-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$subsetOf (#$TheSet 1 2 3)(#$TheSet 1 2)))") });

    private static final SubLSymbol $REMOVAL_SUBSETOF_THESET_THESETOF_POS = makeKeyword("REMOVAL-SUBSETOF-THESET-THESETOF-POS");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESETOF-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf\n  (#$TheSet #$France #$Austria)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY)))") });

    private static final SubLSymbol $REMOVAL_SUBSETOF_THESET_THESETOF_NEG = makeKeyword("REMOVAL-SUBSETOF-THESET-THESETOF-NEG");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESETOF-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n (#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n (#$subsetOf\n  (#$TheSet #$France #$Canada)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY))))") });

    private static final SubLSymbol $REMOVAL_SUBSETOF_THESETOF_FORT_POS = makeKeyword("REMOVAL-SUBSETOF-THESETOF-FORT-POS");

    private static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND")), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-FORT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });

    private static final SubLSymbol $REMOVAL_SUBSETOF_THESETOF_FORT_NEG = makeKeyword("REMOVAL-SUBSETOF-THESETOF-FORT-NEG");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND")), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-FORT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not\n  (#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });

    private static final SubLSymbol $REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS");

    private static final SubLList $list20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"))), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });

    private static final SubLSymbol $REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG");

    private static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"))), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not\n  (#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });

    private static final SubLSymbol $REMOVAL_SUBSETOF_THESETOF_THESETOF_POS = makeKeyword("REMOVAL-SUBSETOF-THESETOF-THESETOF-POS");

    private static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-THESETOF-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf \n  (#$TheSetOf <variable> <fully-bound>) \n  (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheSetOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });

    private static final SubLSymbol $REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG = makeKeyword("REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG");

    private static final SubLList $list26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n  (#$subsetOf \n    (#$TheSetOf <variable> <fully-bound>) \n    (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheSetOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });

    private static final SubLSymbol $REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls \n  (#$TheCollectionOf <variable> <fully-bound>) \n  (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheCollectionOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });

    private static final SubLSymbol $REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG = makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG");

    private static final SubLList $list30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n  (#$genls \n    (#$TheCollectionOf <variable> <fully-bound>) \n    (#$TheCollectionOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheCollectionOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });





    private static final SubLSymbol $REMOVAL_SUBSETOF_VARIABLE_THESET_POS = makeKeyword("REMOVAL-SUBSETOF-VARIABLE-THESET-POS");

    static private final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), list(makeKeyword("OR"), makeKeyword("VARIABLE"), list(makeKeyword("AND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("NOT-FULLY-BOUND")), list($TEST, makeSymbol("ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?")))), list(makeKeyword("AND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), list($TEST, makeSymbol("SMALL-EXTENSIONAL-SET-WRT-POWERSET?")))), $COST, makeSymbol("REMOVAL-SUBSETOF-VARIABLE-THESET-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-VARIABLE-THESET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf (<variable> or (#$TheSet . <all-unbound>) (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf ?SUBSET (#$TheSet 1 2 3))") });



    private static final SubLSymbol $REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS = makeKeyword("REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-POS");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), list(makeKeyword("AND"), list(makeKeyword("NOT"), makeKeyword("VARIABLE")), list(makeKeyword("AND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("NOT"), list($TEST, makeSymbol("ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?"))))), list(makeKeyword("AND"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), list($TEST, makeSymbol("SMALL-EXTENSIONAL-SET-WRT-POWERSET?")))), $COST, makeSymbol("REMOVAL-SUBSETOF-VARIABLE-THESET-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf (#$TheSet . <not-fully-bound>) (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf (#$TheSet 1 ?X 3) (#$TheSet 1 2 3 4))") });

    private static final SubLList $list40 = list(reader_make_constant_shell("subsetOf"), reader_make_constant_shell("TheEmptySet"), makeSymbol("?SET"));



    private static final SubLSymbol $REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION = makeKeyword("REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION");

    private static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), reader_make_constant_shell("TheEmptySet"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("SET-OR-COLLECTION?")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf #$TheEmptySet <fully-bound>)\n    where <fully-bound> arg2 is also a #$Set-Mathematical or a #$Collection"), makeKeyword("EXAMPLE"), makeString(" (#$subsetOf #$TheEmptySet #$TheEmptySet)\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSet #$isa #$Thing #$Collection))\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor))))\n") });

    // Definitions
    public static final SubLObject make_subsetof_hl_support_alt(SubLObject formula, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        return arguments.make_hl_support($SUBSETOF, formula, mt, tv);
    }

    // Definitions
    public static SubLObject make_subsetof_hl_support(final SubLObject formula, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        return arguments.make_hl_support($SUBSETOF, formula, mt, tv);
    }

    public static final SubLObject removal_subsetof_theset_theset_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject superset = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject subset_elements = cycl_utilities.nat_args(subset, UNPROVIDED);
            SubLObject superset_elements = cycl_utilities.nat_args(superset, UNPROVIDED);
            if (NIL != subsetp(subset_elements, superset_elements, symbol_function(EQUAL), UNPROVIDED)) {
                backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.make_subsetof_hl_support(asent, mt_vars.$subset_of_defining_mt$.getGlobalValue(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_subsetof_theset_theset_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject superset = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject subset_elements = cycl_utilities.nat_args(subset, UNPROVIDED);
        final SubLObject superset_elements = cycl_utilities.nat_args(superset, UNPROVIDED);
        if (NIL != subsetp(subset_elements, superset_elements, symbol_function(EQUAL), UNPROVIDED)) {
            backward.removal_add_node(make_subsetof_hl_support(asent, mt_vars.$subset_of_defining_mt$.getGlobalValue(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESET-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESET-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf (#$TheSet 1 2)(#$TheSet 1 2 3))") });

    public static final SubLObject removal_subsetof_theset_theset_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject superset = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject subset_elements = cycl_utilities.nat_args(subset, UNPROVIDED);
            SubLObject superset_elements = cycl_utilities.nat_args(superset, UNPROVIDED);
            if (NIL == subsetp(subset_elements, superset_elements, symbol_function(EQUAL), UNPROVIDED)) {
                backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.make_subsetof_hl_support(cycl_utilities.negate(asent), mt_vars.$subset_of_defining_mt$.getGlobalValue(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_subsetof_theset_theset_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject superset = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject subset_elements = cycl_utilities.nat_args(subset, UNPROVIDED);
        final SubLObject superset_elements = cycl_utilities.nat_args(superset, UNPROVIDED);
        if (NIL == subsetp(subset_elements, superset_elements, symbol_function(EQUAL), UNPROVIDED)) {
            backward.removal_add_node(make_subsetof_hl_support(cycl_utilities.negate(asent), mt_vars.$subset_of_defining_mt$.getGlobalValue(), $TRUE_MON), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESET-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESET-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$subsetOf (#$TheSet 1 2 3)(#$TheSet 1 2)))") });

    public static final SubLObject removal_subsetof_theset_thesetof_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject arg1_elements = cycl_utilities.nat_args(arg1_set, UNPROVIDED);
                SubLObject cdolist_list_var = arg1_elements;
                SubLObject arg1_element = NIL;
                for (arg1_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg1_element = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject result = removal_modules_isa.inference_elementof_thesetof_check(arg1_element, arg2_set_of, UNPROVIDED);
                        SubLObject validP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL == result) && (NIL != validP)) {
                            return NIL;
                        }
                    }
                }
                backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.make_subsetof_hl_support(asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject removal_subsetof_theset_thesetof_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject arg1_elements = cdolist_list_var = cycl_utilities.nat_args(arg1_set, UNPROVIDED);
        SubLObject arg1_element = NIL;
        arg1_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject result = removal_modules_isa.inference_elementof_thesetof_check(arg1_element, arg2_set_of, UNPROVIDED);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == result) && (NIL != validP)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg1_element = cdolist_list_var.first();
        } 
        backward.removal_add_node(make_subsetof_hl_support(asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESETOF-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf\n  (#$TheSet #$France #$Austria)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY)))") });

    public static final SubLObject removal_subsetof_theset_thesetof_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject arg1_elements = cycl_utilities.nat_args(arg1_set, UNPROVIDED);
                SubLObject cdolist_list_var = arg1_elements;
                SubLObject arg1_element = NIL;
                for (arg1_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg1_element = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject result = removal_modules_isa.inference_elementof_thesetof_check(arg1_element, arg2_set_of, UNPROVIDED);
                        SubLObject validP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL == result) && (NIL != validP)) {
                            backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.make_subsetof_hl_support(cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static SubLObject removal_subsetof_theset_thesetof_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject arg1_elements = cdolist_list_var = cycl_utilities.nat_args(arg1_set, UNPROVIDED);
        SubLObject arg1_element = NIL;
        arg1_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject result = removal_modules_isa.inference_elementof_thesetof_check(arg1_element, arg2_set_of, UNPROVIDED);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == result) && (NIL != validP)) {
                backward.removal_add_node(make_subsetof_hl_support(cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg1_element = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSet"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESET-THESETOF-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n (#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n (#$subsetOf\n  (#$TheSet #$France #$Canada)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY))))") });

    public static final SubLObject removal_subsetof_thesetof_fort_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.removal_subsetof_thesetof_fort_expand(asent, $POS);
    }

    public static SubLObject removal_subsetof_thesetof_fort_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, $POS);
    }

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND")), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-FORT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });

    public static final SubLObject removal_subsetof_thesetof_fort_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.removal_subsetof_thesetof_fort_expand(asent, $NEG);
    }

    public static SubLObject removal_subsetof_thesetof_fort_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, $NEG);
    }

    public static final SubLObject removal_subsetof_thesetof_fort_expand_alt(SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject the_set_of = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject set_formula = cycl_utilities.nat_arg2(the_set_of, UNPROVIDED);
                SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject hypothetical_mt = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.inference_hypothesize_element(set_formula, UNPROVIDED);
                    SubLObject hypothetical_element = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject subset = makeBoolean(((NIL != hypothetical_mt) && (NIL != hypothetical_element)) && (NIL != isa.isaP(hypothetical_element, collection, hypothetical_mt, UNPROVIDED)));
                        if (NIL != (NIL != subset ? ((SubLObject) (eq($POS, sense))) : eq($NEG, sense))) {
                            {
                                SubLObject support_formula = asent;
                                if ($NEG == sense) {
                                    support_formula = cycl_utilities.negate(support_formula);
                                }
                                backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.make_subsetof_hl_support(support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_subsetof_thesetof_fort_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject the_set_of = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject set_formula = cycl_utilities.nat_arg2(the_set_of, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject hypothetical_mt = inference_hypothesize_element(set_formula, UNPROVIDED);
        final SubLObject hypothetical_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject subset = makeBoolean(((NIL != hypothetical_mt) && (NIL != hypothetical_element)) && (NIL != isa.isaP(hypothetical_element, collection, hypothetical_mt, UNPROVIDED)));
        if (NIL != (NIL != subset ? eq($POS, sense) : eq($NEG, sense))) {
            SubLObject support_formula = asent;
            if ($NEG == sense) {
                support_formula = cycl_utilities.negate(support_formula);
            }
            backward.removal_add_node(make_subsetof_hl_support(support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND")), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-FORT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not\n  (#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });

    public static final SubLObject inference_hypothesize_element_alt(SubLObject set_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hypothetical_mt = NIL;
                SubLObject hypothetical_element = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
                    try {
                        at_vars.$at_apply_necessary_defnsP$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject hyp_mt = prove.prepare_hypothesis_mt(set_formula, mt, ZERO_INTEGER);
                            SubLObject term_bindings = thread.secondMultipleValue();
                            SubLObject failure_reasons = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == failure_reasons) {
                                {
                                    SubLObject binding = term_bindings.first();
                                    SubLObject hyp_element = bindings.variable_binding_value(binding);
                                    if (NIL != forts.fort_p(hyp_element)) {
                                        hypothetical_mt = hyp_mt;
                                        hypothetical_element = hyp_element;
                                    }
                                }
                            }
                        }
                    } finally {
                        at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != hypothetical_element) {
                    return values(hypothetical_mt, hypothetical_element);
                }
            }
            return NIL;
        }
    }

    public static SubLObject inference_hypothesize_element(final SubLObject set_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothetical_mt = NIL;
        SubLObject hypothetical_element = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
        try {
            at_vars.$at_apply_necessary_defnsP$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject hyp_mt = prove.prepare_hypothesis_mt(set_formula, mt, ZERO_INTEGER);
            final SubLObject term_bindings = thread.secondMultipleValue();
            final SubLObject failure_reasons = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL == failure_reasons) {
                final SubLObject binding = term_bindings.first();
                final SubLObject hyp_element = bindings.variable_binding_value(binding);
                if (NIL != forts.fort_p(hyp_element)) {
                    hypothetical_mt = hyp_mt;
                    hypothetical_element = hyp_element;
                }
            }
        } finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != hypothetical_element) {
            return values(hypothetical_mt, hypothetical_element);
        }
        return NIL;
    }

    static private final SubLList $list_alt19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"))), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)") });

    static private final SubLList $list_alt21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"))), $FORT), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not\n  (#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))") });

    public static final SubLObject removal_genls_thecollectionof_fort_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.removal_subsetof_thesetof_fort_expand(asent, $POS);
    }

    public static SubLObject removal_genls_thecollectionof_fort_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, $POS);
    }

    public static final SubLObject removal_genls_thecollectionof_fort_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.removal_subsetof_thesetof_fort_expand(asent, $NEG);
    }

    public static SubLObject removal_genls_thecollectionof_fort_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_fort_expand(asent, $NEG);
    }

    public static final SubLObject removal_subsetof_thesetof_thesetof_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.removal_subsetof_thesetof_thesetof_expand(asent, $POS);
    }

    public static SubLObject removal_subsetof_thesetof_thesetof_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, $POS);
    }

    public static final SubLObject removal_subsetof_thesetof_thesetof_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.removal_subsetof_thesetof_thesetof_expand(asent, $NEG);
    }

    public static SubLObject removal_subsetof_thesetof_thesetof_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, $NEG);
    }

    static private final SubLList $list_alt23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-THESETOF-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf \n  (#$TheSetOf <variable> <fully-bound>) \n  (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheSetOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });

    public static final SubLObject removal_subsetof_thesetof_thesetof_expand_alt(SubLObject asent, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject the_set_of_sub = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject set_formula_sub = cycl_utilities.nat_arg2(the_set_of_sub, UNPROVIDED);
                SubLObject the_set_of_super = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject hypothetical_mt = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.inference_hypothesize_element(set_formula_sub, UNPROVIDED);
                    SubLObject hypothetical_element = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != hypothetical_mt) && (NIL != hypothetical_element)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject subset = removal_modules_isa.inference_elementof_thesetof_check(hypothetical_element, the_set_of_super, hypothetical_mt);
                            SubLObject validP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != validP) {
                                if (NIL != (NIL != subset ? ((SubLObject) (eq($POS, sense))) : eq($NEG, sense))) {
                                    {
                                        SubLObject support_formula = asent;
                                        if ($NEG == sense) {
                                            support_formula = cycl_utilities.negate(support_formula);
                                        }
                                        backward.removal_add_node(arguments.make_hl_support($SUBSETOF, support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
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

    public static SubLObject removal_subsetof_thesetof_thesetof_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject the_set_of_sub = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject set_formula_sub = cycl_utilities.nat_arg2(the_set_of_sub, UNPROVIDED);
        final SubLObject the_set_of_super = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject hypothetical_mt = inference_hypothesize_element(set_formula_sub, UNPROVIDED);
        final SubLObject hypothetical_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != hypothetical_mt) && (NIL != hypothetical_element)) {
            thread.resetMultipleValues();
            final SubLObject subset = removal_modules_isa.inference_elementof_thesetof_check(hypothetical_element, the_set_of_super, hypothetical_mt);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != validP) && (NIL != (NIL != subset ? eq($POS, sense) : eq($NEG, sense)))) {
                SubLObject support_formula = asent;
                if ($NEG == sense) {
                    support_formula = cycl_utilities.negate(support_formula);
                }
                backward.removal_add_node(arguments.make_hl_support($SUBSETOF, support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell("TheSetOf"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n  (#$subsetOf \n    (#$TheSetOf <variable> <fully-bound>) \n    (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheSetOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });

    public static final SubLObject removal_genls_thecollectionof_thecollectionof_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.removal_subsetof_thesetof_thesetof_expand(asent, $POS);
    }

    public static SubLObject removal_genls_thecollectionof_thecollectionof_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, $POS);
    }

    public static final SubLObject removal_genls_thecollectionof_thecollectionof_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.removal_subsetof_thesetof_thesetof_expand(asent, $NEG);
    }

    public static SubLObject removal_genls_thecollectionof_thecollectionof_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_subsetof_thesetof_thesetof_expand(asent, $NEG);
    }

    public static SubLObject removal_subsetof_variable_theset_cost(final SubLObject asent) {
        return expt(TWO_INTEGER, length(cycl_utilities.nat_args(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED)));
    }

    public static SubLObject removal_subsetof_variable_theset_expand(final SubLObject asent, final SubLObject sense) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject superset = cycl_utilities.nat_args(arg2, UNPROVIDED);
        SubLObject cdolist_list_var = list_utilities.powerset(superset);
        SubLObject subset = NIL;
        subset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, bq_cons($$TheSet, append(subset, NIL)), UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                final SubLObject unify_arg1 = bindings.subst_bindings(v_bindings, arg1);
                final SubLObject formula = list($$subsetOf, unify_arg1, arg2);
                backward.removal_add_node(arguments.make_hl_support($SUBSETOF, formula, $$UniversalVocabularyMt, $TRUE_MON), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subset = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLList $list_alt27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls \n  (#$TheCollectionOf <variable> <fully-bound>) \n  (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheCollectionOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))") });

    public static SubLObject small_extensional_set_wrt_powersetP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_extensional_set_p(v_object)) {
            return numLE(length(extensional_set_elements(v_object)), $default_subsetof_unbound_theset_max_cardinality$.getDynamicValue(thread));
        }
        return NIL;
    }

    static private final SubLList $list_alt29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(reader_make_constant_shell("TheCollectionOf"), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not \n  (#$genls \n    (#$TheCollectionOf <variable> <fully-bound>) \n    (#$TheCollectionOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheCollectionOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))") });

    public static SubLObject all_extensional_set_elements_unboundP(final SubLObject v_object) {
        if (NIL != el_extensional_set_p(v_object)) {
            return list_utilities.every_in_list(symbol_function(VARIABLE_P), extensional_set_elements(v_object), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_subsetof_not_fully_bound_theset_expand(final SubLObject asent, final SubLObject sense) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject superset = cycl_utilities.nat_args(arg2, UNPROVIDED);
        SubLObject cdolist_list_var = list_utilities.powerset(superset);
        SubLObject subset = NIL;
        subset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = list_utilities.permute_list(subset, UNPROVIDED);
            SubLObject perm = NIL;
            perm = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject candidate = bq_cons($$TheSet, append(perm, NIL));
                final SubLObject v_bindings = unification_utilities.term_unify(arg1, candidate, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    final SubLObject unify_arg1 = bindings.subst_bindings(v_bindings, arg1);
                    final SubLObject formula = list($$subsetOf, unify_arg1, arg2);
                    final SubLObject canonical_candidate = canonicalize_extensional_set(candidate);
                    final SubLObject rewrite_formula = list($$rewriteOf, canonical_candidate, candidate);
                    final SubLObject additional_supports = (NIL != canonical_extensional_set_p(candidate)) ? NIL : list(arguments.make_hl_support($CODE, rewrite_formula, $$UniversalVocabularyMt, $TRUE_MON));
                    backward.removal_add_node(arguments.make_hl_support($SUBSETOF, formula, $$UniversalVocabularyMt, $TRUE_MON), v_bindings, additional_supports);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                perm = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            subset = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLList $list_alt31 = list(reader_make_constant_shell("subsetOf"), reader_make_constant_shell("TheEmptySet"), makeSymbol("?SET"));

    static private final SubLList $list_alt34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("subsetOf"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subsetOf"), reader_make_constant_shell("TheEmptySet"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("SET-OR-COLLECTION?")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subsetOf #$TheEmptySet <fully-bound>)\n    where <fully-bound> arg2 is also a #$Set-Mathematical or a #$Collection"), makeKeyword("EXAMPLE"), makeString(" (#$subsetOf #$TheEmptySet #$TheEmptySet)\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSet #$isa #$Thing #$Collection))\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor))))\n") });

    public static final SubLObject make_empty_set_support_alt() {
        return arguments.make_hl_support($CODE, $list_alt31, $$BaseKB, $TRUE_MON);
    }

    public static SubLObject make_empty_set_support() {
        return arguments.make_hl_support($CODE, $list40, $$BaseKB, $TRUE_MON);
    }

    public static final SubLObject removal_subsetof_theemptyset_set_or_collection_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.make_subsetof_hl_support(asent, UNPROVIDED, UNPROVIDED), NIL, list(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of.make_empty_set_support()));
        return NIL;
    }

    public static SubLObject removal_subsetof_theemptyset_set_or_collection_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        backward.removal_add_node(make_subsetof_hl_support(asent, UNPROVIDED, UNPROVIDED), NIL, list(make_empty_set_support()));
        return NIL;
    }

    public static SubLObject declare_removal_modules_subset_of_file() {
        declareFunction("make_subsetof_hl_support", "MAKE-SUBSETOF-HL-SUPPORT", 1, 2, false);
        declareFunction("removal_subsetof_theset_theset_pos_expand", "REMOVAL-SUBSETOF-THESET-THESET-POS-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_theset_theset_neg_expand", "REMOVAL-SUBSETOF-THESET-THESET-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_theset_thesetof_pos_expand", "REMOVAL-SUBSETOF-THESET-THESETOF-POS-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_theset_thesetof_neg_expand", "REMOVAL-SUBSETOF-THESET-THESETOF-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_fort_pos_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-POS-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_fort_neg_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_fort_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-EXPAND", 2, 0, false);
        declareFunction("inference_hypothesize_element", "INFERENCE-HYPOTHESIZE-ELEMENT", 1, 1, false);
        declareFunction("removal_genls_thecollectionof_fort_pos_expand", "REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS-EXPAND", 1, 1, false);
        declareFunction("removal_genls_thecollectionof_fort_neg_expand", "REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_thesetof_pos_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-POS-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_thesetof_neg_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_thesetof_thesetof_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-EXPAND", 2, 0, false);
        declareFunction("removal_genls_thecollectionof_thecollectionof_pos_expand", "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS-EXPAND", 1, 1, false);
        declareFunction("removal_genls_thecollectionof_thecollectionof_neg_expand", "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_subsetof_variable_theset_cost", "REMOVAL-SUBSETOF-VARIABLE-THESET-COST", 1, 0, false);
        declareFunction("removal_subsetof_variable_theset_expand", "REMOVAL-SUBSETOF-VARIABLE-THESET-EXPAND", 2, 0, false);
        declareFunction("small_extensional_set_wrt_powersetP", "SMALL-EXTENSIONAL-SET-WRT-POWERSET?", 1, 0, false);
        declareFunction("all_extensional_set_elements_unboundP", "ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?", 1, 0, false);
        declareFunction("removal_subsetof_not_fully_bound_theset_expand", "REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-EXPAND", 2, 0, false);
        declareFunction("make_empty_set_support", "MAKE-EMPTY-SET-SUPPORT", 0, 0, false);
        declareFunction("removal_subsetof_theemptyset_set_or_collection_expand", "REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_subset_of_file() {
        defparameter("*REMOVAL-SUBSETOF-THESET-THESET-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*REMOVAL-SUBSETOF-THESET-THESETOF-COST*", TWO_INTEGER);
        defparameter("*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*", TWO_INTEGER);
        defparameter("*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*", $default_subsetof_thesetof_hypothesize_cost$.getDynamicValue());
        defparameter("*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*", TWO_INTEGER);
        defparameter("*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*", $default_subsetof_thesetof_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-SUBSETOF-UNBOUND-THESET-MAX-CARDINALITY*", TEN_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_subset_of_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$subsetOf);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_POS, $list_alt5);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_NEG, $list_alt7);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_POS, $list_alt9);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_NEG, $list_alt11);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_POS, $list_alt15);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_NEG, $list_alt17);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS, $list_alt19);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG, $list_alt21);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_POS, $list_alt23);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG, $list_alt25);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS, $list_alt27);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG, $list_alt29);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION, $list_alt34);
        return NIL;
    }

    public static SubLObject setup_removal_modules_subset_of_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$subsetOf);
            preference_modules.doomed_unless_all_args_bindable($BOTH, $$subsetOf);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_POS, $list6);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_NEG, $list8);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_POS, $list10);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_NEG, $list12);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_POS, $list16);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_NEG, $list18);
            inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS, $list20);
            inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG, $list22);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_POS, $list24);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG, $list26);
            inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS, $list28);
            inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG, $list30);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_VARIABLE_THESET_POS, $list34);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS, $list39);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION, $list43);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_POS, $list_alt5);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_NEG, $list_alt7);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_POS, $list_alt9);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_NEG, $list_alt11);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_POS, $list_alt15);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_NEG, $list_alt17);
            inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS, $list_alt19);
            inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG, $list_alt21);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_POS, $list_alt23);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG, $list_alt25);
            inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS, $list_alt27);
            inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG, $list_alt29);
            inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION, $list_alt34);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_subset_of_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$subsetOf);
        preference_modules.doomed_unless_all_args_bindable($BOTH, $$subsetOf);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_POS, $list6);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESET_NEG, $list8);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESET_THESETOF_NEG, $list12);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_POS, $list16);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_FORT_NEG, $list18);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS, $list20);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG, $list22);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_POS, $list24);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG, $list26);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS, $list28);
        inference_modules.inference_removal_module($REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG, $list30);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_VARIABLE_THESET_POS, $list34);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS, $list39);
        inference_modules.inference_removal_module($REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION, $list43);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_subset_of_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_subset_of_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_subset_of_file();
    }

    
}

/**
 * Total time: 245 ms
 */
