/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HTML-TM-RELATION-EDITING
 *  source file: /cyc/top/cycl/thesaurus/html-tm-relation-editing.lisp
 *  created:     2019/07/03 17:38:32
 */
public final class html_tm_relation_editing extends SubLTranslatedFile implements V02 {
    // // Constructor
    private html_tm_relation_editing() {
    }

    public static final SubLFile me = new html_tm_relation_editing();


    // // Definitions
    public static final SubLObject clear_define_relation_state() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE, NIL, UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject set_define_relation_value(SubLObject tag, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assoc(tag, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE), UNPROVIDED, UNPROVIDED)) {
                rplacd(assoc(tag, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE), UNPROVIDED, UNPROVIDED), value);
            } else {
                tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE, acons(tag, value, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE)), UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject set_define_relation_symmetric() {
        set_define_relation_value($SYMMETRIC_, $$$symmetric);
        set_define_relation_value($ARG1_TYPE, $PT);
        set_define_relation_value($ARG2_TYPE, $PT);
        if (get_define_relation_value($ARG1_FORMAT) != get_define_relation_value($ARG2_FORMAT)) {
            set_define_relation_value($ARG1_FORMAT, NIL);
            set_define_relation_value($ARG2_FORMAT, NIL);
        }
        return NIL;
    }

    public static final SubLObject set_define_relation_type(SubLObject type) {
        set_define_relation_value($RELATION_TYPE, type);
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($HIERARCHICAL)) {
                set_define_relation_value($ARG1_TYPE, $PT);
                set_define_relation_value($ARG2_TYPE, $PT);
                set_define_relation_value($ARG1_FORMAT, $MANY);
                set_define_relation_value($ARG2_FORMAT, $MANY);
                set_define_relation_value($kw11$TRANSITIVE_, $$$transitive);
                set_define_relation_value($SYMMETRIC_, $$$asymmetric);
            } else
                if ((pcase_var.eql($LEXICAL) || pcase_var.eql($DOCUMENTATION)) || pcase_var.eql($URL)) {
                    set_define_relation_value($ARG1_TYPE, $PT);
                    set_define_relation_value($ARG2_TYPE, $NON_PT);
                    set_define_relation_value($SYMMETRIC_, $$$asymmetric);
                    set_define_relation_value($kw11$TRANSITIVE_, NIL);
                }

        }
        return NIL;
    }

    public static final SubLObject get_define_relation_value(SubLObject tag) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return assoc(tag, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE), UNPROVIDED, UNPROVIDED).rest();
        }
    }

    public static final SubLObject html_show_define_relation_state() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE)) {
                html_utilities.html_princ($str_alt18$Nothing_has_been_defined_yet_);
                return NIL;
            }
            {
                SubLObject relation_name = get_define_relation_value($RELATION_NAME);
                SubLObject inverse_name = get_define_relation_value($INVERSE_NAME);
                SubLObject relation_type = get_define_relation_value($RELATION_TYPE);
                SubLObject comment = get_define_relation_value($COMMENT);
                SubLObject arg1_type = get_define_relation_value($ARG1_TYPE);
                SubLObject arg2_type = get_define_relation_value($ARG2_TYPE);
                SubLObject arg1_format = get_define_relation_value($ARG1_FORMAT);
                SubLObject arg2_format = get_define_relation_value($ARG2_FORMAT);
                SubLObject transitiveP = get_define_relation_value($kw11$TRANSITIVE_);
                SubLObject symmetricP = get_define_relation_value($SYMMETRIC_);
                SubLObject broaders = append(get_define_relation_value($GENLPREDS), get_define_relation_value($GENLINVERSE));
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != relation_name) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt24$Relation_Name__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(relation_name);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != inverse_name) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt25$Inverse_Name__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(inverse_name);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } else {
                            if (NIL != relation_name) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt26$Inverse_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt27$This_relation_has_no_inverse_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        if (NIL != relation_type) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt28$Type___);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject pcase_var = relation_type;
                                                if (pcase_var.eql($HIERARCHICAL)) {
                                                    html_utilities.html_princ($$$Hierarchical);
                                                } else
                                                    if (pcase_var.eql($LEXICAL)) {
                                                        html_utilities.html_princ($$$Lexical);
                                                    } else
                                                        if (pcase_var.eql($DOCUMENTATION)) {
                                                            html_utilities.html_princ($$$Documentation);
                                                        } else
                                                            if (pcase_var.eql($URL)) {
                                                                html_utilities.html_princ($$$URL);
                                                            } else
                                                                if (pcase_var.eql($CUSTOM)) {
                                                                    html_utilities.html_princ($$$Custom);
                                                                }




                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != comment) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt36$Comment__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(comment);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if ((NIL != arg1_type) && (NIL != arg2_type)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt37$The_first_value__, relation_name);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject pcase_var = arg1_type;
                                                if (pcase_var.eql($PT)) {
                                                    html_utilities.html_princ($$$Must_be_a_Preferred_Term);
                                                } else
                                                    if (pcase_var.eql($NON_PT)) {
                                                        html_utilities.html_princ($$$Cannot_be_a_Preferred_Term);
                                                    } else {
                                                        html_utilities.html_princ($str_alt40$Error__Bad_value_for_arg1_type);
                                                    }

                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt41$The_second_value__, relation_name);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject pcase_var = arg2_type;
                                                if (pcase_var.eql($PT)) {
                                                    html_utilities.html_princ($$$Must_be_a_Preferred_Term);
                                                } else
                                                    if (pcase_var.eql($NON_PT)) {
                                                        html_utilities.html_princ($$$Cannot_be_a_Preferred_Term);
                                                    } else {
                                                        html_utilities.html_princ($str_alt42$Error__Bad_value_for_arg2_type);
                                                    }

                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if ((NIL != arg1_format) && (NIL != arg2_format)) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt43$Cardinality__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(tm_cardinality_string(arg1_format, arg2_format));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != transitiveP) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt44$Property_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($$$Transitive);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != symmetricP) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt44$Property_);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ(Strings.string_capitalize(symmetricP, UNPROVIDED, UNPROVIDED));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                        if (NIL != broaders) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str_alt46$Broader_Relations__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject cdolist_list_var = broaders;
                                                SubLObject broader = NIL;
                                                for (broader = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , broader = cdolist_list_var.first()) {
                                                    html_utilities.html_princ(broader);
                                                    html_utilities.html_br();
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject tm_define_relation(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clear_define_relation_state();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($str_alt47$Define_Relation___Type);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($str_alt47$Define_Relation___Type);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($str_alt47$Define_Relation___Type);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt50$tm_define_relation);
                                    if (NIL != tm_internals.editing_allowedP()) {
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt51$tm_handle_define_relation, T, UNPROVIDED);
                                                html_utilities.html_princ($str_alt52$Choose_the_type_of_relation_to_de);
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_radio_input($$$type, $str_alt54$_HIERARCHICAL, UNPROVIDED);
                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt55$Hierarchical__);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt56$Hierarchical_relations_link_prefe);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_br();
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_radio_input($$$type, $str_alt57$_LEXICAL, UNPROVIDED);
                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt58$Lexical__);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt59$Lexical_relations_link_a_preferre);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_radio_input($$$type, $str_alt60$_DOCUMENTATION, UNPROVIDED);
                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt61$Documentation__);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt62$Documentation_relations_link_a_pr);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_radio_input($$$type, $str_alt63$_URL, UNPROVIDED);
                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt64$URL__);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt65$URL_relations_link_a_preferred_te);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_radio_input($$$type, $str_alt66$_CUSTOM, T);
                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt67$Custom__);
                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                        html_utilities.html_princ($str_alt68$Choose_this_type_if_your_relation);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } else {
                                        html_thesaurus.tm_report_editing_disabled();
                                    }
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_define_relation(SubLObject args) {
        {
            SubLObject type = read_from_string_ignoring_errors(html_utilities.html_extract_input($$$type, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            set_define_relation_type(type);
            tm_define_relation_name(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject tm_define_relation_name(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($str_alt72$Define_Relation___Name);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ($str_alt72$Define_Relation___Name);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event($str_alt72$Define_Relation___Name);
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                    html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt73$tm_define_relation_name);
                                    if (NIL != tm_internals.editing_allowedP()) {
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt74$tm_handle_define_relation_name, T, UNPROVIDED);
                                                {
                                                    SubLObject type = get_define_relation_value($RELATION_TYPE);
                                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt75$Enter_Relation_Name_);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_text_input($$$name, $str_alt77$, $int$30);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt79$Inverse_Options_);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            if (type != $LEXICAL) {
                                                                                html_utilities.html_radio_input($$$inverse, $str_alt81$_NONE, member(type, $list_alt82, UNPROVIDED, UNPROVIDED));
                                                                                html_utilities.html_princ($str_alt83$_This_relation_has_no_inverse_);
                                                                                html_utilities.html_br();
                                                                            }
                                                                            if (NIL == subl_promotions.memberP(type, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                                                                                html_utilities.html_radio_input($$$inverse, $str_alt85$_SELF, UNPROVIDED);
                                                                                html_utilities.html_princ($str_alt86$_This_relation_is_its_own_inverse);
                                                                                html_utilities.html_br();
                                                                            }
                                                                            html_utilities.html_radio_input($$$inverse, $str_alt87$_OTHER, eq(type, $LEXICAL));
                                                                            html_utilities.html_princ($str_alt88$_Inverse_Name__);
                                                                            html_utilities.html_br();
                                                                            html_utilities.html_text_input($str_alt89$inverse_name, $str_alt77$, $int$30);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_princ($str_alt90$The_relation_as_defined_so_far_);
                                                html_show_define_relation_state();
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } else {
                                        html_thesaurus.tm_report_editing_disabled();
                                    }
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_define_relation_name(SubLObject args) {
        {
            SubLObject relation_name = string_utilities.trim_whitespace(html_utilities.html_extract_input($$$name, args));
            SubLObject inverseP = html_utilities.html_extract_input($$$inverse, args);
            SubLObject inverse_name = string_utilities.trim_whitespace(html_utilities.html_extract_input($str_alt89$inverse_name, args));
            SubLObject symmetricP = equalp(get_define_relation_value($SYMMETRIC_), $$$asymmetric);
            if (relation_name.equalp($str_alt77$)) {
                return html_thesaurus.tm_error($str_alt92$No_relation_name_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != find_if(symbol_function(WHITESPACEP), relation_name, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return html_thesaurus.tm_error($str_alt94$Relation_and_inverse_names_can_t_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            relation_name = Strings.string_upcase(relation_name, UNPROVIDED, UNPROVIDED);
            if (!inverseP.isString()) {
                return html_thesaurus.tm_error($str_alt95$You_must_choose_one_of_the_Invers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            inverseP = read_from_string_ignoring_errors(inverseP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject pcase_var = inverseP;
                if (pcase_var.eql($SELF)) {
                    if (NIL == symmetricP) {
                        inverse_name = relation_name;
                    } else {
                        return html_thesaurus.tm_error($str_alt97$_A_Relations_are_asymmetric_and_s, Strings.string_capitalize(format(NIL, $str_alt98$_A, get_define_relation_value($RELATION_TYPE)), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (pcase_var.eql($NONE)) {
                        inverse_name = NIL;
                    } else
                        if (pcase_var.eql($OTHER)) {
                            if (inverse_name.equalp($str_alt77$)) {
                                return html_thesaurus.tm_error($str_alt101$No_name_was_specified_for_the_inv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != find_if(symbol_function(WHITESPACEP), inverse_name, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                return html_thesaurus.tm_error($str_alt94$Relation_and_inverse_names_can_t_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if ((NIL == symmetricP) || (!inverse_name.equalp(relation_name))) {
                                inverse_name = Strings.string_upcase(inverse_name, UNPROVIDED, UNPROVIDED);
                            } else {
                                return html_thesaurus.tm_error($str_alt97$_A_Relations_are_asymmetric_and_s, Strings.string_capitalize(format(NIL, $str_alt98$_A, get_define_relation_value($RELATION_TYPE)), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            return html_thesaurus.tm_error($str_alt102$Implementation_error__can_t_handl, inverseP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }


            }
            if (NIL != tm_datastructures.tm_abbreviation_lookup(relation_name)) {
                return html_thesaurus.tm_error($str_alt103$The_name__A_is_already_in_use_, relation_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (((NIL != inverse_name) && (!inverse_name.equalp(relation_name))) && (NIL != tm_datastructures.tm_abbreviation_lookup(inverse_name))) {
                return html_thesaurus.tm_error($str_alt103$The_name__A_is_already_in_use_, inverse_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            tm_define_relation_2(relation_name, inverse_name);
        }
        return NIL;
    }

    public static final SubLObject tm_define_relation_2(SubLObject relation_name, SubLObject inverse_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            set_define_relation_value($RELATION_NAME, relation_name);
            set_define_relation_value($INVERSE_NAME, inverse_name);
            if (relation_name.equalp(inverse_name)) {
                set_define_relation_symmetric();
            }
            {
                SubLObject title = format(NIL, $str_alt105$Define_Relation___A, relation_name);
                if ((NIL != inverse_name) && (!inverse_name.equalp(relation_name))) {
                    title = cconcatenate(title, format(NIL, $str_alt106$_and__A, inverse_name));
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(title);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(title);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt107$tm_define_relation_2);
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt108$tm_handle_define_relation_2, T, UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt109$Describe_the_meaning_of__A__, relation_name);
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($$$comment);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($int$60);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(THREE_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_princ($str_alt77$);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt112$Fill_in_an_example___It_doesn_t_h);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt113$1_);
                                                                        html_utilities.html_text_input($str_alt114$term_1, $str_alt77$, TWENTY_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ($str_alt115$___);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                        if (true) {
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ(relation_name);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ($str_alt115$___);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                if (NIL != inverse_name) {
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_princ($str_alt117$___);
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                            if (true) {
                                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                                html_utilities.html_markup(html_utilities.html_align($CENTER));
                                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                            }
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_princ(inverse_name);
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                                try {
                                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                                    html_utilities.html_princ($str_alt117$___);
                                                                                                } finally {
                                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                                                                                }
                                                                                            }
                                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt118$2_);
                                                                        html_utilities.html_text_input($str_alt119$term_2, $str_alt77$, TWENTY_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_princ($str_alt90$The_relation_as_defined_so_far_);
                                        html_utilities.html_br();
                                        html_show_define_relation_state();
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_define_relation_example_string(SubLObject arg1, SubLObject arg2, SubLObject relation_name, SubLObject inverse_name) {
        if (NIL != inverse_name) {
            return format(NIL, $str_alt120$__Example_uses____A__A__A_____A__, new SubLObject[]{ arg1, relation_name, arg2, arg2, inverse_name, arg1 });
        } else {
            return format(NIL, $str_alt121$__Example_use____A__A__A, new SubLObject[]{ arg1, relation_name, arg2 });
        }
    }

    public static final SubLObject tm_handle_define_relation_2(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE)) {
                return html_thesaurus.tm_error($str_alt122$There_is_no_Define_Relation_in_pr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject comment = string_utilities.trim_whitespace(html_utilities.html_extract_input($$$comment, args));
                SubLObject term_1 = string_utilities.trim_whitespace(html_utilities.html_extract_input($str_alt114$term_1, args));
                SubLObject term_2 = string_utilities.trim_whitespace(html_utilities.html_extract_input($str_alt119$term_2, args));
                SubLObject current_comment = get_define_relation_value($COMMENT);
                if (comment.equalp($str_alt77$) && (NIL == current_comment)) {
                    return html_thesaurus.tm_error($str_alt123$You_need_to_provide_a_comment_str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if ((term_1.equalp($str_alt77$) || term_2.equalp($str_alt77$)) && (NIL == current_comment)) {
                    return html_thesaurus.tm_error($str_alt124$You_need_to_fill_in_both_the_exam, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (((!comment.equal($str_alt77$)) && (!term_1.equalp($str_alt77$))) && (!term_2.equalp($str_alt77$))) {
                    comment = cconcatenate(comment, tm_define_relation_example_string(term_1, term_2, get_define_relation_value($RELATION_NAME), get_define_relation_value($INVERSE_NAME)));
                } else {
                    comment = current_comment;
                }
                set_define_relation_value($COMMENT, comment);
                tm_define_relation_3();
            }
            return NIL;
        }
    }

    public static final SubLObject tm_define_relation_3() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = get_define_relation_value($RELATION_TYPE);
                if (NIL != subl_promotions.memberP(type, $list_alt84, UNPROVIDED, UNPROVIDED)) {
                    return tm_define_relation_4();
                } else {
                    {
                        SubLObject relation_name = get_define_relation_value($RELATION_NAME);
                        SubLObject inverse_name = get_define_relation_value($INVERSE_NAME);
                        SubLObject title = format(NIL, $str_alt105$Define_Relation___A, relation_name);
                        if ((NIL != inverse_name) && (!inverse_name.equalp(relation_name))) {
                            title = cconcatenate(title, format(NIL, $str_alt106$_and__A, inverse_name));
                        }
                        {
                            SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != color_value) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(color_value));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_princ(title);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            tm_logging.tm_enqueue_event(title);
                                            if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                                html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                            } else {
                                                html_thesaurus.thesaurus_heading($str_alt126$tm_define_relation_3);
                                                html_utilities.html_princ($str_alt127$You_can_go_back_to_the_previous_p);
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt128$Thesaurus_relations_may_go_betwee);
                                                html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt129$In_the_thesaurus_fact_A___A___A__, !inverse_name.equalp(relation_name) ? ((SubLObject) ($$$s)) : $str_alt77$, relation_name);
                                                if (!inverse_name.equalp(relation_name)) {
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt131$__and___B___A__A_, inverse_name);
                                                }
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt132$tm_handle_define_relation_3, T, UNPROVIDED);
                                                        {
                                                            SubLObject current_arg1 = get_define_relation_value($ARG1_TYPE);
                                                            SubLObject current_arg2 = get_define_relation_value($ARG2_TYPE);
                                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(ZERO_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt133$The_A_value___);
                                                                                    html_utilities.html_br();
                                                                                    html_utilities.html_radio_input($str_alt134$arg1_type, $str_alt135$_PT, makeBoolean((current_arg1 == $PT) || (NIL == current_arg1)));
                                                                                    html_utilities.html_princ($str_alt136$_Must_be_a_preferred_term);
                                                                                    if (!relation_name.equalp(inverse_name)) {
                                                                                        html_utilities.html_br();
                                                                                        html_utilities.html_radio_input($str_alt134$arg1_type, $str_alt137$_non_pt, eq(current_arg1, $NON_PT));
                                                                                        html_utilities.html_princ($str_alt138$_Cannot_be_a_preferred_term);
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_princ($str_alt139$The_B_value___);
                                                                                    html_utilities.html_br();
                                                                                    html_utilities.html_radio_input($str_alt140$arg2_type, $str_alt135$_PT, makeBoolean((current_arg2 == $PT) || (NIL == current_arg2)));
                                                                                    html_utilities.html_princ($str_alt136$_Must_be_a_preferred_term);
                                                                                    if (!relation_name.equalp(inverse_name)) {
                                                                                        html_utilities.html_br();
                                                                                        html_utilities.html_radio_input($str_alt140$arg2_type, $str_alt137$_non_pt, eq(current_arg2, $NON_PT));
                                                                                        html_utilities.html_princ($str_alt138$_Cannot_be_a_preferred_term);
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                        }
                                                        html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_reset_input(UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_princ($str_alt90$The_relation_as_defined_so_far_);
                                                html_utilities.html_br();
                                                html_show_define_relation_state();
                                            }
                                            html_thesaurus.tm_footer();
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_define_relation_3(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE)) {
                return html_thesaurus.tm_error($str_alt122$There_is_no_Define_Relation_in_pr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject arg1_type = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt134$arg1_type, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject arg2_type = html_utilities.html_extract_input($str_alt140$arg2_type, args);
                SubLObject relation_name = get_define_relation_value($RELATION_NAME);
                SubLObject inverse_name = get_define_relation_value($INVERSE_NAME);
                if (NIL != arg2_type) {
                    arg2_type = read_from_string_ignoring_errors(arg2_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (arg1_type.equal($NON_PT) && arg2_type.equal($NON_PT)) {
                    return html_thesaurus.tm_error($str_alt141$A_thesaurus_relation_can_t_be_bet, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (relation_name.equalp(inverse_name)) {
                    if (!arg1_type.equal(arg2_type)) {
                        return html_thesaurus.tm_error($str_alt142$Since__A_is_its_own_inverse__both, relation_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                set_define_relation_value($ARG1_TYPE, arg1_type);
                set_define_relation_value($ARG2_TYPE, arg2_type);
                if (arg1_type != arg2_type) {
                    set_define_relation_value($SYMMETRIC_, $$$asymmetric);
                    set_define_relation_value($kw11$TRANSITIVE_, NIL);
                }
                tm_define_relation_4();
            }
            return NIL;
        }
    }

    // defparameter
    private static final SubLSymbol $tm_cardinality_possibilities$ = makeSymbol("*TM-CARDINALITY-POSSIBILITIES*");

    public static final SubLObject tm_cardinality_string(SubLObject arg1, SubLObject arg2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = arg1;
                if (pcase_var.eql($MANY)) {
                    {
                        SubLObject pcase_var_93 = arg2;
                        if (pcase_var_93.eql($MANY)) {
                            return elt($tm_cardinality_possibilities$.getDynamicValue(thread), ZERO_INTEGER);
                        } else
                            if (pcase_var_93.eql($ONE)) {
                                return elt($tm_cardinality_possibilities$.getDynamicValue(thread), ONE_INTEGER);
                            }

                    }
                } else
                    if (pcase_var.eql($ONE)) {
                        {
                            SubLObject pcase_var_94 = arg2;
                            if (pcase_var_94.eql($MANY)) {
                                return elt($tm_cardinality_possibilities$.getDynamicValue(thread), TWO_INTEGER);
                            } else
                                if (pcase_var_94.eql($ONE)) {
                                    return elt($tm_cardinality_possibilities$.getDynamicValue(thread), THREE_INTEGER);
                                }

                        }
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject tm_cardinality_list_from_format_keyword(SubLObject format) {
        SubLTrampolineFile.checkType(format, KEYWORDP);
        {
            SubLObject pcase_var = format;
            if (pcase_var.eql($MANY_TO_MANY)) {
                return list($MANY, $MANY);
            } else
                if (pcase_var.eql($MANY_TO_ONE)) {
                    return list($MANY, $ONE);
                } else
                    if (pcase_var.eql($ONE_TO_MANY)) {
                        return list($ONE, $MANY);
                    } else
                        if (pcase_var.eql($ONE_TO_ONE)) {
                            return list($ONE, $ONE);
                        }



        }
        return NIL;
    }

    /**
     * Cardinality string should be an element of *tm-cardinality-possibilities*
     */
    public static final SubLObject tm_cardinality_list_from_string(SubLObject cardinality_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject position = position(cardinality_string, $tm_cardinality_possibilities$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != position) {
                    return elt($list_alt151, position);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject tm_define_relation_4() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = get_define_relation_value($RELATION_TYPE);
                if (type == $HIERARCHICAL) {
                    return tm_define_relation_5();
                } else {
                    {
                        SubLObject relation_name = get_define_relation_value($RELATION_NAME);
                        SubLObject inverse_name = get_define_relation_value($INVERSE_NAME);
                        SubLObject arg1_type = get_define_relation_value($ARG1_TYPE);
                        SubLObject arg2_type = get_define_relation_value($ARG2_TYPE);
                        SubLObject possibilities = $list_alt151;
                        SubLObject title = format(NIL, $str_alt105$Define_Relation___A, relation_name);
                        SubLObject symmetricP = equalp(get_define_relation_value($SYMMETRIC_), $$$symmetric);
                        SubLObject current_arg1_format = get_define_relation_value($ARG1_FORMAT);
                        SubLObject current_arg2_format = get_define_relation_value($ARG2_FORMAT);
                        if (NIL != symmetricP) {
                            possibilities = remove($list_alt152, remove($list_alt153, possibilities, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if ((arg1_type == $NON_PT) && (type != $LEXICAL)) {
                            possibilities = remove($list_alt152, remove($list_alt154, possibilities, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if ((arg2_type == $NON_PT) && (type != $LEXICAL)) {
                            possibilities = remove($list_alt153, remove($list_alt154, possibilities, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if ((NIL != inverse_name) && (!inverse_name.equalp(relation_name))) {
                            title = cconcatenate(title, format(NIL, $str_alt106$_and__A, inverse_name));
                        }
                        {
                            SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != color_value) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(color_value));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_princ(title);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            tm_logging.tm_enqueue_event(title);
                                            if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                                html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                            } else {
                                                html_thesaurus.thesaurus_heading($str_alt155$tm_define_relation_4);
                                                html_utilities.html_princ($str_alt127$You_can_go_back_to_the_previous_p);
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt156$Some_relations_have_restrictions_);
                                                html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt157$This_information_will_be_used_whe);
                                                html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt158$tm_handle_define_relation_4, T, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt159$Choose_the_Cardinality_for__A_, relation_name);
                                                        html_utilities.html_br();
                                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                        {
                                                            SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                                html_utilities.html_princ($$$count);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject cdolist_list_var = possibilities;
                                                                            SubLObject option = NIL;
                                                                            for (option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option = cdolist_list_var.first()) {
                                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                                {
                                                                                    SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                        if ((((NIL == current_arg1_format) && (NIL == current_arg2_format)) && option.equalp($list_alt161)) || option.equalp(list(current_arg1_format, current_arg2_format))) {
                                                                                            html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                        }
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_utilities.html_princ(eval(cons(TM_CARDINALITY_STRING, option)));
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                        html_utilities.html_br();
                                                        html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_reset_input(UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_princ($str_alt90$The_relation_as_defined_so_far_);
                                                html_utilities.html_br();
                                                html_show_define_relation_state();
                                            }
                                            html_thesaurus.tm_footer();
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_define_relation_4(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE)) {
                return html_thesaurus.tm_error($str_alt122$There_is_no_Define_Relation_in_pr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject relation_name = get_define_relation_value($RELATION_NAME);
                SubLObject inverse_name = get_define_relation_value($INVERSE_NAME);
                SubLObject count = html_utilities.html_extract_input($$$count, args);
                SubLObject arg1_format = NIL;
                SubLObject arg2_format = NIL;
                if (count.equalp($$$MANY_to_MANY)) {
                    arg1_format = $MANY;
                    arg2_format = $MANY;
                } else
                    if (count.equalp($$$MANY_to_ONE)) {
                        arg1_format = $MANY;
                        arg2_format = $ONE;
                    } else
                        if (count.equalp($$$ONE_to_MANY)) {
                            arg1_format = $ONE;
                            arg2_format = $MANY;
                        } else
                            if (count.equalp($$$ONE_to_ONE)) {
                                arg1_format = $ONE;
                                arg2_format = $ONE;
                            } else {
                                return html_thesaurus.tm_error($str_alt167$Implementation_error__Can_t_handl, count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }



                if (relation_name.equalp(inverse_name)) {
                    if (!arg1_format.equal(arg2_format)) {
                        return html_thesaurus.tm_error($str_alt168$Since__A_is_its_own_inverse__it_m, relation_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                set_define_relation_value($ARG1_FORMAT, arg1_format);
                set_define_relation_value($ARG2_FORMAT, arg2_format);
                tm_define_relation_5();
            }
            return NIL;
        }
    }

    public static final SubLObject tm_define_relation_5() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = get_define_relation_value($RELATION_TYPE);
                if ((NIL != member(type, $list_alt84, UNPROVIDED, UNPROVIDED)) || (get_define_relation_value($ARG1_TYPE) != get_define_relation_value($ARG2_TYPE))) {
                    return tm_define_relation_6();
                } else {
                    {
                        SubLObject relation_name = get_define_relation_value($RELATION_NAME);
                        SubLObject inverse_name = get_define_relation_value($INVERSE_NAME);
                        SubLObject title = format(NIL, $str_alt105$Define_Relation___A, relation_name);
                        if ((NIL != inverse_name) && (!inverse_name.equalp(relation_name))) {
                            title = cconcatenate(title, format(NIL, $str_alt106$_and__A, inverse_name));
                        }
                        {
                            SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != color_value) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(color_value));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(ZERO_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_princ(title);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            tm_logging.tm_enqueue_event(title);
                                            if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                                html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                            } else {
                                                html_thesaurus.thesaurus_heading($str_alt170$tm_define_relation_5);
                                                html_utilities.html_princ($str_alt127$You_can_go_back_to_the_previous_p);
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt171$Transitive_relations_are_those_fo);
                                                html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt172$This_information_will_be_used_whe);
                                                html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_106 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt173$tm_handle_define_relation_5, T, UNPROVIDED);
                                                        html_utilities.html_checkbox_input($$$transitive, $$$transitive, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt174$_A_is_transitive, relation_name);
                                                        html_utilities.html_br();
                                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt175$Symmetric_relations_are_those_for);
                                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt176$This_information_will_be_used_whe);
                                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                                        html_utilities.html_radio_input($$$symmetric, $$$symmetric, equalp(inverse_name, relation_name));
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt177$_A_is_symmetric, relation_name);
                                                        html_utilities.html_br();
                                                        if ((NIL != inverse_name) && (!inverse_name.equalp(relation_name))) {
                                                            html_utilities.html_radio_input($$$symmetric, $$$asymmetric, NIL);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt178$_A_is_asymmetric, relation_name);
                                                            html_utilities.html_br();
                                                        }
                                                        html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_reset_input(UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_106, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_princ($str_alt90$The_relation_as_defined_so_far_);
                                                html_utilities.html_br();
                                                html_show_define_relation_state();
                                            }
                                            html_thesaurus.tm_footer();
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_define_relation_5(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE)) {
                return html_thesaurus.tm_error($str_alt122$There_is_no_Define_Relation_in_pr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject transitiveP = html_utilities.html_extract_input($$$transitive, args);
                SubLObject symmetricP = html_utilities.html_extract_input($$$symmetric, args);
                set_define_relation_value($kw11$TRANSITIVE_, transitiveP);
                if (symmetricP.equalp($$$symmetric)) {
                    set_define_relation_value($INVERSE_NAME, get_define_relation_value($RELATION_NAME));
                }
                set_define_relation_value($SYMMETRIC_, symmetricP);
                tm_define_relation_6();
            }
            return NIL;
        }
    }

    public static final SubLObject tm_define_relation_6() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation_name = get_define_relation_value($RELATION_NAME);
                SubLObject inverse_name = get_define_relation_value($INVERSE_NAME);
                SubLObject title = format(NIL, $str_alt105$Define_Relation___A, relation_name);
                if ((NIL != inverse_name) && (!inverse_name.equalp(relation_name))) {
                    title = cconcatenate(title, format(NIL, $str_alt106$_and__A, inverse_name));
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_107 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(title);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(title);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt180$tm_define_relation_6);
                                        html_utilities.html_princ($str_alt127$You_can_go_back_to_the_previous_p);
                                        html_utilities.html_br();
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt181$Just_as_terms_can_be_placed_in_a_);
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt182$Note_that_if_a_relation_has_a_bro);
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt183$tm_handle_define_relation_6, T, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt184$Enter_Broader_Relations_for__A__i, relation_name);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_thesaurus.tm_link($VIEW_RELATIONS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_116 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($$$broaders);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup($int$40);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        if (true) {
                                                                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup(THREE_INTEGER);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_117 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ($str_alt77$);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_117, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_116, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Continue, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input(UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt188$The_relation__as_defined_so_far_);
                                        html_utilities.html_br();
                                        html_show_define_relation_state();
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_107, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_rel_type_mismatchP(SubLObject rel_type, SubLObject br_type) {
        {
            SubLObject pcase_var = rel_type;
            if (pcase_var.eql($PT)) {
                {
                    SubLObject pcase_var_119 = br_type;
                    if (pcase_var_119.eql($CONSTANT)) {
                        return NIL;
                    } else
                        if (pcase_var_119.eql($STRING)) {
                            return T;
                        }

                }
            } else
                if (pcase_var.eql($NON_PT)) {
                    {
                        SubLObject pcase_var_120 = br_type;
                        if (pcase_var_120.eql($CONSTANT)) {
                            return T;
                        } else
                            if (pcase_var_120.eql($STRING)) {
                                return NIL;
                            }

                    }
                }

        }
        return NIL;
    }

    public static final SubLObject tm_handle_define_relation_6(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE)) {
                return html_thesaurus.tm_error($str_alt122$There_is_no_Define_Relation_in_pr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject broaders = html_utilities.html_extract_input($$$broaders, args);
                SubLObject genlpreds = NIL;
                SubLObject genlinverse = NIL;
                if (NIL != broaders) {
                    broaders = string_utilities.extract_lines(broaders);
                }
                {
                    SubLObject cdolist_list_var = broaders;
                    SubLObject broader = NIL;
                    for (broader = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , broader = cdolist_list_var.first()) {
                        broader = string_utilities.trim_whitespace(broader);
                        {
                            SubLObject broader_constant = tm_internals.relation_constant_from_abbreviation(broader);
                            SubLObject broader_term_arg = tm_internals.relation_term_arg_from_abbreviation(broader);
                            if (NIL == broader_constant) {
                                return html_thesaurus.tm_error($str_alt191$_A_is_not_a_defined_relation_, broader, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            {
                                SubLObject pcase_var = broader_term_arg;
                                if (pcase_var.eql(ONE_INTEGER)) {
                                    genlpreds = cons(broader, genlpreds);
                                } else
                                    if (pcase_var.eql(TWO_INTEGER)) {
                                        genlinverse = cons(broader, genlinverse);
                                    } else {
                                        html_thesaurus.tm_error($str_alt192$Implementation_error___A_is_not_a, broader_term_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }

                            }
                            {
                                SubLObject arg1_type = get_define_relation_value($ARG1_TYPE);
                                SubLObject arg2_type = get_define_relation_value($ARG2_TYPE);
                                SubLObject b_arg1_type = tm_internals.tm_classify_type(kb_accessors.argn_isa(broader_constant, broader_term_arg, tm_datastructures.$tm_mt$.getGlobalValue()).first());
                                SubLObject b_arg2_type = tm_internals.tm_classify_type(kb_accessors.argn_isa(broader_constant, broader_term_arg == ONE_INTEGER ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER, tm_datastructures.$tm_mt$.getGlobalValue()).first());
                                if (NIL != tm_rel_type_mismatchP(arg1_type, b_arg1_type)) {
                                    return html_thesaurus.tm_error($str_alt193$A_relation_and_its_broader_relati, get_define_relation_value($RELATION_NAME), arg1_type == $PT ? ((SubLObject) ($$$A_Preferred_Term)) : $$$Not_A_Preferred_Term, broader, b_arg1_type == $CONSTANT ? ((SubLObject) ($$$A_Preferred_Term)) : $$$Not_A_Preferred_Term, UNPROVIDED, UNPROVIDED);
                                }
                                if (NIL != tm_rel_type_mismatchP(arg2_type, b_arg2_type)) {
                                    return html_thesaurus.tm_error($str_alt196$A_relation_and_its_broader_relati, get_define_relation_value($RELATION_NAME), arg2_type == $PT ? ((SubLObject) ($$$A_Preferred_Term)) : $$$Not_A_Preferred_Term, broader, b_arg2_type == $CONSTANT ? ((SubLObject) ($$$A_Preferred_Term)) : $$$Not_A_Preferred_Term, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                set_define_relation_value($GENLPREDS, genlpreds);
                set_define_relation_value($GENLINVERSE, genlinverse);
                tm_verify_define_relation();
            }
            return NIL;
        }
    }

    public static final SubLObject tm_verify_define_relation() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation_name = get_define_relation_value($RELATION_NAME);
                SubLObject inverse_name = get_define_relation_value($INVERSE_NAME);
                SubLObject title = format(NIL, $str_alt198$Verify_Define_Relation___A, relation_name);
                if ((NIL != inverse_name) && (!inverse_name.equalp(relation_name))) {
                    title = cconcatenate(title, format(NIL, $str_alt106$_and__A, inverse_name));
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_121 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_122 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_123 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_123, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_122, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(title);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(title);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt199$tm_verify_define_relation);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt200$Please_check_the_defininition_of_, relation_name);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_show_define_relation_state();
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_124 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt201$tm_handle_verify_define_relation, T, UNPROVIDED);
                                                html_utilities.html_submit_input($$$Define, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_124, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_121, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_verify_define_relation(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFINE_RELATION_STATE)) {
                return html_thesaurus.tm_error($str_alt122$There_is_no_Define_Relation_in_pr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject relation_name = get_define_relation_value($RELATION_NAME);
                thread.resetMultipleValues();
                {
                    SubLObject result = tm_internals.do_create_relation();
                    SubLObject errors = thread.secondMultipleValue();
                    SubLObject warnings = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    clear_define_relation_state();
                    {
                        SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Define_Relation_Results);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color_value) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_value));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_125 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_126 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(ZERO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_127 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_127, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_126, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_princ($$$Define_Relation_Results);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(ONE_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        tm_logging.tm_enqueue_event($$$Define_Relation_Results);
                                        if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                            html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                        } else {
                                            html_thesaurus.thesaurus_heading($str_alt201$tm_handle_verify_define_relation);
                                            if (NIL != result) {
                                                {
                                                    SubLObject key = (NIL != warnings) ? ((SubLObject) ($WARNING)) : NIL != errors ? ((SubLObject) ($ERROR)) : $OK;
                                                    tm_logging.tm_enqueue_op_for_log(format(NIL, $str_alt207$Define_relation__a, relation_name), key, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                                                }
                                            }
                                            if (NIL != result) {
                                                html_thesaurus.tm_link($RELATION, relation_name, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_princ($str_alt209$_was_defined);
                                            } else {
                                                html_utilities.html_princ($$$Relation_definition_failed);
                                            }
                                            if (!((NIL != errors) || (NIL != warnings))) {
                                                html_utilities.html_princ($str_alt211$_successfully_);
                                            } else {
                                                html_utilities.html_princ($str_alt212$_with_these_errors_or_warnings_);
                                            }
                                            if (NIL != errors) {
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt213$Errors_);
                                                html_utilities.html_br();
                                                {
                                                    SubLObject cdolist_list_var = errors;
                                                    SubLObject error = NIL;
                                                    for (error = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error = cdolist_list_var.first()) {
                                                        html_utilities.html_princ(error);
                                                        html_utilities.html_br();
                                                    }
                                                }
                                            }
                                            if (NIL != warnings) {
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt214$Warnings_);
                                                html_utilities.html_br();
                                                {
                                                    SubLObject cdolist_list_var = warnings;
                                                    SubLObject warning = NIL;
                                                    for (warning = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , warning = cdolist_list_var.first()) {
                                                        html_utilities.html_princ(warning);
                                                        html_utilities.html_br();
                                                    }
                                                }
                                            }
                                        }
                                        html_thesaurus.tm_footer();
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_125, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_edit_relation_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = args.first();
                SubLObject rel_symbol = second(args);
                SubLObject constant = html_thesaurus.tm_guess_fort(id);
                SubLObject inverse = tm_internals.inverse_relation(rel_symbol);
                if (!((NIL != forts.valid_fortP(constant)) && (NIL != tm_internals.thesaurus_predicateP(constant)))) {
                    return html_thesaurus.tm_error($str_alt216$No_thesaurus_relation_found_by_ID, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == tm_internals.thesaurus_constant_from_abbreviation(rel_symbol)) {
                    return html_thesaurus.tm_error($str_alt217$No_thesaurus_relation_found_by_Na, rel_symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != tm_integrity.integrity_check_in_progress_for_relationP(constant)) || (NIL != tm_integrity.integrity_check_needed_for_relationP(constant))) {
                    html_tm_browsing.tm_no_edit_relation_page(constant, tm_internals.relation_term_arg_from_abbreviation(rel_symbol));
                    return NIL;
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt218$Edit_Relation___a, rel_symbol));
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_128 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_129 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_130 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_130, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_129, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt218$Edit_Relation___a, rel_symbol));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt218$Edit_Relation___a, rel_symbol));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt219$tm_edit_rel);
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_131 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt220$tm_handle_edit_rel, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($$$id, id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt222$old_name, rel_symbol, UNPROVIDED);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt223$Rename_Relation_);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt224$Enter_a_new_name_for__A_, rel_symbol);
                                                html_utilities.html_br();
                                                html_utilities.html_text_input($$$name, rel_symbol, $int$30);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                if ((NIL != inverse) && (NIL == kb_accessors.symmetric_predicateP(constant))) {
                                                    html_utilities.html_hidden_input($str_alt225$old_inverse, inverse, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt224$Enter_a_new_name_for__A_, inverse);
                                                    html_utilities.html_br();
                                                    html_utilities.html_text_input($$$inverse, inverse, $int$30);
                                                    html_utilities.html_br();
                                                    html_utilities.html_br();
                                                }
                                                html_utilities.html_submit_input($$$Rename_Relation, $str_alt227$edit_relation_action, UNPROVIDED);
                                                html_utilities.html_reset_input($$$Reset_Page);
                                                html_utilities.html_br();
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt229$Edit_Comment_);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt230$Enter_a_new_comment_for__A, rel_symbol);
                                                html_utilities.html_br();
                                                {
                                                    SubLObject docs = tm_internals.relation_documentation(constant);
                                                    SubLObject box_text = (NIL != docs) ? ((SubLObject) (docs)) : $str_alt77$;
                                                    html_utilities.html_hidden_input($str_alt231$old_comment, box_text, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($str_alt232$new_comment);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($int$60);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(TEN_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_132 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ(box_text);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_132, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Edit_Comment, $str_alt227$edit_relation_action, UNPROVIDED);
                                                html_utilities.html_reset_input($$$Reset_Page);
                                                html_utilities.html_br();
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt234$Change_Cardinality_);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt235$Choose_the_new_cardinality_for__A, rel_symbol);
                                                html_utilities.html_br();
                                                html_utilities.html_hidden_input($str_alt236$relation_arg_num, tm_internals.relation_term_arg_from_abbreviation(rel_symbol), UNPROVIDED);
                                                {
                                                    SubLObject possibilities = tm_internals.cardinality_possibilities_for_relation(rel_symbol);
                                                    SubLObject current_format = tm_internals.tm_classify_format(rel_symbol);
                                                    SubLObject current_string = apply(symbol_function(TM_CARDINALITY_STRING), tm_cardinality_list_from_format_keyword(current_format));
                                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                    {
                                                        SubLObject _prev_bind_0_133 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt237$new_cardinality);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_134 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject cdolist_list_var = possibilities;
                                                                        SubLObject option = NIL;
                                                                        for (option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option = cdolist_list_var.first()) {
                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                            {
                                                                                SubLObject _prev_bind_0_135 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                    if (format(NIL, $str_alt238$_s_s_a, new SubLObject[]{ option.first(), $sym239$_TO_, second(option) }).equal(format(NIL, $str_alt240$_s, current_format))) {
                                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                                    }
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_136 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ(eval(cons(TM_CARDINALITY_STRING, option)));
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_136, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_135, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_134, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_133, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                    html_utilities.html_hidden_input($str_alt241$old_cardinality, current_string, UNPROVIDED);
                                                }
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Change_Cardinality, $str_alt227$edit_relation_action, UNPROVIDED);
                                                html_utilities.html_reset_input($$$Reset_Page);
                                                html_utilities.html_br();
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Process_Page, $str_alt227$edit_relation_action, UNPROVIDED);
                                                html_utilities.html_reset_input($$$Reset_Page);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_131, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_128, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_edit_rel(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = html_utilities.html_extract_input($$$id, args);
                SubLObject old_name = html_utilities.html_extract_input($str_alt222$old_name, args);
                SubLObject new_val = html_utilities.html_extract_input($$$name, args);
                SubLObject new_name = (new_val.isString()) ? ((SubLObject) (string_utilities.trim_whitespace(new_val))) : new_val;
                SubLObject old_inverse = html_utilities.html_extract_input($str_alt225$old_inverse, args);
                SubLObject new_inverse = html_utilities.html_extract_input($$$inverse, args);
                SubLObject edit_relation_action = html_utilities.html_extract_input($str_alt227$edit_relation_action, args);
                SubLObject old_comment = html_utilities.html_extract_input($str_alt231$old_comment, args);
                SubLObject new_comment = html_utilities.html_extract_input($str_alt232$new_comment, args);
                SubLObject old_cardinality = html_utilities.html_extract_input($str_alt241$old_cardinality, args);
                SubLObject new_cardinality = html_utilities.html_extract_input($str_alt237$new_cardinality, args);
                SubLObject constant = html_thesaurus.tm_guess_fort(id);
                SubLObject relation_arg_num = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt236$relation_arg_num, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject ops = NIL;
                SubLObject tighteningP = NIL;
                if (edit_relation_action.equal($$$Rename_Relation)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject rename_ops = make_rename_rel_ops(id, old_name, new_name, old_inverse, new_inverse);
                        SubLObject message_to_user_list = thread.secondMultipleValue();
                        SubLObject error_message_list = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != message_to_user_list) {
                            apply(symbol_function(TM_MESSAGE_TO_USER), message_to_user_list);
                            return NIL;
                        }
                        if (NIL != error_message_list) {
                            apply(symbol_function(TM_ERROR), error_message_list);
                            return NIL;
                        }
                        if (NIL == rename_ops) {
                            return html_thesaurus.tm_message_to_user($$$No_Changes_to_Perform, $str_alt248$No_rename_operations_were_specifi);
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject bad = tm_internals.check_operations(rename_ops);
                            SubLObject good = thread.secondMultipleValue();
                            SubLObject verifyP = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == good) {
                                html_tm_editing.html_show_bad_ops_page(bad);
                            } else {
                                html_tm_editing.do_good_edit_relation_ops_results(bad, good, symbol_function(TM_SHOW_RELATION_GUTS), list(constant, new_name), $$$Rename_Relation, UNPROVIDED);
                            }
                        }
                    }
                } else
                    if (edit_relation_action.equal($$$Edit_Comment)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject comment_ops = make_edit_rel_comment_op(id, new_comment, old_comment);
                            SubLObject message_to_user_list = thread.secondMultipleValue();
                            SubLObject error_message_list = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != message_to_user_list) {
                                apply(symbol_function(TM_MESSAGE_TO_USER), message_to_user_list);
                                return NIL;
                            }
                            if (NIL != error_message_list) {
                                apply(symbol_function(TM_ERROR), error_message_list);
                                return NIL;
                            }
                            if (NIL == comment_ops) {
                                return html_thesaurus.tm_message_to_user($$$No_Changes_to_Perform, $str_alt250$No_comment_edit_operations_were_s);
                            }
                            {
                                SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                try {
                                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject bad = tm_internals.check_operations(comment_ops);
                                        SubLObject good = thread.secondMultipleValue();
                                        SubLObject verifyP = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL == good) {
                                            html_tm_editing.html_show_bad_ops_page(bad);
                                        } else {
                                            html_tm_editing.do_good_edit_relation_ops_results(bad, good, symbol_function(TM_SHOW_RELATION_GUTS), list(constant, old_name), $$$Edit_Relation_Comment, UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } else
                        if (edit_relation_action.equal($$$Change_Cardinality)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject cardinality_ops = make_change_cardinality_ops(id, relation_arg_num, new_cardinality, old_cardinality);
                                SubLObject message_to_user_list = thread.secondMultipleValue();
                                SubLObject error_message_list = thread.thirdMultipleValue();
                                SubLObject tightening_cardinality_constraintsP = thread.fourthMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != message_to_user_list) {
                                    apply(symbol_function(TM_MESSAGE_TO_USER), message_to_user_list);
                                    return NIL;
                                }
                                if (NIL != error_message_list) {
                                    apply(symbol_function(TM_ERROR), error_message_list);
                                    return NIL;
                                }
                                if (NIL == cardinality_ops) {
                                    return html_thesaurus.tm_message_to_user($$$No_Changes_to_Perform, $str_alt252$No_cardinality_edit_operations_we);
                                }
                                {
                                    SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = tm_integrity.$tm_relation_to_check_all_uses_of$.currentBinding(thread);
                                    try {
                                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                        tm_integrity.$tm_relation_to_check_all_uses_of$.bind(NIL, thread);
                                        if (NIL != tightening_cardinality_constraintsP) {
                                            tm_integrity.$tm_relation_to_check_all_uses_of$.setDynamicValue(constant, thread);
                                            tm_integrity.tm_update_state_relation_integrity_search(constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject bad = tm_internals.check_operations(cardinality_ops);
                                            SubLObject good = thread.secondMultipleValue();
                                            SubLObject verifyP = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL == good) {
                                                html_tm_editing.html_show_bad_ops_page(bad);
                                            } else {
                                                html_tm_editing.do_good_edit_relation_ops_results(bad, good, symbol_function(TM_SHOW_RELATION_GUTS), list(constant, old_name), $$$Edit_Relation_Cardinality, tightening_cardinality_constraintsP);
                                            }
                                        }
                                    } finally {
                                        tm_integrity.$tm_relation_to_check_all_uses_of$.rebind(_prev_bind_1, thread);
                                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } else
                            if (edit_relation_action.equal($$$Process_Page)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject rename_ops = make_rename_rel_ops(id, old_name, new_name, old_inverse, new_inverse);
                                    SubLObject message_to_user_list = thread.secondMultipleValue();
                                    SubLObject error_message_list = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != message_to_user_list) {
                                        apply(symbol_function(TM_MESSAGE_TO_USER), message_to_user_list);
                                        return NIL;
                                    }
                                    if (NIL != error_message_list) {
                                        apply(symbol_function(TM_ERROR), error_message_list);
                                        return NIL;
                                    }
                                    if (NIL != rename_ops) {
                                        ops = nconc(ops, rename_ops);
                                    }
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject comment_ops = make_edit_rel_comment_op(id, new_comment, old_comment);
                                    SubLObject message_to_user_list = thread.secondMultipleValue();
                                    SubLObject error_message_list = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != message_to_user_list) {
                                        apply(symbol_function(TM_MESSAGE_TO_USER), message_to_user_list);
                                        return NIL;
                                    }
                                    if (NIL != error_message_list) {
                                        apply(symbol_function(TM_ERROR), error_message_list);
                                        return NIL;
                                    }
                                    if (NIL != comment_ops) {
                                        ops = nconc(ops, comment_ops);
                                    }
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject cardinality_ops = make_change_cardinality_ops(id, relation_arg_num, new_cardinality, old_cardinality);
                                    SubLObject message_to_user_list = thread.secondMultipleValue();
                                    SubLObject error_message_list = thread.thirdMultipleValue();
                                    SubLObject tightening_cardinality_constraintsP = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != message_to_user_list) {
                                        apply(symbol_function(TM_MESSAGE_TO_USER), message_to_user_list);
                                        return NIL;
                                    }
                                    if (NIL != error_message_list) {
                                        apply(symbol_function(TM_ERROR), error_message_list);
                                        return NIL;
                                    }
                                    if (NIL != cardinality_ops) {
                                        tighteningP = tightening_cardinality_constraintsP;
                                        ops = nconc(ops, cardinality_ops);
                                    }
                                }
                                if (NIL == ops) {
                                    html_thesaurus.tm_message_to_user($$$No_Changes_to_Perform, $str_alt254$No_edit_operations_were_specified);
                                    return NIL;
                                }
                                {
                                    SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = tm_integrity.$tm_relation_to_check_all_uses_of$.currentBinding(thread);
                                    try {
                                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                        tm_integrity.$tm_relation_to_check_all_uses_of$.bind(NIL, thread);
                                        if (NIL != tighteningP) {
                                            tm_integrity.$tm_relation_to_check_all_uses_of$.setDynamicValue(constant, thread);
                                            tm_integrity.tm_update_state_relation_integrity_search(constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject bad = tm_internals.check_operations(ops);
                                            SubLObject good = thread.secondMultipleValue();
                                            SubLObject verifyP = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL == good) {
                                                html_tm_editing.html_show_bad_ops_page(bad);
                                            } else {
                                                html_tm_editing.do_good_edit_relation_ops_results(bad, good, symbol_function(TM_SHOW_RELATION_GUTS), list(constant, new_name), $$$Edit_Relation, tighteningP);
                                            }
                                        }
                                    } finally {
                                        tm_integrity.$tm_relation_to_check_all_uses_of$.rebind(_prev_bind_1, thread);
                                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } else {
                                html_thesaurus.tm_error($str_alt256$An_unrecognized_command_was_reque, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }



            }
            return NIL;
        }
    }

    /**
     * Returns three values: ops, message-to-user-list, and error-message-list.
     * Ops are ops to be performed based on the values passed in.  Message-to-user-list
     * is a message to print to the user about a reason why operations couldn't proceed, but
     * not necessarily an error condition. It can be used with
     * (apply #'tm-message-to-user message-to-user-list).  Error message list is a message to
     * print to the user about a reason why the values specified caused an error.  It can be
     * used with (apply #'tm-error error-message-list)
     * At most, only one value returned should be non-nil at a time. When there are no changes to
     * be performed, all values returned are nil.
     */
    public static final SubLObject make_rename_rel_ops(SubLObject id, SubLObject old_name, SubLObject new_name, SubLObject old_inverse, SubLObject new_inverse) {
        {
            SubLObject constant = html_thesaurus.tm_guess_fort(id);
            SubLObject inverseP = eq(tm_internals.relation_term_arg_from_abbreviation(old_name), TWO_INTEGER);
            SubLObject error_message_list = NIL;
            SubLObject message_to_user_list = NIL;
            SubLObject ops = NIL;
            SubLObject relation_name_change_list = NIL;
            if (new_name.isString()) {
                new_name = Strings.string_upcase(string_utilities.trim_whitespace(new_name), UNPROVIDED, UNPROVIDED);
            }
            if (new_inverse.isString()) {
                new_inverse = Strings.string_upcase(string_utilities.trim_whitespace(new_inverse), UNPROVIDED, UNPROVIDED);
            }
            if (NIL == forts.valid_fortP(constant)) {
                error_message_list = list($str_alt216$No_thesaurus_relation_found_by_ID, id);
                return values(NIL, NIL, error_message_list);
            }
            if (new_name.equal($str_alt77$) || new_inverse.equal($str_alt77$)) {
                error_message_list = list($str_alt258$Sorry__can_t_name_relations_with_);
                return values(NIL, NIL, error_message_list);
            }
            if ((NIL != find_if(symbol_function(WHITESPACEP), new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != find_if(symbol_function(WHITESPACEP), new_inverse, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                error_message_list = list($str_alt94$Relation_and_inverse_names_can_t_);
                return values(NIL, NIL, error_message_list);
            }
            if ((NIL != kb_accessors.asymmetric_predicateP(constant)) && new_name.equalp(new_inverse)) {
                error_message_list = list($str_alt259$An_asymmetric_relation_cannot_hav);
                return values(NIL, NIL, error_message_list);
            }
            if (NIL != kb_accessors.symmetric_predicateP(constant)) {
                old_inverse = old_name;
                new_inverse = new_name;
            }
            if (!old_name.equal(new_name)) {
                {
                    SubLObject op1 = tm_datastructures.get_tm_op();
                    SubLObject op = op1;
                    tm_datastructures._csetf_tm_op_opcode(op, $REPLACE);
                    tm_datastructures._csetf_tm_op_relation(op, NIL != inverseP ? ((SubLObject) ($$tmInverseSymbol)) : $$tmSymbol);
                    tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                    tm_datastructures._csetf_tm_op_args(op, list(constant, old_name, new_name));
                    tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                    tm_datastructures._csetf_tm_op_status(op, NIL);
                    tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                    tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                    tm_datastructures._csetf_tm_op_description(op, NIL);
                    tm_datastructures._csetf_tm_op_description_args(op, NIL);
                    if (NIL.isString()) {
                        html_tm_editing.set_op_english(op, NIL);
                    } else {
                        html_tm_editing.set_op_english(op, UNPROVIDED);
                    }
                    ops = cons(op1, ops);
                }
                relation_name_change_list = cons(cons(old_name, new_name), relation_name_change_list);
            }
            if (!old_inverse.equal(new_inverse)) {
                {
                    SubLObject op2 = tm_datastructures.get_tm_op();
                    SubLObject op = op2;
                    tm_datastructures._csetf_tm_op_opcode(op, $REPLACE);
                    tm_datastructures._csetf_tm_op_relation(op, NIL != inverseP ? ((SubLObject) ($$tmSymbol)) : $$tmInverseSymbol);
                    tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                    tm_datastructures._csetf_tm_op_args(op, list(constant, old_inverse, new_inverse));
                    tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                    tm_datastructures._csetf_tm_op_status(op, NIL);
                    tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                    tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                    tm_datastructures._csetf_tm_op_description(op, NIL);
                    tm_datastructures._csetf_tm_op_description_args(op, NIL);
                    if (NIL.isString()) {
                        html_tm_editing.set_op_english(op, NIL);
                    } else {
                        html_tm_editing.set_op_english(op, UNPROVIDED);
                    }
                    ops = cons(op2, ops);
                }
                relation_name_change_list = cons(cons(old_inverse, new_inverse), relation_name_change_list);
            }
            if (NIL != ops) {
                ops = nreverse(ops);
            }
            if (NIL != relation_name_change_list) {
                ops = nconc(ops, tm_internals.tm_make_list_of_ops_to_edit_filters_for_relation_edit(relation_name_change_list, T));
            }
            return values(ops, NIL, NIL);
        }
    }

    /**
     * Returns three values: ops, message-to-user-list, and error-message-list.
     * Ops are ops to be performed based on the values passed in.  Message-to-user-list
     * is a message to print to the user about a reason why operations couldn't proceed, but
     * not necessarily an error condition. It can be used with
     * (apply #'tm-message-to-user message-to-user-list).  Error message list is a message to
     * print to the user about a reason why the values specified caused an error.  It can be
     * used with (apply #'tm-error error-message-list)
     * At most, only one value returned should be non-nil at a time.  When there are no changes to
     * be performed, all values returned are nil.
     */
    public static final SubLObject make_edit_rel_comment_op(SubLObject id, SubLObject new_comment, SubLObject old_comment) {
        {
            SubLObject constant = html_thesaurus.tm_guess_fort(id);
            SubLObject error_message_list = NIL;
            SubLObject message_to_user_list = NIL;
            SubLObject ops = NIL;
            if (new_comment.equal(old_comment)) {
                return values(NIL, NIL, NIL);
            }
            if (new_comment.isString()) {
                new_comment = string_utilities.trim_whitespace(new_comment);
            }
            if (NIL == forts.valid_fortP(constant)) {
                error_message_list = list($str_alt216$No_thesaurus_relation_found_by_ID, id);
                return values(NIL, NIL, error_message_list);
            }
            if (new_comment.equal($str_alt77$)) {
                error_message_list = list($str_alt263$Sorry__can_t_change_comments_to_t);
                return values(NIL, NIL, error_message_list);
            }
            if (!old_comment.equal(new_comment)) {
                {
                    SubLObject op1 = tm_datastructures.get_tm_op();
                    SubLObject current_doc = kb_mapping_utilities.fpred_value_in_mt(constant, $$comment, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != current_doc) {
                        {
                            SubLObject op = op1;
                            tm_datastructures._csetf_tm_op_opcode(op, $REPLACE);
                            tm_datastructures._csetf_tm_op_relation(op, $$comment);
                            tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                            tm_datastructures._csetf_tm_op_args(op, list(constant, current_doc.isString() ? ((SubLObject) (current_doc)) : $str_alt77$, new_comment));
                            tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                            tm_datastructures._csetf_tm_op_status(op, NIL);
                            tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                            tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                            tm_datastructures._csetf_tm_op_description(op, NIL);
                            tm_datastructures._csetf_tm_op_description_args(op, NIL);
                            if (NIL.isString()) {
                                html_tm_editing.set_op_english(op, NIL);
                            } else {
                                html_tm_editing.set_op_english(op, UNPROVIDED);
                            }
                        }
                    } else {
                        {
                            SubLObject op = op1;
                            tm_datastructures._csetf_tm_op_opcode(op, $ADD);
                            tm_datastructures._csetf_tm_op_relation(op, $$comment);
                            tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                            tm_datastructures._csetf_tm_op_args(op, list(constant, new_comment));
                            tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                            tm_datastructures._csetf_tm_op_status(op, NIL);
                            tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                            tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                            tm_datastructures._csetf_tm_op_description(op, NIL);
                            tm_datastructures._csetf_tm_op_description_args(op, NIL);
                            if (NIL.isString()) {
                                html_tm_editing.set_op_english(op, NIL);
                            } else {
                                html_tm_editing.set_op_english(op, UNPROVIDED);
                            }
                        }
                    }
                    ops = cons(op1, ops);
                }
            }
            return values(ops, NIL, NIL);
        }
    }

    /**
     * Returns four values: ops, message-to-user-list, error-message-list, and
     * tightening-cardinality-constraints?. Ops are ops to be performed based on the values
     * passed in.  Message-to-user-list is a message to print to the user about a reason why
     * operations couldn't proceed, but not necessarily an error condition. It can be used with
     * (apply #'tm-message-to-user message-to-user-list).  Error message list is a message to
     * print to the user about a reason why the values specified caused an error.  It can be
     * used with (apply #'tm-error error-message-list).  tightening-cardinality-constraints? is T
     * when performing the ops will change the constraints on either the first or (inclusive)
     * second arg from 'many' to 'one'.  At most, only one of the first three values returned
     * should be non-nil at a time.  When there are no changes to be performed, all values
     * returned are nil.
     */
    public static final SubLObject make_change_cardinality_ops(SubLObject id, SubLObject relation_arg_num, SubLObject new_cardinality, SubLObject old_cardinality) {
        {
            SubLObject constant = html_thesaurus.tm_guess_fort(id);
            SubLObject old_cardinality_list = tm_cardinality_list_from_string(old_cardinality);
            SubLObject rel_symbol = NIL;
            SubLObject error_message_list = NIL;
            SubLObject message_to_user_list = NIL;
            SubLObject ops = NIL;
            SubLObject new_cardinality_list = NIL;
            SubLObject tightening_cardinality_constraintsP = NIL;
            if (new_cardinality.equal(old_cardinality)) {
                return values(NIL, NIL, NIL, tightening_cardinality_constraintsP);
            }
            if (NIL != forts.valid_fortP(constant)) {
                rel_symbol = tm_internals.tm_pred_arg_symbol(constant, relation_arg_num);
            } else {
                error_message_list = list($str_alt216$No_thesaurus_relation_found_by_ID, id);
                return values(NIL, NIL, error_message_list, tightening_cardinality_constraintsP);
            }
            new_cardinality_list = tm_cardinality_list_from_string(new_cardinality);
            if (NIL == subl_promotions.memberP(new_cardinality_list, tm_internals.cardinality_possibilities_for_relation(rel_symbol), symbol_function(EQUAL), UNPROVIDED)) {
                error_message_list = list($str_alt266$___a_is_not_a_valid_cardinality_f, new_cardinality, rel_symbol);
                return values(NIL, NIL, error_message_list, tightening_cardinality_constraintsP);
            }
            if (!old_cardinality.equal(new_cardinality)) {
                {
                    SubLObject term_assertion_present = T;
                    SubLObject value_assertion_present = T;
                    SubLObject op1 = NIL;
                    SubLObject op2 = NIL;
                    SubLObject term_format_pred = NIL;
                    SubLObject value_format_pred = NIL;
                    if (relation_arg_num.eql(ONE_INTEGER)) {
                        term_format_pred = $$arg1Format;
                        value_format_pred = $$arg2Format;
                    } else {
                        term_format_pred = $$arg2Format;
                        value_format_pred = $$arg1Format;
                    }
                    if (!old_cardinality_list.first().eql(new_cardinality_list.first())) {
                        if (old_cardinality_list.first().eql($MANY) && new_cardinality_list.first().eql($ONE)) {
                            tightening_cardinality_constraintsP = T;
                        }
                        if (NIL == kb_mapping_utilities.pred_u_v_holds_in_mt(term_format_pred, constant, old_cardinality_list.first().eql($MANY) ? ((SubLObject) ($$openEntryFormatInArgs)) : $$singleEntryFormatInArgs, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            term_assertion_present = NIL;
                        }
                        op1 = tm_datastructures.get_tm_op();
                        if (NIL != term_assertion_present) {
                            if (old_cardinality_list.first().eql($MANY)) {
                                {
                                    SubLObject op = op1;
                                    tm_datastructures._csetf_tm_op_opcode(op, $REPLACE);
                                    tm_datastructures._csetf_tm_op_relation(op, term_format_pred);
                                    tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                                    tm_datastructures._csetf_tm_op_args(op, list(constant, $$openEntryFormatInArgs, $$singleEntryFormatInArgs));
                                    tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                                    tm_datastructures._csetf_tm_op_status(op, NIL);
                                    tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                                    tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                                    tm_datastructures._csetf_tm_op_description(op, NIL);
                                    tm_datastructures._csetf_tm_op_description_args(op, NIL);
                                    if (format(NIL, $str_alt271$Change_Cardinality_of_First_Value, new SubLObject[]{ rel_symbol, old_cardinality_list.first(), new_cardinality_list.first() }).isString()) {
                                        html_tm_editing.set_op_english(op, format(NIL, $str_alt271$Change_Cardinality_of_First_Value, new SubLObject[]{ rel_symbol, old_cardinality_list.first(), new_cardinality_list.first() }));
                                    } else {
                                        html_tm_editing.set_op_english(op, UNPROVIDED);
                                    }
                                }
                            } else {
                                {
                                    SubLObject op = op1;
                                    tm_datastructures._csetf_tm_op_opcode(op, $DELETE);
                                    tm_datastructures._csetf_tm_op_relation(op, term_format_pred);
                                    tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                                    tm_datastructures._csetf_tm_op_args(op, list(constant, $$singleEntryFormatInArgs));
                                    tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                                    tm_datastructures._csetf_tm_op_status(op, NIL);
                                    tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                                    tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                                    tm_datastructures._csetf_tm_op_description(op, NIL);
                                    tm_datastructures._csetf_tm_op_description_args(op, NIL);
                                    if (format(NIL, $str_alt271$Change_Cardinality_of_First_Value, new SubLObject[]{ rel_symbol, old_cardinality_list.first(), new_cardinality_list.first() }).isString()) {
                                        html_tm_editing.set_op_english(op, format(NIL, $str_alt271$Change_Cardinality_of_First_Value, new SubLObject[]{ rel_symbol, old_cardinality_list.first(), new_cardinality_list.first() }));
                                    } else {
                                        html_tm_editing.set_op_english(op, UNPROVIDED);
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject op = op1;
                                tm_datastructures._csetf_tm_op_opcode(op, $ADD);
                                tm_datastructures._csetf_tm_op_relation(op, term_format_pred);
                                tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                                tm_datastructures._csetf_tm_op_args(op, list(constant, new_cardinality_list.first().eql($MANY) ? ((SubLObject) ($$openEntryFormatInArgs)) : $$singleEntryFormatInArgs));
                                tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                                tm_datastructures._csetf_tm_op_status(op, NIL);
                                tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                                tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                                tm_datastructures._csetf_tm_op_description(op, NIL);
                                tm_datastructures._csetf_tm_op_description_args(op, NIL);
                                if (format(NIL, $str_alt271$Change_Cardinality_of_First_Value, new SubLObject[]{ rel_symbol, old_cardinality_list.first(), new_cardinality_list.first() }).isString()) {
                                    html_tm_editing.set_op_english(op, format(NIL, $str_alt271$Change_Cardinality_of_First_Value, new SubLObject[]{ rel_symbol, old_cardinality_list.first(), new_cardinality_list.first() }));
                                } else {
                                    html_tm_editing.set_op_english(op, UNPROVIDED);
                                }
                            }
                        }
                        ops = cons(op1, ops);
                    }
                    if (!second(old_cardinality_list).eql(second(new_cardinality_list))) {
                        if (second(old_cardinality_list).eql($MANY) && second(new_cardinality_list).eql($ONE)) {
                            tightening_cardinality_constraintsP = T;
                        }
                        if (NIL == kb_mapping_utilities.pred_u_v_holds_in_mt(value_format_pred, constant, second(old_cardinality_list).eql($MANY) ? ((SubLObject) ($$openEntryFormatInArgs)) : $$singleEntryFormatInArgs, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            value_assertion_present = NIL;
                        }
                        op2 = tm_datastructures.get_tm_op();
                        if (NIL != value_assertion_present) {
                            if (second(old_cardinality_list).eql($MANY)) {
                                {
                                    SubLObject op = op2;
                                    tm_datastructures._csetf_tm_op_opcode(op, $REPLACE);
                                    tm_datastructures._csetf_tm_op_relation(op, value_format_pred);
                                    tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                                    tm_datastructures._csetf_tm_op_args(op, list(constant, $$openEntryFormatInArgs, $$singleEntryFormatInArgs));
                                    tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                                    tm_datastructures._csetf_tm_op_status(op, NIL);
                                    tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                                    tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                                    tm_datastructures._csetf_tm_op_description(op, NIL);
                                    tm_datastructures._csetf_tm_op_description_args(op, NIL);
                                    if (format(NIL, $str_alt273$Change_Cardinality_of_Second_Valu, new SubLObject[]{ rel_symbol, second(old_cardinality_list), second(new_cardinality_list) }).isString()) {
                                        html_tm_editing.set_op_english(op, format(NIL, $str_alt273$Change_Cardinality_of_Second_Valu, new SubLObject[]{ rel_symbol, second(old_cardinality_list), second(new_cardinality_list) }));
                                    } else {
                                        html_tm_editing.set_op_english(op, UNPROVIDED);
                                    }
                                }
                            } else {
                                {
                                    SubLObject op = op2;
                                    tm_datastructures._csetf_tm_op_opcode(op, $DELETE);
                                    tm_datastructures._csetf_tm_op_relation(op, value_format_pred);
                                    tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                                    tm_datastructures._csetf_tm_op_args(op, list(constant, $$singleEntryFormatInArgs));
                                    tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                                    tm_datastructures._csetf_tm_op_status(op, NIL);
                                    tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                                    tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                                    tm_datastructures._csetf_tm_op_description(op, NIL);
                                    tm_datastructures._csetf_tm_op_description_args(op, NIL);
                                    if (format(NIL, $str_alt273$Change_Cardinality_of_Second_Valu, new SubLObject[]{ rel_symbol, second(old_cardinality_list), second(new_cardinality_list) }).isString()) {
                                        html_tm_editing.set_op_english(op, format(NIL, $str_alt273$Change_Cardinality_of_Second_Valu, new SubLObject[]{ rel_symbol, second(old_cardinality_list), second(new_cardinality_list) }));
                                    } else {
                                        html_tm_editing.set_op_english(op, UNPROVIDED);
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject op = op2;
                                tm_datastructures._csetf_tm_op_opcode(op, $ADD);
                                tm_datastructures._csetf_tm_op_relation(op, value_format_pred);
                                tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                                tm_datastructures._csetf_tm_op_args(op, list(constant, second(new_cardinality_list).eql($MANY) ? ((SubLObject) ($$openEntryFormatInArgs)) : $$singleEntryFormatInArgs));
                                tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                                tm_datastructures._csetf_tm_op_status(op, NIL);
                                tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                                tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                                tm_datastructures._csetf_tm_op_description(op, NIL);
                                tm_datastructures._csetf_tm_op_description_args(op, NIL);
                                if (format(NIL, $str_alt273$Change_Cardinality_of_Second_Valu, new SubLObject[]{ rel_symbol, second(old_cardinality_list), second(new_cardinality_list) }).isString()) {
                                    html_tm_editing.set_op_english(op, format(NIL, $str_alt273$Change_Cardinality_of_Second_Valu, new SubLObject[]{ rel_symbol, second(old_cardinality_list), second(new_cardinality_list) }));
                                } else {
                                    html_tm_editing.set_op_english(op, UNPROVIDED);
                                }
                            }
                        }
                        ops = cons(op2, ops);
                    }
                }
            }
            return values(ops, NIL, NIL, tightening_cardinality_constraintsP);
        }
    }

    public static final SubLObject tm_kill_rel(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = args.first();
                SubLObject rel_symbol = second(args);
                SubLObject inverse = tm_internals.inverse_relation(rel_symbol);
                SubLObject constant = html_thesaurus.tm_guess_fort(id);
                if (NIL == forts.valid_fortP(constant)) {
                    return html_thesaurus.tm_error($str_alt216$No_thesaurus_relation_found_by_ID, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt274$Kill__a_, rel_symbol));
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_137 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_138 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_139 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_139, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_138, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt274$Kill__a_, rel_symbol));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt274$Kill__a_, rel_symbol));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt275$tm_kill_rel);
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_140 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt276$tm_handle_kill_rel, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($$$id, id, UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt277$The_relation___A__, rel_symbol);
                                                if (NIL != inverse) {
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt278$and_its_inverse___A__, inverse);
                                                }
                                                html_utilities.html_princ($str_alt279$will_be_removed_from_the_Thesauru);
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt280$All_uses_of_these_relations_will_);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_utilities.html_princ($str_alt281$Do_you_wish_to_continue_);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Kill, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_tm_browsing.tm_relation_uses(constant, rel_symbol);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_140, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_137, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_kill_rel(SubLObject args) {
        {
            SubLObject id = html_utilities.html_extract_input($$$id, args);
            SubLObject constant = html_thesaurus.tm_guess_fort(id);
            if (NIL == forts.valid_fortP(constant)) {
                return html_thesaurus.tm_error($str_alt216$No_thesaurus_relation_found_by_ID, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject rel_symbol = tm_internals.tm_pred_arg_symbol(constant, ONE_INTEGER);
                SubLObject inverse_symbol = tm_internals.tm_pred_arg_symbol(constant, TWO_INTEGER);
                SubLObject part1 = format(NIL, $str_alt277$The_relation___A__, rel_symbol);
                SubLObject part2 = (NIL != inverse_symbol) ? ((SubLObject) (format(NIL, $str_alt284$and_its_inverse___A__have, inverse_symbol))) : $$$has;
                SubLObject message = string_utilities.strcat(list(part1, part2, $str_alt286$_been_removed_from_the_Thesaurus_));
                tm_internals.do_kill_relation(constant);
                tm_logging.tm_enqueue_op_for_log(NIL != inverse_symbol ? ((SubLObject) (format(NIL, $str_alt287$Kill_Relations___a_and__a, rel_symbol, inverse_symbol))) : format(NIL, $str_alt288$Kill_Relation___a, rel_symbol), $OK, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                html_thesaurus.tm_message_to_user($$$Kill_Relation_Results, message);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_reorder_relations_display(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relations = tm_internals.all_relation_symbols_in_order();
                tm_internals.mark_graphable_spec_preds(relations);
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Relation_Reordering);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_141 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_142 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_143 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_143, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_142, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Relation_Reordering);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Relation_Reordering);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt292$tm_reorder_relations_display);
                                        tm_reorder_relations_page_body(relations);
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_141, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     * Position must be between 0 and (- (length list) 1) inclusive.  If positioning
     * is :before, then item is inserted before the item _currently_ at that postion.
     * If positioning is :after, then item is inserted after the item currently at
     * that position.
     */
    public static final SubLObject ninsert_by_place(SubLObject item, SubLObject list, SubLObject position, SubLObject positioning) {
        if (positioning == UNPROVIDED) {
            positioning = $BEFORE;
        }
        {
            SubLObject list_length = length(list);
            if (position.numL(ZERO_INTEGER) || position.numG(subtract(list_length, ONE_INTEGER))) {
                Errors.error($str_alt295$Position_is_not_valid_for_the_siz);
            } else
                if (positioning.eql($BEFORE)) {
                    return list_utilities.ninsert_by_position(item, list, position);
                } else
                    if (positioning.eql($AFTER)) {
                        return list_utilities.ninsert_by_position(item, list, add(position, ONE_INTEGER));
                    } else {
                        Errors.error($$$Unrecognized_Case);
                    }


        }
        return NIL;
    }

    public static final SubLObject tm_reorder_relations_redisplay_page(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_order = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt298$current_order, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject new_relation_order = NIL;
                SubLObject relation_to_move = html_utilities.html_extract_input($str_alt299$relation_to_move, args);
                SubLObject positioning = html_utilities.html_extract_input($str_alt300$positioning_for_relation, args);
                SubLObject relation_adjacent_to_target = html_utilities.html_extract_input($str_alt301$relation_move_target, args);
                if ((((NIL != relation_adjacent_to_target) && (NIL != positioning)) && (NIL != relation_to_move)) && (!relation_to_move.equalp(relation_adjacent_to_target))) {
                    new_relation_order = delete(relation_to_move, old_order, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (positioning.equal($$$Before)) {
                        new_relation_order = ninsert_by_place(relation_to_move, new_relation_order, position(relation_adjacent_to_target, new_relation_order, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED), $BEFORE);
                    } else {
                        new_relation_order = ninsert_by_place(relation_to_move, new_relation_order, position(relation_adjacent_to_target, new_relation_order, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED), $AFTER);
                    }
                } else {
                    new_relation_order = old_order;
                }
                tm_internals.mark_graphable_spec_preds(new_relation_order);
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Relation_Reordering);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_144 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_145 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_146 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_146, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_145, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ($$$Relation_Reordering);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event($$$Relation_Reordering);
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt292$tm_reorder_relations_display);
                                        tm_reorder_relations_page_body(new_relation_order);
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_144, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_reorder_relations_page_body(SubLObject list_of_relations_to_display) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spaces = TEN_INTEGER;
                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input($str_alt303$tm_handle_reorder_relations, T, UNPROVIDED);
                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                        html_utilities.html_hidden_input($str_alt298$current_order, format(NIL, $str_alt240$_s, list_of_relations_to_display), UNPROVIDED);
                        html_utilities.html_br();
                        html_utilities.html_princ($str_alt304$Choose_a_relation_to_move_and_a_p);
                        html_utilities.html_br();
                        html_utilities.html_br();
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(ZERO_INTEGER);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_147 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($BOTTOM));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_148 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_149 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_149, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_150 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt306$Relation_to_move_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_150, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_151 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_151, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_152 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($str_alt307$Adjacent_Relation_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_152, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_148, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($MIDDLE));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_153 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($MIDDLE));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_154 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_indent(spaces);
                                                html_utilities.html_princ($$$Move);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_154, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_155 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_156 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt299$relation_to_move);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_157 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = list_of_relations_to_display;
                                                                    SubLObject symbol = NIL;
                                                                    for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                        {
                                                                            SubLObject _prev_bind_0_158 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_159 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ(symbol);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_159, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_158, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_157, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_156, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_155, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_160 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_161 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt300$positioning_for_relation);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_162 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = $list_alt311;
                                                                    SubLObject position = NIL;
                                                                    for (position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , position = cdolist_list_var.first()) {
                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                        {
                                                                            SubLObject _prev_bind_0_163 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_164 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ(position);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_164, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_163, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_162, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_161, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_160, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($LEFT));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_165 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_166 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt301$relation_move_target);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_167 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = list_of_relations_to_display;
                                                                    SubLObject symbol = NIL;
                                                                    for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                        {
                                                                            SubLObject _prev_bind_0_168 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_169 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ(symbol);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_169, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_168, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_167, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_166, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_165, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_153, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_170 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_171 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_indent(spaces);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_171, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_170, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($BOTTOM));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_172 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_173 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (!tm_internals.all_relation_symbols_in_order().equal(list_of_relations_to_display)) {
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($$$Possible_New_Order);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } else {
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($$$Current_Order);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_173, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_172, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_174 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_175 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_indent(spaces);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_175, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_174, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var = list_of_relations_to_display;
                                    SubLObject symbol = NIL;
                                    for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_176 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_177 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_thesaurus.tm_link($RELATION, symbol, UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_177, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_178 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_178, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_179 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_179, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_176, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_147, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_br();
                        html_utilities.html_submit_input($$$Make_Displayed_Order_Permanent, $str_alt315$reorder_relations_action, UNPROVIDED);
                        html_utilities.html_submit_input($$$Display_New_Order, $str_alt315$reorder_relations_action, UNPROVIDED);
                        html_utilities.html_submit_input($$$Cancel, $str_alt315$reorder_relations_action, UNPROVIDED);
                        html_utilities.html_reset_input($$$Reset_Choices);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject tm_reorder_relations_process_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_order = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt298$current_order, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject reorder_ops = tm_io.make_ops_to_change_pred_symbol_order_in_kb(new_order);
                    SubLObject message_to_user_list = thread.secondMultipleValue();
                    SubLObject error_message_list = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != message_to_user_list) {
                        apply(symbol_function(TM_MESSAGE_TO_USER), message_to_user_list);
                        return NIL;
                    }
                    if (NIL != error_message_list) {
                        apply(symbol_function(TM_ERROR), error_message_list);
                        return NIL;
                    }
                    if (NIL == reorder_ops) {
                        return html_thesaurus.tm_message_to_user($$$No_Changes_to_Perform, $str_alt319$No_reordering_operations_were_spe);
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject bad = tm_internals.check_operations(reorder_ops);
                        SubLObject good = thread.secondMultipleValue();
                        SubLObject verifyP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == good) {
                            html_tm_editing.html_show_bad_ops_page(bad);
                        } else {
                            html_tm_editing.do_good_ops_results(bad, good, symbol_function(INIT_PRED_SYMBOL_ORDER_FROM_KB), NIL, $$$Reorder_Relations, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_reorder_relations(SubLObject args) {
        {
            SubLObject reorder_relations_action = html_utilities.html_extract_input($str_alt315$reorder_relations_action, args);
            if (reorder_relations_action.equal($$$Make_Displayed_Order_Permanent)) {
                tm_reorder_relations_process_page(args);
            } else
                if (reorder_relations_action.equal($$$Display_New_Order)) {
                    tm_reorder_relations_redisplay_page(args);
                } else
                    if (reorder_relations_action.equal($$$Cancel)) {
                        html_tm_browsing.tm_browse_relations_entry(UNPROVIDED);
                    }


        }
        return NIL;
    }

    public static final SubLObject tm_remove_active_rel(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation_id = args.first();
                SubLObject rel_symbol = second(args);
                SubLObject relation_constant = NIL;
                relation_constant = html_thesaurus.tm_guess_fort(relation_id);
                if (NIL == forts.valid_fortP(relation_constant)) {
                    return html_thesaurus.tm_error($str_alt323$Implementation_error__Couldn_t_de, relation_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject op = tm_datastructures.get_tm_op();
                    SubLObject ops = NIL;
                    SubLObject op_180 = op;
                    tm_datastructures._csetf_tm_op_opcode(op_180, $DELETE);
                    tm_datastructures._csetf_tm_op_relation(op_180, tm_datastructures.$tm_unary_active_pred$.getGlobalValue());
                    tm_datastructures._csetf_tm_op_inverseP(op_180, NIL);
                    tm_datastructures._csetf_tm_op_args(op_180, list(relation_constant));
                    tm_datastructures._csetf_tm_op_thesaurus(op_180, tm_datastructures.$tm_mt$.getGlobalValue());
                    tm_datastructures._csetf_tm_op_status(op_180, NIL);
                    tm_datastructures._csetf_tm_op_verifyP(op_180, NIL);
                    tm_datastructures._csetf_tm_op_hiddenP(op_180, NIL);
                    tm_datastructures._csetf_tm_op_description(op_180, NIL);
                    tm_datastructures._csetf_tm_op_description_args(op_180, NIL);
                    if (NIL.isString()) {
                        html_tm_editing.set_op_english(op_180, NIL);
                    } else {
                        html_tm_editing.set_op_english(op_180, UNPROVIDED);
                    }
                    ops = cons(op, ops);
                    thread.resetMultipleValues();
                    {
                        SubLObject bad = tm_internals.check_operations(ops);
                        SubLObject good = thread.secondMultipleValue();
                        SubLObject verifyP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == good) {
                            html_tm_editing.html_show_bad_ops_page(bad);
                        } else {
                            html_tm_editing.do_good_ops_results(bad, good, symbol_function(TM_SHOW_RELATION_GUTS), list(relation_constant, rel_symbol), $$$Remove_Active_Relation, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_add_active_rel(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation_id = args.first();
                SubLObject rel_symbol = second(args);
                SubLObject relation_constant = NIL;
                relation_constant = html_thesaurus.tm_guess_fort(relation_id);
                if (NIL == forts.valid_fortP(relation_constant)) {
                    return html_thesaurus.tm_error($str_alt323$Implementation_error__Couldn_t_de, relation_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject op = tm_datastructures.get_tm_op();
                    SubLObject ops = NIL;
                    SubLObject op_181 = op;
                    tm_datastructures._csetf_tm_op_opcode(op_181, $ADD);
                    tm_datastructures._csetf_tm_op_relation(op_181, tm_datastructures.$tm_unary_active_pred$.getGlobalValue());
                    tm_datastructures._csetf_tm_op_inverseP(op_181, NIL);
                    tm_datastructures._csetf_tm_op_args(op_181, list(relation_constant));
                    tm_datastructures._csetf_tm_op_thesaurus(op_181, tm_datastructures.$tm_mt$.getGlobalValue());
                    tm_datastructures._csetf_tm_op_status(op_181, NIL);
                    tm_datastructures._csetf_tm_op_verifyP(op_181, NIL);
                    tm_datastructures._csetf_tm_op_hiddenP(op_181, NIL);
                    tm_datastructures._csetf_tm_op_description(op_181, NIL);
                    tm_datastructures._csetf_tm_op_description_args(op_181, NIL);
                    if (NIL.isString()) {
                        html_tm_editing.set_op_english(op_181, NIL);
                    } else {
                        html_tm_editing.set_op_english(op_181, UNPROVIDED);
                    }
                    ops = cons(op, ops);
                    thread.resetMultipleValues();
                    {
                        SubLObject bad = tm_internals.check_operations(ops);
                        SubLObject good = thread.secondMultipleValue();
                        SubLObject verifyP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == good) {
                            html_tm_editing.html_show_bad_ops_page(bad);
                        } else {
                            html_tm_editing.do_good_ops_results(bad, good, symbol_function(TM_SHOW_RELATION_GUTS), list(relation_constant, rel_symbol), $$$Add_Active_Relation, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_restrict_individual_relation(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = args.first();
                SubLObject rel_symbol = second(args);
                SubLObject constant = html_thesaurus.tm_guess_fort(id);
                SubLObject inverse = tm_internals.inverse_relation(rel_symbol);
                SubLObject available_thesauri = tm_internals.relation_available_in_thesauri(constant);
                SubLObject all_thesauri = tm_internals.all_thesauri_sorted();
                if (!((NIL != forts.valid_fortP(constant)) && (NIL != tm_internals.thesaurus_predicateP(constant)))) {
                    return html_thesaurus.tm_error($str_alt216$No_thesaurus_relation_found_by_ID, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == tm_internals.thesaurus_constant_from_abbreviation(rel_symbol)) {
                    return html_thesaurus.tm_error($str_alt217$No_thesaurus_relation_found_by_Na, rel_symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != tm_integrity.integrity_check_in_progress_for_relationP(constant)) || (NIL != tm_integrity.integrity_check_needed_for_relationP(constant))) {
                    html_tm_browsing.tm_no_edit_relation_page(constant, tm_internals.relation_term_arg_from_abbreviation(rel_symbol));
                    return NIL;
                }
                {
                    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(format(NIL, $str_alt328$Set_Applicable_Thesauri_for___a, rel_symbol));
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_value));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_182 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_183 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(ZERO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_184 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_184, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_183, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_princ(format(NIL, $str_alt328$Set_Applicable_Thesauri_for___a, rel_symbol));
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(ONE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    tm_logging.tm_enqueue_event(format(NIL, $str_alt328$Set_Applicable_Thesauri_for___a, rel_symbol));
                                    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
                                        html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                    } else {
                                        html_thesaurus.thesaurus_heading($str_alt329$tm_restrict_individual_relation);
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_185 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt330$tm_handle_restrict_individual_rel, T, UNPROVIDED);
                                                html_utilities.html_hidden_input($$$id, id, UNPROVIDED);
                                                html_utilities.html_hidden_input($str_alt331$rel_symbol, rel_symbol, UNPROVIDED);
                                                html_tm_browsing.tm_show_relation_in_available_thesauri(rel_symbol, constant);
                                                html_utilities.html_br();
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                if (inverse.equalp(rel_symbol)) {
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt332$_a_is_currently_available_in_the_, rel_symbol);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } else {
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt333$_a_and__a_are_currently_available, rel_symbol, inverse);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt334$The_radio_buttons_below_show_the_);
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt335$Clicking_on_the_buttons_allows_th);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(THREE_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_186 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_187 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_188 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($str_alt77$);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_188, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_189 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Available_In);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_189, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_190 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ($$$Unavailable_In);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_190, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_187, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        {
                                                            SubLObject cdolist_list_var = all_thesauri;
                                                            SubLObject thesaurus = NIL;
                                                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject thesaurus_symbol = tm_internals.thesaurus_name(thesaurus);
                                                                    SubLObject availableP = member(thesaurus_symbol, available_thesauri, symbol_function(EQUALP), UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_191 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_192 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_thesaurus.tm_link($THESAURUS, thesaurus, UNPROVIDED, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_192, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_193 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_radio_input(thesaurus_symbol, $str_alt340$_delete, availableP);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_193, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(html_utilities.html_align($$$middle));
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_194 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_utilities.html_radio_input(thesaurus_symbol, $str_alt341$_add, makeBoolean(NIL == availableP));
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_194, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_191, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                        html_utilities.html_br();
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_186, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                html_utilities.html_princ($str_alt342$When_you_are_done_with_editing_re);
                                                html_utilities.html_br();
                                                html_utilities.html_submit_input($$$Set_Restrictions, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_reset_input($$$Reset);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_185, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    }
                                    html_thesaurus.tm_footer();
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_182, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_restrict_individual_relation(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = html_utilities.html_extract_input($$$id, args);
                SubLObject rel_symbol = html_utilities.html_extract_input($str_alt331$rel_symbol, args);
                SubLObject constant = html_thesaurus.tm_guess_fort(id);
                SubLObject all_thesauri = tm_internals.all_thesauri_sorted();
                SubLObject ops = NIL;
                SubLObject cdolist_list_var = all_thesauri;
                SubLObject thesaurus = NIL;
                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                    {
                        SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                        SubLObject restrict_op_ind = html_utilities.html_extract_input(thesaurus_name, args);
                        SubLObject len = length(restrict_op_ind);
                        SubLObject restrict_op = (restrict_op_ind.isString() && len.numG(ZERO_INTEGER)) ? ((SubLObject) (read_from_string_ignoring_errors(restrict_op_ind, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : restrict_op_ind;
                        if ((restrict_op_ind.equalp($str_alt341$_add) && (NIL == tm_internals.relation_restricted_in_thesaurusP(constant, thesaurus))) || (restrict_op_ind.equalp($str_alt340$_delete) && (NIL != tm_internals.relation_restricted_in_thesaurusP(constant, thesaurus)))) {
                            {
                                SubLObject op = tm_datastructures.get_tm_op();
                                SubLObject op_195 = op;
                                tm_datastructures._csetf_tm_op_opcode(op_195, restrict_op);
                                tm_datastructures._csetf_tm_op_relation(op_195, $$tmRelationRestrictedFrom);
                                tm_datastructures._csetf_tm_op_inverseP(op_195, NIL);
                                tm_datastructures._csetf_tm_op_args(op_195, list(constant, thesaurus));
                                tm_datastructures._csetf_tm_op_thesaurus(op_195, tm_datastructures.$tm_mt$.getGlobalValue());
                                tm_datastructures._csetf_tm_op_status(op_195, NIL);
                                tm_datastructures._csetf_tm_op_verifyP(op_195, NIL);
                                tm_datastructures._csetf_tm_op_hiddenP(op_195, NIL);
                                tm_datastructures._csetf_tm_op_description(op_195, NIL);
                                tm_datastructures._csetf_tm_op_description_args(op_195, NIL);
                                if (format(NIL, $str_alt347$_A_relation__A_to_be_used_in_thes, new SubLObject[]{ restrict_op_ind.equalp($str_alt341$_add) ? ((SubLObject) ($str_alt348$Don_t_allow)) : $$$Allow, rel_symbol, thesaurus_name }).isString()) {
                                    html_tm_editing.set_op_english(op_195, format(NIL, $str_alt347$_A_relation__A_to_be_used_in_thes, new SubLObject[]{ restrict_op_ind.equalp($str_alt341$_add) ? ((SubLObject) ($str_alt348$Don_t_allow)) : $$$Allow, rel_symbol, thesaurus_name }));
                                } else {
                                    html_tm_editing.set_op_english(op_195, UNPROVIDED);
                                }
                                ops = cons(op, ops);
                            }
                        }
                    }
                }
                if (NIL == ops) {
                    return html_thesaurus.tm_message_to_user($$$No_Changes_to_Perform, $str_alt350$No_restriction_operations_were_ch);
                }
                thread.resetMultipleValues();
                {
                    SubLObject bad = tm_internals.check_operations(ops);
                    SubLObject good = thread.secondMultipleValue();
                    SubLObject verifyP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == good) {
                        html_tm_editing.html_show_bad_ops_page(bad);
                    } else {
                        html_tm_editing.do_good_ops_results(bad, good, symbol_function(TM_SHOW_RELATION_IN_AVAILABLE_THESAURI), list(rel_symbol, constant), $$$Set_Relation_Restrictions, NIL);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_restrict_relations_for_thesaurus(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = args.first();
                SubLObject thesaurus = html_thesaurus.tm_guess_fort(id);
                SubLObject inactiveP = second(args);
                SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(format(NIL, $str_alt354$Choose_Applicable_Relations_for__, tm_internals.thesaurus_name(thesaurus)));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color_value) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_value));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_196 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_197 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
                                                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(ZERO_INTEGER);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_198 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_198, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_197, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_princ(format(NIL, $str_alt354$Choose_Applicable_Relations_for__, tm_internals.thesaurus_name(thesaurus)));
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(ONE_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                tm_logging.tm_enqueue_event(format(NIL, $str_alt354$Choose_Applicable_Relations_for__, tm_internals.thesaurus_name(thesaurus)));
                                if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt355$limited_editor)))) {
                                    html_utilities.html_princ($str_alt49$Sorry__you_do_not_have_permission);
                                } else {
                                    html_thesaurus.thesaurus_heading($str_alt356$tm_restrict_relations_for_thesaur);
                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_199 = html_macros.$html_safe_print$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$within_html_form$.bind(T, thread);
                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                            html_utilities.html_hidden_input($str_alt357$tm_handle_restrict_relations_for_, T, UNPROVIDED);
                                            html_utilities.html_hidden_input($$$args, args, UNPROVIDED);
                                            html_utilities.html_hidden_input($$$id, id, UNPROVIDED);
                                            if (NIL != inactiveP) {
                                                html_utilities.html_hidden_input($str_alt359$inactive_, ONE_INTEGER, UNPROVIDED);
                                            } else {
                                                html_utilities.html_hidden_input($str_alt359$inactive_, ZERO_INTEGER, UNPROVIDED);
                                            }
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_princ($str_alt360$Choose_a_Relation_to_Display_);
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($str_alt361$Core_Relations__);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            {
                                                SubLObject cdolist_list_var = tm_datastructures.$tm_core_relations$.getGlobalValue();
                                                SubLObject symbol = NIL;
                                                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                                                    html_thesaurus.tm_link($RELATION, symbol, UNPROVIDED, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt362$_);
                                                }
                                            }
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Unrestricted_Relations);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_tm_browsing.tm_show_unrestricted_relations_for_editing(inactiveP);
                                            html_utilities.html_br();
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_utilities.html_princ($$$Restricted_Relations);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_tm_browsing.tm_show_restricted_relations_for_thesaurus(thesaurus, T, inactiveP);
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            html_utilities.html_princ($str_alt342$When_you_are_done_with_editing_re);
                                            html_utilities.html_br();
                                            html_utilities.html_submit_input($$$Set_Restrictions, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_reset_input($$$Reset);
                                            html_utilities.html_br();
                                            html_utilities.html_br();
                                            if (NIL == inactiveP) {
                                                if ((NIL != tm_internals.editing_allowedP()) && (NIL != member(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI), symbol_function(EQUALP), UNPROVIDED))) {
                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt366$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt367$tm_restrict_relations_for_thesaur, id);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_200 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $$$Choose);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_200, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt369$___);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt366$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt370$tm_browse_restriction_relations_e, id);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_201 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$View);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_201, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt372$_NON_ACTIVE_Applicable_Relations_);
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_br();
                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                        } finally {
                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_199, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                html_thesaurus.tm_footer();
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_196, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject tm_handle_restrict_relations_for_thesaurus(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = html_utilities.html_extract_input($$$id, args);
                SubLObject thesaurus_constant = html_thesaurus.tm_guess_fort(id);
                SubLObject inactiveP = (read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt359$inactive_, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) == ONE_INTEGER) ? ((SubLObject) (T)) : NIL;
                SubLObject restricted_relations = tm_internals.restricted_relations(inactiveP);
                SubLObject ops = NIL;
                SubLObject cdolist_list_var = restricted_relations;
                SubLObject relation = NIL;
                for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                    {
                        SubLObject rel_constant = second(assoc(relation, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
                        SubLObject appliesP = html_utilities.html_extract_input(relation, args);
                        SubLObject restrict_op = (NIL != appliesP) ? ((SubLObject) ($str_alt340$_delete)) : $str_alt341$_add;
                        if ((restrict_op.equalp($str_alt341$_add) && (NIL == tm_internals.relation_restricted_in_thesaurusP(rel_constant, thesaurus_constant))) || (restrict_op.equalp($str_alt340$_delete) && (NIL != tm_internals.relation_restricted_in_thesaurusP(rel_constant, thesaurus_constant)))) {
                            {
                                SubLObject op = tm_datastructures.get_tm_op();
                                SubLObject op_202 = op;
                                tm_datastructures._csetf_tm_op_opcode(op_202, restrict_op);
                                tm_datastructures._csetf_tm_op_relation(op_202, $$tmRelationRestrictedFrom);
                                tm_datastructures._csetf_tm_op_inverseP(op_202, NIL);
                                tm_datastructures._csetf_tm_op_args(op_202, list(rel_constant, thesaurus_constant));
                                tm_datastructures._csetf_tm_op_thesaurus(op_202, tm_datastructures.$tm_mt$.getGlobalValue());
                                tm_datastructures._csetf_tm_op_status(op_202, NIL);
                                tm_datastructures._csetf_tm_op_verifyP(op_202, NIL);
                                tm_datastructures._csetf_tm_op_hiddenP(op_202, NIL);
                                tm_datastructures._csetf_tm_op_description(op_202, NIL);
                                tm_datastructures._csetf_tm_op_description_args(op_202, NIL);
                                if (format(NIL, $str_alt374$_A_relation__A__and_its_inverse__, new SubLObject[]{ restrict_op.equalp($str_alt341$_add) ? ((SubLObject) ($str_alt348$Don_t_allow)) : $$$Allow, tm_internals.tm_pred_arg_symbol(rel_constant, ONE_INTEGER), tm_internals.thesaurus_name(thesaurus_constant) }).isString()) {
                                    html_tm_editing.set_op_english(op_202, format(NIL, $str_alt374$_A_relation__A__and_its_inverse__, new SubLObject[]{ restrict_op.equalp($str_alt341$_add) ? ((SubLObject) ($str_alt348$Don_t_allow)) : $$$Allow, tm_internals.tm_pred_arg_symbol(rel_constant, ONE_INTEGER), tm_internals.thesaurus_name(thesaurus_constant) }));
                                } else {
                                    html_tm_editing.set_op_english(op_202, UNPROVIDED);
                                }
                                ops = cons(op, ops);
                            }
                        }
                    }
                }
                if (NIL == ops) {
                    return html_thesaurus.tm_message_to_user($$$No_Changes_to_Perform, $str_alt350$No_restriction_operations_were_ch);
                }
                thread.resetMultipleValues();
                {
                    SubLObject bad = tm_internals.check_operations(ops);
                    SubLObject good = thread.secondMultipleValue();
                    SubLObject verifyP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == good) {
                        html_tm_editing.html_show_bad_ops_page(bad);
                    } else {
                        html_tm_editing.do_good_ops_results(bad, good, symbol_function(TM_BROWSE_RESTRICTION_RELATIONS_ENTRY_GUTS), list(id, inactiveP), $$$Set_Relation_Restrictions, NIL);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_html_tm_relation_editing_file() {
        declareFunction("clear_define_relation_state", "CLEAR-DEFINE-RELATION-STATE", 0, 0, false);
        declareFunction("set_define_relation_value", "SET-DEFINE-RELATION-VALUE", 2, 0, false);
        declareFunction("set_define_relation_symmetric", "SET-DEFINE-RELATION-SYMMETRIC", 0, 0, false);
        declareFunction("set_define_relation_type", "SET-DEFINE-RELATION-TYPE", 1, 0, false);
        declareFunction("get_define_relation_value", "GET-DEFINE-RELATION-VALUE", 1, 0, false);
        declareFunction("html_show_define_relation_state", "HTML-SHOW-DEFINE-RELATION-STATE", 0, 0, false);
        declareFunction("tm_define_relation", "TM-DEFINE-RELATION", 0, 1, false);
        declareFunction("tm_handle_define_relation", "TM-HANDLE-DEFINE-RELATION", 1, 0, false);
        declareFunction("tm_define_relation_name", "TM-DEFINE-RELATION-NAME", 0, 1, false);
        declareFunction("tm_handle_define_relation_name", "TM-HANDLE-DEFINE-RELATION-NAME", 1, 0, false);
        declareFunction("tm_define_relation_2", "TM-DEFINE-RELATION-2", 2, 0, false);
        declareFunction("tm_define_relation_example_string", "TM-DEFINE-RELATION-EXAMPLE-STRING", 4, 0, false);
        declareFunction("tm_handle_define_relation_2", "TM-HANDLE-DEFINE-RELATION-2", 1, 0, false);
        declareFunction("tm_define_relation_3", "TM-DEFINE-RELATION-3", 0, 0, false);
        declareFunction("tm_handle_define_relation_3", "TM-HANDLE-DEFINE-RELATION-3", 1, 0, false);
        declareFunction("tm_cardinality_string", "TM-CARDINALITY-STRING", 2, 0, false);
        declareFunction("tm_cardinality_list_from_format_keyword", "TM-CARDINALITY-LIST-FROM-FORMAT-KEYWORD", 1, 0, false);
        declareFunction("tm_cardinality_list_from_string", "TM-CARDINALITY-LIST-FROM-STRING", 1, 0, false);
        declareFunction("tm_define_relation_4", "TM-DEFINE-RELATION-4", 0, 0, false);
        declareFunction("tm_handle_define_relation_4", "TM-HANDLE-DEFINE-RELATION-4", 1, 0, false);
        declareFunction("tm_define_relation_5", "TM-DEFINE-RELATION-5", 0, 0, false);
        declareFunction("tm_handle_define_relation_5", "TM-HANDLE-DEFINE-RELATION-5", 1, 0, false);
        declareFunction("tm_define_relation_6", "TM-DEFINE-RELATION-6", 0, 0, false);
        declareFunction("tm_rel_type_mismatchP", "TM-REL-TYPE-MISMATCH?", 2, 0, false);
        declareFunction("tm_handle_define_relation_6", "TM-HANDLE-DEFINE-RELATION-6", 1, 0, false);
        declareFunction("tm_verify_define_relation", "TM-VERIFY-DEFINE-RELATION", 0, 0, false);
        declareFunction("tm_handle_verify_define_relation", "TM-HANDLE-VERIFY-DEFINE-RELATION", 1, 0, false);
        declareFunction("tm_edit_relation_page", "TM-EDIT-RELATION-PAGE", 1, 0, false);
        declareFunction("tm_handle_edit_rel", "TM-HANDLE-EDIT-REL", 1, 0, false);
        declareFunction("make_rename_rel_ops", "MAKE-RENAME-REL-OPS", 5, 0, false);
        declareFunction("make_edit_rel_comment_op", "MAKE-EDIT-REL-COMMENT-OP", 3, 0, false);
        declareFunction("make_change_cardinality_ops", "MAKE-CHANGE-CARDINALITY-OPS", 4, 0, false);
        declareFunction("tm_kill_rel", "TM-KILL-REL", 1, 0, false);
        declareFunction("tm_handle_kill_rel", "TM-HANDLE-KILL-REL", 1, 0, false);
        declareFunction("tm_reorder_relations_display", "TM-REORDER-RELATIONS-DISPLAY", 0, 1, false);
        declareFunction("ninsert_by_place", "NINSERT-BY-PLACE", 3, 1, false);
        declareFunction("tm_reorder_relations_redisplay_page", "TM-REORDER-RELATIONS-REDISPLAY-PAGE", 0, 1, false);
        declareFunction("tm_reorder_relations_page_body", "TM-REORDER-RELATIONS-PAGE-BODY", 1, 0, false);
        declareFunction("tm_reorder_relations_process_page", "TM-REORDER-RELATIONS-PROCESS-PAGE", 1, 0, false);
        declareFunction("tm_handle_reorder_relations", "TM-HANDLE-REORDER-RELATIONS", 1, 0, false);
        declareFunction("tm_remove_active_rel", "TM-REMOVE-ACTIVE-REL", 1, 0, false);
        declareFunction("tm_add_active_rel", "TM-ADD-ACTIVE-REL", 1, 0, false);
        declareFunction("tm_restrict_individual_relation", "TM-RESTRICT-INDIVIDUAL-RELATION", 1, 0, false);
        declareFunction("tm_handle_restrict_individual_relation", "TM-HANDLE-RESTRICT-INDIVIDUAL-RELATION", 1, 0, false);
        declareFunction("tm_restrict_relations_for_thesaurus", "TM-RESTRICT-RELATIONS-FOR-THESAURUS", 0, 1, false);
        declareFunction("tm_handle_restrict_relations_for_thesaurus", "TM-HANDLE-RESTRICT-RELATIONS-FOR-THESAURUS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_html_tm_relation_editing_file() {
        defparameter("*TM-CARDINALITY-POSSIBILITIES*", $list_alt144);
        return NIL;
    }

    public static final SubLObject setup_html_tm_relation_editing_file() {
                html_macros.note_html_handler_function(TM_DEFINE_RELATION);
        html_macros.note_html_handler_function(TM_HANDLE_DEFINE_RELATION);
        html_macros.note_html_handler_function(TM_DEFINE_RELATION_NAME);
        html_macros.note_html_handler_function(TM_HANDLE_DEFINE_RELATION_NAME);
        html_macros.note_html_handler_function(TM_HANDLE_DEFINE_RELATION_2);
        html_macros.note_html_handler_function(TM_HANDLE_DEFINE_RELATION_3);
        html_macros.note_html_handler_function(TM_HANDLE_DEFINE_RELATION_4);
        html_macros.note_html_handler_function(TM_HANDLE_DEFINE_RELATION_5);
        html_macros.note_html_handler_function(TM_HANDLE_DEFINE_RELATION_6);
        html_macros.note_html_handler_function(TM_HANDLE_VERIFY_DEFINE_RELATION);
        html_macros.note_html_handler_function(TM_EDIT_RELATION_PAGE);
        html_macros.note_html_handler_function(TM_HANDLE_EDIT_REL);
        html_macros.note_html_handler_function(TM_KILL_REL);
        html_macros.note_html_handler_function(TM_HANDLE_KILL_REL);
        html_macros.note_html_handler_function(TM_REORDER_RELATIONS_DISPLAY);
        html_macros.note_html_handler_function(TM_HANDLE_REORDER_RELATIONS);
        html_macros.note_html_handler_function(TM_REMOVE_ACTIVE_REL);
        html_macros.note_html_handler_function(TM_ADD_ACTIVE_REL);
        html_macros.note_html_handler_function(TM_RESTRICT_INDIVIDUAL_RELATION);
        html_macros.note_html_handler_function(TM_HANDLE_RESTRICT_INDIVIDUAL_RELATION);
        html_macros.note_html_handler_function(TM_RESTRICT_RELATIONS_FOR_THESAURUS);
        html_macros.note_html_handler_function(TM_HANDLE_RESTRICT_RELATIONS_FOR_THESAURUS);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $DEFINE_RELATION_STATE = makeKeyword("DEFINE-RELATION-STATE");



    static private final SubLString $$$symmetric = makeString("symmetric");

    private static final SubLSymbol $ARG1_TYPE = makeKeyword("ARG1-TYPE");

    private static final SubLSymbol $PT = makeKeyword("PT");

    private static final SubLSymbol $ARG2_TYPE = makeKeyword("ARG2-TYPE");

    private static final SubLSymbol $ARG1_FORMAT = makeKeyword("ARG1-FORMAT");

    private static final SubLSymbol $ARG2_FORMAT = makeKeyword("ARG2-FORMAT");

    private static final SubLSymbol $RELATION_TYPE = makeKeyword("RELATION-TYPE");





    public static final SubLSymbol $kw11$TRANSITIVE_ = makeKeyword("TRANSITIVE?");

    static private final SubLString $$$transitive = makeString("transitive");

    static private final SubLString $$$asymmetric = makeString("asymmetric");







    private static final SubLSymbol $NON_PT = makeKeyword("NON-PT");

    static private final SubLString $str_alt18$Nothing_has_been_defined_yet_ = makeString("Nothing has been defined yet.");

    private static final SubLSymbol $RELATION_NAME = makeKeyword("RELATION-NAME");

    private static final SubLSymbol $INVERSE_NAME = makeKeyword("INVERSE-NAME");







    static private final SubLString $str_alt24$Relation_Name__ = makeString("Relation Name: ");

    static private final SubLString $str_alt25$Inverse_Name__ = makeString("Inverse Name: ");

    static private final SubLString $str_alt26$Inverse_ = makeString("Inverse:");

    static private final SubLString $str_alt27$This_relation_has_no_inverse_ = makeString("This relation has no inverse.");

    static private final SubLString $str_alt28$Type___ = makeString("Type:  ");

    static private final SubLString $$$Hierarchical = makeString("Hierarchical");

    static private final SubLString $$$Lexical = makeString("Lexical");

    static private final SubLString $$$Documentation = makeString("Documentation");

    static private final SubLString $$$URL = makeString("URL");



    static private final SubLString $$$Custom = makeString("Custom");



    static private final SubLString $str_alt36$Comment__ = makeString("Comment: ");

    static private final SubLString $str_alt37$The_first_value__ = makeString("The first value :");

    static private final SubLString $$$Must_be_a_Preferred_Term = makeString("Must be a Preferred Term");

    static private final SubLString $$$Cannot_be_a_Preferred_Term = makeString("Cannot be a Preferred Term");

    static private final SubLString $str_alt40$Error__Bad_value_for_arg1_type = makeString("Error: Bad value for arg1-type");

    static private final SubLString $str_alt41$The_second_value__ = makeString("The second value :");

    static private final SubLString $str_alt42$Error__Bad_value_for_arg2_type = makeString("Error: Bad value for arg2-type");

    static private final SubLString $str_alt43$Cardinality__ = makeString("Cardinality: ");

    static private final SubLString $str_alt44$Property_ = makeString("Property:");

    static private final SubLString $$$Transitive = makeString("Transitive");

    static private final SubLString $str_alt46$Broader_Relations__ = makeString("Broader Relations: ");

    static private final SubLString $str_alt47$Define_Relation___Type = makeString("Define Relation - Type");

    static private final SubLString $$$administrator = makeString("administrator");

    static private final SubLString $str_alt49$Sorry__you_do_not_have_permission = makeString("Sorry, you do not have permission to access this page.");

    static private final SubLString $str_alt50$tm_define_relation = makeString("tm-define-relation");

    static private final SubLString $str_alt51$tm_handle_define_relation = makeString("tm-handle-define-relation");

    static private final SubLString $str_alt52$Choose_the_type_of_relation_to_de = makeString("Choose the type of relation to define.");

    static private final SubLString $$$type = makeString("type");

    static private final SubLString $str_alt54$_HIERARCHICAL = makeString(":HIERARCHICAL");

    static private final SubLString $str_alt55$Hierarchical__ = makeString("Hierarchical. ");

    static private final SubLString $str_alt56$Hierarchical_relations_link_prefe = makeString("Hierarchical relations link preferred terms.  They can be displayed in the Hierarchical Display (see Preferences).  The Integrity Checker will detect cycles involving hierarchical relations, since they are transitive and asymmetric.  Hierarchial relations are always many-to-many.  Examples of hierarchical relations include BT (broader-term) and its inverse, NT (narrower-term).");

    static private final SubLString $str_alt57$_LEXICAL = makeString(":LEXICAL");

    static private final SubLString $str_alt58$Lexical__ = makeString("Lexical. ");

    static private final SubLString $str_alt59$Lexical_relations_link_a_preferre = makeString("Lexical relations link a preferred term to a string.  Unlike Documentation relations, a special alphabetical index is maintained for each lexical relation, which enables lookup of preferred terms via the string.  (Because of this index, a lexical relation is more costly in terms of storage space than a documentation relation.)  The Alphabetical Display and Find All utility can be configured to use any combination of lexical relations while searching (see Preferences).  Lexical relations may be many-to-many, one-to-one, or anything in between.  An example of a lexical relation is UF (use-for).");

    static private final SubLString $str_alt60$_DOCUMENTATION = makeString(":DOCUMENTATION");

    static private final SubLString $str_alt61$Documentation__ = makeString("Documentation. ");

    static private final SubLString $str_alt62$Documentation_relations_link_a_pr = makeString("Documentation relations link a preferred term to a string.  They do not usually have inverses.  No index is maintained for documentation relations, so they are not searchable.  Documentation relations may be either many-to-one, or many-to-many.  An example of a documentation relation is SN (scope-note).");

    static private final SubLString $str_alt63$_URL = makeString(":URL");

    static private final SubLString $str_alt64$URL__ = makeString("URL. ");

    static private final SubLString $str_alt65$URL_relations_link_a_preferred_te = makeString("URL relations link a preferred term to a Uniform Resource Locator (URL) link to an external internet address. They do not usually have inverses. No index is maintained for URL relations. URL relations may be either many-to-one or many-to-many.");

    static private final SubLString $str_alt66$_CUSTOM = makeString(":CUSTOM");

    static private final SubLString $str_alt67$Custom__ = makeString("Custom. ");

    static private final SubLString $str_alt68$Choose_this_type_if_your_relation = makeString("Choose this type if your relation doesn't fit into the types described above.");

    static private final SubLString $$$Continue = makeString("Continue");

    private static final SubLSymbol TM_DEFINE_RELATION = makeSymbol("TM-DEFINE-RELATION");

    private static final SubLSymbol TM_HANDLE_DEFINE_RELATION = makeSymbol("TM-HANDLE-DEFINE-RELATION");

    static private final SubLString $str_alt72$Define_Relation___Name = makeString("Define Relation - Name");

    static private final SubLString $str_alt73$tm_define_relation_name = makeString("tm-define-relation-name");

    static private final SubLString $str_alt74$tm_handle_define_relation_name = makeString("tm-handle-define-relation-name");

    static private final SubLString $str_alt75$Enter_Relation_Name_ = makeString("Enter Relation Name:");

    static private final SubLString $$$name = makeString("name");

    static private final SubLString $str_alt77$ = makeString("");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt79$Inverse_Options_ = makeString("Inverse Options:");

    static private final SubLString $$$inverse = makeString("inverse");

    static private final SubLString $str_alt81$_NONE = makeString(":NONE");

    static private final SubLList $list_alt82 = list(makeKeyword("DOCUMENTATION"), makeKeyword("URL"));

    static private final SubLString $str_alt83$_This_relation_has_no_inverse_ = makeString(" This relation has no inverse.");

    static private final SubLList $list_alt84 = list(makeKeyword("HIERARCHICAL"), makeKeyword("LEXICAL"), makeKeyword("DOCUMENTATION"), makeKeyword("URL"));

    static private final SubLString $str_alt85$_SELF = makeString(":SELF");

    static private final SubLString $str_alt86$_This_relation_is_its_own_inverse = makeString(" This relation is its own inverse.");

    static private final SubLString $str_alt87$_OTHER = makeString(":OTHER");

    static private final SubLString $str_alt88$_Inverse_Name__ = makeString(" Inverse Name: ");

    static private final SubLString $str_alt89$inverse_name = makeString("inverse-name");

    static private final SubLString $str_alt90$The_relation_as_defined_so_far_ = makeString("The relation as defined so far:");

    private static final SubLSymbol TM_DEFINE_RELATION_NAME = makeSymbol("TM-DEFINE-RELATION-NAME");

    static private final SubLString $str_alt92$No_relation_name_was_specified_ = makeString("No relation name was specified.");



    static private final SubLString $str_alt94$Relation_and_inverse_names_can_t_ = makeString("Relation and inverse names can't have spaces.");

    static private final SubLString $str_alt95$You_must_choose_one_of_the_Invers = makeString("You must choose one of the Inverse options");



    static private final SubLString $str_alt97$_A_Relations_are_asymmetric_and_s = makeString("~A Relations are asymmetric and so, cannot be their own inverse.<BR>Please choose a different name for the inverse.");

    static private final SubLString $str_alt98$_A = makeString("~A");





    static private final SubLString $str_alt101$No_name_was_specified_for_the_inv = makeString("No name was specified for the inverse.");

    static private final SubLString $str_alt102$Implementation_error__can_t_handl = makeString("Implementation error: can't handle ~A");

    static private final SubLString $str_alt103$The_name__A_is_already_in_use_ = makeString("The name ~A is already in use.");

    private static final SubLSymbol TM_HANDLE_DEFINE_RELATION_NAME = makeSymbol("TM-HANDLE-DEFINE-RELATION-NAME");

    static private final SubLString $str_alt105$Define_Relation___A = makeString("Define Relation: ~A");

    static private final SubLString $str_alt106$_and__A = makeString(" and ~A");

    static private final SubLString $str_alt107$tm_define_relation_2 = makeString("tm-define-relation-2");

    static private final SubLString $str_alt108$tm_handle_define_relation_2 = makeString("tm-handle-define-relation-2");

    static private final SubLString $str_alt109$Describe_the_meaning_of__A__ = makeString("Describe the meaning of ~A: ");

    static private final SubLString $$$comment = makeString("comment");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $str_alt112$Fill_in_an_example___It_doesn_t_h = makeString("Fill in an example.  It doesn't have to use existing thesaurus terms.");

    static private final SubLString $str_alt113$1_ = makeString("1:");

    static private final SubLString $str_alt114$term_1 = makeString("term-1");

    static private final SubLString $str_alt115$___ = makeString("-->");



    static private final SubLString $str_alt117$___ = makeString("<--");

    static private final SubLString $str_alt118$2_ = makeString("2:");

    static private final SubLString $str_alt119$term_2 = makeString("term-2");

    static private final SubLString $str_alt120$__Example_uses____A__A__A_____A__ = makeString("  Example uses:  ~A ~A ~A ;  ~A ~A ~A");

    static private final SubLString $str_alt121$__Example_use____A__A__A = makeString("  Example use:  ~A ~A ~A");

    static private final SubLString $str_alt122$There_is_no_Define_Relation_in_pr = makeString("There is no Define Relation in progress. Please start from the first page.");

    static private final SubLString $str_alt123$You_need_to_provide_a_comment_str = makeString("You need to provide a comment string when defining a relation.");

    static private final SubLString $str_alt124$You_need_to_fill_in_both_the_exam = makeString("You need to fill in both the example boxes.");

    private static final SubLSymbol TM_HANDLE_DEFINE_RELATION_2 = makeSymbol("TM-HANDLE-DEFINE-RELATION-2");

    static private final SubLString $str_alt126$tm_define_relation_3 = makeString("tm-define-relation-3");

    static private final SubLString $str_alt127$You_can_go_back_to_the_previous_p = makeString("You can go back to the previous page and change your settings, if desired.");

    static private final SubLString $str_alt128$Thesaurus_relations_may_go_betwee = makeString("Thesaurus relations may go between preferred terms (e.g., NT and BT), or between a preferred term and something that is not.  Common examples of the latter case include SN (between a preferred term and a documentation string), USE (between a string which is not a preferred term, and a preferred term) and UF (between a PT and a string which is not a PT).  Notice that if a relation is its own inverse (i.e., is Symmetric), both values must be preferred terms.  Also, if a relation is to be single-valued for one of its values, the other value must be a preferred term, because if it's not, the system cannot do the proper checking.");

    static private final SubLString $str_alt129$In_the_thesaurus_fact_A___A___A__ = makeString("In the thesaurus fact~A  `A' ~A `B'");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $str_alt131$__and___B___A__A_ = makeString("  and  `B' ~A `A'");

    static private final SubLString $str_alt132$tm_handle_define_relation_3 = makeString("tm-handle-define-relation-3");

    static private final SubLString $str_alt133$The_A_value___ = makeString("The A value : ");

    static private final SubLString $str_alt134$arg1_type = makeString("arg1-type");

    static private final SubLString $str_alt135$_PT = makeString(":PT");

    static private final SubLString $str_alt136$_Must_be_a_preferred_term = makeString(" Must be a preferred term");

    static private final SubLString $str_alt137$_non_pt = makeString(":non-pt");

    static private final SubLString $str_alt138$_Cannot_be_a_preferred_term = makeString(" Cannot be a preferred term");

    static private final SubLString $str_alt139$The_B_value___ = makeString("The B value : ");

    static private final SubLString $str_alt140$arg2_type = makeString("arg2-type");

    static private final SubLString $str_alt141$A_thesaurus_relation_can_t_be_bet = makeString("A thesaurus relation can't be between two non-preferred-terms.  One of its values must be a preferred term.");

    static private final SubLString $str_alt142$Since__A_is_its_own_inverse__both = makeString("Since ~A is its own inverse, both values must be preferred terms.");

    private static final SubLSymbol TM_HANDLE_DEFINE_RELATION_3 = makeSymbol("TM-HANDLE-DEFINE-RELATION-3");

    static private final SubLList $list_alt144 = list(makeString("MANY to MANY"), makeString("MANY to ONE"), makeString("ONE to MANY"), makeString("ONE to ONE"));

    private static final SubLSymbol $ONE = makeKeyword("ONE");



    private static final SubLSymbol $MANY_TO_MANY = makeKeyword("MANY-TO-MANY");

    private static final SubLSymbol $MANY_TO_ONE = makeKeyword("MANY-TO-ONE");

    private static final SubLSymbol $ONE_TO_MANY = makeKeyword("ONE-TO-MANY");

    private static final SubLSymbol $ONE_TO_ONE = makeKeyword("ONE-TO-ONE");

    static private final SubLList $list_alt151 = list(list($MANY, $MANY), list($MANY, makeKeyword("ONE")), list(makeKeyword("ONE"), $MANY), list(makeKeyword("ONE"), makeKeyword("ONE")));

    static private final SubLList $list_alt152 = list($MANY, makeKeyword("ONE"));

    static private final SubLList $list_alt153 = list(makeKeyword("ONE"), $MANY);

    static private final SubLList $list_alt154 = list(makeKeyword("ONE"), makeKeyword("ONE"));

    static private final SubLString $str_alt155$tm_define_relation_4 = makeString("tm-define-relation-4");

    static private final SubLString $str_alt156$Some_relations_have_restrictions_ = makeString("Some relations have restrictions on the number of values they can have in the first or second place.  For example, SN: Given a particular term, it can have only one scope note.  But given a particular string used as a scope note, it can appear on more than one term.  Therefore we say that the relation SN is 'many to one'.  Or, take another example: RT is 'many to many', since any term may have many related terms and be related to many terms.  Note that if the second value to the relation must not be a preferred term, then the cardinality of the relation can't be single-valued in the first position, and vice-versa.");

    static private final SubLString $str_alt157$This_information_will_be_used_whe = makeString("This information will be used when adding new thesaurus facts using the relation you are defining.  If the relation REL is 'one to many', and the thesaurus already contains the fact 'A REL B', you will not be allowed to state 'C REL B', but you can add 'A REL C'.");

    static private final SubLString $str_alt158$tm_handle_define_relation_4 = makeString("tm-handle-define-relation-4");

    static private final SubLString $str_alt159$Choose_the_Cardinality_for__A_ = makeString("Choose the Cardinality for ~A:");

    static private final SubLString $$$count = makeString("count");

    static private final SubLList $list_alt161 = list($MANY, $MANY);

    private static final SubLSymbol TM_CARDINALITY_STRING = makeSymbol("TM-CARDINALITY-STRING");

    static private final SubLString $$$MANY_to_MANY = makeString("MANY to MANY");

    static private final SubLString $$$MANY_to_ONE = makeString("MANY to ONE");

    static private final SubLString $$$ONE_to_MANY = makeString("ONE to MANY");

    static private final SubLString $$$ONE_to_ONE = makeString("ONE to ONE");

    static private final SubLString $str_alt167$Implementation_error__Can_t_handl = makeString("Implementation error: Can't handle count = ~A");

    static private final SubLString $str_alt168$Since__A_is_its_own_inverse__it_m = makeString("Since ~A is its own inverse, it must be either one-to-one or many-to-many.");

    private static final SubLSymbol TM_HANDLE_DEFINE_RELATION_4 = makeSymbol("TM-HANDLE-DEFINE-RELATION-4");

    static private final SubLString $str_alt170$tm_define_relation_5 = makeString("tm-define-relation-5");

    static private final SubLString $str_alt171$Transitive_relations_are_those_fo = makeString("Transitive relations are those for which the following is true: Whenever 'A REL B' and 'B REL C' is true, 'A REL C' is also true.  'Greater-than' is one example -- whenever X is greater than Y, and Y is greater than Z, then X is greater than Z.  Among thesaurus relations, NT and BT are transitive.  SYN is transitive.   Note that if a relation is transitive, its inverse is also transitive.");

    static private final SubLString $str_alt172$This_information_will_be_used_whe = makeString("This information will be used when stating thesaurus facts using the relation you are defining.  If the relation is transitive, redundant links will be warned about.");

    static private final SubLString $str_alt173$tm_handle_define_relation_5 = makeString("tm-handle-define-relation-5");

    static private final SubLString $str_alt174$_A_is_transitive = makeString("~A is transitive");

    static private final SubLString $str_alt175$Symmetric_relations_are_those_for = makeString("Symmetric relations are those for which the following is true: Whenever 'A REL B' is known, 'B REL A' is also known.  RT is one example; because of this, if 'dog RT bone' is true, then 'bone RT dog' is true.  This is the same as a relation being its own inverse.  Other relations are asymmetric, meaning if 'A REL B' is known, 'B REL A' is not true.  NT and BT are asymmetric. Note that if a relation is asymmetric, its inverse (if any) is asymmetric.");

    static private final SubLString $str_alt176$This_information_will_be_used_whe = makeString("This information will be used when thesaurus facts are stated using the relation you are defining.  If it is symmetric, then anytime 'A REL B' is stated the thesaurus will also automatically know 'B REL A'.  If the relation is asymmetric, the system won't let you state 'B REL A' if it already knows 'A REL B'.  If the relation is both transitive and asymmetric (such as NT and BT), the system will prevent statements that would cause cycles.");

    static private final SubLString $str_alt177$_A_is_symmetric = makeString("~A is symmetric");

    static private final SubLString $str_alt178$_A_is_asymmetric = makeString("~A is asymmetric");

    private static final SubLSymbol TM_HANDLE_DEFINE_RELATION_5 = makeSymbol("TM-HANDLE-DEFINE-RELATION-5");

    static private final SubLString $str_alt180$tm_define_relation_6 = makeString("tm-define-relation-6");

    static private final SubLString $str_alt181$Just_as_terms_can_be_placed_in_a_ = makeString("Just as terms can be placed in a hierarchy of narrower and broader terms, relations can be arranged into a hierarchy of narrower and broader relations.  What does it mean if one relation is considered broader than another, as in 'REL1 BROADER-REL REL2' ? This means that if 'A REL2 B' is known, the thesaurus can be interpreted to know 'A REL1 B'.  For example, assume that the relation SUBCLASS is a narrower relation of NT.  So, whenever the thesaurus knows, for example, 'mammal SUBCLASS dog', it also knows 'mammal NT dog'.");

    static private final SubLString $str_alt182$Note_that_if_a_relation_has_a_bro = makeString("Note that if a relation has a broader relation, the inverse of that term has the inverse of the broader relation as its broader relation.  For example, SUPERCLASS is the inverse of SUBCLASS.  Since NT is a broader relation of SUBCLASS, BT is a broader relation of SUPERCLASS.");

    static private final SubLString $str_alt183$tm_handle_define_relation_6 = makeString("tm-handle-define-relation-6");

    static private final SubLString $str_alt184$Enter_Broader_Relations_for__A__i = makeString("Enter Broader Relations for ~A, if any: ");

    private static final SubLSymbol $VIEW_RELATIONS = makeKeyword("VIEW-RELATIONS");

    static private final SubLString $$$broaders = makeString("broaders");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $str_alt188$The_relation__as_defined_so_far_ = makeString("The relation, as defined so far:");





    static private final SubLString $str_alt191$_A_is_not_a_defined_relation_ = makeString("~A is not a defined relation.");

    static private final SubLString $str_alt192$Implementation_error___A_is_not_a = makeString("Implementation error: ~A is not a valid term-arg.");

    static private final SubLString $str_alt193$A_relation_and_its_broader_relati = makeString("A relation and its broader relation must have the same type of first value.  For ~A it is ~S, but for ~A it is ~S.");

    static private final SubLString $$$A_Preferred_Term = makeString("A Preferred Term");

    static private final SubLString $$$Not_A_Preferred_Term = makeString("Not A Preferred Term");

    static private final SubLString $str_alt196$A_relation_and_its_broader_relati = makeString("A relation and its broader relation must have the same type of second value.  For ~A it is ~S, but for ~A it is ~S.");

    private static final SubLSymbol TM_HANDLE_DEFINE_RELATION_6 = makeSymbol("TM-HANDLE-DEFINE-RELATION-6");

    static private final SubLString $str_alt198$Verify_Define_Relation___A = makeString("Verify Define Relation: ~A");

    static private final SubLString $str_alt199$tm_verify_define_relation = makeString("tm-verify-define-relation");

    static private final SubLString $str_alt200$Please_check_the_defininition_of_ = makeString("Please check the defininition of ~A.  If it's OK, click on Define to perform the changes.");

    static private final SubLString $str_alt201$tm_handle_verify_define_relation = makeString("tm-handle-verify-define-relation");

    static private final SubLString $$$Define = makeString("Define");

    static private final SubLString $$$Define_Relation_Results = makeString("Define Relation Results");

    private static final SubLSymbol $WARNING = makeKeyword("WARNING");





    static private final SubLString $str_alt207$Define_relation__a = makeString("Define relation ~a");



    static private final SubLString $str_alt209$_was_defined = makeString(" was defined");

    static private final SubLString $$$Relation_definition_failed = makeString("Relation definition failed");

    static private final SubLString $str_alt211$_successfully_ = makeString(" successfully.");

    static private final SubLString $str_alt212$_with_these_errors_or_warnings_ = makeString(" with these errors or warnings:");

    static private final SubLString $str_alt213$Errors_ = makeString("Errors:");

    static private final SubLString $str_alt214$Warnings_ = makeString("Warnings:");

    private static final SubLSymbol TM_HANDLE_VERIFY_DEFINE_RELATION = makeSymbol("TM-HANDLE-VERIFY-DEFINE-RELATION");

    static private final SubLString $str_alt216$No_thesaurus_relation_found_by_ID = makeString("No thesaurus relation found by ID ~A.  Perhaps the page was stale.");

    static private final SubLString $str_alt217$No_thesaurus_relation_found_by_Na = makeString("No thesaurus relation found by Name ~A.  Perhaps the page was stale.");

    static private final SubLString $str_alt218$Edit_Relation___a = makeString("Edit Relation: ~a");

    static private final SubLString $str_alt219$tm_edit_rel = makeString("tm-edit-rel");

    static private final SubLString $str_alt220$tm_handle_edit_rel = makeString("tm-handle-edit-rel");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $str_alt222$old_name = makeString("old-name");

    static private final SubLString $str_alt223$Rename_Relation_ = makeString("Rename Relation:");

    static private final SubLString $str_alt224$Enter_a_new_name_for__A_ = makeString("Enter a new name for ~A:");

    static private final SubLString $str_alt225$old_inverse = makeString("old-inverse");

    static private final SubLString $$$Rename_Relation = makeString("Rename Relation");

    static private final SubLString $str_alt227$edit_relation_action = makeString("edit-relation-action");

    static private final SubLString $$$Reset_Page = makeString("Reset Page");

    static private final SubLString $str_alt229$Edit_Comment_ = makeString("Edit Comment:");

    static private final SubLString $str_alt230$Enter_a_new_comment_for__A = makeString("Enter a new comment for ~A");

    static private final SubLString $str_alt231$old_comment = makeString("old-comment");

    static private final SubLString $str_alt232$new_comment = makeString("new-comment");

    static private final SubLString $$$Edit_Comment = makeString("Edit Comment");

    static private final SubLString $str_alt234$Change_Cardinality_ = makeString("Change Cardinality:");

    static private final SubLString $str_alt235$Choose_the_new_cardinality_for__A = makeString("Choose the new cardinality for ~A");

    static private final SubLString $str_alt236$relation_arg_num = makeString("relation-arg-num");

    static private final SubLString $str_alt237$new_cardinality = makeString("new-cardinality");

    static private final SubLString $str_alt238$_s_s_a = makeString("~s~s~a");

    static private final SubLSymbol $sym239$_TO_ = makeSymbol("-TO-");

    static private final SubLString $str_alt240$_s = makeString("~s");

    static private final SubLString $str_alt241$old_cardinality = makeString("old-cardinality");

    static private final SubLString $$$Change_Cardinality = makeString("Change Cardinality");

    static private final SubLString $$$Process_Page = makeString("Process Page");

    private static final SubLSymbol TM_EDIT_RELATION_PAGE = makeSymbol("TM-EDIT-RELATION-PAGE");

    private static final SubLSymbol TM_MESSAGE_TO_USER = makeSymbol("TM-MESSAGE-TO-USER");

    private static final SubLSymbol TM_ERROR = makeSymbol("TM-ERROR");

    static private final SubLString $$$No_Changes_to_Perform = makeString("No Changes to Perform");

    static private final SubLString $str_alt248$No_rename_operations_were_specifi = makeString("No rename operations were specified.");

    private static final SubLSymbol TM_SHOW_RELATION_GUTS = makeSymbol("TM-SHOW-RELATION-GUTS");

    static private final SubLString $str_alt250$No_comment_edit_operations_were_s = makeString("No comment edit operations were specified.");

    static private final SubLString $$$Edit_Relation_Comment = makeString("Edit Relation Comment");

    static private final SubLString $str_alt252$No_cardinality_edit_operations_we = makeString("No cardinality edit operations were specified.");

    static private final SubLString $$$Edit_Relation_Cardinality = makeString("Edit Relation Cardinality");

    static private final SubLString $str_alt254$No_edit_operations_were_specified = makeString("No edit operations were specified.");

    static private final SubLString $$$Edit_Relation = makeString("Edit Relation");

    static private final SubLString $str_alt256$An_unrecognized_command_was_reque = makeString("An unrecognized command was requested from the interface.  Perhaps the page was stale.");

    private static final SubLSymbol TM_HANDLE_EDIT_REL = makeSymbol("TM-HANDLE-EDIT-REL");

    static private final SubLString $str_alt258$Sorry__can_t_name_relations_with_ = makeString("Sorry, can't name relations with the empty string.");

    static private final SubLString $str_alt259$An_asymmetric_relation_cannot_hav = makeString("An asymmetric relation cannot have the same name as its inverse.");



    public static final SubLObject $$tmInverseSymbol = constant_handles.reader_make_constant_shell(makeString("tmInverseSymbol"));

    public static final SubLObject $$tmSymbol = constant_handles.reader_make_constant_shell(makeString("tmSymbol"));

    static private final SubLString $str_alt263$Sorry__can_t_change_comments_to_t = makeString("Sorry, can't change comments to the empty string.");

    public static final SubLObject $$comment = constant_handles.reader_make_constant_shell(makeString("comment"));



    static private final SubLString $str_alt266$___a_is_not_a_valid_cardinality_f = makeString("~%~a is not a valid cardinality for ~a");

    public static final SubLObject $$arg1Format = constant_handles.reader_make_constant_shell(makeString("arg1Format"));

    public static final SubLObject $$arg2Format = constant_handles.reader_make_constant_shell(makeString("arg2Format"));

    public static final SubLObject $$openEntryFormatInArgs = constant_handles.reader_make_constant_shell(makeString("openEntryFormatInArgs"));

    public static final SubLObject $$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell(makeString("singleEntryFormatInArgs"));

    static private final SubLString $str_alt271$Change_Cardinality_of_First_Value = makeString("Change Cardinality of First Value for ~a from ~a to ~a");



    static private final SubLString $str_alt273$Change_Cardinality_of_Second_Valu = makeString("Change Cardinality of Second Value for ~a from ~a to ~a");

    static private final SubLString $str_alt274$Kill__a_ = makeString("Kill ~a?");

    static private final SubLString $str_alt275$tm_kill_rel = makeString("tm-kill-rel");

    static private final SubLString $str_alt276$tm_handle_kill_rel = makeString("tm-handle-kill-rel");

    static private final SubLString $str_alt277$The_relation___A__ = makeString("The relation, ~A, ");

    static private final SubLString $str_alt278$and_its_inverse___A__ = makeString("and its inverse, ~A, ");

    static private final SubLString $str_alt279$will_be_removed_from_the_Thesauru = makeString("will be removed from the Thesaurus Manager.");

    static private final SubLString $str_alt280$All_uses_of_these_relations_will_ = makeString("All uses of these relations will be removed from all thesauri.");

    static private final SubLString $str_alt281$Do_you_wish_to_continue_ = makeString("Do you wish to continue?");

    static private final SubLString $$$Kill = makeString("Kill");

    private static final SubLSymbol TM_KILL_REL = makeSymbol("TM-KILL-REL");

    static private final SubLString $str_alt284$and_its_inverse___A__have = makeString("and its inverse, ~A, have");

    static private final SubLString $$$has = makeString("has");

    static private final SubLString $str_alt286$_been_removed_from_the_Thesaurus_ = makeString(" been removed from the Thesaurus Manager.");

    static private final SubLString $str_alt287$Kill_Relations___a_and__a = makeString("Kill Relations: ~a and ~a");

    static private final SubLString $str_alt288$Kill_Relation___a = makeString("Kill Relation: ~a");

    static private final SubLString $$$Kill_Relation_Results = makeString("Kill Relation Results");

    private static final SubLSymbol TM_HANDLE_KILL_REL = makeSymbol("TM-HANDLE-KILL-REL");

    static private final SubLString $$$Relation_Reordering = makeString("Relation Reordering");

    static private final SubLString $str_alt292$tm_reorder_relations_display = makeString("tm-reorder-relations-display");

    private static final SubLSymbol TM_REORDER_RELATIONS_DISPLAY = makeSymbol("TM-REORDER-RELATIONS-DISPLAY");



    static private final SubLString $str_alt295$Position_is_not_valid_for_the_siz = makeString("Position is not valid for the size of list.");



    static private final SubLString $$$Unrecognized_Case = makeString("Unrecognized Case");

    static private final SubLString $str_alt298$current_order = makeString("current-order");

    static private final SubLString $str_alt299$relation_to_move = makeString("relation-to-move");

    static private final SubLString $str_alt300$positioning_for_relation = makeString("positioning-for-relation");

    static private final SubLString $str_alt301$relation_move_target = makeString("relation-move-target");

    static private final SubLString $$$Before = makeString("Before");

    static private final SubLString $str_alt303$tm_handle_reorder_relations = makeString("tm-handle-reorder-relations");

    static private final SubLString $str_alt304$Choose_a_relation_to_move_and_a_p = makeString("Choose a relation to move and a position to move it to:");



    static private final SubLString $str_alt306$Relation_to_move_ = makeString("Relation to move:");

    static private final SubLString $str_alt307$Adjacent_Relation_ = makeString("Adjacent Relation:");



    static private final SubLString $$$Move = makeString("Move");



    static private final SubLList $list_alt311 = list(makeString("Before"), makeString("After"));

    static private final SubLString $$$Possible_New_Order = makeString("Possible New Order");

    static private final SubLString $$$Current_Order = makeString("Current Order");

    static private final SubLString $$$Make_Displayed_Order_Permanent = makeString("Make Displayed Order Permanent");

    static private final SubLString $str_alt315$reorder_relations_action = makeString("reorder-relations-action");

    static private final SubLString $$$Display_New_Order = makeString("Display New Order");

    static private final SubLString $$$Cancel = makeString("Cancel");

    static private final SubLString $$$Reset_Choices = makeString("Reset Choices");

    static private final SubLString $str_alt319$No_reordering_operations_were_spe = makeString("No reordering operations were specified.");

    private static final SubLSymbol INIT_PRED_SYMBOL_ORDER_FROM_KB = makeSymbol("INIT-PRED-SYMBOL-ORDER-FROM-KB");

    static private final SubLString $$$Reorder_Relations = makeString("Reorder Relations");

    private static final SubLSymbol TM_HANDLE_REORDER_RELATIONS = makeSymbol("TM-HANDLE-REORDER-RELATIONS");

    static private final SubLString $str_alt323$Implementation_error__Couldn_t_de = makeString("Implementation error: Couldn't determine a relation from ~a.");

    static private final SubLString $$$Remove_Active_Relation = makeString("Remove Active Relation");

    private static final SubLSymbol TM_REMOVE_ACTIVE_REL = makeSymbol("TM-REMOVE-ACTIVE-REL");

    static private final SubLString $$$Add_Active_Relation = makeString("Add Active Relation");

    private static final SubLSymbol TM_ADD_ACTIVE_REL = makeSymbol("TM-ADD-ACTIVE-REL");

    static private final SubLString $str_alt328$Set_Applicable_Thesauri_for___a = makeString("Set Applicable Thesauri for: ~a");

    static private final SubLString $str_alt329$tm_restrict_individual_relation = makeString("tm-restrict-individual-relation");

    static private final SubLString $str_alt330$tm_handle_restrict_individual_rel = makeString("tm-handle-restrict-individual-relation");

    static private final SubLString $str_alt331$rel_symbol = makeString("rel-symbol");

    static private final SubLString $str_alt332$_a_is_currently_available_in_the_ = makeString("~a is currently available in the following thesauri:");

    static private final SubLString $str_alt333$_a_and__a_are_currently_available = makeString("~a and ~a are currently available in the following thesauri:");

    static private final SubLString $str_alt334$The_radio_buttons_below_show_the_ = makeString("The radio buttons below show the current thesaurus/thesauri that the relation is available and unavailable in.");

    static private final SubLString $str_alt335$Clicking_on_the_buttons_allows_th = makeString("Clicking on the buttons allows the user to change the restrictions of the relation.");

    static private final SubLString $$$middle = makeString("middle");

    static private final SubLString $$$Available_In = makeString("Available In");

    static private final SubLString $$$Unavailable_In = makeString("Unavailable In");

    private static final SubLSymbol $THESAURUS = makeKeyword("THESAURUS");

    static private final SubLString $str_alt340$_delete = makeString(":delete");

    static private final SubLString $str_alt341$_add = makeString(":add");

    static private final SubLString $str_alt342$When_you_are_done_with_editing_re = makeString("When you are done with editing restrictions, click on Set Restrictions to perform the changes.");

    static private final SubLString $$$Set_Restrictions = makeString("Set Restrictions");

    static private final SubLString $$$Reset = makeString("Reset");

    private static final SubLSymbol TM_RESTRICT_INDIVIDUAL_RELATION = makeSymbol("TM-RESTRICT-INDIVIDUAL-RELATION");

    public static final SubLObject $$tmRelationRestrictedFrom = constant_handles.reader_make_constant_shell(makeString("tmRelationRestrictedFrom"));

    static private final SubLString $str_alt347$_A_relation__A_to_be_used_in_thes = makeString("~A relation ~A to be used in thesaurus ~A");

    static private final SubLString $str_alt348$Don_t_allow = makeString("Don't allow");

    static private final SubLString $$$Allow = makeString("Allow");

    static private final SubLString $str_alt350$No_restriction_operations_were_ch = makeString("No restriction operations were changed.");

    private static final SubLSymbol TM_SHOW_RELATION_IN_AVAILABLE_THESAURI = makeSymbol("TM-SHOW-RELATION-IN-AVAILABLE-THESAURI");

    static private final SubLString $$$Set_Relation_Restrictions = makeString("Set Relation Restrictions");

    private static final SubLSymbol TM_HANDLE_RESTRICT_INDIVIDUAL_RELATION = makeSymbol("TM-HANDLE-RESTRICT-INDIVIDUAL-RELATION");

    static private final SubLString $str_alt354$Choose_Applicable_Relations_for__ = makeString("Choose Applicable Relations for '~a' Thesaurus");

    static private final SubLString $str_alt355$limited_editor = makeString("limited-editor");

    static private final SubLString $str_alt356$tm_restrict_relations_for_thesaur = makeString("tm-restrict-relations-for-thesaurus");

    static private final SubLString $str_alt357$tm_handle_restrict_relations_for_ = makeString("tm-handle-restrict-relations-for-thesaurus");

    static private final SubLString $$$args = makeString("args");

    static private final SubLString $str_alt359$inactive_ = makeString("inactive?");

    static private final SubLString $str_alt360$Choose_a_Relation_to_Display_ = makeString("Choose a Relation to Display:");

    static private final SubLString $str_alt361$Core_Relations__ = makeString("Core Relations: ");

    static private final SubLString $str_alt362$_ = makeString(" ");

    static private final SubLString $$$Unrestricted_Relations = makeString("Unrestricted Relations");

    static private final SubLString $$$Restricted_Relations = makeString("Restricted Relations");

    private static final SubLSymbol $EDIT_THESAURI = makeKeyword("EDIT-THESAURI");

    static private final SubLString $str_alt366$_A_ = makeString("~A?");

    static private final SubLString $str_alt367$tm_restrict_relations_for_thesaur = makeString("tm-restrict-relations-for-thesaurus|~a|T");

    static private final SubLString $$$Choose = makeString("Choose");

    static private final SubLString $str_alt369$___ = makeString(" / ");

    static private final SubLString $str_alt370$tm_browse_restriction_relations_e = makeString("tm-browse-restriction-relations-entry|~a|T");

    static private final SubLString $$$View = makeString("View");

    static private final SubLString $str_alt372$_NON_ACTIVE_Applicable_Relations_ = makeString(" NON-ACTIVE Applicable Relations for Thesaurus.");

    private static final SubLSymbol TM_RESTRICT_RELATIONS_FOR_THESAURUS = makeSymbol("TM-RESTRICT-RELATIONS-FOR-THESAURUS");

    static private final SubLString $str_alt374$_A_relation__A__and_its_inverse__ = makeString("~A relation ~A (and its inverse, if it has one) to be used in thesaurus ~A");

    private static final SubLSymbol TM_BROWSE_RESTRICTION_RELATIONS_ENTRY_GUTS = makeSymbol("TM-BROWSE-RESTRICTION-RELATIONS-ENTRY-GUTS");

    private static final SubLSymbol TM_HANDLE_RESTRICT_RELATIONS_FOR_THESAURUS = makeSymbol("TM-HANDLE-RESTRICT-RELATIONS-FOR-THESAURUS");

    // // Initializers
    public void declareFunctions() {
        declare_html_tm_relation_editing_file();
    }

    public void initializeVariables() {
        init_html_tm_relation_editing_file();
    }

    public void runTopLevelForms() {
        setup_html_tm_relation_editing_file();
    }
}

