package com.cyc.cycjava.cycl.sksi;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class semantic_etl_bus extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.semantic_etl_bus";
    public static final String myFingerPrint = "21c79afd1d15c01f1f72091ab14a8fb1c00fee6f2c4b23545c15a8db7a1e5dc4";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 1164L)
    public static SubLSymbol $semantic_etl_debugP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 2536L)
    public static SubLSymbol $database_output_specs$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 2695L)
    private static SubLSymbol $database_output_specs_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 4916L)
    private static SubLSymbol $semantic_etl_fuse_databases_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 6377L)
    public static SubLSymbol $find_corresponding_item_in_semantics_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 7268L)
    public static SubLSymbol $semantic_object_comparison_name_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLSymbol $dtp_semantics$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLSymbol $dtp_table_semantics$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 20635L)
    private static SubLSymbol $semantic_etl_table_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLSymbol $dtp_foreign_key_constraint$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLSymbol $dtp_primary_key_constraint$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLSymbol $dtp_column_semantics$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLSymbol $dtp_value_semantics$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75286L)
    private static SubLSymbol $db_output_spec_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLSymbol $dtp_database_output_spec$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 77612L)
    public static SubLSymbol $recipe_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 81701L)
    public static SubLSymbol $semantic_recipe_step_p_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 81848L)
    public static SubLSymbol $empty_semantic_recipe_step_p_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 81928L)
    public static SubLSymbol $set_semantic_recipe_step_output_spec_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82040L)
    public static SubLSymbol $semantic_recipe_append_to_drops_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82179L)
    public static SubLSymbol $semantic_recipe_append_to_adds_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82311L)
    public static SubLSymbol $semantic_recipe_remove_from_drops_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82454L)
    public static SubLSymbol $semantic_recipe_remove_from_adds_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82593L)
    public static SubLSymbol $set_semantic_recipe_step_column_correspondence_list_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82822L)
    public static SubLSymbol $semantic_recipe_step_column_correspondence_list_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83007L)
    public static SubLSymbol $set_semantic_recipe_step_sql_start_index_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83149L)
    public static SubLSymbol $set_semantic_recipe_step_sql_end_index_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83287L)
    public static SubLSymbol $semantic_recipe_step_copy_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLSymbol $dtp_table_merger$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLSymbol $dtp_column_merger$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96968L)
    public static SubLSymbol $dtp_sql_conjunction$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97630L)
    public static SubLSymbol $dtp_sql_disjunction$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLSymbol $dtp_sql_copy_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLSymbol $dtp_sql_insert_into$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLSymbol $dtp_sql_select_from$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLSymbol $dtp_sql_except$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLSymbol $dtp_sql_alias$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLSymbol $dtp_sql_column_equal$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLSymbol $dtp_sql_is_null$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLSymbol $dtp_sql_not_in$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLSymbol $dtp_sql_inner_join$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLSymbol $dtp_sql_left_join$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLSymbol $dtp_sql_union$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLSymbol $dtp_sql_alter_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLSymbol $dtp_sql_add_column$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110335L)
    public static SubLSymbol $dtp_sql_drop_column$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLSymbol $dtp_sql_rename_column$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111608L)
    public static SubLSymbol $dtp_sql_add_constraint$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112283L)
    public static SubLSymbol $dtp_sql_drop_constraint$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLSymbol $dtp_sql_fk_column_constraint$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLSymbol $dtp_sql_fk_table_constraint$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLSymbol $dtp_sql_update$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 115907L)
    public static SubLSymbol $dtp_sql_drop_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 118564L)
    private static SubLSymbol $access_path_map$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 119749L)
    private static SubLSymbol $bln1_access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 119794L)
    private static SubLSymbol $bln2_access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 119837L)
    private static SubLSymbol $usgs_access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 119880L)
    private static SubLSymbol $nga_access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 119922L)
    private static SubLSymbol $gndb_access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 119965L)
    private static SubLSymbol $bathymetric_data_access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 120020L)
    private static SubLSymbol $bathymetric_header_access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 120077L)
    private static SubLSymbol $sporting_goods_access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 120130L)
    private static SubLSymbol $northwind_access_path$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CDOLIST;
    private static final SubLSymbol $sym2$SEMANTICS_TABLE_SEMANTICS_LIST;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$TABLE_SEMANTICS_COLUMN_CONSTRAINTS;
    private static final SubLSymbol $kw5$INITIALIZED;
    private static final SubLSymbol $sym6$_DATABASE_OUTPUT_SPECS_;
    private static final SubLSymbol $sym7$_DATABASE_OUTPUT_SPECS_LOCK_;
    private static final SubLString $str8$Database_Output_Specs;
    private static final SubLSymbol $sym9$ACCESS_PATH_P;
    private static final SubLString $str10$Please_select_an_output_specifica;
    private static final SubLString $str11$_________________________________;
    private static final SubLSymbol $sym12$Q;
    private static final SubLString $str13$There_is_no_output_specification_;
    private static final SubLSymbol $sym14$SEMANTIC_ETL_FUSE_DATABASES;
    private static final SubLString $str15$Can_only_fuse_exactly_two_databas;
    private static final SubLSymbol $sym16$_SEMANTIC_ETL_FUSE_DATABASES_CACHING_STATE_;
    private static final SubLInteger $int17$256;
    private static final SubLString $str18$Don_t_know_how_to_find_a__S_in_a_;
    private static final SubLString $str19$don_t_know_how_to_name__S__;
    private static final SubLSymbol $sym20$SEMANTICS;
    private static final SubLSymbol $sym21$SEMANTICS_P;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$PRINT_SEMANTICS;
    private static final SubLSymbol $sym27$SEMANTICS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$SEMANT_ACCESS_PATH;
    private static final SubLSymbol $sym30$_CSETF_SEMANT_ACCESS_PATH;
    private static final SubLSymbol $sym31$SEMANT_TABLE_SEMANTICS_LIST;
    private static final SubLSymbol $sym32$_CSETF_SEMANT_TABLE_SEMANTICS_LIST;
    private static final SubLSymbol $sym33$SEMANT_TABLE_ALIASES;
    private static final SubLSymbol $sym34$_CSETF_SEMANT_TABLE_ALIASES;
    private static final SubLSymbol $sym35$SEMANT_DICT;
    private static final SubLSymbol $sym36$_CSETF_SEMANT_DICT;
    private static final SubLSymbol $sym37$SEMANT_DROPPED_ITEMS;
    private static final SubLSymbol $sym38$_CSETF_SEMANT_DROPPED_ITEMS;
    private static final SubLSymbol $sym39$SEMANT_OUTPUT_SPEC;
    private static final SubLSymbol $sym40$_CSETF_SEMANT_OUTPUT_SPEC;
    private static final SubLSymbol $kw41$ACCESS_PATH;
    private static final SubLSymbol $kw42$TABLE_SEMANTICS_LIST;
    private static final SubLSymbol $kw43$TABLE_ALIASES;
    private static final SubLSymbol $kw44$DICT;
    private static final SubLSymbol $kw45$DROPPED_ITEMS;
    private static final SubLSymbol $kw46$OUTPUT_SPEC;
    private static final SubLString $str47$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw48$BEGIN;
    private static final SubLSymbol $sym49$MAKE_SEMANTICS;
    private static final SubLSymbol $kw50$SLOT;
    private static final SubLSymbol $kw51$END;
    private static final SubLSymbol $sym52$VISIT_DEFSTRUCT_OBJECT_SEMANTICS_METHOD;
    private static final SubLString $str53$_SEMANTICS____a_____a_;
    private static final SubLSymbol $sym54$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym55$TABLE_SEMANTICS_P;
    private static final SubLString $str56$don_t_know_how_to_handle__S;
    private static final SubLString $str57$Table__S_is_pointed_to_by__A_and_;
    private static final SubLSymbol $sym58$TABLE_SEMANTICS_TABLE_NAME;
    private static final SubLSymbol $sym59$COLUMN_SEMANTICS_P;
    private static final SubLSymbol $sym60$PRIMARY_KEY_CONSTRAINT_P;
    private static final SubLSymbol $sym61$FOREIGN_KEY_CONSTRAINT_P;
    private static final SubLSymbol $sym62$TABLE_SEMANTICS;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$PRINT_TABLE_SEMANTICS;
    private static final SubLSymbol $sym68$TABLE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$T_SEMANT_TABLE_ID;
    private static final SubLSymbol $sym71$_CSETF_T_SEMANT_TABLE_ID;
    private static final SubLSymbol $sym72$T_SEMANT_TABLE_NAME;
    private static final SubLSymbol $sym73$_CSETF_T_SEMANT_TABLE_NAME;
    private static final SubLSymbol $sym74$T_SEMANT_SOURCE_SEMANTICS;
    private static final SubLSymbol $sym75$_CSETF_T_SEMANT_SOURCE_SEMANTICS;
    private static final SubLSymbol $sym76$T_SEMANT_SEMANTICS;
    private static final SubLSymbol $sym77$_CSETF_T_SEMANT_SEMANTICS;
    private static final SubLSymbol $sym78$T_SEMANT_POINTS_TO_TABLE_IDS;
    private static final SubLSymbol $sym79$_CSETF_T_SEMANT_POINTS_TO_TABLE_IDS;
    private static final SubLSymbol $sym80$T_SEMANT_POINTED_TO_BY_TABLE_IDS;
    private static final SubLSymbol $sym81$_CSETF_T_SEMANT_POINTED_TO_BY_TABLE_IDS;
    private static final SubLSymbol $sym82$T_SEMANT_TABLE_PARSES;
    private static final SubLSymbol $sym83$_CSETF_T_SEMANT_TABLE_PARSES;
    private static final SubLSymbol $sym84$T_SEMANT_COLUMN_SEMANTICS_LIST;
    private static final SubLSymbol $sym85$_CSETF_T_SEMANT_COLUMN_SEMANTICS_LIST;
    private static final SubLSymbol $sym86$T_SEMANT_PRIMARY_KEY_COLUMNS;
    private static final SubLSymbol $sym87$_CSETF_T_SEMANT_PRIMARY_KEY_COLUMNS;
    private static final SubLSymbol $sym88$T_SEMANT_COLUMN_CONSTRAINTS;
    private static final SubLSymbol $sym89$_CSETF_T_SEMANT_COLUMN_CONSTRAINTS;
    private static final SubLSymbol $kw90$TABLE_ID;
    private static final SubLSymbol $kw91$TABLE_NAME;
    private static final SubLSymbol $kw92$SOURCE_SEMANTICS;
    private static final SubLSymbol $kw93$SEMANTICS;
    private static final SubLSymbol $kw94$POINTS_TO_TABLE_IDS;
    private static final SubLSymbol $kw95$POINTED_TO_BY_TABLE_IDS;
    private static final SubLSymbol $kw96$TABLE_PARSES;
    private static final SubLSymbol $kw97$COLUMN_SEMANTICS_LIST;
    private static final SubLSymbol $kw98$PRIMARY_KEY_COLUMNS;
    private static final SubLSymbol $kw99$COLUMN_CONSTRAINTS;
    private static final SubLSymbol $sym100$MAKE_TABLE_SEMANTICS;
    private static final SubLSymbol $sym101$VISIT_DEFSTRUCT_OBJECT_TABLE_SEMANTICS_METHOD;
    private static final SubLString $str102$_TABLE__a__s___a__a___ref__a_ref_;
    private static final SubLSymbol $sym103$_SEMANTIC_ETL_TABLE_ISG_;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$TABLE_SEMANTICS_COLUMN_SEMANTICS_LIST;
    private static final SubLSymbol $sym106$STRINGP;
    private static final SubLSymbol $sym107$COLUMN_SEMANTICS_COLUMN_NAME;
    private static final SubLSymbol $sym108$COPY_COLUMN_CONSTRAINT;
    private static final SubLSymbol $sym109$INTEGERP;
    private static final SubLSymbol $sym110$LISTP;
    private static final SubLSymbol $sym111$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_TABLE_SEMANTICS_METHOD;
    private static final SubLSymbol $sym112$SEMANTIC_OBJECT_COMPARISON_NAME_TABLE_SEMANTICS_METHOD;
    private static final SubLSymbol $sym113$FOREIGN_KEY_CONSTRAINT_CONSTRAINED_COLUMN;
    private static final SubLSymbol $sym114$CONTENT_COLUMN_;
    private static final SubLSymbol $sym115$COLUMN_CONSTRAINT_P;
    private static final SubLString $str116$Column__S_is_pointed_to_by__A_and;
    private static final SubLString $str117$don_t_know_how_to_remove_constrai;
    private static final SubLString $str118$Don_t_know_how_to_copy_constraint;
    private static final SubLSymbol $sym119$FOREIGN_KEY_CONSTRAINT;
    private static final SubLList $list120;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLList $list123;
    private static final SubLSymbol $sym124$PRINT_FOREIGN_KEY_CONSTRAINT;
    private static final SubLSymbol $sym125$FOREIGN_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$FK_CONSTRAINT_CONSTRAINT_NAME;
    private static final SubLSymbol $sym128$_CSETF_FK_CONSTRAINT_CONSTRAINT_NAME;
    private static final SubLSymbol $sym129$FK_CONSTRAINT_CONSTRAINED_COLUMN;
    private static final SubLSymbol $sym130$_CSETF_FK_CONSTRAINT_CONSTRAINED_COLUMN;
    private static final SubLSymbol $sym131$FK_CONSTRAINT_CONSTRAINING_TABLE;
    private static final SubLSymbol $sym132$_CSETF_FK_CONSTRAINT_CONSTRAINING_TABLE;
    private static final SubLSymbol $sym133$FK_CONSTRAINT_CONSTRAINING_COLUMN;
    private static final SubLSymbol $sym134$_CSETF_FK_CONSTRAINT_CONSTRAINING_COLUMN;
    private static final SubLSymbol $kw135$CONSTRAINT_NAME;
    private static final SubLSymbol $kw136$CONSTRAINED_COLUMN;
    private static final SubLSymbol $kw137$CONSTRAINING_TABLE;
    private static final SubLSymbol $kw138$CONSTRAINING_COLUMN;
    private static final SubLSymbol $sym139$MAKE_FOREIGN_KEY_CONSTRAINT;
    private static final SubLSymbol $sym140$VISIT_DEFSTRUCT_OBJECT_FOREIGN_KEY_CONSTRAINT_METHOD;
    private static final SubLString $str141$_FK_CONSTRAINT___a_____A__A__;
    private static final SubLSymbol $sym142$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_FOREIGN_KEY_CONSTRAINT_METHO;
    private static final SubLString $str143$_;
    private static final SubLString $str144$__;
    private static final SubLSymbol $sym145$SEMANTIC_OBJECT_COMPARISON_NAME_FOREIGN_KEY_CONSTRAINT_METHOD;
    private static final SubLSymbol $sym146$PRIMARY_KEY_CONSTRAINT;
    private static final SubLList $list147;
    private static final SubLList $list148;
    private static final SubLList $list149;
    private static final SubLList $list150;
    private static final SubLSymbol $sym151$PRINT_PRIMARY_KEY_CONSTRAINT;
    private static final SubLSymbol $sym152$PRIMARY_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$PK_CONSTRAINT_CONSTRAINT_NAME;
    private static final SubLSymbol $sym155$_CSETF_PK_CONSTRAINT_CONSTRAINT_NAME;
    private static final SubLSymbol $sym156$PK_CONSTRAINT_CONSTRAINT_TYPE;
    private static final SubLSymbol $sym157$_CSETF_PK_CONSTRAINT_CONSTRAINT_TYPE;
    private static final SubLSymbol $sym158$PK_CONSTRAINT_CONSTRAINED_COLUMN;
    private static final SubLSymbol $sym159$_CSETF_PK_CONSTRAINT_CONSTRAINED_COLUMN;
    private static final SubLSymbol $kw160$CONSTRAINT_TYPE;
    private static final SubLSymbol $sym161$MAKE_PRIMARY_KEY_CONSTRAINT;
    private static final SubLSymbol $sym162$VISIT_DEFSTRUCT_OBJECT_PRIMARY_KEY_CONSTRAINT_METHOD;
    private static final SubLString $str163$_PK_CONSTRAINT___a_;
    private static final SubLSymbol $sym164$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_PRIMARY_KEY_CONSTRAINT_METHO;
    private static final SubLString $str165$pk_;
    private static final SubLSymbol $sym166$SEMANTIC_OBJECT_COMPARISON_NAME_PRIMARY_KEY_CONSTRAINT_METHOD;
    private static final SubLSymbol $sym167$COLUMN_SEMANTICS;
    private static final SubLList $list168;
    private static final SubLList $list169;
    private static final SubLList $list170;
    private static final SubLList $list171;
    private static final SubLSymbol $sym172$PRINT_COLUMN_SEMANTICS;
    private static final SubLSymbol $sym173$COLUMN_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$C_SEMANT_COLUMN_NAME;
    private static final SubLSymbol $sym176$_CSETF_C_SEMANT_COLUMN_NAME;
    private static final SubLSymbol $sym177$C_SEMANT_COLUMN_PARSES;
    private static final SubLSymbol $sym178$_CSETF_C_SEMANT_COLUMN_PARSES;
    private static final SubLSymbol $sym179$C_SEMANT_TABLE_SEMANTICS;
    private static final SubLSymbol $sym180$_CSETF_C_SEMANT_TABLE_SEMANTICS;
    private static final SubLSymbol $sym181$C_SEMANT_VALUE_SEMANTICS_LIST;
    private static final SubLSymbol $sym182$_CSETF_C_SEMANT_VALUE_SEMANTICS_LIST;
    private static final SubLSymbol $sym183$C_SEMANT_COLUMN_TYPE;
    private static final SubLSymbol $sym184$_CSETF_C_SEMANT_COLUMN_TYPE;
    private static final SubLSymbol $sym185$C_SEMANT_COLUMN_SIZE;
    private static final SubLSymbol $sym186$_CSETF_C_SEMANT_COLUMN_SIZE;
    private static final SubLSymbol $kw187$COLUMN_NAME;
    private static final SubLSymbol $kw188$COLUMN_PARSES;
    private static final SubLSymbol $kw189$TABLE_SEMANTICS;
    private static final SubLSymbol $kw190$VALUE_SEMANTICS_LIST;
    private static final SubLSymbol $kw191$COLUMN_TYPE;
    private static final SubLSymbol $kw192$COLUMN_SIZE;
    private static final SubLSymbol $sym193$MAKE_COLUMN_SEMANTICS;
    private static final SubLSymbol $sym194$VISIT_DEFSTRUCT_OBJECT_COLUMN_SEMANTICS_METHOD;
    private static final SubLString $str195$_COLUMN___a__a__A__A__;
    private static final SubLSymbol $kw196$UNK;
    private static final SubLList $list197;
    private static final SubLSymbol $sym198$COLUMN_SEMANTICS_VALUE_SEMANTICS_LIST;
    private static final SubLString $str199$;
    private static final SubLString $str200$_;
    private static final SubLString $str201$_;
    private static final SubLSymbol $sym202$VALUE_SEMANTICS_P;
    private static final SubLSymbol $sym203$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_COLUMN_SEMANTICS_METHOD;
    private static final SubLString $str204$col_;
    private static final SubLSymbol $sym205$SEMANTIC_OBJECT_COMPARISON_NAME_COLUMN_SEMANTICS_METHOD;
    private static final SubLSymbol $sym206$VALUE_SEMANTICS;
    private static final SubLList $list207;
    private static final SubLList $list208;
    private static final SubLList $list209;
    private static final SubLList $list210;
    private static final SubLSymbol $sym211$PRINT_VALUE_SEMANTICS;
    private static final SubLSymbol $sym212$VALUE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$V_SEMANT_VALUE;
    private static final SubLSymbol $sym215$_CSETF_V_SEMANT_VALUE;
    private static final SubLSymbol $sym216$V_SEMANT_VALUE_PARSES;
    private static final SubLSymbol $sym217$_CSETF_V_SEMANT_VALUE_PARSES;
    private static final SubLSymbol $kw218$VALUE;
    private static final SubLSymbol $kw219$VALUE_PARSES;
    private static final SubLSymbol $sym220$MAKE_VALUE_SEMANTICS;
    private static final SubLSymbol $sym221$VISIT_DEFSTRUCT_OBJECT_VALUE_SEMANTICS_METHOD;
    private static final SubLString $str222$_VALUE___s__a_;
    private static final SubLSymbol $kw223$NONE;
    private static final SubLSymbol $sym224$_DB_OUTPUT_SPEC_ISG_;
    private static final SubLSymbol $sym225$DATABASE_OUTPUT_SPEC;
    private static final SubLSymbol $sym226$DATABASE_OUTPUT_SPEC_P;
    private static final SubLList $list227;
    private static final SubLList $list228;
    private static final SubLList $list229;
    private static final SubLList $list230;
    private static final SubLSymbol $sym231$PRINT_DATABASE_OUTPUT_SPEC;
    private static final SubLSymbol $sym232$DATABASE_OUTPUT_SPEC_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list233;
    private static final SubLSymbol $sym234$DB_OUTPUT_SPEC_ID;
    private static final SubLSymbol $sym235$_CSETF_DB_OUTPUT_SPEC_ID;
    private static final SubLSymbol $sym236$DB_OUTPUT_SPEC_SEMANTICS1;
    private static final SubLSymbol $sym237$_CSETF_DB_OUTPUT_SPEC_SEMANTICS1;
    private static final SubLSymbol $sym238$DB_OUTPUT_SPEC_SEMANTICS2;
    private static final SubLSymbol $sym239$_CSETF_DB_OUTPUT_SPEC_SEMANTICS2;
    private static final SubLSymbol $sym240$DB_OUTPUT_SPEC_RECIPE;
    private static final SubLSymbol $sym241$_CSETF_DB_OUTPUT_SPEC_RECIPE;
    private static final SubLSymbol $sym242$DB_OUTPUT_SPEC_SEMANTICS;
    private static final SubLSymbol $sym243$_CSETF_DB_OUTPUT_SPEC_SEMANTICS;
    private static final SubLSymbol $sym244$DB_OUTPUT_SPEC_SEMANTIC_RECIPE;
    private static final SubLSymbol $sym245$_CSETF_DB_OUTPUT_SPEC_SEMANTIC_RECIPE;
    private static final SubLSymbol $kw246$ID;
    private static final SubLSymbol $kw247$SEMANTICS1;
    private static final SubLSymbol $kw248$SEMANTICS2;
    private static final SubLSymbol $kw249$RECIPE;
    private static final SubLSymbol $kw250$SEMANTIC_RECIPE;
    private static final SubLSymbol $sym251$MAKE_DATABASE_OUTPUT_SPEC;
    private static final SubLSymbol $sym252$VISIT_DEFSTRUCT_OBJECT_DATABASE_OUTPUT_SPEC_METHOD;
    private static final SubLString $str253$_DB_OUTPUT_;
    private static final SubLString $str254$_;
    private static final SubLString $str255$Sem_Recipe__;
    private static final SubLString $str256$_;
    private static final SubLString $str257$____________________________;
    private static final SubLString $str258$unable_to_drop__A_from__A;
    private static final SubLString $str259$unable_to_add__A_to__A;
    private static final SubLString $str260$unable_to_remove__A_from__A;
    private static final SubLString $str261$unable_to_set_column_corespondenc;
    private static final SubLString $str262$unable_to_get_column_corespondenc;
    private static final SubLString $str263$unable_to_set_start_index_of__A_t;
    private static final SubLString $str264$unable_to_set_end_index_of__A_to_;
    private static final SubLString $str265$Don_t_know_how_to_copy__S;
    private static final SubLSymbol $sym266$TABLE_MERGER;
    private static final SubLSymbol $sym267$TABLE_MERGER_P;
    private static final SubLList $list268;
    private static final SubLList $list269;
    private static final SubLList $list270;
    private static final SubLList $list271;
    private static final SubLSymbol $sym272$PRINT_TABLE_MERGER;
    private static final SubLSymbol $sym273$TABLE_MERGER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list274;
    private static final SubLSymbol $sym275$TABLE_MERGER_ID;
    private static final SubLSymbol $sym276$_CSETF_TABLE_MERGER_ID;
    private static final SubLSymbol $sym277$TABLE_MERGER_OUTPUT_SPEC;
    private static final SubLSymbol $sym278$_CSETF_TABLE_MERGER_OUTPUT_SPEC;
    private static final SubLSymbol $sym279$TABLE_MERGER_SOURCES;
    private static final SubLSymbol $sym280$_CSETF_TABLE_MERGER_SOURCES;
    private static final SubLSymbol $sym281$TABLE_MERGER_TARGET;
    private static final SubLSymbol $sym282$_CSETF_TABLE_MERGER_TARGET;
    private static final SubLSymbol $sym283$TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST;
    private static final SubLSymbol $sym284$_CSETF_TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST;
    private static final SubLSymbol $sym285$TABLE_MERGER_ADDED;
    private static final SubLSymbol $sym286$_CSETF_TABLE_MERGER_ADDED;
    private static final SubLSymbol $sym287$TABLE_MERGER_DROPPED;
    private static final SubLSymbol $sym288$_CSETF_TABLE_MERGER_DROPPED;
    private static final SubLSymbol $sym289$TABLE_MERGER_SQL_START_INDEX;
    private static final SubLSymbol $sym290$_CSETF_TABLE_MERGER_SQL_START_INDEX;
    private static final SubLSymbol $sym291$TABLE_MERGER_SQL_END_INDEX;
    private static final SubLSymbol $sym292$_CSETF_TABLE_MERGER_SQL_END_INDEX;
    private static final SubLSymbol $kw293$SOURCES;
    private static final SubLSymbol $kw294$TARGET;
    private static final SubLSymbol $kw295$COLUMN_CORRESPONDENCE_LIST;
    private static final SubLSymbol $kw296$ADDED;
    private static final SubLSymbol $kw297$DROPPED;
    private static final SubLSymbol $kw298$SQL_START_INDEX;
    private static final SubLSymbol $kw299$SQL_END_INDEX;
    private static final SubLSymbol $sym300$MAKE_TABLE_MERGER;
    private static final SubLSymbol $sym301$VISIT_DEFSTRUCT_OBJECT_TABLE_MERGER_METHOD;
    private static final SubLString $str302$_TABLE_MERGER__A_;
    private static final SubLString $str303$____;
    private static final SubLString $str304$_adds__;
    private static final SubLString $str305$_drops__;
    private static final SubLString $str306$_SQL___A__A_;
    private static final SubLSymbol $sym307$SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD;
    private static final SubLSymbol $sym308$EMPTY_SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD;
    private static final SubLSymbol $sym309$SEMANTIC_RECIPE_APPEND_TO_DROPS_TABLE_MERGER_METHOD;
    private static final SubLSymbol $sym310$SEMANTIC_RECIPE_APPEND_TO_ADDS_TABLE_MERGER_METHOD;
    private static final SubLSymbol $sym311$SEMANTIC_RECIPE_REMOVE_FROM_DROPS_TABLE_MERGER_METHOD;
    private static final SubLSymbol $sym312$SEMANTIC_RECIPE_REMOVE_FROM_ADDS_TABLE_MERGER_METHOD;
    private static final SubLSymbol $sym313$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_;
    private static final SubLSymbol $sym314$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_METH;
    private static final SubLSymbol $sym315$SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_TABLE_MERGER_METHOD;
    private static final SubLSymbol $sym316$SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_TABLE_MERGER_METHOD;
    private static final SubLSymbol $sym317$SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_TABLE_MERGER_METHOD;
    private static final SubLList $list318;
    private static final SubLString $str319$unable_to_find_correspondent__add;
    private static final SubLString $str320$unable_to_find_correspondent__dro;
    private static final SubLSymbol $sym321$SEMANTIC_RECIPE_STEP_COPY_TABLE_MERGER_METHOD;
    private static final SubLSymbol $sym322$COLUMN_MERGER;
    private static final SubLSymbol $sym323$COLUMN_MERGER_P;
    private static final SubLList $list324;
    private static final SubLList $list325;
    private static final SubLList $list326;
    private static final SubLList $list327;
    private static final SubLSymbol $sym328$PRINT_COLUMN_MERGER;
    private static final SubLSymbol $sym329$COLUMN_MERGER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list330;
    private static final SubLSymbol $sym331$COLUMN_MERGER_OUTPUT_SPEC;
    private static final SubLSymbol $sym332$_CSETF_COLUMN_MERGER_OUTPUT_SPEC;
    private static final SubLSymbol $sym333$COLUMN_MERGER_SOURCES;
    private static final SubLSymbol $sym334$_CSETF_COLUMN_MERGER_SOURCES;
    private static final SubLSymbol $sym335$COLUMN_MERGER_TARGET;
    private static final SubLSymbol $sym336$_CSETF_COLUMN_MERGER_TARGET;
    private static final SubLSymbol $sym337$COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST;
    private static final SubLSymbol $sym338$_CSETF_COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST;
    private static final SubLSymbol $sym339$COLUMN_MERGER_ADDED;
    private static final SubLSymbol $sym340$_CSETF_COLUMN_MERGER_ADDED;
    private static final SubLSymbol $sym341$COLUMN_MERGER_DROPPED;
    private static final SubLSymbol $sym342$_CSETF_COLUMN_MERGER_DROPPED;
    private static final SubLSymbol $sym343$COLUMN_MERGER_SQL_START_INDEX;
    private static final SubLSymbol $sym344$_CSETF_COLUMN_MERGER_SQL_START_INDEX;
    private static final SubLSymbol $sym345$COLUMN_MERGER_SQL_END_INDEX;
    private static final SubLSymbol $sym346$_CSETF_COLUMN_MERGER_SQL_END_INDEX;
    private static final SubLSymbol $sym347$MAKE_COLUMN_MERGER;
    private static final SubLSymbol $sym348$VISIT_DEFSTRUCT_OBJECT_COLUMN_MERGER_METHOD;
    private static final SubLString $str349$_COLUMN_MERGER_;
    private static final SubLSymbol $sym350$SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym351$EMPTY_SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym352$SEMANTIC_RECIPE_APPEND_TO_DROPS_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym353$SEMANTIC_RECIPE_APPEND_TO_ADDS_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym354$SEMANTIC_RECIPE_REMOVE_FROM_DROPS_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym355$SEMANTIC_RECIPE_REMOVE_FROM_ADDS_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym356$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER;
    private static final SubLSymbol $sym357$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER_MET;
    private static final SubLSymbol $sym358$SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym359$SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym360$SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym361$COLUMN_SEMANTICS_TABLE_NAME;
    private static final SubLList $list362;
    private static final SubLString $str363$unable_to_find_correspondent_for_;
    private static final SubLSymbol $sym364$SEMANTIC_RECIPE_STEP_COPY_COLUMN_MERGER_METHOD;
    private static final SubLSymbol $sym365$SEMANTIC_RECIPE_ADD_OR_DROP_P;
    private static final SubLList $list366;
    private static final SubLSymbol $kw367$ADD;
    private static final SubLSymbol $kw368$DROP;
    private static final SubLSymbol $sym369$SQL_CONJUNCTION;
    private static final SubLSymbol $sym370$SQL_CONJUNCTION_P;
    private static final SubLList $list371;
    private static final SubLList $list372;
    private static final SubLList $list373;
    private static final SubLList $list374;
    private static final SubLSymbol $sym375$PRINT_SQL_CONJUNCTION;
    private static final SubLSymbol $sym376$SQL_CONJUNCTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list377;
    private static final SubLSymbol $sym378$SQL_CONJUNCTION_CONJUNCTS;
    private static final SubLSymbol $sym379$_CSETF_SQL_CONJUNCTION_CONJUNCTS;
    private static final SubLSymbol $kw380$CONJUNCTS;
    private static final SubLSymbol $sym381$MAKE_SQL_CONJUNCTION;
    private static final SubLSymbol $sym382$VISIT_DEFSTRUCT_OBJECT_SQL_CONJUNCTION_METHOD;
    private static final SubLString $str383$_AND_;
    private static final SubLSymbol $sym384$SQL_CONDITION_P;
    private static final SubLSymbol $sym385$SQL_DISJUNCTION;
    private static final SubLSymbol $sym386$SQL_DISJUNCTION_P;
    private static final SubLList $list387;
    private static final SubLList $list388;
    private static final SubLList $list389;
    private static final SubLList $list390;
    private static final SubLSymbol $sym391$PRINT_SQL_DISJUNCTION;
    private static final SubLSymbol $sym392$SQL_DISJUNCTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list393;
    private static final SubLSymbol $sym394$SQL_DISJUNCTION_DISJUNCTS;
    private static final SubLSymbol $sym395$_CSETF_SQL_DISJUNCTION_DISJUNCTS;
    private static final SubLSymbol $kw396$DISJUNCTS;
    private static final SubLSymbol $sym397$MAKE_SQL_DISJUNCTION;
    private static final SubLSymbol $sym398$VISIT_DEFSTRUCT_OBJECT_SQL_DISJUNCTION_METHOD;
    private static final SubLString $str399$_OR_;
    private static final SubLSymbol $sym400$SQL_COPY_TABLE;
    private static final SubLSymbol $sym401$SQL_COPY_TABLE_P;
    private static final SubLList $list402;
    private static final SubLList $list403;
    private static final SubLList $list404;
    private static final SubLList $list405;
    private static final SubLSymbol $sym406$PRINT_SQL_COPY_TABLE;
    private static final SubLSymbol $sym407$SQL_COPY_TABLE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list408;
    private static final SubLSymbol $sym409$SQL_COPY_TABLE_TABLE;
    private static final SubLSymbol $sym410$_CSETF_SQL_COPY_TABLE_TABLE;
    private static final SubLSymbol $sym411$SQL_COPY_TABLE_FROM;
    private static final SubLSymbol $sym412$_CSETF_SQL_COPY_TABLE_FROM;
    private static final SubLSymbol $sym413$SQL_COPY_TABLE_TO;
    private static final SubLSymbol $sym414$_CSETF_SQL_COPY_TABLE_TO;
    private static final SubLSymbol $kw415$TABLE;
    private static final SubLSymbol $kw416$FROM;
    private static final SubLSymbol $kw417$TO;
    private static final SubLSymbol $sym418$MAKE_SQL_COPY_TABLE;
    private static final SubLSymbol $sym419$VISIT_DEFSTRUCT_OBJECT_SQL_COPY_TABLE_METHOD;
    private static final SubLString $str420$COPY_TABLE__a_FROM_DATABASE__a_TO;
    private static final SubLSymbol $sym421$SQL_INSERT_INTO;
    private static final SubLSymbol $sym422$SQL_INSERT_INTO_P;
    private static final SubLList $list423;
    private static final SubLList $list424;
    private static final SubLList $list425;
    private static final SubLList $list426;
    private static final SubLSymbol $sym427$PRINT_SQL_INSERT_INTO;
    private static final SubLSymbol $sym428$SQL_INSERT_INTO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list429;
    private static final SubLSymbol $sym430$SQL_INSERT_INTO_TABLE;
    private static final SubLSymbol $sym431$_CSETF_SQL_INSERT_INTO_TABLE;
    private static final SubLSymbol $sym432$SQL_INSERT_INTO_COLUMNS;
    private static final SubLSymbol $sym433$_CSETF_SQL_INSERT_INTO_COLUMNS;
    private static final SubLSymbol $sym434$SQL_INSERT_INTO_DATA;
    private static final SubLSymbol $sym435$_CSETF_SQL_INSERT_INTO_DATA;
    private static final SubLSymbol $kw436$COLUMNS;
    private static final SubLSymbol $kw437$DATA;
    private static final SubLSymbol $sym438$MAKE_SQL_INSERT_INTO;
    private static final SubLSymbol $sym439$VISIT_DEFSTRUCT_OBJECT_SQL_INSERT_INTO_METHOD;
    private static final SubLString $str440$INSERT_INTO__a___a___a;
    private static final SubLString $str441$__;
    private static final SubLSymbol $sym442$SQL_TABLE_EXPRESSION_P;
    private static final SubLSymbol $sym443$SQL_SELECT_FROM;
    private static final SubLSymbol $sym444$SQL_SELECT_FROM_P;
    private static final SubLList $list445;
    private static final SubLList $list446;
    private static final SubLList $list447;
    private static final SubLList $list448;
    private static final SubLSymbol $sym449$PRINT_SQL_SELECT_FROM;
    private static final SubLSymbol $sym450$SQL_SELECT_FROM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list451;
    private static final SubLSymbol $sym452$SQL_SELECT_FROM_COLUMNS;
    private static final SubLSymbol $sym453$_CSETF_SQL_SELECT_FROM_COLUMNS;
    private static final SubLSymbol $sym454$SQL_SELECT_FROM_TABLES;
    private static final SubLSymbol $sym455$_CSETF_SQL_SELECT_FROM_TABLES;
    private static final SubLSymbol $sym456$SQL_SELECT_FROM_CONDITIONS;
    private static final SubLSymbol $sym457$_CSETF_SQL_SELECT_FROM_CONDITIONS;
    private static final SubLSymbol $kw458$TABLES;
    private static final SubLSymbol $kw459$CONDITIONS;
    private static final SubLSymbol $sym460$MAKE_SQL_SELECT_FROM;
    private static final SubLSymbol $sym461$VISIT_DEFSTRUCT_OBJECT_SQL_SELECT_FROM_METHOD;
    private static final SubLString $str462$SELECT__a_FROM__a;
    private static final SubLString $str463$_WHERE__a;
    private static final SubLString $str464$_AND;
    private static final SubLSymbol $sym465$SQL_EXCEPT;
    private static final SubLSymbol $sym466$SQL_EXCEPT_P;
    private static final SubLList $list467;
    private static final SubLList $list468;
    private static final SubLList $list469;
    private static final SubLList $list470;
    private static final SubLSymbol $sym471$PRINT_SQL_EXCEPT;
    private static final SubLSymbol $sym472$SQL_EXCEPT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list473;
    private static final SubLSymbol $sym474$SQL_EXCEPT_TABLE1;
    private static final SubLSymbol $sym475$_CSETF_SQL_EXCEPT_TABLE1;
    private static final SubLSymbol $sym476$SQL_EXCEPT_TABLE2;
    private static final SubLSymbol $sym477$_CSETF_SQL_EXCEPT_TABLE2;
    private static final SubLSymbol $kw478$TABLE1;
    private static final SubLSymbol $kw479$TABLE2;
    private static final SubLSymbol $sym480$MAKE_SQL_EXCEPT;
    private static final SubLSymbol $sym481$VISIT_DEFSTRUCT_OBJECT_SQL_EXCEPT_METHOD;
    private static final SubLString $str482$_a_EXCEPT__a;
    private static final SubLSymbol $sym483$SQL_ALIAS;
    private static final SubLSymbol $sym484$SQL_ALIAS_P;
    private static final SubLList $list485;
    private static final SubLList $list486;
    private static final SubLList $list487;
    private static final SubLList $list488;
    private static final SubLSymbol $sym489$PRINT_SQL_ALIAS;
    private static final SubLSymbol $sym490$SQL_ALIAS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list491;
    private static final SubLSymbol $sym492$SQL_ALIAS_TABLE;
    private static final SubLSymbol $sym493$_CSETF_SQL_ALIAS_TABLE;
    private static final SubLSymbol $sym494$SQL_ALIAS_ALIAS;
    private static final SubLSymbol $sym495$_CSETF_SQL_ALIAS_ALIAS;
    private static final SubLSymbol $kw496$ALIAS;
    private static final SubLSymbol $sym497$MAKE_SQL_ALIAS;
    private static final SubLSymbol $sym498$VISIT_DEFSTRUCT_OBJECT_SQL_ALIAS_METHOD;
    private static final SubLString $str499$_a_AS__a;
    private static final SubLSymbol $sym500$SQL_COLUMN_EQUAL;
    private static final SubLSymbol $sym501$SQL_COLUMN_EQUAL_P;
    private static final SubLList $list502;
    private static final SubLList $list503;
    private static final SubLList $list504;
    private static final SubLList $list505;
    private static final SubLSymbol $sym506$PRINT_SQL_COLUMN_EQUAL;
    private static final SubLSymbol $sym507$SQL_COLUMN_EQUAL_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list508;
    private static final SubLSymbol $sym509$SQL_COLUMN_EQUAL_TABLE1;
    private static final SubLSymbol $sym510$_CSETF_SQL_COLUMN_EQUAL_TABLE1;
    private static final SubLSymbol $sym511$SQL_COLUMN_EQUAL_COLUMN1;
    private static final SubLSymbol $sym512$_CSETF_SQL_COLUMN_EQUAL_COLUMN1;
    private static final SubLSymbol $sym513$SQL_COLUMN_EQUAL_TABLE2;
    private static final SubLSymbol $sym514$_CSETF_SQL_COLUMN_EQUAL_TABLE2;
    private static final SubLSymbol $sym515$SQL_COLUMN_EQUAL_COLUMN2;
    private static final SubLSymbol $sym516$_CSETF_SQL_COLUMN_EQUAL_COLUMN2;
    private static final SubLSymbol $kw517$COLUMN1;
    private static final SubLSymbol $kw518$COLUMN2;
    private static final SubLSymbol $sym519$MAKE_SQL_COLUMN_EQUAL;
    private static final SubLSymbol $sym520$VISIT_DEFSTRUCT_OBJECT_SQL_COLUMN_EQUAL_METHOD;
    private static final SubLString $str521$_a____a;
    private static final SubLSymbol $sym522$SQL_IS_NULL;
    private static final SubLSymbol $sym523$SQL_IS_NULL_P;
    private static final SubLList $list524;
    private static final SubLList $list525;
    private static final SubLList $list526;
    private static final SubLList $list527;
    private static final SubLSymbol $sym528$PRINT_SQL_IS_NULL;
    private static final SubLSymbol $sym529$SQL_IS_NULL_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list530;
    private static final SubLSymbol $sym531$SQL_IS_NULL_TABLE;
    private static final SubLSymbol $sym532$_CSETF_SQL_IS_NULL_TABLE;
    private static final SubLSymbol $sym533$SQL_IS_NULL_COLUMN;
    private static final SubLSymbol $sym534$_CSETF_SQL_IS_NULL_COLUMN;
    private static final SubLSymbol $kw535$COLUMN;
    private static final SubLSymbol $sym536$MAKE_SQL_IS_NULL;
    private static final SubLSymbol $sym537$VISIT_DEFSTRUCT_OBJECT_SQL_IS_NULL_METHOD;
    private static final SubLString $str538$_a__a_IS_NULL;
    private static final SubLSymbol $sym539$SQL_NOT_IN;
    private static final SubLSymbol $sym540$SQL_NOT_IN_P;
    private static final SubLList $list541;
    private static final SubLList $list542;
    private static final SubLList $list543;
    private static final SubLList $list544;
    private static final SubLSymbol $sym545$PRINT_SQL_NOT_IN;
    private static final SubLSymbol $sym546$SQL_NOT_IN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list547;
    private static final SubLSymbol $sym548$SQL_NOT_IN_COLUMN_TABLE;
    private static final SubLSymbol $sym549$_CSETF_SQL_NOT_IN_COLUMN_TABLE;
    private static final SubLSymbol $sym550$SQL_NOT_IN_COLUMN;
    private static final SubLSymbol $sym551$_CSETF_SQL_NOT_IN_COLUMN;
    private static final SubLSymbol $sym552$SQL_NOT_IN_TABLE;
    private static final SubLSymbol $sym553$_CSETF_SQL_NOT_IN_TABLE;
    private static final SubLSymbol $kw554$COLUMN_TABLE;
    private static final SubLSymbol $sym555$MAKE_SQL_NOT_IN;
    private static final SubLSymbol $sym556$VISIT_DEFSTRUCT_OBJECT_SQL_NOT_IN_METHOD;
    private static final SubLString $str557$_a__a_NOT_IN__a;
    private static final SubLSymbol $sym558$SQL_INNER_JOIN;
    private static final SubLSymbol $sym559$SQL_INNER_JOIN_P;
    private static final SubLList $list560;
    private static final SubLList $list561;
    private static final SubLList $list562;
    private static final SubLList $list563;
    private static final SubLSymbol $sym564$PRINT_SQL_INNER_JOIN;
    private static final SubLSymbol $sym565$SQL_INNER_JOIN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list566;
    private static final SubLSymbol $sym567$SQL_INNER_JOIN_TABLE1;
    private static final SubLSymbol $sym568$_CSETF_SQL_INNER_JOIN_TABLE1;
    private static final SubLSymbol $sym569$SQL_INNER_JOIN_TABLE2;
    private static final SubLSymbol $sym570$_CSETF_SQL_INNER_JOIN_TABLE2;
    private static final SubLSymbol $sym571$SQL_INNER_JOIN_ON;
    private static final SubLSymbol $sym572$_CSETF_SQL_INNER_JOIN_ON;
    private static final SubLSymbol $kw573$ON;
    private static final SubLSymbol $sym574$MAKE_SQL_INNER_JOIN;
    private static final SubLSymbol $sym575$VISIT_DEFSTRUCT_OBJECT_SQL_INNER_JOIN_METHOD;
    private static final SubLString $str576$_a_INNER_JOIN__a_ON__a;
    private static final SubLSymbol $sym577$SQL_LEFT_JOIN;
    private static final SubLSymbol $sym578$SQL_LEFT_JOIN_P;
    private static final SubLList $list579;
    private static final SubLList $list580;
    private static final SubLList $list581;
    private static final SubLList $list582;
    private static final SubLSymbol $sym583$PRINT_SQL_LEFT_JOIN;
    private static final SubLSymbol $sym584$SQL_LEFT_JOIN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list585;
    private static final SubLSymbol $sym586$SQL_LEFT_JOIN_LEFT_TABLE;
    private static final SubLSymbol $sym587$_CSETF_SQL_LEFT_JOIN_LEFT_TABLE;
    private static final SubLSymbol $sym588$SQL_LEFT_JOIN_RIGHT_TABLE;
    private static final SubLSymbol $sym589$_CSETF_SQL_LEFT_JOIN_RIGHT_TABLE;
    private static final SubLSymbol $sym590$SQL_LEFT_JOIN_ON;
    private static final SubLSymbol $sym591$_CSETF_SQL_LEFT_JOIN_ON;
    private static final SubLSymbol $kw592$LEFT_TABLE;
    private static final SubLSymbol $kw593$RIGHT_TABLE;
    private static final SubLSymbol $sym594$MAKE_SQL_LEFT_JOIN;
    private static final SubLSymbol $sym595$VISIT_DEFSTRUCT_OBJECT_SQL_LEFT_JOIN_METHOD;
    private static final SubLString $str596$_a_LEFT_JOIN__a_ON__a;
    private static final SubLSymbol $sym597$SQL_UNION;
    private static final SubLSymbol $sym598$SQL_UNION_P;
    private static final SubLList $list599;
    private static final SubLList $list600;
    private static final SubLList $list601;
    private static final SubLList $list602;
    private static final SubLSymbol $sym603$PRINT_SQL_UNION;
    private static final SubLSymbol $sym604$SQL_UNION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list605;
    private static final SubLSymbol $sym606$SQL_UNION_SELECT1;
    private static final SubLSymbol $sym607$_CSETF_SQL_UNION_SELECT1;
    private static final SubLSymbol $sym608$SQL_UNION_SELECT2;
    private static final SubLSymbol $sym609$_CSETF_SQL_UNION_SELECT2;
    private static final SubLSymbol $kw610$SELECT1;
    private static final SubLSymbol $kw611$SELECT2;
    private static final SubLSymbol $sym612$MAKE_SQL_UNION;
    private static final SubLSymbol $sym613$VISIT_DEFSTRUCT_OBJECT_SQL_UNION_METHOD;
    private static final SubLString $str614$_a__UNION___a;
    private static final SubLSymbol $sym615$SQL_ALTER_TABLE;
    private static final SubLSymbol $sym616$SQL_ALTER_TABLE_P;
    private static final SubLList $list617;
    private static final SubLList $list618;
    private static final SubLList $list619;
    private static final SubLList $list620;
    private static final SubLSymbol $sym621$PRINT_SQL_ALTER_TABLE;
    private static final SubLSymbol $sym622$SQL_ALTER_TABLE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list623;
    private static final SubLSymbol $sym624$SQL_ALTER_TABLE_TABLE;
    private static final SubLSymbol $sym625$_CSETF_SQL_ALTER_TABLE_TABLE;
    private static final SubLSymbol $sym626$SQL_ALTER_TABLE_ACTION;
    private static final SubLSymbol $sym627$_CSETF_SQL_ALTER_TABLE_ACTION;
    private static final SubLSymbol $kw628$ACTION;
    private static final SubLSymbol $sym629$MAKE_SQL_ALTER_TABLE;
    private static final SubLSymbol $sym630$VISIT_DEFSTRUCT_OBJECT_SQL_ALTER_TABLE_METHOD;
    private static final SubLString $str631$ALTER_TABLE__a__a;
    private static final SubLSymbol $sym632$SQL_ALTERATION_P;
    private static final SubLSymbol $sym633$SQL_ADD_COLUMN;
    private static final SubLSymbol $sym634$SQL_ADD_COLUMN_P;
    private static final SubLList $list635;
    private static final SubLList $list636;
    private static final SubLList $list637;
    private static final SubLList $list638;
    private static final SubLSymbol $sym639$PRINT_SQL_ADD_COLUMN;
    private static final SubLSymbol $sym640$SQL_ADD_COLUMN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list641;
    private static final SubLSymbol $sym642$SQL_ADD_COLUMN_COLUMN;
    private static final SubLSymbol $sym643$_CSETF_SQL_ADD_COLUMN_COLUMN;
    private static final SubLSymbol $sym644$SQL_ADD_COLUMN_TYPE;
    private static final SubLSymbol $sym645$_CSETF_SQL_ADD_COLUMN_TYPE;
    private static final SubLSymbol $sym646$SQL_ADD_COLUMN_SIZE;
    private static final SubLSymbol $sym647$_CSETF_SQL_ADD_COLUMN_SIZE;
    private static final SubLSymbol $sym648$SQL_ADD_COLUMN_CONSTRAINTS;
    private static final SubLSymbol $sym649$_CSETF_SQL_ADD_COLUMN_CONSTRAINTS;
    private static final SubLSymbol $kw650$TYPE;
    private static final SubLSymbol $kw651$SIZE;
    private static final SubLSymbol $kw652$CONSTRAINTS;
    private static final SubLSymbol $sym653$MAKE_SQL_ADD_COLUMN;
    private static final SubLSymbol $sym654$VISIT_DEFSTRUCT_OBJECT_SQL_ADD_COLUMN_METHOD;
    private static final SubLString $str655$ADD_COLUMN__a__a;
    private static final SubLString $str656$__a_;
    private static final SubLSymbol $sym657$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym658$SQL_COLUMN_CONSTRAINT_P;
    private static final SubLSymbol $sym659$SQL_DROP_COLUMN;
    private static final SubLSymbol $sym660$SQL_DROP_COLUMN_P;
    private static final SubLList $list661;
    private static final SubLList $list662;
    private static final SubLList $list663;
    private static final SubLList $list664;
    private static final SubLSymbol $sym665$PRINT_SQL_DROP_COLUMN;
    private static final SubLSymbol $sym666$SQL_DROP_COLUMN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list667;
    private static final SubLSymbol $sym668$SQL_DROP_COLUMN_COLUMN;
    private static final SubLSymbol $sym669$_CSETF_SQL_DROP_COLUMN_COLUMN;
    private static final SubLSymbol $sym670$MAKE_SQL_DROP_COLUMN;
    private static final SubLSymbol $sym671$VISIT_DEFSTRUCT_OBJECT_SQL_DROP_COLUMN_METHOD;
    private static final SubLString $str672$DROP_COLUMN__a;
    private static final SubLSymbol $sym673$SQL_RENAME_COLUMN;
    private static final SubLSymbol $sym674$SQL_RENAME_COLUMN_P;
    private static final SubLList $list675;
    private static final SubLList $list676;
    private static final SubLList $list677;
    private static final SubLList $list678;
    private static final SubLSymbol $sym679$PRINT_SQL_RENAME_COLUMN;
    private static final SubLSymbol $sym680$SQL_RENAME_COLUMN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list681;
    private static final SubLSymbol $sym682$SQL_RENAME_COLUMN_OLD_COLUMN;
    private static final SubLSymbol $sym683$_CSETF_SQL_RENAME_COLUMN_OLD_COLUMN;
    private static final SubLSymbol $sym684$SQL_RENAME_COLUMN_NEW_COLUMN;
    private static final SubLSymbol $sym685$_CSETF_SQL_RENAME_COLUMN_NEW_COLUMN;
    private static final SubLSymbol $kw686$OLD_COLUMN;
    private static final SubLSymbol $kw687$NEW_COLUMN;
    private static final SubLSymbol $sym688$MAKE_SQL_RENAME_COLUMN;
    private static final SubLSymbol $sym689$VISIT_DEFSTRUCT_OBJECT_SQL_RENAME_COLUMN_METHOD;
    private static final SubLString $str690$RENAME__a_TO__a;
    private static final SubLSymbol $sym691$SQL_ADD_CONSTRAINT;
    private static final SubLSymbol $sym692$SQL_ADD_CONSTRAINT_P;
    private static final SubLList $list693;
    private static final SubLList $list694;
    private static final SubLList $list695;
    private static final SubLList $list696;
    private static final SubLSymbol $sym697$PRINT_SQL_ADD_CONSTRAINT;
    private static final SubLSymbol $sym698$SQL_ADD_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list699;
    private static final SubLSymbol $sym700$SQL_ADD_CONSTRAINT_CONSTRAINT;
    private static final SubLSymbol $sym701$_CSETF_SQL_ADD_CONSTRAINT_CONSTRAINT;
    private static final SubLSymbol $kw702$CONSTRAINT;
    private static final SubLSymbol $sym703$MAKE_SQL_ADD_CONSTRAINT;
    private static final SubLSymbol $sym704$VISIT_DEFSTRUCT_OBJECT_SQL_ADD_CONSTRAINT_METHOD;
    private static final SubLString $str705$ADD_CONSTRAINT__a__a;
    private static final SubLSymbol $sym706$SQL_TABLE_CONSTRAINT_P;
    private static final SubLSymbol $sym707$SQL_DROP_CONSTRAINT;
    private static final SubLSymbol $sym708$SQL_DROP_CONSTRAINT_P;
    private static final SubLList $list709;
    private static final SubLList $list710;
    private static final SubLSymbol $sym711$PRINT_SQL_DROP_CONSTRAINT;
    private static final SubLSymbol $sym712$SQL_DROP_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list713;
    private static final SubLSymbol $sym714$SQL_DROP_CONSTRAINT_CONSTRAINT;
    private static final SubLSymbol $sym715$_CSETF_SQL_DROP_CONSTRAINT_CONSTRAINT;
    private static final SubLSymbol $sym716$MAKE_SQL_DROP_CONSTRAINT;
    private static final SubLSymbol $sym717$VISIT_DEFSTRUCT_OBJECT_SQL_DROP_CONSTRAINT_METHOD;
    private static final SubLString $str718$DROP_CONSTRAINT__a;
    private static final SubLSymbol $sym719$SQL_FK_COLUMN_CONSTRAINT;
    private static final SubLSymbol $sym720$SQL_FK_COLUMN_CONSTRAINT_P;
    private static final SubLList $list721;
    private static final SubLList $list722;
    private static final SubLList $list723;
    private static final SubLList $list724;
    private static final SubLSymbol $sym725$PRINT_SQL_FK_COLUMN_CONSTRAINT;
    private static final SubLSymbol $sym726$SQL_FK_COLUMN_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list727;
    private static final SubLSymbol $sym728$SQL_FK_COLUMN_CONSTRAINT_NAME;
    private static final SubLSymbol $sym729$_CSETF_SQL_FK_COLUMN_CONSTRAINT_NAME;
    private static final SubLSymbol $sym730$SQL_FK_COLUMN_CONSTRAINT_TABLE;
    private static final SubLSymbol $sym731$_CSETF_SQL_FK_COLUMN_CONSTRAINT_TABLE;
    private static final SubLSymbol $sym732$SQL_FK_COLUMN_CONSTRAINT_COLUMN;
    private static final SubLSymbol $sym733$_CSETF_SQL_FK_COLUMN_CONSTRAINT_COLUMN;
    private static final SubLSymbol $kw734$NAME;
    private static final SubLSymbol $sym735$MAKE_SQL_FK_COLUMN_CONSTRAINT;
    private static final SubLSymbol $sym736$VISIT_DEFSTRUCT_OBJECT_SQL_FK_COLUMN_CONSTRAINT_METHOD;
    private static final SubLString $str737$REFERENCES__a___a_;
    private static final SubLSymbol $sym738$SQL_FK_TABLE_CONSTRAINT;
    private static final SubLSymbol $sym739$SQL_FK_TABLE_CONSTRAINT_P;
    private static final SubLList $list740;
    private static final SubLList $list741;
    private static final SubLList $list742;
    private static final SubLList $list743;
    private static final SubLSymbol $sym744$PRINT_SQL_FK_TABLE_CONSTRAINT;
    private static final SubLSymbol $sym745$SQL_FK_TABLE_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list746;
    private static final SubLSymbol $sym747$SQL_FK_TABLE_CONSTRAINT_COLUMN;
    private static final SubLSymbol $sym748$_CSETF_SQL_FK_TABLE_CONSTRAINT_COLUMN;
    private static final SubLSymbol $sym749$SQL_FK_TABLE_CONSTRAINT_CONSTRAINT;
    private static final SubLSymbol $sym750$_CSETF_SQL_FK_TABLE_CONSTRAINT_CONSTRAINT;
    private static final SubLSymbol $sym751$MAKE_SQL_FK_TABLE_CONSTRAINT;
    private static final SubLSymbol $sym752$VISIT_DEFSTRUCT_OBJECT_SQL_FK_TABLE_CONSTRAINT_METHOD;
    private static final SubLString $str753$FOREIGN_KEY___a___a;
    private static final SubLSymbol $sym754$SQL_UPDATE;
    private static final SubLSymbol $sym755$SQL_UPDATE_P;
    private static final SubLList $list756;
    private static final SubLList $list757;
    private static final SubLList $list758;
    private static final SubLList $list759;
    private static final SubLSymbol $sym760$PRINT_SQL_UPDATE;
    private static final SubLSymbol $sym761$SQL_UPDATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list762;
    private static final SubLSymbol $sym763$SQL_UPDATE_TABLE;
    private static final SubLSymbol $sym764$_CSETF_SQL_UPDATE_TABLE;
    private static final SubLSymbol $sym765$SQL_UPDATE_SETTINGS;
    private static final SubLSymbol $sym766$_CSETF_SQL_UPDATE_SETTINGS;
    private static final SubLSymbol $sym767$SQL_UPDATE_CONDITIONS;
    private static final SubLSymbol $sym768$_CSETF_SQL_UPDATE_CONDITIONS;
    private static final SubLSymbol $kw769$SETTINGS;
    private static final SubLSymbol $sym770$MAKE_SQL_UPDATE;
    private static final SubLSymbol $sym771$VISIT_DEFSTRUCT_OBJECT_SQL_UPDATE_METHOD;
    private static final SubLString $str772$UPDATE__a_SET_;
    private static final SubLString $str773$_WHERE_;
    private static final SubLSymbol $sym774$SQL_DROP_TABLE;
    private static final SubLSymbol $sym775$SQL_DROP_TABLE_P;
    private static final SubLList $list776;
    private static final SubLList $list777;
    private static final SubLList $list778;
    private static final SubLList $list779;
    private static final SubLSymbol $sym780$PRINT_SQL_DROP_TABLE;
    private static final SubLSymbol $sym781$SQL_DROP_TABLE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list782;
    private static final SubLSymbol $sym783$SQL_DROP_TABLE_TABLE;
    private static final SubLSymbol $sym784$_CSETF_SQL_DROP_TABLE_TABLE;
    private static final SubLSymbol $sym785$MAKE_SQL_DROP_TABLE;
    private static final SubLSymbol $sym786$VISIT_DEFSTRUCT_OBJECT_SQL_DROP_TABLE_METHOD;
    private static final SubLString $str787$DROP_TABLE__a;
    private static final SubLString $str788$Can_t_access_name_of_column_const;
    private static final SubLString $str789$_;
    private static final SubLString $str790$_fk;
    private static final SubLSymbol $sym791$_ACCESS_PATH_MAP_;
    private static final SubLList $list792;
    private static final SubLList $list793;
    private static final SubLSymbol $sym794$CAR;
    private static final SubLSymbol $sym795$_BLN1_ACCESS_PATH_;
    private static final SubLSymbol $sym796$_BLN2_ACCESS_PATH_;
    private static final SubLSymbol $sym797$_USGS_ACCESS_PATH_;
    private static final SubLSymbol $sym798$_NGA_ACCESS_PATH_;
    private static final SubLSymbol $sym799$_GNDB_ACCESS_PATH_;
    private static final SubLSymbol $sym800$_BATHYMETRIC_DATA_ACCESS_PATH_;
    private static final SubLSymbol $sym801$_BATHYMETRIC_HEADER_ACCESS_PATH_;
    private static final SubLSymbol $sym802$_SPORTING_GOODS_ACCESS_PATH_;
    private static final SubLSymbol $sym803$_NORTHWIND_ACCESS_PATH_;
    private static final SubLString $str804$bln_fusion_test_db_1;
    private static final SubLString $str805$sksi;
    private static final SubLString $str806$cyc11_cyc_com;
    private static final SubLString $str807$standard_cyc_com;
    private static final SubLInteger $int808$9999;
    private static final SubLString $str809$postgresql;
    private static final SubLObject $const810$PostgreSQL;
    private static final SubLInteger $int811$212;
    private static final SubLString $str812$bln_fusion_test_db_2;
    private static final SubLString $str813$usgs;
    private static final SubLString $str814$astro_cyc_com;
    private static final SubLString $str815$nga;
    private static final SubLString $str816$gndb;
    private static final SubLString $str817$sporting_goods;
    private static final SubLString $str818$northwind;
    private static final SubLString $str819$postgres;
    private static final SubLString $str820$bathymetric_data;
    private static final SubLInteger $int821$214;
    private static final SubLString $str822$bathymetric_survey;
    private static final SubLString $str823$semantic_etl_target_db;
    private static final SubLString $str824$bln1;
    private static final SubLString $str825$bln2;
    private static final SubLString $str826$target;
    private static final SubLString $str827$Can_t_find_column__a_in__a;
    private static final SubLSymbol $sym828$EMPTY_SEMANTIC_RECIPE_STEP_P;
    private static final SubLSymbol $sym829$FIRST;
    private static final SubLString $str830$unable_to_interpret__S_as_part_of;
    private static final SubLList $list831;
    private static final SubLSymbol $kw832$COLUMN_NAMED;
    private static final SubLString $str833$Didn_t_apply_command__a_to_output;
    private static final SubLString $str834$Apply__a_within__a_to_output_spec;
    private static final SubLString $str835$Can_t_add_new_column__a_to__a_sin;
    private static final SubLString $str836$table_expression__a_unimplemented;
    private static final SubLString $str837$ambiguity_in_select_clause___a_id;
    private static final SubLString $str838$source_result_set__a_and_target__;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 1326L)
    public static SubLObject do_table_semantics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject table_semantics = (SubLObject)semantic_etl_bus.NIL;
        SubLObject semantics = (SubLObject)semantic_etl_bus.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list0);
        table_semantics = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list0);
        semantics = current.first();
        current = current.rest();
        if (semantic_etl_bus.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)semantic_etl_bus.$sym1$CDOLIST, (SubLObject)ConsesLow.list(table_semantics, (SubLObject)ConsesLow.list((SubLObject)semantic_etl_bus.$sym2$SEMANTICS_TABLE_SEMANTICS_LIST, semantics)), ConsesLow.append(body, (SubLObject)semantic_etl_bus.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)semantic_etl_bus.$list0);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 1675L)
    public static SubLObject do_table_semantics_column_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
        SubLObject table_semantics = (SubLObject)semantic_etl_bus.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list3);
        constraint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list3);
        table_semantics = current.first();
        current = current.rest();
        if (semantic_etl_bus.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)semantic_etl_bus.$sym1$CDOLIST, (SubLObject)ConsesLow.list(constraint, (SubLObject)ConsesLow.list((SubLObject)semantic_etl_bus.$sym4$TABLE_SEMANTICS_COLUMN_CONSTRAINTS, table_semantics)), ConsesLow.append(body, (SubLObject)semantic_etl_bus.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)semantic_etl_bus.$list3);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 1935L)
    public static SubLObject initialize_semantic_etl_infrastructure() {
        clear_db_output_specs();
        integer_sequence_generator.integer_sequence_generator_reset(semantic_etl_bus.$semantic_etl_table_isg$.getGlobalValue());
        integer_sequence_generator.integer_sequence_generator_reset(semantic_etl_bus.$db_output_spec_isg$.getGlobalValue());
        semantic_etl_bus.$access_path_map$.setGlobalValue((SubLObject)semantic_etl_bus.NIL);
        return (SubLObject)semantic_etl_bus.$kw5$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 2786L)
    public static SubLObject get_db_output_spec(final SubLObject id) {
        SubLObject spec = (SubLObject)semantic_etl_bus.NIL;
        SubLObject release = (SubLObject)semantic_etl_bus.NIL;
        try {
            release = Locks.seize_lock(semantic_etl_bus.$database_output_specs_lock$.getGlobalValue());
            spec = dictionary.dictionary_lookup(semantic_etl_bus.$database_output_specs$.getGlobalValue(), id, (SubLObject)semantic_etl_bus.UNPROVIDED);
        }
        finally {
            if (semantic_etl_bus.NIL != release) {
                Locks.release_lock(semantic_etl_bus.$database_output_specs_lock$.getGlobalValue());
            }
        }
        return spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 3032L)
    public static SubLObject put_db_output_spec(final SubLObject id, final SubLObject output_spec) {
        SubLObject release = (SubLObject)semantic_etl_bus.NIL;
        try {
            release = Locks.seize_lock(semantic_etl_bus.$database_output_specs_lock$.getGlobalValue());
            dictionary.dictionary_enter(semantic_etl_bus.$database_output_specs$.getGlobalValue(), id, output_spec);
        }
        finally {
            if (semantic_etl_bus.NIL != release) {
                Locks.release_lock(semantic_etl_bus.$database_output_specs_lock$.getGlobalValue());
            }
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 3272L)
    public static SubLObject remove_db_output_spec(final SubLObject id) {
        SubLObject release = (SubLObject)semantic_etl_bus.NIL;
        try {
            release = Locks.seize_lock(semantic_etl_bus.$database_output_specs_lock$.getGlobalValue());
            dictionary.dictionary_remove(semantic_etl_bus.$database_output_specs$.getGlobalValue(), id);
        }
        finally {
            if (semantic_etl_bus.NIL != release) {
                Locks.release_lock(semantic_etl_bus.$database_output_specs_lock$.getGlobalValue());
            }
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 3457L)
    public static SubLObject clear_db_output_specs() {
        SubLObject release = (SubLObject)semantic_etl_bus.NIL;
        try {
            release = Locks.seize_lock(semantic_etl_bus.$database_output_specs_lock$.getGlobalValue());
            semantic_etl_bus.$database_output_specs$.setGlobalValue(dictionary.new_dictionary((SubLObject)semantic_etl_bus.EQL, (SubLObject)semantic_etl_bus.UNPROVIDED));
        }
        finally {
            if (semantic_etl_bus.NIL != release) {
                Locks.release_lock(semantic_etl_bus.$database_output_specs_lock$.getGlobalValue());
            }
        }
        return dictionary.dictionary_p(semantic_etl_bus.$database_output_specs$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 3658L)
    public static SubLObject database_fusion_loop(final SubLObject access_path1, final SubLObject access_path2) {
        assert semantic_etl_bus.NIL != sksi_access_path.access_path_p(access_path1) : access_path1;
        assert semantic_etl_bus.NIL != sksi_access_path.access_path_p(access_path2) : access_path2;
        initialize_semantic_etl_infrastructure();
        SubLObject output = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var;
        SubLObject output_specs = cdolist_list_var = semantic_etl_fuse_databases((SubLObject)ConsesLow.list(access_path1, access_path2));
        SubLObject os = (SubLObject)semantic_etl_bus.NIL;
        os = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            put_db_output_spec(db_output_spec_id(os), os);
            output = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(db_output_spec_id(os), os), output);
            cdolist_list_var = cdolist_list_var.rest();
            os = cdolist_list_var.first();
        }
        print_high.princ(output, (SubLObject)semantic_etl_bus.UNPROVIDED);
        while (true) {
            streams_high.terpri((SubLObject)semantic_etl_bus.UNPROVIDED);
            streams_high.terpri((SubLObject)semantic_etl_bus.UNPROVIDED);
            print_high.princ((SubLObject)semantic_etl_bus.$str10$Please_select_an_output_specifica, (SubLObject)semantic_etl_bus.UNPROVIDED);
            streams_high.terpri((SubLObject)semantic_etl_bus.UNPROVIDED);
            final SubLObject id = reader.read_from_string(streams_high.read_line((SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
            final SubLObject selected_os = get_db_output_spec(id);
            if (semantic_etl_bus.NIL != selected_os) {
                output = (SubLObject)semantic_etl_bus.NIL;
                SubLObject cdolist_list_var2;
                output_specs = (cdolist_list_var2 = mapping_engine.semantic_etl_improve_output_spec_external(id));
                SubLObject os2 = (SubLObject)semantic_etl_bus.NIL;
                os2 = cdolist_list_var2.first();
                while (semantic_etl_bus.NIL != cdolist_list_var2) {
                    put_db_output_spec(db_output_spec_id(os2), os2);
                    output = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(db_output_spec_id(os2), os2), output);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    os2 = cdolist_list_var2.first();
                }
                print_high.princ((SubLObject)semantic_etl_bus.$str11$_________________________________, (SubLObject)semantic_etl_bus.UNPROVIDED);
                streams_high.terpri((SubLObject)semantic_etl_bus.UNPROVIDED);
                print_high.princ(output, (SubLObject)semantic_etl_bus.UNPROVIDED);
            }
            else {
                if (id.equal((SubLObject)semantic_etl_bus.$sym12$Q)) {
                    break;
                }
                Errors.warn((SubLObject)semantic_etl_bus.$str13$There_is_no_output_specification_, id);
            }
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 4916L)
    public static SubLObject clear_semantic_etl_fuse_databases() {
        final SubLObject cs = semantic_etl_bus.$semantic_etl_fuse_databases_caching_state$.getGlobalValue();
        if (semantic_etl_bus.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 4916L)
    public static SubLObject remove_semantic_etl_fuse_databases(final SubLObject access_paths) {
        return memoization_state.caching_state_remove_function_results_with_args(semantic_etl_bus.$semantic_etl_fuse_databases_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(access_paths), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 4916L)
    public static SubLObject semantic_etl_fuse_databases_internal(final SubLObject access_paths) {
        final SubLObject semantics_list = semantic_etl_parse_metadata_and_data(access_paths);
        final SubLObject semantics1 = semantics_list.first();
        final SubLObject semantics2 = conses_high.second(semantics_list);
        final SubLObject target_access_path = stub_target_access_path();
        if (!Sequences.length(semantics_list).numE((SubLObject)semantic_etl_bus.TWO_INTEGER)) {
            Errors.error((SubLObject)semantic_etl_bus.$str15$Can_only_fuse_exactly_two_databas);
        }
        return mapping_engine.semantic_etl_compute_output_spec(semantics1, semantics2, target_access_path, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 4916L)
    public static SubLObject semantic_etl_fuse_databases(final SubLObject access_paths) {
        SubLObject caching_state = semantic_etl_bus.$semantic_etl_fuse_databases_caching_state$.getGlobalValue();
        if (semantic_etl_bus.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)semantic_etl_bus.$sym14$SEMANTIC_ETL_FUSE_DATABASES, (SubLObject)semantic_etl_bus.$sym16$_SEMANTIC_ETL_FUSE_DATABASES_CACHING_STATE_, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.EQUAL, (SubLObject)semantic_etl_bus.ONE_INTEGER, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, access_paths, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(semantic_etl_fuse_databases_internal(access_paths)));
            memoization_state.caching_state_put(caching_state, access_paths, results, (SubLObject)semantic_etl_bus.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 5522L)
    public static SubLObject semantic_etl_parse_metadata_and_data(final SubLObject access_paths) {
        final SubLObject semantics_list = metadata_parser.semantic_etl_parse_metadata(access_paths);
        return data_parser.semantic_etl_parse_data(access_paths, semantics_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 5727L)
    public static SubLObject semantic_etl_get_db_structure(final SubLObject access_path) {
        final SubLObject metadata = metadata_parser.semantic_etl_acquire_metadata(access_path);
        final SubLObject semantics_structure = metadata_parser.semantic_etl_convert_metadata_to_semantics(metadata);
        final SubLObject semantics_structure_with_xref = metadata_parser.semantic_etl_parse_xref_metadata(metadata, semantics_structure);
        final SubLObject semantics_structure_with_data = data_parser.semantic_etl_acquire_and_add_data(access_path, semantics_structure_with_xref);
        return semantics_structure_with_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 6377L)
    public static SubLObject find_corresponding_item_in_semantics(final SubLObject sem_obj, final SubLObject semantics) {
        final SubLObject method_function = Structures.method_func(sem_obj, semantic_etl_bus.$find_corresponding_item_in_semantics_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, sem_obj, semantics);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str18$Don_t_know_how_to_find_a__S_in_a_, sem_obj);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 7268L)
    public static SubLObject semantic_object_comparison_name(final SubLObject sem_obj) {
        final SubLObject method_function = Structures.method_func(sem_obj, semantic_etl_bus.$semantic_object_comparison_name_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, sem_obj);
        }
        Errors.error((SubLObject)semantic_etl_bus.$str19$don_t_know_how_to_name__S__, sem_obj);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_semantics(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject semantics_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $semantics_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject semant_access_path(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject semant_table_semantics_list(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject semant_table_aliases(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject semant_dict(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject semant_dropped_items(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject semant_output_spec(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject _csetf_semant_access_path(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject _csetf_semant_table_semantics_list(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject _csetf_semant_table_aliases(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject _csetf_semant_dict(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject _csetf_semant_dropped_items(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject _csetf_semant_output_spec(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != semantics_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject make_semantics(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw41$ACCESS_PATH)) {
                _csetf_semant_access_path(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw42$TABLE_SEMANTICS_LIST)) {
                _csetf_semant_table_semantics_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw43$TABLE_ALIASES)) {
                _csetf_semant_table_aliases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw44$DICT)) {
                _csetf_semant_dict(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw45$DROPPED_ITEMS)) {
                _csetf_semant_dropped_items(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw46$OUTPUT_SPEC)) {
                _csetf_semant_output_spec(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject visit_defstruct_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym49$MAKE_SEMANTICS, (SubLObject)semantic_etl_bus.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw41$ACCESS_PATH, semant_access_path(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw42$TABLE_SEMANTICS_LIST, semant_table_semantics_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw43$TABLE_ALIASES, semant_table_aliases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw44$DICT, semant_dict(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw45$DROPPED_ITEMS, semant_dropped_items(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw46$OUTPUT_SPEC, semant_output_spec(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym49$MAKE_SEMANTICS, (SubLObject)semantic_etl_bus.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8110L)
    public static SubLObject visit_defstruct_object_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_semantics(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 8981L)
    public static SubLObject print_semantics(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str53$_SEMANTICS____a_____a_, access_path_pretty_string(semant_access_path(v_object)), semant_table_semantics_list(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 9287L)
    public static SubLObject semantics_access_path(final SubLObject semantics) {
        assert semantic_etl_bus.NIL != semantics_p(semantics) : semantics;
        return semant_access_path(semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 9626L)
    public static SubLObject semantics_table_semantics_list(final SubLObject semantics) {
        assert semantic_etl_bus.NIL != semantics_p(semantics) : semantics;
        return semant_table_semantics_list(semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 9899L)
    public static SubLObject semantics_get_table_named(final SubLObject semantics, final SubLObject name) {
        SubLObject cdolist_list_var = semant_table_aliases(semantics);
        SubLObject table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (name.equalp(table_semantics_table_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        cdolist_list_var = semantics_table_semantics_list(semantics);
        table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (name.equalp(table_semantics_table_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        cdolist_list_var = semantics_dropped_tables(semantics);
        table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (name.equalp(table_semantics_table_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 10416L)
    public static SubLObject semantics_get_column_named(final SubLObject semantics, final SubLObject table_name, final SubLObject column_name) {
        final SubLObject table = semantics_get_table_named(semantics, table_name);
        return table_semantics_get_column_named(table, column_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 10629L)
    public static SubLObject semantics_get_table_with_id(final SubLObject semantics, final SubLObject id) {
        return dictionary.dictionary_lookup(semant_dict(semantics), id, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 10810L)
    public static SubLObject new_semantics(final SubLObject access_path, final SubLObject table_semantics_list) {
        assert semantic_etl_bus.NIL != sksi_access_path.access_path_p(access_path) : access_path;
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(table_semantics_list) : table_semantics_list;
        SubLObject cdolist_list_var = table_semantics_list;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != table_semantics_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject semantics = make_semantics((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_semant_access_path(semantics, access_path);
        _csetf_semant_table_semantics_list(semantics, table_semantics_list);
        cdolist_list_var = table_semantics_list;
        SubLObject table_semantics = (SubLObject)semantic_etl_bus.NIL;
        table_semantics = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (semantic_etl_bus.NIL != table_semantics_semantics(table_semantics) && semantic_etl_bus.NIL == table_semantics_source_semantics(table_semantics)) {
                set_table_semantics_source_semantics(table_semantics, table_semantics_semantics(table_semantics));
            }
            set_table_semantics_semantics(table_semantics, semantics);
            cdolist_list_var = cdolist_list_var.rest();
            table_semantics = cdolist_list_var.first();
        }
        _csetf_semant_dict(semantics, table_id_to_table_semantics_dict(semantics));
        _csetf_semant_dropped_items(semantics, (SubLObject)semantic_etl_bus.NIL);
        return semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 12033L)
    public static SubLObject copy_semantics(final SubLObject semantics) {
        assert semantic_etl_bus.NIL != semantics_p(semantics) : semantics;
        final SubLObject access_path = semant_access_path(semantics);
        final SubLObject table_semantics_list = copy_table_semantics_list(semant_table_semantics_list(semantics));
        final SubLObject new_semantics = new_semantics(access_path, table_semantics_list);
        _csetf_semant_dropped_items(new_semantics, conses_high.copy_list(semant_dropped_items(semantics)));
        return new_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 12619L)
    public static SubLObject semantics_add_column_constraints(final SubLObject semantics, final SubLObject constraints) {
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
        constraint = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (semantic_etl_bus.NIL != foreign_key_constraint_p(constraint)) {
                final SubLObject constrained_column = foreign_key_constraint_constrained_column(constraint);
                final SubLObject constrained_table = column_semantics_table_semantics(constrained_column);
                table_semantics_add_column_constraint(constrained_table, constraint);
            }
            else if (semantic_etl_bus.NIL != primary_key_constraint_p(constraint)) {
                final SubLObject constrained_table2 = primary_key_constraint_constrained_table(constraint);
                table_semantics_add_column_constraint(constrained_table2, constraint);
            }
            else {
                Errors.warn((SubLObject)semantic_etl_bus.$str56$don_t_know_how_to_handle__S, constraint);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 13417L)
    public static SubLObject semantics_delete_table(final SubLObject semantics, final SubLObject table_semantics) {
        if (semantic_etl_bus.NIL != table_semantics_pointed_to_by_table_ids(table_semantics)) {
            Errors.error((SubLObject)semantic_etl_bus.$str57$Table__S_is_pointed_to_by__A_and_, table_semantics_table_name(table_semantics), Mapping.mapcar((SubLObject)semantic_etl_bus.$sym58$TABLE_SEMANTICS_TABLE_NAME, table_semantics_pointed_to_by_tables(table_semantics)));
        }
        SubLObject cdolist_list_var = table_semantics_column_constraints(table_semantics);
        SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
        constraint = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (semantic_etl_bus.NIL != foreign_key_constraint_p(constraint) && foreign_key_constraint_constrained_table(constraint).eql(table_semantics)) {
                table_semantics_remove_column_constraint(table_semantics, constraint);
                final SubLObject pointed_to_table = foreign_key_constraint_constraining_table(constraint);
                final SubLObject table_id = table_semantics_table_id(table_semantics);
                set_table_semantics_pointed_to_by_table_ids(pointed_to_table, Sequences.remove(table_id, table_semantics_pointed_to_by_table_ids(pointed_to_table), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
            }
            else if (semantic_etl_bus.NIL != primary_key_constraint_p(constraint) && primary_key_constraint_constrained_table(constraint).eql(table_semantics)) {
                table_semantics_remove_column_constraint(table_semantics, constraint);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        _csetf_semant_table_semantics_list(semantics, Sequences.remove(table_semantics, semantics_table_semantics_list(semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
        _csetf_semant_dict(semantics, table_id_to_table_semantics_dict(semantics));
        semantics_add_dropped(table_semantics_semantics(table_semantics), table_semantics);
        table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_drop(table_semantics));
        return semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 15366L)
    public static SubLObject semantics_delete_foreign_references_to_table(final SubLObject semantics, final SubLObject unwanted_table_semantics) {
        final SubLObject pointed_to_by_table_ids = table_semantics_pointed_to_by_table_ids(unwanted_table_semantics);
        final SubLObject dict = table_id_to_table_semantics_dict(semantics);
        SubLObject removed_constraints = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = pointed_to_by_table_ids;
        SubLObject table_id = (SubLObject)semantic_etl_bus.NIL;
        table_id = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            final SubLObject table = dictionary.dictionary_lookup(dict, table_id, (SubLObject)semantic_etl_bus.UNPROVIDED);
            SubLObject cdolist_list_var_$1 = table_semantics_column_constraints(table);
            SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
            constraint = cdolist_list_var_$1.first();
            while (semantic_etl_bus.NIL != cdolist_list_var_$1) {
                if (semantic_etl_bus.NIL != foreign_key_constraint_references_tableP(constraint, unwanted_table_semantics)) {
                    table_semantics_remove_column_constraint(table, constraint);
                    removed_constraints = (SubLObject)ConsesLow.cons(constraint, removed_constraints);
                    set_table_semantics_pointed_to_by_table_ids(unwanted_table_semantics, Sequences.remove(table_id, table_semantics_pointed_to_by_table_ids(unwanted_table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                constraint = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_id = cdolist_list_var.first();
        }
        return removed_constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 16398L)
    public static SubLObject semantics_dropped_tables(final SubLObject semantics) {
        return list_utilities.remove_if_not((SubLObject)semantic_etl_bus.$sym55$TABLE_SEMANTICS_P, semant_dropped_items(semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 16535L)
    public static SubLObject semantics_dropped_columns(final SubLObject semantics) {
        return list_utilities.remove_if_not((SubLObject)semantic_etl_bus.$sym59$COLUMN_SEMANTICS_P, semant_dropped_items(semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 16670L)
    public static SubLObject semantics_dropped_primary_key_constraints(final SubLObject semantics) {
        return list_utilities.remove_if_not((SubLObject)semantic_etl_bus.$sym60$PRIMARY_KEY_CONSTRAINT_P, semant_dropped_items(semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 16827L)
    public static SubLObject semantics_dropped_foreign_key_constraints(final SubLObject semantics) {
        return list_utilities.remove_if_not((SubLObject)semantic_etl_bus.$sym61$FOREIGN_KEY_CONSTRAINT_P, semant_dropped_items(semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject table_semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_table_semantics(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject table_semantics_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $table_semantics_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_table_id(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_table_name(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_source_semantics(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_semantics(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_points_to_table_ids(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_pointed_to_by_table_ids(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_table_parses(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_column_semantics_list(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_primary_key_columns(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject t_semant_column_constraints(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_table_id(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_table_name(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_source_semantics(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_semantics(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_points_to_table_ids(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_pointed_to_by_table_ids(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_table_parses(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_column_semantics_list(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_primary_key_columns(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject _csetf_t_semant_column_constraints(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_semantics_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject make_table_semantics(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $table_semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw90$TABLE_ID)) {
                _csetf_t_semant_table_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw91$TABLE_NAME)) {
                _csetf_t_semant_table_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw92$SOURCE_SEMANTICS)) {
                _csetf_t_semant_source_semantics(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw93$SEMANTICS)) {
                _csetf_t_semant_semantics(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw94$POINTS_TO_TABLE_IDS)) {
                _csetf_t_semant_points_to_table_ids(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw95$POINTED_TO_BY_TABLE_IDS)) {
                _csetf_t_semant_pointed_to_by_table_ids(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw96$TABLE_PARSES)) {
                _csetf_t_semant_table_parses(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw97$COLUMN_SEMANTICS_LIST)) {
                _csetf_t_semant_column_semantics_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw98$PRIMARY_KEY_COLUMNS)) {
                _csetf_t_semant_primary_key_columns(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw99$COLUMN_CONSTRAINTS)) {
                _csetf_t_semant_column_constraints(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject visit_defstruct_table_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym100$MAKE_TABLE_SEMANTICS, (SubLObject)semantic_etl_bus.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw90$TABLE_ID, t_semant_table_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw91$TABLE_NAME, t_semant_table_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw92$SOURCE_SEMANTICS, t_semant_source_semantics(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw93$SEMANTICS, t_semant_semantics(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw94$POINTS_TO_TABLE_IDS, t_semant_points_to_table_ids(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw95$POINTED_TO_BY_TABLE_IDS, t_semant_pointed_to_by_table_ids(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw96$TABLE_PARSES, t_semant_table_parses(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw97$COLUMN_SEMANTICS_LIST, t_semant_column_semantics_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw98$PRIMARY_KEY_COLUMNS, t_semant_primary_key_columns(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw99$COLUMN_CONSTRAINTS, t_semant_column_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym100$MAKE_TABLE_SEMANTICS, (SubLObject)semantic_etl_bus.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 17869L)
    public static SubLObject visit_defstruct_object_table_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_table_semantics(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 19677L)
    public static SubLObject print_table_semantics(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject semantics = t_semant_semantics(v_object);
        final SubLObject access_path = (SubLObject)((semantic_etl_bus.NIL != semantics) ? semant_access_path(semantics) : semantic_etl_bus.NIL);
        final SubLObject access_path_string = (SubLObject)((semantic_etl_bus.NIL != access_path) ? access_path_pretty_string(access_path) : semantic_etl_bus.NIL);
        final SubLObject source_semantics = t_semant_source_semantics(v_object);
        final SubLObject source_access_path = (SubLObject)((semantic_etl_bus.NIL != source_semantics) ? semant_access_path(source_semantics) : semantic_etl_bus.NIL);
        final SubLObject source_access_path_string = (SubLObject)((semantic_etl_bus.NIL != source_access_path) ? access_path_pretty_string(source_access_path) : semantic_etl_bus.NIL);
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str102$_TABLE__a__s___a__a___ref__a_ref_, new SubLObject[] { t_semant_table_id(v_object), t_semant_table_name(v_object), access_path_string, source_access_path_string, t_semant_points_to_table_ids(v_object), t_semant_pointed_to_by_table_ids(v_object), t_semant_column_constraints(v_object), t_semant_column_semantics_list(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 20802L)
    public static SubLObject do_column_semantics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list104);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject column_semantics = (SubLObject)semantic_etl_bus.NIL;
        SubLObject table_semantics = (SubLObject)semantic_etl_bus.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list104);
        column_semantics = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list104);
        table_semantics = current.first();
        current = current.rest();
        if (semantic_etl_bus.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)semantic_etl_bus.$sym1$CDOLIST, (SubLObject)ConsesLow.list(column_semantics, (SubLObject)ConsesLow.list((SubLObject)semantic_etl_bus.$sym105$TABLE_SEMANTICS_COLUMN_SEMANTICS_LIST, table_semantics)), ConsesLow.append(body, (SubLObject)semantic_etl_bus.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)semantic_etl_bus.$list104);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 21009L)
    public static SubLObject new_table_semantics(final SubLObject table_name, final SubLObject table_parses, final SubLObject column_semantics_list, final SubLObject primary_key_columns) {
        assert semantic_etl_bus.NIL != Types.stringp(table_name) : table_name;
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(column_semantics_list) : column_semantics_list;
        SubLObject cdolist_list_var = column_semantics_list;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != column_semantics_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(semantic_etl_bus.$semantic_etl_table_isg$.getGlobalValue());
        final SubLObject semantics = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject points_to_table_ids = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject pointed_to_by_table_ids = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject table_semantics = make_table_semantics((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_t_semant_table_id(table_semantics, id);
        _csetf_t_semant_table_name(table_semantics, table_name);
        _csetf_t_semant_semantics(table_semantics, semantics);
        _csetf_t_semant_pointed_to_by_table_ids(table_semantics, pointed_to_by_table_ids);
        _csetf_t_semant_points_to_table_ids(table_semantics, points_to_table_ids);
        _csetf_t_semant_table_parses(table_semantics, table_parses);
        _csetf_t_semant_column_semantics_list(table_semantics, column_semantics_list);
        _csetf_t_semant_primary_key_columns(table_semantics, primary_key_columns);
        SubLObject cdolist_list_var2 = column_semantics_list;
        SubLObject column_semantics = (SubLObject)semantic_etl_bus.NIL;
        column_semantics = cdolist_list_var2.first();
        while (semantic_etl_bus.NIL != cdolist_list_var2) {
            set_column_semantics_table_semantics(column_semantics, table_semantics);
            cdolist_list_var2 = cdolist_list_var2.rest();
            column_semantics = cdolist_list_var2.first();
        }
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 22892L)
    public static SubLObject copy_table_semantics_list(final SubLObject old_table_semantics_list) {
        SubLObject old_to_new_mappings = (SubLObject)semantic_etl_bus.NIL;
        SubLObject new_list = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = old_table_semantics_list;
        SubLObject old_table_semantics = (SubLObject)semantic_etl_bus.NIL;
        old_table_semantics = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            final SubLObject name = table_semantics_table_name(old_table_semantics);
            final SubLObject semantics = table_semantics_semantics(old_table_semantics);
            final SubLObject source_semantics = table_semantics_source_semantics(old_table_semantics);
            final SubLObject points_to_table_ids = table_semantics_points_to_table_ids(old_table_semantics);
            final SubLObject pointed_to_by_table_ids = table_semantics_pointed_to_by_table_ids(old_table_semantics);
            final SubLObject primary_key_columns = table_semantics_primary_key_columns(old_table_semantics);
            final SubLObject primary_key_column_names = Mapping.mapcar((SubLObject)semantic_etl_bus.$sym107$COLUMN_SEMANTICS_COLUMN_NAME, primary_key_columns);
            final SubLObject table_parses = conses_high.copy_tree(table_semantics_table_parses(old_table_semantics));
            final SubLObject old_column_semantics = table_semantics_column_semantics_list(old_table_semantics);
            final SubLObject new_column_semantics = copy_column_semantics_list(old_column_semantics);
            final SubLObject new_primary_key_columns = get_columns_named(new_column_semantics, primary_key_column_names);
            final SubLObject new_table_semantics = new_table_semantics(name, table_parses, new_column_semantics, new_primary_key_columns);
            final SubLObject old_column_constraints = table_semantics_column_constraints(old_table_semantics);
            final SubLObject new_column_constraints = Mapping.mapcar((SubLObject)semantic_etl_bus.$sym108$COPY_COLUMN_CONSTRAINT, old_column_constraints);
            _csetf_t_semant_source_semantics(new_table_semantics, source_semantics);
            old_to_new_mappings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(table_semantics_table_id(old_table_semantics), table_semantics_table_id(new_table_semantics)), old_to_new_mappings);
            set_table_semantics_points_to_table_ids(new_table_semantics, points_to_table_ids);
            set_table_semantics_pointed_to_by_table_ids(new_table_semantics, pointed_to_by_table_ids);
            set_table_semantics_semantics(new_table_semantics, semantics);
            set_table_semantics_column_constraints(new_table_semantics, new_column_constraints);
            new_list = (SubLObject)ConsesLow.cons(new_table_semantics, new_list);
            cdolist_list_var = cdolist_list_var.rest();
            old_table_semantics = cdolist_list_var.first();
        }
        cdolist_list_var = new_list;
        SubLObject table_semantics = (SubLObject)semantic_etl_bus.NIL;
        table_semantics = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            set_table_semantics_pointed_to_by_table_ids(table_semantics, list_utilities.tree_substitute_by_association(table_semantics_pointed_to_by_table_ids(table_semantics), old_to_new_mappings, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
            set_table_semantics_points_to_table_ids(table_semantics, list_utilities.tree_substitute_by_association(table_semantics_points_to_table_ids(table_semantics), old_to_new_mappings, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
            update_table_semantics_column_constraints(table_semantics, new_list);
            cdolist_list_var = cdolist_list_var.rest();
            table_semantics = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 25721L)
    public static SubLObject get_columns_named(final SubLObject list_of_column_semantics, final SubLObject names) {
        SubLObject desired_columns = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = names;
        SubLObject name = (SubLObject)semantic_etl_bus.NIL;
        name = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            SubLObject desired_column = (SubLObject)semantic_etl_bus.NIL;
            if (semantic_etl_bus.NIL == desired_column) {
                SubLObject csome_list_var = list_of_column_semantics;
                SubLObject column = (SubLObject)semantic_etl_bus.NIL;
                column = csome_list_var.first();
                while (semantic_etl_bus.NIL == desired_column && semantic_etl_bus.NIL != csome_list_var) {
                    if (column_semantics_column_name(column).equal(name)) {
                        desired_column = column;
                    }
                    csome_list_var = csome_list_var.rest();
                    column = csome_list_var.first();
                }
            }
            desired_columns = (SubLObject)ConsesLow.cons(desired_column, desired_columns);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        return desired_columns;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 26102L)
    public static SubLObject table_semantics_list_get_table_semantics_named(final SubLObject table_semantics_list, final SubLObject table_name) {
        SubLObject cdolist_list_var = table_semantics_list;
        SubLObject table_semantics = (SubLObject)semantic_etl_bus.NIL;
        table_semantics = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (table_name.equal(table_semantics_table_name(table_semantics))) {
                return table_semantics;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_semantics = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 26368L)
    public static SubLObject table_semantics_table_id(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_table_id(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 26616L)
    public static SubLObject table_semantics_table_name(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_table_name(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 26844L)
    public static SubLObject table_semantics_source_semantics(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_source_semantics(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 27103L)
    public static SubLObject table_semantics_semantics(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_semantics(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 27345L)
    public static SubLObject table_semantics_linked_table_ids(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return Sequences.cconcatenate(table_semantics_points_to_table_ids(table_semantics), table_semantics_pointed_to_by_table_ids(table_semantics));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 27792L)
    public static SubLObject table_semantics_points_to_table_ids(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_points_to_table_ids(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 28116L)
    public static SubLObject table_semantics_pointed_to_by_table_ids(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_pointed_to_by_table_ids(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 28443L)
    public static SubLObject table_semantics_pointed_to_by_tables(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        final SubLObject semantics = table_semantics_semantics(table_semantics);
        SubLObject tables = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = t_semant_pointed_to_by_table_ids(table_semantics);
        SubLObject id = (SubLObject)semantic_etl_bus.NIL;
        id = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            tables = (SubLObject)ConsesLow.cons(semantics_get_table_with_id(semantics, id), tables);
            cdolist_list_var = cdolist_list_var.rest();
            id = cdolist_list_var.first();
        }
        return tables;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 28876L)
    public static SubLObject table_semantics_primary_key_columns(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_primary_key_columns(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 29150L)
    public static SubLObject table_semantics_table_parses(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_table_parses(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 29589L)
    public static SubLObject table_semantics_column_semantics_list(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_column_semantics_list(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 29914L)
    public static SubLObject table_semantics_column_constraints(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return t_semant_column_constraints(table_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 30244L)
    public static SubLObject set_table_semantics_semantics(final SubLObject table_semantics, final SubLObject semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        assert semantic_etl_bus.NIL != semantics_p(semantics) : semantics;
        _csetf_t_semant_semantics(table_semantics, semantics);
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 30558L)
    public static SubLObject set_table_semantics_pointed_to_by_table_ids(final SubLObject table_semantics, final SubLObject table_ids) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(table_ids) : table_ids;
        SubLObject cdolist_list_var = table_ids;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != Types.integerp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        _csetf_t_semant_pointed_to_by_table_ids(table_semantics, table_ids);
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 30833L)
    public static SubLObject set_table_semantics_points_to_table_ids(final SubLObject table_semantics, final SubLObject table_ids) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(table_ids) : table_ids;
        SubLObject cdolist_list_var = table_ids;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != Types.integerp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        _csetf_t_semant_points_to_table_ids(table_semantics, table_ids);
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 31100L)
    public static SubLObject set_table_semantics_primary_key_columns(final SubLObject table_semantics, final SubLObject primary_key_columns) {
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(table_semantics) : table_semantics;
        SubLObject cdolist_list_var = table_semantics;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != table_semantics_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(primary_key_columns) : primary_key_columns;
        cdolist_list_var = primary_key_columns;
        elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != column_semantics_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        _csetf_t_semant_primary_key_columns(table_semantics, primary_key_columns);
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 31412L)
    public static SubLObject set_table_semantics_source_semantics(final SubLObject table_semantics, final SubLObject source_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        assert semantic_etl_bus.NIL != semantics_p(source_semantics) : source_semantics;
        _csetf_t_semant_source_semantics(table_semantics, source_semantics);
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 31692L)
    public static SubLObject set_table_semantics_column_constraints(final SubLObject table_semantics, final SubLObject constraints) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        assert semantic_etl_bus.NIL != Types.listp(constraints) : constraints;
        _csetf_t_semant_column_constraints(table_semantics, constraints);
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 31955L)
    public static SubLObject find_corresponding_item_in_semantics_table_semantics_method(final SubLObject table, final SubLObject semantics) {
        return semantics_get_table_named(semantics, table_semantics_table_name(table));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 32140L)
    public static SubLObject semantic_object_comparison_name_table_semantics_method(final SubLObject table) {
        return table_semantics_table_name(table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 32258L)
    public static SubLObject table_semantics_append_to_semantic_recipe(final SubLObject table_semantics, final SubLObject step) {
        if (semantic_etl_bus.NIL != semant_output_spec(table_semantics_semantics(table_semantics))) {
            return output_spec_append_to_semantic_recipe(table_semantics_output_spec(table_semantics), step);
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 32590L)
    public static SubLObject table_semantics_output_spec(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return semant_output_spec(table_semantics_semantics(table_semantics));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 32778L)
    public static SubLObject table_semantics_imported_key_columns(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return Mapping.mapcar((SubLObject)semantic_etl_bus.$sym113$FOREIGN_KEY_CONSTRAINT_CONSTRAINED_COLUMN, table_semantics_foreign_key_constraints(table_semantics));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 33125L)
    public static SubLObject table_semantics_foreign_key_constraints(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return Values.values(list_utilities.remove_if_not((SubLObject)semantic_etl_bus.$sym61$FOREIGN_KEY_CONSTRAINT_P, table_semantics_column_constraints(table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED), semantics_dropped_foreign_key_constraints(table_semantics_semantics(table_semantics)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 33460L)
    public static SubLObject table_semantics_primary_key_constraints(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return Values.values(list_utilities.remove_if_not((SubLObject)semantic_etl_bus.$sym60$PRIMARY_KEY_CONSTRAINT_P, table_semantics_column_constraints(table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED), semantics_dropped_primary_key_constraints(table_semantics_semantics(table_semantics)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 33804L)
    public static SubLObject table_semantics_column_count(final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        return Sequences.length(table_semantics_column_semantics_list(table_semantics));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 34070L)
    public static SubLObject table_semantics_get_column_named(final SubLObject table_semantics, final SubLObject name) {
        SubLObject cdolist_list_var = table_semantics_column_semantics_list(table_semantics);
        SubLObject table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (name.equalp(column_semantics_column_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        cdolist_list_var = semantics_dropped_columns(table_semantics_semantics(table_semantics));
        table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (name.equalp(column_semantics_column_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 34559L)
    public static SubLObject table_semantics_content_columns(final SubLObject table_semantics) {
        return list_utilities.remove_if_not((SubLObject)semantic_etl_bus.$sym114$CONTENT_COLUMN_, table_semantics_column_semantics_list(table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 34902L)
    public static SubLObject content_columnP(final SubLObject column_semantics) {
        if (semantic_etl_bus.NIL != list_utilities.lengthE(table_semantics_column_semantics_list(column_semantics_table_semantics(column_semantics)), (SubLObject)semantic_etl_bus.ONE_INTEGER, (SubLObject)semantic_etl_bus.UNPROVIDED)) {
            return (SubLObject)semantic_etl_bus.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(semantic_etl_bus.NIL == imported_key_columnP(column_semantics) && semantic_etl_bus.NIL == primary_key_columnP(column_semantics));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 35512L)
    public static SubLObject imported_key_columnP(final SubLObject column_semantics) {
        final SubLObject table_semantics = column_semantics_table_semantics(column_semantics);
        return subl_promotions.memberP(column_semantics, table_semantics_imported_key_columns(table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 35834L)
    public static SubLObject primary_key_columnP(final SubLObject column_semantics) {
        final SubLObject table_semantics = column_semantics_table_semantics(column_semantics);
        return subl_promotions.memberP(column_semantics, table_semantics_primary_key_columns(table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 36152L)
    public static SubLObject table_semantics_add_column_constraint(final SubLObject table_semantics, final SubLObject constraint) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        assert semantic_etl_bus.NIL != column_constraint_p(constraint) : constraint;
        set_table_semantics_column_constraints(table_semantics, (SubLObject)ConsesLow.cons(constraint, t_semant_column_constraints(table_semantics)));
        if (semantic_etl_bus.NIL != foreign_key_constraint_p(constraint)) {
            final SubLObject constraining_table = foreign_key_constraint_constraining_table(constraint);
            final SubLObject constraining_table_id = table_semantics_table_id(constraining_table);
            SubLObject item_var;
            final SubLObject table_id = item_var = table_semantics_table_id(table_semantics);
            if (semantic_etl_bus.NIL == conses_high.member(item_var, t_semant_pointed_to_by_table_ids(constraining_table), Symbols.symbol_function((SubLObject)semantic_etl_bus.EQL), Symbols.symbol_function((SubLObject)semantic_etl_bus.IDENTITY))) {
                _csetf_t_semant_pointed_to_by_table_ids(constraining_table, (SubLObject)ConsesLow.cons(item_var, t_semant_pointed_to_by_table_ids(constraining_table)));
            }
            item_var = constraining_table_id;
            if (semantic_etl_bus.NIL == conses_high.member(item_var, t_semant_points_to_table_ids(table_semantics), Symbols.symbol_function((SubLObject)semantic_etl_bus.EQL), Symbols.symbol_function((SubLObject)semantic_etl_bus.IDENTITY))) {
                _csetf_t_semant_points_to_table_ids(table_semantics, (SubLObject)ConsesLow.cons(item_var, t_semant_points_to_table_ids(table_semantics)));
            }
        }
        table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_add(constraint));
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 37141L)
    public static SubLObject table_semantics_remove_column_constraint(final SubLObject table_semantics, final SubLObject constraint) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        assert semantic_etl_bus.NIL != column_constraint_p(constraint) : constraint;
        set_table_semantics_column_constraints(table_semantics, Sequences.remove(constraint, table_semantics_column_constraints(table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
        semantics_add_dropped(table_semantics_semantics(table_semantics), constraint);
        table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_drop(constraint));
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 37773L)
    public static SubLObject update_table_semantics_column_constraints(final SubLObject table_semantics, final SubLObject new_table_semantics_list) {
        SubLObject cdolist_list_var = table_semantics_column_constraints(table_semantics);
        SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
        constraint = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (semantic_etl_bus.NIL != foreign_key_constraint_p(constraint)) {
                final SubLObject old_constrained_column = foreign_key_constraint_constrained_column(constraint);
                final SubLObject old_constrained_table = column_semantics_table_semantics(old_constrained_column);
                final SubLObject old_constraining_column = foreign_key_constraint_constraining_column(constraint);
                final SubLObject old_constraining_table = foreign_key_constraint_constraining_table(constraint);
                final SubLObject new_constrained_table = table_semantics_list_get_table_semantics_named(new_table_semantics_list, table_semantics_table_name(old_constrained_table));
                final SubLObject new_constrained_column = table_semantics_get_column_named(new_constrained_table, column_semantics_column_name(old_constrained_column));
                final SubLObject new_constraining_table = (SubLObject)((semantic_etl_bus.NIL != old_constraining_table) ? table_semantics_list_get_table_semantics_named(new_table_semantics_list, table_semantics_table_name(old_constraining_table)) : semantic_etl_bus.NIL);
                final SubLObject new_constraining_column = (SubLObject)((semantic_etl_bus.NIL != old_constraining_column) ? table_semantics_get_column_named(new_constraining_table, column_semantics_column_name(old_constraining_column)) : semantic_etl_bus.NIL);
                set_foreign_key_constraint_constrained_column(constraint, new_constrained_column);
                set_foreign_key_constraint_constraining_column(constraint, new_constraining_column);
                set_foreign_key_constraint_constraining_table(constraint, new_constraining_table);
            }
            else if (semantic_etl_bus.NIL != primary_key_constraint_p(constraint)) {
                final SubLObject old_constrained_column = primary_key_constraint_constrained_column(constraint);
                final SubLObject old_constrained_column_name = column_semantics_column_name(old_constrained_column);
                final SubLObject new_constrained_column2 = table_semantics_get_column_named(table_semantics, old_constrained_column_name);
                set_primary_key_constraint_constrained_column(constraint, new_constrained_column2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 40241L)
    public static SubLObject table_semantics_delete_column(final SubLObject table_semantics, final SubLObject column_semantics) {
        if (semantic_etl_bus.NIL != table_semantics_pointed_to_by_table_ids(table_semantics)) {
            final SubLObject dict = table_id_to_table_semantics_dict(table_semantics_semantics(table_semantics));
            SubLObject cdolist_list_var = table_semantics_pointed_to_by_table_ids(table_semantics);
            SubLObject referencing_table_id = (SubLObject)semantic_etl_bus.NIL;
            referencing_table_id = cdolist_list_var.first();
            while (semantic_etl_bus.NIL != cdolist_list_var) {
                final SubLObject referencing_table = dictionary.dictionary_lookup(dict, referencing_table_id, (SubLObject)semantic_etl_bus.UNPROVIDED);
                SubLObject cdolist_list_var_$2 = table_semantics_column_constraints(referencing_table);
                SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
                constraint = cdolist_list_var_$2.first();
                while (semantic_etl_bus.NIL != cdolist_list_var_$2) {
                    if (semantic_etl_bus.NIL != foreign_key_constraint_references_columnP(constraint, column_semantics)) {
                        Errors.error((SubLObject)semantic_etl_bus.$str116$Column__S_is_pointed_to_by__A_and, column_semantics, referencing_table);
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    constraint = cdolist_list_var_$2.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                referencing_table_id = cdolist_list_var.first();
            }
        }
        SubLObject cdolist_list_var2 = table_semantics_column_constraints(table_semantics);
        SubLObject constraint2 = (SubLObject)semantic_etl_bus.NIL;
        constraint2 = cdolist_list_var2.first();
        while (semantic_etl_bus.NIL != cdolist_list_var2) {
            if (semantic_etl_bus.NIL != foreign_key_constraint_p(constraint2) && foreign_key_constraint_constrained_column(constraint2).eql(column_semantics)) {
                table_semantics_remove_column_constraint(table_semantics, constraint2);
                final SubLObject pointed_to_table = foreign_key_constraint_constraining_table(constraint2);
                final SubLObject table_id = table_semantics_table_id(table_semantics);
                set_table_semantics_pointed_to_by_table_ids(pointed_to_table, Sequences.remove(table_id, table_semantics_pointed_to_by_table_ids(pointed_to_table), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
            }
            else if (semantic_etl_bus.NIL != primary_key_constraint_p(constraint2) && primary_key_constraint_constrained_column(constraint2).eql(column_semantics)) {
                table_semantics_remove_column_constraint(table_semantics, constraint2);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            constraint2 = cdolist_list_var2.first();
        }
        _csetf_t_semant_column_semantics_list(table_semantics, Sequences.remove(column_semantics, table_semantics_column_semantics_list(table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
        semantics_add_dropped(table_semantics_semantics(table_semantics), column_semantics);
        table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_drop(column_semantics));
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 42339L)
    public static SubLObject table_semantics_delete_foreign_references_to_column(final SubLObject table_semantics, final SubLObject unwanted_column_semantics) {
        final SubLObject pointed_to_by_table_ids = table_semantics_pointed_to_by_table_ids(table_semantics);
        final SubLObject dict = table_id_to_table_semantics_dict(table_semantics_semantics(table_semantics));
        SubLObject removed_constraints = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = pointed_to_by_table_ids;
        SubLObject table_id = (SubLObject)semantic_etl_bus.NIL;
        table_id = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            final SubLObject other_table = dictionary.dictionary_lookup(dict, table_id, (SubLObject)semantic_etl_bus.UNPROVIDED);
            SubLObject cdolist_list_var_$3 = table_semantics_column_constraints(other_table);
            SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
            constraint = cdolist_list_var_$3.first();
            while (semantic_etl_bus.NIL != cdolist_list_var_$3) {
                if (semantic_etl_bus.NIL != foreign_key_constraint_references_columnP(constraint, unwanted_column_semantics)) {
                    table_semantics_remove_column_constraint(other_table, constraint);
                    removed_constraints = (SubLObject)ConsesLow.cons(constraint, removed_constraints);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                constraint = cdolist_list_var_$3.first();
            }
            if (semantic_etl_bus.NIL == foreign_key_constraints_reference_columns_other_than_in_table(removed_constraints, unwanted_column_semantics, table_semantics)) {
                set_table_semantics_pointed_to_by_table_ids(table_semantics, Sequences.remove(table_id, table_semantics_pointed_to_by_table_ids(table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_id = cdolist_list_var.first();
        }
        cdolist_list_var = removed_constraints;
        SubLObject constraint2 = (SubLObject)semantic_etl_bus.NIL;
        constraint2 = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            semantics_add_dropped(table_semantics_semantics(table_semantics), constraint2);
            table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_drop(constraint2));
            cdolist_list_var = cdolist_list_var.rest();
            constraint2 = cdolist_list_var.first();
        }
        return removed_constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 43854L)
    public static SubLObject table_semantics_delete_column_constraint(final SubLObject table_semantics, final SubLObject constraint) {
        if (semantic_etl_bus.NIL != primary_key_constraint_p(constraint)) {
            table_semantics_remove_column_constraint(table_semantics, constraint);
        }
        else if (semantic_etl_bus.NIL != foreign_key_constraint_p(constraint)) {
            final SubLObject constraining_table = foreign_key_constraint_constraining_table(constraint);
            final SubLObject constraining_table_id = table_semantics_table_id(constraining_table);
            final SubLObject table_id = table_semantics_table_id(table_semantics);
            if (semantic_etl_bus.NIL == other_foreign_key_constraints_reference_table(constraint, constraining_table)) {
                set_table_semantics_pointed_to_by_table_ids(constraining_table, Sequences.remove(table_id, table_semantics_pointed_to_by_table_ids(constraining_table), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
                set_table_semantics_points_to_table_ids(table_semantics, Sequences.remove(constraining_table_id, table_semantics_points_to_table_ids(table_semantics), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
            }
            table_semantics_remove_column_constraint(table_semantics, constraint);
        }
        else {
            Errors.warn((SubLObject)semantic_etl_bus.$str117$don_t_know_how_to_remove_constrai, constraint, table_semantics);
        }
        return table_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 45099L)
    public static SubLObject other_foreign_key_constraints_reference_table(final SubLObject constraint, final SubLObject table) {
        final SubLObject referenced_table = foreign_key_constraint_constrained_table(constraint);
        SubLObject cdolist_list_var = table_semantics_foreign_key_constraints(table);
        SubLObject test_constraint = (SubLObject)semantic_etl_bus.NIL;
        test_constraint = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (!foreign_key_constraint_constrained_table(test_constraint).equal(referenced_table)) {
                return test_constraint;
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_constraint = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 45747L)
    public static SubLObject table_name_to_id_dict(final SubLObject semantics) {
        assert semantic_etl_bus.NIL != semantics_p(semantics) : semantics;
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)semantic_etl_bus.EQUALP), (SubLObject)semantic_etl_bus.UNPROVIDED);
        SubLObject cdolist_list_var = semantics_table_semantics_list(semantics);
        SubLObject table_semantics = (SubLObject)semantic_etl_bus.NIL;
        table_semantics = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            final SubLObject table_name = table_semantics_table_name(table_semantics);
            final SubLObject table_id = table_semantics_table_id(table_semantics);
            dictionary.dictionary_enter(dict, table_name, table_id);
            cdolist_list_var = cdolist_list_var.rest();
            table_semantics = cdolist_list_var.first();
        }
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 46234L)
    public static SubLObject table_id_to_table_semantics_dict(final SubLObject semantics) {
        final SubLObject dict = dictionary.new_dictionary((SubLObject)semantic_etl_bus.EQL, (SubLObject)semantic_etl_bus.UNPROVIDED);
        SubLObject cdolist_list_var = semantics_table_semantics_list(semantics);
        SubLObject table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            dictionary.dictionary_enter(dict, table_semantics_table_id(table), table);
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 46568L)
    public static SubLObject column_constraint_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(semantic_etl_bus.NIL != foreign_key_constraint_p(obj) || semantic_etl_bus.NIL != primary_key_constraint_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 46757L)
    public static SubLObject copy_column_constraint(final SubLObject constraint) {
        if (semantic_etl_bus.NIL != foreign_key_constraint_p(constraint)) {
            return copy_foreign_key_constraint(constraint);
        }
        if (semantic_etl_bus.NIL != primary_key_constraint_p(constraint)) {
            return copy_primary_key_constraint(constraint);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str118$Don_t_know_how_to_copy_constraint, constraint);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject foreign_key_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_foreign_key_constraint(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject foreign_key_constraint_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $foreign_key_constraint_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject fk_constraint_constraint_name(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject fk_constraint_constrained_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject fk_constraint_constraining_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject fk_constraint_constraining_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject _csetf_fk_constraint_constraint_name(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject _csetf_fk_constraint_constrained_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject _csetf_fk_constraint_constraining_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject _csetf_fk_constraint_constraining_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject make_foreign_key_constraint(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $foreign_key_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw135$CONSTRAINT_NAME)) {
                _csetf_fk_constraint_constraint_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw136$CONSTRAINED_COLUMN)) {
                _csetf_fk_constraint_constrained_column(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw137$CONSTRAINING_TABLE)) {
                _csetf_fk_constraint_constraining_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw138$CONSTRAINING_COLUMN)) {
                _csetf_fk_constraint_constraining_column(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject visit_defstruct_foreign_key_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym139$MAKE_FOREIGN_KEY_CONSTRAINT, (SubLObject)semantic_etl_bus.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw135$CONSTRAINT_NAME, fk_constraint_constraint_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw136$CONSTRAINED_COLUMN, fk_constraint_constrained_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw137$CONSTRAINING_TABLE, fk_constraint_constraining_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw138$CONSTRAINING_COLUMN, fk_constraint_constraining_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym139$MAKE_FOREIGN_KEY_CONSTRAINT, (SubLObject)semantic_etl_bus.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 47545L)
    public static SubLObject visit_defstruct_object_foreign_key_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_foreign_key_constraint(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 48134L)
    public static SubLObject print_foreign_key_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str141$_FK_CONSTRAINT___a_____A__A__, new SubLObject[] { column_semantics_column_name(fk_constraint_constrained_column(v_object)), table_semantics_table_name(fk_constraint_constraining_table(v_object)), column_semantics_column_name(fk_constraint_constraining_column(v_object)) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 48593L)
    public static SubLObject new_foreign_key_constraint(final SubLObject constraint_name, final SubLObject constrained_column, final SubLObject constraining_column) {
        assert semantic_etl_bus.NIL != Types.stringp(constraint_name) : constraint_name;
        assert semantic_etl_bus.NIL != column_semantics_p(constrained_column) : constrained_column;
        assert semantic_etl_bus.NIL != column_semantics_p(constraining_column) : constraining_column;
        final SubLObject foreign_key_constraint = make_foreign_key_constraint((SubLObject)semantic_etl_bus.UNPROVIDED);
        final SubLObject constraining_table = c_semant_table_semantics(constraining_column);
        _csetf_fk_constraint_constraint_name(foreign_key_constraint, constraint_name);
        _csetf_fk_constraint_constrained_column(foreign_key_constraint, constrained_column);
        _csetf_fk_constraint_constraining_table(foreign_key_constraint, constraining_table);
        _csetf_fk_constraint_constraining_column(foreign_key_constraint, constraining_column);
        return foreign_key_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 49505L)
    public static SubLObject copy_foreign_key_constraint(final SubLObject foreign_key_constraint) {
        final SubLObject constraint_name = foreign_key_constraint_constraint_name(foreign_key_constraint);
        final SubLObject constrained_column = foreign_key_constraint_constrained_column(foreign_key_constraint);
        final SubLObject constraining_column = foreign_key_constraint_constraining_column(foreign_key_constraint);
        final SubLObject new_constraint = new_foreign_key_constraint(constraint_name, constrained_column, constraining_column);
        return new_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 50067L)
    public static SubLObject foreign_key_constraint_constraint_name(final SubLObject foreign_key_constraint) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(foreign_key_constraint) : foreign_key_constraint;
        return fk_constraint_constraint_name(foreign_key_constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 50363L)
    public static SubLObject foreign_key_constraint_constrained_column(final SubLObject foreign_key_constraint) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(foreign_key_constraint) : foreign_key_constraint;
        return fk_constraint_constrained_column(foreign_key_constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 50660L)
    public static SubLObject foreign_key_constraint_constraining_column(final SubLObject foreign_key_constraint) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(foreign_key_constraint) : foreign_key_constraint;
        return fk_constraint_constraining_column(foreign_key_constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 50984L)
    public static SubLObject foreign_key_constraint_constraining_table(final SubLObject foreign_key_constraint) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(foreign_key_constraint) : foreign_key_constraint;
        return fk_constraint_constraining_table(foreign_key_constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 51327L)
    public static SubLObject set_foreign_key_constraint_constraint_name(final SubLObject foreign_key_constraint, final SubLObject name) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(foreign_key_constraint) : foreign_key_constraint;
        assert semantic_etl_bus.NIL != Types.stringp(name) : name;
        _csetf_fk_constraint_constraint_name(foreign_key_constraint, name);
        return foreign_key_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 51624L)
    public static SubLObject set_foreign_key_constraint_constrained_column(final SubLObject foreign_key_constraint, final SubLObject constrained_column) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(foreign_key_constraint) : foreign_key_constraint;
        assert semantic_etl_bus.NIL != column_semantics_p(constrained_column) : constrained_column;
        _csetf_fk_constraint_constrained_column(foreign_key_constraint, constrained_column);
        return foreign_key_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 51968L)
    public static SubLObject set_foreign_key_constraint_constraining_column(final SubLObject foreign_key_constraint, final SubLObject constraining_column) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(foreign_key_constraint) : foreign_key_constraint;
        assert semantic_etl_bus.NIL != column_semantics_p(constraining_column) : constraining_column;
        _csetf_fk_constraint_constraining_column(foreign_key_constraint, constraining_column);
        return foreign_key_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 52317L)
    public static SubLObject set_foreign_key_constraint_constraining_table(final SubLObject foreign_key_constraint, final SubLObject constraining_table) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(foreign_key_constraint) : foreign_key_constraint;
        assert semantic_etl_bus.NIL != table_semantics_p(constraining_table) : constraining_table;
        _csetf_fk_constraint_constraining_table(foreign_key_constraint, constraining_table);
        return foreign_key_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 52660L)
    public static SubLObject find_corresponding_item_in_semantics_foreign_key_constraint_method(final SubLObject constraint, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constrained_column = foreign_key_constraint_constrained_column(constraint);
        final SubLObject constrained_column_name = column_semantics_column_name(constrained_column);
        final SubLObject new_constrained_column = find_corresponding_item_in_semantics(constrained_column, semantics);
        final SubLObject new_constrained_table = column_semantics_table_semantics(new_constrained_column);
        final SubLObject constraining_column = foreign_key_constraint_constraining_column(constraint);
        final SubLObject constraining_column_name = column_semantics_column_name(constraining_column);
        thread.resetMultipleValues();
        final SubLObject active_constraints = table_semantics_foreign_key_constraints(new_constrained_table);
        final SubLObject dropped_constraints = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = Sequences.cconcatenate(active_constraints, dropped_constraints);
        SubLObject new_constraint = (SubLObject)semantic_etl_bus.NIL;
        new_constraint = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (column_semantics_column_name(foreign_key_constraint_constraining_column(new_constraint)).equal(constraining_column_name) && column_semantics_column_name(foreign_key_constraint_constrained_column(new_constraint)).equal(constrained_column_name)) {
                return constraint;
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_constraint = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 53969L)
    public static SubLObject semantic_object_comparison_name_foreign_key_constraint_method(final SubLObject constraint) {
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(foreign_key_constraint_constrained_table_name(constraint)), new SubLObject[] { semantic_etl_bus.$str143$_, format_nil.format_nil_a_no_copy(foreign_key_constraint_constrained_column_name(constraint)), semantic_etl_bus.$str144$__, format_nil.format_nil_a_no_copy(foreign_key_constraint_constraining_table_name(constraint)), semantic_etl_bus.$str143$_, format_nil.format_nil_a_no_copy(foreign_key_constraint_constraining_column_name(constraint)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 54352L)
    public static SubLObject foreign_key_constraint_constrained_table(final SubLObject constraint) {
        assert semantic_etl_bus.NIL != foreign_key_constraint_p(constraint) : constraint;
        return column_semantics_table_semantics(foreign_key_constraint_constrained_column(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 54577L)
    public static SubLObject foreign_key_constraint_references_tableP(final SubLObject constraint, final SubLObject table) {
        return (SubLObject)SubLObjectFactory.makeBoolean(semantic_etl_bus.NIL != foreign_key_constraint_p(constraint) && foreign_key_constraint_constraining_table(constraint).eql(table));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 54782L)
    public static SubLObject foreign_key_constraint_references_columnP(final SubLObject constraint, final SubLObject column) {
        return (SubLObject)SubLObjectFactory.makeBoolean(semantic_etl_bus.NIL != foreign_key_constraint_p(constraint) && foreign_key_constraint_constraining_column(constraint).eql(column));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 54991L)
    public static SubLObject foreign_key_constraints_reference_columns_other_than_in_table(final SubLObject constraints, final SubLObject column_semantics, final SubLObject table_semantics) {
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
        constraint = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (foreign_key_constraint_constrained_table(constraint).eql(table_semantics) && !foreign_key_constraint_constraining_column(constraint).eql(column_semantics)) {
                return (SubLObject)semantic_etl_bus.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 55473L)
    public static SubLObject foreign_key_constraint_constrained_column_name(final SubLObject constraint) {
        return column_semantics_column_name(foreign_key_constraint_constrained_column(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 55647L)
    public static SubLObject foreign_key_constraint_constrained_table_name(final SubLObject constraint) {
        return table_semantics_table_name(foreign_key_constraint_constrained_table(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 55817L)
    public static SubLObject foreign_key_constraint_constraining_column_name(final SubLObject constraint) {
        return column_semantics_column_name(foreign_key_constraint_constraining_column(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 55993L)
    public static SubLObject foreign_key_constraint_constraining_table_name(final SubLObject constraint) {
        return table_semantics_table_name(foreign_key_constraint_constraining_table(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject primary_key_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_primary_key_constraint(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject primary_key_constraint_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $primary_key_constraint_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject pk_constraint_constraint_name(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject pk_constraint_constraint_type(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject pk_constraint_constrained_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject _csetf_pk_constraint_constraint_name(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject _csetf_pk_constraint_constraint_type(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject _csetf_pk_constraint_constrained_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject make_primary_key_constraint(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $primary_key_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw135$CONSTRAINT_NAME)) {
                _csetf_pk_constraint_constraint_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw160$CONSTRAINT_TYPE)) {
                _csetf_pk_constraint_constraint_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw136$CONSTRAINED_COLUMN)) {
                _csetf_pk_constraint_constrained_column(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject visit_defstruct_primary_key_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym161$MAKE_PRIMARY_KEY_CONSTRAINT, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw135$CONSTRAINT_NAME, pk_constraint_constraint_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw160$CONSTRAINT_TYPE, pk_constraint_constraint_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw136$CONSTRAINED_COLUMN, pk_constraint_constrained_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym161$MAKE_PRIMARY_KEY_CONSTRAINT, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56553L)
    public static SubLObject visit_defstruct_object_primary_key_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_primary_key_constraint(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 56957L)
    public static SubLObject print_primary_key_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str163$_PK_CONSTRAINT___a_, column_semantics_column_name(pk_constraint_constrained_column(v_object)));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 57228L)
    public static SubLObject new_primary_key_constraint(final SubLObject constraint_name, final SubLObject constrained_column) {
        assert semantic_etl_bus.NIL != Types.stringp(constraint_name) : constraint_name;
        assert semantic_etl_bus.NIL != column_semantics_p(constrained_column) : constrained_column;
        final SubLObject primary_key_constraint = make_primary_key_constraint((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_pk_constraint_constraint_name(primary_key_constraint, constraint_name);
        _csetf_pk_constraint_constrained_column(primary_key_constraint, constrained_column);
        return primary_key_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 57779L)
    public static SubLObject copy_primary_key_constraint(final SubLObject primary_key_constraint) {
        final SubLObject constraint_name = primary_key_constraint_constraint_name(primary_key_constraint);
        final SubLObject constrained_column = primary_key_constraint_constrained_column(primary_key_constraint);
        final SubLObject new_constraint = new_primary_key_constraint(constraint_name, constrained_column);
        return new_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 58229L)
    public static SubLObject primary_key_constraint_constraint_name(final SubLObject primary_key_constraint) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(primary_key_constraint) : primary_key_constraint;
        return pk_constraint_constraint_name(primary_key_constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 58525L)
    public static SubLObject primary_key_constraint_constrained_column(final SubLObject primary_key_constraint) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(primary_key_constraint) : primary_key_constraint;
        return pk_constraint_constrained_column(primary_key_constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 58822L)
    public static SubLObject set_primary_key_constraint_constraint_name(final SubLObject primary_key_constraint, final SubLObject name) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(primary_key_constraint) : primary_key_constraint;
        assert semantic_etl_bus.NIL != Types.stringp(name) : name;
        _csetf_pk_constraint_constraint_name(primary_key_constraint, name);
        return primary_key_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 59119L)
    public static SubLObject set_primary_key_constraint_constrained_column(final SubLObject primary_key_constraint, final SubLObject constrained_column) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(primary_key_constraint) : primary_key_constraint;
        assert semantic_etl_bus.NIL != column_semantics_p(constrained_column) : constrained_column;
        _csetf_pk_constraint_constrained_column(primary_key_constraint, constrained_column);
        return primary_key_constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 59463L)
    public static SubLObject find_corresponding_item_in_semantics_primary_key_constraint_method(final SubLObject constraint, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject corresponding_column = find_corresponding_item_in_semantics(primary_key_constraint_constrained_column(constraint), semantics);
        final SubLObject corresponding_table = column_semantics_table_semantics(corresponding_column);
        thread.resetMultipleValues();
        final SubLObject good_constraints = table_semantics_primary_key_constraints(corresponding_table);
        final SubLObject dropped_constraints = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(good_constraints, dropped_constraints);
        SubLObject constraint_list = (SubLObject)semantic_etl_bus.NIL;
        constraint_list = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = constraint_list;
            SubLObject pk_constraint = (SubLObject)semantic_etl_bus.NIL;
            pk_constraint = cdolist_list_var_$4.first();
            while (semantic_etl_bus.NIL != cdolist_list_var_$4) {
                if (column_semantics_column_name(corresponding_column).equalp(column_semantics_column_name(primary_key_constraint_constrained_column(pk_constraint)))) {
                    return pk_constraint;
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                pk_constraint = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_list = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 60250L)
    public static SubLObject semantic_object_comparison_name_primary_key_constraint_method(final SubLObject constraint) {
        return Sequences.cconcatenate((SubLObject)semantic_etl_bus.$str165$pk_, new SubLObject[] { format_nil.format_nil_a_no_copy(primary_key_constraint_constrained_table_name(constraint)), semantic_etl_bus.$str143$_, format_nil.format_nil_a_no_copy(primary_key_constraint_constrained_column_name(constraint)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 60498L)
    public static SubLObject primary_key_constraint_constrained_table(final SubLObject constraint) {
        assert semantic_etl_bus.NIL != primary_key_constraint_p(constraint) : constraint;
        return column_semantics_table_semantics(primary_key_constraint_constrained_column(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 60722L)
    public static SubLObject primary_key_constraint_constrained_table_name(final SubLObject constraint) {
        return table_semantics_table_name(primary_key_constraint_constrained_table(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 60892L)
    public static SubLObject primary_key_constraint_constrained_column_name(final SubLObject constraint) {
        return column_semantics_column_name(primary_key_constraint_constrained_column(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject column_semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_column_semantics(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject column_semantics_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $column_semantics_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject c_semant_column_name(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject c_semant_column_parses(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject c_semant_table_semantics(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject c_semant_value_semantics_list(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject c_semant_column_type(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject c_semant_column_size(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject _csetf_c_semant_column_name(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject _csetf_c_semant_column_parses(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject _csetf_c_semant_table_semantics(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject _csetf_c_semant_value_semantics_list(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject _csetf_c_semant_column_type(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject _csetf_c_semant_column_size(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_semantics_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject make_column_semantics(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $column_semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw187$COLUMN_NAME)) {
                _csetf_c_semant_column_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw188$COLUMN_PARSES)) {
                _csetf_c_semant_column_parses(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw189$TABLE_SEMANTICS)) {
                _csetf_c_semant_table_semantics(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw190$VALUE_SEMANTICS_LIST)) {
                _csetf_c_semant_value_semantics_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw191$COLUMN_TYPE)) {
                _csetf_c_semant_column_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw192$COLUMN_SIZE)) {
                _csetf_c_semant_column_size(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject visit_defstruct_column_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym193$MAKE_COLUMN_SEMANTICS, (SubLObject)semantic_etl_bus.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw187$COLUMN_NAME, c_semant_column_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw188$COLUMN_PARSES, c_semant_column_parses(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw189$TABLE_SEMANTICS, c_semant_table_semantics(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw190$VALUE_SEMANTICS_LIST, c_semant_value_semantics_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw191$COLUMN_TYPE, c_semant_column_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw192$COLUMN_SIZE, c_semant_column_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym193$MAKE_COLUMN_SEMANTICS, (SubLObject)semantic_etl_bus.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 61893L)
    public static SubLObject visit_defstruct_object_column_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_column_semantics(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 62799L)
    public static SubLObject print_column_semantics(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str195$_COLUMN___a__a__A__A__, new SubLObject[] { (semantic_etl_bus.NIL != c_semant_table_semantics(v_object)) ? t_semant_table_name(c_semant_table_semantics(v_object)) : semantic_etl_bus.$kw196$UNK, c_semant_column_name(v_object), c_semant_column_type(v_object), c_semant_column_size(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 63345L)
    public static SubLObject do_value_semantics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list197);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value_semantics = (SubLObject)semantic_etl_bus.NIL;
        SubLObject column_semantics = (SubLObject)semantic_etl_bus.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list197);
        value_semantics = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list197);
        column_semantics = current.first();
        current = current.rest();
        if (semantic_etl_bus.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)semantic_etl_bus.$sym1$CDOLIST, (SubLObject)ConsesLow.list(value_semantics, (SubLObject)ConsesLow.list((SubLObject)semantic_etl_bus.$sym198$COLUMN_SEMANTICS_VALUE_SEMANTICS_LIST, column_semantics)), ConsesLow.append(body, (SubLObject)semantic_etl_bus.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)semantic_etl_bus.$list197);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 63551L)
    public static SubLObject new_column_semantics(final SubLObject column_name, final SubLObject column_parses, SubLObject column_type, SubLObject column_size) {
        if (column_type == semantic_etl_bus.UNPROVIDED) {
            column_type = (SubLObject)semantic_etl_bus.$str199$;
        }
        if (column_size == semantic_etl_bus.UNPROVIDED) {
            column_size = (SubLObject)semantic_etl_bus.NIL;
        }
        assert semantic_etl_bus.NIL != Types.stringp(column_name) : column_name;
        assert semantic_etl_bus.NIL != Types.stringp(column_type) : column_type;
        final SubLObject table_semantics = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject value_semantics_list = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject column_semantics = make_column_semantics((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_c_semant_column_name(column_semantics, column_name);
        _csetf_c_semant_column_parses(column_semantics, column_parses);
        _csetf_c_semant_column_type(column_semantics, column_type);
        _csetf_c_semant_column_size(column_semantics, column_size);
        _csetf_c_semant_table_semantics(column_semantics, table_semantics);
        _csetf_c_semant_value_semantics_list(column_semantics, value_semantics_list);
        return column_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 64725L)
    public static SubLObject new_column_semantics_list(final SubLObject column_names) {
        SubLObject result = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = column_names;
        SubLObject name = (SubLObject)semantic_etl_bus.NIL;
        name = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            final SubLObject column_parses = metadata_parser.semantic_etl_parse_column_name(name, (SubLObject)semantic_etl_bus.UNPROVIDED);
            result = (SubLObject)ConsesLow.cons(new_column_semantics(name, column_parses, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 65229L)
    public static SubLObject copy_column_semantics(final SubLObject column_semantics) {
        final SubLObject column_name = column_semantics_column_name(column_semantics);
        final SubLObject column_parses = conses_high.copy_list(column_semantics_column_parses(column_semantics));
        final SubLObject column_type = column_semantics_column_type(column_semantics);
        final SubLObject column_size = column_semantics_column_size(column_semantics);
        final SubLObject value_semantics_list = conses_high.copy_list(column_semantics_value_semantics_list(column_semantics));
        final SubLObject new_column = new_column_semantics(column_name, column_parses, column_type, column_size);
        _csetf_c_semant_value_semantics_list(new_column, value_semantics_list);
        return new_column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 65914L)
    public static SubLObject copy_column_semantics_list(final SubLObject column_semantics_list) {
        SubLObject result = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = column_semantics_list;
        SubLObject column_semantics = (SubLObject)semantic_etl_bus.NIL;
        column_semantics = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(copy_column_semantics(column_semantics), result);
            cdolist_list_var = cdolist_list_var.rest();
            column_semantics = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 66228L)
    public static SubLObject column_semantics_column_name(final SubLObject column_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        return c_semant_column_name(column_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 66477L)
    public static SubLObject column_semantics_column_parses(final SubLObject column_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        return c_semant_column_parses(column_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 66924L)
    public static SubLObject column_semantics_column_type(final SubLObject column_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        return c_semant_column_type(column_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 67169L)
    public static SubLObject column_semantics_expanded_column_type(final SubLObject column_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        return Sequences.cconcatenate(c_semant_column_type(column_semantics), new SubLObject[] { semantic_etl_bus.$str200$_, print_high.princ_to_string(c_semant_column_size(column_semantics)), semantic_etl_bus.$str201$_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 67489L)
    public static SubLObject column_semantics_column_size(final SubLObject column_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        return c_semant_column_size(column_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 67757L)
    public static SubLObject column_semantics_table_semantics(final SubLObject column_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        return c_semant_table_semantics(column_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 68039L)
    public static SubLObject column_semantics_value_semantics_list(final SubLObject column_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        return c_semant_value_semantics_list(column_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 68351L)
    public static SubLObject column_semantics_referencing_foreign_key_constraints(final SubLObject column_semantics) {
        final SubLObject table = column_semantics_table_semantics(column_semantics);
        final SubLObject fk_tables = table_semantics_pointed_to_by_tables(table);
        SubLObject constraints = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = fk_tables;
        SubLObject fk_table = (SubLObject)semantic_etl_bus.NIL;
        fk_table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = table_semantics_foreign_key_constraints(fk_table);
            SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
            constraint = cdolist_list_var_$5.first();
            while (semantic_etl_bus.NIL != cdolist_list_var_$5) {
                if (fk_constraint_constraining_column(constraint).eql(column_semantics)) {
                    constraints = (SubLObject)ConsesLow.cons(constraint, constraints);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                constraint = cdolist_list_var_$5.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            fk_table = cdolist_list_var.first();
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 68924L)
    public static SubLObject column_semantics_foreign_key_constraint(final SubLObject column_semantics) {
        final SubLObject table = column_semantics_table_semantics(column_semantics);
        SubLObject cdolist_list_var = table_semantics_column_constraints(table);
        SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
        constraint = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (semantic_etl_bus.NIL != foreign_key_constraint_p(constraint) && fk_constraint_constrained_column(constraint).eql(column_semantics)) {
                return constraint;
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 69386L)
    public static SubLObject set_column_semantics_column_type(final SubLObject column_semantics, final SubLObject column_type) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        assert semantic_etl_bus.NIL != Types.stringp(column_type) : column_type;
        _csetf_c_semant_table_semantics(column_semantics, column_type);
        return column_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 69660L)
    public static SubLObject set_column_semantics_column_size(final SubLObject column_semantics, final SubLObject column_size) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        assert semantic_etl_bus.NIL != Types.integerp(column_size) : column_size;
        _csetf_c_semant_column_size(column_semantics, column_size);
        return column_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 69918L)
    public static SubLObject set_column_semantics_table_semantics(final SubLObject column_semantics, final SubLObject table_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        _csetf_c_semant_table_semantics(column_semantics, table_semantics);
        return column_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 70205L)
    public static SubLObject set_column_semantics_value_semantics_list(final SubLObject column_semantics, final SubLObject value_semantics_list) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(value_semantics_list) : value_semantics_list;
        SubLObject cdolist_list_var = value_semantics_list;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != value_semantics_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        _csetf_c_semant_value_semantics_list(column_semantics, value_semantics_list);
        return column_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 70522L)
    public static SubLObject set_column_semantics_name(final SubLObject column_semantics, final SubLObject new_name) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        assert semantic_etl_bus.NIL != Types.stringp(new_name) : new_name;
        _csetf_c_semant_column_name(column_semantics, new_name);
        return column_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 70763L)
    public static SubLObject find_corresponding_item_in_semantics_column_semantics_method(final SubLObject original_column, final SubLObject semantics) {
        final SubLObject original_table_name = table_semantics_table_name(column_semantics_table_semantics(original_column));
        return semantics_get_column_named(semantics, original_table_name, column_semantics_column_name(original_column));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 71110L)
    public static SubLObject semantic_object_comparison_name_column_semantics_method(final SubLObject column) {
        return Sequences.cconcatenate((SubLObject)semantic_etl_bus.$str204$col_, new SubLObject[] { format_nil.format_nil_a_no_copy(column_semantics_table_name(column)), semantic_etl_bus.$str143$_, format_nil.format_nil_a_no_copy(column_semantics_column_name(column)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 71305L)
    public static SubLObject column_semantics_table_name(final SubLObject column) {
        return table_semantics_table_name(column_semantics_table_semantics(column));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 71441L)
    public static SubLObject column_semantics_foreign_key_constraint_constraining_column(final SubLObject column) {
        if (semantic_etl_bus.NIL != column_semantics_foreign_key_constraint(column)) {
            return foreign_key_constraint_constraining_column(column_semantics_foreign_key_constraint(column));
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLObject value_semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_value_semantics(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLObject value_semantics_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $value_semantics_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLObject v_semant_value(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != value_semantics_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLObject v_semant_value_parses(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != value_semantics_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLObject _csetf_v_semant_value(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != value_semantics_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLObject _csetf_v_semant_value_parses(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != value_semantics_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLObject make_value_semantics(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $value_semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw218$VALUE)) {
                _csetf_v_semant_value(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw219$VALUE_PARSES)) {
                _csetf_v_semant_value_parses(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLObject visit_defstruct_value_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym220$MAKE_VALUE_SEMANTICS, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw218$VALUE, v_semant_value(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw219$VALUE_PARSES, v_semant_value_parses(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym220$MAKE_VALUE_SEMANTICS, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72304L)
    public static SubLObject visit_defstruct_object_value_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_value_semantics(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 72925L)
    public static SubLObject print_value_semantics(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str222$_VALUE___s__a_, v_semant_value(v_object), v_semant_value_parses(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 73178L)
    public static SubLObject new_value_semantics(final SubLObject value, final SubLObject value_parses) {
        final SubLObject value_semantics = make_value_semantics((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_v_semant_value(value_semantics, value);
        _csetf_v_semant_value_parses(value_semantics, value_parses);
        return value_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 73589L)
    public static SubLObject value_semantics_value(final SubLObject value_semantics) {
        assert semantic_etl_bus.NIL != value_semantics_p(value_semantics) : value_semantics;
        return v_semant_value(value_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 73804L)
    public static SubLObject value_semantics_value_parses(final SubLObject value_semantics) {
        assert semantic_etl_bus.NIL != value_semantics_p(value_semantics) : value_semantics;
        if (semantic_etl_bus.NIL == v_semant_value_parses(value_semantics)) {
            final SubLObject parsed_values = data_parser.semantic_etl_parse_value(value_semantics_value(value_semantics));
            if (semantic_etl_bus.NIL != parsed_values) {
                _csetf_v_semant_value_parses(value_semantics, parsed_values);
            }
            else {
                _csetf_v_semant_value_parses(value_semantics, (SubLObject)semantic_etl_bus.$kw223$NONE);
            }
        }
        if (v_semant_value_parses(value_semantics) == semantic_etl_bus.$kw223$NONE) {
            return (SubLObject)semantic_etl_bus.NIL;
        }
        return v_semant_value_parses(value_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 74704L)
    public static SubLObject set_value_semantics_value(final SubLObject value_semantics, final SubLObject value) {
        assert semantic_etl_bus.NIL != value_semantics_p(value_semantics) : value_semantics;
        _csetf_v_semant_value(value_semantics, value);
        return value_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject database_output_spec_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_database_output_spec(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject database_output_spec_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $database_output_spec_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject db_output_spec_id(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject db_output_spec_semantics1(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject db_output_spec_semantics2(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject db_output_spec_recipe(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject db_output_spec_semantics(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject db_output_spec_semantic_recipe(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject _csetf_db_output_spec_id(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject _csetf_db_output_spec_semantics1(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject _csetf_db_output_spec_semantics2(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject _csetf_db_output_spec_recipe(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject _csetf_db_output_spec_semantics(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject _csetf_db_output_spec_semantic_recipe(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != database_output_spec_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject make_database_output_spec(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $database_output_spec_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw246$ID)) {
                _csetf_db_output_spec_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw247$SEMANTICS1)) {
                _csetf_db_output_spec_semantics1(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw248$SEMANTICS2)) {
                _csetf_db_output_spec_semantics2(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw249$RECIPE)) {
                _csetf_db_output_spec_recipe(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw93$SEMANTICS)) {
                _csetf_db_output_spec_semantics(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw250$SEMANTIC_RECIPE)) {
                _csetf_db_output_spec_semantic_recipe(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject visit_defstruct_database_output_spec(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym251$MAKE_DATABASE_OUTPUT_SPEC, (SubLObject)semantic_etl_bus.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw246$ID, db_output_spec_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw247$SEMANTICS1, db_output_spec_semantics1(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw248$SEMANTICS2, db_output_spec_semantics2(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw249$RECIPE, db_output_spec_recipe(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw93$SEMANTICS, db_output_spec_semantics(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw250$SEMANTIC_RECIPE, db_output_spec_semantic_recipe(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym251$MAKE_DATABASE_OUTPUT_SPEC, (SubLObject)semantic_etl_bus.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75361L)
    public static SubLObject visit_defstruct_object_database_output_spec_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_database_output_spec(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 75891L)
    public static SubLObject print_database_output_spec(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)semantic_etl_bus.$str253$_DB_OUTPUT_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        streams_high.terpri(stream);
        streams_high.write_string((SubLObject)semantic_etl_bus.$str200$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        if (semantic_etl_bus.NIL != db_output_spec_recipe(v_object).first()) {
            print_high.princ(db_output_spec_recipe(v_object).first(), stream);
            streams_high.terpri(stream);
            SubLObject cdolist_list_var = db_output_spec_recipe(v_object).rest();
            SubLObject sql = (SubLObject)semantic_etl_bus.NIL;
            sql = cdolist_list_var.first();
            while (semantic_etl_bus.NIL != cdolist_list_var) {
                streams_high.write_string((SubLObject)semantic_etl_bus.$str254$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
                print_high.princ(sql, stream);
                streams_high.terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                sql = cdolist_list_var.first();
            }
        }
        streams_high.write_string((SubLObject)semantic_etl_bus.$str201$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        streams_high.write_string((SubLObject)semantic_etl_bus.$str255$Sem_Recipe__, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        print_high.princ(db_output_spec_semantic_recipe(v_object), stream);
        streams_high.terpri(stream);
        print_high.princ(db_output_spec_semantics(v_object), (SubLObject)semantic_etl_bus.UNPROVIDED);
        streams_high.write_string((SubLObject)semantic_etl_bus.$str256$_, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 76552L)
    public static SubLObject new_database_output_spec(final SubLObject semantics1, final SubLObject semantics2, final SubLObject target_access_path) {
        assert semantic_etl_bus.NIL != semantics_p(semantics1) : semantics1;
        assert semantic_etl_bus.NIL != semantics_p(semantics2) : semantics2;
        assert semantic_etl_bus.NIL != sksi_access_path.access_path_p(target_access_path) : target_access_path;
        final SubLObject output_spec = make_database_output_spec((SubLObject)semantic_etl_bus.UNPROVIDED);
        final SubLObject new_semantics = new_trivial_semantics(semantics1, semantics2, target_access_path);
        _csetf_db_output_spec_id(output_spec, integer_sequence_generator.integer_sequence_generator_next(semantic_etl_bus.$db_output_spec_isg$.getGlobalValue()));
        _csetf_db_output_spec_semantics1(output_spec, semantics1);
        _csetf_db_output_spec_semantics2(output_spec, semantics2);
        _csetf_db_output_spec_recipe(output_spec, new_trivial_recipe(semantics1, semantics2, target_access_path));
        _csetf_db_output_spec_semantics(output_spec, new_semantics);
        _csetf_semant_output_spec(new_semantics, output_spec);
        _csetf_db_output_spec_semantic_recipe(output_spec, (SubLObject)semantic_etl_bus.NIL);
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 77776L)
    public static SubLObject new_trivial_recipe(final SubLObject semantics1, final SubLObject semantics2, final SubLObject target_access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert semantic_etl_bus.NIL != semantics_p(semantics1) : semantics1;
        assert semantic_etl_bus.NIL != semantics_p(semantics2) : semantics2;
        assert semantic_etl_bus.NIL != sksi_access_path.access_path_p(target_access_path) : target_access_path;
        SubLObject recipe = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject access_path1 = semant_access_path(semantics1);
        final SubLObject access_path2 = semant_access_path(semantics2);
        SubLObject cdolist_list_var = semantics_table_semantics_list(semantics1);
        SubLObject table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            recipe = (SubLObject)ConsesLow.cons(new_sql_copy_table(t_semant_table_name(table), access_path1, target_access_path), recipe);
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        cdolist_list_var = semantics_table_semantics_list(semantics2);
        table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            recipe = (SubLObject)ConsesLow.cons(new_sql_copy_table(t_semant_table_name(table), access_path2, target_access_path), recipe);
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        recipe = (SubLObject)ConsesLow.cons(semantic_etl_bus.$recipe_marker$.getDynamicValue(thread), recipe);
        return Sequences.nreverse(recipe);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 78561L)
    public static SubLObject new_trivial_semantics(final SubLObject semantics1, final SubLObject semantics2, final SubLObject target_access_path) {
        return new_semantics(target_access_path, ConsesLow.append(semant_table_semantics_list(semantics1), semant_table_semantics_list(semantics2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 78921L)
    public static SubLObject copy_database_output_spec(final SubLObject original_output_spec) {
        final SubLObject copy = make_database_output_spec((SubLObject)semantic_etl_bus.UNPROVIDED);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(semantic_etl_bus.$db_output_spec_isg$.getGlobalValue());
        final SubLObject semantics1 = db_output_spec_semantics1(original_output_spec);
        final SubLObject semantics2 = db_output_spec_semantics2(original_output_spec);
        final SubLObject recipe = conses_high.copy_list(db_output_spec_recipe(original_output_spec));
        final SubLObject semantics3 = copy_semantics(db_output_spec_semantics(original_output_spec));
        final SubLObject semantic_recipe = copy_semantic_recipe(db_output_spec_semantic_recipe(original_output_spec), semantics3);
        _csetf_db_output_spec_id(copy, id);
        _csetf_db_output_spec_semantics1(copy, semantics1);
        _csetf_db_output_spec_semantics1(copy, semantics2);
        _csetf_db_output_spec_recipe(copy, recipe);
        _csetf_db_output_spec_semantics(copy, semantics3);
        _csetf_semant_output_spec(semantics3, copy);
        _csetf_db_output_spec_semantic_recipe(copy, semantic_recipe);
        return copy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 80158L)
    public static SubLObject output_spec_append_to_recipe(final SubLObject output_spec, final SubLObject sql_command) {
        assert semantic_etl_bus.NIL != database_output_spec_p(output_spec) : output_spec;
        _csetf_db_output_spec_recipe(output_spec, ConsesLow.append(db_output_spec_recipe(output_spec), (SubLObject)ConsesLow.list(sql_command)));
        return db_output_spec_recipe(output_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 80439L)
    public static SubLObject output_spec_append_to_semantic_recipe(final SubLObject output_spec, final SubLObject semantic_recipe_step) {
        assert semantic_etl_bus.NIL != database_output_spec_p(output_spec) : output_spec;
        final SubLObject old_value = db_output_spec_semantic_recipe(output_spec);
        final SubLObject new_value = Sequences.cconcatenate(old_value, (SubLObject)ConsesLow.list(semantic_recipe_step));
        _csetf_db_output_spec_semantic_recipe(output_spec, new_value);
        set_semantic_recipe_step_output_spec(semantic_recipe_step, output_spec);
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 80884L)
    public static SubLObject output_spec_get_table_named(final SubLObject output_spec, final SubLObject table_name) {
        return semantics_get_table_named(db_output_spec_semantics(output_spec), table_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 81055L)
    public static SubLObject semantics_add_dropped(final SubLObject semantics, final SubLObject dropped_sem) {
        _csetf_semant_dropped_items(semantics, (SubLObject)ConsesLow.cons(dropped_sem, semant_dropped_items(semantics)));
        return semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 81236L)
    public static SubLObject copy_semantic_recipe(final SubLObject original_recipe, final SubLObject new_semantics) {
        SubLObject recipe = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = original_recipe;
        SubLObject recipe_step = (SubLObject)semantic_etl_bus.NIL;
        recipe_step = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            recipe = (SubLObject)ConsesLow.cons(semantic_recipe_step_copy(recipe_step, new_semantics), recipe);
            cdolist_list_var = cdolist_list_var.rest();
            recipe_step = cdolist_list_var.first();
        }
        return Sequences.nreverse(recipe);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 81701L)
    public static SubLObject semantic_recipe_step_p(final SubLObject obj) {
        final SubLObject method_function = Structures.method_func(obj, semantic_etl_bus.$semantic_recipe_step_p_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, obj);
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 81848L)
    public static SubLObject empty_semantic_recipe_step_p(final SubLObject obj) {
        final SubLObject method_function = Structures.method_func(obj, semantic_etl_bus.$empty_semantic_recipe_step_p_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, obj);
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 81928L)
    public static SubLObject set_semantic_recipe_step_output_spec(final SubLObject obj, final SubLObject output_spec) {
        final SubLObject method_function = Structures.method_func(obj, semantic_etl_bus.$set_semantic_recipe_step_output_spec_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, obj, output_spec);
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82040L)
    public static SubLObject semantic_recipe_append_to_drops(final SubLObject obj, final SubLObject drop) {
        final SubLObject method_function = Structures.method_func(obj, semantic_etl_bus.$semantic_recipe_append_to_drops_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, obj, drop);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str258$unable_to_drop__A_from__A, drop, obj);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82179L)
    public static SubLObject semantic_recipe_append_to_adds(final SubLObject obj, final SubLObject add) {
        final SubLObject method_function = Structures.method_func(obj, semantic_etl_bus.$semantic_recipe_append_to_adds_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, obj, add);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str259$unable_to_add__A_to__A, add, obj);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82311L)
    public static SubLObject semantic_recipe_remove_from_drops(final SubLObject obj, final SubLObject drop) {
        final SubLObject method_function = Structures.method_func(obj, semantic_etl_bus.$semantic_recipe_remove_from_drops_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, obj, drop);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str260$unable_to_remove__A_from__A, drop, obj);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82454L)
    public static SubLObject semantic_recipe_remove_from_adds(final SubLObject obj, final SubLObject add) {
        final SubLObject method_function = Structures.method_func(obj, semantic_etl_bus.$semantic_recipe_remove_from_adds_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, obj, add);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str260$unable_to_remove__A_from__A, add, obj);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82593L)
    public static SubLObject set_semantic_recipe_step_column_correspondence_list(final SubLObject recipe_step, final SubLObject correspondence_list) {
        final SubLObject method_function = Structures.method_func(recipe_step, semantic_etl_bus.$set_semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, recipe_step, correspondence_list);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str261$unable_to_set_column_corespondenc, recipe_step);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 82822L)
    public static SubLObject semantic_recipe_step_column_correspondence_list(final SubLObject recipe_step) {
        final SubLObject method_function = Structures.method_func(recipe_step, semantic_etl_bus.$semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, recipe_step);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str262$unable_to_get_column_corespondenc, recipe_step);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83007L)
    public static SubLObject set_semantic_recipe_step_sql_start_index(final SubLObject obj, final SubLObject index) {
        final SubLObject method_function = Structures.method_func(obj, semantic_etl_bus.$set_semantic_recipe_step_sql_start_index_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, obj, index);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str263$unable_to_set_start_index_of__A_t, obj, index);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83149L)
    public static SubLObject set_semantic_recipe_step_sql_end_index(final SubLObject obj, final SubLObject index) {
        final SubLObject method_function = Structures.method_func(obj, semantic_etl_bus.$set_semantic_recipe_step_sql_end_index_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, obj, index);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str264$unable_to_set_end_index_of__A_to_, obj, index);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83287L)
    public static SubLObject semantic_recipe_step_copy(final SubLObject step, final SubLObject semantics) {
        final SubLObject method_function = Structures.method_func(step, semantic_etl_bus.$semantic_recipe_step_copy_method_table$.getGlobalValue());
        if (semantic_etl_bus.NIL != method_function) {
            return Functions.funcall(method_function, step, semantics);
        }
        Errors.warn((SubLObject)semantic_etl_bus.$str265$Don_t_know_how_to_copy__S, step);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_table_merger(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $table_merger_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_id(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_output_spec(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_sources(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_target(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_column_correspondence_list(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_added(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_dropped(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_sql_start_index(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject table_merger_sql_end_index(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject _csetf_table_merger_id(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject _csetf_table_merger_output_spec(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject _csetf_table_merger_sources(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject _csetf_table_merger_target(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject _csetf_table_merger_column_correspondence_list(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject _csetf_table_merger_added(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject _csetf_table_merger_dropped(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject _csetf_table_merger_sql_start_index(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject _csetf_table_merger_sql_end_index(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != table_merger_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject make_table_merger(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $table_merger_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw246$ID)) {
                _csetf_table_merger_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw46$OUTPUT_SPEC)) {
                _csetf_table_merger_output_spec(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw293$SOURCES)) {
                _csetf_table_merger_sources(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw294$TARGET)) {
                _csetf_table_merger_target(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw295$COLUMN_CORRESPONDENCE_LIST)) {
                _csetf_table_merger_column_correspondence_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw296$ADDED)) {
                _csetf_table_merger_added(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw297$DROPPED)) {
                _csetf_table_merger_dropped(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw298$SQL_START_INDEX)) {
                _csetf_table_merger_sql_start_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw299$SQL_END_INDEX)) {
                _csetf_table_merger_sql_end_index(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject visit_defstruct_table_merger(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym300$MAKE_TABLE_MERGER, (SubLObject)semantic_etl_bus.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw246$ID, table_merger_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw46$OUTPUT_SPEC, table_merger_output_spec(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw293$SOURCES, table_merger_sources(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw294$TARGET, table_merger_target(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw295$COLUMN_CORRESPONDENCE_LIST, table_merger_column_correspondence_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw296$ADDED, table_merger_added(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw297$DROPPED, table_merger_dropped(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw298$SQL_START_INDEX, table_merger_sql_start_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw299$SQL_END_INDEX, table_merger_sql_end_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym300$MAKE_TABLE_MERGER, (SubLObject)semantic_etl_bus.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 83784L)
    public static SubLObject visit_defstruct_object_table_merger_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_table_merger(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 84514L)
    public static SubLObject print_table_merger(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str302$_TABLE_MERGER__A_, table_merger_id(v_object));
        streams_high.terpri(stream);
        print_high.princ(Mapping.mapcar((SubLObject)semantic_etl_bus.$sym58$TABLE_SEMANTICS_TABLE_NAME, table_merger_sources(v_object)), stream);
        print_high.princ((SubLObject)semantic_etl_bus.$str303$____, stream);
        print_high.princ(table_semantics_table_name(table_merger_target(v_object)), stream);
        streams_high.terpri(stream);
        print_high.princ(table_merger_column_correspondence_list(v_object), stream);
        if (semantic_etl_bus.NIL != table_merger_added(v_object)) {
            print_high.princ((SubLObject)semantic_etl_bus.$str304$_adds__, stream);
            print_high.princ(table_merger_added(v_object), stream);
        }
        if (semantic_etl_bus.NIL != table_merger_added(v_object)) {
            print_high.princ((SubLObject)semantic_etl_bus.$str305$_drops__, stream);
            print_high.princ(table_merger_dropped(v_object), stream);
        }
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str306$_SQL___A__A_, table_merger_sql_start_index(v_object), table_merger_sql_end_index(v_object));
        streams_high.write_string((SubLObject)semantic_etl_bus.$str256$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 85337L)
    public static SubLObject new_table_merger(final SubLObject source_tables, final SubLObject target_table, final SubLObject column_correspondence_list) {
        final SubLObject merger = make_table_merger((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_table_merger_id(merger, integer_sequence_generator.integer_sequence_generator_next(semantic_etl_bus.$db_output_spec_isg$.getGlobalValue()));
        _csetf_table_merger_sources(merger, source_tables);
        _csetf_table_merger_target(merger, target_table);
        _csetf_table_merger_column_correspondence_list(merger, column_correspondence_list);
        return merger;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 85774L)
    public static SubLObject semantic_recipe_step_p_table_merger_method(final SubLObject obj) {
        return (SubLObject)semantic_etl_bus.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 85845L)
    public static SubLObject empty_semantic_recipe_step_p_table_merger_method(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(semantic_etl_bus.NIL == table_merger_added(obj) && semantic_etl_bus.NIL == table_merger_dropped(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 85999L)
    public static SubLObject semantic_recipe_append_to_drops_table_merger_method(final SubLObject recipe_step, final SubLObject drop) {
        _csetf_table_merger_dropped(recipe_step, (SubLObject)ConsesLow.cons(drop, table_merger_dropped(recipe_step)));
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 86152L)
    public static SubLObject semantic_recipe_append_to_adds_table_merger_method(final SubLObject recipe_step, final SubLObject add) {
        _csetf_table_merger_added(recipe_step, (SubLObject)ConsesLow.cons(add, table_merger_added(recipe_step)));
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 86300L)
    public static SubLObject semantic_recipe_remove_from_drops_table_merger_method(final SubLObject recipe_step, final SubLObject drop) {
        _csetf_table_merger_dropped(recipe_step, Sequences.remove(drop, table_merger_dropped(recipe_step), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 86499L)
    public static SubLObject semantic_recipe_remove_from_adds_table_merger_method(final SubLObject recipe_step, final SubLObject add) {
        _csetf_table_merger_added(recipe_step, Sequences.remove(add, table_merger_added(recipe_step), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 86691L)
    public static SubLObject set_semantic_recipe_step_column_correspondence_list_table_merger_method(final SubLObject recipe_step, final SubLObject correspondence_list) {
        _csetf_table_merger_column_correspondence_list(recipe_step, correspondence_list);
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 86913L)
    public static SubLObject semantic_recipe_step_column_correspondence_list_table_merger_method(final SubLObject recipe_step) {
        return table_merger_column_correspondence_list(recipe_step);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 87069L)
    public static SubLObject set_semantic_recipe_step_output_spec_table_merger_method(final SubLObject obj, final SubLObject output_spec) {
        _csetf_table_merger_output_spec(obj, output_spec);
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 87229L)
    public static SubLObject set_semantic_recipe_step_sql_start_index_table_merger_method(final SubLObject obj, final SubLObject index) {
        _csetf_table_merger_sql_start_index(obj, index);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 87377L)
    public static SubLObject set_semantic_recipe_step_sql_end_index_table_merger_method(final SubLObject obj, final SubLObject index) {
        _csetf_table_merger_sql_end_index(obj, index);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 87521L)
    public static SubLObject semantic_recipe_step_copy_table_merger_method(final SubLObject original_table_merger, final SubLObject semantics) {
        final SubLObject source_table_names = Mapping.mapcar((SubLObject)semantic_etl_bus.$sym58$TABLE_SEMANTICS_TABLE_NAME, table_merger_sources(original_table_merger));
        SubLObject source_tables = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject target_table_name = table_semantics_table_name(table_merger_target(original_table_merger));
        final SubLObject target_table = semantics_get_table_named(semantics, target_table_name);
        SubLObject column_correspondence_list = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = table_merger_column_correspondence_list(original_table_merger);
        SubLObject old_correspondence = (SubLObject)semantic_etl_bus.NIL;
        old_correspondence = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = old_correspondence;
            SubLObject old_source_column = (SubLObject)semantic_etl_bus.NIL;
            SubLObject old_target_column = (SubLObject)semantic_etl_bus.NIL;
            SubLObject justification = (SubLObject)semantic_etl_bus.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list318);
            old_source_column = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list318);
            old_target_column = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list318);
            justification = current.first();
            current = current.rest();
            if (semantic_etl_bus.NIL == current) {
                column_correspondence_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(semantics_get_column_named(semantics, column_semantics_table_name(old_source_column), column_semantics_column_name(old_source_column)), semantics_get_column_named(semantics, column_semantics_table_name(old_target_column), column_semantics_column_name(old_target_column)), conses_high.copy_list(justification)), column_correspondence_list);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)semantic_etl_bus.$list318);
            }
            cdolist_list_var = cdolist_list_var.rest();
            old_correspondence = cdolist_list_var.first();
        }
        cdolist_list_var = source_table_names;
        SubLObject source_table_name = (SubLObject)semantic_etl_bus.NIL;
        source_table_name = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            source_tables = (SubLObject)ConsesLow.cons(semantics_get_table_named(semantics, source_table_name), source_tables);
            cdolist_list_var = cdolist_list_var.rest();
            source_table_name = cdolist_list_var.first();
        }
        final SubLObject new_merger = new_table_merger(Sequences.nreverse(source_tables), target_table, Sequences.nreverse(column_correspondence_list));
        _csetf_table_merger_sql_start_index(new_merger, table_merger_sql_start_index(original_table_merger));
        _csetf_table_merger_sql_end_index(new_merger, table_merger_sql_end_index(original_table_merger));
        SubLObject cdolist_list_var2 = table_merger_added(original_table_merger);
        SubLObject added = (SubLObject)semantic_etl_bus.NIL;
        added = cdolist_list_var2.first();
        while (semantic_etl_bus.NIL != cdolist_list_var2) {
            final SubLObject corresponding = find_corresponding_item_in_semantics(added, semantics);
            if (semantic_etl_bus.NIL == corresponding) {
                Errors.error((SubLObject)semantic_etl_bus.$str319$unable_to_find_correspondent__add, added, semantics);
            }
            _csetf_table_merger_added(new_merger, (SubLObject)ConsesLow.cons(added, table_merger_added(new_merger)));
            cdolist_list_var2 = cdolist_list_var2.rest();
            added = cdolist_list_var2.first();
        }
        cdolist_list_var2 = table_merger_dropped(original_table_merger);
        SubLObject dropped = (SubLObject)semantic_etl_bus.NIL;
        dropped = cdolist_list_var2.first();
        while (semantic_etl_bus.NIL != cdolist_list_var2) {
            final SubLObject corresponding = find_corresponding_item_in_semantics(dropped, semantics);
            if (semantic_etl_bus.NIL == corresponding) {
                Errors.error((SubLObject)semantic_etl_bus.$str320$unable_to_find_correspondent__dro, dropped, semantics);
            }
            _csetf_table_merger_dropped(new_merger, (SubLObject)ConsesLow.cons(corresponding, table_merger_dropped(new_merger)));
            cdolist_list_var2 = cdolist_list_var2.rest();
            dropped = cdolist_list_var2.first();
        }
        return new_merger;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_column_merger(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $column_merger_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_output_spec(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_sources(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_target(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_column_correspondence_list(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_added(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_dropped(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_sql_start_index(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject column_merger_sql_end_index(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject _csetf_column_merger_output_spec(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject _csetf_column_merger_sources(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject _csetf_column_merger_target(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject _csetf_column_merger_column_correspondence_list(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject _csetf_column_merger_added(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject _csetf_column_merger_dropped(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject _csetf_column_merger_sql_start_index(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject _csetf_column_merger_sql_end_index(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != column_merger_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject make_column_merger(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $column_merger_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw46$OUTPUT_SPEC)) {
                _csetf_column_merger_output_spec(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw293$SOURCES)) {
                _csetf_column_merger_sources(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw294$TARGET)) {
                _csetf_column_merger_target(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw295$COLUMN_CORRESPONDENCE_LIST)) {
                _csetf_column_merger_column_correspondence_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw296$ADDED)) {
                _csetf_column_merger_added(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw297$DROPPED)) {
                _csetf_column_merger_dropped(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw298$SQL_START_INDEX)) {
                _csetf_column_merger_sql_start_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw299$SQL_END_INDEX)) {
                _csetf_column_merger_sql_end_index(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject visit_defstruct_column_merger(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym347$MAKE_COLUMN_MERGER, (SubLObject)semantic_etl_bus.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw46$OUTPUT_SPEC, column_merger_output_spec(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw293$SOURCES, column_merger_sources(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw294$TARGET, column_merger_target(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw295$COLUMN_CORRESPONDENCE_LIST, column_merger_column_correspondence_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw296$ADDED, column_merger_added(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw297$DROPPED, column_merger_dropped(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw298$SQL_START_INDEX, column_merger_sql_start_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw299$SQL_END_INDEX, column_merger_sql_end_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym347$MAKE_COLUMN_MERGER, (SubLObject)semantic_etl_bus.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90047L)
    public static SubLObject visit_defstruct_object_column_merger_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_column_merger(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 90772L)
    public static SubLObject print_column_merger(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str349$_COLUMN_MERGER_);
        streams_high.terpri(stream);
        print_high.princ(Mapping.mapcar((SubLObject)semantic_etl_bus.$sym107$COLUMN_SEMANTICS_COLUMN_NAME, column_merger_sources(v_object)), stream);
        print_high.princ((SubLObject)semantic_etl_bus.$str303$____, stream);
        print_high.princ(column_semantics_column_name(column_merger_target(v_object)), stream);
        streams_high.terpri(stream);
        print_high.princ(column_merger_column_correspondence_list(v_object), stream);
        if (semantic_etl_bus.NIL != column_merger_added(v_object)) {
            print_high.princ((SubLObject)semantic_etl_bus.$str304$_adds__, stream);
            print_high.princ(column_merger_added(v_object), stream);
        }
        if (semantic_etl_bus.NIL != column_merger_added(v_object)) {
            print_high.princ((SubLObject)semantic_etl_bus.$str305$_drops__, stream);
            print_high.princ(column_merger_dropped(v_object), stream);
        }
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str306$_SQL___A__A_, column_merger_sql_start_index(v_object), column_merger_sql_end_index(v_object));
        streams_high.write_string((SubLObject)semantic_etl_bus.$str256$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 91582L)
    public static SubLObject new_column_merger(final SubLObject source_columns, final SubLObject target_column, final SubLObject column_correspondence_list) {
        final SubLObject merger = make_column_merger((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_column_merger_sources(merger, source_columns);
        _csetf_column_merger_target(merger, target_column);
        _csetf_column_merger_column_correspondence_list(merger, column_correspondence_list);
        return merger;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 91936L)
    public static SubLObject semantic_recipe_step_p_column_merger_method(final SubLObject obj) {
        return (SubLObject)semantic_etl_bus.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 92008L)
    public static SubLObject empty_semantic_recipe_step_p_column_merger_method(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(semantic_etl_bus.NIL == column_merger_added(obj) && semantic_etl_bus.NIL == column_merger_dropped(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 92165L)
    public static SubLObject semantic_recipe_append_to_drops_column_merger_method(final SubLObject recipe_step, final SubLObject drop) {
        _csetf_column_merger_dropped(recipe_step, (SubLObject)ConsesLow.cons(drop, column_merger_dropped(recipe_step)));
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 92320L)
    public static SubLObject semantic_recipe_append_to_adds_column_merger_method(final SubLObject recipe_step, final SubLObject add) {
        _csetf_column_merger_added(recipe_step, (SubLObject)ConsesLow.cons(add, column_merger_added(recipe_step)));
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 92470L)
    public static SubLObject semantic_recipe_remove_from_drops_column_merger_method(final SubLObject recipe_step, final SubLObject drop) {
        _csetf_column_merger_dropped(recipe_step, Sequences.remove(drop, column_merger_dropped(recipe_step), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 92672L)
    public static SubLObject semantic_recipe_remove_from_adds_column_merger_method(final SubLObject recipe_step, final SubLObject add) {
        _csetf_column_merger_added(recipe_step, Sequences.remove(add, column_merger_added(recipe_step), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 92867L)
    public static SubLObject set_semantic_recipe_step_column_correspondence_list_column_merger_method(final SubLObject recipe_step, final SubLObject correspondence_list) {
        _csetf_column_merger_column_correspondence_list(recipe_step, correspondence_list);
        return recipe_step;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 93091L)
    public static SubLObject semantic_recipe_step_column_correspondence_list_column_merger_method(final SubLObject recipe_step) {
        return column_merger_column_correspondence_list(recipe_step);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 93249L)
    public static SubLObject set_semantic_recipe_step_output_spec_column_merger_method(final SubLObject obj, final SubLObject output_spec) {
        _csetf_column_merger_output_spec(obj, output_spec);
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 93411L)
    public static SubLObject set_semantic_recipe_step_sql_start_index_column_merger_method(final SubLObject obj, final SubLObject index) {
        _csetf_column_merger_sql_start_index(obj, index);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 93561L)
    public static SubLObject set_semantic_recipe_step_sql_end_index_column_merger_method(final SubLObject obj, final SubLObject index) {
        _csetf_column_merger_sql_end_index(obj, index);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 93707L)
    public static SubLObject semantic_recipe_step_copy_column_merger_method(final SubLObject original_column_merger, final SubLObject semantics) {
        final SubLObject source_column_names = Mapping.mapcar((SubLObject)semantic_etl_bus.$sym107$COLUMN_SEMANTICS_COLUMN_NAME, column_merger_sources(original_column_merger));
        final SubLObject source_table_names = Mapping.mapcar((SubLObject)semantic_etl_bus.$sym361$COLUMN_SEMANTICS_TABLE_NAME, column_merger_sources(original_column_merger));
        SubLObject source_columns = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject target_column_name = column_semantics_column_name(column_merger_target(original_column_merger));
        final SubLObject target_table_name = column_semantics_table_name(column_merger_target(original_column_merger));
        final SubLObject target_column = semantics_get_column_named(semantics, target_table_name, target_column_name);
        SubLObject column_correspondence_list = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = column_merger_column_correspondence_list(original_column_merger);
        SubLObject old_correspondence = (SubLObject)semantic_etl_bus.NIL;
        old_correspondence = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = old_correspondence;
            SubLObject old_source_column = (SubLObject)semantic_etl_bus.NIL;
            SubLObject old_target_column = (SubLObject)semantic_etl_bus.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list362);
            old_source_column = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list362);
            old_target_column = current.first();
            current = current.rest();
            if (semantic_etl_bus.NIL == current) {
                column_correspondence_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(semantics_get_column_named(semantics, column_semantics_table_name(old_source_column), column_semantics_column_name(old_source_column)), semantics_get_column_named(semantics, column_semantics_table_name(old_target_column), column_semantics_column_name(old_target_column))), column_correspondence_list);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)semantic_etl_bus.$list362);
            }
            cdolist_list_var = cdolist_list_var.rest();
            old_correspondence = cdolist_list_var.first();
        }
        SubLObject source_column_name = (SubLObject)semantic_etl_bus.NIL;
        SubLObject source_column_name_$6 = (SubLObject)semantic_etl_bus.NIL;
        SubLObject source_table_name = (SubLObject)semantic_etl_bus.NIL;
        SubLObject source_table_name_$7 = (SubLObject)semantic_etl_bus.NIL;
        source_column_name = source_column_names;
        source_column_name_$6 = source_column_name.first();
        source_table_name = source_table_names;
        source_table_name_$7 = source_table_name.first();
        while (semantic_etl_bus.NIL != source_table_name || semantic_etl_bus.NIL != source_column_name) {
            source_columns = (SubLObject)ConsesLow.cons(semantics_get_column_named(semantics, source_table_name_$7, source_column_name_$6), source_columns);
            source_column_name = source_column_name.rest();
            source_column_name_$6 = source_column_name.first();
            source_table_name = source_table_name.rest();
            source_table_name_$7 = source_table_name.first();
        }
        final SubLObject new_merger = new_column_merger(Sequences.nreverse(source_columns), target_column, Sequences.nreverse(column_correspondence_list));
        _csetf_column_merger_sql_start_index(new_merger, column_merger_sql_start_index(original_column_merger));
        _csetf_column_merger_sql_end_index(new_merger, column_merger_sql_end_index(original_column_merger));
        SubLObject cdolist_list_var2 = column_merger_added(original_column_merger);
        SubLObject added = (SubLObject)semantic_etl_bus.NIL;
        added = cdolist_list_var2.first();
        while (semantic_etl_bus.NIL != cdolist_list_var2) {
            final SubLObject corresponding = find_corresponding_item_in_semantics(added, semantics);
            if (semantic_etl_bus.NIL == corresponding) {
                Errors.error((SubLObject)semantic_etl_bus.$str363$unable_to_find_correspondent_for_, added, semantics);
            }
            _csetf_column_merger_added(new_merger, (SubLObject)ConsesLow.cons(added, column_merger_added(new_merger)));
            cdolist_list_var2 = cdolist_list_var2.rest();
            added = cdolist_list_var2.first();
        }
        cdolist_list_var2 = column_merger_dropped(original_column_merger);
        SubLObject dropped = (SubLObject)semantic_etl_bus.NIL;
        dropped = cdolist_list_var2.first();
        while (semantic_etl_bus.NIL != cdolist_list_var2) {
            final SubLObject corresponding = find_corresponding_item_in_semantics(dropped, semantics);
            if (semantic_etl_bus.NIL == corresponding) {
                Errors.error((SubLObject)semantic_etl_bus.$str363$unable_to_find_correspondent_for_, dropped, semantics);
            }
            _csetf_column_merger_dropped(new_merger, (SubLObject)ConsesLow.cons(corresponding, column_merger_dropped(new_merger)));
            cdolist_list_var2 = cdolist_list_var2.rest();
            dropped = cdolist_list_var2.first();
        }
        return new_merger;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96125L)
    public static SubLObject semantic_recipe_add_or_drop_item(final SubLObject obj) {
        assert semantic_etl_bus.NIL != semantic_recipe_add_or_drop_p(obj) : obj;
        return conses_high.second(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96442L)
    public static SubLObject semantic_recipe_add_or_drop_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && semantic_etl_bus.NIL != list_utilities.lengthE(obj, (SubLObject)semantic_etl_bus.TWO_INTEGER, (SubLObject)semantic_etl_bus.UNPROVIDED) && semantic_etl_bus.NIL != conses_high.member(obj.first(), (SubLObject)semantic_etl_bus.$list366, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96584L)
    public static SubLObject semantic_recipe_add_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && semantic_etl_bus.NIL != list_utilities.lengthE(obj, (SubLObject)semantic_etl_bus.TWO_INTEGER, (SubLObject)semantic_etl_bus.UNPROVIDED) && obj.first() == semantic_etl_bus.$kw367$ADD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96705L)
    public static SubLObject new_semantic_recipe_add(final SubLObject obj) {
        return (SubLObject)ConsesLow.list((SubLObject)semantic_etl_bus.$kw367$ADD, obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96774L)
    public static SubLObject semantic_recipe_drop_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && semantic_etl_bus.NIL != list_utilities.lengthE(obj, (SubLObject)semantic_etl_bus.TWO_INTEGER, (SubLObject)semantic_etl_bus.UNPROVIDED) && obj.first() == semantic_etl_bus.$kw368$DROP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96897L)
    public static SubLObject new_semantic_recipe_drop(final SubLObject obj) {
        return (SubLObject)ConsesLow.list((SubLObject)semantic_etl_bus.$kw368$DROP, obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96968L)
    public static SubLObject sql_conjunction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_conjunction(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96968L)
    public static SubLObject sql_conjunction_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_conjunction_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96968L)
    public static SubLObject sql_conjunction_conjuncts(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_conjunction_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96968L)
    public static SubLObject _csetf_sql_conjunction_conjuncts(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_conjunction_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96968L)
    public static SubLObject make_sql_conjunction(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_conjunction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw380$CONJUNCTS)) {
                _csetf_sql_conjunction_conjuncts(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96968L)
    public static SubLObject visit_defstruct_sql_conjunction(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym381$MAKE_SQL_CONJUNCTION, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw380$CONJUNCTS, sql_conjunction_conjuncts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym381$MAKE_SQL_CONJUNCTION, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 96968L)
    public static SubLObject visit_defstruct_object_sql_conjunction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_conjunction(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97163L)
    public static SubLObject print_sql_conjunction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)semantic_etl_bus.$str200$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        streams_high.write_string(sql_list_string(sql_conjunction_conjuncts(v_object), (SubLObject)semantic_etl_bus.$str383$_AND_), stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        streams_high.write_string((SubLObject)semantic_etl_bus.$str201$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97400L)
    public static SubLObject new_sql_conjunction(final SubLObject conjuncts) {
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(conjuncts) : conjuncts;
        SubLObject cdolist_list_var = conjuncts;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != sql_condition_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject conjunction = make_sql_conjunction((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_conjunction_conjuncts(conjunction, conjuncts);
        return conjunction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97630L)
    public static SubLObject sql_disjunction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_disjunction(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97630L)
    public static SubLObject sql_disjunction_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_disjunction_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97630L)
    public static SubLObject sql_disjunction_disjuncts(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_disjunction_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97630L)
    public static SubLObject _csetf_sql_disjunction_disjuncts(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_disjunction_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97630L)
    public static SubLObject make_sql_disjunction(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_disjunction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw396$DISJUNCTS)) {
                _csetf_sql_disjunction_disjuncts(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97630L)
    public static SubLObject visit_defstruct_sql_disjunction(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym397$MAKE_SQL_DISJUNCTION, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw396$DISJUNCTS, sql_disjunction_disjuncts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym397$MAKE_SQL_DISJUNCTION, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97630L)
    public static SubLObject visit_defstruct_object_sql_disjunction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_disjunction(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97762L)
    public static SubLObject print_sql_disjunction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)semantic_etl_bus.$str200$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        streams_high.write_string(sql_list_string(sql_disjunction_disjuncts(v_object), (SubLObject)semantic_etl_bus.$str399$_OR_), stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        streams_high.write_string((SubLObject)semantic_etl_bus.$str201$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 97998L)
    public static SubLObject new_sql_disjunction(final SubLObject disjuncts) {
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(disjuncts) : disjuncts;
        SubLObject cdolist_list_var = disjuncts;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != sql_condition_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject disjunction = make_sql_disjunction((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_disjunction_disjuncts(disjunction, disjuncts);
        return disjunction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject sql_copy_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_copy_table(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject sql_copy_table_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_copy_table_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject sql_copy_table_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_copy_table_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject sql_copy_table_from(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_copy_table_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject sql_copy_table_to(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_copy_table_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject _csetf_sql_copy_table_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_copy_table_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject _csetf_sql_copy_table_from(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_copy_table_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject _csetf_sql_copy_table_to(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_copy_table_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject make_sql_copy_table(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_copy_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw415$TABLE)) {
                _csetf_sql_copy_table_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw416$FROM)) {
                _csetf_sql_copy_table_from(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw417$TO)) {
                _csetf_sql_copy_table_to(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject visit_defstruct_sql_copy_table(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym418$MAKE_SQL_COPY_TABLE, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw415$TABLE, sql_copy_table_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw416$FROM, sql_copy_table_from(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw417$TO, sql_copy_table_to(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym418$MAKE_SQL_COPY_TABLE, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98228L)
    public static SubLObject visit_defstruct_object_sql_copy_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_copy_table(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98487L)
    public static SubLObject print_sql_copy_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str420$COPY_TABLE__a_FROM_DATABASE__a_TO, new SubLObject[] { sql_copy_table_table(v_object), access_path_pretty_string(sql_copy_table_from(v_object)), access_path_pretty_string(sql_copy_table_to(v_object)) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 98800L)
    public static SubLObject new_sql_copy_table(final SubLObject table, final SubLObject from, final SubLObject to) {
        assert semantic_etl_bus.NIL != Types.stringp(table) : table;
        assert semantic_etl_bus.NIL != sksi_access_path.access_path_p(from) : from;
        assert semantic_etl_bus.NIL != sksi_access_path.access_path_p(to) : to;
        final SubLObject copy_table = make_sql_copy_table((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_copy_table_table(copy_table, table);
        _csetf_sql_copy_table_from(copy_table, from);
        _csetf_sql_copy_table_to(copy_table, to);
        return copy_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject sql_insert_into_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_insert_into(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject sql_insert_into_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_insert_into_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject sql_insert_into_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_insert_into_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject sql_insert_into_columns(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_insert_into_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject sql_insert_into_data(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_insert_into_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject _csetf_sql_insert_into_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_insert_into_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject _csetf_sql_insert_into_columns(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_insert_into_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject _csetf_sql_insert_into_data(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_insert_into_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject make_sql_insert_into(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_insert_into_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw415$TABLE)) {
                _csetf_sql_insert_into_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw436$COLUMNS)) {
                _csetf_sql_insert_into_columns(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw437$DATA)) {
                _csetf_sql_insert_into_data(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject visit_defstruct_sql_insert_into(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym438$MAKE_SQL_INSERT_INTO, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw415$TABLE, sql_insert_into_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw436$COLUMNS, sql_insert_into_columns(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw437$DATA, sql_insert_into_data(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym438$MAKE_SQL_INSERT_INTO, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99165L)
    public static SubLObject visit_defstruct_object_sql_insert_into_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_insert_into(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99461L)
    public static SubLObject print_sql_insert_into(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str440$INSERT_INTO__a___a___a, new SubLObject[] { sql_insert_into_table(v_object), sql_list_string(sql_insert_into_columns(v_object), (SubLObject)semantic_etl_bus.$str441$__), sql_insert_into_data(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 99727L)
    public static SubLObject new_sql_insert_into(final SubLObject table, final SubLObject columns, final SubLObject data) {
        assert semantic_etl_bus.NIL != Types.stringp(table) : table;
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(columns) : columns;
        SubLObject cdolist_list_var = columns;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert semantic_etl_bus.NIL != sql_table_expression_p(data) : data;
        final SubLObject insert_into = make_sql_insert_into((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_insert_into_table(insert_into, table);
        _csetf_sql_insert_into_columns(insert_into, columns);
        _csetf_sql_insert_into_data(insert_into, data);
        return insert_into;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject sql_select_from_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_select_from(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject sql_select_from_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_select_from_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject sql_select_from_columns(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_select_from_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject sql_select_from_tables(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_select_from_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject sql_select_from_conditions(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_select_from_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject _csetf_sql_select_from_columns(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_select_from_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject _csetf_sql_select_from_tables(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_select_from_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject _csetf_sql_select_from_conditions(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_select_from_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject make_sql_select_from(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_select_from_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw436$COLUMNS)) {
                _csetf_sql_select_from_columns(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw458$TABLES)) {
                _csetf_sql_select_from_tables(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw459$CONDITIONS)) {
                _csetf_sql_select_from_conditions(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject visit_defstruct_sql_select_from(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym460$MAKE_SQL_SELECT_FROM, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw436$COLUMNS, sql_select_from_columns(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw458$TABLES, sql_select_from_tables(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw459$CONDITIONS, sql_select_from_conditions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym460$MAKE_SQL_SELECT_FROM, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100130L)
    public static SubLObject visit_defstruct_object_sql_select_from_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_select_from(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100467L)
    public static SubLObject print_sql_select_from(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str462$SELECT__a_FROM__a, sql_list_string(sql_select_from_columns(v_object), (SubLObject)semantic_etl_bus.UNPROVIDED), sql_list_string(sql_select_from_tables(v_object), (SubLObject)semantic_etl_bus.UNPROVIDED));
        if (semantic_etl_bus.NIL != sql_select_from_conditions(v_object)) {
            PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str463$_WHERE__a, sql_list_string(sql_select_from_conditions(v_object), (SubLObject)semantic_etl_bus.$str464$_AND));
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 100851L)
    public static SubLObject new_sql_select_from(final SubLObject columns, final SubLObject tables, final SubLObject conditions) {
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(columns) : columns;
        SubLObject cdolist_list_var = columns;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(tables) : tables;
        cdolist_list_var = tables;
        elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != sql_table_expression_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert semantic_etl_bus.NIL != Types.listp(conditions) : conditions;
        final SubLObject select_from = make_sql_select_from((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_select_from_columns(select_from, columns);
        _csetf_sql_select_from_tables(select_from, tables);
        _csetf_sql_select_from_conditions(select_from, conditions);
        return select_from;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101285L)
    public static SubLObject sql_list_string(final SubLObject list, SubLObject separator) {
        if (separator == semantic_etl_bus.UNPROVIDED) {
            separator = (SubLObject)semantic_etl_bus.$str441$__;
        }
        SubLObject string = (SubLObject)semantic_etl_bus.NIL;
        SubLObject stream = (SubLObject)semantic_etl_bus.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            if (semantic_etl_bus.NIL != list) {
                print_high.princ(list.first(), stream);
                SubLObject cdolist_list_var = list.rest();
                SubLObject element = (SubLObject)semantic_etl_bus.NIL;
                element = cdolist_list_var.first();
                while (semantic_etl_bus.NIL != cdolist_list_var) {
                    print_high.princ(separator, stream);
                    print_high.princ(element, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    element = cdolist_list_var.first();
                }
            }
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)semantic_etl_bus.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)semantic_etl_bus.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLObject sql_except_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_except(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLObject sql_except_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_except_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLObject sql_except_table1(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_except_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLObject sql_except_table2(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_except_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLObject _csetf_sql_except_table1(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_except_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLObject _csetf_sql_except_table2(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_except_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLObject make_sql_except(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_except_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw478$TABLE1)) {
                _csetf_sql_except_table1(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw479$TABLE2)) {
                _csetf_sql_except_table2(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLObject visit_defstruct_sql_except(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym480$MAKE_SQL_EXCEPT, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw478$TABLE1, sql_except_table1(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw479$TABLE2, sql_except_table2(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym480$MAKE_SQL_EXCEPT, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101643L)
    public static SubLObject visit_defstruct_object_sql_except_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_except(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101794L)
    public static SubLObject print_sql_except(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str482$_a_EXCEPT__a, sql_except_table1(v_object), sql_except_table2(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 101979L)
    public static SubLObject new_sql_except(final SubLObject table_expr1, final SubLObject table_expr2) {
        assert semantic_etl_bus.NIL != sql_table_expression_p(table_expr1) : table_expr1;
        assert semantic_etl_bus.NIL != sql_table_expression_p(table_expr2) : table_expr2;
        final SubLObject except = make_sql_except((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_except_table1(except, table_expr1);
        _csetf_sql_except_table2(except, table_expr2);
        return except;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLObject sql_alias_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_alias(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLObject sql_alias_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_alias_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLObject sql_alias_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_alias_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLObject sql_alias_alias(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_alias_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLObject _csetf_sql_alias_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_alias_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLObject _csetf_sql_alias_alias(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_alias_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLObject make_sql_alias(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_alias_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw415$TABLE)) {
                _csetf_sql_alias_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw496$ALIAS)) {
                _csetf_sql_alias_alias(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLObject visit_defstruct_sql_alias(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym497$MAKE_SQL_ALIAS, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw415$TABLE, sql_alias_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw496$ALIAS, sql_alias_alias(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym497$MAKE_SQL_ALIAS, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102297L)
    public static SubLObject visit_defstruct_object_sql_alias_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_alias(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102456L)
    public static SubLObject print_sql_alias(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str499$_a_AS__a, sql_alias_table(v_object), sql_alias_alias(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102631L)
    public static SubLObject new_sql_alias(final SubLObject table, final SubLObject alias) {
        assert semantic_etl_bus.NIL != sql_table_expression_p(table) : table;
        assert semantic_etl_bus.NIL != Types.stringp(alias) : alias;
        final SubLObject sql_alias = make_sql_alias((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_alias_table(sql_alias, table);
        _csetf_sql_alias_alias(sql_alias, alias);
        return sql_alias;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject sql_column_equal_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_column_equal(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject sql_column_equal_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_column_equal_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject sql_column_equal_table1(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_column_equal_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject sql_column_equal_column1(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_column_equal_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject sql_column_equal_table2(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_column_equal_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject sql_column_equal_column2(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_column_equal_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject _csetf_sql_column_equal_table1(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_column_equal_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject _csetf_sql_column_equal_column1(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_column_equal_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject _csetf_sql_column_equal_table2(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_column_equal_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject _csetf_sql_column_equal_column2(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_column_equal_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject make_sql_column_equal(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_column_equal_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw478$TABLE1)) {
                _csetf_sql_column_equal_table1(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw517$COLUMN1)) {
                _csetf_sql_column_equal_column1(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw479$TABLE2)) {
                _csetf_sql_column_equal_table2(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw518$COLUMN2)) {
                _csetf_sql_column_equal_column2(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject visit_defstruct_sql_column_equal(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym519$MAKE_SQL_COLUMN_EQUAL, (SubLObject)semantic_etl_bus.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw478$TABLE1, sql_column_equal_table1(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw517$COLUMN1, sql_column_equal_column1(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw479$TABLE2, sql_column_equal_table2(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw518$COLUMN2, sql_column_equal_column2(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym519$MAKE_SQL_COLUMN_EQUAL, (SubLObject)semantic_etl_bus.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 102904L)
    public static SubLObject visit_defstruct_object_sql_column_equal_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_column_equal(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 103184L)
    public static SubLObject print_sql_column_equal(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str521$_a____a, (semantic_etl_bus.NIL != string_utilities.non_empty_string_p(sql_column_equal_table1(v_object))) ? Sequences.cconcatenate(sql_column_equal_table1(v_object), new SubLObject[] { semantic_etl_bus.$str143$_, sql_column_equal_column1(v_object) }) : sql_column_equal_column1(v_object), (semantic_etl_bus.NIL != string_utilities.non_empty_string_p(sql_column_equal_table2(v_object))) ? Sequences.cconcatenate(sql_column_equal_table2(v_object), new SubLObject[] { semantic_etl_bus.$str143$_, sql_column_equal_column2(v_object) }) : sql_column_equal_column2(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 103709L)
    public static SubLObject new_sql_column_equal(final SubLObject table1, final SubLObject column1, final SubLObject table2, final SubLObject column2) {
        assert semantic_etl_bus.NIL != Types.stringp(table1) : table1;
        assert semantic_etl_bus.NIL != Types.stringp(column1) : column1;
        assert semantic_etl_bus.NIL != Types.stringp(table2) : table2;
        assert semantic_etl_bus.NIL != Types.stringp(column2) : column2;
        final SubLObject column_equal = make_sql_column_equal((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_column_equal_table1(column_equal, table1);
        _csetf_sql_column_equal_column1(column_equal, column1);
        _csetf_sql_column_equal_table2(column_equal, table2);
        _csetf_sql_column_equal_column2(column_equal, column2);
        return column_equal;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLObject sql_is_null_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_is_null(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLObject sql_is_null_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_is_null_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLObject sql_is_null_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_is_null_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLObject sql_is_null_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_is_null_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLObject _csetf_sql_is_null_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_is_null_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLObject _csetf_sql_is_null_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_is_null_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLObject make_sql_is_null(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_is_null_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw415$TABLE)) {
                _csetf_sql_is_null_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw535$COLUMN)) {
                _csetf_sql_is_null_column(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLObject visit_defstruct_sql_is_null(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym536$MAKE_SQL_IS_NULL, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw415$TABLE, sql_is_null_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw535$COLUMN, sql_is_null_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym536$MAKE_SQL_IS_NULL, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104213L)
    public static SubLObject visit_defstruct_object_sql_is_null_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_is_null(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104368L)
    public static SubLObject print_sql_is_null(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str538$_a__a_IS_NULL, sql_is_null_table(v_object), sql_is_null_column(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104555L)
    public static SubLObject new_sql_is_null(final SubLObject table, final SubLObject column) {
        assert semantic_etl_bus.NIL != sql_table_expression_p(table) : table;
        assert semantic_etl_bus.NIL != Types.stringp(column) : column;
        final SubLObject is_null = make_sql_is_null((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_is_null_table(is_null, table);
        _csetf_sql_is_null_column(is_null, column);
        return is_null;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject sql_not_in_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_not_in(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject sql_not_in_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_not_in_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject sql_not_in_column_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_not_in_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject sql_not_in_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_not_in_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject sql_not_in_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_not_in_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject _csetf_sql_not_in_column_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_not_in_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject _csetf_sql_not_in_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_not_in_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject _csetf_sql_not_in_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_not_in_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject make_sql_not_in(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_not_in_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw554$COLUMN_TABLE)) {
                _csetf_sql_not_in_column_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw535$COLUMN)) {
                _csetf_sql_not_in_column(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw415$TABLE)) {
                _csetf_sql_not_in_table(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject visit_defstruct_sql_not_in(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym555$MAKE_SQL_NOT_IN, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw554$COLUMN_TABLE, sql_not_in_column_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw535$COLUMN, sql_not_in_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw415$TABLE, sql_not_in_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym555$MAKE_SQL_NOT_IN, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 104832L)
    public static SubLObject visit_defstruct_object_sql_not_in_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_not_in(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105031L)
    public static SubLObject print_sql_not_in(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str557$_a__a_NOT_IN__a, new SubLObject[] { sql_not_in_column_table(v_object), sql_not_in_column(v_object), sql_not_in_table(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105255L)
    public static SubLObject new_sql_not_in(final SubLObject column_table, final SubLObject column, final SubLObject table) {
        assert semantic_etl_bus.NIL != Types.stringp(column_table) : column_table;
        assert semantic_etl_bus.NIL != Types.stringp(column) : column;
        assert semantic_etl_bus.NIL != sql_table_expression_p(table) : table;
        final SubLObject notin = make_sql_not_in((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_not_in_column_table(notin, column_table);
        _csetf_sql_not_in_column(notin, column);
        _csetf_sql_not_in_table(notin, table);
        return notin;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject sql_inner_join_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_inner_join(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject sql_inner_join_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_inner_join_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject sql_inner_join_table1(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_inner_join_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject sql_inner_join_table2(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_inner_join_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject sql_inner_join_on(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_inner_join_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject _csetf_sql_inner_join_table1(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_inner_join_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject _csetf_sql_inner_join_table2(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_inner_join_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject _csetf_sql_inner_join_on(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_inner_join_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject make_sql_inner_join(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_inner_join_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw478$TABLE1)) {
                _csetf_sql_inner_join_table1(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw479$TABLE2)) {
                _csetf_sql_inner_join_table2(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw573$ON)) {
                _csetf_sql_inner_join_on(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject visit_defstruct_sql_inner_join(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym574$MAKE_SQL_INNER_JOIN, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw478$TABLE1, sql_inner_join_table1(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw479$TABLE2, sql_inner_join_table2(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw573$ON, sql_inner_join_on(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym574$MAKE_SQL_INNER_JOIN, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105626L)
    public static SubLObject visit_defstruct_object_sql_inner_join_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_inner_join(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 105846L)
    public static SubLObject print_sql_inner_join(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str576$_a_INNER_JOIN__a_ON__a, new SubLObject[] { sql_inner_join_table1(v_object), sql_inner_join_table2(v_object), sql_inner_join_on(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106082L)
    public static SubLObject new_sql_inner_join(final SubLObject table1, final SubLObject table2, final SubLObject on) {
        assert semantic_etl_bus.NIL != sql_table_expression_p(table1) : table1;
        assert semantic_etl_bus.NIL != sql_table_expression_p(table2) : table2;
        assert semantic_etl_bus.NIL != sql_condition_p(on) : on;
        final SubLObject inner_join = make_sql_inner_join((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_inner_join_table1(inner_join, table1);
        _csetf_sql_inner_join_table2(inner_join, table2);
        _csetf_sql_inner_join_on(inner_join, on);
        return inner_join;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject sql_left_join_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_left_join(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject sql_left_join_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_left_join_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject sql_left_join_left_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_left_join_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject sql_left_join_right_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_left_join_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject sql_left_join_on(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_left_join_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject _csetf_sql_left_join_left_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_left_join_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject _csetf_sql_left_join_right_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_left_join_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject _csetf_sql_left_join_on(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_left_join_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject make_sql_left_join(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_left_join_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw592$LEFT_TABLE)) {
                _csetf_sql_left_join_left_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw593$RIGHT_TABLE)) {
                _csetf_sql_left_join_right_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw573$ON)) {
                _csetf_sql_left_join_on(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject visit_defstruct_sql_left_join(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym594$MAKE_SQL_LEFT_JOIN, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw592$LEFT_TABLE, sql_left_join_left_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw593$RIGHT_TABLE, sql_left_join_right_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw573$ON, sql_left_join_on(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym594$MAKE_SQL_LEFT_JOIN, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106485L)
    public static SubLObject visit_defstruct_object_sql_left_join_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_left_join(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 106777L)
    public static SubLObject print_sql_left_join(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str596$_a_LEFT_JOIN__a_ON__a, new SubLObject[] { sql_left_join_left_table(v_object), sql_left_join_right_table(v_object), sql_left_join_on(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107018L)
    public static SubLObject new_sql_left_join(final SubLObject left_table, final SubLObject right_table, final SubLObject on) {
        assert semantic_etl_bus.NIL != Types.stringp(left_table) : left_table;
        assert semantic_etl_bus.NIL != Types.stringp(right_table) : right_table;
        assert semantic_etl_bus.NIL != sql_condition_p(on) : on;
        final SubLObject left_join = make_sql_left_join((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_left_join_left_table(left_join, left_table);
        _csetf_sql_left_join_right_table(left_join, right_table);
        _csetf_sql_left_join_on(left_join, on);
        return left_join;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLObject sql_union_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_union(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLObject sql_union_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_union_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLObject sql_union_select1(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_union_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLObject sql_union_select2(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_union_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLObject _csetf_sql_union_select1(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_union_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLObject _csetf_sql_union_select2(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_union_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLObject make_sql_union(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_union_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw610$SELECT1)) {
                _csetf_sql_union_select1(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw611$SELECT2)) {
                _csetf_sql_union_select2(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLObject visit_defstruct_sql_union(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym612$MAKE_SQL_UNION, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw610$SELECT1, sql_union_select1(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw611$SELECT2, sql_union_select2(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym612$MAKE_SQL_UNION, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107417L)
    public static SubLObject visit_defstruct_object_sql_union_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_union(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107639L)
    public static SubLObject print_sql_union(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str614$_a__UNION___a, sql_union_select1(v_object), sql_union_select2(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 107817L)
    public static SubLObject new_sql_union(final SubLObject select1, final SubLObject select2) {
        assert semantic_etl_bus.NIL != sql_select_from_p(select1) : select1;
        assert semantic_etl_bus.NIL != sql_select_from_p(select2) : select2;
        final SubLObject union = make_sql_union((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_union_select1(union, select1);
        _csetf_sql_union_select1(union, select2);
        return union;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLObject sql_alter_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_alter_table(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLObject sql_alter_table_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_alter_table_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLObject sql_alter_table_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_alter_table_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLObject sql_alter_table_action(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_alter_table_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLObject _csetf_sql_alter_table_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_alter_table_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLObject _csetf_sql_alter_table_action(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_alter_table_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLObject make_sql_alter_table(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_alter_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw415$TABLE)) {
                _csetf_sql_alter_table_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw628$ACTION)) {
                _csetf_sql_alter_table_action(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLObject visit_defstruct_sql_alter_table(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym629$MAKE_SQL_ALTER_TABLE, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw415$TABLE, sql_alter_table_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw628$ACTION, sql_alter_table_action(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym629$MAKE_SQL_ALTER_TABLE, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108095L)
    public static SubLObject visit_defstruct_object_sql_alter_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_alter_table(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108308L)
    public static SubLObject print_sql_alter_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str631$ALTER_TABLE__a__a, sql_alter_table_table(v_object), sql_alter_table_action(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108513L)
    public static SubLObject new_sql_alter_table(final SubLObject table, final SubLObject action) {
        assert semantic_etl_bus.NIL != Types.stringp(table) : table;
        assert semantic_etl_bus.NIL != sql_alteration_p(action) : action;
        final SubLObject alter_table = make_sql_alter_table((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_alter_table_table(alter_table, table);
        _csetf_sql_alter_table_action(alter_table, action);
        return alter_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject sql_add_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_add_column(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject sql_add_column_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_add_column_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject sql_add_column_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_add_column_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject sql_add_column_type(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_add_column_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject sql_add_column_size(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_add_column_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject sql_add_column_constraints(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_add_column_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject _csetf_sql_add_column_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_add_column_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject _csetf_sql_add_column_type(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_add_column_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject _csetf_sql_add_column_size(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_add_column_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject _csetf_sql_add_column_constraints(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_add_column_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject make_sql_add_column(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_add_column_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw535$COLUMN)) {
                _csetf_sql_add_column_column(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw650$TYPE)) {
                _csetf_sql_add_column_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw651$SIZE)) {
                _csetf_sql_add_column_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw652$CONSTRAINTS)) {
                _csetf_sql_add_column_constraints(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject visit_defstruct_sql_add_column(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym653$MAKE_SQL_ADD_COLUMN, (SubLObject)semantic_etl_bus.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw535$COLUMN, sql_add_column_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw650$TYPE, sql_add_column_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw651$SIZE, sql_add_column_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw652$CONSTRAINTS, sql_add_column_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym653$MAKE_SQL_ADD_COLUMN, (SubLObject)semantic_etl_bus.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 108816L)
    public static SubLObject visit_defstruct_object_sql_add_column_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_add_column(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 109146L)
    public static SubLObject print_sql_add_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str655$ADD_COLUMN__a__a, sql_add_column_column(v_object), sql_add_column_type(v_object));
        if (semantic_etl_bus.NIL != sql_add_column_size(v_object)) {
            PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str656$__a_, sql_add_column_size(v_object));
        }
        if (semantic_etl_bus.NIL != sql_add_column_constraints(v_object)) {
            streams_high.write_string((SubLObject)semantic_etl_bus.$str254$_, stream, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
            print_high.princ(sql_list_string(sql_add_column_constraints(v_object), (SubLObject)semantic_etl_bus.$str254$_), stream);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 109594L)
    public static SubLObject new_sql_add_column(final SubLObject column, final SubLObject type, SubLObject size, SubLObject constraints) {
        if (size == semantic_etl_bus.UNPROVIDED) {
            size = (SubLObject)semantic_etl_bus.NIL;
        }
        if (constraints == semantic_etl_bus.UNPROVIDED) {
            constraints = (SubLObject)semantic_etl_bus.NIL;
        }
        assert semantic_etl_bus.NIL != Types.stringp(column) : column;
        assert semantic_etl_bus.NIL != Types.stringp(type) : type;
        if (semantic_etl_bus.NIL != size && !semantic_etl_bus.assertionsDisabledInClass && semantic_etl_bus.NIL == subl_promotions.positive_integer_p(size)) {
            throw new AssertionError(size);
        }
        final SubLObject list_var = constraints;
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != sql_column_constraint_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject add_column = make_sql_add_column((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_add_column_column(add_column, column);
        _csetf_sql_add_column_type(add_column, type);
        _csetf_sql_add_column_size(add_column, size);
        _csetf_sql_add_column_constraints(add_column, constraints);
        return add_column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110125L)
    public static SubLObject new_sql_add_column_to_table(final SubLObject table, final SubLObject column, final SubLObject type, SubLObject size, SubLObject constraints) {
        if (size == semantic_etl_bus.UNPROVIDED) {
            size = (SubLObject)semantic_etl_bus.NIL;
        }
        if (constraints == semantic_etl_bus.UNPROVIDED) {
            constraints = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject action = new_sql_add_column(column, type, size, constraints);
        return new_sql_alter_table(table, action);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110335L)
    public static SubLObject sql_drop_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_drop_column(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110335L)
    public static SubLObject sql_drop_column_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_drop_column_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110335L)
    public static SubLObject sql_drop_column_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_drop_column_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110335L)
    public static SubLObject _csetf_sql_drop_column_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_drop_column_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110335L)
    public static SubLObject make_sql_drop_column(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_drop_column_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw535$COLUMN)) {
                _csetf_sql_drop_column_column(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110335L)
    public static SubLObject visit_defstruct_sql_drop_column(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym670$MAKE_SQL_DROP_COLUMN, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw535$COLUMN, sql_drop_column_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym670$MAKE_SQL_DROP_COLUMN, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110335L)
    public static SubLObject visit_defstruct_object_sql_drop_column_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_drop_column(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110476L)
    public static SubLObject print_sql_drop_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str672$DROP_COLUMN__a, sql_drop_column_column(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110639L)
    public static SubLObject new_sql_drop_column(final SubLObject column) {
        assert semantic_etl_bus.NIL != Types.stringp(column) : column;
        final SubLObject drop_column = make_sql_drop_column((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_drop_column_column(drop_column, column);
        return drop_column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLObject sql_rename_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_rename_column(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLObject sql_rename_column_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_rename_column_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLObject sql_rename_column_old_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_rename_column_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLObject sql_rename_column_new_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_rename_column_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLObject _csetf_sql_rename_column_old_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_rename_column_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLObject _csetf_sql_rename_column_new_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_rename_column_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLObject make_sql_rename_column(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_rename_column_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw686$OLD_COLUMN)) {
                _csetf_sql_rename_column_old_column(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw687$NEW_COLUMN)) {
                _csetf_sql_rename_column_new_column(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLObject visit_defstruct_sql_rename_column(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym688$MAKE_SQL_RENAME_COLUMN, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw686$OLD_COLUMN, sql_rename_column_old_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw687$NEW_COLUMN, sql_rename_column_new_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym688$MAKE_SQL_RENAME_COLUMN, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 110844L)
    public static SubLObject visit_defstruct_object_sql_rename_column_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_rename_column(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111052L)
    public static SubLObject print_sql_rename_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str690$RENAME__a_TO__a, sql_rename_column_old_column(v_object), sql_rename_column_new_column(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111262L)
    public static SubLObject new_sql_rename_column(final SubLObject old_column, final SubLObject new_column) {
        assert semantic_etl_bus.NIL != Types.stringp(old_column) : old_column;
        assert semantic_etl_bus.NIL != Types.stringp(new_column) : new_column;
        final SubLObject rename_column = make_sql_rename_column((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_rename_column_old_column(rename_column, old_column);
        _csetf_sql_rename_column_new_column(rename_column, new_column);
        return rename_column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111608L)
    public static SubLObject sql_add_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_add_constraint(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111608L)
    public static SubLObject sql_add_constraint_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_add_constraint_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111608L)
    public static SubLObject sql_add_constraint_constraint(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_add_constraint_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111608L)
    public static SubLObject _csetf_sql_add_constraint_constraint(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_add_constraint_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111608L)
    public static SubLObject make_sql_add_constraint(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_add_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw702$CONSTRAINT)) {
                _csetf_sql_add_constraint_constraint(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111608L)
    public static SubLObject visit_defstruct_sql_add_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym703$MAKE_SQL_ADD_CONSTRAINT, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw702$CONSTRAINT, sql_add_constraint_constraint(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym703$MAKE_SQL_ADD_CONSTRAINT, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111608L)
    public static SubLObject visit_defstruct_object_sql_add_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_add_constraint(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 111768L)
    public static SubLObject print_sql_add_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str705$ADD_CONSTRAINT__a__a, sql_fk_column_constraint_name(sql_fk_table_constraint_constraint(sql_add_constraint_constraint(v_object))), sql_add_constraint_constraint(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112062L)
    public static SubLObject new_sql_add_constraint(final SubLObject constraint) {
        assert semantic_etl_bus.NIL != sql_table_constraint_p(constraint) : constraint;
        final SubLObject add = make_sql_add_constraint((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_add_constraint_constraint(add, constraint);
        return add;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112283L)
    public static SubLObject sql_drop_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_drop_constraint(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112283L)
    public static SubLObject sql_drop_constraint_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_drop_constraint_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112283L)
    public static SubLObject sql_drop_constraint_constraint(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_drop_constraint_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112283L)
    public static SubLObject _csetf_sql_drop_constraint_constraint(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_drop_constraint_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112283L)
    public static SubLObject make_sql_drop_constraint(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_drop_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw702$CONSTRAINT)) {
                _csetf_sql_drop_constraint_constraint(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112283L)
    public static SubLObject visit_defstruct_sql_drop_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym716$MAKE_SQL_DROP_CONSTRAINT, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw702$CONSTRAINT, sql_drop_constraint_constraint(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym716$MAKE_SQL_DROP_CONSTRAINT, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112283L)
    public static SubLObject visit_defstruct_object_sql_drop_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_drop_constraint(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112456L)
    public static SubLObject print_sql_drop_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str718$DROP_CONSTRAINT__a, sql_fk_column_constraint_name(sql_fk_table_constraint_constraint(sql_drop_constraint_constraint(v_object))));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112719L)
    public static SubLObject new_sql_drop_constraint(final SubLObject constraint) {
        assert semantic_etl_bus.NIL != sql_table_constraint_p(constraint) : constraint;
        final SubLObject drop = make_sql_drop_constraint((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_drop_constraint_constraint(drop, constraint);
        return drop;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject sql_fk_column_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_fk_column_constraint(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject sql_fk_column_constraint_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_fk_column_constraint_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject sql_fk_column_constraint_name(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_fk_column_constraint_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject sql_fk_column_constraint_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_fk_column_constraint_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject sql_fk_column_constraint_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_fk_column_constraint_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject _csetf_sql_fk_column_constraint_name(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_fk_column_constraint_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject _csetf_sql_fk_column_constraint_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_fk_column_constraint_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject _csetf_sql_fk_column_constraint_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_fk_column_constraint_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject make_sql_fk_column_constraint(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_fk_column_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw734$NAME)) {
                _csetf_sql_fk_column_constraint_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw415$TABLE)) {
                _csetf_sql_fk_column_constraint_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw535$COLUMN)) {
                _csetf_sql_fk_column_constraint_column(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject visit_defstruct_sql_fk_column_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym735$MAKE_SQL_FK_COLUMN_CONSTRAINT, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw734$NAME, sql_fk_column_constraint_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw415$TABLE, sql_fk_column_constraint_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw535$COLUMN, sql_fk_column_constraint_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym735$MAKE_SQL_FK_COLUMN_CONSTRAINT, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 112946L)
    public static SubLObject visit_defstruct_object_sql_fk_column_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_fk_column_constraint(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113180L)
    public static SubLObject print_sql_fk_column_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str737$REFERENCES__a___a_, sql_fk_column_constraint_table(v_object), sql_fk_column_constraint_column(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113416L)
    public static SubLObject new_sql_fk_column_constraint(final SubLObject name, final SubLObject table, final SubLObject column) {
        assert semantic_etl_bus.NIL != Types.stringp(name) : name;
        assert semantic_etl_bus.NIL != Types.stringp(table) : table;
        assert semantic_etl_bus.NIL != Types.stringp(column) : column;
        final SubLObject constraint = make_sql_fk_column_constraint((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_fk_column_constraint_name(constraint, name);
        _csetf_sql_fk_column_constraint_table(constraint, table);
        _csetf_sql_fk_column_constraint_column(constraint, column);
        return constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLObject sql_fk_table_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_fk_table_constraint(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLObject sql_fk_table_constraint_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_fk_table_constraint_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLObject sql_fk_table_constraint_column(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_fk_table_constraint_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLObject sql_fk_table_constraint_constraint(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_fk_table_constraint_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLObject _csetf_sql_fk_table_constraint_column(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_fk_table_constraint_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLObject _csetf_sql_fk_table_constraint_constraint(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_fk_table_constraint_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLObject make_sql_fk_table_constraint(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_fk_table_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw535$COLUMN)) {
                _csetf_sql_fk_table_constraint_column(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw702$CONSTRAINT)) {
                _csetf_sql_fk_table_constraint_constraint(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLObject visit_defstruct_sql_fk_table_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym751$MAKE_SQL_FK_TABLE_CONSTRAINT, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw535$COLUMN, sql_fk_table_constraint_column(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw702$CONSTRAINT, sql_fk_table_constraint_constraint(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym751$MAKE_SQL_FK_TABLE_CONSTRAINT, (SubLObject)semantic_etl_bus.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 113835L)
    public static SubLObject visit_defstruct_object_sql_fk_table_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_fk_table_constraint(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114052L)
    public static SubLObject print_sql_fk_table_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str753$FOREIGN_KEY___a___a, sql_fk_table_constraint_column(v_object), sql_fk_table_constraint_constraint(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114289L)
    public static SubLObject new_sql_fk_table_constraint(final SubLObject column, final SubLObject column_constraint) {
        assert semantic_etl_bus.NIL != Types.stringp(column) : column;
        assert semantic_etl_bus.NIL != sql_column_constraint_p(column_constraint) : column_constraint;
        final SubLObject constraint = make_sql_fk_table_constraint((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_fk_table_constraint_column(constraint, column);
        _csetf_sql_fk_table_constraint_constraint(constraint, column_constraint);
        return constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject sql_update_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_update(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject sql_update_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_update_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject sql_update_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_update_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject sql_update_settings(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_update_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject sql_update_conditions(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_update_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject _csetf_sql_update_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_update_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject _csetf_sql_update_settings(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_update_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject _csetf_sql_update_conditions(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_update_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject make_sql_update(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_update_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw415$TABLE)) {
                _csetf_sql_update_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw769$SETTINGS)) {
                _csetf_sql_update_settings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw459$CONDITIONS)) {
                _csetf_sql_update_conditions(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject visit_defstruct_sql_update(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym770$MAKE_SQL_UPDATE, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw415$TABLE, sql_update_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw769$SETTINGS, sql_update_settings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw459$CONDITIONS, sql_update_conditions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym770$MAKE_SQL_UPDATE, (SubLObject)semantic_etl_bus.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114668L)
    public static SubLObject visit_defstruct_object_sql_update_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_update(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 114965L)
    public static SubLObject print_sql_update(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject settings = sql_update_settings(v_object);
        final SubLObject conditions = sql_update_conditions(v_object);
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str772$UPDATE__a_SET_, sql_update_table(v_object));
        print_high.princ(settings.first(), stream);
        SubLObject cdolist_list_var = settings.rest();
        SubLObject setting = (SubLObject)semantic_etl_bus.NIL;
        setting = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            print_high.princ((SubLObject)semantic_etl_bus.$str441$__, stream);
            print_high.princ(setting, stream);
            cdolist_list_var = cdolist_list_var.rest();
            setting = cdolist_list_var.first();
        }
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str773$_WHERE_);
        print_high.princ(conditions.first(), stream);
        cdolist_list_var = conditions.rest();
        SubLObject condition = (SubLObject)semantic_etl_bus.NIL;
        condition = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            print_high.princ((SubLObject)semantic_etl_bus.$str383$_AND_, stream);
            print_high.princ(condition, stream);
            cdolist_list_var = cdolist_list_var.rest();
            condition = cdolist_list_var.first();
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 115517L)
    public static SubLObject new_sql_update(final SubLObject table, final SubLObject settings, final SubLObject conditions) {
        assert semantic_etl_bus.NIL != Types.stringp(table) : table;
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(settings) : settings;
        SubLObject cdolist_list_var = settings;
        SubLObject elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != sql_column_equal_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert semantic_etl_bus.NIL != list_utilities.non_dotted_list_p(conditions) : conditions;
        cdolist_list_var = conditions;
        elem = (SubLObject)semantic_etl_bus.NIL;
        elem = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            assert semantic_etl_bus.NIL != sql_condition_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject update = make_sql_update((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_update_table(update, table);
        _csetf_sql_update_settings(update, settings);
        _csetf_sql_update_conditions(update, conditions);
        return update;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 115907L)
    public static SubLObject sql_drop_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_drop_table(v_object, stream, (SubLObject)semantic_etl_bus.ZERO_INTEGER);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 115907L)
    public static SubLObject sql_drop_table_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_drop_table_native.class) ? semantic_etl_bus.T : semantic_etl_bus.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 115907L)
    public static SubLObject sql_drop_table_table(final SubLObject v_object) {
        assert semantic_etl_bus.NIL != sql_drop_table_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 115907L)
    public static SubLObject _csetf_sql_drop_table_table(final SubLObject v_object, final SubLObject value) {
        assert semantic_etl_bus.NIL != sql_drop_table_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 115907L)
    public static SubLObject make_sql_drop_table(SubLObject arglist) {
        if (arglist == semantic_etl_bus.UNPROVIDED) {
            arglist = (SubLObject)semantic_etl_bus.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_drop_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)semantic_etl_bus.NIL, next = arglist; semantic_etl_bus.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)semantic_etl_bus.$kw415$TABLE)) {
                _csetf_sql_drop_table_table(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)semantic_etl_bus.$str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 115907L)
    public static SubLObject visit_defstruct_sql_drop_table(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw48$BEGIN, (SubLObject)semantic_etl_bus.$sym785$MAKE_SQL_DROP_TABLE, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw50$SLOT, (SubLObject)semantic_etl_bus.$kw415$TABLE, sql_drop_table_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)semantic_etl_bus.$kw51$END, (SubLObject)semantic_etl_bus.$sym785$MAKE_SQL_DROP_TABLE, (SubLObject)semantic_etl_bus.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 115907L)
    public static SubLObject visit_defstruct_object_sql_drop_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_drop_table(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 116043L)
    public static SubLObject print_sql_drop_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)semantic_etl_bus.$str787$DROP_TABLE__a, sql_drop_table_table(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 116202L)
    public static SubLObject new_sql_drop_table(final SubLObject table) {
        assert semantic_etl_bus.NIL != Types.stringp(table) : table;
        final SubLObject drop_table = make_sql_drop_table((SubLObject)semantic_etl_bus.UNPROVIDED);
        _csetf_sql_drop_table_table(drop_table, table);
        return drop_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 116397L)
    public static SubLObject sql_command_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(semantic_etl_bus.NIL != sql_copy_table_p(v_object) || semantic_etl_bus.NIL != sql_insert_into_p(v_object) || semantic_etl_bus.NIL != sql_select_from_p(v_object) || semantic_etl_bus.NIL != sql_column_equal_p(v_object) || semantic_etl_bus.NIL != sql_not_in_p(v_object) || semantic_etl_bus.NIL != sql_left_join_p(v_object) || semantic_etl_bus.NIL != sql_union_p(v_object) || semantic_etl_bus.NIL != sql_alter_table_p(v_object) || semantic_etl_bus.NIL != sql_add_column_p(v_object) || semantic_etl_bus.NIL != sql_drop_column_p(v_object) || semantic_etl_bus.NIL != sql_rename_column_p(v_object) || semantic_etl_bus.NIL != sql_add_constraint_p(v_object) || semantic_etl_bus.NIL != sql_drop_constraint_p(v_object) || semantic_etl_bus.NIL != sql_fk_column_constraint_p(v_object) || semantic_etl_bus.NIL != sql_fk_table_constraint_p(v_object) || semantic_etl_bus.NIL != sql_update_p(v_object) || semantic_etl_bus.NIL != sql_drop_table_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 117040L)
    public static SubLObject sql_table_expression_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() || semantic_etl_bus.NIL != sql_left_join_p(v_object) || semantic_etl_bus.NIL != sql_inner_join_p(v_object) || semantic_etl_bus.NIL != sql_select_from_p(v_object) || semantic_etl_bus.NIL != sql_except_p(v_object) || semantic_etl_bus.NIL != sql_alias_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 117317L)
    public static SubLObject sql_condition_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(semantic_etl_bus.NIL != sql_column_equal_p(v_object) || semantic_etl_bus.NIL != sql_conjunction_p(v_object) || semantic_etl_bus.NIL != sql_disjunction_p(v_object) || semantic_etl_bus.NIL != sql_is_null_p(v_object) || semantic_etl_bus.NIL != sql_not_in_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 117536L)
    public static SubLObject sql_alteration_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(semantic_etl_bus.NIL != sql_add_column_p(v_object) || semantic_etl_bus.NIL != sql_drop_column_p(v_object) || semantic_etl_bus.NIL != sql_rename_column_p(v_object) || semantic_etl_bus.NIL != sql_add_constraint_p(v_object) || semantic_etl_bus.NIL != sql_drop_constraint_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 117775L)
    public static SubLObject sql_table_constraint_p(final SubLObject v_object) {
        return sql_fk_table_constraint_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 117899L)
    public static SubLObject sql_column_constraint_p(final SubLObject v_object) {
        return sql_fk_column_constraint_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 118002L)
    public static SubLObject sql_column_constraint_name(final SubLObject constraint) {
        assert semantic_etl_bus.NIL != sql_column_constraint_p(constraint) : constraint;
        return (semantic_etl_bus.NIL != sql_fk_column_constraint_p(constraint)) ? sql_fk_column_constraint_name(constraint) : Errors.error((SubLObject)semantic_etl_bus.$str788$Can_t_access_name_of_column_const, constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 118298L)
    public static SubLObject new_foreign_key_constraint_name(final SubLObject constrained_table, final SubLObject constrained_column) {
        assert semantic_etl_bus.NIL != Types.stringp(constrained_table) : constrained_table;
        assert semantic_etl_bus.NIL != Types.stringp(constrained_column) : constrained_column;
        return Sequences.cconcatenate(constrained_table, new SubLObject[] { semantic_etl_bus.$str789$_, constrained_column, semantic_etl_bus.$str790$_fk });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 118847L)
    public static SubLObject initialize_access_path_map() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$access_path_map$.getGlobalValue()) {
            SubLObject cdolist_list_var = (SubLObject)semantic_etl_bus.$list793;
            SubLObject functionXname = (SubLObject)semantic_etl_bus.NIL;
            functionXname = cdolist_list_var.first();
            while (semantic_etl_bus.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = functionXname;
                SubLObject function = (SubLObject)semantic_etl_bus.NIL;
                SubLObject name = (SubLObject)semantic_etl_bus.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list792);
                function = current.first();
                current = (name = current.rest());
                semantic_etl_bus.$access_path_map$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(name, Functions.funcall(function)), semantic_etl_bus.$access_path_map$.getGlobalValue()));
                cdolist_list_var = cdolist_list_var.rest();
                functionXname = cdolist_list_var.first();
            }
        }
        return semantic_etl_bus.$access_path_map$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 119468L)
    public static SubLObject available_databases() {
        return Mapping.mapcar((SubLObject)semantic_etl_bus.$sym794$CAR, semantic_etl_bus.$access_path_map$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 119613L)
    public static SubLObject get_access_path(final SubLObject name) {
        return conses_high.assoc(name, semantic_etl_bus.$access_path_map$.getGlobalValue(), (SubLObject)semantic_etl_bus.EQUALP, (SubLObject)semantic_etl_bus.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 120178L)
    public static SubLObject bln1_access_path() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$bln1_access_path$.getGlobalValue()) {
            semantic_etl_bus.$bln1_access_path$.setGlobalValue(sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str804$bln_fusion_test_db_1, (SubLObject)semantic_etl_bus.$str805$sksi, (SubLObject)semantic_etl_bus.$str199$, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str807$standard_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int811$212));
        }
        return semantic_etl_bus.$bln1_access_path$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 120618L)
    public static SubLObject bln2_access_path() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$bln2_access_path$.getGlobalValue()) {
            semantic_etl_bus.$bln2_access_path$.setGlobalValue(sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str812$bln_fusion_test_db_2, (SubLObject)semantic_etl_bus.$str805$sksi, (SubLObject)semantic_etl_bus.$str199$, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str807$standard_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int811$212));
        }
        return semantic_etl_bus.$bln2_access_path$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 121065L)
    public static SubLObject usgs_access_path() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$usgs_access_path$.getGlobalValue()) {
            semantic_etl_bus.$usgs_access_path$.setGlobalValue(sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str813$usgs, (SubLObject)semantic_etl_bus.$str805$sksi, (SubLObject)semantic_etl_bus.$str199$, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str814$astro_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int811$212));
        }
        return semantic_etl_bus.$usgs_access_path$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 121493L)
    public static SubLObject nga_access_path() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$nga_access_path$.getGlobalValue()) {
            semantic_etl_bus.$nga_access_path$.setGlobalValue(sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str815$nga, (SubLObject)semantic_etl_bus.$str805$sksi, (SubLObject)semantic_etl_bus.$str199$, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str807$standard_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int811$212));
        }
        return semantic_etl_bus.$nga_access_path$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 121889L)
    public static SubLObject gndb_access_path() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$gndb_access_path$.getGlobalValue()) {
            semantic_etl_bus.$gndb_access_path$.setGlobalValue(sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str816$gndb, (SubLObject)semantic_etl_bus.$str805$sksi, (SubLObject)semantic_etl_bus.$str199$, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str807$standard_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int811$212));
        }
        return semantic_etl_bus.$gndb_access_path$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 122296L)
    public static SubLObject sporting_goods_access_path() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$sporting_goods_access_path$.getGlobalValue()) {
            semantic_etl_bus.$sporting_goods_access_path$.setGlobalValue(sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str817$sporting_goods, (SubLObject)semantic_etl_bus.$str805$sksi, (SubLObject)semantic_etl_bus.$str199$, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str807$standard_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int811$212));
        }
        return semantic_etl_bus.$sporting_goods_access_path$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 122664L)
    public static SubLObject northwind_access_path() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$northwind_access_path$.getGlobalValue()) {
            semantic_etl_bus.$northwind_access_path$.setGlobalValue(sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str818$northwind, (SubLObject)semantic_etl_bus.$str819$postgres, (SubLObject)semantic_etl_bus.$str819$postgres, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int811$212));
        }
        return semantic_etl_bus.$northwind_access_path$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 123016L)
    public static SubLObject bathymetric_data_access_path() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$bathymetric_data_access_path$.getGlobalValue()) {
            semantic_etl_bus.$bathymetric_data_access_path$.setGlobalValue(sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str820$bathymetric_data, (SubLObject)semantic_etl_bus.$str819$postgres, (SubLObject)semantic_etl_bus.$str819$postgres, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int821$214));
        }
        return semantic_etl_bus.$bathymetric_data_access_path$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 123333L)
    public static SubLObject bathymetric_header_access_path() {
        if (semantic_etl_bus.NIL == semantic_etl_bus.$bathymetric_header_access_path$.getGlobalValue()) {
            semantic_etl_bus.$bathymetric_header_access_path$.setGlobalValue(sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str822$bathymetric_survey, (SubLObject)semantic_etl_bus.$str819$postgres, (SubLObject)semantic_etl_bus.$str819$postgres, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int821$214));
        }
        return semantic_etl_bus.$bathymetric_header_access_path$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 123662L)
    public static SubLObject stub_target_access_path() {
        return sksi_access_path.new_db_access_path((SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str823$semantic_etl_target_db, (SubLObject)semantic_etl_bus.$str805$sksi, (SubLObject)semantic_etl_bus.$str199$, (SubLObject)semantic_etl_bus.$str806$cyc11_cyc_com, (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.$str814$astro_cyc_com, (SubLObject)semantic_etl_bus.$int808$9999, (SubLObject)semantic_etl_bus.$str809$postgresql, semantic_etl_bus.$const810$PostgreSQL, (SubLObject)semantic_etl_bus.$int811$212);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 123903L)
    public static SubLObject access_path_pretty_string(final SubLObject access_path) {
        final SubLObject db_name = sksi_access_path.access_path_db(access_path);
        if (db_name.equalp((SubLObject)semantic_etl_bus.$str804$bln_fusion_test_db_1)) {
            return (SubLObject)semantic_etl_bus.$str824$bln1;
        }
        if (db_name.equalp((SubLObject)semantic_etl_bus.$str812$bln_fusion_test_db_2)) {
            return (SubLObject)semantic_etl_bus.$str825$bln2;
        }
        if (db_name.equalp((SubLObject)semantic_etl_bus.$str823$semantic_etl_target_db)) {
            return (SubLObject)semantic_etl_bus.$str826$target;
        }
        return db_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 124317L)
    public static SubLObject output_spec_copy_column_data(final SubLObject output_spec, final SubLObject from_column, final SubLObject to_column) {
        assert semantic_etl_bus.NIL != database_output_spec_p(output_spec) : output_spec;
        assert semantic_etl_bus.NIL != column_semantics_p(from_column) : from_column;
        assert semantic_etl_bus.NIL != column_semantics_p(to_column) : to_column;
        SubLObject cdolist_list_var = column_semantics_value_semantics_list(from_column);
        SubLObject value = (SubLObject)semantic_etl_bus.NIL;
        value = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (semantic_etl_bus.NIL == column_semantics_has_valueP(to_column, value)) {
                column_semantics_add_value(to_column, value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        return to_column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 124927L)
    public static SubLObject column_semantics_has_valueP(final SubLObject column_semantics, final SubLObject value_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        assert semantic_etl_bus.NIL != value_semantics_p(value_semantics) : value_semantics;
        SubLObject cdolist_list_var = column_semantics_value_semantics_list(column_semantics);
        SubLObject value = (SubLObject)semantic_etl_bus.NIL;
        value = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (v_semant_value(value).equal(v_semant_value(value_semantics))) {
                return (SubLObject)semantic_etl_bus.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 125342L)
    public static SubLObject column_semantics_add_value(final SubLObject column_semantics, final SubLObject value_semantics) {
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        assert semantic_etl_bus.NIL != value_semantics_p(value_semantics) : value_semantics;
        _csetf_c_semant_value_semantics_list(column_semantics, (SubLObject)ConsesLow.cons(value_semantics, c_semant_value_semantics_list(column_semantics)));
        return column_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 125669L)
    public static SubLObject table_semantics_get_column(final SubLObject table_semantics, final SubLObject field_name) {
        assert semantic_etl_bus.NIL != table_semantics_p(table_semantics) : table_semantics;
        assert semantic_etl_bus.NIL != Types.stringp(field_name) : field_name;
        SubLObject cdolist_list_var = table_semantics_column_semantics_list(table_semantics);
        SubLObject column = (SubLObject)semantic_etl_bus.NIL;
        column = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            if (field_name.equal(column_semantics_column_name(column))) {
                return column;
            }
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 126048L)
    public static SubLObject table_semantics_append_column(final SubLObject table, final SubLObject column) {
        assert semantic_etl_bus.NIL != table_semantics_p(table) : table;
        assert semantic_etl_bus.NIL != column_semantics_p(column) : column;
        final SubLObject new_column = new_assimilated_column(table, column);
        _csetf_t_semant_column_semantics_list(table, ConsesLow.append(t_semant_column_semantics_list(table), (SubLObject)ConsesLow.list(new_column)));
        return t_semant_column_semantics_list(table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 126557L)
    public static SubLObject output_spec_get_tables(final SubLObject output_spec) {
        assert semantic_etl_bus.NIL != database_output_spec_p(output_spec) : output_spec;
        return semant_table_semantics_list(db_output_spec_semantics(output_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 126789L)
    public static SubLObject output_spec_get_access_paths(final SubLObject output_spec) {
        assert semantic_etl_bus.NIL != database_output_spec_p(output_spec) : output_spec;
        SubLObject access_paths = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = output_spec_get_tables(output_spec);
        SubLObject table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            final SubLObject item_var = semant_access_path(t_semant_source_semantics(table));
            if (semantic_etl_bus.NIL == conses_high.member(item_var, access_paths, (SubLObject)semantic_etl_bus.EQ, Symbols.symbol_function((SubLObject)semantic_etl_bus.IDENTITY))) {
                access_paths = (SubLObject)ConsesLow.cons(item_var, access_paths);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        return access_paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 127166L)
    public static SubLObject output_spec_get_native_column_semantics(final SubLObject output_spec, final SubLObject column_semantics) {
        assert semantic_etl_bus.NIL != database_output_spec_p(output_spec) : output_spec;
        assert semantic_etl_bus.NIL != column_semantics_p(column_semantics) : column_semantics;
        final SubLObject column_name = c_semant_column_name(column_semantics);
        final SubLObject table_semantics = c_semant_table_semantics(column_semantics);
        final SubLObject source_semantics = t_semant_source_semantics(table_semantics);
        final SubLObject source_database = access_path_pretty_string(semant_access_path(source_semantics));
        SubLObject cdolist_list_var = output_spec_get_tables(output_spec);
        SubLObject table = (SubLObject)semantic_etl_bus.NIL;
        table = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = table_semantics_column_semantics_list(table);
            SubLObject column = (SubLObject)semantic_etl_bus.NIL;
            column = cdolist_list_var_$8.first();
            while (semantic_etl_bus.NIL != cdolist_list_var_$8) {
                final SubLObject column_name2 = c_semant_column_name(column);
                final SubLObject source_semantics2 = t_semant_source_semantics(table);
                final SubLObject source_database2 = access_path_pretty_string(semant_access_path(source_semantics2));
                if (column_name.equalp(column_name2) && source_database.equalp(source_database2)) {
                    return column;
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                column = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        Errors.error((SubLObject)semantic_etl_bus.$str827$Can_t_find_column__a_in__a, column_semantics, output_spec);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 128267L)
    public static SubLObject output_spec_consolidate_semantic_recipe(final SubLObject output_spec, final SubLObject sql_start_index, final SubLObject sql_end_index) {
        assert semantic_etl_bus.NIL != database_output_spec_p(output_spec) : output_spec;
        final SubLObject recipe_step_index = Sequences.position_if((SubLObject)semantic_etl_bus.$sym828$EMPTY_SEMANTIC_RECIPE_STEP_P, db_output_spec_semantic_recipe(output_spec), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        SubLObject recipe_ingredients = (SubLObject)((semantic_etl_bus.NIL != recipe_step_index) ? conses_high.copy_list(conses_high.nthcdr(recipe_step_index, db_output_spec_semantic_recipe(output_spec))) : semantic_etl_bus.NIL);
        final SubLObject drops = (SubLObject)semantic_etl_bus.NIL;
        SubLObject adds = (SubLObject)semantic_etl_bus.NIL;
        SubLObject recipe_step = (SubLObject)semantic_etl_bus.NIL;
        if (semantic_etl_bus.NIL == recipe_ingredients) {
            return (SubLObject)semantic_etl_bus.NIL;
        }
        recipe_step = recipe_ingredients.first();
        recipe_ingredients = recipe_ingredients.rest();
        set_semantic_recipe_step_column_correspondence_list(recipe_step, update_column_correspondence_list_columns(semantic_recipe_step_column_correspondence_list(recipe_step)));
        set_semantic_recipe_step_sql_start_index(recipe_step, sql_start_index);
        set_semantic_recipe_step_sql_end_index(recipe_step, sql_end_index);
        SubLObject cdolist_list_var = recipe_ingredients;
        SubLObject add_or_drop = (SubLObject)semantic_etl_bus.NIL;
        add_or_drop = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            final SubLObject changed_obj = semantic_recipe_add_or_drop_item(add_or_drop);
            if (semantic_etl_bus.NIL != semantic_recipe_add_p(add_or_drop) && semantic_etl_bus.NIL != subl_promotions.memberP(semantic_object_comparison_name(changed_obj), drops, (SubLObject)semantic_etl_bus.EQ, (SubLObject)semantic_etl_bus.$sym829$FIRST)) {
                semantic_recipe_remove_from_drops(recipe_step, conses_high.second(conses_high.member(semantic_object_comparison_name(changed_obj), drops, (SubLObject)semantic_etl_bus.EQ, (SubLObject)semantic_etl_bus.$sym829$FIRST)));
            }
            else if (semantic_etl_bus.NIL != semantic_recipe_add_p(add_or_drop)) {
                adds = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(semantic_object_comparison_name(changed_obj), changed_obj), adds);
                semantic_recipe_append_to_adds(recipe_step, changed_obj);
            }
            else if (semantic_etl_bus.NIL != semantic_recipe_drop_p(add_or_drop) && semantic_etl_bus.NIL != subl_promotions.memberP(semantic_object_comparison_name(changed_obj), adds, (SubLObject)semantic_etl_bus.EQ, (SubLObject)semantic_etl_bus.$sym829$FIRST)) {
                semantic_recipe_remove_from_adds(recipe_step, conses_high.second(conses_high.member(semantic_object_comparison_name(changed_obj), adds, (SubLObject)semantic_etl_bus.EQ, (SubLObject)semantic_etl_bus.$sym829$FIRST)));
            }
            else if (semantic_etl_bus.NIL != semantic_recipe_drop_p(add_or_drop)) {
                adds = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(semantic_object_comparison_name(changed_obj), changed_obj), adds);
                semantic_recipe_append_to_drops(recipe_step, changed_obj);
            }
            else {
                Errors.warn((SubLObject)semantic_etl_bus.$str830$unable_to_interpret__S_as_part_of);
            }
            Sequences.delete(add_or_drop, db_output_spec_semantic_recipe(output_spec), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            add_or_drop = cdolist_list_var.first();
        }
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 130733L)
    public static SubLObject update_column_correspondence_list_columns(final SubLObject c_c_list) {
        SubLObject result_list = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = c_c_list;
        SubLObject column_correspondence = (SubLObject)semantic_etl_bus.NIL;
        column_correspondence = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = column_correspondence;
            SubLObject from_column = (SubLObject)semantic_etl_bus.NIL;
            SubLObject to_column = (SubLObject)semantic_etl_bus.NIL;
            SubLObject just = (SubLObject)semantic_etl_bus.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list831);
            from_column = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list831);
            to_column = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)semantic_etl_bus.$list831);
            just = current.first();
            current = current.rest();
            if (semantic_etl_bus.NIL == current) {
                if (to_column.isList() && to_column.first() == semantic_etl_bus.$kw832$COLUMN_NAMED) {
                    final SubLObject semantics = table_semantics_semantics(column_semantics_table_semantics(from_column));
                    result_list = (SubLObject)ConsesLow.cons(conses_high.subst(semantics_get_column_named(semantics, conses_high.second(to_column), conses_high.third(to_column)), to_column, column_correspondence, (SubLObject)semantic_etl_bus.EQUAL, (SubLObject)semantic_etl_bus.UNPROVIDED), result_list);
                }
                else {
                    result_list = (SubLObject)ConsesLow.cons(column_correspondence, result_list);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)semantic_etl_bus.$list831);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondence = cdolist_list_var.first();
        }
        return result_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 131566L)
    public static SubLObject uniquify_columns(final SubLObject table, final SubLObject columns) {
        SubLObject new_column_names = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject all_names = table_semantics_column_names(table);
        SubLObject cdolist_list_var = columns;
        SubLObject column = (SubLObject)semantic_etl_bus.NIL;
        column = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            new_column_names = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(string_utilities.uniquify_string_via_set(c_semant_column_name(column), all_names, (SubLObject)semantic_etl_bus.UNPROVIDED), c_semant_column_name(column)), new_column_names);
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_column_names);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 132030L)
    public static SubLObject new_assimilated_column(final SubLObject table, final SubLObject column) {
        assert semantic_etl_bus.NIL != table_semantics_p(table) : table;
        assert semantic_etl_bus.NIL != column_semantics_p(column) : column;
        final SubLObject new_column = make_column_semantics((SubLObject)semantic_etl_bus.UNPROVIDED);
        final SubLObject all_names = table_semantics_column_names(table);
        final SubLObject new_name = string_utilities.uniquify_string_via_set(c_semant_column_name(column), all_names, (SubLObject)semantic_etl_bus.UNPROVIDED);
        final SubLObject new_parses = conses_high.copy_tree(c_semant_column_parses(column));
        final SubLObject new_values = conses_high.copy_tree(c_semant_value_semantics_list(column));
        _csetf_c_semant_column_name(new_column, new_name);
        _csetf_c_semant_column_parses(new_column, new_parses);
        _csetf_c_semant_table_semantics(new_column, table);
        _csetf_c_semant_value_semantics_list(new_column, new_values);
        return new_column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 132831L)
    public static SubLObject table_semantics_column_names(final SubLObject table) {
        assert semantic_etl_bus.NIL != table_semantics_p(table) : table;
        final SubLObject names = set.new_set((SubLObject)semantic_etl_bus.EQUAL, (SubLObject)semantic_etl_bus.UNPROVIDED);
        SubLObject cdolist_list_var = table_semantics_column_semantics_list(table);
        SubLObject column = (SubLObject)semantic_etl_bus.NIL;
        column = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            set.set_add(c_semant_column_name(column), names);
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        }
        return names;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 133119L)
    public static SubLObject output_spec_synchronize(final SubLObject output_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject recipe = db_output_spec_recipe(output_spec);
        final SubLObject i = Sequences.position(semantic_etl_bus.$recipe_marker$.getDynamicValue(thread), recipe, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
        final SubLObject commands = conses_high.nthcdr(i, recipe).rest();
        SubLObject successP = (SubLObject)semantic_etl_bus.NIL;
        _csetf_semant_table_aliases(db_output_spec_semantics(output_spec), (SubLObject)semantic_etl_bus.NIL);
        SubLObject cdolist_list_var = commands;
        SubLObject sql = (SubLObject)semantic_etl_bus.NIL;
        sql = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            successP = output_spec_apply_sql(output_spec, sql);
            _csetf_semant_table_aliases(db_output_spec_semantics(output_spec), (SubLObject)semantic_etl_bus.NIL);
            if (semantic_etl_bus.NIL == successP) {
                Errors.warn((SubLObject)semantic_etl_bus.$str833$Didn_t_apply_command__a_to_output, sql);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sql = cdolist_list_var.first();
        }
        _csetf_db_output_spec_recipe(output_spec, ConsesLow.append(Sequences.delete(semantic_etl_bus.$recipe_marker$.getDynamicValue(thread), recipe, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED), (SubLObject)ConsesLow.list(semantic_etl_bus.$recipe_marker$.getDynamicValue(thread))));
        output_spec_consolidate_semantic_recipe(output_spec, i, Numbers.subtract(Numbers.add(i, Sequences.length(commands)), (SubLObject)semantic_etl_bus.ONE_INTEGER));
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 134176L)
    public static SubLObject output_spec_apply_sql(final SubLObject output_spec, final SubLObject sql) {
        assert semantic_etl_bus.NIL != database_output_spec_p(output_spec) : output_spec;
        if (semantic_etl_bus.NIL != sql_alter_table_p(sql)) {
            return output_spec_alter_table(output_spec, sql);
        }
        if (semantic_etl_bus.NIL != sql_update_p(sql)) {
            return output_spec_update(output_spec, sql);
        }
        if (semantic_etl_bus.NIL != sql_insert_into_p(sql)) {
            return output_spec_insert_into(output_spec, sql);
        }
        if (semantic_etl_bus.NIL != sql_drop_table_p(sql)) {
            return output_spec_drop_table(output_spec, sql);
        }
        if (semantic_etl_bus.NIL != sql_table_expression_p(sql)) {
            return output_spec_table_expression(output_spec, sql);
        }
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 134721L)
    public static SubLObject output_spec_alter_table(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject table_name = sql_alter_table_table(sql);
        final SubLObject table = semantics_get_table_named(semantics, table_name);
        final SubLObject action_clause = sql_alter_table_action(sql);
        if (semantic_etl_bus.NIL != sql_add_column_p(action_clause)) {
            add_column_to_table(table, action_clause);
        }
        else if (semantic_etl_bus.NIL != sql_drop_column_p(action_clause)) {
            drop_column_from_table(table, action_clause);
        }
        else if (semantic_etl_bus.NIL != sql_rename_column_p(action_clause)) {
            rename_column(table, action_clause);
        }
        else if (semantic_etl_bus.NIL != sql_add_constraint_p(action_clause)) {
            add_constraint_to_table(table, action_clause);
        }
        else if (semantic_etl_bus.NIL != sql_drop_constraint_p(action_clause)) {
            drop_constraint_from_table(table, action_clause);
        }
        else {
            Errors.warn((SubLObject)semantic_etl_bus.$str834$Apply__a_within__a_to_output_spec, action_clause, sql);
        }
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 135632L)
    public static SubLObject add_column_to_table(final SubLObject table, final SubLObject add_clause) {
        final SubLObject column_name = sql_add_column_column(add_clause);
        final SubLObject table_name = table_semantics_table_name(table);
        if (semantic_etl_bus.NIL != table_semantics_get_column_named(table, column_name)) {
            Errors.error((SubLObject)semantic_etl_bus.$str835$Can_t_add_new_column__a_to__a_sin, new SubLObject[] { column_name, table_name, column_name, table_name });
        }
        final SubLObject column_type = sql_add_column_type(add_clause);
        final SubLObject column_size = sql_add_column_size(add_clause);
        final SubLObject column = new_column_semantics(column_name, metadata_parser.semantic_etl_parse_column_name(column_name, (SubLObject)semantic_etl_bus.UNPROVIDED), column_type, column_size);
        _csetf_c_semant_table_semantics(column, table);
        _csetf_t_semant_column_semantics_list(table, ConsesLow.append(t_semant_column_semantics_list(table), (SubLObject)ConsesLow.list(column)));
        table_semantics_append_to_semantic_recipe(table, new_semantic_recipe_add(column));
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 136662L)
    public static SubLObject drop_column_from_table(final SubLObject table, final SubLObject drop_clause) {
        final SubLObject column_name = sql_drop_column_column(drop_clause);
        final SubLObject column = table_semantics_get_column_named(table, column_name);
        table_semantics_delete_column(table, column);
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 136914L)
    public static SubLObject rename_column(final SubLObject table, final SubLObject rename_clause) {
        final SubLObject old_column_name = sql_rename_column_old_column(rename_clause);
        final SubLObject old_column = table_semantics_get_column_named(table, old_column_name);
        final SubLObject new_column_name = sql_rename_column_new_column(rename_clause);
        set_column_semantics_name(old_column, new_column_name);
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 137254L)
    public static SubLObject add_constraint_to_table(final SubLObject table, final SubLObject add_clause) {
        final SubLObject semantics = table_semantics_semantics(table);
        final SubLObject table_constraint = sql_add_constraint_constraint(add_clause);
        final SubLObject constrained_column_name = sql_fk_table_constraint_column(table_constraint);
        final SubLObject constrained_column = table_semantics_get_column_named(table, constrained_column_name);
        final SubLObject column_constraint = sql_fk_table_constraint_constraint(table_constraint);
        final SubLObject constraint_name = sql_fk_column_constraint_name(column_constraint);
        final SubLObject constraining_table_name = sql_fk_column_constraint_table(column_constraint);
        final SubLObject constraining_table = semantics_get_table_named(semantics, constraining_table_name);
        final SubLObject constraining_column_name = sql_fk_column_constraint_column(column_constraint);
        final SubLObject constraining_column = table_semantics_get_column_named(constraining_table, constraining_column_name);
        final SubLObject foreign_key_constraint = new_foreign_key_constraint(constraint_name, constrained_column, constraining_column);
        table_semantics_add_column_constraint(table, foreign_key_constraint);
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 138322L)
    public static SubLObject drop_constraint_from_table(final SubLObject table, final SubLObject drop_clause) {
        final SubLObject table_constraint = sql_drop_constraint_constraint(drop_clause);
        final SubLObject column_constraint = sql_fk_table_constraint_constraint(table_constraint);
        final SubLObject constraint_name = sql_fk_column_constraint_name(column_constraint);
        SubLObject result = (SubLObject)semantic_etl_bus.NIL;
        if (semantic_etl_bus.NIL == result) {
            SubLObject csome_list_var = table_semantics_foreign_key_constraints(table);
            SubLObject constraint = (SubLObject)semantic_etl_bus.NIL;
            constraint = csome_list_var.first();
            while (semantic_etl_bus.NIL == result && semantic_etl_bus.NIL != csome_list_var) {
                if (fk_constraint_constraint_name(constraint).equal(constraint_name)) {
                    table_semantics_delete_column_constraint(table, constraint);
                    result = constraint;
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            }
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 138916L)
    public static SubLObject output_spec_update(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject target_table_name = sql_update_table(sql);
        final SubLObject target_table = semantics_get_table_named(semantics, target_table_name);
        SubLObject cdolist_list_var;
        final SubLObject settings = cdolist_list_var = sql_update_settings(sql);
        SubLObject setting = (SubLObject)semantic_etl_bus.NIL;
        setting = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            final SubLObject target_column_name = sql_column_equal_column1(setting);
            final SubLObject target_column = table_semantics_get_column_named(target_table, target_column_name);
            final SubLObject source_table_name = sql_column_equal_table2(setting);
            final SubLObject source_table = semantics_get_table_named(semantics, source_table_name);
            final SubLObject source_column_name = sql_column_equal_column2(setting);
            final SubLObject source_column = table_semantics_get_column_named(source_table, source_column_name);
            SubLObject cdolist_list_var_$9 = column_semantics_value_semantics_list(source_column);
            SubLObject value = (SubLObject)semantic_etl_bus.NIL;
            value = cdolist_list_var_$9.first();
            while (semantic_etl_bus.NIL != cdolist_list_var_$9) {
                _csetf_c_semant_value_semantics_list(target_column, (SubLObject)ConsesLow.cons(value, c_semant_value_semantics_list(target_column)));
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                value = cdolist_list_var_$9.first();
            }
            _csetf_c_semant_value_semantics_list(target_column, Sequences.remove_duplicates(c_semant_value_semantics_list(target_column), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            setting = cdolist_list_var.first();
        }
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 140005L)
    public static SubLObject output_spec_table_expression(final SubLObject output_spec, final SubLObject sql) {
        if (semantic_etl_bus.NIL != sql_select_from_p(sql)) {
            return output_spec_select_from(output_spec, sql);
        }
        if (semantic_etl_bus.NIL != sql_inner_join_p(sql)) {
            return output_spec_inner_join(output_spec, sql);
        }
        if (semantic_etl_bus.NIL != sql_except_p(sql)) {
            return output_spec_except(output_spec, sql);
        }
        if (semantic_etl_bus.NIL != sql_alias_p(sql)) {
            return output_spec_alias(output_spec, sql);
        }
        Errors.error((SubLObject)semantic_etl_bus.$str836$table_expression__a_unimplemented, sql);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 140591L)
    public static SubLObject output_spec_alias(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject table_expr = sql_alias_table(sql);
        final SubLObject rs = output_spec_table_expression(output_spec, table_expr);
        final SubLObject alias = sql_alias_alias(sql);
        final SubLObject columns = column_semantics_from_result_set(rs);
        final SubLObject aliased_table = new_table_semantics(alias, (SubLObject)semantic_etl_bus.NIL, columns, (SubLObject)semantic_etl_bus.NIL);
        _csetf_t_semant_semantics(aliased_table, semantics);
        _csetf_semant_table_aliases(semantics, (SubLObject)ConsesLow.cons(aliased_table, semant_table_aliases(semantics)));
        return rs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 141136L)
    public static SubLObject column_semantics_from_result_set(final SubLObject result_set) {
        SubLObject columns = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject backwardP_var = (SubLObject)semantic_etl_bus.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject index;
        SubLObject column_value_list;
        SubLObject column;
        for (length = Sequences.length(result_set), v_iteration = (SubLObject)semantic_etl_bus.NIL, v_iteration = (SubLObject)semantic_etl_bus.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)semantic_etl_bus.ONE_INTEGER)) {
            index = ((semantic_etl_bus.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)semantic_etl_bus.ONE_INTEGER) : v_iteration);
            column_value_list = Vectors.aref(result_set, index);
            column = new_column_semantics(string_utilities.str(index), (SubLObject)semantic_etl_bus.NIL, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED);
            _csetf_c_semant_value_semantics_list(column, column_value_list);
            columns = (SubLObject)ConsesLow.cons(column, columns);
        }
        return Sequences.nreverse(columns);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 141470L)
    public static SubLObject output_spec_except(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject sql2 = sql_except_table1(sql);
        final SubLObject rs1 = output_spec_table_expression(output_spec, sql2);
        return rs1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 141957L)
    public static SubLObject output_spec_inner_join(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject table_expr1 = sql_inner_join_table1(sql);
        final SubLObject table1 = output_spec_apply_sql(output_spec, table_expr1);
        return table1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 143716L)
    public static SubLObject output_spec_select_from(final SubLObject output_spec, final SubLObject sql) {
        assert semantic_etl_bus.NIL != database_output_spec_p(output_spec) : output_spec;
        assert semantic_etl_bus.NIL != sql_select_from_p(sql) : sql;
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject column_names = sql_select_from_columns(sql);
        final SubLObject column_count = Sequences.length(column_names);
        final SubLObject table_names = sql_select_from_tables(sql);
        final SubLObject rs = Vectors.make_vector(column_count, (SubLObject)semantic_etl_bus.UNPROVIDED);
        SubLObject columns = (SubLObject)semantic_etl_bus.NIL;
        SubLObject tables = (SubLObject)semantic_etl_bus.NIL;
        SubLObject cdolist_list_var = table_names;
        SubLObject name = (SubLObject)semantic_etl_bus.NIL;
        name = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            tables = (SubLObject)ConsesLow.cons(semantics_get_table_named(semantics, name), tables);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        cdolist_list_var = column_names;
        name = (SubLObject)semantic_etl_bus.NIL;
        name = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            SubLObject columns_named_identically = (SubLObject)semantic_etl_bus.NIL;
            SubLObject cdolist_list_var_$10 = tables;
            SubLObject table = (SubLObject)semantic_etl_bus.NIL;
            table = cdolist_list_var_$10.first();
            while (semantic_etl_bus.NIL != cdolist_list_var_$10) {
                final SubLObject column = table_semantics_get_column_named(table, name);
                if (semantic_etl_bus.NIL != column) {
                    columns_named_identically = (SubLObject)ConsesLow.cons(column, columns_named_identically);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                table = cdolist_list_var_$10.first();
            }
            if (semantic_etl_bus.NIL == list_utilities.singletonP(columns_named_identically)) {
                Errors.error((SubLObject)semantic_etl_bus.$str837$ambiguity_in_select_clause___a_id, name, columns_named_identically, sql);
            }
            columns = (SubLObject)ConsesLow.cons(columns_named_identically.first(), columns);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        columns = Sequences.nreverse(columns);
        SubLObject i = (SubLObject)semantic_etl_bus.ZERO_INTEGER;
        SubLObject cdolist_list_var2 = columns;
        SubLObject column2 = (SubLObject)semantic_etl_bus.NIL;
        column2 = cdolist_list_var2.first();
        while (semantic_etl_bus.NIL != cdolist_list_var2) {
            Vectors.set_aref(rs, i, c_semant_value_semantics_list(column2));
            i = Numbers.add(i, (SubLObject)semantic_etl_bus.ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            column2 = cdolist_list_var2.first();
        }
        return rs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 145165L)
    public static SubLObject output_spec_insert_into(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject target_table_name = sql_insert_into_table(sql);
        final SubLObject target_table = semantics_get_table_named(semantics, target_table_name);
        final SubLObject target_column_names = sql_insert_into_columns(sql);
        SubLObject target_columns = (SubLObject)semantic_etl_bus.NIL;
        final SubLObject table_expression = sql_insert_into_data(sql);
        final SubLObject source_columns = output_spec_table_expression(output_spec, table_expression);
        if (!Sequences.length(target_column_names).numE(Sequences.length(source_columns))) {
            Errors.error((SubLObject)semantic_etl_bus.$str838$source_result_set__a_and_target__, new SubLObject[] { source_columns, target_column_names, Sequences.length(source_columns), Sequences.length(target_column_names), sql });
        }
        SubLObject cdolist_list_var = target_column_names;
        SubLObject name = (SubLObject)semantic_etl_bus.NIL;
        name = cdolist_list_var.first();
        while (semantic_etl_bus.NIL != cdolist_list_var) {
            target_columns = (SubLObject)ConsesLow.cons(table_semantics_get_column_named(target_table, name), target_columns);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        target_columns = Sequences.nreverse(target_columns);
        SubLObject i = (SubLObject)semantic_etl_bus.ZERO_INTEGER;
        SubLObject cdolist_list_var2 = target_columns;
        SubLObject target_column = (SubLObject)semantic_etl_bus.NIL;
        target_column = cdolist_list_var2.first();
        while (semantic_etl_bus.NIL != cdolist_list_var2) {
            SubLObject cdolist_list_var_$11 = Vectors.aref(source_columns, i);
            SubLObject value = (SubLObject)semantic_etl_bus.NIL;
            value = cdolist_list_var_$11.first();
            while (semantic_etl_bus.NIL != cdolist_list_var_$11) {
                _csetf_c_semant_value_semantics_list(target_column, (SubLObject)ConsesLow.cons(value, c_semant_value_semantics_list(target_column)));
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                value = cdolist_list_var_$11.first();
            }
            _csetf_c_semant_value_semantics_list(target_column, Sequences.remove_duplicates(c_semant_value_semantics_list(target_column), (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
            i = Numbers.add(i, (SubLObject)semantic_etl_bus.ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            target_column = cdolist_list_var2.first();
        }
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/semantic-etl-bus.lisp", position = 146509L)
    public static SubLObject output_spec_drop_table(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject table_name = sql_drop_table_table(sql);
        final SubLObject table = semantics_get_table_named(semantics, table_name);
        semantics_delete_table(semantics, table);
        return output_spec;
    }
    
    public static SubLObject declare_semantic_etl_bus_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "do_table_semantics", "DO-TABLE-SEMANTICS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "do_table_semantics_column_constraints", "DO-TABLE-SEMANTICS-COLUMN-CONSTRAINTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "initialize_semantic_etl_infrastructure", "INITIALIZE-SEMANTIC-ETL-INFRASTRUCTURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "get_db_output_spec", "GET-DB-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "put_db_output_spec", "PUT-DB-OUTPUT-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "remove_db_output_spec", "REMOVE-DB-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "clear_db_output_specs", "CLEAR-DB-OUTPUT-SPECS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "database_fusion_loop", "DATABASE-FUSION-LOOP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "clear_semantic_etl_fuse_databases", "CLEAR-SEMANTIC-ETL-FUSE-DATABASES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "remove_semantic_etl_fuse_databases", "REMOVE-SEMANTIC-ETL-FUSE-DATABASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_etl_fuse_databases_internal", "SEMANTIC-ETL-FUSE-DATABASES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_etl_fuse_databases", "SEMANTIC-ETL-FUSE-DATABASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_etl_parse_metadata_and_data", "SEMANTIC-ETL-PARSE-METADATA-AND-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_etl_get_db_structure", "SEMANTIC-ETL-GET-DB-STRUCTURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "find_corresponding_item_in_semantics", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_object_comparison_name", "SEMANTIC-OBJECT-COMPARISON-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_print_function_trampoline", "SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_p", "SEMANTICS-P", 1, 0, false);
        new $semantics_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semant_access_path", "SEMANT-ACCESS-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semant_table_semantics_list", "SEMANT-TABLE-SEMANTICS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semant_table_aliases", "SEMANT-TABLE-ALIASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semant_dict", "SEMANT-DICT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semant_dropped_items", "SEMANT-DROPPED-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semant_output_spec", "SEMANT-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_semant_access_path", "_CSETF-SEMANT-ACCESS-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_semant_table_semantics_list", "_CSETF-SEMANT-TABLE-SEMANTICS-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_semant_table_aliases", "_CSETF-SEMANT-TABLE-ALIASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_semant_dict", "_CSETF-SEMANT-DICT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_semant_dropped_items", "_CSETF-SEMANT-DROPPED-ITEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_semant_output_spec", "_CSETF-SEMANT-OUTPUT-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_semantics", "MAKE-SEMANTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_semantics", "VISIT-DEFSTRUCT-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_semantics_method", "VISIT-DEFSTRUCT-OBJECT-SEMANTICS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_semantics", "PRINT-SEMANTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_access_path", "SEMANTICS-ACCESS-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_table_semantics_list", "SEMANTICS-TABLE-SEMANTICS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_get_table_named", "SEMANTICS-GET-TABLE-NAMED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_get_column_named", "SEMANTICS-GET-COLUMN-NAMED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_get_table_with_id", "SEMANTICS-GET-TABLE-WITH-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_semantics", "NEW-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "copy_semantics", "COPY-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_add_column_constraints", "SEMANTICS-ADD-COLUMN-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_delete_table", "SEMANTICS-DELETE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_delete_foreign_references_to_table", "SEMANTICS-DELETE-FOREIGN-REFERENCES-TO-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_dropped_tables", "SEMANTICS-DROPPED-TABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_dropped_columns", "SEMANTICS-DROPPED-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_dropped_primary_key_constraints", "SEMANTICS-DROPPED-PRIMARY-KEY-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_dropped_foreign_key_constraints", "SEMANTICS-DROPPED-FOREIGN-KEY-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_print_function_trampoline", "TABLE-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_p", "TABLE-SEMANTICS-P", 1, 0, false);
        new $table_semantics_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_table_id", "T-SEMANT-TABLE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_table_name", "T-SEMANT-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_source_semantics", "T-SEMANT-SOURCE-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_semantics", "T-SEMANT-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_points_to_table_ids", "T-SEMANT-POINTS-TO-TABLE-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_pointed_to_by_table_ids", "T-SEMANT-POINTED-TO-BY-TABLE-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_table_parses", "T-SEMANT-TABLE-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_column_semantics_list", "T-SEMANT-COLUMN-SEMANTICS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_primary_key_columns", "T-SEMANT-PRIMARY-KEY-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "t_semant_column_constraints", "T-SEMANT-COLUMN-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_table_id", "_CSETF-T-SEMANT-TABLE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_table_name", "_CSETF-T-SEMANT-TABLE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_source_semantics", "_CSETF-T-SEMANT-SOURCE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_semantics", "_CSETF-T-SEMANT-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_points_to_table_ids", "_CSETF-T-SEMANT-POINTS-TO-TABLE-IDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_pointed_to_by_table_ids", "_CSETF-T-SEMANT-POINTED-TO-BY-TABLE-IDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_table_parses", "_CSETF-T-SEMANT-TABLE-PARSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_column_semantics_list", "_CSETF-T-SEMANT-COLUMN-SEMANTICS-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_primary_key_columns", "_CSETF-T-SEMANT-PRIMARY-KEY-COLUMNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_t_semant_column_constraints", "_CSETF-T-SEMANT-COLUMN-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_table_semantics", "MAKE-TABLE-SEMANTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_table_semantics", "VISIT-DEFSTRUCT-TABLE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_table_semantics_method", "VISIT-DEFSTRUCT-OBJECT-TABLE-SEMANTICS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_table_semantics", "PRINT-TABLE-SEMANTICS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "do_column_semantics", "DO-COLUMN-SEMANTICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_table_semantics", "NEW-TABLE-SEMANTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "copy_table_semantics_list", "COPY-TABLE-SEMANTICS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "get_columns_named", "GET-COLUMNS-NAMED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_list_get_table_semantics_named", "TABLE-SEMANTICS-LIST-GET-TABLE-SEMANTICS-NAMED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_table_id", "TABLE-SEMANTICS-TABLE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_table_name", "TABLE-SEMANTICS-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_source_semantics", "TABLE-SEMANTICS-SOURCE-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_semantics", "TABLE-SEMANTICS-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_linked_table_ids", "TABLE-SEMANTICS-LINKED-TABLE-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_points_to_table_ids", "TABLE-SEMANTICS-POINTS-TO-TABLE-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_pointed_to_by_table_ids", "TABLE-SEMANTICS-POINTED-TO-BY-TABLE-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_pointed_to_by_tables", "TABLE-SEMANTICS-POINTED-TO-BY-TABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_primary_key_columns", "TABLE-SEMANTICS-PRIMARY-KEY-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_table_parses", "TABLE-SEMANTICS-TABLE-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_column_semantics_list", "TABLE-SEMANTICS-COLUMN-SEMANTICS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_column_constraints", "TABLE-SEMANTICS-COLUMN-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_table_semantics_semantics", "SET-TABLE-SEMANTICS-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_table_semantics_pointed_to_by_table_ids", "SET-TABLE-SEMANTICS-POINTED-TO-BY-TABLE-IDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_table_semantics_points_to_table_ids", "SET-TABLE-SEMANTICS-POINTS-TO-TABLE-IDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_table_semantics_primary_key_columns", "SET-TABLE-SEMANTICS-PRIMARY-KEY-COLUMNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_table_semantics_source_semantics", "SET-TABLE-SEMANTICS-SOURCE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_table_semantics_column_constraints", "SET-TABLE-SEMANTICS-COLUMN-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "find_corresponding_item_in_semantics_table_semantics_method", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS-TABLE-SEMANTICS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_object_comparison_name_table_semantics_method", "SEMANTIC-OBJECT-COMPARISON-NAME-TABLE-SEMANTICS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_append_to_semantic_recipe", "TABLE-SEMANTICS-APPEND-TO-SEMANTIC-RECIPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_output_spec", "TABLE-SEMANTICS-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_imported_key_columns", "TABLE-SEMANTICS-IMPORTED-KEY-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_foreign_key_constraints", "TABLE-SEMANTICS-FOREIGN-KEY-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_primary_key_constraints", "TABLE-SEMANTICS-PRIMARY-KEY-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_column_count", "TABLE-SEMANTICS-COLUMN-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_get_column_named", "TABLE-SEMANTICS-GET-COLUMN-NAMED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_content_columns", "TABLE-SEMANTICS-CONTENT-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "content_columnP", "CONTENT-COLUMN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "imported_key_columnP", "IMPORTED-KEY-COLUMN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "primary_key_columnP", "PRIMARY-KEY-COLUMN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_add_column_constraint", "TABLE-SEMANTICS-ADD-COLUMN-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_remove_column_constraint", "TABLE-SEMANTICS-REMOVE-COLUMN-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "update_table_semantics_column_constraints", "UPDATE-TABLE-SEMANTICS-COLUMN-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_delete_column", "TABLE-SEMANTICS-DELETE-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_delete_foreign_references_to_column", "TABLE-SEMANTICS-DELETE-FOREIGN-REFERENCES-TO-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_delete_column_constraint", "TABLE-SEMANTICS-DELETE-COLUMN-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "other_foreign_key_constraints_reference_table", "OTHER-FOREIGN-KEY-CONSTRAINTS-REFERENCE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_name_to_id_dict", "TABLE-NAME-TO-ID-DICT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_id_to_table_semantics_dict", "TABLE-ID-TO-TABLE-SEMANTICS-DICT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_constraint_p", "COLUMN-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "copy_column_constraint", "COPY-COLUMN-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_print_function_trampoline", "FOREIGN-KEY-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_p", "FOREIGN-KEY-CONSTRAINT-P", 1, 0, false);
        new $foreign_key_constraint_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "fk_constraint_constraint_name", "FK-CONSTRAINT-CONSTRAINT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "fk_constraint_constrained_column", "FK-CONSTRAINT-CONSTRAINED-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "fk_constraint_constraining_table", "FK-CONSTRAINT-CONSTRAINING-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "fk_constraint_constraining_column", "FK-CONSTRAINT-CONSTRAINING-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_fk_constraint_constraint_name", "_CSETF-FK-CONSTRAINT-CONSTRAINT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_fk_constraint_constrained_column", "_CSETF-FK-CONSTRAINT-CONSTRAINED-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_fk_constraint_constraining_table", "_CSETF-FK-CONSTRAINT-CONSTRAINING-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_fk_constraint_constraining_column", "_CSETF-FK-CONSTRAINT-CONSTRAINING-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_foreign_key_constraint", "MAKE-FOREIGN-KEY-CONSTRAINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_foreign_key_constraint", "VISIT-DEFSTRUCT-FOREIGN-KEY-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_foreign_key_constraint_method", "VISIT-DEFSTRUCT-OBJECT-FOREIGN-KEY-CONSTRAINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_foreign_key_constraint", "PRINT-FOREIGN-KEY-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_foreign_key_constraint", "NEW-FOREIGN-KEY-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "copy_foreign_key_constraint", "COPY-FOREIGN-KEY-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_constraint_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_constrained_column", "FOREIGN-KEY-CONSTRAINT-CONSTRAINED-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_constraining_column", "FOREIGN-KEY-CONSTRAINT-CONSTRAINING-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_constraining_table", "FOREIGN-KEY-CONSTRAINT-CONSTRAINING-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_foreign_key_constraint_constraint_name", "SET-FOREIGN-KEY-CONSTRAINT-CONSTRAINT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_foreign_key_constraint_constrained_column", "SET-FOREIGN-KEY-CONSTRAINT-CONSTRAINED-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_foreign_key_constraint_constraining_column", "SET-FOREIGN-KEY-CONSTRAINT-CONSTRAINING-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_foreign_key_constraint_constraining_table", "SET-FOREIGN-KEY-CONSTRAINT-CONSTRAINING-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "find_corresponding_item_in_semantics_foreign_key_constraint_method", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS-FOREIGN-KEY-CONSTRAINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_object_comparison_name_foreign_key_constraint_method", "SEMANTIC-OBJECT-COMPARISON-NAME-FOREIGN-KEY-CONSTRAINT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_constrained_table", "FOREIGN-KEY-CONSTRAINT-CONSTRAINED-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_references_tableP", "FOREIGN-KEY-CONSTRAINT-REFERENCES-TABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_references_columnP", "FOREIGN-KEY-CONSTRAINT-REFERENCES-COLUMN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraints_reference_columns_other_than_in_table", "FOREIGN-KEY-CONSTRAINTS-REFERENCE-COLUMNS-OTHER-THAN-IN-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_constrained_column_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINED-COLUMN-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_constrained_table_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINED-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_constraining_column_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINING-COLUMN-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "foreign_key_constraint_constraining_table_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINING-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "primary_key_constraint_print_function_trampoline", "PRIMARY-KEY-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "primary_key_constraint_p", "PRIMARY-KEY-CONSTRAINT-P", 1, 0, false);
        new $primary_key_constraint_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "pk_constraint_constraint_name", "PK-CONSTRAINT-CONSTRAINT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "pk_constraint_constraint_type", "PK-CONSTRAINT-CONSTRAINT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "pk_constraint_constrained_column", "PK-CONSTRAINT-CONSTRAINED-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_pk_constraint_constraint_name", "_CSETF-PK-CONSTRAINT-CONSTRAINT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_pk_constraint_constraint_type", "_CSETF-PK-CONSTRAINT-CONSTRAINT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_pk_constraint_constrained_column", "_CSETF-PK-CONSTRAINT-CONSTRAINED-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_primary_key_constraint", "MAKE-PRIMARY-KEY-CONSTRAINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_primary_key_constraint", "VISIT-DEFSTRUCT-PRIMARY-KEY-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_primary_key_constraint_method", "VISIT-DEFSTRUCT-OBJECT-PRIMARY-KEY-CONSTRAINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_primary_key_constraint", "PRINT-PRIMARY-KEY-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_primary_key_constraint", "NEW-PRIMARY-KEY-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "copy_primary_key_constraint", "COPY-PRIMARY-KEY-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "primary_key_constraint_constraint_name", "PRIMARY-KEY-CONSTRAINT-CONSTRAINT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "primary_key_constraint_constrained_column", "PRIMARY-KEY-CONSTRAINT-CONSTRAINED-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_primary_key_constraint_constraint_name", "SET-PRIMARY-KEY-CONSTRAINT-CONSTRAINT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_primary_key_constraint_constrained_column", "SET-PRIMARY-KEY-CONSTRAINT-CONSTRAINED-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "find_corresponding_item_in_semantics_primary_key_constraint_method", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS-PRIMARY-KEY-CONSTRAINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_object_comparison_name_primary_key_constraint_method", "SEMANTIC-OBJECT-COMPARISON-NAME-PRIMARY-KEY-CONSTRAINT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "primary_key_constraint_constrained_table", "PRIMARY-KEY-CONSTRAINT-CONSTRAINED-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "primary_key_constraint_constrained_table_name", "PRIMARY-KEY-CONSTRAINT-CONSTRAINED-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "primary_key_constraint_constrained_column_name", "PRIMARY-KEY-CONSTRAINT-CONSTRAINED-COLUMN-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_print_function_trampoline", "COLUMN-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_p", "COLUMN-SEMANTICS-P", 1, 0, false);
        new $column_semantics_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "c_semant_column_name", "C-SEMANT-COLUMN-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "c_semant_column_parses", "C-SEMANT-COLUMN-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "c_semant_table_semantics", "C-SEMANT-TABLE-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "c_semant_value_semantics_list", "C-SEMANT-VALUE-SEMANTICS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "c_semant_column_type", "C-SEMANT-COLUMN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "c_semant_column_size", "C-SEMANT-COLUMN-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_c_semant_column_name", "_CSETF-C-SEMANT-COLUMN-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_c_semant_column_parses", "_CSETF-C-SEMANT-COLUMN-PARSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_c_semant_table_semantics", "_CSETF-C-SEMANT-TABLE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_c_semant_value_semantics_list", "_CSETF-C-SEMANT-VALUE-SEMANTICS-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_c_semant_column_type", "_CSETF-C-SEMANT-COLUMN-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_c_semant_column_size", "_CSETF-C-SEMANT-COLUMN-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_column_semantics", "MAKE-COLUMN-SEMANTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_column_semantics", "VISIT-DEFSTRUCT-COLUMN-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_column_semantics_method", "VISIT-DEFSTRUCT-OBJECT-COLUMN-SEMANTICS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_column_semantics", "PRINT-COLUMN-SEMANTICS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "do_value_semantics", "DO-VALUE-SEMANTICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_column_semantics", "NEW-COLUMN-SEMANTICS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_column_semantics_list", "NEW-COLUMN-SEMANTICS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "copy_column_semantics", "COPY-COLUMN-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "copy_column_semantics_list", "COPY-COLUMN-SEMANTICS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_column_name", "COLUMN-SEMANTICS-COLUMN-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_column_parses", "COLUMN-SEMANTICS-COLUMN-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_column_type", "COLUMN-SEMANTICS-COLUMN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_expanded_column_type", "COLUMN-SEMANTICS-EXPANDED-COLUMN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_column_size", "COLUMN-SEMANTICS-COLUMN-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_table_semantics", "COLUMN-SEMANTICS-TABLE-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_value_semantics_list", "COLUMN-SEMANTICS-VALUE-SEMANTICS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_referencing_foreign_key_constraints", "COLUMN-SEMANTICS-REFERENCING-FOREIGN-KEY-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_foreign_key_constraint", "COLUMN-SEMANTICS-FOREIGN-KEY-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_column_semantics_column_type", "SET-COLUMN-SEMANTICS-COLUMN-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_column_semantics_column_size", "SET-COLUMN-SEMANTICS-COLUMN-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_column_semantics_table_semantics", "SET-COLUMN-SEMANTICS-TABLE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_column_semantics_value_semantics_list", "SET-COLUMN-SEMANTICS-VALUE-SEMANTICS-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_column_semantics_name", "SET-COLUMN-SEMANTICS-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "find_corresponding_item_in_semantics_column_semantics_method", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS-COLUMN-SEMANTICS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_object_comparison_name_column_semantics_method", "SEMANTIC-OBJECT-COMPARISON-NAME-COLUMN-SEMANTICS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_table_name", "COLUMN-SEMANTICS-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_foreign_key_constraint_constraining_column", "COLUMN-SEMANTICS-FOREIGN-KEY-CONSTRAINT-CONSTRAINING-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "value_semantics_print_function_trampoline", "VALUE-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "value_semantics_p", "VALUE-SEMANTICS-P", 1, 0, false);
        new $value_semantics_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "v_semant_value", "V-SEMANT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "v_semant_value_parses", "V-SEMANT-VALUE-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_v_semant_value", "_CSETF-V-SEMANT-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_v_semant_value_parses", "_CSETF-V-SEMANT-VALUE-PARSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_value_semantics", "MAKE-VALUE-SEMANTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_value_semantics", "VISIT-DEFSTRUCT-VALUE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_value_semantics_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-SEMANTICS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_value_semantics", "PRINT-VALUE-SEMANTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_value_semantics", "NEW-VALUE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "value_semantics_value", "VALUE-SEMANTICS-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "value_semantics_value_parses", "VALUE-SEMANTICS-VALUE-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_value_semantics_value", "SET-VALUE-SEMANTICS-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "database_output_spec_print_function_trampoline", "DATABASE-OUTPUT-SPEC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "database_output_spec_p", "DATABASE-OUTPUT-SPEC-P", 1, 0, false);
        new $database_output_spec_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "db_output_spec_id", "DB-OUTPUT-SPEC-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "db_output_spec_semantics1", "DB-OUTPUT-SPEC-SEMANTICS1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "db_output_spec_semantics2", "DB-OUTPUT-SPEC-SEMANTICS2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "db_output_spec_recipe", "DB-OUTPUT-SPEC-RECIPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "db_output_spec_semantics", "DB-OUTPUT-SPEC-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "db_output_spec_semantic_recipe", "DB-OUTPUT-SPEC-SEMANTIC-RECIPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_db_output_spec_id", "_CSETF-DB-OUTPUT-SPEC-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_db_output_spec_semantics1", "_CSETF-DB-OUTPUT-SPEC-SEMANTICS1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_db_output_spec_semantics2", "_CSETF-DB-OUTPUT-SPEC-SEMANTICS2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_db_output_spec_recipe", "_CSETF-DB-OUTPUT-SPEC-RECIPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_db_output_spec_semantics", "_CSETF-DB-OUTPUT-SPEC-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_db_output_spec_semantic_recipe", "_CSETF-DB-OUTPUT-SPEC-SEMANTIC-RECIPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_database_output_spec", "MAKE-DATABASE-OUTPUT-SPEC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_database_output_spec", "VISIT-DEFSTRUCT-DATABASE-OUTPUT-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_database_output_spec_method", "VISIT-DEFSTRUCT-OBJECT-DATABASE-OUTPUT-SPEC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_database_output_spec", "PRINT-DATABASE-OUTPUT-SPEC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_database_output_spec", "NEW-DATABASE-OUTPUT-SPEC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_trivial_recipe", "NEW-TRIVIAL-RECIPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_trivial_semantics", "NEW-TRIVIAL-SEMANTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "copy_database_output_spec", "COPY-DATABASE-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_append_to_recipe", "OUTPUT-SPEC-APPEND-TO-RECIPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_append_to_semantic_recipe", "OUTPUT-SPEC-APPEND-TO-SEMANTIC-RECIPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_get_table_named", "OUTPUT-SPEC-GET-TABLE-NAMED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantics_add_dropped", "SEMANTICS-ADD-DROPPED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "copy_semantic_recipe", "COPY-SEMANTIC-RECIPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_step_p", "SEMANTIC-RECIPE-STEP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "empty_semantic_recipe_step_p", "EMPTY-SEMANTIC-RECIPE-STEP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_output_spec", "SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_append_to_drops", "SEMANTIC-RECIPE-APPEND-TO-DROPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_append_to_adds", "SEMANTIC-RECIPE-APPEND-TO-ADDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_remove_from_drops", "SEMANTIC-RECIPE-REMOVE-FROM-DROPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_remove_from_adds", "SEMANTIC-RECIPE-REMOVE-FROM-ADDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_column_correspondence_list", "SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_step_column_correspondence_list", "SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_sql_start_index", "SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_sql_end_index", "SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_step_copy", "SEMANTIC-RECIPE-STEP-COPY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_print_function_trampoline", "TABLE-MERGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_p", "TABLE-MERGER-P", 1, 0, false);
        new $table_merger_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_id", "TABLE-MERGER-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_output_spec", "TABLE-MERGER-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_sources", "TABLE-MERGER-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_target", "TABLE-MERGER-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_column_correspondence_list", "TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_added", "TABLE-MERGER-ADDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_dropped", "TABLE-MERGER-DROPPED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_sql_start_index", "TABLE-MERGER-SQL-START-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_merger_sql_end_index", "TABLE-MERGER-SQL-END-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_table_merger_id", "_CSETF-TABLE-MERGER-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_table_merger_output_spec", "_CSETF-TABLE-MERGER-OUTPUT-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_table_merger_sources", "_CSETF-TABLE-MERGER-SOURCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_table_merger_target", "_CSETF-TABLE-MERGER-TARGET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_table_merger_column_correspondence_list", "_CSETF-TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_table_merger_added", "_CSETF-TABLE-MERGER-ADDED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_table_merger_dropped", "_CSETF-TABLE-MERGER-DROPPED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_table_merger_sql_start_index", "_CSETF-TABLE-MERGER-SQL-START-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_table_merger_sql_end_index", "_CSETF-TABLE-MERGER-SQL-END-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_table_merger", "MAKE-TABLE-MERGER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_table_merger", "VISIT-DEFSTRUCT-TABLE-MERGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_table_merger_method", "VISIT-DEFSTRUCT-OBJECT-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_table_merger", "PRINT-TABLE-MERGER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_table_merger", "NEW-TABLE-MERGER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_step_p_table_merger_method", "SEMANTIC-RECIPE-STEP-P-TABLE-MERGER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "empty_semantic_recipe_step_p_table_merger_method", "EMPTY-SEMANTIC-RECIPE-STEP-P-TABLE-MERGER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_append_to_drops_table_merger_method", "SEMANTIC-RECIPE-APPEND-TO-DROPS-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_append_to_adds_table_merger_method", "SEMANTIC-RECIPE-APPEND-TO-ADDS-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_remove_from_drops_table_merger_method", "SEMANTIC-RECIPE-REMOVE-FROM-DROPS-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_remove_from_adds_table_merger_method", "SEMANTIC-RECIPE-REMOVE-FROM-ADDS-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_column_correspondence_list_table_merger_method", "SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_step_column_correspondence_list_table_merger_method", "SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-TABLE-MERGER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_output_spec_table_merger_method", "SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_sql_start_index_table_merger_method", "SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_sql_end_index_table_merger_method", "SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_step_copy_table_merger_method", "SEMANTIC-RECIPE-STEP-COPY-TABLE-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_print_function_trampoline", "COLUMN-MERGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_p", "COLUMN-MERGER-P", 1, 0, false);
        new $column_merger_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_output_spec", "COLUMN-MERGER-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_sources", "COLUMN-MERGER-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_target", "COLUMN-MERGER-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_column_correspondence_list", "COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_added", "COLUMN-MERGER-ADDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_dropped", "COLUMN-MERGER-DROPPED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_sql_start_index", "COLUMN-MERGER-SQL-START-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_merger_sql_end_index", "COLUMN-MERGER-SQL-END-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_column_merger_output_spec", "_CSETF-COLUMN-MERGER-OUTPUT-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_column_merger_sources", "_CSETF-COLUMN-MERGER-SOURCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_column_merger_target", "_CSETF-COLUMN-MERGER-TARGET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_column_merger_column_correspondence_list", "_CSETF-COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_column_merger_added", "_CSETF-COLUMN-MERGER-ADDED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_column_merger_dropped", "_CSETF-COLUMN-MERGER-DROPPED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_column_merger_sql_start_index", "_CSETF-COLUMN-MERGER-SQL-START-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_column_merger_sql_end_index", "_CSETF-COLUMN-MERGER-SQL-END-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_column_merger", "MAKE-COLUMN-MERGER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_column_merger", "VISIT-DEFSTRUCT-COLUMN-MERGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_column_merger_method", "VISIT-DEFSTRUCT-OBJECT-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_column_merger", "PRINT-COLUMN-MERGER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_column_merger", "NEW-COLUMN-MERGER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_step_p_column_merger_method", "SEMANTIC-RECIPE-STEP-P-COLUMN-MERGER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "empty_semantic_recipe_step_p_column_merger_method", "EMPTY-SEMANTIC-RECIPE-STEP-P-COLUMN-MERGER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_append_to_drops_column_merger_method", "SEMANTIC-RECIPE-APPEND-TO-DROPS-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_append_to_adds_column_merger_method", "SEMANTIC-RECIPE-APPEND-TO-ADDS-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_remove_from_drops_column_merger_method", "SEMANTIC-RECIPE-REMOVE-FROM-DROPS-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_remove_from_adds_column_merger_method", "SEMANTIC-RECIPE-REMOVE-FROM-ADDS-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_column_correspondence_list_column_merger_method", "SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_step_column_correspondence_list_column_merger_method", "SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-COLUMN-MERGER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_output_spec_column_merger_method", "SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_sql_start_index_column_merger_method", "SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "set_semantic_recipe_step_sql_end_index_column_merger_method", "SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_step_copy_column_merger_method", "SEMANTIC-RECIPE-STEP-COPY-COLUMN-MERGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_add_or_drop_item", "SEMANTIC-RECIPE-ADD-OR-DROP-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_add_or_drop_p", "SEMANTIC-RECIPE-ADD-OR-DROP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_add_p", "SEMANTIC-RECIPE-ADD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_semantic_recipe_add", "NEW-SEMANTIC-RECIPE-ADD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "semantic_recipe_drop_p", "SEMANTIC-RECIPE-DROP-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_semantic_recipe_drop", "NEW-SEMANTIC-RECIPE-DROP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_conjunction_print_function_trampoline", "SQL-CONJUNCTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_conjunction_p", "SQL-CONJUNCTION-P", 1, 0, false);
        new $sql_conjunction_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_conjunction_conjuncts", "SQL-CONJUNCTION-CONJUNCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_conjunction_conjuncts", "_CSETF-SQL-CONJUNCTION-CONJUNCTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_conjunction", "MAKE-SQL-CONJUNCTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_conjunction", "VISIT-DEFSTRUCT-SQL-CONJUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_conjunction_method", "VISIT-DEFSTRUCT-OBJECT-SQL-CONJUNCTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_conjunction", "PRINT-SQL-CONJUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_conjunction", "NEW-SQL-CONJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_disjunction_print_function_trampoline", "SQL-DISJUNCTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_disjunction_p", "SQL-DISJUNCTION-P", 1, 0, false);
        new $sql_disjunction_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_disjunction_disjuncts", "SQL-DISJUNCTION-DISJUNCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_disjunction_disjuncts", "_CSETF-SQL-DISJUNCTION-DISJUNCTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_disjunction", "MAKE-SQL-DISJUNCTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_disjunction", "VISIT-DEFSTRUCT-SQL-DISJUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_disjunction_method", "VISIT-DEFSTRUCT-OBJECT-SQL-DISJUNCTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_disjunction", "PRINT-SQL-DISJUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_disjunction", "NEW-SQL-DISJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_copy_table_print_function_trampoline", "SQL-COPY-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_copy_table_p", "SQL-COPY-TABLE-P", 1, 0, false);
        new $sql_copy_table_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_copy_table_table", "SQL-COPY-TABLE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_copy_table_from", "SQL-COPY-TABLE-FROM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_copy_table_to", "SQL-COPY-TABLE-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_copy_table_table", "_CSETF-SQL-COPY-TABLE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_copy_table_from", "_CSETF-SQL-COPY-TABLE-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_copy_table_to", "_CSETF-SQL-COPY-TABLE-TO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_copy_table", "MAKE-SQL-COPY-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_copy_table", "VISIT-DEFSTRUCT-SQL-COPY-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_copy_table_method", "VISIT-DEFSTRUCT-OBJECT-SQL-COPY-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_copy_table", "PRINT-SQL-COPY-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_copy_table", "NEW-SQL-COPY-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_insert_into_print_function_trampoline", "SQL-INSERT-INTO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_insert_into_p", "SQL-INSERT-INTO-P", 1, 0, false);
        new $sql_insert_into_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_insert_into_table", "SQL-INSERT-INTO-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_insert_into_columns", "SQL-INSERT-INTO-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_insert_into_data", "SQL-INSERT-INTO-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_insert_into_table", "_CSETF-SQL-INSERT-INTO-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_insert_into_columns", "_CSETF-SQL-INSERT-INTO-COLUMNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_insert_into_data", "_CSETF-SQL-INSERT-INTO-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_insert_into", "MAKE-SQL-INSERT-INTO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_insert_into", "VISIT-DEFSTRUCT-SQL-INSERT-INTO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_insert_into_method", "VISIT-DEFSTRUCT-OBJECT-SQL-INSERT-INTO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_insert_into", "PRINT-SQL-INSERT-INTO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_insert_into", "NEW-SQL-INSERT-INTO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_select_from_print_function_trampoline", "SQL-SELECT-FROM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_select_from_p", "SQL-SELECT-FROM-P", 1, 0, false);
        new $sql_select_from_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_select_from_columns", "SQL-SELECT-FROM-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_select_from_tables", "SQL-SELECT-FROM-TABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_select_from_conditions", "SQL-SELECT-FROM-CONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_select_from_columns", "_CSETF-SQL-SELECT-FROM-COLUMNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_select_from_tables", "_CSETF-SQL-SELECT-FROM-TABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_select_from_conditions", "_CSETF-SQL-SELECT-FROM-CONDITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_select_from", "MAKE-SQL-SELECT-FROM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_select_from", "VISIT-DEFSTRUCT-SQL-SELECT-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_select_from_method", "VISIT-DEFSTRUCT-OBJECT-SQL-SELECT-FROM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_select_from", "PRINT-SQL-SELECT-FROM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_select_from", "NEW-SQL-SELECT-FROM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_list_string", "SQL-LIST-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_except_print_function_trampoline", "SQL-EXCEPT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_except_p", "SQL-EXCEPT-P", 1, 0, false);
        new $sql_except_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_except_table1", "SQL-EXCEPT-TABLE1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_except_table2", "SQL-EXCEPT-TABLE2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_except_table1", "_CSETF-SQL-EXCEPT-TABLE1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_except_table2", "_CSETF-SQL-EXCEPT-TABLE2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_except", "MAKE-SQL-EXCEPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_except", "VISIT-DEFSTRUCT-SQL-EXCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_except_method", "VISIT-DEFSTRUCT-OBJECT-SQL-EXCEPT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_except", "PRINT-SQL-EXCEPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_except", "NEW-SQL-EXCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_alias_print_function_trampoline", "SQL-ALIAS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_alias_p", "SQL-ALIAS-P", 1, 0, false);
        new $sql_alias_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_alias_table", "SQL-ALIAS-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_alias_alias", "SQL-ALIAS-ALIAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_alias_table", "_CSETF-SQL-ALIAS-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_alias_alias", "_CSETF-SQL-ALIAS-ALIAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_alias", "MAKE-SQL-ALIAS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_alias", "VISIT-DEFSTRUCT-SQL-ALIAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_alias_method", "VISIT-DEFSTRUCT-OBJECT-SQL-ALIAS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_alias", "PRINT-SQL-ALIAS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_alias", "NEW-SQL-ALIAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_column_equal_print_function_trampoline", "SQL-COLUMN-EQUAL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_column_equal_p", "SQL-COLUMN-EQUAL-P", 1, 0, false);
        new $sql_column_equal_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_column_equal_table1", "SQL-COLUMN-EQUAL-TABLE1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_column_equal_column1", "SQL-COLUMN-EQUAL-COLUMN1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_column_equal_table2", "SQL-COLUMN-EQUAL-TABLE2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_column_equal_column2", "SQL-COLUMN-EQUAL-COLUMN2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_column_equal_table1", "_CSETF-SQL-COLUMN-EQUAL-TABLE1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_column_equal_column1", "_CSETF-SQL-COLUMN-EQUAL-COLUMN1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_column_equal_table2", "_CSETF-SQL-COLUMN-EQUAL-TABLE2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_column_equal_column2", "_CSETF-SQL-COLUMN-EQUAL-COLUMN2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_column_equal", "MAKE-SQL-COLUMN-EQUAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_column_equal", "VISIT-DEFSTRUCT-SQL-COLUMN-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_column_equal_method", "VISIT-DEFSTRUCT-OBJECT-SQL-COLUMN-EQUAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_column_equal", "PRINT-SQL-COLUMN-EQUAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_column_equal", "NEW-SQL-COLUMN-EQUAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_is_null_print_function_trampoline", "SQL-IS-NULL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_is_null_p", "SQL-IS-NULL-P", 1, 0, false);
        new $sql_is_null_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_is_null_table", "SQL-IS-NULL-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_is_null_column", "SQL-IS-NULL-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_is_null_table", "_CSETF-SQL-IS-NULL-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_is_null_column", "_CSETF-SQL-IS-NULL-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_is_null", "MAKE-SQL-IS-NULL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_is_null", "VISIT-DEFSTRUCT-SQL-IS-NULL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_is_null_method", "VISIT-DEFSTRUCT-OBJECT-SQL-IS-NULL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_is_null", "PRINT-SQL-IS-NULL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_is_null", "NEW-SQL-IS-NULL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_not_in_print_function_trampoline", "SQL-NOT-IN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_not_in_p", "SQL-NOT-IN-P", 1, 0, false);
        new $sql_not_in_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_not_in_column_table", "SQL-NOT-IN-COLUMN-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_not_in_column", "SQL-NOT-IN-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_not_in_table", "SQL-NOT-IN-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_not_in_column_table", "_CSETF-SQL-NOT-IN-COLUMN-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_not_in_column", "_CSETF-SQL-NOT-IN-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_not_in_table", "_CSETF-SQL-NOT-IN-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_not_in", "MAKE-SQL-NOT-IN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_not_in", "VISIT-DEFSTRUCT-SQL-NOT-IN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_not_in_method", "VISIT-DEFSTRUCT-OBJECT-SQL-NOT-IN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_not_in", "PRINT-SQL-NOT-IN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_not_in", "NEW-SQL-NOT-IN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_inner_join_print_function_trampoline", "SQL-INNER-JOIN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_inner_join_p", "SQL-INNER-JOIN-P", 1, 0, false);
        new $sql_inner_join_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_inner_join_table1", "SQL-INNER-JOIN-TABLE1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_inner_join_table2", "SQL-INNER-JOIN-TABLE2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_inner_join_on", "SQL-INNER-JOIN-ON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_inner_join_table1", "_CSETF-SQL-INNER-JOIN-TABLE1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_inner_join_table2", "_CSETF-SQL-INNER-JOIN-TABLE2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_inner_join_on", "_CSETF-SQL-INNER-JOIN-ON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_inner_join", "MAKE-SQL-INNER-JOIN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_inner_join", "VISIT-DEFSTRUCT-SQL-INNER-JOIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_inner_join_method", "VISIT-DEFSTRUCT-OBJECT-SQL-INNER-JOIN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_inner_join", "PRINT-SQL-INNER-JOIN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_inner_join", "NEW-SQL-INNER-JOIN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_left_join_print_function_trampoline", "SQL-LEFT-JOIN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_left_join_p", "SQL-LEFT-JOIN-P", 1, 0, false);
        new $sql_left_join_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_left_join_left_table", "SQL-LEFT-JOIN-LEFT-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_left_join_right_table", "SQL-LEFT-JOIN-RIGHT-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_left_join_on", "SQL-LEFT-JOIN-ON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_left_join_left_table", "_CSETF-SQL-LEFT-JOIN-LEFT-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_left_join_right_table", "_CSETF-SQL-LEFT-JOIN-RIGHT-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_left_join_on", "_CSETF-SQL-LEFT-JOIN-ON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_left_join", "MAKE-SQL-LEFT-JOIN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_left_join", "VISIT-DEFSTRUCT-SQL-LEFT-JOIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_left_join_method", "VISIT-DEFSTRUCT-OBJECT-SQL-LEFT-JOIN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_left_join", "PRINT-SQL-LEFT-JOIN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_left_join", "NEW-SQL-LEFT-JOIN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_union_print_function_trampoline", "SQL-UNION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_union_p", "SQL-UNION-P", 1, 0, false);
        new $sql_union_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_union_select1", "SQL-UNION-SELECT1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_union_select2", "SQL-UNION-SELECT2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_union_select1", "_CSETF-SQL-UNION-SELECT1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_union_select2", "_CSETF-SQL-UNION-SELECT2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_union", "MAKE-SQL-UNION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_union", "VISIT-DEFSTRUCT-SQL-UNION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_union_method", "VISIT-DEFSTRUCT-OBJECT-SQL-UNION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_union", "PRINT-SQL-UNION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_union", "NEW-SQL-UNION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_alter_table_print_function_trampoline", "SQL-ALTER-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_alter_table_p", "SQL-ALTER-TABLE-P", 1, 0, false);
        new $sql_alter_table_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_alter_table_table", "SQL-ALTER-TABLE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_alter_table_action", "SQL-ALTER-TABLE-ACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_alter_table_table", "_CSETF-SQL-ALTER-TABLE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_alter_table_action", "_CSETF-SQL-ALTER-TABLE-ACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_alter_table", "MAKE-SQL-ALTER-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_alter_table", "VISIT-DEFSTRUCT-SQL-ALTER-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_alter_table_method", "VISIT-DEFSTRUCT-OBJECT-SQL-ALTER-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_alter_table", "PRINT-SQL-ALTER-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_alter_table", "NEW-SQL-ALTER-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_add_column_print_function_trampoline", "SQL-ADD-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_add_column_p", "SQL-ADD-COLUMN-P", 1, 0, false);
        new $sql_add_column_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_add_column_column", "SQL-ADD-COLUMN-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_add_column_type", "SQL-ADD-COLUMN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_add_column_size", "SQL-ADD-COLUMN-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_add_column_constraints", "SQL-ADD-COLUMN-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_add_column_column", "_CSETF-SQL-ADD-COLUMN-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_add_column_type", "_CSETF-SQL-ADD-COLUMN-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_add_column_size", "_CSETF-SQL-ADD-COLUMN-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_add_column_constraints", "_CSETF-SQL-ADD-COLUMN-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_add_column", "MAKE-SQL-ADD-COLUMN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_add_column", "VISIT-DEFSTRUCT-SQL-ADD-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_add_column_method", "VISIT-DEFSTRUCT-OBJECT-SQL-ADD-COLUMN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_add_column", "PRINT-SQL-ADD-COLUMN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_add_column", "NEW-SQL-ADD-COLUMN", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_add_column_to_table", "NEW-SQL-ADD-COLUMN-TO-TABLE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_drop_column_print_function_trampoline", "SQL-DROP-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_drop_column_p", "SQL-DROP-COLUMN-P", 1, 0, false);
        new $sql_drop_column_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_drop_column_column", "SQL-DROP-COLUMN-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_drop_column_column", "_CSETF-SQL-DROP-COLUMN-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_drop_column", "MAKE-SQL-DROP-COLUMN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_drop_column", "VISIT-DEFSTRUCT-SQL-DROP-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_drop_column_method", "VISIT-DEFSTRUCT-OBJECT-SQL-DROP-COLUMN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_drop_column", "PRINT-SQL-DROP-COLUMN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_drop_column", "NEW-SQL-DROP-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_rename_column_print_function_trampoline", "SQL-RENAME-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_rename_column_p", "SQL-RENAME-COLUMN-P", 1, 0, false);
        new $sql_rename_column_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_rename_column_old_column", "SQL-RENAME-COLUMN-OLD-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_rename_column_new_column", "SQL-RENAME-COLUMN-NEW-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_rename_column_old_column", "_CSETF-SQL-RENAME-COLUMN-OLD-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_rename_column_new_column", "_CSETF-SQL-RENAME-COLUMN-NEW-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_rename_column", "MAKE-SQL-RENAME-COLUMN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_rename_column", "VISIT-DEFSTRUCT-SQL-RENAME-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_rename_column_method", "VISIT-DEFSTRUCT-OBJECT-SQL-RENAME-COLUMN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_rename_column", "PRINT-SQL-RENAME-COLUMN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_rename_column", "NEW-SQL-RENAME-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_add_constraint_print_function_trampoline", "SQL-ADD-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_add_constraint_p", "SQL-ADD-CONSTRAINT-P", 1, 0, false);
        new $sql_add_constraint_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_add_constraint_constraint", "SQL-ADD-CONSTRAINT-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_add_constraint_constraint", "_CSETF-SQL-ADD-CONSTRAINT-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_add_constraint", "MAKE-SQL-ADD-CONSTRAINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_add_constraint", "VISIT-DEFSTRUCT-SQL-ADD-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_add_constraint_method", "VISIT-DEFSTRUCT-OBJECT-SQL-ADD-CONSTRAINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_add_constraint", "PRINT-SQL-ADD-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_add_constraint", "NEW-SQL-ADD-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_drop_constraint_print_function_trampoline", "SQL-DROP-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_drop_constraint_p", "SQL-DROP-CONSTRAINT-P", 1, 0, false);
        new $sql_drop_constraint_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_drop_constraint_constraint", "SQL-DROP-CONSTRAINT-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_drop_constraint_constraint", "_CSETF-SQL-DROP-CONSTRAINT-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_drop_constraint", "MAKE-SQL-DROP-CONSTRAINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_drop_constraint", "VISIT-DEFSTRUCT-SQL-DROP-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_drop_constraint_method", "VISIT-DEFSTRUCT-OBJECT-SQL-DROP-CONSTRAINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_drop_constraint", "PRINT-SQL-DROP-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_drop_constraint", "NEW-SQL-DROP-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_fk_column_constraint_print_function_trampoline", "SQL-FK-COLUMN-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_fk_column_constraint_p", "SQL-FK-COLUMN-CONSTRAINT-P", 1, 0, false);
        new $sql_fk_column_constraint_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_fk_column_constraint_name", "SQL-FK-COLUMN-CONSTRAINT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_fk_column_constraint_table", "SQL-FK-COLUMN-CONSTRAINT-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_fk_column_constraint_column", "SQL-FK-COLUMN-CONSTRAINT-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_fk_column_constraint_name", "_CSETF-SQL-FK-COLUMN-CONSTRAINT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_fk_column_constraint_table", "_CSETF-SQL-FK-COLUMN-CONSTRAINT-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_fk_column_constraint_column", "_CSETF-SQL-FK-COLUMN-CONSTRAINT-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_fk_column_constraint", "MAKE-SQL-FK-COLUMN-CONSTRAINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_fk_column_constraint", "VISIT-DEFSTRUCT-SQL-FK-COLUMN-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_fk_column_constraint_method", "VISIT-DEFSTRUCT-OBJECT-SQL-FK-COLUMN-CONSTRAINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_fk_column_constraint", "PRINT-SQL-FK-COLUMN-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_fk_column_constraint", "NEW-SQL-FK-COLUMN-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_fk_table_constraint_print_function_trampoline", "SQL-FK-TABLE-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_fk_table_constraint_p", "SQL-FK-TABLE-CONSTRAINT-P", 1, 0, false);
        new $sql_fk_table_constraint_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_fk_table_constraint_column", "SQL-FK-TABLE-CONSTRAINT-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_fk_table_constraint_constraint", "SQL-FK-TABLE-CONSTRAINT-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_fk_table_constraint_column", "_CSETF-SQL-FK-TABLE-CONSTRAINT-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_fk_table_constraint_constraint", "_CSETF-SQL-FK-TABLE-CONSTRAINT-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_fk_table_constraint", "MAKE-SQL-FK-TABLE-CONSTRAINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_fk_table_constraint", "VISIT-DEFSTRUCT-SQL-FK-TABLE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_fk_table_constraint_method", "VISIT-DEFSTRUCT-OBJECT-SQL-FK-TABLE-CONSTRAINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_fk_table_constraint", "PRINT-SQL-FK-TABLE-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_fk_table_constraint", "NEW-SQL-FK-TABLE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_update_print_function_trampoline", "SQL-UPDATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_update_p", "SQL-UPDATE-P", 1, 0, false);
        new $sql_update_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_update_table", "SQL-UPDATE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_update_settings", "SQL-UPDATE-SETTINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_update_conditions", "SQL-UPDATE-CONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_update_table", "_CSETF-SQL-UPDATE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_update_settings", "_CSETF-SQL-UPDATE-SETTINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_update_conditions", "_CSETF-SQL-UPDATE-CONDITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_update", "MAKE-SQL-UPDATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_update", "VISIT-DEFSTRUCT-SQL-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_update_method", "VISIT-DEFSTRUCT-OBJECT-SQL-UPDATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_update", "PRINT-SQL-UPDATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_update", "NEW-SQL-UPDATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_drop_table_print_function_trampoline", "SQL-DROP-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_drop_table_p", "SQL-DROP-TABLE-P", 1, 0, false);
        new $sql_drop_table_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_drop_table_table", "SQL-DROP-TABLE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "_csetf_sql_drop_table_table", "_CSETF-SQL-DROP-TABLE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "make_sql_drop_table", "MAKE-SQL-DROP-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_sql_drop_table", "VISIT-DEFSTRUCT-SQL-DROP-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "visit_defstruct_object_sql_drop_table_method", "VISIT-DEFSTRUCT-OBJECT-SQL-DROP-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "print_sql_drop_table", "PRINT-SQL-DROP-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_sql_drop_table", "NEW-SQL-DROP-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_command_p", "SQL-COMMAND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_table_expression_p", "SQL-TABLE-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_condition_p", "SQL-CONDITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_alteration_p", "SQL-ALTERATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_table_constraint_p", "SQL-TABLE-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_column_constraint_p", "SQL-COLUMN-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sql_column_constraint_name", "SQL-COLUMN-CONSTRAINT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_foreign_key_constraint_name", "NEW-FOREIGN-KEY-CONSTRAINT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "initialize_access_path_map", "INITIALIZE-ACCESS-PATH-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "available_databases", "AVAILABLE-DATABASES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "get_access_path", "GET-ACCESS-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "bln1_access_path", "BLN1-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "bln2_access_path", "BLN2-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "usgs_access_path", "USGS-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "nga_access_path", "NGA-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "gndb_access_path", "GNDB-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "sporting_goods_access_path", "SPORTING-GOODS-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "northwind_access_path", "NORTHWIND-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "bathymetric_data_access_path", "BATHYMETRIC-DATA-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "bathymetric_header_access_path", "BATHYMETRIC-HEADER-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "stub_target_access_path", "STUB-TARGET-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "access_path_pretty_string", "ACCESS-PATH-PRETTY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_copy_column_data", "OUTPUT-SPEC-COPY-COLUMN-DATA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_has_valueP", "COLUMN-SEMANTICS-HAS-VALUE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_add_value", "COLUMN-SEMANTICS-ADD-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_get_column", "TABLE-SEMANTICS-GET-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_append_column", "TABLE-SEMANTICS-APPEND-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_get_tables", "OUTPUT-SPEC-GET-TABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_get_access_paths", "OUTPUT-SPEC-GET-ACCESS-PATHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_get_native_column_semantics", "OUTPUT-SPEC-GET-NATIVE-COLUMN-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_consolidate_semantic_recipe", "OUTPUT-SPEC-CONSOLIDATE-SEMANTIC-RECIPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "update_column_correspondence_list_columns", "UPDATE-COLUMN-CORRESPONDENCE-LIST-COLUMNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "uniquify_columns", "UNIQUIFY-COLUMNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "new_assimilated_column", "NEW-ASSIMILATED-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "table_semantics_column_names", "TABLE-SEMANTICS-COLUMN-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_synchronize", "OUTPUT-SPEC-SYNCHRONIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_apply_sql", "OUTPUT-SPEC-APPLY-SQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_alter_table", "OUTPUT-SPEC-ALTER-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "add_column_to_table", "ADD-COLUMN-TO-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "drop_column_from_table", "DROP-COLUMN-FROM-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "rename_column", "RENAME-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "add_constraint_to_table", "ADD-CONSTRAINT-TO-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "drop_constraint_from_table", "DROP-CONSTRAINT-FROM-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_update", "OUTPUT-SPEC-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_table_expression", "OUTPUT-SPEC-TABLE-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_alias", "OUTPUT-SPEC-ALIAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "column_semantics_from_result_set", "COLUMN-SEMANTICS-FROM-RESULT-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_except", "OUTPUT-SPEC-EXCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_inner_join", "OUTPUT-SPEC-INNER-JOIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_select_from", "OUTPUT-SPEC-SELECT-FROM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_insert_into", "OUTPUT-SPEC-INSERT-INTO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.semantic_etl_bus", "output_spec_drop_table", "OUTPUT-SPEC-DROP-TABLE", 2, 0, false);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    public static SubLObject init_semantic_etl_bus_file() {
        semantic_etl_bus.$semantic_etl_debugP$ = SubLFiles.defvar("*SEMANTIC-ETL-DEBUG?*", (SubLObject)semantic_etl_bus.NIL);
        semantic_etl_bus.$database_output_specs$ = SubLFiles.deflexical("*DATABASE-OUTPUT-SPECS*", (semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym6$_DATABASE_OUTPUT_SPECS_)) ? semantic_etl_bus.$database_output_specs$.getGlobalValue() : dictionary.new_dictionary((SubLObject)semantic_etl_bus.EQL, (SubLObject)semantic_etl_bus.UNPROVIDED));
        semantic_etl_bus.$database_output_specs_lock$ = SubLFiles.deflexical("*DATABASE-OUTPUT-SPECS-LOCK*", (semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym7$_DATABASE_OUTPUT_SPECS_LOCK_)) ? semantic_etl_bus.$database_output_specs_lock$.getGlobalValue() : Locks.make_lock((SubLObject)semantic_etl_bus.$str8$Database_Output_Specs));
        semantic_etl_bus.$semantic_etl_fuse_databases_caching_state$ = SubLFiles.deflexical("*SEMANTIC-ETL-FUSE-DATABASES-CACHING-STATE*", (SubLObject)semantic_etl_bus.NIL);
        semantic_etl_bus.$find_corresponding_item_in_semantics_method_table$ = SubLFiles.deflexical("*FIND-CORRESPONDING-ITEM-IN-SEMANTICS-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$semantic_object_comparison_name_method_table$ = SubLFiles.deflexical("*SEMANTIC-OBJECT-COMPARISON-NAME-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$dtp_semantics$ = SubLFiles.defconstant("*DTP-SEMANTICS*", (SubLObject)semantic_etl_bus.$sym20$SEMANTICS);
        semantic_etl_bus.$dtp_table_semantics$ = SubLFiles.defconstant("*DTP-TABLE-SEMANTICS*", (SubLObject)semantic_etl_bus.$sym62$TABLE_SEMANTICS);
        semantic_etl_bus.$semantic_etl_table_isg$ = SubLFiles.deflexical("*SEMANTIC-ETL-TABLE-ISG*", (semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym103$_SEMANTIC_ETL_TABLE_ISG_)) ? semantic_etl_bus.$semantic_etl_table_isg$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator((SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
        semantic_etl_bus.$dtp_foreign_key_constraint$ = SubLFiles.defconstant("*DTP-FOREIGN-KEY-CONSTRAINT*", (SubLObject)semantic_etl_bus.$sym119$FOREIGN_KEY_CONSTRAINT);
        semantic_etl_bus.$dtp_primary_key_constraint$ = SubLFiles.defconstant("*DTP-PRIMARY-KEY-CONSTRAINT*", (SubLObject)semantic_etl_bus.$sym146$PRIMARY_KEY_CONSTRAINT);
        semantic_etl_bus.$dtp_column_semantics$ = SubLFiles.defconstant("*DTP-COLUMN-SEMANTICS*", (SubLObject)semantic_etl_bus.$sym167$COLUMN_SEMANTICS);
        semantic_etl_bus.$dtp_value_semantics$ = SubLFiles.defconstant("*DTP-VALUE-SEMANTICS*", (SubLObject)semantic_etl_bus.$sym206$VALUE_SEMANTICS);
        semantic_etl_bus.$db_output_spec_isg$ = SubLFiles.deflexical("*DB-OUTPUT-SPEC-ISG*", (semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym224$_DB_OUTPUT_SPEC_ISG_)) ? semantic_etl_bus.$db_output_spec_isg$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator((SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED, (SubLObject)semantic_etl_bus.UNPROVIDED));
        semantic_etl_bus.$dtp_database_output_spec$ = SubLFiles.defconstant("*DTP-DATABASE-OUTPUT-SPEC*", (SubLObject)semantic_etl_bus.$sym225$DATABASE_OUTPUT_SPEC);
        semantic_etl_bus.$recipe_marker$ = SubLFiles.defparameter("*RECIPE-MARKER*", (SubLObject)semantic_etl_bus.$str257$____________________________);
        semantic_etl_bus.$semantic_recipe_step_p_method_table$ = SubLFiles.deflexical("*SEMANTIC-RECIPE-STEP-P-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$empty_semantic_recipe_step_p_method_table$ = SubLFiles.deflexical("*EMPTY-SEMANTIC-RECIPE-STEP-P-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$set_semantic_recipe_step_output_spec_method_table$ = SubLFiles.deflexical("*SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$semantic_recipe_append_to_drops_method_table$ = SubLFiles.deflexical("*SEMANTIC-RECIPE-APPEND-TO-DROPS-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$semantic_recipe_append_to_adds_method_table$ = SubLFiles.deflexical("*SEMANTIC-RECIPE-APPEND-TO-ADDS-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$semantic_recipe_remove_from_drops_method_table$ = SubLFiles.deflexical("*SEMANTIC-RECIPE-REMOVE-FROM-DROPS-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$semantic_recipe_remove_from_adds_method_table$ = SubLFiles.deflexical("*SEMANTIC-RECIPE-REMOVE-FROM-ADDS-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$set_semantic_recipe_step_column_correspondence_list_method_table$ = SubLFiles.deflexical("*SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$semantic_recipe_step_column_correspondence_list_method_table$ = SubLFiles.deflexical("*SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$set_semantic_recipe_step_sql_start_index_method_table$ = SubLFiles.deflexical("*SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$set_semantic_recipe_step_sql_end_index_method_table$ = SubLFiles.deflexical("*SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$semantic_recipe_step_copy_method_table$ = SubLFiles.deflexical("*SEMANTIC-RECIPE-STEP-COPY-METHOD-TABLE*", Vectors.make_vector((SubLObject)semantic_etl_bus.$int17$256, (SubLObject)semantic_etl_bus.NIL));
        semantic_etl_bus.$dtp_table_merger$ = SubLFiles.defconstant("*DTP-TABLE-MERGER*", (SubLObject)semantic_etl_bus.$sym266$TABLE_MERGER);
        semantic_etl_bus.$dtp_column_merger$ = SubLFiles.defconstant("*DTP-COLUMN-MERGER*", (SubLObject)semantic_etl_bus.$sym322$COLUMN_MERGER);
        semantic_etl_bus.$dtp_sql_conjunction$ = SubLFiles.defconstant("*DTP-SQL-CONJUNCTION*", (SubLObject)semantic_etl_bus.$sym369$SQL_CONJUNCTION);
        semantic_etl_bus.$dtp_sql_disjunction$ = SubLFiles.defconstant("*DTP-SQL-DISJUNCTION*", (SubLObject)semantic_etl_bus.$sym385$SQL_DISJUNCTION);
        semantic_etl_bus.$dtp_sql_copy_table$ = SubLFiles.defconstant("*DTP-SQL-COPY-TABLE*", (SubLObject)semantic_etl_bus.$sym400$SQL_COPY_TABLE);
        semantic_etl_bus.$dtp_sql_insert_into$ = SubLFiles.defconstant("*DTP-SQL-INSERT-INTO*", (SubLObject)semantic_etl_bus.$sym421$SQL_INSERT_INTO);
        semantic_etl_bus.$dtp_sql_select_from$ = SubLFiles.defconstant("*DTP-SQL-SELECT-FROM*", (SubLObject)semantic_etl_bus.$sym443$SQL_SELECT_FROM);
        semantic_etl_bus.$dtp_sql_except$ = SubLFiles.defconstant("*DTP-SQL-EXCEPT*", (SubLObject)semantic_etl_bus.$sym465$SQL_EXCEPT);
        semantic_etl_bus.$dtp_sql_alias$ = SubLFiles.defconstant("*DTP-SQL-ALIAS*", (SubLObject)semantic_etl_bus.$sym483$SQL_ALIAS);
        semantic_etl_bus.$dtp_sql_column_equal$ = SubLFiles.defconstant("*DTP-SQL-COLUMN-EQUAL*", (SubLObject)semantic_etl_bus.$sym500$SQL_COLUMN_EQUAL);
        semantic_etl_bus.$dtp_sql_is_null$ = SubLFiles.defconstant("*DTP-SQL-IS-NULL*", (SubLObject)semantic_etl_bus.$sym522$SQL_IS_NULL);
        semantic_etl_bus.$dtp_sql_not_in$ = SubLFiles.defconstant("*DTP-SQL-NOT-IN*", (SubLObject)semantic_etl_bus.$sym539$SQL_NOT_IN);
        semantic_etl_bus.$dtp_sql_inner_join$ = SubLFiles.defconstant("*DTP-SQL-INNER-JOIN*", (SubLObject)semantic_etl_bus.$sym558$SQL_INNER_JOIN);
        semantic_etl_bus.$dtp_sql_left_join$ = SubLFiles.defconstant("*DTP-SQL-LEFT-JOIN*", (SubLObject)semantic_etl_bus.$sym577$SQL_LEFT_JOIN);
        semantic_etl_bus.$dtp_sql_union$ = SubLFiles.defconstant("*DTP-SQL-UNION*", (SubLObject)semantic_etl_bus.$sym597$SQL_UNION);
        semantic_etl_bus.$dtp_sql_alter_table$ = SubLFiles.defconstant("*DTP-SQL-ALTER-TABLE*", (SubLObject)semantic_etl_bus.$sym615$SQL_ALTER_TABLE);
        semantic_etl_bus.$dtp_sql_add_column$ = SubLFiles.defconstant("*DTP-SQL-ADD-COLUMN*", (SubLObject)semantic_etl_bus.$sym633$SQL_ADD_COLUMN);
        semantic_etl_bus.$dtp_sql_drop_column$ = SubLFiles.defconstant("*DTP-SQL-DROP-COLUMN*", (SubLObject)semantic_etl_bus.$sym659$SQL_DROP_COLUMN);
        semantic_etl_bus.$dtp_sql_rename_column$ = SubLFiles.defconstant("*DTP-SQL-RENAME-COLUMN*", (SubLObject)semantic_etl_bus.$sym673$SQL_RENAME_COLUMN);
        semantic_etl_bus.$dtp_sql_add_constraint$ = SubLFiles.defconstant("*DTP-SQL-ADD-CONSTRAINT*", (SubLObject)semantic_etl_bus.$sym691$SQL_ADD_CONSTRAINT);
        semantic_etl_bus.$dtp_sql_drop_constraint$ = SubLFiles.defconstant("*DTP-SQL-DROP-CONSTRAINT*", (SubLObject)semantic_etl_bus.$sym707$SQL_DROP_CONSTRAINT);
        semantic_etl_bus.$dtp_sql_fk_column_constraint$ = SubLFiles.defconstant("*DTP-SQL-FK-COLUMN-CONSTRAINT*", (SubLObject)semantic_etl_bus.$sym719$SQL_FK_COLUMN_CONSTRAINT);
        semantic_etl_bus.$dtp_sql_fk_table_constraint$ = SubLFiles.defconstant("*DTP-SQL-FK-TABLE-CONSTRAINT*", (SubLObject)semantic_etl_bus.$sym738$SQL_FK_TABLE_CONSTRAINT);
        semantic_etl_bus.$dtp_sql_update$ = SubLFiles.defconstant("*DTP-SQL-UPDATE*", (SubLObject)semantic_etl_bus.$sym754$SQL_UPDATE);
        semantic_etl_bus.$dtp_sql_drop_table$ = SubLFiles.defconstant("*DTP-SQL-DROP-TABLE*", (SubLObject)semantic_etl_bus.$sym774$SQL_DROP_TABLE);
        semantic_etl_bus.$access_path_map$ = SubLFiles.deflexical("*ACCESS-PATH-MAP*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym791$_ACCESS_PATH_MAP_)) ? semantic_etl_bus.$access_path_map$.getGlobalValue() : semantic_etl_bus.NIL));
        semantic_etl_bus.$bln1_access_path$ = SubLFiles.deflexical("*BLN1-ACCESS-PATH*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym795$_BLN1_ACCESS_PATH_)) ? semantic_etl_bus.$bln1_access_path$.getGlobalValue() : semantic_etl_bus.NIL));
        semantic_etl_bus.$bln2_access_path$ = SubLFiles.deflexical("*BLN2-ACCESS-PATH*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym796$_BLN2_ACCESS_PATH_)) ? semantic_etl_bus.$bln2_access_path$.getGlobalValue() : semantic_etl_bus.NIL));
        semantic_etl_bus.$usgs_access_path$ = SubLFiles.deflexical("*USGS-ACCESS-PATH*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym797$_USGS_ACCESS_PATH_)) ? semantic_etl_bus.$usgs_access_path$.getGlobalValue() : semantic_etl_bus.NIL));
        semantic_etl_bus.$nga_access_path$ = SubLFiles.deflexical("*NGA-ACCESS-PATH*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym798$_NGA_ACCESS_PATH_)) ? semantic_etl_bus.$nga_access_path$.getGlobalValue() : semantic_etl_bus.NIL));
        semantic_etl_bus.$gndb_access_path$ = SubLFiles.deflexical("*GNDB-ACCESS-PATH*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym799$_GNDB_ACCESS_PATH_)) ? semantic_etl_bus.$gndb_access_path$.getGlobalValue() : semantic_etl_bus.NIL));
        semantic_etl_bus.$bathymetric_data_access_path$ = SubLFiles.deflexical("*BATHYMETRIC-DATA-ACCESS-PATH*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym800$_BATHYMETRIC_DATA_ACCESS_PATH_)) ? semantic_etl_bus.$bathymetric_data_access_path$.getGlobalValue() : semantic_etl_bus.NIL));
        semantic_etl_bus.$bathymetric_header_access_path$ = SubLFiles.deflexical("*BATHYMETRIC-HEADER-ACCESS-PATH*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym801$_BATHYMETRIC_HEADER_ACCESS_PATH_)) ? semantic_etl_bus.$bathymetric_header_access_path$.getGlobalValue() : semantic_etl_bus.NIL));
        semantic_etl_bus.$sporting_goods_access_path$ = SubLFiles.deflexical("*SPORTING-GOODS-ACCESS-PATH*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym802$_SPORTING_GOODS_ACCESS_PATH_)) ? semantic_etl_bus.$sporting_goods_access_path$.getGlobalValue() : semantic_etl_bus.NIL));
        semantic_etl_bus.$northwind_access_path$ = SubLFiles.deflexical("*NORTHWIND-ACCESS-PATH*", (SubLObject)((semantic_etl_bus.NIL != Symbols.boundp((SubLObject)semantic_etl_bus.$sym803$_NORTHWIND_ACCESS_PATH_)) ? semantic_etl_bus.$northwind_access_path$.getGlobalValue() : semantic_etl_bus.NIL));
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    public static SubLObject setup_semantic_etl_bus_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym6$_DATABASE_OUTPUT_SPECS_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym7$_DATABASE_OUTPUT_SPECS_LOCK_);
        memoization_state.note_globally_cached_function((SubLObject)semantic_etl_bus.$sym14$SEMANTIC_ETL_FUSE_DATABASES);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym27$SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list28);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym29$SEMANT_ACCESS_PATH, (SubLObject)semantic_etl_bus.$sym30$_CSETF_SEMANT_ACCESS_PATH);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym31$SEMANT_TABLE_SEMANTICS_LIST, (SubLObject)semantic_etl_bus.$sym32$_CSETF_SEMANT_TABLE_SEMANTICS_LIST);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym33$SEMANT_TABLE_ALIASES, (SubLObject)semantic_etl_bus.$sym34$_CSETF_SEMANT_TABLE_ALIASES);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym35$SEMANT_DICT, (SubLObject)semantic_etl_bus.$sym36$_CSETF_SEMANT_DICT);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym37$SEMANT_DROPPED_ITEMS, (SubLObject)semantic_etl_bus.$sym38$_CSETF_SEMANT_DROPPED_ITEMS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym39$SEMANT_OUTPUT_SPEC, (SubLObject)semantic_etl_bus.$sym40$_CSETF_SEMANT_OUTPUT_SPEC);
        Equality.identity((SubLObject)semantic_etl_bus.$sym20$SEMANTICS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym52$VISIT_DEFSTRUCT_OBJECT_SEMANTICS_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)semantic_etl_bus.$sym26$PRINT_SEMANTICS);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym68$TABLE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list69);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym70$T_SEMANT_TABLE_ID, (SubLObject)semantic_etl_bus.$sym71$_CSETF_T_SEMANT_TABLE_ID);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym72$T_SEMANT_TABLE_NAME, (SubLObject)semantic_etl_bus.$sym73$_CSETF_T_SEMANT_TABLE_NAME);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym74$T_SEMANT_SOURCE_SEMANTICS, (SubLObject)semantic_etl_bus.$sym75$_CSETF_T_SEMANT_SOURCE_SEMANTICS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym76$T_SEMANT_SEMANTICS, (SubLObject)semantic_etl_bus.$sym77$_CSETF_T_SEMANT_SEMANTICS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym78$T_SEMANT_POINTS_TO_TABLE_IDS, (SubLObject)semantic_etl_bus.$sym79$_CSETF_T_SEMANT_POINTS_TO_TABLE_IDS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym80$T_SEMANT_POINTED_TO_BY_TABLE_IDS, (SubLObject)semantic_etl_bus.$sym81$_CSETF_T_SEMANT_POINTED_TO_BY_TABLE_IDS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym82$T_SEMANT_TABLE_PARSES, (SubLObject)semantic_etl_bus.$sym83$_CSETF_T_SEMANT_TABLE_PARSES);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym84$T_SEMANT_COLUMN_SEMANTICS_LIST, (SubLObject)semantic_etl_bus.$sym85$_CSETF_T_SEMANT_COLUMN_SEMANTICS_LIST);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym86$T_SEMANT_PRIMARY_KEY_COLUMNS, (SubLObject)semantic_etl_bus.$sym87$_CSETF_T_SEMANT_PRIMARY_KEY_COLUMNS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym88$T_SEMANT_COLUMN_CONSTRAINTS, (SubLObject)semantic_etl_bus.$sym89$_CSETF_T_SEMANT_COLUMN_CONSTRAINTS);
        Equality.identity((SubLObject)semantic_etl_bus.$sym62$TABLE_SEMANTICS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym101$VISIT_DEFSTRUCT_OBJECT_TABLE_SEMANTICS_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)semantic_etl_bus.$sym67$PRINT_TABLE_SEMANTICS);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym103$_SEMANTIC_ETL_TABLE_ISG_);
        Structures.register_method(semantic_etl_bus.$find_corresponding_item_in_semantics_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym111$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_TABLE_SEMANTICS_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_object_comparison_name_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym112$SEMANTIC_OBJECT_COMPARISON_NAME_TABLE_SEMANTICS_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_foreign_key_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym125$FOREIGN_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list126);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym127$FK_CONSTRAINT_CONSTRAINT_NAME, (SubLObject)semantic_etl_bus.$sym128$_CSETF_FK_CONSTRAINT_CONSTRAINT_NAME);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym129$FK_CONSTRAINT_CONSTRAINED_COLUMN, (SubLObject)semantic_etl_bus.$sym130$_CSETF_FK_CONSTRAINT_CONSTRAINED_COLUMN);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym131$FK_CONSTRAINT_CONSTRAINING_TABLE, (SubLObject)semantic_etl_bus.$sym132$_CSETF_FK_CONSTRAINT_CONSTRAINING_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym133$FK_CONSTRAINT_CONSTRAINING_COLUMN, (SubLObject)semantic_etl_bus.$sym134$_CSETF_FK_CONSTRAINT_CONSTRAINING_COLUMN);
        Equality.identity((SubLObject)semantic_etl_bus.$sym119$FOREIGN_KEY_CONSTRAINT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_foreign_key_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym140$VISIT_DEFSTRUCT_OBJECT_FOREIGN_KEY_CONSTRAINT_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)semantic_etl_bus.$sym124$PRINT_FOREIGN_KEY_CONSTRAINT);
        Structures.register_method(semantic_etl_bus.$find_corresponding_item_in_semantics_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_foreign_key_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym142$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_FOREIGN_KEY_CONSTRAINT_METHO));
        Structures.register_method(semantic_etl_bus.$semantic_object_comparison_name_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_foreign_key_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym145$SEMANTIC_OBJECT_COMPARISON_NAME_FOREIGN_KEY_CONSTRAINT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_primary_key_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym152$PRIMARY_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list153);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym154$PK_CONSTRAINT_CONSTRAINT_NAME, (SubLObject)semantic_etl_bus.$sym155$_CSETF_PK_CONSTRAINT_CONSTRAINT_NAME);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym156$PK_CONSTRAINT_CONSTRAINT_TYPE, (SubLObject)semantic_etl_bus.$sym157$_CSETF_PK_CONSTRAINT_CONSTRAINT_TYPE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym158$PK_CONSTRAINT_CONSTRAINED_COLUMN, (SubLObject)semantic_etl_bus.$sym159$_CSETF_PK_CONSTRAINT_CONSTRAINED_COLUMN);
        Equality.identity((SubLObject)semantic_etl_bus.$sym146$PRIMARY_KEY_CONSTRAINT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_primary_key_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym162$VISIT_DEFSTRUCT_OBJECT_PRIMARY_KEY_CONSTRAINT_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)semantic_etl_bus.$sym151$PRINT_PRIMARY_KEY_CONSTRAINT);
        Structures.register_method(semantic_etl_bus.$find_corresponding_item_in_semantics_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_primary_key_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym164$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_PRIMARY_KEY_CONSTRAINT_METHO));
        Structures.register_method(semantic_etl_bus.$semantic_object_comparison_name_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_primary_key_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym166$SEMANTIC_OBJECT_COMPARISON_NAME_PRIMARY_KEY_CONSTRAINT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym173$COLUMN_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list174);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym175$C_SEMANT_COLUMN_NAME, (SubLObject)semantic_etl_bus.$sym176$_CSETF_C_SEMANT_COLUMN_NAME);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym177$C_SEMANT_COLUMN_PARSES, (SubLObject)semantic_etl_bus.$sym178$_CSETF_C_SEMANT_COLUMN_PARSES);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym179$C_SEMANT_TABLE_SEMANTICS, (SubLObject)semantic_etl_bus.$sym180$_CSETF_C_SEMANT_TABLE_SEMANTICS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym181$C_SEMANT_VALUE_SEMANTICS_LIST, (SubLObject)semantic_etl_bus.$sym182$_CSETF_C_SEMANT_VALUE_SEMANTICS_LIST);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym183$C_SEMANT_COLUMN_TYPE, (SubLObject)semantic_etl_bus.$sym184$_CSETF_C_SEMANT_COLUMN_TYPE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym185$C_SEMANT_COLUMN_SIZE, (SubLObject)semantic_etl_bus.$sym186$_CSETF_C_SEMANT_COLUMN_SIZE);
        Equality.identity((SubLObject)semantic_etl_bus.$sym167$COLUMN_SEMANTICS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym194$VISIT_DEFSTRUCT_OBJECT_COLUMN_SEMANTICS_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)semantic_etl_bus.$sym172$PRINT_COLUMN_SEMANTICS);
        Structures.register_method(semantic_etl_bus.$find_corresponding_item_in_semantics_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym203$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_COLUMN_SEMANTICS_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_object_comparison_name_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym205$SEMANTIC_OBJECT_COMPARISON_NAME_COLUMN_SEMANTICS_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_value_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym212$VALUE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list213);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym214$V_SEMANT_VALUE, (SubLObject)semantic_etl_bus.$sym215$_CSETF_V_SEMANT_VALUE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym216$V_SEMANT_VALUE_PARSES, (SubLObject)semantic_etl_bus.$sym217$_CSETF_V_SEMANT_VALUE_PARSES);
        Equality.identity((SubLObject)semantic_etl_bus.$sym206$VALUE_SEMANTICS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_value_semantics$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym221$VISIT_DEFSTRUCT_OBJECT_VALUE_SEMANTICS_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)semantic_etl_bus.$sym211$PRINT_VALUE_SEMANTICS);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym224$_DB_OUTPUT_SPEC_ISG_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_database_output_spec$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym232$DATABASE_OUTPUT_SPEC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list233);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym234$DB_OUTPUT_SPEC_ID, (SubLObject)semantic_etl_bus.$sym235$_CSETF_DB_OUTPUT_SPEC_ID);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym236$DB_OUTPUT_SPEC_SEMANTICS1, (SubLObject)semantic_etl_bus.$sym237$_CSETF_DB_OUTPUT_SPEC_SEMANTICS1);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym238$DB_OUTPUT_SPEC_SEMANTICS2, (SubLObject)semantic_etl_bus.$sym239$_CSETF_DB_OUTPUT_SPEC_SEMANTICS2);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym240$DB_OUTPUT_SPEC_RECIPE, (SubLObject)semantic_etl_bus.$sym241$_CSETF_DB_OUTPUT_SPEC_RECIPE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym242$DB_OUTPUT_SPEC_SEMANTICS, (SubLObject)semantic_etl_bus.$sym243$_CSETF_DB_OUTPUT_SPEC_SEMANTICS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym244$DB_OUTPUT_SPEC_SEMANTIC_RECIPE, (SubLObject)semantic_etl_bus.$sym245$_CSETF_DB_OUTPUT_SPEC_SEMANTIC_RECIPE);
        Equality.identity((SubLObject)semantic_etl_bus.$sym225$DATABASE_OUTPUT_SPEC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_database_output_spec$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym252$VISIT_DEFSTRUCT_OBJECT_DATABASE_OUTPUT_SPEC_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)semantic_etl_bus.$sym231$PRINT_DATABASE_OUTPUT_SPEC);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym273$TABLE_MERGER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list274);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym275$TABLE_MERGER_ID, (SubLObject)semantic_etl_bus.$sym276$_CSETF_TABLE_MERGER_ID);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym277$TABLE_MERGER_OUTPUT_SPEC, (SubLObject)semantic_etl_bus.$sym278$_CSETF_TABLE_MERGER_OUTPUT_SPEC);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym279$TABLE_MERGER_SOURCES, (SubLObject)semantic_etl_bus.$sym280$_CSETF_TABLE_MERGER_SOURCES);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym281$TABLE_MERGER_TARGET, (SubLObject)semantic_etl_bus.$sym282$_CSETF_TABLE_MERGER_TARGET);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym283$TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST, (SubLObject)semantic_etl_bus.$sym284$_CSETF_TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym285$TABLE_MERGER_ADDED, (SubLObject)semantic_etl_bus.$sym286$_CSETF_TABLE_MERGER_ADDED);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym287$TABLE_MERGER_DROPPED, (SubLObject)semantic_etl_bus.$sym288$_CSETF_TABLE_MERGER_DROPPED);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym289$TABLE_MERGER_SQL_START_INDEX, (SubLObject)semantic_etl_bus.$sym290$_CSETF_TABLE_MERGER_SQL_START_INDEX);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym291$TABLE_MERGER_SQL_END_INDEX, (SubLObject)semantic_etl_bus.$sym292$_CSETF_TABLE_MERGER_SQL_END_INDEX);
        Equality.identity((SubLObject)semantic_etl_bus.$sym266$TABLE_MERGER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym301$VISIT_DEFSTRUCT_OBJECT_TABLE_MERGER_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)semantic_etl_bus.$sym272$PRINT_TABLE_MERGER);
        Structures.register_method(semantic_etl_bus.$semantic_recipe_step_p_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym307$SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$empty_semantic_recipe_step_p_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym308$EMPTY_SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_append_to_drops_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym309$SEMANTIC_RECIPE_APPEND_TO_DROPS_TABLE_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_append_to_adds_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym310$SEMANTIC_RECIPE_APPEND_TO_ADDS_TABLE_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_remove_from_drops_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym311$SEMANTIC_RECIPE_REMOVE_FROM_DROPS_TABLE_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_remove_from_adds_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym312$SEMANTIC_RECIPE_REMOVE_FROM_ADDS_TABLE_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$set_semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym313$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym314$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_METH));
        Structures.register_method(semantic_etl_bus.$set_semantic_recipe_step_output_spec_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym315$SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_TABLE_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$set_semantic_recipe_step_sql_start_index_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym316$SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_TABLE_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$set_semantic_recipe_step_sql_end_index_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym317$SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_TABLE_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_step_copy_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_table_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym321$SEMANTIC_RECIPE_STEP_COPY_TABLE_MERGER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym329$COLUMN_MERGER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list330);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym331$COLUMN_MERGER_OUTPUT_SPEC, (SubLObject)semantic_etl_bus.$sym332$_CSETF_COLUMN_MERGER_OUTPUT_SPEC);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym333$COLUMN_MERGER_SOURCES, (SubLObject)semantic_etl_bus.$sym334$_CSETF_COLUMN_MERGER_SOURCES);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym335$COLUMN_MERGER_TARGET, (SubLObject)semantic_etl_bus.$sym336$_CSETF_COLUMN_MERGER_TARGET);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym337$COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST, (SubLObject)semantic_etl_bus.$sym338$_CSETF_COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym339$COLUMN_MERGER_ADDED, (SubLObject)semantic_etl_bus.$sym340$_CSETF_COLUMN_MERGER_ADDED);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym341$COLUMN_MERGER_DROPPED, (SubLObject)semantic_etl_bus.$sym342$_CSETF_COLUMN_MERGER_DROPPED);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym343$COLUMN_MERGER_SQL_START_INDEX, (SubLObject)semantic_etl_bus.$sym344$_CSETF_COLUMN_MERGER_SQL_START_INDEX);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym345$COLUMN_MERGER_SQL_END_INDEX, (SubLObject)semantic_etl_bus.$sym346$_CSETF_COLUMN_MERGER_SQL_END_INDEX);
        Equality.identity((SubLObject)semantic_etl_bus.$sym322$COLUMN_MERGER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym348$VISIT_DEFSTRUCT_OBJECT_COLUMN_MERGER_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)semantic_etl_bus.$sym328$PRINT_COLUMN_MERGER);
        Structures.register_method(semantic_etl_bus.$semantic_recipe_step_p_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym350$SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$empty_semantic_recipe_step_p_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym351$EMPTY_SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_append_to_drops_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym352$SEMANTIC_RECIPE_APPEND_TO_DROPS_COLUMN_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_append_to_adds_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym353$SEMANTIC_RECIPE_APPEND_TO_ADDS_COLUMN_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_remove_from_drops_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym354$SEMANTIC_RECIPE_REMOVE_FROM_DROPS_COLUMN_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_remove_from_adds_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym355$SEMANTIC_RECIPE_REMOVE_FROM_ADDS_COLUMN_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$set_semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym356$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym357$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER_MET));
        Structures.register_method(semantic_etl_bus.$set_semantic_recipe_step_output_spec_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym358$SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_COLUMN_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$set_semantic_recipe_step_sql_start_index_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym359$SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_COLUMN_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$set_semantic_recipe_step_sql_end_index_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym360$SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_COLUMN_MERGER_METHOD));
        Structures.register_method(semantic_etl_bus.$semantic_recipe_step_copy_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_column_merger$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym364$SEMANTIC_RECIPE_STEP_COPY_COLUMN_MERGER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_conjunction$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym376$SQL_CONJUNCTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list377);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym378$SQL_CONJUNCTION_CONJUNCTS, (SubLObject)semantic_etl_bus.$sym379$_CSETF_SQL_CONJUNCTION_CONJUNCTS);
        Equality.identity((SubLObject)semantic_etl_bus.$sym369$SQL_CONJUNCTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_conjunction$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym382$VISIT_DEFSTRUCT_OBJECT_SQL_CONJUNCTION_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_disjunction$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym392$SQL_DISJUNCTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list393);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym394$SQL_DISJUNCTION_DISJUNCTS, (SubLObject)semantic_etl_bus.$sym395$_CSETF_SQL_DISJUNCTION_DISJUNCTS);
        Equality.identity((SubLObject)semantic_etl_bus.$sym385$SQL_DISJUNCTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_disjunction$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym398$VISIT_DEFSTRUCT_OBJECT_SQL_DISJUNCTION_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_copy_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym407$SQL_COPY_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list408);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym409$SQL_COPY_TABLE_TABLE, (SubLObject)semantic_etl_bus.$sym410$_CSETF_SQL_COPY_TABLE_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym411$SQL_COPY_TABLE_FROM, (SubLObject)semantic_etl_bus.$sym412$_CSETF_SQL_COPY_TABLE_FROM);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym413$SQL_COPY_TABLE_TO, (SubLObject)semantic_etl_bus.$sym414$_CSETF_SQL_COPY_TABLE_TO);
        Equality.identity((SubLObject)semantic_etl_bus.$sym400$SQL_COPY_TABLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_copy_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym419$VISIT_DEFSTRUCT_OBJECT_SQL_COPY_TABLE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_insert_into$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym428$SQL_INSERT_INTO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list429);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym430$SQL_INSERT_INTO_TABLE, (SubLObject)semantic_etl_bus.$sym431$_CSETF_SQL_INSERT_INTO_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym432$SQL_INSERT_INTO_COLUMNS, (SubLObject)semantic_etl_bus.$sym433$_CSETF_SQL_INSERT_INTO_COLUMNS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym434$SQL_INSERT_INTO_DATA, (SubLObject)semantic_etl_bus.$sym435$_CSETF_SQL_INSERT_INTO_DATA);
        Equality.identity((SubLObject)semantic_etl_bus.$sym421$SQL_INSERT_INTO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_insert_into$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym439$VISIT_DEFSTRUCT_OBJECT_SQL_INSERT_INTO_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_select_from$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym450$SQL_SELECT_FROM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list451);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym452$SQL_SELECT_FROM_COLUMNS, (SubLObject)semantic_etl_bus.$sym453$_CSETF_SQL_SELECT_FROM_COLUMNS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym454$SQL_SELECT_FROM_TABLES, (SubLObject)semantic_etl_bus.$sym455$_CSETF_SQL_SELECT_FROM_TABLES);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym456$SQL_SELECT_FROM_CONDITIONS, (SubLObject)semantic_etl_bus.$sym457$_CSETF_SQL_SELECT_FROM_CONDITIONS);
        Equality.identity((SubLObject)semantic_etl_bus.$sym443$SQL_SELECT_FROM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_select_from$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym461$VISIT_DEFSTRUCT_OBJECT_SQL_SELECT_FROM_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_except$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym472$SQL_EXCEPT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list473);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym474$SQL_EXCEPT_TABLE1, (SubLObject)semantic_etl_bus.$sym475$_CSETF_SQL_EXCEPT_TABLE1);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym476$SQL_EXCEPT_TABLE2, (SubLObject)semantic_etl_bus.$sym477$_CSETF_SQL_EXCEPT_TABLE2);
        Equality.identity((SubLObject)semantic_etl_bus.$sym465$SQL_EXCEPT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_except$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym481$VISIT_DEFSTRUCT_OBJECT_SQL_EXCEPT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_alias$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym490$SQL_ALIAS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list491);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym492$SQL_ALIAS_TABLE, (SubLObject)semantic_etl_bus.$sym493$_CSETF_SQL_ALIAS_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym494$SQL_ALIAS_ALIAS, (SubLObject)semantic_etl_bus.$sym495$_CSETF_SQL_ALIAS_ALIAS);
        Equality.identity((SubLObject)semantic_etl_bus.$sym483$SQL_ALIAS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_alias$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym498$VISIT_DEFSTRUCT_OBJECT_SQL_ALIAS_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_column_equal$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym507$SQL_COLUMN_EQUAL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list508);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym509$SQL_COLUMN_EQUAL_TABLE1, (SubLObject)semantic_etl_bus.$sym510$_CSETF_SQL_COLUMN_EQUAL_TABLE1);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym511$SQL_COLUMN_EQUAL_COLUMN1, (SubLObject)semantic_etl_bus.$sym512$_CSETF_SQL_COLUMN_EQUAL_COLUMN1);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym513$SQL_COLUMN_EQUAL_TABLE2, (SubLObject)semantic_etl_bus.$sym514$_CSETF_SQL_COLUMN_EQUAL_TABLE2);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym515$SQL_COLUMN_EQUAL_COLUMN2, (SubLObject)semantic_etl_bus.$sym516$_CSETF_SQL_COLUMN_EQUAL_COLUMN2);
        Equality.identity((SubLObject)semantic_etl_bus.$sym500$SQL_COLUMN_EQUAL);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_column_equal$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym520$VISIT_DEFSTRUCT_OBJECT_SQL_COLUMN_EQUAL_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_is_null$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym529$SQL_IS_NULL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list530);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym531$SQL_IS_NULL_TABLE, (SubLObject)semantic_etl_bus.$sym532$_CSETF_SQL_IS_NULL_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym533$SQL_IS_NULL_COLUMN, (SubLObject)semantic_etl_bus.$sym534$_CSETF_SQL_IS_NULL_COLUMN);
        Equality.identity((SubLObject)semantic_etl_bus.$sym522$SQL_IS_NULL);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_is_null$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym537$VISIT_DEFSTRUCT_OBJECT_SQL_IS_NULL_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_not_in$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym546$SQL_NOT_IN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list547);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym548$SQL_NOT_IN_COLUMN_TABLE, (SubLObject)semantic_etl_bus.$sym549$_CSETF_SQL_NOT_IN_COLUMN_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym550$SQL_NOT_IN_COLUMN, (SubLObject)semantic_etl_bus.$sym551$_CSETF_SQL_NOT_IN_COLUMN);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym552$SQL_NOT_IN_TABLE, (SubLObject)semantic_etl_bus.$sym553$_CSETF_SQL_NOT_IN_TABLE);
        Equality.identity((SubLObject)semantic_etl_bus.$sym539$SQL_NOT_IN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_not_in$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym556$VISIT_DEFSTRUCT_OBJECT_SQL_NOT_IN_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_inner_join$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym565$SQL_INNER_JOIN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list566);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym567$SQL_INNER_JOIN_TABLE1, (SubLObject)semantic_etl_bus.$sym568$_CSETF_SQL_INNER_JOIN_TABLE1);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym569$SQL_INNER_JOIN_TABLE2, (SubLObject)semantic_etl_bus.$sym570$_CSETF_SQL_INNER_JOIN_TABLE2);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym571$SQL_INNER_JOIN_ON, (SubLObject)semantic_etl_bus.$sym572$_CSETF_SQL_INNER_JOIN_ON);
        Equality.identity((SubLObject)semantic_etl_bus.$sym558$SQL_INNER_JOIN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_inner_join$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym575$VISIT_DEFSTRUCT_OBJECT_SQL_INNER_JOIN_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_left_join$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym584$SQL_LEFT_JOIN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list585);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym586$SQL_LEFT_JOIN_LEFT_TABLE, (SubLObject)semantic_etl_bus.$sym587$_CSETF_SQL_LEFT_JOIN_LEFT_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym588$SQL_LEFT_JOIN_RIGHT_TABLE, (SubLObject)semantic_etl_bus.$sym589$_CSETF_SQL_LEFT_JOIN_RIGHT_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym590$SQL_LEFT_JOIN_ON, (SubLObject)semantic_etl_bus.$sym591$_CSETF_SQL_LEFT_JOIN_ON);
        Equality.identity((SubLObject)semantic_etl_bus.$sym577$SQL_LEFT_JOIN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_left_join$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym595$VISIT_DEFSTRUCT_OBJECT_SQL_LEFT_JOIN_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_union$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym604$SQL_UNION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list605);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym606$SQL_UNION_SELECT1, (SubLObject)semantic_etl_bus.$sym607$_CSETF_SQL_UNION_SELECT1);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym608$SQL_UNION_SELECT2, (SubLObject)semantic_etl_bus.$sym609$_CSETF_SQL_UNION_SELECT2);
        Equality.identity((SubLObject)semantic_etl_bus.$sym597$SQL_UNION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_union$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym613$VISIT_DEFSTRUCT_OBJECT_SQL_UNION_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_alter_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym622$SQL_ALTER_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list623);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym624$SQL_ALTER_TABLE_TABLE, (SubLObject)semantic_etl_bus.$sym625$_CSETF_SQL_ALTER_TABLE_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym626$SQL_ALTER_TABLE_ACTION, (SubLObject)semantic_etl_bus.$sym627$_CSETF_SQL_ALTER_TABLE_ACTION);
        Equality.identity((SubLObject)semantic_etl_bus.$sym615$SQL_ALTER_TABLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_alter_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym630$VISIT_DEFSTRUCT_OBJECT_SQL_ALTER_TABLE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_add_column$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym640$SQL_ADD_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list641);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym642$SQL_ADD_COLUMN_COLUMN, (SubLObject)semantic_etl_bus.$sym643$_CSETF_SQL_ADD_COLUMN_COLUMN);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym644$SQL_ADD_COLUMN_TYPE, (SubLObject)semantic_etl_bus.$sym645$_CSETF_SQL_ADD_COLUMN_TYPE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym646$SQL_ADD_COLUMN_SIZE, (SubLObject)semantic_etl_bus.$sym647$_CSETF_SQL_ADD_COLUMN_SIZE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym648$SQL_ADD_COLUMN_CONSTRAINTS, (SubLObject)semantic_etl_bus.$sym649$_CSETF_SQL_ADD_COLUMN_CONSTRAINTS);
        Equality.identity((SubLObject)semantic_etl_bus.$sym633$SQL_ADD_COLUMN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_add_column$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym654$VISIT_DEFSTRUCT_OBJECT_SQL_ADD_COLUMN_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_drop_column$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym666$SQL_DROP_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list667);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym668$SQL_DROP_COLUMN_COLUMN, (SubLObject)semantic_etl_bus.$sym669$_CSETF_SQL_DROP_COLUMN_COLUMN);
        Equality.identity((SubLObject)semantic_etl_bus.$sym659$SQL_DROP_COLUMN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_drop_column$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym671$VISIT_DEFSTRUCT_OBJECT_SQL_DROP_COLUMN_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_rename_column$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym680$SQL_RENAME_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list681);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym682$SQL_RENAME_COLUMN_OLD_COLUMN, (SubLObject)semantic_etl_bus.$sym683$_CSETF_SQL_RENAME_COLUMN_OLD_COLUMN);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym684$SQL_RENAME_COLUMN_NEW_COLUMN, (SubLObject)semantic_etl_bus.$sym685$_CSETF_SQL_RENAME_COLUMN_NEW_COLUMN);
        Equality.identity((SubLObject)semantic_etl_bus.$sym673$SQL_RENAME_COLUMN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_rename_column$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym689$VISIT_DEFSTRUCT_OBJECT_SQL_RENAME_COLUMN_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_add_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym698$SQL_ADD_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list699);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym700$SQL_ADD_CONSTRAINT_CONSTRAINT, (SubLObject)semantic_etl_bus.$sym701$_CSETF_SQL_ADD_CONSTRAINT_CONSTRAINT);
        Equality.identity((SubLObject)semantic_etl_bus.$sym691$SQL_ADD_CONSTRAINT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_add_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym704$VISIT_DEFSTRUCT_OBJECT_SQL_ADD_CONSTRAINT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_drop_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym712$SQL_DROP_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list713);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym714$SQL_DROP_CONSTRAINT_CONSTRAINT, (SubLObject)semantic_etl_bus.$sym715$_CSETF_SQL_DROP_CONSTRAINT_CONSTRAINT);
        Equality.identity((SubLObject)semantic_etl_bus.$sym707$SQL_DROP_CONSTRAINT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_drop_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym717$VISIT_DEFSTRUCT_OBJECT_SQL_DROP_CONSTRAINT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_fk_column_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym726$SQL_FK_COLUMN_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list727);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym728$SQL_FK_COLUMN_CONSTRAINT_NAME, (SubLObject)semantic_etl_bus.$sym729$_CSETF_SQL_FK_COLUMN_CONSTRAINT_NAME);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym730$SQL_FK_COLUMN_CONSTRAINT_TABLE, (SubLObject)semantic_etl_bus.$sym731$_CSETF_SQL_FK_COLUMN_CONSTRAINT_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym732$SQL_FK_COLUMN_CONSTRAINT_COLUMN, (SubLObject)semantic_etl_bus.$sym733$_CSETF_SQL_FK_COLUMN_CONSTRAINT_COLUMN);
        Equality.identity((SubLObject)semantic_etl_bus.$sym719$SQL_FK_COLUMN_CONSTRAINT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_fk_column_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym736$VISIT_DEFSTRUCT_OBJECT_SQL_FK_COLUMN_CONSTRAINT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_fk_table_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym745$SQL_FK_TABLE_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list746);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym747$SQL_FK_TABLE_CONSTRAINT_COLUMN, (SubLObject)semantic_etl_bus.$sym748$_CSETF_SQL_FK_TABLE_CONSTRAINT_COLUMN);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym749$SQL_FK_TABLE_CONSTRAINT_CONSTRAINT, (SubLObject)semantic_etl_bus.$sym750$_CSETF_SQL_FK_TABLE_CONSTRAINT_CONSTRAINT);
        Equality.identity((SubLObject)semantic_etl_bus.$sym738$SQL_FK_TABLE_CONSTRAINT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_fk_table_constraint$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym752$VISIT_DEFSTRUCT_OBJECT_SQL_FK_TABLE_CONSTRAINT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_update$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym761$SQL_UPDATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list762);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym763$SQL_UPDATE_TABLE, (SubLObject)semantic_etl_bus.$sym764$_CSETF_SQL_UPDATE_TABLE);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym765$SQL_UPDATE_SETTINGS, (SubLObject)semantic_etl_bus.$sym766$_CSETF_SQL_UPDATE_SETTINGS);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym767$SQL_UPDATE_CONDITIONS, (SubLObject)semantic_etl_bus.$sym768$_CSETF_SQL_UPDATE_CONDITIONS);
        Equality.identity((SubLObject)semantic_etl_bus.$sym754$SQL_UPDATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_update$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym771$VISIT_DEFSTRUCT_OBJECT_SQL_UPDATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_drop_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym781$SQL_DROP_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)semantic_etl_bus.$list782);
        Structures.def_csetf((SubLObject)semantic_etl_bus.$sym783$SQL_DROP_TABLE_TABLE, (SubLObject)semantic_etl_bus.$sym784$_CSETF_SQL_DROP_TABLE_TABLE);
        Equality.identity((SubLObject)semantic_etl_bus.$sym774$SQL_DROP_TABLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), semantic_etl_bus.$dtp_sql_drop_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)semantic_etl_bus.$sym786$VISIT_DEFSTRUCT_OBJECT_SQL_DROP_TABLE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym791$_ACCESS_PATH_MAP_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym795$_BLN1_ACCESS_PATH_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym796$_BLN2_ACCESS_PATH_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym797$_USGS_ACCESS_PATH_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym798$_NGA_ACCESS_PATH_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym799$_GNDB_ACCESS_PATH_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym800$_BATHYMETRIC_DATA_ACCESS_PATH_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym801$_BATHYMETRIC_HEADER_ACCESS_PATH_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym802$_SPORTING_GOODS_ACCESS_PATH_);
        subl_macro_promotions.declare_defglobal((SubLObject)semantic_etl_bus.$sym803$_NORTHWIND_ACCESS_PATH_);
        return (SubLObject)semantic_etl_bus.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_semantic_etl_bus_file();
    }
    
    @Override
	public void initializeVariables() {
        init_semantic_etl_bus_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_semantic_etl_bus_file();
    }
    
    static {
        me = (SubLFile)new semantic_etl_bus();
        semantic_etl_bus.$semantic_etl_debugP$ = null;
        semantic_etl_bus.$database_output_specs$ = null;
        semantic_etl_bus.$database_output_specs_lock$ = null;
        semantic_etl_bus.$semantic_etl_fuse_databases_caching_state$ = null;
        semantic_etl_bus.$find_corresponding_item_in_semantics_method_table$ = null;
        semantic_etl_bus.$semantic_object_comparison_name_method_table$ = null;
        semantic_etl_bus.$dtp_semantics$ = null;
        semantic_etl_bus.$dtp_table_semantics$ = null;
        semantic_etl_bus.$semantic_etl_table_isg$ = null;
        semantic_etl_bus.$dtp_foreign_key_constraint$ = null;
        semantic_etl_bus.$dtp_primary_key_constraint$ = null;
        semantic_etl_bus.$dtp_column_semantics$ = null;
        semantic_etl_bus.$dtp_value_semantics$ = null;
        semantic_etl_bus.$db_output_spec_isg$ = null;
        semantic_etl_bus.$dtp_database_output_spec$ = null;
        semantic_etl_bus.$recipe_marker$ = null;
        semantic_etl_bus.$semantic_recipe_step_p_method_table$ = null;
        semantic_etl_bus.$empty_semantic_recipe_step_p_method_table$ = null;
        semantic_etl_bus.$set_semantic_recipe_step_output_spec_method_table$ = null;
        semantic_etl_bus.$semantic_recipe_append_to_drops_method_table$ = null;
        semantic_etl_bus.$semantic_recipe_append_to_adds_method_table$ = null;
        semantic_etl_bus.$semantic_recipe_remove_from_drops_method_table$ = null;
        semantic_etl_bus.$semantic_recipe_remove_from_adds_method_table$ = null;
        semantic_etl_bus.$set_semantic_recipe_step_column_correspondence_list_method_table$ = null;
        semantic_etl_bus.$semantic_recipe_step_column_correspondence_list_method_table$ = null;
        semantic_etl_bus.$set_semantic_recipe_step_sql_start_index_method_table$ = null;
        semantic_etl_bus.$set_semantic_recipe_step_sql_end_index_method_table$ = null;
        semantic_etl_bus.$semantic_recipe_step_copy_method_table$ = null;
        semantic_etl_bus.$dtp_table_merger$ = null;
        semantic_etl_bus.$dtp_column_merger$ = null;
        semantic_etl_bus.$dtp_sql_conjunction$ = null;
        semantic_etl_bus.$dtp_sql_disjunction$ = null;
        semantic_etl_bus.$dtp_sql_copy_table$ = null;
        semantic_etl_bus.$dtp_sql_insert_into$ = null;
        semantic_etl_bus.$dtp_sql_select_from$ = null;
        semantic_etl_bus.$dtp_sql_except$ = null;
        semantic_etl_bus.$dtp_sql_alias$ = null;
        semantic_etl_bus.$dtp_sql_column_equal$ = null;
        semantic_etl_bus.$dtp_sql_is_null$ = null;
        semantic_etl_bus.$dtp_sql_not_in$ = null;
        semantic_etl_bus.$dtp_sql_inner_join$ = null;
        semantic_etl_bus.$dtp_sql_left_join$ = null;
        semantic_etl_bus.$dtp_sql_union$ = null;
        semantic_etl_bus.$dtp_sql_alter_table$ = null;
        semantic_etl_bus.$dtp_sql_add_column$ = null;
        semantic_etl_bus.$dtp_sql_drop_column$ = null;
        semantic_etl_bus.$dtp_sql_rename_column$ = null;
        semantic_etl_bus.$dtp_sql_add_constraint$ = null;
        semantic_etl_bus.$dtp_sql_drop_constraint$ = null;
        semantic_etl_bus.$dtp_sql_fk_column_constraint$ = null;
        semantic_etl_bus.$dtp_sql_fk_table_constraint$ = null;
        semantic_etl_bus.$dtp_sql_update$ = null;
        semantic_etl_bus.$dtp_sql_drop_table$ = null;
        semantic_etl_bus.$access_path_map$ = null;
        semantic_etl_bus.$bln1_access_path$ = null;
        semantic_etl_bus.$bln2_access_path$ = null;
        semantic_etl_bus.$usgs_access_path$ = null;
        semantic_etl_bus.$nga_access_path$ = null;
        semantic_etl_bus.$gndb_access_path$ = null;
        semantic_etl_bus.$bathymetric_data_access_path$ = null;
        semantic_etl_bus.$bathymetric_header_access_path$ = null;
        semantic_etl_bus.$sporting_goods_access_path$ = null;
        semantic_etl_bus.$northwind_access_path$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE-SEMANTICS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym2$SEMANTICS_TABLE_SEMANTICS_LIST = SubLObjectFactory.makeSymbol("SEMANTICS-TABLE-SEMANTICS-LIST");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-SEMANTICS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym4$TABLE_SEMANTICS_COLUMN_CONSTRAINTS = SubLObjectFactory.makeSymbol("TABLE-SEMANTICS-COLUMN-CONSTRAINTS");
        $kw5$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $sym6$_DATABASE_OUTPUT_SPECS_ = SubLObjectFactory.makeSymbol("*DATABASE-OUTPUT-SPECS*");
        $sym7$_DATABASE_OUTPUT_SPECS_LOCK_ = SubLObjectFactory.makeSymbol("*DATABASE-OUTPUT-SPECS-LOCK*");
        $str8$Database_Output_Specs = SubLObjectFactory.makeString("Database Output Specs");
        $sym9$ACCESS_PATH_P = SubLObjectFactory.makeSymbol("ACCESS-PATH-P");
        $str10$Please_select_an_output_specifica = SubLObjectFactory.makeString("Please select an output specification: ");
        $str11$_________________________________ = SubLObjectFactory.makeString("-----------------------------------ITERATION---------------------------------------------------");
        $sym12$Q = SubLObjectFactory.makeSymbol("Q");
        $str13$There_is_no_output_specification_ = SubLObjectFactory.makeString("There is no output specification with tag ~a");
        $sym14$SEMANTIC_ETL_FUSE_DATABASES = SubLObjectFactory.makeSymbol("SEMANTIC-ETL-FUSE-DATABASES");
        $str15$Can_only_fuse_exactly_two_databas = SubLObjectFactory.makeString("Can only fuse exactly two databases");
        $sym16$_SEMANTIC_ETL_FUSE_DATABASES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SEMANTIC-ETL-FUSE-DATABASES-CACHING-STATE*");
        $int17$256 = SubLObjectFactory.makeInteger(256);
        $str18$Don_t_know_how_to_find_a__S_in_a_ = SubLObjectFactory.makeString("Don't know how to find a ~S in a semantics-p");
        $str19$don_t_know_how_to_name__S__ = SubLObjectFactory.makeString("don't know how to name ~S~%");
        $sym20$SEMANTICS = SubLObjectFactory.makeSymbol("SEMANTICS");
        $sym21$SEMANTICS_P = SubLObjectFactory.makeSymbol("SEMANTICS-P");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-SEMANTICS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-ALIASES"), (SubLObject)SubLObjectFactory.makeSymbol("DICT"), (SubLObject)SubLObjectFactory.makeSymbol("DROPPED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-SPEC"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE-SEMANTICS-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE-ALIASES"), (SubLObject)SubLObjectFactory.makeKeyword("DICT"), (SubLObject)SubLObjectFactory.makeKeyword("DROPPED-ITEMS"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMANT-ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANT-TABLE-SEMANTICS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANT-TABLE-ALIASES"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANT-DICT"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANT-DROPPED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANT-OUTPUT-SPEC"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SEMANT-ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SEMANT-TABLE-SEMANTICS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SEMANT-TABLE-ALIASES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SEMANT-DICT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SEMANT-DROPPED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SEMANT-OUTPUT-SPEC"));
        $sym26$PRINT_SEMANTICS = SubLObjectFactory.makeSymbol("PRINT-SEMANTICS");
        $sym27$SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS-P"));
        $sym29$SEMANT_ACCESS_PATH = SubLObjectFactory.makeSymbol("SEMANT-ACCESS-PATH");
        $sym30$_CSETF_SEMANT_ACCESS_PATH = SubLObjectFactory.makeSymbol("_CSETF-SEMANT-ACCESS-PATH");
        $sym31$SEMANT_TABLE_SEMANTICS_LIST = SubLObjectFactory.makeSymbol("SEMANT-TABLE-SEMANTICS-LIST");
        $sym32$_CSETF_SEMANT_TABLE_SEMANTICS_LIST = SubLObjectFactory.makeSymbol("_CSETF-SEMANT-TABLE-SEMANTICS-LIST");
        $sym33$SEMANT_TABLE_ALIASES = SubLObjectFactory.makeSymbol("SEMANT-TABLE-ALIASES");
        $sym34$_CSETF_SEMANT_TABLE_ALIASES = SubLObjectFactory.makeSymbol("_CSETF-SEMANT-TABLE-ALIASES");
        $sym35$SEMANT_DICT = SubLObjectFactory.makeSymbol("SEMANT-DICT");
        $sym36$_CSETF_SEMANT_DICT = SubLObjectFactory.makeSymbol("_CSETF-SEMANT-DICT");
        $sym37$SEMANT_DROPPED_ITEMS = SubLObjectFactory.makeSymbol("SEMANT-DROPPED-ITEMS");
        $sym38$_CSETF_SEMANT_DROPPED_ITEMS = SubLObjectFactory.makeSymbol("_CSETF-SEMANT-DROPPED-ITEMS");
        $sym39$SEMANT_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("SEMANT-OUTPUT-SPEC");
        $sym40$_CSETF_SEMANT_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("_CSETF-SEMANT-OUTPUT-SPEC");
        $kw41$ACCESS_PATH = SubLObjectFactory.makeKeyword("ACCESS-PATH");
        $kw42$TABLE_SEMANTICS_LIST = SubLObjectFactory.makeKeyword("TABLE-SEMANTICS-LIST");
        $kw43$TABLE_ALIASES = SubLObjectFactory.makeKeyword("TABLE-ALIASES");
        $kw44$DICT = SubLObjectFactory.makeKeyword("DICT");
        $kw45$DROPPED_ITEMS = SubLObjectFactory.makeKeyword("DROPPED-ITEMS");
        $kw46$OUTPUT_SPEC = SubLObjectFactory.makeKeyword("OUTPUT-SPEC");
        $str47$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw48$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym49$MAKE_SEMANTICS = SubLObjectFactory.makeSymbol("MAKE-SEMANTICS");
        $kw50$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw51$END = SubLObjectFactory.makeKeyword("END");
        $sym52$VISIT_DEFSTRUCT_OBJECT_SEMANTICS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SEMANTICS-METHOD");
        $str53$_SEMANTICS____a_____a_ = SubLObjectFactory.makeString("<SEMANTICS: [~a]\n  ~a>");
        $sym54$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym55$TABLE_SEMANTICS_P = SubLObjectFactory.makeSymbol("TABLE-SEMANTICS-P");
        $str56$don_t_know_how_to_handle__S = SubLObjectFactory.makeString("don't know how to handle ~S");
        $str57$Table__S_is_pointed_to_by__A_and_ = SubLObjectFactory.makeString("Table ~S is pointed to by ~A and cannot be deleted");
        $sym58$TABLE_SEMANTICS_TABLE_NAME = SubLObjectFactory.makeSymbol("TABLE-SEMANTICS-TABLE-NAME");
        $sym59$COLUMN_SEMANTICS_P = SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-P");
        $sym60$PRIMARY_KEY_CONSTRAINT_P = SubLObjectFactory.makeSymbol("PRIMARY-KEY-CONSTRAINT-P");
        $sym61$FOREIGN_KEY_CONSTRAINT_P = SubLObjectFactory.makeSymbol("FOREIGN-KEY-CONSTRAINT-P");
        $sym62$TABLE_SEMANTICS = SubLObjectFactory.makeSymbol("TABLE-SEMANTICS");
        $list63 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TABLE-ID"), SubLObjectFactory.makeSymbol("TABLE-NAME"), SubLObjectFactory.makeSymbol("SOURCE-SEMANTICS"), SubLObjectFactory.makeSymbol("SEMANTICS"), SubLObjectFactory.makeSymbol("POINTS-TO-TABLE-IDS"), SubLObjectFactory.makeSymbol("POINTED-TO-BY-TABLE-IDS"), SubLObjectFactory.makeSymbol("TABLE-PARSES"), SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-LIST"), SubLObjectFactory.makeSymbol("PRIMARY-KEY-COLUMNS"), SubLObjectFactory.makeSymbol("COLUMN-CONSTRAINTS") });
        $list64 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TABLE-ID"), SubLObjectFactory.makeKeyword("TABLE-NAME"), SubLObjectFactory.makeKeyword("SOURCE-SEMANTICS"), SubLObjectFactory.makeKeyword("SEMANTICS"), SubLObjectFactory.makeKeyword("POINTS-TO-TABLE-IDS"), SubLObjectFactory.makeKeyword("POINTED-TO-BY-TABLE-IDS"), SubLObjectFactory.makeKeyword("TABLE-PARSES"), SubLObjectFactory.makeKeyword("COLUMN-SEMANTICS-LIST"), SubLObjectFactory.makeKeyword("PRIMARY-KEY-COLUMNS"), SubLObjectFactory.makeKeyword("COLUMN-CONSTRAINTS") });
        $list65 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("T-SEMANT-TABLE-ID"), SubLObjectFactory.makeSymbol("T-SEMANT-TABLE-NAME"), SubLObjectFactory.makeSymbol("T-SEMANT-SOURCE-SEMANTICS"), SubLObjectFactory.makeSymbol("T-SEMANT-SEMANTICS"), SubLObjectFactory.makeSymbol("T-SEMANT-POINTS-TO-TABLE-IDS"), SubLObjectFactory.makeSymbol("T-SEMANT-POINTED-TO-BY-TABLE-IDS"), SubLObjectFactory.makeSymbol("T-SEMANT-TABLE-PARSES"), SubLObjectFactory.makeSymbol("T-SEMANT-COLUMN-SEMANTICS-LIST"), SubLObjectFactory.makeSymbol("T-SEMANT-PRIMARY-KEY-COLUMNS"), SubLObjectFactory.makeSymbol("T-SEMANT-COLUMN-CONSTRAINTS") });
        $list66 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-TABLE-ID"), SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-TABLE-NAME"), SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-SOURCE-SEMANTICS"), SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-SEMANTICS"), SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-POINTS-TO-TABLE-IDS"), SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-POINTED-TO-BY-TABLE-IDS"), SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-TABLE-PARSES"), SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-COLUMN-SEMANTICS-LIST"), SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-PRIMARY-KEY-COLUMNS"), SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-COLUMN-CONSTRAINTS") });
        $sym67$PRINT_TABLE_SEMANTICS = SubLObjectFactory.makeSymbol("PRINT-TABLE-SEMANTICS");
        $sym68$TABLE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TABLE-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-SEMANTICS-P"));
        $sym70$T_SEMANT_TABLE_ID = SubLObjectFactory.makeSymbol("T-SEMANT-TABLE-ID");
        $sym71$_CSETF_T_SEMANT_TABLE_ID = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-TABLE-ID");
        $sym72$T_SEMANT_TABLE_NAME = SubLObjectFactory.makeSymbol("T-SEMANT-TABLE-NAME");
        $sym73$_CSETF_T_SEMANT_TABLE_NAME = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-TABLE-NAME");
        $sym74$T_SEMANT_SOURCE_SEMANTICS = SubLObjectFactory.makeSymbol("T-SEMANT-SOURCE-SEMANTICS");
        $sym75$_CSETF_T_SEMANT_SOURCE_SEMANTICS = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-SOURCE-SEMANTICS");
        $sym76$T_SEMANT_SEMANTICS = SubLObjectFactory.makeSymbol("T-SEMANT-SEMANTICS");
        $sym77$_CSETF_T_SEMANT_SEMANTICS = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-SEMANTICS");
        $sym78$T_SEMANT_POINTS_TO_TABLE_IDS = SubLObjectFactory.makeSymbol("T-SEMANT-POINTS-TO-TABLE-IDS");
        $sym79$_CSETF_T_SEMANT_POINTS_TO_TABLE_IDS = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-POINTS-TO-TABLE-IDS");
        $sym80$T_SEMANT_POINTED_TO_BY_TABLE_IDS = SubLObjectFactory.makeSymbol("T-SEMANT-POINTED-TO-BY-TABLE-IDS");
        $sym81$_CSETF_T_SEMANT_POINTED_TO_BY_TABLE_IDS = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-POINTED-TO-BY-TABLE-IDS");
        $sym82$T_SEMANT_TABLE_PARSES = SubLObjectFactory.makeSymbol("T-SEMANT-TABLE-PARSES");
        $sym83$_CSETF_T_SEMANT_TABLE_PARSES = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-TABLE-PARSES");
        $sym84$T_SEMANT_COLUMN_SEMANTICS_LIST = SubLObjectFactory.makeSymbol("T-SEMANT-COLUMN-SEMANTICS-LIST");
        $sym85$_CSETF_T_SEMANT_COLUMN_SEMANTICS_LIST = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-COLUMN-SEMANTICS-LIST");
        $sym86$T_SEMANT_PRIMARY_KEY_COLUMNS = SubLObjectFactory.makeSymbol("T-SEMANT-PRIMARY-KEY-COLUMNS");
        $sym87$_CSETF_T_SEMANT_PRIMARY_KEY_COLUMNS = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-PRIMARY-KEY-COLUMNS");
        $sym88$T_SEMANT_COLUMN_CONSTRAINTS = SubLObjectFactory.makeSymbol("T-SEMANT-COLUMN-CONSTRAINTS");
        $sym89$_CSETF_T_SEMANT_COLUMN_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-T-SEMANT-COLUMN-CONSTRAINTS");
        $kw90$TABLE_ID = SubLObjectFactory.makeKeyword("TABLE-ID");
        $kw91$TABLE_NAME = SubLObjectFactory.makeKeyword("TABLE-NAME");
        $kw92$SOURCE_SEMANTICS = SubLObjectFactory.makeKeyword("SOURCE-SEMANTICS");
        $kw93$SEMANTICS = SubLObjectFactory.makeKeyword("SEMANTICS");
        $kw94$POINTS_TO_TABLE_IDS = SubLObjectFactory.makeKeyword("POINTS-TO-TABLE-IDS");
        $kw95$POINTED_TO_BY_TABLE_IDS = SubLObjectFactory.makeKeyword("POINTED-TO-BY-TABLE-IDS");
        $kw96$TABLE_PARSES = SubLObjectFactory.makeKeyword("TABLE-PARSES");
        $kw97$COLUMN_SEMANTICS_LIST = SubLObjectFactory.makeKeyword("COLUMN-SEMANTICS-LIST");
        $kw98$PRIMARY_KEY_COLUMNS = SubLObjectFactory.makeKeyword("PRIMARY-KEY-COLUMNS");
        $kw99$COLUMN_CONSTRAINTS = SubLObjectFactory.makeKeyword("COLUMN-CONSTRAINTS");
        $sym100$MAKE_TABLE_SEMANTICS = SubLObjectFactory.makeSymbol("MAKE-TABLE-SEMANTICS");
        $sym101$VISIT_DEFSTRUCT_OBJECT_TABLE_SEMANTICS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TABLE-SEMANTICS-METHOD");
        $str102$_TABLE__a__s___a__a___ref__a_ref_ = SubLObjectFactory.makeString("<TABLE:~a ~s [~a/~a]: ref ~a ref-by ~a ~a ~a>");
        $sym103$_SEMANTIC_ETL_TABLE_ISG_ = SubLObjectFactory.makeSymbol("*SEMANTIC-ETL-TABLE-ISG*");
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-SEMANTICS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym105$TABLE_SEMANTICS_COLUMN_SEMANTICS_LIST = SubLObjectFactory.makeSymbol("TABLE-SEMANTICS-COLUMN-SEMANTICS-LIST");
        $sym106$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym107$COLUMN_SEMANTICS_COLUMN_NAME = SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-COLUMN-NAME");
        $sym108$COPY_COLUMN_CONSTRAINT = SubLObjectFactory.makeSymbol("COPY-COLUMN-CONSTRAINT");
        $sym109$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym110$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym111$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_TABLE_SEMANTICS_METHOD = SubLObjectFactory.makeSymbol("FIND-CORRESPONDING-ITEM-IN-SEMANTICS-TABLE-SEMANTICS-METHOD");
        $sym112$SEMANTIC_OBJECT_COMPARISON_NAME_TABLE_SEMANTICS_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-OBJECT-COMPARISON-NAME-TABLE-SEMANTICS-METHOD");
        $sym113$FOREIGN_KEY_CONSTRAINT_CONSTRAINED_COLUMN = SubLObjectFactory.makeSymbol("FOREIGN-KEY-CONSTRAINT-CONSTRAINED-COLUMN");
        $sym114$CONTENT_COLUMN_ = SubLObjectFactory.makeSymbol("CONTENT-COLUMN?");
        $sym115$COLUMN_CONSTRAINT_P = SubLObjectFactory.makeSymbol("COLUMN-CONSTRAINT-P");
        $str116$Column__S_is_pointed_to_by__A_and = SubLObjectFactory.makeString("Column ~S is pointed to by ~A and cannot be deleted");
        $str117$don_t_know_how_to_remove_constrai = SubLObjectFactory.makeString("don't know how to remove constraint ~S from ~S");
        $str118$Don_t_know_how_to_copy_constraint = SubLObjectFactory.makeString("Don't know how to copy constraint: ~S~%");
        $sym119$FOREIGN_KEY_CONSTRAINT = SubLObjectFactory.makeSymbol("FOREIGN-KEY-CONSTRAINT");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINED-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINING-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINING-COLUMN"));
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINED-COLUMN"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINING-TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINING-COLUMN"));
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FK-CONSTRAINT-CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FK-CONSTRAINT-CONSTRAINED-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("FK-CONSTRAINT-CONSTRAINING-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("FK-CONSTRAINT-CONSTRAINING-COLUMN"));
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINED-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINING-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINING-COLUMN"));
        $sym124$PRINT_FOREIGN_KEY_CONSTRAINT = SubLObjectFactory.makeSymbol("PRINT-FOREIGN-KEY-CONSTRAINT");
        $sym125$FOREIGN_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FOREIGN-KEY-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FOREIGN-KEY-CONSTRAINT-P"));
        $sym127$FK_CONSTRAINT_CONSTRAINT_NAME = SubLObjectFactory.makeSymbol("FK-CONSTRAINT-CONSTRAINT-NAME");
        $sym128$_CSETF_FK_CONSTRAINT_CONSTRAINT_NAME = SubLObjectFactory.makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINT-NAME");
        $sym129$FK_CONSTRAINT_CONSTRAINED_COLUMN = SubLObjectFactory.makeSymbol("FK-CONSTRAINT-CONSTRAINED-COLUMN");
        $sym130$_CSETF_FK_CONSTRAINT_CONSTRAINED_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINED-COLUMN");
        $sym131$FK_CONSTRAINT_CONSTRAINING_TABLE = SubLObjectFactory.makeSymbol("FK-CONSTRAINT-CONSTRAINING-TABLE");
        $sym132$_CSETF_FK_CONSTRAINT_CONSTRAINING_TABLE = SubLObjectFactory.makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINING-TABLE");
        $sym133$FK_CONSTRAINT_CONSTRAINING_COLUMN = SubLObjectFactory.makeSymbol("FK-CONSTRAINT-CONSTRAINING-COLUMN");
        $sym134$_CSETF_FK_CONSTRAINT_CONSTRAINING_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINING-COLUMN");
        $kw135$CONSTRAINT_NAME = SubLObjectFactory.makeKeyword("CONSTRAINT-NAME");
        $kw136$CONSTRAINED_COLUMN = SubLObjectFactory.makeKeyword("CONSTRAINED-COLUMN");
        $kw137$CONSTRAINING_TABLE = SubLObjectFactory.makeKeyword("CONSTRAINING-TABLE");
        $kw138$CONSTRAINING_COLUMN = SubLObjectFactory.makeKeyword("CONSTRAINING-COLUMN");
        $sym139$MAKE_FOREIGN_KEY_CONSTRAINT = SubLObjectFactory.makeSymbol("MAKE-FOREIGN-KEY-CONSTRAINT");
        $sym140$VISIT_DEFSTRUCT_OBJECT_FOREIGN_KEY_CONSTRAINT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FOREIGN-KEY-CONSTRAINT-METHOD");
        $str141$_FK_CONSTRAINT___a_____A__A__ = SubLObjectFactory.makeString("<FK-CONSTRAINT: ~a -> ~A(~A)>");
        $sym142$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_FOREIGN_KEY_CONSTRAINT_METHO = SubLObjectFactory.makeSymbol("FIND-CORRESPONDING-ITEM-IN-SEMANTICS-FOREIGN-KEY-CONSTRAINT-METHOD");
        $str143$_ = SubLObjectFactory.makeString(".");
        $str144$__ = SubLObjectFactory.makeString("->");
        $sym145$SEMANTIC_OBJECT_COMPARISON_NAME_FOREIGN_KEY_CONSTRAINT_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-OBJECT-COMPARISON-NAME-FOREIGN-KEY-CONSTRAINT-METHOD");
        $sym146$PRIMARY_KEY_CONSTRAINT = SubLObjectFactory.makeSymbol("PRIMARY-KEY-CONSTRAINT");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINED-COLUMN"));
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINED-COLUMN"));
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PK-CONSTRAINT-CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PK-CONSTRAINT-CONSTRAINT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PK-CONSTRAINT-CONSTRAINED-COLUMN"));
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINED-COLUMN"));
        $sym151$PRINT_PRIMARY_KEY_CONSTRAINT = SubLObjectFactory.makeSymbol("PRINT-PRIMARY-KEY-CONSTRAINT");
        $sym152$PRIMARY_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PRIMARY-KEY-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMARY-KEY-CONSTRAINT-P"));
        $sym154$PK_CONSTRAINT_CONSTRAINT_NAME = SubLObjectFactory.makeSymbol("PK-CONSTRAINT-CONSTRAINT-NAME");
        $sym155$_CSETF_PK_CONSTRAINT_CONSTRAINT_NAME = SubLObjectFactory.makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINT-NAME");
        $sym156$PK_CONSTRAINT_CONSTRAINT_TYPE = SubLObjectFactory.makeSymbol("PK-CONSTRAINT-CONSTRAINT-TYPE");
        $sym157$_CSETF_PK_CONSTRAINT_CONSTRAINT_TYPE = SubLObjectFactory.makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINT-TYPE");
        $sym158$PK_CONSTRAINT_CONSTRAINED_COLUMN = SubLObjectFactory.makeSymbol("PK-CONSTRAINT-CONSTRAINED-COLUMN");
        $sym159$_CSETF_PK_CONSTRAINT_CONSTRAINED_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINED-COLUMN");
        $kw160$CONSTRAINT_TYPE = SubLObjectFactory.makeKeyword("CONSTRAINT-TYPE");
        $sym161$MAKE_PRIMARY_KEY_CONSTRAINT = SubLObjectFactory.makeSymbol("MAKE-PRIMARY-KEY-CONSTRAINT");
        $sym162$VISIT_DEFSTRUCT_OBJECT_PRIMARY_KEY_CONSTRAINT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PRIMARY-KEY-CONSTRAINT-METHOD");
        $str163$_PK_CONSTRAINT___a_ = SubLObjectFactory.makeString("<PK-CONSTRAINT: ~a>");
        $sym164$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_PRIMARY_KEY_CONSTRAINT_METHO = SubLObjectFactory.makeSymbol("FIND-CORRESPONDING-ITEM-IN-SEMANTICS-PRIMARY-KEY-CONSTRAINT-METHOD");
        $str165$pk_ = SubLObjectFactory.makeString("pk ");
        $sym166$SEMANTIC_OBJECT_COMPARISON_NAME_PRIMARY_KEY_CONSTRAINT_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-OBJECT-COMPARISON-NAME-PRIMARY-KEY-CONSTRAINT-METHOD");
        $sym167$COLUMN_SEMANTICS = SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS");
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLUMN-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-SEMANTICS"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-SEMANTICS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-SIZE"));
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLUMN-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN-PARSES"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE-SEMANTICS"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE-SEMANTICS-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN-SIZE"));
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C-SEMANT-COLUMN-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("C-SEMANT-COLUMN-PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("C-SEMANT-TABLE-SEMANTICS"), (SubLObject)SubLObjectFactory.makeSymbol("C-SEMANT-VALUE-SEMANTICS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("C-SEMANT-COLUMN-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("C-SEMANT-COLUMN-SIZE"));
        $list171 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-COLUMN-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-COLUMN-PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-TABLE-SEMANTICS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-VALUE-SEMANTICS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-COLUMN-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-COLUMN-SIZE"));
        $sym172$PRINT_COLUMN_SEMANTICS = SubLObjectFactory.makeSymbol("PRINT-COLUMN-SEMANTICS");
        $sym173$COLUMN_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-P"));
        $sym175$C_SEMANT_COLUMN_NAME = SubLObjectFactory.makeSymbol("C-SEMANT-COLUMN-NAME");
        $sym176$_CSETF_C_SEMANT_COLUMN_NAME = SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-COLUMN-NAME");
        $sym177$C_SEMANT_COLUMN_PARSES = SubLObjectFactory.makeSymbol("C-SEMANT-COLUMN-PARSES");
        $sym178$_CSETF_C_SEMANT_COLUMN_PARSES = SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-COLUMN-PARSES");
        $sym179$C_SEMANT_TABLE_SEMANTICS = SubLObjectFactory.makeSymbol("C-SEMANT-TABLE-SEMANTICS");
        $sym180$_CSETF_C_SEMANT_TABLE_SEMANTICS = SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-TABLE-SEMANTICS");
        $sym181$C_SEMANT_VALUE_SEMANTICS_LIST = SubLObjectFactory.makeSymbol("C-SEMANT-VALUE-SEMANTICS-LIST");
        $sym182$_CSETF_C_SEMANT_VALUE_SEMANTICS_LIST = SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-VALUE-SEMANTICS-LIST");
        $sym183$C_SEMANT_COLUMN_TYPE = SubLObjectFactory.makeSymbol("C-SEMANT-COLUMN-TYPE");
        $sym184$_CSETF_C_SEMANT_COLUMN_TYPE = SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-COLUMN-TYPE");
        $sym185$C_SEMANT_COLUMN_SIZE = SubLObjectFactory.makeSymbol("C-SEMANT-COLUMN-SIZE");
        $sym186$_CSETF_C_SEMANT_COLUMN_SIZE = SubLObjectFactory.makeSymbol("_CSETF-C-SEMANT-COLUMN-SIZE");
        $kw187$COLUMN_NAME = SubLObjectFactory.makeKeyword("COLUMN-NAME");
        $kw188$COLUMN_PARSES = SubLObjectFactory.makeKeyword("COLUMN-PARSES");
        $kw189$TABLE_SEMANTICS = SubLObjectFactory.makeKeyword("TABLE-SEMANTICS");
        $kw190$VALUE_SEMANTICS_LIST = SubLObjectFactory.makeKeyword("VALUE-SEMANTICS-LIST");
        $kw191$COLUMN_TYPE = SubLObjectFactory.makeKeyword("COLUMN-TYPE");
        $kw192$COLUMN_SIZE = SubLObjectFactory.makeKeyword("COLUMN-SIZE");
        $sym193$MAKE_COLUMN_SEMANTICS = SubLObjectFactory.makeSymbol("MAKE-COLUMN-SEMANTICS");
        $sym194$VISIT_DEFSTRUCT_OBJECT_COLUMN_SEMANTICS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-COLUMN-SEMANTICS-METHOD");
        $str195$_COLUMN___a__a__A__A__ = SubLObjectFactory.makeString("<COLUMN: ~a.~a/~A(~A)>");
        $kw196$UNK = SubLObjectFactory.makeKeyword("UNK");
        $list197 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-SEMANTICS"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym198$COLUMN_SEMANTICS_VALUE_SEMANTICS_LIST = SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-VALUE-SEMANTICS-LIST");
        $str199$ = SubLObjectFactory.makeString("");
        $str200$_ = SubLObjectFactory.makeString("(");
        $str201$_ = SubLObjectFactory.makeString(")");
        $sym202$VALUE_SEMANTICS_P = SubLObjectFactory.makeSymbol("VALUE-SEMANTICS-P");
        $sym203$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_COLUMN_SEMANTICS_METHOD = SubLObjectFactory.makeSymbol("FIND-CORRESPONDING-ITEM-IN-SEMANTICS-COLUMN-SEMANTICS-METHOD");
        $str204$col_ = SubLObjectFactory.makeString("col ");
        $sym205$SEMANTIC_OBJECT_COMPARISON_NAME_COLUMN_SEMANTICS_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-OBJECT-COMPARISON-NAME-COLUMN-SEMANTICS-METHOD");
        $sym206$VALUE_SEMANTICS = SubLObjectFactory.makeSymbol("VALUE-SEMANTICS");
        $list207 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-PARSES"));
        $list208 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE-PARSES"));
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V-SEMANT-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("V-SEMANT-VALUE-PARSES"));
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-V-SEMANT-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-V-SEMANT-VALUE-PARSES"));
        $sym211$PRINT_VALUE_SEMANTICS = SubLObjectFactory.makeSymbol("PRINT-VALUE-SEMANTICS");
        $sym212$VALUE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("VALUE-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-SEMANTICS-P"));
        $sym214$V_SEMANT_VALUE = SubLObjectFactory.makeSymbol("V-SEMANT-VALUE");
        $sym215$_CSETF_V_SEMANT_VALUE = SubLObjectFactory.makeSymbol("_CSETF-V-SEMANT-VALUE");
        $sym216$V_SEMANT_VALUE_PARSES = SubLObjectFactory.makeSymbol("V-SEMANT-VALUE-PARSES");
        $sym217$_CSETF_V_SEMANT_VALUE_PARSES = SubLObjectFactory.makeSymbol("_CSETF-V-SEMANT-VALUE-PARSES");
        $kw218$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw219$VALUE_PARSES = SubLObjectFactory.makeKeyword("VALUE-PARSES");
        $sym220$MAKE_VALUE_SEMANTICS = SubLObjectFactory.makeSymbol("MAKE-VALUE-SEMANTICS");
        $sym221$VISIT_DEFSTRUCT_OBJECT_VALUE_SEMANTICS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-VALUE-SEMANTICS-METHOD");
        $str222$_VALUE___s__a_ = SubLObjectFactory.makeString("<VALUE: ~s ~a>");
        $kw223$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym224$_DB_OUTPUT_SPEC_ISG_ = SubLObjectFactory.makeSymbol("*DB-OUTPUT-SPEC-ISG*");
        $sym225$DATABASE_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("DATABASE-OUTPUT-SPEC");
        $sym226$DATABASE_OUTPUT_SPEC_P = SubLObjectFactory.makeSymbol("DATABASE-OUTPUT-SPEC-P");
        $list227 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS1"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS2"), (SubLObject)SubLObjectFactory.makeSymbol("RECIPE"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE"));
        $list228 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTICS1"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTICS2"), (SubLObject)SubLObjectFactory.makeKeyword("RECIPE"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTICS"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC-RECIPE"));
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-ID"), (SubLObject)SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-SEMANTICS1"), (SubLObject)SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-SEMANTICS2"), (SubLObject)SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-RECIPE"), (SubLObject)SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-SEMANTICS"), (SubLObject)SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-SEMANTIC-RECIPE"));
        $list230 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS1"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS2"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-RECIPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTIC-RECIPE"));
        $sym231$PRINT_DATABASE_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("PRINT-DATABASE-OUTPUT-SPEC");
        $sym232$DATABASE_OUTPUT_SPEC_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("DATABASE-OUTPUT-SPEC-PRINT-FUNCTION-TRAMPOLINE");
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("DATABASE-OUTPUT-SPEC-P"));
        $sym234$DB_OUTPUT_SPEC_ID = SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-ID");
        $sym235$_CSETF_DB_OUTPUT_SPEC_ID = SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-ID");
        $sym236$DB_OUTPUT_SPEC_SEMANTICS1 = SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-SEMANTICS1");
        $sym237$_CSETF_DB_OUTPUT_SPEC_SEMANTICS1 = SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS1");
        $sym238$DB_OUTPUT_SPEC_SEMANTICS2 = SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-SEMANTICS2");
        $sym239$_CSETF_DB_OUTPUT_SPEC_SEMANTICS2 = SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS2");
        $sym240$DB_OUTPUT_SPEC_RECIPE = SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-RECIPE");
        $sym241$_CSETF_DB_OUTPUT_SPEC_RECIPE = SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-RECIPE");
        $sym242$DB_OUTPUT_SPEC_SEMANTICS = SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-SEMANTICS");
        $sym243$_CSETF_DB_OUTPUT_SPEC_SEMANTICS = SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS");
        $sym244$DB_OUTPUT_SPEC_SEMANTIC_RECIPE = SubLObjectFactory.makeSymbol("DB-OUTPUT-SPEC-SEMANTIC-RECIPE");
        $sym245$_CSETF_DB_OUTPUT_SPEC_SEMANTIC_RECIPE = SubLObjectFactory.makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTIC-RECIPE");
        $kw246$ID = SubLObjectFactory.makeKeyword("ID");
        $kw247$SEMANTICS1 = SubLObjectFactory.makeKeyword("SEMANTICS1");
        $kw248$SEMANTICS2 = SubLObjectFactory.makeKeyword("SEMANTICS2");
        $kw249$RECIPE = SubLObjectFactory.makeKeyword("RECIPE");
        $kw250$SEMANTIC_RECIPE = SubLObjectFactory.makeKeyword("SEMANTIC-RECIPE");
        $sym251$MAKE_DATABASE_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("MAKE-DATABASE-OUTPUT-SPEC");
        $sym252$VISIT_DEFSTRUCT_OBJECT_DATABASE_OUTPUT_SPEC_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-DATABASE-OUTPUT-SPEC-METHOD");
        $str253$_DB_OUTPUT_ = SubLObjectFactory.makeString("<DB-OUTPUT:");
        $str254$_ = SubLObjectFactory.makeString(" ");
        $str255$Sem_Recipe__ = SubLObjectFactory.makeString("Sem-Recipe: ");
        $str256$_ = SubLObjectFactory.makeString(">");
        $str257$____________________________ = SubLObjectFactory.makeString("----------------------------");
        $str258$unable_to_drop__A_from__A = SubLObjectFactory.makeString("unable to drop ~A from ~A");
        $str259$unable_to_add__A_to__A = SubLObjectFactory.makeString("unable to add ~A to ~A");
        $str260$unable_to_remove__A_from__A = SubLObjectFactory.makeString("unable to remove ~A from ~A");
        $str261$unable_to_set_column_corespondenc = SubLObjectFactory.makeString("unable to set column-corespondence list for ~S");
        $str262$unable_to_get_column_corespondenc = SubLObjectFactory.makeString("unable to get column-corespondence list for ~S");
        $str263$unable_to_set_start_index_of__A_t = SubLObjectFactory.makeString("unable to set start index of ~A to ~A");
        $str264$unable_to_set_end_index_of__A_to_ = SubLObjectFactory.makeString("unable to set end index of ~A to ~A");
        $str265$Don_t_know_how_to_copy__S = SubLObjectFactory.makeString("Don't know how to copy ~S");
        $sym266$TABLE_MERGER = SubLObjectFactory.makeSymbol("TABLE-MERGER");
        $sym267$TABLE_MERGER_P = SubLObjectFactory.makeSymbol("TABLE-MERGER-P");
        $list268 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("OUTPUT-SPEC"), SubLObjectFactory.makeSymbol("SOURCES"), SubLObjectFactory.makeSymbol("TARGET"), SubLObjectFactory.makeSymbol("COLUMN-CORRESPONDENCE-LIST"), SubLObjectFactory.makeSymbol("ADDED"), SubLObjectFactory.makeSymbol("DROPPED"), SubLObjectFactory.makeSymbol("SQL-START-INDEX"), SubLObjectFactory.makeSymbol("SQL-END-INDEX") });
        $list269 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), SubLObjectFactory.makeKeyword("SOURCES"), SubLObjectFactory.makeKeyword("TARGET"), SubLObjectFactory.makeKeyword("COLUMN-CORRESPONDENCE-LIST"), SubLObjectFactory.makeKeyword("ADDED"), SubLObjectFactory.makeKeyword("DROPPED"), SubLObjectFactory.makeKeyword("SQL-START-INDEX"), SubLObjectFactory.makeKeyword("SQL-END-INDEX") });
        $list270 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TABLE-MERGER-ID"), SubLObjectFactory.makeSymbol("TABLE-MERGER-OUTPUT-SPEC"), SubLObjectFactory.makeSymbol("TABLE-MERGER-SOURCES"), SubLObjectFactory.makeSymbol("TABLE-MERGER-TARGET"), SubLObjectFactory.makeSymbol("TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST"), SubLObjectFactory.makeSymbol("TABLE-MERGER-ADDED"), SubLObjectFactory.makeSymbol("TABLE-MERGER-DROPPED"), SubLObjectFactory.makeSymbol("TABLE-MERGER-SQL-START-INDEX"), SubLObjectFactory.makeSymbol("TABLE-MERGER-SQL-END-INDEX") });
        $list271 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-ID"), SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-OUTPUT-SPEC"), SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-SOURCES"), SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-TARGET"), SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST"), SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-ADDED"), SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-DROPPED"), SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-SQL-START-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-SQL-END-INDEX") });
        $sym272$PRINT_TABLE_MERGER = SubLObjectFactory.makeSymbol("PRINT-TABLE-MERGER");
        $sym273$TABLE_MERGER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TABLE-MERGER-PRINT-FUNCTION-TRAMPOLINE");
        $list274 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-MERGER-P"));
        $sym275$TABLE_MERGER_ID = SubLObjectFactory.makeSymbol("TABLE-MERGER-ID");
        $sym276$_CSETF_TABLE_MERGER_ID = SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-ID");
        $sym277$TABLE_MERGER_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("TABLE-MERGER-OUTPUT-SPEC");
        $sym278$_CSETF_TABLE_MERGER_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-OUTPUT-SPEC");
        $sym279$TABLE_MERGER_SOURCES = SubLObjectFactory.makeSymbol("TABLE-MERGER-SOURCES");
        $sym280$_CSETF_TABLE_MERGER_SOURCES = SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-SOURCES");
        $sym281$TABLE_MERGER_TARGET = SubLObjectFactory.makeSymbol("TABLE-MERGER-TARGET");
        $sym282$_CSETF_TABLE_MERGER_TARGET = SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-TARGET");
        $sym283$TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST = SubLObjectFactory.makeSymbol("TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST");
        $sym284$_CSETF_TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST = SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST");
        $sym285$TABLE_MERGER_ADDED = SubLObjectFactory.makeSymbol("TABLE-MERGER-ADDED");
        $sym286$_CSETF_TABLE_MERGER_ADDED = SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-ADDED");
        $sym287$TABLE_MERGER_DROPPED = SubLObjectFactory.makeSymbol("TABLE-MERGER-DROPPED");
        $sym288$_CSETF_TABLE_MERGER_DROPPED = SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-DROPPED");
        $sym289$TABLE_MERGER_SQL_START_INDEX = SubLObjectFactory.makeSymbol("TABLE-MERGER-SQL-START-INDEX");
        $sym290$_CSETF_TABLE_MERGER_SQL_START_INDEX = SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-SQL-START-INDEX");
        $sym291$TABLE_MERGER_SQL_END_INDEX = SubLObjectFactory.makeSymbol("TABLE-MERGER-SQL-END-INDEX");
        $sym292$_CSETF_TABLE_MERGER_SQL_END_INDEX = SubLObjectFactory.makeSymbol("_CSETF-TABLE-MERGER-SQL-END-INDEX");
        $kw293$SOURCES = SubLObjectFactory.makeKeyword("SOURCES");
        $kw294$TARGET = SubLObjectFactory.makeKeyword("TARGET");
        $kw295$COLUMN_CORRESPONDENCE_LIST = SubLObjectFactory.makeKeyword("COLUMN-CORRESPONDENCE-LIST");
        $kw296$ADDED = SubLObjectFactory.makeKeyword("ADDED");
        $kw297$DROPPED = SubLObjectFactory.makeKeyword("DROPPED");
        $kw298$SQL_START_INDEX = SubLObjectFactory.makeKeyword("SQL-START-INDEX");
        $kw299$SQL_END_INDEX = SubLObjectFactory.makeKeyword("SQL-END-INDEX");
        $sym300$MAKE_TABLE_MERGER = SubLObjectFactory.makeSymbol("MAKE-TABLE-MERGER");
        $sym301$VISIT_DEFSTRUCT_OBJECT_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TABLE-MERGER-METHOD");
        $str302$_TABLE_MERGER__A_ = SubLObjectFactory.makeString("<TABLE-MERGER-~A:");
        $str303$____ = SubLObjectFactory.makeString(" -> ");
        $str304$_adds__ = SubLObjectFactory.makeString(" adds: ");
        $str305$_drops__ = SubLObjectFactory.makeString(" drops: ");
        $str306$_SQL___A__A_ = SubLObjectFactory.makeString(" SQL:(~A-~A)");
        $sym307$SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-STEP-P-TABLE-MERGER-METHOD");
        $sym308$EMPTY_SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("EMPTY-SEMANTIC-RECIPE-STEP-P-TABLE-MERGER-METHOD");
        $sym309$SEMANTIC_RECIPE_APPEND_TO_DROPS_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-APPEND-TO-DROPS-TABLE-MERGER-METHOD");
        $sym310$SEMANTIC_RECIPE_APPEND_TO_ADDS_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-APPEND-TO-ADDS-TABLE-MERGER-METHOD");
        $sym311$SEMANTIC_RECIPE_REMOVE_FROM_DROPS_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-REMOVE-FROM-DROPS-TABLE-MERGER-METHOD");
        $sym312$SEMANTIC_RECIPE_REMOVE_FROM_ADDS_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-REMOVE-FROM-ADDS-TABLE-MERGER-METHOD");
        $sym313$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_ = SubLObjectFactory.makeSymbol("SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-TABLE-MERGER-METHOD");
        $sym314$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_METH = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-TABLE-MERGER-METHOD");
        $sym315$SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-TABLE-MERGER-METHOD");
        $sym316$SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-TABLE-MERGER-METHOD");
        $sym317$SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-TABLE-MERGER-METHOD");
        $list318 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-SOURCE-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-TARGET-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $str319$unable_to_find_correspondent__add = SubLObjectFactory.makeString("unable to find correspondent (added) for ~A in ~A");
        $str320$unable_to_find_correspondent__dro = SubLObjectFactory.makeString("unable to find correspondent (dropped) for ~A in ~A");
        $sym321$SEMANTIC_RECIPE_STEP_COPY_TABLE_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-STEP-COPY-TABLE-MERGER-METHOD");
        $sym322$COLUMN_MERGER = SubLObjectFactory.makeSymbol("COLUMN-MERGER");
        $sym323$COLUMN_MERGER_P = SubLObjectFactory.makeSymbol("COLUMN-MERGER-P");
        $list324 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCES"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-CORRESPONDENCE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ADDED"), (SubLObject)SubLObjectFactory.makeSymbol("DROPPED"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-END-INDEX"));
        $list325 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCES"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN-CORRESPONDENCE-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("ADDED"), (SubLObject)SubLObjectFactory.makeKeyword("DROPPED"), (SubLObject)SubLObjectFactory.makeKeyword("SQL-START-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("SQL-END-INDEX"));
        $list326 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLUMN-MERGER-OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-MERGER-SOURCES"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-MERGER-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-MERGER-ADDED"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-MERGER-DROPPED"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-MERGER-SQL-START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-MERGER-SQL-END-INDEX"));
        $list327 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-SOURCES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-ADDED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-DROPPED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-SQL-START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-SQL-END-INDEX"));
        $sym328$PRINT_COLUMN_MERGER = SubLObjectFactory.makeSymbol("PRINT-COLUMN-MERGER");
        $sym329$COLUMN_MERGER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("COLUMN-MERGER-PRINT-FUNCTION-TRAMPOLINE");
        $list330 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-MERGER-P"));
        $sym331$COLUMN_MERGER_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("COLUMN-MERGER-OUTPUT-SPEC");
        $sym332$_CSETF_COLUMN_MERGER_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-OUTPUT-SPEC");
        $sym333$COLUMN_MERGER_SOURCES = SubLObjectFactory.makeSymbol("COLUMN-MERGER-SOURCES");
        $sym334$_CSETF_COLUMN_MERGER_SOURCES = SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-SOURCES");
        $sym335$COLUMN_MERGER_TARGET = SubLObjectFactory.makeSymbol("COLUMN-MERGER-TARGET");
        $sym336$_CSETF_COLUMN_MERGER_TARGET = SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-TARGET");
        $sym337$COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST = SubLObjectFactory.makeSymbol("COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST");
        $sym338$_CSETF_COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST = SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST");
        $sym339$COLUMN_MERGER_ADDED = SubLObjectFactory.makeSymbol("COLUMN-MERGER-ADDED");
        $sym340$_CSETF_COLUMN_MERGER_ADDED = SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-ADDED");
        $sym341$COLUMN_MERGER_DROPPED = SubLObjectFactory.makeSymbol("COLUMN-MERGER-DROPPED");
        $sym342$_CSETF_COLUMN_MERGER_DROPPED = SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-DROPPED");
        $sym343$COLUMN_MERGER_SQL_START_INDEX = SubLObjectFactory.makeSymbol("COLUMN-MERGER-SQL-START-INDEX");
        $sym344$_CSETF_COLUMN_MERGER_SQL_START_INDEX = SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-SQL-START-INDEX");
        $sym345$COLUMN_MERGER_SQL_END_INDEX = SubLObjectFactory.makeSymbol("COLUMN-MERGER-SQL-END-INDEX");
        $sym346$_CSETF_COLUMN_MERGER_SQL_END_INDEX = SubLObjectFactory.makeSymbol("_CSETF-COLUMN-MERGER-SQL-END-INDEX");
        $sym347$MAKE_COLUMN_MERGER = SubLObjectFactory.makeSymbol("MAKE-COLUMN-MERGER");
        $sym348$VISIT_DEFSTRUCT_OBJECT_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-COLUMN-MERGER-METHOD");
        $str349$_COLUMN_MERGER_ = SubLObjectFactory.makeString("<COLUMN-MERGER:");
        $sym350$SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-STEP-P-COLUMN-MERGER-METHOD");
        $sym351$EMPTY_SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("EMPTY-SEMANTIC-RECIPE-STEP-P-COLUMN-MERGER-METHOD");
        $sym352$SEMANTIC_RECIPE_APPEND_TO_DROPS_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-APPEND-TO-DROPS-COLUMN-MERGER-METHOD");
        $sym353$SEMANTIC_RECIPE_APPEND_TO_ADDS_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-APPEND-TO-ADDS-COLUMN-MERGER-METHOD");
        $sym354$SEMANTIC_RECIPE_REMOVE_FROM_DROPS_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-REMOVE-FROM-DROPS-COLUMN-MERGER-METHOD");
        $sym355$SEMANTIC_RECIPE_REMOVE_FROM_ADDS_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-REMOVE-FROM-ADDS-COLUMN-MERGER-METHOD");
        $sym356$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER = SubLObjectFactory.makeSymbol("SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-COLUMN-MERGER-METHOD");
        $sym357$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER_MET = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-COLUMN-MERGER-METHOD");
        $sym358$SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-COLUMN-MERGER-METHOD");
        $sym359$SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-COLUMN-MERGER-METHOD");
        $sym360$SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-COLUMN-MERGER-METHOD");
        $sym361$COLUMN_SEMANTICS_TABLE_NAME = SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-TABLE-NAME");
        $list362 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-SOURCE-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-TARGET-COLUMN"));
        $str363$unable_to_find_correspondent_for_ = SubLObjectFactory.makeString("unable to find correspondent for ~A in ~A");
        $sym364$SEMANTIC_RECIPE_STEP_COPY_COLUMN_MERGER_METHOD = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-STEP-COPY-COLUMN-MERGER-METHOD");
        $sym365$SEMANTIC_RECIPE_ADD_OR_DROP_P = SubLObjectFactory.makeSymbol("SEMANTIC-RECIPE-ADD-OR-DROP-P");
        $list366 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DROP"), (SubLObject)SubLObjectFactory.makeKeyword("ADD"));
        $kw367$ADD = SubLObjectFactory.makeKeyword("ADD");
        $kw368$DROP = SubLObjectFactory.makeKeyword("DROP");
        $sym369$SQL_CONJUNCTION = SubLObjectFactory.makeSymbol("SQL-CONJUNCTION");
        $sym370$SQL_CONJUNCTION_P = SubLObjectFactory.makeSymbol("SQL-CONJUNCTION-P");
        $list371 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTS"));
        $list372 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONJUNCTS"));
        $list373 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-CONJUNCTION-CONJUNCTS"));
        $list374 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-CONJUNCTION-CONJUNCTS"));
        $sym375$PRINT_SQL_CONJUNCTION = SubLObjectFactory.makeSymbol("PRINT-SQL-CONJUNCTION");
        $sym376$SQL_CONJUNCTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-CONJUNCTION-PRINT-FUNCTION-TRAMPOLINE");
        $list377 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-CONJUNCTION-P"));
        $sym378$SQL_CONJUNCTION_CONJUNCTS = SubLObjectFactory.makeSymbol("SQL-CONJUNCTION-CONJUNCTS");
        $sym379$_CSETF_SQL_CONJUNCTION_CONJUNCTS = SubLObjectFactory.makeSymbol("_CSETF-SQL-CONJUNCTION-CONJUNCTS");
        $kw380$CONJUNCTS = SubLObjectFactory.makeKeyword("CONJUNCTS");
        $sym381$MAKE_SQL_CONJUNCTION = SubLObjectFactory.makeSymbol("MAKE-SQL-CONJUNCTION");
        $sym382$VISIT_DEFSTRUCT_OBJECT_SQL_CONJUNCTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-CONJUNCTION-METHOD");
        $str383$_AND_ = SubLObjectFactory.makeString(" AND ");
        $sym384$SQL_CONDITION_P = SubLObjectFactory.makeSymbol("SQL-CONDITION-P");
        $sym385$SQL_DISJUNCTION = SubLObjectFactory.makeSymbol("SQL-DISJUNCTION");
        $sym386$SQL_DISJUNCTION_P = SubLObjectFactory.makeSymbol("SQL-DISJUNCTION-P");
        $list387 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCTS"));
        $list388 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DISJUNCTS"));
        $list389 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-DISJUNCTION-DISJUNCTS"));
        $list390 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-DISJUNCTION-DISJUNCTS"));
        $sym391$PRINT_SQL_DISJUNCTION = SubLObjectFactory.makeSymbol("PRINT-SQL-DISJUNCTION");
        $sym392$SQL_DISJUNCTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-DISJUNCTION-PRINT-FUNCTION-TRAMPOLINE");
        $list393 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-DISJUNCTION-P"));
        $sym394$SQL_DISJUNCTION_DISJUNCTS = SubLObjectFactory.makeSymbol("SQL-DISJUNCTION-DISJUNCTS");
        $sym395$_CSETF_SQL_DISJUNCTION_DISJUNCTS = SubLObjectFactory.makeSymbol("_CSETF-SQL-DISJUNCTION-DISJUNCTS");
        $kw396$DISJUNCTS = SubLObjectFactory.makeKeyword("DISJUNCTS");
        $sym397$MAKE_SQL_DISJUNCTION = SubLObjectFactory.makeSymbol("MAKE-SQL-DISJUNCTION");
        $sym398$VISIT_DEFSTRUCT_OBJECT_SQL_DISJUNCTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-DISJUNCTION-METHOD");
        $str399$_OR_ = SubLObjectFactory.makeString(" OR ");
        $sym400$SQL_COPY_TABLE = SubLObjectFactory.makeSymbol("SQL-COPY-TABLE");
        $sym401$SQL_COPY_TABLE_P = SubLObjectFactory.makeSymbol("SQL-COPY-TABLE-P");
        $list402 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("TO"));
        $list403 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)SubLObjectFactory.makeKeyword("TO"));
        $list404 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-COPY-TABLE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-COPY-TABLE-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-COPY-TABLE-TO"));
        $list405 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-COPY-TABLE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-COPY-TABLE-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-COPY-TABLE-TO"));
        $sym406$PRINT_SQL_COPY_TABLE = SubLObjectFactory.makeSymbol("PRINT-SQL-COPY-TABLE");
        $sym407$SQL_COPY_TABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-COPY-TABLE-PRINT-FUNCTION-TRAMPOLINE");
        $list408 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-COPY-TABLE-P"));
        $sym409$SQL_COPY_TABLE_TABLE = SubLObjectFactory.makeSymbol("SQL-COPY-TABLE-TABLE");
        $sym410$_CSETF_SQL_COPY_TABLE_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-COPY-TABLE-TABLE");
        $sym411$SQL_COPY_TABLE_FROM = SubLObjectFactory.makeSymbol("SQL-COPY-TABLE-FROM");
        $sym412$_CSETF_SQL_COPY_TABLE_FROM = SubLObjectFactory.makeSymbol("_CSETF-SQL-COPY-TABLE-FROM");
        $sym413$SQL_COPY_TABLE_TO = SubLObjectFactory.makeSymbol("SQL-COPY-TABLE-TO");
        $sym414$_CSETF_SQL_COPY_TABLE_TO = SubLObjectFactory.makeSymbol("_CSETF-SQL-COPY-TABLE-TO");
        $kw415$TABLE = SubLObjectFactory.makeKeyword("TABLE");
        $kw416$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw417$TO = SubLObjectFactory.makeKeyword("TO");
        $sym418$MAKE_SQL_COPY_TABLE = SubLObjectFactory.makeSymbol("MAKE-SQL-COPY-TABLE");
        $sym419$VISIT_DEFSTRUCT_OBJECT_SQL_COPY_TABLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-COPY-TABLE-METHOD");
        $str420$COPY_TABLE__a_FROM_DATABASE__a_TO = SubLObjectFactory.makeString("COPY TABLE ~a FROM DATABASE ~a TO DATABASE ~a");
        $sym421$SQL_INSERT_INTO = SubLObjectFactory.makeSymbol("SQL-INSERT-INTO");
        $sym422$SQL_INSERT_INTO_P = SubLObjectFactory.makeSymbol("SQL-INSERT-INTO-P");
        $list423 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMNS"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $list424 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMNS"), (SubLObject)SubLObjectFactory.makeKeyword("DATA"));
        $list425 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-INSERT-INTO-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-INSERT-INTO-COLUMNS"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-INSERT-INTO-DATA"));
        $list426 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-INSERT-INTO-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-INSERT-INTO-COLUMNS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-INSERT-INTO-DATA"));
        $sym427$PRINT_SQL_INSERT_INTO = SubLObjectFactory.makeSymbol("PRINT-SQL-INSERT-INTO");
        $sym428$SQL_INSERT_INTO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-INSERT-INTO-PRINT-FUNCTION-TRAMPOLINE");
        $list429 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-INSERT-INTO-P"));
        $sym430$SQL_INSERT_INTO_TABLE = SubLObjectFactory.makeSymbol("SQL-INSERT-INTO-TABLE");
        $sym431$_CSETF_SQL_INSERT_INTO_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-INSERT-INTO-TABLE");
        $sym432$SQL_INSERT_INTO_COLUMNS = SubLObjectFactory.makeSymbol("SQL-INSERT-INTO-COLUMNS");
        $sym433$_CSETF_SQL_INSERT_INTO_COLUMNS = SubLObjectFactory.makeSymbol("_CSETF-SQL-INSERT-INTO-COLUMNS");
        $sym434$SQL_INSERT_INTO_DATA = SubLObjectFactory.makeSymbol("SQL-INSERT-INTO-DATA");
        $sym435$_CSETF_SQL_INSERT_INTO_DATA = SubLObjectFactory.makeSymbol("_CSETF-SQL-INSERT-INTO-DATA");
        $kw436$COLUMNS = SubLObjectFactory.makeKeyword("COLUMNS");
        $kw437$DATA = SubLObjectFactory.makeKeyword("DATA");
        $sym438$MAKE_SQL_INSERT_INTO = SubLObjectFactory.makeSymbol("MAKE-SQL-INSERT-INTO");
        $sym439$VISIT_DEFSTRUCT_OBJECT_SQL_INSERT_INTO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-INSERT-INTO-METHOD");
        $str440$INSERT_INTO__a___a___a = SubLObjectFactory.makeString("INSERT INTO ~a (~a) ~a");
        $str441$__ = SubLObjectFactory.makeString(", ");
        $sym442$SQL_TABLE_EXPRESSION_P = SubLObjectFactory.makeSymbol("SQL-TABLE-EXPRESSION-P");
        $sym443$SQL_SELECT_FROM = SubLObjectFactory.makeSymbol("SQL-SELECT-FROM");
        $sym444$SQL_SELECT_FROM_P = SubLObjectFactory.makeSymbol("SQL-SELECT-FROM-P");
        $list445 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLUMNS"), (SubLObject)SubLObjectFactory.makeSymbol("TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONS"));
        $list446 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLUMNS"), (SubLObject)SubLObjectFactory.makeKeyword("TABLES"), (SubLObject)SubLObjectFactory.makeKeyword("CONDITIONS"));
        $list447 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-SELECT-FROM-COLUMNS"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-SELECT-FROM-TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-SELECT-FROM-CONDITIONS"));
        $list448 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-SELECT-FROM-COLUMNS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-SELECT-FROM-TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-SELECT-FROM-CONDITIONS"));
        $sym449$PRINT_SQL_SELECT_FROM = SubLObjectFactory.makeSymbol("PRINT-SQL-SELECT-FROM");
        $sym450$SQL_SELECT_FROM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-SELECT-FROM-PRINT-FUNCTION-TRAMPOLINE");
        $list451 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-SELECT-FROM-P"));
        $sym452$SQL_SELECT_FROM_COLUMNS = SubLObjectFactory.makeSymbol("SQL-SELECT-FROM-COLUMNS");
        $sym453$_CSETF_SQL_SELECT_FROM_COLUMNS = SubLObjectFactory.makeSymbol("_CSETF-SQL-SELECT-FROM-COLUMNS");
        $sym454$SQL_SELECT_FROM_TABLES = SubLObjectFactory.makeSymbol("SQL-SELECT-FROM-TABLES");
        $sym455$_CSETF_SQL_SELECT_FROM_TABLES = SubLObjectFactory.makeSymbol("_CSETF-SQL-SELECT-FROM-TABLES");
        $sym456$SQL_SELECT_FROM_CONDITIONS = SubLObjectFactory.makeSymbol("SQL-SELECT-FROM-CONDITIONS");
        $sym457$_CSETF_SQL_SELECT_FROM_CONDITIONS = SubLObjectFactory.makeSymbol("_CSETF-SQL-SELECT-FROM-CONDITIONS");
        $kw458$TABLES = SubLObjectFactory.makeKeyword("TABLES");
        $kw459$CONDITIONS = SubLObjectFactory.makeKeyword("CONDITIONS");
        $sym460$MAKE_SQL_SELECT_FROM = SubLObjectFactory.makeSymbol("MAKE-SQL-SELECT-FROM");
        $sym461$VISIT_DEFSTRUCT_OBJECT_SQL_SELECT_FROM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-SELECT-FROM-METHOD");
        $str462$SELECT__a_FROM__a = SubLObjectFactory.makeString("SELECT ~a FROM ~a");
        $str463$_WHERE__a = SubLObjectFactory.makeString(" WHERE ~a");
        $str464$_AND = SubLObjectFactory.makeString(" AND");
        $sym465$SQL_EXCEPT = SubLObjectFactory.makeSymbol("SQL-EXCEPT");
        $sym466$SQL_EXCEPT_P = SubLObjectFactory.makeSymbol("SQL-EXCEPT-P");
        $list467 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE1"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE2"));
        $list468 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE1"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE2"));
        $list469 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-EXCEPT-TABLE1"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-EXCEPT-TABLE2"));
        $list470 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-EXCEPT-TABLE1"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-EXCEPT-TABLE2"));
        $sym471$PRINT_SQL_EXCEPT = SubLObjectFactory.makeSymbol("PRINT-SQL-EXCEPT");
        $sym472$SQL_EXCEPT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-EXCEPT-PRINT-FUNCTION-TRAMPOLINE");
        $list473 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-EXCEPT-P"));
        $sym474$SQL_EXCEPT_TABLE1 = SubLObjectFactory.makeSymbol("SQL-EXCEPT-TABLE1");
        $sym475$_CSETF_SQL_EXCEPT_TABLE1 = SubLObjectFactory.makeSymbol("_CSETF-SQL-EXCEPT-TABLE1");
        $sym476$SQL_EXCEPT_TABLE2 = SubLObjectFactory.makeSymbol("SQL-EXCEPT-TABLE2");
        $sym477$_CSETF_SQL_EXCEPT_TABLE2 = SubLObjectFactory.makeSymbol("_CSETF-SQL-EXCEPT-TABLE2");
        $kw478$TABLE1 = SubLObjectFactory.makeKeyword("TABLE1");
        $kw479$TABLE2 = SubLObjectFactory.makeKeyword("TABLE2");
        $sym480$MAKE_SQL_EXCEPT = SubLObjectFactory.makeSymbol("MAKE-SQL-EXCEPT");
        $sym481$VISIT_DEFSTRUCT_OBJECT_SQL_EXCEPT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-EXCEPT-METHOD");
        $str482$_a_EXCEPT__a = SubLObjectFactory.makeString("~a EXCEPT ~a");
        $sym483$SQL_ALIAS = SubLObjectFactory.makeSymbol("SQL-ALIAS");
        $sym484$SQL_ALIAS_P = SubLObjectFactory.makeSymbol("SQL-ALIAS-P");
        $list485 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("ALIAS"));
        $list486 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("ALIAS"));
        $list487 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-ALIAS-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-ALIAS-ALIAS"));
        $list488 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-ALIAS-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-ALIAS-ALIAS"));
        $sym489$PRINT_SQL_ALIAS = SubLObjectFactory.makeSymbol("PRINT-SQL-ALIAS");
        $sym490$SQL_ALIAS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-ALIAS-PRINT-FUNCTION-TRAMPOLINE");
        $list491 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-ALIAS-P"));
        $sym492$SQL_ALIAS_TABLE = SubLObjectFactory.makeSymbol("SQL-ALIAS-TABLE");
        $sym493$_CSETF_SQL_ALIAS_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-ALIAS-TABLE");
        $sym494$SQL_ALIAS_ALIAS = SubLObjectFactory.makeSymbol("SQL-ALIAS-ALIAS");
        $sym495$_CSETF_SQL_ALIAS_ALIAS = SubLObjectFactory.makeSymbol("_CSETF-SQL-ALIAS-ALIAS");
        $kw496$ALIAS = SubLObjectFactory.makeKeyword("ALIAS");
        $sym497$MAKE_SQL_ALIAS = SubLObjectFactory.makeSymbol("MAKE-SQL-ALIAS");
        $sym498$VISIT_DEFSTRUCT_OBJECT_SQL_ALIAS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-ALIAS-METHOD");
        $str499$_a_AS__a = SubLObjectFactory.makeString("~a AS ~a");
        $sym500$SQL_COLUMN_EQUAL = SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL");
        $sym501$SQL_COLUMN_EQUAL_P = SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-P");
        $list502 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE1"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN1"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE2"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN2"));
        $list503 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE1"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN1"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE2"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN2"));
        $list504 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-TABLE1"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-COLUMN1"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-TABLE2"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-COLUMN2"));
        $list505 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-COLUMN-EQUAL-TABLE1"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-COLUMN-EQUAL-COLUMN1"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-COLUMN-EQUAL-TABLE2"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-COLUMN-EQUAL-COLUMN2"));
        $sym506$PRINT_SQL_COLUMN_EQUAL = SubLObjectFactory.makeSymbol("PRINT-SQL-COLUMN-EQUAL");
        $sym507$SQL_COLUMN_EQUAL_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-PRINT-FUNCTION-TRAMPOLINE");
        $list508 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-P"));
        $sym509$SQL_COLUMN_EQUAL_TABLE1 = SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-TABLE1");
        $sym510$_CSETF_SQL_COLUMN_EQUAL_TABLE1 = SubLObjectFactory.makeSymbol("_CSETF-SQL-COLUMN-EQUAL-TABLE1");
        $sym511$SQL_COLUMN_EQUAL_COLUMN1 = SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-COLUMN1");
        $sym512$_CSETF_SQL_COLUMN_EQUAL_COLUMN1 = SubLObjectFactory.makeSymbol("_CSETF-SQL-COLUMN-EQUAL-COLUMN1");
        $sym513$SQL_COLUMN_EQUAL_TABLE2 = SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-TABLE2");
        $sym514$_CSETF_SQL_COLUMN_EQUAL_TABLE2 = SubLObjectFactory.makeSymbol("_CSETF-SQL-COLUMN-EQUAL-TABLE2");
        $sym515$SQL_COLUMN_EQUAL_COLUMN2 = SubLObjectFactory.makeSymbol("SQL-COLUMN-EQUAL-COLUMN2");
        $sym516$_CSETF_SQL_COLUMN_EQUAL_COLUMN2 = SubLObjectFactory.makeSymbol("_CSETF-SQL-COLUMN-EQUAL-COLUMN2");
        $kw517$COLUMN1 = SubLObjectFactory.makeKeyword("COLUMN1");
        $kw518$COLUMN2 = SubLObjectFactory.makeKeyword("COLUMN2");
        $sym519$MAKE_SQL_COLUMN_EQUAL = SubLObjectFactory.makeSymbol("MAKE-SQL-COLUMN-EQUAL");
        $sym520$VISIT_DEFSTRUCT_OBJECT_SQL_COLUMN_EQUAL_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-COLUMN-EQUAL-METHOD");
        $str521$_a____a = SubLObjectFactory.makeString("~a = ~a");
        $sym522$SQL_IS_NULL = SubLObjectFactory.makeSymbol("SQL-IS-NULL");
        $sym523$SQL_IS_NULL_P = SubLObjectFactory.makeSymbol("SQL-IS-NULL-P");
        $list524 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN"));
        $list525 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN"));
        $list526 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-IS-NULL-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-IS-NULL-COLUMN"));
        $list527 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-IS-NULL-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-IS-NULL-COLUMN"));
        $sym528$PRINT_SQL_IS_NULL = SubLObjectFactory.makeSymbol("PRINT-SQL-IS-NULL");
        $sym529$SQL_IS_NULL_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-IS-NULL-PRINT-FUNCTION-TRAMPOLINE");
        $list530 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-IS-NULL-P"));
        $sym531$SQL_IS_NULL_TABLE = SubLObjectFactory.makeSymbol("SQL-IS-NULL-TABLE");
        $sym532$_CSETF_SQL_IS_NULL_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-IS-NULL-TABLE");
        $sym533$SQL_IS_NULL_COLUMN = SubLObjectFactory.makeSymbol("SQL-IS-NULL-COLUMN");
        $sym534$_CSETF_SQL_IS_NULL_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-SQL-IS-NULL-COLUMN");
        $kw535$COLUMN = SubLObjectFactory.makeKeyword("COLUMN");
        $sym536$MAKE_SQL_IS_NULL = SubLObjectFactory.makeSymbol("MAKE-SQL-IS-NULL");
        $sym537$VISIT_DEFSTRUCT_OBJECT_SQL_IS_NULL_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-IS-NULL-METHOD");
        $str538$_a__a_IS_NULL = SubLObjectFactory.makeString("~a.~a IS NULL");
        $sym539$SQL_NOT_IN = SubLObjectFactory.makeSymbol("SQL-NOT-IN");
        $sym540$SQL_NOT_IN_P = SubLObjectFactory.makeSymbol("SQL-NOT-IN-P");
        $list541 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLUMN-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"));
        $list542 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLUMN-TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE"));
        $list543 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-NOT-IN-COLUMN-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-NOT-IN-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-NOT-IN-TABLE"));
        $list544 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-NOT-IN-COLUMN-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-NOT-IN-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-NOT-IN-TABLE"));
        $sym545$PRINT_SQL_NOT_IN = SubLObjectFactory.makeSymbol("PRINT-SQL-NOT-IN");
        $sym546$SQL_NOT_IN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-NOT-IN-PRINT-FUNCTION-TRAMPOLINE");
        $list547 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-NOT-IN-P"));
        $sym548$SQL_NOT_IN_COLUMN_TABLE = SubLObjectFactory.makeSymbol("SQL-NOT-IN-COLUMN-TABLE");
        $sym549$_CSETF_SQL_NOT_IN_COLUMN_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-NOT-IN-COLUMN-TABLE");
        $sym550$SQL_NOT_IN_COLUMN = SubLObjectFactory.makeSymbol("SQL-NOT-IN-COLUMN");
        $sym551$_CSETF_SQL_NOT_IN_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-SQL-NOT-IN-COLUMN");
        $sym552$SQL_NOT_IN_TABLE = SubLObjectFactory.makeSymbol("SQL-NOT-IN-TABLE");
        $sym553$_CSETF_SQL_NOT_IN_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-NOT-IN-TABLE");
        $kw554$COLUMN_TABLE = SubLObjectFactory.makeKeyword("COLUMN-TABLE");
        $sym555$MAKE_SQL_NOT_IN = SubLObjectFactory.makeSymbol("MAKE-SQL-NOT-IN");
        $sym556$VISIT_DEFSTRUCT_OBJECT_SQL_NOT_IN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-NOT-IN-METHOD");
        $str557$_a__a_NOT_IN__a = SubLObjectFactory.makeString("~a.~a NOT IN ~a");
        $sym558$SQL_INNER_JOIN = SubLObjectFactory.makeSymbol("SQL-INNER-JOIN");
        $sym559$SQL_INNER_JOIN_P = SubLObjectFactory.makeSymbol("SQL-INNER-JOIN-P");
        $list560 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE1"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE2"), (SubLObject)SubLObjectFactory.makeSymbol("ON"));
        $list561 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE1"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE2"), (SubLObject)SubLObjectFactory.makeKeyword("ON"));
        $list562 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-INNER-JOIN-TABLE1"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-INNER-JOIN-TABLE2"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-INNER-JOIN-ON"));
        $list563 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-INNER-JOIN-TABLE1"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-INNER-JOIN-TABLE2"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-INNER-JOIN-ON"));
        $sym564$PRINT_SQL_INNER_JOIN = SubLObjectFactory.makeSymbol("PRINT-SQL-INNER-JOIN");
        $sym565$SQL_INNER_JOIN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-INNER-JOIN-PRINT-FUNCTION-TRAMPOLINE");
        $list566 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-INNER-JOIN-P"));
        $sym567$SQL_INNER_JOIN_TABLE1 = SubLObjectFactory.makeSymbol("SQL-INNER-JOIN-TABLE1");
        $sym568$_CSETF_SQL_INNER_JOIN_TABLE1 = SubLObjectFactory.makeSymbol("_CSETF-SQL-INNER-JOIN-TABLE1");
        $sym569$SQL_INNER_JOIN_TABLE2 = SubLObjectFactory.makeSymbol("SQL-INNER-JOIN-TABLE2");
        $sym570$_CSETF_SQL_INNER_JOIN_TABLE2 = SubLObjectFactory.makeSymbol("_CSETF-SQL-INNER-JOIN-TABLE2");
        $sym571$SQL_INNER_JOIN_ON = SubLObjectFactory.makeSymbol("SQL-INNER-JOIN-ON");
        $sym572$_CSETF_SQL_INNER_JOIN_ON = SubLObjectFactory.makeSymbol("_CSETF-SQL-INNER-JOIN-ON");
        $kw573$ON = SubLObjectFactory.makeKeyword("ON");
        $sym574$MAKE_SQL_INNER_JOIN = SubLObjectFactory.makeSymbol("MAKE-SQL-INNER-JOIN");
        $sym575$VISIT_DEFSTRUCT_OBJECT_SQL_INNER_JOIN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-INNER-JOIN-METHOD");
        $str576$_a_INNER_JOIN__a_ON__a = SubLObjectFactory.makeString("~a INNER JOIN ~a ON ~a");
        $sym577$SQL_LEFT_JOIN = SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN");
        $sym578$SQL_LEFT_JOIN_P = SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN-P");
        $list579 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEFT-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("RIGHT-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("ON"));
        $list580 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEFT-TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT-TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("ON"));
        $list581 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN-LEFT-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN-RIGHT-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN-ON"));
        $list582 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-LEFT-JOIN-LEFT-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-LEFT-JOIN-RIGHT-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-LEFT-JOIN-ON"));
        $sym583$PRINT_SQL_LEFT_JOIN = SubLObjectFactory.makeSymbol("PRINT-SQL-LEFT-JOIN");
        $sym584$SQL_LEFT_JOIN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN-PRINT-FUNCTION-TRAMPOLINE");
        $list585 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN-P"));
        $sym586$SQL_LEFT_JOIN_LEFT_TABLE = SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN-LEFT-TABLE");
        $sym587$_CSETF_SQL_LEFT_JOIN_LEFT_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-LEFT-JOIN-LEFT-TABLE");
        $sym588$SQL_LEFT_JOIN_RIGHT_TABLE = SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN-RIGHT-TABLE");
        $sym589$_CSETF_SQL_LEFT_JOIN_RIGHT_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-LEFT-JOIN-RIGHT-TABLE");
        $sym590$SQL_LEFT_JOIN_ON = SubLObjectFactory.makeSymbol("SQL-LEFT-JOIN-ON");
        $sym591$_CSETF_SQL_LEFT_JOIN_ON = SubLObjectFactory.makeSymbol("_CSETF-SQL-LEFT-JOIN-ON");
        $kw592$LEFT_TABLE = SubLObjectFactory.makeKeyword("LEFT-TABLE");
        $kw593$RIGHT_TABLE = SubLObjectFactory.makeKeyword("RIGHT-TABLE");
        $sym594$MAKE_SQL_LEFT_JOIN = SubLObjectFactory.makeSymbol("MAKE-SQL-LEFT-JOIN");
        $sym595$VISIT_DEFSTRUCT_OBJECT_SQL_LEFT_JOIN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-LEFT-JOIN-METHOD");
        $str596$_a_LEFT_JOIN__a_ON__a = SubLObjectFactory.makeString("~a LEFT JOIN ~a ON ~a");
        $sym597$SQL_UNION = SubLObjectFactory.makeSymbol("SQL-UNION");
        $sym598$SQL_UNION_P = SubLObjectFactory.makeSymbol("SQL-UNION-P");
        $list599 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT1"), (SubLObject)SubLObjectFactory.makeSymbol("SELECT2"));
        $list600 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT1"), (SubLObject)SubLObjectFactory.makeKeyword("SELECT2"));
        $list601 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-UNION-SELECT1"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-UNION-SELECT2"));
        $list602 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-UNION-SELECT1"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-UNION-SELECT2"));
        $sym603$PRINT_SQL_UNION = SubLObjectFactory.makeSymbol("PRINT-SQL-UNION");
        $sym604$SQL_UNION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-UNION-PRINT-FUNCTION-TRAMPOLINE");
        $list605 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-UNION-P"));
        $sym606$SQL_UNION_SELECT1 = SubLObjectFactory.makeSymbol("SQL-UNION-SELECT1");
        $sym607$_CSETF_SQL_UNION_SELECT1 = SubLObjectFactory.makeSymbol("_CSETF-SQL-UNION-SELECT1");
        $sym608$SQL_UNION_SELECT2 = SubLObjectFactory.makeSymbol("SQL-UNION-SELECT2");
        $sym609$_CSETF_SQL_UNION_SELECT2 = SubLObjectFactory.makeSymbol("_CSETF-SQL-UNION-SELECT2");
        $kw610$SELECT1 = SubLObjectFactory.makeKeyword("SELECT1");
        $kw611$SELECT2 = SubLObjectFactory.makeKeyword("SELECT2");
        $sym612$MAKE_SQL_UNION = SubLObjectFactory.makeSymbol("MAKE-SQL-UNION");
        $sym613$VISIT_DEFSTRUCT_OBJECT_SQL_UNION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-UNION-METHOD");
        $str614$_a__UNION___a = SubLObjectFactory.makeString("~a~%UNION~%~a");
        $sym615$SQL_ALTER_TABLE = SubLObjectFactory.makeSymbol("SQL-ALTER-TABLE");
        $sym616$SQL_ALTER_TABLE_P = SubLObjectFactory.makeSymbol("SQL-ALTER-TABLE-P");
        $list617 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION"));
        $list618 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"));
        $list619 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-ALTER-TABLE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-ALTER-TABLE-ACTION"));
        $list620 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-ALTER-TABLE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-ALTER-TABLE-ACTION"));
        $sym621$PRINT_SQL_ALTER_TABLE = SubLObjectFactory.makeSymbol("PRINT-SQL-ALTER-TABLE");
        $sym622$SQL_ALTER_TABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-ALTER-TABLE-PRINT-FUNCTION-TRAMPOLINE");
        $list623 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-ALTER-TABLE-P"));
        $sym624$SQL_ALTER_TABLE_TABLE = SubLObjectFactory.makeSymbol("SQL-ALTER-TABLE-TABLE");
        $sym625$_CSETF_SQL_ALTER_TABLE_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-ALTER-TABLE-TABLE");
        $sym626$SQL_ALTER_TABLE_ACTION = SubLObjectFactory.makeSymbol("SQL-ALTER-TABLE-ACTION");
        $sym627$_CSETF_SQL_ALTER_TABLE_ACTION = SubLObjectFactory.makeSymbol("_CSETF-SQL-ALTER-TABLE-ACTION");
        $kw628$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $sym629$MAKE_SQL_ALTER_TABLE = SubLObjectFactory.makeSymbol("MAKE-SQL-ALTER-TABLE");
        $sym630$VISIT_DEFSTRUCT_OBJECT_SQL_ALTER_TABLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-ALTER-TABLE-METHOD");
        $str631$ALTER_TABLE__a__a = SubLObjectFactory.makeString("ALTER TABLE ~a ~a");
        $sym632$SQL_ALTERATION_P = SubLObjectFactory.makeSymbol("SQL-ALTERATION-P");
        $sym633$SQL_ADD_COLUMN = SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN");
        $sym634$SQL_ADD_COLUMN_P = SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-P");
        $list635 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINTS"));
        $list636 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLUMN"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINTS"));
        $list637 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-CONSTRAINTS"));
        $list638 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-COLUMN-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-COLUMN-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-COLUMN-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-COLUMN-CONSTRAINTS"));
        $sym639$PRINT_SQL_ADD_COLUMN = SubLObjectFactory.makeSymbol("PRINT-SQL-ADD-COLUMN");
        $sym640$SQL_ADD_COLUMN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-PRINT-FUNCTION-TRAMPOLINE");
        $list641 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-P"));
        $sym642$SQL_ADD_COLUMN_COLUMN = SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-COLUMN");
        $sym643$_CSETF_SQL_ADD_COLUMN_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-COLUMN-COLUMN");
        $sym644$SQL_ADD_COLUMN_TYPE = SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-TYPE");
        $sym645$_CSETF_SQL_ADD_COLUMN_TYPE = SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-COLUMN-TYPE");
        $sym646$SQL_ADD_COLUMN_SIZE = SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-SIZE");
        $sym647$_CSETF_SQL_ADD_COLUMN_SIZE = SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-COLUMN-SIZE");
        $sym648$SQL_ADD_COLUMN_CONSTRAINTS = SubLObjectFactory.makeSymbol("SQL-ADD-COLUMN-CONSTRAINTS");
        $sym649$_CSETF_SQL_ADD_COLUMN_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-COLUMN-CONSTRAINTS");
        $kw650$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw651$SIZE = SubLObjectFactory.makeKeyword("SIZE");
        $kw652$CONSTRAINTS = SubLObjectFactory.makeKeyword("CONSTRAINTS");
        $sym653$MAKE_SQL_ADD_COLUMN = SubLObjectFactory.makeSymbol("MAKE-SQL-ADD-COLUMN");
        $sym654$VISIT_DEFSTRUCT_OBJECT_SQL_ADD_COLUMN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-ADD-COLUMN-METHOD");
        $str655$ADD_COLUMN__a__a = SubLObjectFactory.makeString("ADD COLUMN ~a ~a");
        $str656$__a_ = SubLObjectFactory.makeString("(~a)");
        $sym657$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym658$SQL_COLUMN_CONSTRAINT_P = SubLObjectFactory.makeSymbol("SQL-COLUMN-CONSTRAINT-P");
        $sym659$SQL_DROP_COLUMN = SubLObjectFactory.makeSymbol("SQL-DROP-COLUMN");
        $sym660$SQL_DROP_COLUMN_P = SubLObjectFactory.makeSymbol("SQL-DROP-COLUMN-P");
        $list661 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLUMN"));
        $list662 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLUMN"));
        $list663 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-DROP-COLUMN-COLUMN"));
        $list664 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-DROP-COLUMN-COLUMN"));
        $sym665$PRINT_SQL_DROP_COLUMN = SubLObjectFactory.makeSymbol("PRINT-SQL-DROP-COLUMN");
        $sym666$SQL_DROP_COLUMN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-DROP-COLUMN-PRINT-FUNCTION-TRAMPOLINE");
        $list667 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-DROP-COLUMN-P"));
        $sym668$SQL_DROP_COLUMN_COLUMN = SubLObjectFactory.makeSymbol("SQL-DROP-COLUMN-COLUMN");
        $sym669$_CSETF_SQL_DROP_COLUMN_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-SQL-DROP-COLUMN-COLUMN");
        $sym670$MAKE_SQL_DROP_COLUMN = SubLObjectFactory.makeSymbol("MAKE-SQL-DROP-COLUMN");
        $sym671$VISIT_DEFSTRUCT_OBJECT_SQL_DROP_COLUMN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-DROP-COLUMN-METHOD");
        $str672$DROP_COLUMN__a = SubLObjectFactory.makeString("DROP COLUMN ~a");
        $sym673$SQL_RENAME_COLUMN = SubLObjectFactory.makeSymbol("SQL-RENAME-COLUMN");
        $sym674$SQL_RENAME_COLUMN_P = SubLObjectFactory.makeSymbol("SQL-RENAME-COLUMN-P");
        $list675 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COLUMN"));
        $list676 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OLD-COLUMN"), (SubLObject)SubLObjectFactory.makeKeyword("NEW-COLUMN"));
        $list677 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-RENAME-COLUMN-OLD-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-RENAME-COLUMN-NEW-COLUMN"));
        $list678 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-RENAME-COLUMN-OLD-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-RENAME-COLUMN-NEW-COLUMN"));
        $sym679$PRINT_SQL_RENAME_COLUMN = SubLObjectFactory.makeSymbol("PRINT-SQL-RENAME-COLUMN");
        $sym680$SQL_RENAME_COLUMN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-RENAME-COLUMN-PRINT-FUNCTION-TRAMPOLINE");
        $list681 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-RENAME-COLUMN-P"));
        $sym682$SQL_RENAME_COLUMN_OLD_COLUMN = SubLObjectFactory.makeSymbol("SQL-RENAME-COLUMN-OLD-COLUMN");
        $sym683$_CSETF_SQL_RENAME_COLUMN_OLD_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-SQL-RENAME-COLUMN-OLD-COLUMN");
        $sym684$SQL_RENAME_COLUMN_NEW_COLUMN = SubLObjectFactory.makeSymbol("SQL-RENAME-COLUMN-NEW-COLUMN");
        $sym685$_CSETF_SQL_RENAME_COLUMN_NEW_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-SQL-RENAME-COLUMN-NEW-COLUMN");
        $kw686$OLD_COLUMN = SubLObjectFactory.makeKeyword("OLD-COLUMN");
        $kw687$NEW_COLUMN = SubLObjectFactory.makeKeyword("NEW-COLUMN");
        $sym688$MAKE_SQL_RENAME_COLUMN = SubLObjectFactory.makeSymbol("MAKE-SQL-RENAME-COLUMN");
        $sym689$VISIT_DEFSTRUCT_OBJECT_SQL_RENAME_COLUMN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-RENAME-COLUMN-METHOD");
        $str690$RENAME__a_TO__a = SubLObjectFactory.makeString("RENAME ~a TO ~a");
        $sym691$SQL_ADD_CONSTRAINT = SubLObjectFactory.makeSymbol("SQL-ADD-CONSTRAINT");
        $sym692$SQL_ADD_CONSTRAINT_P = SubLObjectFactory.makeSymbol("SQL-ADD-CONSTRAINT-P");
        $list693 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"));
        $list694 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINT"));
        $list695 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-ADD-CONSTRAINT-CONSTRAINT"));
        $list696 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-CONSTRAINT-CONSTRAINT"));
        $sym697$PRINT_SQL_ADD_CONSTRAINT = SubLObjectFactory.makeSymbol("PRINT-SQL-ADD-CONSTRAINT");
        $sym698$SQL_ADD_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-ADD-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");
        $list699 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-ADD-CONSTRAINT-P"));
        $sym700$SQL_ADD_CONSTRAINT_CONSTRAINT = SubLObjectFactory.makeSymbol("SQL-ADD-CONSTRAINT-CONSTRAINT");
        $sym701$_CSETF_SQL_ADD_CONSTRAINT_CONSTRAINT = SubLObjectFactory.makeSymbol("_CSETF-SQL-ADD-CONSTRAINT-CONSTRAINT");
        $kw702$CONSTRAINT = SubLObjectFactory.makeKeyword("CONSTRAINT");
        $sym703$MAKE_SQL_ADD_CONSTRAINT = SubLObjectFactory.makeSymbol("MAKE-SQL-ADD-CONSTRAINT");
        $sym704$VISIT_DEFSTRUCT_OBJECT_SQL_ADD_CONSTRAINT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-ADD-CONSTRAINT-METHOD");
        $str705$ADD_CONSTRAINT__a__a = SubLObjectFactory.makeString("ADD CONSTRAINT ~a ~a");
        $sym706$SQL_TABLE_CONSTRAINT_P = SubLObjectFactory.makeSymbol("SQL-TABLE-CONSTRAINT-P");
        $sym707$SQL_DROP_CONSTRAINT = SubLObjectFactory.makeSymbol("SQL-DROP-CONSTRAINT");
        $sym708$SQL_DROP_CONSTRAINT_P = SubLObjectFactory.makeSymbol("SQL-DROP-CONSTRAINT-P");
        $list709 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-DROP-CONSTRAINT-CONSTRAINT"));
        $list710 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-DROP-CONSTRAINT-CONSTRAINT"));
        $sym711$PRINT_SQL_DROP_CONSTRAINT = SubLObjectFactory.makeSymbol("PRINT-SQL-DROP-CONSTRAINT");
        $sym712$SQL_DROP_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-DROP-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");
        $list713 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-DROP-CONSTRAINT-P"));
        $sym714$SQL_DROP_CONSTRAINT_CONSTRAINT = SubLObjectFactory.makeSymbol("SQL-DROP-CONSTRAINT-CONSTRAINT");
        $sym715$_CSETF_SQL_DROP_CONSTRAINT_CONSTRAINT = SubLObjectFactory.makeSymbol("_CSETF-SQL-DROP-CONSTRAINT-CONSTRAINT");
        $sym716$MAKE_SQL_DROP_CONSTRAINT = SubLObjectFactory.makeSymbol("MAKE-SQL-DROP-CONSTRAINT");
        $sym717$VISIT_DEFSTRUCT_OBJECT_SQL_DROP_CONSTRAINT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-DROP-CONSTRAINT-METHOD");
        $str718$DROP_CONSTRAINT__a = SubLObjectFactory.makeString("DROP CONSTRAINT ~a");
        $sym719$SQL_FK_COLUMN_CONSTRAINT = SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT");
        $sym720$SQL_FK_COLUMN_CONSTRAINT_P = SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT-P");
        $list721 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN"));
        $list722 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN"));
        $list723 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT-COLUMN"));
        $list724 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-COLUMN"));
        $sym725$PRINT_SQL_FK_COLUMN_CONSTRAINT = SubLObjectFactory.makeSymbol("PRINT-SQL-FK-COLUMN-CONSTRAINT");
        $sym726$SQL_FK_COLUMN_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");
        $list727 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT-P"));
        $sym728$SQL_FK_COLUMN_CONSTRAINT_NAME = SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT-NAME");
        $sym729$_CSETF_SQL_FK_COLUMN_CONSTRAINT_NAME = SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-NAME");
        $sym730$SQL_FK_COLUMN_CONSTRAINT_TABLE = SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT-TABLE");
        $sym731$_CSETF_SQL_FK_COLUMN_CONSTRAINT_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-TABLE");
        $sym732$SQL_FK_COLUMN_CONSTRAINT_COLUMN = SubLObjectFactory.makeSymbol("SQL-FK-COLUMN-CONSTRAINT-COLUMN");
        $sym733$_CSETF_SQL_FK_COLUMN_CONSTRAINT_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-COLUMN");
        $kw734$NAME = SubLObjectFactory.makeKeyword("NAME");
        $sym735$MAKE_SQL_FK_COLUMN_CONSTRAINT = SubLObjectFactory.makeSymbol("MAKE-SQL-FK-COLUMN-CONSTRAINT");
        $sym736$VISIT_DEFSTRUCT_OBJECT_SQL_FK_COLUMN_CONSTRAINT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-FK-COLUMN-CONSTRAINT-METHOD");
        $str737$REFERENCES__a___a_ = SubLObjectFactory.makeString("REFERENCES ~a (~a)");
        $sym738$SQL_FK_TABLE_CONSTRAINT = SubLObjectFactory.makeSymbol("SQL-FK-TABLE-CONSTRAINT");
        $sym739$SQL_FK_TABLE_CONSTRAINT_P = SubLObjectFactory.makeSymbol("SQL-FK-TABLE-CONSTRAINT-P");
        $list740 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"));
        $list741 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLUMN"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINT"));
        $list742 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-FK-TABLE-CONSTRAINT-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-FK-TABLE-CONSTRAINT-CONSTRAINT"));
        $list743 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-TABLE-CONSTRAINT-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-TABLE-CONSTRAINT-CONSTRAINT"));
        $sym744$PRINT_SQL_FK_TABLE_CONSTRAINT = SubLObjectFactory.makeSymbol("PRINT-SQL-FK-TABLE-CONSTRAINT");
        $sym745$SQL_FK_TABLE_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-FK-TABLE-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");
        $list746 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-FK-TABLE-CONSTRAINT-P"));
        $sym747$SQL_FK_TABLE_CONSTRAINT_COLUMN = SubLObjectFactory.makeSymbol("SQL-FK-TABLE-CONSTRAINT-COLUMN");
        $sym748$_CSETF_SQL_FK_TABLE_CONSTRAINT_COLUMN = SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-TABLE-CONSTRAINT-COLUMN");
        $sym749$SQL_FK_TABLE_CONSTRAINT_CONSTRAINT = SubLObjectFactory.makeSymbol("SQL-FK-TABLE-CONSTRAINT-CONSTRAINT");
        $sym750$_CSETF_SQL_FK_TABLE_CONSTRAINT_CONSTRAINT = SubLObjectFactory.makeSymbol("_CSETF-SQL-FK-TABLE-CONSTRAINT-CONSTRAINT");
        $sym751$MAKE_SQL_FK_TABLE_CONSTRAINT = SubLObjectFactory.makeSymbol("MAKE-SQL-FK-TABLE-CONSTRAINT");
        $sym752$VISIT_DEFSTRUCT_OBJECT_SQL_FK_TABLE_CONSTRAINT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-FK-TABLE-CONSTRAINT-METHOD");
        $str753$FOREIGN_KEY___a___a = SubLObjectFactory.makeString("FOREIGN KEY (~a) ~a");
        $sym754$SQL_UPDATE = SubLObjectFactory.makeSymbol("SQL-UPDATE");
        $sym755$SQL_UPDATE_P = SubLObjectFactory.makeSymbol("SQL-UPDATE-P");
        $list756 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SETTINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONS"));
        $list757 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("SETTINGS"), (SubLObject)SubLObjectFactory.makeKeyword("CONDITIONS"));
        $list758 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-UPDATE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-UPDATE-SETTINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-UPDATE-CONDITIONS"));
        $list759 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-UPDATE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-UPDATE-SETTINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-UPDATE-CONDITIONS"));
        $sym760$PRINT_SQL_UPDATE = SubLObjectFactory.makeSymbol("PRINT-SQL-UPDATE");
        $sym761$SQL_UPDATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-UPDATE-PRINT-FUNCTION-TRAMPOLINE");
        $list762 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-UPDATE-P"));
        $sym763$SQL_UPDATE_TABLE = SubLObjectFactory.makeSymbol("SQL-UPDATE-TABLE");
        $sym764$_CSETF_SQL_UPDATE_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-UPDATE-TABLE");
        $sym765$SQL_UPDATE_SETTINGS = SubLObjectFactory.makeSymbol("SQL-UPDATE-SETTINGS");
        $sym766$_CSETF_SQL_UPDATE_SETTINGS = SubLObjectFactory.makeSymbol("_CSETF-SQL-UPDATE-SETTINGS");
        $sym767$SQL_UPDATE_CONDITIONS = SubLObjectFactory.makeSymbol("SQL-UPDATE-CONDITIONS");
        $sym768$_CSETF_SQL_UPDATE_CONDITIONS = SubLObjectFactory.makeSymbol("_CSETF-SQL-UPDATE-CONDITIONS");
        $kw769$SETTINGS = SubLObjectFactory.makeKeyword("SETTINGS");
        $sym770$MAKE_SQL_UPDATE = SubLObjectFactory.makeSymbol("MAKE-SQL-UPDATE");
        $sym771$VISIT_DEFSTRUCT_OBJECT_SQL_UPDATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-UPDATE-METHOD");
        $str772$UPDATE__a_SET_ = SubLObjectFactory.makeString("UPDATE ~a SET ");
        $str773$_WHERE_ = SubLObjectFactory.makeString(" WHERE ");
        $sym774$SQL_DROP_TABLE = SubLObjectFactory.makeSymbol("SQL-DROP-TABLE");
        $sym775$SQL_DROP_TABLE_P = SubLObjectFactory.makeSymbol("SQL-DROP-TABLE-P");
        $list776 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE"));
        $list777 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"));
        $list778 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-DROP-TABLE-TABLE"));
        $list779 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SQL-DROP-TABLE-TABLE"));
        $sym780$PRINT_SQL_DROP_TABLE = SubLObjectFactory.makeSymbol("PRINT-SQL-DROP-TABLE");
        $sym781$SQL_DROP_TABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-DROP-TABLE-PRINT-FUNCTION-TRAMPOLINE");
        $list782 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-DROP-TABLE-P"));
        $sym783$SQL_DROP_TABLE_TABLE = SubLObjectFactory.makeSymbol("SQL-DROP-TABLE-TABLE");
        $sym784$_CSETF_SQL_DROP_TABLE_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SQL-DROP-TABLE-TABLE");
        $sym785$MAKE_SQL_DROP_TABLE = SubLObjectFactory.makeSymbol("MAKE-SQL-DROP-TABLE");
        $sym786$VISIT_DEFSTRUCT_OBJECT_SQL_DROP_TABLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-DROP-TABLE-METHOD");
        $str787$DROP_TABLE__a = SubLObjectFactory.makeString("DROP TABLE ~a");
        $str788$Can_t_access_name_of_column_const = SubLObjectFactory.makeString("Can't access name of column constraint ~a");
        $str789$_ = SubLObjectFactory.makeString("_");
        $str790$_fk = SubLObjectFactory.makeString("_fk");
        $sym791$_ACCESS_PATH_MAP_ = SubLObjectFactory.makeSymbol("*ACCESS-PATH-MAP*");
        $list792 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $list793 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SPORTING-GOODS-ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeString("Sporting Goods")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NORTHWIND-ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeString("Northwind")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BATHYMETRIC-HEADER-ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeString("NGATST Bathymetric Survey Headers")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("GNDB-ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeString("GeoNames")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BLN2-ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeString("BLN 2")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BLN1-ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeString("BLN 1")));
        $sym794$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym795$_BLN1_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*BLN1-ACCESS-PATH*");
        $sym796$_BLN2_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*BLN2-ACCESS-PATH*");
        $sym797$_USGS_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*USGS-ACCESS-PATH*");
        $sym798$_NGA_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*NGA-ACCESS-PATH*");
        $sym799$_GNDB_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*GNDB-ACCESS-PATH*");
        $sym800$_BATHYMETRIC_DATA_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*BATHYMETRIC-DATA-ACCESS-PATH*");
        $sym801$_BATHYMETRIC_HEADER_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*BATHYMETRIC-HEADER-ACCESS-PATH*");
        $sym802$_SPORTING_GOODS_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*SPORTING-GOODS-ACCESS-PATH*");
        $sym803$_NORTHWIND_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*NORTHWIND-ACCESS-PATH*");
        $str804$bln_fusion_test_db_1 = SubLObjectFactory.makeString("bln_fusion_test_db_1");
        $str805$sksi = SubLObjectFactory.makeString("sksi");
        $str806$cyc11_cyc_com = SubLObjectFactory.makeString("cyc11.cyc.com");
        $str807$standard_cyc_com = SubLObjectFactory.makeString("standard.cyc.com");
        $int808$9999 = SubLObjectFactory.makeInteger(9999);
        $str809$postgresql = SubLObjectFactory.makeString("postgresql");
        $const810$PostgreSQL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PostgreSQL"));
        $int811$212 = SubLObjectFactory.makeInteger(212);
        $str812$bln_fusion_test_db_2 = SubLObjectFactory.makeString("bln_fusion_test_db_2");
        $str813$usgs = SubLObjectFactory.makeString("usgs");
        $str814$astro_cyc_com = SubLObjectFactory.makeString("astro.cyc.com");
        $str815$nga = SubLObjectFactory.makeString("nga");
        $str816$gndb = SubLObjectFactory.makeString("gndb");
        $str817$sporting_goods = SubLObjectFactory.makeString("sporting_goods");
        $str818$northwind = SubLObjectFactory.makeString("northwind");
        $str819$postgres = SubLObjectFactory.makeString("postgres");
        $str820$bathymetric_data = SubLObjectFactory.makeString("bathymetric_data");
        $int821$214 = SubLObjectFactory.makeInteger(214);
        $str822$bathymetric_survey = SubLObjectFactory.makeString("bathymetric_survey");
        $str823$semantic_etl_target_db = SubLObjectFactory.makeString("semantic_etl_target_db");
        $str824$bln1 = SubLObjectFactory.makeString("bln1");
        $str825$bln2 = SubLObjectFactory.makeString("bln2");
        $str826$target = SubLObjectFactory.makeString("target");
        $str827$Can_t_find_column__a_in__a = SubLObjectFactory.makeString("Can't find column ~a in ~a");
        $sym828$EMPTY_SEMANTIC_RECIPE_STEP_P = SubLObjectFactory.makeSymbol("EMPTY-SEMANTIC-RECIPE-STEP-P");
        $sym829$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str830$unable_to_interpret__S_as_part_of = SubLObjectFactory.makeString("unable to interpret ~S as part of a recipe-step");
        $list831 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("TO-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("JUST"));
        $kw832$COLUMN_NAMED = SubLObjectFactory.makeKeyword("COLUMN-NAMED");
        $str833$Didn_t_apply_command__a_to_output = SubLObjectFactory.makeString("Didn't apply command ~a to output-spec");
        $str834$Apply__a_within__a_to_output_spec = SubLObjectFactory.makeString("Apply ~a within ~a to output-spec unimplemented");
        $str835$Can_t_add_new_column__a_to__a_sin = SubLObjectFactory.makeString("Can't add new column ~a to ~a since a column ~a already exists in ~a");
        $str836$table_expression__a_unimplemented = SubLObjectFactory.makeString("table expression ~a unimplemented");
        $str837$ambiguity_in_select_clause___a_id = SubLObjectFactory.makeString("ambiguity in select clause: ~a identifies all of ~a in ~a");
        $str838$source_result_set__a_and_target__ = SubLObjectFactory.makeString("source result set ~a and target ~a columns have different lengths ~a/~a in ~a");
    }
    
    public static final class $semantics_native extends SubLStructNative
    {
        public SubLObject $access_path;
        public SubLObject $table_semantics_list;
        public SubLObject $table_aliases;
        public SubLObject $dict;
        public SubLObject $dropped_items;
        public SubLObject $output_spec;
        private static final SubLStructDeclNative structDecl;
        
        public $semantics_native() {
            this.$access_path = (SubLObject)CommonSymbols.NIL;
            this.$table_semantics_list = (SubLObject)CommonSymbols.NIL;
            this.$table_aliases = (SubLObject)CommonSymbols.NIL;
            this.$dict = (SubLObject)CommonSymbols.NIL;
            this.$dropped_items = (SubLObject)CommonSymbols.NIL;
            this.$output_spec = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$semantics_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$access_path;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$table_semantics_list;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$table_aliases;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$dict;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$dropped_items;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$output_spec;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$access_path = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$table_semantics_list = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$table_aliases = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$dict = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$dropped_items = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$output_spec = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$semantics_native.class, semantic_etl_bus.$sym20$SEMANTICS, semantic_etl_bus.$sym21$SEMANTICS_P, semantic_etl_bus.$list22, semantic_etl_bus.$list23, new String[] { "$access_path", "$table_semantics_list", "$table_aliases", "$dict", "$dropped_items", "$output_spec" }, semantic_etl_bus.$list24, semantic_etl_bus.$list25, semantic_etl_bus.$sym26$PRINT_SEMANTICS);
        }
    }
    
    public static final class $semantics_p$UnaryFunction extends UnaryFunction
    {
        public $semantics_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SEMANTICS-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.semantics_p(arg1);
        }
    }
    
    public static final class $table_semantics_native extends SubLStructNative
    {
        public SubLObject $table_id;
        public SubLObject $table_name;
        public SubLObject $source_semantics;
        public SubLObject $semantics;
        public SubLObject $points_to_table_ids;
        public SubLObject $pointed_to_by_table_ids;
        public SubLObject $table_parses;
        public SubLObject $column_semantics_list;
        public SubLObject $primary_key_columns;
        public SubLObject $column_constraints;
        private static final SubLStructDeclNative structDecl;
        
        public $table_semantics_native() {
            this.$table_id = (SubLObject)CommonSymbols.NIL;
            this.$table_name = (SubLObject)CommonSymbols.NIL;
            this.$source_semantics = (SubLObject)CommonSymbols.NIL;
            this.$semantics = (SubLObject)CommonSymbols.NIL;
            this.$points_to_table_ids = (SubLObject)CommonSymbols.NIL;
            this.$pointed_to_by_table_ids = (SubLObject)CommonSymbols.NIL;
            this.$table_parses = (SubLObject)CommonSymbols.NIL;
            this.$column_semantics_list = (SubLObject)CommonSymbols.NIL;
            this.$primary_key_columns = (SubLObject)CommonSymbols.NIL;
            this.$column_constraints = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$table_semantics_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table_id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$table_name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$source_semantics;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$semantics;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$points_to_table_ids;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$pointed_to_by_table_ids;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$table_parses;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$column_semantics_list;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$primary_key_columns;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$column_constraints;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table_id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$table_name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$source_semantics = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$semantics = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$points_to_table_ids = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$pointed_to_by_table_ids = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$table_parses = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$column_semantics_list = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$primary_key_columns = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$column_constraints = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$table_semantics_native.class, semantic_etl_bus.$sym62$TABLE_SEMANTICS, semantic_etl_bus.$sym55$TABLE_SEMANTICS_P, semantic_etl_bus.$list63, semantic_etl_bus.$list64, new String[] { "$table_id", "$table_name", "$source_semantics", "$semantics", "$points_to_table_ids", "$pointed_to_by_table_ids", "$table_parses", "$column_semantics_list", "$primary_key_columns", "$column_constraints" }, semantic_etl_bus.$list65, semantic_etl_bus.$list66, semantic_etl_bus.$sym67$PRINT_TABLE_SEMANTICS);
        }
    }
    
    public static final class $table_semantics_p$UnaryFunction extends UnaryFunction
    {
        public $table_semantics_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TABLE-SEMANTICS-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.table_semantics_p(arg1);
        }
    }
    
    public static final class $foreign_key_constraint_native extends SubLStructNative
    {
        public SubLObject $constraint_name;
        public SubLObject $constrained_column;
        public SubLObject $constraining_table;
        public SubLObject $constraining_column;
        private static final SubLStructDeclNative structDecl;
        
        public $foreign_key_constraint_native() {
            this.$constraint_name = (SubLObject)CommonSymbols.NIL;
            this.$constrained_column = (SubLObject)CommonSymbols.NIL;
            this.$constraining_table = (SubLObject)CommonSymbols.NIL;
            this.$constraining_column = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$foreign_key_constraint_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$constraint_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$constrained_column;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$constraining_table;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$constraining_column;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$constraint_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$constrained_column = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$constraining_table = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$constraining_column = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$foreign_key_constraint_native.class, semantic_etl_bus.$sym119$FOREIGN_KEY_CONSTRAINT, semantic_etl_bus.$sym61$FOREIGN_KEY_CONSTRAINT_P, semantic_etl_bus.$list120, semantic_etl_bus.$list121, new String[] { "$constraint_name", "$constrained_column", "$constraining_table", "$constraining_column" }, semantic_etl_bus.$list122, semantic_etl_bus.$list123, semantic_etl_bus.$sym124$PRINT_FOREIGN_KEY_CONSTRAINT);
        }
    }
    
    public static final class $foreign_key_constraint_p$UnaryFunction extends UnaryFunction
    {
        public $foreign_key_constraint_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FOREIGN-KEY-CONSTRAINT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.foreign_key_constraint_p(arg1);
        }
    }
    
    public static final class $primary_key_constraint_native extends SubLStructNative
    {
        public SubLObject $constraint_name;
        public SubLObject $constraint_type;
        public SubLObject $constrained_column;
        private static final SubLStructDeclNative structDecl;
        
        public $primary_key_constraint_native() {
            this.$constraint_name = (SubLObject)CommonSymbols.NIL;
            this.$constraint_type = (SubLObject)CommonSymbols.NIL;
            this.$constrained_column = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$primary_key_constraint_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$constraint_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$constraint_type;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$constrained_column;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$constraint_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$constraint_type = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$constrained_column = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$primary_key_constraint_native.class, semantic_etl_bus.$sym146$PRIMARY_KEY_CONSTRAINT, semantic_etl_bus.$sym60$PRIMARY_KEY_CONSTRAINT_P, semantic_etl_bus.$list147, semantic_etl_bus.$list148, new String[] { "$constraint_name", "$constraint_type", "$constrained_column" }, semantic_etl_bus.$list149, semantic_etl_bus.$list150, semantic_etl_bus.$sym151$PRINT_PRIMARY_KEY_CONSTRAINT);
        }
    }
    
    public static final class $primary_key_constraint_p$UnaryFunction extends UnaryFunction
    {
        public $primary_key_constraint_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PRIMARY-KEY-CONSTRAINT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.primary_key_constraint_p(arg1);
        }
    }
    
    public static final class $column_semantics_native extends SubLStructNative
    {
        public SubLObject $column_name;
        public SubLObject $column_parses;
        public SubLObject $table_semantics;
        public SubLObject $value_semantics_list;
        public SubLObject $column_type;
        public SubLObject $column_size;
        private static final SubLStructDeclNative structDecl;
        
        public $column_semantics_native() {
            this.$column_name = (SubLObject)CommonSymbols.NIL;
            this.$column_parses = (SubLObject)CommonSymbols.NIL;
            this.$table_semantics = (SubLObject)CommonSymbols.NIL;
            this.$value_semantics_list = (SubLObject)CommonSymbols.NIL;
            this.$column_type = (SubLObject)CommonSymbols.NIL;
            this.$column_size = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$column_semantics_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$column_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$column_parses;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$table_semantics;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$value_semantics_list;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$column_type;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$column_size;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$column_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$column_parses = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$table_semantics = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$value_semantics_list = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$column_type = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$column_size = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$column_semantics_native.class, semantic_etl_bus.$sym167$COLUMN_SEMANTICS, semantic_etl_bus.$sym59$COLUMN_SEMANTICS_P, semantic_etl_bus.$list168, semantic_etl_bus.$list169, new String[] { "$column_name", "$column_parses", "$table_semantics", "$value_semantics_list", "$column_type", "$column_size" }, semantic_etl_bus.$list170, semantic_etl_bus.$list171, semantic_etl_bus.$sym172$PRINT_COLUMN_SEMANTICS);
        }
    }
    
    public static final class $column_semantics_p$UnaryFunction extends UnaryFunction
    {
        public $column_semantics_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("COLUMN-SEMANTICS-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.column_semantics_p(arg1);
        }
    }
    
    public static final class $value_semantics_native extends SubLStructNative
    {
        public SubLObject $value;
        public SubLObject $value_parses;
        private static final SubLStructDeclNative structDecl;
        
        public $value_semantics_native() {
            this.$value = (SubLObject)CommonSymbols.NIL;
            this.$value_parses = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$value_semantics_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$value;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$value_parses;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$value = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$value_parses = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$value_semantics_native.class, semantic_etl_bus.$sym206$VALUE_SEMANTICS, semantic_etl_bus.$sym202$VALUE_SEMANTICS_P, semantic_etl_bus.$list207, semantic_etl_bus.$list208, new String[] { "$value", "$value_parses" }, semantic_etl_bus.$list209, semantic_etl_bus.$list210, semantic_etl_bus.$sym211$PRINT_VALUE_SEMANTICS);
        }
    }
    
    public static final class $value_semantics_p$UnaryFunction extends UnaryFunction
    {
        public $value_semantics_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VALUE-SEMANTICS-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.value_semantics_p(arg1);
        }
    }
    
    public static final class $database_output_spec_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $semantics1;
        public SubLObject $semantics2;
        public SubLObject $recipe;
        public SubLObject $semantics;
        public SubLObject $semantic_recipe;
        private static final SubLStructDeclNative structDecl;
        
        public $database_output_spec_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$semantics1 = (SubLObject)CommonSymbols.NIL;
            this.$semantics2 = (SubLObject)CommonSymbols.NIL;
            this.$recipe = (SubLObject)CommonSymbols.NIL;
            this.$semantics = (SubLObject)CommonSymbols.NIL;
            this.$semantic_recipe = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$database_output_spec_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$semantics1;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$semantics2;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$recipe;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$semantics;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$semantic_recipe;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$semantics1 = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$semantics2 = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$recipe = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$semantics = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$semantic_recipe = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$database_output_spec_native.class, semantic_etl_bus.$sym225$DATABASE_OUTPUT_SPEC, semantic_etl_bus.$sym226$DATABASE_OUTPUT_SPEC_P, semantic_etl_bus.$list227, semantic_etl_bus.$list228, new String[] { "$id", "$semantics1", "$semantics2", "$recipe", "$semantics", "$semantic_recipe" }, semantic_etl_bus.$list229, semantic_etl_bus.$list230, semantic_etl_bus.$sym231$PRINT_DATABASE_OUTPUT_SPEC);
        }
    }
    
    public static final class $database_output_spec_p$UnaryFunction extends UnaryFunction
    {
        public $database_output_spec_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DATABASE-OUTPUT-SPEC-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.database_output_spec_p(arg1);
        }
    }
    
    public static final class $table_merger_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $output_spec;
        public SubLObject $sources;
        public SubLObject $target;
        public SubLObject $column_correspondence_list;
        public SubLObject $added;
        public SubLObject $dropped;
        public SubLObject $sql_start_index;
        public SubLObject $sql_end_index;
        private static final SubLStructDeclNative structDecl;
        
        public $table_merger_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$output_spec = (SubLObject)CommonSymbols.NIL;
            this.$sources = (SubLObject)CommonSymbols.NIL;
            this.$target = (SubLObject)CommonSymbols.NIL;
            this.$column_correspondence_list = (SubLObject)CommonSymbols.NIL;
            this.$added = (SubLObject)CommonSymbols.NIL;
            this.$dropped = (SubLObject)CommonSymbols.NIL;
            this.$sql_start_index = (SubLObject)CommonSymbols.NIL;
            this.$sql_end_index = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$table_merger_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$output_spec;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$sources;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$target;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$column_correspondence_list;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$added;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$dropped;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$sql_start_index;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$sql_end_index;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$output_spec = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$sources = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$target = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$column_correspondence_list = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$added = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$dropped = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$sql_start_index = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$sql_end_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$table_merger_native.class, semantic_etl_bus.$sym266$TABLE_MERGER, semantic_etl_bus.$sym267$TABLE_MERGER_P, semantic_etl_bus.$list268, semantic_etl_bus.$list269, new String[] { "$id", "$output_spec", "$sources", "$target", "$column_correspondence_list", "$added", "$dropped", "$sql_start_index", "$sql_end_index" }, semantic_etl_bus.$list270, semantic_etl_bus.$list271, semantic_etl_bus.$sym272$PRINT_TABLE_MERGER);
        }
    }
    
    public static final class $table_merger_p$UnaryFunction extends UnaryFunction
    {
        public $table_merger_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TABLE-MERGER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.table_merger_p(arg1);
        }
    }
    
    public static final class $column_merger_native extends SubLStructNative
    {
        public SubLObject $output_spec;
        public SubLObject $sources;
        public SubLObject $target;
        public SubLObject $column_correspondence_list;
        public SubLObject $added;
        public SubLObject $dropped;
        public SubLObject $sql_start_index;
        public SubLObject $sql_end_index;
        private static final SubLStructDeclNative structDecl;
        
        public $column_merger_native() {
            this.$output_spec = (SubLObject)CommonSymbols.NIL;
            this.$sources = (SubLObject)CommonSymbols.NIL;
            this.$target = (SubLObject)CommonSymbols.NIL;
            this.$column_correspondence_list = (SubLObject)CommonSymbols.NIL;
            this.$added = (SubLObject)CommonSymbols.NIL;
            this.$dropped = (SubLObject)CommonSymbols.NIL;
            this.$sql_start_index = (SubLObject)CommonSymbols.NIL;
            this.$sql_end_index = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$column_merger_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$output_spec;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$sources;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$target;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$column_correspondence_list;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$added;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$dropped;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$sql_start_index;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$sql_end_index;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$output_spec = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$sources = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$target = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$column_correspondence_list = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$added = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$dropped = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$sql_start_index = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$sql_end_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$column_merger_native.class, semantic_etl_bus.$sym322$COLUMN_MERGER, semantic_etl_bus.$sym323$COLUMN_MERGER_P, semantic_etl_bus.$list324, semantic_etl_bus.$list325, new String[] { "$output_spec", "$sources", "$target", "$column_correspondence_list", "$added", "$dropped", "$sql_start_index", "$sql_end_index" }, semantic_etl_bus.$list326, semantic_etl_bus.$list327, semantic_etl_bus.$sym328$PRINT_COLUMN_MERGER);
        }
    }
    
    public static final class $column_merger_p$UnaryFunction extends UnaryFunction
    {
        public $column_merger_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("COLUMN-MERGER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.column_merger_p(arg1);
        }
    }
    
    public static final class $sql_conjunction_native extends SubLStructNative
    {
        public SubLObject $conjuncts;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_conjunction_native() {
            this.$conjuncts = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_conjunction_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$conjuncts;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$conjuncts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_conjunction_native.class, semantic_etl_bus.$sym369$SQL_CONJUNCTION, semantic_etl_bus.$sym370$SQL_CONJUNCTION_P, semantic_etl_bus.$list371, semantic_etl_bus.$list372, new String[] { "$conjuncts" }, semantic_etl_bus.$list373, semantic_etl_bus.$list374, semantic_etl_bus.$sym375$PRINT_SQL_CONJUNCTION);
        }
    }
    
    public static final class $sql_conjunction_p$UnaryFunction extends UnaryFunction
    {
        public $sql_conjunction_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-CONJUNCTION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_conjunction_p(arg1);
        }
    }
    
    public static final class $sql_disjunction_native extends SubLStructNative
    {
        public SubLObject $disjuncts;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_disjunction_native() {
            this.$disjuncts = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_disjunction_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$disjuncts;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$disjuncts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_disjunction_native.class, semantic_etl_bus.$sym385$SQL_DISJUNCTION, semantic_etl_bus.$sym386$SQL_DISJUNCTION_P, semantic_etl_bus.$list387, semantic_etl_bus.$list388, new String[] { "$disjuncts" }, semantic_etl_bus.$list389, semantic_etl_bus.$list390, semantic_etl_bus.$sym391$PRINT_SQL_DISJUNCTION);
        }
    }
    
    public static final class $sql_disjunction_p$UnaryFunction extends UnaryFunction
    {
        public $sql_disjunction_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-DISJUNCTION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_disjunction_p(arg1);
        }
    }
    
    public static final class $sql_copy_table_native extends SubLStructNative
    {
        public SubLObject $table;
        public SubLObject $from;
        public SubLObject $to;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_copy_table_native() {
            this.$table = (SubLObject)CommonSymbols.NIL;
            this.$from = (SubLObject)CommonSymbols.NIL;
            this.$to = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_copy_table_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$from;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$to;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$from = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$to = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_copy_table_native.class, semantic_etl_bus.$sym400$SQL_COPY_TABLE, semantic_etl_bus.$sym401$SQL_COPY_TABLE_P, semantic_etl_bus.$list402, semantic_etl_bus.$list403, new String[] { "$table", "$from", "$to" }, semantic_etl_bus.$list404, semantic_etl_bus.$list405, semantic_etl_bus.$sym406$PRINT_SQL_COPY_TABLE);
        }
    }
    
    public static final class $sql_copy_table_p$UnaryFunction extends UnaryFunction
    {
        public $sql_copy_table_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-COPY-TABLE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_copy_table_p(arg1);
        }
    }
    
    public static final class $sql_insert_into_native extends SubLStructNative
    {
        public SubLObject $table;
        public SubLObject $columns;
        public SubLObject $data;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_insert_into_native() {
            this.$table = (SubLObject)CommonSymbols.NIL;
            this.$columns = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_insert_into_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$columns;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$data;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$columns = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_insert_into_native.class, semantic_etl_bus.$sym421$SQL_INSERT_INTO, semantic_etl_bus.$sym422$SQL_INSERT_INTO_P, semantic_etl_bus.$list423, semantic_etl_bus.$list424, new String[] { "$table", "$columns", "$data" }, semantic_etl_bus.$list425, semantic_etl_bus.$list426, semantic_etl_bus.$sym427$PRINT_SQL_INSERT_INTO);
        }
    }
    
    public static final class $sql_insert_into_p$UnaryFunction extends UnaryFunction
    {
        public $sql_insert_into_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-INSERT-INTO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_insert_into_p(arg1);
        }
    }
    
    public static final class $sql_select_from_native extends SubLStructNative
    {
        public SubLObject $columns;
        public SubLObject $tables;
        public SubLObject $conditions;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_select_from_native() {
            this.$columns = (SubLObject)CommonSymbols.NIL;
            this.$tables = (SubLObject)CommonSymbols.NIL;
            this.$conditions = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_select_from_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$columns;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$tables;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$conditions;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$columns = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$tables = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$conditions = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_select_from_native.class, semantic_etl_bus.$sym443$SQL_SELECT_FROM, semantic_etl_bus.$sym444$SQL_SELECT_FROM_P, semantic_etl_bus.$list445, semantic_etl_bus.$list446, new String[] { "$columns", "$tables", "$conditions" }, semantic_etl_bus.$list447, semantic_etl_bus.$list448, semantic_etl_bus.$sym449$PRINT_SQL_SELECT_FROM);
        }
    }
    
    public static final class $sql_select_from_p$UnaryFunction extends UnaryFunction
    {
        public $sql_select_from_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-SELECT-FROM-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_select_from_p(arg1);
        }
    }
    
    public static final class $sql_except_native extends SubLStructNative
    {
        public SubLObject $table1;
        public SubLObject $table2;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_except_native() {
            this.$table1 = (SubLObject)CommonSymbols.NIL;
            this.$table2 = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_except_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table1;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$table2;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table1 = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$table2 = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_except_native.class, semantic_etl_bus.$sym465$SQL_EXCEPT, semantic_etl_bus.$sym466$SQL_EXCEPT_P, semantic_etl_bus.$list467, semantic_etl_bus.$list468, new String[] { "$table1", "$table2" }, semantic_etl_bus.$list469, semantic_etl_bus.$list470, semantic_etl_bus.$sym471$PRINT_SQL_EXCEPT);
        }
    }
    
    public static final class $sql_except_p$UnaryFunction extends UnaryFunction
    {
        public $sql_except_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-EXCEPT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_except_p(arg1);
        }
    }
    
    public static final class $sql_alias_native extends SubLStructNative
    {
        public SubLObject $table;
        public SubLObject $alias;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_alias_native() {
            this.$table = (SubLObject)CommonSymbols.NIL;
            this.$alias = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_alias_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$alias;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$alias = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_alias_native.class, semantic_etl_bus.$sym483$SQL_ALIAS, semantic_etl_bus.$sym484$SQL_ALIAS_P, semantic_etl_bus.$list485, semantic_etl_bus.$list486, new String[] { "$table", "$alias" }, semantic_etl_bus.$list487, semantic_etl_bus.$list488, semantic_etl_bus.$sym489$PRINT_SQL_ALIAS);
        }
    }
    
    public static final class $sql_alias_p$UnaryFunction extends UnaryFunction
    {
        public $sql_alias_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-ALIAS-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_alias_p(arg1);
        }
    }
    
    public static final class $sql_column_equal_native extends SubLStructNative
    {
        public SubLObject $table1;
        public SubLObject $column1;
        public SubLObject $table2;
        public SubLObject $column2;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_column_equal_native() {
            this.$table1 = (SubLObject)CommonSymbols.NIL;
            this.$column1 = (SubLObject)CommonSymbols.NIL;
            this.$table2 = (SubLObject)CommonSymbols.NIL;
            this.$column2 = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_column_equal_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table1;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$column1;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$table2;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$column2;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table1 = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$column1 = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$table2 = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$column2 = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_column_equal_native.class, semantic_etl_bus.$sym500$SQL_COLUMN_EQUAL, semantic_etl_bus.$sym501$SQL_COLUMN_EQUAL_P, semantic_etl_bus.$list502, semantic_etl_bus.$list503, new String[] { "$table1", "$column1", "$table2", "$column2" }, semantic_etl_bus.$list504, semantic_etl_bus.$list505, semantic_etl_bus.$sym506$PRINT_SQL_COLUMN_EQUAL);
        }
    }
    
    public static final class $sql_column_equal_p$UnaryFunction extends UnaryFunction
    {
        public $sql_column_equal_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-COLUMN-EQUAL-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_column_equal_p(arg1);
        }
    }
    
    public static final class $sql_is_null_native extends SubLStructNative
    {
        public SubLObject $table;
        public SubLObject $column;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_is_null_native() {
            this.$table = (SubLObject)CommonSymbols.NIL;
            this.$column = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_is_null_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$column;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$column = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_is_null_native.class, semantic_etl_bus.$sym522$SQL_IS_NULL, semantic_etl_bus.$sym523$SQL_IS_NULL_P, semantic_etl_bus.$list524, semantic_etl_bus.$list525, new String[] { "$table", "$column" }, semantic_etl_bus.$list526, semantic_etl_bus.$list527, semantic_etl_bus.$sym528$PRINT_SQL_IS_NULL);
        }
    }
    
    public static final class $sql_is_null_p$UnaryFunction extends UnaryFunction
    {
        public $sql_is_null_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-IS-NULL-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_is_null_p(arg1);
        }
    }
    
    public static final class $sql_not_in_native extends SubLStructNative
    {
        public SubLObject $column_table;
        public SubLObject $column;
        public SubLObject $table;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_not_in_native() {
            this.$column_table = (SubLObject)CommonSymbols.NIL;
            this.$column = (SubLObject)CommonSymbols.NIL;
            this.$table = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_not_in_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$column_table;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$column;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$table;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$column_table = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$column = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$table = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_not_in_native.class, semantic_etl_bus.$sym539$SQL_NOT_IN, semantic_etl_bus.$sym540$SQL_NOT_IN_P, semantic_etl_bus.$list541, semantic_etl_bus.$list542, new String[] { "$column_table", "$column", "$table" }, semantic_etl_bus.$list543, semantic_etl_bus.$list544, semantic_etl_bus.$sym545$PRINT_SQL_NOT_IN);
        }
    }
    
    public static final class $sql_not_in_p$UnaryFunction extends UnaryFunction
    {
        public $sql_not_in_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-NOT-IN-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_not_in_p(arg1);
        }
    }
    
    public static final class $sql_inner_join_native extends SubLStructNative
    {
        public SubLObject $table1;
        public SubLObject $table2;
        public SubLObject $on;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_inner_join_native() {
            this.$table1 = (SubLObject)CommonSymbols.NIL;
            this.$table2 = (SubLObject)CommonSymbols.NIL;
            this.$on = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_inner_join_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table1;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$table2;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$on;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table1 = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$table2 = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$on = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_inner_join_native.class, semantic_etl_bus.$sym558$SQL_INNER_JOIN, semantic_etl_bus.$sym559$SQL_INNER_JOIN_P, semantic_etl_bus.$list560, semantic_etl_bus.$list561, new String[] { "$table1", "$table2", "$on" }, semantic_etl_bus.$list562, semantic_etl_bus.$list563, semantic_etl_bus.$sym564$PRINT_SQL_INNER_JOIN);
        }
    }
    
    public static final class $sql_inner_join_p$UnaryFunction extends UnaryFunction
    {
        public $sql_inner_join_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-INNER-JOIN-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_inner_join_p(arg1);
        }
    }
    
    public static final class $sql_left_join_native extends SubLStructNative
    {
        public SubLObject $left_table;
        public SubLObject $right_table;
        public SubLObject $on;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_left_join_native() {
            this.$left_table = (SubLObject)CommonSymbols.NIL;
            this.$right_table = (SubLObject)CommonSymbols.NIL;
            this.$on = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_left_join_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$left_table;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$right_table;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$on;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$left_table = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$right_table = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$on = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_left_join_native.class, semantic_etl_bus.$sym577$SQL_LEFT_JOIN, semantic_etl_bus.$sym578$SQL_LEFT_JOIN_P, semantic_etl_bus.$list579, semantic_etl_bus.$list580, new String[] { "$left_table", "$right_table", "$on" }, semantic_etl_bus.$list581, semantic_etl_bus.$list582, semantic_etl_bus.$sym583$PRINT_SQL_LEFT_JOIN);
        }
    }
    
    public static final class $sql_left_join_p$UnaryFunction extends UnaryFunction
    {
        public $sql_left_join_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-LEFT-JOIN-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_left_join_p(arg1);
        }
    }
    
    public static final class $sql_union_native extends SubLStructNative
    {
        public SubLObject $select1;
        public SubLObject $select2;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_union_native() {
            this.$select1 = (SubLObject)CommonSymbols.NIL;
            this.$select2 = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_union_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$select1;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$select2;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$select1 = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$select2 = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_union_native.class, semantic_etl_bus.$sym597$SQL_UNION, semantic_etl_bus.$sym598$SQL_UNION_P, semantic_etl_bus.$list599, semantic_etl_bus.$list600, new String[] { "$select1", "$select2" }, semantic_etl_bus.$list601, semantic_etl_bus.$list602, semantic_etl_bus.$sym603$PRINT_SQL_UNION);
        }
    }
    
    public static final class $sql_union_p$UnaryFunction extends UnaryFunction
    {
        public $sql_union_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-UNION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_union_p(arg1);
        }
    }
    
    public static final class $sql_alter_table_native extends SubLStructNative
    {
        public SubLObject $table;
        public SubLObject $action;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_alter_table_native() {
            this.$table = (SubLObject)CommonSymbols.NIL;
            this.$action = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_alter_table_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$action;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$action = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_alter_table_native.class, semantic_etl_bus.$sym615$SQL_ALTER_TABLE, semantic_etl_bus.$sym616$SQL_ALTER_TABLE_P, semantic_etl_bus.$list617, semantic_etl_bus.$list618, new String[] { "$table", "$action" }, semantic_etl_bus.$list619, semantic_etl_bus.$list620, semantic_etl_bus.$sym621$PRINT_SQL_ALTER_TABLE);
        }
    }
    
    public static final class $sql_alter_table_p$UnaryFunction extends UnaryFunction
    {
        public $sql_alter_table_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-ALTER-TABLE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_alter_table_p(arg1);
        }
    }
    
    public static final class $sql_add_column_native extends SubLStructNative
    {
        public SubLObject $column;
        public SubLObject $type;
        public SubLObject $size;
        public SubLObject $constraints;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_add_column_native() {
            this.$column = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$size = (SubLObject)CommonSymbols.NIL;
            this.$constraints = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_add_column_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$column;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$size;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$constraints;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$column = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$size = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$constraints = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_add_column_native.class, semantic_etl_bus.$sym633$SQL_ADD_COLUMN, semantic_etl_bus.$sym634$SQL_ADD_COLUMN_P, semantic_etl_bus.$list635, semantic_etl_bus.$list636, new String[] { "$column", "$type", "$size", "$constraints" }, semantic_etl_bus.$list637, semantic_etl_bus.$list638, semantic_etl_bus.$sym639$PRINT_SQL_ADD_COLUMN);
        }
    }
    
    public static final class $sql_add_column_p$UnaryFunction extends UnaryFunction
    {
        public $sql_add_column_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-ADD-COLUMN-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_add_column_p(arg1);
        }
    }
    
    public static final class $sql_drop_column_native extends SubLStructNative
    {
        public SubLObject $column;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_drop_column_native() {
            this.$column = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_drop_column_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$column;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$column = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_drop_column_native.class, semantic_etl_bus.$sym659$SQL_DROP_COLUMN, semantic_etl_bus.$sym660$SQL_DROP_COLUMN_P, semantic_etl_bus.$list661, semantic_etl_bus.$list662, new String[] { "$column" }, semantic_etl_bus.$list663, semantic_etl_bus.$list664, semantic_etl_bus.$sym665$PRINT_SQL_DROP_COLUMN);
        }
    }
    
    public static final class $sql_drop_column_p$UnaryFunction extends UnaryFunction
    {
        public $sql_drop_column_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-DROP-COLUMN-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_drop_column_p(arg1);
        }
    }
    
    public static final class $sql_rename_column_native extends SubLStructNative
    {
        public SubLObject $old_column;
        public SubLObject $new_column;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_rename_column_native() {
            this.$old_column = (SubLObject)CommonSymbols.NIL;
            this.$new_column = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_rename_column_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$old_column;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$new_column;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$old_column = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$new_column = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_rename_column_native.class, semantic_etl_bus.$sym673$SQL_RENAME_COLUMN, semantic_etl_bus.$sym674$SQL_RENAME_COLUMN_P, semantic_etl_bus.$list675, semantic_etl_bus.$list676, new String[] { "$old_column", "$new_column" }, semantic_etl_bus.$list677, semantic_etl_bus.$list678, semantic_etl_bus.$sym679$PRINT_SQL_RENAME_COLUMN);
        }
    }
    
    public static final class $sql_rename_column_p$UnaryFunction extends UnaryFunction
    {
        public $sql_rename_column_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-RENAME-COLUMN-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_rename_column_p(arg1);
        }
    }
    
    public static final class $sql_add_constraint_native extends SubLStructNative
    {
        public SubLObject $constraint;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_add_constraint_native() {
            this.$constraint = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_add_constraint_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$constraint;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$constraint = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_add_constraint_native.class, semantic_etl_bus.$sym691$SQL_ADD_CONSTRAINT, semantic_etl_bus.$sym692$SQL_ADD_CONSTRAINT_P, semantic_etl_bus.$list693, semantic_etl_bus.$list694, new String[] { "$constraint" }, semantic_etl_bus.$list695, semantic_etl_bus.$list696, semantic_etl_bus.$sym697$PRINT_SQL_ADD_CONSTRAINT);
        }
    }
    
    public static final class $sql_add_constraint_p$UnaryFunction extends UnaryFunction
    {
        public $sql_add_constraint_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-ADD-CONSTRAINT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_add_constraint_p(arg1);
        }
    }
    
    public static final class $sql_drop_constraint_native extends SubLStructNative
    {
        public SubLObject $constraint;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_drop_constraint_native() {
            this.$constraint = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_drop_constraint_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$constraint;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$constraint = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_drop_constraint_native.class, semantic_etl_bus.$sym707$SQL_DROP_CONSTRAINT, semantic_etl_bus.$sym708$SQL_DROP_CONSTRAINT_P, semantic_etl_bus.$list693, semantic_etl_bus.$list694, new String[] { "$constraint" }, semantic_etl_bus.$list709, semantic_etl_bus.$list710, semantic_etl_bus.$sym711$PRINT_SQL_DROP_CONSTRAINT);
        }
    }
    
    public static final class $sql_drop_constraint_p$UnaryFunction extends UnaryFunction
    {
        public $sql_drop_constraint_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-DROP-CONSTRAINT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_drop_constraint_p(arg1);
        }
    }
    
    public static final class $sql_fk_column_constraint_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $table;
        public SubLObject $column;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_fk_column_constraint_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$table = (SubLObject)CommonSymbols.NIL;
            this.$column = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_fk_column_constraint_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$table;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$column;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$table = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$column = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_fk_column_constraint_native.class, semantic_etl_bus.$sym719$SQL_FK_COLUMN_CONSTRAINT, semantic_etl_bus.$sym720$SQL_FK_COLUMN_CONSTRAINT_P, semantic_etl_bus.$list721, semantic_etl_bus.$list722, new String[] { "$name", "$table", "$column" }, semantic_etl_bus.$list723, semantic_etl_bus.$list724, semantic_etl_bus.$sym725$PRINT_SQL_FK_COLUMN_CONSTRAINT);
        }
    }
    
    public static final class $sql_fk_column_constraint_p$UnaryFunction extends UnaryFunction
    {
        public $sql_fk_column_constraint_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-FK-COLUMN-CONSTRAINT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_fk_column_constraint_p(arg1);
        }
    }
    
    public static final class $sql_fk_table_constraint_native extends SubLStructNative
    {
        public SubLObject $column;
        public SubLObject $constraint;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_fk_table_constraint_native() {
            this.$column = (SubLObject)CommonSymbols.NIL;
            this.$constraint = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_fk_table_constraint_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$column;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$constraint;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$column = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$constraint = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_fk_table_constraint_native.class, semantic_etl_bus.$sym738$SQL_FK_TABLE_CONSTRAINT, semantic_etl_bus.$sym739$SQL_FK_TABLE_CONSTRAINT_P, semantic_etl_bus.$list740, semantic_etl_bus.$list741, new String[] { "$column", "$constraint" }, semantic_etl_bus.$list742, semantic_etl_bus.$list743, semantic_etl_bus.$sym744$PRINT_SQL_FK_TABLE_CONSTRAINT);
        }
    }
    
    public static final class $sql_fk_table_constraint_p$UnaryFunction extends UnaryFunction
    {
        public $sql_fk_table_constraint_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-FK-TABLE-CONSTRAINT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_fk_table_constraint_p(arg1);
        }
    }
    
    public static final class $sql_update_native extends SubLStructNative
    {
        public SubLObject $table;
        public SubLObject $settings;
        public SubLObject $conditions;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_update_native() {
            this.$table = (SubLObject)CommonSymbols.NIL;
            this.$settings = (SubLObject)CommonSymbols.NIL;
            this.$conditions = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_update_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$settings;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$conditions;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$settings = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$conditions = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_update_native.class, semantic_etl_bus.$sym754$SQL_UPDATE, semantic_etl_bus.$sym755$SQL_UPDATE_P, semantic_etl_bus.$list756, semantic_etl_bus.$list757, new String[] { "$table", "$settings", "$conditions" }, semantic_etl_bus.$list758, semantic_etl_bus.$list759, semantic_etl_bus.$sym760$PRINT_SQL_UPDATE);
        }
    }
    
    public static final class $sql_update_p$UnaryFunction extends UnaryFunction
    {
        public $sql_update_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-UPDATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_update_p(arg1);
        }
    }
    
    public static final class $sql_drop_table_native extends SubLStructNative
    {
        public SubLObject $table;
        private static final SubLStructDeclNative structDecl;
        
        public $sql_drop_table_native() {
            this.$table = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_drop_table_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$table;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$table = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_drop_table_native.class, semantic_etl_bus.$sym774$SQL_DROP_TABLE, semantic_etl_bus.$sym775$SQL_DROP_TABLE_P, semantic_etl_bus.$list776, semantic_etl_bus.$list777, new String[] { "$table" }, semantic_etl_bus.$list778, semantic_etl_bus.$list779, semantic_etl_bus.$sym780$PRINT_SQL_DROP_TABLE);
        }
    }
    
    public static final class $sql_drop_table_p$UnaryFunction extends UnaryFunction
    {
        public $sql_drop_table_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-DROP-TABLE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return semantic_etl_bus.sql_drop_table_p(arg1);
        }
    }
}

/*

	Total time: 5844 ms
	 synthetic 
*/