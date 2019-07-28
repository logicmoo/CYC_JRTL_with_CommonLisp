package com.cyc.cycjava.cycl.sksi;


import com.cyc.cycjava.cycl.cycml;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sksi.db_model_serialization;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.sksi.db_model_serialization.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class db_model_serialization extends SubLTranslatedFile {
    public static final SubLFile me = new db_model_serialization();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.db_model_serialization";

    public static final String myFingerPrint = "bb53a035c42a61f0e50c6f77be8eda3f9f71c185eb28851ee0cf44d29cdb67dd";



    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("NAME"), list(makeSymbol("TYPE"), makeSymbol("OBJECT")), makeSymbol("COMMENT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$undocumented_serialization = makeString("undocumented serialization");

    public static final SubLSymbol $sym2$KEY_XML = makeUninternedSymbol("KEY.XML");

    public static final SubLSymbol $sym3$KEY = makeUninternedSymbol("KEY");

    public static final SubLSymbol $sym4$XML = makeUninternedSymbol("XML");

    public static final SubLSymbol $sym5$STREAM = makeUninternedSymbol("STREAM");









    public static final SubLSymbol $shared_xml_structure_map$ = makeSymbol("*SHARED-XML-STRUCTURE-MAP*");





    public static final SubLSymbol GENERATE_XML_KEY = makeSymbol("GENERATE-XML-KEY");

    public static final SubLList $list14 = list(list(makeSymbol("DICTIONARY-LENGTH"), makeSymbol("*SHARED-XML-STRUCTURE-MAP*")));







    public static final SubLSymbol $xml_stream$ = makeSymbol("*XML-STREAM*");

    public static final SubLList $list19 = list(list(makeSymbol("*XML-INDENTATION-LEVEL*"), ZERO_INTEGER));





    public static final SubLSymbol SERIALIZE_SHARED_KEY = makeSymbol("SERIALIZE-SHARED-KEY");

    public static final SubLList $list23 = list(list(makeSymbol("RET"), NIL));

    public static final SubLSymbol TABLE_MERGER_P = makeSymbol("TABLE-MERGER-P");

    public static final SubLString $$$tableMerger = makeString("tableMerger");



    private static final SubLString $$$sources = makeString("sources");

    private static final SubLString $$$target = makeString("target");

    private static final SubLString $$$columnCorrespondence = makeString("columnCorrespondence");

    private static final SubLString $$$added = makeString("added");

    private static final SubLString $$$dropped = makeString("dropped");

    private static final SubLString $$$sqlStartIndex = makeString("sqlStartIndex");

    private static final SubLString $$$sqlEndIndex = makeString("sqlEndIndex");

    private static final SubLSymbol COLUMN_MERGER_P = makeSymbol("COLUMN-MERGER-P");

    private static final SubLString $$$columnMerger = makeString("columnMerger");

    private static final SubLString $$$indexEntry = makeString("indexEntry");

    private static final SubLString $$$indexKey = makeString("indexKey");

    private static final SubLString $$$indexValue = makeString("indexValue");





    private static final SubLSymbol SERIALIZE_DATABASE_MODEL_EXTERNAL = makeSymbol("SERIALIZE-DATABASE-MODEL-EXTERNAL");



    private static final SubLString $str43$US_ASCII = makeString("US-ASCII");

    private static final SubLString $$$databaseModel = makeString("databaseModel");

    private static final SubLString $str45$dbFusion_dtd = makeString("dbFusion.dtd");

    private static final SubLString $$$elements = makeString("elements");

    private static final SubLString $$$element = makeString("element");

    private static final SubLSymbol DATABASE_OUTPUT_SPEC_P = makeSymbol("DATABASE-OUTPUT-SPEC-P");

    private static final SubLString $$$databaseOutputSpec = makeString("databaseOutputSpec");

    private static final SubLString $$$specId = makeString("specId");

    private static final SubLString $$$recipe = makeString("recipe");

    private static final SubLString $$$model = makeString("model");

    private static final SubLString $$$semanticRecipe = makeString("semanticRecipe");

    private static final SubLString $$$index = makeString("index");

    private static final SubLSymbol SEMANTICS_P = makeSymbol("SEMANTICS-P");

    private static final SubLString $$$semantics = makeString("semantics");

    private static final SubLString $$$database = makeString("database");

    private static final SubLString $$$tables = makeString("tables");

    private static final SubLSymbol VALUE_SEMANTICS_P = makeSymbol("VALUE-SEMANTICS-P");

    private static final SubLString $$$annotatedValue = makeString("annotatedValue");

    private static final SubLString $$$databaseValue = makeString("databaseValue");

    private static final SubLString $$$cyclAnnotation = makeString("cyclAnnotation");

    private static final SubLSymbol COLUMN_SEMANTICS_P = makeSymbol("COLUMN-SEMANTICS-P");

    private static final SubLString $$$column = makeString("column");

    private static final SubLString $$$columnName = makeString("columnName");

    private static final SubLString $$$columnTable = makeString("columnTable");

    private static final SubLString $$$columnValues = makeString("columnValues");

    private static final SubLString $$$columnType = makeString("columnType");

    private static final SubLString $$$columnSize = makeString("columnSize");

    private static final SubLString $$$noSizeRestriction = makeString("noSizeRestriction");

    private static final SubLSymbol TABLE_SEMANTICS_P = makeSymbol("TABLE-SEMANTICS-P");

    private static final SubLString $$$table = makeString("table");

    private static final SubLString $$$tableId = makeString("tableId");

    private static final SubLString $$$tableName = makeString("tableName");

    private static final SubLString $$$tableSourceSemantics = makeString("tableSourceSemantics");

    private static final SubLString $$$tableSemantics = makeString("tableSemantics");

    private static final SubLString $$$tablePointsToTableIds = makeString("tablePointsToTableIds");

    private static final SubLString $$$tablePointedToByTableIds = makeString("tablePointedToByTableIds");

    private static final SubLString $$$tableCycL = makeString("tableCycL");

    private static final SubLString $$$tableColumns = makeString("tableColumns");

    private static final SubLString $$$tablePrimaryKeyColumns = makeString("tablePrimaryKeyColumns");

    private static final SubLString $$$tableColumnConstraints = makeString("tableColumnConstraints");

    private static final SubLSymbol PRIMARY_KEY_CONSTRAINT_P = makeSymbol("PRIMARY-KEY-CONSTRAINT-P");

    private static final SubLString $$$primaryKey = makeString("primaryKey");

    private static final SubLString $$$keyName = makeString("keyName");

    private static final SubLString $$$keyColumn = makeString("keyColumn");

    private static final SubLSymbol FOREIGN_KEY_CONSTRAINT_P = makeSymbol("FOREIGN-KEY-CONSTRAINT-P");

    private static final SubLString $$$foreignKey = makeString("foreignKey");

    private static final SubLString $$$foreignTable = makeString("foreignTable");

    private static final SubLString $$$foreignColumn = makeString("foreignColumn");

    private static final SubLSymbol SQL_COMMAND_P = makeSymbol("SQL-COMMAND-P");



    private static final SubLString $$$object = makeString("object");

    private static final SubLString $$$sharedKey = makeString("sharedKey");

    public static SubLObject define_shared_serialization(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = NIL;
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject comment = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            comment = current.first();
            SubLObject body;
            current = body = current.rest();
            if (NIL == body) {
                body = list(comment);
                comment = $$$undocumented_serialization;
            }
            final SubLObject keyXxml = $sym2$KEY_XML;
            final SubLObject key = $sym3$KEY;
            final SubLObject xml = $sym4$XML;
            final SubLObject stream = $sym5$STREAM;
            return list(DEFINE_PROTECTED, name, list(v_object), comment, list(CHECK_TYPE, v_object, type), listS(CLET, list(list(keyXxml, list(DICTIONARY_LOOKUP, $shared_xml_structure_map$, v_object)), key, xml), list(PUNLESS, keyXxml, list(CSETQ, key, listS(GENERATE_XML_KEY, v_object, $list14)), list(CSETQ, keyXxml, list(CONS, key, xml)), list(DICTIONARY_ENTER, $shared_xml_structure_map$, v_object, keyXxml), list(CWITH_OUTPUT_TO_STRING, list(stream, xml), listS(CLET, bq_cons(list($xml_stream$, stream), $list19), append(body, NIL))), list(RPLACD, keyXxml, xml)), list(CSETQ, key, list(CAR, keyXxml)), list(SERIALIZE_SHARED_KEY, key), $list23));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject define_serialization(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = NIL;
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject comment = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            comment = current.first();
            SubLObject body;
            current = body = current.rest();
            if (NIL == body) {
                body = list(comment);
                comment = $$$undocumented_serialization;
            }
            return listS(DEFINE_PROTECTED, name, list(v_object), comment, list(CHECK_TYPE, v_object, type), append(body, $list23));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject serialize_table_merger(final SubLObject merger) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantic_etl_bus.table_merger_p(merger) : "semantic_etl_bus.table_merger_p(merger) " + "CommonSymbols.NIL != semantic_etl_bus.table_merger_p(merger) " + merger;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$tableMerger, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$sources, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.table_merger_sources(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$3, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$sources);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$target, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_table(semantic_etl_bus.table_merger_target(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$target);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$columnCorrespondence, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.table_merger_column_correspondence_list(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$5, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$columnCorrespondence);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$added, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.table_merger_added(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$added);
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$dropped, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.table_merger_dropped(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$14, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values5 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$dropped);
                            restoreValuesFromVector(_values5);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$sqlStartIndex, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_number(semantic_etl_bus.table_merger_sql_start_index(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values6 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$sqlStartIndex);
                            restoreValuesFromVector(_values6);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$sqlEndIndex, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_number(semantic_etl_bus.table_merger_sql_end_index(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values7 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$sqlEndIndex);
                            restoreValuesFromVector(_values7);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values8 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$tableMerger);
                restoreValuesFromVector(_values8);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject serialize_column_merger(final SubLObject merger) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantic_etl_bus.column_merger_p(merger) : "semantic_etl_bus.column_merger_p(merger) " + "CommonSymbols.NIL != semantic_etl_bus.column_merger_p(merger) " + merger;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$columnMerger, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$sources, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.column_merger_sources(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$32, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$sources);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$34 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$target, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$35 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_column(semantic_etl_bus.column_merger_target(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$35, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$33, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$34, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$target);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$37 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$columnCorrespondence, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$38 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.column_merger_column_correspondence_list(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$38, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$34, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$37, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$columnCorrespondence);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$40 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$added, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$41 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.column_merger_added(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$41, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$35, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$40, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$added);
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$43 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$dropped, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$44 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.column_merger_dropped(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$44, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$36, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$43, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values5 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$dropped);
                            restoreValuesFromVector(_values5);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$sqlStartIndex, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_number(semantic_etl_bus.column_merger_sql_start_index(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$37, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values6 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$sqlStartIndex);
                            restoreValuesFromVector(_values6);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$49 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$sqlEndIndex, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$50 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_number(semantic_etl_bus.column_merger_sql_end_index(merger));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$50, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$38, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$49, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values7 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$sqlEndIndex);
                            restoreValuesFromVector(_values7);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values8 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$columnMerger);
                restoreValuesFromVector(_values8);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject serialize_shared_structure_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($shared_xml_structure_map$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject keyXxml = thread.secondMultipleValue();
            thread.resetMultipleValues();
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$indexEntry, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$60 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$61 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$indexKey, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$61 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_string(keyXxml.first());
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$61, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$61, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$60, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$indexKey);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$63 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$62 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$indexValue, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$64 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_write_string_indented(keyXxml.rest(), UNPROVIDED, UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$64, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$62, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$63, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$indexValue);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$indexEntry);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static SubLObject serialize_string(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        cycml.cycml_serialize_string(string, UNPROVIDED);
        return NIL;
    }

    public static SubLObject serialize_number(final SubLObject number) {
        assert NIL != numberp(number) : "Types.numberp(number) " + "CommonSymbols.NIL != Types.numberp(number) " + number;
        cycml.cycml_serialize_number(number, UNPROVIDED);
        return NIL;
    }

    public static SubLObject serialize_database_model_external(final SubLObject output_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_amount$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_amount$.bind(ZERO_INTEGER, thread);
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0_$68 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    serialize_database_model(output_specs);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0_$68, thread);
                }
                result = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                }
            }
        } finally {
            xml_utilities.$xml_indentation_amount$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject serialize_database_model(final SubLObject output_specs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(output_specs) : "Types.listp(output_specs) " + "CommonSymbols.NIL != Types.listp(output_specs) " + output_specs;
        xml_utilities.xml_header(xml_utilities.xml_version(), $str43$US_ASCII, NIL);
        xml_utilities.generate_xml_header_entry_for_dtd($$$databaseModel, $str45$dbFusion_dtd, xml_vars.$xml_stream$.getDynamicValue(thread));
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$databaseModel, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$70 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    serialize_list(output_specs);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$70, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$databaseModel);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return list_utilities.sublisp_boolean(output_specs);
    }

    public static SubLObject serialize_list(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$elements, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$71 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject cdolist_list_var = list;
                    SubLObject element = NIL;
                    element = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        try {
                            final SubLObject _prev_bind_0_$72 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$73 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$element, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$73 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_object(element);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$73, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$73, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$72, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$element);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        element = cdolist_list_var.first();
                    } 
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$71, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$elements);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject serialize_database_output_spec(final SubLObject output_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantic_etl_bus.database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        final SubLObject _prev_bind_0 = $shared_xml_structure_map$.currentBinding(thread);
        try {
            $shared_xml_structure_map$.bind(dictionary.new_dictionary(EQ, UNPROVIDED), thread);
            try {
                final SubLObject _prev_bind_0_$76 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$databaseOutputSpec, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$77 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$78 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$79 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$specId, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$79 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_number(semantic_etl_bus.db_output_spec_id(output_spec));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$79, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$79, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$78, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$specId);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$81 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$80 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$recipe, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$82 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_list(remove(semantic_etl_bus.$recipe_marker$.getDynamicValue(thread), semantic_etl_bus.db_output_spec_recipe(output_spec), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$82, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$80, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$81, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$recipe);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$84 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$81 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$model, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$85 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_semantics(semantic_etl_bus.db_output_spec_semantics(output_spec));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$85, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$81, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$84, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$model);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                            }
                        }
                        if (NIL != semantic_etl_bus.table_merger_p(last(semantic_etl_bus.db_output_spec_semantic_recipe(output_spec), UNPROVIDED).first())) {
                            try {
                                final SubLObject _prev_bind_0_$87 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$82 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$semanticRecipe, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$88 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        serialize_list(last(semantic_etl_bus.db_output_spec_semantic_recipe(output_spec), UNPROVIDED));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$88, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$82, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$87, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$89 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$semanticRecipe);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                                }
                            }
                        } else {
                            try {
                                final SubLObject _prev_bind_0_$90 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$83 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$semanticRecipe, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$91 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        serialize_list(NIL);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$91, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$83, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$90, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values5 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$semanticRecipe);
                                    restoreValuesFromVector(_values5);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                                }
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$93 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$84 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$index, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$94 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_shared_structure_index();
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$94, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$84, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$93, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values6 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$index);
                                restoreValuesFromVector(_values6);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$77, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$76, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$96 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values7 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$databaseOutputSpec);
                    restoreValuesFromVector(_values7);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                }
            }
        } finally {
            $shared_xml_structure_map$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject serialize_semantics(final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantic_etl_bus.semantics_p(semantics) : "semantic_etl_bus.semantics_p(semantics) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics) " + semantics;
        SubLObject keyXxml = dictionary.dictionary_lookup($shared_xml_structure_map$.getDynamicValue(thread), semantics, UNPROVIDED);
        SubLObject key = NIL;
        SubLObject xml = NIL;
        if (NIL == keyXxml) {
            key = generate_xml_key(semantics, dictionary.dictionary_length($shared_xml_structure_map$.getDynamicValue(thread)));
            keyXxml = cons(key, xml);
            dictionary.dictionary_enter($shared_xml_structure_map$.getDynamicValue(thread), semantics, keyXxml);
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    xml_utilities.$xml_indentation_level$.bind(ZERO_INTEGER, thread);
                    try {
                        final SubLObject _prev_bind_0_$103 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$104 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$semantics, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$104 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$105 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$105 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$database, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$106 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_string(semantic_etl_bus.access_path_pretty_string(semantic_etl_bus.semantics_access_path(semantics)));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$106, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$105, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$105, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$107 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$database);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$108 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$106 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tables, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$109 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.semantics_table_semantics_list(semantics));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$109, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$106, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$108, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$110 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tables);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                    }
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$104, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$104, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$103, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$111 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$semantics);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                        }
                    }
                } finally {
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_2, thread);
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                xml = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            rplacd(keyXxml, xml);
        }
        key = keyXxml.first();
        serialize_shared_key(key);
        return NIL;
    }

    public static SubLObject serialize_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantic_etl_bus.value_semantics_p(value) : "semantic_etl_bus.value_semantics_p(value) " + "CommonSymbols.NIL != semantic_etl_bus.value_semantics_p(value) " + value;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$annotatedValue, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$117 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$databaseValue, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_object(semantic_etl_bus.value_semantics_value(value));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$117, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$databaseValue);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$119 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$118 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$cyclAnnotation, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$120 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_list(semantic_etl_bus.value_semantics_value_parses(value));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$120, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$118, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$119, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$121 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$cyclAnnotation);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$annotatedValue);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject serialize_column(final SubLObject column) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantic_etl_bus.column_semantics_p(column) : "semantic_etl_bus.column_semantics_p(column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column) " + column;
        SubLObject keyXxml = dictionary.dictionary_lookup($shared_xml_structure_map$.getDynamicValue(thread), column, UNPROVIDED);
        SubLObject key = NIL;
        SubLObject xml = NIL;
        if (NIL == keyXxml) {
            key = generate_xml_key(column, dictionary.dictionary_length($shared_xml_structure_map$.getDynamicValue(thread)));
            keyXxml = cons(key, xml);
            dictionary.dictionary_enter($shared_xml_structure_map$.getDynamicValue(thread), column, keyXxml);
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    xml_utilities.$xml_indentation_level$.bind(ZERO_INTEGER, thread);
                    try {
                        final SubLObject _prev_bind_0_$124 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$125 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$column, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$125 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$126 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$126 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$columnName, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$127 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_string(semantic_etl_bus.column_semantics_column_name(column));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$127, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$126, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$126, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$columnName);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$129 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$127 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$columnTable, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$130 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_table(semantic_etl_bus.column_semantics_table_semantics(column));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$130, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$127, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$129, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$columnTable);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$132 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$128 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$columnValues, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$133 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_list(NIL);
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$133, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$128, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$132, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$134 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$columnValues);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$134, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$135 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$129 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$columnType, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$136 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_string(semantic_etl_bus.column_semantics_column_type(column));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$136, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$129, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$135, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$137 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$columnType);
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$138 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$130 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$columnSize, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$139 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            if (NIL == semantic_etl_bus.column_semantics_column_size(column)) {
                                                final SubLObject _prev_bind_0_$140 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$131 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$noSizeRestriction, NIL, T, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$141 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$141, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$131, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$140, thread);
                                                }
                                            } else {
                                                serialize_number(semantic_etl_bus.column_semantics_column_size(column));
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$139, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$130, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$138, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$142 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$columnSize);
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                                    }
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$125, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$125, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$124, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$143 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values6 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$column);
                            restoreValuesFromVector(_values6);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
                        }
                    }
                } finally {
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_2, thread);
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                xml = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values7 = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values7);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            rplacd(keyXxml, xml);
        }
        key = keyXxml.first();
        serialize_shared_key(key);
        return NIL;
    }

    public static SubLObject serialize_table(final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantic_etl_bus.table_semantics_p(table) : "semantic_etl_bus.table_semantics_p(table) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table) " + table;
        SubLObject keyXxml = dictionary.dictionary_lookup($shared_xml_structure_map$.getDynamicValue(thread), table, UNPROVIDED);
        SubLObject key = NIL;
        SubLObject xml = NIL;
        if (NIL == keyXxml) {
            key = generate_xml_key(table, dictionary.dictionary_length($shared_xml_structure_map$.getDynamicValue(thread)));
            keyXxml = cons(key, xml);
            dictionary.dictionary_enter($shared_xml_structure_map$.getDynamicValue(thread), table, keyXxml);
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    xml_utilities.$xml_indentation_level$.bind(ZERO_INTEGER, thread);
                    try {
                        final SubLObject _prev_bind_0_$151 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$152 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$table, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$152 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$153 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$153 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tableId, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$154 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_number(semantic_etl_bus.table_semantics_table_id(table));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$154, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$153, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$153, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$155 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tableId);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$155, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$156 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$154 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tableName, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$157 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_string(semantic_etl_bus.table_semantics_table_name(table));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$157, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$154, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$156, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$158 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tableName);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$158, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$159 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$155 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tableSourceSemantics, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$160 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            if (NIL != semantic_etl_bus.table_semantics_source_semantics(table)) {
                                                serialize_semantics(semantic_etl_bus.table_semantics_source_semantics(table));
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$160, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$155, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$159, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$161 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tableSourceSemantics);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$161, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$162 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$156 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tableSemantics, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$163 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_semantics(semantic_etl_bus.table_semantics_semantics(table));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$163, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$156, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$162, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$164 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tableSemantics);
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$164, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$165 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$157 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tablePointsToTableIds, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$166 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_points_to_table_ids(table));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$166, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$157, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$165, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$167 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tablePointsToTableIds);
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$167, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$168 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$158 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tablePointedToByTableIds, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$169 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_pointed_to_by_table_ids(table));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$169, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$158, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$168, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$170 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values6 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tablePointedToByTableIds);
                                        restoreValuesFromVector(_values6);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$170, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$171 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$159 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tableCycL, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$172 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_table_parses(table));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$172, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$159, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$171, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$173 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values7 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tableCycL);
                                        restoreValuesFromVector(_values7);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$173, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$174 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$160 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tableColumns, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$175 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_column_semantics_list(table));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$175, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$160, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$174, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$176 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values8 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tableColumns);
                                        restoreValuesFromVector(_values8);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$176, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$177 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$161 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tablePrimaryKeyColumns, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$178 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_primary_key_columns(table));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$178, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$161, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$177, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$179 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values9 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tablePrimaryKeyColumns);
                                        restoreValuesFromVector(_values9);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                                    }
                                }
                                try {
                                    final SubLObject _prev_bind_0_$180 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$162 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$tableColumnConstraints, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$181 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            serialize_list(semantic_etl_bus.table_semantics_column_constraints(table));
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$181, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$162, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$180, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$182 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values10 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$tableColumnConstraints);
                                        restoreValuesFromVector(_values10);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$182, thread);
                                    }
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$152, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$152, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$151, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$183 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values11 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$table);
                            restoreValuesFromVector(_values11);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$183, thread);
                        }
                    }
                } finally {
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_2, thread);
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                xml = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values12 = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values12);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            rplacd(keyXxml, xml);
        }
        key = keyXxml.first();
        serialize_shared_key(key);
        return NIL;
    }

    public static SubLObject serialize_primary_key_constraint(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantic_etl_bus.primary_key_constraint_p(constraint) : "semantic_etl_bus.primary_key_constraint_p(constraint) " + "CommonSymbols.NIL != semantic_etl_bus.primary_key_constraint_p(constraint) " + constraint;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$primaryKey, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$195 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$196 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$197 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$keyName, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$197 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_string(semantic_etl_bus.primary_key_constraint_constraint_name(constraint));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$197, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$197, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$196, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$198 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$keyName);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$198, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$199 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$198 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$keyColumn, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$200 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_column(semantic_etl_bus.primary_key_constraint_constrained_column(constraint));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$200, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$198, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$199, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$201 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$keyColumn);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$201, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$195, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$primaryKey);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject serialize_foreign_key_constraint(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantic_etl_bus.foreign_key_constraint_p(constraint) : "semantic_etl_bus.foreign_key_constraint_p(constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(constraint) " + constraint;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$foreignKey, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$204 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$205 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$206 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$keyName, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$206 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_string(semantic_etl_bus.foreign_key_constraint_constraint_name(constraint));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$206, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$206, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$205, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$207 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$keyName);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$207, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$208 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$207 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$keyColumn, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$209 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_column(semantic_etl_bus.foreign_key_constraint_constrained_column(constraint));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$209, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$207, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$208, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$210 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$keyColumn);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$210, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$211 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$208 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$foreignTable, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$212 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_table(semantic_etl_bus.foreign_key_constraint_constraining_table(constraint));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$212, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$208, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$211, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$213 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$foreignTable);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$214 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$209 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$foreignColumn, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$215 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                serialize_column(semantic_etl_bus.foreign_key_constraint_constraining_column(constraint));
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$215, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$209, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$214, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$216 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$foreignColumn);
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$216, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$204, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values5 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$foreignKey);
                restoreValuesFromVector(_values5);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject serialize_sql_command(final SubLObject command) {
        assert NIL != semantic_etl_bus.sql_command_p(command) : "semantic_etl_bus.sql_command_p(command) " + "CommonSymbols.NIL != semantic_etl_bus.sql_command_p(command) " + command;
        serialize_string(princ_to_string(command));
        return NIL;
    }

    public static SubLObject serialize_object(final SubLObject v_object) {
        assert NIL != sublisp_true(v_object) : "Types.sublisp_true(v_object) " + "CommonSymbols.NIL != Types.sublisp_true(v_object) " + v_object;
        if (v_object.isNumber()) {
            serialize_number(v_object);
        } else
            if (v_object.isString()) {
                serialize_string(v_object);
            } else
                if (NIL != unicode_strings.unicode_string_p(v_object)) {
                    serialize_string(unicode_strings.unicode_string_to_subl_string(v_object));
                } else
                    if (NIL != cycml.cycml_nat_p(v_object)) {
                        cycml.cycml_serialize_term(v_object);
                    } else
                        if (v_object.isList()) {
                            serialize_list(v_object);
                        } else
                            if (NIL != semantic_etl_bus.value_semantics_p(v_object)) {
                                serialize_value(v_object);
                            } else
                                if (NIL != semantic_etl_bus.column_semantics_p(v_object)) {
                                    serialize_column(v_object);
                                } else
                                    if (NIL != semantic_etl_bus.table_semantics_p(v_object)) {
                                        serialize_table(v_object);
                                    } else
                                        if (NIL != semantic_etl_bus.primary_key_constraint_p(v_object)) {
                                            serialize_primary_key_constraint(v_object);
                                        } else
                                            if (NIL != semantic_etl_bus.foreign_key_constraint_p(v_object)) {
                                                serialize_foreign_key_constraint(v_object);
                                            } else
                                                if (NIL != semantic_etl_bus.semantics_p(v_object)) {
                                                    serialize_semantics(v_object);
                                                } else
                                                    if (NIL != semantic_etl_bus.sql_command_p(v_object)) {
                                                        serialize_sql_command(v_object);
                                                    } else
                                                        if (NIL != semantic_etl_bus.database_output_spec_p(v_object)) {
                                                            serialize_database_output_spec(v_object);
                                                        } else
                                                            if (NIL != semantic_etl_bus.table_merger_p(v_object)) {
                                                                serialize_table_merger(v_object);
                                                            } else
                                                                if (NIL != semantic_etl_bus.column_merger_p(v_object)) {
                                                                    serialize_column_merger(v_object);
                                                                } else {
                                                                    cycml.cycml_serialize_term(v_object);
                                                                }














        return NIL;
    }

    public static SubLObject generate_xml_key(final SubLObject v_object, final SubLObject next_number) {
        SubLObject prefix = NIL;
        if (NIL != semantic_etl_bus.column_semantics_p(v_object)) {
            prefix = $$$column;
        } else
            if (NIL != semantic_etl_bus.table_semantics_p(v_object)) {
                prefix = $$$table;
            } else
                if (NIL != semantic_etl_bus.semantics_p(v_object)) {
                    prefix = $$$semantics;
                } else {
                    prefix = $$$object;
                }


        return cconcatenate(prefix, princ_to_string(next_number));
    }

    public static SubLObject serialize_shared_key(final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(key) : "Types.stringp(key) " + "CommonSymbols.NIL != Types.stringp(key) " + key;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$sharedKey, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$221 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    serialize_string(key);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$221, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$sharedKey);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject declare_db_model_serialization_file() {
        declareMacro(me, "define_shared_serialization", "DEFINE-SHARED-SERIALIZATION");
        declareMacro(me, "define_serialization", "DEFINE-SERIALIZATION");
        declareFunction(me, "serialize_table_merger", "SERIALIZE-TABLE-MERGER", 1, 0, false);
        declareFunction(me, "serialize_column_merger", "SERIALIZE-COLUMN-MERGER", 1, 0, false);
        declareFunction(me, "serialize_shared_structure_index", "SERIALIZE-SHARED-STRUCTURE-INDEX", 0, 0, false);
        declareFunction(me, "serialize_string", "SERIALIZE-STRING", 1, 0, false);
        declareFunction(me, "serialize_number", "SERIALIZE-NUMBER", 1, 0, false);
        declareFunction(me, "serialize_database_model_external", "SERIALIZE-DATABASE-MODEL-EXTERNAL", 1, 0, false);
        declareFunction(me, "serialize_database_model", "SERIALIZE-DATABASE-MODEL", 1, 0, false);
        declareFunction(me, "serialize_list", "SERIALIZE-LIST", 1, 0, false);
        declareFunction(me, "serialize_database_output_spec", "SERIALIZE-DATABASE-OUTPUT-SPEC", 1, 0, false);
        declareFunction(me, "serialize_semantics", "SERIALIZE-SEMANTICS", 1, 0, false);
        declareFunction(me, "serialize_value", "SERIALIZE-VALUE", 1, 0, false);
        declareFunction(me, "serialize_column", "SERIALIZE-COLUMN", 1, 0, false);
        declareFunction(me, "serialize_table", "SERIALIZE-TABLE", 1, 0, false);
        declareFunction(me, "serialize_primary_key_constraint", "SERIALIZE-PRIMARY-KEY-CONSTRAINT", 1, 0, false);
        declareFunction(me, "serialize_foreign_key_constraint", "SERIALIZE-FOREIGN-KEY-CONSTRAINT", 1, 0, false);
        declareFunction(me, "serialize_sql_command", "SERIALIZE-SQL-COMMAND", 1, 0, false);
        declareFunction(me, "serialize_object", "SERIALIZE-OBJECT", 1, 0, false);
        declareFunction(me, "generate_xml_key", "GENERATE-XML-KEY", 2, 0, false);
        declareFunction(me, "serialize_shared_key", "SERIALIZE-SHARED-KEY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_db_model_serialization_file() {
        defparameter("*SHARED-XML-STRUCTURE-MAP*", dictionary.new_dictionary(EQ, UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_db_model_serialization_file() {
        register_external_symbol(SERIALIZE_DATABASE_MODEL_EXTERNAL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_db_model_serialization_file();
    }

    @Override
    public void initializeVariables() {
        init_db_model_serialization_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_db_model_serialization_file();
    }

    static {

































































































    }
}

/**
 * Total time: 3718 ms
 */
