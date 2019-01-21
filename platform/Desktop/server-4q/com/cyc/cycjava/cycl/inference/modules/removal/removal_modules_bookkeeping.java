package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_bookkeeping extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping";
    public static final String myFingerPrint = "96048f2e20e82611ed9d099eddc09f88c7e1a057ed9124e68ea54ba98ed13404";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 884L)
    private static SubLSymbol $bookkeeping_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2013L)
    private static SubLSymbol $my_creator_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 4447L)
    private static SubLSymbol $my_creator_unify_arg2_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7377L)
    private static SubLSymbol $my_creation_time_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 10039L)
    private static SubLSymbol $my_creation_time_unify_arg2_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 11824L)
    private static SubLSymbol $my_creation_purpose_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 14544L)
    private static SubLSymbol $my_creation_purpose_unify_arg2_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 17705L)
    private static SubLSymbol $my_creation_second_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 20444L)
    private static SubLSymbol $my_creation_second_unify_arg2_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    private static SubLSymbol $my_creation_date_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    private static SubLSymbol $my_creation_date_unify_arg2_default_cost$;
    private static final SubLSymbol $kw0$BOOKKEEPING;
    private static final SubLObject $const1$BookkeepingMt;
    private static final SubLSymbol $kw2$TRUE_MON;
    private static final SubLObject $const3$myCreator;
    private static final SubLSymbol $kw4$POS;
    private static final SubLSymbol $kw5$NEG;
    private static final SubLSymbol $kw6$REMOVAL_MY_CREATOR_CHECK_POS;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$REMOVAL_MY_CREATOR_CHECK_NEG;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$REMOVAL_MY_CREATOR_UNIFY_ARG2;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$REMOVAL_MY_CREATOR_UNIFY_ARG1;
    private static final SubLList $list13;
    private static final SubLObject $const14$myCreationTime;
    private static final SubLSymbol $kw15$REMOVAL_MY_CREATION_TIME_CHECK_POS;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$REMOVAL_MY_CREATION_TIME_CHECK_NEG;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$REMOVAL_MY_CREATION_TIME_UNIFY_ARG2;
    private static final SubLList $list20;
    private static final SubLObject $const21$myCreationPurpose;
    private static final SubLSymbol $kw22$REMOVAL_MY_CREATION_PURPOSE_CHECK_POS;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1;
    private static final SubLList $list29;
    private static final SubLObject $const30$myCreationSecond;
    private static final SubLSymbol $kw31$REMOVAL_MY_CREATION_SECOND_CHECK_POS;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$REMOVAL_MY_CREATION_SECOND_CHECK_NEG;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2;
    private static final SubLList $list36;
    private static final SubLObject $const37$myCreationDate;
    private static final SubLSymbol $kw38$REMOVAL_MY_CREATION_DATE_CHECK_POS;
    private static final SubLList $list39;
    private static final SubLObject $const40$not;
    private static final SubLSymbol $kw41$REMOVAL_MY_CREATION_DATE_CHECK_NEG;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$REMOVAL_MY_CREATION_DATE_UNIFY_ARG2;
    private static final SubLList $list44;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 1539L)
    public static SubLObject make_bookkeeping_hl_support(final SubLObject asent) {
        return arguments.make_hl_support((SubLObject)removal_modules_bookkeeping.$kw0$BOOKKEEPING, asent, removal_modules_bookkeeping.$const1$BookkeepingMt, (SubLObject)removal_modules_bookkeeping.$kw2$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2126L)
    public static SubLObject removal_my_creator_check_cost(final SubLObject asent) {
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creator_check_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2298L)
    public static SubLObject my_creator_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creator(arg1, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2369L)
    public static SubLObject make_my_creator_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2466L)
    public static SubLObject removal_my_creator_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creator_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2657L)
    public static SubLObject removal_my_creator_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creator_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creator_hl_support(asent), (SubLObject)removal_modules_bookkeeping.UNPROVIDED, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 3448L)
    public static SubLObject removal_my_creator_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creator_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 3601L)
    public static SubLObject removal_my_creator_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creator_arg2_lookup(asent_arg1);
            if (removal_modules_bookkeeping.NIL != lookup_arg2 && !asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creator_hl_support(cycl_utilities.negate(asent)), (SubLObject)removal_modules_bookkeeping.UNPROVIDED, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 4558L)
    public static SubLObject removal_my_creator_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creator_unify_arg2_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 4819L)
    public static SubLObject removal_my_creator_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject cyclist = my_creator_arg2_lookup(arg1);
            if (removal_modules_bookkeeping.NIL != cyclist) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(cyclist, arg2, (SubLObject)removal_modules_bookkeeping.T, (SubLObject)removal_modules_bookkeeping.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_bookkeeping.NIL != v_bindings) {
                    final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creator_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 5820L)
    public static SubLObject removal_my_creator_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_by(cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED), (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 6041L)
    public static SubLObject removal_my_creator_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject terms = bookkeeping_store.terms_created_by(arg2, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            if (removal_modules_bookkeeping.NIL != terms) {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = (SubLObject)removal_modules_bookkeeping.NIL;
                v_term = cdolist_list_var.first();
                while (removal_modules_bookkeeping.NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.term_unify(v_term, arg1, (SubLObject)removal_modules_bookkeeping.T, (SubLObject)removal_modules_bookkeeping.T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_bookkeeping.NIL != v_bindings) {
                        final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                        backward.removal_add_node(make_my_creator_hl_support(ground_asent), v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7501L)
    public static SubLObject removal_my_creation_time_check_cost(final SubLObject asent) {
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creation_time_check_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7685L)
    public static SubLObject my_creation_time_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creation_time(arg1, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7768L)
    public static SubLObject make_my_creation_time_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7871L)
    public static SubLObject removal_my_creation_time_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creation_time_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 8074L)
    public static SubLObject removal_my_creation_time_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_time_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_time_hl_support(asent), (SubLObject)removal_modules_bookkeeping.UNPROVIDED, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 8946L)
    public static SubLObject removal_my_creation_time_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creation_time_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 9111L)
    public static SubLObject removal_my_creation_time_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_time_arg2_lookup(asent_arg1);
            if (removal_modules_bookkeeping.NIL != lookup_arg2 && !asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_time_hl_support(cycl_utilities.negate(asent)), (SubLObject)removal_modules_bookkeeping.UNPROVIDED, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 10156L)
    public static SubLObject removal_my_creation_time_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creation_time_unify_arg2_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 10429L)
    public static SubLObject removal_my_creation_time_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject variable = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject arg2 = my_creation_time_arg2_lookup(arg1);
            if (removal_modules_bookkeeping.NIL != arg2) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, (SubLObject)removal_modules_bookkeeping.T, (SubLObject)removal_modules_bookkeeping.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_bookkeeping.NIL != v_bindings) {
                    final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creation_time_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 11954L)
    public static SubLObject removal_my_creation_purpose_check_cost(final SubLObject asent) {
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creation_purpose_check_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12144L)
    public static SubLObject my_creation_purpose_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creation_purpose(arg1, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12233L)
    public static SubLObject make_my_creation_purpose_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12339L)
    public static SubLObject removal_my_creation_purpose_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creation_purpose_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12548L)
    public static SubLObject removal_my_creation_purpose_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_purpose_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_purpose_hl_support(asent), (SubLObject)removal_modules_bookkeeping.UNPROVIDED, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 13428L)
    public static SubLObject removal_my_creation_purpose_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creation_purpose_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 13599L)
    public static SubLObject removal_my_creation_purpose_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_purpose_arg2_lookup(asent_arg1);
            if (removal_modules_bookkeeping.NIL != lookup_arg2 && !asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_purpose_hl_support(cycl_utilities.negate(asent)), (SubLObject)removal_modules_bookkeeping.UNPROVIDED, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 14664L)
    public static SubLObject removal_my_creation_purpose_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creation_purpose_unify_arg2_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 14943L)
    public static SubLObject removal_my_creation_purpose_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject not_fully_bound = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject arg2 = my_creation_purpose_arg2_lookup(arg1);
            if (removal_modules_bookkeeping.NIL != arg2) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, not_fully_bound, (SubLObject)removal_modules_bookkeeping.T, (SubLObject)removal_modules_bookkeeping.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_bookkeeping.NIL != v_bindings) {
                    final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creation_purpose_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 16045L)
    public static SubLObject removal_my_creation_purpose_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return bookkeeping_store.num_terms_created_for(cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED), (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 16276L)
    public static SubLObject removal_my_creation_purpose_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject terms = bookkeeping_store.terms_created_for(arg2, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            if (removal_modules_bookkeeping.NIL != terms) {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = (SubLObject)removal_modules_bookkeeping.NIL;
                v_term = cdolist_list_var.first();
                while (removal_modules_bookkeeping.NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.term_unify(v_term, arg1, (SubLObject)removal_modules_bookkeeping.T, (SubLObject)removal_modules_bookkeeping.T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_bookkeeping.NIL != v_bindings) {
                        final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                        backward.removal_add_node(make_my_creation_purpose_hl_support(ground_asent), v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 17833L)
    public static SubLObject removal_my_creation_second_check_cost(final SubLObject asent) {
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creation_second_check_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18021L)
    public static SubLObject my_creation_second_arg2_lookup(final SubLObject arg1) {
        return bookkeeping_store.creation_second(arg1, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18108L)
    public static SubLObject make_my_creation_second_hl_support(final SubLObject asent) {
        return make_bookkeeping_hl_support(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18213L)
    public static SubLObject removal_my_creation_second_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creation_second_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18420L)
    public static SubLObject removal_my_creation_second_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_second_arg2_lookup(asent_arg1);
            if (asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_second_hl_support(asent), (SubLObject)removal_modules_bookkeeping.UNPROVIDED, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 19321L)
    public static SubLObject removal_my_creation_second_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creation_second_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 19490L)
    public static SubLObject removal_my_creation_second_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_second_arg2_lookup(asent_arg1);
            if (removal_modules_bookkeeping.NIL != lookup_arg2 && !asent_arg2.eql(lookup_arg2)) {
                backward.removal_add_node(make_my_creation_second_hl_support(cycl_utilities.negate(asent)), (SubLObject)removal_modules_bookkeeping.UNPROVIDED, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 20563L)
    public static SubLObject removal_my_creation_second_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creation_second_unify_arg2_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 20840L)
    public static SubLObject removal_my_creation_second_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject variable = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject arg2 = my_creation_second_arg2_lookup(arg1);
            if (removal_modules_bookkeeping.NIL != arg2) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, (SubLObject)removal_modules_bookkeeping.T, (SubLObject)removal_modules_bookkeeping.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_bookkeeping.NIL != v_bindings) {
                    final SubLObject ground_asent = bindings.subst_bindings(v_bindings, asent);
                    backward.removal_add_node(make_my_creation_second_hl_support(ground_asent), v_bindings, unify_justification);
                }
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    public static SubLObject removal_my_creation_date_check_cost(final SubLObject asent) {
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creation_date_check_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    public static SubLObject my_creation_date_arg2_lookup(final SubLObject arg1) {
        final SubLObject date = bookkeeping_store.creation_time(arg1, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
        final SubLObject second = bookkeeping_store.creation_second(arg1, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
        if (removal_modules_bookkeeping.NIL == date) {
            return (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL == second) {
            return date_utilities.universal_date_to_cycl_date(date);
        }
        final SubLObject time = numeric_date_utilities.universal_time_from_date_and_second(date, second);
        return date_utilities.universal_time_to_cycl_date(time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    public static SubLObject removal_my_creation_date_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creation_date_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    public static SubLObject removal_my_creation_date_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_date_arg2_lookup(asent_arg1);
            if (asent_arg2.equal(lookup_arg2)) {
                final SubLObject time = my_creation_time_arg2_lookup(asent_arg1);
                final SubLObject second = my_creation_second_arg2_lookup(asent_arg1);
                backward.removal_add_node(make_my_creation_time_hl_support((SubLObject)ConsesLow.list(removal_modules_bookkeeping.$const14$myCreationTime, asent_arg1, time)), (SubLObject)removal_modules_bookkeeping.NIL, (SubLObject)((removal_modules_bookkeeping.NIL != second) ? ConsesLow.list(make_my_creation_second_hl_support((SubLObject)ConsesLow.list(removal_modules_bookkeeping.$const30$myCreationSecond, asent_arg1, second))) : removal_modules_bookkeeping.NIL));
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    public static SubLObject removal_my_creation_date_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        return removal_my_creation_date_check_cost(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    public static SubLObject removal_my_creation_date_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject asent_arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject asent_arg2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject lookup_arg2 = my_creation_date_arg2_lookup(asent_arg1);
            if (removal_modules_bookkeeping.NIL != lookup_arg2 && !asent_arg2.equal(lookup_arg2)) {
                final SubLObject actual_date = my_creation_time_arg2_lookup(asent_arg1);
                final SubLObject actual_second = my_creation_second_arg2_lookup(asent_arg1);
                final SubLObject queried_date = date_utilities.cycl_date_to_universal_date(asent_arg2);
                final SubLObject queried_second = date_utilities.cycl_date_to_universal_second(asent_arg2);
                SubLObject supports = (SubLObject)removal_modules_bookkeeping.NIL;
                if (!actual_second.equal(queried_second)) {
                    supports = (SubLObject)ConsesLow.cons(make_my_creation_second_hl_support((SubLObject)ConsesLow.list(removal_modules_bookkeeping.$const40$not, (SubLObject)ConsesLow.list(removal_modules_bookkeeping.$const30$myCreationSecond, asent_arg1, queried_second))), supports);
                }
                if (!actual_date.equal(queried_date)) {
                    supports = (SubLObject)ConsesLow.cons(make_my_creation_second_hl_support((SubLObject)ConsesLow.list(removal_modules_bookkeeping.$const40$not, (SubLObject)ConsesLow.list(removal_modules_bookkeeping.$const14$myCreationTime, asent_arg1, queried_date))), supports);
                }
                backward.removal_add_node(supports.first(), (SubLObject)removal_modules_bookkeeping.NIL, supports.rest());
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    public static SubLObject removal_my_creation_date_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            return removal_modules_bookkeeping.$my_creation_date_unify_arg2_default_cost$.getGlobalValue();
        }
        return (SubLObject)removal_modules_bookkeeping.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
    public static SubLObject removal_my_creation_date_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_bookkeeping.UNPROVIDED) {
            sense = (SubLObject)removal_modules_bookkeeping.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_bookkeeping.NIL != mt_relevance_macros.relevant_mtP(removal_modules_bookkeeping.$const1$BookkeepingMt)) {
            final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject variable = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_bookkeeping.UNPROVIDED);
            final SubLObject arg2 = my_creation_date_arg2_lookup(arg1);
            if (removal_modules_bookkeeping.NIL != arg2) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, variable, (SubLObject)removal_modules_bookkeeping.T, (SubLObject)removal_modules_bookkeeping.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_bookkeeping.NIL != v_bindings) {
                    final SubLObject time = my_creation_time_arg2_lookup(arg1);
                    final SubLObject second = my_creation_second_arg2_lookup(arg1);
                    final SubLObject second_just = (SubLObject)((removal_modules_bookkeeping.NIL != second) ? ConsesLow.list(make_my_creation_second_hl_support((SubLObject)ConsesLow.list(removal_modules_bookkeeping.$const30$myCreationSecond, arg1, second))) : removal_modules_bookkeeping.NIL);
                    final SubLObject support = make_my_creation_time_hl_support((SubLObject)ConsesLow.list(removal_modules_bookkeeping.$const14$myCreationTime, arg1, time));
                    final SubLObject more_supports = ConsesLow.append(unify_justification, second_just);
                    backward.removal_add_node(support, v_bindings, more_supports);
                }
            }
        }
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    public static SubLObject declare_removal_modules_bookkeeping_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "make_bookkeeping_hl_support", "MAKE-BOOKKEEPING-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creator_check_cost", "REMOVAL-MY-CREATOR-CHECK-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "my_creator_arg2_lookup", "MY-CREATOR-ARG2-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "make_my_creator_hl_support", "MAKE-MY-CREATOR-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creator_check_pos_cost", "REMOVAL-MY-CREATOR-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creator_check_pos_expand", "REMOVAL-MY-CREATOR-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creator_check_neg_cost", "REMOVAL-MY-CREATOR-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creator_check_neg_expand", "REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creator_unify_arg2_cost", "REMOVAL-MY-CREATOR-UNIFY-ARG2-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creator_unify_arg2_expand", "REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creator_unify_arg1_cost", "REMOVAL-MY-CREATOR-UNIFY-ARG1-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creator_unify_arg1_expand", "REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_time_check_cost", "REMOVAL-MY-CREATION-TIME-CHECK-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "my_creation_time_arg2_lookup", "MY-CREATION-TIME-ARG2-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "make_my_creation_time_hl_support", "MAKE-MY-CREATION-TIME-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_time_check_pos_cost", "REMOVAL-MY-CREATION-TIME-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_time_check_pos_expand", "REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_time_check_neg_cost", "REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_time_check_neg_expand", "REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_time_unify_arg2_cost", "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_time_unify_arg2_expand", "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_purpose_check_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "my_creation_purpose_arg2_lookup", "MY-CREATION-PURPOSE-ARG2-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "make_my_creation_purpose_hl_support", "MAKE-MY-CREATION-PURPOSE-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_purpose_check_pos_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_purpose_check_pos_expand", "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_purpose_check_neg_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_purpose_check_neg_expand", "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_purpose_unify_arg2_cost", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_purpose_unify_arg2_expand", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_purpose_unify_arg1_cost", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_purpose_unify_arg1_expand", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_second_check_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "my_creation_second_arg2_lookup", "MY-CREATION-SECOND-ARG2-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "make_my_creation_second_hl_support", "MAKE-MY-CREATION-SECOND-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_second_check_pos_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_second_check_pos_expand", "REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_second_check_neg_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_second_check_neg_expand", "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_second_unify_arg2_cost", "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_second_unify_arg2_expand", "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_date_check_cost", "REMOVAL-MY-CREATION-DATE-CHECK-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "my_creation_date_arg2_lookup", "MY-CREATION-DATE-ARG2-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_date_check_pos_cost", "REMOVAL-MY-CREATION-DATE-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_date_check_pos_expand", "REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_date_check_neg_cost", "REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_date_check_neg_expand", "REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_date_unify_arg2_cost", "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping", "removal_my_creation_date_unify_arg2_expand", "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    public static SubLObject init_removal_modules_bookkeeping_file() {
        removal_modules_bookkeeping.$bookkeeping_check_default_cost$ = SubLFiles.deflexical("*BOOKKEEPING-CHECK-DEFAULT-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_bookkeeping.$my_creator_check_default_cost$ = SubLFiles.deflexical("*MY-CREATOR-CHECK-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        removal_modules_bookkeeping.$my_creator_unify_arg2_default_cost$ = SubLFiles.deflexical("*MY-CREATOR-UNIFY-ARG2-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        removal_modules_bookkeeping.$my_creation_time_check_default_cost$ = SubLFiles.deflexical("*MY-CREATION-TIME-CHECK-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        removal_modules_bookkeeping.$my_creation_time_unify_arg2_default_cost$ = SubLFiles.deflexical("*MY-CREATION-TIME-UNIFY-ARG2-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        removal_modules_bookkeeping.$my_creation_purpose_check_default_cost$ = SubLFiles.deflexical("*MY-CREATION-PURPOSE-CHECK-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        removal_modules_bookkeeping.$my_creation_purpose_unify_arg2_default_cost$ = SubLFiles.deflexical("*MY-CREATION-PURPOSE-UNIFY-ARG2-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        removal_modules_bookkeeping.$my_creation_second_check_default_cost$ = SubLFiles.deflexical("*MY-CREATION-SECOND-CHECK-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        removal_modules_bookkeeping.$my_creation_second_unify_arg2_default_cost$ = SubLFiles.deflexical("*MY-CREATION-SECOND-UNIFY-ARG2-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        removal_modules_bookkeeping.$my_creation_date_check_default_cost$ = SubLFiles.deflexical("*MY-CREATION-DATE-CHECK-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        removal_modules_bookkeeping.$my_creation_date_unify_arg2_default_cost$ = SubLFiles.deflexical("*MY-CREATION-DATE-UNIFY-ARG2-DEFAULT-COST*", removal_modules_bookkeeping.$bookkeeping_check_default_cost$.getGlobalValue());
        return (SubLObject)removal_modules_bookkeeping.NIL;
    }
    
    public static SubLObject setup_removal_modules_bookkeeping_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_bookkeeping.$const3$myCreator);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_bookkeeping.$kw4$POS, removal_modules_bookkeeping.$const3$myCreator);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_bookkeeping.$kw5$NEG, removal_modules_bookkeeping.$const3$myCreator);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw6$REMOVAL_MY_CREATOR_CHECK_POS, (SubLObject)removal_modules_bookkeeping.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw8$REMOVAL_MY_CREATOR_CHECK_NEG, (SubLObject)removal_modules_bookkeeping.$list9);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw10$REMOVAL_MY_CREATOR_UNIFY_ARG2, (SubLObject)removal_modules_bookkeeping.$list11);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw12$REMOVAL_MY_CREATOR_UNIFY_ARG1, (SubLObject)removal_modules_bookkeeping.$list13);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_bookkeeping.$const14$myCreationTime);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_bookkeeping.$kw4$POS, removal_modules_bookkeeping.$const14$myCreationTime, (SubLObject)removal_modules_bookkeeping.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_bookkeeping.$kw5$NEG, removal_modules_bookkeeping.$const14$myCreationTime);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw15$REMOVAL_MY_CREATION_TIME_CHECK_POS, (SubLObject)removal_modules_bookkeeping.$list16);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw17$REMOVAL_MY_CREATION_TIME_CHECK_NEG, (SubLObject)removal_modules_bookkeeping.$list18);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw19$REMOVAL_MY_CREATION_TIME_UNIFY_ARG2, (SubLObject)removal_modules_bookkeeping.$list20);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_bookkeeping.$const21$myCreationPurpose);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_bookkeeping.$kw4$POS, removal_modules_bookkeeping.$const21$myCreationPurpose);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_bookkeeping.$kw5$NEG, removal_modules_bookkeeping.$const21$myCreationPurpose);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw22$REMOVAL_MY_CREATION_PURPOSE_CHECK_POS, (SubLObject)removal_modules_bookkeeping.$list23);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw24$REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG, (SubLObject)removal_modules_bookkeeping.$list25);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw26$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2, (SubLObject)removal_modules_bookkeeping.$list27);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw28$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1, (SubLObject)removal_modules_bookkeeping.$list29);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_bookkeeping.$const30$myCreationSecond);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_bookkeeping.$kw4$POS, removal_modules_bookkeeping.$const30$myCreationSecond, (SubLObject)removal_modules_bookkeeping.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_bookkeeping.$kw5$NEG, removal_modules_bookkeeping.$const30$myCreationSecond);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw31$REMOVAL_MY_CREATION_SECOND_CHECK_POS, (SubLObject)removal_modules_bookkeeping.$list32);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw33$REMOVAL_MY_CREATION_SECOND_CHECK_NEG, (SubLObject)removal_modules_bookkeeping.$list34);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw35$REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2, (SubLObject)removal_modules_bookkeeping.$list36);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_bookkeeping.$const37$myCreationDate);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_bookkeeping.$kw4$POS, removal_modules_bookkeeping.$const37$myCreationDate, (SubLObject)removal_modules_bookkeeping.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_bookkeeping.$kw5$NEG, removal_modules_bookkeeping.$const37$myCreationDate);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw38$REMOVAL_MY_CREATION_DATE_CHECK_POS, (SubLObject)removal_modules_bookkeeping.$list39);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw41$REMOVAL_MY_CREATION_DATE_CHECK_NEG, (SubLObject)removal_modules_bookkeeping.$list42);
        inference_modules.inference_removal_module((SubLObject)removal_modules_bookkeeping.$kw43$REMOVAL_MY_CREATION_DATE_UNIFY_ARG2, (SubLObject)removal_modules_bookkeeping.$list44);
        return (SubLObject)removal_modules_bookkeeping.NIL;
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
        me = (SubLFile)new removal_modules_bookkeeping();
        removal_modules_bookkeeping.$bookkeeping_check_default_cost$ = null;
        removal_modules_bookkeeping.$my_creator_check_default_cost$ = null;
        removal_modules_bookkeeping.$my_creator_unify_arg2_default_cost$ = null;
        removal_modules_bookkeeping.$my_creation_time_check_default_cost$ = null;
        removal_modules_bookkeeping.$my_creation_time_unify_arg2_default_cost$ = null;
        removal_modules_bookkeeping.$my_creation_purpose_check_default_cost$ = null;
        removal_modules_bookkeeping.$my_creation_purpose_unify_arg2_default_cost$ = null;
        removal_modules_bookkeeping.$my_creation_second_check_default_cost$ = null;
        removal_modules_bookkeeping.$my_creation_second_unify_arg2_default_cost$ = null;
        removal_modules_bookkeeping.$my_creation_date_check_default_cost$ = null;
        removal_modules_bookkeeping.$my_creation_date_unify_arg2_default_cost$ = null;
        $kw0$BOOKKEEPING = SubLObjectFactory.makeKeyword("BOOKKEEPING");
        $const1$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $kw2$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $const3$myCreator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator"));
        $kw4$POS = SubLObjectFactory.makeKeyword("POS");
        $kw5$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw6$REMOVAL_MY_CREATOR_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATOR-CHECK-POS");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATOR-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreator <fort-p> <fort-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreator #$Dog #$Guzman)") });
        $kw8$REMOVAL_MY_CREATOR_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATOR-CHECK-NEG");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreator <fort-p> <fort-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreator #$Dog #$Muffet))") });
        $kw10$REMOVAL_MY_CREATOR_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG2");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreator <fort-p> <not-fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreator #$Dog ?WHO)") });
        $kw12$REMOVAL_MY_CREATOR_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG1");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreator <not-fully-bound-p> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreator ?WHAT #$Guzman)") });
        $const14$myCreationTime = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime"));
        $kw15$REMOVAL_MY_CREATION_TIME_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-POS");
        $list16 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationTime <fort-p> <universal-date-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationTime #$Dog 19871011)") });
        $kw17$REMOVAL_MY_CREATION_TIME_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-NEG");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreationTime <fort-p> <universal-date-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreationTime #$Dog 19770717))") });
        $kw19$REMOVAL_MY_CREATION_TIME_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2");
        $list20 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationTime <fort-p> <variable-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationTime #$Dog ?WHEN)") });
        $const21$myCreationPurpose = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose"));
        $kw22$REMOVAL_MY_CREATION_PURPOSE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationPurpose <fort-p> <fort-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationPurpose #$Shrew #$GeneralCycKE)") });
        $kw24$REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreationPurpose <fort-p> <fort-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreationPurpose #$BritneySpears #$GeneralCycKE))") });
        $kw26$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationPurpose <fort-p> <not-fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationPurpose #$Shrew ?WHY)") });
        $kw28$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1");
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationPurpose <not-fully-bound-p> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationPurpose ?WHAT #$GeneralCycKE)") });
        $const30$myCreationSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond"));
        $kw31$REMOVAL_MY_CREATION_SECOND_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-POS");
        $list32 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-SECOND-P"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationSecond <fort-p> <universal-second-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationSecond #$MauveColor 162525)") });
        $kw33$REMOVAL_MY_CREATION_SECOND_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-NEG");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-SECOND-P"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreationSecond <fort-p> <universal-second-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreationSecond #$MauveColor 212))") });
        $kw35$REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2");
        $list36 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationSecond <fort-p> <variable-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationSecond #$MauveColor ?WHEN)") });
        $const37$myCreationDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationDate"));
        $kw38$REMOVAL_MY_CREATION_DATE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-POS");
        $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationDate")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-P"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationDate <fort-p> <date-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationDate #$Martini (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001)))))))") });
        $const40$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw41$REMOVAL_MY_CREATION_DATE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-NEG");
        $list42 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationDate")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-P"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreationDate <fort-p> <date-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreationDate #$Dog (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001))))))))") });
        $kw43$REMOVAL_MY_CREATION_DATE_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationDate")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationDate <fort-p> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationDate #$Martini ?WHEN)") });
    }
}

/*

	Total time: 162 ms
	
*/