/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-USER-MODELER
 *  source file: /cyc/top/cycl/uia-user-modeler.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_user_modeler extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_user_modeler() {
    }

    public static final SubLFile me = new uia_user_modeler();


    // // Definitions
    /**
     *
     *
     * @return LISTP of topic forts to suggest
     */
    public static final SubLObject uia_user_modeler_get_topic_forts(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_forts = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                    try {
                        api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                        {
                            SubLObject all_topic_forts = ask_utilities.ask_variable($sym0$_TOPIC, $list_alt1, $$BaseKB, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            v_forts = uia_usrmod_remove_subsumed_topic_forts(all_topic_forts);
                        }
                    } finally {
                        api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_forts;
            }
        }
    }

    /**
     * Remove any items from TOPIC-FORTS that are subsumed by anything else in TOPIC-FORTS
     */
    public static final SubLObject uia_usrmod_remove_subsumed_topic_forts(SubLObject topic_forts) {
        if (!topic_forts.isList()) {
            return NIL;
        }
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = topic_forts;
            SubLObject topic_fort = NIL;
            for (topic_fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic_fort = cdolist_list_var.first()) {
                {
                    SubLObject others = remove(topic_fort, topic_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == subl_promotions.memberP(topic_fort, others, $sym3$UIA_USRMOD_FORT_SUBSUMED_BY_, UNPROVIDED)) {
                        ans = cons(topic_fort, ans);
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does TOPIC2 subsume TOPIC1?
     */
    public static final SubLObject uia_usrmod_fort_subsumed_byP(SubLObject topic1, SubLObject topic2) {
        return uia_usrmod_fort_subsumesP(topic2, topic1);
    }

    /**
     *
     *
     * @return BOOLEAN; Does TOPIC1 subsume TOPIC2?
     */
    public static final SubLObject uia_usrmod_fort_subsumesP(SubLObject topic1, SubLObject topic2) {
        return makeBoolean(((NIL != uia_usrmod_mt(topic1)) && uia_usrmod_mt(topic1).eql(uia_usrmod_mt(topic2))) && (NIL != uia_usrmod_prefer_topicP(topic1, topic2)));
    }

    /**
     *
     *
     * @return HLMT-P; The topic mt associated with TOPIC, if known.
     * @unknown Assumes (#$uiaDemoEnvironmentTopic MT TOPIC) is directly asserted and visible from #$BaseKB.
     */
    public static final SubLObject uia_usrmod_mt(SubLObject topic) {
        return NIL != kb_indexing_datastructures.indexed_term_p(topic) ? ((SubLObject) (kb_mapping_utilities.fpred_value(topic, $$uiaDemoEnvironmentTopic, TWO_INTEGER, ONE_INTEGER, UNPROVIDED))) : NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Should we present the user TOPIC1 instead of TOPIC2, given that both
    have the same topic mt?
     */
    public static final SubLObject uia_usrmod_prefer_topicP(SubLObject topic1, SubLObject topic2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = constants_high.find_constant($$$uiaConflateTo);
                SubLObject ans = NIL;
                if (NIL != constant_handles.valid_constantP(pred, UNPROVIDED)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = kb_mapping_utilities.pred_u_v_holds(pred, topic2, topic1, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return ans;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $uia_user_modeler_default_topic$ = makeSymbol("*UIA-USER-MODELER-DEFAULT-TOPIC*");

    public static final SubLObject uia_user_modeler_default_topic(SubLObject v_agenda) {
        return $uia_user_modeler_default_topic$.getGlobalValue();
    }

    public static final SubLObject declare_uia_user_modeler_file() {
        declareFunction("uia_user_modeler_get_topic_forts", "UIA-USER-MODELER-GET-TOPIC-FORTS", 1, 0, false);
        declareFunction("uia_usrmod_remove_subsumed_topic_forts", "UIA-USRMOD-REMOVE-SUBSUMED-TOPIC-FORTS", 1, 0, false);
        declareFunction("uia_usrmod_fort_subsumed_byP", "UIA-USRMOD-FORT-SUBSUMED-BY?", 2, 0, false);
        declareFunction("uia_usrmod_fort_subsumesP", "UIA-USRMOD-FORT-SUBSUMES?", 2, 0, false);
        declareFunction("uia_usrmod_mt", "UIA-USRMOD-MT", 1, 0, false);
        declareFunction("uia_usrmod_prefer_topicP", "UIA-USRMOD-PREFER-TOPIC?", 2, 0, false);
        declareFunction("uia_user_modeler_default_topic", "UIA-USER-MODELER-DEFAULT-TOPIC", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_user_modeler_file() {
        deflexical("*UIA-USER-MODELER-DEFAULT-TOPIC*", $$$open_ended);
        return NIL;
    }

    public static final SubLObject setup_uia_user_modeler_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$_TOPIC = makeSymbol("?TOPIC");

    static private final SubLList $list_alt1 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MT"), list(constant_handles.reader_make_constant_shell(makeString("uiaDemoEnvironmentTopic")), makeSymbol("?MT"), makeSymbol("?TOPIC")));

    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

    static private final SubLSymbol $sym3$UIA_USRMOD_FORT_SUBSUMED_BY_ = makeSymbol("UIA-USRMOD-FORT-SUBSUMED-BY?");

    public static final SubLObject $$uiaDemoEnvironmentTopic = constant_handles.reader_make_constant_shell(makeString("uiaDemoEnvironmentTopic"));

    static private final SubLString $$$uiaConflateTo = makeString("uiaConflateTo");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLString $$$open_ended = makeString("open ended");

    // // Initializers
    public void declareFunctions() {
        declare_uia_user_modeler_file();
    }

    public void initializeVariables() {
        init_uia_user_modeler_file();
    }

    public void runTopLevelForms() {
        setup_uia_user_modeler_file();
    }
}

