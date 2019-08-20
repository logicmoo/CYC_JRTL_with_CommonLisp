package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.control_vars;
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

public class removal_modules_bookkeeping extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "96048f2e20e82611ed9d099eddc09f88c7e1a057ed9124e68ea54ba98ed13404";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 800L)
    private static SubLSymbol $bookkeeping_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2000L)
    private static SubLSymbol $my_creator_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 4400L)
    private static SubLSymbol $my_creator_unify_arg2_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7300L)
    private static SubLSymbol $my_creation_time_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 10000L)
    private static SubLSymbol $my_creation_time_unify_arg2_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 11800L)
    private static SubLSymbol $my_creation_purpose_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 14500L)
    private static SubLSymbol $my_creation_purpose_unify_arg2_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 17700L)
    private static SubLSymbol $my_creation_second_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 20400L)
    private static SubLSymbol $my_creation_second_unify_arg2_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    private static SubLSymbol $my_creation_date_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    private static SubLSymbol $my_creation_date_unify_arg2_default_cost$;
    private static SubLSymbol $BOOKKEEPING;
    private static SubLObject $$BookkeepingMt;
    private static SubLSymbol $TRUE_MON;
    private static SubLObject $$myCreator;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_MY_CREATOR_CHECK_POS;
    private static SubLList $list7;
    private static SubLSymbol $REMOVAL_MY_CREATOR_CHECK_NEG;
    private static SubLList $list9;
    private static SubLSymbol $REMOVAL_MY_CREATOR_UNIFY_ARG2;
    private static SubLList $list11;
    private static SubLSymbol $REMOVAL_MY_CREATOR_UNIFY_ARG1;
    private static SubLList $list13;
    private static SubLObject $$myCreationTime;
    private static SubLSymbol $REMOVAL_MY_CREATION_TIME_CHECK_POS;
    private static SubLList $list16;
    private static SubLSymbol $REMOVAL_MY_CREATION_TIME_CHECK_NEG;
    private static SubLList $list18;
    private static SubLSymbol $REMOVAL_MY_CREATION_TIME_UNIFY_ARG2;
    private static SubLList $list20;
    private static SubLObject $$myCreationPurpose;
    private static SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_CHECK_POS;
    private static SubLList $list23;
    private static SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG;
    private static SubLList $list25;
    private static SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2;
    private static SubLList $list27;
    private static SubLSymbol $REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1;
    private static SubLList $list29;
    private static SubLObject $$myCreationSecond;
    private static SubLSymbol $REMOVAL_MY_CREATION_SECOND_CHECK_POS;
    private static SubLList $list32;
    private static SubLSymbol $REMOVAL_MY_CREATION_SECOND_CHECK_NEG;
    private static SubLList $list34;
    private static SubLSymbol $REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2;
    private static SubLList $list36;
    private static SubLObject $$myCreationDate;
    private static SubLSymbol $REMOVAL_MY_CREATION_DATE_CHECK_POS;
    private static SubLList $list39;
    private static SubLObject $$not;
    private static SubLSymbol $REMOVAL_MY_CREATION_DATE_CHECK_NEG;
    private static SubLList $list42;
    private static SubLSymbol $REMOVAL_MY_CREATION_DATE_UNIFY_ARG2;
    private static SubLList $list44;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 1500L)
    public static SubLObject make_bookkeeping_hl_support(SubLObject asent) {
        return arguments.make_hl_support($BOOKKEEPING, asent, $$BookkeepingMt, $TRUE_MON);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2100L)
    public static SubLObject removal_my_creator_check_cost(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creator_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2200L)
    public static SubLObject my_creator_arg2_lookup(SubLObject arg1) {
        return bookkeeping_store.creator(arg1, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2300L)
    public static SubLObject make_my_creator_hl_support(SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2400L)
    public static SubLObject removal_my_creator_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creator_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2600L)
    public static SubLObject removal_my_creator_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creator_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creator_hl_support(asent), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 3400L)
    public static SubLObject removal_my_creator_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creator_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 3600L)
    public static SubLObject removal_my_creator_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creator_arg2_lookup(asent_arg1);
            if (NIL != lookup_arg2 && !asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creator_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 4500L)
    public static SubLObject removal_my_creator_unify_arg2_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creator_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 4800L)
    public static SubLObject removal_my_creator_unify_arg2_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject cyclist = my_creator_arg2_lookup(arg1);
            if (NIL != cyclist) {
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.term_unify(cyclist, arg2, T, T);
                SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creator_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 5800L)
    public static SubLObject removal_my_creator_unify_arg1_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_by(cycl_utilities.sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 6000L)
    public static SubLObject removal_my_creator_unify_arg1_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject terms = bookkeeping_store.terms_created_by(arg2, UNPROVIDED);
            if (NIL != terms) {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    SubLObject v_bindings = unification_utilities.term_unify(v_term, arg1, T, T);
                    SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                        backward.removal_add_node(make_my_creator_hl_support(ground_asent), v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7500L)
    public static SubLObject removal_my_creation_time_check_cost(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_time_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7600L)
    public static SubLObject my_creation_time_arg2_lookup(SubLObject arg1) {
        return bookkeeping_store.creation_time(arg1, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7700L)
    public static SubLObject make_my_creation_time_hl_support(SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7800L)
    public static SubLObject removal_my_creation_time_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_time_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 8000L)
    public static SubLObject removal_my_creation_time_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creation_time_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_time_hl_support(asent), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 8900L)
    public static SubLObject removal_my_creation_time_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_time_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 9100L)
    public static SubLObject removal_my_creation_time_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creation_time_arg2_lookup(asent_arg1);
            if (NIL != lookup_arg2 && !asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_time_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 10100L)
    public static SubLObject removal_my_creation_time_unify_arg2_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_time_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 10400L)
    public static SubLObject removal_my_creation_time_unify_arg2_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject variable = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject arg2 = my_creation_time_arg2_lookup(arg1);
            if (NIL != arg2) {
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, T, T);
                SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creation_time_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 11900L)
    public static SubLObject removal_my_creation_purpose_check_cost(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_purpose_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12100L)
    public static SubLObject my_creation_purpose_arg2_lookup(SubLObject arg1) {
        return bookkeeping_store.creation_purpose(arg1, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12200L)
    public static SubLObject make_my_creation_purpose_hl_support(SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12300L)
    public static SubLObject removal_my_creation_purpose_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_purpose_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12500L)
    public static SubLObject removal_my_creation_purpose_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creation_purpose_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_purpose_hl_support(asent), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 13400L)
    public static SubLObject removal_my_creation_purpose_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_purpose_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 13500L)
    public static SubLObject removal_my_creation_purpose_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creation_purpose_arg2_lookup(asent_arg1);
            if (NIL != lookup_arg2 && !asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_purpose_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 14600L)
    public static SubLObject removal_my_creation_purpose_unify_arg2_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_purpose_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 14900L)
    public static SubLObject removal_my_creation_purpose_unify_arg2_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject not_fully_bound = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject arg2 = my_creation_purpose_arg2_lookup(arg1);
            if (NIL != arg2) {
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.term_unify(arg2, not_fully_bound, T, T);
                SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creation_purpose_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 16000L)
    public static SubLObject removal_my_creation_purpose_unify_arg1_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_for(cycl_utilities.sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 16200L)
    public static SubLObject removal_my_creation_purpose_unify_arg1_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject terms = bookkeeping_store.terms_created_for(arg2, UNPROVIDED);
            if (NIL != terms) {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    SubLObject v_bindings = unification_utilities.term_unify(v_term, arg1, T, T);
                    SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                        backward.removal_add_node(make_my_creation_purpose_hl_support(ground_asent), v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 17800L)
    public static SubLObject removal_my_creation_second_check_cost(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_second_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18000L)
    public static SubLObject my_creation_second_arg2_lookup(SubLObject arg1) {
        return bookkeeping_store.creation_second(arg1, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18100L)
    public static SubLObject make_my_creation_second_hl_support(SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18200L)
    public static SubLObject removal_my_creation_second_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_second_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18400L)
    public static SubLObject removal_my_creation_second_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creation_second_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_second_hl_support(asent), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 19300L)
    public static SubLObject removal_my_creation_second_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_second_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 19400L)
    public static SubLObject removal_my_creation_second_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creation_second_arg2_lookup(asent_arg1);
            if (NIL != lookup_arg2 && !asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_second_hl_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 20500L)
    public static SubLObject removal_my_creation_second_unify_arg2_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_second_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 20800L)
    public static SubLObject removal_my_creation_second_unify_arg2_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject variable = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject arg2 = my_creation_second_arg2_lookup(arg1);
            if (NIL != arg2) {
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, T, T);
                SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creation_second_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    public static SubLObject removal_my_creation_date_check_cost(SubLObject asent) {
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_date_check_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    public static SubLObject my_creation_date_arg2_lookup(SubLObject arg1) {
        SubLObject date = bookkeeping_store.creation_time(arg1, UNPROVIDED);
        SubLObject second = bookkeeping_store.creation_second(arg1, UNPROVIDED);
        if (NIL == date) {
            return NIL;
        }
        if (NIL == second) {
            return date_utilities.universal_date_to_cycl_date(date);
        }
        SubLObject time = numeric_date_utilities.universal_time_from_date_and_second(date, second);
        return date_utilities.universal_time_to_cycl_date(time);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    public static SubLObject removal_my_creation_date_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_date_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    public static SubLObject removal_my_creation_date_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creation_date_arg2_lookup(asent_arg1);
            if (asent_arg2.equal(lookup_arg2)) {
                SubLObject time = my_creation_time_arg2_lookup(asent_arg1);
                SubLObject second = my_creation_second_arg2_lookup(asent_arg1);
                backward.removal_add_node(make_my_creation_time_hl_support(list($$myCreationTime, asent_arg1, time)), NIL, (NIL != second) ? list(make_my_creation_second_hl_support(list($$myCreationSecond, asent_arg1, second))) : NIL);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    public static SubLObject removal_my_creation_date_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_my_creation_date_check_cost(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    public static SubLObject removal_my_creation_date_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject lookup_arg2 = my_creation_date_arg2_lookup(asent_arg1);
            if (NIL != lookup_arg2 && !asent_arg2.equal(lookup_arg2)) {
                SubLObject actual_date = my_creation_time_arg2_lookup(asent_arg1);
                SubLObject actual_second = my_creation_second_arg2_lookup(asent_arg1);
                SubLObject queried_date = date_utilities.cycl_date_to_universal_date(asent_arg2);
                SubLObject queried_second = date_utilities.cycl_date_to_universal_second(asent_arg2);
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    public static SubLObject removal_my_creation_date_unify_arg2_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            return $my_creation_date_unify_arg2_default_cost$.getGlobalValue();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21900L)
    public static SubLObject removal_my_creation_date_unify_arg2_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_relevance_macros.relevant_mtP($$BookkeepingMt)) {
            SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            SubLObject variable = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
            SubLObject arg2 = my_creation_date_arg2_lookup(arg1);
            if (NIL != arg2) {
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, T, T);
                SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    SubLObject time = my_creation_time_arg2_lookup(arg1);
                    SubLObject second = my_creation_second_arg2_lookup(arg1);
                    SubLObject second_just = (NIL != second) ? list(make_my_creation_second_hl_support(list($$myCreationSecond, arg1, second))) : NIL;
                    SubLObject support = make_my_creation_time_hl_support(list($$myCreationTime, arg1, time));
                    SubLObject more_supports = append(unify_justification, second_just);
                    backward.removal_add_node(support, v_bindings, more_supports);
                }
            }
        }
        return NIL;
    }

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

    public static SubLObject init_removal_modules_bookkeeping_file() {
        $bookkeeping_check_default_cost$ = deflexical("*BOOKKEEPING-CHECK-DEFAULT-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $my_creator_check_default_cost$ = deflexical("*MY-CREATOR-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        $my_creator_unify_arg2_default_cost$ = deflexical("*MY-CREATOR-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        $my_creation_time_check_default_cost$ = deflexical("*MY-CREATION-TIME-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        $my_creation_time_unify_arg2_default_cost$ = deflexical("*MY-CREATION-TIME-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        $my_creation_purpose_check_default_cost$ = deflexical("*MY-CREATION-PURPOSE-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        $my_creation_purpose_unify_arg2_default_cost$ = deflexical("*MY-CREATION-PURPOSE-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        $my_creation_second_check_default_cost$ = deflexical("*MY-CREATION-SECOND-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        $my_creation_second_unify_arg2_default_cost$ = deflexical("*MY-CREATION-SECOND-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        $my_creation_date_check_default_cost$ = deflexical("*MY-CREATION-DATE-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
        $my_creation_date_unify_arg2_default_cost$ = deflexical("*MY-CREATION-DATE-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue());
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

    static {
        me = new removal_modules_bookkeeping();
        $bookkeeping_check_default_cost$ = null;
        $my_creator_check_default_cost$ = null;
        $my_creator_unify_arg2_default_cost$ = null;
        $my_creation_time_check_default_cost$ = null;
        $my_creation_time_unify_arg2_default_cost$ = null;
        $my_creation_purpose_check_default_cost$ = null;
        $my_creation_purpose_unify_arg2_default_cost$ = null;
        $my_creation_second_check_default_cost$ = null;
        $my_creation_second_unify_arg2_default_cost$ = null;
        $my_creation_date_check_default_cost$ = null;
        $my_creation_date_unify_arg2_default_cost$ = null;
        $BOOKKEEPING = makeKeyword("BOOKKEEPING");
        $$BookkeepingMt = makeConstSym(("BookkeepingMt"));
        $TRUE_MON = makeKeyword("TRUE-MON");
        $$myCreator = makeConstSym(("myCreator"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $REMOVAL_MY_CREATOR_CHECK_POS = makeKeyword("REMOVAL-MY-CREATOR-CHECK-POS");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreator")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreator")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <fort-p>)"), makeKeyword("EXAMPLE"),
                makeString("(#$myCreator #$Dog #$Guzman)") });
        $REMOVAL_MY_CREATOR_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATOR-CHECK-NEG");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("myCreator")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreator")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreator <fort-p> <fort-p>))"),
                makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreator #$Dog #$Muffet))") });
        $REMOVAL_MY_CREATOR_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG2");
        $list11 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreator")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreator")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <not-fully-bound-p>)"),
                makeKeyword("EXAMPLE"), makeString("(#$myCreator #$Dog ?WHO)") });
        $REMOVAL_MY_CREATOR_UNIFY_ARG1 = makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG1");
        $list13 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreator")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreator")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <not-fully-bound-p> <fort>)"),
                makeKeyword("EXAMPLE"), makeString("(#$myCreator ?WHAT #$Guzman)") });
        $$myCreationTime = makeConstSym(("myCreationTime"));
        $REMOVAL_MY_CREATION_TIME_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-POS");
        $list16 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreationTime")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationTime")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$myCreationTime <fort-p> <universal-date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog 19871011)") });
        $REMOVAL_MY_CREATION_TIME_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-NEG");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("myCreationTime")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationTime")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$myCreationTime <fort-p> <universal-date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationTime #$Dog 19770717))") });
        $REMOVAL_MY_CREATION_TIME_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2");
        $list20 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreationTime")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationTime")), makeKeyword("FORT"), makeKeyword("VARIABLE")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationTime <fort-p> <variable-p>)"),
                makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog ?WHEN)") });
        $$myCreationPurpose = makeConstSym(("myCreationPurpose"));
        $REMOVAL_MY_CREATION_PURPOSE_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS");
        $list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationPurpose")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <fort-p> <fort-p>)"),
                makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew #$GeneralCycKE)") });
        $REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG");
        $list25 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationPurpose")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$myCreationPurpose <fort-p> <fort-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationPurpose #$BritneySpears #$GeneralCycKE))") });
        $REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2");
        $list27 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationPurpose")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$myCreationPurpose <fort-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew ?WHY)") });
        $REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1 = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1");
        $list29 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationPurpose")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$myCreationPurpose <not-fully-bound-p> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose ?WHAT #$GeneralCycKE)") });
        $$myCreationSecond = makeConstSym(("myCreationSecond"));
        $REMOVAL_MY_CREATION_SECOND_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-POS");
        $list32 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreationSecond")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("myCreationSecond")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-SECOND-P"))), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <universal-second-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor 162525)") });
        $REMOVAL_MY_CREATION_SECOND_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-NEG");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("myCreationSecond")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("myCreationSecond")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-SECOND-P"))), makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationSecond <fort-p> <universal-second-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationSecond #$MauveColor 212))") });
        $REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2");
        $list36 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreationSecond")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationSecond")), makeKeyword("FORT"), makeKeyword("VARIABLE")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <variable-p>)"),
                makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor ?WHEN)") });
        $$myCreationDate = makeConstSym(("myCreationDate"));
        $REMOVAL_MY_CREATION_DATE_CHECK_POS = makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-POS");
        $list39 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreationDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationDate")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("DATE-P"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$myCreationDate <fort-p> <date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001)))))))") });
        $$not = makeConstSym(("not"));
        $REMOVAL_MY_CREATION_DATE_CHECK_NEG = makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-NEG");
        $list42 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("myCreationDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationDate")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("DATE-P"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$myCreationDate <fort-p> <date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationDate #$Dog (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001))))))))") });
        $REMOVAL_MY_CREATION_DATE_UNIFY_ARG2 = makeKeyword("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2");
        $list44 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("myCreationDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("myCreationDate")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationDate <fort-p> <not-fully-bound>)"),
                makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini ?WHEN)") });
    }
}
/*
 *
 * Total time: 162 ms
 *
 */