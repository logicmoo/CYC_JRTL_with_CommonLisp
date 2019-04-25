package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class value_tables extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.value_tables";
    public static final String myFingerPrint = "afae5de018904beba3a485122de818d5f1e5f8dd69382ced87a797a79c3bc0f0";
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLSymbol $dtp_value_table_column$;
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLSymbol $dtp_value_table$;
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLSymbol $dtp_variable_mapping_table$;
    private static final SubLSymbol $sym0$VALUE_TABLE_COLUMN;
    private static final SubLSymbol $sym1$VALUE_TABLE_COLUMN_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_VALUE_TABLE_COLUMN;
    private static final SubLSymbol $sym7$VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$VALUE_TABLE_COLUMN_QUERY;
    private static final SubLSymbol $sym10$_CSETF_VALUE_TABLE_COLUMN_QUERY;
    private static final SubLSymbol $sym11$VALUE_TABLE_COLUMN_LABEL;
    private static final SubLSymbol $sym12$_CSETF_VALUE_TABLE_COLUMN_LABEL;
    private static final SubLSymbol $sym13$VALUE_TABLE_COLUMN_VALUES;
    private static final SubLSymbol $sym14$_CSETF_VALUE_TABLE_COLUMN_VALUES;
    private static final SubLSymbol $kw15$QUERY;
    private static final SubLSymbol $kw16$LABEL;
    private static final SubLSymbol $kw17$VALUES;
    private static final SubLString $str18$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw19$BEGIN;
    private static final SubLSymbol $sym20$MAKE_VALUE_TABLE_COLUMN;
    private static final SubLSymbol $kw21$SLOT;
    private static final SubLSymbol $kw22$END;
    private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_COLUMN_METHOD;
    private static final SubLString $str24$__ValueTableColumn_;
    private static final SubLString $str25$_A___S____supported_values___S;
    private static final SubLString $str26$_;
    private static final SubLString $str27$valueTableColumn;
    private static final SubLSymbol $kw28$UNINITIALIZED;
    private static final SubLString $str29$valueTableQuery;
    private static final SubLString $str30$valueTableLabel;
    private static final SubLString $str31$valueTableValues;
    private static final SubLString $str32$valueTableValue;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$RESULT_SET;
    private static final SubLObject $const36$validQueryResultForTable;
    private static final SubLSymbol $sym37$VALUE_TABLE;
    private static final SubLSymbol $sym38$VALUE_TABLE_P;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$PRINT_VALUE_TABLE;
    private static final SubLSymbol $sym44$VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$VALUE_TABLE_ID;
    private static final SubLSymbol $sym47$_CSETF_VALUE_TABLE_ID;
    private static final SubLSymbol $sym48$VALUE_TABLE_LABEL;
    private static final SubLSymbol $sym49$_CSETF_VALUE_TABLE_LABEL;
    private static final SubLSymbol $sym50$VALUE_TABLE_INPUT_COLUMNS;
    private static final SubLSymbol $sym51$_CSETF_VALUE_TABLE_INPUT_COLUMNS;
    private static final SubLSymbol $sym52$VALUE_TABLE_OUTPUT_COLUMN;
    private static final SubLSymbol $sym53$_CSETF_VALUE_TABLE_OUTPUT_COLUMN;
    private static final SubLSymbol $sym54$VALUE_TABLE_ASSIGNMENTS;
    private static final SubLSymbol $sym55$_CSETF_VALUE_TABLE_ASSIGNMENTS;
    private static final SubLSymbol $kw56$ID;
    private static final SubLSymbol $kw57$INPUT_COLUMNS;
    private static final SubLSymbol $kw58$OUTPUT_COLUMN;
    private static final SubLSymbol $kw59$ASSIGNMENTS;
    private static final SubLSymbol $sym60$MAKE_VALUE_TABLE;
    private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_METHOD;
    private static final SubLString $str62$__ValueTable_;
    private static final SubLString $str63$_S___A___;
    private static final SubLString $str64$_Input_Columns__;
    private static final SubLString $str65$_____S__;
    private static final SubLString $str66$_Output_Column__;
    private static final SubLString $str67$_Existing_Assignments__;
    private static final SubLSymbol $sym68$FORT_P;
    private static final SubLSymbol $sym69$HLMT_P;
    private static final SubLString $str70$valueTable;
    private static final SubLString $str71$valueTableId;
    private static final SubLString $str72$valueTableInputColumns;
    private static final SubLString $str73$valueTableOutputColumns;
    private static final SubLString $str74$valueTableAssignments;
    private static final SubLString $str75$valueTableAssignment;
    private static final SubLList $list76;
    private static final SubLString $str77$valueTableAssignmentSources;
    private static final SubLString $str78$valueTableAssignmentTuple;
    private static final SubLList $list79;
    private static final SubLString $str80$valueTableAssignmentTargets;
    private static final SubLSymbol $kw81$INPUT_QUERIES;
    private static final SubLObject $const82$valueTableSourceQueries;
    private static final SubLList $list83;
    private static final SubLSymbol $kw84$OUTPUT_QUERY;
    private static final SubLObject $const85$valueTableTargetQuery;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLObject $const88$queryResultsCombineInTable;
    private static final SubLSymbol $sym89$_SOURCES;
    private static final SubLSymbol $sym90$_TARGETS;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$REST;
    private static final SubLSymbol $sym93$VARIABLE_MAPPING_TABLE;
    private static final SubLSymbol $sym94$VARIABLE_MAPPING_TABLE_P;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$PRINT_VARMAP_TABLE;
    private static final SubLSymbol $sym100$VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$VARIABLE_MAPPING_TABLE_ID;
    private static final SubLSymbol $sym103$_CSETF_VARIABLE_MAPPING_TABLE_ID;
    private static final SubLSymbol $sym104$VARIABLE_MAPPING_TABLE_SOURCE_QUERY;
    private static final SubLSymbol $sym105$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY;
    private static final SubLSymbol $sym106$VARIABLE_MAPPING_TABLE_TARGET_QUERY;
    private static final SubLSymbol $sym107$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY;
    private static final SubLSymbol $sym108$VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES;
    private static final SubLSymbol $sym109$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES;
    private static final SubLSymbol $sym110$VARIABLE_MAPPING_TABLE_TARGET_VARIABLES;
    private static final SubLSymbol $sym111$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES;
    private static final SubLSymbol $sym112$VARIABLE_MAPPING_TABLE_INCOMPATIBLES;
    private static final SubLSymbol $sym113$_CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES;
    private static final SubLSymbol $sym114$VARIABLE_MAPPING_TABLE_ASSIGNMENTS;
    private static final SubLSymbol $sym115$_CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS;
    private static final SubLSymbol $kw116$SOURCE_QUERY;
    private static final SubLSymbol $kw117$TARGET_QUERY;
    private static final SubLSymbol $kw118$SOURCE_VARIABLES;
    private static final SubLSymbol $kw119$TARGET_VARIABLES;
    private static final SubLSymbol $kw120$INCOMPATIBLES;
    private static final SubLSymbol $sym121$MAKE_VARIABLE_MAPPING_TABLE;
    private static final SubLSymbol $sym122$VISIT_DEFSTRUCT_OBJECT_VARIABLE_MAPPING_TABLE_METHOD;
    private static final SubLString $str123$__VariableMappingTable_;
    private static final SubLString $str124$_A_for__A_____A__;
    private static final SubLString $str125$anonymous;
    private static final SubLString $str126$no_source;
    private static final SubLString $str127$no_target;
    private static final SubLString $str128$_Source_Variables___A__;
    private static final SubLString $str129$_Target_Variables___A__;
    private static final SubLString $str130$_Incompatibilities__source_view__;
    private static final SubLString $str131$null_dictionary__;
    private static final SubLString $str132$_Current_Assignments___A__;
    private static final SubLString $str133$varMapTable;
    private static final SubLString $str134$varMapTableId;
    private static final SubLString $str135$varMapSourceQuery;
    private static final SubLString $str136$varMapTargetQuery;
    private static final SubLString $str137$varMapSourceVariables;
    private static final SubLString $str138$varMapTargetVariables;
    private static final SubLString $str139$varMapIncompatibles;
    private static final SubLString $str140$varMapIncompatible;
    private static final SubLString $str141$varMapSourceVariable;
    private static final SubLString $str142$varMapAssignments;
    private static final SubLString $str143$varMapAssignment;
    private static final SubLList $list144;
    private static final SubLString $str145$varMapTargetVariable;
    private static final SubLSymbol $sym146$CYC_VAR_;
    private static final SubLSymbol $kw147$SOURCE;
    private static final SubLObject $const148$variableMappingTableSourceFormula;
    private static final SubLList $list149;
    private static final SubLSymbol $kw150$TARGET;
    private static final SubLObject $const151$variableMappingTableTargetFormula;
    private static final SubLList $list152;
    private static final SubLList $list153;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLObject $const156$querySpecVariablesUnifyInTable_Wo;
    private static final SubLList $list157;
    private static final SubLList $list158;
    private static final SubLObject $const159$querySpecVariablesUnifyInTable;
    private static final SubLSymbol $sym160$_SOURCE_VAR;
    private static final SubLSymbol $sym161$_TARGET_VAR;
    private static final SubLSymbol $sym162$VARMAP_UNIQUE_EL_VAR_WRT_VARS;
    private static final SubLSymbol $sym163$FUNCTION_SPEC_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject value_table_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_value_table_column(v_object, stream, (SubLObject)value_tables.ZERO_INTEGER);
        return (SubLObject)value_tables.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject value_table_column_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $value_table_column_native.class) ? value_tables.T : value_tables.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject value_table_column_query(final SubLObject v_object) {
        assert value_tables.NIL != value_table_column_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject value_table_column_label(final SubLObject v_object) {
        assert value_tables.NIL != value_table_column_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject value_table_column_values(final SubLObject v_object) {
        assert value_tables.NIL != value_table_column_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject _csetf_value_table_column_query(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != value_table_column_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject _csetf_value_table_column_label(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != value_table_column_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject _csetf_value_table_column_values(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != value_table_column_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject make_value_table_column(SubLObject arglist) {
        if (arglist == value_tables.UNPROVIDED) {
            arglist = (SubLObject)value_tables.NIL;
        }
        final SubLObject v_new = (SubLObject)new $value_table_column_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)value_tables.NIL, next = arglist; value_tables.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)value_tables.$kw15$QUERY)) {
                _csetf_value_table_column_query(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw16$LABEL)) {
                _csetf_value_table_column_label(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw17$VALUES)) {
                _csetf_value_table_column_values(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)value_tables.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject visit_defstruct_value_table_column(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw19$BEGIN, (SubLObject)value_tables.$sym20$MAKE_VALUE_TABLE_COLUMN, (SubLObject)value_tables.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw15$QUERY, value_table_column_query(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw16$LABEL, value_table_column_label(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw17$VALUES, value_table_column_values(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw22$END, (SubLObject)value_tables.$sym20$MAKE_VALUE_TABLE_COLUMN, (SubLObject)value_tables.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
    public static SubLObject visit_defstruct_object_value_table_column_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_value_table_column(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 1224L)
    public static SubLObject print_value_table_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)value_tables.$str24$__ValueTableColumn_, stream, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)value_tables.$str25$_A___S____supported_values___S, new SubLObject[] { value_table_column_query(v_object), value_table_column_label(v_object), value_table_column_values(v_object) });
        streams_high.write_string((SubLObject)value_tables.$str26$_, stream, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 1581L)
    public static SubLObject new_value_table_column(final SubLObject query_id) {
        final SubLObject column = make_value_table_column((SubLObject)value_tables.UNPROVIDED);
        _csetf_value_table_column_query(column, query_id);
        return column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 1751L)
    public static SubLObject load_value_table_column_from_kb(final SubLObject vtable_id, final SubLObject query_id, final SubLObject elmt) {
        final SubLObject column = new_value_table_column(query_id);
        final SubLObject values = get_vtbl_query_result_values(vtable_id, query_id, elmt);
        _csetf_value_table_column_values(column, values);
        _csetf_value_table_column_label(column, pph_main.generate_phrase(query_id, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED));
        return column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 2152L)
    public static SubLObject xml_serialize_value_table_column(final SubLObject column, SubLObject stream) {
        if (stream == value_tables.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert value_tables.NIL != value_table_column_p(column) : column;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str27$valueTableColumn, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str29$valueTableQuery, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(value_table_column_query(column));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str29$valueTableQuery);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str30$valueTableLabel, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(value_table_column_label(column));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$5, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str30$valueTableLabel);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                        if (value_tables.NIL != value_table_column_values(column)) {
                            try {
                                final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str31$valueTableValues, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = value_table_column_values(column);
                                        SubLObject value = (SubLObject)value_tables.NIL;
                                        value = cdolist_list_var.first();
                                        while (value_tables.NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str32$valueTableValue, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                        cycml.cycml_serialize_term(value);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                    final SubLObject _values3 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str32$valueTableValue);
                                                    Values.restoreValuesFromVector(_values3);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            value = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str31$valueTableValues);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                    final SubLObject _values5 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str27$valueTableColumn);
                    Values.restoreValuesFromVector(_values5);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 2809L)
    public static SubLObject get_vtbl_query_result_values(final SubLObject vtable_id, final SubLObject query, final SubLObject elmt) {
        SubLObject result_values = (SubLObject)value_tables.NIL;
        SubLObject cdolist_list_var = get_vtbl_query_result_sets(vtable_id, query, elmt);
        SubLObject value = (SubLObject)value_tables.NIL;
        value = cdolist_list_var.first();
        while (value_tables.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = value;
            SubLObject the_set = (SubLObject)value_tables.NIL;
            SubLObject el_inference_binding = (SubLObject)value_tables.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list33);
            the_set = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list33);
            el_inference_binding = current.first();
            current = current.rest();
            if (value_tables.NIL == current) {
                SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = el_inference_binding;
                SubLObject el_infbind_fn = (SubLObject)value_tables.NIL;
                SubLObject variable = (SubLObject)value_tables.NIL;
                SubLObject result_value = (SubLObject)value_tables.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)value_tables.$list34);
                el_infbind_fn = current_$21.first();
                current_$21 = current_$21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)value_tables.$list34);
                variable = current_$21.first();
                current_$21 = current_$21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)value_tables.$list34);
                result_value = current_$21.first();
                current_$21 = current_$21.rest();
                if (value_tables.NIL == current_$21) {
                    result_values = (SubLObject)ConsesLow.cons(result_value, result_values);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$20, (SubLObject)value_tables.$list34);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)value_tables.$list33);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        return result_values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3280L)
    public static SubLObject get_vtbl_query_result_sets(final SubLObject vtable_id, final SubLObject query, final SubLObject elmt) {
        return ask_utilities.ask_variable((SubLObject)value_tables.$kw35$RESULT_SET, (SubLObject)ConsesLow.list(value_tables.$const36$validQueryResultForTable, query, (SubLObject)value_tables.$kw35$RESULT_SET, vtable_id), elmt, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject value_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_value_table(v_object, stream, (SubLObject)value_tables.ZERO_INTEGER);
        return (SubLObject)value_tables.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject value_table_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $value_table_native.class) ? value_tables.T : value_tables.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject value_table_id(final SubLObject v_object) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject value_table_label(final SubLObject v_object) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject value_table_input_columns(final SubLObject v_object) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject value_table_output_column(final SubLObject v_object) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject value_table_assignments(final SubLObject v_object) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject _csetf_value_table_id(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject _csetf_value_table_label(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject _csetf_value_table_input_columns(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject _csetf_value_table_output_column(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject _csetf_value_table_assignments(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != value_table_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject make_value_table(SubLObject arglist) {
        if (arglist == value_tables.UNPROVIDED) {
            arglist = (SubLObject)value_tables.NIL;
        }
        final SubLObject v_new = (SubLObject)new $value_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)value_tables.NIL, next = arglist; value_tables.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)value_tables.$kw56$ID)) {
                _csetf_value_table_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw16$LABEL)) {
                _csetf_value_table_label(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw57$INPUT_COLUMNS)) {
                _csetf_value_table_input_columns(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw58$OUTPUT_COLUMN)) {
                _csetf_value_table_output_column(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw59$ASSIGNMENTS)) {
                _csetf_value_table_assignments(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)value_tables.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject visit_defstruct_value_table(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw19$BEGIN, (SubLObject)value_tables.$sym60$MAKE_VALUE_TABLE, (SubLObject)value_tables.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw56$ID, value_table_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw16$LABEL, value_table_label(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw57$INPUT_COLUMNS, value_table_input_columns(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw58$OUTPUT_COLUMN, value_table_output_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw59$ASSIGNMENTS, value_table_assignments(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw22$END, (SubLObject)value_tables.$sym60$MAKE_VALUE_TABLE, (SubLObject)value_tables.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
    public static SubLObject visit_defstruct_object_value_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_value_table(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3928L)
    public static SubLObject print_value_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)value_tables.$str62$__ValueTable_, stream, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)value_tables.$str63$_S___A___, value_table_id(v_object), value_table_label(v_object));
        streams_high.write_string((SubLObject)value_tables.$str64$_Input_Columns__, stream, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        streams_high.terpri(stream);
        SubLObject cdolist_list_var = value_table_input_columns(v_object);
        SubLObject input_column = (SubLObject)value_tables.NIL;
        input_column = cdolist_list_var.first();
        while (value_tables.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)value_tables.$str65$_____S__, input_column);
            cdolist_list_var = cdolist_list_var.rest();
            input_column = cdolist_list_var.first();
        }
        streams_high.write_string((SubLObject)value_tables.$str66$_Output_Column__, stream, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        streams_high.terpri(stream);
        final SubLObject output_column = value_table_output_column(v_object);
        PrintLow.format(stream, (SubLObject)value_tables.$str65$_____S__, output_column);
        if (value_tables.NIL != value_table_assignments(v_object)) {
            streams_high.write_string((SubLObject)value_tables.$str67$_Existing_Assignments__, stream, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
            streams_high.terpri(stream);
            PrintLow.format(stream, (SubLObject)value_tables.$str65$_____S__, value_table_assignments(v_object));
        }
        streams_high.write_string((SubLObject)value_tables.$str26$_, stream, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 4682L)
    public static SubLObject new_value_table(final SubLObject id) {
        final SubLObject vtable = make_value_table((SubLObject)value_tables.UNPROVIDED);
        _csetf_value_table_id(vtable, id);
        return vtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 4820L)
    public static SubLObject load_value_table_from_kb(final SubLObject vtable_id, final SubLObject elmt) {
        assert value_tables.NIL != forts.fort_p(vtable_id) : vtable_id;
        assert value_tables.NIL != hlmt.hlmt_p(elmt) : elmt;
        final SubLObject vtable = new_value_table(vtable_id);
        final SubLObject input_queries = get_vtbl_input_queries(vtable_id, elmt);
        final SubLObject output_query = get_vtbl_output_query(vtable_id, elmt);
        SubLObject cdolist_list_var = input_queries;
        SubLObject input_query = (SubLObject)value_tables.NIL;
        input_query = cdolist_list_var.first();
        while (value_tables.NIL != cdolist_list_var) {
            final SubLObject column = load_value_table_column_from_kb(vtable_id, input_query, elmt);
            _csetf_value_table_input_columns(vtable, (SubLObject)ConsesLow.cons(column, value_table_input_columns(vtable)));
            cdolist_list_var = cdolist_list_var.rest();
            input_query = cdolist_list_var.first();
        }
        _csetf_value_table_output_column(vtable, load_value_table_column_from_kb(vtable_id, output_query, elmt));
        _csetf_value_table_assignments(vtable, load_value_table_assignments_from_kb(vtable_id, elmt));
        _csetf_value_table_label(vtable, pph_main.generate_phrase(vtable_id, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED));
        return vtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 5678L)
    public static SubLObject xml_serialize_value_table(final SubLObject vtable, SubLObject stream) {
        if (stream == value_tables.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert value_tables.NIL != value_table_p(vtable) : vtable;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str70$valueTable, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str71$valueTableId, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(value_table_id(vtable));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$25, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$25, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$24, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str71$valueTableId);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str30$valueTableLabel, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(value_table_label(vtable));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str30$valueTableLabel);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                            }
                        }
                        if (value_tables.NIL != value_table_input_columns(vtable)) {
                            try {
                                final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str72$valueTableInputColumns, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = value_table_input_columns(vtable);
                                        SubLObject column = (SubLObject)value_tables.NIL;
                                        column = cdolist_list_var.first();
                                        while (value_tables.NIL != cdolist_list_var) {
                                            xml_serialize_value_table_column(column, stream);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            column = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$27, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str72$valueTableInputColumns);
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                }
                            }
                        }
                        if (value_tables.NIL != value_table_output_column(vtable)) {
                            try {
                                final SubLObject _prev_bind_0_$33 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str73$valueTableOutputColumns, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        xml_serialize_value_table_column(value_table_output_column(vtable), stream);
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$34, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$28, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$33, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str73$valueTableOutputColumns);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                }
                            }
                        }
                        if (value_tables.NIL != value_table_assignments(vtable)) {
                            try {
                                final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str74$valueTableAssignments, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = value_table_assignments(vtable);
                                        SubLObject assignment = (SubLObject)value_tables.NIL;
                                        assignment = cdolist_list_var.first();
                                        while (value_tables.NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str75$valueTableAssignment, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                        SubLObject current;
                                                        final SubLObject datum = current = assignment;
                                                        SubLObject v_sources = (SubLObject)value_tables.NIL;
                                                        SubLObject targets = (SubLObject)value_tables.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list76);
                                                        v_sources = current.first();
                                                        current = (targets = current.rest());
                                                        try {
                                                            final SubLObject _prev_bind_0_$40 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str77$valueTableAssignmentSources, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$41 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                    SubLObject cdolist_list_var_$49 = v_sources;
                                                                    SubLObject source = (SubLObject)value_tables.NIL;
                                                                    source = cdolist_list_var_$49.first();
                                                                    while (value_tables.NIL != cdolist_list_var_$49) {
                                                                        try {
                                                                            final SubLObject _prev_bind_0_$42 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str78$valueTableAssignmentTuple, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                                final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                                    SubLObject current_$54;
                                                                                    final SubLObject datum_$53 = current_$54 = source;
                                                                                    SubLObject query = (SubLObject)value_tables.NIL;
                                                                                    SubLObject value = (SubLObject)value_tables.NIL;
                                                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$54, datum_$53, (SubLObject)value_tables.$list79);
                                                                                    query = current_$54.first();
                                                                                    current_$54 = current_$54.rest();
                                                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$54, datum_$53, (SubLObject)value_tables.$list79);
                                                                                    value = current_$54.first();
                                                                                    current_$54 = current_$54.rest();
                                                                                    if (value_tables.NIL == current_$54) {
                                                                                        try {
                                                                                            final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                            final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str29$valueTableQuery, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                                                final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                                                    cycml.cycml_serialize_term(query);
                                                                                                }
                                                                                                finally {
                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$33, thread);
                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                                                final SubLObject _values5 = Values.getValuesAsVector();
                                                                                                xml_utilities.xml_terpri();
                                                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str29$valueTableQuery);
                                                                                                Values.restoreValuesFromVector(_values5);
                                                                                            }
                                                                                            finally {
                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                            final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str32$valueTableValue, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                                                final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                                                    cycml.cycml_serialize_term(value);
                                                                                                }
                                                                                                finally {
                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$34, thread);
                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$47, thread);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                                                final SubLObject _values6 = Values.getValuesAsVector();
                                                                                                xml_utilities.xml_terpri();
                                                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str32$valueTableValue);
                                                                                                Values.restoreValuesFromVector(_values6);
                                                                                            }
                                                                                            finally {
                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        cdestructuring_bind.cdestructuring_bind_error(datum_$53, (SubLObject)value_tables.$list79);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$43, thread);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$32, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$42, thread);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                                final SubLObject _values7 = Values.getValuesAsVector();
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str78$valueTableAssignmentTuple);
                                                                                Values.restoreValuesFromVector(_values7);
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                                                            }
                                                                        }
                                                                        cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                                        source = cdolist_list_var_$49.first();
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$41, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$31, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$40, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                final SubLObject _values8 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str77$valueTableAssignmentSources);
                                                                Values.restoreValuesFromVector(_values8);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$52 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str80$valueTableAssignmentTargets, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$53 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                    SubLObject cdolist_list_var_$50 = targets;
                                                                    SubLObject target = (SubLObject)value_tables.NIL;
                                                                    target = cdolist_list_var_$50.first();
                                                                    while (value_tables.NIL != cdolist_list_var_$50) {
                                                                        try {
                                                                            final SubLObject _prev_bind_0_$54 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str78$valueTableAssignmentTuple, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                                final SubLObject _prev_bind_0_$55 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                                    SubLObject current_$55;
                                                                                    final SubLObject datum_$54 = current_$55 = target;
                                                                                    SubLObject query = (SubLObject)value_tables.NIL;
                                                                                    SubLObject value = (SubLObject)value_tables.NIL;
                                                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$55, datum_$54, (SubLObject)value_tables.$list79);
                                                                                    query = current_$55.first();
                                                                                    current_$55 = current_$55.rest();
                                                                                    cdestructuring_bind.destructuring_bind_must_consp(current_$55, datum_$54, (SubLObject)value_tables.$list79);
                                                                                    value = current_$55.first();
                                                                                    current_$55 = current_$55.rest();
                                                                                    if (value_tables.NIL == current_$55) {
                                                                                        try {
                                                                                            final SubLObject _prev_bind_0_$56 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                            final SubLObject _prev_bind_1_$37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str29$valueTableQuery, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                                                final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                                                    cycml.cycml_serialize_term(query);
                                                                                                }
                                                                                                finally {
                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$57, thread);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$37, thread);
                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$56, thread);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                                                final SubLObject _values9 = Values.getValuesAsVector();
                                                                                                xml_utilities.xml_terpri();
                                                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str29$valueTableQuery);
                                                                                                Values.restoreValuesFromVector(_values9);
                                                                                            }
                                                                                            finally {
                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            final SubLObject _prev_bind_0_$59 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                            final SubLObject _prev_bind_1_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str32$valueTableValue, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                                                final SubLObject _prev_bind_0_$60 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                                                    cycml.cycml_serialize_term(value);
                                                                                                }
                                                                                                finally {
                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$60, thread);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$38, thread);
                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$59, thread);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                                                final SubLObject _values10 = Values.getValuesAsVector();
                                                                                                xml_utilities.xml_terpri();
                                                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str32$valueTableValue);
                                                                                                Values.restoreValuesFromVector(_values10);
                                                                                            }
                                                                                            finally {
                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        cdestructuring_bind.cdestructuring_bind_error(datum_$54, (SubLObject)value_tables.$list79);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$55, thread);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$36, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$54, thread);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                                final SubLObject _values11 = Values.getValuesAsVector();
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str78$valueTableAssignmentTuple);
                                                                                Values.restoreValuesFromVector(_values11);
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                                                            }
                                                                        }
                                                                        cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                                                        target = cdolist_list_var_$50.first();
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$53, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$35, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$52, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                final SubLObject _values12 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str80$valueTableAssignmentTargets);
                                                                Values.restoreValuesFromVector(_values12);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$30, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                    final SubLObject _values13 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str75$valueTableAssignment);
                                                    Values.restoreValuesFromVector(_values13);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assignment = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$29, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$36, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values14 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str74$valueTableAssignments);
                                    Values.restoreValuesFromVector(_values14);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                    final SubLObject _values15 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str70$valueTable);
                    Values.restoreValuesFromVector(_values15);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return vtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 7670L)
    public static SubLObject get_vtbl_input_queries(final SubLObject vtable_id, final SubLObject elmt) {
        return ask_utilities.ask_variable((SubLObject)value_tables.$kw81$INPUT_QUERIES, (SubLObject)ConsesLow.listS(value_tables.$const82$valueTableSourceQueries, vtable_id, (SubLObject)value_tables.$list83), elmt, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 7872L)
    public static SubLObject get_vtbl_output_query(final SubLObject vtable_id, final SubLObject elmt) {
        return ask_utilities.ask_variable((SubLObject)value_tables.$kw84$OUTPUT_QUERY, (SubLObject)ConsesLow.listS(value_tables.$const85$valueTableTargetQuery, vtable_id, (SubLObject)value_tables.$list86), elmt, (SubLObject)value_tables.ZERO_INTEGER, (SubLObject)value_tables.ONE_INTEGER, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8091L)
    public static SubLObject load_value_table_assignments_from_kb(final SubLObject vtable_id, final SubLObject elmt) {
        final SubLObject v_bindings = ask_utilities.ask_template((SubLObject)value_tables.$list87, (SubLObject)ConsesLow.list(value_tables.$const88$queryResultsCombineInTable, (SubLObject)value_tables.$sym89$_SOURCES, (SubLObject)value_tables.$sym90$_TARGETS, vtable_id), elmt, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        SubLObject assignments = (SubLObject)value_tables.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)value_tables.NIL;
        binding = cdolist_list_var.first();
        while (value_tables.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject v_sources = (SubLObject)value_tables.NIL;
            SubLObject targets = (SubLObject)value_tables.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list91);
            v_sources = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list91);
            targets = current.first();
            current = current.rest();
            if (value_tables.NIL == current) {
                final SubLObject assignment = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)value_tables.$sym92$REST, v_sources.rest()), Mapping.mapcar((SubLObject)value_tables.$sym92$REST, targets.rest()));
                assignments = (SubLObject)ConsesLow.cons(assignment, assignments);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)value_tables.$list91);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return assignments;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject variable_mapping_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_varmap_table(v_object, stream, (SubLObject)value_tables.ZERO_INTEGER);
        return (SubLObject)value_tables.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject variable_mapping_table_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $variable_mapping_table_native.class) ? value_tables.T : value_tables.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject variable_mapping_table_id(final SubLObject v_object) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject variable_mapping_table_source_query(final SubLObject v_object) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject variable_mapping_table_target_query(final SubLObject v_object) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject variable_mapping_table_source_variables(final SubLObject v_object) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject variable_mapping_table_target_variables(final SubLObject v_object) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject variable_mapping_table_incompatibles(final SubLObject v_object) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject variable_mapping_table_assignments(final SubLObject v_object) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject _csetf_variable_mapping_table_id(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject _csetf_variable_mapping_table_source_query(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject _csetf_variable_mapping_table_target_query(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject _csetf_variable_mapping_table_source_variables(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject _csetf_variable_mapping_table_target_variables(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject _csetf_variable_mapping_table_incompatibles(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject _csetf_variable_mapping_table_assignments(final SubLObject v_object, final SubLObject value) {
        assert value_tables.NIL != variable_mapping_table_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject make_variable_mapping_table(SubLObject arglist) {
        if (arglist == value_tables.UNPROVIDED) {
            arglist = (SubLObject)value_tables.NIL;
        }
        final SubLObject v_new = (SubLObject)new $variable_mapping_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)value_tables.NIL, next = arglist; value_tables.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)value_tables.$kw56$ID)) {
                _csetf_variable_mapping_table_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw116$SOURCE_QUERY)) {
                _csetf_variable_mapping_table_source_query(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw117$TARGET_QUERY)) {
                _csetf_variable_mapping_table_target_query(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw118$SOURCE_VARIABLES)) {
                _csetf_variable_mapping_table_source_variables(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw119$TARGET_VARIABLES)) {
                _csetf_variable_mapping_table_target_variables(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw120$INCOMPATIBLES)) {
                _csetf_variable_mapping_table_incompatibles(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)value_tables.$kw59$ASSIGNMENTS)) {
                _csetf_variable_mapping_table_assignments(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)value_tables.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject visit_defstruct_variable_mapping_table(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw19$BEGIN, (SubLObject)value_tables.$sym121$MAKE_VARIABLE_MAPPING_TABLE, (SubLObject)value_tables.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw56$ID, variable_mapping_table_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw116$SOURCE_QUERY, variable_mapping_table_source_query(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw117$TARGET_QUERY, variable_mapping_table_target_query(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw118$SOURCE_VARIABLES, variable_mapping_table_source_variables(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw119$TARGET_VARIABLES, variable_mapping_table_target_variables(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw120$INCOMPATIBLES, variable_mapping_table_incompatibles(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw21$SLOT, (SubLObject)value_tables.$kw59$ASSIGNMENTS, variable_mapping_table_assignments(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)value_tables.$kw22$END, (SubLObject)value_tables.$sym121$MAKE_VARIABLE_MAPPING_TABLE, (SubLObject)value_tables.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
    public static SubLObject visit_defstruct_object_variable_mapping_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_variable_mapping_table(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 9235L)
    public static SubLObject print_varmap_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)value_tables.$str123$__VariableMappingTable_, stream, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)value_tables.$str124$_A_for__A_____A__, new SubLObject[] { (value_tables.NIL != variable_mapping_table_id(v_object)) ? variable_mapping_table_id(v_object) : value_tables.$str125$anonymous, (value_tables.NIL != variable_mapping_table_source_query(v_object)) ? variable_mapping_table_source_query(v_object) : value_tables.$str126$no_source, (value_tables.NIL != variable_mapping_table_target_query(v_object)) ? variable_mapping_table_target_query(v_object) : value_tables.$str127$no_target });
        PrintLow.format(stream, (SubLObject)value_tables.$str128$_Source_Variables___A__, variable_mapping_table_source_variables(v_object));
        PrintLow.format(stream, (SubLObject)value_tables.$str129$_Target_Variables___A__, variable_mapping_table_target_variables(v_object));
        PrintLow.format(stream, (SubLObject)value_tables.$str130$_Incompatibilities__source_view__);
        if (value_tables.NIL != dictionary.dictionary_p(variable_mapping_table_incompatibles(v_object))) {
            dictionary_utilities.print_dictionary_contents(variable_mapping_table_incompatibles(v_object), stream);
        }
        else {
            PrintLow.format(stream, (SubLObject)value_tables.$str131$null_dictionary__);
        }
        PrintLow.format(stream, (SubLObject)value_tables.$str132$_Current_Assignments___A__, variable_mapping_table_assignments(v_object));
        streams_high.write_string((SubLObject)value_tables.$str26$_, stream, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 10435L)
    public static SubLObject xml_serialize_variable_mapping_table(final SubLObject varmap, SubLObject stream) {
        if (stream == value_tables.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$87 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str133$varMapTable, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$88 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                        if (value_tables.NIL != variable_mapping_table_id(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$90 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str134$varMapTableId, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(variable_mapping_table_id(varmap));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$90, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$90, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$89, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str134$varMapTableId);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                }
                            }
                        }
                        if (value_tables.NIL != variable_mapping_table_source_query(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$92 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$91 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str135$varMapSourceQuery, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$93 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(variable_mapping_table_source_query(varmap));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$93, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$91, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$92, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str135$varMapSourceQuery);
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                                }
                            }
                        }
                        if (value_tables.NIL != variable_mapping_table_target_query(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str136$varMapTargetQuery, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(variable_mapping_table_target_query(varmap));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$96, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$92, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$95, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str136$varMapTargetQuery);
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                                }
                            }
                        }
                        if (value_tables.NIL != variable_mapping_table_source_variables(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$98 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str137$varMapSourceVariables, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$99 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = variable_mapping_table_source_variables(varmap);
                                        SubLObject variable = (SubLObject)value_tables.NIL;
                                        variable = cdolist_list_var.first();
                                        while (value_tables.NIL != cdolist_list_var) {
                                            cycml.cycml_serialize_term(variable);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            variable = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$99, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$93, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$98, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str137$varMapSourceVariables);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                                }
                            }
                        }
                        if (value_tables.NIL != variable_mapping_table_target_variables(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str138$varMapTargetVariables, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = variable_mapping_table_target_variables(varmap);
                                        SubLObject variable = (SubLObject)value_tables.NIL;
                                        variable = cdolist_list_var.first();
                                        while (value_tables.NIL != cdolist_list_var) {
                                            cycml.cycml_serialize_term(variable);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            variable = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$102, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$94, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$101, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str138$varMapTargetVariables);
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                                }
                            }
                        }
                        if (value_tables.NIL != variable_mapping_table_incompatibles(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$104 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$95 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str139$varMapIncompatibles, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$105 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(variable_mapping_table_incompatibles(varmap))); value_tables.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject source_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject target_vars = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            try {
                                                final SubLObject _prev_bind_0_$106 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str140$varMapIncompatible, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$107 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$108 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$97 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str141$varMapSourceVariable, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$109 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(source_var);
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$109, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$97, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$108, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                final SubLObject _values6 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str141$varMapSourceVariable);
                                                                Values.restoreValuesFromVector(_values6);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$111 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$98 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str138$varMapTargetVariables, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                    SubLObject cdolist_list_var2 = target_vars;
                                                                    SubLObject target_var = (SubLObject)value_tables.NIL;
                                                                    target_var = cdolist_list_var2.first();
                                                                    while (value_tables.NIL != cdolist_list_var2) {
                                                                        cycml.cycml_serialize_term(target_var);
                                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                                        target_var = cdolist_list_var2.first();
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$98, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$111, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                final SubLObject _values7 = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str138$varMapTargetVariables);
                                                                Values.restoreValuesFromVector(_values7);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$107, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$96, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$106, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                    final SubLObject _values8 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str140$varMapIncompatible);
                                                    Values.restoreValuesFromVector(_values8);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$105, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$95, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$104, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values9 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str139$varMapIncompatibles);
                                    Values.restoreValuesFromVector(_values9);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                                }
                            }
                        }
                        if (value_tables.NIL != variable_mapping_table_assignments(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$99 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str142$varMapAssignments, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = variable_mapping_table_assignments(varmap);
                                        SubLObject assignment = (SubLObject)value_tables.NIL;
                                        assignment = cdolist_list_var.first();
                                        while (value_tables.NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$118 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$100 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str143$varMapAssignment, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$119 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                        SubLObject current;
                                                        final SubLObject datum = current = assignment;
                                                        SubLObject source_var2 = (SubLObject)value_tables.NIL;
                                                        SubLObject target_var2 = (SubLObject)value_tables.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list144);
                                                        source_var2 = current.first();
                                                        current = current.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list144);
                                                        target_var2 = current.first();
                                                        current = current.rest();
                                                        if (value_tables.NIL == current) {
                                                            try {
                                                                final SubLObject _prev_bind_0_$120 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$101 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str141$varMapSourceVariable, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                        cycml.cycml_serialize_term(source_var2);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$121, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$101, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$120, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$122 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                    final SubLObject _values10 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str141$varMapSourceVariable);
                                                                    Values.restoreValuesFromVector(_values10);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                                                                }
                                                            }
                                                            try {
                                                                final SubLObject _prev_bind_0_$123 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$102 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)value_tables.$str145$varMapTargetVariable, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.NIL, (SubLObject)value_tables.$kw28$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$124 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)value_tables.$kw28$UNINITIALIZED, thread);
                                                                        cycml.cycml_serialize_term(target_var2);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$124, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$102, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$123, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$125 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                                    final SubLObject _values11 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str145$varMapTargetVariable);
                                                                    Values.restoreValuesFromVector(_values11);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$125, thread);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)value_tables.$list144);
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$119, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$100, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$118, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$126 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                                    final SubLObject _values12 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str143$varMapAssignment);
                                                    Values.restoreValuesFromVector(_values12);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$126, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assignment = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$99, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$127 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                                    final SubLObject _values13 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str142$varMapAssignments);
                                    Values.restoreValuesFromVector(_values13);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$127, thread);
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$88, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$87, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                    final SubLObject _values14 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)value_tables.$str133$varMapTable);
                    Values.restoreValuesFromVector(_values14);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return varmap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 12605L)
    public static SubLObject new_variable_mapping_table(final SubLObject table_id) {
        final SubLObject varmap = make_variable_mapping_table((SubLObject)value_tables.UNPROVIDED);
        _csetf_variable_mapping_table_id(varmap, table_id);
        return varmap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 12784L)
    public static SubLObject load_variable_mapping_table_from_kb(final SubLObject table_id, final SubLObject elmt, SubLObject source_query, SubLObject target_query) {
        if (source_query == value_tables.UNPROVIDED) {
            source_query = (SubLObject)value_tables.NIL;
        }
        if (target_query == value_tables.UNPROVIDED) {
            target_query = (SubLObject)value_tables.NIL;
        }
        final SubLObject varmap = new_variable_mapping_table(table_id);
        varmaptbl_assign_queries(varmap, source_query, target_query, elmt);
        varmaptbl_assign_variable_information(varmap, elmt);
        varmaptbl_assign_current_assignments(varmap, elmt);
        return varmap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 13207L)
    public static SubLObject get_variable_mapping_table_for_formulas(final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == value_tables.UNPROVIDED) {
            varP = (SubLObject)value_tables.$sym146$CYC_VAR_;
        }
        if (free_variables_onlyP == value_tables.UNPROVIDED) {
            free_variables_onlyP = (SubLObject)value_tables.T;
        }
        final SubLObject varmap = new_variable_mapping_table((SubLObject)value_tables.NIL);
        varmaptbl_assign_variable_information_from_formulas(varmap, elmt, source_formula, target_formula, varP, free_variables_onlyP);
        return varmap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 13556L)
    public static SubLObject varmaptbl_assign_queries(final SubLObject varmap, SubLObject source_query, SubLObject target_query, final SubLObject elmt) {
        final SubLObject table_id = variable_mapping_table_id(varmap);
        if (value_tables.NIL == source_query) {
            source_query = varmaptbl_load_source_query_information(table_id, elmt);
        }
        if (value_tables.NIL == target_query) {
            target_query = varmaptbl_load_target_query_information(table_id, elmt);
        }
        _csetf_variable_mapping_table_source_query(varmap, source_query);
        _csetf_variable_mapping_table_target_query(varmap, target_query);
        return varmap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 14078L)
    public static SubLObject varmaptbl_load_source_query_information(final SubLObject table_id, final SubLObject elmt) {
        return ask_utilities.ask_variable((SubLObject)value_tables.$kw147$SOURCE, (SubLObject)ConsesLow.listS(value_tables.$const148$variableMappingTableSourceFormula, table_id, (SubLObject)value_tables.$list149), elmt, (SubLObject)value_tables.ZERO_INTEGER, (SubLObject)value_tables.ONE_INTEGER, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 14307L)
    public static SubLObject varmaptbl_load_target_query_information(final SubLObject table_id, final SubLObject elmt) {
        return ask_utilities.ask_variable((SubLObject)value_tables.$kw150$TARGET, (SubLObject)ConsesLow.listS(value_tables.$const151$variableMappingTableTargetFormula, table_id, (SubLObject)value_tables.$list152), elmt, (SubLObject)value_tables.ZERO_INTEGER, (SubLObject)value_tables.ONE_INTEGER, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 14536L)
    public static SubLObject varmaptbl_assign_variable_information(final SubLObject varmap, final SubLObject elmt) {
        final SubLObject source_constraints = varmaptbl_load_query_variable_information(variable_mapping_table_source_query(varmap), elmt);
        final SubLObject target_constraints = varmaptbl_load_query_variable_information(variable_mapping_table_target_query(varmap), elmt);
        varmaptbl_store_variable_information(varmap, elmt, source_constraints, target_constraints);
        return varmap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 15027L)
    public static SubLObject varmaptbl_assign_variable_information_from_formulas(final SubLObject varmap, final SubLObject elmt, final SubLObject source_formula, final SubLObject target_formula, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == value_tables.UNPROVIDED) {
            varP = (SubLObject)value_tables.$sym146$CYC_VAR_;
        }
        if (free_variables_onlyP == value_tables.UNPROVIDED) {
            free_variables_onlyP = (SubLObject)value_tables.T;
        }
        final SubLObject source_constraints = at_var_types.formula_variables_arg_constraints_dict(source_formula, elmt, varP, free_variables_onlyP);
        final SubLObject target_constraints = at_var_types.formula_variables_arg_constraints_dict(target_formula, elmt, varP, free_variables_onlyP);
        return varmaptbl_store_variable_information(varmap, elmt, source_constraints, target_constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 15522L)
    public static SubLObject varmaptbl_store_variable_information(final SubLObject varmap, final SubLObject elmt, final SubLObject source_constraints, final SubLObject target_constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        _csetf_variable_mapping_table_source_variables(varmap, dictionary.dictionary_keys(source_constraints));
        _csetf_variable_mapping_table_target_variables(varmap, dictionary.dictionary_keys(target_constraints));
        final SubLObject incompatible_variables = dictionary.new_dictionary((SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_constraints)); value_tables.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject src_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject src_constraint = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject current;
                    final SubLObject datum = current = src_constraint;
                    SubLObject src_isas = (SubLObject)value_tables.NIL;
                    SubLObject src_genls = (SubLObject)value_tables.NIL;
                    SubLObject src_quoted_isas = (SubLObject)value_tables.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list153);
                    src_isas = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list153);
                    src_genls = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)value_tables.$list153);
                    src_quoted_isas = current.first();
                    current = current.rest();
                    if (value_tables.NIL == current) {
                        SubLObject incompatibles = (SubLObject)value_tables.NIL;
                        SubLObject iteration_state_$142;
                        for (iteration_state_$142 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(target_constraints)); value_tables.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$142); iteration_state_$142 = dictionary_contents.do_dictionary_contents_next(iteration_state_$142)) {
                            thread.resetMultipleValues();
                            final SubLObject trg_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$142);
                            final SubLObject trg_constraint = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject current_$144;
                            final SubLObject datum_$143 = current_$144 = trg_constraint;
                            SubLObject trg_isas = (SubLObject)value_tables.NIL;
                            SubLObject trg_genls = (SubLObject)value_tables.NIL;
                            SubLObject trg_quoted_isas = (SubLObject)value_tables.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$144, datum_$143, (SubLObject)value_tables.$list154);
                            trg_isas = current_$144.first();
                            current_$144 = current_$144.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$144, datum_$143, (SubLObject)value_tables.$list154);
                            trg_genls = current_$144.first();
                            current_$144 = current_$144.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$144, datum_$143, (SubLObject)value_tables.$list154);
                            trg_quoted_isas = current_$144.first();
                            current_$144 = current_$144.rest();
                            if (value_tables.NIL == current_$144) {
                                if (value_tables.NIL != disjoint_with.any_disjoint_with_anyP_memoized(src_isas, trg_isas, elmt, (SubLObject)value_tables.T, (SubLObject)value_tables.UNPROVIDED)) {
                                    incompatibles = (SubLObject)ConsesLow.cons(trg_var, incompatibles);
                                }
                                else if (value_tables.NIL != disjoint_with.any_disjoint_with_anyP_memoized(src_genls, trg_genls, elmt, (SubLObject)value_tables.T, (SubLObject)value_tables.UNPROVIDED)) {
                                    incompatibles = (SubLObject)ConsesLow.cons(trg_var, incompatibles);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$143, (SubLObject)value_tables.$list154);
                            }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$142);
                        if (value_tables.NIL != incompatibles) {
                            dictionary.dictionary_enter(incompatible_variables, src_var, incompatibles);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)value_tables.$list153);
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            finally {
                final SubLObject _prev_bind_0_$145 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_tables.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        _csetf_variable_mapping_table_incompatibles(varmap, incompatible_variables);
        return varmap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 17154L)
    public static SubLObject varmaptbl_load_query_variable_information(final SubLObject query_id, final SubLObject elmt) {
        if (value_tables.NIL == query_id) {
            return dictionary.new_dictionary((SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        }
        final SubLObject query_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(query_id, (SubLObject)value_tables.UNPROVIDED);
        final SubLObject formula = new_cycl_query_specification.new_cycl_query_specification_formula(query_spec);
        return at_var_types.formula_variables_arg_constraints_dict(formula, elmt, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 17494L)
    public static SubLObject varmaptbl_assign_current_assignments(final SubLObject varmap, final SubLObject elmt) {
        _csetf_variable_mapping_table_assignments(varmap, varmaptbl_load_current_assignments(variable_mapping_table_id(varmap), variable_mapping_table_source_query(varmap), variable_mapping_table_target_query(varmap), elmt));
        return varmap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 17850L)
    public static SubLObject varmaptbl_load_current_assignments(final SubLObject table_id, final SubLObject source_query, final SubLObject target_query, final SubLObject elmt) {
        if (value_tables.NIL == table_id || value_tables.NIL == target_query || value_tables.NIL == source_query) {
            return (SubLObject)value_tables.NIL;
        }
        SubLObject results = (SubLObject)value_tables.NIL;
        final SubLObject workaround = results = ask_utilities.ask_template((SubLObject)value_tables.$list155, (SubLObject)ConsesLow.list(value_tables.$const156$querySpecVariablesUnifyInTable_Wo, source_query, (SubLObject)value_tables.$list157, target_query, (SubLObject)value_tables.$list158, table_id), elmt, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        if (value_tables.NIL == results) {
            results = ask_utilities.ask_template((SubLObject)value_tables.$list155, (SubLObject)ConsesLow.list(value_tables.$const159$querySpecVariablesUnifyInTable, source_query, (SubLObject)value_tables.$sym160$_SOURCE_VAR, target_query, (SubLObject)value_tables.$sym161$_TARGET_VAR, table_id), elmt, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 18871L)
    public static SubLObject varmap_autocombine_literals(final SubLObject literals, SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (elmt == value_tables.UNPROVIDED) {
            elmt = (SubLObject)value_tables.NIL;
        }
        if (varP == value_tables.UNPROVIDED) {
            varP = (SubLObject)value_tables.$sym146$CYC_VAR_;
        }
        if (free_variables_onlyP == value_tables.UNPROVIDED) {
            free_variables_onlyP = (SubLObject)value_tables.T;
        }
        SubLObject result = literals.first();
        SubLObject cdolist_list_var = literals.rest();
        SubLObject other_formula = (SubLObject)value_tables.NIL;
        other_formula = cdolist_list_var.first();
        while (value_tables.NIL != cdolist_list_var) {
            other_formula = varmap_uniquify_source_vars(other_formula, result);
            final SubLObject varmap = varmap_attempt_to_combine_variables(other_formula, result, elmt, varP, free_variables_onlyP);
            result = analysis_diagram_tool_widgets.join_formulas_along_variable_mappings(other_formula, result, varmap, (SubLObject)value_tables.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            other_formula = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 19756L)
    public static SubLObject varmap_uniquify_source_vars(SubLObject source_formula, final SubLObject target_formula) {
        final SubLObject source_vars = list_utilities.tree_find_all_if((SubLObject)value_tables.$sym146$CYC_VAR_, source_formula, (SubLObject)value_tables.UNPROVIDED);
        SubLObject used_vars;
        final SubLObject target_vars = used_vars = list_utilities.tree_find_all_if((SubLObject)value_tables.$sym146$CYC_VAR_, target_formula, (SubLObject)value_tables.UNPROVIDED);
        SubLObject mapping = (SubLObject)value_tables.NIL;
        SubLObject cdolist_list_var = source_vars;
        SubLObject source_var = (SubLObject)value_tables.NIL;
        source_var = cdolist_list_var.first();
        while (value_tables.NIL != cdolist_list_var) {
            if (value_tables.NIL != subl_promotions.memberP(source_var, used_vars, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED)) {
                final SubLObject current_source_vars = list_utilities.tree_find_all_if((SubLObject)value_tables.$sym146$CYC_VAR_, source_formula, (SubLObject)value_tables.UNPROVIDED);
                final SubLObject new_var = varmap_unique_el_var_wrt_vars(source_var, Sequences.cconcatenate(current_source_vars, used_vars));
                source_formula = list_utilities.tree_substitute(source_formula, source_var, new_var);
                mapping = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(source_var, new_var), mapping);
                used_vars = (SubLObject)ConsesLow.cons(new_var, used_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            source_var = cdolist_list_var.first();
        }
        return Values.values(source_formula, mapping);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 20622L)
    public static SubLObject varmap_unique_el_var_wrt_vars(final SubLObject original_var, final SubLObject known_vars) {
        SubLObject result_var = original_var;
        while (value_tables.NIL != subl_promotions.memberP(result_var, known_vars, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED)) {
            final SubLObject result_var_str = string_utilities.to_string(result_var);
            if (value_tables.NIL != string_utilities.ends_with_number_p(result_var_str)) {
                final SubLObject var_num = string_utilities.ends_with_number(result_var_str);
                final SubLObject next_num = number_utilities.f_1X(var_num);
                result_var = cycl_variables.make_el_var(string_utilities.string_subst(string_utilities.str(next_num), string_utilities.str(var_num), result_var_str, (SubLObject)value_tables.UNPROVIDED));
            }
            else {
                result_var = el_utilities.next_named_var(known_vars, original_var);
            }
        }
        return result_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 21476L)
    public static SubLObject varmap_attempt_to_combine_variables(final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == value_tables.UNPROVIDED) {
            varP = (SubLObject)value_tables.$sym146$CYC_VAR_;
        }
        if (free_variables_onlyP == value_tables.UNPROVIDED) {
            free_variables_onlyP = (SubLObject)value_tables.T;
        }
        assert value_tables.NIL != Types.function_spec_p(varP) : varP;
        final SubLObject varmap = get_variable_mapping_table_for_formulas(source_formula, target_formula, elmt, varP, free_variables_onlyP);
        final SubLObject incompatibles = variable_mapping_table_incompatibles(varmap);
        final SubLObject source_vars = variable_mapping_table_source_variables(varmap);
        final SubLObject target_vars = variable_mapping_table_target_variables(varmap);
        final SubLObject hit_count = Hashtables.make_hash_table((SubLObject)value_tables.TEN_INTEGER, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
        SubLObject matches = (SubLObject)value_tables.NIL;
        SubLObject result = (SubLObject)value_tables.NIL;
        SubLObject cdolist_list_var = source_vars;
        SubLObject source_var_i = (SubLObject)value_tables.NIL;
        source_var_i = cdolist_list_var.first();
        while (value_tables.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$146 = target_vars;
            SubLObject target_var_j = (SubLObject)value_tables.NIL;
            target_var_j = cdolist_list_var_$146.first();
            while (value_tables.NIL != cdolist_list_var_$146) {
                final SubLObject incomp = dictionary.dictionary_lookup(incompatibles, source_var_i, (SubLObject)value_tables.UNPROVIDED);
                if (value_tables.NIL != Functions.funcall(varP, source_var_i) && value_tables.NIL != Functions.funcall(varP, target_var_j)) {
                    SubLObject possibleP = (SubLObject)value_tables.T;
                    if (value_tables.NIL != incomp && value_tables.NIL != subl_promotions.memberP(target_var_j, incomp, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED)) {
                        possibleP = (SubLObject)value_tables.NIL;
                    }
                    if (value_tables.NIL != possibleP) {
                        matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(source_var_i, target_var_j), matches);
                        hash_table_utilities.cinc_hash(source_var_i, hit_count, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
                        hash_table_utilities.cinc_hash(target_var_j, hit_count, (SubLObject)value_tables.UNPROVIDED, (SubLObject)value_tables.UNPROVIDED);
                    }
                }
                cdolist_list_var_$146 = cdolist_list_var_$146.rest();
                target_var_j = cdolist_list_var_$146.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            source_var_i = cdolist_list_var.first();
        }
        cdolist_list_var = matches;
        SubLObject match = (SubLObject)value_tables.NIL;
        match = cdolist_list_var.first();
        while (value_tables.NIL != cdolist_list_var) {
            final SubLObject var1 = match.first();
            final SubLObject var2 = conses_high.second(match);
            final SubLObject var1_count = Hashtables.gethash(var1, hit_count, (SubLObject)value_tables.UNPROVIDED);
            final SubLObject var2_count = Hashtables.gethash(var2, hit_count, (SubLObject)value_tables.UNPROVIDED);
            if (var1_count.isInteger() && var2_count.isInteger() && var1_count.numE((SubLObject)value_tables.ONE_INTEGER) && var2_count.numE((SubLObject)value_tables.ONE_INTEGER)) {
                result = (SubLObject)ConsesLow.cons(match, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            match = cdolist_list_var.first();
        }
        return result;
    }
    
    public static SubLObject declare_value_tables_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_column_print_function_trampoline", "VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_column_p", "VALUE-TABLE-COLUMN-P", 1, 0, false);
        new $value_table_column_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_column_query", "VALUE-TABLE-COLUMN-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_column_label", "VALUE-TABLE-COLUMN-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_column_values", "VALUE-TABLE-COLUMN-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_value_table_column_query", "_CSETF-VALUE-TABLE-COLUMN-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_value_table_column_label", "_CSETF-VALUE-TABLE-COLUMN-LABEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_value_table_column_values", "_CSETF-VALUE-TABLE-COLUMN-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "make_value_table_column", "MAKE-VALUE-TABLE-COLUMN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "visit_defstruct_value_table_column", "VISIT-DEFSTRUCT-VALUE-TABLE-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "visit_defstruct_object_value_table_column_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-COLUMN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "print_value_table_column", "PRINT-VALUE-TABLE-COLUMN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "new_value_table_column", "NEW-VALUE-TABLE-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "load_value_table_column_from_kb", "LOAD-VALUE-TABLE-COLUMN-FROM-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "xml_serialize_value_table_column", "XML-SERIALIZE-VALUE-TABLE-COLUMN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "get_vtbl_query_result_values", "GET-VTBL-QUERY-RESULT-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "get_vtbl_query_result_sets", "GET-VTBL-QUERY-RESULT-SETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_print_function_trampoline", "VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_p", "VALUE-TABLE-P", 1, 0, false);
        new $value_table_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_id", "VALUE-TABLE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_label", "VALUE-TABLE-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_input_columns", "VALUE-TABLE-INPUT-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_output_column", "VALUE-TABLE-OUTPUT-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "value_table_assignments", "VALUE-TABLE-ASSIGNMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_value_table_id", "_CSETF-VALUE-TABLE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_value_table_label", "_CSETF-VALUE-TABLE-LABEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_value_table_input_columns", "_CSETF-VALUE-TABLE-INPUT-COLUMNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_value_table_output_column", "_CSETF-VALUE-TABLE-OUTPUT-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_value_table_assignments", "_CSETF-VALUE-TABLE-ASSIGNMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "make_value_table", "MAKE-VALUE-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "visit_defstruct_value_table", "VISIT-DEFSTRUCT-VALUE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "visit_defstruct_object_value_table_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "print_value_table", "PRINT-VALUE-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "new_value_table", "NEW-VALUE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "load_value_table_from_kb", "LOAD-VALUE-TABLE-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "xml_serialize_value_table", "XML-SERIALIZE-VALUE-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "get_vtbl_input_queries", "GET-VTBL-INPUT-QUERIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "get_vtbl_output_query", "GET-VTBL-OUTPUT-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "load_value_table_assignments_from_kb", "LOAD-VALUE-TABLE-ASSIGNMENTS-FROM-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "variable_mapping_table_print_function_trampoline", "VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "variable_mapping_table_p", "VARIABLE-MAPPING-TABLE-P", 1, 0, false);
        new $variable_mapping_table_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "variable_mapping_table_id", "VARIABLE-MAPPING-TABLE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "variable_mapping_table_source_query", "VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "variable_mapping_table_target_query", "VARIABLE-MAPPING-TABLE-TARGET-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "variable_mapping_table_source_variables", "VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "variable_mapping_table_target_variables", "VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "variable_mapping_table_incompatibles", "VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "variable_mapping_table_assignments", "VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_variable_mapping_table_id", "_CSETF-VARIABLE-MAPPING-TABLE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_variable_mapping_table_source_query", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_variable_mapping_table_target_query", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_variable_mapping_table_source_variables", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_variable_mapping_table_target_variables", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_variable_mapping_table_incompatibles", "_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "_csetf_variable_mapping_table_assignments", "_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "make_variable_mapping_table", "MAKE-VARIABLE-MAPPING-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "visit_defstruct_variable_mapping_table", "VISIT-DEFSTRUCT-VARIABLE-MAPPING-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "visit_defstruct_object_variable_mapping_table_method", "VISIT-DEFSTRUCT-OBJECT-VARIABLE-MAPPING-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "print_varmap_table", "PRINT-VARMAP-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "xml_serialize_variable_mapping_table", "XML-SERIALIZE-VARIABLE-MAPPING-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "new_variable_mapping_table", "NEW-VARIABLE-MAPPING-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "load_variable_mapping_table_from_kb", "LOAD-VARIABLE-MAPPING-TABLE-FROM-KB", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "get_variable_mapping_table_for_formulas", "GET-VARIABLE-MAPPING-TABLE-FOR-FORMULAS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmaptbl_assign_queries", "VARMAPTBL-ASSIGN-QUERIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmaptbl_load_source_query_information", "VARMAPTBL-LOAD-SOURCE-QUERY-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmaptbl_load_target_query_information", "VARMAPTBL-LOAD-TARGET-QUERY-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmaptbl_assign_variable_information", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmaptbl_assign_variable_information_from_formulas", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION-FROM-FORMULAS", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmaptbl_store_variable_information", "VARMAPTBL-STORE-VARIABLE-INFORMATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmaptbl_load_query_variable_information", "VARMAPTBL-LOAD-QUERY-VARIABLE-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmaptbl_assign_current_assignments", "VARMAPTBL-ASSIGN-CURRENT-ASSIGNMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmaptbl_load_current_assignments", "VARMAPTBL-LOAD-CURRENT-ASSIGNMENTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmap_autocombine_literals", "VARMAP-AUTOCOMBINE-LITERALS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmap_uniquify_source_vars", "VARMAP-UNIQUIFY-SOURCE-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmap_unique_el_var_wrt_vars", "VARMAP-UNIQUE-EL-VAR-WRT-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.value_tables", "varmap_attempt_to_combine_variables", "VARMAP-ATTEMPT-TO-COMBINE-VARIABLES", 3, 2, false);
        return (SubLObject)value_tables.NIL;
    }
    
    public static SubLObject init_value_tables_file() {
        value_tables.$dtp_value_table_column$ = SubLFiles.defconstant("*DTP-VALUE-TABLE-COLUMN*", (SubLObject)value_tables.$sym0$VALUE_TABLE_COLUMN);
        value_tables.$dtp_value_table$ = SubLFiles.defconstant("*DTP-VALUE-TABLE*", (SubLObject)value_tables.$sym37$VALUE_TABLE);
        value_tables.$dtp_variable_mapping_table$ = SubLFiles.defconstant("*DTP-VARIABLE-MAPPING-TABLE*", (SubLObject)value_tables.$sym93$VARIABLE_MAPPING_TABLE);
        return (SubLObject)value_tables.NIL;
    }
    
    public static SubLObject setup_value_tables_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), value_tables.$dtp_value_table_column$.getGlobalValue(), Symbols.symbol_function((SubLObject)value_tables.$sym7$VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)value_tables.$list8);
        Structures.def_csetf((SubLObject)value_tables.$sym9$VALUE_TABLE_COLUMN_QUERY, (SubLObject)value_tables.$sym10$_CSETF_VALUE_TABLE_COLUMN_QUERY);
        Structures.def_csetf((SubLObject)value_tables.$sym11$VALUE_TABLE_COLUMN_LABEL, (SubLObject)value_tables.$sym12$_CSETF_VALUE_TABLE_COLUMN_LABEL);
        Structures.def_csetf((SubLObject)value_tables.$sym13$VALUE_TABLE_COLUMN_VALUES, (SubLObject)value_tables.$sym14$_CSETF_VALUE_TABLE_COLUMN_VALUES);
        Equality.identity((SubLObject)value_tables.$sym0$VALUE_TABLE_COLUMN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), value_tables.$dtp_value_table_column$.getGlobalValue(), Symbols.symbol_function((SubLObject)value_tables.$sym23$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_COLUMN_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), value_tables.$dtp_value_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)value_tables.$sym44$VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)value_tables.$list45);
        Structures.def_csetf((SubLObject)value_tables.$sym46$VALUE_TABLE_ID, (SubLObject)value_tables.$sym47$_CSETF_VALUE_TABLE_ID);
        Structures.def_csetf((SubLObject)value_tables.$sym48$VALUE_TABLE_LABEL, (SubLObject)value_tables.$sym49$_CSETF_VALUE_TABLE_LABEL);
        Structures.def_csetf((SubLObject)value_tables.$sym50$VALUE_TABLE_INPUT_COLUMNS, (SubLObject)value_tables.$sym51$_CSETF_VALUE_TABLE_INPUT_COLUMNS);
        Structures.def_csetf((SubLObject)value_tables.$sym52$VALUE_TABLE_OUTPUT_COLUMN, (SubLObject)value_tables.$sym53$_CSETF_VALUE_TABLE_OUTPUT_COLUMN);
        Structures.def_csetf((SubLObject)value_tables.$sym54$VALUE_TABLE_ASSIGNMENTS, (SubLObject)value_tables.$sym55$_CSETF_VALUE_TABLE_ASSIGNMENTS);
        Equality.identity((SubLObject)value_tables.$sym37$VALUE_TABLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), value_tables.$dtp_value_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)value_tables.$sym61$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), value_tables.$dtp_variable_mapping_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)value_tables.$sym100$VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)value_tables.$list101);
        Structures.def_csetf((SubLObject)value_tables.$sym102$VARIABLE_MAPPING_TABLE_ID, (SubLObject)value_tables.$sym103$_CSETF_VARIABLE_MAPPING_TABLE_ID);
        Structures.def_csetf((SubLObject)value_tables.$sym104$VARIABLE_MAPPING_TABLE_SOURCE_QUERY, (SubLObject)value_tables.$sym105$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY);
        Structures.def_csetf((SubLObject)value_tables.$sym106$VARIABLE_MAPPING_TABLE_TARGET_QUERY, (SubLObject)value_tables.$sym107$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY);
        Structures.def_csetf((SubLObject)value_tables.$sym108$VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES, (SubLObject)value_tables.$sym109$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES);
        Structures.def_csetf((SubLObject)value_tables.$sym110$VARIABLE_MAPPING_TABLE_TARGET_VARIABLES, (SubLObject)value_tables.$sym111$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES);
        Structures.def_csetf((SubLObject)value_tables.$sym112$VARIABLE_MAPPING_TABLE_INCOMPATIBLES, (SubLObject)value_tables.$sym113$_CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES);
        Structures.def_csetf((SubLObject)value_tables.$sym114$VARIABLE_MAPPING_TABLE_ASSIGNMENTS, (SubLObject)value_tables.$sym115$_CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS);
        Equality.identity((SubLObject)value_tables.$sym93$VARIABLE_MAPPING_TABLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), value_tables.$dtp_variable_mapping_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)value_tables.$sym122$VISIT_DEFSTRUCT_OBJECT_VARIABLE_MAPPING_TABLE_METHOD));
        access_macros.register_external_symbol((SubLObject)value_tables.$sym162$VARMAP_UNIQUE_EL_VAR_WRT_VARS);
        return (SubLObject)value_tables.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_value_tables_file();
    }
    
    @Override
	public void initializeVariables() {
        init_value_tables_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_value_tables_file();
    }
    
    static {
        me = (SubLFile)new value_tables();
        value_tables.$dtp_value_table_column$ = null;
        value_tables.$dtp_value_table$ = null;
        value_tables.$dtp_variable_mapping_table$ = null;
        $sym0$VALUE_TABLE_COLUMN = SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN");
        $sym1$VALUE_TABLE_COLUMN_P = SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("LABEL"), (SubLObject)SubLObjectFactory.makeKeyword("VALUES"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN-VALUES"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-COLUMN-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-COLUMN-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-COLUMN-VALUES"));
        $sym6$PRINT_VALUE_TABLE_COLUMN = SubLObjectFactory.makeSymbol("PRINT-VALUE-TABLE-COLUMN");
        $sym7$VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN-P"));
        $sym9$VALUE_TABLE_COLUMN_QUERY = SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN-QUERY");
        $sym10$_CSETF_VALUE_TABLE_COLUMN_QUERY = SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-COLUMN-QUERY");
        $sym11$VALUE_TABLE_COLUMN_LABEL = SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN-LABEL");
        $sym12$_CSETF_VALUE_TABLE_COLUMN_LABEL = SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-COLUMN-LABEL");
        $sym13$VALUE_TABLE_COLUMN_VALUES = SubLObjectFactory.makeSymbol("VALUE-TABLE-COLUMN-VALUES");
        $sym14$_CSETF_VALUE_TABLE_COLUMN_VALUES = SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-COLUMN-VALUES");
        $kw15$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw16$LABEL = SubLObjectFactory.makeKeyword("LABEL");
        $kw17$VALUES = SubLObjectFactory.makeKeyword("VALUES");
        $str18$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw19$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym20$MAKE_VALUE_TABLE_COLUMN = SubLObjectFactory.makeSymbol("MAKE-VALUE-TABLE-COLUMN");
        $kw21$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw22$END = SubLObjectFactory.makeKeyword("END");
        $sym23$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_COLUMN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-COLUMN-METHOD");
        $str24$__ValueTableColumn_ = SubLObjectFactory.makeString("#<ValueTableColumn ");
        $str25$_A___S____supported_values___S = SubLObjectFactory.makeString("~A (~S)~% supported values: ~S");
        $str26$_ = SubLObjectFactory.makeString(">");
        $str27$valueTableColumn = SubLObjectFactory.makeString("valueTableColumn");
        $kw28$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str29$valueTableQuery = SubLObjectFactory.makeString("valueTableQuery");
        $str30$valueTableLabel = SubLObjectFactory.makeString("valueTableLabel");
        $str31$valueTableValues = SubLObjectFactory.makeString("valueTableValues");
        $str32$valueTableValue = SubLObjectFactory.makeString("valueTableValue");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-SET"), (SubLObject)SubLObjectFactory.makeSymbol("EL-INFERENCE-BINDING"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-INFBIND-FN"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-VALUE"));
        $kw35$RESULT_SET = SubLObjectFactory.makeKeyword("RESULT-SET");
        $const36$validQueryResultForTable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("validQueryResultForTable"));
        $sym37$VALUE_TABLE = SubLObjectFactory.makeSymbol("VALUE-TABLE");
        $sym38$VALUE_TABLE_P = SubLObjectFactory.makeSymbol("VALUE-TABLE-P");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("INPUT-COLUMNS"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("LABEL"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-COLUMNS"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-COLUMN"), (SubLObject)SubLObjectFactory.makeKeyword("ASSIGNMENTS"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-INPUT-COLUMNS"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-OUTPUT-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-ASSIGNMENTS"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-INPUT-COLUMNS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-OUTPUT-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-ASSIGNMENTS"));
        $sym43$PRINT_VALUE_TABLE = SubLObjectFactory.makeSymbol("PRINT-VALUE-TABLE");
        $sym44$VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TABLE-P"));
        $sym46$VALUE_TABLE_ID = SubLObjectFactory.makeSymbol("VALUE-TABLE-ID");
        $sym47$_CSETF_VALUE_TABLE_ID = SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-ID");
        $sym48$VALUE_TABLE_LABEL = SubLObjectFactory.makeSymbol("VALUE-TABLE-LABEL");
        $sym49$_CSETF_VALUE_TABLE_LABEL = SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-LABEL");
        $sym50$VALUE_TABLE_INPUT_COLUMNS = SubLObjectFactory.makeSymbol("VALUE-TABLE-INPUT-COLUMNS");
        $sym51$_CSETF_VALUE_TABLE_INPUT_COLUMNS = SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-INPUT-COLUMNS");
        $sym52$VALUE_TABLE_OUTPUT_COLUMN = SubLObjectFactory.makeSymbol("VALUE-TABLE-OUTPUT-COLUMN");
        $sym53$_CSETF_VALUE_TABLE_OUTPUT_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-OUTPUT-COLUMN");
        $sym54$VALUE_TABLE_ASSIGNMENTS = SubLObjectFactory.makeSymbol("VALUE-TABLE-ASSIGNMENTS");
        $sym55$_CSETF_VALUE_TABLE_ASSIGNMENTS = SubLObjectFactory.makeSymbol("_CSETF-VALUE-TABLE-ASSIGNMENTS");
        $kw56$ID = SubLObjectFactory.makeKeyword("ID");
        $kw57$INPUT_COLUMNS = SubLObjectFactory.makeKeyword("INPUT-COLUMNS");
        $kw58$OUTPUT_COLUMN = SubLObjectFactory.makeKeyword("OUTPUT-COLUMN");
        $kw59$ASSIGNMENTS = SubLObjectFactory.makeKeyword("ASSIGNMENTS");
        $sym60$MAKE_VALUE_TABLE = SubLObjectFactory.makeSymbol("MAKE-VALUE-TABLE");
        $sym61$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-METHOD");
        $str62$__ValueTable_ = SubLObjectFactory.makeString("#<ValueTable ");
        $str63$_S___A___ = SubLObjectFactory.makeString("~S (~A)~%");
        $str64$_Input_Columns__ = SubLObjectFactory.makeString(" Input Columns: ");
        $str65$_____S__ = SubLObjectFactory.makeString("    ~S~%");
        $str66$_Output_Column__ = SubLObjectFactory.makeString(" Output Column: ");
        $str67$_Existing_Assignments__ = SubLObjectFactory.makeString(" Existing Assignments: ");
        $sym68$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym69$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $str70$valueTable = SubLObjectFactory.makeString("valueTable");
        $str71$valueTableId = SubLObjectFactory.makeString("valueTableId");
        $str72$valueTableInputColumns = SubLObjectFactory.makeString("valueTableInputColumns");
        $str73$valueTableOutputColumns = SubLObjectFactory.makeString("valueTableOutputColumns");
        $str74$valueTableAssignments = SubLObjectFactory.makeString("valueTableAssignments");
        $str75$valueTableAssignment = SubLObjectFactory.makeString("valueTableAssignment");
        $list76 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SOURCES"), (SubLObject)SubLObjectFactory.makeSymbol("TARGETS"));
        $str77$valueTableAssignmentSources = SubLObjectFactory.makeString("valueTableAssignmentSources");
        $str78$valueTableAssignmentTuple = SubLObjectFactory.makeString("valueTableAssignmentTuple");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str80$valueTableAssignmentTargets = SubLObjectFactory.makeString("valueTableAssignmentTargets");
        $kw81$INPUT_QUERIES = SubLObjectFactory.makeKeyword("INPUT-QUERIES");
        $const82$valueTableSourceQueries = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("valueTableSourceQueries"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-QUERIES"));
        $kw84$OUTPUT_QUERY = SubLObjectFactory.makeKeyword("OUTPUT-QUERY");
        $const85$valueTableTargetQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("valueTableTargetQuery"));
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-QUERY"));
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SOURCES"), (SubLObject)SubLObjectFactory.makeSymbol("?TARGETS"));
        $const88$queryResultsCombineInTable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryResultsCombineInTable"));
        $sym89$_SOURCES = SubLObjectFactory.makeSymbol("?SOURCES");
        $sym90$_TARGETS = SubLObjectFactory.makeSymbol("?TARGETS");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCES"), (SubLObject)SubLObjectFactory.makeSymbol("TARGETS"));
        $sym92$REST = SubLObjectFactory.makeSymbol("REST");
        $sym93$VARIABLE_MAPPING_TABLE = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE");
        $sym94$VARIABLE_MAPPING_TABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-P");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("INCOMPATIBLES"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"));
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE-QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET-QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("INCOMPATIBLES"), (SubLObject)SubLObjectFactory.makeKeyword("ASSIGNMENTS"));
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-INCOMPATIBLES"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-ASSIGNMENTS"));
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS"));
        $sym99$PRINT_VARMAP_TABLE = SubLObjectFactory.makeSymbol("PRINT-VARMAP-TABLE");
        $sym100$VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-P"));
        $sym102$VARIABLE_MAPPING_TABLE_ID = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-ID");
        $sym103$_CSETF_VARIABLE_MAPPING_TABLE_ID = SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ID");
        $sym104$VARIABLE_MAPPING_TABLE_SOURCE_QUERY = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-QUERY");
        $sym105$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY = SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY");
        $sym106$VARIABLE_MAPPING_TABLE_TARGET_QUERY = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-QUERY");
        $sym107$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY = SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY");
        $sym108$VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES");
        $sym109$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES = SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES");
        $sym110$VARIABLE_MAPPING_TABLE_TARGET_VARIABLES = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-VARIABLES");
        $sym111$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES = SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES");
        $sym112$VARIABLE_MAPPING_TABLE_INCOMPATIBLES = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-INCOMPATIBLES");
        $sym113$_CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES = SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES");
        $sym114$VARIABLE_MAPPING_TABLE_ASSIGNMENTS = SubLObjectFactory.makeSymbol("VARIABLE-MAPPING-TABLE-ASSIGNMENTS");
        $sym115$_CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS = SubLObjectFactory.makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS");
        $kw116$SOURCE_QUERY = SubLObjectFactory.makeKeyword("SOURCE-QUERY");
        $kw117$TARGET_QUERY = SubLObjectFactory.makeKeyword("TARGET-QUERY");
        $kw118$SOURCE_VARIABLES = SubLObjectFactory.makeKeyword("SOURCE-VARIABLES");
        $kw119$TARGET_VARIABLES = SubLObjectFactory.makeKeyword("TARGET-VARIABLES");
        $kw120$INCOMPATIBLES = SubLObjectFactory.makeKeyword("INCOMPATIBLES");
        $sym121$MAKE_VARIABLE_MAPPING_TABLE = SubLObjectFactory.makeSymbol("MAKE-VARIABLE-MAPPING-TABLE");
        $sym122$VISIT_DEFSTRUCT_OBJECT_VARIABLE_MAPPING_TABLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-VARIABLE-MAPPING-TABLE-METHOD");
        $str123$__VariableMappingTable_ = SubLObjectFactory.makeString("#<VariableMappingTable ");
        $str124$_A_for__A_____A__ = SubLObjectFactory.makeString("~A for ~A -> ~A~%");
        $str125$anonymous = SubLObjectFactory.makeString("anonymous");
        $str126$no_source = SubLObjectFactory.makeString("no source");
        $str127$no_target = SubLObjectFactory.makeString("no target");
        $str128$_Source_Variables___A__ = SubLObjectFactory.makeString(" Source Variables: ~A~%");
        $str129$_Target_Variables___A__ = SubLObjectFactory.makeString(" Target Variables: ~A~%");
        $str130$_Incompatibilities__source_view__ = SubLObjectFactory.makeString(" Incompatibilities (source view): ~%");
        $str131$null_dictionary__ = SubLObjectFactory.makeString("null dictionary~%");
        $str132$_Current_Assignments___A__ = SubLObjectFactory.makeString(" Current Assignments: ~A~%");
        $str133$varMapTable = SubLObjectFactory.makeString("varMapTable");
        $str134$varMapTableId = SubLObjectFactory.makeString("varMapTableId");
        $str135$varMapSourceQuery = SubLObjectFactory.makeString("varMapSourceQuery");
        $str136$varMapTargetQuery = SubLObjectFactory.makeString("varMapTargetQuery");
        $str137$varMapSourceVariables = SubLObjectFactory.makeString("varMapSourceVariables");
        $str138$varMapTargetVariables = SubLObjectFactory.makeString("varMapTargetVariables");
        $str139$varMapIncompatibles = SubLObjectFactory.makeString("varMapIncompatibles");
        $str140$varMapIncompatible = SubLObjectFactory.makeString("varMapIncompatible");
        $str141$varMapSourceVariable = SubLObjectFactory.makeString("varMapSourceVariable");
        $str142$varMapAssignments = SubLObjectFactory.makeString("varMapAssignments");
        $str143$varMapAssignment = SubLObjectFactory.makeString("varMapAssignment");
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"));
        $str145$varMapTargetVariable = SubLObjectFactory.makeString("varMapTargetVariable");
        $sym146$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $kw147$SOURCE = SubLObjectFactory.makeKeyword("SOURCE");
        $const148$variableMappingTableSourceFormula = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("variableMappingTableSourceFormula-QuerySpec"));
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOURCE"));
        $kw150$TARGET = SubLObjectFactory.makeKeyword("TARGET");
        $const151$variableMappingTableTargetFormula = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("variableMappingTableTargetFormula-QuerySpec"));
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TARGET"));
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SRC-ISAS"), (SubLObject)SubLObjectFactory.makeSymbol("SRC-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("SRC-QUOTED-ISAS"));
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRG-ISAS"), (SubLObject)SubLObjectFactory.makeSymbol("TRG-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("TRG-QUOTED-ISAS"));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SOURCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET-VAR"));
        $const156$querySpecVariablesUnifyInTable_Wo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("querySpecVariablesUnifyInTable-WorkaroundPred"));
        $list157 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnalysisOutputBindingsForVarFn")), (SubLObject)SubLObjectFactory.makeSymbol("?SOURCE-VAR"));
        $list158 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnalysisInputBindingsForVarFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET-VAR"));
        $const159$querySpecVariablesUnifyInTable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("querySpecVariablesUnifyInTable"));
        $sym160$_SOURCE_VAR = SubLObjectFactory.makeSymbol("?SOURCE-VAR");
        $sym161$_TARGET_VAR = SubLObjectFactory.makeSymbol("?TARGET-VAR");
        $sym162$VARMAP_UNIQUE_EL_VAR_WRT_VARS = SubLObjectFactory.makeSymbol("VARMAP-UNIQUE-EL-VAR-WRT-VARS");
        $sym163$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
    }
    
    public static final class $value_table_column_native extends SubLStructNative
    {
        public SubLObject $query;
        public SubLObject $label;
        public SubLObject $values;
        private static final SubLStructDeclNative structDecl;
        
        public $value_table_column_native() {
            this.$query = (SubLObject)CommonSymbols.NIL;
            this.$label = (SubLObject)CommonSymbols.NIL;
            this.$values = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$value_table_column_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$query;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$label;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$values;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$query = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$label = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$values = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$value_table_column_native.class, value_tables.$sym0$VALUE_TABLE_COLUMN, value_tables.$sym1$VALUE_TABLE_COLUMN_P, value_tables.$list2, value_tables.$list3, new String[] { "$query", "$label", "$values" }, value_tables.$list4, value_tables.$list5, value_tables.$sym6$PRINT_VALUE_TABLE_COLUMN);
        }
    }
    
    public static final class $value_table_column_p$UnaryFunction extends UnaryFunction
    {
        public $value_table_column_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VALUE-TABLE-COLUMN-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return value_tables.value_table_column_p(arg1);
        }
    }
    
    public static final class $value_table_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $label;
        public SubLObject $input_columns;
        public SubLObject $output_column;
        public SubLObject $assignments;
        private static final SubLStructDeclNative structDecl;
        
        public $value_table_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$label = (SubLObject)CommonSymbols.NIL;
            this.$input_columns = (SubLObject)CommonSymbols.NIL;
            this.$output_column = (SubLObject)CommonSymbols.NIL;
            this.$assignments = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$value_table_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$label;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$input_columns;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$output_column;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$assignments;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$label = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$input_columns = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$output_column = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$assignments = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$value_table_native.class, value_tables.$sym37$VALUE_TABLE, value_tables.$sym38$VALUE_TABLE_P, value_tables.$list39, value_tables.$list40, new String[] { "$id", "$label", "$input_columns", "$output_column", "$assignments" }, value_tables.$list41, value_tables.$list42, value_tables.$sym43$PRINT_VALUE_TABLE);
        }
    }
    
    public static final class $value_table_p$UnaryFunction extends UnaryFunction
    {
        public $value_table_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VALUE-TABLE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return value_tables.value_table_p(arg1);
        }
    }
    
    public static final class $variable_mapping_table_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $source_query;
        public SubLObject $target_query;
        public SubLObject $source_variables;
        public SubLObject $target_variables;
        public SubLObject $incompatibles;
        public SubLObject $assignments;
        private static final SubLStructDeclNative structDecl;
        
        public $variable_mapping_table_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$source_query = (SubLObject)CommonSymbols.NIL;
            this.$target_query = (SubLObject)CommonSymbols.NIL;
            this.$source_variables = (SubLObject)CommonSymbols.NIL;
            this.$target_variables = (SubLObject)CommonSymbols.NIL;
            this.$incompatibles = (SubLObject)CommonSymbols.NIL;
            this.$assignments = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$variable_mapping_table_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$source_query;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$target_query;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$source_variables;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$target_variables;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$incompatibles;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$assignments;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$source_query = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$target_query = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$source_variables = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$target_variables = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$incompatibles = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$assignments = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$variable_mapping_table_native.class, value_tables.$sym93$VARIABLE_MAPPING_TABLE, value_tables.$sym94$VARIABLE_MAPPING_TABLE_P, value_tables.$list95, value_tables.$list96, new String[] { "$id", "$source_query", "$target_query", "$source_variables", "$target_variables", "$incompatibles", "$assignments" }, value_tables.$list97, value_tables.$list98, value_tables.$sym99$PRINT_VARMAP_TABLE);
        }
    }
    
    public static final class $variable_mapping_table_p$UnaryFunction extends UnaryFunction
    {
        public $variable_mapping_table_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VARIABLE-MAPPING-TABLE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return value_tables.variable_mapping_table_p(arg1);
        }
    }
}

/*

	Total time: 5098 ms
	
*/