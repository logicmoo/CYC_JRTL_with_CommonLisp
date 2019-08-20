/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class analysis_diagram_tool_widgets extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new analysis_diagram_tool_widgets();



    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    private static final SubLSymbol $value_tables_api_success_for_kb_operations$ = makeSymbol("*VALUE-TABLES-API-SUCCESS-FOR-KB-OPERATIONS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$All_KB_operations_completed_witho = makeString("All KB operations completed without error.");

    private static final SubLSymbol GET_VALUE_TABLE_IN_XML = makeSymbol("GET-VALUE-TABLE-IN-XML");

    private static final SubLSymbol GET_VALUE_TABLES_IN_XML = makeSymbol("GET-VALUE-TABLES-IN-XML");

    static private final SubLString $$$valueTables = makeString("valueTables");

    static private final SubLString $str4$http___www_opencyc_org_xml_valueT = makeString("http://www.opencyc.org/xml/valueTables.dtd");

    private static final SubLList $list6 = list(makeSymbol("VTABLE-ID"), makeSymbol("MT"));

    private static final SubLSymbol CREATE_VALUE_TABLE = makeSymbol("CREATE-VALUE-TABLE");

    private static final SubLString $$$ValueTable = makeString("ValueTable");



    static private final SubLList $list10 = list(reader_make_constant_shell("Individual"));

    static private final SubLList $list11 = list(reader_make_constant_shell("UniversalVocabularyMt"));

    private static final SubLList $list12 = list(reader_make_constant_shell("ValueTable-PCW"));

    private static final SubLSymbol DROP_VALUE_TABLE = makeSymbol("DROP-VALUE-TABLE");

    private static final SubLSymbol ADD_SOURCE_QUERY_TO_VALUE_TABLE = makeSymbol("ADD-SOURCE-QUERY-TO-VALUE-TABLE");





    private static final SubLSymbol CONVERT_VARIABLE_AND_BINDINGS_TO_QUERY_RESULT_SET = makeSymbol("CONVERT-VARIABLE-AND-BINDINGS-TO-QUERY-RESULT-SET");





    private static final SubLSymbol GET_VARIABLE_MAPPING_TABLE_IN_XML = makeSymbol("GET-VARIABLE-MAPPING-TABLE-IN-XML");

    private static final SubLSymbol GET_VARIABLE_MAPPINGS_FOR_QUERIES_IN_XML = makeSymbol("GET-VARIABLE-MAPPINGS-FOR-QUERIES-IN-XML");

    private static final SubLSymbol GET_VARIABLE_MAPPINGS_FOR_FORMULAS_IN_XML = makeSymbol("GET-VARIABLE-MAPPINGS-FOR-FORMULAS-IN-XML");

    private static final SubLSymbol $sym23$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLString $$$varMapTable = makeString("varMapTable");

    static private final SubLString $str25$http___www_opencyc_org_xml_varMap = makeString("http://www.opencyc.org/xml/varMapTable.dtd");

    private static final SubLSymbol JOIN_FORMULAS_ALONG_VARIABLE_MAPPINGS = makeSymbol("JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS");



    static private final SubLList $list28 = list(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VAR"));

    private static final SubLSymbol JOIN_QUERIES_ALONG_VARIABLE_MAPPINGS = makeSymbol("JOIN-QUERIES-ALONG-VARIABLE-MAPPINGS");

    private static final SubLSymbol CREATE_VARIABLE_MAPPING_TABLE = makeSymbol("CREATE-VARIABLE-MAPPING-TABLE");

    private static final SubLObject $const31$VariableMappingTableFromArcOnDiag = reader_make_constant_shell("VariableMappingTableFromArcOnDiagramFn");

    private static final SubLObject $const32$variableMappingTableSourceFormula = reader_make_constant_shell("variableMappingTableSourceFormula-QuerySpec");

    private static final SubLObject $const33$variableMappingTableTargetFormula = reader_make_constant_shell("variableMappingTableTargetFormula-QuerySpec");

    private static final SubLSymbol DROP_VARIABLE_MAPPING_TABLE = makeSymbol("DROP-VARIABLE-MAPPING-TABLE");

    private static final SubLSymbol ADD_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE = makeSymbol("ADD-VARIABLE-ASSIGNMENT-TO-VARMAP-TABLE");

    private static final SubLObject $const36$querySpecVariablesUnifyInTable_Wo = reader_make_constant_shell("querySpecVariablesUnifyInTable-WorkaroundPred");





    private static final SubLSymbol DROP_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE = makeSymbol("DROP-VARIABLE-ASSIGNMENT-TO-VARMAP-TABLE");

    /**
     * Return a GLF graph as an XML encoded string.
     */
    @LispMethod(comment = "Return a GLF graph as an XML encoded string.")
    public static final SubLObject get_value_table_in_xml_alt(SubLObject vtable_id, SubLObject mt) {
        return com.cyc.cycjava.cycl.analysis_diagram_tool_widgets.get_value_tables_in_xml(list(list(vtable_id, mt)));
    }

    /**
     * Return a GLF graph as an XML encoded string.
     */
    @LispMethod(comment = "Return a GLF graph as an XML encoded string.")
    public static SubLObject get_value_table_in_xml(final SubLObject vtable_id, final SubLObject mt) {
        return get_value_tables_in_xml(list(list(vtable_id, mt)));
    }

    /**
     * Return a GLF graph as an XML encoded string.
     */
    @LispMethod(comment = "Return a GLF graph as an XML encoded string.")
    public static final SubLObject get_value_tables_in_xml_alt(SubLObject vtable_mt_pairs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject xml_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            xml_utilities.generate_valid_xml_header(stream);
                            xml_utilities.generate_xml_header_entry_for_dtd($$$valueTables, $str_alt4$http___www_opencyc_org_xml_valueT, stream);
                            {
                                SubLObject _prev_bind_0_1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$valueTables, NIL, NIL);
                                    {
                                        SubLObject cdolist_list_var = vtable_mt_pairs;
                                        SubLObject vtable_mt_pair = NIL;
                                        for (vtable_mt_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , vtable_mt_pair = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum = vtable_mt_pair;
                                                SubLObject current = datum;
                                                SubLObject vtable_id = NIL;
                                                SubLObject mt = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt5);
                                                vtable_id = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt5);
                                                mt = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    vtable_id = czer_main.coerce_to_fort(vtable_id);
                                                    mt = hlmt_czer.coerce_to_hlmt(mt);
                                                    {
                                                        SubLObject vtable = value_tables.load_value_table_from_kb(vtable_id, mt);
                                                        xml_utilities.xml_terpri();
                                                        value_tables.xml_serialize_value_table(vtable, stream);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt5);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$valueTables);
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    xml_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return xml_string;
            }
        }
    }

    /**
     * Return a GLF graph as an XML encoded string.
     */
    @LispMethod(comment = "Return a GLF graph as an XML encoded string.")
    public static SubLObject get_value_tables_in_xml(final SubLObject vtable_mt_pairs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject xml_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.generate_valid_xml_header(stream);
                xml_utilities.generate_xml_header_entry_for_dtd($$$valueTables, $str4$http___www_opencyc_org_xml_valueT, stream);
                try {
                    final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$valueTables, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            SubLObject cdolist_list_var = vtable_mt_pairs;
                            SubLObject vtable_mt_pair = NIL;
                            vtable_mt_pair = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = vtable_mt_pair;
                                SubLObject vtable_id = NIL;
                                SubLObject mt = NIL;
                                destructuring_bind_must_consp(current, datum, $list6);
                                vtable_id = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list6);
                                mt = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    vtable_id = czer_main.coerce_to_fort(vtable_id);
                                    mt = hlmt_czer.coerce_to_hlmt(mt);
                                    final SubLObject vtable = value_tables.load_value_table_from_kb(vtable_id, mt);
                                    xml_utilities.xml_terpri();
                                    value_tables.xml_serialize_value_table(vtable, stream);
                                } else {
                                    cdestructuring_bind_error(datum, $list6);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                vtable_mt_pair = cdolist_list_var.first();
                            } 
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$valueTables);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            xml_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return xml_string;
    }

    /**
     * Creates a new Value Table.
     */
    @LispMethod(comment = "Creates a new Value Table.")
    public static final SubLObject create_value_table_alt(SubLObject mt, SubLObject name) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = hlmt_czer.coerce_to_hlmt(mt);
            if (!name.isString()) {
                name = glf_api_widgets.generic_suggest_new_name_for_component($$$ValueTable);
            }
            {
                SubLObject vtable = rkf_term_utilities.rkf_create(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject successP = glf_api_widgets.generic_assert_assertion_specifications(list(bq_cons(listS($$isa, vtable, $list_alt9), $list_alt10), list(listS($$isa, vtable, $list_alt11), mt)), $value_tables_api_success_for_kb_operations$.getGlobalValue());
                    SubLObject message = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == successP) {
                        rkf_term_utilities.rkf_kill(vtable);
                        return values(NIL, message);
                    }
                    return values(vtable, $value_tables_api_success_for_kb_operations$.getGlobalValue());
                }
            }
        }
    }

    /**
     * Creates a new Value Table.
     */
    @LispMethod(comment = "Creates a new Value Table.")
    public static SubLObject create_value_table(SubLObject mt, SubLObject name) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = hlmt_czer.coerce_to_hlmt(mt);
        if (!name.isString()) {
            name = glf_api_widgets.generic_suggest_new_name_for_component($$$ValueTable);
        }
        final SubLObject vtable = rkf_term_utilities.rkf_create(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject successP = glf_api_widgets.generic_assert_assertion_specifications(list(bq_cons(listS($$isa, vtable, $list10), $list11), list(listS($$isa, vtable, $list12), mt)), $value_tables_api_success_for_kb_operations$.getGlobalValue());
        final SubLObject message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            rkf_term_utilities.rkf_kill(vtable);
            return values(NIL, message);
        }
        return values(vtable, $value_tables_api_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Destroys a value table again.
     */
    @LispMethod(comment = "Destroys a value table again.")
    public static final SubLObject drop_value_table_alt(SubLObject vtable) {
        rkf_term_utilities.rkf_kill(vtable);
        return values(T, $value_tables_api_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Destroys a value table again.
     */
    @LispMethod(comment = "Destroys a value table again.")
    public static SubLObject drop_value_table(final SubLObject vtable) {
        rkf_term_utilities.rkf_kill(vtable);
        return values(T, $value_tables_api_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Adds a source query to a value table. Performs NO TMS on the now stale
     * result specifications.
     */
    @LispMethod(comment = "Adds a source query to a value table. Performs NO TMS on the now stale\r\nresult specifications.\nAdds a source query to a value table. Performs NO TMS on the now stale\nresult specifications.")
    public static final SubLObject add_source_query_to_value_table_alt(SubLObject vtable, SubLObject query, SubLObject query_result_set, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = hlmt_czer.coerce_to_hlmt(mt);
            thread.resetMultipleValues();
            {
                SubLObject successP = glf_api_widgets.generic_assert_assertion_specifications(list(list(list($$valueTableSourceQueries, vtable, query), mt), list(list($$queryResultSetForTable, query, query_result_set, vtable), mt)), $value_tables_api_success_for_kb_operations$.getGlobalValue());
                SubLObject message = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(successP, message);
            }
        }
    }

    /**
     * Adds a source query to a value table. Performs NO TMS on the now stale
     * result specifications.
     */
    @LispMethod(comment = "Adds a source query to a value table. Performs NO TMS on the now stale\r\nresult specifications.\nAdds a source query to a value table. Performs NO TMS on the now stale\nresult specifications.")
    public static SubLObject add_source_query_to_value_table(final SubLObject vtable, final SubLObject query, final SubLObject query_result_set, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = hlmt_czer.coerce_to_hlmt(mt);
        thread.resetMultipleValues();
        final SubLObject successP = glf_api_widgets.generic_assert_assertion_specifications(list(list(list($$valueTableSourceQueries, vtable, query), mt), list(list($$queryResultSetForTable, query, query_result_set, vtable), mt)), $value_tables_api_success_for_kb_operations$.getGlobalValue());
        final SubLObject message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(successP, message);
    }

    /**
     * Converts a straight list of variable -> binding tuples to the proper
     * format for a query-result set.
     */
    @LispMethod(comment = "Converts a straight list of variable -> binding tuples to the proper\r\nformat for a query-result set.\nConverts a straight list of variable -> binding tuples to the proper\nformat for a query-result set.")
    public static final SubLObject convert_variable_and_bindings_to_query_result_set_alt(SubLObject variable, SubLObject values) {
        {
            SubLObject query_result_set = NIL;
            SubLObject cdolist_list_var = values;
            SubLObject value = NIL;
            for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                query_result_set = cons(list($$TheSet, list($$ELInferenceBindingFn, variable, value)), query_result_set);
            }
            return cons($$TheSet, nreverse(query_result_set));
        }
    }

    /**
     * Converts a straight list of variable -> binding tuples to the proper
     * format for a query-result set.
     */
    @LispMethod(comment = "Converts a straight list of variable -> binding tuples to the proper\r\nformat for a query-result set.\nConverts a straight list of variable -> binding tuples to the proper\nformat for a query-result set.")
    public static SubLObject convert_variable_and_bindings_to_query_result_set(final SubLObject variable, final SubLObject values) {
        SubLObject query_result_set = NIL;
        SubLObject cdolist_list_var = values;
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_result_set = cons(list($$TheSet, list($$ELInferenceBindingFn, variable, value)), query_result_set);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return cons($$TheSet, nreverse(query_result_set));
    }

    /**
     * Return a variable mapping table as an XML encoded string.
     */
    @LispMethod(comment = "Return a variable mapping table as an XML encoded string.")
    public static final SubLObject get_variable_mapping_table_in_xml_alt(SubLObject table_id, SubLObject mt, SubLObject source_query, SubLObject target_query) {
        if (source_query == UNPROVIDED) {
            source_query = NIL;
        }
        if (target_query == UNPROVIDED) {
            target_query = NIL;
        }
        mt = hlmt_czer.coerce_to_hlmt(mt);
        {
            SubLObject varmap = value_tables.load_variable_mapping_table_from_kb(table_id, mt, source_query, target_query);
            return com.cyc.cycjava.cycl.analysis_diagram_tool_widgets.generate_varmap_xml_description_string(varmap);
        }
    }

    /**
     * Return a variable mapping table as an XML encoded string.
     */
    @LispMethod(comment = "Return a variable mapping table as an XML encoded string.")
    public static SubLObject get_variable_mapping_table_in_xml(final SubLObject table_id, SubLObject mt, SubLObject source_query, SubLObject target_query) {
        if (source_query == UNPROVIDED) {
            source_query = NIL;
        }
        if (target_query == UNPROVIDED) {
            target_query = NIL;
        }
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject varmap = value_tables.load_variable_mapping_table_from_kb(table_id, mt, source_query, target_query);
        return generate_varmap_xml_description_string(varmap);
    }

    /**
     * Return an unreified variable mapping table as an XML encoded string.
     */
    @LispMethod(comment = "Return an unreified variable mapping table as an XML encoded string.")
    public static final SubLObject get_variable_mappings_for_queries_in_xml_alt(SubLObject source_query, SubLObject target_query, SubLObject mt) {
        mt = hlmt_czer.coerce_to_hlmt(mt);
        {
            SubLObject varmap = value_tables.load_variable_mapping_table_from_kb(NIL, mt, source_query, target_query);
            return com.cyc.cycjava.cycl.analysis_diagram_tool_widgets.generate_varmap_xml_description_string(varmap);
        }
    }

    /**
     * Return an unreified variable mapping table as an XML encoded string.
     */
    @LispMethod(comment = "Return an unreified variable mapping table as an XML encoded string.")
    public static SubLObject get_variable_mappings_for_queries_in_xml(final SubLObject source_query, final SubLObject target_query, SubLObject mt) {
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject varmap = value_tables.load_variable_mapping_table_from_kb(NIL, mt, source_query, target_query);
        return generate_varmap_xml_description_string(varmap);
    }

    /**
     * Return an unreified variable mapping table as an XML encoded string.
     */
    @LispMethod(comment = "Return an unreified variable mapping table as an XML encoded string.")
    public static final SubLObject get_variable_mappings_for_formulas_in_xml_alt(SubLObject source_formula, SubLObject target_formula, SubLObject mt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym22$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt23$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                mt = hlmt_czer.coerce_to_hlmt(mt);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        {
                                            SubLObject varmap = value_tables.get_variable_mapping_table_for_formulas(source_formula, target_formula, mt, varP, free_variables_onlyP);
                                            ans = com.cyc.cycjava.cycl.analysis_diagram_tool_widgets.generate_varmap_xml_description_string(varmap);
                                        }
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Return an unreified variable mapping table as an XML encoded string.
     */
    @LispMethod(comment = "Return an unreified variable mapping table as an XML encoded string.")
    public static SubLObject get_variable_mappings_for_formulas_in_xml(final SubLObject source_formula, final SubLObject target_formula, SubLObject mt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym23$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                mt = hlmt_czer.coerce_to_hlmt(mt);
                final SubLObject varmap = value_tables.get_variable_mapping_table_for_formulas(source_formula, target_formula, mt, varP, free_variables_onlyP);
                ans = generate_varmap_xml_description_string(varmap);
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject generate_varmap_xml_description_string_alt(SubLObject varmap) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject xml_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            xml_utilities.generate_valid_xml_header(stream);
                            xml_utilities.generate_xml_header_entry_for_dtd($$$varMapTable, $str_alt25$http___www_opencyc_org_xml_varMap, stream);
                            xml_utilities.xml_terpri();
                            value_tables.xml_serialize_variable_mapping_table(varmap, stream);
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    xml_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return xml_string;
            }
        }
    }

    public static SubLObject generate_varmap_xml_description_string(final SubLObject varmap) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject xml_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.generate_valid_xml_header(stream);
                xml_utilities.generate_xml_header_entry_for_dtd($$$varMapTable, $str25$http___www_opencyc_org_xml_varMap, stream);
                xml_utilities.xml_terpri();
                value_tables.xml_serialize_variable_mapping_table(varmap, stream);
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            xml_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return xml_string;
    }

    /**
     * Given two query formulas and the variable mappings between them, return the new formula
     * that joins them together along the connective.
     */
    @LispMethod(comment = "Given two query formulas and the variable mappings between them, return the new formula\r\nthat joins them together along the connective.\nGiven two query formulas and the variable mappings between them, return the new formula\nthat joins them together along the connective.")
    public static final SubLObject join_formulas_along_variable_mappings_alt(SubLObject source_formula, SubLObject target_formula, SubLObject varmappings, SubLObject connective) {
        if (connective == UNPROVIDED) {
            connective = $$and;
        }
        {
            SubLObject new_formula = make_binary_formula(connective, source_formula, target_formula);
            SubLObject cdolist_list_var = varmappings;
            SubLObject variable_mapping = NIL;
            for (variable_mapping = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_mapping = cdolist_list_var.first()) {
                {
                    SubLObject datum = variable_mapping;
                    SubLObject current = datum;
                    SubLObject source_var = NIL;
                    SubLObject target_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    source_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    target_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nsubst(target_var, source_var, new_formula, UNPROVIDED, UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt28);
                    }
                }
            }
            return simplifier.simplify_cycl_sentence_syntax(new_formula, UNPROVIDED);
        }
    }

    /**
     * Given two query formulas and the variable mappings between them, return the new formula
     * that joins them together along the connective.
     */
    @LispMethod(comment = "Given two query formulas and the variable mappings between them, return the new formula\r\nthat joins them together along the connective.\nGiven two query formulas and the variable mappings between them, return the new formula\nthat joins them together along the connective.")
    public static SubLObject join_formulas_along_variable_mappings(final SubLObject source_formula, final SubLObject target_formula, final SubLObject varmappings, SubLObject connective) {
        if (connective == UNPROVIDED) {
            connective = $$and;
        }
        final SubLObject new_formula = make_binary_formula(connective, source_formula, target_formula);
        SubLObject cdolist_list_var = varmappings;
        SubLObject variable_mapping = NIL;
        variable_mapping = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable_mapping;
            SubLObject source_var = NIL;
            SubLObject target_var = NIL;
            destructuring_bind_must_consp(current, datum, $list28);
            source_var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list28);
            target_var = current.first();
            current = current.rest();
            if (NIL == current) {
                nsubst(target_var, source_var, new_formula, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list28);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable_mapping = cdolist_list_var.first();
        } 
        return simplifier.simplify_cycl_sentence_syntax(new_formula, UNPROVIDED);
    }

    /**
     * Given two query terms and the variable mappings between them, return the new formula
     * that joins them together along the connective.
     */
    @LispMethod(comment = "Given two query terms and the variable mappings between them, return the new formula\r\nthat joins them together along the connective.\nGiven two query terms and the variable mappings between them, return the new formula\nthat joins them together along the connective.")
    public static final SubLObject join_queries_along_variable_mappings_alt(SubLObject source_query, SubLObject target_query, SubLObject varmappings, SubLObject mt, SubLObject connective) {
        if (connective == UNPROVIDED) {
            connective = $$and;
        }
        {
            SubLObject source = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(source_query, UNPROVIDED);
            SubLObject target = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(target_query, UNPROVIDED);
            return com.cyc.cycjava.cycl.analysis_diagram_tool_widgets.join_formulas_along_variable_mappings(new_cycl_query_specification.new_cycl_query_specification_formula(source), new_cycl_query_specification.new_cycl_query_specification_formula(target), varmappings, connective);
        }
    }

    @LispMethod(comment = "Given two query terms and the variable mappings between them, return the new formula\r\nthat joins them together along the connective.\nGiven two query terms and the variable mappings between them, return the new formula\nthat joins them together along the connective.")
    public static SubLObject join_queries_along_variable_mappings(final SubLObject source_query, final SubLObject target_query, final SubLObject varmappings, final SubLObject mt, SubLObject connective) {
        if (connective == UNPROVIDED) {
            connective = $$and;
        }
        final SubLObject source = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(source_query, UNPROVIDED);
        final SubLObject target = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(target_query, UNPROVIDED);
        return join_formulas_along_variable_mappings(new_cycl_query_specification.new_cycl_query_specification_formula(source), new_cycl_query_specification.new_cycl_query_specification_formula(target), varmappings, connective);
    }

    /**
     * Creates a variable mapping table from the graph to which it belongs, the arc Id and
     * the source/target query tuple.
     *
     * @unknown the variable mapping table
     */
    @LispMethod(comment = "Creates a variable mapping table from the graph to which it belongs, the arc Id and\r\nthe source/target query tuple.\r\n\r\n@unknown the variable mapping table\nCreates a variable mapping table from the graph to which it belongs, the arc Id and\nthe source/target query tuple.")
    public static final SubLObject create_variable_mapping_table_alt(SubLObject graph_id, SubLObject arc_id, SubLObject source_query, SubLObject target_query, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = hlmt_czer.coerce_to_hlmt(mt);
            {
                SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
                SubLObject table_id = list($const31$VariableMappingTableFromArcOnDiag, arc_id, ais);
                SubLObject source_sentence = list($const32$variableMappingTableSourceFormula, table_id, source_query);
                SubLObject target_sentence = list($const33$variableMappingTableTargetFormula, table_id, target_query);
                thread.resetMultipleValues();
                {
                    SubLObject successP = rkf_assertion_utilities.rkf_assert_now(source_sentence, mt);
                    SubLObject reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == successP) {
                        return values(NIL, reason);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject target_successP = rkf_assertion_utilities.rkf_assert_now(target_sentence, mt);
                    SubLObject target_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == target_successP) {
                        rkf_assertion_utilities.rkf_unassert(source_sentence, mt);
                        return values(NIL, target_reason);
                    }
                }
                return values(table_id, $value_tables_api_success_for_kb_operations$.getGlobalValue());
            }
        }
    }

    @LispMethod(comment = "Creates a variable mapping table from the graph to which it belongs, the arc Id and\r\nthe source/target query tuple.\r\n\r\n@unknown the variable mapping table\nCreates a variable mapping table from the graph to which it belongs, the arc Id and\nthe source/target query tuple.")
    public static SubLObject create_variable_mapping_table(final SubLObject graph_id, final SubLObject arc_id, final SubLObject source_query, final SubLObject target_query, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = hlmt_czer.coerce_to_hlmt(mt);
        final SubLObject ais = graphic_library_format.map_glf_graph_to_ais(graph_id, mt);
        final SubLObject table_id = list($const31$VariableMappingTableFromArcOnDiag, arc_id, ais);
        final SubLObject source_sentence = list($const32$variableMappingTableSourceFormula, table_id, source_query);
        final SubLObject target_sentence = list($const33$variableMappingTableTargetFormula, table_id, target_query);
        thread.resetMultipleValues();
        final SubLObject successP = rkf_assertion_utilities.rkf_assert_now(source_sentence, mt);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            return values(NIL, reason);
        }
        thread.resetMultipleValues();
        final SubLObject target_successP = rkf_assertion_utilities.rkf_assert_now(target_sentence, mt);
        final SubLObject target_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == target_successP) {
            rkf_assertion_utilities.rkf_unassert(source_sentence, mt);
            return values(NIL, target_reason);
        }
        return values(table_id, $value_tables_api_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * Removes the variable mapping table and all its assertions from the system.
     */
    @LispMethod(comment = "Removes the variable mapping table and all its assertions from the system.")
    public static final SubLObject drop_variable_mapping_table_alt(SubLObject table_id) {
        table_id = czer_main.coerce_to_fort(table_id);
        cyc_kernel.cyc_kill(table_id);
        return values(T, $value_tables_api_success_for_kb_operations$.getGlobalValue());
    }

    @LispMethod(comment = "Removes the variable mapping table and all its assertions from the system.")
    public static SubLObject drop_variable_mapping_table(SubLObject table_id) {
        table_id = czer_main.coerce_to_fort(table_id);
        cyc_kernel.cyc_kill(table_id);
        return values(T, $value_tables_api_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * adds a variable assignment between source to target in the varmap table
     */
    @LispMethod(comment = "adds a variable assignment between source to target in the varmap table")
    public static final SubLObject add_variable_assignment_to_varmap_table_alt(SubLObject table_id, SubLObject source_query, SubLObject source_variable, SubLObject target_query, SubLObject target_variable, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = hlmt_czer.coerce_to_hlmt(mt);
            thread.resetMultipleValues();
            {
                SubLObject successP = rkf_assertion_utilities.rkf_assert_now(list($const36$querySpecVariablesUnifyInTable_Wo, source_query, list($$AnalysisOutputBindingsForVarFn, source_variable), target_query, list($$AnalysisInputBindingsForVarFn, target_variable), table_id), mt);
                SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == successP) {
                    return values(NIL, reason);
                }
            }
            return values(T, $value_tables_api_success_for_kb_operations$.getGlobalValue());
        }
    }

    @LispMethod(comment = "adds a variable assignment between source to target in the varmap table")
    public static SubLObject add_variable_assignment_to_varmap_table(final SubLObject table_id, final SubLObject source_query, final SubLObject source_variable, final SubLObject target_query, final SubLObject target_variable, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = hlmt_czer.coerce_to_hlmt(mt);
        thread.resetMultipleValues();
        final SubLObject successP = rkf_assertion_utilities.rkf_assert_now(list($const36$querySpecVariablesUnifyInTable_Wo, source_query, list($$AnalysisOutputBindingsForVarFn, source_variable), target_query, list($$AnalysisInputBindingsForVarFn, target_variable), table_id), mt);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            return values(NIL, reason);
        }
        return values(T, $value_tables_api_success_for_kb_operations$.getGlobalValue());
    }

    /**
     * drops a variable assignment between source to target in the varmap table
     */
    @LispMethod(comment = "drops a variable assignment between source to target in the varmap table")
    public static final SubLObject drop_variable_assignment_to_varmap_table_alt(SubLObject table_id, SubLObject source_query, SubLObject source_variable, SubLObject target_query, SubLObject target_variable, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = hlmt_czer.coerce_to_hlmt(mt);
            thread.resetMultipleValues();
            {
                SubLObject successP = rkf_assertion_utilities.rkf_unassert(list($const36$querySpecVariablesUnifyInTable_Wo, source_query, list($$AnalysisOutputBindingsForVarFn, source_variable), target_query, list($$AnalysisInputBindingsForVarFn, target_variable), table_id), mt);
                SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == successP) {
                    return values(NIL, reason);
                }
            }
            return values(T, $value_tables_api_success_for_kb_operations$.getGlobalValue());
        }
    }

    @LispMethod(comment = "drops a variable assignment between source to target in the varmap table")
    public static SubLObject drop_variable_assignment_to_varmap_table(final SubLObject table_id, final SubLObject source_query, final SubLObject source_variable, final SubLObject target_query, final SubLObject target_variable, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = hlmt_czer.coerce_to_hlmt(mt);
        thread.resetMultipleValues();
        final SubLObject successP = rkf_assertion_utilities.rkf_unassert(list($const36$querySpecVariablesUnifyInTable_Wo, source_query, list($$AnalysisOutputBindingsForVarFn, source_variable), target_query, list($$AnalysisInputBindingsForVarFn, target_variable), table_id), mt);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            return values(NIL, reason);
        }
        return values(T, $value_tables_api_success_for_kb_operations$.getGlobalValue());
    }

    public static SubLObject declare_analysis_diagram_tool_widgets_file() {
        declareFunction("get_value_table_in_xml", "GET-VALUE-TABLE-IN-XML", 2, 0, false);
        declareFunction("get_value_tables_in_xml", "GET-VALUE-TABLES-IN-XML", 1, 0, false);
        declareFunction("create_value_table", "CREATE-VALUE-TABLE", 1, 1, false);
        declareFunction("drop_value_table", "DROP-VALUE-TABLE", 1, 0, false);
        declareFunction("add_source_query_to_value_table", "ADD-SOURCE-QUERY-TO-VALUE-TABLE", 4, 0, false);
        declareFunction("convert_variable_and_bindings_to_query_result_set", "CONVERT-VARIABLE-AND-BINDINGS-TO-QUERY-RESULT-SET", 2, 0, false);
        declareFunction("get_variable_mapping_table_in_xml", "GET-VARIABLE-MAPPING-TABLE-IN-XML", 2, 2, false);
        declareFunction("get_variable_mappings_for_queries_in_xml", "GET-VARIABLE-MAPPINGS-FOR-QUERIES-IN-XML", 3, 0, false);
        declareFunction("get_variable_mappings_for_formulas_in_xml", "GET-VARIABLE-MAPPINGS-FOR-FORMULAS-IN-XML", 3, 2, false);
        declareFunction("generate_varmap_xml_description_string", "GENERATE-VARMAP-XML-DESCRIPTION-STRING", 1, 0, false);
        declareFunction("join_formulas_along_variable_mappings", "JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS", 3, 1, false);
        declareFunction("join_queries_along_variable_mappings", "JOIN-QUERIES-ALONG-VARIABLE-MAPPINGS", 4, 1, false);
        declareFunction("create_variable_mapping_table", "CREATE-VARIABLE-MAPPING-TABLE", 5, 0, false);
        declareFunction("drop_variable_mapping_table", "DROP-VARIABLE-MAPPING-TABLE", 1, 0, false);
        declareFunction("add_variable_assignment_to_varmap_table", "ADD-VARIABLE-ASSIGNMENT-TO-VARMAP-TABLE", 6, 0, false);
        declareFunction("drop_variable_assignment_to_varmap_table", "DROP-VARIABLE-ASSIGNMENT-TO-VARMAP-TABLE", 6, 0, false);
        return NIL;
    }

    public static SubLObject init_analysis_diagram_tool_widgets_file() {
        deflexical("*VALUE-TABLES-API-SUCCESS-FOR-KB-OPERATIONS*", $str0$All_KB_operations_completed_witho);
        return NIL;
    }

    public static SubLObject setup_analysis_diagram_tool_widgets_file() {
        register_external_symbol(GET_VALUE_TABLE_IN_XML);
        register_external_symbol(GET_VALUE_TABLES_IN_XML);
        register_external_symbol(CREATE_VALUE_TABLE);
        register_external_symbol(DROP_VALUE_TABLE);
        register_external_symbol(ADD_SOURCE_QUERY_TO_VALUE_TABLE);
        register_external_symbol(CONVERT_VARIABLE_AND_BINDINGS_TO_QUERY_RESULT_SET);
        register_external_symbol(GET_VARIABLE_MAPPING_TABLE_IN_XML);
        register_external_symbol(GET_VARIABLE_MAPPINGS_FOR_QUERIES_IN_XML);
        register_external_symbol(GET_VARIABLE_MAPPINGS_FOR_FORMULAS_IN_XML);
        register_external_symbol(JOIN_FORMULAS_ALONG_VARIABLE_MAPPINGS);
        register_external_symbol(JOIN_QUERIES_ALONG_VARIABLE_MAPPINGS);
        register_external_symbol(CREATE_VARIABLE_MAPPING_TABLE);
        register_external_symbol(DROP_VARIABLE_MAPPING_TABLE);
        register_external_symbol(ADD_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE);
        register_external_symbol(DROP_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_analysis_diagram_tool_widgets_file();
    }

    @Override
    public void initializeVariables() {
        init_analysis_diagram_tool_widgets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_analysis_diagram_tool_widgets_file();
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$All_KB_operations_completed_witho = makeString("All KB operations completed without error.");

    static {
    }

    static private final SubLString $str_alt4$http___www_opencyc_org_xml_valueT = makeString("http://www.opencyc.org/xml/valueTables.dtd");

    static private final SubLList $list_alt5 = list(makeSymbol("VTABLE-ID"), makeSymbol("MT"));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("Individual"));

    static private final SubLList $list_alt10 = list(reader_make_constant_shell("UniversalVocabularyMt"));

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("ValueTable-PCW"));

    static private final SubLSymbol $sym22$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLString $str_alt23$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt25$http___www_opencyc_org_xml_varMap = makeString("http://www.opencyc.org/xml/varMapTable.dtd");

    static private final SubLList $list_alt28 = list(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VAR"));
}

/**
 * Total time: 100 ms
 */
