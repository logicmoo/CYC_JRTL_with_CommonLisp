/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KB-ACTION-TO-UIA-TRAMPOLINES
 *  source file: /cyc/top/cycl/kb-action-to-uia-trampolines.lisp
 *  created:     2019/07/03 17:37:58
 */
public final class kb_action_to_uia_trampolines extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kb_action_to_uia_trampolines() {
    }

    public static final SubLFile me = new kb_action_to_uia_trampolines();

    public static final String myName = "com.cyc.cycjava.cycl.kb_action_to_uia_trampolines";

    // // Definitions
    /**
     * Entry point for a KB action to trigger a UIA salient descriptor on TERM
     * in the UIA whose current context is INTERACTION-MT.
     *
     * @return boolean
     */
    public static final SubLObject kb_action_to_uia_salient_descriptor(SubLObject v_term, SubLObject interaction_mt) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(interaction_mt, HLMT_P);
        {
            SubLObject v_agenda = kb_action_derive_uia_from_interaction_mt(interaction_mt);
            if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                return list_utilities.sublisp_boolean(uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $REQUIRED, $str_alt3$, v_term));
            }
        }
        return NIL;
    }

    /**
     * Entry point for a KB action to trigger a UIA assertion creator on
     * SENTENCE in the UIA whose current context is INTERACTION-MT.
     *
     * @return boolean
     */
    public static final SubLObject kb_action_to_uia_assertion_creator(SubLObject sentence, SubLObject interaction_mt) {
        SubLTrampolineFile.checkType(sentence, EL_FORMULA_P);
        SubLTrampolineFile.checkType(interaction_mt, HLMT_P);
        {
            SubLObject v_agenda = kb_action_derive_uia_from_interaction_mt(interaction_mt);
            if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                return list_utilities.sublisp_boolean(uia_tools_introduction.uia_act_new_assertion_creator(v_agenda, $REQUIRED, $str_alt3$, sentence, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static final SubLObject kb_action_derive_uia_from_interaction_mt(SubLObject interaction_mt) {
        {
            SubLObject user = bookkeeping_store.creator(interaction_mt, UNPROVIDED);
            if (NIL != forts.fort_p(user)) {
                {
                    SubLObject uima = user_interaction_agenda.uimma_find_by_user(user);
                    if (NIL != user_interaction_agenda.user_interaction_meta_agenda_p(uima)) {
                        {
                            SubLObject v_agenda = user_interaction_agenda.uima_current_agenda(uima);
                            return v_agenda;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_kb_action_to_uia_trampolines_file() {
        declareFunction("kb_action_to_uia_salient_descriptor", "KB-ACTION-TO-UIA-SALIENT-DESCRIPTOR", 2, 0, false);
        declareFunction("kb_action_to_uia_assertion_creator", "KB-ACTION-TO-UIA-ASSERTION-CREATOR", 2, 0, false);
        declareFunction("kb_action_derive_uia_from_interaction_mt", "KB-ACTION-DERIVE-UIA-FROM-INTERACTION-MT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kb_action_to_uia_trampolines_file() {
        return NIL;
    }

    public static final SubLObject setup_kb_action_to_uia_trampolines_file() {
                utilities_macros.register_cyc_api_function(KB_ACTION_TO_UIA_SALIENT_DESCRIPTOR, $list_alt5, $str_alt6$Entry_point_for_a_KB_action_to_tr, $list_alt7, NIL);
        utilities_macros.register_cyc_api_function(KB_ACTION_TO_UIA_ASSERTION_CREATOR, $list_alt10, $str_alt11$Entry_point_for_a_KB_action_to_tr, $list_alt12, NIL);
        return NIL;
    }







    static private final SubLString $str_alt3$ = makeString("");

    private static final SubLSymbol KB_ACTION_TO_UIA_SALIENT_DESCRIPTOR = makeSymbol("KB-ACTION-TO-UIA-SALIENT-DESCRIPTOR");

    static private final SubLList $list_alt5 = list(makeSymbol("TERM"), makeSymbol("INTERACTION-MT"));

    static private final SubLString $str_alt6$Entry_point_for_a_KB_action_to_tr = makeString("Entry point for a KB action to trigger a UIA salient descriptor on TERM\n   in the UIA whose current context is INTERACTION-MT.\n   @return boolean");

    static private final SubLList $list_alt7 = list(list(makeSymbol("TERM"), makeSymbol("FORT-P")), list(makeSymbol("INTERACTION-MT"), makeSymbol("HLMT-P")));



    private static final SubLSymbol KB_ACTION_TO_UIA_ASSERTION_CREATOR = makeSymbol("KB-ACTION-TO-UIA-ASSERTION-CREATOR");

    static private final SubLList $list_alt10 = list(makeSymbol("SENTENCE"), makeSymbol("INTERACTION-MT"));

    static private final SubLString $str_alt11$Entry_point_for_a_KB_action_to_tr = makeString("Entry point for a KB action to trigger a UIA assertion creator on \n   SENTENCE in the UIA whose current context is INTERACTION-MT.\n   @return boolean");

    static private final SubLList $list_alt12 = list(list(makeSymbol("SENTENCE"), makeSymbol("EL-FORMULA-P")), list(makeSymbol("INTERACTION-MT"), makeSymbol("HLMT-P")));

    // // Initializers
    public void declareFunctions() {
        declare_kb_action_to_uia_trampolines_file();
    }

    public void initializeVariables() {
        init_kb_action_to_uia_trampolines_file();
    }

    public void runTopLevelForms() {
        setup_kb_action_to_uia_trampolines_file();
    }
}

