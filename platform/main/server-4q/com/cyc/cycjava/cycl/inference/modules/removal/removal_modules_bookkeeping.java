package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_bookkeeping extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_bookkeeping();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping";

    public static final String myFingerPrint = "96048f2e20e82611ed9d099eddc09f88c7e1a057ed9124e68ea54ba98ed13404";

    // deflexical
    // Definitions
    private static final SubLSymbol $bookkeeping_check_default_cost$ = makeSymbol("*BOOKKEEPING-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creator_check_default_cost$ = makeSymbol("*MY-CREATOR-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creator_unify_arg2_default_cost$ = makeSymbol("*MY-CREATOR-UNIFY-ARG2-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creation_time_check_default_cost$ = makeSymbol("*MY-CREATION-TIME-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creation_time_unify_arg2_default_cost$ = makeSymbol("*MY-CREATION-TIME-UNIFY-ARG2-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creation_purpose_check_default_cost$ = makeSymbol("*MY-CREATION-PURPOSE-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creation_purpose_unify_arg2_default_cost$ = makeSymbol("*MY-CREATION-PURPOSE-UNIFY-ARG2-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creation_second_check_default_cost$ = makeSymbol("*MY-CREATION-SECOND-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creation_second_unify_arg2_default_cost$ = makeSymbol("*MY-CREATION-SECOND-UNIFY-ARG2-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creation_date_check_default_cost$ = makeSymbol("*MY-CREATION-DATE-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $my_creation_date_unify_arg2_default_cost$ = makeSymbol("*MY-CREATION-DATE-UNIFY-ARG2-DEFAULT-COST*");



    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));



    private static final SubLObject $$myCreator = reader_make_constant_shell(makeString("myCreator"));





    private static final SubLSymbol $REMOVAL_MY_CREATOR_CHECK_POS = makeKeyword("REMOVAL-MY-CREATOR-CHECK-POS");

    public static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreator")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <fort-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator #$Dog #$Guzman)") });

    private static final SubLSymbol $REMOVAL_MY_CREATOR_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATOR-CHECK-NEG");

    public static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreator")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreator <fort-p> <fort-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreator #$Dog #$Muffet))") });

    private static final SubLSymbol $REMOVAL_MY_CREATOR_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG2");

    public static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreator")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator #$Dog ?WHO)") });

    private static final SubLSymbol $REMOVAL_MY_CREATOR_UNIFY_ARG1 = makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG1");

    private static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreator")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <not-fully-bound-p> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator ?WHAT #$Guzman)") });

    private static final SubLObject $$myCreationTime = reader_make_constant_shell(makeString("myCreationTime"));

    private static final SubLSymbol $REMOVAL_MY_CREATION_TIME_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-POS");

    public static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P"))), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationTime <fort-p> <universal-date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog 19871011)") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_TIME_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-NEG");

    public static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P"))), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationTime <fort-p> <universal-date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationTime #$Dog 19770717))") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_TIME_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2");

    private static final SubLList $list20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("FORT"), makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationTime <fort-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog ?WHEN)") });

    private static final SubLObject $$myCreationPurpose = reader_make_constant_shell(makeString("myCreationPurpose"));

    private static final SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS");

    public static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <fort-p> <fort-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew #$GeneralCycKE)") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG");

    public static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationPurpose <fort-p> <fort-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationPurpose #$BritneySpears #$GeneralCycKE))") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2");

    public static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <fort-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew ?WHY)") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1 = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1");

    private static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <not-fully-bound-p> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose ?WHAT #$GeneralCycKE)") });

    private static final SubLObject $$myCreationSecond = reader_make_constant_shell(makeString("myCreationSecond"));

    private static final SubLSymbol $REMOVAL_MY_CREATION_SECOND_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-POS");

    public static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-SECOND-P"))), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <universal-second-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor 162525)") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_SECOND_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-NEG");

    public static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-SECOND-P"))), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationSecond <fort-p> <universal-second-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationSecond #$MauveColor 212))") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2");

    private static final SubLList $list36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("FORT"), makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor ?WHEN)") });

    private static final SubLObject $$myCreationDate = reader_make_constant_shell(makeString("myCreationDate"));

    private static final SubLSymbol $REMOVAL_MY_CREATION_DATE_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-POS");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationDate")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("DATE-P"))), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationDate <fort-p> <date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001)))))))") });

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLSymbol $REMOVAL_MY_CREATION_DATE_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-NEG");

    public static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationDate")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("DATE-P"))), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationDate <fort-p> <date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationDate #$Dog (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001))))))))") });

    private static final SubLSymbol $REMOVAL_MY_CREATION_DATE_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2");

    private static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("myCreationDate")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationDate <fort-p> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini ?WHEN)") });

    public static SubLObject make_bookkeeping_hl_support(final SubLObject asent) {
        return arguments.make_hl_support($BOOKKEEPING, asent, $$BookkeepingMt, $TRUE_MON);
    }

    public static SubLObject removal_my_creator_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creator_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static SubLObject my_creator_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creator(arg1, UNPROVIDED);
    }

    public static SubLObject make_my_creator_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    public static SubLObject removal_my_creator_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creator_check_cost(asent);
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

    public static SubLObject removal_my_creator_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creator_check_cost(asent);
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

    public static SubLObject removal_my_creator_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creator_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
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

    public static SubLObject removal_my_creator_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_by(cycl_utilities.sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
        }
        return ZERO_INTEGER;
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

    public static SubLObject removal_my_creation_time_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_time_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static SubLObject my_creation_time_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creation_time(arg1, UNPROVIDED);
    }

    public static SubLObject make_my_creation_time_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    public static SubLObject removal_my_creation_time_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_time_check_cost(asent);
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

    public static SubLObject removal_my_creation_time_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_time_check_cost(asent);
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

    public static SubLObject removal_my_creation_time_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_time_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
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

    public static SubLObject removal_my_creation_purpose_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_purpose_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static SubLObject my_creation_purpose_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creation_purpose(arg1, UNPROVIDED);
    }

    public static SubLObject make_my_creation_purpose_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    public static SubLObject removal_my_creation_purpose_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_purpose_check_cost(asent);
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

    public static SubLObject removal_my_creation_purpose_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_purpose_check_cost(asent);
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

    public static SubLObject removal_my_creation_purpose_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_purpose_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
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

    public static SubLObject removal_my_creation_purpose_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_for(cycl_utilities.sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
        }
        return ZERO_INTEGER;
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

    public static SubLObject removal_my_creation_second_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_second_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    public static SubLObject my_creation_second_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creation_second(arg1, UNPROVIDED);
    }

    public static SubLObject make_my_creation_second_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    public static SubLObject removal_my_creation_second_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_second_check_cost(asent);
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

    public static SubLObject removal_my_creation_second_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_second_check_cost(asent);
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

    public static SubLObject removal_my_creation_second_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_second_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
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

    public static SubLObject removal_my_creation_date_check_cost(final SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_date_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
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

    public static SubLObject removal_my_creation_date_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_date_check_cost(asent);
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

    public static SubLObject removal_my_creation_date_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_date_check_cost(asent);
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

    public static SubLObject removal_my_creation_date_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_date_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
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

    public static SubLObject declare_removal_modules_bookkeeping_file() {
        declareFunction(me, "make_bookkeeping_hl_support", "MAKE-BOOKKEEPING-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_my_creator_check_cost", "REMOVAL-MY-CREATOR-CHECK-COST", 1, 0, false);
        declareFunction(me, "my_creator_arg2_lookup", "MY-CREATOR-ARG2-LOOKUP", 1, 0, false);
        declareFunction(me, "make_my_creator_hl_support", "MAKE-MY-CREATOR-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_my_creator_check_pos_cost", "REMOVAL-MY-CREATOR-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_my_creator_check_pos_expand", "REMOVAL-MY-CREATOR-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creator_check_neg_cost", "REMOVAL-MY-CREATOR-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_my_creator_check_neg_expand", "REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creator_unify_arg2_cost", "REMOVAL-MY-CREATOR-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_my_creator_unify_arg2_expand", "REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creator_unify_arg1_cost", "REMOVAL-MY-CREATOR-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction(me, "removal_my_creator_unify_arg1_expand", "REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_time_check_cost", "REMOVAL-MY-CREATION-TIME-CHECK-COST", 1, 0, false);
        declareFunction(me, "my_creation_time_arg2_lookup", "MY-CREATION-TIME-ARG2-LOOKUP", 1, 0, false);
        declareFunction(me, "make_my_creation_time_hl_support", "MAKE-MY-CREATION-TIME-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_my_creation_time_check_pos_cost", "REMOVAL-MY-CREATION-TIME-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_time_check_pos_expand", "REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_time_check_neg_cost", "REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_time_check_neg_expand", "REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_time_unify_arg2_cost", "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_time_unify_arg2_expand", "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_purpose_check_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-COST", 1, 0, false);
        declareFunction(me, "my_creation_purpose_arg2_lookup", "MY-CREATION-PURPOSE-ARG2-LOOKUP", 1, 0, false);
        declareFunction(me, "make_my_creation_purpose_hl_support", "MAKE-MY-CREATION-PURPOSE-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_my_creation_purpose_check_pos_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_purpose_check_pos_expand", "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_purpose_check_neg_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_purpose_check_neg_expand", "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_purpose_unify_arg2_cost", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_purpose_unify_arg2_expand", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_purpose_unify_arg1_cost", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_purpose_unify_arg1_expand", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_second_check_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-COST", 1, 0, false);
        declareFunction(me, "my_creation_second_arg2_lookup", "MY-CREATION-SECOND-ARG2-LOOKUP", 1, 0, false);
        declareFunction(me, "make_my_creation_second_hl_support", "MAKE-MY-CREATION-SECOND-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_my_creation_second_check_pos_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_second_check_pos_expand", "REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_second_check_neg_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_second_check_neg_expand", "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_second_unify_arg2_cost", "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_second_unify_arg2_expand", "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_date_check_cost", "REMOVAL-MY-CREATION-DATE-CHECK-COST", 1, 0, false);
        declareFunction(me, "my_creation_date_arg2_lookup", "MY-CREATION-DATE-ARG2-LOOKUP", 1, 0, false);
        declareFunction(me, "removal_my_creation_date_check_pos_cost", "REMOVAL-MY-CREATION-DATE-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_date_check_pos_expand", "REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_date_check_neg_cost", "REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_date_check_neg_expand", "REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_my_creation_date_unify_arg2_cost", "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_my_creation_date_unify_arg2_expand", "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND", 1, 1, false);
        return NIL;
    }

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

    public static SubLObject setup_removal_modules_bookkeeping_file() {
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

    
}

/**
 * Total time: 162 ms
 */
