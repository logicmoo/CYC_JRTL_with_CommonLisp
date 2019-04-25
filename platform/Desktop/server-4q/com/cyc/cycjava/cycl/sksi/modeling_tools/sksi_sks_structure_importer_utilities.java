package com.cyc.cycjava.cycl.sksi.modeling_tools;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_structure_importer_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities";
    public static final String myFingerPrint = "1e45985608f359f4d1d7e54f87ac0c2bd941f0c707e85c2cd73a0f3ba93dc37b";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 4355L)
    private static SubLSymbol $sks_required_fields_database$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 4831L)
    public static SubLSymbol $sks_inclusive_catalog_pattern$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 4932L)
    public static SubLSymbol $sks_inclusive_schema_pattern$;
    private static final SubLObject $const0$isa;
    private static final SubLObject $const1$PhysicalSchema;
    private static final SubLObject $const2$UniversalVocabularyMt;
    private static final SubLObject $const3$physicalSchemaSourceMap;
    private static final SubLObject $const4$comment;
    private static final SubLString $str5$A_physical_schema_for_;
    private static final SubLString $str6$_;
    private static final SubLString $str7$_KS;
    private static final SubLString $str8$_PS;
    private static final SubLObject $const9$PhysicalFieldFn;
    private static final SubLSymbol $sym10$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const11$EverythingPSC;
    private static final SubLObject $const12$subKS_Direct;
    private static final SubLObject $const13$physicalFields;
    private static final SubLObject $const14$physicalFieldIndexicals;
    private static final SubLSymbol $sym15$SKSI_SKS_GET_ALL_PHYSICAL_SCHEMA_TABLE_NAMES;
    private static final SubLObject $const16$schemaName_SKS;
    private static final SubLObject $const17$schemaNameSchema_SKS;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$_SKS_INCLUSIVE_CATALOG_PATTERN_;
    private static final SubLSymbol $sym20$_SKS_INCLUSIVE_SCHEMA_PATTERN_;
    private static final SubLString $str21$_;
    private static final SubLSymbol $sym22$IGNORE_TABLE_SCHEMA_SPECIFICATION_P;
    private static final SubLString $str23$_A_does_not_have_a_corresponding_;
    private static final SubLObject $const24$definingMt;
    private static final SubLString $str25$_A_is_missing__A_data;
    private static final SubLSymbol $sym26$SKS_GATHER_PHYSICAL_DATABASE_TABLE_NAMES;
    private static final SubLString $str27$Problem_connecting_to_sks__A__cou;
    private static final SubLString $str28$Problem_opening_connection_to_sks;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$TABLE_NAME;
    private static final SubLSymbol $kw31$TABLE_SCHEM;
    private static final SubLSymbol $sym32$SKS_GATHER_ASSERTED_TABLE_META_DATA_FOR_TABLE;
    private static final SubLSymbol $sym33$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym34$_PS;
    private static final SubLObject $const35$and;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLObject $const38$physicalSchemaFieldWithName;
    private static final SubLSymbol $kw39$GAF;
    private static final SubLObject $const40$primaryKey;
    private static final SubLObject $const41$nonNullFields;
    private static final SubLSymbol $sym42$_EXIT;
    private static final SubLObject $const43$fieldDataType;
    private static final SubLString $str44$unknown;
    private static final SubLList $list45;
    private static final SubLString $str46$date_13_;
    private static final SubLObject $const47$DecimalRealNumberOfMaximumPrecisi;
    private static final SubLString $str48$numeric_;
    private static final SubLString $str49$_;
    private static final SubLObject $const50$StringOfMaximumLengthFn;
    private static final SubLString $str51$varchar_;
    private static final SubLList $list52;
    private static final SubLString $str53$int4_10_;
    private static final SubLObject $const54$defaultFieldValue;
    private static final SubLString $str55$_default_;
    private static final SubLSymbol $sym56$CLUSTER_PHYSICAL_DATABASE_TABLE_INFORMATION_BY_SCHEMATA;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$STRING_;
    private static final SubLSymbol $sym59$FIRST;
    private static final SubLSymbol $sym60$SKS_PHYSICAL_STRUCTURE_DECODE_DATABASE_TABLE;
    private static final SubLString $str61$select_count____from_;
    private static final SubLSymbol $sym62$NON_EMPTY_STRING_;
    private static final SubLSymbol $sym63$SKS_P;
    private static final SubLSymbol $sym64$HLMT_P;
    private static final SubLSymbol $sym65$STRINGP;
    private static final SubLSymbol $sym66$NUMBERP;
    private static final SubLString $str67$Couldn_t_find___sksPhysicalSchema;
    private static final SubLObject $const68$Database_Physical;
    private static final SubLString $str69$_LS;
    private static final SubLObject $const70$Individual;
    private static final SubLObject $const71$ObjectDefiningSchema;
    private static final SubLObject $const72$LogicalSchema;
    private static final SubLObject $const73$logicalPhysicalSchemaMap;
    private static final SubLString $str74$A_logical_schema_corresponding_to;
    private static final SubLString $str75$_physical_schema_;
    private static final SubLObject $const76$structuredKnowledgeSourceName;
    private static final SubLString $str77$;
    private static final SubLSymbol $kw78$COLUMN_NAME;
    private static final SubLObject $const79$enumerableSchema;
    private static final SubLObject $const80$schemaFieldNameList;
    private static final SubLSymbol $sym81$INTEGERP;
    private static final SubLSymbol $kw82$NULL;
    private static final SubLObject $const83$JDBCDatatypeDescribedByFn;
    private static final SubLSymbol $sym84$_WHAT;
    private static final SubLObject $const85$rewriteOf;
    private static final SubLObject $const86$JDBCDataMt;
    private static final SubLSymbol $kw87$INFERENCE_MODE;
    private static final SubLSymbol $kw88$SHALLOW;
    private static final SubLSymbol $kw89$NEW_TERMS_ALLOWED_;
    private static final SubLString $str90$No_better_type_found_for__A__usin;
    private static final SubLString $str91$Also__failed_to_reify__A_;
    private static final SubLSymbol $kw92$IS_NULLABLE;
    private static final SubLString $str93$NO;
    private static final SubLObject $const94$nonNullFieldList;
    private static final SubLSymbol $kw95$DATA_TYPE;
    private static final SubLSymbol $kw96$TYPE_NAME;
    private static final SubLSymbol $kw97$COLUMN_SIZE;
    private static final SubLSymbol $kw98$DECIMAL_DIGITS;
    private static final SubLSymbol $kw99$COLUMN_DEF;
    private static final SubLObject $const100$IntegerComputerNumber;
    private static final SubLObject $const101$DoubleFloatObject;
    private static final SubLSymbol $kw102$KEY_SEQ;
    private static final SubLSymbol $sym103$_;
    private static final SubLString $str104$physical_field_in__A_named__A_not;
    private static final SubLSymbol $kw105$FK_NAME;
    private static final SubLObject $const106$foreignKeyMap;
    private static final SubLSymbol $kw107$UPDATE_RULE;
    private static final SubLSymbol $kw108$DELETE_RULE;
    private static final SubLSymbol $kw109$PKCOLUMN_NAME;
    private static final SubLSymbol $kw110$FKTABLE_NAME;
    private static final SubLSymbol $kw111$FKCOLUMN_NAME;
    private static final SubLObject $const112$foreignKeyMap_Cascade;
    private static final SubLObject $const113$foreignKeyMap_Restrict;
    private static final SubLString $str114$physical_field_in__A_table__A_nam;
    private static final SubLSymbol $kw115$PKTABLE_NAME;
    private static final SubLObject $const116$BTree_DataStructure;
    private static final SubLObject $const117$HashTable_DataStructure;
    private static final SubLSymbol $kw118$INDEX_NAME;
    private static final SubLSymbol $kw119$ORDINAL_POSITION;
    private static final SubLSymbol $sym120$OBJECT_STRING__;
    private static final SubLSymbol $kw121$NON_UNIQUE;
    private static final SubLSymbol $kw122$TYPE;
    private static final SubLString $str123$true;
    private static final SubLString $str124$KS;
    private static final SubLString $str125$_TheIndex;
    private static final SubLObject $const126$uniqueFieldList;
    private static final SubLObject $const127$IndexDataStructure;
    private static final SubLObject $const128$schemaFieldsIndex;
    private static final SubLObject $const129$indexName;
    private static final SubLObject $const130$indexType;
    private static final SubLSymbol $kw131$TRUE;
    private static final SubLObject $const132$StructuredKnowledgeSource;
    private static final SubLObject $const133$StructuredKnowledgeSource_Atomic;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 782L)
    public static SubLObject sks_physical_structure_decode(final SubLObject sks) {
        return sks_physical_structure_decode_database(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 1163L)
    public static SubLObject sks_initial_ke_validate(final SubLObject sks) {
        return sks_initial_ke_validate_database(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 1258L)
    public static SubLObject sks_create_and_add_raw_ls(final SubLObject sks) {
        return sks_create_and_add_raw_ls_database(sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 1359L)
    public static SubLObject sks_ps_add_keys(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        return sks_ps_add_keys_database(sks, physical_schemabase_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 1484L)
    public static SubLObject sks_ps_add_pf_properties(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        return sks_ps_add_pf_properties_database(sks, physical_schemabase_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 1627L)
    public static SubLObject sks_find_or_create_ps(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        final SubLObject ps_name = sks_make_physical_schema_name(sks);
        final SubLObject ps = sksi_kb_accessors.sksi_find_or_create(ps_name);
        if (sksi_sks_structure_importer_utilities.NIL != ps) {
            sksi_kb_accessors.sksi_constant_assert_inherited_kb_subset_isas(ps, sks);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const0$isa, ps, sksi_sks_structure_importer_utilities.$const1$PhysicalSchema), sksi_sks_structure_importer_utilities.$const2$UniversalVocabularyMt);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const3$physicalSchemaSourceMap, ps, sks), physical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const4$comment, ps, Sequences.cconcatenate((SubLObject)sksi_sks_structure_importer_utilities.$str5$A_physical_schema_for_, new SubLObject[] { format_nil.format_nil_a_no_copy(sks), sksi_sks_structure_importer_utilities.$str6$_ })), sksi_sks_structure_importer_utilities.$const2$UniversalVocabularyMt);
        }
        return ps;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 2348L)
    public static SubLObject sks_make_physical_schema_name(final SubLObject sks) {
        final SubLObject sks_name = constants_high.constant_name(sks);
        final SubLObject ps_name = string_utilities.post_fix(string_utilities.post_remove(sks_name, (SubLObject)sksi_sks_structure_importer_utilities.$str7$_KS, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED), (SubLObject)sksi_sks_structure_importer_utilities.$str8$_PS);
        return ps_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 2520L)
    public static SubLObject sksi_find_ps_field(final SubLObject ps, final SubLObject field_name) {
        return narts_high.find_nart(el_utilities.make_binary_nat_formula(sksi_sks_structure_importer_utilities.$const9$PhysicalFieldFn, ps, field_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 2871L)
    public static SubLObject sksi_sks_get_physical_schemas(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
            result = kb_mapping_utilities.pred_values(sks, sksi_sks_structure_importer_utilities.$const3$physicalSchemaSourceMap, (SubLObject)sksi_sks_structure_importer_utilities.TWO_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 3048L)
    public static SubLObject sksi_sks_get_all_physical_schemas(final SubLObject sks) {
        SubLObject result = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        SubLObject cdolist_list_var = sksi_sks_accessors.sks_get(sks, sksi_sks_structure_importer_utilities.$const12$subKS_Direct, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        SubLObject sub_sks = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        sub_sks = cdolist_list_var.first();
        while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
            final SubLObject physical_schema = sksi_sks_accessors.sks_fget(sub_sks, sksi_sks_structure_importer_utilities.$const3$physicalSchemaSourceMap, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
            result = (SubLObject)ConsesLow.cons(physical_schema, result);
            cdolist_list_var = cdolist_list_var.rest();
            sub_sks = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 3304L)
    public static SubLObject sksi_physical_schema_get_physical_fields(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
            result = kb_mapping_utilities.pred_values(physical_schema, sksi_sks_structure_importer_utilities.$const13$physicalFields, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 3503L)
    public static SubLObject sksi_physical_schema_get_physical_field_indexicals(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
            result = kb_mapping_utilities.pred_values(physical_schema, sksi_sks_structure_importer_utilities.$const14$physicalFieldIndexicals, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 3721L)
    public static SubLObject sksi_sks_get_all_physical_schema_table_names(final SubLObject sks, SubLObject include_schemasP) {
        if (include_schemasP == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            include_schemasP = (SubLObject)sksi_sks_structure_importer_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
            SubLObject cdolist_list_var = sksi_sks_accessors.sks_get(sks, sksi_sks_structure_importer_utilities.$const12$subKS_Direct, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
            SubLObject sub_sks = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            sub_sks = cdolist_list_var.first();
            while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                final SubLObject physical_schema = sksi_sks_accessors.sks_fget(sub_sks, sksi_sks_structure_importer_utilities.$const3$physicalSchemaSourceMap, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                if (sksi_sks_structure_importer_utilities.NIL != include_schemasP) {
                    result = (SubLObject)ConsesLow.cons(kb_mapping_utilities.pred_values(physical_schema, sksi_sks_structure_importer_utilities.$const16$schemaName_SKS, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.TWO_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED).first(), result);
                }
                else {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(kb_mapping_utilities.pred_values(physical_schema, sksi_sks_structure_importer_utilities.$const16$schemaName_SKS, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.TWO_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED).first(), kb_mapping_utilities.pred_values(physical_schema, sksi_sks_structure_importer_utilities.$const17$schemaNameSchema_SKS, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.TWO_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED).first()), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_sks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 5031L)
    public static SubLObject ignore_table_schema_specification_p(final SubLObject x) {
        return (SubLObject)SubLObjectFactory.makeBoolean(x.isString() && sksi_sks_structure_importer_utilities.NIL != Strings.stringE(x, sksi_sks_structure_importer_utilities.$sks_inclusive_schema_pattern$.getGlobalValue(), (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 5229L)
    public static SubLObject sks_initial_ke_validate_database(final SubLObject sks) {
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        SubLObject ke_plist = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        if (sksi_sks_structure_importer_utilities.NIL == hlmt.hlmt_p(defining_mt)) {
            Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str23$_A_does_not_have_a_corresponding_, sks);
        }
        ke_plist = conses_high.putf(ke_plist, sksi_sks_structure_importer_utilities.$const24$definingMt, (SubLObject)ConsesLow.list(defining_mt));
        SubLObject missing_required_fieldP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        SubLObject cdolist_list_var = sksi_sks_structure_importer_utilities.$sks_required_fields_database$.getGlobalValue();
        SubLObject field_pred = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        field_pred = cdolist_list_var.first();
        while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
            final SubLObject field_value = sksi_sks_accessors.sks_get(sks, field_pred, defining_mt);
            if (sksi_sks_structure_importer_utilities.NIL != field_value) {
                ke_plist = conses_high.putf(ke_plist, field_pred, field_value);
            }
            else {
                Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str25$_A_is_missing__A_data, sks, field_pred);
                missing_required_fieldP = (SubLObject)sksi_sks_structure_importer_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_pred = cdolist_list_var.first();
        }
        if (sksi_sks_structure_importer_utilities.NIL != missing_required_fieldP) {
            return Values.values(ke_plist, (SubLObject)sksi_sks_structure_importer_utilities.NIL);
        }
        return Values.values(ke_plist, (SubLObject)sksi_sks_structure_importer_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 6072L)
    public static SubLObject sks_gather_physical_database_table_names(final SubLObject sks, SubLObject include_schemasP, SubLObject schema_pattern) {
        if (include_schemasP == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            include_schemasP = (SubLObject)sksi_sks_structure_importer_utilities.T;
        }
        if (schema_pattern == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            schema_pattern = sksi_sks_structure_importer_utilities.$sks_inclusive_schema_pattern$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table_names = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
            SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                    SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                    }
                    if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject cdolist_list_var;
                final SubLObject tables_meta_data = cdolist_list_var = sdbc.sqlc_get_tables_meta_data(connection, sksi_sks_structure_importer_utilities.$sks_inclusive_catalog_pattern$.getGlobalValue(), schema_pattern, (SubLObject)sksi_sks_structure_importer_utilities.$str21$_, (SubLObject)sksi_sks_structure_importer_utilities.$list29);
                SubLObject table_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                table_meta_data = cdolist_list_var.first();
                while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                    final SubLObject table_name = conses_high.getf(table_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw30$TABLE_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    final SubLObject table_schema = conses_high.getf(table_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw31$TABLE_SCHEM, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    if (sksi_sks_structure_importer_utilities.NIL != include_schemasP) {
                        table_names = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(table_schema, table_name), table_names);
                    }
                    else {
                        table_names = (SubLObject)ConsesLow.cons(table_name, table_names);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_meta_data = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(table_names);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 7213L)
    public static SubLObject sks_gather_asserted_table_meta_data_for_table(final SubLObject sks, final SubLObject table_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym33$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED), thread);
            final SubLObject ps = ask_utilities.query_variable((SubLObject)sksi_sks_structure_importer_utilities.$sym34$_PS, (SubLObject)ConsesLow.listS(sksi_sks_structure_importer_utilities.$const35$and, (SubLObject)ConsesLow.listS(sksi_sks_structure_importer_utilities.$const12$subKS_Direct, sks, (SubLObject)sksi_sks_structure_importer_utilities.$list36), (SubLObject)ConsesLow.list(sksi_sks_structure_importer_utilities.$const16$schemaName_SKS, (SubLObject)sksi_sks_structure_importer_utilities.$sym34$_PS, table_name), (SubLObject)sksi_sks_structure_importer_utilities.$list37), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED).first();
            SubLObject result = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject pf = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            final SubLObject pred_var = sksi_sks_structure_importer_utilities.$const38$physicalSchemaFieldWithName;
            if (sksi_sks_structure_importer_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(ps, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(ps, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                final SubLObject token_var = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                while (sksi_sks_structure_importer_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (sksi_sks_structure_importer_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_sks_structure_importer_utilities.$kw39$GAF, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.NIL);
                            SubLObject done_var_$3 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                            final SubLObject token_var_$4 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                            while (sksi_sks_structure_importer_utilities.NIL == done_var_$3) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                if (sksi_sks_structure_importer_utilities.NIL != valid_$5) {
                                    pf = assertions_high.gaf_arg(assertion, (SubLObject)sksi_sks_structure_importer_utilities.TWO_INTEGER);
                                    final SubLObject is_primary = kb_mapping_utilities.pred_u_v_holds(sksi_sks_structure_importer_utilities.$const40$primaryKey, ps, pf, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                                    final SubLObject is_nullable = kb_mapping_utilities.pred_u_v_holds(sksi_sks_structure_importer_utilities.$const41$nonNullFields, ps, pf, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                                    final SubLObject column_name = cycl_utilities.formula_arg2(pf, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                                    final SubLObject datatype = sks_get_datatype_string_for_physical_field(pf);
                                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(column_name, datatype, is_primary, is_nullable), result);
                                }
                                done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_structure_importer_utilities.NIL == valid_$5);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (sksi_sks_structure_importer_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_structure_importer_utilities.NIL == valid);
                }
            }
            return result;
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 8127L)
    public static SubLObject sks_get_datatype_string_for_physical_field(final SubLObject physical_field) {
        final SubLObject field_data_type = kb_mapping_utilities.pred_values(physical_field, sksi_sks_structure_importer_utilities.$const43$fieldDataType, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.TWO_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED).first();
        SubLObject ret_value = (SubLObject)sksi_sks_structure_importer_utilities.$str44$unknown;
        if (field_data_type.equal(narts_high.nart_substitute((SubLObject)sksi_sks_structure_importer_utilities.$list45))) {
            ret_value = (SubLObject)sksi_sks_structure_importer_utilities.$str46$date_13_;
        }
        else if (sksi_sks_structure_importer_utilities.NIL != obsolete.nat_p(field_data_type) && cycl_utilities.formula_operator(field_data_type).eql(sksi_sks_structure_importer_utilities.$const47$DecimalRealNumberOfMaximumPrecisi)) {
            ret_value = Sequences.cconcatenate((SubLObject)sksi_sks_structure_importer_utilities.$str48$numeric_, new SubLObject[] { format_nil.format_nil_a_no_copy(cycl_utilities.formula_arg1(field_data_type, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), sksi_sks_structure_importer_utilities.$str49$_ });
        }
        else if (sksi_sks_structure_importer_utilities.NIL != obsolete.nat_p(field_data_type) && cycl_utilities.formula_operator(field_data_type).eql(sksi_sks_structure_importer_utilities.$const50$StringOfMaximumLengthFn)) {
            ret_value = Sequences.cconcatenate((SubLObject)sksi_sks_structure_importer_utilities.$str51$varchar_, new SubLObject[] { format_nil.format_nil_a_no_copy(cycl_utilities.formula_arg1(field_data_type, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), sksi_sks_structure_importer_utilities.$str49$_ });
        }
        else if (field_data_type.equal(narts_high.nart_substitute((SubLObject)sksi_sks_structure_importer_utilities.$list52))) {
            ret_value = (SubLObject)sksi_sks_structure_importer_utilities.$str53$int4_10_;
        }
        final SubLObject default_value = kb_mapping_utilities.pred_values(physical_field, sksi_sks_structure_importer_utilities.$const54$defaultFieldValue, (SubLObject)sksi_sks_structure_importer_utilities.TWO_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.THREE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED).first();
        if (sksi_sks_structure_importer_utilities.NIL != default_value) {
            ret_value = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(ret_value), new SubLObject[] { sksi_sks_structure_importer_utilities.$str55$_default_, format_nil.format_nil_a_no_copy(default_value) });
        }
        return ret_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 9171L)
    public static SubLObject cluster_physical_database_table_information_by_schemata(final SubLObject table_name_infos) {
        final SubLObject map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_sks_structure_importer_utilities.EQUAL), (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = table_name_infos;
        SubLObject table_name_info = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        table_name_info = cdolist_list_var.first();
        while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = table_name_info;
            SubLObject table_schema = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_structure_importer_utilities.$list57);
            table_schema = current.first();
            final SubLObject table_info;
            current = (table_info = current.rest());
            map_utilities.map_push(map, table_schema, table_info);
            cdolist_list_var = cdolist_list_var.rest();
            table_name_info = cdolist_list_var.first();
        }
        final SubLObject order = Sort.sort(map_utilities.map_keys(map), (SubLObject)sksi_sks_structure_importer_utilities.$sym58$STRING_, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        SubLObject result = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        SubLObject cdolist_list_var2 = order;
        SubLObject schema = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        schema = cdolist_list_var2.first();
        while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var2) {
            final SubLObject entries = conses_high.copy_list(map_utilities.map_get(map, schema, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED));
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(schema, Sort.sort(entries, (SubLObject)sksi_sks_structure_importer_utilities.$sym58$STRING_, (SubLObject)sksi_sks_structure_importer_utilities.$sym59$FIRST)), result);
            cdolist_list_var2 = cdolist_list_var2.rest();
            schema = cdolist_list_var2.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 9900L)
    public static SubLObject sks_physical_structure_decode_database_table(final SubLObject sks, final SubLObject table_name, SubLObject table_schema, SubLObject repropagate_nowP) {
        if (table_schema == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            table_schema = sksi_sks_structure_importer_utilities.$sks_inclusive_schema_pattern$.getGlobalValue();
        }
        if (repropagate_nowP == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            repropagate_nowP = (SubLObject)sksi_sks_structure_importer_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
            SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                    SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$7, thread);
                    }
                    if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                final SubLObject row_count = sks_physical_structure_database_row_count(connection, table_name);
                final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                if (sksi_sks_structure_importer_utilities.NIL == hlmt.hlmt_p(defining_mt)) {
                    Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str23$_A_does_not_have_a_corresponding_, sks);
                }
                sks_create_and_add_sub_ks_int(table_name, sks, defining_mt, table_schema, row_count);
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        if (sksi_sks_structure_importer_utilities.NIL != repropagate_nowP) {
            repropagate_isas_for_ks_and_each_sub_ks(sks);
        }
        return Values.values(sks, (SubLObject)sksi_sks_structure_importer_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 10744L)
    public static SubLObject sks_physical_structure_decode_database(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
            SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                    SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$9, thread);
                    }
                    if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject cdolist_list_var = sks_gather_physical_database_table_names(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                SubLObject table_name = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                table_name = cdolist_list_var.first();
                while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                    sks_physical_structure_decode_database_table(sks, table_name, sksi_sks_structure_importer_utilities.$sks_inclusive_schema_pattern$.getGlobalValue(), (SubLObject)sksi_sks_structure_importer_utilities.NIL);
                    cdolist_list_var = cdolist_list_var.rest();
                    table_name = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        }
        finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        repropagate_isas_for_ks_and_each_sub_ks(sks);
        return Values.values(sks, (SubLObject)sksi_sks_structure_importer_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 11109L)
    public static SubLObject sks_physical_structure_database_row_count(final SubLObject connection, final SubLObject table_name) {
        SubLObject row_count = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        final SubLObject row_count_sql = Sequences.cconcatenate((SubLObject)sksi_sks_structure_importer_utilities.$str61$select_count____from_, format_nil.format_nil_a_no_copy(table_name));
        final SubLObject statement = sdbc.sqlc_create_statement(connection);
        final SubLObject result_set = sdbc.sqls_execute_query(statement, row_count_sql, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        SubLObject result_set_iterator = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_result_set_p(result_set)) {
            sksi_sks_interaction.cache_sql_connection_statement_for_result_set(result_set, connection, statement);
            result_set_iterator = sksi_result_set_iterators.new_sqlrs_iterator(result_set, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
            if (sksi_sks_structure_importer_utilities.NIL != iteration.iterator_p(result_set_iterator) && sksi_sks_structure_importer_utilities.NIL == iteration.iteration_done(result_set_iterator)) {
                final SubLObject real_row_count = iteration.iteration_next(result_set_iterator).first();
                if (real_row_count.isNumber()) {
                    row_count = real_row_count;
                }
            }
            sksi_sks_interaction.uncache_sql_connection_statement_for_result_set(result_set);
        }
        return row_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 11953L)
    public static SubLObject sks_create_and_add_sub_ks_int(final SubLObject sks_name, final SubLObject super_sks, final SubLObject defining_mt, final SubLObject table_schema, SubLObject row_count) {
        if (row_count == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            row_count = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        }
        assert sksi_sks_structure_importer_utilities.NIL != string_utilities.non_empty_stringP(sks_name) : sks_name;
        assert sksi_sks_structure_importer_utilities.NIL != sksi_sks_accessors.sks_p(super_sks) : super_sks;
        assert sksi_sks_structure_importer_utilities.NIL != hlmt.hlmt_p(defining_mt) : defining_mt;
        assert sksi_sks_structure_importer_utilities.NIL != Types.stringp(table_schema) : table_schema;
        if (sksi_sks_structure_importer_utilities.NIL != row_count && !sksi_sks_structure_importer_utilities.assertionsDisabledInClass && sksi_sks_structure_importer_utilities.NIL == Types.numberp(row_count)) {
            throw new AssertionError(row_count);
        }
        final SubLObject sks = sksi_sks_accessors.new_sks_atomic(sks_name, super_sks, defining_mt);
        final SubLObject physical_schemabase_mt = sksi_smt.sks_get_physical_schemabase_mt(super_sks);
        if (sksi_sks_structure_importer_utilities.NIL == hlmt.hlmt_p(physical_schemabase_mt)) {
            Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str67$Couldn_t_find___sksPhysicalSchema, super_sks);
        }
        sksi_sks_accessors.sks_set_type(sks, sksi_sks_structure_importer_utilities.$const68$Database_Physical);
        if (sksi_sks_structure_importer_utilities.NIL != row_count) {
            sksi_sks_accessors.sks_set_row_count(sks, row_count);
        }
        sks_create_and_add_ps_database(sks, physical_schemabase_mt, table_schema);
        sks_ps_add_keys(sks, physical_schemabase_mt);
        sks_ps_add_pf_properties(sks, physical_schemabase_mt);
        return sks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 12912L)
    public static SubLObject sks_create_and_add_raw_ls_database(final SubLObject sks) {
        assert sksi_sks_structure_importer_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject logical_schemabase_mt = sksi_smt.sks_get_logical_schemabase_mt(sks);
        return sksi_create_initial_logical_schemas(sks, logical_schemabase_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 13384L)
    public static SubLObject sksi_create_initial_logical_schemas(final SubLObject sks, final SubLObject logical_schemabase_mt) {
        SubLObject cdolist_list_var = sksi_sks_get_all_physical_schemas(sks);
        SubLObject physical_schema = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        physical_schema = cdolist_list_var.first();
        while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
            sksi_create_logical_schema_for_physical(physical_schema, logical_schemabase_mt);
            cdolist_list_var = cdolist_list_var.rest();
            physical_schema = cdolist_list_var.first();
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 15074L)
    public static SubLObject sksi_create_logical_schema_for_physical(final SubLObject physical_schema, final SubLObject logical_schemabase_mt) {
        assert sksi_sks_structure_importer_utilities.NIL != hlmt.hlmt_p(logical_schemabase_mt) : logical_schemabase_mt;
        final SubLObject physical_schema_name = constants_high.constant_name(physical_schema);
        final SubLObject logical_schema_name = string_utilities.string_subst((SubLObject)sksi_sks_structure_importer_utilities.$str69$_LS, (SubLObject)sksi_sks_structure_importer_utilities.$str8$_PS, physical_schema_name, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        final SubLObject logical_schema = sksi_kb_accessors.sksi_find_or_create(logical_schema_name);
        if (sksi_sks_structure_importer_utilities.NIL != logical_schema) {
            sksi_kb_accessors.sksi_constant_assert_inherited_kb_subset_isas(logical_schema, physical_schema);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const0$isa, logical_schema, sksi_sks_structure_importer_utilities.$const70$Individual), sksi_sks_structure_importer_utilities.$const2$UniversalVocabularyMt);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const0$isa, logical_schema, sksi_sks_structure_importer_utilities.$const71$ObjectDefiningSchema), logical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const0$isa, logical_schema, sksi_sks_structure_importer_utilities.$const72$LogicalSchema), logical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const73$logicalPhysicalSchemaMap, logical_schema, physical_schema), logical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const4$comment, logical_schema, Sequences.cconcatenate((SubLObject)sksi_sks_structure_importer_utilities.$str74$A_logical_schema_corresponding_to, new SubLObject[] { format_nil.format_nil_a_no_copy(physical_schema_name), sksi_sks_structure_importer_utilities.$str75$_physical_schema_ })), sksi_sks_structure_importer_utilities.$const2$UniversalVocabularyMt);
        }
        return logical_schema;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 16243L)
    public static SubLObject sks_create_and_add_ps_database(final SubLObject sks, final SubLObject physical_schemabase_mt, SubLObject db_schema_name) {
        if (db_schema_name == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            db_schema_name = sksi_sks_structure_importer_utilities.$sks_inclusive_schema_pattern$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_sks_structure_importer_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        SubLObject ps = sks_find_or_create_ps(sks, physical_schemabase_mt);
        if (sksi_sks_structure_importer_utilities.NIL != ps) {
            final SubLObject table_name;
            final SubLObject sks_name = table_name = sksi_sks_accessors.sks_fget(sks, sksi_sks_structure_importer_utilities.$const76$structuredKnowledgeSourceName, defining_mt);
            final SubLObject ps_name = sks_make_physical_schema_name(sks);
            SubLObject columns_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject field_names = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
            try {
                sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
                SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                try {
                    connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                        close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                        SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                        final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                            access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$11, thread);
                        }
                        if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                            Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                        }
                        connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                            Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                        }
                        sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                    }
                    columns_meta_data = sdbc.sqlc_get_columns_meta_data(connection, (SubLObject)sksi_sks_structure_importer_utilities.$str77$, db_schema_name, table_name, (SubLObject)sksi_sks_structure_importer_utilities.$str21$_);
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                            sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                            if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
            }
            ps = sksi_kb_accessors.sksi_find_or_create(ps_name);
            SubLObject cdolist_list_var = columns_meta_data;
            SubLObject column_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            column_meta_data = cdolist_list_var.first();
            while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                if (sksi_sks_structure_importer_utilities.NIL != ignore_table_schema_specification_p(db_schema_name)) {
                    db_schema_name = conses_high.getf(column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw31$TABLE_SCHEM, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                }
                field_names = (SubLObject)ConsesLow.cons(conses_high.getf(column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw78$COLUMN_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED), field_names);
                cdolist_list_var = cdolist_list_var.rest();
                column_meta_data = cdolist_list_var.first();
            }
            field_names = Sequences.nreverse(field_names);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const16$schemaName_SKS, ps, sks_name), physical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const17$schemaNameSchema_SKS, ps, db_schema_name), physical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_unary_formula(sksi_sks_structure_importer_utilities.$const79$enumerableSchema, ps), physical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const80$schemaFieldNameList, ps, el_utilities.make_el_list(field_names, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), physical_schemabase_mt);
            return ps;
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 18308L)
    public static SubLObject sksi_sdbc_column_type_to_cycl(final SubLObject data_type, SubLObject column_size, SubLObject decimal_digits, SubLObject type_name) {
        if (column_size == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            column_size = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        }
        if (decimal_digits == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            decimal_digits = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        }
        if (type_name == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            type_name = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        }
        assert sksi_sks_structure_importer_utilities.NIL != Types.integerp(data_type) : data_type;
        if (!column_size.isInteger()) {
            column_size = (SubLObject)sksi_sks_structure_importer_utilities.$kw82$NULL;
        }
        if (!decimal_digits.isInteger()) {
            decimal_digits = (SubLObject)sksi_sks_structure_importer_utilities.$kw82$NULL;
        }
        if (!type_name.isString()) {
            type_name = (SubLObject)sksi_sks_structure_importer_utilities.$kw82$NULL;
        }
        final SubLObject jdbc_type = (SubLObject)ConsesLow.list(sksi_sks_structure_importer_utilities.$const83$JDBCDatatypeDescribedByFn, data_type, column_size, decimal_digits, type_name);
        SubLObject cycl_data_type = bindings.variable_lookup((SubLObject)sksi_sks_structure_importer_utilities.$sym84$_WHAT, inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(sksi_sks_structure_importer_utilities.$const85$rewriteOf, (SubLObject)sksi_sks_structure_importer_utilities.$sym84$_WHAT, jdbc_type), sksi_sks_structure_importer_utilities.$const86$JDBCDataMt, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_structure_importer_utilities.$kw87$INFERENCE_MODE, (SubLObject)sksi_sks_structure_importer_utilities.$kw88$SHALLOW, (SubLObject)sksi_sks_structure_importer_utilities.$kw89$NEW_TERMS_ALLOWED_, (SubLObject)sksi_sks_structure_importer_utilities.T)).first());
        if (sksi_sks_structure_importer_utilities.NIL == cycl_data_type) {
            Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str90$No_better_type_found_for__A__usin, jdbc_type);
            cycl_data_type = narts_high.find_nart(jdbc_type);
            if (sksi_sks_structure_importer_utilities.NIL == cycl_data_type) {
                Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str91$Also__failed_to_reify__A_, jdbc_type);
            }
        }
        return cycl_data_type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 19188L)
    public static SubLObject sks_ps_add_pf_properties_database(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        final SubLObject ps = sks_find_or_create_ps(sks, physical_schemabase_mt);
        if (sksi_sks_structure_importer_utilities.NIL != ps) {
            final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
            try {
                sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
                SubLObject unused_connection_var = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                try {
                    unused_connection_var = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(unused_connection_var)) {
                        close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                        SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                        final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                            access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$13, thread);
                        }
                        if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                            Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                        }
                        unused_connection_var = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(unused_connection_var)) {
                            Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                        }
                        sksi_macros.sksi_connections_for_sks_cache_add(sks, unused_connection_var);
                    }
                    final SubLObject table_name;
                    final SubLObject sks_name = table_name = sksi_sks_accessors.sks_fget(sks, sksi_sks_structure_importer_utilities.$const76$structuredKnowledgeSourceName, defining_mt);
                    SubLObject columns_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject _prev_bind_0_$14 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                    try {
                        sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
                        SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                        SubLObject close_connectionP_$15 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                        try {
                            connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                            if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                                close_connectionP_$15 = (SubLObject)sksi_sks_structure_importer_utilities.T;
                                SubLObject access_path2 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                                final SubLObject _prev_bind_0_$15 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                                    access_path2 = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                                }
                                finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$15, thread);
                                }
                                if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path2)) {
                                    Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                                }
                                connection = sksi_sks_interaction.open_sql_source(access_path2, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                                if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                                    Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                                }
                                sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                            }
                            columns_meta_data = sdbc.sqlc_get_columns_meta_data(connection, (SubLObject)sksi_sks_structure_importer_utilities.$str77$, (SubLObject)sksi_sks_structure_importer_utilities.$str21$_, table_name, (SubLObject)sksi_sks_structure_importer_utilities.$str21$_);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (sksi_sks_structure_importer_utilities.NIL != close_connectionP_$15) {
                                    sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                    if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                                        sdbc.sqlc_close(connection);
                                    }
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    }
                    finally {
                        sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$14, thread);
                    }
                    SubLObject non_null_pfs = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject cdolist_list_var = columns_meta_data;
                    SubLObject column_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    column_meta_data = cdolist_list_var.first();
                    while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                        final SubLObject column_name = conses_high.getf(column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw78$COLUMN_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject nullable = conses_high.getf(column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw92$IS_NULLABLE, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        if (nullable.equal((SubLObject)sksi_sks_structure_importer_utilities.$str93$NO)) {
                            final SubLObject pf = sksi_find_ps_field(ps, column_name);
                            non_null_pfs = (SubLObject)ConsesLow.cons(pf, non_null_pfs);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        column_meta_data = cdolist_list_var.first();
                    }
                    non_null_pfs = Sequences.nreverse(non_null_pfs);
                    if (sksi_sks_structure_importer_utilities.NIL != non_null_pfs) {
                        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const94$nonNullFieldList, ps, el_utilities.make_el_list(non_null_pfs, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), physical_schemabase_mt);
                    }
                    SubLObject cdolist_list_var2 = columns_meta_data;
                    SubLObject column_meta_data2 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    column_meta_data2 = cdolist_list_var2.first();
                    while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var2) {
                        final SubLObject column_name2 = conses_high.getf(column_meta_data2, (SubLObject)sksi_sks_structure_importer_utilities.$kw78$COLUMN_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject data_type = conses_high.getf(column_meta_data2, (SubLObject)sksi_sks_structure_importer_utilities.$kw95$DATA_TYPE, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject type_name = conses_high.getf(column_meta_data2, (SubLObject)sksi_sks_structure_importer_utilities.$kw96$TYPE_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject column_size = conses_high.getf(column_meta_data2, (SubLObject)sksi_sks_structure_importer_utilities.$kw97$COLUMN_SIZE, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject decimal_digits = conses_high.getf(column_meta_data2, (SubLObject)sksi_sks_structure_importer_utilities.$kw98$DECIMAL_DIGITS, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        SubLObject column_def = conses_high.getf(column_meta_data2, (SubLObject)sksi_sks_structure_importer_utilities.$kw99$COLUMN_DEF, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject cycl_datatype = sksi_sdbc_column_type_to_cycl(data_type, column_size, decimal_digits, type_name);
                        final SubLObject pf2 = sksi_find_ps_field(ps, column_name2);
                        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const43$fieldDataType, pf2, cycl_datatype), physical_schemabase_mt);
                        if (sksi_sks_structure_importer_utilities.NIL != string_utilities.non_empty_stringP(column_def)) {
                            SubLObject poss_column_def = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                            if (sksi_sks_structure_importer_utilities.NIL != genls.genl_in_any_mtP(cycl_datatype, sksi_sks_structure_importer_utilities.$const100$IntegerComputerNumber)) {
                                poss_column_def = string_utilities.string_to_integer(column_def);
                            }
                            else if (sksi_sks_structure_importer_utilities.NIL != genls.genl_in_any_mtP(cycl_datatype, sksi_sks_structure_importer_utilities.$const101$DoubleFloatObject)) {
                                poss_column_def = reader.read_from_string_ignoring_errors(column_def, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                            }
                            if (sksi_sks_structure_importer_utilities.NIL != poss_column_def) {
                                column_def = poss_column_def;
                            }
                            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_ternary_formula(sksi_sks_structure_importer_utilities.$const54$defaultFieldValue, ps, pf2, column_def), physical_schemabase_mt);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        column_meta_data2 = cdolist_list_var2.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                            sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                            if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(unused_connection_var)) {
                                sdbc.sqlc_close(unused_connection_var);
                            }
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            }
            finally {
                sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 21821L)
    public static SubLObject sks_ps_get_schema_name(final SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym33$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(physical_schemabase_mt, thread);
            result = kb_mapping_utilities.fpred_value(ps, sksi_sks_structure_importer_utilities.$const17$schemaNameSchema_SKS, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 22025L)
    public static SubLObject sks_ps_add_primary_keys(final SubLObject sks, final SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        final SubLObject table_name = sksi_sks_accessors.sks_fget(sks, sksi_sks_structure_importer_utilities.$const76$structuredKnowledgeSourceName, defining_mt);
        final SubLObject schema_name = sks_ps_get_schema_name(ps, physical_schemabase_mt);
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
            SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                    SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject _prev_bind_0_$19 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$19, thread);
                    }
                    if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject primary_keys_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                SubLObject primary_key_pfs = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                final SubLObject _prev_bind_0_$20 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                try {
                    sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
                    SubLObject connection_$21 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject close_connectionP_$22 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    try {
                        connection_$21 = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                        if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection_$21)) {
                            close_connectionP_$22 = (SubLObject)sksi_sks_structure_importer_utilities.T;
                            SubLObject access_path2 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                            final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                                access_path2 = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$21, thread);
                            }
                            if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path2)) {
                                Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                            }
                            connection_$21 = sksi_sks_interaction.open_sql_source(access_path2, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                            if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection_$21)) {
                                Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                            }
                            sksi_macros.sksi_connections_for_sks_cache_add(sks, connection_$21);
                        }
                        primary_keys_meta_data = sdbc.sqlc_get_primary_keys_meta_data(connection_$21, (SubLObject)sksi_sks_structure_importer_utilities.$str77$, schema_name, table_name);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_sks_structure_importer_utilities.NIL != close_connectionP_$22) {
                                sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection_$21)) {
                                    sdbc.sqlc_close(connection_$21);
                                }
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                }
                finally {
                    sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$20, thread);
                }
                SubLObject cdolist_list_var;
                primary_keys_meta_data = (cdolist_list_var = list_utilities.plistlist_sort(primary_keys_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw102$KEY_SEQ, (SubLObject)sksi_sks_structure_importer_utilities.$sym103$_));
                SubLObject primary_key_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                primary_key_meta_data = cdolist_list_var.first();
                while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                    final SubLObject primary_key_column_name = conses_high.getf(primary_key_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw78$COLUMN_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    final SubLObject pf = sksi_find_ps_field(ps, primary_key_column_name);
                    if (sksi_sks_structure_importer_utilities.NIL == pf) {
                        Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str104$physical_field_in__A_named__A_not, ps, primary_key_column_name);
                    }
                    else {
                        primary_key_pfs = (SubLObject)ConsesLow.cons(pf, primary_key_pfs);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    primary_key_meta_data = cdolist_list_var.first();
                }
                primary_key_pfs = Sequences.nreverse(primary_key_pfs);
                if (sksi_sks_structure_importer_utilities.NIL != primary_key_pfs) {
                    sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const40$primaryKey, ps, el_utilities.make_el_list(primary_key_pfs, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), physical_schemabase_mt);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        }
        finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 23320L)
    public static SubLObject sks_ps_add_exported_keys(final SubLObject sks, final SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        final SubLObject table_name = sksi_sks_accessors.sks_fget(sks, sksi_sks_structure_importer_utilities.$const76$structuredKnowledgeSourceName, defining_mt);
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
            SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                    SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject _prev_bind_0_$26 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$26, thread);
                    }
                    if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject exported_keys_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                final SubLObject _prev_bind_0_$27 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                try {
                    sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
                    SubLObject connection_$28 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject close_connectionP_$29 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    try {
                        connection_$28 = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                        if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection_$28)) {
                            close_connectionP_$29 = (SubLObject)sksi_sks_structure_importer_utilities.T;
                            SubLObject access_path2 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                            final SubLObject _prev_bind_0_$28 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                                access_path2 = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$28, thread);
                            }
                            if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path2)) {
                                Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                            }
                            connection_$28 = sksi_sks_interaction.open_sql_source(access_path2, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                            if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection_$28)) {
                                Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                            }
                            sksi_macros.sksi_connections_for_sks_cache_add(sks, connection_$28);
                        }
                        exported_keys_meta_data = sdbc.sqlc_get_exported_keys_meta_data(connection_$28, (SubLObject)sksi_sks_structure_importer_utilities.$str77$, (SubLObject)sksi_sks_structure_importer_utilities.$str77$, table_name);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_sks_structure_importer_utilities.NIL != close_connectionP_$29) {
                                sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection_$28)) {
                                    sdbc.sqlc_close(connection_$28);
                                }
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                }
                finally {
                    sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$27, thread);
                }
                SubLObject cdolist_list_var;
                final SubLObject foreign_key_names = cdolist_list_var = plistlist_indicator_range(exported_keys_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw105$FK_NAME);
                SubLObject foreign_key_name = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                foreign_key_name = cdolist_list_var.first();
                while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                    final SubLObject exported_key_columns_meta_data = plistlist_filter_and_sort(exported_keys_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw105$FK_NAME, foreign_key_name, Symbols.symbol_function((SubLObject)sksi_sks_structure_importer_utilities.EQUAL), (SubLObject)sksi_sks_structure_importer_utilities.$kw102$KEY_SEQ, (SubLObject)sksi_sks_structure_importer_utilities.$sym103$_);
                    SubLObject foreign_key_pred = sksi_sks_structure_importer_utilities.$const106$foreignKeyMap;
                    SubLObject foreign_ps = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject primary_key_pfs = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject foreign_key_pfs = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject cdolist_list_var_$32 = exported_key_columns_meta_data;
                    SubLObject exported_key_column_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    exported_key_column_meta_data = cdolist_list_var_$32.first();
                    while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var_$32) {
                        final SubLObject update_rule = conses_high.getf(exported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw107$UPDATE_RULE, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject delete_rule = conses_high.getf(exported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw108$DELETE_RULE, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject primary_key_column_name = conses_high.getf(exported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw109$PKCOLUMN_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject foreign_key_table_name = conses_high.getf(exported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw110$FKTABLE_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject foreign_key_column_name = conses_high.getf(exported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw111$FKCOLUMN_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject pk_pf = sksi_find_ps_field(ps, primary_key_column_name);
                        final SubLObject fk_pf = sksi_find_ps_field_by_table_column(foreign_key_table_name, foreign_key_column_name, physical_schemabase_mt);
                        if (update_rule.eql((SubLObject)sksi_sks_structure_importer_utilities.ZERO_INTEGER) || delete_rule.eql((SubLObject)sksi_sks_structure_importer_utilities.ZERO_INTEGER)) {
                            foreign_key_pred = sksi_sks_structure_importer_utilities.$const112$foreignKeyMap_Cascade;
                        }
                        if (update_rule.eql((SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER) || delete_rule.eql((SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER)) {
                            foreign_key_pred = sksi_sks_structure_importer_utilities.$const113$foreignKeyMap_Restrict;
                        }
                        foreign_ps = sksi_find_ps_by_table(foreign_key_table_name, physical_schemabase_mt);
                        if (sksi_sks_structure_importer_utilities.NIL == pk_pf) {
                            Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str104$physical_field_in__A_named__A_not, ps, primary_key_column_name);
                        }
                        else {
                            primary_key_pfs = (SubLObject)ConsesLow.cons(pk_pf, primary_key_pfs);
                        }
                        if (sksi_sks_structure_importer_utilities.NIL == fk_pf) {
                            Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str114$physical_field_in__A_table__A_nam, ps, foreign_key_table_name, foreign_key_column_name);
                        }
                        else {
                            foreign_key_pfs = (SubLObject)ConsesLow.cons(fk_pf, foreign_key_pfs);
                        }
                        cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                        exported_key_column_meta_data = cdolist_list_var_$32.first();
                    }
                    primary_key_pfs = Sequences.nreverse(primary_key_pfs);
                    foreign_key_pfs = Sequences.nreverse(foreign_key_pfs);
                    if (sksi_sks_structure_importer_utilities.NIL != primary_key_pfs && sksi_sks_structure_importer_utilities.NIL != foreign_key_pfs) {
                        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_quaternary_formula(foreign_key_pred, ps, el_utilities.make_el_list(primary_key_pfs, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED), foreign_ps, el_utilities.make_el_list(foreign_key_pfs, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), physical_schemabase_mt);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    foreign_key_name = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        }
        finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 26054L)
    public static SubLObject sks_ps_add_imported_keys(final SubLObject sks, final SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        final SubLObject table_name = sksi_sks_accessors.sks_fget(sks, sksi_sks_structure_importer_utilities.$const76$structuredKnowledgeSourceName, defining_mt);
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
            SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                    SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
                    }
                    if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject imported_keys_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                final SubLObject _prev_bind_0_$35 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                try {
                    sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
                    SubLObject connection_$36 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject close_connectionP_$37 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    try {
                        connection_$36 = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                        if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection_$36)) {
                            close_connectionP_$37 = (SubLObject)sksi_sks_structure_importer_utilities.T;
                            SubLObject access_path2 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                            final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                                access_path2 = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$36, thread);
                            }
                            if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path2)) {
                                Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                            }
                            connection_$36 = sksi_sks_interaction.open_sql_source(access_path2, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                            if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection_$36)) {
                                Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                            }
                            sksi_macros.sksi_connections_for_sks_cache_add(sks, connection_$36);
                        }
                        imported_keys_meta_data = sdbc.sqlc_get_imported_keys_meta_data(connection_$36, (SubLObject)sksi_sks_structure_importer_utilities.$str77$, (SubLObject)sksi_sks_structure_importer_utilities.$str77$, table_name);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_sks_structure_importer_utilities.NIL != close_connectionP_$37) {
                                sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection_$36)) {
                                    sdbc.sqlc_close(connection_$36);
                                }
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                        }
                    }
                }
                finally {
                    sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$35, thread);
                }
                SubLObject cdolist_list_var;
                final SubLObject foreign_key_names = cdolist_list_var = plistlist_indicator_range(imported_keys_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw105$FK_NAME);
                SubLObject foreign_key_name = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                foreign_key_name = cdolist_list_var.first();
                while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                    final SubLObject imported_key_columns_meta_data = plistlist_filter_and_sort(imported_keys_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw105$FK_NAME, foreign_key_name, Symbols.symbol_function((SubLObject)sksi_sks_structure_importer_utilities.EQUAL), (SubLObject)sksi_sks_structure_importer_utilities.$kw102$KEY_SEQ, (SubLObject)sksi_sks_structure_importer_utilities.$sym103$_);
                    SubLObject foreign_key_pred = sksi_sks_structure_importer_utilities.$const106$foreignKeyMap;
                    SubLObject primary_ps = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject primary_key_pfs = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject foreign_key_pfs = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject cdolist_list_var_$40 = imported_key_columns_meta_data;
                    SubLObject imported_key_column_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    imported_key_column_meta_data = cdolist_list_var_$40.first();
                    while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var_$40) {
                        final SubLObject update_rule = conses_high.getf(imported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw107$UPDATE_RULE, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject delete_rule = conses_high.getf(imported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw108$DELETE_RULE, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject primary_key_table_name = conses_high.getf(imported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw115$PKTABLE_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject primary_key_column_name = conses_high.getf(imported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw109$PKCOLUMN_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject foreign_key_column_name = conses_high.getf(imported_key_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw111$FKCOLUMN_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject pk_pf = sksi_find_ps_field_by_table_column(primary_key_table_name, primary_key_column_name, physical_schemabase_mt);
                        final SubLObject fk_pf = sksi_find_ps_field(ps, foreign_key_column_name);
                        if (update_rule.eql((SubLObject)sksi_sks_structure_importer_utilities.ZERO_INTEGER) || delete_rule.eql((SubLObject)sksi_sks_structure_importer_utilities.ZERO_INTEGER)) {
                            foreign_key_pred = sksi_sks_structure_importer_utilities.$const112$foreignKeyMap_Cascade;
                        }
                        if (update_rule.eql((SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER) || delete_rule.eql((SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER)) {
                            foreign_key_pred = sksi_sks_structure_importer_utilities.$const113$foreignKeyMap_Restrict;
                        }
                        primary_ps = sksi_find_ps_by_table(primary_key_table_name, physical_schemabase_mt);
                        if (sksi_sks_structure_importer_utilities.NIL == fk_pf) {
                            Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str104$physical_field_in__A_named__A_not, ps, foreign_key_column_name);
                        }
                        else {
                            foreign_key_pfs = (SubLObject)ConsesLow.cons(fk_pf, foreign_key_pfs);
                        }
                        if (sksi_sks_structure_importer_utilities.NIL == pk_pf) {
                            Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str114$physical_field_in__A_table__A_nam, ps, primary_key_table_name, primary_key_column_name);
                        }
                        else {
                            primary_key_pfs = (SubLObject)ConsesLow.cons(pk_pf, primary_key_pfs);
                        }
                        cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                        imported_key_column_meta_data = cdolist_list_var_$40.first();
                    }
                    primary_key_pfs = Sequences.nreverse(primary_key_pfs);
                    foreign_key_pfs = Sequences.nreverse(foreign_key_pfs);
                    if (sksi_sks_structure_importer_utilities.NIL != primary_key_pfs && sksi_sks_structure_importer_utilities.NIL != foreign_key_pfs) {
                        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_quaternary_formula(foreign_key_pred, primary_ps, el_utilities.make_el_list(primary_key_pfs, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED), ps, el_utilities.make_el_list(foreign_key_pfs, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), physical_schemabase_mt);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    foreign_key_name = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                }
            }
        }
        finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 28787L)
    public static SubLObject sksi_index_type_from_index_type_id(final SubLObject type_id) {
        if (type_id.eql((SubLObject)sksi_sks_structure_importer_utilities.ZERO_INTEGER)) {
            return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        }
        if (type_id.eql((SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER)) {
            return sksi_sks_structure_importer_utilities.$const116$BTree_DataStructure;
        }
        if (type_id.eql((SubLObject)sksi_sks_structure_importer_utilities.TWO_INTEGER)) {
            return sksi_sks_structure_importer_utilities.$const117$HashTable_DataStructure;
        }
        if (type_id.eql((SubLObject)sksi_sks_structure_importer_utilities.THREE_INTEGER)) {
            return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 29006L)
    public static SubLObject sks_ps_add_indices(final SubLObject sks, SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        final SubLObject table_name = sksi_sks_accessors.sks_fget(sks, sksi_sks_structure_importer_utilities.$const76$structuredKnowledgeSourceName, defining_mt);
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
            SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                    SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject _prev_bind_0_$42 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$42, thread);
                    }
                    if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject indices_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                final SubLObject _prev_bind_0_$43 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                try {
                    sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
                    SubLObject connection_$44 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject close_connectionP_$45 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    try {
                        connection_$44 = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                        if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection_$44)) {
                            close_connectionP_$45 = (SubLObject)sksi_sks_structure_importer_utilities.T;
                            SubLObject access_path2 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                            final SubLObject _prev_bind_0_$44 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                                access_path2 = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$44, thread);
                            }
                            if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path2)) {
                                Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                            }
                            connection_$44 = sksi_sks_interaction.open_sql_source(access_path2, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                            if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection_$44)) {
                                Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                            }
                            sksi_macros.sksi_connections_for_sks_cache_add(sks, connection_$44);
                        }
                        indices_meta_data = sdbc.sqlc_get_index_info_meta_data(connection_$44, (SubLObject)sksi_sks_structure_importer_utilities.$str77$, (SubLObject)sksi_sks_structure_importer_utilities.$str77$, table_name, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.NIL);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_sks_structure_importer_utilities.NIL != close_connectionP_$45) {
                                sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection_$44)) {
                                    sdbc.sqlc_close(connection_$44);
                                }
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                }
                finally {
                    sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$43, thread);
                }
                SubLObject cdolist_list_var;
                final SubLObject index_names = cdolist_list_var = plistlist_indicator_range(indices_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw118$INDEX_NAME);
                SubLObject index_name = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                index_name = cdolist_list_var.first();
                while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                    final SubLObject index_columns_meta_data = plistlist_filter_and_sort(indices_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw118$INDEX_NAME, index_name, Symbols.symbol_function((SubLObject)sksi_sks_structure_importer_utilities.EQUAL), (SubLObject)sksi_sks_structure_importer_utilities.$kw119$ORDINAL_POSITION, (SubLObject)sksi_sks_structure_importer_utilities.$sym120$OBJECT_STRING__);
                    SubLObject index_pfs = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject index_non_uniqueP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject index_type = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    SubLObject cdolist_list_var_$48 = index_columns_meta_data;
                    SubLObject index_column_meta_data = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    index_column_meta_data = cdolist_list_var_$48.first();
                    while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var_$48) {
                        final SubLObject non_unique = conses_high.getf(index_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw121$NON_UNIQUE, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject index_table_name = conses_high.getf(index_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw30$TABLE_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject index_column_name = conses_high.getf(index_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw78$COLUMN_NAME, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        final SubLObject index_pf = sksi_find_ps_field(ps, index_column_name);
                        index_type = conses_high.getf(index_column_meta_data, (SubLObject)sksi_sks_structure_importer_utilities.$kw122$TYPE, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        if (non_unique.equal((SubLObject)sksi_sks_structure_importer_utilities.$str123$true)) {
                            index_non_uniqueP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                        }
                        ps = sksi_find_ps_by_table(index_table_name, physical_schemabase_mt);
                        if (sksi_sks_structure_importer_utilities.NIL == index_pf) {
                            Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str114$physical_field_in__A_table__A_nam, ps, index_table_name, index_column_name);
                        }
                        else {
                            index_pfs = (SubLObject)ConsesLow.cons(index_pf, index_pfs);
                        }
                        cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                        index_column_meta_data = cdolist_list_var_$48.first();
                    }
                    index_pfs = Sequences.nreverse(index_pfs);
                    if (sksi_sks_structure_importer_utilities.NIL != index_pfs) {
                        final SubLObject index_constant_name = Sequences.cconcatenate(string_utilities.post_remove(constants_high.constant_name(sks), (SubLObject)sksi_sks_structure_importer_utilities.$str124$KS, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED), new SubLObject[] { index_name, sksi_sks_structure_importer_utilities.$str125$_TheIndex });
                        final SubLObject index_constant = sksi_kb_accessors.sksi_create(index_constant_name);
                        final SubLObject index_type_constant = sksi_index_type_from_index_type_id(index_type);
                        if (sksi_sks_structure_importer_utilities.NIL == index_non_uniqueP) {
                            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const126$uniqueFieldList, ps, el_utilities.make_el_list(index_pfs, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), physical_schemabase_mt);
                        }
                        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const0$isa, index_constant, sksi_sks_structure_importer_utilities.$const127$IndexDataStructure), sksi_sks_structure_importer_utilities.$const2$UniversalVocabularyMt);
                        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_quaternary_formula(sksi_sks_structure_importer_utilities.$const128$schemaFieldsIndex, ps, el_utilities.make_el_list(index_pfs, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED), index_name, index_constant), physical_schemabase_mt);
                        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const129$indexName, index_constant, index_name), physical_schemabase_mt);
                        if (sksi_sks_structure_importer_utilities.NIL != index_type_constant) {
                            sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const130$indexType, index_constant, index_type_constant), physical_schemabase_mt);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    index_name = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        }
        finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 31768L)
    public static SubLObject sks_ps_add_keys_database(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ps = sks_find_or_create_ps(sks, physical_schemabase_mt);
        if (sksi_sks_structure_importer_utilities.NIL != ps) {
            final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
            try {
                sksi_sks_interaction.$sksi_global_resourcingP$.bind((SubLObject)sksi_sks_structure_importer_utilities.NIL, thread);
                SubLObject connection = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                SubLObject close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                try {
                    connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                    if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                        close_connectionP = (SubLObject)sksi_sks_structure_importer_utilities.T;
                        SubLObject access_path = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                        final SubLObject _prev_bind_0_$50 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym10$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const11$EverythingPSC, thread);
                            access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$50, thread);
                        }
                        if (sksi_sks_structure_importer_utilities.NIL == sksi_access_path.access_path_p(access_path)) {
                            Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str27$Problem_connecting_to_sks__A__cou, sks);
                        }
                        connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                        if (sksi_sks_structure_importer_utilities.NIL == sdbc.sql_open_connection_p(connection)) {
                            Errors.error((SubLObject)sksi_sks_structure_importer_utilities.$str28$Problem_opening_connection_to_sks, sks);
                        }
                        sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                    }
                    sks_ps_add_primary_keys(sks, ps, physical_schemabase_mt);
                    sks_ps_add_exported_keys(sks, ps, physical_schemabase_mt);
                    sks_ps_add_imported_keys(sks, ps, physical_schemabase_mt);
                }
                finally {
                    final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (sksi_sks_structure_importer_utilities.NIL != close_connectionP) {
                            sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                            if (sksi_sks_structure_importer_utilities.NIL != sdbc.sql_open_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                    }
                }
            }
            finally {
                sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
            }
            sks_ps_add_indices(sks, ps, physical_schemabase_mt);
        }
        return ps;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 32302L)
    public static SubLObject sks_create_and_add_ps_for_database_int(final SubLObject sks, final SubLObject field_names, final SubLObject physical_schemabase_mt, SubLObject primary_key) {
        if (primary_key == sksi_sks_structure_importer_utilities.UNPROVIDED) {
            primary_key = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        }
        assert sksi_sks_structure_importer_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert sksi_sks_structure_importer_utilities.NIL != hlmt.hlmt_p(physical_schemabase_mt) : physical_schemabase_mt;
        final SubLObject ps_name = sks_make_physical_schema_name(sks);
        final SubLObject ps = sksi_kb_accessors.sksi_find_or_create(ps_name);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_unary_formula(sksi_sks_structure_importer_utilities.$const79$enumerableSchema, ps), physical_schemabase_mt);
        sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const80$schemaFieldNameList, ps, el_utilities.make_el_list(field_names, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), physical_schemabase_mt);
        if (sksi_sks_structure_importer_utilities.NIL != primary_key) {
            SubLObject primary_key_pfs = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            SubLObject cdolist_list_var = primary_key;
            SubLObject primary_key_field = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
            primary_key_field = cdolist_list_var.first();
            while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
                final SubLObject pf = sksi_find_ps_field(ps, primary_key_field);
                if (sksi_sks_structure_importer_utilities.NIL == pf) {
                    Errors.warn((SubLObject)sksi_sks_structure_importer_utilities.$str104$physical_field_in__A_named__A_not, ps, primary_key_field);
                }
                else {
                    primary_key_pfs = (SubLObject)ConsesLow.cons(pf, primary_key_pfs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                primary_key_field = cdolist_list_var.first();
            }
            if (sksi_sks_structure_importer_utilities.NIL != primary_key_pfs) {
                sksi_kb_accessors.sksi_assert_if_new(el_utilities.make_binary_formula(sksi_sks_structure_importer_utilities.$const40$primaryKey, ps, el_utilities.make_el_list(primary_key_pfs, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)), physical_schemabase_mt);
            }
        }
        return Values.values(ps, (SubLObject)sksi_sks_structure_importer_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 33491L)
    public static SubLObject sksi_find_ps_by_table(final SubLObject table_name, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ps = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym33$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(physical_schemabase_mt, thread);
            final SubLObject pred_var = sksi_sks_structure_importer_utilities.$const16$schemaName_SKS;
            if (sksi_sks_structure_importer_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                final SubLObject _prev_bind_0_$52 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$53 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_sks_structure_importer_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_sks_structure_importer_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_sks_structure_importer_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_sks_structure_importer_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_sks_structure_importer_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    while (sksi_sks_structure_importer_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_sks_structure_importer_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_sks_structure_importer_utilities.$kw39$GAF, (SubLObject)sksi_sks_structure_importer_utilities.NIL, (SubLObject)sksi_sks_structure_importer_utilities.NIL);
                                SubLObject done_var_$54 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                                final SubLObject token_var_$55 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                                while (sksi_sks_structure_importer_utilities.NIL == done_var_$54) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                    final SubLObject valid_$56 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$55.eql(assertion));
                                    if (sksi_sks_structure_importer_utilities.NIL != valid_$56 && cycl_utilities.sentence_arg2(assertion, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED).equal(table_name)) {
                                        ps = cycl_utilities.sentence_arg1(assertion, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
                                    }
                                    done_var_$54 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_structure_importer_utilities.NIL == valid_$56);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_sks_structure_importer_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_structure_importer_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$53, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$52, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ps;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 33900L)
    public static SubLObject sksi_find_ps_field_by_table_column(final SubLObject table_name, final SubLObject column_name, final SubLObject physical_schemabase_mt) {
        final SubLObject ps = sksi_find_ps_by_table(table_name, physical_schemabase_mt);
        if (sksi_sks_structure_importer_utilities.NIL != ps) {
            return sksi_find_ps_field(ps, column_name);
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 34138L)
    public static SubLObject plistlist_indicator_range(final SubLObject plistlist, final SubLObject indicator) {
        SubLObject result = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        SubLObject cdolist_list_var = plistlist;
        SubLObject plist = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        plist = cdolist_list_var.first();
        while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(conses_high.getf(plist, indicator, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            plist = cdolist_list_var.first();
        }
        result = Sequences.nreverse(result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 34354L)
    public static SubLObject plistlist_filter_and_sort(final SubLObject plistlist, final SubLObject filter_indicator, final SubLObject filter_value, final SubLObject filter_test, final SubLObject sort_indicator, final SubLObject sort_test) {
        final SubLObject filtered_plistlist = list_utilities.plistlist_if_getf(plistlist, filter_indicator, filter_value, filter_test);
        final SubLObject sorted_filtered_plistlist = list_utilities.plistlist_sort(filtered_plistlist, sort_indicator, sort_test);
        return sorted_filtered_plistlist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 34708L)
    public static SubLObject object_string_L(final SubLObject object1, final SubLObject object2) {
        return Strings.stringL(print_high.princ_to_string(object1), print_high.princ_to_string(object2), (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp", position = 34830L)
    public static SubLObject repropagate_isas_for_ks_and_each_sub_ks(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_sks_structure_importer_utilities.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        SubLObject cdolist_list_var = sksi_sks_accessors.sks_get(sks, sksi_sks_structure_importer_utilities.$const12$subKS_Direct, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED);
        SubLObject sub_ks = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
        sub_ks = cdolist_list_var.first();
        while (sksi_sks_structure_importer_utilities.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_sks_structure_importer_utilities.$sym33$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(sksi_sks_structure_importer_utilities.$const2$UniversalVocabularyMt, thread);
                final SubLObject pred_var = sksi_sks_structure_importer_utilities.$const0$isa;
                if (sksi_sks_structure_importer_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sub_ks, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sub_ks, (SubLObject)sksi_sks_structure_importer_utilities.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    final SubLObject token_var = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                    while (sksi_sks_structure_importer_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_sks_structure_importer_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_sks_structure_importer_utilities.$kw39$GAF, (SubLObject)sksi_sks_structure_importer_utilities.$kw131$TRUE, (SubLObject)sksi_sks_structure_importer_utilities.NIL);
                                SubLObject done_var_$58 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                                final SubLObject token_var_$59 = (SubLObject)sksi_sks_structure_importer_utilities.NIL;
                                while (sksi_sks_structure_importer_utilities.NIL == done_var_$58) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                    final SubLObject valid_$60 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$59.eql(assertion));
                                    if (sksi_sks_structure_importer_utilities.NIL != valid_$60 && sksi_sks_structure_importer_utilities.NIL != assertions_high.gaf_assertionP(assertion) && assertions_high.gaf_arg2(assertion).equal(sksi_sks_structure_importer_utilities.$const132$StructuredKnowledgeSource)) {
                                        sksi_kb_accessors.sksi_repropagate_assertion(assertion);
                                    }
                                    done_var_$58 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_structure_importer_utilities.NIL == valid_$60);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_structure_importer_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sksi_sks_structure_importer_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_structure_importer_utilities.NIL == valid);
                    }
                }
                if (sksi_sks_structure_importer_utilities.NIL == isa.isaP(sub_ks, sksi_sks_structure_importer_utilities.$const133$StructuredKnowledgeSource_Atomic, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED, (SubLObject)sksi_sks_structure_importer_utilities.UNPROVIDED)) {
                    repropagate_isas_for_ks_and_each_sub_ks(sub_ks);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_ks = cdolist_list_var.first();
        }
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    public static SubLObject declare_sksi_sks_structure_importer_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_physical_structure_decode", "SKS-PHYSICAL-STRUCTURE-DECODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_initial_ke_validate", "SKS-INITIAL-KE-VALIDATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_create_and_add_raw_ls", "SKS-CREATE-AND-ADD-RAW-LS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_ps_add_keys", "SKS-PS-ADD-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_ps_add_pf_properties", "SKS-PS-ADD-PF-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_find_or_create_ps", "SKS-FIND-OR-CREATE-PS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_make_physical_schema_name", "SKS-MAKE-PHYSICAL-SCHEMA-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_find_ps_field", "SKSI-FIND-PS-FIELD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_sks_get_physical_schemas", "SKSI-SKS-GET-PHYSICAL-SCHEMAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_sks_get_all_physical_schemas", "SKSI-SKS-GET-ALL-PHYSICAL-SCHEMAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_physical_schema_get_physical_fields", "SKSI-PHYSICAL-SCHEMA-GET-PHYSICAL-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_physical_schema_get_physical_field_indexicals", "SKSI-PHYSICAL-SCHEMA-GET-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_sks_get_all_physical_schema_table_names", "SKSI-SKS-GET-ALL-PHYSICAL-SCHEMA-TABLE-NAMES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "ignore_table_schema_specification_p", "IGNORE-TABLE-SCHEMA-SPECIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_initial_ke_validate_database", "SKS-INITIAL-KE-VALIDATE-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_gather_physical_database_table_names", "SKS-GATHER-PHYSICAL-DATABASE-TABLE-NAMES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_gather_asserted_table_meta_data_for_table", "SKS-GATHER-ASSERTED-TABLE-META-DATA-FOR-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_get_datatype_string_for_physical_field", "SKS-GET-DATATYPE-STRING-FOR-PHYSICAL-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "cluster_physical_database_table_information_by_schemata", "CLUSTER-PHYSICAL-DATABASE-TABLE-INFORMATION-BY-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_physical_structure_decode_database_table", "SKS-PHYSICAL-STRUCTURE-DECODE-DATABASE-TABLE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_physical_structure_decode_database", "SKS-PHYSICAL-STRUCTURE-DECODE-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_physical_structure_database_row_count", "SKS-PHYSICAL-STRUCTURE-DATABASE-ROW-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_create_and_add_sub_ks_int", "SKS-CREATE-AND-ADD-SUB-KS-INT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_create_and_add_raw_ls_database", "SKS-CREATE-AND-ADD-RAW-LS-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_create_initial_logical_schemas", "SKSI-CREATE-INITIAL-LOGICAL-SCHEMAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_create_logical_schema_for_physical", "SKSI-CREATE-LOGICAL-SCHEMA-FOR-PHYSICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_create_and_add_ps_database", "SKS-CREATE-AND-ADD-PS-DATABASE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_sdbc_column_type_to_cycl", "SKSI-SDBC-COLUMN-TYPE-TO-CYCL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_ps_add_pf_properties_database", "SKS-PS-ADD-PF-PROPERTIES-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_ps_get_schema_name", "SKS-PS-GET-SCHEMA-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_ps_add_primary_keys", "SKS-PS-ADD-PRIMARY-KEYS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_ps_add_exported_keys", "SKS-PS-ADD-EXPORTED-KEYS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_ps_add_imported_keys", "SKS-PS-ADD-IMPORTED-KEYS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_index_type_from_index_type_id", "SKSI-INDEX-TYPE-FROM-INDEX-TYPE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_ps_add_indices", "SKS-PS-ADD-INDICES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_ps_add_keys_database", "SKS-PS-ADD-KEYS-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sks_create_and_add_ps_for_database_int", "SKS-CREATE-AND-ADD-PS-FOR-DATABASE-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_find_ps_by_table", "SKSI-FIND-PS-BY-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "sksi_find_ps_field_by_table_column", "SKSI-FIND-PS-FIELD-BY-TABLE-COLUMN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "plistlist_indicator_range", "PLISTLIST-INDICATOR-RANGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "plistlist_filter_and_sort", "PLISTLIST-FILTER-AND-SORT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "object_string_L", "OBJECT-STRING-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities", "repropagate_isas_for_ks_and_each_sub_ks", "REPROPAGATE-ISAS-FOR-KS-AND-EACH-SUB-KS", 1, 0, false);
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    public static SubLObject init_sksi_sks_structure_importer_utilities_file() {
        sksi_sks_structure_importer_utilities.$sks_required_fields_database$ = SubLFiles.deflexical("*SKS-REQUIRED-FIELDS-DATABASE*", (SubLObject)sksi_sks_structure_importer_utilities.$list18);
        sksi_sks_structure_importer_utilities.$sks_inclusive_catalog_pattern$ = SubLFiles.deflexical("*SKS-INCLUSIVE-CATALOG-PATTERN*", (SubLObject)sksi_sks_structure_importer_utilities.NIL);
        sksi_sks_structure_importer_utilities.$sks_inclusive_schema_pattern$ = SubLFiles.deflexical("*SKS-INCLUSIVE-SCHEMA-PATTERN*", (SubLObject)sksi_sks_structure_importer_utilities.$str21$_);
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_sks_structure_importer_utilities_file() {
        access_macros.register_external_symbol((SubLObject)sksi_sks_structure_importer_utilities.$sym15$SKSI_SKS_GET_ALL_PHYSICAL_SCHEMA_TABLE_NAMES);
        access_macros.register_external_symbol((SubLObject)sksi_sks_structure_importer_utilities.$sym19$_SKS_INCLUSIVE_CATALOG_PATTERN_);
        access_macros.register_external_symbol((SubLObject)sksi_sks_structure_importer_utilities.$sym20$_SKS_INCLUSIVE_SCHEMA_PATTERN_);
        access_macros.register_external_symbol((SubLObject)sksi_sks_structure_importer_utilities.$sym22$IGNORE_TABLE_SCHEMA_SPECIFICATION_P);
        access_macros.register_external_symbol((SubLObject)sksi_sks_structure_importer_utilities.$sym26$SKS_GATHER_PHYSICAL_DATABASE_TABLE_NAMES);
        access_macros.register_external_symbol((SubLObject)sksi_sks_structure_importer_utilities.$sym32$SKS_GATHER_ASSERTED_TABLE_META_DATA_FOR_TABLE);
        access_macros.register_external_symbol((SubLObject)sksi_sks_structure_importer_utilities.$sym56$CLUSTER_PHYSICAL_DATABASE_TABLE_INFORMATION_BY_SCHEMATA);
        access_macros.register_external_symbol((SubLObject)sksi_sks_structure_importer_utilities.$sym60$SKS_PHYSICAL_STRUCTURE_DECODE_DATABASE_TABLE);
        return (SubLObject)sksi_sks_structure_importer_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_sks_structure_importer_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_sks_structure_importer_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_sks_structure_importer_utilities_file();
    }
    
    static {
        me = (SubLFile)new sksi_sks_structure_importer_utilities();
        sksi_sks_structure_importer_utilities.$sks_required_fields_database$ = null;
        sksi_sks_structure_importer_utilities.$sks_inclusive_catalog_pattern$ = null;
        sksi_sks_structure_importer_utilities.$sks_inclusive_schema_pattern$ = null;
        $const0$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const1$PhysicalSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalSchema"));
        $const2$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const3$physicalSchemaSourceMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalSchemaSourceMap"));
        $const4$comment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment"));
        $str5$A_physical_schema_for_ = SubLObjectFactory.makeString("A physical schema for ");
        $str6$_ = SubLObjectFactory.makeString(".");
        $str7$_KS = SubLObjectFactory.makeString("-KS");
        $str8$_PS = SubLObjectFactory.makeString("-PS");
        $const9$PhysicalFieldFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalFieldFn"));
        $sym10$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const11$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const12$subKS_Direct = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subKS-Direct"));
        $const13$physicalFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalFields"));
        $const14$physicalFieldIndexicals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalFieldIndexicals"));
        $sym15$SKSI_SKS_GET_ALL_PHYSICAL_SCHEMA_TABLE_NAMES = SubLObjectFactory.makeSymbol("SKSI-SKS-GET-ALL-PHYSICAL-SCHEMA-TABLE-NAMES");
        $const16$schemaName_SKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaName-SKS"));
        $const17$schemaNameSchema_SKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaNameSchema-SKS"));
        $list18 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("passwordForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("serverOfSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sqlProgramForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("structuredKnowledgeSourceName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subProtocolForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userNameForSKS")));
        $sym19$_SKS_INCLUSIVE_CATALOG_PATTERN_ = SubLObjectFactory.makeSymbol("*SKS-INCLUSIVE-CATALOG-PATTERN*");
        $sym20$_SKS_INCLUSIVE_SCHEMA_PATTERN_ = SubLObjectFactory.makeSymbol("*SKS-INCLUSIVE-SCHEMA-PATTERN*");
        $str21$_ = SubLObjectFactory.makeString("%");
        $sym22$IGNORE_TABLE_SCHEMA_SPECIFICATION_P = SubLObjectFactory.makeSymbol("IGNORE-TABLE-SCHEMA-SPECIFICATION-P");
        $str23$_A_does_not_have_a_corresponding_ = SubLObjectFactory.makeString("~A does not have a corresponding #$definingMt (or legacy #$mappingMt)");
        $const24$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $str25$_A_is_missing__A_data = SubLObjectFactory.makeString("~A is missing ~A data");
        $sym26$SKS_GATHER_PHYSICAL_DATABASE_TABLE_NAMES = SubLObjectFactory.makeSymbol("SKS-GATHER-PHYSICAL-DATABASE-TABLE-NAMES");
        $str27$Problem_connecting_to_sks__A__cou = SubLObjectFactory.makeString("Problem connecting to sks ~A--couldn't determine access path.");
        $str28$Problem_opening_connection_to_sks = SubLObjectFactory.makeString("Problem opening connection to sks ~A.");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("TABLE"));
        $kw30$TABLE_NAME = SubLObjectFactory.makeKeyword("TABLE-NAME");
        $kw31$TABLE_SCHEM = SubLObjectFactory.makeKeyword("TABLE-SCHEM");
        $sym32$SKS_GATHER_ASSERTED_TABLE_META_DATA_FOR_TABLE = SubLObjectFactory.makeSymbol("SKS-GATHER-ASSERTED-TABLE-META-DATA-FOR-TABLE");
        $sym33$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym34$_PS = SubLObjectFactory.makeSymbol("?PS");
        $const35$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SUB-KS"));
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalSchemaSourceMap")), (SubLObject)SubLObjectFactory.makeSymbol("?PS"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB-KS")));
        $const38$physicalSchemaFieldWithName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalSchemaFieldWithName"));
        $kw39$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const40$primaryKey = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("primaryKey"));
        $const41$nonNullFields = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonNullFields"));
        $sym42$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const43$fieldDataType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDataType"));
        $str44$unknown = SubLObjectFactory.makeString("unknown");
        $list45 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProgramRepresentationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarDay")));
        $str46$date_13_ = SubLObjectFactory.makeString("date(13)");
        $const47$DecimalRealNumberOfMaximumPrecisi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalRealNumberOfMaximumPrecisionFn"));
        $str48$numeric_ = SubLObjectFactory.makeString("numeric(");
        $str49$_ = SubLObjectFactory.makeString(")");
        $const50$StringOfMaximumLengthFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StringOfMaximumLengthFn"));
        $str51$varchar_ = SubLObjectFactory.makeString("varchar(");
        $list52 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SignedFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("4ByteIntegerDatatype")));
        $str53$int4_10_ = SubLObjectFactory.makeString("int4(10)");
        $const54$defaultFieldValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultFieldValue"));
        $str55$_default_ = SubLObjectFactory.makeString(":default=");
        $sym56$CLUSTER_PHYSICAL_DATABASE_TABLE_INFORMATION_BY_SCHEMATA = SubLObjectFactory.makeSymbol("CLUSTER-PHYSICAL-DATABASE-TABLE-INFORMATION-BY-SCHEMATA");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-INFO"));
        $sym58$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym59$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym60$SKS_PHYSICAL_STRUCTURE_DECODE_DATABASE_TABLE = SubLObjectFactory.makeSymbol("SKS-PHYSICAL-STRUCTURE-DECODE-DATABASE-TABLE");
        $str61$select_count____from_ = SubLObjectFactory.makeString("select count(*) from ");
        $sym62$NON_EMPTY_STRING_ = SubLObjectFactory.makeSymbol("NON-EMPTY-STRING?");
        $sym63$SKS_P = SubLObjectFactory.makeSymbol("SKS-P");
        $sym64$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym65$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym66$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $str67$Couldn_t_find___sksPhysicalSchema = SubLObjectFactory.makeString("Couldn't find #$sksPhysicalSchemaDescriptionMt assertion for ~A in #$UniversalVocabularyMt");
        $const68$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $str69$_LS = SubLObjectFactory.makeString("-LS");
        $const70$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $const71$ObjectDefiningSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObjectDefiningSchema"));
        $const72$LogicalSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalSchema"));
        $const73$logicalPhysicalSchemaMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalPhysicalSchemaMap"));
        $str74$A_logical_schema_corresponding_to = SubLObjectFactory.makeString("A logical schema corresponding to a portion of the #$");
        $str75$_physical_schema_ = SubLObjectFactory.makeString(" physical schema.");
        $const76$structuredKnowledgeSourceName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("structuredKnowledgeSourceName"));
        $str77$ = SubLObjectFactory.makeString("");
        $kw78$COLUMN_NAME = SubLObjectFactory.makeKeyword("COLUMN-NAME");
        $const79$enumerableSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("enumerableSchema"));
        $const80$schemaFieldNameList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldNameList"));
        $sym81$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw82$NULL = SubLObjectFactory.makeKeyword("NULL");
        $const83$JDBCDatatypeDescribedByFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JDBCDatatypeDescribedByFn"));
        $sym84$_WHAT = SubLObjectFactory.makeSymbol("?WHAT");
        $const85$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $const86$JDBCDataMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JDBCDataMt"));
        $kw87$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw88$SHALLOW = SubLObjectFactory.makeKeyword("SHALLOW");
        $kw89$NEW_TERMS_ALLOWED_ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $str90$No_better_type_found_for__A__usin = SubLObjectFactory.makeString("No better type found for ~A; using it.");
        $str91$Also__failed_to_reify__A_ = SubLObjectFactory.makeString("Also, failed to reify ~A.");
        $kw92$IS_NULLABLE = SubLObjectFactory.makeKeyword("IS-NULLABLE");
        $str93$NO = SubLObjectFactory.makeString("NO");
        $const94$nonNullFieldList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonNullFieldList"));
        $kw95$DATA_TYPE = SubLObjectFactory.makeKeyword("DATA-TYPE");
        $kw96$TYPE_NAME = SubLObjectFactory.makeKeyword("TYPE-NAME");
        $kw97$COLUMN_SIZE = SubLObjectFactory.makeKeyword("COLUMN-SIZE");
        $kw98$DECIMAL_DIGITS = SubLObjectFactory.makeKeyword("DECIMAL-DIGITS");
        $kw99$COLUMN_DEF = SubLObjectFactory.makeKeyword("COLUMN-DEF");
        $const100$IntegerComputerNumber = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntegerComputerNumber"));
        $const101$DoubleFloatObject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DoubleFloatObject"));
        $kw102$KEY_SEQ = SubLObjectFactory.makeKeyword("KEY-SEQ");
        $sym103$_ = SubLObjectFactory.makeSymbol("<");
        $str104$physical_field_in__A_named__A_not = SubLObjectFactory.makeString("physical field in ~A named ~A not found.");
        $kw105$FK_NAME = SubLObjectFactory.makeKeyword("FK-NAME");
        $const106$foreignKeyMap = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("foreignKeyMap"));
        $kw107$UPDATE_RULE = SubLObjectFactory.makeKeyword("UPDATE-RULE");
        $kw108$DELETE_RULE = SubLObjectFactory.makeKeyword("DELETE-RULE");
        $kw109$PKCOLUMN_NAME = SubLObjectFactory.makeKeyword("PKCOLUMN-NAME");
        $kw110$FKTABLE_NAME = SubLObjectFactory.makeKeyword("FKTABLE-NAME");
        $kw111$FKCOLUMN_NAME = SubLObjectFactory.makeKeyword("FKCOLUMN-NAME");
        $const112$foreignKeyMap_Cascade = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("foreignKeyMap-Cascade"));
        $const113$foreignKeyMap_Restrict = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("foreignKeyMap-Restrict"));
        $str114$physical_field_in__A_table__A_nam = SubLObjectFactory.makeString("physical field in ~A table ~A named ~A not found.");
        $kw115$PKTABLE_NAME = SubLObjectFactory.makeKeyword("PKTABLE-NAME");
        $const116$BTree_DataStructure = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BTree-DataStructure"));
        $const117$HashTable_DataStructure = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HashTable-DataStructure"));
        $kw118$INDEX_NAME = SubLObjectFactory.makeKeyword("INDEX-NAME");
        $kw119$ORDINAL_POSITION = SubLObjectFactory.makeKeyword("ORDINAL-POSITION");
        $sym120$OBJECT_STRING__ = SubLObjectFactory.makeSymbol("OBJECT-STRING-<");
        $kw121$NON_UNIQUE = SubLObjectFactory.makeKeyword("NON-UNIQUE");
        $kw122$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $str123$true = SubLObjectFactory.makeString("true");
        $str124$KS = SubLObjectFactory.makeString("KS");
        $str125$_TheIndex = SubLObjectFactory.makeString("-TheIndex");
        $const126$uniqueFieldList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("uniqueFieldList"));
        $const127$IndexDataStructure = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndexDataStructure"));
        $const128$schemaFieldsIndex = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldsIndex"));
        $const129$indexName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexName"));
        $const130$indexType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexType"));
        $kw131$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const132$StructuredKnowledgeSource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StructuredKnowledgeSource"));
        $const133$StructuredKnowledgeSource_Atomic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StructuredKnowledgeSource-Atomic"));
    }
}

/*

	Total time: 816 ms
	 synthetic 
*/