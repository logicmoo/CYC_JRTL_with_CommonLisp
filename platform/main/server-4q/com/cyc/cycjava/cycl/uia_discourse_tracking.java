/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-DISCOURSE-TRACKING
 *  source file: /cyc/top/cycl/uia-discourse-tracking.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_discourse_tracking extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_discourse_tracking() {
    }

    public static final SubLFile me = new uia_discourse_tracking();


    // // Definitions
    public static final SubLObject uiat_sr_extend_current_discourse(SubLObject interaction, SubLObject indexical_map, SubLObject constraint_table) {
        {
            SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            SubLObject child_discourse = rkf_discourse_tracking.new_rkf_discourse_context(mt);
            uia_push_new_discourse_object_for_interaction(interaction, child_discourse);
            {
                SubLObject cdolist_list_var = constraint_table;
                SubLObject constraint = NIL;
                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                    {
                        SubLObject datum = constraint;
                        SubLObject current = datum;
                        SubLObject indexical = NIL;
                        SubLObject isas = NIL;
                        SubLObject v_genls = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        indexical = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        isas = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        v_genls = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject indexical_formula = rkf_discourse_tracking.rkf_make_discourse_formula_from_constraints(list_utilities.flatten(isas), list_utilities.flatten(v_genls));
                                SubLObject disc_mapping = rkf_discourse_tracking.create_rkf_discourse_indexicals_mapping(indexical, list(indexical_formula));
                                rkf_discourse_tracking.rkf_dc_add_mapping(child_discourse, disc_mapping);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = indexical_map;
                SubLObject indexical_item = NIL;
                for (indexical_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_item = cdolist_list_var.first()) {
                    {
                        SubLObject datum = indexical_item;
                        SubLObject current = datum;
                        SubLObject indexical = NIL;
                        SubLObject name = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt1);
                        indexical = current.first();
                        current = current.rest();
                        name = current;
                        {
                            SubLObject phrase_mapping = rkf_discourse_tracking.create_rkf_discourse_phrases_mapping(indexical, list(name));
                            rkf_discourse_tracking.rkf_dc_add_mapping(child_discourse, phrase_mapping);
                        }
                    }
                }
            }
            return interaction;
        }
    }

    public static final SubLObject uia_discourse_object_from_interaction(SubLObject interaction) {
        {
            SubLObject discourse_object = user_interaction_agenda.ui_state_lookup(interaction, $DISCOURSE_OBJECT, $UNINITIALIZED);
            if (discourse_object == $UNINITIALIZED) {
                {
                    SubLObject parent = user_interaction_agenda.ui_parent_interaction(interaction);
                    if (NIL != user_interaction_agenda.user_interaction_p(parent)) {
                        return uia_discourse_object_from_interaction(parent);
                    }
                    {
                        SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                        SubLObject discourse_object_1 = user_interaction_agenda.uia_state_lookup(v_agenda, $DISCOURSE_OBJECT, $UNINITIALIZED);
                        if ($UNINITIALIZED == discourse_object_1) {
                            {
                                SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
                                discourse_object_1 = rkf_discourse_tracking.new_rkf_discourse_context(mt);
                            }
                            user_interaction_agenda.uia_state_update(v_agenda, $DISCOURSE_OBJECT, discourse_object_1);
                        }
                        return discourse_object_1;
                    }
                }
            }
            return discourse_object;
        }
    }

    public static final SubLObject uia_push_new_discourse_object_for_interaction(SubLObject interaction, SubLObject child_discourse) {
        {
            SubLObject parent_discourse = uia_discourse_object_from_interaction(interaction);
            rkf_discourse_tracking.rkf_dc_link_parent_child_discourse(parent_discourse, child_discourse);
            user_interaction_agenda.ui_state_update(interaction, $DISCOURSE_OBJECT, child_discourse);
            return interaction;
        }
    }

    public static final SubLObject declare_uia_discourse_tracking_file() {
        declareFunction("uiat_sr_extend_current_discourse", "UIAT-SR-EXTEND-CURRENT-DISCOURSE", 3, 0, false);
        declareFunction("uia_discourse_object_from_interaction", "UIA-DISCOURSE-OBJECT-FROM-INTERACTION", 1, 0, false);
        declareFunction("uia_push_new_discourse_object_for_interaction", "UIA-PUSH-NEW-DISCOURSE-OBJECT-FOR-INTERACTION", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_discourse_tracking_file() {
        return NIL;
    }

    public static final SubLObject setup_uia_discourse_tracking_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("INDEXICAL"), makeSymbol("ISAS"), makeSymbol("GENLS"));

    static private final SubLList $list_alt1 = cons(makeSymbol("INDEXICAL"), makeSymbol("NAME"));

    private static final SubLSymbol $DISCOURSE_OBJECT = makeKeyword("DISCOURSE-OBJECT");



    // // Initializers
    public void declareFunctions() {
        declare_uia_discourse_tracking_file();
    }

    public void initializeVariables() {
        init_uia_discourse_tracking_file();
    }

    public void runTopLevelForms() {
        setup_uia_discourse_tracking_file();
    }
}

