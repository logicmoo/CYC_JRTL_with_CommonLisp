/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
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


public final class removal_modules_bookkeeping extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_bookkeeping();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $bookkeeping_check_default_cost$ = makeSymbol("*BOOKKEEPING-CHECK-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creator_check_default_cost$ = makeSymbol("*MY-CREATOR-CHECK-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creator_unify_arg2_default_cost$ = makeSymbol("*MY-CREATOR-UNIFY-ARG2-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creation_time_check_default_cost$ = makeSymbol("*MY-CREATION-TIME-CHECK-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creation_time_unify_arg2_default_cost$ = makeSymbol("*MY-CREATION-TIME-UNIFY-ARG2-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creation_purpose_check_default_cost$ = makeSymbol("*MY-CREATION-PURPOSE-CHECK-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creation_purpose_unify_arg2_default_cost$ = makeSymbol("*MY-CREATION-PURPOSE-UNIFY-ARG2-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creation_second_check_default_cost$ = makeSymbol("*MY-CREATION-SECOND-CHECK-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creation_second_unify_arg2_default_cost$ = makeSymbol("*MY-CREATION-SECOND-UNIFY-ARG2-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creation_date_check_default_cost$ = makeSymbol("*MY-CREATION-DATE-CHECK-DEFAULT-COST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $my_creation_date_unify_arg2_default_cost$ = makeSymbol("*MY-CREATION-DATE-UNIFY-ARG2-DEFAULT-COST*");





    private static final SubLSymbol $REMOVAL_MY_CREATOR_CHECK_POS = makeKeyword("REMOVAL-MY-CREATOR-CHECK-POS");

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreator"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreator"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <fort-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator #$Dog #$Guzman)") });

    private static final SubLSymbol $REMOVAL_MY_CREATOR_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATOR-CHECK-NEG");

    static private final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreator"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreator"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreator <fort-p> <fort-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreator #$Dog #$Muffet))") });

    private static final SubLSymbol $REMOVAL_MY_CREATOR_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG2");

    static private final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreator"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreator"), $FORT, makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator #$Dog ?WHO)") });

    private static final SubLSymbol $REMOVAL_MY_CREATOR_UNIFY_ARG1 = makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG1");

    private static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreator"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreator"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <not-fully-bound-p> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator ?WHAT #$Guzman)") });



    private static final SubLSymbol $REMOVAL_MY_CREATION_TIME_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-POS");

    static private final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationTime"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationTime"), $FORT, list($TEST, makeSymbol("UNIVERSAL-DATE-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationTime <fort-p> <universal-date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog 19871011)") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_TIME_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-NEG");

    static private final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationTime"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationTime"), $FORT, list($TEST, makeSymbol("UNIVERSAL-DATE-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationTime <fort-p> <universal-date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationTime #$Dog 19770717))") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_TIME_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2");

    private static final SubLList $list20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationTime"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationTime"), $FORT, makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationTime <fort-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog ?WHEN)") });



    private static final SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS");

    static private final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationPurpose"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationPurpose"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <fort-p> <fort-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew #$GeneralCycKE)") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG");

    static private final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationPurpose"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationPurpose"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationPurpose <fort-p> <fort-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationPurpose #$BritneySpears #$GeneralCycKE))") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2");

    static private final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationPurpose"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationPurpose"), $FORT, makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <fort-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew ?WHY)") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1 = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1");

    private static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationPurpose"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationPurpose"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <not-fully-bound-p> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose ?WHAT #$GeneralCycKE)") });



    private static final SubLSymbol $REMOVAL_MY_CREATION_SECOND_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-POS");

    static private final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationSecond"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationSecond"), $FORT, list($TEST, makeSymbol("UNIVERSAL-SECOND-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <universal-second-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor 162525)") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_SECOND_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-NEG");

    static private final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationSecond"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationSecond"), $FORT, list($TEST, makeSymbol("UNIVERSAL-SECOND-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationSecond <fort-p> <universal-second-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationSecond #$MauveColor 212))") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2");

    private static final SubLList $list36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationSecond"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationSecond"), $FORT, makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor ?WHEN)") });



    private static final SubLSymbol $REMOVAL_MY_CREATION_DATE_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-POS");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationDate"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationDate"), $FORT, list($TEST, makeSymbol("DATE-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationDate <fort-p> <date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001)))))))") });



    private static final SubLSymbol $REMOVAL_MY_CREATION_DATE_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-NEG");

    static private final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationDate"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationDate"), $FORT, list($TEST, makeSymbol("DATE-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationDate <fort-p> <date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationDate #$Dog (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001))))))))") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_DATE_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2");

    private static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationDate"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationDate"), $FORT, makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationDate <fort-p> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini ?WHEN)") });

    public static final SubLObject make_bookkeeping_hl_support_alt(SubLObject asent) {
        return arguments.make_hl_support($BOOKKEEPING, asent, $$BookkeepingMt, $TRUE_MON);
    }

    public static SubLObject make_bookkeeping_hl_support(final SubLObject asent) {
        return arguments.make_hl_support($BOOKKEEPING, asent, $$BookkeepingMt, $TRUE_MON);
    }

    public static final SubLObject removal_my_creator_check_cost_alt(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creator_check_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creator_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creator_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject my_creator_arg2_lookup_alt(SubLObject arg1) {
        return bookkeeping_store.creator(arg1, UNPROVIDED);
    }

    public static SubLObject my_creator_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creator(arg1, UNPROVIDED);
    }

    public static final SubLObject make_my_creator_hl_support_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_bookkeeping_hl_support(asent);
    }

    public static SubLObject make_my_creator_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    public static final SubLObject removal_my_creator_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creator_check_cost(asent);
    }

    public static SubLObject removal_my_creator_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creator_check_cost(asent);
    }

    public static final SubLObject removal_my_creator_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creator_arg2_lookup(asent_arg1);
                if (asent_arg2 == lookup_arg2) {
                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creator_hl_support(asent), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creator_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creator_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creator_hl_support(asent), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creator_check_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creator_check_cost(asent);
    }

    public static SubLObject removal_my_creator_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creator_check_cost(asent);
    }

    public static final SubLObject removal_my_creator_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creator_arg2_lookup(asent_arg1);
                if ((NIL != lookup_arg2) && (!asent_arg2.eql(lookup_arg2))) {
                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creator_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creator_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creator_arg2_lookup(asent_arg1);
            if ((NIL != lookup_arg2) && (!asent_arg2.eql(lookup_arg2))) {
                backward.removal_add_node(make_my_creator_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creator_unify_arg2_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creator_unify_arg2_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creator_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creator_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_my_creator_unify_arg2_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
                {
                    SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                    SubLObject cyclist = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creator_arg2_lookup(arg1);
                    if (NIL != cyclist) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(cyclist, arg2, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creator_hl_support(ground_asent), v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_my_creator_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject cyclist = my_creator_arg2_lookup(arg1);
            if (NIL != cyclist) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(cyclist, arg2, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creator_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creator_unify_arg1_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_by(cycl_utilities.sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creator_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_by(cycl_utilities.sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_my_creator_unify_arg1_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
                {
                    SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                    SubLObject terms = bookkeeping_store.terms_created_by(arg2, UNPROVIDED);
                    if (NIL != terms) {
                        {
                            SubLObject cdolist_list_var = terms;
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings = unification_utilities.term_unify(v_term, arg1, T, T);
                                    SubLObject unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != v_bindings) {
                                        {
                                            SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                                            backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creator_hl_support(ground_asent), v_bindings, unify_justification);
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

    public static SubLObject removal_my_creator_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject terms = bookkeeping_store.terms_created_by(arg2, UNPROVIDED);
            if (NIL != terms) {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.term_unify(v_term, arg1, T, T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                        backward.removal_add_node(make_my_creator_hl_support(ground_asent), v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_time_check_cost_alt(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_time_check_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creation_time_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_time_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject my_creation_time_arg2_lookup_alt(SubLObject arg1) {
        return bookkeeping_store.creation_time(arg1, UNPROVIDED);
    }

    public static SubLObject my_creation_time_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creation_time(arg1, UNPROVIDED);
    }

    public static final SubLObject make_my_creation_time_hl_support_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_bookkeeping_hl_support(asent);
    }

    public static SubLObject make_my_creation_time_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    public static final SubLObject removal_my_creation_time_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creation_time_check_cost(asent);
    }

    public static SubLObject removal_my_creation_time_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_time_check_cost(asent);
    }

    public static final SubLObject removal_my_creation_time_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_time_arg2_lookup(asent_arg1);
                if (asent_arg2.eql(lookup_arg2)) {
                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_time_hl_support(asent), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creation_time_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_time_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_time_hl_support(asent), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_time_check_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creation_time_check_cost(asent);
    }

    public static SubLObject removal_my_creation_time_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_time_check_cost(asent);
    }

    public static final SubLObject removal_my_creation_time_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_time_arg2_lookup(asent_arg1);
                if ((NIL != lookup_arg2) && (!asent_arg2.eql(lookup_arg2))) {
                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_time_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creation_time_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_time_arg2_lookup(asent_arg1);
            if ((NIL != lookup_arg2) && (!asent_arg2.eql(lookup_arg2))) {
                backward.removal_add_node(make_my_creation_time_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_time_unify_arg2_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_time_unify_arg2_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creation_time_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_time_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_my_creation_time_unify_arg2_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
                {
                    SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                    SubLObject variable = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                    SubLObject arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_time_arg2_lookup(arg1);
                    if (NIL != arg2) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_time_hl_support(ground_asent), v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_my_creation_time_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject variable = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject arg2 = my_creation_time_arg2_lookup(arg1);
            if (NIL != arg2) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creation_time_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_purpose_check_cost_alt(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_purpose_check_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creation_purpose_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_purpose_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject my_creation_purpose_arg2_lookup_alt(SubLObject arg1) {
        return bookkeeping_store.creation_purpose(arg1, UNPROVIDED);
    }

    public static SubLObject my_creation_purpose_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creation_purpose(arg1, UNPROVIDED);
    }

    public static final SubLObject make_my_creation_purpose_hl_support_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_bookkeeping_hl_support(asent);
    }

    public static SubLObject make_my_creation_purpose_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    public static final SubLObject removal_my_creation_purpose_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creation_purpose_check_cost(asent);
    }

    public static SubLObject removal_my_creation_purpose_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_purpose_check_cost(asent);
    }

    public static final SubLObject removal_my_creation_purpose_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_purpose_arg2_lookup(asent_arg1);
                if (asent_arg2 == lookup_arg2) {
                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_purpose_hl_support(asent), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creation_purpose_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_purpose_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_purpose_hl_support(asent), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_purpose_check_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creation_purpose_check_cost(asent);
    }

    public static SubLObject removal_my_creation_purpose_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_purpose_check_cost(asent);
    }

    public static final SubLObject removal_my_creation_purpose_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_purpose_arg2_lookup(asent_arg1);
                if ((NIL != lookup_arg2) && (!asent_arg2.eql(lookup_arg2))) {
                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_purpose_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creation_purpose_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_purpose_arg2_lookup(asent_arg1);
            if ((NIL != lookup_arg2) && (!asent_arg2.eql(lookup_arg2))) {
                backward.removal_add_node(make_my_creation_purpose_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_purpose_unify_arg2_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_purpose_unify_arg2_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creation_purpose_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_purpose_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_my_creation_purpose_unify_arg2_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
                {
                    SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                    SubLObject not_fully_bound = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                    SubLObject arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_purpose_arg2_lookup(arg1);
                    if (NIL != arg2) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg2, not_fully_bound, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_purpose_hl_support(ground_asent), v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_my_creation_purpose_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject not_fully_bound = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject arg2 = my_creation_purpose_arg2_lookup(arg1);
            if (NIL != arg2) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, not_fully_bound, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creation_purpose_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_purpose_unify_arg1_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_for(cycl_utilities.sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creation_purpose_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_for(cycl_utilities.sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_my_creation_purpose_unify_arg1_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
                {
                    SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                    SubLObject terms = bookkeeping_store.terms_created_for(arg2, UNPROVIDED);
                    if (NIL != terms) {
                        {
                            SubLObject cdolist_list_var = terms;
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings = unification_utilities.term_unify(v_term, arg1, T, T);
                                    SubLObject unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != v_bindings) {
                                        {
                                            SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                                            backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_purpose_hl_support(ground_asent), v_bindings, unify_justification);
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

    public static SubLObject removal_my_creation_purpose_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject terms = bookkeeping_store.terms_created_for(arg2, UNPROVIDED);
            if (NIL != terms) {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.term_unify(v_term, arg1, T, T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                        backward.removal_add_node(make_my_creation_purpose_hl_support(ground_asent), v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_second_check_cost_alt(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_second_check_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creation_second_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_second_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject my_creation_second_arg2_lookup_alt(SubLObject arg1) {
        return bookkeeping_store.creation_second(arg1, UNPROVIDED);
    }

    public static SubLObject my_creation_second_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creation_second(arg1, UNPROVIDED);
    }

    public static final SubLObject make_my_creation_second_hl_support_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_bookkeeping_hl_support(asent);
    }

    public static SubLObject make_my_creation_second_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    public static final SubLObject removal_my_creation_second_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creation_second_check_cost(asent);
    }

    public static SubLObject removal_my_creation_second_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_second_check_cost(asent);
    }

    public static final SubLObject removal_my_creation_second_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_second_arg2_lookup(asent_arg1);
                if (asent_arg2.eql(lookup_arg2)) {
                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_second_hl_support(asent), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creation_second_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_second_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_second_hl_support(asent), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_second_check_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creation_second_check_cost(asent);
    }

    public static SubLObject removal_my_creation_second_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_second_check_cost(asent);
    }

    public static final SubLObject removal_my_creation_second_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_second_arg2_lookup(asent_arg1);
                if ((NIL != lookup_arg2) && (!asent_arg2.eql(lookup_arg2))) {
                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_second_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creation_second_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_second_arg2_lookup(asent_arg1);
            if ((NIL != lookup_arg2) && (!asent_arg2.eql(lookup_arg2))) {
                backward.removal_add_node(make_my_creation_second_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_second_unify_arg2_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_second_unify_arg2_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creation_second_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_second_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_my_creation_second_unify_arg2_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
                {
                    SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                    SubLObject variable = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                    SubLObject arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_second_arg2_lookup(arg1);
                    if (NIL != arg2) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                                    backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_second_hl_support(ground_asent), v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_my_creation_second_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject variable = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject arg2 = my_creation_second_arg2_lookup(arg1);
            if (NIL != arg2) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creation_second_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_date_check_cost_alt(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_date_check_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creation_date_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_date_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject my_creation_date_arg2_lookup_alt(SubLObject arg1) {
        {
            SubLObject date = bookkeeping_store.creation_time(arg1, UNPROVIDED);
            SubLObject second = bookkeeping_store.creation_second(arg1, UNPROVIDED);
            if (NIL == date) {
                return NIL;
            } else {
                if (NIL == second) {
                    return date_utilities.universal_date_to_cycl_date(date);
                } else {
                    {
                        SubLObject time = numeric_date_utilities.universal_time_from_date_and_second(date, second);
                        return date_utilities.universal_time_to_cycl_date(time);
                    }
                }
            }
        }
    }

    public static SubLObject my_creation_date_arg2_lookup(final SubLObject arg1) {
        final SubLObject date = bookkeeping_store.creation_time(arg1, UNPROVIDED);
        final SubLObject second = bookkeeping_store.creation_second(arg1, UNPROVIDED);
        if (NIL == date) {
            return NIL;
        }
        if (NIL == second) {
            return date_utilities.universal_date_to_cycl_date(date);
        }
        final SubLObject time = numeric_date_utilities.universal_time_from_date_and_second(date, second);
        return date_utilities.universal_time_to_cycl_date(time);
    }

    public static final SubLObject removal_my_creation_date_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creation_date_check_cost(asent);
    }

    public static SubLObject removal_my_creation_date_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_date_check_cost(asent);
    }

    public static final SubLObject removal_my_creation_date_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_date_arg2_lookup(asent_arg1);
                if (asent_arg2.equal(lookup_arg2)) {
                    {
                        SubLObject time = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_time_arg2_lookup(asent_arg1);
                        SubLObject second = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_second_arg2_lookup(asent_arg1);
                        backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_time_hl_support(list($$myCreationTime, asent_arg1, time)), NIL, NIL != second ? ((SubLObject) (list(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_second_hl_support(list($$myCreationSecond, asent_arg1, second))))) : NIL);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creation_date_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_date_arg2_lookup(asent_arg1);
            if (asent_arg2.equal(lookup_arg2)) {
                final SubLObject time = my_creation_time_arg2_lookup(asent_arg1);
                final SubLObject second = my_creation_second_arg2_lookup(asent_arg1);
                backward.removal_add_node(make_my_creation_time_hl_support(list($$myCreationTime, asent_arg1, time)), NIL, NIL != second ? list(make_my_creation_second_hl_support(list($$myCreationSecond, asent_arg1, second))) : NIL);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_date_check_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.removal_my_creation_date_check_cost(asent);
    }

    public static SubLObject removal_my_creation_date_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_date_check_cost(asent);
    }

    public static final SubLObject removal_my_creation_date_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            {
                SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                SubLObject lookup_arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_date_arg2_lookup(asent_arg1);
                if ((NIL != lookup_arg2) && (!asent_arg2.equal(lookup_arg2))) {
                    {
                        SubLObject actual_date = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_time_arg2_lookup(asent_arg1);
                        SubLObject actual_second = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_second_arg2_lookup(asent_arg1);
                        SubLObject queried_date = date_utilities.cycl_date_to_universal_date(asent_arg2);
                        SubLObject queried_second = date_utilities.cycl_date_to_universal_second(asent_arg2);
                        SubLObject supports = NIL;
                        if (!actual_second.equal(queried_second)) {
                            supports = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_second_hl_support(list($$not, list($$myCreationSecond, asent_arg1, queried_second))), supports);
                        }
                        if (!actual_date.equal(queried_date)) {
                            supports = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_second_hl_support(list($$not, list($$myCreationTime, asent_arg1, queried_date))), supports);
                        }
                        backward.removal_add_node(supports.first(), NIL, supports.rest());
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_my_creation_date_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_date_arg2_lookup(asent_arg1);
            if ((NIL != lookup_arg2) && (!asent_arg2.equal(lookup_arg2))) {
                final SubLObject actual_date = my_creation_time_arg2_lookup(asent_arg1);
                final SubLObject actual_second = my_creation_second_arg2_lookup(asent_arg1);
                final SubLObject queried_date = date_utilities.cycl_date_to_universal_date(asent_arg2);
                final SubLObject queried_second = date_utilities.cycl_date_to_universal_second(asent_arg2);
                SubLObject supports = NIL;
                if (!actual_second.equal(queried_second)) {
                    supports = cons(make_my_creation_second_hl_support(list($$not, list($$myCreationSecond, asent_arg1, queried_second))), supports);
                }
                if (!actual_date.equal(queried_date)) {
                    supports = cons(make_my_creation_second_hl_support(list($$not, list($$myCreationTime, asent_arg1, queried_date))), supports);
                }
                backward.removal_add_node(supports.first(), NIL, supports.rest());
            }
        }
        return NIL;
    }

    public static final SubLObject removal_my_creation_date_unify_arg2_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_date_unify_arg2_default_cost$.getGlobalValue();
        } else {
            return ZERO_INTEGER;
        }
    }

    public static SubLObject removal_my_creation_date_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_date_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_my_creation_date_unify_arg2_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
                {
                    SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
                    SubLObject variable = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
                    SubLObject arg2 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_date_arg2_lookup(arg1);
                    if (NIL != arg2) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject time = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_time_arg2_lookup(arg1);
                                    SubLObject second = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.my_creation_second_arg2_lookup(arg1);
                                    SubLObject second_just = (NIL != second) ? ((SubLObject) (list(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_second_hl_support(list($$myCreationSecond, arg1, second))))) : NIL;
                                    SubLObject support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping.make_my_creation_time_hl_support(list($$myCreationTime, arg1, time));
                                    SubLObject more_supports = append(unify_justification, second_just);
                                    backward.removal_add_node(support, v_bindings, more_supports);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_my_creation_date_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            final SubLObject variable = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            final SubLObject arg2 = my_creation_date_arg2_lookup(arg1);
            if (NIL != arg2) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject time = my_creation_time_arg2_lookup(arg1);
                    final SubLObject second = my_creation_second_arg2_lookup(arg1);
                    final SubLObject second_just = (NIL != second) ? list(make_my_creation_second_hl_support(list($$myCreationSecond, arg1, second))) : NIL;
                    final SubLObject support = make_my_creation_time_hl_support(list($$myCreationTime, arg1, time));
                    final SubLObject more_supports = append(unify_justification, second_just);
                    backward.removal_add_node(support, v_bindings, more_supports);
                }
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreator"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreator"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <fort-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator #$Dog #$Guzman)") });

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreator"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreator"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreator <fort-p> <fort-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreator #$Dog #$Muffet))") });

    public static SubLObject declare_removal_modules_bookkeeping_file() {
        declareFunction("make_bookkeeping_hl_support", "MAKE-BOOKKEEPING-HL-SUPPORT", 1, 0, false);
        declareFunction("removal_my_creator_check_cost", "REMOVAL-MY-CREATOR-CHECK-COST", 1, 0, false);
        declareFunction("my_creator_arg2_lookup", "MY-CREATOR-ARG2-LOOKUP", 1, 0, false);
        declareFunction("make_my_creator_hl_support", "MAKE-MY-CREATOR-HL-SUPPORT", 1, 0, false);
        declareFunction("removal_my_creator_check_pos_cost", "REMOVAL-MY-CREATOR-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_my_creator_check_pos_expand", "REMOVAL-MY-CREATOR-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_my_creator_check_neg_cost", "REMOVAL-MY-CREATOR-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_my_creator_check_neg_expand", "REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_my_creator_unify_arg2_cost", "REMOVAL-MY-CREATOR-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction("removal_my_creator_unify_arg2_expand", "REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction("removal_my_creator_unify_arg1_cost", "REMOVAL-MY-CREATOR-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction("removal_my_creator_unify_arg1_expand", "REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_time_check_cost", "REMOVAL-MY-CREATION-TIME-CHECK-COST", 1, 0, false);
        declareFunction("my_creation_time_arg2_lookup", "MY-CREATION-TIME-ARG2-LOOKUP", 1, 0, false);
        declareFunction("make_my_creation_time_hl_support", "MAKE-MY-CREATION-TIME-HL-SUPPORT", 1, 0, false);
        declareFunction("removal_my_creation_time_check_pos_cost", "REMOVAL-MY-CREATION-TIME-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_my_creation_time_check_pos_expand", "REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_time_check_neg_cost", "REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_my_creation_time_check_neg_expand", "REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_time_unify_arg2_cost", "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction("removal_my_creation_time_unify_arg2_expand", "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_purpose_check_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-COST", 1, 0, false);
        declareFunction("my_creation_purpose_arg2_lookup", "MY-CREATION-PURPOSE-ARG2-LOOKUP", 1, 0, false);
        declareFunction("make_my_creation_purpose_hl_support", "MAKE-MY-CREATION-PURPOSE-HL-SUPPORT", 1, 0, false);
        declareFunction("removal_my_creation_purpose_check_pos_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_my_creation_purpose_check_pos_expand", "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_purpose_check_neg_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_my_creation_purpose_check_neg_expand", "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_purpose_unify_arg2_cost", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction("removal_my_creation_purpose_unify_arg2_expand", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_purpose_unify_arg1_cost", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction("removal_my_creation_purpose_unify_arg1_expand", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_second_check_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-COST", 1, 0, false);
        declareFunction("my_creation_second_arg2_lookup", "MY-CREATION-SECOND-ARG2-LOOKUP", 1, 0, false);
        declareFunction("make_my_creation_second_hl_support", "MAKE-MY-CREATION-SECOND-HL-SUPPORT", 1, 0, false);
        declareFunction("removal_my_creation_second_check_pos_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_my_creation_second_check_pos_expand", "REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_second_check_neg_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_my_creation_second_check_neg_expand", "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_second_unify_arg2_cost", "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction("removal_my_creation_second_unify_arg2_expand", "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_date_check_cost", "REMOVAL-MY-CREATION-DATE-CHECK-COST", 1, 0, false);
        declareFunction("my_creation_date_arg2_lookup", "MY-CREATION-DATE-ARG2-LOOKUP", 1, 0, false);
        declareFunction("removal_my_creation_date_check_pos_cost", "REMOVAL-MY-CREATION-DATE-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_my_creation_date_check_pos_expand", "REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_date_check_neg_cost", "REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_my_creation_date_check_neg_expand", "REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_my_creation_date_unify_arg2_cost", "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction("removal_my_creation_date_unify_arg2_expand", "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreator"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreator"), $FORT, makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator #$Dog ?WHO)") });

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreator"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreator"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <not-fully-bound-p> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator ?WHAT #$Guzman)") });

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationTime"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationTime"), $FORT, list($TEST, makeSymbol("UNIVERSAL-DATE-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationTime <fort-p> <universal-date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog 19871011)") });

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationTime"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationTime"), $FORT, list($TEST, makeSymbol("UNIVERSAL-DATE-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationTime <fort-p> <universal-date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationTime #$Dog 19770717))") });

    static private final SubLList $list_alt18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationTime"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationTime"), $FORT, makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationTime <fort-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog ?WHEN)") });

    static private final SubLList $list_alt21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationPurpose"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationPurpose"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <fort-p> <fort-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew #$GeneralCycKE)") });

    static private final SubLList $list_alt23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationPurpose"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationPurpose"), $FORT, $FORT), $COST, makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationPurpose <fort-p> <fort-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationPurpose #$BritneySpears #$GeneralCycKE))") });

    public static SubLObject init_removal_modules_bookkeeping_file() {
        deflexical("*BOOKKEEPING-CHECK-DEFAULT-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*MY-CREATOR-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        deflexical("*MY-CREATOR-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        deflexical("*MY-CREATION-TIME-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        deflexical("*MY-CREATION-TIME-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        deflexical("*MY-CREATION-PURPOSE-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        deflexical("*MY-CREATION-PURPOSE-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        deflexical("*MY-CREATION-SECOND-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        deflexical("*MY-CREATION-SECOND-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        deflexical("*MY-CREATION-DATE-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        deflexical("*MY-CREATION-DATE-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        return NIL;
    }

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationPurpose"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationPurpose"), $FORT, makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <fort-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew ?WHY)") });

    static private final SubLList $list_alt27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationPurpose"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationPurpose"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <not-fully-bound-p> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose ?WHAT #$GeneralCycKE)") });

    public static final SubLObject setup_removal_modules_bookkeeping_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$myCreator);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_CHECK_POS, $list_alt5);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_CHECK_NEG, $list_alt7);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_UNIFY_ARG2, $list_alt9);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_UNIFY_ARG1, $list_alt11);
        inference_modules.register_solely_specific_removal_module_predicate($$myCreationTime);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_CHECK_POS, $list_alt14);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_CHECK_NEG, $list_alt16);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_UNIFY_ARG2, $list_alt18);
        inference_modules.register_solely_specific_removal_module_predicate($$myCreationPurpose);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_CHECK_POS, $list_alt21);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG, $list_alt23);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2, $list_alt25);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1, $list_alt27);
        inference_modules.register_solely_specific_removal_module_predicate($$myCreationSecond);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_CHECK_POS, $list_alt30);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_CHECK_NEG, $list_alt32);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2, $list_alt34);
        inference_modules.register_solely_specific_removal_module_predicate($$myCreationDate);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_CHECK_POS, $list_alt37);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_CHECK_NEG, $list_alt40);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_UNIFY_ARG2, $list_alt42);
        return NIL;
    }

    public static SubLObject setup_removal_modules_bookkeeping_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$myCreator);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$myCreator);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreator);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_CHECK_POS, $list7);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_CHECK_NEG, $list9);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_UNIFY_ARG2, $list11);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_UNIFY_ARG1, $list13);
            inference_modules.register_solely_specific_removal_module_predicate($$myCreationTime);
            preference_modules.doomed_unless_arg_bindable($POS, $$myCreationTime, ONE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreationTime);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_CHECK_POS, $list16);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_CHECK_NEG, $list18);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_UNIFY_ARG2, $list20);
            inference_modules.register_solely_specific_removal_module_predicate($$myCreationPurpose);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$myCreationPurpose);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreationPurpose);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_CHECK_POS, $list23);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG, $list25);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2, $list27);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1, $list29);
            inference_modules.register_solely_specific_removal_module_predicate($$myCreationSecond);
            preference_modules.doomed_unless_arg_bindable($POS, $$myCreationSecond, ONE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreationSecond);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_CHECK_POS, $list32);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_CHECK_NEG, $list34);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2, $list36);
            inference_modules.register_solely_specific_removal_module_predicate($$myCreationDate);
            preference_modules.doomed_unless_arg_bindable($POS, $$myCreationDate, ONE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreationDate);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_CHECK_POS, $list39);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_CHECK_NEG, $list42);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_UNIFY_ARG2, $list44);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_CHECK_POS, $list_alt5);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_CHECK_NEG, $list_alt7);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_UNIFY_ARG2, $list_alt9);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_UNIFY_ARG1, $list_alt11);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_CHECK_POS, $list_alt14);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_CHECK_NEG, $list_alt16);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_UNIFY_ARG2, $list_alt18);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_CHECK_POS, $list_alt21);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG, $list_alt23);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2, $list_alt25);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1, $list_alt27);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_CHECK_POS, $list_alt30);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_CHECK_NEG, $list_alt32);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2, $list_alt34);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_CHECK_POS, $list_alt37);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_CHECK_NEG, $list_alt40);
            inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_UNIFY_ARG2, $list_alt42);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_bookkeeping_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$myCreator);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$myCreator);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreator);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_CHECK_POS, $list7);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_CHECK_NEG, $list9);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_UNIFY_ARG2, $list11);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATOR_UNIFY_ARG1, $list13);
        inference_modules.register_solely_specific_removal_module_predicate($$myCreationTime);
        preference_modules.doomed_unless_arg_bindable($POS, $$myCreationTime, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreationTime);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_CHECK_POS, $list16);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_CHECK_NEG, $list18);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_TIME_UNIFY_ARG2, $list20);
        inference_modules.register_solely_specific_removal_module_predicate($$myCreationPurpose);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$myCreationPurpose);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreationPurpose);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_CHECK_POS, $list23);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG, $list25);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2, $list27);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1, $list29);
        inference_modules.register_solely_specific_removal_module_predicate($$myCreationSecond);
        preference_modules.doomed_unless_arg_bindable($POS, $$myCreationSecond, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreationSecond);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_CHECK_POS, $list32);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_CHECK_NEG, $list34);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2, $list36);
        inference_modules.register_solely_specific_removal_module_predicate($$myCreationDate);
        preference_modules.doomed_unless_arg_bindable($POS, $$myCreationDate, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$myCreationDate);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_CHECK_POS, $list39);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_CHECK_NEG, $list42);
        inference_modules.inference_removal_module($REMOVAL_MY_CREATION_DATE_UNIFY_ARG2, $list44);
        return NIL;
    }

    static private final SubLList $list_alt30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationSecond"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationSecond"), $FORT, list($TEST, makeSymbol("UNIVERSAL-SECOND-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <universal-second-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor 162525)") });

    static private final SubLList $list_alt32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationSecond"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationSecond"), $FORT, list($TEST, makeSymbol("UNIVERSAL-SECOND-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationSecond <fort-p> <universal-second-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationSecond #$MauveColor 212))") });

    static private final SubLList $list_alt34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationSecond"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationSecond"), $FORT, makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor ?WHEN)") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_bookkeeping_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_bookkeeping_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_bookkeeping_file();
    }

    static {
    }

    static private final SubLList $list_alt37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationDate"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationDate"), $FORT, list($TEST, makeSymbol("DATE-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationDate <fort-p> <date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001)))))))") });

    static private final SubLList $list_alt40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationDate"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationDate"), $FORT, list($TEST, makeSymbol("DATE-P"))), $COST, makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationDate <fort-p> <date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationDate #$Dog (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001))))))))") });

    static private final SubLList $list_alt42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("myCreationDate"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("myCreationDate"), $FORT, makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationDate <fort-p> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini ?WHEN)") });
}

/**
 * Total time: 162 ms
 */
