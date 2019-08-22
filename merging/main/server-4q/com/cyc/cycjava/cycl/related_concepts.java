/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class related_concepts extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new related_concepts();

 public static final String myName = "com.cyc.cycjava.cycl.related_concepts";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RELATED_CONCEPTS_XML = makeSymbol("RELATED-CONCEPTS-XML");



    static private final SubLString $$$meanings = makeString("meanings");

    private static final SubLString $$$meaning = makeString("meaning");

    private static final SubLString $$$openCycId = makeString("openCycId");

    private static final SubLString $$$nlString = makeString("nlString");

    private static final SubLString $$$category = makeString("category");

    private static final SubLString $$$relatedTerm = makeString("relatedTerm");

    private static final SubLSymbol RELATED_CONCEPTS = makeSymbol("RELATED-CONCEPTS");

    private static final SubLList $list16 = list(makeKeyword("PPH-GENERATION-COUNT"), makeKeyword("POSITIVE-INFINITY"));

    private static final SubLList $list18 = list(makeSymbol("CYCL-SENTENCE"), cons(makeSymbol("NL-STRING"), makeSymbol("ARGS")), makeSymbol("FRAGMENT-TYPE"));

    private static final SubLSymbol BINDINGS_VALUES = makeSymbol("BINDINGS-VALUES");

    private static final SubLList $list21 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    // Definitions
    public static final SubLObject related_concepts_xml_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sexpr_result = com.cyc.cycjava.cycl.related_concepts.related_concepts(string, mt);
                SubLObject result_string = NIL;
                {
                    SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(NIL, thread);
                        try {
                            xml_vars.$xml_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                            {
                                SubLObject _prev_bind_0_1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$meanings, NIL, NIL);
                                    {
                                        SubLObject cdolist_list_var = sexpr_result;
                                        SubLObject meaning = NIL;
                                        for (meaning = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning = cdolist_list_var.first()) {
                                            xml_utilities.xml_terpri();
                                            {
                                                SubLObject term_id = getf(meaning, $MEANING_ID, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$meaning, list($$$openCycId, term_id), NIL);
                                                        {
                                                            SubLObject cdolist_list_var_4 = getf(meaning, $NL_STRINGS, UNPROVIDED);
                                                            SubLObject nl_string = NIL;
                                                            for (nl_string = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , nl_string = cdolist_list_var_4.first()) {
                                                                xml_utilities.xml_terpri();
                                                                {
                                                                    SubLObject _prev_bind_0_5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$nlString, NIL, NIL);
                                                                        xml_utilities.xml_print(nl_string, UNPROVIDED);
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_6, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_5, thread);
                                                                    }
                                                                }
                                                                xml_utilities.xml_end_tag_internal($$$nlString);
                                                            }
                                                        }
                                                        {
                                                            SubLObject cdolist_list_var_7 = getf(meaning, $CATEGORIES, UNPROVIDED);
                                                            SubLObject category = NIL;
                                                            for (category = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , category = cdolist_list_var_7.first()) {
                                                                xml_utilities.xml_terpri();
                                                                {
                                                                    SubLObject _prev_bind_0_8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$category, list($$$nlString, getf(category, $CATEGORY_ID, UNPROVIDED)), NIL);
                                                                        {
                                                                            SubLObject cdolist_list_var_10 = getf(category, $NL_STRINGS, UNPROVIDED);
                                                                            SubLObject nl_string = NIL;
                                                                            for (nl_string = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , nl_string = cdolist_list_var_10.first()) {
                                                                                xml_utilities.xml_terpri();
                                                                                {
                                                                                    SubLObject _prev_bind_0_11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$nlString, NIL, NIL);
                                                                                        xml_utilities.xml_print(nl_string, UNPROVIDED);
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_12, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_11, thread);
                                                                                    }
                                                                                }
                                                                                xml_utilities.xml_end_tag_internal($$$nlString);
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject cdolist_list_var_13 = getf(category, $RELATED, UNPROVIDED);
                                                                            SubLObject related_term = NIL;
                                                                            for (related_term = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , related_term = cdolist_list_var_13.first()) {
                                                                                xml_utilities.xml_terpri();
                                                                                {
                                                                                    SubLObject _prev_bind_0_14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$relatedTerm, list($$$openCycId, getf(related_term, $MEANING_ID, UNPROVIDED)), NIL);
                                                                                        {
                                                                                            SubLObject cdolist_list_var_16 = getf(related_term, $NL_STRINGS, UNPROVIDED);
                                                                                            SubLObject nl_string = NIL;
                                                                                            for (nl_string = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , nl_string = cdolist_list_var_16.first()) {
                                                                                                xml_utilities.xml_terpri();
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                    try {
                                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                        xml_utilities.xml_start_tag_internal($$$nlString, NIL, NIL);
                                                                                                        xml_utilities.xml_print(nl_string, UNPROVIDED);
                                                                                                    } finally {
                                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_18, thread);
                                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_17, thread);
                                                                                                    }
                                                                                                }
                                                                                                xml_utilities.xml_end_tag_internal($$$nlString);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_15, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_14, thread);
                                                                                    }
                                                                                }
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal($$$relatedTerm);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_9, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$category);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_3, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$meaning);
                                            }
                                        }
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$meanings);
                            result_string = get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
                        } finally {
                            {
                                SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close(xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                }
                return result_string;
            }
        }
    }

    // Definitions
    public static SubLObject related_concepts_xml(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sexpr_result = related_concepts(string, mt);
        SubLObject result_string = NIL;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(NIL, thread);
            try {
                xml_vars.$xml_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                try {
                    final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$meanings, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            SubLObject cdolist_list_var = sexpr_result;
                            SubLObject meaning = NIL;
                            meaning = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                xml_utilities.xml_terpri();
                                final SubLObject term_id = getf(meaning, $MEANING_ID, UNPROVIDED);
                                try {
                                    final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$meaning, list($$$openCycId, term_id), NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            SubLObject cdolist_list_var_$6 = getf(meaning, $NL_STRINGS, UNPROVIDED);
                                            SubLObject nl_string = NIL;
                                            nl_string = cdolist_list_var_$6.first();
                                            while (NIL != cdolist_list_var_$6) {
                                                xml_utilities.xml_terpri();
                                                try {
                                                    final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$nlString, NIL, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            xml_utilities.xml_print(nl_string, UNPROVIDED);
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$5, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        xml_utilities.xml_end_tag_internal($$$nlString);
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                                    }
                                                }
                                                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                                nl_string = cdolist_list_var_$6.first();
                                            } 
                                            SubLObject cdolist_list_var_$7 = getf(meaning, $CATEGORIES, UNPROVIDED);
                                            SubLObject category = NIL;
                                            category = cdolist_list_var_$7.first();
                                            while (NIL != cdolist_list_var_$7) {
                                                xml_utilities.xml_terpri();
                                                try {
                                                    final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$category, list($$$nlString, getf(category, $CATEGORY_ID, UNPROVIDED)), NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            SubLObject cdolist_list_var_$8 = getf(category, $NL_STRINGS, UNPROVIDED);
                                                            SubLObject nl_string2 = NIL;
                                                            nl_string2 = cdolist_list_var_$8.first();
                                                            while (NIL != cdolist_list_var_$8) {
                                                                xml_utilities.xml_terpri();
                                                                try {
                                                                    final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$nlString, NIL, NIL, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            xml_utilities.xml_print(nl_string2, UNPROVIDED);
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values2 = getValuesAsVector();
                                                                        xml_utilities.xml_end_tag_internal($$$nlString);
                                                                        restoreValuesFromVector(_values2);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                                                    }
                                                                }
                                                                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                                                nl_string2 = cdolist_list_var_$8.first();
                                                            } 
                                                            SubLObject cdolist_list_var_$9 = getf(category, $RELATED, UNPROVIDED);
                                                            SubLObject related_term = NIL;
                                                            related_term = cdolist_list_var_$9.first();
                                                            while (NIL != cdolist_list_var_$9) {
                                                                xml_utilities.xml_terpri();
                                                                try {
                                                                    final SubLObject _prev_bind_0_$13 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$relatedTerm, list($$$openCycId, getf(related_term, $MEANING_ID, UNPROVIDED)), NIL, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            SubLObject cdolist_list_var_$10 = getf(related_term, $NL_STRINGS, UNPROVIDED);
                                                                            SubLObject nl_string3 = NIL;
                                                                            nl_string3 = cdolist_list_var_$10.first();
                                                                            while (NIL != cdolist_list_var_$10) {
                                                                                xml_utilities.xml_terpri();
                                                                                try {
                                                                                    final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$nlString, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                        final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                            xml_utilities.xml_print(nl_string3, UNPROVIDED);
                                                                                        } finally {
                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$15, thread);
                                                                                    }
                                                                                } finally {
                                                                                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        final SubLObject _values3 = getValuesAsVector();
                                                                                        xml_utilities.xml_end_tag_internal($$$nlString);
                                                                                        restoreValuesFromVector(_values3);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                                                                    }
                                                                                }
                                                                                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                                                                nl_string3 = cdolist_list_var_$10.first();
                                                                            } 
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$13, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values4 = getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$relatedTerm);
                                                                        restoreValuesFromVector(_values4);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                                    }
                                                                }
                                                                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                                                related_term = cdolist_list_var_$9.first();
                                                            } 
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values5 = getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$category);
                                                        restoreValuesFromVector(_values5);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                                    }
                                                }
                                                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                                category = cdolist_list_var_$7.first();
                                            } 
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values6 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$meaning);
                                        restoreValuesFromVector(_values6);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                meaning = cdolist_list_var.first();
                            } 
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values7 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$meanings);
                        restoreValuesFromVector(_values7);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                    }
                }
                result_string = get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values8 = getValuesAsVector();
                    close(xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values8);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return result_string;
    }

    static private final SubLList $list_alt15 = list(makeKeyword("PPH-GENERATION-COUNT"), makeKeyword("POSITIVE-INFINITY"));

    static private final SubLList $list_alt17 = list(makeSymbol("CYCL-SENTENCE"), cons(makeSymbol("NL-STRING"), makeSymbol("ARGS")), makeSymbol("FRAGMENT-TYPE"));

    static private final SubLList $list_alt20 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    /**
     *
     *
     * @return listp;  a nested list of the form
    ((:meaning-id HL-ID
    :nl-strings (STRING1 STRING2...)
    :categories
    ((:category-id HL-ID
    :nl-strings (STRING1 STRING2 ...)
    :related
    ((:meaning-id HL-ID
    :nl-strings (STRING1 STRING2 ...))
    MORE-RELATED-MEANINGS))
    MORE-CATEGORIES))
    MORE-MEANINGS)
     */
    @LispMethod(comment = "@return listp;  a nested list of the form\r\n((:meaning-id HL-ID\r\n:nl-strings (STRING1 STRING2...)\r\n:categories\r\n((:category-id HL-ID\r\n:nl-strings (STRING1 STRING2 ...)\r\n:related\r\n((:meaning-id HL-ID\r\n:nl-strings (STRING1 STRING2 ...))\r\nMORE-RELATED-MEANINGS))\r\nMORE-CATEGORIES))\r\nMORE-MEANINGS)")
    public static final SubLObject related_concepts_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject meanings = term_lexicon.denots_for_term_lexicon_entries(methods.funcall_instance_method_with_1_args(term_lexicon.new_term_lexicon(), GET, string));
            SubLObject result = NIL;
            SubLObject cdolist_list_var = meanings;
            SubLObject cycl = NIL;
            for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                {
                    SubLObject meaning_result = list($MEANING_ID, kb_utilities.compact_hl_external_id_string(cycl), $NL_STRINGS, nl_generation_api.cycl_term_to_nl_string_internal(cycl, nl_generation_api.new_pph_parameters($list_alt15)));
                    SubLObject fragments = com.cyc.cycjava.cycl.related_concepts.fragments_mentioning_term(cycl, string, T, mt, $BLANKS, NIL);
                    SubLObject meaning_categories = NIL;
                    SubLObject cdolist_list_var_20 = fragments;
                    SubLObject fragment = NIL;
                    for (fragment = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , fragment = cdolist_list_var_20.first()) {
                        {
                            SubLObject datum = fragment;
                            SubLObject current = datum;
                            SubLObject cycl_sentence = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt17);
                            cycl_sentence = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt17);
                            {
                                SubLObject temp = current.rest();
                                current = current.first();
                                {
                                    SubLObject nl_string = NIL;
                                    SubLObject args = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt17);
                                    nl_string = current.first();
                                    current = current.rest();
                                    args = current;
                                    current = temp;
                                    {
                                        SubLObject fragment_type = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt17);
                                        fragment_type = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject pred = cycl_utilities.formula_arg0(cycl_sentence);
                                                SubLObject fragment_result = list($CATEGORY_ID, nl_generation_api.cycl_term_to_nl_string_internal(pred, $DEFAULT).first());
                                                SubLObject related_terms = Mapping.mapcan(BINDINGS_VALUES, inference_kernel.new_cyc_query(cycl_sentence, mt, $list_alt20), EMPTY_SUBL_OBJECT_ARRAY);
                                                SubLObject related_result = NIL;
                                                SubLObject cdolist_list_var_21 = related_terms;
                                                SubLObject related = NIL;
                                                for (related = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , related = cdolist_list_var_21.first()) {
                                                    related_result = cons(list($MEANING_ID, kb_utilities.compact_hl_external_id_string(related), $NL_STRINGS, nl_generation_api.cycl_term_to_nl_string_internal(related, nl_generation_api.new_pph_parameters($list_alt15))), related_result);
                                                }
                                                fragment_result = putf(fragment_result, $RELATED, related_result);
                                                if (NIL != getf(fragment_result, $RELATED, UNPROVIDED)) {
                                                    meaning_categories = cons(fragment_result, meaning_categories);
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt17);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    meaning_result = putf(meaning_result, $CATEGORIES, meaning_categories);
                    result = cons(meaning_result, result);
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return listp;  a nested list of the form
    ((:meaning-id HL-ID
    :nl-strings (STRING1 STRING2...)
    :categories
    ((:category-id HL-ID
    :nl-strings (STRING1 STRING2 ...)
    :related
    ((:meaning-id HL-ID
    :nl-strings (STRING1 STRING2 ...))
    MORE-RELATED-MEANINGS))
    MORE-CATEGORIES))
    MORE-MEANINGS)
     */
    @LispMethod(comment = "@return listp;  a nested list of the form\r\n((:meaning-id HL-ID\r\n:nl-strings (STRING1 STRING2...)\r\n:categories\r\n((:category-id HL-ID\r\n:nl-strings (STRING1 STRING2 ...)\r\n:related\r\n((:meaning-id HL-ID\r\n:nl-strings (STRING1 STRING2 ...))\r\nMORE-RELATED-MEANINGS))\r\nMORE-CATEGORIES))\r\nMORE-MEANINGS)")
    public static SubLObject related_concepts(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject meanings = term_lexicon.denots_for_term_lexicon_entries(methods.funcall_instance_method_with_1_args(term_lexicon.new_term_lexicon(), GET, string));
        SubLObject result = NIL;
        SubLObject cdolist_list_var = meanings;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject meaning_result = list($MEANING_ID, kb_utilities.compact_hl_external_id_string(cycl), $NL_STRINGS, nl_generation_api.cycl_term_to_nl_string_internal(cycl, nl_generation_api.new_pph_parameters($list16)));
            final SubLObject fragments = fragments_mentioning_term(cycl, string, T, mt, $BLANKS, NIL);
            SubLObject meaning_categories = NIL;
            SubLObject cdolist_list_var_$34 = fragments;
            SubLObject fragment = NIL;
            fragment = cdolist_list_var_$34.first();
            while (NIL != cdolist_list_var_$34) {
                SubLObject current;
                final SubLObject datum = current = fragment;
                SubLObject cycl_sentence = NIL;
                destructuring_bind_must_consp(current, datum, $list18);
                cycl_sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list18);
                final SubLObject temp = current.rest();
                current = current.first();
                SubLObject nl_string = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(current, datum, $list18);
                nl_string = current.first();
                current = args = current.rest();
                current = temp;
                SubLObject fragment_type = NIL;
                destructuring_bind_must_consp(current, datum, $list18);
                fragment_type = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pred = cycl_utilities.formula_arg0(cycl_sentence);
                    SubLObject fragment_result = list($CATEGORY_ID, nl_generation_api.cycl_term_to_nl_string_internal(pred, $DEFAULT).first());
                    final SubLObject related_terms = Mapping.mapcan(BINDINGS_VALUES, inference_kernel.new_cyc_query(cycl_sentence, mt, $list21), EMPTY_SUBL_OBJECT_ARRAY);
                    SubLObject related_result = NIL;
                    SubLObject cdolist_list_var_$35 = related_terms;
                    SubLObject related = NIL;
                    related = cdolist_list_var_$35.first();
                    while (NIL != cdolist_list_var_$35) {
                        related_result = cons(list($MEANING_ID, kb_utilities.compact_hl_external_id_string(related), $NL_STRINGS, nl_generation_api.cycl_term_to_nl_string_internal(related, nl_generation_api.new_pph_parameters($list16))), related_result);
                        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                        related = cdolist_list_var_$35.first();
                    } 
                    fragment_result = putf(fragment_result, $RELATED, related_result);
                    if (NIL != getf(fragment_result, $RELATED, UNPROVIDED)) {
                        meaning_categories = cons(fragment_result, meaning_categories);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list18);
                }
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                fragment = cdolist_list_var_$34.first();
            } 
            meaning_result = putf(meaning_result, $CATEGORIES, meaning_categories);
            result = cons(meaning_result, result);
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject fragments_mentioning_term_alt(SubLObject cycl, SubLObject string, SubLObject must_use_all_tokensP, SubLObject mt, SubLObject variable_format, SubLObject tight_constraint_matching) {
        {
            SubLObject raw_fragments = cae_query_search.get_fragments_for_terms(list(list(string, cycl)), must_use_all_tokensP, mt, variable_format, tight_constraint_matching);
            SubLObject fragments = NIL;
            SubLObject cdolist_list_var = raw_fragments;
            SubLObject fragment = NIL;
            for (fragment = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fragment = cdolist_list_var.first()) {
                if (NIL != cycl_utilities.expression_find(cycl, fragment.first(), NIL, EQUAL, UNPROVIDED)) {
                    fragments = cons(fragment, fragments);
                }
            }
            return fragments;
        }
    }

    public static SubLObject fragments_mentioning_term(final SubLObject cycl, final SubLObject string, final SubLObject must_use_all_tokensP, final SubLObject mt, final SubLObject variable_format, final SubLObject tight_constraint_matching) {
        final SubLObject raw_fragments = cae_query_search.get_fragments_for_terms(list(list(string, cycl)), must_use_all_tokensP, mt, variable_format, tight_constraint_matching, UNPROVIDED);
        SubLObject fragments = NIL;
        SubLObject cdolist_list_var = raw_fragments;
        SubLObject fragment = NIL;
        fragment = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_utilities.expression_find(cycl, fragment.first(), NIL, EQUAL, UNPROVIDED)) {
                fragments = cons(fragment, fragments);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fragment = cdolist_list_var.first();
        } 
        return fragments;
    }

    public static SubLObject declare_related_concepts_file() {
        declareFunction("related_concepts_xml", "RELATED-CONCEPTS-XML", 1, 1, false);
        declareFunction("related_concepts", "RELATED-CONCEPTS", 1, 1, false);
        declareFunction("fragments_mentioning_term", "FRAGMENTS-MENTIONING-TERM", 6, 0, false);
        return NIL;
    }

    public static SubLObject init_related_concepts_file() {
        return NIL;
    }

    public static SubLObject setup_related_concepts_file() {
        register_external_symbol(RELATED_CONCEPTS_XML);
        register_external_symbol(RELATED_CONCEPTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_related_concepts_file();
    }

    @Override
    public void initializeVariables() {
        init_related_concepts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_related_concepts_file();
    }

    
}

/**
 * Total time: 754 ms
 */
