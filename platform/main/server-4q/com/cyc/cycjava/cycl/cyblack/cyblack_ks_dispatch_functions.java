/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-KS-DISPATCH-FUNCTIONS
 *  source file: /cyc/top/cycl/cyblack/cyblack-ks-dispatch-functions.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_ks_dispatch_functions extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_ks_dispatch_functions() {
    }

    public static final SubLFile me = new cyblack_ks_dispatch_functions();


    // // Definitions
    public static final SubLObject cyblack_mks_get_state_change_listener(SubLObject cyblack_monitoring_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_monitoring_ks_p(cyblack_monitoring_ks)) {
                    Errors.error($str_alt0$CYBLACK_MKS_GET_STATE_CHANGE_LIST, cyblack_monitoring_ks);
                }
            }
            if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_monitoring_ks)) {
                return cyblack_ks.cyblack_internal_monitoring_ks_get_state_change_listener_method(cyblack_monitoring_ks);
            } else
                if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_monitoring_ks)) {
                    return cyblack_ks.cyblack_external_monitoring_ks_get_state_change_listener_method(cyblack_monitoring_ks);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_monitoring_ks, GET_STATE_CHANGE_LISTENER);
                }

        }
    }

    public static final SubLObject cyblack_mks_get_action(SubLObject cyblack_monitoring_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_monitoring_ks_p(cyblack_monitoring_ks)) {
                    Errors.error($str_alt2$CYBLACK_MKS_GET_ACTION___S_is_not, cyblack_monitoring_ks);
                }
            }
            if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_monitoring_ks)) {
                return cyblack_ks.cyblack_internal_monitoring_ks_get_action_method(cyblack_monitoring_ks);
            } else
                if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_monitoring_ks)) {
                    return cyblack_ks.cyblack_external_monitoring_ks_get_action_method(cyblack_monitoring_ks);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_monitoring_ks, GET_ACTION);
                }

        }
    }

    public static final SubLObject cyblack_mks_get_action_qualifiers(SubLObject cyblack_monitoring_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_monitoring_ks_p(cyblack_monitoring_ks)) {
                    Errors.error($str_alt4$CYBLACK_MKS_GET_ACTION_QUALIFIERS, cyblack_monitoring_ks);
                }
            }
            if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_monitoring_ks)) {
                return cyblack_ks.cyblack_internal_monitoring_ks_get_action_qualifiers_method(cyblack_monitoring_ks);
            } else
                if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_monitoring_ks)) {
                    return cyblack_ks.cyblack_external_monitoring_ks_get_action_qualifiers_method(cyblack_monitoring_ks);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_monitoring_ks, GET_ACTION_QUALIFIERS);
                }

        }
    }

    public static final SubLObject cyblack_mks_gather_all_postings(SubLObject cyblack_monitoring_ks, SubLObject datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_monitoring_ks_p(cyblack_monitoring_ks)) {
                    Errors.error($str_alt6$CYBLACK_MKS_GATHER_ALL_POSTINGS__, cyblack_monitoring_ks);
                }
            }
            if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_monitoring_ks)) {
                return cyblack_ks.cyblack_internal_monitoring_ks_gather_all_postings_method(cyblack_monitoring_ks, datatype);
            } else
                if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_monitoring_ks)) {
                    return cyblack_ks.cyblack_external_monitoring_ks_gather_all_postings_method(cyblack_monitoring_ks, datatype);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_monitoring_ks, GATHER_ALL_POSTINGS, datatype);
                }

        }
    }

    public static final SubLObject cyblack_mks_gather_all_direct_postings(SubLObject cyblack_monitoring_ks, SubLObject datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_monitoring_ks_p(cyblack_monitoring_ks)) {
                    Errors.error($str_alt8$CYBLACK_MKS_GATHER_ALL_DIRECT_POS, cyblack_monitoring_ks);
                }
            }
            if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_monitoring_ks)) {
                return cyblack_ks.cyblack_internal_monitoring_ks_gather_all_direct_postings_method(cyblack_monitoring_ks, datatype);
            } else
                if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_monitoring_ks)) {
                    return cyblack_ks.cyblack_external_monitoring_ks_gather_all_direct_postings_method(cyblack_monitoring_ks, datatype);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_monitoring_ks, GATHER_ALL_DIRECT_POSTINGS, datatype);
                }

        }
    }

    public static final SubLObject cyblack_mks_perform_action(SubLObject cyblack_monitoring_ks, SubLObject activation_patterns) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_monitoring_ks_p(cyblack_monitoring_ks)) {
                    Errors.error($str_alt10$CYBLACK_MKS_PERFORM_ACTION___S_is, cyblack_monitoring_ks);
                }
            }
            if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_monitoring_ks)) {
                return cyblack_ks.cyblack_internal_monitoring_ks_perform_action_method(cyblack_monitoring_ks, activation_patterns);
            } else
                if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_monitoring_ks)) {
                    return cyblack_ks.cyblack_external_monitoring_ks_perform_action_method(cyblack_monitoring_ks, activation_patterns);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_monitoring_ks, PERFORM_ACTION, activation_patterns);
                }

        }
    }

    public static final SubLObject cyblack_ks_get_precondition_pattern(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt12$CYBLACK_KS_GET_PRECONDITION_PATTE, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_internal_knowledge_source_get_precondition_pattern_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_external_knowledge_source_get_precondition_pattern_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_internal_knowledge_source_get_precondition_pattern_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_external_knowledge_source_get_precondition_pattern_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_internal_knowledge_source_get_precondition_pattern_method(cyblack_knowledge_source);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_external_knowledge_source_get_precondition_pattern_method(cyblack_knowledge_source);
                                } else {
                                    return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, GET_PRECONDITION_PATTERN);
                                }





        }
    }

    public static final SubLObject cyblack_ks_set_precondition_pattern(SubLObject cyblack_knowledge_source, SubLObject new_precondition_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt14$CYBLACK_KS_SET_PRECONDITION_PATTE, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(cyblack_knowledge_source, new_precondition_pattern);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_external_knowledge_source_set_precondition_pattern_method(cyblack_knowledge_source, new_precondition_pattern);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_internal_monitoring_ks_set_precondition_pattern_method(cyblack_knowledge_source, new_precondition_pattern);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_external_monitoring_ks_set_precondition_pattern_method(cyblack_knowledge_source, new_precondition_pattern);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_internal_knowledge_source_set_precondition_pattern_method(cyblack_knowledge_source, new_precondition_pattern);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_external_knowledge_source_set_precondition_pattern_method(cyblack_knowledge_source, new_precondition_pattern);
                                } else {
                                    return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, SET_PRECONDITION_PATTERN, new_precondition_pattern);
                                }





        }
    }

    public static final SubLObject cyblack_ks_get_precondition_datatypes(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt16$CYBLACK_KS_GET_PRECONDITION_DATAT, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_internal_knowledge_source_get_precondition_datatypes_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_external_knowledge_source_get_precondition_datatypes_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_internal_knowledge_source_get_precondition_datatypes_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_external_knowledge_source_get_precondition_datatypes_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_internal_knowledge_source_get_precondition_datatypes_method(cyblack_knowledge_source);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_external_knowledge_source_get_precondition_datatypes_method(cyblack_knowledge_source);
                                } else {
                                    return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, GET_PRECONDITION_DATATYPES);
                                }





        }
    }

    public static final SubLObject cyblack_ks_get_knowledge_source_battery(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt18$CYBLACK_KS_GET_KNOWLEDGE_SOURCE_B, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_get_knowledge_source_battery_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_get_knowledge_source_battery_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_get_knowledge_source_battery_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_get_knowledge_source_battery_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_get_knowledge_source_battery_method(cyblack_knowledge_source);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_proto_knowledge_source_get_knowledge_source_battery_method(cyblack_knowledge_source);
                                } else {
                                    return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, GET_KNOWLEDGE_SOURCE_BATTERY);
                                }





        }
    }

    public static final SubLObject cyblack_ks_set_knowledge_source_battery(SubLObject cyblack_knowledge_source, SubLObject new_knowledge_source_battery) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt20$CYBLACK_KS_SET_KNOWLEDGE_SOURCE_B, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_set_knowledge_source_battery_method(cyblack_knowledge_source, new_knowledge_source_battery);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_set_knowledge_source_battery_method(cyblack_knowledge_source, new_knowledge_source_battery);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_set_knowledge_source_battery_method(cyblack_knowledge_source, new_knowledge_source_battery);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_set_knowledge_source_battery_method(cyblack_knowledge_source, new_knowledge_source_battery);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_set_knowledge_source_battery_method(cyblack_knowledge_source, new_knowledge_source_battery);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_proto_knowledge_source_set_knowledge_source_battery_method(cyblack_knowledge_source, new_knowledge_source_battery);
                                } else {
                                    return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, SET_KNOWLEDGE_SOURCE_BATTERY, new_knowledge_source_battery);
                                }





        }
    }

    public static final SubLObject cyblack_ks_stimulate(SubLObject cyblack_knowledge_source, SubLObject posting) {
        if (posting == UNPROVIDED) {
            posting = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt22$CYBLACK_KS_STIMULATE___S_is_not_a, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_defks.cyblack_auto_generated_internal_knowledge_source_stimulate_method(cyblack_knowledge_source, posting);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_external_knowledge_source_stimulate_method(cyblack_knowledge_source, posting);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_basic_knowledge_source_stimulate_method(cyblack_knowledge_source, posting);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_external_knowledge_source_stimulate_method(cyblack_knowledge_source, posting);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_basic_knowledge_source_stimulate_method(cyblack_knowledge_source, posting);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_external_knowledge_source_stimulate_method(cyblack_knowledge_source, posting);
                                } else {
                                    return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, STIMULATE, posting);
                                }





        }
    }

    public static final SubLObject cyblack_ks_generate_ksi(SubLObject cyblack_knowledge_source, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt24$CYBLACK_KS_GENERATE_KSI___S_is_no, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_generate_ksi_method(cyblack_knowledge_source, proposal);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_external_knowledge_source_generate_ksi_method(cyblack_knowledge_source, proposal);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_generate_ksi_method(cyblack_knowledge_source, proposal);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_external_knowledge_source_generate_ksi_method(cyblack_knowledge_source, proposal);
                        } else {
                            return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, GENERATE_KSI, proposal);
                        }



        }
    }

    public static final SubLObject cyblack_ks_post_proposal(SubLObject cyblack_knowledge_source, SubLObject proposal, SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt26$CYBLACK_KS_POST_PROPOSAL___S_is_n, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_post_proposal_method(cyblack_knowledge_source, proposal, v_agenda);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_post_proposal_method(cyblack_knowledge_source, proposal, v_agenda);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_post_proposal_method(cyblack_knowledge_source, proposal, v_agenda);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_post_proposal_method(cyblack_knowledge_source, proposal, v_agenda);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_post_proposal_method(cyblack_knowledge_source, proposal, v_agenda);
                            } else {
                                return methods.funcall_instance_method_with_2_args(cyblack_knowledge_source, POST_PROPOSAL, proposal, v_agenda);
                            }




        }
    }

    public static final SubLObject cyblack_ks_create_proposal(SubLObject cyblack_knowledge_source, SubLObject activation_pattern, SubLObject arg_if_on_startup) {
        if (arg_if_on_startup == UNPROVIDED) {
            arg_if_on_startup = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt28$CYBLACK_KS_CREATE_PROPOSAL___S_is, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_create_proposal_method(cyblack_knowledge_source, activation_pattern, arg_if_on_startup);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_external_knowledge_source_create_proposal_method(cyblack_knowledge_source, activation_pattern, arg_if_on_startup);
                } else
                    if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_external_knowledge_source_create_proposal_method(cyblack_knowledge_source, activation_pattern, arg_if_on_startup);
                    } else {
                        return methods.funcall_instance_method_with_2_args(cyblack_knowledge_source, CREATE_PROPOSAL, activation_pattern, arg_if_on_startup);
                    }


        }
    }

    public static final SubLObject cyblack_ks_get_application(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt30$CYBLACK_KS_GET_APPLICATION___S_is, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_basic_knowledge_source_get_application_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_basic_knowledge_source_get_application_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_basic_knowledge_source_get_application_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_basic_knowledge_source_get_application_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_basic_knowledge_source_get_application_method(cyblack_knowledge_source);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_basic_knowledge_source_get_application_method(cyblack_knowledge_source);
                                } else
                                    if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                        return cyblack_ks.cyblack_basic_knowledge_source_get_application_method(cyblack_knowledge_source);
                                    } else {
                                        return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, GET_APPLICATION);
                                    }






        }
    }

    public static final SubLObject cyblack_ks_set_application(SubLObject cyblack_knowledge_source, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt32$CYBLACK_KS_SET_APPLICATION___S_is, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_basic_knowledge_source_set_application_method(cyblack_knowledge_source, new_application);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_basic_knowledge_source_set_application_method(cyblack_knowledge_source, new_application);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_basic_knowledge_source_set_application_method(cyblack_knowledge_source, new_application);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_basic_knowledge_source_set_application_method(cyblack_knowledge_source, new_application);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_basic_knowledge_source_set_application_method(cyblack_knowledge_source, new_application);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_basic_knowledge_source_set_application_method(cyblack_knowledge_source, new_application);
                                } else
                                    if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                        return cyblack_ks.cyblack_basic_knowledge_source_set_application_method(cyblack_knowledge_source, new_application);
                                    } else {
                                        return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, SET_APPLICATION, new_application);
                                    }






        }
    }

    public static final SubLObject cyblack_ks_linked_to_panels_p(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt34$CYBLACK_KS_LINKED_TO_PANELS_P___S, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_basic_knowledge_source_linked_to_panels_p_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_basic_knowledge_source_linked_to_panels_p_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_basic_knowledge_source_linked_to_panels_p_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_basic_knowledge_source_linked_to_panels_p_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_basic_knowledge_source_linked_to_panels_p_method(cyblack_knowledge_source);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_basic_knowledge_source_linked_to_panels_p_method(cyblack_knowledge_source);
                                } else
                                    if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                        return cyblack_ks.cyblack_basic_knowledge_source_linked_to_panels_p_method(cyblack_knowledge_source);
                                    } else {
                                        return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, LINKED_TO_PANELS_P);
                                    }






        }
    }

    public static final SubLObject cyblack_ks_link_to_panels(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt36$CYBLACK_KS_LINK_TO_PANELS___S_is_, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_internal_knowledge_source_link_to_panels_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_external_knowledge_source_link_to_panels_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_internal_knowledge_source_link_to_panels_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_external_knowledge_source_link_to_panels_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_internal_knowledge_source_link_to_panels_method(cyblack_knowledge_source);
                            } else
                                if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                                    return cyblack_ks.cyblack_external_knowledge_source_link_to_panels_method(cyblack_knowledge_source);
                                } else
                                    if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                        return cyblack_ks.cyblack_basic_knowledge_source_link_to_panels_method(cyblack_knowledge_source);
                                    } else {
                                        return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, LINK_TO_PANELS);
                                    }






        }
    }

    public static final SubLObject cyblack_ks_post_at_will_p(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt38$CYBLACK_KS_POST_AT_WILL_P___S_is_, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_post_at_will_p_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_post_at_will_p_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_post_at_will_p_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_post_at_will_p_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_post_at_will_p_method(cyblack_knowledge_source);
                            } else {
                                return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, POST_AT_WILL_P);
                            }




        }
    }

    public static final SubLObject cyblack_ks_set_post_at_will(SubLObject cyblack_knowledge_source, SubLObject new_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt40$CYBLACK_KS_SET_POST_AT_WILL___S_i, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(cyblack_knowledge_source, new_state);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(cyblack_knowledge_source, new_state);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(cyblack_knowledge_source, new_state);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(cyblack_knowledge_source, new_state);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_set_post_at_will_method(cyblack_knowledge_source, new_state);
                            } else {
                                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, SET_POST_AT_WILL, new_state);
                            }




        }
    }

    public static final SubLObject cyblack_ks_add_panels_at_will_p(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt42$CYBLACK_KS_ADD_PANELS_AT_WILL_P__, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_add_panels_at_will_p_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_add_panels_at_will_p_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_add_panels_at_will_p_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_add_panels_at_will_p_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_add_panels_at_will_p_method(cyblack_knowledge_source);
                            } else {
                                return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, ADD_PANELS_AT_WILL_P);
                            }




        }
    }

    public static final SubLObject cyblack_ks_set_add_panels_at_will(SubLObject cyblack_knowledge_source, SubLObject new_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt44$CYBLACK_KS_SET_ADD_PANELS_AT_WILL, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_set_add_panels_at_will_method(cyblack_knowledge_source, new_state);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_set_add_panels_at_will_method(cyblack_knowledge_source, new_state);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_set_add_panels_at_will_method(cyblack_knowledge_source, new_state);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_set_add_panels_at_will_method(cyblack_knowledge_source, new_state);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_set_add_panels_at_will_method(cyblack_knowledge_source, new_state);
                            } else {
                                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, SET_ADD_PANELS_AT_WILL, new_state);
                            }




        }
    }

    public static final SubLObject cyblack_ks_remove_panels_at_will_p(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt46$CYBLACK_KS_REMOVE_PANELS_AT_WILL_, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_remove_panels_at_will_p_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_remove_panels_at_will_p_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_remove_panels_at_will_p_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_remove_panels_at_will_p_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_remove_panels_at_will_p_method(cyblack_knowledge_source);
                            } else {
                                return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, REMOVE_PANELS_AT_WILL_P);
                            }




        }
    }

    public static final SubLObject cyblack_ks_set_remove_panels_at_will(SubLObject cyblack_knowledge_source, SubLObject new_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt48$CYBLACK_KS_SET_REMOVE_PANELS_AT_W, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_set_remove_panels_at_will_method(cyblack_knowledge_source, new_state);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_set_remove_panels_at_will_method(cyblack_knowledge_source, new_state);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_set_remove_panels_at_will_method(cyblack_knowledge_source, new_state);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_set_remove_panels_at_will_method(cyblack_knowledge_source, new_state);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_set_remove_panels_at_will_method(cyblack_knowledge_source, new_state);
                            } else {
                                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, SET_REMOVE_PANELS_AT_WILL, new_state);
                            }




        }
    }

    public static final SubLObject cyblack_ks_add_posting_classes_at_will_p(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt50$CYBLACK_KS_ADD_POSTING_CLASSES_AT, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_add_posting_classes_at_will_p_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_add_posting_classes_at_will_p_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_add_posting_classes_at_will_p_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_add_posting_classes_at_will_p_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_add_posting_classes_at_will_p_method(cyblack_knowledge_source);
                            } else {
                                return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, ADD_POSTING_CLASSES_AT_WILL_P);
                            }




        }
    }

    public static final SubLObject cyblack_ks_set_add_posting_classes_at_will(SubLObject cyblack_knowledge_source, SubLObject new_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt52$CYBLACK_KS_SET_ADD_POSTING_CLASSE, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_set_add_posting_classes_at_will_method(cyblack_knowledge_source, new_state);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_set_add_posting_classes_at_will_method(cyblack_knowledge_source, new_state);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_set_add_posting_classes_at_will_method(cyblack_knowledge_source, new_state);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_set_add_posting_classes_at_will_method(cyblack_knowledge_source, new_state);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_set_add_posting_classes_at_will_method(cyblack_knowledge_source, new_state);
                            } else {
                                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, SET_ADD_POSTING_CLASSES_AT_WILL, new_state);
                            }




        }
    }

    public static final SubLObject cyblack_ks_add_knowledge_sources_at_will_p(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt54$CYBLACK_KS_ADD_KNOWLEDGE_SOURCES_, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_add_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_add_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_add_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_add_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_add_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
                            } else {
                                return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, ADD_KNOWLEDGE_SOURCES_AT_WILL_P);
                            }




        }
    }

    public static final SubLObject cyblack_ks_set_add_knowledge_sources_at_will(SubLObject cyblack_knowledge_source, SubLObject new_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt56$CYBLACK_KS_SET_ADD_KNOWLEDGE_SOUR, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_set_add_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_set_add_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_set_add_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_set_add_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_set_add_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
                            } else {
                                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, SET_ADD_KNOWLEDGE_SOURCES_AT_WILL, new_state);
                            }




        }
    }

    public static final SubLObject cyblack_ks_remove_knowledge_sources_at_will_p(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt58$CYBLACK_KS_REMOVE_KNOWLEDGE_SOURC, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_remove_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_remove_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_remove_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_remove_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_remove_knowledge_sources_at_will_p_method(cyblack_knowledge_source);
                            } else {
                                return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, REMOVE_KNOWLEDGE_SOURCES_AT_WILL_P);
                            }




        }
    }

    public static final SubLObject cyblack_ks_set_remove_knowledge_sources_at_will(SubLObject cyblack_knowledge_source, SubLObject new_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt60$CYBLACK_KS_SET_REMOVE_KNOWLEDGE_S, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_proto_knowledge_source_set_remove_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_proto_knowledge_source_set_remove_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_knowledge_source_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_proto_knowledge_source_set_remove_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_knowledge_source_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_proto_knowledge_source_set_remove_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_proto_knowledge_source_set_remove_knowledge_sources_at_will_method(cyblack_knowledge_source, new_state);
                            } else {
                                return methods.funcall_instance_method_with_1_args(cyblack_knowledge_source, SET_REMOVE_KNOWLEDGE_SOURCES_AT_WILL, new_state);
                            }




        }
    }

    public static final SubLObject cyblack_ks_unlink_from_panels(SubLObject cyblack_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ks.cyblack_knowledge_source_p(cyblack_knowledge_source)) {
                    Errors.error($str_alt62$CYBLACK_KS_UNLINK_FROM_PANELS___S, cyblack_knowledge_source);
                }
            }
            if (NIL != cyblack_defks.cyblack_auto_generated_internal_knowledge_source_p(cyblack_knowledge_source)) {
                return cyblack_ks.cyblack_basic_knowledge_source_unlink_from_panels_method(cyblack_knowledge_source);
            } else
                if (NIL != cyblack_defks.cyblack_auto_generated_external_knowledge_source_p(cyblack_knowledge_source)) {
                    return cyblack_ks.cyblack_basic_knowledge_source_unlink_from_panels_method(cyblack_knowledge_source);
                } else
                    if (NIL != cyblack_ks.cyblack_internal_monitoring_ks_p(cyblack_knowledge_source)) {
                        return cyblack_ks.cyblack_basic_knowledge_source_unlink_from_panels_method(cyblack_knowledge_source);
                    } else
                        if (NIL != cyblack_ks.cyblack_external_monitoring_ks_p(cyblack_knowledge_source)) {
                            return cyblack_ks.cyblack_basic_knowledge_source_unlink_from_panels_method(cyblack_knowledge_source);
                        } else
                            if (NIL != cyblack_ks.cyblack_basic_knowledge_source_p(cyblack_knowledge_source)) {
                                return cyblack_ks.cyblack_basic_knowledge_source_unlink_from_panels_method(cyblack_knowledge_source);
                            } else {
                                return methods.funcall_instance_method_with_0_args(cyblack_knowledge_source, UNLINK_FROM_PANELS);
                            }




        }
    }

    public static final SubLObject declare_cyblack_ks_dispatch_functions_file() {
        declareFunction("cyblack_mks_get_state_change_listener", "CYBLACK-MKS-GET-STATE-CHANGE-LISTENER", 1, 0, false);
        declareFunction("cyblack_mks_get_action", "CYBLACK-MKS-GET-ACTION", 1, 0, false);
        declareFunction("cyblack_mks_get_action_qualifiers", "CYBLACK-MKS-GET-ACTION-QUALIFIERS", 1, 0, false);
        declareFunction("cyblack_mks_gather_all_postings", "CYBLACK-MKS-GATHER-ALL-POSTINGS", 2, 0, false);
        declareFunction("cyblack_mks_gather_all_direct_postings", "CYBLACK-MKS-GATHER-ALL-DIRECT-POSTINGS", 2, 0, false);
        declareFunction("cyblack_mks_perform_action", "CYBLACK-MKS-PERFORM-ACTION", 2, 0, false);
        declareFunction("cyblack_ks_get_precondition_pattern", "CYBLACK-KS-GET-PRECONDITION-PATTERN", 1, 0, false);
        declareFunction("cyblack_ks_set_precondition_pattern", "CYBLACK-KS-SET-PRECONDITION-PATTERN", 2, 0, false);
        declareFunction("cyblack_ks_get_precondition_datatypes", "CYBLACK-KS-GET-PRECONDITION-DATATYPES", 1, 0, false);
        declareFunction("cyblack_ks_get_knowledge_source_battery", "CYBLACK-KS-GET-KNOWLEDGE-SOURCE-BATTERY", 1, 0, false);
        declareFunction("cyblack_ks_set_knowledge_source_battery", "CYBLACK-KS-SET-KNOWLEDGE-SOURCE-BATTERY", 2, 0, false);
        declareFunction("cyblack_ks_stimulate", "CYBLACK-KS-STIMULATE", 1, 1, false);
        declareFunction("cyblack_ks_generate_ksi", "CYBLACK-KS-GENERATE-KSI", 2, 0, false);
        declareFunction("cyblack_ks_post_proposal", "CYBLACK-KS-POST-PROPOSAL", 3, 0, false);
        declareFunction("cyblack_ks_create_proposal", "CYBLACK-KS-CREATE-PROPOSAL", 2, 1, false);
        declareFunction("cyblack_ks_get_application", "CYBLACK-KS-GET-APPLICATION", 1, 0, false);
        declareFunction("cyblack_ks_set_application", "CYBLACK-KS-SET-APPLICATION", 2, 0, false);
        declareFunction("cyblack_ks_linked_to_panels_p", "CYBLACK-KS-LINKED-TO-PANELS-P", 1, 0, false);
        declareFunction("cyblack_ks_link_to_panels", "CYBLACK-KS-LINK-TO-PANELS", 1, 0, false);
        declareFunction("cyblack_ks_post_at_will_p", "CYBLACK-KS-POST-AT-WILL-P", 1, 0, false);
        declareFunction("cyblack_ks_set_post_at_will", "CYBLACK-KS-SET-POST-AT-WILL", 2, 0, false);
        declareFunction("cyblack_ks_add_panels_at_will_p", "CYBLACK-KS-ADD-PANELS-AT-WILL-P", 1, 0, false);
        declareFunction("cyblack_ks_set_add_panels_at_will", "CYBLACK-KS-SET-ADD-PANELS-AT-WILL", 2, 0, false);
        declareFunction("cyblack_ks_remove_panels_at_will_p", "CYBLACK-KS-REMOVE-PANELS-AT-WILL-P", 1, 0, false);
        declareFunction("cyblack_ks_set_remove_panels_at_will", "CYBLACK-KS-SET-REMOVE-PANELS-AT-WILL", 2, 0, false);
        declareFunction("cyblack_ks_add_posting_classes_at_will_p", "CYBLACK-KS-ADD-POSTING-CLASSES-AT-WILL-P", 1, 0, false);
        declareFunction("cyblack_ks_set_add_posting_classes_at_will", "CYBLACK-KS-SET-ADD-POSTING-CLASSES-AT-WILL", 2, 0, false);
        declareFunction("cyblack_ks_add_knowledge_sources_at_will_p", "CYBLACK-KS-ADD-KNOWLEDGE-SOURCES-AT-WILL-P", 1, 0, false);
        declareFunction("cyblack_ks_set_add_knowledge_sources_at_will", "CYBLACK-KS-SET-ADD-KNOWLEDGE-SOURCES-AT-WILL", 2, 0, false);
        declareFunction("cyblack_ks_remove_knowledge_sources_at_will_p", "CYBLACK-KS-REMOVE-KNOWLEDGE-SOURCES-AT-WILL-P", 1, 0, false);
        declareFunction("cyblack_ks_set_remove_knowledge_sources_at_will", "CYBLACK-KS-SET-REMOVE-KNOWLEDGE-SOURCES-AT-WILL", 2, 0, false);
        declareFunction("cyblack_ks_unlink_from_panels", "CYBLACK-KS-UNLINK-FROM-PANELS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_ks_dispatch_functions_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_ks_dispatch_functions_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$CYBLACK_MKS_GET_STATE_CHANGE_LIST = makeString("CYBLACK-MKS-GET-STATE-CHANGE-LISTENER: ~S is not an instance of CYBLACK-MONITORING-KS.");



    static private final SubLString $str_alt2$CYBLACK_MKS_GET_ACTION___S_is_not = makeString("CYBLACK-MKS-GET-ACTION: ~S is not an instance of CYBLACK-MONITORING-KS.");



    static private final SubLString $str_alt4$CYBLACK_MKS_GET_ACTION_QUALIFIERS = makeString("CYBLACK-MKS-GET-ACTION-QUALIFIERS: ~S is not an instance of CYBLACK-MONITORING-KS.");



    static private final SubLString $str_alt6$CYBLACK_MKS_GATHER_ALL_POSTINGS__ = makeString("CYBLACK-MKS-GATHER-ALL-POSTINGS: ~S is not an instance of CYBLACK-MONITORING-KS.");

    private static final SubLSymbol GATHER_ALL_POSTINGS = makeSymbol("GATHER-ALL-POSTINGS");

    static private final SubLString $str_alt8$CYBLACK_MKS_GATHER_ALL_DIRECT_POS = makeString("CYBLACK-MKS-GATHER-ALL-DIRECT-POSTINGS: ~S is not an instance of CYBLACK-MONITORING-KS.");

    private static final SubLSymbol GATHER_ALL_DIRECT_POSTINGS = makeSymbol("GATHER-ALL-DIRECT-POSTINGS");

    static private final SubLString $str_alt10$CYBLACK_MKS_PERFORM_ACTION___S_is = makeString("CYBLACK-MKS-PERFORM-ACTION: ~S is not an instance of CYBLACK-MONITORING-KS.");



    static private final SubLString $str_alt12$CYBLACK_KS_GET_PRECONDITION_PATTE = makeString("CYBLACK-KS-GET-PRECONDITION-PATTERN: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt14$CYBLACK_KS_SET_PRECONDITION_PATTE = makeString("CYBLACK-KS-SET-PRECONDITION-PATTERN: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt16$CYBLACK_KS_GET_PRECONDITION_DATAT = makeString("CYBLACK-KS-GET-PRECONDITION-DATATYPES: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt18$CYBLACK_KS_GET_KNOWLEDGE_SOURCE_B = makeString("CYBLACK-KS-GET-KNOWLEDGE-SOURCE-BATTERY: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt20$CYBLACK_KS_SET_KNOWLEDGE_SOURCE_B = makeString("CYBLACK-KS-SET-KNOWLEDGE-SOURCE-BATTERY: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol SET_KNOWLEDGE_SOURCE_BATTERY = makeSymbol("SET-KNOWLEDGE-SOURCE-BATTERY");

    static private final SubLString $str_alt22$CYBLACK_KS_STIMULATE___S_is_not_a = makeString("CYBLACK-KS-STIMULATE: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt24$CYBLACK_KS_GENERATE_KSI___S_is_no = makeString("CYBLACK-KS-GENERATE-KSI: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt26$CYBLACK_KS_POST_PROPOSAL___S_is_n = makeString("CYBLACK-KS-POST-PROPOSAL: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol POST_PROPOSAL = makeSymbol("POST-PROPOSAL");

    static private final SubLString $str_alt28$CYBLACK_KS_CREATE_PROPOSAL___S_is = makeString("CYBLACK-KS-CREATE-PROPOSAL: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt30$CYBLACK_KS_GET_APPLICATION___S_is = makeString("CYBLACK-KS-GET-APPLICATION: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt32$CYBLACK_KS_SET_APPLICATION___S_is = makeString("CYBLACK-KS-SET-APPLICATION: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt34$CYBLACK_KS_LINKED_TO_PANELS_P___S = makeString("CYBLACK-KS-LINKED-TO-PANELS-P: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol LINKED_TO_PANELS_P = makeSymbol("LINKED-TO-PANELS-P");

    static private final SubLString $str_alt36$CYBLACK_KS_LINK_TO_PANELS___S_is_ = makeString("CYBLACK-KS-LINK-TO-PANELS: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt38$CYBLACK_KS_POST_AT_WILL_P___S_is_ = makeString("CYBLACK-KS-POST-AT-WILL-P: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol POST_AT_WILL_P = makeSymbol("POST-AT-WILL-P");

    static private final SubLString $str_alt40$CYBLACK_KS_SET_POST_AT_WILL___S_i = makeString("CYBLACK-KS-SET-POST-AT-WILL: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");



    static private final SubLString $str_alt42$CYBLACK_KS_ADD_PANELS_AT_WILL_P__ = makeString("CYBLACK-KS-ADD-PANELS-AT-WILL-P: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol ADD_PANELS_AT_WILL_P = makeSymbol("ADD-PANELS-AT-WILL-P");

    static private final SubLString $str_alt44$CYBLACK_KS_SET_ADD_PANELS_AT_WILL = makeString("CYBLACK-KS-SET-ADD-PANELS-AT-WILL: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol SET_ADD_PANELS_AT_WILL = makeSymbol("SET-ADD-PANELS-AT-WILL");

    static private final SubLString $str_alt46$CYBLACK_KS_REMOVE_PANELS_AT_WILL_ = makeString("CYBLACK-KS-REMOVE-PANELS-AT-WILL-P: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol REMOVE_PANELS_AT_WILL_P = makeSymbol("REMOVE-PANELS-AT-WILL-P");

    static private final SubLString $str_alt48$CYBLACK_KS_SET_REMOVE_PANELS_AT_W = makeString("CYBLACK-KS-SET-REMOVE-PANELS-AT-WILL: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol SET_REMOVE_PANELS_AT_WILL = makeSymbol("SET-REMOVE-PANELS-AT-WILL");

    static private final SubLString $str_alt50$CYBLACK_KS_ADD_POSTING_CLASSES_AT = makeString("CYBLACK-KS-ADD-POSTING-CLASSES-AT-WILL-P: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol ADD_POSTING_CLASSES_AT_WILL_P = makeSymbol("ADD-POSTING-CLASSES-AT-WILL-P");

    static private final SubLString $str_alt52$CYBLACK_KS_SET_ADD_POSTING_CLASSE = makeString("CYBLACK-KS-SET-ADD-POSTING-CLASSES-AT-WILL: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol SET_ADD_POSTING_CLASSES_AT_WILL = makeSymbol("SET-ADD-POSTING-CLASSES-AT-WILL");

    static private final SubLString $str_alt54$CYBLACK_KS_ADD_KNOWLEDGE_SOURCES_ = makeString("CYBLACK-KS-ADD-KNOWLEDGE-SOURCES-AT-WILL-P: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol ADD_KNOWLEDGE_SOURCES_AT_WILL_P = makeSymbol("ADD-KNOWLEDGE-SOURCES-AT-WILL-P");

    static private final SubLString $str_alt56$CYBLACK_KS_SET_ADD_KNOWLEDGE_SOUR = makeString("CYBLACK-KS-SET-ADD-KNOWLEDGE-SOURCES-AT-WILL: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol SET_ADD_KNOWLEDGE_SOURCES_AT_WILL = makeSymbol("SET-ADD-KNOWLEDGE-SOURCES-AT-WILL");

    static private final SubLString $str_alt58$CYBLACK_KS_REMOVE_KNOWLEDGE_SOURC = makeString("CYBLACK-KS-REMOVE-KNOWLEDGE-SOURCES-AT-WILL-P: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol REMOVE_KNOWLEDGE_SOURCES_AT_WILL_P = makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL-P");

    static private final SubLString $str_alt60$CYBLACK_KS_SET_REMOVE_KNOWLEDGE_S = makeString("CYBLACK-KS-SET-REMOVE-KNOWLEDGE-SOURCES-AT-WILL: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol SET_REMOVE_KNOWLEDGE_SOURCES_AT_WILL = makeSymbol("SET-REMOVE-KNOWLEDGE-SOURCES-AT-WILL");

    static private final SubLString $str_alt62$CYBLACK_KS_UNLINK_FROM_PANELS___S = makeString("CYBLACK-KS-UNLINK-FROM-PANELS: ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol UNLINK_FROM_PANELS = makeSymbol("UNLINK-FROM-PANELS");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_ks_dispatch_functions_file();
    }

    public void initializeVariables() {
        init_cyblack_ks_dispatch_functions_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_ks_dispatch_functions_file();
    }
}

