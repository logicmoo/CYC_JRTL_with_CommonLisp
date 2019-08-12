/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-INSPECTION-TOOLS
 *  source file: /cyc/top/cycl/cyblack/cyblack-inspection-tools.lisp
 *  created:     2019/07/03 17:38:52
 */
public final class cyblack_inspection_tools extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_inspection_tools() {
    }

    public static final SubLFile me = new cyblack_inspection_tools();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_inspection_tools";

    // // Definitions
    public static final SubLObject cyblack_it_tab_to(SubLObject stream, SubLObject columns) {
        terpri(stream);
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(columns); i = add(i, ONE_INTEGER)) {
                princ(CHAR_vertical, stream);
                princ(CHAR_space, stream);
                princ(CHAR_space, stream);
            }
        }
        force_output(stream);
        return columns;
    }

    public static final SubLObject describe_bb_application(SubLObject bb_app, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application.cyblack_application_p(bb_app)) {
                    Errors.error($str_alt0$DESCRIBE_BB_APPLICATION___S_is_no, bb_app);
                }
            }
            format(stream, $str_alt1$__BEGIN__BB_App___S__Description_, cyblack_application.cyblack_app_get_application_name(bb_app));
            {
                SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(bb_app);
                SubLObject ksb = cyblack_application.cyblack_application_get_knowledge_source_battery(bb_app);
                if (NIL != ksb) {
                    cyblack_it_tab_to(stream, ZERO_INTEGER);
                    format(stream, $str_alt2$o_Knowledge_Source_Battery___);
                    describe_knowledge_source_battery(ksb, stream, ONE_INTEGER);
                }
                describe_blackboard(blackboard, stream, ONE_INTEGER);
            }
            format(stream, $str_alt3$__END__BB_App___S_, cyblack_application.cyblack_app_get_application_name(bb_app));
            return bb_app;
        }
    }

    public static final SubLObject describe_blackboard(SubLObject blackboard, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard.cyblack_blackboard_p(blackboard)) {
                    Errors.error($str_alt4$DESCRIBE_BLACKBOARD___S_is_not_an, blackboard);
                }
            }
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt5$BEGIN__BB__S__Description_of_Blac, blackboard);
            {
                SubLObject root_panels = cyblack_blackboard.cyblack_blackboard_get_root_panels(blackboard);
                if (NIL != root_panels) {
                    {
                        SubLObject cdolist_list_var = root_panels;
                        SubLObject panel = NIL;
                        for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                            describe_panel(panel, stream, add(depth, ONE_INTEGER));
                        }
                    }
                } else {
                    cyblack_it_tab_to(stream, add(depth, ONE_INTEGER));
                    format(stream, $str_alt6$This_blackboard_has_no_panels_);
                }
            }
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt7$END__BB__S_, blackboard);
            return blackboard;
        }
    }

    public static final SubLObject describe_panel(SubLObject panel, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(panel)) {
                    Errors.error($str_alt8$DESCRIBE_PANEL___S_is_not_an_inst, panel);
                }
            }
            cyblack_it_tab_to(stream, depth);
            {
                SubLObject type = cyblack_panel_dispatch_functions.cyblack_panel_get_datatype(panel);
                if (NIL == type) {
                    format(stream, $str_alt9$BEGIN__Panel__S__has_no_type_info, panel);
                    cyblack_it_tab_to(stream, depth);
                    format(stream, $str_alt10$END__Panel__S_, panel);
                    return NIL;
                }
                {
                    SubLObject typename = cyblack_datatype.cyblack_datatype_get_typename(type);
                    SubLObject panel_type = cyblack_datatype.cyblack_datatype_get_panel_type(type);
                    SubLObject posting_type = cyblack_datatype.cyblack_datatype_get_posting_type(type);
                    SubLObject direct_knowledge_sources = cyblack_panel_dispatch_functions.cyblack_panel_get_direct_knowledge_sources(panel);
                    SubLObject direct_postings = cyblack_panel_dispatch_functions.cyblack_panel_get_direct_postings(panel);
                    SubLObject subpanels = cyblack_panel_dispatch_functions.cyblack_panel_get_sub_panels(panel);
                    format(stream, $str_alt11$BEGIN__Panel__S__Description_of__, panel, typename);
                    cyblack_it_tab_to(stream, depth);
                    format(stream, $str_alt12$o_Panel__S_is_implemented_by_pane, typename, panel_type);
                    cyblack_it_tab_to(stream, depth);
                    format(stream, $str_alt13$o_Panel__S_accepts_postings_of_cl, typename, posting_type);
                    cyblack_it_tab_to(stream, depth);
                    format(stream, $str_alt14$o_Panel__S_is_linked_to_the_follo, typename);
                    {
                        SubLObject cdolist_list_var = direct_knowledge_sources;
                        SubLObject ks = NIL;
                        for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                            describe_knowledge_source(ks, stream, add(depth, ONE_INTEGER));
                        }
                    }
                    cyblack_it_tab_to(stream, depth);
                    format(stream, $str_alt15$o_Panel__S_contains_the_following, typename);
                    {
                        SubLObject cdolist_list_var = direct_postings;
                        SubLObject posting = NIL;
                        for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                            describe_posting(posting, stream, add(depth, ONE_INTEGER));
                        }
                    }
                    cyblack_it_tab_to(stream, depth);
                    format(stream, $str_alt16$o_Panel__S_has_the_following_subp, typename);
                    {
                        SubLObject cdolist_list_var = subpanels;
                        SubLObject subpanel = NIL;
                        for (subpanel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subpanel = cdolist_list_var.first()) {
                            describe_panel(subpanel, stream, add(depth, ONE_INTEGER));
                        }
                    }
                    cyblack_it_tab_to(stream, depth);
                    format(stream, $str_alt10$END__Panel__S_, panel);
                }
            }
            return panel;
        }
    }

    public static final SubLObject describe_knowledge_source(SubLObject knowledge_source, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(knowledge_source)) {
                    Errors.error($str_alt17$DESCRIBE_KNOWLEDGE_SOURCE___S_is_, knowledge_source);
                }
            }
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt18$BEGIN__KS__S__Knowledge_Source_De, knowledge_source);
            cyblack_it_tab_to(stream, depth);
            if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(knowledge_source)) {
                format(stream, $str_alt19$o_This_is_an_external_knowledge_s);
                cyblack_it_tab_to(stream, depth);
                format(stream, $str_alt20$o_The_external_name_of_this_knowl, methods.funcall_instance_method_with_0_args(knowledge_source, GET_NAME));
            } else {
                format(stream, $str_alt22$o_This_is_an_internal_knowledge_s);
            }
            cyblack_it_tab_to(stream, depth);
            if (NIL != cyblack_ks.cyblack_pattern_based_knowledge_source_p(knowledge_source)) {
                format(stream, $str_alt23$o_Precondition_Pattern____S_, methods.funcall_instance_method_with_0_args(knowledge_source, GET_PRECONDITION_PATTERN));
                cyblack_it_tab_to(stream, depth);
                format(stream, $str_alt25$o_This_knowledge_source_is_connec);
                cyblack_it_tab_to(stream, depth);
                {
                    SubLObject list_of_panels = methods.funcall_instance_method_with_0_args(knowledge_source, GET_PANELS);
                    SubLObject panel_names = NIL;
                    SubLObject list_expression = list_of_panels;
                    if (NIL == list_expression) {
                        panel_names = NIL;
                    } else
                        if (list_expression.isAtom()) {
                            panel_names = list(list_expression);
                        } else
                            if (NIL == list_expression.rest()) {
                                {
                                    SubLObject panel = list_expression.first();
                                    panel_names = list(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(panel, GET_DATATYPE), GET_TYPENAME));
                                }
                            } else {
                                {
                                    SubLObject tail_cons = NIL;
                                    SubLObject result = NIL;
                                    {
                                        SubLObject panel = list_expression.first();
                                        panel_names = list(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(panel, GET_DATATYPE), GET_TYPENAME));
                                        tail_cons = panel_names;
                                    }
                                    {
                                        SubLObject cdolist_list_var = list_expression.rest();
                                        SubLObject panel = NIL;
                                        for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                                            result = list(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(panel, GET_DATATYPE), GET_TYPENAME));
                                            rplacd(tail_cons, result);
                                            tail_cons = result;
                                        }
                                    }
                                }
                            }


                    format(stream, $str_alt29$_S, panel_names);
                }
            }
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt30$END__KS__S_, knowledge_source);
            return knowledge_source;
        }
    }

    public static final SubLObject describe_posting(SubLObject posting, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                    Errors.error($str_alt31$DESCRIBE_POSTING___S_is_not_an_in, posting);
                }
            }
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt32$BEGIN__Posting__S__Description_of, posting);
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt33$o_This_posting_is_of_class__S_, subloop_structures.class_name(subloop_structures.instance_class(posting)));
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt34$o_Essential_Slot_Value_Pairs_);
            {
                SubLObject v_class = subloop_structures.instance_class(posting);
                SubLObject v_class_1 = v_class;
                SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_1);
                SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class_1);
                SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class_1);
                SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class_1);
                {
                    SubLObject slot_name = NIL;
                    SubLObject cdolist_list_var = compiled_class_slot_access_alist;
                    SubLObject slot = NIL;
                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                        if (NIL != slots.slot_essential(slot)) {
                            slot_name = slots.slot_name(slot);
                            cyblack_it_tab_to(stream, depth);
                            format(stream, $str_alt35$_____S____S, slot_name, instances.get_slot(posting, slot_name));
                        }
                    }
                }
                {
                    SubLObject slot_name = NIL;
                    SubLObject cdolist_list_var = compiled_class_boolean_slot_access_alist;
                    SubLObject slot = NIL;
                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                        if (NIL != slots.slot_essential(slot)) {
                            slot_name = slots.slot_name(slot);
                            cyblack_it_tab_to(stream, depth);
                            format(stream, $str_alt35$_____S____S, slot_name, instances.get_slot(posting, slot_name));
                        }
                    }
                }
                {
                    SubLObject slot_name = NIL;
                    SubLObject cdolist_list_var = compiled_instance_slot_access_alist;
                    SubLObject slot = NIL;
                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                        if (NIL != slots.slot_essential(slot)) {
                            slot_name = slots.slot_name(slot);
                            cyblack_it_tab_to(stream, depth);
                            format(stream, $str_alt35$_____S____S, slot_name, instances.get_slot(posting, slot_name));
                        }
                    }
                }
                {
                    SubLObject slot_name = NIL;
                    SubLObject cdolist_list_var = compiled_instance_boolean_slot_access_alist;
                    SubLObject slot = NIL;
                    for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                        if (NIL != slots.slot_essential(slot)) {
                            slot_name = slots.slot_name(slot);
                            cyblack_it_tab_to(stream, depth);
                            format(stream, $str_alt35$_____S____S, slot_name, instances.get_slot(posting, slot_name));
                        }
                    }
                }
            }
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt36$END__Posting_S_, posting);
            return posting;
        }
    }

    public static final SubLObject describe_knowledge_source_battery(SubLObject ksb, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ksb.cyblack_knowledge_source_battery_p(ksb)) {
                    Errors.error($str_alt37$DESCRIBE_KNOWLEDGE_SOURCE_BATTERY, ksb);
                }
            }
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt38$BEGIN__Knowledge_Source_Battery__, ksb);
            cyblack_it_tab_to(stream, depth);
            format(stream, $str_alt39$o_All_Knowledge_Sources_);
            {
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(ksb, GET_ALL_KNOWLEDGE_SOURCES);
                SubLObject ks = NIL;
                for (ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks = cdolist_list_var.first()) {
                    describe_knowledge_source(ks, stream, add(depth, ONE_INTEGER));
                }
            }
            return ksb;
        }
    }

    public static final SubLObject declare_cyblack_inspection_tools_file() {
        declareFunction("cyblack_it_tab_to", "CYBLACK-IT-TAB-TO", 2, 0, false);
        declareFunction("describe_bb_application", "DESCRIBE-BB-APPLICATION", 1, 1, false);
        declareFunction("describe_blackboard", "DESCRIBE-BLACKBOARD", 1, 2, false);
        declareFunction("describe_panel", "DESCRIBE-PANEL", 1, 2, false);
        declareFunction("describe_knowledge_source", "DESCRIBE-KNOWLEDGE-SOURCE", 1, 2, false);
        declareFunction("describe_posting", "DESCRIBE-POSTING", 1, 2, false);
        declareFunction("describe_knowledge_source_battery", "DESCRIBE-KNOWLEDGE-SOURCE-BATTERY", 1, 2, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_inspection_tools_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_inspection_tools_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$DESCRIBE_BB_APPLICATION___S_is_no = makeString("DESCRIBE-BB-APPLICATION: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt1$__BEGIN__BB_App___S__Description_ = makeString("~%BEGIN (BB App. ~S) Description of Blackboard Application:");

    static private final SubLString $str_alt2$o_Knowledge_Source_Battery___ = makeString("o Knowledge Source Battery ->");

    static private final SubLString $str_alt3$__END__BB_App___S_ = makeString("~%END (BB App. ~S)");

    static private final SubLString $str_alt4$DESCRIBE_BLACKBOARD___S_is_not_an = makeString("DESCRIBE-BLACKBOARD: ~S is not an instance of CYBLACK-BLACKBOARD.");

    static private final SubLString $str_alt5$BEGIN__BB__S__Description_of_Blac = makeString("BEGIN (BB ~S) Description of Blackboard:");

    static private final SubLString $str_alt6$This_blackboard_has_no_panels_ = makeString("This blackboard has no panels.");

    static private final SubLString $str_alt7$END__BB__S_ = makeString("END (BB ~S)");

    static private final SubLString $str_alt8$DESCRIBE_PANEL___S_is_not_an_inst = makeString("DESCRIBE-PANEL: ~S is not an instance of CYBLACK-PANEL.");

    static private final SubLString $str_alt9$BEGIN__Panel__S__has_no_type_info = makeString("BEGIN (Panel ~S) has no type information.");

    static private final SubLString $str_alt10$END__Panel__S_ = makeString("END (Panel ~S)");

    static private final SubLString $str_alt11$BEGIN__Panel__S__Description_of__ = makeString("BEGIN (Panel ~S) Description of ~S Panel:");

    static private final SubLString $str_alt12$o_Panel__S_is_implemented_by_pane = makeString("o Panel ~S is implemented by panel class ~S.");

    static private final SubLString $str_alt13$o_Panel__S_accepts_postings_of_cl = makeString("o Panel ~S accepts postings of class ~S.");

    static private final SubLString $str_alt14$o_Panel__S_is_linked_to_the_follo = makeString("o Panel ~S is linked to the following knowledge sources:");

    static private final SubLString $str_alt15$o_Panel__S_contains_the_following = makeString("o Panel ~S contains the following direct postings:");

    static private final SubLString $str_alt16$o_Panel__S_has_the_following_subp = makeString("o Panel ~S has the following subpanels:");

    static private final SubLString $str_alt17$DESCRIBE_KNOWLEDGE_SOURCE___S_is_ = makeString("DESCRIBE-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    static private final SubLString $str_alt18$BEGIN__KS__S__Knowledge_Source_De = makeString("BEGIN (KS ~S) Knowledge Source Description.");

    static private final SubLString $str_alt19$o_This_is_an_external_knowledge_s = makeString("o This is an external knowledge source.");

    static private final SubLString $str_alt20$o_The_external_name_of_this_knowl = makeString("o The external name of this knowledge source is: ~S.");



    static private final SubLString $str_alt22$o_This_is_an_internal_knowledge_s = makeString("o This is an internal knowledge source.");

    static private final SubLString $str_alt23$o_Precondition_Pattern____S_ = makeString("o Precondition Pattern = ~S.");



    static private final SubLString $str_alt25$o_This_knowledge_source_is_connec = makeString("o This knowledge source is connected to the following panels:");







    static private final SubLString $str_alt29$_S = makeString("~S");

    static private final SubLString $str_alt30$END__KS__S_ = makeString("END (KS ~S)");

    static private final SubLString $str_alt31$DESCRIBE_POSTING___S_is_not_an_in = makeString("DESCRIBE-POSTING: ~S is not an instance of CYBLACK-POSTING.");

    static private final SubLString $str_alt32$BEGIN__Posting__S__Description_of = makeString("BEGIN (Posting ~S) Description of Posting");

    static private final SubLString $str_alt33$o_This_posting_is_of_class__S_ = makeString("o This posting is of class ~S.");

    static private final SubLString $str_alt34$o_Essential_Slot_Value_Pairs_ = makeString("o Essential Slot/Value Pairs:");

    static private final SubLString $str_alt35$_____S____S = makeString("  - ~S = ~S");

    static private final SubLString $str_alt36$END__Posting_S_ = makeString("END (Posting~S)");

    static private final SubLString $str_alt37$DESCRIBE_KNOWLEDGE_SOURCE_BATTERY = makeString("DESCRIBE-KNOWLEDGE-SOURCE-BATTERY: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-BATTERY.");

    static private final SubLString $str_alt38$BEGIN__Knowledge_Source_Battery__ = makeString("BEGIN (Knowledge Source Battery ~S) Description of Knowledge Source Battery");

    static private final SubLString $str_alt39$o_All_Knowledge_Sources_ = makeString("o All Knowledge Sources:");



    // // Initializers
    public void declareFunctions() {
        declare_cyblack_inspection_tools_file();
    }

    public void initializeVariables() {
        init_cyblack_inspection_tools_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_inspection_tools_file();
    }
}

