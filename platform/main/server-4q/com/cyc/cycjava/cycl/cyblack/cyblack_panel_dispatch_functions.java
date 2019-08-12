/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
 *  module:      CYBLACK-PANEL-DISPATCH-FUNCTIONS
 *  source file: /cyc/top/cycl/cyblack/cyblack-panel-dispatch-functions.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_panel_dispatch_functions extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_panel_dispatch_functions() {
    }

    public static final SubLFile me = new cyblack_panel_dispatch_functions();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_panel_dispatch_functions";

    // // Definitions
    public static final SubLObject cyblack_panel_clear_all_marks(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt0$CYBLACK_PANEL_CLEAR_ALL_MARKS___S, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_clear_all_marks_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_clear_all_marks_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_clear_all_marks_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_cycpanel.cyblack_basic_cycpanel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_panel_clear_all_marks_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_clear_all_marks_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_sequence_panel_clear_all_marks_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_clear_all_marks_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_clear_all_marks_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_clear_all_marks_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_clear_all_marks_method(v_cyblack_panel);
                                                } else {
                                                    return methods.funcall_instance_method_with_0_args(v_cyblack_panel, CLEAR_ALL_MARKS);
                                                }









        }
    }

    public static final SubLObject cyblack_panel_add_mark(SubLObject v_cyblack_panel, SubLObject mark) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt2$CYBLACK_PANEL_ADD_MARK___S_is_not, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_add_mark_method(v_cyblack_panel, mark);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_add_mark_method(v_cyblack_panel, mark);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_add_mark_method(v_cyblack_panel, mark);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_add_mark_method(v_cyblack_panel, mark);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_add_mark_method(v_cyblack_panel, mark);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_add_mark_method(v_cyblack_panel, mark);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_add_mark_method(v_cyblack_panel, mark);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_add_mark_method(v_cyblack_panel, mark);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_add_mark_method(v_cyblack_panel, mark);
                                            } else {
                                                return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ADD_MARK, mark);
                                            }








        }
    }

    public static final SubLObject cyblack_panel_remove_mark(SubLObject v_cyblack_panel, SubLObject mark) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt4$CYBLACK_PANEL_REMOVE_MARK___S_is_, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_remove_mark_method(v_cyblack_panel, mark);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_remove_mark_method(v_cyblack_panel, mark);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_remove_mark_method(v_cyblack_panel, mark);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_remove_mark_method(v_cyblack_panel, mark);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_remove_mark_method(v_cyblack_panel, mark);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_remove_mark_method(v_cyblack_panel, mark);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_remove_mark_method(v_cyblack_panel, mark);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_remove_mark_method(v_cyblack_panel, mark);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_remove_mark_method(v_cyblack_panel, mark);
                                            } else {
                                                return methods.funcall_instance_method_with_1_args(v_cyblack_panel, REMOVE_MARK, mark);
                                            }








        }
    }

    public static final SubLObject cyblack_panel_has_mark_p(SubLObject v_cyblack_panel, SubLObject mark) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt6$CYBLACK_PANEL_HAS_MARK_P___S_is_n, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_has_mark_p_method(v_cyblack_panel, mark);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_has_mark_p_method(v_cyblack_panel, mark);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_has_mark_p_method(v_cyblack_panel, mark);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_has_mark_p_method(v_cyblack_panel, mark);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_has_mark_p_method(v_cyblack_panel, mark);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_has_mark_p_method(v_cyblack_panel, mark);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_has_mark_p_method(v_cyblack_panel, mark);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_has_mark_p_method(v_cyblack_panel, mark);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_has_mark_p_method(v_cyblack_panel, mark);
                                            } else {
                                                return methods.funcall_instance_method_with_1_args(v_cyblack_panel, HAS_MARK_P, mark);
                                            }








        }
    }

    public static final SubLObject cyblack_panel_get_datatype(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt8$CYBLACK_PANEL_GET_DATATYPE___S_is, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_get_datatype_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_get_datatype_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_get_datatype_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_get_datatype_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_get_datatype_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_get_datatype_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_get_datatype_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_get_datatype_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_get_datatype_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_get_datatype_method(v_cyblack_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_get_datatype_method(v_cyblack_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_0_args(v_cyblack_panel, GET_DATATYPE);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_set_datatype(SubLObject v_cyblack_panel, SubLObject new_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt10$CYBLACK_PANEL_SET_DATATYPE___S_is, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_set_datatype_method(v_cyblack_panel, new_datatype);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_set_datatype_method(v_cyblack_panel, new_datatype);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, SET_DATATYPE, new_datatype);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_get_super_panels(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt12$CYBLACK_PANEL_GET_SUPER_PANELS___, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_get_super_panels_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_get_super_panels_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_get_super_panels_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_get_super_panels_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_get_super_panels_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_get_super_panels_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_get_super_panels_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_get_super_panels_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_get_super_panels_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_get_super_panels_method(v_cyblack_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_get_super_panels_method(v_cyblack_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_0_args(v_cyblack_panel, GET_SUPER_PANELS);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_get_sub_panels(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt14$CYBLACK_PANEL_GET_SUB_PANELS___S_, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_get_sub_panels_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_get_sub_panels_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_get_sub_panels_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_get_sub_panels_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_get_sub_panels_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_get_sub_panels_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_get_sub_panels_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_get_sub_panels_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_get_sub_panels_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_get_sub_panels_method(v_cyblack_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_get_sub_panels_method(v_cyblack_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_0_args(v_cyblack_panel, GET_SUB_PANELS);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_add_super_panel(SubLObject v_cyblack_panel, SubLObject new_super_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt16$CYBLACK_PANEL_ADD_SUPER_PANEL___S, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_add_super_panel_method(v_cyblack_panel, new_super_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ADD_SUPER_PANEL, new_super_panel);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_remove_super_panel(SubLObject v_cyblack_panel, SubLObject old_super_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt18$CYBLACK_PANEL_REMOVE_SUPER_PANEL_, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_remove_super_panel_method(v_cyblack_panel, old_super_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, REMOVE_SUPER_PANEL, old_super_panel);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_add_sub_panel(SubLObject v_cyblack_panel, SubLObject new_sub_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt20$CYBLACK_PANEL_ADD_SUB_PANEL___S_i, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_add_sub_panel_method(v_cyblack_panel, new_sub_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ADD_SUB_PANEL, new_sub_panel);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_remove_sub_panel(SubLObject v_cyblack_panel, SubLObject old_sub_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt22$CYBLACK_PANEL_REMOVE_SUB_PANEL___, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_remove_sub_panel_method(v_cyblack_panel, old_sub_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, REMOVE_SUB_PANEL, old_sub_panel);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_add_posting(SubLObject v_cyblack_panel, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt24$CYBLACK_PANEL_ADD_POSTING___S_is_, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_add_posting_method(v_cyblack_panel, posting);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_add_posting_method(v_cyblack_panel, posting);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_add_posting_method(v_cyblack_panel, posting);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_add_posting_method(v_cyblack_panel, posting);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_add_posting_method(v_cyblack_panel, posting);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_derived_panels.cyblack_partitioned_stack_panel_add_posting_method(v_cyblack_panel, posting);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_add_posting_method(v_cyblack_panel, posting);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_ui_panel.cyblack_basic_user_interaction_panel_add_posting_method(v_cyblack_panel, posting);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_stack_panel_add_posting_method(v_cyblack_panel, posting);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_singleton_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_singleton_panel_add_posting_method(v_cyblack_panel, posting);
                                                } else
                                                    if (NIL != cyblack_cycpanel.cyblack_basic_backward_panel_p(v_cyblack_panel)) {
                                                        return cyblack_cycpanel.cyblack_basic_backward_panel_add_posting_method(v_cyblack_panel, posting);
                                                    } else
                                                        if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                            return cyblack_panel.cyblack_basic_panel_add_posting_method(v_cyblack_panel, posting);
                                                        } else
                                                            if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                                return cyblack_panel.cyblack_basic_virtual_panel_add_posting_method(v_cyblack_panel, posting);
                                                            } else {
                                                                return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ADD_POSTING, posting);
                                                            }












        }
    }

    public static final SubLObject cyblack_panel_remove_posting(SubLObject v_cyblack_panel, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt26$CYBLACK_PANEL_REMOVE_POSTING___S_, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_remove_posting_method(v_cyblack_panel, posting);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_remove_posting_method(v_cyblack_panel, posting);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_remove_posting_method(v_cyblack_panel, posting);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_remove_posting_method(v_cyblack_panel, posting);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_remove_posting_method(v_cyblack_panel, posting);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_remove_posting_method(v_cyblack_panel, posting);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_remove_posting_method(v_cyblack_panel, posting);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_remove_posting_method(v_cyblack_panel, posting);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_remove_posting_method(v_cyblack_panel, posting);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_singleton_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_remove_posting_method(v_cyblack_panel, posting);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_panel_remove_posting_method(v_cyblack_panel, posting);
                                                    } else
                                                        if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                            return cyblack_panel.cyblack_basic_virtual_panel_remove_posting_method(v_cyblack_panel, posting);
                                                        } else {
                                                            return methods.funcall_instance_method_with_1_args(v_cyblack_panel, REMOVE_POSTING, posting);
                                                        }











        }
    }

    public static final SubLObject cyblack_panel_iterate_over_all_direct_postings(SubLObject v_cyblack_panel, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt28$CYBLACK_PANEL_ITERATE_OVER_ALL_DI, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_derived_panels.cyblack_partitioned_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_derived_panels.cyblack_partitioned_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_iterate_over_all_direct_postings_method(v_cyblack_panel, posting_visitor);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ITERATE_OVER_ALL_DIRECT_POSTINGS, posting_visitor);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_iterate_over_all_postings(SubLObject v_cyblack_panel, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt30$CYBLACK_PANEL_ITERATE_OVER_ALL_PO, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_derived_panels.cyblack_partitioned_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_derived_panels.cyblack_partitioned_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_iterate_over_all_postings_method(v_cyblack_panel, posting_visitor);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ITERATE_OVER_ALL_POSTINGS, posting_visitor);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_iterate_over_all_direct_knowledge_sources(SubLObject v_cyblack_panel, SubLObject ks_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt32$CYBLACK_PANEL_ITERATE_OVER_ALL_DI, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_iterate_over_all_direct_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES, ks_visitor);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_iterate_over_all_knowledge_sources(SubLObject v_cyblack_panel, SubLObject ks_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt34$CYBLACK_PANEL_ITERATE_OVER_ALL_KN, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_iterate_over_all_knowledge_sources_method(v_cyblack_panel, ks_visitor);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ITERATE_OVER_ALL_KNOWLEDGE_SOURCES, ks_visitor);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_get_direct_knowledge_sources(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt36$CYBLACK_PANEL_GET_DIRECT_KNOWLEDG, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_get_direct_knowledge_sources_method(v_cyblack_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_0_args(v_cyblack_panel, GET_DIRECT_KNOWLEDGE_SOURCES);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_get_direct_postings(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt38$CYBLACK_PANEL_GET_DIRECT_POSTINGS, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_get_direct_postings_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_get_direct_postings_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_get_direct_postings_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_get_direct_postings_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_get_direct_postings_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_get_direct_postings_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_get_direct_postings_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_get_direct_postings_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_get_direct_postings_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_get_direct_postings_method(v_cyblack_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_get_direct_postings_method(v_cyblack_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_0_args(v_cyblack_panel, GET_DIRECT_POSTINGS);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_get_direct_active_postings(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt40$CYBLACK_PANEL_GET_DIRECT_ACTIVE_P, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_get_direct_active_postings_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_get_direct_active_postings_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_get_direct_active_postings_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_get_direct_active_postings_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_get_direct_active_postings_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_get_direct_active_postings_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_get_direct_active_postings_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_get_direct_active_postings_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_get_direct_active_postings_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_get_direct_active_postings_method(v_cyblack_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_get_direct_active_postings_method(v_cyblack_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_0_args(v_cyblack_panel, GET_DIRECT_ACTIVE_POSTINGS);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_iterate_over_all_direct_posting_daemons(SubLObject v_cyblack_panel, SubLObject daemon_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt42$CYBLACK_PANEL_ITERATE_OVER_ALL_DI, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_iterate_over_all_direct_posting_daemons_method(v_cyblack_panel, daemon_visitor);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS, daemon_visitor);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_get_all_knowledge_sources(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt44$CYBLACK_PANEL_GET_ALL_KNOWLEDGE_S, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_get_all_knowledge_sources_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_get_all_knowledge_sources_method(v_cyblack_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_0_args(v_cyblack_panel, GET_ALL_KNOWLEDGE_SOURCES);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_get_all_postings(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt46$CYBLACK_PANEL_GET_ALL_POSTINGS___, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_get_all_postings_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_get_all_postings_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_get_all_postings_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_get_all_postings_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_get_all_postings_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_get_all_postings_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_get_all_postings_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_get_all_postings_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_get_all_postings_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_get_all_postings_method(v_cyblack_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_get_all_postings_method(v_cyblack_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_0_args(v_cyblack_panel, GET_ALL_POSTINGS);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_get_all_active_postings(SubLObject v_cyblack_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt48$CYBLACK_PANEL_GET_ALL_ACTIVE_POST, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(v_cyblack_panel);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(v_cyblack_panel);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(v_cyblack_panel);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_get_all_active_postings_method(v_cyblack_panel);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_get_all_active_postings_method(v_cyblack_panel);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(v_cyblack_panel);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(v_cyblack_panel);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(v_cyblack_panel);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(v_cyblack_panel);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(v_cyblack_panel);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_get_all_active_postings_method(v_cyblack_panel);
                                                    } else {
                                                        return methods.funcall_instance_method_with_0_args(v_cyblack_panel, GET_ALL_ACTIVE_POSTINGS);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_deactivate_posting(SubLObject v_cyblack_panel, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt50$CYBLACK_PANEL_DEACTIVATE_POSTING_, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_deactivate_posting_method(v_cyblack_panel, posting);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_deactivate_posting_method(v_cyblack_panel, posting);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_deactivate_posting_method(v_cyblack_panel, posting);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_deactivate_posting_method(v_cyblack_panel, posting);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_deactivate_posting_method(v_cyblack_panel, posting);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_derived_panels.cyblack_partitioned_panel_deactivate_posting_method(v_cyblack_panel, posting);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_derived_panels.cyblack_partitioned_panel_deactivate_posting_method(v_cyblack_panel, posting);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_deactivate_posting_method(v_cyblack_panel, posting);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_deactivate_posting_method(v_cyblack_panel, posting);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_deactivate_posting_method(v_cyblack_panel, posting);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_deactivate_posting_method(v_cyblack_panel, posting);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, DEACTIVATE_POSTING, posting);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_activate_posting(SubLObject v_cyblack_panel, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt52$CYBLACK_PANEL_ACTIVATE_POSTING___, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_activate_posting_method(v_cyblack_panel, posting);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_activate_posting_method(v_cyblack_panel, posting);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_activate_posting_method(v_cyblack_panel, posting);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_activate_posting_method(v_cyblack_panel, posting);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_activate_posting_method(v_cyblack_panel, posting);
                            } else
                                if (NIL != cyblack_derived_panels.cyblack_partitioned_stack_panel_p(v_cyblack_panel)) {
                                    return cyblack_derived_panels.cyblack_partitioned_panel_activate_posting_method(v_cyblack_panel, posting);
                                } else
                                    if (NIL != cyblack_derived_panels.cyblack_partitioned_panel_p(v_cyblack_panel)) {
                                        return cyblack_derived_panels.cyblack_partitioned_panel_activate_posting_method(v_cyblack_panel, posting);
                                    } else
                                        if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_panel_p(v_cyblack_panel)) {
                                            return cyblack_panel.cyblack_basic_panel_activate_posting_method(v_cyblack_panel, posting);
                                        } else
                                            if (NIL != cyblack_panel.cyblack_stack_panel_p(v_cyblack_panel)) {
                                                return cyblack_panel.cyblack_basic_panel_activate_posting_method(v_cyblack_panel, posting);
                                            } else
                                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                                    return cyblack_panel.cyblack_basic_panel_activate_posting_method(v_cyblack_panel, posting);
                                                } else
                                                    if (NIL != cyblack_panel.cyblack_basic_virtual_panel_p(v_cyblack_panel)) {
                                                        return cyblack_panel.cyblack_basic_virtual_panel_activate_posting_method(v_cyblack_panel, posting);
                                                    } else {
                                                        return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ACTIVATE_POSTING, posting);
                                                    }










        }
    }

    public static final SubLObject cyblack_panel_stimulate_all_posting_daemons(SubLObject v_cyblack_panel, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt54$CYBLACK_PANEL_STIMULATE_ALL_POSTI, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_stimulate_all_posting_daemons_method(v_cyblack_panel, environment, UNPROVIDED);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_stimulate_all_posting_daemons_method(v_cyblack_panel, environment, UNPROVIDED);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_stimulate_all_posting_daemons_method(v_cyblack_panel, environment, UNPROVIDED);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_stimulate_all_posting_daemons_method(v_cyblack_panel, environment, UNPROVIDED);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_stimulate_all_posting_daemons_method(v_cyblack_panel, environment, UNPROVIDED);
                            } else
                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_stimulate_all_posting_daemons_method(v_cyblack_panel, environment, UNPROVIDED);
                                } else {
                                    return methods.funcall_instance_method_with_1_args(v_cyblack_panel, STIMULATE_ALL_POSTING_DAEMONS, environment);
                                }





        }
    }

    public static final SubLObject cyblack_panel_add_direct_knowledge_source(SubLObject v_cyblack_panel, SubLObject knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt56$CYBLACK_PANEL_ADD_DIRECT_KNOWLEDG, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_add_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_add_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_add_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_add_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_add_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                            } else
                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_add_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                                } else {
                                    return methods.funcall_instance_method_with_1_args(v_cyblack_panel, ADD_DIRECT_KNOWLEDGE_SOURCE, knowledge_source);
                                }





        }
    }

    public static final SubLObject cyblack_panel_remove_direct_knowledge_source(SubLObject v_cyblack_panel, SubLObject knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_panel.cyblack_panel_p(v_cyblack_panel)) {
                    Errors.error($str_alt58$CYBLACK_PANEL_REMOVE_DIRECT_KNOWL, v_cyblack_panel);
                }
            }
            if (NIL != cyblack_ui_panel.cyblack_basic_backward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                return cyblack_panel.cyblack_basic_panel_remove_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
            } else
                if (NIL != cyblack_ui_panel.cyblack_basic_forward_panel_user_interaction_cycpanel_p(v_cyblack_panel)) {
                    return cyblack_panel.cyblack_basic_panel_remove_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                } else
                    if (NIL != cyblack_ui_panel.cyblack_basic_user_interaction_cycpanel_p(v_cyblack_panel)) {
                        return cyblack_panel.cyblack_basic_panel_remove_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                    } else
                        if (NIL != cyblack_ui_panel.cyblack_basic_sequence_user_interaction_panel_p(v_cyblack_panel)) {
                            return cyblack_panel.cyblack_basic_sequence_panel_remove_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                        } else
                            if (NIL != cyblack_panel.cyblack_basic_sequence_panel_p(v_cyblack_panel)) {
                                return cyblack_panel.cyblack_basic_sequence_panel_remove_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                            } else
                                if (NIL != cyblack_panel.cyblack_basic_panel_p(v_cyblack_panel)) {
                                    return cyblack_panel.cyblack_basic_panel_remove_direct_knowledge_source_method(v_cyblack_panel, knowledge_source);
                                } else {
                                    return methods.funcall_instance_method_with_1_args(v_cyblack_panel, REMOVE_DIRECT_KNOWLEDGE_SOURCE, knowledge_source);
                                }





        }
    }

    public static final SubLObject declare_cyblack_panel_dispatch_functions_file() {
        declareFunction("cyblack_panel_clear_all_marks", "CYBLACK-PANEL-CLEAR-ALL-MARKS", 1, 0, false);
        declareFunction("cyblack_panel_add_mark", "CYBLACK-PANEL-ADD-MARK", 2, 0, false);
        declareFunction("cyblack_panel_remove_mark", "CYBLACK-PANEL-REMOVE-MARK", 2, 0, false);
        declareFunction("cyblack_panel_has_mark_p", "CYBLACK-PANEL-HAS-MARK-P", 2, 0, false);
        declareFunction("cyblack_panel_get_datatype", "CYBLACK-PANEL-GET-DATATYPE", 1, 0, false);
        declareFunction("cyblack_panel_set_datatype", "CYBLACK-PANEL-SET-DATATYPE", 2, 0, false);
        declareFunction("cyblack_panel_get_super_panels", "CYBLACK-PANEL-GET-SUPER-PANELS", 1, 0, false);
        declareFunction("cyblack_panel_get_sub_panels", "CYBLACK-PANEL-GET-SUB-PANELS", 1, 0, false);
        declareFunction("cyblack_panel_add_super_panel", "CYBLACK-PANEL-ADD-SUPER-PANEL", 2, 0, false);
        declareFunction("cyblack_panel_remove_super_panel", "CYBLACK-PANEL-REMOVE-SUPER-PANEL", 2, 0, false);
        declareFunction("cyblack_panel_add_sub_panel", "CYBLACK-PANEL-ADD-SUB-PANEL", 2, 0, false);
        declareFunction("cyblack_panel_remove_sub_panel", "CYBLACK-PANEL-REMOVE-SUB-PANEL", 2, 0, false);
        declareFunction("cyblack_panel_add_posting", "CYBLACK-PANEL-ADD-POSTING", 2, 0, false);
        declareFunction("cyblack_panel_remove_posting", "CYBLACK-PANEL-REMOVE-POSTING", 2, 0, false);
        declareFunction("cyblack_panel_iterate_over_all_direct_postings", "CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS", 2, 0, false);
        declareFunction("cyblack_panel_iterate_over_all_postings", "CYBLACK-PANEL-ITERATE-OVER-ALL-POSTINGS", 2, 0, false);
        declareFunction("cyblack_panel_iterate_over_all_direct_knowledge_sources", "CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES", 2, 0, false);
        declareFunction("cyblack_panel_iterate_over_all_knowledge_sources", "CYBLACK-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES", 2, 0, false);
        declareFunction("cyblack_panel_get_direct_knowledge_sources", "CYBLACK-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES", 1, 0, false);
        declareFunction("cyblack_panel_get_direct_postings", "CYBLACK-PANEL-GET-DIRECT-POSTINGS", 1, 0, false);
        declareFunction("cyblack_panel_get_direct_active_postings", "CYBLACK-PANEL-GET-DIRECT-ACTIVE-POSTINGS", 1, 0, false);
        declareFunction("cyblack_panel_iterate_over_all_direct_posting_daemons", "CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS", 2, 0, false);
        declareFunction("cyblack_panel_get_all_knowledge_sources", "CYBLACK-PANEL-GET-ALL-KNOWLEDGE-SOURCES", 1, 0, false);
        declareFunction("cyblack_panel_get_all_postings", "CYBLACK-PANEL-GET-ALL-POSTINGS", 1, 0, false);
        declareFunction("cyblack_panel_get_all_active_postings", "CYBLACK-PANEL-GET-ALL-ACTIVE-POSTINGS", 1, 0, false);
        declareFunction("cyblack_panel_deactivate_posting", "CYBLACK-PANEL-DEACTIVATE-POSTING", 2, 0, false);
        declareFunction("cyblack_panel_activate_posting", "CYBLACK-PANEL-ACTIVATE-POSTING", 2, 0, false);
        declareFunction("cyblack_panel_stimulate_all_posting_daemons", "CYBLACK-PANEL-STIMULATE-ALL-POSTING-DAEMONS", 1, 1, false);
        declareFunction("cyblack_panel_add_direct_knowledge_source", "CYBLACK-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("cyblack_panel_remove_direct_knowledge_source", "CYBLACK-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_panel_dispatch_functions_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_panel_dispatch_functions_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$CYBLACK_PANEL_CLEAR_ALL_MARKS___S = makeString("CYBLACK-PANEL-CLEAR-ALL-MARKS: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt2$CYBLACK_PANEL_ADD_MARK___S_is_not = makeString("CYBLACK-PANEL-ADD-MARK: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt4$CYBLACK_PANEL_REMOVE_MARK___S_is_ = makeString("CYBLACK-PANEL-REMOVE-MARK: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt6$CYBLACK_PANEL_HAS_MARK_P___S_is_n = makeString("CYBLACK-PANEL-HAS-MARK-P: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt8$CYBLACK_PANEL_GET_DATATYPE___S_is = makeString("CYBLACK-PANEL-GET-DATATYPE: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt10$CYBLACK_PANEL_SET_DATATYPE___S_is = makeString("CYBLACK-PANEL-SET-DATATYPE: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt12$CYBLACK_PANEL_GET_SUPER_PANELS___ = makeString("CYBLACK-PANEL-GET-SUPER-PANELS: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt14$CYBLACK_PANEL_GET_SUB_PANELS___S_ = makeString("CYBLACK-PANEL-GET-SUB-PANELS: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt16$CYBLACK_PANEL_ADD_SUPER_PANEL___S = makeString("CYBLACK-PANEL-ADD-SUPER-PANEL: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt18$CYBLACK_PANEL_REMOVE_SUPER_PANEL_ = makeString("CYBLACK-PANEL-REMOVE-SUPER-PANEL: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt20$CYBLACK_PANEL_ADD_SUB_PANEL___S_i = makeString("CYBLACK-PANEL-ADD-SUB-PANEL: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt22$CYBLACK_PANEL_REMOVE_SUB_PANEL___ = makeString("CYBLACK-PANEL-REMOVE-SUB-PANEL: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt24$CYBLACK_PANEL_ADD_POSTING___S_is_ = makeString("CYBLACK-PANEL-ADD-POSTING: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt26$CYBLACK_PANEL_REMOVE_POSTING___S_ = makeString("CYBLACK-PANEL-REMOVE-POSTING: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt28$CYBLACK_PANEL_ITERATE_OVER_ALL_DI = makeString("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS: ~S is not an instance of CYBLACK-PANEL.");

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_POSTINGS = makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS");

    static private final SubLString $str_alt30$CYBLACK_PANEL_ITERATE_OVER_ALL_PO = makeString("CYBLACK-PANEL-ITERATE-OVER-ALL-POSTINGS: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt32$CYBLACK_PANEL_ITERATE_OVER_ALL_DI = makeString("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES: ~S is not an instance of CYBLACK-PANEL.");

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_KNOWLEDGE_SOURCES = makeSymbol("ITERATE-OVER-ALL-DIRECT-KNOWLEDGE-SOURCES");

    static private final SubLString $str_alt34$CYBLACK_PANEL_ITERATE_OVER_ALL_KN = makeString("CYBLACK-PANEL-ITERATE-OVER-ALL-KNOWLEDGE-SOURCES: ~S is not an instance of CYBLACK-PANEL.");

    private static final SubLSymbol ITERATE_OVER_ALL_KNOWLEDGE_SOURCES = makeSymbol("ITERATE-OVER-ALL-KNOWLEDGE-SOURCES");

    static private final SubLString $str_alt36$CYBLACK_PANEL_GET_DIRECT_KNOWLEDG = makeString("CYBLACK-PANEL-GET-DIRECT-KNOWLEDGE-SOURCES: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt38$CYBLACK_PANEL_GET_DIRECT_POSTINGS = makeString("CYBLACK-PANEL-GET-DIRECT-POSTINGS: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt40$CYBLACK_PANEL_GET_DIRECT_ACTIVE_P = makeString("CYBLACK-PANEL-GET-DIRECT-ACTIVE-POSTINGS: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt42$CYBLACK_PANEL_ITERATE_OVER_ALL_DI = makeString("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS: ~S is not an instance of CYBLACK-PANEL.");

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_POSTING_DAEMONS = makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTING-DAEMONS");

    static private final SubLString $str_alt44$CYBLACK_PANEL_GET_ALL_KNOWLEDGE_S = makeString("CYBLACK-PANEL-GET-ALL-KNOWLEDGE-SOURCES: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt46$CYBLACK_PANEL_GET_ALL_POSTINGS___ = makeString("CYBLACK-PANEL-GET-ALL-POSTINGS: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt48$CYBLACK_PANEL_GET_ALL_ACTIVE_POST = makeString("CYBLACK-PANEL-GET-ALL-ACTIVE-POSTINGS: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt50$CYBLACK_PANEL_DEACTIVATE_POSTING_ = makeString("CYBLACK-PANEL-DEACTIVATE-POSTING: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt52$CYBLACK_PANEL_ACTIVATE_POSTING___ = makeString("CYBLACK-PANEL-ACTIVATE-POSTING: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt54$CYBLACK_PANEL_STIMULATE_ALL_POSTI = makeString("CYBLACK-PANEL-STIMULATE-ALL-POSTING-DAEMONS: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt56$CYBLACK_PANEL_ADD_DIRECT_KNOWLEDG = makeString("CYBLACK-PANEL-ADD-DIRECT-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-PANEL.");



    static private final SubLString $str_alt58$CYBLACK_PANEL_REMOVE_DIRECT_KNOWL = makeString("CYBLACK-PANEL-REMOVE-DIRECT-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-PANEL.");



    // // Initializers
    public void declareFunctions() {
        declare_cyblack_panel_dispatch_functions_file();
    }

    public void initializeVariables() {
        init_cyblack_panel_dispatch_functions_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_panel_dispatch_functions_file();
    }
}

