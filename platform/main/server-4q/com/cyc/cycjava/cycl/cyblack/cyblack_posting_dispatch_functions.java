/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
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
 *  module:      CYBLACK-POSTING-DISPATCH-FUNCTIONS
 *  source file: /cyc/top/cycl/cyblack/cyblack-posting-dispatch-functions.lisp
 *  created:     2019/07/03 17:38:44
 */
public final class cyblack_posting_dispatch_functions extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_posting_dispatch_functions() {
    }

    public static final SubLFile me = new cyblack_posting_dispatch_functions();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_posting_dispatch_functions";

    // // Definitions
    public static final SubLObject cyblack_posting_internalize_external_representation(SubLObject v_cyblack_posting, SubLObject external_representation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt0$CYBLACK_POSTING_INTERNALIZE_EXTER, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_internalize_external_representation_method(v_cyblack_posting, external_representation);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_internalize_external_representation_method(v_cyblack_posting, external_representation);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, INTERNALIZE_EXTERNAL_REPRESENTATION, external_representation);
                }

        }
    }

    public static final SubLObject cyblack_posting_internalize_content(SubLObject v_cyblack_posting, SubLObject content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt2$CYBLACK_POSTING_INTERNALIZE_CONTE, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_internalize_content_method(v_cyblack_posting, content);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_internalize_content_method(v_cyblack_posting, content);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, INTERNALIZE_CONTENT, content);
                }

        }
    }

    public static final SubLObject cyblack_posting_internalize_attributes(SubLObject v_cyblack_posting, SubLObject attributes) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt4$CYBLACK_POSTING_INTERNALIZE_ATTRI, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_internalize_attributes_method(v_cyblack_posting, attributes);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_internalize_attributes_method(v_cyblack_posting, attributes);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, INTERNALIZE_ATTRIBUTES, attributes);
                }

        }
    }

    public static final SubLObject cyblack_posting_externalize_internal_representation(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt6$CYBLACK_POSTING_EXTERNALIZE_INTER, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_externalize_internal_representation_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_externalize_internal_representation_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, EXTERNALIZE_INTERNAL_REPRESENTATION);
                }

        }
    }

    public static final SubLObject cyblack_posting_externalize_content(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt8$CYBLACK_POSTING_EXTERNALIZE_CONTE, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_externalize_content_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_externalize_content_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, EXTERNALIZE_CONTENT);
                }

        }
    }

    public static final SubLObject cyblack_posting_externalize_attributes(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt10$CYBLACK_POSTING_EXTERNALIZE_ATTRI, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_externalize_attributes_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_externalize_attributes_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, EXTERNALIZE_ATTRIBUTES);
                }

        }
    }

    public static final SubLObject cyblack_posting_get_datatype(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt12$CYBLACK_POSTING_GET_DATATYPE___S_, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_get_datatype_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_get_datatype_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, GET_DATATYPE);
                }

        }
    }

    public static final SubLObject cyblack_posting_set_datatype(SubLObject v_cyblack_posting, SubLObject new_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt14$CYBLACK_POSTING_SET_DATATYPE___S_, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_set_datatype_method(v_cyblack_posting, new_datatype);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_set_datatype_method(v_cyblack_posting, new_datatype);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, SET_DATATYPE, new_datatype);
                }

        }
    }

    public static final SubLObject cyblack_posting_get_panel(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt16$CYBLACK_POSTING_GET_PANEL___S_is_, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_get_panel_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_get_panel_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, GET_PANEL);
                }

        }
    }

    public static final SubLObject cyblack_posting_set_panel(SubLObject v_cyblack_posting, SubLObject new_panel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt18$CYBLACK_POSTING_SET_PANEL___S_is_, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_set_panel_method(v_cyblack_posting, new_panel);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_set_panel_method(v_cyblack_posting, new_panel);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, SET_PANEL, new_panel);
                }

        }
    }

    public static final SubLObject cyblack_posting_get_activation_pattern(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt20$CYBLACK_POSTING_GET_ACTIVATION_PA, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_get_activation_pattern_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_get_activation_pattern_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, GET_ACTIVATION_PATTERN);
                }

        }
    }

    public static final SubLObject cyblack_posting_set_activation_pattern(SubLObject v_cyblack_posting, SubLObject activation_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt22$CYBLACK_POSTING_SET_ACTIVATION_PA, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_set_activation_pattern_method(v_cyblack_posting, activation_pattern);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_set_activation_pattern_method(v_cyblack_posting, activation_pattern);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, SET_ACTIVATION_PATTERN, activation_pattern);
                }

        }
    }

    public static final SubLObject cyblack_posting_get_ksi(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt24$CYBLACK_POSTING_GET_KSI___S_is_no, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_get_ksi_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_get_ksi_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, GET_KSI);
                }

        }
    }

    public static final SubLObject cyblack_posting_set_ksi(SubLObject v_cyblack_posting, SubLObject new_ksi) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt26$CYBLACK_POSTING_SET_KSI___S_is_no, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_set_ksi_method(v_cyblack_posting, new_ksi);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_set_ksi_method(v_cyblack_posting, new_ksi);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, SET_KSI, new_ksi);
                }

        }
    }

    public static final SubLObject cyblack_posting_get_ks(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt28$CYBLACK_POSTING_GET_KS___S_is_not, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_get_ks_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_get_ks_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, GET_KS);
                }

        }
    }

    public static final SubLObject cyblack_posting_get_confidence(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt30$CYBLACK_POSTING_GET_CONFIDENCE___, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_get_confidence_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_get_confidence_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, GET_CONFIDENCE);
                }

        }
    }

    public static final SubLObject cyblack_posting_recompute_confidence(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt32$CYBLACK_POSTING_RECOMPUTE_CONFIDE, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_recompute_confidence_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_recompute_confidence_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, RECOMPUTE_CONFIDENCE);
                }

        }
    }

    public static final SubLObject cyblack_posting_invalidate(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt34$CYBLACK_POSTING_INVALIDATE___S_is, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_invalidate_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_invalidate_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, INVALIDATE);
                }

        }
    }

    public static final SubLObject cyblack_posting_valid_p(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt36$CYBLACK_POSTING_VALID_P___S_is_no, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_valid_p_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_valid_p_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, VALID_P);
                }

        }
    }

    public static final SubLObject cyblack_posting_set_active(SubLObject v_cyblack_posting, SubLObject new_active_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt38$CYBLACK_POSTING_SET_ACTIVE___S_is, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_set_active_method(v_cyblack_posting, new_active_state);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_set_active_method(v_cyblack_posting, new_active_state);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, SET_ACTIVE, new_active_state);
                }

        }
    }

    public static final SubLObject cyblack_posting_set_application(SubLObject v_cyblack_posting, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt40$CYBLACK_POSTING_SET_APPLICATION__, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_object.cyblack_object_set_application_method(v_cyblack_posting, new_application);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_object.cyblack_object_set_application_method(v_cyblack_posting, new_application);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, SET_APPLICATION, new_application);
                }

        }
    }

    public static final SubLObject cyblack_posting_active_p(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt42$CYBLACK_POSTING_ACTIVE_P___S_is_n, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_active_p_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_active_p_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, ACTIVE_P);
                }

        }
    }

    public static final SubLObject cyblack_posting_immutable_p(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt44$CYBLACK_POSTING_IMMUTABLE_P___S_i, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_immutable_p_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_immutable_p_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, IMMUTABLE_P);
                }

        }
    }

    public static final SubLObject cyblack_posting_set_immutable(SubLObject v_cyblack_posting, SubLObject new_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt46$CYBLACK_POSTING_SET_IMMUTABLE___S, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_set_immutable_method(v_cyblack_posting, new_state);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_set_immutable_method(v_cyblack_posting, new_state);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, SET_IMMUTABLE, new_state);
                }

        }
    }

    public static final SubLObject cyblack_posting_on_post(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt48$CYBLACK_POSTING_ON_POST___S_is_no, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_on_post_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_on_post_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, ON_POST);
                }

        }
    }

    public static final SubLObject cyblack_posting_set_confidence(SubLObject v_cyblack_posting, SubLObject new_confidence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt50$CYBLACK_POSTING_SET_CONFIDENCE___, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_set_confidence_method(v_cyblack_posting, new_confidence);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_set_confidence_method(v_cyblack_posting, new_confidence);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, SET_CONFIDENCE, new_confidence);
                }

        }
    }

    public static final SubLObject cyblack_posting_get_support_type(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt52$CYBLACK_POSTING_GET_SUPPORT_TYPE_, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_get_support_type_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_get_support_type_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, GET_SUPPORT_TYPE);
                }

        }
    }

    public static final SubLObject cyblack_posting_set_support_type(SubLObject v_cyblack_posting, SubLObject new_support_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt54$CYBLACK_POSTING_SET_SUPPORT_TYPE_, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_set_support_type_method(v_cyblack_posting, new_support_type);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_set_support_type_method(v_cyblack_posting, new_support_type);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_posting, SET_SUPPORT_TYPE, new_support_type);
                }

        }
    }

    public static final SubLObject cyblack_posting_after_stimulation(SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(v_cyblack_posting)) {
                    Errors.error($str_alt56$CYBLACK_POSTING_AFTER_STIMULATION, v_cyblack_posting);
                }
            }
            if (NIL != cyblack_posting.cyblack_basic_posting_p(v_cyblack_posting)) {
                return cyblack_posting.cyblack_basic_posting_after_stimulation_method(v_cyblack_posting);
            } else
                if (NIL != cyblack_posting.cyblack_serialized_posting_p(v_cyblack_posting)) {
                    return cyblack_posting.cyblack_serialized_posting_after_stimulation_method(v_cyblack_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_posting, AFTER_STIMULATION);
                }

        }
    }

    public static final SubLObject declare_cyblack_posting_dispatch_functions_file() {
        declareFunction("cyblack_posting_internalize_external_representation", "CYBLACK-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION", 2, 0, false);
        declareFunction("cyblack_posting_internalize_content", "CYBLACK-POSTING-INTERNALIZE-CONTENT", 2, 0, false);
        declareFunction("cyblack_posting_internalize_attributes", "CYBLACK-POSTING-INTERNALIZE-ATTRIBUTES", 2, 0, false);
        declareFunction("cyblack_posting_externalize_internal_representation", "CYBLACK-POSTING-EXTERNALIZE-INTERNAL-REPRESENTATION", 1, 0, false);
        declareFunction("cyblack_posting_externalize_content", "CYBLACK-POSTING-EXTERNALIZE-CONTENT", 1, 0, false);
        declareFunction("cyblack_posting_externalize_attributes", "CYBLACK-POSTING-EXTERNALIZE-ATTRIBUTES", 1, 0, false);
        declareFunction("cyblack_posting_get_datatype", "CYBLACK-POSTING-GET-DATATYPE", 1, 0, false);
        declareFunction("cyblack_posting_set_datatype", "CYBLACK-POSTING-SET-DATATYPE", 2, 0, false);
        declareFunction("cyblack_posting_get_panel", "CYBLACK-POSTING-GET-PANEL", 1, 0, false);
        declareFunction("cyblack_posting_set_panel", "CYBLACK-POSTING-SET-PANEL", 2, 0, false);
        declareFunction("cyblack_posting_get_activation_pattern", "CYBLACK-POSTING-GET-ACTIVATION-PATTERN", 1, 0, false);
        declareFunction("cyblack_posting_set_activation_pattern", "CYBLACK-POSTING-SET-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("cyblack_posting_get_ksi", "CYBLACK-POSTING-GET-KSI", 1, 0, false);
        declareFunction("cyblack_posting_set_ksi", "CYBLACK-POSTING-SET-KSI", 2, 0, false);
        declareFunction("cyblack_posting_get_ks", "CYBLACK-POSTING-GET-KS", 1, 0, false);
        declareFunction("cyblack_posting_get_confidence", "CYBLACK-POSTING-GET-CONFIDENCE", 1, 0, false);
        declareFunction("cyblack_posting_recompute_confidence", "CYBLACK-POSTING-RECOMPUTE-CONFIDENCE", 1, 0, false);
        declareFunction("cyblack_posting_invalidate", "CYBLACK-POSTING-INVALIDATE", 1, 0, false);
        declareFunction("cyblack_posting_valid_p", "CYBLACK-POSTING-VALID-P", 1, 0, false);
        declareFunction("cyblack_posting_set_active", "CYBLACK-POSTING-SET-ACTIVE", 2, 0, false);
        declareFunction("cyblack_posting_set_application", "CYBLACK-POSTING-SET-APPLICATION", 2, 0, false);
        declareFunction("cyblack_posting_active_p", "CYBLACK-POSTING-ACTIVE-P", 1, 0, false);
        declareFunction("cyblack_posting_immutable_p", "CYBLACK-POSTING-IMMUTABLE-P", 1, 0, false);
        declareFunction("cyblack_posting_set_immutable", "CYBLACK-POSTING-SET-IMMUTABLE", 2, 0, false);
        declareFunction("cyblack_posting_on_post", "CYBLACK-POSTING-ON-POST", 1, 0, false);
        declareFunction("cyblack_posting_set_confidence", "CYBLACK-POSTING-SET-CONFIDENCE", 2, 0, false);
        declareFunction("cyblack_posting_get_support_type", "CYBLACK-POSTING-GET-SUPPORT-TYPE", 1, 0, false);
        declareFunction("cyblack_posting_set_support_type", "CYBLACK-POSTING-SET-SUPPORT-TYPE", 2, 0, false);
        declareFunction("cyblack_posting_after_stimulation", "CYBLACK-POSTING-AFTER-STIMULATION", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_posting_dispatch_functions_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_posting_dispatch_functions_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$CYBLACK_POSTING_INTERNALIZE_EXTER = makeString("CYBLACK-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION: ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol INTERNALIZE_EXTERNAL_REPRESENTATION = makeSymbol("INTERNALIZE-EXTERNAL-REPRESENTATION");

    static private final SubLString $str_alt2$CYBLACK_POSTING_INTERNALIZE_CONTE = makeString("CYBLACK-POSTING-INTERNALIZE-CONTENT: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt4$CYBLACK_POSTING_INTERNALIZE_ATTRI = makeString("CYBLACK-POSTING-INTERNALIZE-ATTRIBUTES: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt6$CYBLACK_POSTING_EXTERNALIZE_INTER = makeString("CYBLACK-POSTING-EXTERNALIZE-INTERNAL-REPRESENTATION: ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol EXTERNALIZE_INTERNAL_REPRESENTATION = makeSymbol("EXTERNALIZE-INTERNAL-REPRESENTATION");

    static private final SubLString $str_alt8$CYBLACK_POSTING_EXTERNALIZE_CONTE = makeString("CYBLACK-POSTING-EXTERNALIZE-CONTENT: ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol EXTERNALIZE_CONTENT = makeSymbol("EXTERNALIZE-CONTENT");

    static private final SubLString $str_alt10$CYBLACK_POSTING_EXTERNALIZE_ATTRI = makeString("CYBLACK-POSTING-EXTERNALIZE-ATTRIBUTES: ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol EXTERNALIZE_ATTRIBUTES = makeSymbol("EXTERNALIZE-ATTRIBUTES");

    static private final SubLString $str_alt12$CYBLACK_POSTING_GET_DATATYPE___S_ = makeString("CYBLACK-POSTING-GET-DATATYPE: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt14$CYBLACK_POSTING_SET_DATATYPE___S_ = makeString("CYBLACK-POSTING-SET-DATATYPE: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt16$CYBLACK_POSTING_GET_PANEL___S_is_ = makeString("CYBLACK-POSTING-GET-PANEL: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt18$CYBLACK_POSTING_SET_PANEL___S_is_ = makeString("CYBLACK-POSTING-SET-PANEL: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt20$CYBLACK_POSTING_GET_ACTIVATION_PA = makeString("CYBLACK-POSTING-GET-ACTIVATION-PATTERN: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt22$CYBLACK_POSTING_SET_ACTIVATION_PA = makeString("CYBLACK-POSTING-SET-ACTIVATION-PATTERN: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt24$CYBLACK_POSTING_GET_KSI___S_is_no = makeString("CYBLACK-POSTING-GET-KSI: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt26$CYBLACK_POSTING_SET_KSI___S_is_no = makeString("CYBLACK-POSTING-SET-KSI: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt28$CYBLACK_POSTING_GET_KS___S_is_not = makeString("CYBLACK-POSTING-GET-KS: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt30$CYBLACK_POSTING_GET_CONFIDENCE___ = makeString("CYBLACK-POSTING-GET-CONFIDENCE: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt32$CYBLACK_POSTING_RECOMPUTE_CONFIDE = makeString("CYBLACK-POSTING-RECOMPUTE-CONFIDENCE: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt34$CYBLACK_POSTING_INVALIDATE___S_is = makeString("CYBLACK-POSTING-INVALIDATE: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt36$CYBLACK_POSTING_VALID_P___S_is_no = makeString("CYBLACK-POSTING-VALID-P: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt38$CYBLACK_POSTING_SET_ACTIVE___S_is = makeString("CYBLACK-POSTING-SET-ACTIVE: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt40$CYBLACK_POSTING_SET_APPLICATION__ = makeString("CYBLACK-POSTING-SET-APPLICATION: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt42$CYBLACK_POSTING_ACTIVE_P___S_is_n = makeString("CYBLACK-POSTING-ACTIVE-P: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt44$CYBLACK_POSTING_IMMUTABLE_P___S_i = makeString("CYBLACK-POSTING-IMMUTABLE-P: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt46$CYBLACK_POSTING_SET_IMMUTABLE___S = makeString("CYBLACK-POSTING-SET-IMMUTABLE: ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol SET_IMMUTABLE = makeSymbol("SET-IMMUTABLE");

    static private final SubLString $str_alt48$CYBLACK_POSTING_ON_POST___S_is_no = makeString("CYBLACK-POSTING-ON-POST: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt50$CYBLACK_POSTING_SET_CONFIDENCE___ = makeString("CYBLACK-POSTING-SET-CONFIDENCE: ~S is not an instance of CYBLACK-POSTING.");



    static private final SubLString $str_alt52$CYBLACK_POSTING_GET_SUPPORT_TYPE_ = makeString("CYBLACK-POSTING-GET-SUPPORT-TYPE: ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol GET_SUPPORT_TYPE = makeSymbol("GET-SUPPORT-TYPE");

    static private final SubLString $str_alt54$CYBLACK_POSTING_SET_SUPPORT_TYPE_ = makeString("CYBLACK-POSTING-SET-SUPPORT-TYPE: ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol SET_SUPPORT_TYPE = makeSymbol("SET-SUPPORT-TYPE");

    static private final SubLString $str_alt56$CYBLACK_POSTING_AFTER_STIMULATION = makeString("CYBLACK-POSTING-AFTER-STIMULATION: ~S is not an instance of CYBLACK-POSTING.");



    // // Initializers
    public void declareFunctions() {
        declare_cyblack_posting_dispatch_functions_file();
    }

    public void initializeVariables() {
        init_cyblack_posting_dispatch_functions_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_posting_dispatch_functions_file();
    }
}

