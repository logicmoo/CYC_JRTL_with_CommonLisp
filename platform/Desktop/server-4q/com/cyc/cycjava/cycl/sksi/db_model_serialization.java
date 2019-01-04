package com.cyc.cycjava.cycl.sksi;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.cycml;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class db_model_serialization extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.db_model_serialization";
    public static final String myFingerPrint = "bb53a035c42a61f0e50c6f77be8eda3f9f71c185eb28851ee0cf44d29cdb67dd";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 842L)
    private static SubLSymbol $shared_xml_structure_map$;
    private static final SubLList $list0;
    private static final SubLString $str1$undocumented_serialization;
    private static final SubLSymbol $sym2$KEY_XML;
    private static final SubLSymbol $sym3$KEY;
    private static final SubLSymbol $sym4$XML;
    private static final SubLSymbol $sym5$STREAM;
    private static final SubLSymbol $sym6$DEFINE_PROTECTED;
    private static final SubLSymbol $sym7$CHECK_TYPE;
    private static final SubLSymbol $sym8$CLET;
    private static final SubLSymbol $sym9$DICTIONARY_LOOKUP;
    private static final SubLSymbol $sym10$_SHARED_XML_STRUCTURE_MAP_;
    private static final SubLSymbol $sym11$PUNLESS;
    private static final SubLSymbol $sym12$CSETQ;
    private static final SubLSymbol $sym13$GENERATE_XML_KEY;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$CONS;
    private static final SubLSymbol $sym16$DICTIONARY_ENTER;
    private static final SubLSymbol $sym17$CWITH_OUTPUT_TO_STRING;
    private static final SubLSymbol $sym18$_XML_STREAM_;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$RPLACD;
    private static final SubLSymbol $sym21$CAR;
    private static final SubLSymbol $sym22$SERIALIZE_SHARED_KEY;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$TABLE_MERGER_P;
    private static final SubLString $str25$tableMerger;
    private static final SubLSymbol $kw26$UNINITIALIZED;
    private static final SubLString $str27$sources;
    private static final SubLString $str28$target;
    private static final SubLString $str29$columnCorrespondence;
    private static final SubLString $str30$added;
    private static final SubLString $str31$dropped;
    private static final SubLString $str32$sqlStartIndex;
    private static final SubLString $str33$sqlEndIndex;
    private static final SubLSymbol $sym34$COLUMN_MERGER_P;
    private static final SubLString $str35$columnMerger;
    private static final SubLString $str36$indexEntry;
    private static final SubLString $str37$indexKey;
    private static final SubLString $str38$indexValue;
    private static final SubLSymbol $sym39$STRINGP;
    private static final SubLSymbol $sym40$NUMBERP;
    private static final SubLSymbol $sym41$SERIALIZE_DATABASE_MODEL_EXTERNAL;
    private static final SubLSymbol $sym42$LISTP;
    private static final SubLString $str43$US_ASCII;
    private static final SubLString $str44$databaseModel;
    private static final SubLString $str45$dbFusion_dtd;
    private static final SubLString $str46$elements;
    private static final SubLString $str47$element;
    private static final SubLSymbol $sym48$DATABASE_OUTPUT_SPEC_P;
    private static final SubLString $str49$databaseOutputSpec;
    private static final SubLString $str50$specId;
    private static final SubLString $str51$recipe;
    private static final SubLString $str52$model;
    private static final SubLString $str53$semanticRecipe;
    private static final SubLString $str54$index;
    private static final SubLSymbol $sym55$SEMANTICS_P;
    private static final SubLString $str56$semantics;
    private static final SubLString $str57$database;
    private static final SubLString $str58$tables;
    private static final SubLSymbol $sym59$VALUE_SEMANTICS_P;
    private static final SubLString $str60$annotatedValue;
    private static final SubLString $str61$databaseValue;
    private static final SubLString $str62$cyclAnnotation;
    private static final SubLSymbol $sym63$COLUMN_SEMANTICS_P;
    private static final SubLString $str64$column;
    private static final SubLString $str65$columnName;
    private static final SubLString $str66$columnTable;
    private static final SubLString $str67$columnValues;
    private static final SubLString $str68$columnType;
    private static final SubLString $str69$columnSize;
    private static final SubLString $str70$noSizeRestriction;
    private static final SubLSymbol $sym71$TABLE_SEMANTICS_P;
    private static final SubLString $str72$table;
    private static final SubLString $str73$tableId;
    private static final SubLString $str74$tableName;
    private static final SubLString $str75$tableSourceSemantics;
    private static final SubLString $str76$tableSemantics;
    private static final SubLString $str77$tablePointsToTableIds;
    private static final SubLString $str78$tablePointedToByTableIds;
    private static final SubLString $str79$tableCycL;
    private static final SubLString $str80$tableColumns;
    private static final SubLString $str81$tablePrimaryKeyColumns;
    private static final SubLString $str82$tableColumnConstraints;
    private static final SubLSymbol $sym83$PRIMARY_KEY_CONSTRAINT_P;
    private static final SubLString $str84$primaryKey;
    private static final SubLString $str85$keyName;
    private static final SubLString $str86$keyColumn;
    private static final SubLSymbol $sym87$FOREIGN_KEY_CONSTRAINT_P;
    private static final SubLString $str88$foreignKey;
    private static final SubLString $str89$foreignTable;
    private static final SubLString $str90$foreignColumn;
    private static final SubLSymbol $sym91$SQL_COMMAND_P;
    private static final SubLSymbol $sym92$TRUE;
    private static final SubLString $str93$object;
    private static final SubLString $str94$sharedKey;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 1017L)
    public static SubLObject define_shared_serialization(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)db_model_serialization.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = (SubLObject)db_model_serialization.NIL;
        SubLObject v_object = (SubLObject)db_model_serialization.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
        v_object = current.first();
        current = current.rest();
        if (db_model_serialization.NIL == current) {
            current = temp;
            SubLObject comment = (SubLObject)db_model_serialization.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
            comment = current.first();
            SubLObject body;
            current = (body = current.rest());
            if (db_model_serialization.NIL == body) {
                body = (SubLObject)ConsesLow.list(comment);
                comment = (SubLObject)db_model_serialization.$str1$undocumented_serialization;
            }
            final SubLObject keyXxml = (SubLObject)db_model_serialization.$sym2$KEY_XML;
            final SubLObject key = (SubLObject)db_model_serialization.$sym3$KEY;
            final SubLObject xml = (SubLObject)db_model_serialization.$sym4$XML;
            final SubLObject stream = (SubLObject)db_model_serialization.$sym5$STREAM;
            return (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym6$DEFINE_PROTECTED, name, (SubLObject)ConsesLow.list(v_object), comment, (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym7$CHECK_TYPE, v_object, type), (SubLObject)ConsesLow.listS((SubLObject)db_model_serialization.$sym8$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(keyXxml, (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym9$DICTIONARY_LOOKUP, (SubLObject)db_model_serialization.$sym10$_SHARED_XML_STRUCTURE_MAP_, v_object)), key, xml), (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym11$PUNLESS, keyXxml, (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym12$CSETQ, key, (SubLObject)ConsesLow.listS((SubLObject)db_model_serialization.$sym13$GENERATE_XML_KEY, v_object, (SubLObject)db_model_serialization.$list14)), (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym12$CSETQ, keyXxml, (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym15$CONS, key, xml)), (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym16$DICTIONARY_ENTER, (SubLObject)db_model_serialization.$sym10$_SHARED_XML_STRUCTURE_MAP_, v_object, keyXxml), (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym17$CWITH_OUTPUT_TO_STRING, (SubLObject)ConsesLow.list(stream, xml), (SubLObject)ConsesLow.listS((SubLObject)db_model_serialization.$sym8$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym18$_XML_STREAM_, stream), (SubLObject)db_model_serialization.$list19), ConsesLow.append(body, (SubLObject)db_model_serialization.NIL))), (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym20$RPLACD, keyXxml, xml)), (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym12$CSETQ, key, (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym21$CAR, keyXxml)), (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym22$SERIALIZE_SHARED_KEY, key), (SubLObject)db_model_serialization.$list23));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)db_model_serialization.$list0);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 2193L)
    public static SubLObject define_serialization(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)db_model_serialization.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = (SubLObject)db_model_serialization.NIL;
        SubLObject v_object = (SubLObject)db_model_serialization.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
        v_object = current.first();
        current = current.rest();
        if (db_model_serialization.NIL == current) {
            current = temp;
            SubLObject comment = (SubLObject)db_model_serialization.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)db_model_serialization.$list0);
            comment = current.first();
            SubLObject body;
            current = (body = current.rest());
            if (db_model_serialization.NIL == body) {
                body = (SubLObject)ConsesLow.list(comment);
                comment = (SubLObject)db_model_serialization.$str1$undocumented_serialization;
            }
            return (SubLObject)ConsesLow.listS((SubLObject)db_model_serialization.$sym6$DEFINE_PROTECTED, name, (SubLObject)ConsesLow.list(v_object), comment, (SubLObject)ConsesLow.list((SubLObject)db_model_serialization.$sym7$CHECK_TYPE, v_object, type), ConsesLow.append(body, (SubLObject)db_model_serialization.$list23));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)db_model_serialization.$list0);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 2494L)
    public static SubLObject serialize_table_merger(final SubLObject merger) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != semantic_etl_bus.table_merger_p(merger) : merger;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str25$tableMerger, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str27$sources, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.table_merger_sources(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str27$sources);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str28$target, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_table(semantic_etl_bus.table_merger_target(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str28$target);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str29$columnCorrespondence, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.table_merger_column_correspondence_list(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$5, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str29$columnCorrespondence);
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str30$added, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.table_merger_added(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str30$added);
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str31$dropped, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.table_merger_dropped(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values5 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str31$dropped);
                            Values.restoreValuesFromVector(_values5);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str32$sqlStartIndex, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_number(semantic_etl_bus.table_merger_sql_start_index(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values6 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str32$sqlStartIndex);
                            Values.restoreValuesFromVector(_values6);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str33$sqlEndIndex, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_number(semantic_etl_bus.table_merger_sql_end_index(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values7 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str33$sqlEndIndex);
                            Values.restoreValuesFromVector(_values7);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                final SubLObject _values8 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str25$tableMerger);
                Values.restoreValuesFromVector(_values8);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 3560L)
    public static SubLObject serialize_column_merger(final SubLObject merger) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != semantic_etl_bus.column_merger_p(merger) : merger;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str35$columnMerger, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str27$sources, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.column_merger_sources(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$32, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str27$sources);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$34 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str28$target, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$35 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_column(semantic_etl_bus.column_merger_target(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$33, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str28$target);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$37 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str29$columnCorrespondence, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$38 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.column_merger_column_correspondence_list(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$34, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$37, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str29$columnCorrespondence);
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$40 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str30$added, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$41 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.column_merger_added(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$41, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$35, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$40, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str30$added);
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$43 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str31$dropped, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$44 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.column_merger_dropped(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$44, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$36, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$43, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values5 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str31$dropped);
                            Values.restoreValuesFromVector(_values5);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str32$sqlStartIndex, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_number(semantic_etl_bus.column_merger_sql_start_index(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$37, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values6 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str32$sqlStartIndex);
                            Values.restoreValuesFromVector(_values6);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$49 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str33$sqlEndIndex, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$50 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_number(semantic_etl_bus.column_merger_sql_end_index(merger));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$38, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$49, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values7 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str33$sqlEndIndex);
                            Values.restoreValuesFromVector(_values7);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                final SubLObject _values8 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str35$columnMerger);
                Values.restoreValuesFromVector(_values8);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 4401L)
    public static SubLObject serialize_shared_structure_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread))); db_model_serialization.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject keyXxml = thread.secondMultipleValue();
            thread.resetMultipleValues();
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str36$indexEntry, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$60 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$61 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str37$indexKey, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$61 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                    serialize_string(keyXxml.first());
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$61, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$61, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$60, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str37$indexKey);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$63 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$62 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str38$indexValue, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$64 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                    xml_utilities.xml_write_string_indented(keyXxml.rest(), (SubLObject)db_model_serialization.UNPROVIDED, (SubLObject)db_model_serialization.UNPROVIDED);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$64, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$62, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$63, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str38$indexValue);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str36$indexEntry);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 4820L)
    public static SubLObject serialize_string(final SubLObject string) {
        assert db_model_serialization.NIL != Types.stringp(string) : string;
        cycml.cycml_serialize_string(string, (SubLObject)db_model_serialization.UNPROVIDED);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 4970L)
    public static SubLObject serialize_number(final SubLObject number) {
        assert db_model_serialization.NIL != Types.numberp(number) : number;
        cycml.cycml_serialize_number(number, (SubLObject)db_model_serialization.UNPROVIDED);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 5120L)
    public static SubLObject serialize_database_model_external(final SubLObject output_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)db_model_serialization.NIL;
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_amount$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_amount$.bind((SubLObject)db_model_serialization.ZERO_INTEGER, thread);
            SubLObject stream = (SubLObject)db_model_serialization.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0_$68 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    serialize_database_model(output_specs);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0_$68, thread);
                }
                result = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)db_model_serialization.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                }
            }
        }
        finally {
            xml_utilities.$xml_indentation_amount$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 5353L)
    public static SubLObject serialize_database_model(final SubLObject output_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != Types.listp(output_specs) : output_specs;
        xml_utilities.xml_header(xml_utilities.xml_version(), (SubLObject)db_model_serialization.$str43$US_ASCII, (SubLObject)db_model_serialization.NIL);
        xml_utilities.generate_xml_header_entry_for_dtd((SubLObject)db_model_serialization.$str44$databaseModel, (SubLObject)db_model_serialization.$str45$dbFusion_dtd, xml_vars.$xml_stream$.getDynamicValue(thread));
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str44$databaseModel, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                final SubLObject _prev_bind_0_$70 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                    serialize_list(output_specs);
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$70, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str44$databaseModel);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return list_utilities.sublisp_boolean(output_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 5707L)
    public static SubLObject serialize_list(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != Types.listp(list) : list;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str46$elements, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                final SubLObject _prev_bind_0_$71 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                    SubLObject cdolist_list_var = list;
                    SubLObject element = (SubLObject)db_model_serialization.NIL;
                    element = cdolist_list_var.first();
                    while (db_model_serialization.NIL != cdolist_list_var) {
                        try {
                            final SubLObject _prev_bind_0_$72 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$73 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str47$element, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$73 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                    serialize_object(element);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$73, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$73, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$72, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$74 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str47$element);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        element = cdolist_list_var.first();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$71, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str46$elements);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 5941L)
    public static SubLObject serialize_database_output_spec(final SubLObject output_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != semantic_etl_bus.database_output_spec_p(output_spec) : output_spec;
        final SubLObject _prev_bind_0 = db_model_serialization.$shared_xml_structure_map$.currentBinding(thread);
        try {
            db_model_serialization.$shared_xml_structure_map$.bind(dictionary.new_dictionary((SubLObject)db_model_serialization.EQ, (SubLObject)db_model_serialization.UNPROVIDED), thread);
            try {
                final SubLObject _prev_bind_0_$76 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str49$databaseOutputSpec, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$77 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$78 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$79 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str50$specId, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$79 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                    serialize_number(semantic_etl_bus.db_output_spec_id(output_spec));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$79, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$79, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$78, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$80 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str50$specId);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$81 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$80 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str51$recipe, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$82 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                    serialize_list(Sequences.remove(semantic_etl_bus.$recipe_marker$.getDynamicValue(thread), semantic_etl_bus.db_output_spec_recipe(output_spec), (SubLObject)db_model_serialization.EQUAL, (SubLObject)db_model_serialization.UNPROVIDED, (SubLObject)db_model_serialization.UNPROVIDED, (SubLObject)db_model_serialization.UNPROVIDED, (SubLObject)db_model_serialization.UNPROVIDED));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$82, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$80, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$81, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str51$recipe);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$84 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$81 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str52$model, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$85 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                    serialize_semantics(semantic_etl_bus.db_output_spec_semantics(output_spec));
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$85, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$81, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$84, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str52$model);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                            }
                        }
                        if (db_model_serialization.NIL != semantic_etl_bus.table_merger_p(conses_high.last(semantic_etl_bus.db_output_spec_semantic_recipe(output_spec), (SubLObject)db_model_serialization.UNPROVIDED).first())) {
                            try {
                                final SubLObject _prev_bind_0_$87 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$82 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str53$semanticRecipe, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$88 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                        serialize_list(conses_high.last(semantic_etl_bus.db_output_spec_semantic_recipe(output_spec), (SubLObject)db_model_serialization.UNPROVIDED));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$88, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$82, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$87, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$89 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str53$semanticRecipe);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                                }
                            }
                        }
                        else {
                            try {
                                final SubLObject _prev_bind_0_$90 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$83 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str53$semanticRecipe, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$91 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                        serialize_list((SubLObject)db_model_serialization.NIL);
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$91, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$83, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$90, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str53$semanticRecipe);
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                                }
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$93 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$84 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str54$index, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$94 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                    serialize_shared_structure_index();
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$94, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$84, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$93, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                final SubLObject _values6 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str54$index);
                                Values.restoreValuesFromVector(_values6);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$77, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$76, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$96 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                    final SubLObject _values7 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str49$databaseOutputSpec);
                    Values.restoreValuesFromVector(_values7);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                }
            }
        }
        finally {
            db_model_serialization.$shared_xml_structure_map$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 6998L)
    public static SubLObject serialize_semantics(final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != semantic_etl_bus.semantics_p(semantics) : semantics;
        SubLObject keyXxml = dictionary.dictionary_lookup(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread), semantics, (SubLObject)db_model_serialization.UNPROVIDED);
        SubLObject key = (SubLObject)db_model_serialization.NIL;
        SubLObject xml = (SubLObject)db_model_serialization.NIL;
        if (db_model_serialization.NIL == keyXxml) {
            key = generate_xml_key(semantics, dictionary.dictionary_length(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread)));
            keyXxml = (SubLObject)ConsesLow.cons(key, xml);
            dictionary.dictionary_enter(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread), semantics, keyXxml);
            SubLObject stream = (SubLObject)db_model_serialization.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    xml_utilities.$xml_indentation_level$.bind((SubLObject)db_model_serialization.ZERO_INTEGER, thread);
                    try {
                        final SubLObject _prev_bind_0_$103 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$104 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str56$semantics, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$104 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$105 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$105 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str57$database, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$106 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_string(semantic_etl_bus.access_path_pretty_string(semantic_etl_bus.semantics_access_path(semantics)));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$106, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$105, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$105, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str57$database);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$108 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$106 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str58$tables, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$109 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.semantics_table_semantics_list(semantics));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$109, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$106, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$108, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str58$tables);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                    }
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$104, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$104, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$103, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str56$semantics);
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                        }
                    }
                }
                finally {
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_2, thread);
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                xml = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)db_model_serialization.UNPROVIDED);
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            ConsesLow.rplacd(keyXxml, xml);
        }
        key = keyXxml.first();
        serialize_shared_key(key);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 7389L)
    public static SubLObject serialize_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != semantic_etl_bus.value_semantics_p(value) : value;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str60$annotatedValue, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$117 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str61$databaseValue, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_object(semantic_etl_bus.value_semantics_value(value));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$117, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str61$databaseValue);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$119 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$118 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str62$cyclAnnotation, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$120 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.value_semantics_value_parses(value));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$120, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$118, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$119, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$121 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str62$cyclAnnotation);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str60$annotatedValue);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 7748L)
    public static SubLObject serialize_column(final SubLObject column) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != semantic_etl_bus.column_semantics_p(column) : column;
        SubLObject keyXxml = dictionary.dictionary_lookup(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread), column, (SubLObject)db_model_serialization.UNPROVIDED);
        SubLObject key = (SubLObject)db_model_serialization.NIL;
        SubLObject xml = (SubLObject)db_model_serialization.NIL;
        if (db_model_serialization.NIL == keyXxml) {
            key = generate_xml_key(column, dictionary.dictionary_length(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread)));
            keyXxml = (SubLObject)ConsesLow.cons(key, xml);
            dictionary.dictionary_enter(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread), column, keyXxml);
            SubLObject stream = (SubLObject)db_model_serialization.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    xml_utilities.$xml_indentation_level$.bind((SubLObject)db_model_serialization.ZERO_INTEGER, thread);
                    try {
                        final SubLObject _prev_bind_0_$124 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$125 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str64$column, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$125 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$126 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$126 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str65$columnName, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$127 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_string(semantic_etl_bus.column_semantics_column_name(column));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$127, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$126, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$126, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str65$columnName);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$129 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$127 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str66$columnTable, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$130 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_table(semantic_etl_bus.column_semantics_table_semantics(column));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$130, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$127, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$129, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str66$columnTable);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$132 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$128 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str67$columnValues, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$133 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_list((SubLObject)db_model_serialization.NIL);
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$133, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$128, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$132, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$134 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str67$columnValues);
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$134, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$135 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$129 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str68$columnType, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$136 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_string(semantic_etl_bus.column_semantics_column_type(column));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$136, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$129, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$135, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str68$columnType);
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$138 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$130 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str69$columnSize, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$139 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            if (db_model_serialization.NIL == semantic_etl_bus.column_semantics_column_size(column)) {
                                                final SubLObject _prev_bind_0_$140 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$131 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str70$noSizeRestriction, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.T, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$141 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$141, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$131, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$140, thread);
                                                }
                                            }
                                            else {
                                                serialize_number(semantic_etl_bus.column_semantics_column_size(column));
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$139, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$130, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$138, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$142 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str69$columnSize);
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                                    }
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$125, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$125, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$124, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$143 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values6 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str64$column);
                            Values.restoreValuesFromVector(_values6);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
                        }
                    }
                }
                finally {
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_2, thread);
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                xml = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                    final SubLObject _values7 = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)db_model_serialization.UNPROVIDED);
                    Values.restoreValuesFromVector(_values7);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            ConsesLow.rplacd(keyXxml, xml);
        }
        key = keyXxml.first();
        serialize_shared_key(key);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 8631L)
    public static SubLObject serialize_table(final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != semantic_etl_bus.table_semantics_p(table) : table;
        SubLObject keyXxml = dictionary.dictionary_lookup(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread), table, (SubLObject)db_model_serialization.UNPROVIDED);
        SubLObject key = (SubLObject)db_model_serialization.NIL;
        SubLObject xml = (SubLObject)db_model_serialization.NIL;
        if (db_model_serialization.NIL == keyXxml) {
            key = generate_xml_key(table, dictionary.dictionary_length(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread)));
            keyXxml = (SubLObject)ConsesLow.cons(key, xml);
            dictionary.dictionary_enter(db_model_serialization.$shared_xml_structure_map$.getDynamicValue(thread), table, keyXxml);
            SubLObject stream = (SubLObject)db_model_serialization.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    xml_utilities.$xml_indentation_level$.bind((SubLObject)db_model_serialization.ZERO_INTEGER, thread);
                    try {
                        final SubLObject _prev_bind_0_$151 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$152 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str72$table, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$152 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$153 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$153 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str73$tableId, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$154 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_number(semantic_etl_bus.table_semantics_table_id(table));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$154, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$153, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$153, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$155 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str73$tableId);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$155, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$156 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$154 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str74$tableName, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$157 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_string(semantic_etl_bus.table_semantics_table_name(table));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$157, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$154, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$156, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$158 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str74$tableName);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$158, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$159 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$155 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str75$tableSourceSemantics, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$160 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            if (db_model_serialization.NIL != semantic_etl_bus.table_semantics_source_semantics(table)) {
                                                serialize_semantics(semantic_etl_bus.table_semantics_source_semantics(table));
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$160, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$155, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$159, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$161 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str75$tableSourceSemantics);
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$161, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$162 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$156 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str76$tableSemantics, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$163 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_semantics(semantic_etl_bus.table_semantics_semantics(table));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$163, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$156, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$162, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$164 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str76$tableSemantics);
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$164, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$165 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$157 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str77$tablePointsToTableIds, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$166 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_points_to_table_ids(table));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$166, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$157, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$165, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$167 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str77$tablePointsToTableIds);
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$167, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$168 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$158 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str78$tablePointedToByTableIds, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$169 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_pointed_to_by_table_ids(table));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$169, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$158, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$168, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$170 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values6 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str78$tablePointedToByTableIds);
                                        Values.restoreValuesFromVector(_values6);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$170, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$171 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$159 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str79$tableCycL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$172 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_table_parses(table));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$172, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$159, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$171, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$173 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values7 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str79$tableCycL);
                                        Values.restoreValuesFromVector(_values7);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$173, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$174 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$160 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str80$tableColumns, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$175 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_column_semantics_list(table));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$175, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$160, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$174, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$176 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values8 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str80$tableColumns);
                                        Values.restoreValuesFromVector(_values8);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$176, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$177 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$161 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str81$tablePrimaryKeyColumns, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$178 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_primary_key_columns(table));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$178, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$161, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$177, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values9 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str81$tablePrimaryKeyColumns);
                                        Values.restoreValuesFromVector(_values9);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$180 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$162 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str82$tableColumnConstraints, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$181 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_column_constraints(table));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$181, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$162, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$180, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$182 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                                        final SubLObject _values10 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str82$tableColumnConstraints);
                                        Values.restoreValuesFromVector(_values10);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$182, thread);
                                    }
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$152, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$152, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$151, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$183 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values11 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str72$table);
                            Values.restoreValuesFromVector(_values11);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$183, thread);
                        }
                    }
                }
                finally {
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_2, thread);
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                xml = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                    final SubLObject _values12 = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)db_model_serialization.UNPROVIDED);
                    Values.restoreValuesFromVector(_values12);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            ConsesLow.rplacd(keyXxml, xml);
        }
        key = keyXxml.first();
        serialize_shared_key(key);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 9920L)
    public static SubLObject serialize_primary_key_constraint(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != semantic_etl_bus.primary_key_constraint_p(constraint) : constraint;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str84$primaryKey, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                final SubLObject _prev_bind_0_$195 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$196 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$197 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str85$keyName, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$197 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_string(semantic_etl_bus.primary_key_constraint_constraint_name(constraint));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$197, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$197, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$196, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$198 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str85$keyName);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$198, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$199 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$198 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str86$keyColumn, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$200 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_column(semantic_etl_bus.primary_key_constraint_constrained_column(constraint));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$200, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$198, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$199, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$201 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str86$keyColumn);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$201, thread);
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$195, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str84$primaryKey);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 10339L)
    public static SubLObject serialize_foreign_key_constraint(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != semantic_etl_bus.foreign_key_constraint_p(constraint) : constraint;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str88$foreignKey, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                final SubLObject _prev_bind_0_$204 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$205 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$206 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str85$keyName, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$206 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_string(semantic_etl_bus.foreign_key_constraint_constraint_name(constraint));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$206, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$206, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$205, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$207 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str85$keyName);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$207, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$208 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$207 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str86$keyColumn, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$209 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_column(semantic_etl_bus.foreign_key_constraint_constrained_column(constraint));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$209, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$207, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$208, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$210 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str86$keyColumn);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$210, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$211 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$208 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str89$foreignTable, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$212 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_table(semantic_etl_bus.foreign_key_constraint_constraining_table(constraint));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$212, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$208, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$211, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$213 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str89$foreignTable);
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$214 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$209 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str90$foreignColumn, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$215 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                                serialize_column(semantic_etl_bus.foreign_key_constraint_constraining_column(constraint));
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$215, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$209, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$214, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$216 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str90$foreignColumn);
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$216, thread);
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$204, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                final SubLObject _values5 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str88$foreignKey);
                Values.restoreValuesFromVector(_values5);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 10997L)
    public static SubLObject serialize_sql_command(final SubLObject command) {
        assert db_model_serialization.NIL != semantic_etl_bus.sql_command_p(command) : command;
        serialize_string(print_high.princ_to_string(command));
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 11173L)
    public static SubLObject serialize_object(final SubLObject v_object) {
        assert db_model_serialization.NIL != Types.sublisp_true(v_object) : v_object;
        if (v_object.isNumber()) {
            serialize_number(v_object);
        }
        else if (v_object.isString()) {
            serialize_string(v_object);
        }
        else if (db_model_serialization.NIL != unicode_strings.unicode_string_p(v_object)) {
            serialize_string(unicode_strings.unicode_string_to_subl_string(v_object));
        }
        else if (db_model_serialization.NIL != cycml.cycml_nat_p(v_object)) {
            cycml.cycml_serialize_term(v_object);
        }
        else if (v_object.isList()) {
            serialize_list(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.value_semantics_p(v_object)) {
            serialize_value(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.column_semantics_p(v_object)) {
            serialize_column(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.table_semantics_p(v_object)) {
            serialize_table(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.primary_key_constraint_p(v_object)) {
            serialize_primary_key_constraint(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.foreign_key_constraint_p(v_object)) {
            serialize_foreign_key_constraint(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.semantics_p(v_object)) {
            serialize_semantics(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.sql_command_p(v_object)) {
            serialize_sql_command(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.database_output_spec_p(v_object)) {
            serialize_database_output_spec(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.table_merger_p(v_object)) {
            serialize_table_merger(v_object);
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.column_merger_p(v_object)) {
            serialize_column_merger(v_object);
        }
        else {
            cycml.cycml_serialize_term(v_object);
        }
        return (SubLObject)db_model_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 12376L)
    public static SubLObject generate_xml_key(final SubLObject v_object, final SubLObject next_number) {
        SubLObject prefix = (SubLObject)db_model_serialization.NIL;
        if (db_model_serialization.NIL != semantic_etl_bus.column_semantics_p(v_object)) {
            prefix = (SubLObject)db_model_serialization.$str64$column;
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.table_semantics_p(v_object)) {
            prefix = (SubLObject)db_model_serialization.$str72$table;
        }
        else if (db_model_serialization.NIL != semantic_etl_bus.semantics_p(v_object)) {
            prefix = (SubLObject)db_model_serialization.$str56$semantics;
        }
        else {
            prefix = (SubLObject)db_model_serialization.$str93$object;
        }
        return Sequences.cconcatenate(prefix, print_high.princ_to_string(next_number));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/db-model-serialization.lisp", position = 12808L)
    public static SubLObject serialize_shared_key(final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert db_model_serialization.NIL != Types.stringp(key) : key;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)db_model_serialization.$str94$sharedKey, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.NIL, (SubLObject)db_model_serialization.$kw26$UNINITIALIZED);
                final SubLObject _prev_bind_0_$221 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)db_model_serialization.$kw26$UNINITIALIZED, thread);
                    serialize_string(key);
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$221, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)db_model_serialization.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)db_model_serialization.$str94$sharedKey);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)db_model_serialization.NIL;
    }
    
    public static SubLObject declare_db_model_serialization_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.db_model_serialization", "define_shared_serialization", "DEFINE-SHARED-SERIALIZATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.db_model_serialization", "define_serialization", "DEFINE-SERIALIZATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_table_merger", "SERIALIZE-TABLE-MERGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_column_merger", "SERIALIZE-COLUMN-MERGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_shared_structure_index", "SERIALIZE-SHARED-STRUCTURE-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_string", "SERIALIZE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_number", "SERIALIZE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_database_model_external", "SERIALIZE-DATABASE-MODEL-EXTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_database_model", "SERIALIZE-DATABASE-MODEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_list", "SERIALIZE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_database_output_spec", "SERIALIZE-DATABASE-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_semantics", "SERIALIZE-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_value", "SERIALIZE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_column", "SERIALIZE-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_table", "SERIALIZE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_primary_key_constraint", "SERIALIZE-PRIMARY-KEY-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_foreign_key_constraint", "SERIALIZE-FOREIGN-KEY-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_sql_command", "SERIALIZE-SQL-COMMAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_object", "SERIALIZE-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "generate_xml_key", "GENERATE-XML-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.db_model_serialization", "serialize_shared_key", "SERIALIZE-SHARED-KEY", 1, 0, false);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    public static SubLObject init_db_model_serialization_file() {
        db_model_serialization.$shared_xml_structure_map$ = SubLFiles.defparameter("*SHARED-XML-STRUCTURE-MAP*", dictionary.new_dictionary((SubLObject)db_model_serialization.EQ, (SubLObject)db_model_serialization.UNPROVIDED));
        return (SubLObject)db_model_serialization.NIL;
    }
    
    public static SubLObject setup_db_model_serialization_file() {
        access_macros.register_external_symbol((SubLObject)db_model_serialization.$sym41$SERIALIZE_DATABASE_MODEL_EXTERNAL);
        return (SubLObject)db_model_serialization.NIL;
    }
    
    public void declareFunctions() {
        declare_db_model_serialization_file();
    }
    
    public void initializeVariables() {
        init_db_model_serialization_file();
    }
    
    public void runTopLevelForms() {
        setup_db_model_serialization_file();
    }
    
    static {
        me = (SubLFile)new db_model_serialization();
        db_model_serialization.$shared_xml_structure_map$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str1$undocumented_serialization = SubLObjectFactory.makeString("undocumented serialization");
        $sym2$KEY_XML = SubLObjectFactory.makeUninternedSymbol("KEY.XML");
        $sym3$KEY = SubLObjectFactory.makeUninternedSymbol("KEY");
        $sym4$XML = SubLObjectFactory.makeUninternedSymbol("XML");
        $sym5$STREAM = SubLObjectFactory.makeUninternedSymbol("STREAM");
        $sym6$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $sym7$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $sym8$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym9$DICTIONARY_LOOKUP = SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP");
        $sym10$_SHARED_XML_STRUCTURE_MAP_ = SubLObjectFactory.makeSymbol("*SHARED-XML-STRUCTURE-MAP*");
        $sym11$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym12$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym13$GENERATE_XML_KEY = SubLObjectFactory.makeSymbol("GENERATE-XML-KEY");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("*SHARED-XML-STRUCTURE-MAP*")));
        $sym15$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym16$DICTIONARY_ENTER = SubLObjectFactory.makeSymbol("DICTIONARY-ENTER");
        $sym17$CWITH_OUTPUT_TO_STRING = SubLObjectFactory.makeSymbol("CWITH-OUTPUT-TO-STRING");
        $sym18$_XML_STREAM_ = SubLObjectFactory.makeSymbol("*XML-STREAM*");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-INDENTATION-LEVEL*"), (SubLObject)db_model_serialization.ZERO_INTEGER));
        $sym20$RPLACD = SubLObjectFactory.makeSymbol("RPLACD");
        $sym21$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym22$SERIALIZE_SHARED_KEY = SubLObjectFactory.makeSymbol("SERIALIZE-SHARED-KEY");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)db_model_serialization.NIL));
        $sym24$TABLE_MERGER_P = SubLObjectFactory.makeSymbol("TABLE-MERGER-P");
        $str25$tableMerger = SubLObjectFactory.makeString("tableMerger");
        $kw26$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str27$sources = SubLObjectFactory.makeString("sources");
        $str28$target = SubLObjectFactory.makeString("target");
        $str29$columnCorrespondence = SubLObjectFactory.makeString("columnCorrespondence");
        $str30$added = SubLObjectFactory.makeString("added");
        $str31$dropped = SubLObjectFactory.makeString("dropped");
        $str32$sqlStartIndex = SubLObjectFactory.makeString("sqlStartIndex");
        $str33$sqlEndIndex = SubLObjectFactory.makeString("sqlEndIndex");
        $sym34$COLUMN_MERGER_P = SubLObjectFactory.makeSymbol("COLUMN-MERGER-P");
        $str35$columnMerger = SubLObjectFactory.makeString("columnMerger");
        $str36$indexEntry = SubLObjectFactory.makeString("indexEntry");
        $str37$indexKey = SubLObjectFactory.makeString("indexKey");
        $str38$indexValue = SubLObjectFactory.makeString("indexValue");
        $sym39$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym40$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $sym41$SERIALIZE_DATABASE_MODEL_EXTERNAL = SubLObjectFactory.makeSymbol("SERIALIZE-DATABASE-MODEL-EXTERNAL");
        $sym42$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str43$US_ASCII = SubLObjectFactory.makeString("US-ASCII");
        $str44$databaseModel = SubLObjectFactory.makeString("databaseModel");
        $str45$dbFusion_dtd = SubLObjectFactory.makeString("dbFusion.dtd");
        $str46$elements = SubLObjectFactory.makeString("elements");
        $str47$element = SubLObjectFactory.makeString("element");
        $sym48$DATABASE_OUTPUT_SPEC_P = SubLObjectFactory.makeSymbol("DATABASE-OUTPUT-SPEC-P");
        $str49$databaseOutputSpec = SubLObjectFactory.makeString("databaseOutputSpec");
        $str50$specId = SubLObjectFactory.makeString("specId");
        $str51$recipe = SubLObjectFactory.makeString("recipe");
        $str52$model = SubLObjectFactory.makeString("model");
        $str53$semanticRecipe = SubLObjectFactory.makeString("semanticRecipe");
        $str54$index = SubLObjectFactory.makeString("index");
        $sym55$SEMANTICS_P = SubLObjectFactory.makeSymbol("SEMANTICS-P");
        $str56$semantics = SubLObjectFactory.makeString("semantics");
        $str57$database = SubLObjectFactory.makeString("database");
        $str58$tables = SubLObjectFactory.makeString("tables");
        $sym59$VALUE_SEMANTICS_P = SubLObjectFactory.makeSymbol("VALUE-SEMANTICS-P");
        $str60$annotatedValue = SubLObjectFactory.makeString("annotatedValue");
        $str61$databaseValue = SubLObjectFactory.makeString("databaseValue");
        $str62$cyclAnnotation = SubLObjectFactory.makeString("cyclAnnotation");
        $sym63$COLUMN_SEMANTICS_P = SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-P");
        $str64$column = SubLObjectFactory.makeString("column");
        $str65$columnName = SubLObjectFactory.makeString("columnName");
        $str66$columnTable = SubLObjectFactory.makeString("columnTable");
        $str67$columnValues = SubLObjectFactory.makeString("columnValues");
        $str68$columnType = SubLObjectFactory.makeString("columnType");
        $str69$columnSize = SubLObjectFactory.makeString("columnSize");
        $str70$noSizeRestriction = SubLObjectFactory.makeString("noSizeRestriction");
        $sym71$TABLE_SEMANTICS_P = SubLObjectFactory.makeSymbol("TABLE-SEMANTICS-P");
        $str72$table = SubLObjectFactory.makeString("table");
        $str73$tableId = SubLObjectFactory.makeString("tableId");
        $str74$tableName = SubLObjectFactory.makeString("tableName");
        $str75$tableSourceSemantics = SubLObjectFactory.makeString("tableSourceSemantics");
        $str76$tableSemantics = SubLObjectFactory.makeString("tableSemantics");
        $str77$tablePointsToTableIds = SubLObjectFactory.makeString("tablePointsToTableIds");
        $str78$tablePointedToByTableIds = SubLObjectFactory.makeString("tablePointedToByTableIds");
        $str79$tableCycL = SubLObjectFactory.makeString("tableCycL");
        $str80$tableColumns = SubLObjectFactory.makeString("tableColumns");
        $str81$tablePrimaryKeyColumns = SubLObjectFactory.makeString("tablePrimaryKeyColumns");
        $str82$tableColumnConstraints = SubLObjectFactory.makeString("tableColumnConstraints");
        $sym83$PRIMARY_KEY_CONSTRAINT_P = SubLObjectFactory.makeSymbol("PRIMARY-KEY-CONSTRAINT-P");
        $str84$primaryKey = SubLObjectFactory.makeString("primaryKey");
        $str85$keyName = SubLObjectFactory.makeString("keyName");
        $str86$keyColumn = SubLObjectFactory.makeString("keyColumn");
        $sym87$FOREIGN_KEY_CONSTRAINT_P = SubLObjectFactory.makeSymbol("FOREIGN-KEY-CONSTRAINT-P");
        $str88$foreignKey = SubLObjectFactory.makeString("foreignKey");
        $str89$foreignTable = SubLObjectFactory.makeString("foreignTable");
        $str90$foreignColumn = SubLObjectFactory.makeString("foreignColumn");
        $sym91$SQL_COMMAND_P = SubLObjectFactory.makeSymbol("SQL-COMMAND-P");
        $sym92$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $str93$object = SubLObjectFactory.makeString("object");
        $str94$sharedKey = SubLObjectFactory.makeString("sharedKey");
    }
}

/*

	Total time: 3718 ms
	
*/