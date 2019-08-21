package com.cyc.cycjava.cycl.sksi;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.semantic_etl_bus.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class semantic_etl_bus extends SubLTranslatedFile {
    public static final SubLFile me = new semantic_etl_bus();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.semantic_etl_bus";

    public static final String myFingerPrint = "21c79afd1d15c01f1f72091ab14a8fb1c00fee6f2c4b23545c15a8db7a1e5dc4";

    // defvar
    // Definitions
    public static final SubLSymbol $semantic_etl_debugP$ = makeSymbol("*SEMANTIC-ETL-DEBUG?*");







    // deflexical
    public static final SubLSymbol $find_corresponding_item_in_semantics_method_table$ = makeSymbol("*FIND-CORRESPONDING-ITEM-IN-SEMANTICS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $semantic_object_comparison_name_method_table$ = makeSymbol("*SEMANTIC-OBJECT-COMPARISON-NAME-METHOD-TABLE*");

    // defconstant
    public static final SubLSymbol $dtp_semantics$ = makeSymbol("*DTP-SEMANTICS*");

    // defconstant
    public static final SubLSymbol $dtp_table_semantics$ = makeSymbol("*DTP-TABLE-SEMANTICS*");



    // defconstant
    public static final SubLSymbol $dtp_foreign_key_constraint$ = makeSymbol("*DTP-FOREIGN-KEY-CONSTRAINT*");

    // defconstant
    public static final SubLSymbol $dtp_primary_key_constraint$ = makeSymbol("*DTP-PRIMARY-KEY-CONSTRAINT*");

    // defconstant
    public static final SubLSymbol $dtp_column_semantics$ = makeSymbol("*DTP-COLUMN-SEMANTICS*");

    // defconstant
    public static final SubLSymbol $dtp_value_semantics$ = makeSymbol("*DTP-VALUE-SEMANTICS*");



    // defconstant
    public static final SubLSymbol $dtp_database_output_spec$ = makeSymbol("*DTP-DATABASE-OUTPUT-SPEC*");

    // defparameter
    /**
     * all sql commands before have been applied to the semantics object, all after
     * have not
     */
    public static final SubLSymbol $recipe_marker$ = makeSymbol("*RECIPE-MARKER*");

    // deflexical
    public static final SubLSymbol $semantic_recipe_step_p_method_table$ = makeSymbol("*SEMANTIC-RECIPE-STEP-P-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $empty_semantic_recipe_step_p_method_table$ = makeSymbol("*EMPTY-SEMANTIC-RECIPE-STEP-P-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $set_semantic_recipe_step_output_spec_method_table$ = makeSymbol("*SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $semantic_recipe_append_to_drops_method_table$ = makeSymbol("*SEMANTIC-RECIPE-APPEND-TO-DROPS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $semantic_recipe_append_to_adds_method_table$ = makeSymbol("*SEMANTIC-RECIPE-APPEND-TO-ADDS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $semantic_recipe_remove_from_drops_method_table$ = makeSymbol("*SEMANTIC-RECIPE-REMOVE-FROM-DROPS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $semantic_recipe_remove_from_adds_method_table$ = makeSymbol("*SEMANTIC-RECIPE-REMOVE-FROM-ADDS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $set_semantic_recipe_step_column_correspondence_list_method_table$ = makeSymbol("*SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $semantic_recipe_step_column_correspondence_list_method_table$ = makeSymbol("*SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $set_semantic_recipe_step_sql_start_index_method_table$ = makeSymbol("*SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $set_semantic_recipe_step_sql_end_index_method_table$ = makeSymbol("*SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $semantic_recipe_step_copy_method_table$ = makeSymbol("*SEMANTIC-RECIPE-STEP-COPY-METHOD-TABLE*");

    // defconstant
    public static final SubLSymbol $dtp_table_merger$ = makeSymbol("*DTP-TABLE-MERGER*");

    // defconstant
    public static final SubLSymbol $dtp_column_merger$ = makeSymbol("*DTP-COLUMN-MERGER*");

    // defconstant
    public static final SubLSymbol $dtp_sql_conjunction$ = makeSymbol("*DTP-SQL-CONJUNCTION*");

    // defconstant
    public static final SubLSymbol $dtp_sql_disjunction$ = makeSymbol("*DTP-SQL-DISJUNCTION*");

    // defconstant
    public static final SubLSymbol $dtp_sql_copy_table$ = makeSymbol("*DTP-SQL-COPY-TABLE*");

    // defconstant
    public static final SubLSymbol $dtp_sql_insert_into$ = makeSymbol("*DTP-SQL-INSERT-INTO*");

    // defconstant
    public static final SubLSymbol $dtp_sql_select_from$ = makeSymbol("*DTP-SQL-SELECT-FROM*");

    // defconstant
    public static final SubLSymbol $dtp_sql_except$ = makeSymbol("*DTP-SQL-EXCEPT*");

    // defconstant
    public static final SubLSymbol $dtp_sql_alias$ = makeSymbol("*DTP-SQL-ALIAS*");

    // defconstant
    public static final SubLSymbol $dtp_sql_column_equal$ = makeSymbol("*DTP-SQL-COLUMN-EQUAL*");

    // defconstant
    public static final SubLSymbol $dtp_sql_is_null$ = makeSymbol("*DTP-SQL-IS-NULL*");

    // defconstant
    public static final SubLSymbol $dtp_sql_not_in$ = makeSymbol("*DTP-SQL-NOT-IN*");

    // defconstant
    public static final SubLSymbol $dtp_sql_inner_join$ = makeSymbol("*DTP-SQL-INNER-JOIN*");

    // defconstant
    public static final SubLSymbol $dtp_sql_left_join$ = makeSymbol("*DTP-SQL-LEFT-JOIN*");

    // defconstant
    public static final SubLSymbol $dtp_sql_union$ = makeSymbol("*DTP-SQL-UNION*");

    // defconstant
    public static final SubLSymbol $dtp_sql_alter_table$ = makeSymbol("*DTP-SQL-ALTER-TABLE*");

    // defconstant
    public static final SubLSymbol $dtp_sql_add_column$ = makeSymbol("*DTP-SQL-ADD-COLUMN*");

    // defconstant
    public static final SubLSymbol $dtp_sql_drop_column$ = makeSymbol("*DTP-SQL-DROP-COLUMN*");

    // defconstant
    public static final SubLSymbol $dtp_sql_rename_column$ = makeSymbol("*DTP-SQL-RENAME-COLUMN*");

    // defconstant
    public static final SubLSymbol $dtp_sql_add_constraint$ = makeSymbol("*DTP-SQL-ADD-CONSTRAINT*");

    // defconstant
    public static final SubLSymbol $dtp_sql_drop_constraint$ = makeSymbol("*DTP-SQL-DROP-CONSTRAINT*");

    // defconstant
    public static final SubLSymbol $dtp_sql_fk_column_constraint$ = makeSymbol("*DTP-SQL-FK-COLUMN-CONSTRAINT*");

    // defconstant
    public static final SubLSymbol $dtp_sql_fk_table_constraint$ = makeSymbol("*DTP-SQL-FK-TABLE-CONSTRAINT*");

    // defconstant
    public static final SubLSymbol $dtp_sql_update$ = makeSymbol("*DTP-SQL-UPDATE*");

    // defconstant
    public static final SubLSymbol $dtp_sql_drop_table$ = makeSymbol("*DTP-SQL-DROP-TABLE*");



    // deflexical
    private static final SubLSymbol $bln1_access_path$ = makeSymbol("*BLN1-ACCESS-PATH*");

    // deflexical
    private static final SubLSymbol $bln2_access_path$ = makeSymbol("*BLN2-ACCESS-PATH*");















    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("TABLE-SEMANTICS"), makeSymbol("SEMANTICS")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol SEMANTICS_TABLE_SEMANTICS_LIST = makeSymbol("SEMANTICS-TABLE-SEMANTICS-LIST");

    public static final SubLList $list3 = list(list(makeSymbol("CONSTRAINT"), makeSymbol("TABLE-SEMANTICS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol TABLE_SEMANTICS_COLUMN_CONSTRAINTS = makeSymbol("TABLE-SEMANTICS-COLUMN-CONSTRAINTS");



    public static final SubLSymbol $database_output_specs$ = makeSymbol("*DATABASE-OUTPUT-SPECS*");

    public static final SubLSymbol $database_output_specs_lock$ = makeSymbol("*DATABASE-OUTPUT-SPECS-LOCK*");

    public static final SubLString $$$Database_Output_Specs = makeString("Database Output Specs");

    public static final SubLSymbol ACCESS_PATH_P = makeSymbol("ACCESS-PATH-P");

    public static final SubLString $str10$Please_select_an_output_specifica = makeString("Please select an output specification: ");

    public static final SubLString $str11$_________________________________ = makeString("-----------------------------------ITERATION---------------------------------------------------");



    public static final SubLString $str13$There_is_no_output_specification_ = makeString("There is no output specification with tag ~a");

    public static final SubLSymbol SEMANTIC_ETL_FUSE_DATABASES = makeSymbol("SEMANTIC-ETL-FUSE-DATABASES");

    public static final SubLString $str15$Can_only_fuse_exactly_two_databas = makeString("Can only fuse exactly two databases");

    public static final SubLSymbol $semantic_etl_fuse_databases_caching_state$ = makeSymbol("*SEMANTIC-ETL-FUSE-DATABASES-CACHING-STATE*");



    private static final SubLString $str18$Don_t_know_how_to_find_a__S_in_a_ = makeString("Don't know how to find a ~S in a semantics-p");

    private static final SubLString $str19$don_t_know_how_to_name__S__ = makeString("don't know how to name ~S~%");



    private static final SubLSymbol SEMANTICS_P = makeSymbol("SEMANTICS-P");

    private static final SubLList $list22 = list(makeSymbol("ACCESS-PATH"), makeSymbol("TABLE-SEMANTICS-LIST"), makeSymbol("TABLE-ALIASES"), makeSymbol("DICT"), makeSymbol("DROPPED-ITEMS"), makeSymbol("OUTPUT-SPEC"));

    public static final SubLList $list23 = list(makeKeyword("ACCESS-PATH"), makeKeyword("TABLE-SEMANTICS-LIST"), makeKeyword("TABLE-ALIASES"), makeKeyword("DICT"), makeKeyword("DROPPED-ITEMS"), makeKeyword("OUTPUT-SPEC"));

    public static final SubLList $list24 = list(makeSymbol("SEMANT-ACCESS-PATH"), makeSymbol("SEMANT-TABLE-SEMANTICS-LIST"), makeSymbol("SEMANT-TABLE-ALIASES"), makeSymbol("SEMANT-DICT"), makeSymbol("SEMANT-DROPPED-ITEMS"), makeSymbol("SEMANT-OUTPUT-SPEC"));

    public static final SubLList $list25 = list(makeSymbol("_CSETF-SEMANT-ACCESS-PATH"), makeSymbol("_CSETF-SEMANT-TABLE-SEMANTICS-LIST"), makeSymbol("_CSETF-SEMANT-TABLE-ALIASES"), makeSymbol("_CSETF-SEMANT-DICT"), makeSymbol("_CSETF-SEMANT-DROPPED-ITEMS"), makeSymbol("_CSETF-SEMANT-OUTPUT-SPEC"));

    private static final SubLSymbol PRINT_SEMANTICS = makeSymbol("PRINT-SEMANTICS");

    private static final SubLSymbol SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list28 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SEMANTICS-P"));

    public static final SubLSymbol SEMANT_ACCESS_PATH = makeSymbol("SEMANT-ACCESS-PATH");

    public static final SubLSymbol _CSETF_SEMANT_ACCESS_PATH = makeSymbol("_CSETF-SEMANT-ACCESS-PATH");

    public static final SubLSymbol SEMANT_TABLE_SEMANTICS_LIST = makeSymbol("SEMANT-TABLE-SEMANTICS-LIST");

    public static final SubLSymbol _CSETF_SEMANT_TABLE_SEMANTICS_LIST = makeSymbol("_CSETF-SEMANT-TABLE-SEMANTICS-LIST");

    public static final SubLSymbol SEMANT_TABLE_ALIASES = makeSymbol("SEMANT-TABLE-ALIASES");

    public static final SubLSymbol _CSETF_SEMANT_TABLE_ALIASES = makeSymbol("_CSETF-SEMANT-TABLE-ALIASES");

    public static final SubLSymbol SEMANT_DICT = makeSymbol("SEMANT-DICT");

    public static final SubLSymbol _CSETF_SEMANT_DICT = makeSymbol("_CSETF-SEMANT-DICT");

    public static final SubLSymbol SEMANT_DROPPED_ITEMS = makeSymbol("SEMANT-DROPPED-ITEMS");

    public static final SubLSymbol _CSETF_SEMANT_DROPPED_ITEMS = makeSymbol("_CSETF-SEMANT-DROPPED-ITEMS");

    public static final SubLSymbol SEMANT_OUTPUT_SPEC = makeSymbol("SEMANT-OUTPUT-SPEC");

    public static final SubLSymbol _CSETF_SEMANT_OUTPUT_SPEC = makeSymbol("_CSETF-SEMANT-OUTPUT-SPEC");



    private static final SubLSymbol $TABLE_SEMANTICS_LIST = makeKeyword("TABLE-SEMANTICS-LIST");









    public static final SubLString $str47$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SEMANTICS = makeSymbol("MAKE-SEMANTICS");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SEMANTICS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SEMANTICS-METHOD");

    private static final SubLString $str53$_SEMANTICS____a_____a_ = makeString("<SEMANTICS: [~a]\n  ~a>");



    private static final SubLSymbol TABLE_SEMANTICS_P = makeSymbol("TABLE-SEMANTICS-P");

    private static final SubLString $str56$don_t_know_how_to_handle__S = makeString("don't know how to handle ~S");

    private static final SubLString $str57$Table__S_is_pointed_to_by__A_and_ = makeString("Table ~S is pointed to by ~A and cannot be deleted");

    private static final SubLSymbol TABLE_SEMANTICS_TABLE_NAME = makeSymbol("TABLE-SEMANTICS-TABLE-NAME");

    private static final SubLSymbol COLUMN_SEMANTICS_P = makeSymbol("COLUMN-SEMANTICS-P");

    private static final SubLSymbol PRIMARY_KEY_CONSTRAINT_P = makeSymbol("PRIMARY-KEY-CONSTRAINT-P");

    private static final SubLSymbol FOREIGN_KEY_CONSTRAINT_P = makeSymbol("FOREIGN-KEY-CONSTRAINT-P");

    private static final SubLSymbol TABLE_SEMANTICS = makeSymbol("TABLE-SEMANTICS");

    private static final SubLList $list63 = list(new SubLObject[]{ makeSymbol("TABLE-ID"), makeSymbol("TABLE-NAME"), makeSymbol("SOURCE-SEMANTICS"), makeSymbol("SEMANTICS"), makeSymbol("POINTS-TO-TABLE-IDS"), makeSymbol("POINTED-TO-BY-TABLE-IDS"), makeSymbol("TABLE-PARSES"), makeSymbol("COLUMN-SEMANTICS-LIST"), makeSymbol("PRIMARY-KEY-COLUMNS"), makeSymbol("COLUMN-CONSTRAINTS") });

    private static final SubLList $list64 = list(new SubLObject[]{ makeKeyword("TABLE-ID"), makeKeyword("TABLE-NAME"), makeKeyword("SOURCE-SEMANTICS"), makeKeyword("SEMANTICS"), makeKeyword("POINTS-TO-TABLE-IDS"), makeKeyword("POINTED-TO-BY-TABLE-IDS"), makeKeyword("TABLE-PARSES"), makeKeyword("COLUMN-SEMANTICS-LIST"), makeKeyword("PRIMARY-KEY-COLUMNS"), makeKeyword("COLUMN-CONSTRAINTS") });

    private static final SubLList $list65 = list(new SubLObject[]{ makeSymbol("T-SEMANT-TABLE-ID"), makeSymbol("T-SEMANT-TABLE-NAME"), makeSymbol("T-SEMANT-SOURCE-SEMANTICS"), makeSymbol("T-SEMANT-SEMANTICS"), makeSymbol("T-SEMANT-POINTS-TO-TABLE-IDS"), makeSymbol("T-SEMANT-POINTED-TO-BY-TABLE-IDS"), makeSymbol("T-SEMANT-TABLE-PARSES"), makeSymbol("T-SEMANT-COLUMN-SEMANTICS-LIST"), makeSymbol("T-SEMANT-PRIMARY-KEY-COLUMNS"), makeSymbol("T-SEMANT-COLUMN-CONSTRAINTS") });

    private static final SubLList $list66 = list(new SubLObject[]{ makeSymbol("_CSETF-T-SEMANT-TABLE-ID"), makeSymbol("_CSETF-T-SEMANT-TABLE-NAME"), makeSymbol("_CSETF-T-SEMANT-SOURCE-SEMANTICS"), makeSymbol("_CSETF-T-SEMANT-SEMANTICS"), makeSymbol("_CSETF-T-SEMANT-POINTS-TO-TABLE-IDS"), makeSymbol("_CSETF-T-SEMANT-POINTED-TO-BY-TABLE-IDS"), makeSymbol("_CSETF-T-SEMANT-TABLE-PARSES"), makeSymbol("_CSETF-T-SEMANT-COLUMN-SEMANTICS-LIST"), makeSymbol("_CSETF-T-SEMANT-PRIMARY-KEY-COLUMNS"), makeSymbol("_CSETF-T-SEMANT-COLUMN-CONSTRAINTS") });

    private static final SubLSymbol PRINT_TABLE_SEMANTICS = makeSymbol("PRINT-TABLE-SEMANTICS");

    private static final SubLSymbol TABLE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TABLE-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list69 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TABLE-SEMANTICS-P"));

    private static final SubLSymbol T_SEMANT_TABLE_ID = makeSymbol("T-SEMANT-TABLE-ID");

    private static final SubLSymbol _CSETF_T_SEMANT_TABLE_ID = makeSymbol("_CSETF-T-SEMANT-TABLE-ID");

    private static final SubLSymbol T_SEMANT_TABLE_NAME = makeSymbol("T-SEMANT-TABLE-NAME");

    private static final SubLSymbol _CSETF_T_SEMANT_TABLE_NAME = makeSymbol("_CSETF-T-SEMANT-TABLE-NAME");

    private static final SubLSymbol T_SEMANT_SOURCE_SEMANTICS = makeSymbol("T-SEMANT-SOURCE-SEMANTICS");

    private static final SubLSymbol _CSETF_T_SEMANT_SOURCE_SEMANTICS = makeSymbol("_CSETF-T-SEMANT-SOURCE-SEMANTICS");

    private static final SubLSymbol T_SEMANT_SEMANTICS = makeSymbol("T-SEMANT-SEMANTICS");

    private static final SubLSymbol _CSETF_T_SEMANT_SEMANTICS = makeSymbol("_CSETF-T-SEMANT-SEMANTICS");

    private static final SubLSymbol T_SEMANT_POINTS_TO_TABLE_IDS = makeSymbol("T-SEMANT-POINTS-TO-TABLE-IDS");

    private static final SubLSymbol _CSETF_T_SEMANT_POINTS_TO_TABLE_IDS = makeSymbol("_CSETF-T-SEMANT-POINTS-TO-TABLE-IDS");

    private static final SubLSymbol T_SEMANT_POINTED_TO_BY_TABLE_IDS = makeSymbol("T-SEMANT-POINTED-TO-BY-TABLE-IDS");

    private static final SubLSymbol _CSETF_T_SEMANT_POINTED_TO_BY_TABLE_IDS = makeSymbol("_CSETF-T-SEMANT-POINTED-TO-BY-TABLE-IDS");

    private static final SubLSymbol T_SEMANT_TABLE_PARSES = makeSymbol("T-SEMANT-TABLE-PARSES");

    private static final SubLSymbol _CSETF_T_SEMANT_TABLE_PARSES = makeSymbol("_CSETF-T-SEMANT-TABLE-PARSES");

    private static final SubLSymbol T_SEMANT_COLUMN_SEMANTICS_LIST = makeSymbol("T-SEMANT-COLUMN-SEMANTICS-LIST");

    private static final SubLSymbol _CSETF_T_SEMANT_COLUMN_SEMANTICS_LIST = makeSymbol("_CSETF-T-SEMANT-COLUMN-SEMANTICS-LIST");

    private static final SubLSymbol T_SEMANT_PRIMARY_KEY_COLUMNS = makeSymbol("T-SEMANT-PRIMARY-KEY-COLUMNS");

    private static final SubLSymbol _CSETF_T_SEMANT_PRIMARY_KEY_COLUMNS = makeSymbol("_CSETF-T-SEMANT-PRIMARY-KEY-COLUMNS");

    private static final SubLSymbol T_SEMANT_COLUMN_CONSTRAINTS = makeSymbol("T-SEMANT-COLUMN-CONSTRAINTS");

    private static final SubLSymbol _CSETF_T_SEMANT_COLUMN_CONSTRAINTS = makeSymbol("_CSETF-T-SEMANT-COLUMN-CONSTRAINTS");









    private static final SubLSymbol $POINTS_TO_TABLE_IDS = makeKeyword("POINTS-TO-TABLE-IDS");

    private static final SubLSymbol $POINTED_TO_BY_TABLE_IDS = makeKeyword("POINTED-TO-BY-TABLE-IDS");



    private static final SubLSymbol $COLUMN_SEMANTICS_LIST = makeKeyword("COLUMN-SEMANTICS-LIST");

    private static final SubLSymbol $PRIMARY_KEY_COLUMNS = makeKeyword("PRIMARY-KEY-COLUMNS");



    private static final SubLSymbol MAKE_TABLE_SEMANTICS = makeSymbol("MAKE-TABLE-SEMANTICS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TABLE_SEMANTICS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TABLE-SEMANTICS-METHOD");

    private static final SubLString $str102$_TABLE__a__s___a__a___ref__a_ref_ = makeString("<TABLE:~a ~s [~a/~a]: ref ~a ref-by ~a ~a ~a>");

    private static final SubLSymbol $semantic_etl_table_isg$ = makeSymbol("*SEMANTIC-ETL-TABLE-ISG*");

    private static final SubLList $list104 = list(list(makeSymbol("COLUMN-SEMANTICS"), makeSymbol("TABLE-SEMANTICS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol TABLE_SEMANTICS_COLUMN_SEMANTICS_LIST = makeSymbol("TABLE-SEMANTICS-COLUMN-SEMANTICS-LIST");



    private static final SubLSymbol COLUMN_SEMANTICS_COLUMN_NAME = makeSymbol("COLUMN-SEMANTICS-COLUMN-NAME");

    private static final SubLSymbol COPY_COLUMN_CONSTRAINT = makeSymbol("COPY-COLUMN-CONSTRAINT");





    private static final SubLSymbol FIND_CORRESPONDING_ITEM_IN_SEMANTICS_TABLE_SEMANTICS_METHOD = makeSymbol("FIND-CORRESPONDING-ITEM-IN-SEMANTICS-TABLE-SEMANTICS-METHOD");

    private static final SubLSymbol SEMANTIC_OBJECT_COMPARISON_NAME_TABLE_SEMANTICS_METHOD = makeSymbol("SEMANTIC-OBJECT-COMPARISON-NAME-TABLE-SEMANTICS-METHOD");

    private static final SubLSymbol FOREIGN_KEY_CONSTRAINT_CONSTRAINED_COLUMN = makeSymbol("FOREIGN-KEY-CONSTRAINT-CONSTRAINED-COLUMN");

    private static final SubLSymbol $sym114$CONTENT_COLUMN_ = makeSymbol("CONTENT-COLUMN?");

    private static final SubLSymbol COLUMN_CONSTRAINT_P = makeSymbol("COLUMN-CONSTRAINT-P");

    private static final SubLString $str116$Column__S_is_pointed_to_by__A_and = makeString("Column ~S is pointed to by ~A and cannot be deleted");

    private static final SubLString $str117$don_t_know_how_to_remove_constrai = makeString("don't know how to remove constraint ~S from ~S");

    private static final SubLString $str118$Don_t_know_how_to_copy_constraint = makeString("Don't know how to copy constraint: ~S~%");

    private static final SubLSymbol FOREIGN_KEY_CONSTRAINT = makeSymbol("FOREIGN-KEY-CONSTRAINT");

    private static final SubLList $list120 = list(makeSymbol("CONSTRAINT-NAME"), makeSymbol("CONSTRAINED-COLUMN"), makeSymbol("CONSTRAINING-TABLE"), makeSymbol("CONSTRAINING-COLUMN"));

    private static final SubLList $list121 = list(makeKeyword("CONSTRAINT-NAME"), makeKeyword("CONSTRAINED-COLUMN"), makeKeyword("CONSTRAINING-TABLE"), makeKeyword("CONSTRAINING-COLUMN"));

    private static final SubLList $list122 = list(makeSymbol("FK-CONSTRAINT-CONSTRAINT-NAME"), makeSymbol("FK-CONSTRAINT-CONSTRAINED-COLUMN"), makeSymbol("FK-CONSTRAINT-CONSTRAINING-TABLE"), makeSymbol("FK-CONSTRAINT-CONSTRAINING-COLUMN"));

    private static final SubLList $list123 = list(makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINT-NAME"), makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINED-COLUMN"), makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINING-TABLE"), makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINING-COLUMN"));

    private static final SubLSymbol PRINT_FOREIGN_KEY_CONSTRAINT = makeSymbol("PRINT-FOREIGN-KEY-CONSTRAINT");

    private static final SubLSymbol FOREIGN_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FOREIGN-KEY-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list126 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FOREIGN-KEY-CONSTRAINT-P"));

    private static final SubLSymbol FK_CONSTRAINT_CONSTRAINT_NAME = makeSymbol("FK-CONSTRAINT-CONSTRAINT-NAME");

    private static final SubLSymbol _CSETF_FK_CONSTRAINT_CONSTRAINT_NAME = makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINT-NAME");

    private static final SubLSymbol FK_CONSTRAINT_CONSTRAINED_COLUMN = makeSymbol("FK-CONSTRAINT-CONSTRAINED-COLUMN");

    private static final SubLSymbol _CSETF_FK_CONSTRAINT_CONSTRAINED_COLUMN = makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINED-COLUMN");

    private static final SubLSymbol FK_CONSTRAINT_CONSTRAINING_TABLE = makeSymbol("FK-CONSTRAINT-CONSTRAINING-TABLE");

    private static final SubLSymbol _CSETF_FK_CONSTRAINT_CONSTRAINING_TABLE = makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINING-TABLE");

    private static final SubLSymbol FK_CONSTRAINT_CONSTRAINING_COLUMN = makeSymbol("FK-CONSTRAINT-CONSTRAINING-COLUMN");

    private static final SubLSymbol _CSETF_FK_CONSTRAINT_CONSTRAINING_COLUMN = makeSymbol("_CSETF-FK-CONSTRAINT-CONSTRAINING-COLUMN");









    private static final SubLSymbol MAKE_FOREIGN_KEY_CONSTRAINT = makeSymbol("MAKE-FOREIGN-KEY-CONSTRAINT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FOREIGN_KEY_CONSTRAINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FOREIGN-KEY-CONSTRAINT-METHOD");

    private static final SubLString $str141$_FK_CONSTRAINT___a_____A__A__ = makeString("<FK-CONSTRAINT: ~a -> ~A(~A)>");

    private static final SubLSymbol $sym142$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_FOREIGN_KEY_CONSTRAINT_METHO = makeSymbol("FIND-CORRESPONDING-ITEM-IN-SEMANTICS-FOREIGN-KEY-CONSTRAINT-METHOD");

    private static final SubLString $str143$_ = makeString(".");

    private static final SubLString $str144$__ = makeString("->");

    private static final SubLSymbol SEMANTIC_OBJECT_COMPARISON_NAME_FOREIGN_KEY_CONSTRAINT_METHOD = makeSymbol("SEMANTIC-OBJECT-COMPARISON-NAME-FOREIGN-KEY-CONSTRAINT-METHOD");

    private static final SubLSymbol PRIMARY_KEY_CONSTRAINT = makeSymbol("PRIMARY-KEY-CONSTRAINT");

    private static final SubLList $list147 = list(makeSymbol("CONSTRAINT-NAME"), makeSymbol("CONSTRAINT-TYPE"), makeSymbol("CONSTRAINED-COLUMN"));

    private static final SubLList $list148 = list(makeKeyword("CONSTRAINT-NAME"), makeKeyword("CONSTRAINT-TYPE"), makeKeyword("CONSTRAINED-COLUMN"));

    private static final SubLList $list149 = list(makeSymbol("PK-CONSTRAINT-CONSTRAINT-NAME"), makeSymbol("PK-CONSTRAINT-CONSTRAINT-TYPE"), makeSymbol("PK-CONSTRAINT-CONSTRAINED-COLUMN"));

    private static final SubLList $list150 = list(makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINT-NAME"), makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINT-TYPE"), makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINED-COLUMN"));

    private static final SubLSymbol PRINT_PRIMARY_KEY_CONSTRAINT = makeSymbol("PRINT-PRIMARY-KEY-CONSTRAINT");

    private static final SubLSymbol PRIMARY_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PRIMARY-KEY-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list153 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PRIMARY-KEY-CONSTRAINT-P"));

    private static final SubLSymbol PK_CONSTRAINT_CONSTRAINT_NAME = makeSymbol("PK-CONSTRAINT-CONSTRAINT-NAME");

    private static final SubLSymbol _CSETF_PK_CONSTRAINT_CONSTRAINT_NAME = makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINT-NAME");

    private static final SubLSymbol PK_CONSTRAINT_CONSTRAINT_TYPE = makeSymbol("PK-CONSTRAINT-CONSTRAINT-TYPE");

    private static final SubLSymbol _CSETF_PK_CONSTRAINT_CONSTRAINT_TYPE = makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINT-TYPE");

    private static final SubLSymbol PK_CONSTRAINT_CONSTRAINED_COLUMN = makeSymbol("PK-CONSTRAINT-CONSTRAINED-COLUMN");

    private static final SubLSymbol _CSETF_PK_CONSTRAINT_CONSTRAINED_COLUMN = makeSymbol("_CSETF-PK-CONSTRAINT-CONSTRAINED-COLUMN");



    private static final SubLSymbol MAKE_PRIMARY_KEY_CONSTRAINT = makeSymbol("MAKE-PRIMARY-KEY-CONSTRAINT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PRIMARY_KEY_CONSTRAINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PRIMARY-KEY-CONSTRAINT-METHOD");

    private static final SubLString $str163$_PK_CONSTRAINT___a_ = makeString("<PK-CONSTRAINT: ~a>");

    private static final SubLSymbol $sym164$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_PRIMARY_KEY_CONSTRAINT_METHO = makeSymbol("FIND-CORRESPONDING-ITEM-IN-SEMANTICS-PRIMARY-KEY-CONSTRAINT-METHOD");

    private static final SubLString $$$pk_ = makeString("pk ");

    private static final SubLSymbol SEMANTIC_OBJECT_COMPARISON_NAME_PRIMARY_KEY_CONSTRAINT_METHOD = makeSymbol("SEMANTIC-OBJECT-COMPARISON-NAME-PRIMARY-KEY-CONSTRAINT-METHOD");

    private static final SubLSymbol COLUMN_SEMANTICS = makeSymbol("COLUMN-SEMANTICS");

    private static final SubLList $list168 = list(makeSymbol("COLUMN-NAME"), makeSymbol("COLUMN-PARSES"), makeSymbol("TABLE-SEMANTICS"), makeSymbol("VALUE-SEMANTICS-LIST"), makeSymbol("COLUMN-TYPE"), makeSymbol("COLUMN-SIZE"));

    private static final SubLList $list169 = list(makeKeyword("COLUMN-NAME"), makeKeyword("COLUMN-PARSES"), makeKeyword("TABLE-SEMANTICS"), makeKeyword("VALUE-SEMANTICS-LIST"), makeKeyword("COLUMN-TYPE"), makeKeyword("COLUMN-SIZE"));

    private static final SubLList $list170 = list(makeSymbol("C-SEMANT-COLUMN-NAME"), makeSymbol("C-SEMANT-COLUMN-PARSES"), makeSymbol("C-SEMANT-TABLE-SEMANTICS"), makeSymbol("C-SEMANT-VALUE-SEMANTICS-LIST"), makeSymbol("C-SEMANT-COLUMN-TYPE"), makeSymbol("C-SEMANT-COLUMN-SIZE"));

    private static final SubLList $list171 = list(makeSymbol("_CSETF-C-SEMANT-COLUMN-NAME"), makeSymbol("_CSETF-C-SEMANT-COLUMN-PARSES"), makeSymbol("_CSETF-C-SEMANT-TABLE-SEMANTICS"), makeSymbol("_CSETF-C-SEMANT-VALUE-SEMANTICS-LIST"), makeSymbol("_CSETF-C-SEMANT-COLUMN-TYPE"), makeSymbol("_CSETF-C-SEMANT-COLUMN-SIZE"));

    private static final SubLSymbol PRINT_COLUMN_SEMANTICS = makeSymbol("PRINT-COLUMN-SEMANTICS");

    private static final SubLSymbol COLUMN_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("COLUMN-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list174 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("COLUMN-SEMANTICS-P"));

    private static final SubLSymbol C_SEMANT_COLUMN_NAME = makeSymbol("C-SEMANT-COLUMN-NAME");

    private static final SubLSymbol _CSETF_C_SEMANT_COLUMN_NAME = makeSymbol("_CSETF-C-SEMANT-COLUMN-NAME");

    private static final SubLSymbol C_SEMANT_COLUMN_PARSES = makeSymbol("C-SEMANT-COLUMN-PARSES");

    private static final SubLSymbol _CSETF_C_SEMANT_COLUMN_PARSES = makeSymbol("_CSETF-C-SEMANT-COLUMN-PARSES");

    private static final SubLSymbol C_SEMANT_TABLE_SEMANTICS = makeSymbol("C-SEMANT-TABLE-SEMANTICS");

    private static final SubLSymbol _CSETF_C_SEMANT_TABLE_SEMANTICS = makeSymbol("_CSETF-C-SEMANT-TABLE-SEMANTICS");

    private static final SubLSymbol C_SEMANT_VALUE_SEMANTICS_LIST = makeSymbol("C-SEMANT-VALUE-SEMANTICS-LIST");

    private static final SubLSymbol _CSETF_C_SEMANT_VALUE_SEMANTICS_LIST = makeSymbol("_CSETF-C-SEMANT-VALUE-SEMANTICS-LIST");

    private static final SubLSymbol C_SEMANT_COLUMN_TYPE = makeSymbol("C-SEMANT-COLUMN-TYPE");

    private static final SubLSymbol _CSETF_C_SEMANT_COLUMN_TYPE = makeSymbol("_CSETF-C-SEMANT-COLUMN-TYPE");

    private static final SubLSymbol C_SEMANT_COLUMN_SIZE = makeSymbol("C-SEMANT-COLUMN-SIZE");

    private static final SubLSymbol _CSETF_C_SEMANT_COLUMN_SIZE = makeSymbol("_CSETF-C-SEMANT-COLUMN-SIZE");







    private static final SubLSymbol $VALUE_SEMANTICS_LIST = makeKeyword("VALUE-SEMANTICS-LIST");





    private static final SubLSymbol MAKE_COLUMN_SEMANTICS = makeSymbol("MAKE-COLUMN-SEMANTICS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_COLUMN_SEMANTICS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-COLUMN-SEMANTICS-METHOD");

    private static final SubLString $str195$_COLUMN___a__a__A__A__ = makeString("<COLUMN: ~a.~a/~A(~A)>");



    private static final SubLList $list197 = list(list(makeSymbol("VALUE-SEMANTICS"), makeSymbol("COLUMN-SEMANTICS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol COLUMN_SEMANTICS_VALUE_SEMANTICS_LIST = makeSymbol("COLUMN-SEMANTICS-VALUE-SEMANTICS-LIST");

    private static final SubLString $str199$ = makeString("");

    private static final SubLString $str200$_ = makeString("(");

    private static final SubLString $str201$_ = makeString(")");

    private static final SubLSymbol VALUE_SEMANTICS_P = makeSymbol("VALUE-SEMANTICS-P");

    private static final SubLSymbol FIND_CORRESPONDING_ITEM_IN_SEMANTICS_COLUMN_SEMANTICS_METHOD = makeSymbol("FIND-CORRESPONDING-ITEM-IN-SEMANTICS-COLUMN-SEMANTICS-METHOD");

    private static final SubLString $$$col_ = makeString("col ");

    private static final SubLSymbol SEMANTIC_OBJECT_COMPARISON_NAME_COLUMN_SEMANTICS_METHOD = makeSymbol("SEMANTIC-OBJECT-COMPARISON-NAME-COLUMN-SEMANTICS-METHOD");

    private static final SubLSymbol VALUE_SEMANTICS = makeSymbol("VALUE-SEMANTICS");

    public static final SubLList $list207 = list(makeSymbol("VALUE"), makeSymbol("VALUE-PARSES"));

    public static final SubLList $list208 = list(makeKeyword("VALUE"), makeKeyword("VALUE-PARSES"));

    public static final SubLList $list209 = list(makeSymbol("V-SEMANT-VALUE"), makeSymbol("V-SEMANT-VALUE-PARSES"));

    public static final SubLList $list210 = list(makeSymbol("_CSETF-V-SEMANT-VALUE"), makeSymbol("_CSETF-V-SEMANT-VALUE-PARSES"));

    private static final SubLSymbol PRINT_VALUE_SEMANTICS = makeSymbol("PRINT-VALUE-SEMANTICS");

    private static final SubLSymbol VALUE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VALUE-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list213 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("VALUE-SEMANTICS-P"));

    private static final SubLSymbol V_SEMANT_VALUE = makeSymbol("V-SEMANT-VALUE");

    private static final SubLSymbol _CSETF_V_SEMANT_VALUE = makeSymbol("_CSETF-V-SEMANT-VALUE");

    private static final SubLSymbol V_SEMANT_VALUE_PARSES = makeSymbol("V-SEMANT-VALUE-PARSES");

    private static final SubLSymbol _CSETF_V_SEMANT_VALUE_PARSES = makeSymbol("_CSETF-V-SEMANT-VALUE-PARSES");





    private static final SubLSymbol MAKE_VALUE_SEMANTICS = makeSymbol("MAKE-VALUE-SEMANTICS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_VALUE_SEMANTICS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-VALUE-SEMANTICS-METHOD");

    private static final SubLString $str222$_VALUE___s__a_ = makeString("<VALUE: ~s ~a>");



    private static final SubLSymbol $db_output_spec_isg$ = makeSymbol("*DB-OUTPUT-SPEC-ISG*");

    private static final SubLSymbol DATABASE_OUTPUT_SPEC = makeSymbol("DATABASE-OUTPUT-SPEC");

    private static final SubLSymbol DATABASE_OUTPUT_SPEC_P = makeSymbol("DATABASE-OUTPUT-SPEC-P");

    private static final SubLList $list227 = list(makeSymbol("ID"), makeSymbol("SEMANTICS1"), makeSymbol("SEMANTICS2"), makeSymbol("RECIPE"), makeSymbol("SEMANTICS"), makeSymbol("SEMANTIC-RECIPE"));

    private static final SubLList $list228 = list(makeKeyword("ID"), makeKeyword("SEMANTICS1"), makeKeyword("SEMANTICS2"), makeKeyword("RECIPE"), makeKeyword("SEMANTICS"), makeKeyword("SEMANTIC-RECIPE"));

    private static final SubLList $list229 = list(makeSymbol("DB-OUTPUT-SPEC-ID"), makeSymbol("DB-OUTPUT-SPEC-SEMANTICS1"), makeSymbol("DB-OUTPUT-SPEC-SEMANTICS2"), makeSymbol("DB-OUTPUT-SPEC-RECIPE"), makeSymbol("DB-OUTPUT-SPEC-SEMANTICS"), makeSymbol("DB-OUTPUT-SPEC-SEMANTIC-RECIPE"));

    private static final SubLList $list230 = list(makeSymbol("_CSETF-DB-OUTPUT-SPEC-ID"), makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS1"), makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS2"), makeSymbol("_CSETF-DB-OUTPUT-SPEC-RECIPE"), makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS"), makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTIC-RECIPE"));

    private static final SubLSymbol PRINT_DATABASE_OUTPUT_SPEC = makeSymbol("PRINT-DATABASE-OUTPUT-SPEC");

    private static final SubLSymbol DATABASE_OUTPUT_SPEC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DATABASE-OUTPUT-SPEC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list233 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DATABASE-OUTPUT-SPEC-P"));

    private static final SubLSymbol DB_OUTPUT_SPEC_ID = makeSymbol("DB-OUTPUT-SPEC-ID");

    private static final SubLSymbol _CSETF_DB_OUTPUT_SPEC_ID = makeSymbol("_CSETF-DB-OUTPUT-SPEC-ID");

    private static final SubLSymbol DB_OUTPUT_SPEC_SEMANTICS1 = makeSymbol("DB-OUTPUT-SPEC-SEMANTICS1");

    private static final SubLSymbol _CSETF_DB_OUTPUT_SPEC_SEMANTICS1 = makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS1");

    private static final SubLSymbol DB_OUTPUT_SPEC_SEMANTICS2 = makeSymbol("DB-OUTPUT-SPEC-SEMANTICS2");

    private static final SubLSymbol _CSETF_DB_OUTPUT_SPEC_SEMANTICS2 = makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS2");

    private static final SubLSymbol DB_OUTPUT_SPEC_RECIPE = makeSymbol("DB-OUTPUT-SPEC-RECIPE");

    private static final SubLSymbol _CSETF_DB_OUTPUT_SPEC_RECIPE = makeSymbol("_CSETF-DB-OUTPUT-SPEC-RECIPE");

    private static final SubLSymbol DB_OUTPUT_SPEC_SEMANTICS = makeSymbol("DB-OUTPUT-SPEC-SEMANTICS");

    private static final SubLSymbol _CSETF_DB_OUTPUT_SPEC_SEMANTICS = makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTICS");

    private static final SubLSymbol DB_OUTPUT_SPEC_SEMANTIC_RECIPE = makeSymbol("DB-OUTPUT-SPEC-SEMANTIC-RECIPE");

    private static final SubLSymbol _CSETF_DB_OUTPUT_SPEC_SEMANTIC_RECIPE = makeSymbol("_CSETF-DB-OUTPUT-SPEC-SEMANTIC-RECIPE");











    private static final SubLSymbol MAKE_DATABASE_OUTPUT_SPEC = makeSymbol("MAKE-DATABASE-OUTPUT-SPEC");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DATABASE_OUTPUT_SPEC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DATABASE-OUTPUT-SPEC-METHOD");

    private static final SubLString $str253$_DB_OUTPUT_ = makeString("<DB-OUTPUT:");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str255$Sem_Recipe__ = makeString("Sem-Recipe: ");

    private static final SubLString $str256$_ = makeString(">");

    private static final SubLString $str257$____________________________ = makeString("----------------------------");

    private static final SubLString $str258$unable_to_drop__A_from__A = makeString("unable to drop ~A from ~A");

    private static final SubLString $str259$unable_to_add__A_to__A = makeString("unable to add ~A to ~A");

    private static final SubLString $str260$unable_to_remove__A_from__A = makeString("unable to remove ~A from ~A");

    private static final SubLString $str261$unable_to_set_column_corespondenc = makeString("unable to set column-corespondence list for ~S");

    private static final SubLString $str262$unable_to_get_column_corespondenc = makeString("unable to get column-corespondence list for ~S");

    private static final SubLString $str263$unable_to_set_start_index_of__A_t = makeString("unable to set start index of ~A to ~A");

    private static final SubLString $str264$unable_to_set_end_index_of__A_to_ = makeString("unable to set end index of ~A to ~A");

    private static final SubLString $str265$Don_t_know_how_to_copy__S = makeString("Don't know how to copy ~S");

    private static final SubLSymbol TABLE_MERGER = makeSymbol("TABLE-MERGER");

    private static final SubLSymbol TABLE_MERGER_P = makeSymbol("TABLE-MERGER-P");

    private static final SubLList $list268 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("OUTPUT-SPEC"), makeSymbol("SOURCES"), makeSymbol("TARGET"), makeSymbol("COLUMN-CORRESPONDENCE-LIST"), makeSymbol("ADDED"), makeSymbol("DROPPED"), makeSymbol("SQL-START-INDEX"), makeSymbol("SQL-END-INDEX") });

    private static final SubLList $list269 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("OUTPUT-SPEC"), makeKeyword("SOURCES"), makeKeyword("TARGET"), makeKeyword("COLUMN-CORRESPONDENCE-LIST"), makeKeyword("ADDED"), makeKeyword("DROPPED"), makeKeyword("SQL-START-INDEX"), makeKeyword("SQL-END-INDEX") });

    private static final SubLList $list270 = list(new SubLObject[]{ makeSymbol("TABLE-MERGER-ID"), makeSymbol("TABLE-MERGER-OUTPUT-SPEC"), makeSymbol("TABLE-MERGER-SOURCES"), makeSymbol("TABLE-MERGER-TARGET"), makeSymbol("TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST"), makeSymbol("TABLE-MERGER-ADDED"), makeSymbol("TABLE-MERGER-DROPPED"), makeSymbol("TABLE-MERGER-SQL-START-INDEX"), makeSymbol("TABLE-MERGER-SQL-END-INDEX") });

    private static final SubLList $list271 = list(new SubLObject[]{ makeSymbol("_CSETF-TABLE-MERGER-ID"), makeSymbol("_CSETF-TABLE-MERGER-OUTPUT-SPEC"), makeSymbol("_CSETF-TABLE-MERGER-SOURCES"), makeSymbol("_CSETF-TABLE-MERGER-TARGET"), makeSymbol("_CSETF-TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST"), makeSymbol("_CSETF-TABLE-MERGER-ADDED"), makeSymbol("_CSETF-TABLE-MERGER-DROPPED"), makeSymbol("_CSETF-TABLE-MERGER-SQL-START-INDEX"), makeSymbol("_CSETF-TABLE-MERGER-SQL-END-INDEX") });

    private static final SubLSymbol PRINT_TABLE_MERGER = makeSymbol("PRINT-TABLE-MERGER");

    private static final SubLSymbol TABLE_MERGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TABLE-MERGER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list274 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TABLE-MERGER-P"));

    private static final SubLSymbol TABLE_MERGER_ID = makeSymbol("TABLE-MERGER-ID");

    private static final SubLSymbol _CSETF_TABLE_MERGER_ID = makeSymbol("_CSETF-TABLE-MERGER-ID");

    private static final SubLSymbol TABLE_MERGER_OUTPUT_SPEC = makeSymbol("TABLE-MERGER-OUTPUT-SPEC");

    private static final SubLSymbol _CSETF_TABLE_MERGER_OUTPUT_SPEC = makeSymbol("_CSETF-TABLE-MERGER-OUTPUT-SPEC");

    private static final SubLSymbol TABLE_MERGER_SOURCES = makeSymbol("TABLE-MERGER-SOURCES");

    private static final SubLSymbol _CSETF_TABLE_MERGER_SOURCES = makeSymbol("_CSETF-TABLE-MERGER-SOURCES");

    private static final SubLSymbol TABLE_MERGER_TARGET = makeSymbol("TABLE-MERGER-TARGET");

    private static final SubLSymbol _CSETF_TABLE_MERGER_TARGET = makeSymbol("_CSETF-TABLE-MERGER-TARGET");

    private static final SubLSymbol TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST = makeSymbol("TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST");

    private static final SubLSymbol _CSETF_TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST = makeSymbol("_CSETF-TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST");

    private static final SubLSymbol TABLE_MERGER_ADDED = makeSymbol("TABLE-MERGER-ADDED");

    private static final SubLSymbol _CSETF_TABLE_MERGER_ADDED = makeSymbol("_CSETF-TABLE-MERGER-ADDED");

    private static final SubLSymbol TABLE_MERGER_DROPPED = makeSymbol("TABLE-MERGER-DROPPED");

    private static final SubLSymbol _CSETF_TABLE_MERGER_DROPPED = makeSymbol("_CSETF-TABLE-MERGER-DROPPED");

    private static final SubLSymbol TABLE_MERGER_SQL_START_INDEX = makeSymbol("TABLE-MERGER-SQL-START-INDEX");

    private static final SubLSymbol _CSETF_TABLE_MERGER_SQL_START_INDEX = makeSymbol("_CSETF-TABLE-MERGER-SQL-START-INDEX");

    private static final SubLSymbol TABLE_MERGER_SQL_END_INDEX = makeSymbol("TABLE-MERGER-SQL-END-INDEX");

    private static final SubLSymbol _CSETF_TABLE_MERGER_SQL_END_INDEX = makeSymbol("_CSETF-TABLE-MERGER-SQL-END-INDEX");





    private static final SubLSymbol $COLUMN_CORRESPONDENCE_LIST = makeKeyword("COLUMN-CORRESPONDENCE-LIST");





    private static final SubLSymbol $SQL_START_INDEX = makeKeyword("SQL-START-INDEX");

    private static final SubLSymbol $SQL_END_INDEX = makeKeyword("SQL-END-INDEX");

    private static final SubLSymbol MAKE_TABLE_MERGER = makeSymbol("MAKE-TABLE-MERGER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TABLE_MERGER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TABLE-MERGER-METHOD");

    private static final SubLString $str302$_TABLE_MERGER__A_ = makeString("<TABLE-MERGER-~A:");

    private static final SubLString $str303$____ = makeString(" -> ");

    private static final SubLString $str304$_adds__ = makeString(" adds: ");

    private static final SubLString $str305$_drops__ = makeString(" drops: ");

    private static final SubLString $str306$_SQL___A__A_ = makeString(" SQL:(~A-~A)");

    private static final SubLSymbol SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-STEP-P-TABLE-MERGER-METHOD");

    private static final SubLSymbol EMPTY_SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD = makeSymbol("EMPTY-SEMANTIC-RECIPE-STEP-P-TABLE-MERGER-METHOD");

    private static final SubLSymbol SEMANTIC_RECIPE_APPEND_TO_DROPS_TABLE_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-APPEND-TO-DROPS-TABLE-MERGER-METHOD");

    private static final SubLSymbol SEMANTIC_RECIPE_APPEND_TO_ADDS_TABLE_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-APPEND-TO-ADDS-TABLE-MERGER-METHOD");

    private static final SubLSymbol SEMANTIC_RECIPE_REMOVE_FROM_DROPS_TABLE_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-REMOVE-FROM-DROPS-TABLE-MERGER-METHOD");

    private static final SubLSymbol SEMANTIC_RECIPE_REMOVE_FROM_ADDS_TABLE_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-REMOVE-FROM-ADDS-TABLE-MERGER-METHOD");

    private static final SubLSymbol $sym313$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_ = makeSymbol("SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-TABLE-MERGER-METHOD");

    private static final SubLSymbol $sym314$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_METH = makeSymbol("SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-TABLE-MERGER-METHOD");

    private static final SubLSymbol SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_TABLE_MERGER_METHOD = makeSymbol("SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-TABLE-MERGER-METHOD");

    private static final SubLSymbol SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_TABLE_MERGER_METHOD = makeSymbol("SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-TABLE-MERGER-METHOD");

    private static final SubLSymbol SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_TABLE_MERGER_METHOD = makeSymbol("SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-TABLE-MERGER-METHOD");

    private static final SubLList $list318 = list(makeSymbol("OLD-SOURCE-COLUMN"), makeSymbol("OLD-TARGET-COLUMN"), makeSymbol("JUSTIFICATION"));

    private static final SubLString $str319$unable_to_find_correspondent__add = makeString("unable to find correspondent (added) for ~A in ~A");

    private static final SubLString $str320$unable_to_find_correspondent__dro = makeString("unable to find correspondent (dropped) for ~A in ~A");

    private static final SubLSymbol SEMANTIC_RECIPE_STEP_COPY_TABLE_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-STEP-COPY-TABLE-MERGER-METHOD");

    private static final SubLSymbol COLUMN_MERGER = makeSymbol("COLUMN-MERGER");

    private static final SubLSymbol COLUMN_MERGER_P = makeSymbol("COLUMN-MERGER-P");

    private static final SubLList $list324 = list(makeSymbol("OUTPUT-SPEC"), makeSymbol("SOURCES"), makeSymbol("TARGET"), makeSymbol("COLUMN-CORRESPONDENCE-LIST"), makeSymbol("ADDED"), makeSymbol("DROPPED"), makeSymbol("SQL-START-INDEX"), makeSymbol("SQL-END-INDEX"));

    private static final SubLList $list325 = list(makeKeyword("OUTPUT-SPEC"), makeKeyword("SOURCES"), makeKeyword("TARGET"), makeKeyword("COLUMN-CORRESPONDENCE-LIST"), makeKeyword("ADDED"), makeKeyword("DROPPED"), makeKeyword("SQL-START-INDEX"), makeKeyword("SQL-END-INDEX"));

    private static final SubLList $list326 = list(makeSymbol("COLUMN-MERGER-OUTPUT-SPEC"), makeSymbol("COLUMN-MERGER-SOURCES"), makeSymbol("COLUMN-MERGER-TARGET"), makeSymbol("COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST"), makeSymbol("COLUMN-MERGER-ADDED"), makeSymbol("COLUMN-MERGER-DROPPED"), makeSymbol("COLUMN-MERGER-SQL-START-INDEX"), makeSymbol("COLUMN-MERGER-SQL-END-INDEX"));

    private static final SubLList $list327 = list(makeSymbol("_CSETF-COLUMN-MERGER-OUTPUT-SPEC"), makeSymbol("_CSETF-COLUMN-MERGER-SOURCES"), makeSymbol("_CSETF-COLUMN-MERGER-TARGET"), makeSymbol("_CSETF-COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST"), makeSymbol("_CSETF-COLUMN-MERGER-ADDED"), makeSymbol("_CSETF-COLUMN-MERGER-DROPPED"), makeSymbol("_CSETF-COLUMN-MERGER-SQL-START-INDEX"), makeSymbol("_CSETF-COLUMN-MERGER-SQL-END-INDEX"));

    private static final SubLSymbol PRINT_COLUMN_MERGER = makeSymbol("PRINT-COLUMN-MERGER");

    private static final SubLSymbol COLUMN_MERGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("COLUMN-MERGER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list330 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("COLUMN-MERGER-P"));

    private static final SubLSymbol COLUMN_MERGER_OUTPUT_SPEC = makeSymbol("COLUMN-MERGER-OUTPUT-SPEC");

    private static final SubLSymbol _CSETF_COLUMN_MERGER_OUTPUT_SPEC = makeSymbol("_CSETF-COLUMN-MERGER-OUTPUT-SPEC");

    private static final SubLSymbol COLUMN_MERGER_SOURCES = makeSymbol("COLUMN-MERGER-SOURCES");

    private static final SubLSymbol _CSETF_COLUMN_MERGER_SOURCES = makeSymbol("_CSETF-COLUMN-MERGER-SOURCES");

    private static final SubLSymbol COLUMN_MERGER_TARGET = makeSymbol("COLUMN-MERGER-TARGET");

    private static final SubLSymbol _CSETF_COLUMN_MERGER_TARGET = makeSymbol("_CSETF-COLUMN-MERGER-TARGET");

    private static final SubLSymbol COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST = makeSymbol("COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST");

    private static final SubLSymbol _CSETF_COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST = makeSymbol("_CSETF-COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST");

    private static final SubLSymbol COLUMN_MERGER_ADDED = makeSymbol("COLUMN-MERGER-ADDED");

    private static final SubLSymbol _CSETF_COLUMN_MERGER_ADDED = makeSymbol("_CSETF-COLUMN-MERGER-ADDED");

    private static final SubLSymbol COLUMN_MERGER_DROPPED = makeSymbol("COLUMN-MERGER-DROPPED");

    private static final SubLSymbol _CSETF_COLUMN_MERGER_DROPPED = makeSymbol("_CSETF-COLUMN-MERGER-DROPPED");

    private static final SubLSymbol COLUMN_MERGER_SQL_START_INDEX = makeSymbol("COLUMN-MERGER-SQL-START-INDEX");

    private static final SubLSymbol _CSETF_COLUMN_MERGER_SQL_START_INDEX = makeSymbol("_CSETF-COLUMN-MERGER-SQL-START-INDEX");

    private static final SubLSymbol COLUMN_MERGER_SQL_END_INDEX = makeSymbol("COLUMN-MERGER-SQL-END-INDEX");

    private static final SubLSymbol _CSETF_COLUMN_MERGER_SQL_END_INDEX = makeSymbol("_CSETF-COLUMN-MERGER-SQL-END-INDEX");

    private static final SubLSymbol MAKE_COLUMN_MERGER = makeSymbol("MAKE-COLUMN-MERGER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_COLUMN_MERGER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-COLUMN-MERGER-METHOD");

    private static final SubLString $str349$_COLUMN_MERGER_ = makeString("<COLUMN-MERGER:");

    private static final SubLSymbol SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-STEP-P-COLUMN-MERGER-METHOD");

    private static final SubLSymbol EMPTY_SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD = makeSymbol("EMPTY-SEMANTIC-RECIPE-STEP-P-COLUMN-MERGER-METHOD");

    private static final SubLSymbol SEMANTIC_RECIPE_APPEND_TO_DROPS_COLUMN_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-APPEND-TO-DROPS-COLUMN-MERGER-METHOD");

    private static final SubLSymbol SEMANTIC_RECIPE_APPEND_TO_ADDS_COLUMN_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-APPEND-TO-ADDS-COLUMN-MERGER-METHOD");

    private static final SubLSymbol SEMANTIC_RECIPE_REMOVE_FROM_DROPS_COLUMN_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-REMOVE-FROM-DROPS-COLUMN-MERGER-METHOD");

    private static final SubLSymbol SEMANTIC_RECIPE_REMOVE_FROM_ADDS_COLUMN_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-REMOVE-FROM-ADDS-COLUMN-MERGER-METHOD");

    private static final SubLSymbol $sym356$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER = makeSymbol("SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-COLUMN-MERGER-METHOD");

    private static final SubLSymbol $sym357$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER_MET = makeSymbol("SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-COLUMN-MERGER-METHOD");

    private static final SubLSymbol SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_COLUMN_MERGER_METHOD = makeSymbol("SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-COLUMN-MERGER-METHOD");

    private static final SubLSymbol SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_COLUMN_MERGER_METHOD = makeSymbol("SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-COLUMN-MERGER-METHOD");

    private static final SubLSymbol SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_COLUMN_MERGER_METHOD = makeSymbol("SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-COLUMN-MERGER-METHOD");

    private static final SubLSymbol COLUMN_SEMANTICS_TABLE_NAME = makeSymbol("COLUMN-SEMANTICS-TABLE-NAME");

    private static final SubLList $list362 = list(makeSymbol("OLD-SOURCE-COLUMN"), makeSymbol("OLD-TARGET-COLUMN"));

    private static final SubLString $str363$unable_to_find_correspondent_for_ = makeString("unable to find correspondent for ~A in ~A");

    private static final SubLSymbol SEMANTIC_RECIPE_STEP_COPY_COLUMN_MERGER_METHOD = makeSymbol("SEMANTIC-RECIPE-STEP-COPY-COLUMN-MERGER-METHOD");

    private static final SubLSymbol SEMANTIC_RECIPE_ADD_OR_DROP_P = makeSymbol("SEMANTIC-RECIPE-ADD-OR-DROP-P");

    private static final SubLList $list366 = list(makeKeyword("DROP"), makeKeyword("ADD"));





    private static final SubLSymbol SQL_CONJUNCTION = makeSymbol("SQL-CONJUNCTION");

    private static final SubLSymbol SQL_CONJUNCTION_P = makeSymbol("SQL-CONJUNCTION-P");

    private static final SubLList $list371 = list(makeSymbol("CONJUNCTS"));

    private static final SubLList $list372 = list(makeKeyword("CONJUNCTS"));

    private static final SubLList $list373 = list(makeSymbol("SQL-CONJUNCTION-CONJUNCTS"));

    private static final SubLList $list374 = list(makeSymbol("_CSETF-SQL-CONJUNCTION-CONJUNCTS"));

    private static final SubLSymbol PRINT_SQL_CONJUNCTION = makeSymbol("PRINT-SQL-CONJUNCTION");

    private static final SubLSymbol SQL_CONJUNCTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-CONJUNCTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list377 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-CONJUNCTION-P"));

    private static final SubLSymbol SQL_CONJUNCTION_CONJUNCTS = makeSymbol("SQL-CONJUNCTION-CONJUNCTS");

    private static final SubLSymbol _CSETF_SQL_CONJUNCTION_CONJUNCTS = makeSymbol("_CSETF-SQL-CONJUNCTION-CONJUNCTS");



    private static final SubLSymbol MAKE_SQL_CONJUNCTION = makeSymbol("MAKE-SQL-CONJUNCTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_CONJUNCTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-CONJUNCTION-METHOD");

    private static final SubLString $$$_AND_ = makeString(" AND ");

    private static final SubLSymbol SQL_CONDITION_P = makeSymbol("SQL-CONDITION-P");

    private static final SubLSymbol SQL_DISJUNCTION = makeSymbol("SQL-DISJUNCTION");

    private static final SubLSymbol SQL_DISJUNCTION_P = makeSymbol("SQL-DISJUNCTION-P");

    public static final SubLList $list387 = list(makeSymbol("DISJUNCTS"));

    public static final SubLList $list388 = list(makeKeyword("DISJUNCTS"));

    private static final SubLList $list389 = list(makeSymbol("SQL-DISJUNCTION-DISJUNCTS"));

    private static final SubLList $list390 = list(makeSymbol("_CSETF-SQL-DISJUNCTION-DISJUNCTS"));

    private static final SubLSymbol PRINT_SQL_DISJUNCTION = makeSymbol("PRINT-SQL-DISJUNCTION");

    private static final SubLSymbol SQL_DISJUNCTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-DISJUNCTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list393 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-DISJUNCTION-P"));

    private static final SubLSymbol SQL_DISJUNCTION_DISJUNCTS = makeSymbol("SQL-DISJUNCTION-DISJUNCTS");

    private static final SubLSymbol _CSETF_SQL_DISJUNCTION_DISJUNCTS = makeSymbol("_CSETF-SQL-DISJUNCTION-DISJUNCTS");



    private static final SubLSymbol MAKE_SQL_DISJUNCTION = makeSymbol("MAKE-SQL-DISJUNCTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_DISJUNCTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-DISJUNCTION-METHOD");

    private static final SubLString $$$_OR_ = makeString(" OR ");

    private static final SubLSymbol SQL_COPY_TABLE = makeSymbol("SQL-COPY-TABLE");

    private static final SubLSymbol SQL_COPY_TABLE_P = makeSymbol("SQL-COPY-TABLE-P");

    private static final SubLList $list402 = list(makeSymbol("TABLE"), makeSymbol("FROM"), makeSymbol("TO"));

    private static final SubLList $list403 = list(makeKeyword("TABLE"), makeKeyword("FROM"), makeKeyword("TO"));

    public static final SubLList $list404 = list(makeSymbol("SQL-COPY-TABLE-TABLE"), makeSymbol("SQL-COPY-TABLE-FROM"), makeSymbol("SQL-COPY-TABLE-TO"));

    public static final SubLList $list405 = list(makeSymbol("_CSETF-SQL-COPY-TABLE-TABLE"), makeSymbol("_CSETF-SQL-COPY-TABLE-FROM"), makeSymbol("_CSETF-SQL-COPY-TABLE-TO"));

    private static final SubLSymbol PRINT_SQL_COPY_TABLE = makeSymbol("PRINT-SQL-COPY-TABLE");

    private static final SubLSymbol SQL_COPY_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-COPY-TABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list408 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-COPY-TABLE-P"));

    private static final SubLSymbol SQL_COPY_TABLE_TABLE = makeSymbol("SQL-COPY-TABLE-TABLE");

    private static final SubLSymbol _CSETF_SQL_COPY_TABLE_TABLE = makeSymbol("_CSETF-SQL-COPY-TABLE-TABLE");

    private static final SubLSymbol SQL_COPY_TABLE_FROM = makeSymbol("SQL-COPY-TABLE-FROM");

    private static final SubLSymbol _CSETF_SQL_COPY_TABLE_FROM = makeSymbol("_CSETF-SQL-COPY-TABLE-FROM");

    private static final SubLSymbol SQL_COPY_TABLE_TO = makeSymbol("SQL-COPY-TABLE-TO");

    private static final SubLSymbol _CSETF_SQL_COPY_TABLE_TO = makeSymbol("_CSETF-SQL-COPY-TABLE-TO");







    private static final SubLSymbol MAKE_SQL_COPY_TABLE = makeSymbol("MAKE-SQL-COPY-TABLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_COPY_TABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-COPY-TABLE-METHOD");

    private static final SubLString $str420$COPY_TABLE__a_FROM_DATABASE__a_TO = makeString("COPY TABLE ~a FROM DATABASE ~a TO DATABASE ~a");

    private static final SubLSymbol SQL_INSERT_INTO = makeSymbol("SQL-INSERT-INTO");

    private static final SubLSymbol SQL_INSERT_INTO_P = makeSymbol("SQL-INSERT-INTO-P");

    public static final SubLList $list423 = list(makeSymbol("TABLE"), makeSymbol("COLUMNS"), makeSymbol("DATA"));

    public static final SubLList $list424 = list(makeKeyword("TABLE"), makeKeyword("COLUMNS"), makeKeyword("DATA"));

    public static final SubLList $list425 = list(makeSymbol("SQL-INSERT-INTO-TABLE"), makeSymbol("SQL-INSERT-INTO-COLUMNS"), makeSymbol("SQL-INSERT-INTO-DATA"));

    public static final SubLList $list426 = list(makeSymbol("_CSETF-SQL-INSERT-INTO-TABLE"), makeSymbol("_CSETF-SQL-INSERT-INTO-COLUMNS"), makeSymbol("_CSETF-SQL-INSERT-INTO-DATA"));

    private static final SubLSymbol PRINT_SQL_INSERT_INTO = makeSymbol("PRINT-SQL-INSERT-INTO");

    private static final SubLSymbol SQL_INSERT_INTO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-INSERT-INTO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list429 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-INSERT-INTO-P"));

    private static final SubLSymbol SQL_INSERT_INTO_TABLE = makeSymbol("SQL-INSERT-INTO-TABLE");

    private static final SubLSymbol _CSETF_SQL_INSERT_INTO_TABLE = makeSymbol("_CSETF-SQL-INSERT-INTO-TABLE");

    private static final SubLSymbol SQL_INSERT_INTO_COLUMNS = makeSymbol("SQL-INSERT-INTO-COLUMNS");

    private static final SubLSymbol _CSETF_SQL_INSERT_INTO_COLUMNS = makeSymbol("_CSETF-SQL-INSERT-INTO-COLUMNS");

    private static final SubLSymbol SQL_INSERT_INTO_DATA = makeSymbol("SQL-INSERT-INTO-DATA");

    private static final SubLSymbol _CSETF_SQL_INSERT_INTO_DATA = makeSymbol("_CSETF-SQL-INSERT-INTO-DATA");





    private static final SubLSymbol MAKE_SQL_INSERT_INTO = makeSymbol("MAKE-SQL-INSERT-INTO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_INSERT_INTO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-INSERT-INTO-METHOD");

    private static final SubLString $str440$INSERT_INTO__a___a___a = makeString("INSERT INTO ~a (~a) ~a");

    private static final SubLString $str441$__ = makeString(", ");

    private static final SubLSymbol SQL_TABLE_EXPRESSION_P = makeSymbol("SQL-TABLE-EXPRESSION-P");

    private static final SubLSymbol SQL_SELECT_FROM = makeSymbol("SQL-SELECT-FROM");

    private static final SubLSymbol SQL_SELECT_FROM_P = makeSymbol("SQL-SELECT-FROM-P");

    private static final SubLList $list445 = list(makeSymbol("COLUMNS"), makeSymbol("TABLES"), makeSymbol("CONDITIONS"));

    private static final SubLList $list446 = list(makeKeyword("COLUMNS"), makeKeyword("TABLES"), makeKeyword("CONDITIONS"));

    private static final SubLList $list447 = list(makeSymbol("SQL-SELECT-FROM-COLUMNS"), makeSymbol("SQL-SELECT-FROM-TABLES"), makeSymbol("SQL-SELECT-FROM-CONDITIONS"));

    private static final SubLList $list448 = list(makeSymbol("_CSETF-SQL-SELECT-FROM-COLUMNS"), makeSymbol("_CSETF-SQL-SELECT-FROM-TABLES"), makeSymbol("_CSETF-SQL-SELECT-FROM-CONDITIONS"));

    private static final SubLSymbol PRINT_SQL_SELECT_FROM = makeSymbol("PRINT-SQL-SELECT-FROM");

    private static final SubLSymbol SQL_SELECT_FROM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-SELECT-FROM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list451 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-SELECT-FROM-P"));

    private static final SubLSymbol SQL_SELECT_FROM_COLUMNS = makeSymbol("SQL-SELECT-FROM-COLUMNS");

    private static final SubLSymbol _CSETF_SQL_SELECT_FROM_COLUMNS = makeSymbol("_CSETF-SQL-SELECT-FROM-COLUMNS");

    private static final SubLSymbol SQL_SELECT_FROM_TABLES = makeSymbol("SQL-SELECT-FROM-TABLES");

    private static final SubLSymbol _CSETF_SQL_SELECT_FROM_TABLES = makeSymbol("_CSETF-SQL-SELECT-FROM-TABLES");

    private static final SubLSymbol SQL_SELECT_FROM_CONDITIONS = makeSymbol("SQL-SELECT-FROM-CONDITIONS");

    private static final SubLSymbol _CSETF_SQL_SELECT_FROM_CONDITIONS = makeSymbol("_CSETF-SQL-SELECT-FROM-CONDITIONS");





    private static final SubLSymbol MAKE_SQL_SELECT_FROM = makeSymbol("MAKE-SQL-SELECT-FROM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_SELECT_FROM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-SELECT-FROM-METHOD");

    private static final SubLString $str462$SELECT__a_FROM__a = makeString("SELECT ~a FROM ~a");

    private static final SubLString $str463$_WHERE__a = makeString(" WHERE ~a");

    private static final SubLString $$$_AND = makeString(" AND");

    private static final SubLSymbol SQL_EXCEPT = makeSymbol("SQL-EXCEPT");

    private static final SubLSymbol SQL_EXCEPT_P = makeSymbol("SQL-EXCEPT-P");

    private static final SubLList $list467 = list(makeSymbol("TABLE1"), makeSymbol("TABLE2"));

    private static final SubLList $list468 = list(makeKeyword("TABLE1"), makeKeyword("TABLE2"));

    private static final SubLList $list469 = list(makeSymbol("SQL-EXCEPT-TABLE1"), makeSymbol("SQL-EXCEPT-TABLE2"));

    private static final SubLList $list470 = list(makeSymbol("_CSETF-SQL-EXCEPT-TABLE1"), makeSymbol("_CSETF-SQL-EXCEPT-TABLE2"));

    private static final SubLSymbol PRINT_SQL_EXCEPT = makeSymbol("PRINT-SQL-EXCEPT");

    private static final SubLSymbol SQL_EXCEPT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-EXCEPT-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list473 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-EXCEPT-P"));

    private static final SubLSymbol SQL_EXCEPT_TABLE1 = makeSymbol("SQL-EXCEPT-TABLE1");

    private static final SubLSymbol _CSETF_SQL_EXCEPT_TABLE1 = makeSymbol("_CSETF-SQL-EXCEPT-TABLE1");

    private static final SubLSymbol SQL_EXCEPT_TABLE2 = makeSymbol("SQL-EXCEPT-TABLE2");

    private static final SubLSymbol _CSETF_SQL_EXCEPT_TABLE2 = makeSymbol("_CSETF-SQL-EXCEPT-TABLE2");





    private static final SubLSymbol MAKE_SQL_EXCEPT = makeSymbol("MAKE-SQL-EXCEPT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_EXCEPT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-EXCEPT-METHOD");

    private static final SubLString $str482$_a_EXCEPT__a = makeString("~a EXCEPT ~a");

    private static final SubLSymbol SQL_ALIAS = makeSymbol("SQL-ALIAS");

    private static final SubLSymbol SQL_ALIAS_P = makeSymbol("SQL-ALIAS-P");

    public static final SubLList $list485 = list(makeSymbol("TABLE"), makeSymbol("ALIAS"));

    public static final SubLList $list486 = list(makeKeyword("TABLE"), makeKeyword("ALIAS"));

    public static final SubLList $list487 = list(makeSymbol("SQL-ALIAS-TABLE"), makeSymbol("SQL-ALIAS-ALIAS"));

    public static final SubLList $list488 = list(makeSymbol("_CSETF-SQL-ALIAS-TABLE"), makeSymbol("_CSETF-SQL-ALIAS-ALIAS"));

    private static final SubLSymbol PRINT_SQL_ALIAS = makeSymbol("PRINT-SQL-ALIAS");

    private static final SubLSymbol SQL_ALIAS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-ALIAS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list491 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-ALIAS-P"));

    private static final SubLSymbol SQL_ALIAS_TABLE = makeSymbol("SQL-ALIAS-TABLE");

    private static final SubLSymbol _CSETF_SQL_ALIAS_TABLE = makeSymbol("_CSETF-SQL-ALIAS-TABLE");

    private static final SubLSymbol SQL_ALIAS_ALIAS = makeSymbol("SQL-ALIAS-ALIAS");

    private static final SubLSymbol _CSETF_SQL_ALIAS_ALIAS = makeSymbol("_CSETF-SQL-ALIAS-ALIAS");



    private static final SubLSymbol MAKE_SQL_ALIAS = makeSymbol("MAKE-SQL-ALIAS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_ALIAS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-ALIAS-METHOD");

    private static final SubLString $str499$_a_AS__a = makeString("~a AS ~a");

    private static final SubLSymbol SQL_COLUMN_EQUAL = makeSymbol("SQL-COLUMN-EQUAL");

    private static final SubLSymbol SQL_COLUMN_EQUAL_P = makeSymbol("SQL-COLUMN-EQUAL-P");

    public static final SubLList $list502 = list(makeSymbol("TABLE1"), makeSymbol("COLUMN1"), makeSymbol("TABLE2"), makeSymbol("COLUMN2"));

    public static final SubLList $list503 = list(makeKeyword("TABLE1"), makeKeyword("COLUMN1"), makeKeyword("TABLE2"), makeKeyword("COLUMN2"));

    public static final SubLList $list504 = list(makeSymbol("SQL-COLUMN-EQUAL-TABLE1"), makeSymbol("SQL-COLUMN-EQUAL-COLUMN1"), makeSymbol("SQL-COLUMN-EQUAL-TABLE2"), makeSymbol("SQL-COLUMN-EQUAL-COLUMN2"));

    private static final SubLList $list505 = list(makeSymbol("_CSETF-SQL-COLUMN-EQUAL-TABLE1"), makeSymbol("_CSETF-SQL-COLUMN-EQUAL-COLUMN1"), makeSymbol("_CSETF-SQL-COLUMN-EQUAL-TABLE2"), makeSymbol("_CSETF-SQL-COLUMN-EQUAL-COLUMN2"));

    private static final SubLSymbol PRINT_SQL_COLUMN_EQUAL = makeSymbol("PRINT-SQL-COLUMN-EQUAL");

    private static final SubLSymbol SQL_COLUMN_EQUAL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-COLUMN-EQUAL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list508 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-COLUMN-EQUAL-P"));

    private static final SubLSymbol SQL_COLUMN_EQUAL_TABLE1 = makeSymbol("SQL-COLUMN-EQUAL-TABLE1");

    private static final SubLSymbol _CSETF_SQL_COLUMN_EQUAL_TABLE1 = makeSymbol("_CSETF-SQL-COLUMN-EQUAL-TABLE1");

    private static final SubLSymbol SQL_COLUMN_EQUAL_COLUMN1 = makeSymbol("SQL-COLUMN-EQUAL-COLUMN1");

    private static final SubLSymbol _CSETF_SQL_COLUMN_EQUAL_COLUMN1 = makeSymbol("_CSETF-SQL-COLUMN-EQUAL-COLUMN1");

    private static final SubLSymbol SQL_COLUMN_EQUAL_TABLE2 = makeSymbol("SQL-COLUMN-EQUAL-TABLE2");

    private static final SubLSymbol _CSETF_SQL_COLUMN_EQUAL_TABLE2 = makeSymbol("_CSETF-SQL-COLUMN-EQUAL-TABLE2");

    private static final SubLSymbol SQL_COLUMN_EQUAL_COLUMN2 = makeSymbol("SQL-COLUMN-EQUAL-COLUMN2");

    private static final SubLSymbol _CSETF_SQL_COLUMN_EQUAL_COLUMN2 = makeSymbol("_CSETF-SQL-COLUMN-EQUAL-COLUMN2");





    private static final SubLSymbol MAKE_SQL_COLUMN_EQUAL = makeSymbol("MAKE-SQL-COLUMN-EQUAL");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_COLUMN_EQUAL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-COLUMN-EQUAL-METHOD");

    private static final SubLString $str521$_a____a = makeString("~a = ~a");

    private static final SubLSymbol SQL_IS_NULL = makeSymbol("SQL-IS-NULL");

    private static final SubLSymbol SQL_IS_NULL_P = makeSymbol("SQL-IS-NULL-P");

    private static final SubLList $list524 = list(makeSymbol("TABLE"), makeSymbol("COLUMN"));

    private static final SubLList $list525 = list(makeKeyword("TABLE"), makeKeyword("COLUMN"));

    private static final SubLList $list526 = list(makeSymbol("SQL-IS-NULL-TABLE"), makeSymbol("SQL-IS-NULL-COLUMN"));

    private static final SubLList $list527 = list(makeSymbol("_CSETF-SQL-IS-NULL-TABLE"), makeSymbol("_CSETF-SQL-IS-NULL-COLUMN"));

    private static final SubLSymbol PRINT_SQL_IS_NULL = makeSymbol("PRINT-SQL-IS-NULL");

    private static final SubLSymbol SQL_IS_NULL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-IS-NULL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list530 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-IS-NULL-P"));

    private static final SubLSymbol SQL_IS_NULL_TABLE = makeSymbol("SQL-IS-NULL-TABLE");

    private static final SubLSymbol _CSETF_SQL_IS_NULL_TABLE = makeSymbol("_CSETF-SQL-IS-NULL-TABLE");

    private static final SubLSymbol SQL_IS_NULL_COLUMN = makeSymbol("SQL-IS-NULL-COLUMN");

    private static final SubLSymbol _CSETF_SQL_IS_NULL_COLUMN = makeSymbol("_CSETF-SQL-IS-NULL-COLUMN");



    private static final SubLSymbol MAKE_SQL_IS_NULL = makeSymbol("MAKE-SQL-IS-NULL");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_IS_NULL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-IS-NULL-METHOD");

    private static final SubLString $str538$_a__a_IS_NULL = makeString("~a.~a IS NULL");

    private static final SubLSymbol SQL_NOT_IN = makeSymbol("SQL-NOT-IN");

    private static final SubLSymbol SQL_NOT_IN_P = makeSymbol("SQL-NOT-IN-P");

    private static final SubLList $list541 = list(makeSymbol("COLUMN-TABLE"), makeSymbol("COLUMN"), makeSymbol("TABLE"));

    private static final SubLList $list542 = list(makeKeyword("COLUMN-TABLE"), makeKeyword("COLUMN"), makeKeyword("TABLE"));

    private static final SubLList $list543 = list(makeSymbol("SQL-NOT-IN-COLUMN-TABLE"), makeSymbol("SQL-NOT-IN-COLUMN"), makeSymbol("SQL-NOT-IN-TABLE"));

    private static final SubLList $list544 = list(makeSymbol("_CSETF-SQL-NOT-IN-COLUMN-TABLE"), makeSymbol("_CSETF-SQL-NOT-IN-COLUMN"), makeSymbol("_CSETF-SQL-NOT-IN-TABLE"));

    private static final SubLSymbol PRINT_SQL_NOT_IN = makeSymbol("PRINT-SQL-NOT-IN");

    private static final SubLSymbol SQL_NOT_IN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-NOT-IN-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list547 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-NOT-IN-P"));

    private static final SubLSymbol SQL_NOT_IN_COLUMN_TABLE = makeSymbol("SQL-NOT-IN-COLUMN-TABLE");

    private static final SubLSymbol _CSETF_SQL_NOT_IN_COLUMN_TABLE = makeSymbol("_CSETF-SQL-NOT-IN-COLUMN-TABLE");

    private static final SubLSymbol SQL_NOT_IN_COLUMN = makeSymbol("SQL-NOT-IN-COLUMN");

    private static final SubLSymbol _CSETF_SQL_NOT_IN_COLUMN = makeSymbol("_CSETF-SQL-NOT-IN-COLUMN");

    private static final SubLSymbol SQL_NOT_IN_TABLE = makeSymbol("SQL-NOT-IN-TABLE");

    private static final SubLSymbol _CSETF_SQL_NOT_IN_TABLE = makeSymbol("_CSETF-SQL-NOT-IN-TABLE");



    private static final SubLSymbol MAKE_SQL_NOT_IN = makeSymbol("MAKE-SQL-NOT-IN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_NOT_IN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-NOT-IN-METHOD");

    private static final SubLString $str557$_a__a_NOT_IN__a = makeString("~a.~a NOT IN ~a");

    private static final SubLSymbol SQL_INNER_JOIN = makeSymbol("SQL-INNER-JOIN");

    private static final SubLSymbol SQL_INNER_JOIN_P = makeSymbol("SQL-INNER-JOIN-P");

    private static final SubLList $list560 = list(makeSymbol("TABLE1"), makeSymbol("TABLE2"), makeSymbol("ON"));

    private static final SubLList $list561 = list(makeKeyword("TABLE1"), makeKeyword("TABLE2"), makeKeyword("ON"));

    private static final SubLList $list562 = list(makeSymbol("SQL-INNER-JOIN-TABLE1"), makeSymbol("SQL-INNER-JOIN-TABLE2"), makeSymbol("SQL-INNER-JOIN-ON"));

    private static final SubLList $list563 = list(makeSymbol("_CSETF-SQL-INNER-JOIN-TABLE1"), makeSymbol("_CSETF-SQL-INNER-JOIN-TABLE2"), makeSymbol("_CSETF-SQL-INNER-JOIN-ON"));

    private static final SubLSymbol PRINT_SQL_INNER_JOIN = makeSymbol("PRINT-SQL-INNER-JOIN");

    private static final SubLSymbol SQL_INNER_JOIN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-INNER-JOIN-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list566 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-INNER-JOIN-P"));

    private static final SubLSymbol SQL_INNER_JOIN_TABLE1 = makeSymbol("SQL-INNER-JOIN-TABLE1");

    private static final SubLSymbol _CSETF_SQL_INNER_JOIN_TABLE1 = makeSymbol("_CSETF-SQL-INNER-JOIN-TABLE1");

    private static final SubLSymbol SQL_INNER_JOIN_TABLE2 = makeSymbol("SQL-INNER-JOIN-TABLE2");

    private static final SubLSymbol _CSETF_SQL_INNER_JOIN_TABLE2 = makeSymbol("_CSETF-SQL-INNER-JOIN-TABLE2");

    private static final SubLSymbol SQL_INNER_JOIN_ON = makeSymbol("SQL-INNER-JOIN-ON");

    private static final SubLSymbol _CSETF_SQL_INNER_JOIN_ON = makeSymbol("_CSETF-SQL-INNER-JOIN-ON");



    private static final SubLSymbol MAKE_SQL_INNER_JOIN = makeSymbol("MAKE-SQL-INNER-JOIN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_INNER_JOIN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-INNER-JOIN-METHOD");

    private static final SubLString $str576$_a_INNER_JOIN__a_ON__a = makeString("~a INNER JOIN ~a ON ~a");

    private static final SubLSymbol SQL_LEFT_JOIN = makeSymbol("SQL-LEFT-JOIN");

    private static final SubLSymbol SQL_LEFT_JOIN_P = makeSymbol("SQL-LEFT-JOIN-P");

    private static final SubLList $list579 = list(makeSymbol("LEFT-TABLE"), makeSymbol("RIGHT-TABLE"), makeSymbol("ON"));

    private static final SubLList $list580 = list(makeKeyword("LEFT-TABLE"), makeKeyword("RIGHT-TABLE"), makeKeyword("ON"));

    private static final SubLList $list581 = list(makeSymbol("SQL-LEFT-JOIN-LEFT-TABLE"), makeSymbol("SQL-LEFT-JOIN-RIGHT-TABLE"), makeSymbol("SQL-LEFT-JOIN-ON"));

    private static final SubLList $list582 = list(makeSymbol("_CSETF-SQL-LEFT-JOIN-LEFT-TABLE"), makeSymbol("_CSETF-SQL-LEFT-JOIN-RIGHT-TABLE"), makeSymbol("_CSETF-SQL-LEFT-JOIN-ON"));

    private static final SubLSymbol PRINT_SQL_LEFT_JOIN = makeSymbol("PRINT-SQL-LEFT-JOIN");

    private static final SubLSymbol SQL_LEFT_JOIN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-LEFT-JOIN-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list585 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-LEFT-JOIN-P"));

    private static final SubLSymbol SQL_LEFT_JOIN_LEFT_TABLE = makeSymbol("SQL-LEFT-JOIN-LEFT-TABLE");

    private static final SubLSymbol _CSETF_SQL_LEFT_JOIN_LEFT_TABLE = makeSymbol("_CSETF-SQL-LEFT-JOIN-LEFT-TABLE");

    private static final SubLSymbol SQL_LEFT_JOIN_RIGHT_TABLE = makeSymbol("SQL-LEFT-JOIN-RIGHT-TABLE");

    private static final SubLSymbol _CSETF_SQL_LEFT_JOIN_RIGHT_TABLE = makeSymbol("_CSETF-SQL-LEFT-JOIN-RIGHT-TABLE");

    private static final SubLSymbol SQL_LEFT_JOIN_ON = makeSymbol("SQL-LEFT-JOIN-ON");

    private static final SubLSymbol _CSETF_SQL_LEFT_JOIN_ON = makeSymbol("_CSETF-SQL-LEFT-JOIN-ON");





    private static final SubLSymbol MAKE_SQL_LEFT_JOIN = makeSymbol("MAKE-SQL-LEFT-JOIN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_LEFT_JOIN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-LEFT-JOIN-METHOD");

    private static final SubLString $str596$_a_LEFT_JOIN__a_ON__a = makeString("~a LEFT JOIN ~a ON ~a");

    private static final SubLSymbol SQL_UNION = makeSymbol("SQL-UNION");

    private static final SubLSymbol SQL_UNION_P = makeSymbol("SQL-UNION-P");

    public static final SubLList $list599 = list(makeSymbol("SELECT1"), makeSymbol("SELECT2"));

    public static final SubLList $list600 = list(makeKeyword("SELECT1"), makeKeyword("SELECT2"));

    public static final SubLList $list601 = list(makeSymbol("SQL-UNION-SELECT1"), makeSymbol("SQL-UNION-SELECT2"));

    private static final SubLList $list602 = list(makeSymbol("_CSETF-SQL-UNION-SELECT1"), makeSymbol("_CSETF-SQL-UNION-SELECT2"));

    private static final SubLSymbol PRINT_SQL_UNION = makeSymbol("PRINT-SQL-UNION");

    private static final SubLSymbol SQL_UNION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-UNION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list605 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-UNION-P"));

    private static final SubLSymbol SQL_UNION_SELECT1 = makeSymbol("SQL-UNION-SELECT1");

    private static final SubLSymbol _CSETF_SQL_UNION_SELECT1 = makeSymbol("_CSETF-SQL-UNION-SELECT1");

    private static final SubLSymbol SQL_UNION_SELECT2 = makeSymbol("SQL-UNION-SELECT2");

    private static final SubLSymbol _CSETF_SQL_UNION_SELECT2 = makeSymbol("_CSETF-SQL-UNION-SELECT2");





    private static final SubLSymbol MAKE_SQL_UNION = makeSymbol("MAKE-SQL-UNION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_UNION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-UNION-METHOD");

    private static final SubLString $str614$_a__UNION___a = makeString("~a~%UNION~%~a");

    private static final SubLSymbol SQL_ALTER_TABLE = makeSymbol("SQL-ALTER-TABLE");

    private static final SubLSymbol SQL_ALTER_TABLE_P = makeSymbol("SQL-ALTER-TABLE-P");

    private static final SubLList $list617 = list(makeSymbol("TABLE"), makeSymbol("ACTION"));

    private static final SubLList $list618 = list(makeKeyword("TABLE"), makeKeyword("ACTION"));

    private static final SubLList $list619 = list(makeSymbol("SQL-ALTER-TABLE-TABLE"), makeSymbol("SQL-ALTER-TABLE-ACTION"));

    private static final SubLList $list620 = list(makeSymbol("_CSETF-SQL-ALTER-TABLE-TABLE"), makeSymbol("_CSETF-SQL-ALTER-TABLE-ACTION"));

    private static final SubLSymbol PRINT_SQL_ALTER_TABLE = makeSymbol("PRINT-SQL-ALTER-TABLE");

    private static final SubLSymbol SQL_ALTER_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-ALTER-TABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list623 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-ALTER-TABLE-P"));

    private static final SubLSymbol SQL_ALTER_TABLE_TABLE = makeSymbol("SQL-ALTER-TABLE-TABLE");

    private static final SubLSymbol _CSETF_SQL_ALTER_TABLE_TABLE = makeSymbol("_CSETF-SQL-ALTER-TABLE-TABLE");

    private static final SubLSymbol SQL_ALTER_TABLE_ACTION = makeSymbol("SQL-ALTER-TABLE-ACTION");

    private static final SubLSymbol _CSETF_SQL_ALTER_TABLE_ACTION = makeSymbol("_CSETF-SQL-ALTER-TABLE-ACTION");



    private static final SubLSymbol MAKE_SQL_ALTER_TABLE = makeSymbol("MAKE-SQL-ALTER-TABLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_ALTER_TABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-ALTER-TABLE-METHOD");

    private static final SubLString $str631$ALTER_TABLE__a__a = makeString("ALTER TABLE ~a ~a");

    private static final SubLSymbol SQL_ALTERATION_P = makeSymbol("SQL-ALTERATION-P");

    private static final SubLSymbol SQL_ADD_COLUMN = makeSymbol("SQL-ADD-COLUMN");

    private static final SubLSymbol SQL_ADD_COLUMN_P = makeSymbol("SQL-ADD-COLUMN-P");

    public static final SubLList $list635 = list(makeSymbol("COLUMN"), makeSymbol("TYPE"), makeSymbol("SIZE"), makeSymbol("CONSTRAINTS"));

    public static final SubLList $list636 = list(makeKeyword("COLUMN"), makeKeyword("TYPE"), makeKeyword("SIZE"), makeKeyword("CONSTRAINTS"));

    public static final SubLList $list637 = list(makeSymbol("SQL-ADD-COLUMN-COLUMN"), makeSymbol("SQL-ADD-COLUMN-TYPE"), makeSymbol("SQL-ADD-COLUMN-SIZE"), makeSymbol("SQL-ADD-COLUMN-CONSTRAINTS"));

    public static final SubLList $list638 = list(makeSymbol("_CSETF-SQL-ADD-COLUMN-COLUMN"), makeSymbol("_CSETF-SQL-ADD-COLUMN-TYPE"), makeSymbol("_CSETF-SQL-ADD-COLUMN-SIZE"), makeSymbol("_CSETF-SQL-ADD-COLUMN-CONSTRAINTS"));

    private static final SubLSymbol PRINT_SQL_ADD_COLUMN = makeSymbol("PRINT-SQL-ADD-COLUMN");

    private static final SubLSymbol SQL_ADD_COLUMN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-ADD-COLUMN-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list641 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-ADD-COLUMN-P"));

    private static final SubLSymbol SQL_ADD_COLUMN_COLUMN = makeSymbol("SQL-ADD-COLUMN-COLUMN");

    private static final SubLSymbol _CSETF_SQL_ADD_COLUMN_COLUMN = makeSymbol("_CSETF-SQL-ADD-COLUMN-COLUMN");

    private static final SubLSymbol SQL_ADD_COLUMN_TYPE = makeSymbol("SQL-ADD-COLUMN-TYPE");

    private static final SubLSymbol _CSETF_SQL_ADD_COLUMN_TYPE = makeSymbol("_CSETF-SQL-ADD-COLUMN-TYPE");

    private static final SubLSymbol SQL_ADD_COLUMN_SIZE = makeSymbol("SQL-ADD-COLUMN-SIZE");

    private static final SubLSymbol _CSETF_SQL_ADD_COLUMN_SIZE = makeSymbol("_CSETF-SQL-ADD-COLUMN-SIZE");

    private static final SubLSymbol SQL_ADD_COLUMN_CONSTRAINTS = makeSymbol("SQL-ADD-COLUMN-CONSTRAINTS");

    private static final SubLSymbol _CSETF_SQL_ADD_COLUMN_CONSTRAINTS = makeSymbol("_CSETF-SQL-ADD-COLUMN-CONSTRAINTS");







    private static final SubLSymbol MAKE_SQL_ADD_COLUMN = makeSymbol("MAKE-SQL-ADD-COLUMN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_ADD_COLUMN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-ADD-COLUMN-METHOD");

    private static final SubLString $str655$ADD_COLUMN__a__a = makeString("ADD COLUMN ~a ~a");

    private static final SubLString $str656$__a_ = makeString("(~a)");



    private static final SubLSymbol SQL_COLUMN_CONSTRAINT_P = makeSymbol("SQL-COLUMN-CONSTRAINT-P");

    private static final SubLSymbol SQL_DROP_COLUMN = makeSymbol("SQL-DROP-COLUMN");

    private static final SubLSymbol SQL_DROP_COLUMN_P = makeSymbol("SQL-DROP-COLUMN-P");

    private static final SubLList $list661 = list(makeSymbol("COLUMN"));

    private static final SubLList $list662 = list(makeKeyword("COLUMN"));

    private static final SubLList $list663 = list(makeSymbol("SQL-DROP-COLUMN-COLUMN"));

    public static final SubLList $list664 = list(makeSymbol("_CSETF-SQL-DROP-COLUMN-COLUMN"));

    private static final SubLSymbol PRINT_SQL_DROP_COLUMN = makeSymbol("PRINT-SQL-DROP-COLUMN");

    private static final SubLSymbol SQL_DROP_COLUMN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-DROP-COLUMN-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list667 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-DROP-COLUMN-P"));

    private static final SubLSymbol SQL_DROP_COLUMN_COLUMN = makeSymbol("SQL-DROP-COLUMN-COLUMN");

    private static final SubLSymbol _CSETF_SQL_DROP_COLUMN_COLUMN = makeSymbol("_CSETF-SQL-DROP-COLUMN-COLUMN");

    private static final SubLSymbol MAKE_SQL_DROP_COLUMN = makeSymbol("MAKE-SQL-DROP-COLUMN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_DROP_COLUMN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-DROP-COLUMN-METHOD");

    private static final SubLString $str672$DROP_COLUMN__a = makeString("DROP COLUMN ~a");

    private static final SubLSymbol SQL_RENAME_COLUMN = makeSymbol("SQL-RENAME-COLUMN");

    private static final SubLSymbol SQL_RENAME_COLUMN_P = makeSymbol("SQL-RENAME-COLUMN-P");

    private static final SubLList $list675 = list(makeSymbol("OLD-COLUMN"), makeSymbol("NEW-COLUMN"));

    private static final SubLList $list676 = list(makeKeyword("OLD-COLUMN"), makeKeyword("NEW-COLUMN"));

    private static final SubLList $list677 = list(makeSymbol("SQL-RENAME-COLUMN-OLD-COLUMN"), makeSymbol("SQL-RENAME-COLUMN-NEW-COLUMN"));

    private static final SubLList $list678 = list(makeSymbol("_CSETF-SQL-RENAME-COLUMN-OLD-COLUMN"), makeSymbol("_CSETF-SQL-RENAME-COLUMN-NEW-COLUMN"));

    private static final SubLSymbol PRINT_SQL_RENAME_COLUMN = makeSymbol("PRINT-SQL-RENAME-COLUMN");

    private static final SubLSymbol SQL_RENAME_COLUMN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-RENAME-COLUMN-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list681 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-RENAME-COLUMN-P"));

    private static final SubLSymbol SQL_RENAME_COLUMN_OLD_COLUMN = makeSymbol("SQL-RENAME-COLUMN-OLD-COLUMN");

    private static final SubLSymbol _CSETF_SQL_RENAME_COLUMN_OLD_COLUMN = makeSymbol("_CSETF-SQL-RENAME-COLUMN-OLD-COLUMN");

    private static final SubLSymbol SQL_RENAME_COLUMN_NEW_COLUMN = makeSymbol("SQL-RENAME-COLUMN-NEW-COLUMN");

    private static final SubLSymbol _CSETF_SQL_RENAME_COLUMN_NEW_COLUMN = makeSymbol("_CSETF-SQL-RENAME-COLUMN-NEW-COLUMN");





    private static final SubLSymbol MAKE_SQL_RENAME_COLUMN = makeSymbol("MAKE-SQL-RENAME-COLUMN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_RENAME_COLUMN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-RENAME-COLUMN-METHOD");

    private static final SubLString $str690$RENAME__a_TO__a = makeString("RENAME ~a TO ~a");

    private static final SubLSymbol SQL_ADD_CONSTRAINT = makeSymbol("SQL-ADD-CONSTRAINT");

    private static final SubLSymbol SQL_ADD_CONSTRAINT_P = makeSymbol("SQL-ADD-CONSTRAINT-P");

    private static final SubLList $list693 = list(makeSymbol("CONSTRAINT"));

    public static final SubLList $list694 = list(makeKeyword("CONSTRAINT"));

    public static final SubLList $list695 = list(makeSymbol("SQL-ADD-CONSTRAINT-CONSTRAINT"));

    private static final SubLList $list696 = list(makeSymbol("_CSETF-SQL-ADD-CONSTRAINT-CONSTRAINT"));

    private static final SubLSymbol PRINT_SQL_ADD_CONSTRAINT = makeSymbol("PRINT-SQL-ADD-CONSTRAINT");

    private static final SubLSymbol SQL_ADD_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-ADD-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list699 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-ADD-CONSTRAINT-P"));

    private static final SubLSymbol SQL_ADD_CONSTRAINT_CONSTRAINT = makeSymbol("SQL-ADD-CONSTRAINT-CONSTRAINT");

    private static final SubLSymbol _CSETF_SQL_ADD_CONSTRAINT_CONSTRAINT = makeSymbol("_CSETF-SQL-ADD-CONSTRAINT-CONSTRAINT");



    private static final SubLSymbol MAKE_SQL_ADD_CONSTRAINT = makeSymbol("MAKE-SQL-ADD-CONSTRAINT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_ADD_CONSTRAINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-ADD-CONSTRAINT-METHOD");

    private static final SubLString $str705$ADD_CONSTRAINT__a__a = makeString("ADD CONSTRAINT ~a ~a");

    private static final SubLSymbol SQL_TABLE_CONSTRAINT_P = makeSymbol("SQL-TABLE-CONSTRAINT-P");

    private static final SubLSymbol SQL_DROP_CONSTRAINT = makeSymbol("SQL-DROP-CONSTRAINT");

    private static final SubLSymbol SQL_DROP_CONSTRAINT_P = makeSymbol("SQL-DROP-CONSTRAINT-P");

    private static final SubLList $list709 = list(makeSymbol("SQL-DROP-CONSTRAINT-CONSTRAINT"));

    private static final SubLList $list710 = list(makeSymbol("_CSETF-SQL-DROP-CONSTRAINT-CONSTRAINT"));

    private static final SubLSymbol PRINT_SQL_DROP_CONSTRAINT = makeSymbol("PRINT-SQL-DROP-CONSTRAINT");

    private static final SubLSymbol SQL_DROP_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-DROP-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list713 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-DROP-CONSTRAINT-P"));

    private static final SubLSymbol SQL_DROP_CONSTRAINT_CONSTRAINT = makeSymbol("SQL-DROP-CONSTRAINT-CONSTRAINT");

    private static final SubLSymbol _CSETF_SQL_DROP_CONSTRAINT_CONSTRAINT = makeSymbol("_CSETF-SQL-DROP-CONSTRAINT-CONSTRAINT");

    private static final SubLSymbol MAKE_SQL_DROP_CONSTRAINT = makeSymbol("MAKE-SQL-DROP-CONSTRAINT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_DROP_CONSTRAINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-DROP-CONSTRAINT-METHOD");

    private static final SubLString $str718$DROP_CONSTRAINT__a = makeString("DROP CONSTRAINT ~a");

    private static final SubLSymbol SQL_FK_COLUMN_CONSTRAINT = makeSymbol("SQL-FK-COLUMN-CONSTRAINT");

    private static final SubLSymbol SQL_FK_COLUMN_CONSTRAINT_P = makeSymbol("SQL-FK-COLUMN-CONSTRAINT-P");

    private static final SubLList $list721 = list(makeSymbol("NAME"), makeSymbol("TABLE"), makeSymbol("COLUMN"));

    private static final SubLList $list722 = list(makeKeyword("NAME"), makeKeyword("TABLE"), makeKeyword("COLUMN"));

    private static final SubLList $list723 = list(makeSymbol("SQL-FK-COLUMN-CONSTRAINT-NAME"), makeSymbol("SQL-FK-COLUMN-CONSTRAINT-TABLE"), makeSymbol("SQL-FK-COLUMN-CONSTRAINT-COLUMN"));

    private static final SubLList $list724 = list(makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-NAME"), makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-TABLE"), makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-COLUMN"));

    private static final SubLSymbol PRINT_SQL_FK_COLUMN_CONSTRAINT = makeSymbol("PRINT-SQL-FK-COLUMN-CONSTRAINT");

    private static final SubLSymbol SQL_FK_COLUMN_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-FK-COLUMN-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list727 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-FK-COLUMN-CONSTRAINT-P"));

    private static final SubLSymbol SQL_FK_COLUMN_CONSTRAINT_NAME = makeSymbol("SQL-FK-COLUMN-CONSTRAINT-NAME");

    private static final SubLSymbol _CSETF_SQL_FK_COLUMN_CONSTRAINT_NAME = makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-NAME");

    private static final SubLSymbol SQL_FK_COLUMN_CONSTRAINT_TABLE = makeSymbol("SQL-FK-COLUMN-CONSTRAINT-TABLE");

    private static final SubLSymbol _CSETF_SQL_FK_COLUMN_CONSTRAINT_TABLE = makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-TABLE");

    private static final SubLSymbol SQL_FK_COLUMN_CONSTRAINT_COLUMN = makeSymbol("SQL-FK-COLUMN-CONSTRAINT-COLUMN");

    private static final SubLSymbol _CSETF_SQL_FK_COLUMN_CONSTRAINT_COLUMN = makeSymbol("_CSETF-SQL-FK-COLUMN-CONSTRAINT-COLUMN");



    private static final SubLSymbol MAKE_SQL_FK_COLUMN_CONSTRAINT = makeSymbol("MAKE-SQL-FK-COLUMN-CONSTRAINT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_FK_COLUMN_CONSTRAINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-FK-COLUMN-CONSTRAINT-METHOD");

    private static final SubLString $str737$REFERENCES__a___a_ = makeString("REFERENCES ~a (~a)");

    private static final SubLSymbol SQL_FK_TABLE_CONSTRAINT = makeSymbol("SQL-FK-TABLE-CONSTRAINT");

    private static final SubLSymbol SQL_FK_TABLE_CONSTRAINT_P = makeSymbol("SQL-FK-TABLE-CONSTRAINT-P");

    private static final SubLList $list740 = list(makeSymbol("COLUMN"), makeSymbol("CONSTRAINT"));

    private static final SubLList $list741 = list(makeKeyword("COLUMN"), makeKeyword("CONSTRAINT"));

    private static final SubLList $list742 = list(makeSymbol("SQL-FK-TABLE-CONSTRAINT-COLUMN"), makeSymbol("SQL-FK-TABLE-CONSTRAINT-CONSTRAINT"));

    private static final SubLList $list743 = list(makeSymbol("_CSETF-SQL-FK-TABLE-CONSTRAINT-COLUMN"), makeSymbol("_CSETF-SQL-FK-TABLE-CONSTRAINT-CONSTRAINT"));

    private static final SubLSymbol PRINT_SQL_FK_TABLE_CONSTRAINT = makeSymbol("PRINT-SQL-FK-TABLE-CONSTRAINT");

    private static final SubLSymbol SQL_FK_TABLE_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-FK-TABLE-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list746 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-FK-TABLE-CONSTRAINT-P"));

    private static final SubLSymbol SQL_FK_TABLE_CONSTRAINT_COLUMN = makeSymbol("SQL-FK-TABLE-CONSTRAINT-COLUMN");

    private static final SubLSymbol _CSETF_SQL_FK_TABLE_CONSTRAINT_COLUMN = makeSymbol("_CSETF-SQL-FK-TABLE-CONSTRAINT-COLUMN");

    private static final SubLSymbol SQL_FK_TABLE_CONSTRAINT_CONSTRAINT = makeSymbol("SQL-FK-TABLE-CONSTRAINT-CONSTRAINT");

    private static final SubLSymbol _CSETF_SQL_FK_TABLE_CONSTRAINT_CONSTRAINT = makeSymbol("_CSETF-SQL-FK-TABLE-CONSTRAINT-CONSTRAINT");

    private static final SubLSymbol MAKE_SQL_FK_TABLE_CONSTRAINT = makeSymbol("MAKE-SQL-FK-TABLE-CONSTRAINT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_FK_TABLE_CONSTRAINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-FK-TABLE-CONSTRAINT-METHOD");

    private static final SubLString $str753$FOREIGN_KEY___a___a = makeString("FOREIGN KEY (~a) ~a");

    private static final SubLSymbol SQL_UPDATE = makeSymbol("SQL-UPDATE");

    private static final SubLSymbol SQL_UPDATE_P = makeSymbol("SQL-UPDATE-P");

    private static final SubLList $list756 = list(makeSymbol("TABLE"), makeSymbol("SETTINGS"), makeSymbol("CONDITIONS"));

    private static final SubLList $list757 = list(makeKeyword("TABLE"), makeKeyword("SETTINGS"), makeKeyword("CONDITIONS"));

    private static final SubLList $list758 = list(makeSymbol("SQL-UPDATE-TABLE"), makeSymbol("SQL-UPDATE-SETTINGS"), makeSymbol("SQL-UPDATE-CONDITIONS"));

    private static final SubLList $list759 = list(makeSymbol("_CSETF-SQL-UPDATE-TABLE"), makeSymbol("_CSETF-SQL-UPDATE-SETTINGS"), makeSymbol("_CSETF-SQL-UPDATE-CONDITIONS"));

    private static final SubLSymbol PRINT_SQL_UPDATE = makeSymbol("PRINT-SQL-UPDATE");

    private static final SubLSymbol SQL_UPDATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-UPDATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list762 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-UPDATE-P"));

    private static final SubLSymbol SQL_UPDATE_TABLE = makeSymbol("SQL-UPDATE-TABLE");

    private static final SubLSymbol _CSETF_SQL_UPDATE_TABLE = makeSymbol("_CSETF-SQL-UPDATE-TABLE");

    private static final SubLSymbol SQL_UPDATE_SETTINGS = makeSymbol("SQL-UPDATE-SETTINGS");

    private static final SubLSymbol _CSETF_SQL_UPDATE_SETTINGS = makeSymbol("_CSETF-SQL-UPDATE-SETTINGS");

    private static final SubLSymbol SQL_UPDATE_CONDITIONS = makeSymbol("SQL-UPDATE-CONDITIONS");

    private static final SubLSymbol _CSETF_SQL_UPDATE_CONDITIONS = makeSymbol("_CSETF-SQL-UPDATE-CONDITIONS");



    private static final SubLSymbol MAKE_SQL_UPDATE = makeSymbol("MAKE-SQL-UPDATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_UPDATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-UPDATE-METHOD");

    private static final SubLString $str772$UPDATE__a_SET_ = makeString("UPDATE ~a SET ");

    private static final SubLString $$$_WHERE_ = makeString(" WHERE ");

    private static final SubLSymbol SQL_DROP_TABLE = makeSymbol("SQL-DROP-TABLE");

    private static final SubLSymbol SQL_DROP_TABLE_P = makeSymbol("SQL-DROP-TABLE-P");

    private static final SubLList $list776 = list(makeSymbol("TABLE"));

    private static final SubLList $list777 = list(makeKeyword("TABLE"));

    private static final SubLList $list778 = list(makeSymbol("SQL-DROP-TABLE-TABLE"));

    private static final SubLList $list779 = list(makeSymbol("_CSETF-SQL-DROP-TABLE-TABLE"));

    private static final SubLSymbol PRINT_SQL_DROP_TABLE = makeSymbol("PRINT-SQL-DROP-TABLE");

    private static final SubLSymbol SQL_DROP_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-DROP-TABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list782 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-DROP-TABLE-P"));

    private static final SubLSymbol SQL_DROP_TABLE_TABLE = makeSymbol("SQL-DROP-TABLE-TABLE");

    private static final SubLSymbol _CSETF_SQL_DROP_TABLE_TABLE = makeSymbol("_CSETF-SQL-DROP-TABLE-TABLE");

    private static final SubLSymbol MAKE_SQL_DROP_TABLE = makeSymbol("MAKE-SQL-DROP-TABLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_DROP_TABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-DROP-TABLE-METHOD");

    private static final SubLString $str787$DROP_TABLE__a = makeString("DROP TABLE ~a");

    private static final SubLString $str788$Can_t_access_name_of_column_const = makeString("Can't access name of column constraint ~a");

    private static final SubLString $str789$_ = makeString("_");

    private static final SubLString $str790$_fk = makeString("_fk");

    private static final SubLSymbol $access_path_map$ = makeSymbol("*ACCESS-PATH-MAP*");

    private static final SubLList $list792 = cons(makeSymbol("FUNCTION"), makeSymbol("NAME"));

    private static final SubLList $list793 = list(cons(makeSymbol("SPORTING-GOODS-ACCESS-PATH"), makeString("Sporting Goods")), cons(makeSymbol("NORTHWIND-ACCESS-PATH"), makeString("Northwind")), cons(makeSymbol("BATHYMETRIC-HEADER-ACCESS-PATH"), makeString("NGATST Bathymetric Survey Headers")), cons(makeSymbol("GNDB-ACCESS-PATH"), makeString("GeoNames")), cons(makeSymbol("BLN2-ACCESS-PATH"), makeString("BLN 2")), cons(makeSymbol("BLN1-ACCESS-PATH"), makeString("BLN 1")));



    private static final SubLSymbol $sym795$_BLN1_ACCESS_PATH_ = makeSymbol("*BLN1-ACCESS-PATH*");

    private static final SubLSymbol $sym796$_BLN2_ACCESS_PATH_ = makeSymbol("*BLN2-ACCESS-PATH*");

    private static final SubLSymbol $usgs_access_path$ = makeSymbol("*USGS-ACCESS-PATH*");

    private static final SubLSymbol $nga_access_path$ = makeSymbol("*NGA-ACCESS-PATH*");

    private static final SubLSymbol $gndb_access_path$ = makeSymbol("*GNDB-ACCESS-PATH*");

    private static final SubLSymbol $bathymetric_data_access_path$ = makeSymbol("*BATHYMETRIC-DATA-ACCESS-PATH*");

    private static final SubLSymbol $bathymetric_header_access_path$ = makeSymbol("*BATHYMETRIC-HEADER-ACCESS-PATH*");

    private static final SubLSymbol $sporting_goods_access_path$ = makeSymbol("*SPORTING-GOODS-ACCESS-PATH*");

    private static final SubLSymbol $northwind_access_path$ = makeSymbol("*NORTHWIND-ACCESS-PATH*");

    private static final SubLString $str804$bln_fusion_test_db_1 = makeString("bln_fusion_test_db_1");

    private static final SubLString $$$sksi = makeString("sksi");

    private static final SubLString $str806$cyc11_cyc_com = makeString("cyc11.cyc.com");

    private static final SubLString $str807$standard_cyc_com = makeString("standard.cyc.com");

    private static final SubLInteger $int$9999 = makeInteger(9999);

    private static final SubLString $$$postgresql = makeString("postgresql");

    private static final SubLObject $$PostgreSQL = reader_make_constant_shell(makeString("PostgreSQL"));

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLString $str812$bln_fusion_test_db_2 = makeString("bln_fusion_test_db_2");

    private static final SubLString $$$usgs = makeString("usgs");

    private static final SubLString $str814$astro_cyc_com = makeString("astro.cyc.com");

    private static final SubLString $$$nga = makeString("nga");

    private static final SubLString $$$gndb = makeString("gndb");

    private static final SubLString $str817$sporting_goods = makeString("sporting_goods");

    private static final SubLString $$$northwind = makeString("northwind");

    private static final SubLString $$$postgres = makeString("postgres");

    private static final SubLString $str820$bathymetric_data = makeString("bathymetric_data");

    private static final SubLInteger $int$214 = makeInteger(214);

    private static final SubLString $str822$bathymetric_survey = makeString("bathymetric_survey");

    private static final SubLString $str823$semantic_etl_target_db = makeString("semantic_etl_target_db");

    private static final SubLString $$$bln1 = makeString("bln1");

    private static final SubLString $$$bln2 = makeString("bln2");

    private static final SubLString $$$target = makeString("target");

    private static final SubLString $str827$Can_t_find_column__a_in__a = makeString("Can't find column ~a in ~a");

    private static final SubLSymbol EMPTY_SEMANTIC_RECIPE_STEP_P = makeSymbol("EMPTY-SEMANTIC-RECIPE-STEP-P");



    private static final SubLString $str830$unable_to_interpret__S_as_part_of = makeString("unable to interpret ~S as part of a recipe-step");

    private static final SubLList $list831 = list(makeSymbol("FROM-COLUMN"), makeSymbol("TO-COLUMN"), makeSymbol("JUST"));



    private static final SubLString $str833$Didn_t_apply_command__a_to_output = makeString("Didn't apply command ~a to output-spec");

    private static final SubLString $str834$Apply__a_within__a_to_output_spec = makeString("Apply ~a within ~a to output-spec unimplemented");

    private static final SubLString $str835$Can_t_add_new_column__a_to__a_sin = makeString("Can't add new column ~a to ~a since a column ~a already exists in ~a");

    private static final SubLString $str836$table_expression__a_unimplemented = makeString("table expression ~a unimplemented");

    private static final SubLString $str837$ambiguity_in_select_clause___a_id = makeString("ambiguity in select clause: ~a identifies all of ~a in ~a");

    private static final SubLString $str838$source_result_set__a_and_target__ = makeString("source result set ~a and target ~a columns have different lengths ~a/~a in ~a");

    public static SubLObject do_table_semantics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject table_semantics = NIL;
        SubLObject semantics = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        table_semantics = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        semantics = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(table_semantics, list(SEMANTICS_TABLE_SEMANTICS_LIST, semantics)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject do_table_semantics_column_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraint = NIL;
        SubLObject table_semantics = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        constraint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        table_semantics = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(constraint, list(TABLE_SEMANTICS_COLUMN_CONSTRAINTS, table_semantics)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static SubLObject initialize_semantic_etl_infrastructure() {
        clear_db_output_specs();
        integer_sequence_generator.integer_sequence_generator_reset($semantic_etl_table_isg$.getGlobalValue());
        integer_sequence_generator.integer_sequence_generator_reset($db_output_spec_isg$.getGlobalValue());
        $access_path_map$.setGlobalValue(NIL);
        return $INITIALIZED;
    }

    public static SubLObject get_db_output_spec(final SubLObject id) {
        SubLObject spec = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($database_output_specs_lock$.getGlobalValue());
            spec = dictionary.dictionary_lookup($database_output_specs$.getGlobalValue(), id, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($database_output_specs_lock$.getGlobalValue());
            }
        }
        return spec;
    }

    public static SubLObject put_db_output_spec(final SubLObject id, final SubLObject output_spec) {
        SubLObject release = NIL;
        try {
            release = seize_lock($database_output_specs_lock$.getGlobalValue());
            dictionary.dictionary_enter($database_output_specs$.getGlobalValue(), id, output_spec);
        } finally {
            if (NIL != release) {
                release_lock($database_output_specs_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static SubLObject remove_db_output_spec(final SubLObject id) {
        SubLObject release = NIL;
        try {
            release = seize_lock($database_output_specs_lock$.getGlobalValue());
            dictionary.dictionary_remove($database_output_specs$.getGlobalValue(), id);
        } finally {
            if (NIL != release) {
                release_lock($database_output_specs_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static SubLObject clear_db_output_specs() {
        SubLObject release = NIL;
        try {
            release = seize_lock($database_output_specs_lock$.getGlobalValue());
            $database_output_specs$.setGlobalValue(dictionary.new_dictionary(EQL, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($database_output_specs_lock$.getGlobalValue());
            }
        }
        return dictionary.dictionary_p($database_output_specs$.getGlobalValue());
    }

    public static SubLObject database_fusion_loop(final SubLObject access_path1, final SubLObject access_path2) {
        assert NIL != sksi_access_path.access_path_p(access_path1) : "sksi_access_path.access_path_p(access_path1) " + "CommonSymbols.NIL != sksi_access_path.access_path_p(access_path1) " + access_path1;
        assert NIL != sksi_access_path.access_path_p(access_path2) : "sksi_access_path.access_path_p(access_path2) " + "CommonSymbols.NIL != sksi_access_path.access_path_p(access_path2) " + access_path2;
        initialize_semantic_etl_infrastructure();
        SubLObject output = NIL;
        SubLObject cdolist_list_var;
        SubLObject output_specs = cdolist_list_var = semantic_etl_fuse_databases(list(access_path1, access_path2));
        SubLObject os = NIL;
        os = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            put_db_output_spec(db_output_spec_id(os), os);
            output = cons(cons(db_output_spec_id(os), os), output);
            cdolist_list_var = cdolist_list_var.rest();
            os = cdolist_list_var.first();
        } 
        princ(output, UNPROVIDED);
        while (true) {
            terpri(UNPROVIDED);
            terpri(UNPROVIDED);
            princ($str10$Please_select_an_output_specifica, UNPROVIDED);
            terpri(UNPROVIDED);
            final SubLObject id = read_from_string(read_line(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject selected_os = get_db_output_spec(id);
            if (NIL != selected_os) {
                output = NIL;
                SubLObject cdolist_list_var2;
                output_specs = cdolist_list_var2 = mapping_engine.semantic_etl_improve_output_spec_external(id);
                SubLObject os2 = NIL;
                os2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    put_db_output_spec(db_output_spec_id(os2), os2);
                    output = cons(cons(db_output_spec_id(os2), os2), output);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    os2 = cdolist_list_var2.first();
                } 
                princ($str11$_________________________________, UNPROVIDED);
                terpri(UNPROVIDED);
                princ(output, UNPROVIDED);
            } else {
                if (id.equal(Q)) {
                    break;
                }
                Errors.warn($str13$There_is_no_output_specification_, id);
            }
        } 
        return NIL;
    }

    public static SubLObject clear_semantic_etl_fuse_databases() {
        final SubLObject cs = $semantic_etl_fuse_databases_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_semantic_etl_fuse_databases(final SubLObject access_paths) {
        return memoization_state.caching_state_remove_function_results_with_args($semantic_etl_fuse_databases_caching_state$.getGlobalValue(), list(access_paths), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject semantic_etl_fuse_databases_internal(final SubLObject access_paths) {
        final SubLObject semantics_list = semantic_etl_parse_metadata_and_data(access_paths);
        final SubLObject semantics1 = semantics_list.first();
        final SubLObject semantics2 = second(semantics_list);
        final SubLObject target_access_path = stub_target_access_path();
        if (!length(semantics_list).numE(TWO_INTEGER)) {
            Errors.error($str15$Can_only_fuse_exactly_two_databas);
        }
        return mapping_engine.semantic_etl_compute_output_spec(semantics1, semantics2, target_access_path, UNPROVIDED);
    }

    public static SubLObject semantic_etl_fuse_databases(final SubLObject access_paths) {
        SubLObject caching_state = $semantic_etl_fuse_databases_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SEMANTIC_ETL_FUSE_DATABASES, $semantic_etl_fuse_databases_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, access_paths, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(semantic_etl_fuse_databases_internal(access_paths)));
            memoization_state.caching_state_put(caching_state, access_paths, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject semantic_etl_parse_metadata_and_data(final SubLObject access_paths) {
        final SubLObject semantics_list = metadata_parser.semantic_etl_parse_metadata(access_paths);
        return data_parser.semantic_etl_parse_data(access_paths, semantics_list);
    }

    public static SubLObject semantic_etl_get_db_structure(final SubLObject access_path) {
        final SubLObject metadata = metadata_parser.semantic_etl_acquire_metadata(access_path);
        final SubLObject semantics_structure = metadata_parser.semantic_etl_convert_metadata_to_semantics(metadata);
        final SubLObject semantics_structure_with_xref = metadata_parser.semantic_etl_parse_xref_metadata(metadata, semantics_structure);
        final SubLObject semantics_structure_with_data = data_parser.semantic_etl_acquire_and_add_data(access_path, semantics_structure_with_xref);
        return semantics_structure_with_data;
    }

    public static SubLObject find_corresponding_item_in_semantics(final SubLObject sem_obj, final SubLObject semantics) {
        final SubLObject method_function = method_func(sem_obj, $find_corresponding_item_in_semantics_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, sem_obj, semantics);
        }
        Errors.warn($str18$Don_t_know_how_to_find_a__S_in_a_, sem_obj);
        return NIL;
    }

    public static SubLObject semantic_object_comparison_name(final SubLObject sem_obj) {
        final SubLObject method_function = method_func(sem_obj, $semantic_object_comparison_name_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, sem_obj);
        }
        Errors.error($str19$don_t_know_how_to_name__S__, sem_obj);
        return NIL;
    }

    public static SubLObject semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_semantics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject semantics_p(final SubLObject v_object) {
        return v_object.getClass() == $semantics_native.class ? T : NIL;
    }

    public static SubLObject semant_access_path(final SubLObject v_object) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject semant_table_semantics_list(final SubLObject v_object) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject semant_table_aliases(final SubLObject v_object) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject semant_dict(final SubLObject v_object) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject semant_dropped_items(final SubLObject v_object) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject semant_output_spec(final SubLObject v_object) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_semant_access_path(final SubLObject v_object, final SubLObject value) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_semant_table_semantics_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_semant_table_aliases(final SubLObject v_object, final SubLObject value) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_semant_dict(final SubLObject v_object, final SubLObject value) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_semant_dropped_items(final SubLObject v_object, final SubLObject value) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_semant_output_spec(final SubLObject v_object, final SubLObject value) {
        assert NIL != semantics_p(v_object) : "semantic_etl_bus.semantics_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_semantics(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ACCESS_PATH)) {
                _csetf_semant_access_path(v_new, current_value);
            } else
                if (pcase_var.eql($TABLE_SEMANTICS_LIST)) {
                    _csetf_semant_table_semantics_list(v_new, current_value);
                } else
                    if (pcase_var.eql($TABLE_ALIASES)) {
                        _csetf_semant_table_aliases(v_new, current_value);
                    } else
                        if (pcase_var.eql($DICT)) {
                            _csetf_semant_dict(v_new, current_value);
                        } else
                            if (pcase_var.eql($DROPPED_ITEMS)) {
                                _csetf_semant_dropped_items(v_new, current_value);
                            } else
                                if (pcase_var.eql($OUTPUT_SPEC)) {
                                    _csetf_semant_output_spec(v_new, current_value);
                                } else {
                                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SEMANTICS, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ACCESS_PATH, semant_access_path(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE_SEMANTICS_LIST, semant_table_semantics_list(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE_ALIASES, semant_table_aliases(obj));
        funcall(visitor_fn, obj, $SLOT, $DICT, semant_dict(obj));
        funcall(visitor_fn, obj, $SLOT, $DROPPED_ITEMS, semant_dropped_items(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTPUT_SPEC, semant_output_spec(obj));
        funcall(visitor_fn, obj, $END, MAKE_SEMANTICS, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_semantics(obj, visitor_fn);
    }

    public static SubLObject print_semantics(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str53$_SEMANTICS____a_____a_, access_path_pretty_string(semant_access_path(v_object)), semant_table_semantics_list(v_object));
        return v_object;
    }

    public static SubLObject semantics_access_path(final SubLObject semantics) {
        assert NIL != semantics_p(semantics) : "semantic_etl_bus.semantics_p(semantics) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics) " + semantics;
        return semant_access_path(semantics);
    }

    public static SubLObject semantics_table_semantics_list(final SubLObject semantics) {
        assert NIL != semantics_p(semantics) : "semantic_etl_bus.semantics_p(semantics) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics) " + semantics;
        return semant_table_semantics_list(semantics);
    }

    public static SubLObject semantics_get_table_named(final SubLObject semantics, final SubLObject name) {
        SubLObject cdolist_list_var = semant_table_aliases(semantics);
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (name.equalp(table_semantics_table_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        cdolist_list_var = semantics_table_semantics_list(semantics);
        table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (name.equalp(table_semantics_table_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        cdolist_list_var = semantics_dropped_tables(semantics);
        table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (name.equalp(table_semantics_table_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject semantics_get_column_named(final SubLObject semantics, final SubLObject table_name, final SubLObject column_name) {
        final SubLObject table = semantics_get_table_named(semantics, table_name);
        return table_semantics_get_column_named(table, column_name);
    }

    public static SubLObject semantics_get_table_with_id(final SubLObject semantics, final SubLObject id) {
        return dictionary.dictionary_lookup(semant_dict(semantics), id, UNPROVIDED);
    }

    public static SubLObject new_semantics(final SubLObject access_path, final SubLObject table_semantics_list) {
        assert NIL != sksi_access_path.access_path_p(access_path) : "sksi_access_path.access_path_p(access_path) " + "CommonSymbols.NIL != sksi_access_path.access_path_p(access_path) " + access_path;
        assert NIL != list_utilities.non_dotted_list_p(table_semantics_list) : "list_utilities.non_dotted_list_p(table_semantics_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(table_semantics_list) " + table_semantics_list;
        SubLObject cdolist_list_var = table_semantics_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != table_semantics_p(elem) : "semantic_etl_bus.table_semantics_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject semantics = make_semantics(UNPROVIDED);
        _csetf_semant_access_path(semantics, access_path);
        _csetf_semant_table_semantics_list(semantics, table_semantics_list);
        cdolist_list_var = table_semantics_list;
        SubLObject table_semantics = NIL;
        table_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != table_semantics_semantics(table_semantics)) && (NIL == table_semantics_source_semantics(table_semantics))) {
                set_table_semantics_source_semantics(table_semantics, table_semantics_semantics(table_semantics));
            }
            set_table_semantics_semantics(table_semantics, semantics);
            cdolist_list_var = cdolist_list_var.rest();
            table_semantics = cdolist_list_var.first();
        } 
        _csetf_semant_dict(semantics, table_id_to_table_semantics_dict(semantics));
        _csetf_semant_dropped_items(semantics, NIL);
        return semantics;
    }

    public static SubLObject copy_semantics(final SubLObject semantics) {
        assert NIL != semantics_p(semantics) : "semantic_etl_bus.semantics_p(semantics) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics) " + semantics;
        final SubLObject access_path = semant_access_path(semantics);
        final SubLObject table_semantics_list = copy_table_semantics_list(semant_table_semantics_list(semantics));
        final SubLObject new_semantics = new_semantics(access_path, table_semantics_list);
        _csetf_semant_dropped_items(new_semantics, copy_list(semant_dropped_items(semantics)));
        return new_semantics;
    }

    public static SubLObject semantics_add_column_constraints(final SubLObject semantics, final SubLObject constraints) {
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != foreign_key_constraint_p(constraint)) {
                final SubLObject constrained_column = foreign_key_constraint_constrained_column(constraint);
                final SubLObject constrained_table = column_semantics_table_semantics(constrained_column);
                table_semantics_add_column_constraint(constrained_table, constraint);
            } else
                if (NIL != primary_key_constraint_p(constraint)) {
                    final SubLObject constrained_table2 = primary_key_constraint_constrained_table(constraint);
                    table_semantics_add_column_constraint(constrained_table2, constraint);
                } else {
                    Errors.warn($str56$don_t_know_how_to_handle__S, constraint);
                }

            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return semantics;
    }

    public static SubLObject semantics_delete_table(final SubLObject semantics, final SubLObject table_semantics) {
        if (NIL != table_semantics_pointed_to_by_table_ids(table_semantics)) {
            Errors.error($str57$Table__S_is_pointed_to_by__A_and_, table_semantics_table_name(table_semantics), Mapping.mapcar(TABLE_SEMANTICS_TABLE_NAME, table_semantics_pointed_to_by_tables(table_semantics)));
        }
        SubLObject cdolist_list_var = table_semantics_column_constraints(table_semantics);
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != foreign_key_constraint_p(constraint)) && foreign_key_constraint_constrained_table(constraint).eql(table_semantics)) {
                table_semantics_remove_column_constraint(table_semantics, constraint);
                final SubLObject pointed_to_table = foreign_key_constraint_constraining_table(constraint);
                final SubLObject table_id = table_semantics_table_id(table_semantics);
                set_table_semantics_pointed_to_by_table_ids(pointed_to_table, remove(table_id, table_semantics_pointed_to_by_table_ids(pointed_to_table), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else
                if ((NIL != primary_key_constraint_p(constraint)) && primary_key_constraint_constrained_table(constraint).eql(table_semantics)) {
                    table_semantics_remove_column_constraint(table_semantics, constraint);
                }

            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        _csetf_semant_table_semantics_list(semantics, remove(table_semantics, semantics_table_semantics_list(semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        _csetf_semant_dict(semantics, table_id_to_table_semantics_dict(semantics));
        semantics_add_dropped(table_semantics_semantics(table_semantics), table_semantics);
        table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_drop(table_semantics));
        return semantics;
    }

    public static SubLObject semantics_delete_foreign_references_to_table(final SubLObject semantics, final SubLObject unwanted_table_semantics) {
        final SubLObject pointed_to_by_table_ids = table_semantics_pointed_to_by_table_ids(unwanted_table_semantics);
        final SubLObject dict = table_id_to_table_semantics_dict(semantics);
        SubLObject removed_constraints = NIL;
        SubLObject cdolist_list_var = pointed_to_by_table_ids;
        SubLObject table_id = NIL;
        table_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject table = dictionary.dictionary_lookup(dict, table_id, UNPROVIDED);
            SubLObject cdolist_list_var_$1 = table_semantics_column_constraints(table);
            SubLObject constraint = NIL;
            constraint = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                if (NIL != foreign_key_constraint_references_tableP(constraint, unwanted_table_semantics)) {
                    table_semantics_remove_column_constraint(table, constraint);
                    removed_constraints = cons(constraint, removed_constraints);
                    set_table_semantics_pointed_to_by_table_ids(unwanted_table_semantics, remove(table_id, table_semantics_pointed_to_by_table_ids(unwanted_table_semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                constraint = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            table_id = cdolist_list_var.first();
        } 
        return removed_constraints;
    }

    public static SubLObject semantics_dropped_tables(final SubLObject semantics) {
        return list_utilities.remove_if_not(TABLE_SEMANTICS_P, semant_dropped_items(semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject semantics_dropped_columns(final SubLObject semantics) {
        return list_utilities.remove_if_not(COLUMN_SEMANTICS_P, semant_dropped_items(semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject semantics_dropped_primary_key_constraints(final SubLObject semantics) {
        return list_utilities.remove_if_not(PRIMARY_KEY_CONSTRAINT_P, semant_dropped_items(semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject semantics_dropped_foreign_key_constraints(final SubLObject semantics) {
        return list_utilities.remove_if_not(FOREIGN_KEY_CONSTRAINT_P, semant_dropped_items(semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject table_semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_table_semantics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject table_semantics_p(final SubLObject v_object) {
        return v_object.getClass() == $table_semantics_native.class ? T : NIL;
    }

    public static SubLObject t_semant_table_id(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject t_semant_table_name(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject t_semant_source_semantics(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject t_semant_semantics(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject t_semant_points_to_table_ids(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject t_semant_pointed_to_by_table_ids(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject t_semant_table_parses(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject t_semant_column_semantics_list(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject t_semant_primary_key_columns(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject t_semant_column_constraints(final SubLObject v_object) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_t_semant_table_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_t_semant_table_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_t_semant_source_semantics(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_t_semant_semantics(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_t_semant_points_to_table_ids(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_t_semant_pointed_to_by_table_ids(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_t_semant_table_parses(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_t_semant_column_semantics_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_t_semant_primary_key_columns(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_t_semant_column_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_semantics_p(v_object) : "semantic_etl_bus.table_semantics_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_table_semantics(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $table_semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE_ID)) {
                _csetf_t_semant_table_id(v_new, current_value);
            } else
                if (pcase_var.eql($TABLE_NAME)) {
                    _csetf_t_semant_table_name(v_new, current_value);
                } else
                    if (pcase_var.eql($SOURCE_SEMANTICS)) {
                        _csetf_t_semant_source_semantics(v_new, current_value);
                    } else
                        if (pcase_var.eql($SEMANTICS)) {
                            _csetf_t_semant_semantics(v_new, current_value);
                        } else
                            if (pcase_var.eql($POINTS_TO_TABLE_IDS)) {
                                _csetf_t_semant_points_to_table_ids(v_new, current_value);
                            } else
                                if (pcase_var.eql($POINTED_TO_BY_TABLE_IDS)) {
                                    _csetf_t_semant_pointed_to_by_table_ids(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TABLE_PARSES)) {
                                        _csetf_t_semant_table_parses(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($COLUMN_SEMANTICS_LIST)) {
                                            _csetf_t_semant_column_semantics_list(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PRIMARY_KEY_COLUMNS)) {
                                                _csetf_t_semant_primary_key_columns(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($COLUMN_CONSTRAINTS)) {
                                                    _csetf_t_semant_column_constraints(v_new, current_value);
                                                } else {
                                                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_table_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TABLE_SEMANTICS, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE_ID, t_semant_table_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE_NAME, t_semant_table_name(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_SEMANTICS, t_semant_source_semantics(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTICS, t_semant_semantics(obj));
        funcall(visitor_fn, obj, $SLOT, $POINTS_TO_TABLE_IDS, t_semant_points_to_table_ids(obj));
        funcall(visitor_fn, obj, $SLOT, $POINTED_TO_BY_TABLE_IDS, t_semant_pointed_to_by_table_ids(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE_PARSES, t_semant_table_parses(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN_SEMANTICS_LIST, t_semant_column_semantics_list(obj));
        funcall(visitor_fn, obj, $SLOT, $PRIMARY_KEY_COLUMNS, t_semant_primary_key_columns(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN_CONSTRAINTS, t_semant_column_constraints(obj));
        funcall(visitor_fn, obj, $END, MAKE_TABLE_SEMANTICS, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_table_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_table_semantics(obj, visitor_fn);
    }

    public static SubLObject print_table_semantics(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject semantics = t_semant_semantics(v_object);
        final SubLObject access_path = (NIL != semantics) ? semant_access_path(semantics) : NIL;
        final SubLObject access_path_string = (NIL != access_path) ? access_path_pretty_string(access_path) : NIL;
        final SubLObject source_semantics = t_semant_source_semantics(v_object);
        final SubLObject source_access_path = (NIL != source_semantics) ? semant_access_path(source_semantics) : NIL;
        final SubLObject source_access_path_string = (NIL != source_access_path) ? access_path_pretty_string(source_access_path) : NIL;
        format(stream, $str102$_TABLE__a__s___a__a___ref__a_ref_, new SubLObject[]{ t_semant_table_id(v_object), t_semant_table_name(v_object), access_path_string, source_access_path_string, t_semant_points_to_table_ids(v_object), t_semant_pointed_to_by_table_ids(v_object), t_semant_column_constraints(v_object), t_semant_column_semantics_list(v_object) });
        return v_object;
    }

    public static SubLObject do_column_semantics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list104);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject column_semantics = NIL;
        SubLObject table_semantics = NIL;
        destructuring_bind_must_consp(current, datum, $list104);
        column_semantics = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list104);
        table_semantics = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(column_semantics, list(TABLE_SEMANTICS_COLUMN_SEMANTICS_LIST, table_semantics)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list104);
        return NIL;
    }

    public static SubLObject new_table_semantics(final SubLObject table_name, final SubLObject table_parses, final SubLObject column_semantics_list, final SubLObject primary_key_columns) {
        assert NIL != stringp(table_name) : "Types.stringp(table_name) " + "CommonSymbols.NIL != Types.stringp(table_name) " + table_name;
        assert NIL != list_utilities.non_dotted_list_p(column_semantics_list) : "list_utilities.non_dotted_list_p(column_semantics_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(column_semantics_list) " + column_semantics_list;
        SubLObject cdolist_list_var = column_semantics_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != column_semantics_p(elem) : "semantic_etl_bus.column_semantics_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next($semantic_etl_table_isg$.getGlobalValue());
        final SubLObject semantics = NIL;
        final SubLObject points_to_table_ids = NIL;
        final SubLObject pointed_to_by_table_ids = NIL;
        final SubLObject table_semantics = make_table_semantics(UNPROVIDED);
        _csetf_t_semant_table_id(table_semantics, id);
        _csetf_t_semant_table_name(table_semantics, table_name);
        _csetf_t_semant_semantics(table_semantics, semantics);
        _csetf_t_semant_pointed_to_by_table_ids(table_semantics, pointed_to_by_table_ids);
        _csetf_t_semant_points_to_table_ids(table_semantics, points_to_table_ids);
        _csetf_t_semant_table_parses(table_semantics, table_parses);
        _csetf_t_semant_column_semantics_list(table_semantics, column_semantics_list);
        _csetf_t_semant_primary_key_columns(table_semantics, primary_key_columns);
        SubLObject cdolist_list_var2 = column_semantics_list;
        SubLObject column_semantics = NIL;
        column_semantics = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            set_column_semantics_table_semantics(column_semantics, table_semantics);
            cdolist_list_var2 = cdolist_list_var2.rest();
            column_semantics = cdolist_list_var2.first();
        } 
        return table_semantics;
    }

    public static SubLObject copy_table_semantics_list(final SubLObject old_table_semantics_list) {
        SubLObject old_to_new_mappings = NIL;
        SubLObject new_list = NIL;
        SubLObject cdolist_list_var = old_table_semantics_list;
        SubLObject old_table_semantics = NIL;
        old_table_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject name = table_semantics_table_name(old_table_semantics);
            final SubLObject semantics = table_semantics_semantics(old_table_semantics);
            final SubLObject source_semantics = table_semantics_source_semantics(old_table_semantics);
            final SubLObject points_to_table_ids = table_semantics_points_to_table_ids(old_table_semantics);
            final SubLObject pointed_to_by_table_ids = table_semantics_pointed_to_by_table_ids(old_table_semantics);
            final SubLObject primary_key_columns = table_semantics_primary_key_columns(old_table_semantics);
            final SubLObject primary_key_column_names = Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, primary_key_columns);
            final SubLObject table_parses = copy_tree(table_semantics_table_parses(old_table_semantics));
            final SubLObject old_column_semantics = table_semantics_column_semantics_list(old_table_semantics);
            final SubLObject new_column_semantics = copy_column_semantics_list(old_column_semantics);
            final SubLObject new_primary_key_columns = get_columns_named(new_column_semantics, primary_key_column_names);
            final SubLObject new_table_semantics = new_table_semantics(name, table_parses, new_column_semantics, new_primary_key_columns);
            final SubLObject old_column_constraints = table_semantics_column_constraints(old_table_semantics);
            final SubLObject new_column_constraints = Mapping.mapcar(COPY_COLUMN_CONSTRAINT, old_column_constraints);
            _csetf_t_semant_source_semantics(new_table_semantics, source_semantics);
            old_to_new_mappings = cons(cons(table_semantics_table_id(old_table_semantics), table_semantics_table_id(new_table_semantics)), old_to_new_mappings);
            set_table_semantics_points_to_table_ids(new_table_semantics, points_to_table_ids);
            set_table_semantics_pointed_to_by_table_ids(new_table_semantics, pointed_to_by_table_ids);
            set_table_semantics_semantics(new_table_semantics, semantics);
            set_table_semantics_column_constraints(new_table_semantics, new_column_constraints);
            new_list = cons(new_table_semantics, new_list);
            cdolist_list_var = cdolist_list_var.rest();
            old_table_semantics = cdolist_list_var.first();
        } 
        cdolist_list_var = new_list;
        SubLObject table_semantics = NIL;
        table_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_table_semantics_pointed_to_by_table_ids(table_semantics, list_utilities.tree_substitute_by_association(table_semantics_pointed_to_by_table_ids(table_semantics), old_to_new_mappings, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            set_table_semantics_points_to_table_ids(table_semantics, list_utilities.tree_substitute_by_association(table_semantics_points_to_table_ids(table_semantics), old_to_new_mappings, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            update_table_semantics_column_constraints(table_semantics, new_list);
            cdolist_list_var = cdolist_list_var.rest();
            table_semantics = cdolist_list_var.first();
        } 
        return nreverse(new_list);
    }

    public static SubLObject get_columns_named(final SubLObject list_of_column_semantics, final SubLObject names) {
        SubLObject desired_columns = NIL;
        SubLObject cdolist_list_var = names;
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject desired_column = NIL;
            if (NIL == desired_column) {
                SubLObject csome_list_var = list_of_column_semantics;
                SubLObject column = NIL;
                column = csome_list_var.first();
                while ((NIL == desired_column) && (NIL != csome_list_var)) {
                    if (column_semantics_column_name(column).equal(name)) {
                        desired_column = column;
                    }
                    csome_list_var = csome_list_var.rest();
                    column = csome_list_var.first();
                } 
            }
            desired_columns = cons(desired_column, desired_columns);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return desired_columns;
    }

    public static SubLObject table_semantics_list_get_table_semantics_named(final SubLObject table_semantics_list, final SubLObject table_name) {
        SubLObject cdolist_list_var = table_semantics_list;
        SubLObject table_semantics = NIL;
        table_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (table_name.equal(table_semantics_table_name(table_semantics))) {
                return table_semantics;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_semantics = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject table_semantics_table_id(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_table_id(table_semantics);
    }

    public static SubLObject table_semantics_table_name(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_table_name(table_semantics);
    }

    public static SubLObject table_semantics_source_semantics(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_source_semantics(table_semantics);
    }

    public static SubLObject table_semantics_semantics(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_semantics(table_semantics);
    }

    public static SubLObject table_semantics_linked_table_ids(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return cconcatenate(table_semantics_points_to_table_ids(table_semantics), table_semantics_pointed_to_by_table_ids(table_semantics));
    }

    public static SubLObject table_semantics_points_to_table_ids(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_points_to_table_ids(table_semantics);
    }

    public static SubLObject table_semantics_pointed_to_by_table_ids(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_pointed_to_by_table_ids(table_semantics);
    }

    public static SubLObject table_semantics_pointed_to_by_tables(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        final SubLObject semantics = table_semantics_semantics(table_semantics);
        SubLObject tables = NIL;
        SubLObject cdolist_list_var = t_semant_pointed_to_by_table_ids(table_semantics);
        SubLObject id = NIL;
        id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tables = cons(semantics_get_table_with_id(semantics, id), tables);
            cdolist_list_var = cdolist_list_var.rest();
            id = cdolist_list_var.first();
        } 
        return tables;
    }

    public static SubLObject table_semantics_primary_key_columns(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_primary_key_columns(table_semantics);
    }

    public static SubLObject table_semantics_table_parses(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_table_parses(table_semantics);
    }

    public static SubLObject table_semantics_column_semantics_list(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_column_semantics_list(table_semantics);
    }

    public static SubLObject table_semantics_column_constraints(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return t_semant_column_constraints(table_semantics);
    }

    public static SubLObject set_table_semantics_semantics(final SubLObject table_semantics, final SubLObject semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        assert NIL != semantics_p(semantics) : "semantic_etl_bus.semantics_p(semantics) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics) " + semantics;
        _csetf_t_semant_semantics(table_semantics, semantics);
        return table_semantics;
    }

    public static SubLObject set_table_semantics_pointed_to_by_table_ids(final SubLObject table_semantics, final SubLObject table_ids) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        assert NIL != list_utilities.non_dotted_list_p(table_ids) : "list_utilities.non_dotted_list_p(table_ids) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(table_ids) " + table_ids;
        SubLObject cdolist_list_var = table_ids;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != integerp(elem) : "Types.integerp(elem) " + "CommonSymbols.NIL != Types.integerp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_t_semant_pointed_to_by_table_ids(table_semantics, table_ids);
        return table_semantics;
    }

    public static SubLObject set_table_semantics_points_to_table_ids(final SubLObject table_semantics, final SubLObject table_ids) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        assert NIL != list_utilities.non_dotted_list_p(table_ids) : "list_utilities.non_dotted_list_p(table_ids) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(table_ids) " + table_ids;
        SubLObject cdolist_list_var = table_ids;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != integerp(elem) : "Types.integerp(elem) " + "CommonSymbols.NIL != Types.integerp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_t_semant_points_to_table_ids(table_semantics, table_ids);
        return table_semantics;
    }

    public static SubLObject set_table_semantics_primary_key_columns(final SubLObject table_semantics, final SubLObject primary_key_columns) {
        assert NIL != list_utilities.non_dotted_list_p(table_semantics) : "list_utilities.non_dotted_list_p(table_semantics) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(table_semantics) " + table_semantics;
        SubLObject cdolist_list_var = table_semantics;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != table_semantics_p(elem) : "semantic_etl_bus.table_semantics_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(primary_key_columns) : "list_utilities.non_dotted_list_p(primary_key_columns) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(primary_key_columns) " + primary_key_columns;
        cdolist_list_var = primary_key_columns;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != column_semantics_p(elem) : "semantic_etl_bus.column_semantics_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_t_semant_primary_key_columns(table_semantics, primary_key_columns);
        return table_semantics;
    }

    public static SubLObject set_table_semantics_source_semantics(final SubLObject table_semantics, final SubLObject source_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        assert NIL != semantics_p(source_semantics) : "semantic_etl_bus.semantics_p(source_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(source_semantics) " + source_semantics;
        _csetf_t_semant_source_semantics(table_semantics, source_semantics);
        return table_semantics;
    }

    public static SubLObject set_table_semantics_column_constraints(final SubLObject table_semantics, final SubLObject constraints) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        assert NIL != listp(constraints) : "Types.listp(constraints) " + "CommonSymbols.NIL != Types.listp(constraints) " + constraints;
        _csetf_t_semant_column_constraints(table_semantics, constraints);
        return table_semantics;
    }

    public static SubLObject find_corresponding_item_in_semantics_table_semantics_method(final SubLObject table, final SubLObject semantics) {
        return semantics_get_table_named(semantics, table_semantics_table_name(table));
    }

    public static SubLObject semantic_object_comparison_name_table_semantics_method(final SubLObject table) {
        return table_semantics_table_name(table);
    }

    public static SubLObject table_semantics_append_to_semantic_recipe(final SubLObject table_semantics, final SubLObject step) {
        if (NIL != semant_output_spec(table_semantics_semantics(table_semantics))) {
            return output_spec_append_to_semantic_recipe(table_semantics_output_spec(table_semantics), step);
        }
        return NIL;
    }

    public static SubLObject table_semantics_output_spec(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return semant_output_spec(table_semantics_semantics(table_semantics));
    }

    public static SubLObject table_semantics_imported_key_columns(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return Mapping.mapcar(FOREIGN_KEY_CONSTRAINT_CONSTRAINED_COLUMN, table_semantics_foreign_key_constraints(table_semantics));
    }

    public static SubLObject table_semantics_foreign_key_constraints(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return values(list_utilities.remove_if_not(FOREIGN_KEY_CONSTRAINT_P, table_semantics_column_constraints(table_semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), semantics_dropped_foreign_key_constraints(table_semantics_semantics(table_semantics)));
    }

    public static SubLObject table_semantics_primary_key_constraints(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return values(list_utilities.remove_if_not(PRIMARY_KEY_CONSTRAINT_P, table_semantics_column_constraints(table_semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), semantics_dropped_primary_key_constraints(table_semantics_semantics(table_semantics)));
    }

    public static SubLObject table_semantics_column_count(final SubLObject table_semantics) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        return length(table_semantics_column_semantics_list(table_semantics));
    }

    public static SubLObject table_semantics_get_column_named(final SubLObject table_semantics, final SubLObject name) {
        SubLObject cdolist_list_var = table_semantics_column_semantics_list(table_semantics);
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (name.equalp(column_semantics_column_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        cdolist_list_var = semantics_dropped_columns(table_semantics_semantics(table_semantics));
        table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (name.equalp(column_semantics_column_name(table))) {
                return table;
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject table_semantics_content_columns(final SubLObject table_semantics) {
        return list_utilities.remove_if_not($sym114$CONTENT_COLUMN_, table_semantics_column_semantics_list(table_semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject content_columnP(final SubLObject column_semantics) {
        if (NIL != list_utilities.lengthE(table_semantics_column_semantics_list(column_semantics_table_semantics(column_semantics)), ONE_INTEGER, UNPROVIDED)) {
            return T;
        }
        return makeBoolean((NIL == imported_key_columnP(column_semantics)) && (NIL == primary_key_columnP(column_semantics)));
    }

    public static SubLObject imported_key_columnP(final SubLObject column_semantics) {
        final SubLObject table_semantics = column_semantics_table_semantics(column_semantics);
        return subl_promotions.memberP(column_semantics, table_semantics_imported_key_columns(table_semantics), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject primary_key_columnP(final SubLObject column_semantics) {
        final SubLObject table_semantics = column_semantics_table_semantics(column_semantics);
        return subl_promotions.memberP(column_semantics, table_semantics_primary_key_columns(table_semantics), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject table_semantics_add_column_constraint(final SubLObject table_semantics, final SubLObject constraint) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        assert NIL != column_constraint_p(constraint) : "semantic_etl_bus.column_constraint_p(constraint) " + "CommonSymbols.NIL != semantic_etl_bus.column_constraint_p(constraint) " + constraint;
        set_table_semantics_column_constraints(table_semantics, cons(constraint, t_semant_column_constraints(table_semantics)));
        if (NIL != foreign_key_constraint_p(constraint)) {
            final SubLObject constraining_table = foreign_key_constraint_constraining_table(constraint);
            final SubLObject constraining_table_id = table_semantics_table_id(constraining_table);
            SubLObject item_var;
            final SubLObject table_id = item_var = table_semantics_table_id(table_semantics);
            if (NIL == member(item_var, t_semant_pointed_to_by_table_ids(constraining_table), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_t_semant_pointed_to_by_table_ids(constraining_table, cons(item_var, t_semant_pointed_to_by_table_ids(constraining_table)));
            }
            item_var = constraining_table_id;
            if (NIL == member(item_var, t_semant_points_to_table_ids(table_semantics), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_t_semant_points_to_table_ids(table_semantics, cons(item_var, t_semant_points_to_table_ids(table_semantics)));
            }
        }
        table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_add(constraint));
        return table_semantics;
    }

    public static SubLObject table_semantics_remove_column_constraint(final SubLObject table_semantics, final SubLObject constraint) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        assert NIL != column_constraint_p(constraint) : "semantic_etl_bus.column_constraint_p(constraint) " + "CommonSymbols.NIL != semantic_etl_bus.column_constraint_p(constraint) " + constraint;
        set_table_semantics_column_constraints(table_semantics, remove(constraint, table_semantics_column_constraints(table_semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        semantics_add_dropped(table_semantics_semantics(table_semantics), constraint);
        table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_drop(constraint));
        return table_semantics;
    }

    public static SubLObject update_table_semantics_column_constraints(final SubLObject table_semantics, final SubLObject new_table_semantics_list) {
        SubLObject cdolist_list_var = table_semantics_column_constraints(table_semantics);
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != foreign_key_constraint_p(constraint)) {
                final SubLObject old_constrained_column = foreign_key_constraint_constrained_column(constraint);
                final SubLObject old_constrained_table = column_semantics_table_semantics(old_constrained_column);
                final SubLObject old_constraining_column = foreign_key_constraint_constraining_column(constraint);
                final SubLObject old_constraining_table = foreign_key_constraint_constraining_table(constraint);
                final SubLObject new_constrained_table = table_semantics_list_get_table_semantics_named(new_table_semantics_list, table_semantics_table_name(old_constrained_table));
                final SubLObject new_constrained_column = table_semantics_get_column_named(new_constrained_table, column_semantics_column_name(old_constrained_column));
                final SubLObject new_constraining_table = (NIL != old_constraining_table) ? table_semantics_list_get_table_semantics_named(new_table_semantics_list, table_semantics_table_name(old_constraining_table)) : NIL;
                final SubLObject new_constraining_column = (NIL != old_constraining_column) ? table_semantics_get_column_named(new_constraining_table, column_semantics_column_name(old_constraining_column)) : NIL;
                set_foreign_key_constraint_constrained_column(constraint, new_constrained_column);
                set_foreign_key_constraint_constraining_column(constraint, new_constraining_column);
                set_foreign_key_constraint_constraining_table(constraint, new_constraining_table);
            } else
                if (NIL != primary_key_constraint_p(constraint)) {
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

    public static SubLObject table_semantics_delete_column(final SubLObject table_semantics, final SubLObject column_semantics) {
        if (NIL != table_semantics_pointed_to_by_table_ids(table_semantics)) {
            final SubLObject dict = table_id_to_table_semantics_dict(table_semantics_semantics(table_semantics));
            SubLObject cdolist_list_var = table_semantics_pointed_to_by_table_ids(table_semantics);
            SubLObject referencing_table_id = NIL;
            referencing_table_id = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject referencing_table = dictionary.dictionary_lookup(dict, referencing_table_id, UNPROVIDED);
                SubLObject cdolist_list_var_$2 = table_semantics_column_constraints(referencing_table);
                SubLObject constraint = NIL;
                constraint = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    if (NIL != foreign_key_constraint_references_columnP(constraint, column_semantics)) {
                        Errors.error($str116$Column__S_is_pointed_to_by__A_and, column_semantics, referencing_table);
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    constraint = cdolist_list_var_$2.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                referencing_table_id = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var2 = table_semantics_column_constraints(table_semantics);
        SubLObject constraint2 = NIL;
        constraint2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if ((NIL != foreign_key_constraint_p(constraint2)) && foreign_key_constraint_constrained_column(constraint2).eql(column_semantics)) {
                table_semantics_remove_column_constraint(table_semantics, constraint2);
                final SubLObject pointed_to_table = foreign_key_constraint_constraining_table(constraint2);
                final SubLObject table_id = table_semantics_table_id(table_semantics);
                set_table_semantics_pointed_to_by_table_ids(pointed_to_table, remove(table_id, table_semantics_pointed_to_by_table_ids(pointed_to_table), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else
                if ((NIL != primary_key_constraint_p(constraint2)) && primary_key_constraint_constrained_column(constraint2).eql(column_semantics)) {
                    table_semantics_remove_column_constraint(table_semantics, constraint2);
                }

            cdolist_list_var2 = cdolist_list_var2.rest();
            constraint2 = cdolist_list_var2.first();
        } 
        _csetf_t_semant_column_semantics_list(table_semantics, remove(column_semantics, table_semantics_column_semantics_list(table_semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        semantics_add_dropped(table_semantics_semantics(table_semantics), column_semantics);
        table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_drop(column_semantics));
        return table_semantics;
    }

    public static SubLObject table_semantics_delete_foreign_references_to_column(final SubLObject table_semantics, final SubLObject unwanted_column_semantics) {
        final SubLObject pointed_to_by_table_ids = table_semantics_pointed_to_by_table_ids(table_semantics);
        final SubLObject dict = table_id_to_table_semantics_dict(table_semantics_semantics(table_semantics));
        SubLObject removed_constraints = NIL;
        SubLObject cdolist_list_var = pointed_to_by_table_ids;
        SubLObject table_id = NIL;
        table_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject other_table = dictionary.dictionary_lookup(dict, table_id, UNPROVIDED);
            SubLObject cdolist_list_var_$3 = table_semantics_column_constraints(other_table);
            SubLObject constraint = NIL;
            constraint = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                if (NIL != foreign_key_constraint_references_columnP(constraint, unwanted_column_semantics)) {
                    table_semantics_remove_column_constraint(other_table, constraint);
                    removed_constraints = cons(constraint, removed_constraints);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                constraint = cdolist_list_var_$3.first();
            } 
            if (NIL == foreign_key_constraints_reference_columns_other_than_in_table(removed_constraints, unwanted_column_semantics, table_semantics)) {
                set_table_semantics_pointed_to_by_table_ids(table_semantics, remove(table_id, table_semantics_pointed_to_by_table_ids(table_semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_id = cdolist_list_var.first();
        } 
        cdolist_list_var = removed_constraints;
        SubLObject constraint2 = NIL;
        constraint2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semantics_add_dropped(table_semantics_semantics(table_semantics), constraint2);
            table_semantics_append_to_semantic_recipe(table_semantics, new_semantic_recipe_drop(constraint2));
            cdolist_list_var = cdolist_list_var.rest();
            constraint2 = cdolist_list_var.first();
        } 
        return removed_constraints;
    }

    public static SubLObject table_semantics_delete_column_constraint(final SubLObject table_semantics, final SubLObject constraint) {
        if (NIL != primary_key_constraint_p(constraint)) {
            table_semantics_remove_column_constraint(table_semantics, constraint);
        } else
            if (NIL != foreign_key_constraint_p(constraint)) {
                final SubLObject constraining_table = foreign_key_constraint_constraining_table(constraint);
                final SubLObject constraining_table_id = table_semantics_table_id(constraining_table);
                final SubLObject table_id = table_semantics_table_id(table_semantics);
                if (NIL == other_foreign_key_constraints_reference_table(constraint, constraining_table)) {
                    set_table_semantics_pointed_to_by_table_ids(constraining_table, remove(table_id, table_semantics_pointed_to_by_table_ids(constraining_table), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    set_table_semantics_points_to_table_ids(table_semantics, remove(constraining_table_id, table_semantics_points_to_table_ids(table_semantics), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
                table_semantics_remove_column_constraint(table_semantics, constraint);
            } else {
                Errors.warn($str117$don_t_know_how_to_remove_constrai, constraint, table_semantics);
            }

        return table_semantics;
    }

    public static SubLObject other_foreign_key_constraints_reference_table(final SubLObject constraint, final SubLObject table) {
        final SubLObject referenced_table = foreign_key_constraint_constrained_table(constraint);
        SubLObject cdolist_list_var = table_semantics_foreign_key_constraints(table);
        SubLObject test_constraint = NIL;
        test_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!foreign_key_constraint_constrained_table(test_constraint).equal(referenced_table)) {
                return test_constraint;
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_constraint = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject table_name_to_id_dict(final SubLObject semantics) {
        assert NIL != semantics_p(semantics) : "semantic_etl_bus.semantics_p(semantics) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics) " + semantics;
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
        SubLObject cdolist_list_var = semantics_table_semantics_list(semantics);
        SubLObject table_semantics = NIL;
        table_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject table_name = table_semantics_table_name(table_semantics);
            final SubLObject table_id = table_semantics_table_id(table_semantics);
            dictionary.dictionary_enter(dict, table_name, table_id);
            cdolist_list_var = cdolist_list_var.rest();
            table_semantics = cdolist_list_var.first();
        } 
        return dict;
    }

    public static SubLObject table_id_to_table_semantics_dict(final SubLObject semantics) {
        final SubLObject dict = dictionary.new_dictionary(EQL, UNPROVIDED);
        SubLObject cdolist_list_var = semantics_table_semantics_list(semantics);
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary.dictionary_enter(dict, table_semantics_table_id(table), table);
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        return dict;
    }

    public static SubLObject column_constraint_p(final SubLObject obj) {
        return makeBoolean((NIL != foreign_key_constraint_p(obj)) || (NIL != primary_key_constraint_p(obj)));
    }

    public static SubLObject copy_column_constraint(final SubLObject constraint) {
        if (NIL != foreign_key_constraint_p(constraint)) {
            return copy_foreign_key_constraint(constraint);
        }
        if (NIL != primary_key_constraint_p(constraint)) {
            return copy_primary_key_constraint(constraint);
        }
        Errors.warn($str118$Don_t_know_how_to_copy_constraint, constraint);
        return NIL;
    }

    public static SubLObject foreign_key_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_foreign_key_constraint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject foreign_key_constraint_p(final SubLObject v_object) {
        return v_object.getClass() == $foreign_key_constraint_native.class ? T : NIL;
    }

    public static SubLObject fk_constraint_constraint_name(final SubLObject v_object) {
        assert NIL != foreign_key_constraint_p(v_object) : "semantic_etl_bus.foreign_key_constraint_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject fk_constraint_constrained_column(final SubLObject v_object) {
        assert NIL != foreign_key_constraint_p(v_object) : "semantic_etl_bus.foreign_key_constraint_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject fk_constraint_constraining_table(final SubLObject v_object) {
        assert NIL != foreign_key_constraint_p(v_object) : "semantic_etl_bus.foreign_key_constraint_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject fk_constraint_constraining_column(final SubLObject v_object) {
        assert NIL != foreign_key_constraint_p(v_object) : "semantic_etl_bus.foreign_key_constraint_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_fk_constraint_constraint_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != foreign_key_constraint_p(v_object) : "semantic_etl_bus.foreign_key_constraint_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fk_constraint_constrained_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != foreign_key_constraint_p(v_object) : "semantic_etl_bus.foreign_key_constraint_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fk_constraint_constraining_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != foreign_key_constraint_p(v_object) : "semantic_etl_bus.foreign_key_constraint_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fk_constraint_constraining_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != foreign_key_constraint_p(v_object) : "semantic_etl_bus.foreign_key_constraint_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_foreign_key_constraint(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $foreign_key_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONSTRAINT_NAME)) {
                _csetf_fk_constraint_constraint_name(v_new, current_value);
            } else
                if (pcase_var.eql($CONSTRAINED_COLUMN)) {
                    _csetf_fk_constraint_constrained_column(v_new, current_value);
                } else
                    if (pcase_var.eql($CONSTRAINING_TABLE)) {
                        _csetf_fk_constraint_constraining_table(v_new, current_value);
                    } else
                        if (pcase_var.eql($CONSTRAINING_COLUMN)) {
                            _csetf_fk_constraint_constraining_column(v_new, current_value);
                        } else {
                            Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_foreign_key_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FOREIGN_KEY_CONSTRAINT, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT_NAME, fk_constraint_constraint_name(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINED_COLUMN, fk_constraint_constrained_column(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINING_TABLE, fk_constraint_constraining_table(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINING_COLUMN, fk_constraint_constraining_column(obj));
        funcall(visitor_fn, obj, $END, MAKE_FOREIGN_KEY_CONSTRAINT, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_foreign_key_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_foreign_key_constraint(obj, visitor_fn);
    }

    public static SubLObject print_foreign_key_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str141$_FK_CONSTRAINT___a_____A__A__, new SubLObject[]{ column_semantics_column_name(fk_constraint_constrained_column(v_object)), table_semantics_table_name(fk_constraint_constraining_table(v_object)), column_semantics_column_name(fk_constraint_constraining_column(v_object)) });
        return v_object;
    }

    public static SubLObject new_foreign_key_constraint(final SubLObject constraint_name, final SubLObject constrained_column, final SubLObject constraining_column) {
        assert NIL != stringp(constraint_name) : "Types.stringp(constraint_name) " + "CommonSymbols.NIL != Types.stringp(constraint_name) " + constraint_name;
        assert NIL != column_semantics_p(constrained_column) : "semantic_etl_bus.column_semantics_p(constrained_column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(constrained_column) " + constrained_column;
        assert NIL != column_semantics_p(constraining_column) : "semantic_etl_bus.column_semantics_p(constraining_column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(constraining_column) " + constraining_column;
        final SubLObject foreign_key_constraint = make_foreign_key_constraint(UNPROVIDED);
        final SubLObject constraining_table = c_semant_table_semantics(constraining_column);
        _csetf_fk_constraint_constraint_name(foreign_key_constraint, constraint_name);
        _csetf_fk_constraint_constrained_column(foreign_key_constraint, constrained_column);
        _csetf_fk_constraint_constraining_table(foreign_key_constraint, constraining_table);
        _csetf_fk_constraint_constraining_column(foreign_key_constraint, constraining_column);
        return foreign_key_constraint;
    }

    public static SubLObject copy_foreign_key_constraint(final SubLObject foreign_key_constraint) {
        final SubLObject constraint_name = foreign_key_constraint_constraint_name(foreign_key_constraint);
        final SubLObject constrained_column = foreign_key_constraint_constrained_column(foreign_key_constraint);
        final SubLObject constraining_column = foreign_key_constraint_constraining_column(foreign_key_constraint);
        final SubLObject new_constraint = new_foreign_key_constraint(constraint_name, constrained_column, constraining_column);
        return new_constraint;
    }

    public static SubLObject foreign_key_constraint_constraint_name(final SubLObject foreign_key_constraint) {
        assert NIL != foreign_key_constraint_p(foreign_key_constraint) : "semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + foreign_key_constraint;
        return fk_constraint_constraint_name(foreign_key_constraint);
    }

    public static SubLObject foreign_key_constraint_constrained_column(final SubLObject foreign_key_constraint) {
        assert NIL != foreign_key_constraint_p(foreign_key_constraint) : "semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + foreign_key_constraint;
        return fk_constraint_constrained_column(foreign_key_constraint);
    }

    public static SubLObject foreign_key_constraint_constraining_column(final SubLObject foreign_key_constraint) {
        assert NIL != foreign_key_constraint_p(foreign_key_constraint) : "semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + foreign_key_constraint;
        return fk_constraint_constraining_column(foreign_key_constraint);
    }

    public static SubLObject foreign_key_constraint_constraining_table(final SubLObject foreign_key_constraint) {
        assert NIL != foreign_key_constraint_p(foreign_key_constraint) : "semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + foreign_key_constraint;
        return fk_constraint_constraining_table(foreign_key_constraint);
    }

    public static SubLObject set_foreign_key_constraint_constraint_name(final SubLObject foreign_key_constraint, final SubLObject name) {
        assert NIL != foreign_key_constraint_p(foreign_key_constraint) : "semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + foreign_key_constraint;
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        _csetf_fk_constraint_constraint_name(foreign_key_constraint, name);
        return foreign_key_constraint;
    }

    public static SubLObject set_foreign_key_constraint_constrained_column(final SubLObject foreign_key_constraint, final SubLObject constrained_column) {
        assert NIL != foreign_key_constraint_p(foreign_key_constraint) : "semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + foreign_key_constraint;
        assert NIL != column_semantics_p(constrained_column) : "semantic_etl_bus.column_semantics_p(constrained_column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(constrained_column) " + constrained_column;
        _csetf_fk_constraint_constrained_column(foreign_key_constraint, constrained_column);
        return foreign_key_constraint;
    }

    public static SubLObject set_foreign_key_constraint_constraining_column(final SubLObject foreign_key_constraint, final SubLObject constraining_column) {
        assert NIL != foreign_key_constraint_p(foreign_key_constraint) : "semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + foreign_key_constraint;
        assert NIL != column_semantics_p(constraining_column) : "semantic_etl_bus.column_semantics_p(constraining_column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(constraining_column) " + constraining_column;
        _csetf_fk_constraint_constraining_column(foreign_key_constraint, constraining_column);
        return foreign_key_constraint;
    }

    public static SubLObject set_foreign_key_constraint_constraining_table(final SubLObject foreign_key_constraint, final SubLObject constraining_table) {
        assert NIL != foreign_key_constraint_p(foreign_key_constraint) : "semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(foreign_key_constraint) " + foreign_key_constraint;
        assert NIL != table_semantics_p(constraining_table) : "semantic_etl_bus.table_semantics_p(constraining_table) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(constraining_table) " + constraining_table;
        _csetf_fk_constraint_constraining_table(foreign_key_constraint, constraining_table);
        return foreign_key_constraint;
    }

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
        SubLObject cdolist_list_var = cconcatenate(active_constraints, dropped_constraints);
        SubLObject new_constraint = NIL;
        new_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (column_semantics_column_name(foreign_key_constraint_constraining_column(new_constraint)).equal(constraining_column_name) && column_semantics_column_name(foreign_key_constraint_constrained_column(new_constraint)).equal(constrained_column_name)) {
                return constraint;
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_constraint = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject semantic_object_comparison_name_foreign_key_constraint_method(final SubLObject constraint) {
        return cconcatenate(format_nil.format_nil_a_no_copy(foreign_key_constraint_constrained_table_name(constraint)), new SubLObject[]{ $str143$_, format_nil.format_nil_a_no_copy(foreign_key_constraint_constrained_column_name(constraint)), $str144$__, format_nil.format_nil_a_no_copy(foreign_key_constraint_constraining_table_name(constraint)), $str143$_, format_nil.format_nil_a_no_copy(foreign_key_constraint_constraining_column_name(constraint)) });
    }

    public static SubLObject foreign_key_constraint_constrained_table(final SubLObject constraint) {
        assert NIL != foreign_key_constraint_p(constraint) : "semantic_etl_bus.foreign_key_constraint_p(constraint) " + "CommonSymbols.NIL != semantic_etl_bus.foreign_key_constraint_p(constraint) " + constraint;
        return column_semantics_table_semantics(foreign_key_constraint_constrained_column(constraint));
    }

    public static SubLObject foreign_key_constraint_references_tableP(final SubLObject constraint, final SubLObject table) {
        return makeBoolean((NIL != foreign_key_constraint_p(constraint)) && foreign_key_constraint_constraining_table(constraint).eql(table));
    }

    public static SubLObject foreign_key_constraint_references_columnP(final SubLObject constraint, final SubLObject column) {
        return makeBoolean((NIL != foreign_key_constraint_p(constraint)) && foreign_key_constraint_constraining_column(constraint).eql(column));
    }

    public static SubLObject foreign_key_constraints_reference_columns_other_than_in_table(final SubLObject constraints, final SubLObject column_semantics, final SubLObject table_semantics) {
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (foreign_key_constraint_constrained_table(constraint).eql(table_semantics) && (!foreign_key_constraint_constraining_column(constraint).eql(column_semantics))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject foreign_key_constraint_constrained_column_name(final SubLObject constraint) {
        return column_semantics_column_name(foreign_key_constraint_constrained_column(constraint));
    }

    public static SubLObject foreign_key_constraint_constrained_table_name(final SubLObject constraint) {
        return table_semantics_table_name(foreign_key_constraint_constrained_table(constraint));
    }

    public static SubLObject foreign_key_constraint_constraining_column_name(final SubLObject constraint) {
        return column_semantics_column_name(foreign_key_constraint_constraining_column(constraint));
    }

    public static SubLObject foreign_key_constraint_constraining_table_name(final SubLObject constraint) {
        return table_semantics_table_name(foreign_key_constraint_constraining_table(constraint));
    }

    public static SubLObject primary_key_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_primary_key_constraint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject primary_key_constraint_p(final SubLObject v_object) {
        return v_object.getClass() == $primary_key_constraint_native.class ? T : NIL;
    }

    public static SubLObject pk_constraint_constraint_name(final SubLObject v_object) {
        assert NIL != primary_key_constraint_p(v_object) : "semantic_etl_bus.primary_key_constraint_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject pk_constraint_constraint_type(final SubLObject v_object) {
        assert NIL != primary_key_constraint_p(v_object) : "semantic_etl_bus.primary_key_constraint_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject pk_constraint_constrained_column(final SubLObject v_object) {
        assert NIL != primary_key_constraint_p(v_object) : "semantic_etl_bus.primary_key_constraint_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_pk_constraint_constraint_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != primary_key_constraint_p(v_object) : "semantic_etl_bus.primary_key_constraint_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pk_constraint_constraint_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != primary_key_constraint_p(v_object) : "semantic_etl_bus.primary_key_constraint_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pk_constraint_constrained_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != primary_key_constraint_p(v_object) : "semantic_etl_bus.primary_key_constraint_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_primary_key_constraint(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $primary_key_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONSTRAINT_NAME)) {
                _csetf_pk_constraint_constraint_name(v_new, current_value);
            } else
                if (pcase_var.eql($CONSTRAINT_TYPE)) {
                    _csetf_pk_constraint_constraint_type(v_new, current_value);
                } else
                    if (pcase_var.eql($CONSTRAINED_COLUMN)) {
                        _csetf_pk_constraint_constrained_column(v_new, current_value);
                    } else {
                        Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_primary_key_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PRIMARY_KEY_CONSTRAINT, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT_NAME, pk_constraint_constraint_name(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT_TYPE, pk_constraint_constraint_type(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINED_COLUMN, pk_constraint_constrained_column(obj));
        funcall(visitor_fn, obj, $END, MAKE_PRIMARY_KEY_CONSTRAINT, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_primary_key_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_primary_key_constraint(obj, visitor_fn);
    }

    public static SubLObject print_primary_key_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str163$_PK_CONSTRAINT___a_, column_semantics_column_name(pk_constraint_constrained_column(v_object)));
        return v_object;
    }

    public static SubLObject new_primary_key_constraint(final SubLObject constraint_name, final SubLObject constrained_column) {
        assert NIL != stringp(constraint_name) : "Types.stringp(constraint_name) " + "CommonSymbols.NIL != Types.stringp(constraint_name) " + constraint_name;
        assert NIL != column_semantics_p(constrained_column) : "semantic_etl_bus.column_semantics_p(constrained_column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(constrained_column) " + constrained_column;
        final SubLObject primary_key_constraint = make_primary_key_constraint(UNPROVIDED);
        _csetf_pk_constraint_constraint_name(primary_key_constraint, constraint_name);
        _csetf_pk_constraint_constrained_column(primary_key_constraint, constrained_column);
        return primary_key_constraint;
    }

    public static SubLObject copy_primary_key_constraint(final SubLObject primary_key_constraint) {
        final SubLObject constraint_name = primary_key_constraint_constraint_name(primary_key_constraint);
        final SubLObject constrained_column = primary_key_constraint_constrained_column(primary_key_constraint);
        final SubLObject new_constraint = new_primary_key_constraint(constraint_name, constrained_column);
        return new_constraint;
    }

    public static SubLObject primary_key_constraint_constraint_name(final SubLObject primary_key_constraint) {
        assert NIL != primary_key_constraint_p(primary_key_constraint) : "semantic_etl_bus.primary_key_constraint_p(primary_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.primary_key_constraint_p(primary_key_constraint) " + primary_key_constraint;
        return pk_constraint_constraint_name(primary_key_constraint);
    }

    public static SubLObject primary_key_constraint_constrained_column(final SubLObject primary_key_constraint) {
        assert NIL != primary_key_constraint_p(primary_key_constraint) : "semantic_etl_bus.primary_key_constraint_p(primary_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.primary_key_constraint_p(primary_key_constraint) " + primary_key_constraint;
        return pk_constraint_constrained_column(primary_key_constraint);
    }

    public static SubLObject set_primary_key_constraint_constraint_name(final SubLObject primary_key_constraint, final SubLObject name) {
        assert NIL != primary_key_constraint_p(primary_key_constraint) : "semantic_etl_bus.primary_key_constraint_p(primary_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.primary_key_constraint_p(primary_key_constraint) " + primary_key_constraint;
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        _csetf_pk_constraint_constraint_name(primary_key_constraint, name);
        return primary_key_constraint;
    }

    public static SubLObject set_primary_key_constraint_constrained_column(final SubLObject primary_key_constraint, final SubLObject constrained_column) {
        assert NIL != primary_key_constraint_p(primary_key_constraint) : "semantic_etl_bus.primary_key_constraint_p(primary_key_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.primary_key_constraint_p(primary_key_constraint) " + primary_key_constraint;
        assert NIL != column_semantics_p(constrained_column) : "semantic_etl_bus.column_semantics_p(constrained_column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(constrained_column) " + constrained_column;
        _csetf_pk_constraint_constrained_column(primary_key_constraint, constrained_column);
        return primary_key_constraint;
    }

    public static SubLObject find_corresponding_item_in_semantics_primary_key_constraint_method(final SubLObject constraint, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject corresponding_column = find_corresponding_item_in_semantics(primary_key_constraint_constrained_column(constraint), semantics);
        final SubLObject corresponding_table = column_semantics_table_semantics(corresponding_column);
        thread.resetMultipleValues();
        final SubLObject good_constraints = table_semantics_primary_key_constraints(corresponding_table);
        final SubLObject dropped_constraints = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = list(good_constraints, dropped_constraints);
        SubLObject constraint_list = NIL;
        constraint_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = constraint_list;
            SubLObject pk_constraint = NIL;
            pk_constraint = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                if (column_semantics_column_name(corresponding_column).equalp(column_semantics_column_name(primary_key_constraint_constrained_column(pk_constraint)))) {
                    return pk_constraint;
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                pk_constraint = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            constraint_list = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject semantic_object_comparison_name_primary_key_constraint_method(final SubLObject constraint) {
        return cconcatenate($$$pk_, new SubLObject[]{ format_nil.format_nil_a_no_copy(primary_key_constraint_constrained_table_name(constraint)), $str143$_, format_nil.format_nil_a_no_copy(primary_key_constraint_constrained_column_name(constraint)) });
    }

    public static SubLObject primary_key_constraint_constrained_table(final SubLObject constraint) {
        assert NIL != primary_key_constraint_p(constraint) : "semantic_etl_bus.primary_key_constraint_p(constraint) " + "CommonSymbols.NIL != semantic_etl_bus.primary_key_constraint_p(constraint) " + constraint;
        return column_semantics_table_semantics(primary_key_constraint_constrained_column(constraint));
    }

    public static SubLObject primary_key_constraint_constrained_table_name(final SubLObject constraint) {
        return table_semantics_table_name(primary_key_constraint_constrained_table(constraint));
    }

    public static SubLObject primary_key_constraint_constrained_column_name(final SubLObject constraint) {
        return column_semantics_column_name(primary_key_constraint_constrained_column(constraint));
    }

    public static SubLObject column_semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_column_semantics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject column_semantics_p(final SubLObject v_object) {
        return v_object.getClass() == $column_semantics_native.class ? T : NIL;
    }

    public static SubLObject c_semant_column_name(final SubLObject v_object) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject c_semant_column_parses(final SubLObject v_object) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject c_semant_table_semantics(final SubLObject v_object) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject c_semant_value_semantics_list(final SubLObject v_object) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject c_semant_column_type(final SubLObject v_object) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject c_semant_column_size(final SubLObject v_object) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_c_semant_column_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_c_semant_column_parses(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_c_semant_table_semantics(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_c_semant_value_semantics_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_c_semant_column_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_c_semant_column_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_semantics_p(v_object) : "semantic_etl_bus.column_semantics_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_column_semantics(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $column_semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($COLUMN_NAME)) {
                _csetf_c_semant_column_name(v_new, current_value);
            } else
                if (pcase_var.eql($COLUMN_PARSES)) {
                    _csetf_c_semant_column_parses(v_new, current_value);
                } else
                    if (pcase_var.eql($TABLE_SEMANTICS)) {
                        _csetf_c_semant_table_semantics(v_new, current_value);
                    } else
                        if (pcase_var.eql($VALUE_SEMANTICS_LIST)) {
                            _csetf_c_semant_value_semantics_list(v_new, current_value);
                        } else
                            if (pcase_var.eql($COLUMN_TYPE)) {
                                _csetf_c_semant_column_type(v_new, current_value);
                            } else
                                if (pcase_var.eql($COLUMN_SIZE)) {
                                    _csetf_c_semant_column_size(v_new, current_value);
                                } else {
                                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_column_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_COLUMN_SEMANTICS, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $COLUMN_NAME, c_semant_column_name(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN_PARSES, c_semant_column_parses(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE_SEMANTICS, c_semant_table_semantics(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUE_SEMANTICS_LIST, c_semant_value_semantics_list(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN_TYPE, c_semant_column_type(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN_SIZE, c_semant_column_size(obj));
        funcall(visitor_fn, obj, $END, MAKE_COLUMN_SEMANTICS, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_column_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_column_semantics(obj, visitor_fn);
    }

    public static SubLObject print_column_semantics(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str195$_COLUMN___a__a__A__A__, new SubLObject[]{ NIL != c_semant_table_semantics(v_object) ? t_semant_table_name(c_semant_table_semantics(v_object)) : $UNK, c_semant_column_name(v_object), c_semant_column_type(v_object), c_semant_column_size(v_object) });
        return v_object;
    }

    public static SubLObject do_value_semantics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list197);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value_semantics = NIL;
        SubLObject column_semantics = NIL;
        destructuring_bind_must_consp(current, datum, $list197);
        value_semantics = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list197);
        column_semantics = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(value_semantics, list(COLUMN_SEMANTICS_VALUE_SEMANTICS_LIST, column_semantics)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list197);
        return NIL;
    }

    public static SubLObject new_column_semantics(final SubLObject column_name, final SubLObject column_parses, SubLObject column_type, SubLObject column_size) {
        if (column_type == UNPROVIDED) {
            column_type = $str199$;
        }
        if (column_size == UNPROVIDED) {
            column_size = NIL;
        }
        assert NIL != stringp(column_name) : "Types.stringp(column_name) " + "CommonSymbols.NIL != Types.stringp(column_name) " + column_name;
        assert NIL != stringp(column_type) : "Types.stringp(column_type) " + "CommonSymbols.NIL != Types.stringp(column_type) " + column_type;
        final SubLObject table_semantics = NIL;
        final SubLObject value_semantics_list = NIL;
        final SubLObject column_semantics = make_column_semantics(UNPROVIDED);
        _csetf_c_semant_column_name(column_semantics, column_name);
        _csetf_c_semant_column_parses(column_semantics, column_parses);
        _csetf_c_semant_column_type(column_semantics, column_type);
        _csetf_c_semant_column_size(column_semantics, column_size);
        _csetf_c_semant_table_semantics(column_semantics, table_semantics);
        _csetf_c_semant_value_semantics_list(column_semantics, value_semantics_list);
        return column_semantics;
    }

    public static SubLObject new_column_semantics_list(final SubLObject column_names) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = column_names;
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject column_parses = metadata_parser.semantic_etl_parse_column_name(name, UNPROVIDED);
            result = cons(new_column_semantics(name, column_parses, UNPROVIDED, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject copy_column_semantics(final SubLObject column_semantics) {
        final SubLObject column_name = column_semantics_column_name(column_semantics);
        final SubLObject column_parses = copy_list(column_semantics_column_parses(column_semantics));
        final SubLObject column_type = column_semantics_column_type(column_semantics);
        final SubLObject column_size = column_semantics_column_size(column_semantics);
        final SubLObject value_semantics_list = copy_list(column_semantics_value_semantics_list(column_semantics));
        final SubLObject new_column = new_column_semantics(column_name, column_parses, column_type, column_size);
        _csetf_c_semant_value_semantics_list(new_column, value_semantics_list);
        return new_column;
    }

    public static SubLObject copy_column_semantics_list(final SubLObject column_semantics_list) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = column_semantics_list;
        SubLObject column_semantics = NIL;
        column_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(copy_column_semantics(column_semantics), result);
            cdolist_list_var = cdolist_list_var.rest();
            column_semantics = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject column_semantics_column_name(final SubLObject column_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        return c_semant_column_name(column_semantics);
    }

    public static SubLObject column_semantics_column_parses(final SubLObject column_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        return c_semant_column_parses(column_semantics);
    }

    public static SubLObject column_semantics_column_type(final SubLObject column_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        return c_semant_column_type(column_semantics);
    }

    public static SubLObject column_semantics_expanded_column_type(final SubLObject column_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        return cconcatenate(c_semant_column_type(column_semantics), new SubLObject[]{ $str200$_, princ_to_string(c_semant_column_size(column_semantics)), $str201$_ });
    }

    public static SubLObject column_semantics_column_size(final SubLObject column_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        return c_semant_column_size(column_semantics);
    }

    public static SubLObject column_semantics_table_semantics(final SubLObject column_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        return c_semant_table_semantics(column_semantics);
    }

    public static SubLObject column_semantics_value_semantics_list(final SubLObject column_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        return c_semant_value_semantics_list(column_semantics);
    }

    public static SubLObject column_semantics_referencing_foreign_key_constraints(final SubLObject column_semantics) {
        final SubLObject table = column_semantics_table_semantics(column_semantics);
        final SubLObject fk_tables = table_semantics_pointed_to_by_tables(table);
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var = fk_tables;
        SubLObject fk_table = NIL;
        fk_table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = table_semantics_foreign_key_constraints(fk_table);
            SubLObject constraint = NIL;
            constraint = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                if (fk_constraint_constraining_column(constraint).eql(column_semantics)) {
                    constraints = cons(constraint, constraints);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                constraint = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            fk_table = cdolist_list_var.first();
        } 
        return constraints;
    }

    public static SubLObject column_semantics_foreign_key_constraint(final SubLObject column_semantics) {
        final SubLObject table = column_semantics_table_semantics(column_semantics);
        SubLObject cdolist_list_var = table_semantics_column_constraints(table);
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != foreign_key_constraint_p(constraint)) && fk_constraint_constrained_column(constraint).eql(column_semantics)) {
                return constraint;
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject set_column_semantics_column_type(final SubLObject column_semantics, final SubLObject column_type) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        assert NIL != stringp(column_type) : "Types.stringp(column_type) " + "CommonSymbols.NIL != Types.stringp(column_type) " + column_type;
        _csetf_c_semant_table_semantics(column_semantics, column_type);
        return column_semantics;
    }

    public static SubLObject set_column_semantics_column_size(final SubLObject column_semantics, final SubLObject column_size) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        assert NIL != integerp(column_size) : "Types.integerp(column_size) " + "CommonSymbols.NIL != Types.integerp(column_size) " + column_size;
        _csetf_c_semant_column_size(column_semantics, column_size);
        return column_semantics;
    }

    public static SubLObject set_column_semantics_table_semantics(final SubLObject column_semantics, final SubLObject table_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        _csetf_c_semant_table_semantics(column_semantics, table_semantics);
        return column_semantics;
    }

    public static SubLObject set_column_semantics_value_semantics_list(final SubLObject column_semantics, final SubLObject value_semantics_list) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        assert NIL != list_utilities.non_dotted_list_p(value_semantics_list) : "list_utilities.non_dotted_list_p(value_semantics_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(value_semantics_list) " + value_semantics_list;
        SubLObject cdolist_list_var = value_semantics_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != value_semantics_p(elem) : "semantic_etl_bus.value_semantics_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.value_semantics_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        _csetf_c_semant_value_semantics_list(column_semantics, value_semantics_list);
        return column_semantics;
    }

    public static SubLObject set_column_semantics_name(final SubLObject column_semantics, final SubLObject new_name) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        assert NIL != stringp(new_name) : "Types.stringp(new_name) " + "CommonSymbols.NIL != Types.stringp(new_name) " + new_name;
        _csetf_c_semant_column_name(column_semantics, new_name);
        return column_semantics;
    }

    public static SubLObject find_corresponding_item_in_semantics_column_semantics_method(final SubLObject original_column, final SubLObject semantics) {
        final SubLObject original_table_name = table_semantics_table_name(column_semantics_table_semantics(original_column));
        return semantics_get_column_named(semantics, original_table_name, column_semantics_column_name(original_column));
    }

    public static SubLObject semantic_object_comparison_name_column_semantics_method(final SubLObject column) {
        return cconcatenate($$$col_, new SubLObject[]{ format_nil.format_nil_a_no_copy(column_semantics_table_name(column)), $str143$_, format_nil.format_nil_a_no_copy(column_semantics_column_name(column)) });
    }

    public static SubLObject column_semantics_table_name(final SubLObject column) {
        return table_semantics_table_name(column_semantics_table_semantics(column));
    }

    public static SubLObject column_semantics_foreign_key_constraint_constraining_column(final SubLObject column) {
        if (NIL != column_semantics_foreign_key_constraint(column)) {
            return foreign_key_constraint_constraining_column(column_semantics_foreign_key_constraint(column));
        }
        return NIL;
    }

    public static SubLObject value_semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_value_semantics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject value_semantics_p(final SubLObject v_object) {
        return v_object.getClass() == $value_semantics_native.class ? T : NIL;
    }

    public static SubLObject v_semant_value(final SubLObject v_object) {
        assert NIL != value_semantics_p(v_object) : "semantic_etl_bus.value_semantics_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject v_semant_value_parses(final SubLObject v_object) {
        assert NIL != value_semantics_p(v_object) : "semantic_etl_bus.value_semantics_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_v_semant_value(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_semantics_p(v_object) : "semantic_etl_bus.value_semantics_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_v_semant_value_parses(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_semantics_p(v_object) : "semantic_etl_bus.value_semantics_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_value_semantics(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $value_semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($VALUE)) {
                _csetf_v_semant_value(v_new, current_value);
            } else
                if (pcase_var.eql($VALUE_PARSES)) {
                    _csetf_v_semant_value_parses(v_new, current_value);
                } else {
                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_value_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_VALUE_SEMANTICS, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $VALUE, v_semant_value(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUE_PARSES, v_semant_value_parses(obj));
        funcall(visitor_fn, obj, $END, MAKE_VALUE_SEMANTICS, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_value_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_value_semantics(obj, visitor_fn);
    }

    public static SubLObject print_value_semantics(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str222$_VALUE___s__a_, v_semant_value(v_object), v_semant_value_parses(v_object));
        return v_object;
    }

    public static SubLObject new_value_semantics(final SubLObject value, final SubLObject value_parses) {
        final SubLObject value_semantics = make_value_semantics(UNPROVIDED);
        _csetf_v_semant_value(value_semantics, value);
        _csetf_v_semant_value_parses(value_semantics, value_parses);
        return value_semantics;
    }

    public static SubLObject value_semantics_value(final SubLObject value_semantics) {
        assert NIL != value_semantics_p(value_semantics) : "semantic_etl_bus.value_semantics_p(value_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.value_semantics_p(value_semantics) " + value_semantics;
        return v_semant_value(value_semantics);
    }

    public static SubLObject value_semantics_value_parses(final SubLObject value_semantics) {
        assert NIL != value_semantics_p(value_semantics) : "semantic_etl_bus.value_semantics_p(value_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.value_semantics_p(value_semantics) " + value_semantics;
        if (NIL == v_semant_value_parses(value_semantics)) {
            final SubLObject parsed_values = data_parser.semantic_etl_parse_value(value_semantics_value(value_semantics));
            if (NIL != parsed_values) {
                _csetf_v_semant_value_parses(value_semantics, parsed_values);
            } else {
                _csetf_v_semant_value_parses(value_semantics, $NONE);
            }
        }
        if (v_semant_value_parses(value_semantics) == $NONE) {
            return NIL;
        }
        return v_semant_value_parses(value_semantics);
    }

    public static SubLObject set_value_semantics_value(final SubLObject value_semantics, final SubLObject value) {
        assert NIL != value_semantics_p(value_semantics) : "semantic_etl_bus.value_semantics_p(value_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.value_semantics_p(value_semantics) " + value_semantics;
        _csetf_v_semant_value(value_semantics, value);
        return value_semantics;
    }

    public static SubLObject database_output_spec_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_database_output_spec(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject database_output_spec_p(final SubLObject v_object) {
        return v_object.getClass() == $database_output_spec_native.class ? T : NIL;
    }

    public static SubLObject db_output_spec_id(final SubLObject v_object) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject db_output_spec_semantics1(final SubLObject v_object) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject db_output_spec_semantics2(final SubLObject v_object) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject db_output_spec_recipe(final SubLObject v_object) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject db_output_spec_semantics(final SubLObject v_object) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject db_output_spec_semantic_recipe(final SubLObject v_object) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_db_output_spec_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_db_output_spec_semantics1(final SubLObject v_object, final SubLObject value) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_db_output_spec_semantics2(final SubLObject v_object, final SubLObject value) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_db_output_spec_recipe(final SubLObject v_object, final SubLObject value) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_db_output_spec_semantics(final SubLObject v_object, final SubLObject value) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_db_output_spec_semantic_recipe(final SubLObject v_object, final SubLObject value) {
        assert NIL != database_output_spec_p(v_object) : "semantic_etl_bus.database_output_spec_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_database_output_spec(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $database_output_spec_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_db_output_spec_id(v_new, current_value);
            } else
                if (pcase_var.eql($SEMANTICS1)) {
                    _csetf_db_output_spec_semantics1(v_new, current_value);
                } else
                    if (pcase_var.eql($SEMANTICS2)) {
                        _csetf_db_output_spec_semantics2(v_new, current_value);
                    } else
                        if (pcase_var.eql($RECIPE)) {
                            _csetf_db_output_spec_recipe(v_new, current_value);
                        } else
                            if (pcase_var.eql($SEMANTICS)) {
                                _csetf_db_output_spec_semantics(v_new, current_value);
                            } else
                                if (pcase_var.eql($SEMANTIC_RECIPE)) {
                                    _csetf_db_output_spec_semantic_recipe(v_new, current_value);
                                } else {
                                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_database_output_spec(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DATABASE_OUTPUT_SPEC, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, db_output_spec_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTICS1, db_output_spec_semantics1(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTICS2, db_output_spec_semantics2(obj));
        funcall(visitor_fn, obj, $SLOT, $RECIPE, db_output_spec_recipe(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTICS, db_output_spec_semantics(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTIC_RECIPE, db_output_spec_semantic_recipe(obj));
        funcall(visitor_fn, obj, $END, MAKE_DATABASE_OUTPUT_SPEC, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_database_output_spec_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_database_output_spec(obj, visitor_fn);
    }

    public static SubLObject print_database_output_spec(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str253$_DB_OUTPUT_, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        write_string($str200$_, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != db_output_spec_recipe(v_object).first()) {
            princ(db_output_spec_recipe(v_object).first(), stream);
            terpri(stream);
            SubLObject cdolist_list_var = db_output_spec_recipe(v_object).rest();
            SubLObject sql = NIL;
            sql = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                princ(sql, stream);
                terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                sql = cdolist_list_var.first();
            } 
        }
        write_string($str201$_, stream, UNPROVIDED, UNPROVIDED);
        write_string($str255$Sem_Recipe__, stream, UNPROVIDED, UNPROVIDED);
        princ(db_output_spec_semantic_recipe(v_object), stream);
        terpri(stream);
        princ(db_output_spec_semantics(v_object), UNPROVIDED);
        write_string($str256$_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject new_database_output_spec(final SubLObject semantics1, final SubLObject semantics2, final SubLObject target_access_path) {
        assert NIL != semantics_p(semantics1) : "semantic_etl_bus.semantics_p(semantics1) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics1) " + semantics1;
        assert NIL != semantics_p(semantics2) : "semantic_etl_bus.semantics_p(semantics2) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics2) " + semantics2;
        assert NIL != sksi_access_path.access_path_p(target_access_path) : "sksi_access_path.access_path_p(target_access_path) " + "CommonSymbols.NIL != sksi_access_path.access_path_p(target_access_path) " + target_access_path;
        final SubLObject output_spec = make_database_output_spec(UNPROVIDED);
        final SubLObject new_semantics = new_trivial_semantics(semantics1, semantics2, target_access_path);
        _csetf_db_output_spec_id(output_spec, integer_sequence_generator.integer_sequence_generator_next($db_output_spec_isg$.getGlobalValue()));
        _csetf_db_output_spec_semantics1(output_spec, semantics1);
        _csetf_db_output_spec_semantics2(output_spec, semantics2);
        _csetf_db_output_spec_recipe(output_spec, new_trivial_recipe(semantics1, semantics2, target_access_path));
        _csetf_db_output_spec_semantics(output_spec, new_semantics);
        _csetf_semant_output_spec(new_semantics, output_spec);
        _csetf_db_output_spec_semantic_recipe(output_spec, NIL);
        return output_spec;
    }

    public static SubLObject new_trivial_recipe(final SubLObject semantics1, final SubLObject semantics2, final SubLObject target_access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != semantics_p(semantics1) : "semantic_etl_bus.semantics_p(semantics1) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics1) " + semantics1;
        assert NIL != semantics_p(semantics2) : "semantic_etl_bus.semantics_p(semantics2) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics2) " + semantics2;
        assert NIL != sksi_access_path.access_path_p(target_access_path) : "sksi_access_path.access_path_p(target_access_path) " + "CommonSymbols.NIL != sksi_access_path.access_path_p(target_access_path) " + target_access_path;
        SubLObject recipe = NIL;
        final SubLObject access_path1 = semant_access_path(semantics1);
        final SubLObject access_path2 = semant_access_path(semantics2);
        SubLObject cdolist_list_var = semantics_table_semantics_list(semantics1);
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            recipe = cons(new_sql_copy_table(t_semant_table_name(table), access_path1, target_access_path), recipe);
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        cdolist_list_var = semantics_table_semantics_list(semantics2);
        table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            recipe = cons(new_sql_copy_table(t_semant_table_name(table), access_path2, target_access_path), recipe);
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        recipe = cons($recipe_marker$.getDynamicValue(thread), recipe);
        return nreverse(recipe);
    }

    public static SubLObject new_trivial_semantics(final SubLObject semantics1, final SubLObject semantics2, final SubLObject target_access_path) {
        return new_semantics(target_access_path, append(semant_table_semantics_list(semantics1), semant_table_semantics_list(semantics2)));
    }

    public static SubLObject copy_database_output_spec(final SubLObject original_output_spec) {
        final SubLObject copy = make_database_output_spec(UNPROVIDED);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next($db_output_spec_isg$.getGlobalValue());
        final SubLObject semantics1 = db_output_spec_semantics1(original_output_spec);
        final SubLObject semantics2 = db_output_spec_semantics2(original_output_spec);
        final SubLObject recipe = copy_list(db_output_spec_recipe(original_output_spec));
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

    public static SubLObject output_spec_append_to_recipe(final SubLObject output_spec, final SubLObject sql_command) {
        assert NIL != database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        _csetf_db_output_spec_recipe(output_spec, append(db_output_spec_recipe(output_spec), list(sql_command)));
        return db_output_spec_recipe(output_spec);
    }

    public static SubLObject output_spec_append_to_semantic_recipe(final SubLObject output_spec, final SubLObject semantic_recipe_step) {
        assert NIL != database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        final SubLObject old_value = db_output_spec_semantic_recipe(output_spec);
        final SubLObject new_value = cconcatenate(old_value, list(semantic_recipe_step));
        _csetf_db_output_spec_semantic_recipe(output_spec, new_value);
        set_semantic_recipe_step_output_spec(semantic_recipe_step, output_spec);
        return output_spec;
    }

    public static SubLObject output_spec_get_table_named(final SubLObject output_spec, final SubLObject table_name) {
        return semantics_get_table_named(db_output_spec_semantics(output_spec), table_name);
    }

    public static SubLObject semantics_add_dropped(final SubLObject semantics, final SubLObject dropped_sem) {
        _csetf_semant_dropped_items(semantics, cons(dropped_sem, semant_dropped_items(semantics)));
        return semantics;
    }

    public static SubLObject copy_semantic_recipe(final SubLObject original_recipe, final SubLObject new_semantics) {
        SubLObject recipe = NIL;
        SubLObject cdolist_list_var = original_recipe;
        SubLObject recipe_step = NIL;
        recipe_step = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            recipe = cons(semantic_recipe_step_copy(recipe_step, new_semantics), recipe);
            cdolist_list_var = cdolist_list_var.rest();
            recipe_step = cdolist_list_var.first();
        } 
        return nreverse(recipe);
    }

    public static SubLObject semantic_recipe_step_p(final SubLObject obj) {
        final SubLObject method_function = method_func(obj, $semantic_recipe_step_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, obj);
        }
        return NIL;
    }

    public static SubLObject empty_semantic_recipe_step_p(final SubLObject obj) {
        final SubLObject method_function = method_func(obj, $empty_semantic_recipe_step_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, obj);
        }
        return NIL;
    }

    public static SubLObject set_semantic_recipe_step_output_spec(final SubLObject obj, final SubLObject output_spec) {
        final SubLObject method_function = method_func(obj, $set_semantic_recipe_step_output_spec_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, obj, output_spec);
        }
        return NIL;
    }

    public static SubLObject semantic_recipe_append_to_drops(final SubLObject obj, final SubLObject drop) {
        final SubLObject method_function = method_func(obj, $semantic_recipe_append_to_drops_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, obj, drop);
        }
        Errors.warn($str258$unable_to_drop__A_from__A, drop, obj);
        return NIL;
    }

    public static SubLObject semantic_recipe_append_to_adds(final SubLObject obj, final SubLObject add) {
        final SubLObject method_function = method_func(obj, $semantic_recipe_append_to_adds_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, obj, add);
        }
        Errors.warn($str259$unable_to_add__A_to__A, add, obj);
        return NIL;
    }

    public static SubLObject semantic_recipe_remove_from_drops(final SubLObject obj, final SubLObject drop) {
        final SubLObject method_function = method_func(obj, $semantic_recipe_remove_from_drops_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, obj, drop);
        }
        Errors.warn($str260$unable_to_remove__A_from__A, drop, obj);
        return NIL;
    }

    public static SubLObject semantic_recipe_remove_from_adds(final SubLObject obj, final SubLObject add) {
        final SubLObject method_function = method_func(obj, $semantic_recipe_remove_from_adds_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, obj, add);
        }
        Errors.warn($str260$unable_to_remove__A_from__A, add, obj);
        return NIL;
    }

    public static SubLObject set_semantic_recipe_step_column_correspondence_list(final SubLObject recipe_step, final SubLObject correspondence_list) {
        final SubLObject method_function = method_func(recipe_step, $set_semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, recipe_step, correspondence_list);
        }
        Errors.warn($str261$unable_to_set_column_corespondenc, recipe_step);
        return NIL;
    }

    public static SubLObject semantic_recipe_step_column_correspondence_list(final SubLObject recipe_step) {
        final SubLObject method_function = method_func(recipe_step, $semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, recipe_step);
        }
        Errors.warn($str262$unable_to_get_column_corespondenc, recipe_step);
        return NIL;
    }

    public static SubLObject set_semantic_recipe_step_sql_start_index(final SubLObject obj, final SubLObject index) {
        final SubLObject method_function = method_func(obj, $set_semantic_recipe_step_sql_start_index_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, obj, index);
        }
        Errors.warn($str263$unable_to_set_start_index_of__A_t, obj, index);
        return NIL;
    }

    public static SubLObject set_semantic_recipe_step_sql_end_index(final SubLObject obj, final SubLObject index) {
        final SubLObject method_function = method_func(obj, $set_semantic_recipe_step_sql_end_index_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, obj, index);
        }
        Errors.warn($str264$unable_to_set_end_index_of__A_to_, obj, index);
        return NIL;
    }

    public static SubLObject semantic_recipe_step_copy(final SubLObject step, final SubLObject semantics) {
        final SubLObject method_function = method_func(step, $semantic_recipe_step_copy_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, step, semantics);
        }
        Errors.warn($str265$Don_t_know_how_to_copy__S, step);
        return NIL;
    }

    public static SubLObject table_merger_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_table_merger(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject table_merger_p(final SubLObject v_object) {
        return v_object.getClass() == $table_merger_native.class ? T : NIL;
    }

    public static SubLObject table_merger_id(final SubLObject v_object) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject table_merger_output_spec(final SubLObject v_object) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject table_merger_sources(final SubLObject v_object) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject table_merger_target(final SubLObject v_object) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject table_merger_column_correspondence_list(final SubLObject v_object) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject table_merger_added(final SubLObject v_object) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject table_merger_dropped(final SubLObject v_object) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject table_merger_sql_start_index(final SubLObject v_object) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject table_merger_sql_end_index(final SubLObject v_object) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_table_merger_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_table_merger_output_spec(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_table_merger_sources(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_table_merger_target(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_table_merger_column_correspondence_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_table_merger_added(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_table_merger_dropped(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_table_merger_sql_start_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_table_merger_sql_end_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != table_merger_p(v_object) : "semantic_etl_bus.table_merger_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_table_merger(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $table_merger_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_table_merger_id(v_new, current_value);
            } else
                if (pcase_var.eql($OUTPUT_SPEC)) {
                    _csetf_table_merger_output_spec(v_new, current_value);
                } else
                    if (pcase_var.eql($SOURCES)) {
                        _csetf_table_merger_sources(v_new, current_value);
                    } else
                        if (pcase_var.eql($TARGET)) {
                            _csetf_table_merger_target(v_new, current_value);
                        } else
                            if (pcase_var.eql($COLUMN_CORRESPONDENCE_LIST)) {
                                _csetf_table_merger_column_correspondence_list(v_new, current_value);
                            } else
                                if (pcase_var.eql($ADDED)) {
                                    _csetf_table_merger_added(v_new, current_value);
                                } else
                                    if (pcase_var.eql($DROPPED)) {
                                        _csetf_table_merger_dropped(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($SQL_START_INDEX)) {
                                            _csetf_table_merger_sql_start_index(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($SQL_END_INDEX)) {
                                                _csetf_table_merger_sql_end_index(v_new, current_value);
                                            } else {
                                                Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_table_merger(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TABLE_MERGER, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, table_merger_id(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTPUT_SPEC, table_merger_output_spec(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCES, table_merger_sources(obj));
        funcall(visitor_fn, obj, $SLOT, $TARGET, table_merger_target(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN_CORRESPONDENCE_LIST, table_merger_column_correspondence_list(obj));
        funcall(visitor_fn, obj, $SLOT, $ADDED, table_merger_added(obj));
        funcall(visitor_fn, obj, $SLOT, $DROPPED, table_merger_dropped(obj));
        funcall(visitor_fn, obj, $SLOT, $SQL_START_INDEX, table_merger_sql_start_index(obj));
        funcall(visitor_fn, obj, $SLOT, $SQL_END_INDEX, table_merger_sql_end_index(obj));
        funcall(visitor_fn, obj, $END, MAKE_TABLE_MERGER, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_table_merger_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_table_merger(obj, visitor_fn);
    }

    public static SubLObject print_table_merger(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str302$_TABLE_MERGER__A_, table_merger_id(v_object));
        terpri(stream);
        princ(Mapping.mapcar(TABLE_SEMANTICS_TABLE_NAME, table_merger_sources(v_object)), stream);
        princ($str303$____, stream);
        princ(table_semantics_table_name(table_merger_target(v_object)), stream);
        terpri(stream);
        princ(table_merger_column_correspondence_list(v_object), stream);
        if (NIL != table_merger_added(v_object)) {
            princ($str304$_adds__, stream);
            princ(table_merger_added(v_object), stream);
        }
        if (NIL != table_merger_added(v_object)) {
            princ($str305$_drops__, stream);
            princ(table_merger_dropped(v_object), stream);
        }
        format(stream, $str306$_SQL___A__A_, table_merger_sql_start_index(v_object), table_merger_sql_end_index(v_object));
        write_string($str256$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject new_table_merger(final SubLObject source_tables, final SubLObject target_table, final SubLObject column_correspondence_list) {
        final SubLObject merger = make_table_merger(UNPROVIDED);
        _csetf_table_merger_id(merger, integer_sequence_generator.integer_sequence_generator_next($db_output_spec_isg$.getGlobalValue()));
        _csetf_table_merger_sources(merger, source_tables);
        _csetf_table_merger_target(merger, target_table);
        _csetf_table_merger_column_correspondence_list(merger, column_correspondence_list);
        return merger;
    }

    public static SubLObject semantic_recipe_step_p_table_merger_method(final SubLObject obj) {
        return T;
    }

    public static SubLObject empty_semantic_recipe_step_p_table_merger_method(final SubLObject obj) {
        return makeBoolean((NIL == table_merger_added(obj)) && (NIL == table_merger_dropped(obj)));
    }

    public static SubLObject semantic_recipe_append_to_drops_table_merger_method(final SubLObject recipe_step, final SubLObject drop) {
        _csetf_table_merger_dropped(recipe_step, cons(drop, table_merger_dropped(recipe_step)));
        return recipe_step;
    }

    public static SubLObject semantic_recipe_append_to_adds_table_merger_method(final SubLObject recipe_step, final SubLObject add) {
        _csetf_table_merger_added(recipe_step, cons(add, table_merger_added(recipe_step)));
        return recipe_step;
    }

    public static SubLObject semantic_recipe_remove_from_drops_table_merger_method(final SubLObject recipe_step, final SubLObject drop) {
        _csetf_table_merger_dropped(recipe_step, remove(drop, table_merger_dropped(recipe_step), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return recipe_step;
    }

    public static SubLObject semantic_recipe_remove_from_adds_table_merger_method(final SubLObject recipe_step, final SubLObject add) {
        _csetf_table_merger_added(recipe_step, remove(add, table_merger_added(recipe_step), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return recipe_step;
    }

    public static SubLObject set_semantic_recipe_step_column_correspondence_list_table_merger_method(final SubLObject recipe_step, final SubLObject correspondence_list) {
        _csetf_table_merger_column_correspondence_list(recipe_step, correspondence_list);
        return recipe_step;
    }

    public static SubLObject semantic_recipe_step_column_correspondence_list_table_merger_method(final SubLObject recipe_step) {
        return table_merger_column_correspondence_list(recipe_step);
    }

    public static SubLObject set_semantic_recipe_step_output_spec_table_merger_method(final SubLObject obj, final SubLObject output_spec) {
        _csetf_table_merger_output_spec(obj, output_spec);
        return output_spec;
    }

    public static SubLObject set_semantic_recipe_step_sql_start_index_table_merger_method(final SubLObject obj, final SubLObject index) {
        _csetf_table_merger_sql_start_index(obj, index);
        return obj;
    }

    public static SubLObject set_semantic_recipe_step_sql_end_index_table_merger_method(final SubLObject obj, final SubLObject index) {
        _csetf_table_merger_sql_end_index(obj, index);
        return obj;
    }

    public static SubLObject semantic_recipe_step_copy_table_merger_method(final SubLObject original_table_merger, final SubLObject semantics) {
        final SubLObject source_table_names = Mapping.mapcar(TABLE_SEMANTICS_TABLE_NAME, table_merger_sources(original_table_merger));
        SubLObject source_tables = NIL;
        final SubLObject target_table_name = table_semantics_table_name(table_merger_target(original_table_merger));
        final SubLObject target_table = semantics_get_table_named(semantics, target_table_name);
        SubLObject column_correspondence_list = NIL;
        SubLObject cdolist_list_var = table_merger_column_correspondence_list(original_table_merger);
        SubLObject old_correspondence = NIL;
        old_correspondence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = old_correspondence;
            SubLObject old_source_column = NIL;
            SubLObject old_target_column = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list318);
            old_source_column = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list318);
            old_target_column = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list318);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                column_correspondence_list = cons(list(semantics_get_column_named(semantics, column_semantics_table_name(old_source_column), column_semantics_column_name(old_source_column)), semantics_get_column_named(semantics, column_semantics_table_name(old_target_column), column_semantics_column_name(old_target_column)), copy_list(justification)), column_correspondence_list);
            } else {
                cdestructuring_bind_error(datum, $list318);
            }
            cdolist_list_var = cdolist_list_var.rest();
            old_correspondence = cdolist_list_var.first();
        } 
        cdolist_list_var = source_table_names;
        SubLObject source_table_name = NIL;
        source_table_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            source_tables = cons(semantics_get_table_named(semantics, source_table_name), source_tables);
            cdolist_list_var = cdolist_list_var.rest();
            source_table_name = cdolist_list_var.first();
        } 
        final SubLObject new_merger = new_table_merger(nreverse(source_tables), target_table, nreverse(column_correspondence_list));
        _csetf_table_merger_sql_start_index(new_merger, table_merger_sql_start_index(original_table_merger));
        _csetf_table_merger_sql_end_index(new_merger, table_merger_sql_end_index(original_table_merger));
        SubLObject cdolist_list_var2 = table_merger_added(original_table_merger);
        SubLObject added = NIL;
        added = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject corresponding = find_corresponding_item_in_semantics(added, semantics);
            if (NIL == corresponding) {
                Errors.error($str319$unable_to_find_correspondent__add, added, semantics);
            }
            _csetf_table_merger_added(new_merger, cons(added, table_merger_added(new_merger)));
            cdolist_list_var2 = cdolist_list_var2.rest();
            added = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = table_merger_dropped(original_table_merger);
        SubLObject dropped = NIL;
        dropped = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject corresponding = find_corresponding_item_in_semantics(dropped, semantics);
            if (NIL == corresponding) {
                Errors.error($str320$unable_to_find_correspondent__dro, dropped, semantics);
            }
            _csetf_table_merger_dropped(new_merger, cons(corresponding, table_merger_dropped(new_merger)));
            cdolist_list_var2 = cdolist_list_var2.rest();
            dropped = cdolist_list_var2.first();
        } 
        return new_merger;
    }

    public static SubLObject column_merger_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_column_merger(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject column_merger_p(final SubLObject v_object) {
        return v_object.getClass() == $column_merger_native.class ? T : NIL;
    }

    public static SubLObject column_merger_output_spec(final SubLObject v_object) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject column_merger_sources(final SubLObject v_object) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject column_merger_target(final SubLObject v_object) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject column_merger_column_correspondence_list(final SubLObject v_object) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject column_merger_added(final SubLObject v_object) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject column_merger_dropped(final SubLObject v_object) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject column_merger_sql_start_index(final SubLObject v_object) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject column_merger_sql_end_index(final SubLObject v_object) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_column_merger_output_spec(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_column_merger_sources(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_column_merger_target(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_column_merger_column_correspondence_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_column_merger_added(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_column_merger_dropped(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_column_merger_sql_start_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_column_merger_sql_end_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != column_merger_p(v_object) : "semantic_etl_bus.column_merger_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject make_column_merger(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $column_merger_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($OUTPUT_SPEC)) {
                _csetf_column_merger_output_spec(v_new, current_value);
            } else
                if (pcase_var.eql($SOURCES)) {
                    _csetf_column_merger_sources(v_new, current_value);
                } else
                    if (pcase_var.eql($TARGET)) {
                        _csetf_column_merger_target(v_new, current_value);
                    } else
                        if (pcase_var.eql($COLUMN_CORRESPONDENCE_LIST)) {
                            _csetf_column_merger_column_correspondence_list(v_new, current_value);
                        } else
                            if (pcase_var.eql($ADDED)) {
                                _csetf_column_merger_added(v_new, current_value);
                            } else
                                if (pcase_var.eql($DROPPED)) {
                                    _csetf_column_merger_dropped(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SQL_START_INDEX)) {
                                        _csetf_column_merger_sql_start_index(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($SQL_END_INDEX)) {
                                            _csetf_column_merger_sql_end_index(v_new, current_value);
                                        } else {
                                            Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_column_merger(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_COLUMN_MERGER, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $OUTPUT_SPEC, column_merger_output_spec(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCES, column_merger_sources(obj));
        funcall(visitor_fn, obj, $SLOT, $TARGET, column_merger_target(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN_CORRESPONDENCE_LIST, column_merger_column_correspondence_list(obj));
        funcall(visitor_fn, obj, $SLOT, $ADDED, column_merger_added(obj));
        funcall(visitor_fn, obj, $SLOT, $DROPPED, column_merger_dropped(obj));
        funcall(visitor_fn, obj, $SLOT, $SQL_START_INDEX, column_merger_sql_start_index(obj));
        funcall(visitor_fn, obj, $SLOT, $SQL_END_INDEX, column_merger_sql_end_index(obj));
        funcall(visitor_fn, obj, $END, MAKE_COLUMN_MERGER, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_column_merger_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_column_merger(obj, visitor_fn);
    }

    public static SubLObject print_column_merger(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str349$_COLUMN_MERGER_);
        terpri(stream);
        princ(Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, column_merger_sources(v_object)), stream);
        princ($str303$____, stream);
        princ(column_semantics_column_name(column_merger_target(v_object)), stream);
        terpri(stream);
        princ(column_merger_column_correspondence_list(v_object), stream);
        if (NIL != column_merger_added(v_object)) {
            princ($str304$_adds__, stream);
            princ(column_merger_added(v_object), stream);
        }
        if (NIL != column_merger_added(v_object)) {
            princ($str305$_drops__, stream);
            princ(column_merger_dropped(v_object), stream);
        }
        format(stream, $str306$_SQL___A__A_, column_merger_sql_start_index(v_object), column_merger_sql_end_index(v_object));
        write_string($str256$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject new_column_merger(final SubLObject source_columns, final SubLObject target_column, final SubLObject column_correspondence_list) {
        final SubLObject merger = make_column_merger(UNPROVIDED);
        _csetf_column_merger_sources(merger, source_columns);
        _csetf_column_merger_target(merger, target_column);
        _csetf_column_merger_column_correspondence_list(merger, column_correspondence_list);
        return merger;
    }

    public static SubLObject semantic_recipe_step_p_column_merger_method(final SubLObject obj) {
        return T;
    }

    public static SubLObject empty_semantic_recipe_step_p_column_merger_method(final SubLObject obj) {
        return makeBoolean((NIL == column_merger_added(obj)) && (NIL == column_merger_dropped(obj)));
    }

    public static SubLObject semantic_recipe_append_to_drops_column_merger_method(final SubLObject recipe_step, final SubLObject drop) {
        _csetf_column_merger_dropped(recipe_step, cons(drop, column_merger_dropped(recipe_step)));
        return recipe_step;
    }

    public static SubLObject semantic_recipe_append_to_adds_column_merger_method(final SubLObject recipe_step, final SubLObject add) {
        _csetf_column_merger_added(recipe_step, cons(add, column_merger_added(recipe_step)));
        return recipe_step;
    }

    public static SubLObject semantic_recipe_remove_from_drops_column_merger_method(final SubLObject recipe_step, final SubLObject drop) {
        _csetf_column_merger_dropped(recipe_step, remove(drop, column_merger_dropped(recipe_step), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return recipe_step;
    }

    public static SubLObject semantic_recipe_remove_from_adds_column_merger_method(final SubLObject recipe_step, final SubLObject add) {
        _csetf_column_merger_added(recipe_step, remove(add, column_merger_added(recipe_step), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return recipe_step;
    }

    public static SubLObject set_semantic_recipe_step_column_correspondence_list_column_merger_method(final SubLObject recipe_step, final SubLObject correspondence_list) {
        _csetf_column_merger_column_correspondence_list(recipe_step, correspondence_list);
        return recipe_step;
    }

    public static SubLObject semantic_recipe_step_column_correspondence_list_column_merger_method(final SubLObject recipe_step) {
        return column_merger_column_correspondence_list(recipe_step);
    }

    public static SubLObject set_semantic_recipe_step_output_spec_column_merger_method(final SubLObject obj, final SubLObject output_spec) {
        _csetf_column_merger_output_spec(obj, output_spec);
        return output_spec;
    }

    public static SubLObject set_semantic_recipe_step_sql_start_index_column_merger_method(final SubLObject obj, final SubLObject index) {
        _csetf_column_merger_sql_start_index(obj, index);
        return obj;
    }

    public static SubLObject set_semantic_recipe_step_sql_end_index_column_merger_method(final SubLObject obj, final SubLObject index) {
        _csetf_column_merger_sql_end_index(obj, index);
        return obj;
    }

    public static SubLObject semantic_recipe_step_copy_column_merger_method(final SubLObject original_column_merger, final SubLObject semantics) {
        final SubLObject source_column_names = Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, column_merger_sources(original_column_merger));
        final SubLObject source_table_names = Mapping.mapcar(COLUMN_SEMANTICS_TABLE_NAME, column_merger_sources(original_column_merger));
        SubLObject source_columns = NIL;
        final SubLObject target_column_name = column_semantics_column_name(column_merger_target(original_column_merger));
        final SubLObject target_table_name = column_semantics_table_name(column_merger_target(original_column_merger));
        final SubLObject target_column = semantics_get_column_named(semantics, target_table_name, target_column_name);
        SubLObject column_correspondence_list = NIL;
        SubLObject cdolist_list_var = column_merger_column_correspondence_list(original_column_merger);
        SubLObject old_correspondence = NIL;
        old_correspondence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = old_correspondence;
            SubLObject old_source_column = NIL;
            SubLObject old_target_column = NIL;
            destructuring_bind_must_consp(current, datum, $list362);
            old_source_column = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list362);
            old_target_column = current.first();
            current = current.rest();
            if (NIL == current) {
                column_correspondence_list = cons(list(semantics_get_column_named(semantics, column_semantics_table_name(old_source_column), column_semantics_column_name(old_source_column)), semantics_get_column_named(semantics, column_semantics_table_name(old_target_column), column_semantics_column_name(old_target_column))), column_correspondence_list);
            } else {
                cdestructuring_bind_error(datum, $list362);
            }
            cdolist_list_var = cdolist_list_var.rest();
            old_correspondence = cdolist_list_var.first();
        } 
        SubLObject source_column_name = NIL;
        SubLObject source_column_name_$6 = NIL;
        SubLObject source_table_name = NIL;
        SubLObject source_table_name_$7 = NIL;
        source_column_name = source_column_names;
        source_column_name_$6 = source_column_name.first();
        source_table_name = source_table_names;
        source_table_name_$7 = source_table_name.first();
        while ((NIL != source_table_name) || (NIL != source_column_name)) {
            source_columns = cons(semantics_get_column_named(semantics, source_table_name_$7, source_column_name_$6), source_columns);
            source_column_name = source_column_name.rest();
            source_column_name_$6 = source_column_name.first();
            source_table_name = source_table_name.rest();
            source_table_name_$7 = source_table_name.first();
        } 
        final SubLObject new_merger = new_column_merger(nreverse(source_columns), target_column, nreverse(column_correspondence_list));
        _csetf_column_merger_sql_start_index(new_merger, column_merger_sql_start_index(original_column_merger));
        _csetf_column_merger_sql_end_index(new_merger, column_merger_sql_end_index(original_column_merger));
        SubLObject cdolist_list_var2 = column_merger_added(original_column_merger);
        SubLObject added = NIL;
        added = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject corresponding = find_corresponding_item_in_semantics(added, semantics);
            if (NIL == corresponding) {
                Errors.error($str363$unable_to_find_correspondent_for_, added, semantics);
            }
            _csetf_column_merger_added(new_merger, cons(added, column_merger_added(new_merger)));
            cdolist_list_var2 = cdolist_list_var2.rest();
            added = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = column_merger_dropped(original_column_merger);
        SubLObject dropped = NIL;
        dropped = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject corresponding = find_corresponding_item_in_semantics(dropped, semantics);
            if (NIL == corresponding) {
                Errors.error($str363$unable_to_find_correspondent_for_, dropped, semantics);
            }
            _csetf_column_merger_dropped(new_merger, cons(corresponding, column_merger_dropped(new_merger)));
            cdolist_list_var2 = cdolist_list_var2.rest();
            dropped = cdolist_list_var2.first();
        } 
        return new_merger;
    }

    public static SubLObject semantic_recipe_add_or_drop_item(final SubLObject obj) {
        assert NIL != semantic_recipe_add_or_drop_p(obj) : "semantic_etl_bus.semantic_recipe_add_or_drop_p(obj) " + "CommonSymbols.NIL != semantic_etl_bus.semantic_recipe_add_or_drop_p(obj) " + obj;
        return second(obj);
    }

    public static SubLObject semantic_recipe_add_or_drop_p(final SubLObject obj) {
        return makeBoolean((obj.isList() && (NIL != list_utilities.lengthE(obj, TWO_INTEGER, UNPROVIDED))) && (NIL != member(obj.first(), $list366, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject semantic_recipe_add_p(final SubLObject obj) {
        return makeBoolean((obj.isList() && (NIL != list_utilities.lengthE(obj, TWO_INTEGER, UNPROVIDED))) && (obj.first() == $ADD));
    }

    public static SubLObject new_semantic_recipe_add(final SubLObject obj) {
        return list($ADD, obj);
    }

    public static SubLObject semantic_recipe_drop_p(final SubLObject obj) {
        return makeBoolean((obj.isList() && (NIL != list_utilities.lengthE(obj, TWO_INTEGER, UNPROVIDED))) && (obj.first() == $DROP));
    }

    public static SubLObject new_semantic_recipe_drop(final SubLObject obj) {
        return list($DROP, obj);
    }

    public static SubLObject sql_conjunction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_conjunction(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_conjunction_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_conjunction_native.class ? T : NIL;
    }

    public static SubLObject sql_conjunction_conjuncts(final SubLObject v_object) {
        assert NIL != sql_conjunction_p(v_object) : "semantic_etl_bus.sql_conjunction_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_sql_conjunction_conjuncts(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_conjunction_p(v_object) : "semantic_etl_bus.sql_conjunction_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_sql_conjunction(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_conjunction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONJUNCTS)) {
                _csetf_sql_conjunction_conjuncts(v_new, current_value);
            } else {
                Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_conjunction(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_CONJUNCTION, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONJUNCTS, sql_conjunction_conjuncts(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_CONJUNCTION, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_conjunction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_conjunction(obj, visitor_fn);
    }

    public static SubLObject print_sql_conjunction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str200$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(sql_list_string(sql_conjunction_conjuncts(v_object), $$$_AND_), stream, UNPROVIDED, UNPROVIDED);
        write_string($str201$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject new_sql_conjunction(final SubLObject conjuncts) {
        assert NIL != list_utilities.non_dotted_list_p(conjuncts) : "list_utilities.non_dotted_list_p(conjuncts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(conjuncts) " + conjuncts;
        SubLObject cdolist_list_var = conjuncts;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != sql_condition_p(elem) : "semantic_etl_bus.sql_condition_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.sql_condition_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject conjunction = make_sql_conjunction(UNPROVIDED);
        _csetf_sql_conjunction_conjuncts(conjunction, conjuncts);
        return conjunction;
    }

    public static SubLObject sql_disjunction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_disjunction(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_disjunction_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_disjunction_native.class ? T : NIL;
    }

    public static SubLObject sql_disjunction_disjuncts(final SubLObject v_object) {
        assert NIL != sql_disjunction_p(v_object) : "semantic_etl_bus.sql_disjunction_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_sql_disjunction_disjuncts(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_disjunction_p(v_object) : "semantic_etl_bus.sql_disjunction_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_sql_disjunction(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_disjunction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($DISJUNCTS)) {
                _csetf_sql_disjunction_disjuncts(v_new, current_value);
            } else {
                Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_disjunction(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_DISJUNCTION, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $DISJUNCTS, sql_disjunction_disjuncts(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_DISJUNCTION, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_disjunction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_disjunction(obj, visitor_fn);
    }

    public static SubLObject print_sql_disjunction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str200$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(sql_list_string(sql_disjunction_disjuncts(v_object), $$$_OR_), stream, UNPROVIDED, UNPROVIDED);
        write_string($str201$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject new_sql_disjunction(final SubLObject disjuncts) {
        assert NIL != list_utilities.non_dotted_list_p(disjuncts) : "list_utilities.non_dotted_list_p(disjuncts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(disjuncts) " + disjuncts;
        SubLObject cdolist_list_var = disjuncts;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != sql_condition_p(elem) : "semantic_etl_bus.sql_condition_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.sql_condition_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject disjunction = make_sql_disjunction(UNPROVIDED);
        _csetf_sql_disjunction_disjuncts(disjunction, disjuncts);
        return disjunction;
    }

    public static SubLObject sql_copy_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_copy_table(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_copy_table_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_copy_table_native.class ? T : NIL;
    }

    public static SubLObject sql_copy_table_table(final SubLObject v_object) {
        assert NIL != sql_copy_table_p(v_object) : "semantic_etl_bus.sql_copy_table_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_copy_table_from(final SubLObject v_object) {
        assert NIL != sql_copy_table_p(v_object) : "semantic_etl_bus.sql_copy_table_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_copy_table_to(final SubLObject v_object) {
        assert NIL != sql_copy_table_p(v_object) : "semantic_etl_bus.sql_copy_table_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sql_copy_table_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_copy_table_p(v_object) : "semantic_etl_bus.sql_copy_table_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_copy_table_from(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_copy_table_p(v_object) : "semantic_etl_bus.sql_copy_table_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_copy_table_to(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_copy_table_p(v_object) : "semantic_etl_bus.sql_copy_table_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sql_copy_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_copy_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE)) {
                _csetf_sql_copy_table_table(v_new, current_value);
            } else
                if (pcase_var.eql($FROM)) {
                    _csetf_sql_copy_table_from(v_new, current_value);
                } else
                    if (pcase_var.eql($TO)) {
                        _csetf_sql_copy_table_to(v_new, current_value);
                    } else {
                        Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_copy_table(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_COPY_TABLE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE, sql_copy_table_table(obj));
        funcall(visitor_fn, obj, $SLOT, $FROM, sql_copy_table_from(obj));
        funcall(visitor_fn, obj, $SLOT, $TO, sql_copy_table_to(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_COPY_TABLE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_copy_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_copy_table(obj, visitor_fn);
    }

    public static SubLObject print_sql_copy_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str420$COPY_TABLE__a_FROM_DATABASE__a_TO, new SubLObject[]{ sql_copy_table_table(v_object), access_path_pretty_string(sql_copy_table_from(v_object)), access_path_pretty_string(sql_copy_table_to(v_object)) });
        return v_object;
    }

    public static SubLObject new_sql_copy_table(final SubLObject table, final SubLObject from, final SubLObject to) {
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        assert NIL != sksi_access_path.access_path_p(from) : "sksi_access_path.access_path_p(from) " + "CommonSymbols.NIL != sksi_access_path.access_path_p(from) " + from;
        assert NIL != sksi_access_path.access_path_p(to) : "sksi_access_path.access_path_p(to) " + "CommonSymbols.NIL != sksi_access_path.access_path_p(to) " + to;
        final SubLObject copy_table = make_sql_copy_table(UNPROVIDED);
        _csetf_sql_copy_table_table(copy_table, table);
        _csetf_sql_copy_table_from(copy_table, from);
        _csetf_sql_copy_table_to(copy_table, to);
        return copy_table;
    }

    public static SubLObject sql_insert_into_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_insert_into(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_insert_into_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_insert_into_native.class ? T : NIL;
    }

    public static SubLObject sql_insert_into_table(final SubLObject v_object) {
        assert NIL != sql_insert_into_p(v_object) : "semantic_etl_bus.sql_insert_into_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_insert_into_columns(final SubLObject v_object) {
        assert NIL != sql_insert_into_p(v_object) : "semantic_etl_bus.sql_insert_into_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_insert_into_data(final SubLObject v_object) {
        assert NIL != sql_insert_into_p(v_object) : "semantic_etl_bus.sql_insert_into_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sql_insert_into_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_insert_into_p(v_object) : "semantic_etl_bus.sql_insert_into_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_insert_into_columns(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_insert_into_p(v_object) : "semantic_etl_bus.sql_insert_into_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_insert_into_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_insert_into_p(v_object) : "semantic_etl_bus.sql_insert_into_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sql_insert_into(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_insert_into_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE)) {
                _csetf_sql_insert_into_table(v_new, current_value);
            } else
                if (pcase_var.eql($COLUMNS)) {
                    _csetf_sql_insert_into_columns(v_new, current_value);
                } else
                    if (pcase_var.eql($DATA)) {
                        _csetf_sql_insert_into_data(v_new, current_value);
                    } else {
                        Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_insert_into(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_INSERT_INTO, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE, sql_insert_into_table(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMNS, sql_insert_into_columns(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA, sql_insert_into_data(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_INSERT_INTO, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_insert_into_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_insert_into(obj, visitor_fn);
    }

    public static SubLObject print_sql_insert_into(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str440$INSERT_INTO__a___a___a, new SubLObject[]{ sql_insert_into_table(v_object), sql_list_string(sql_insert_into_columns(v_object), $str441$__), sql_insert_into_data(v_object) });
        return v_object;
    }

    public static SubLObject new_sql_insert_into(final SubLObject table, final SubLObject columns, final SubLObject data) {
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        assert NIL != list_utilities.non_dotted_list_p(columns) : "list_utilities.non_dotted_list_p(columns) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(columns) " + columns;
        SubLObject cdolist_list_var = columns;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != sql_table_expression_p(data) : "semantic_etl_bus.sql_table_expression_p(data) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_expression_p(data) " + data;
        final SubLObject insert_into = make_sql_insert_into(UNPROVIDED);
        _csetf_sql_insert_into_table(insert_into, table);
        _csetf_sql_insert_into_columns(insert_into, columns);
        _csetf_sql_insert_into_data(insert_into, data);
        return insert_into;
    }

    public static SubLObject sql_select_from_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_select_from(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_select_from_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_select_from_native.class ? T : NIL;
    }

    public static SubLObject sql_select_from_columns(final SubLObject v_object) {
        assert NIL != sql_select_from_p(v_object) : "semantic_etl_bus.sql_select_from_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_select_from_tables(final SubLObject v_object) {
        assert NIL != sql_select_from_p(v_object) : "semantic_etl_bus.sql_select_from_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_select_from_conditions(final SubLObject v_object) {
        assert NIL != sql_select_from_p(v_object) : "semantic_etl_bus.sql_select_from_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sql_select_from_columns(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_select_from_p(v_object) : "semantic_etl_bus.sql_select_from_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_select_from_tables(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_select_from_p(v_object) : "semantic_etl_bus.sql_select_from_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_select_from_conditions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_select_from_p(v_object) : "semantic_etl_bus.sql_select_from_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sql_select_from(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_select_from_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($COLUMNS)) {
                _csetf_sql_select_from_columns(v_new, current_value);
            } else
                if (pcase_var.eql($TABLES)) {
                    _csetf_sql_select_from_tables(v_new, current_value);
                } else
                    if (pcase_var.eql($CONDITIONS)) {
                        _csetf_sql_select_from_conditions(v_new, current_value);
                    } else {
                        Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_select_from(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_SELECT_FROM, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $COLUMNS, sql_select_from_columns(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLES, sql_select_from_tables(obj));
        funcall(visitor_fn, obj, $SLOT, $CONDITIONS, sql_select_from_conditions(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_SELECT_FROM, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_select_from_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_select_from(obj, visitor_fn);
    }

    public static SubLObject print_sql_select_from(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str462$SELECT__a_FROM__a, sql_list_string(sql_select_from_columns(v_object), UNPROVIDED), sql_list_string(sql_select_from_tables(v_object), UNPROVIDED));
        if (NIL != sql_select_from_conditions(v_object)) {
            format(stream, $str463$_WHERE__a, sql_list_string(sql_select_from_conditions(v_object), $$$_AND));
        }
        return v_object;
    }

    public static SubLObject new_sql_select_from(final SubLObject columns, final SubLObject tables, final SubLObject conditions) {
        assert NIL != list_utilities.non_dotted_list_p(columns) : "list_utilities.non_dotted_list_p(columns) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(columns) " + columns;
        SubLObject cdolist_list_var = columns;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(tables) : "list_utilities.non_dotted_list_p(tables) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(tables) " + tables;
        cdolist_list_var = tables;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != sql_table_expression_p(elem) : "semantic_etl_bus.sql_table_expression_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_expression_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != listp(conditions) : "Types.listp(conditions) " + "CommonSymbols.NIL != Types.listp(conditions) " + conditions;
        final SubLObject select_from = make_sql_select_from(UNPROVIDED);
        _csetf_sql_select_from_columns(select_from, columns);
        _csetf_sql_select_from_tables(select_from, tables);
        _csetf_sql_select_from_conditions(select_from, conditions);
        return select_from;
    }

    public static SubLObject sql_list_string(final SubLObject list, SubLObject separator) {
        if (separator == UNPROVIDED) {
            separator = $str441$__;
        }
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            if (NIL != list) {
                princ(list.first(), stream);
                SubLObject cdolist_list_var = list.rest();
                SubLObject element = NIL;
                element = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    princ(separator, stream);
                    princ(element, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    element = cdolist_list_var.first();
                } 
            }
            string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }

    public static SubLObject sql_except_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_except(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_except_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_except_native.class ? T : NIL;
    }

    public static SubLObject sql_except_table1(final SubLObject v_object) {
        assert NIL != sql_except_p(v_object) : "semantic_etl_bus.sql_except_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_except_table2(final SubLObject v_object) {
        assert NIL != sql_except_p(v_object) : "semantic_etl_bus.sql_except_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_sql_except_table1(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_except_p(v_object) : "semantic_etl_bus.sql_except_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_except_table2(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_except_p(v_object) : "semantic_etl_bus.sql_except_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sql_except(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_except_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE1)) {
                _csetf_sql_except_table1(v_new, current_value);
            } else
                if (pcase_var.eql($TABLE2)) {
                    _csetf_sql_except_table2(v_new, current_value);
                } else {
                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_except(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_EXCEPT, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE1, sql_except_table1(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE2, sql_except_table2(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_EXCEPT, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_except_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_except(obj, visitor_fn);
    }

    public static SubLObject print_sql_except(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str482$_a_EXCEPT__a, sql_except_table1(v_object), sql_except_table2(v_object));
        return v_object;
    }

    public static SubLObject new_sql_except(final SubLObject table_expr1, final SubLObject table_expr2) {
        assert NIL != sql_table_expression_p(table_expr1) : "semantic_etl_bus.sql_table_expression_p(table_expr1) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_expression_p(table_expr1) " + table_expr1;
        assert NIL != sql_table_expression_p(table_expr2) : "semantic_etl_bus.sql_table_expression_p(table_expr2) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_expression_p(table_expr2) " + table_expr2;
        final SubLObject except = make_sql_except(UNPROVIDED);
        _csetf_sql_except_table1(except, table_expr1);
        _csetf_sql_except_table2(except, table_expr2);
        return except;
    }

    public static SubLObject sql_alias_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_alias(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_alias_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_alias_native.class ? T : NIL;
    }

    public static SubLObject sql_alias_table(final SubLObject v_object) {
        assert NIL != sql_alias_p(v_object) : "semantic_etl_bus.sql_alias_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_alias_alias(final SubLObject v_object) {
        assert NIL != sql_alias_p(v_object) : "semantic_etl_bus.sql_alias_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_sql_alias_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_alias_p(v_object) : "semantic_etl_bus.sql_alias_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_alias_alias(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_alias_p(v_object) : "semantic_etl_bus.sql_alias_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sql_alias(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_alias_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE)) {
                _csetf_sql_alias_table(v_new, current_value);
            } else
                if (pcase_var.eql($ALIAS)) {
                    _csetf_sql_alias_alias(v_new, current_value);
                } else {
                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_alias(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_ALIAS, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE, sql_alias_table(obj));
        funcall(visitor_fn, obj, $SLOT, $ALIAS, sql_alias_alias(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_ALIAS, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_alias_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_alias(obj, visitor_fn);
    }

    public static SubLObject print_sql_alias(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str499$_a_AS__a, sql_alias_table(v_object), sql_alias_alias(v_object));
        return v_object;
    }

    public static SubLObject new_sql_alias(final SubLObject table, final SubLObject alias) {
        assert NIL != sql_table_expression_p(table) : "semantic_etl_bus.sql_table_expression_p(table) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_expression_p(table) " + table;
        assert NIL != stringp(alias) : "Types.stringp(alias) " + "CommonSymbols.NIL != Types.stringp(alias) " + alias;
        final SubLObject sql_alias = make_sql_alias(UNPROVIDED);
        _csetf_sql_alias_table(sql_alias, table);
        _csetf_sql_alias_alias(sql_alias, alias);
        return sql_alias;
    }

    public static SubLObject sql_column_equal_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_column_equal(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_column_equal_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_column_equal_native.class ? T : NIL;
    }

    public static SubLObject sql_column_equal_table1(final SubLObject v_object) {
        assert NIL != sql_column_equal_p(v_object) : "semantic_etl_bus.sql_column_equal_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_column_equal_column1(final SubLObject v_object) {
        assert NIL != sql_column_equal_p(v_object) : "semantic_etl_bus.sql_column_equal_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_column_equal_table2(final SubLObject v_object) {
        assert NIL != sql_column_equal_p(v_object) : "semantic_etl_bus.sql_column_equal_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sql_column_equal_column2(final SubLObject v_object) {
        assert NIL != sql_column_equal_p(v_object) : "semantic_etl_bus.sql_column_equal_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_sql_column_equal_table1(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_column_equal_p(v_object) : "semantic_etl_bus.sql_column_equal_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_column_equal_column1(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_column_equal_p(v_object) : "semantic_etl_bus.sql_column_equal_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_column_equal_table2(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_column_equal_p(v_object) : "semantic_etl_bus.sql_column_equal_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sql_column_equal_column2(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_column_equal_p(v_object) : "semantic_etl_bus.sql_column_equal_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_sql_column_equal(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_column_equal_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE1)) {
                _csetf_sql_column_equal_table1(v_new, current_value);
            } else
                if (pcase_var.eql($COLUMN1)) {
                    _csetf_sql_column_equal_column1(v_new, current_value);
                } else
                    if (pcase_var.eql($TABLE2)) {
                        _csetf_sql_column_equal_table2(v_new, current_value);
                    } else
                        if (pcase_var.eql($COLUMN2)) {
                            _csetf_sql_column_equal_column2(v_new, current_value);
                        } else {
                            Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_column_equal(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_COLUMN_EQUAL, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE1, sql_column_equal_table1(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN1, sql_column_equal_column1(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE2, sql_column_equal_table2(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN2, sql_column_equal_column2(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_COLUMN_EQUAL, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_column_equal_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_column_equal(obj, visitor_fn);
    }

    public static SubLObject print_sql_column_equal(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str521$_a____a, NIL != string_utilities.non_empty_string_p(sql_column_equal_table1(v_object)) ? cconcatenate(sql_column_equal_table1(v_object), new SubLObject[]{ $str143$_, sql_column_equal_column1(v_object) }) : sql_column_equal_column1(v_object), NIL != string_utilities.non_empty_string_p(sql_column_equal_table2(v_object)) ? cconcatenate(sql_column_equal_table2(v_object), new SubLObject[]{ $str143$_, sql_column_equal_column2(v_object) }) : sql_column_equal_column2(v_object));
        return v_object;
    }

    public static SubLObject new_sql_column_equal(final SubLObject table1, final SubLObject column1, final SubLObject table2, final SubLObject column2) {
        assert NIL != stringp(table1) : "Types.stringp(table1) " + "CommonSymbols.NIL != Types.stringp(table1) " + table1;
        assert NIL != stringp(column1) : "Types.stringp(column1) " + "CommonSymbols.NIL != Types.stringp(column1) " + column1;
        assert NIL != stringp(table2) : "Types.stringp(table2) " + "CommonSymbols.NIL != Types.stringp(table2) " + table2;
        assert NIL != stringp(column2) : "Types.stringp(column2) " + "CommonSymbols.NIL != Types.stringp(column2) " + column2;
        final SubLObject column_equal = make_sql_column_equal(UNPROVIDED);
        _csetf_sql_column_equal_table1(column_equal, table1);
        _csetf_sql_column_equal_column1(column_equal, column1);
        _csetf_sql_column_equal_table2(column_equal, table2);
        _csetf_sql_column_equal_column2(column_equal, column2);
        return column_equal;
    }

    public static SubLObject sql_is_null_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_is_null(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_is_null_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_is_null_native.class ? T : NIL;
    }

    public static SubLObject sql_is_null_table(final SubLObject v_object) {
        assert NIL != sql_is_null_p(v_object) : "semantic_etl_bus.sql_is_null_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_is_null_column(final SubLObject v_object) {
        assert NIL != sql_is_null_p(v_object) : "semantic_etl_bus.sql_is_null_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_sql_is_null_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_is_null_p(v_object) : "semantic_etl_bus.sql_is_null_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_is_null_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_is_null_p(v_object) : "semantic_etl_bus.sql_is_null_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sql_is_null(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_is_null_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE)) {
                _csetf_sql_is_null_table(v_new, current_value);
            } else
                if (pcase_var.eql($COLUMN)) {
                    _csetf_sql_is_null_column(v_new, current_value);
                } else {
                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_is_null(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_IS_NULL, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE, sql_is_null_table(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN, sql_is_null_column(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_IS_NULL, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_is_null_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_is_null(obj, visitor_fn);
    }

    public static SubLObject print_sql_is_null(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str538$_a__a_IS_NULL, sql_is_null_table(v_object), sql_is_null_column(v_object));
        return v_object;
    }

    public static SubLObject new_sql_is_null(final SubLObject table, final SubLObject column) {
        assert NIL != sql_table_expression_p(table) : "semantic_etl_bus.sql_table_expression_p(table) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_expression_p(table) " + table;
        assert NIL != stringp(column) : "Types.stringp(column) " + "CommonSymbols.NIL != Types.stringp(column) " + column;
        final SubLObject is_null = make_sql_is_null(UNPROVIDED);
        _csetf_sql_is_null_table(is_null, table);
        _csetf_sql_is_null_column(is_null, column);
        return is_null;
    }

    public static SubLObject sql_not_in_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_not_in(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_not_in_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_not_in_native.class ? T : NIL;
    }

    public static SubLObject sql_not_in_column_table(final SubLObject v_object) {
        assert NIL != sql_not_in_p(v_object) : "semantic_etl_bus.sql_not_in_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_not_in_column(final SubLObject v_object) {
        assert NIL != sql_not_in_p(v_object) : "semantic_etl_bus.sql_not_in_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_not_in_table(final SubLObject v_object) {
        assert NIL != sql_not_in_p(v_object) : "semantic_etl_bus.sql_not_in_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sql_not_in_column_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_not_in_p(v_object) : "semantic_etl_bus.sql_not_in_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_not_in_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_not_in_p(v_object) : "semantic_etl_bus.sql_not_in_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_not_in_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_not_in_p(v_object) : "semantic_etl_bus.sql_not_in_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sql_not_in(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_not_in_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($COLUMN_TABLE)) {
                _csetf_sql_not_in_column_table(v_new, current_value);
            } else
                if (pcase_var.eql($COLUMN)) {
                    _csetf_sql_not_in_column(v_new, current_value);
                } else
                    if (pcase_var.eql($TABLE)) {
                        _csetf_sql_not_in_table(v_new, current_value);
                    } else {
                        Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_not_in(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_NOT_IN, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $COLUMN_TABLE, sql_not_in_column_table(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN, sql_not_in_column(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE, sql_not_in_table(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_NOT_IN, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_not_in_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_not_in(obj, visitor_fn);
    }

    public static SubLObject print_sql_not_in(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str557$_a__a_NOT_IN__a, new SubLObject[]{ sql_not_in_column_table(v_object), sql_not_in_column(v_object), sql_not_in_table(v_object) });
        return v_object;
    }

    public static SubLObject new_sql_not_in(final SubLObject column_table, final SubLObject column, final SubLObject table) {
        assert NIL != stringp(column_table) : "Types.stringp(column_table) " + "CommonSymbols.NIL != Types.stringp(column_table) " + column_table;
        assert NIL != stringp(column) : "Types.stringp(column) " + "CommonSymbols.NIL != Types.stringp(column) " + column;
        assert NIL != sql_table_expression_p(table) : "semantic_etl_bus.sql_table_expression_p(table) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_expression_p(table) " + table;
        final SubLObject notin = make_sql_not_in(UNPROVIDED);
        _csetf_sql_not_in_column_table(notin, column_table);
        _csetf_sql_not_in_column(notin, column);
        _csetf_sql_not_in_table(notin, table);
        return notin;
    }

    public static SubLObject sql_inner_join_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_inner_join(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_inner_join_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_inner_join_native.class ? T : NIL;
    }

    public static SubLObject sql_inner_join_table1(final SubLObject v_object) {
        assert NIL != sql_inner_join_p(v_object) : "semantic_etl_bus.sql_inner_join_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_inner_join_table2(final SubLObject v_object) {
        assert NIL != sql_inner_join_p(v_object) : "semantic_etl_bus.sql_inner_join_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_inner_join_on(final SubLObject v_object) {
        assert NIL != sql_inner_join_p(v_object) : "semantic_etl_bus.sql_inner_join_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sql_inner_join_table1(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_inner_join_p(v_object) : "semantic_etl_bus.sql_inner_join_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_inner_join_table2(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_inner_join_p(v_object) : "semantic_etl_bus.sql_inner_join_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_inner_join_on(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_inner_join_p(v_object) : "semantic_etl_bus.sql_inner_join_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sql_inner_join(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_inner_join_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE1)) {
                _csetf_sql_inner_join_table1(v_new, current_value);
            } else
                if (pcase_var.eql($TABLE2)) {
                    _csetf_sql_inner_join_table2(v_new, current_value);
                } else
                    if (pcase_var.eql($ON)) {
                        _csetf_sql_inner_join_on(v_new, current_value);
                    } else {
                        Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_inner_join(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_INNER_JOIN, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE1, sql_inner_join_table1(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE2, sql_inner_join_table2(obj));
        funcall(visitor_fn, obj, $SLOT, $ON, sql_inner_join_on(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_INNER_JOIN, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_inner_join_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_inner_join(obj, visitor_fn);
    }

    public static SubLObject print_sql_inner_join(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str576$_a_INNER_JOIN__a_ON__a, new SubLObject[]{ sql_inner_join_table1(v_object), sql_inner_join_table2(v_object), sql_inner_join_on(v_object) });
        return v_object;
    }

    public static SubLObject new_sql_inner_join(final SubLObject table1, final SubLObject table2, final SubLObject on) {
        assert NIL != sql_table_expression_p(table1) : "semantic_etl_bus.sql_table_expression_p(table1) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_expression_p(table1) " + table1;
        assert NIL != sql_table_expression_p(table2) : "semantic_etl_bus.sql_table_expression_p(table2) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_expression_p(table2) " + table2;
        assert NIL != sql_condition_p(on) : "semantic_etl_bus.sql_condition_p(on) " + "CommonSymbols.NIL != semantic_etl_bus.sql_condition_p(on) " + on;
        final SubLObject inner_join = make_sql_inner_join(UNPROVIDED);
        _csetf_sql_inner_join_table1(inner_join, table1);
        _csetf_sql_inner_join_table2(inner_join, table2);
        _csetf_sql_inner_join_on(inner_join, on);
        return inner_join;
    }

    public static SubLObject sql_left_join_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_left_join(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_left_join_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_left_join_native.class ? T : NIL;
    }

    public static SubLObject sql_left_join_left_table(final SubLObject v_object) {
        assert NIL != sql_left_join_p(v_object) : "semantic_etl_bus.sql_left_join_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_left_join_right_table(final SubLObject v_object) {
        assert NIL != sql_left_join_p(v_object) : "semantic_etl_bus.sql_left_join_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_left_join_on(final SubLObject v_object) {
        assert NIL != sql_left_join_p(v_object) : "semantic_etl_bus.sql_left_join_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sql_left_join_left_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_left_join_p(v_object) : "semantic_etl_bus.sql_left_join_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_left_join_right_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_left_join_p(v_object) : "semantic_etl_bus.sql_left_join_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_left_join_on(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_left_join_p(v_object) : "semantic_etl_bus.sql_left_join_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sql_left_join(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_left_join_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LEFT_TABLE)) {
                _csetf_sql_left_join_left_table(v_new, current_value);
            } else
                if (pcase_var.eql($RIGHT_TABLE)) {
                    _csetf_sql_left_join_right_table(v_new, current_value);
                } else
                    if (pcase_var.eql($ON)) {
                        _csetf_sql_left_join_on(v_new, current_value);
                    } else {
                        Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_left_join(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_LEFT_JOIN, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LEFT_TABLE, sql_left_join_left_table(obj));
        funcall(visitor_fn, obj, $SLOT, $RIGHT_TABLE, sql_left_join_right_table(obj));
        funcall(visitor_fn, obj, $SLOT, $ON, sql_left_join_on(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_LEFT_JOIN, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_left_join_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_left_join(obj, visitor_fn);
    }

    public static SubLObject print_sql_left_join(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str596$_a_LEFT_JOIN__a_ON__a, new SubLObject[]{ sql_left_join_left_table(v_object), sql_left_join_right_table(v_object), sql_left_join_on(v_object) });
        return v_object;
    }

    public static SubLObject new_sql_left_join(final SubLObject left_table, final SubLObject right_table, final SubLObject on) {
        assert NIL != stringp(left_table) : "Types.stringp(left_table) " + "CommonSymbols.NIL != Types.stringp(left_table) " + left_table;
        assert NIL != stringp(right_table) : "Types.stringp(right_table) " + "CommonSymbols.NIL != Types.stringp(right_table) " + right_table;
        assert NIL != sql_condition_p(on) : "semantic_etl_bus.sql_condition_p(on) " + "CommonSymbols.NIL != semantic_etl_bus.sql_condition_p(on) " + on;
        final SubLObject left_join = make_sql_left_join(UNPROVIDED);
        _csetf_sql_left_join_left_table(left_join, left_table);
        _csetf_sql_left_join_right_table(left_join, right_table);
        _csetf_sql_left_join_on(left_join, on);
        return left_join;
    }

    public static SubLObject sql_union_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_union(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_union_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_union_native.class ? T : NIL;
    }

    public static SubLObject sql_union_select1(final SubLObject v_object) {
        assert NIL != sql_union_p(v_object) : "semantic_etl_bus.sql_union_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_union_select2(final SubLObject v_object) {
        assert NIL != sql_union_p(v_object) : "semantic_etl_bus.sql_union_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_sql_union_select1(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_union_p(v_object) : "semantic_etl_bus.sql_union_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_union_select2(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_union_p(v_object) : "semantic_etl_bus.sql_union_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sql_union(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_union_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SELECT1)) {
                _csetf_sql_union_select1(v_new, current_value);
            } else
                if (pcase_var.eql($SELECT2)) {
                    _csetf_sql_union_select2(v_new, current_value);
                } else {
                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_union(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_UNION, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SELECT1, sql_union_select1(obj));
        funcall(visitor_fn, obj, $SLOT, $SELECT2, sql_union_select2(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_UNION, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_union_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_union(obj, visitor_fn);
    }

    public static SubLObject print_sql_union(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str614$_a__UNION___a, sql_union_select1(v_object), sql_union_select2(v_object));
        return v_object;
    }

    public static SubLObject new_sql_union(final SubLObject select1, final SubLObject select2) {
        assert NIL != sql_select_from_p(select1) : "semantic_etl_bus.sql_select_from_p(select1) " + "CommonSymbols.NIL != semantic_etl_bus.sql_select_from_p(select1) " + select1;
        assert NIL != sql_select_from_p(select2) : "semantic_etl_bus.sql_select_from_p(select2) " + "CommonSymbols.NIL != semantic_etl_bus.sql_select_from_p(select2) " + select2;
        final SubLObject union = make_sql_union(UNPROVIDED);
        _csetf_sql_union_select1(union, select1);
        _csetf_sql_union_select1(union, select2);
        return union;
    }

    public static SubLObject sql_alter_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_alter_table(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_alter_table_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_alter_table_native.class ? T : NIL;
    }

    public static SubLObject sql_alter_table_table(final SubLObject v_object) {
        assert NIL != sql_alter_table_p(v_object) : "semantic_etl_bus.sql_alter_table_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_alter_table_action(final SubLObject v_object) {
        assert NIL != sql_alter_table_p(v_object) : "semantic_etl_bus.sql_alter_table_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_sql_alter_table_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_alter_table_p(v_object) : "semantic_etl_bus.sql_alter_table_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_alter_table_action(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_alter_table_p(v_object) : "semantic_etl_bus.sql_alter_table_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sql_alter_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_alter_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE)) {
                _csetf_sql_alter_table_table(v_new, current_value);
            } else
                if (pcase_var.eql($ACTION)) {
                    _csetf_sql_alter_table_action(v_new, current_value);
                } else {
                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_alter_table(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_ALTER_TABLE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE, sql_alter_table_table(obj));
        funcall(visitor_fn, obj, $SLOT, $ACTION, sql_alter_table_action(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_ALTER_TABLE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_alter_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_alter_table(obj, visitor_fn);
    }

    public static SubLObject print_sql_alter_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str631$ALTER_TABLE__a__a, sql_alter_table_table(v_object), sql_alter_table_action(v_object));
        return v_object;
    }

    public static SubLObject new_sql_alter_table(final SubLObject table, final SubLObject action) {
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        assert NIL != sql_alteration_p(action) : "semantic_etl_bus.sql_alteration_p(action) " + "CommonSymbols.NIL != semantic_etl_bus.sql_alteration_p(action) " + action;
        final SubLObject alter_table = make_sql_alter_table(UNPROVIDED);
        _csetf_sql_alter_table_table(alter_table, table);
        _csetf_sql_alter_table_action(alter_table, action);
        return alter_table;
    }

    public static SubLObject sql_add_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_add_column(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_add_column_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_add_column_native.class ? T : NIL;
    }

    public static SubLObject sql_add_column_column(final SubLObject v_object) {
        assert NIL != sql_add_column_p(v_object) : "semantic_etl_bus.sql_add_column_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_add_column_type(final SubLObject v_object) {
        assert NIL != sql_add_column_p(v_object) : "semantic_etl_bus.sql_add_column_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_add_column_size(final SubLObject v_object) {
        assert NIL != sql_add_column_p(v_object) : "semantic_etl_bus.sql_add_column_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sql_add_column_constraints(final SubLObject v_object) {
        assert NIL != sql_add_column_p(v_object) : "semantic_etl_bus.sql_add_column_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_sql_add_column_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_add_column_p(v_object) : "semantic_etl_bus.sql_add_column_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_add_column_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_add_column_p(v_object) : "semantic_etl_bus.sql_add_column_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_add_column_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_add_column_p(v_object) : "semantic_etl_bus.sql_add_column_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sql_add_column_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_add_column_p(v_object) : "semantic_etl_bus.sql_add_column_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_sql_add_column(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_add_column_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($COLUMN)) {
                _csetf_sql_add_column_column(v_new, current_value);
            } else
                if (pcase_var.eql($TYPE)) {
                    _csetf_sql_add_column_type(v_new, current_value);
                } else
                    if (pcase_var.eql($SIZE)) {
                        _csetf_sql_add_column_size(v_new, current_value);
                    } else
                        if (pcase_var.eql($CONSTRAINTS)) {
                            _csetf_sql_add_column_constraints(v_new, current_value);
                        } else {
                            Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_add_column(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_ADD_COLUMN, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $COLUMN, sql_add_column_column(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, sql_add_column_type(obj));
        funcall(visitor_fn, obj, $SLOT, $SIZE, sql_add_column_size(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, sql_add_column_constraints(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_ADD_COLUMN, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_add_column_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_add_column(obj, visitor_fn);
    }

    public static SubLObject print_sql_add_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str655$ADD_COLUMN__a__a, sql_add_column_column(v_object), sql_add_column_type(v_object));
        if (NIL != sql_add_column_size(v_object)) {
            format(stream, $str656$__a_, sql_add_column_size(v_object));
        }
        if (NIL != sql_add_column_constraints(v_object)) {
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            princ(sql_list_string(sql_add_column_constraints(v_object), $$$_), stream);
        }
        return v_object;
    }

    public static SubLObject new_sql_add_column(final SubLObject column, final SubLObject type, SubLObject size, SubLObject constraints) {
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        assert NIL != stringp(column) : "Types.stringp(column) " + "CommonSymbols.NIL != Types.stringp(column) " + column;
        assert NIL != stringp(type) : "Types.stringp(type) " + "CommonSymbols.NIL != Types.stringp(type) " + type;
        if (((NIL != size) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(size))) {
            throw new AssertionError(size);
        }
        final SubLObject list_var = constraints;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != sql_column_constraint_p(elem) : "semantic_etl_bus.sql_column_constraint_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.sql_column_constraint_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject add_column = make_sql_add_column(UNPROVIDED);
        _csetf_sql_add_column_column(add_column, column);
        _csetf_sql_add_column_type(add_column, type);
        _csetf_sql_add_column_size(add_column, size);
        _csetf_sql_add_column_constraints(add_column, constraints);
        return add_column;
    }

    public static SubLObject new_sql_add_column_to_table(final SubLObject table, final SubLObject column, final SubLObject type, SubLObject size, SubLObject constraints) {
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        final SubLObject action = new_sql_add_column(column, type, size, constraints);
        return new_sql_alter_table(table, action);
    }

    public static SubLObject sql_drop_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_drop_column(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_drop_column_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_drop_column_native.class ? T : NIL;
    }

    public static SubLObject sql_drop_column_column(final SubLObject v_object) {
        assert NIL != sql_drop_column_p(v_object) : "semantic_etl_bus.sql_drop_column_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_sql_drop_column_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_drop_column_p(v_object) : "semantic_etl_bus.sql_drop_column_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_sql_drop_column(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_drop_column_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($COLUMN)) {
                _csetf_sql_drop_column_column(v_new, current_value);
            } else {
                Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_drop_column(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_DROP_COLUMN, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $COLUMN, sql_drop_column_column(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_DROP_COLUMN, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_drop_column_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_drop_column(obj, visitor_fn);
    }

    public static SubLObject print_sql_drop_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str672$DROP_COLUMN__a, sql_drop_column_column(v_object));
        return v_object;
    }

    public static SubLObject new_sql_drop_column(final SubLObject column) {
        assert NIL != stringp(column) : "Types.stringp(column) " + "CommonSymbols.NIL != Types.stringp(column) " + column;
        final SubLObject drop_column = make_sql_drop_column(UNPROVIDED);
        _csetf_sql_drop_column_column(drop_column, column);
        return drop_column;
    }

    public static SubLObject sql_rename_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_rename_column(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_rename_column_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_rename_column_native.class ? T : NIL;
    }

    public static SubLObject sql_rename_column_old_column(final SubLObject v_object) {
        assert NIL != sql_rename_column_p(v_object) : "semantic_etl_bus.sql_rename_column_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_rename_column_new_column(final SubLObject v_object) {
        assert NIL != sql_rename_column_p(v_object) : "semantic_etl_bus.sql_rename_column_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_sql_rename_column_old_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_rename_column_p(v_object) : "semantic_etl_bus.sql_rename_column_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_rename_column_new_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_rename_column_p(v_object) : "semantic_etl_bus.sql_rename_column_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sql_rename_column(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_rename_column_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($OLD_COLUMN)) {
                _csetf_sql_rename_column_old_column(v_new, current_value);
            } else
                if (pcase_var.eql($NEW_COLUMN)) {
                    _csetf_sql_rename_column_new_column(v_new, current_value);
                } else {
                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_rename_column(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_RENAME_COLUMN, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $OLD_COLUMN, sql_rename_column_old_column(obj));
        funcall(visitor_fn, obj, $SLOT, $NEW_COLUMN, sql_rename_column_new_column(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_RENAME_COLUMN, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_rename_column_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_rename_column(obj, visitor_fn);
    }

    public static SubLObject print_sql_rename_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str690$RENAME__a_TO__a, sql_rename_column_old_column(v_object), sql_rename_column_new_column(v_object));
        return v_object;
    }

    public static SubLObject new_sql_rename_column(final SubLObject old_column, final SubLObject new_column) {
        assert NIL != stringp(old_column) : "Types.stringp(old_column) " + "CommonSymbols.NIL != Types.stringp(old_column) " + old_column;
        assert NIL != stringp(new_column) : "Types.stringp(new_column) " + "CommonSymbols.NIL != Types.stringp(new_column) " + new_column;
        final SubLObject rename_column = make_sql_rename_column(UNPROVIDED);
        _csetf_sql_rename_column_old_column(rename_column, old_column);
        _csetf_sql_rename_column_new_column(rename_column, new_column);
        return rename_column;
    }

    public static SubLObject sql_add_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_add_constraint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_add_constraint_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_add_constraint_native.class ? T : NIL;
    }

    public static SubLObject sql_add_constraint_constraint(final SubLObject v_object) {
        assert NIL != sql_add_constraint_p(v_object) : "semantic_etl_bus.sql_add_constraint_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_sql_add_constraint_constraint(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_add_constraint_p(v_object) : "semantic_etl_bus.sql_add_constraint_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_sql_add_constraint(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_add_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONSTRAINT)) {
                _csetf_sql_add_constraint_constraint(v_new, current_value);
            } else {
                Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_add_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_ADD_CONSTRAINT, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT, sql_add_constraint_constraint(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_ADD_CONSTRAINT, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_add_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_add_constraint(obj, visitor_fn);
    }

    public static SubLObject print_sql_add_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str705$ADD_CONSTRAINT__a__a, sql_fk_column_constraint_name(sql_fk_table_constraint_constraint(sql_add_constraint_constraint(v_object))), sql_add_constraint_constraint(v_object));
        return v_object;
    }

    public static SubLObject new_sql_add_constraint(final SubLObject constraint) {
        assert NIL != sql_table_constraint_p(constraint) : "semantic_etl_bus.sql_table_constraint_p(constraint) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_constraint_p(constraint) " + constraint;
        final SubLObject add = make_sql_add_constraint(UNPROVIDED);
        _csetf_sql_add_constraint_constraint(add, constraint);
        return add;
    }

    public static SubLObject sql_drop_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_drop_constraint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_drop_constraint_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_drop_constraint_native.class ? T : NIL;
    }

    public static SubLObject sql_drop_constraint_constraint(final SubLObject v_object) {
        assert NIL != sql_drop_constraint_p(v_object) : "semantic_etl_bus.sql_drop_constraint_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_sql_drop_constraint_constraint(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_drop_constraint_p(v_object) : "semantic_etl_bus.sql_drop_constraint_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_sql_drop_constraint(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_drop_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONSTRAINT)) {
                _csetf_sql_drop_constraint_constraint(v_new, current_value);
            } else {
                Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_drop_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_DROP_CONSTRAINT, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT, sql_drop_constraint_constraint(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_DROP_CONSTRAINT, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_drop_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_drop_constraint(obj, visitor_fn);
    }

    public static SubLObject print_sql_drop_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str718$DROP_CONSTRAINT__a, sql_fk_column_constraint_name(sql_fk_table_constraint_constraint(sql_drop_constraint_constraint(v_object))));
        return v_object;
    }

    public static SubLObject new_sql_drop_constraint(final SubLObject constraint) {
        assert NIL != sql_table_constraint_p(constraint) : "semantic_etl_bus.sql_table_constraint_p(constraint) " + "CommonSymbols.NIL != semantic_etl_bus.sql_table_constraint_p(constraint) " + constraint;
        final SubLObject drop = make_sql_drop_constraint(UNPROVIDED);
        _csetf_sql_drop_constraint_constraint(drop, constraint);
        return drop;
    }

    public static SubLObject sql_fk_column_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_fk_column_constraint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_fk_column_constraint_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_fk_column_constraint_native.class ? T : NIL;
    }

    public static SubLObject sql_fk_column_constraint_name(final SubLObject v_object) {
        assert NIL != sql_fk_column_constraint_p(v_object) : "semantic_etl_bus.sql_fk_column_constraint_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_fk_column_constraint_table(final SubLObject v_object) {
        assert NIL != sql_fk_column_constraint_p(v_object) : "semantic_etl_bus.sql_fk_column_constraint_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_fk_column_constraint_column(final SubLObject v_object) {
        assert NIL != sql_fk_column_constraint_p(v_object) : "semantic_etl_bus.sql_fk_column_constraint_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sql_fk_column_constraint_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_fk_column_constraint_p(v_object) : "semantic_etl_bus.sql_fk_column_constraint_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_fk_column_constraint_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_fk_column_constraint_p(v_object) : "semantic_etl_bus.sql_fk_column_constraint_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_fk_column_constraint_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_fk_column_constraint_p(v_object) : "semantic_etl_bus.sql_fk_column_constraint_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sql_fk_column_constraint(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_fk_column_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_sql_fk_column_constraint_name(v_new, current_value);
            } else
                if (pcase_var.eql($TABLE)) {
                    _csetf_sql_fk_column_constraint_table(v_new, current_value);
                } else
                    if (pcase_var.eql($COLUMN)) {
                        _csetf_sql_fk_column_constraint_column(v_new, current_value);
                    } else {
                        Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_fk_column_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_FK_COLUMN_CONSTRAINT, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, sql_fk_column_constraint_name(obj));
        funcall(visitor_fn, obj, $SLOT, $TABLE, sql_fk_column_constraint_table(obj));
        funcall(visitor_fn, obj, $SLOT, $COLUMN, sql_fk_column_constraint_column(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_FK_COLUMN_CONSTRAINT, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_fk_column_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_fk_column_constraint(obj, visitor_fn);
    }

    public static SubLObject print_sql_fk_column_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str737$REFERENCES__a___a_, sql_fk_column_constraint_table(v_object), sql_fk_column_constraint_column(v_object));
        return v_object;
    }

    public static SubLObject new_sql_fk_column_constraint(final SubLObject name, final SubLObject table, final SubLObject column) {
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        assert NIL != stringp(column) : "Types.stringp(column) " + "CommonSymbols.NIL != Types.stringp(column) " + column;
        final SubLObject constraint = make_sql_fk_column_constraint(UNPROVIDED);
        _csetf_sql_fk_column_constraint_name(constraint, name);
        _csetf_sql_fk_column_constraint_table(constraint, table);
        _csetf_sql_fk_column_constraint_column(constraint, column);
        return constraint;
    }

    public static SubLObject sql_fk_table_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_fk_table_constraint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_fk_table_constraint_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_fk_table_constraint_native.class ? T : NIL;
    }

    public static SubLObject sql_fk_table_constraint_column(final SubLObject v_object) {
        assert NIL != sql_fk_table_constraint_p(v_object) : "semantic_etl_bus.sql_fk_table_constraint_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_fk_table_constraint_constraint(final SubLObject v_object) {
        assert NIL != sql_fk_table_constraint_p(v_object) : "semantic_etl_bus.sql_fk_table_constraint_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_sql_fk_table_constraint_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_fk_table_constraint_p(v_object) : "semantic_etl_bus.sql_fk_table_constraint_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_fk_table_constraint_constraint(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_fk_table_constraint_p(v_object) : "semantic_etl_bus.sql_fk_table_constraint_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sql_fk_table_constraint(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_fk_table_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($COLUMN)) {
                _csetf_sql_fk_table_constraint_column(v_new, current_value);
            } else
                if (pcase_var.eql($CONSTRAINT)) {
                    _csetf_sql_fk_table_constraint_constraint(v_new, current_value);
                } else {
                    Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_fk_table_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_FK_TABLE_CONSTRAINT, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $COLUMN, sql_fk_table_constraint_column(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT, sql_fk_table_constraint_constraint(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_FK_TABLE_CONSTRAINT, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_fk_table_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_fk_table_constraint(obj, visitor_fn);
    }

    public static SubLObject print_sql_fk_table_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str753$FOREIGN_KEY___a___a, sql_fk_table_constraint_column(v_object), sql_fk_table_constraint_constraint(v_object));
        return v_object;
    }

    public static SubLObject new_sql_fk_table_constraint(final SubLObject column, final SubLObject column_constraint) {
        assert NIL != stringp(column) : "Types.stringp(column) " + "CommonSymbols.NIL != Types.stringp(column) " + column;
        assert NIL != sql_column_constraint_p(column_constraint) : "semantic_etl_bus.sql_column_constraint_p(column_constraint) " + "CommonSymbols.NIL != semantic_etl_bus.sql_column_constraint_p(column_constraint) " + column_constraint;
        final SubLObject constraint = make_sql_fk_table_constraint(UNPROVIDED);
        _csetf_sql_fk_table_constraint_column(constraint, column);
        _csetf_sql_fk_table_constraint_constraint(constraint, column_constraint);
        return constraint;
    }

    public static SubLObject sql_update_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_update(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_update_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_update_native.class ? T : NIL;
    }

    public static SubLObject sql_update_table(final SubLObject v_object) {
        assert NIL != sql_update_p(v_object) : "semantic_etl_bus.sql_update_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_update_settings(final SubLObject v_object) {
        assert NIL != sql_update_p(v_object) : "semantic_etl_bus.sql_update_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sql_update_conditions(final SubLObject v_object) {
        assert NIL != sql_update_p(v_object) : "semantic_etl_bus.sql_update_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sql_update_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_update_p(v_object) : "semantic_etl_bus.sql_update_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_update_settings(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_update_p(v_object) : "semantic_etl_bus.sql_update_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sql_update_conditions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_update_p(v_object) : "semantic_etl_bus.sql_update_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sql_update(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_update_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE)) {
                _csetf_sql_update_table(v_new, current_value);
            } else
                if (pcase_var.eql($SETTINGS)) {
                    _csetf_sql_update_settings(v_new, current_value);
                } else
                    if (pcase_var.eql($CONDITIONS)) {
                        _csetf_sql_update_conditions(v_new, current_value);
                    } else {
                        Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_update(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_UPDATE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE, sql_update_table(obj));
        funcall(visitor_fn, obj, $SLOT, $SETTINGS, sql_update_settings(obj));
        funcall(visitor_fn, obj, $SLOT, $CONDITIONS, sql_update_conditions(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_UPDATE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_update_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_update(obj, visitor_fn);
    }

    public static SubLObject print_sql_update(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject settings = sql_update_settings(v_object);
        final SubLObject conditions = sql_update_conditions(v_object);
        format(stream, $str772$UPDATE__a_SET_, sql_update_table(v_object));
        princ(settings.first(), stream);
        SubLObject cdolist_list_var = settings.rest();
        SubLObject setting = NIL;
        setting = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            princ($str441$__, stream);
            princ(setting, stream);
            cdolist_list_var = cdolist_list_var.rest();
            setting = cdolist_list_var.first();
        } 
        format(stream, $$$_WHERE_);
        princ(conditions.first(), stream);
        cdolist_list_var = conditions.rest();
        SubLObject condition = NIL;
        condition = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            princ($$$_AND_, stream);
            princ(condition, stream);
            cdolist_list_var = cdolist_list_var.rest();
            condition = cdolist_list_var.first();
        } 
        return v_object;
    }

    public static SubLObject new_sql_update(final SubLObject table, final SubLObject settings, final SubLObject conditions) {
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        assert NIL != list_utilities.non_dotted_list_p(settings) : "list_utilities.non_dotted_list_p(settings) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(settings) " + settings;
        SubLObject cdolist_list_var = settings;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != sql_column_equal_p(elem) : "semantic_etl_bus.sql_column_equal_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.sql_column_equal_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != list_utilities.non_dotted_list_p(conditions) : "list_utilities.non_dotted_list_p(conditions) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(conditions) " + conditions;
        cdolist_list_var = conditions;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != sql_condition_p(elem) : "semantic_etl_bus.sql_condition_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.sql_condition_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject update = make_sql_update(UNPROVIDED);
        _csetf_sql_update_table(update, table);
        _csetf_sql_update_settings(update, settings);
        _csetf_sql_update_conditions(update, conditions);
        return update;
    }

    public static SubLObject sql_drop_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sql_drop_table(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_drop_table_p(final SubLObject v_object) {
        return v_object.getClass() == $sql_drop_table_native.class ? T : NIL;
    }

    public static SubLObject sql_drop_table_table(final SubLObject v_object) {
        assert NIL != sql_drop_table_p(v_object) : "semantic_etl_bus.sql_drop_table_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_sql_drop_table_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_drop_table_p(v_object) : "semantic_etl_bus.sql_drop_table_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_sql_drop_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_drop_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TABLE)) {
                _csetf_sql_drop_table_table(v_new, current_value);
            } else {
                Errors.error($str47$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_drop_table(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_DROP_TABLE, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TABLE, sql_drop_table_table(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_DROP_TABLE, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_drop_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_drop_table(obj, visitor_fn);
    }

    public static SubLObject print_sql_drop_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str787$DROP_TABLE__a, sql_drop_table_table(v_object));
        return v_object;
    }

    public static SubLObject new_sql_drop_table(final SubLObject table) {
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        final SubLObject drop_table = make_sql_drop_table(UNPROVIDED);
        _csetf_sql_drop_table_table(drop_table, table);
        return drop_table;
    }

    public static SubLObject sql_command_p(final SubLObject v_object) {
        return makeBoolean(((((((((((((((((NIL != sql_copy_table_p(v_object)) || (NIL != sql_insert_into_p(v_object))) || (NIL != sql_select_from_p(v_object))) || (NIL != sql_column_equal_p(v_object))) || (NIL != sql_not_in_p(v_object))) || (NIL != sql_left_join_p(v_object))) || (NIL != sql_union_p(v_object))) || (NIL != sql_alter_table_p(v_object))) || (NIL != sql_add_column_p(v_object))) || (NIL != sql_drop_column_p(v_object))) || (NIL != sql_rename_column_p(v_object))) || (NIL != sql_add_constraint_p(v_object))) || (NIL != sql_drop_constraint_p(v_object))) || (NIL != sql_fk_column_constraint_p(v_object))) || (NIL != sql_fk_table_constraint_p(v_object))) || (NIL != sql_update_p(v_object))) || (NIL != sql_drop_table_p(v_object)));
    }

    public static SubLObject sql_table_expression_p(final SubLObject v_object) {
        return makeBoolean(((((v_object.isString() || (NIL != sql_left_join_p(v_object))) || (NIL != sql_inner_join_p(v_object))) || (NIL != sql_select_from_p(v_object))) || (NIL != sql_except_p(v_object))) || (NIL != sql_alias_p(v_object)));
    }

    public static SubLObject sql_condition_p(final SubLObject v_object) {
        return makeBoolean(((((NIL != sql_column_equal_p(v_object)) || (NIL != sql_conjunction_p(v_object))) || (NIL != sql_disjunction_p(v_object))) || (NIL != sql_is_null_p(v_object))) || (NIL != sql_not_in_p(v_object)));
    }

    public static SubLObject sql_alteration_p(final SubLObject v_object) {
        return makeBoolean(((((NIL != sql_add_column_p(v_object)) || (NIL != sql_drop_column_p(v_object))) || (NIL != sql_rename_column_p(v_object))) || (NIL != sql_add_constraint_p(v_object))) || (NIL != sql_drop_constraint_p(v_object)));
    }

    public static SubLObject sql_table_constraint_p(final SubLObject v_object) {
        return sql_fk_table_constraint_p(v_object);
    }

    public static SubLObject sql_column_constraint_p(final SubLObject v_object) {
        return sql_fk_column_constraint_p(v_object);
    }

    public static SubLObject sql_column_constraint_name(final SubLObject constraint) {
        assert NIL != sql_column_constraint_p(constraint) : "semantic_etl_bus.sql_column_constraint_p(constraint) " + "CommonSymbols.NIL != semantic_etl_bus.sql_column_constraint_p(constraint) " + constraint;
        return NIL != sql_fk_column_constraint_p(constraint) ? sql_fk_column_constraint_name(constraint) : Errors.error($str788$Can_t_access_name_of_column_const, constraint);
    }

    public static SubLObject new_foreign_key_constraint_name(final SubLObject constrained_table, final SubLObject constrained_column) {
        assert NIL != stringp(constrained_table) : "Types.stringp(constrained_table) " + "CommonSymbols.NIL != Types.stringp(constrained_table) " + constrained_table;
        assert NIL != stringp(constrained_column) : "Types.stringp(constrained_column) " + "CommonSymbols.NIL != Types.stringp(constrained_column) " + constrained_column;
        return cconcatenate(constrained_table, new SubLObject[]{ $str789$_, constrained_column, $str790$_fk });
    }

    public static SubLObject initialize_access_path_map() {
        if (NIL == $access_path_map$.getGlobalValue()) {
            SubLObject cdolist_list_var = $list793;
            SubLObject functionXname = NIL;
            functionXname = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = functionXname;
                SubLObject function = NIL;
                SubLObject name = NIL;
                destructuring_bind_must_consp(current, datum, $list792);
                function = current.first();
                current = name = current.rest();
                $access_path_map$.setGlobalValue(cons(cons(name, funcall(function)), $access_path_map$.getGlobalValue()));
                cdolist_list_var = cdolist_list_var.rest();
                functionXname = cdolist_list_var.first();
            } 
        }
        return $access_path_map$.getGlobalValue();
    }

    public static SubLObject available_databases() {
        return Mapping.mapcar(CAR, $access_path_map$.getGlobalValue());
    }

    public static SubLObject get_access_path(final SubLObject name) {
        return assoc(name, $access_path_map$.getGlobalValue(), EQUALP, UNPROVIDED).rest();
    }

    public static SubLObject bln1_access_path() {
        if (NIL == $bln1_access_path$.getGlobalValue()) {
            $bln1_access_path$.setGlobalValue(sksi_access_path.new_db_access_path(NIL, $str804$bln_fusion_test_db_1, $$$sksi, $str199$, $str806$cyc11_cyc_com, NIL, $str807$standard_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$212));
        }
        return $bln1_access_path$.getGlobalValue();
    }

    public static SubLObject bln2_access_path() {
        if (NIL == $bln2_access_path$.getGlobalValue()) {
            $bln2_access_path$.setGlobalValue(sksi_access_path.new_db_access_path(NIL, $str812$bln_fusion_test_db_2, $$$sksi, $str199$, $str806$cyc11_cyc_com, NIL, $str807$standard_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$212));
        }
        return $bln2_access_path$.getGlobalValue();
    }

    public static SubLObject usgs_access_path() {
        if (NIL == $usgs_access_path$.getGlobalValue()) {
            $usgs_access_path$.setGlobalValue(sksi_access_path.new_db_access_path(NIL, $$$usgs, $$$sksi, $str199$, $str806$cyc11_cyc_com, NIL, $str814$astro_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$212));
        }
        return $usgs_access_path$.getGlobalValue();
    }

    public static SubLObject nga_access_path() {
        if (NIL == $nga_access_path$.getGlobalValue()) {
            $nga_access_path$.setGlobalValue(sksi_access_path.new_db_access_path(NIL, $$$nga, $$$sksi, $str199$, $str806$cyc11_cyc_com, NIL, $str807$standard_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$212));
        }
        return $nga_access_path$.getGlobalValue();
    }

    public static SubLObject gndb_access_path() {
        if (NIL == $gndb_access_path$.getGlobalValue()) {
            $gndb_access_path$.setGlobalValue(sksi_access_path.new_db_access_path(NIL, $$$gndb, $$$sksi, $str199$, $str806$cyc11_cyc_com, NIL, $str807$standard_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$212));
        }
        return $gndb_access_path$.getGlobalValue();
    }

    public static SubLObject sporting_goods_access_path() {
        if (NIL == $sporting_goods_access_path$.getGlobalValue()) {
            $sporting_goods_access_path$.setGlobalValue(sksi_access_path.new_db_access_path(NIL, $str817$sporting_goods, $$$sksi, $str199$, $str806$cyc11_cyc_com, NIL, $str807$standard_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$212));
        }
        return $sporting_goods_access_path$.getGlobalValue();
    }

    public static SubLObject northwind_access_path() {
        if (NIL == $northwind_access_path$.getGlobalValue()) {
            $northwind_access_path$.setGlobalValue(sksi_access_path.new_db_access_path(NIL, $$$northwind, $$$postgres, $$$postgres, $str806$cyc11_cyc_com, NIL, $str806$cyc11_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$212));
        }
        return $northwind_access_path$.getGlobalValue();
    }

    public static SubLObject bathymetric_data_access_path() {
        if (NIL == $bathymetric_data_access_path$.getGlobalValue()) {
            $bathymetric_data_access_path$.setGlobalValue(sksi_access_path.new_db_access_path(NIL, $str820$bathymetric_data, $$$postgres, $$$postgres, $str806$cyc11_cyc_com, NIL, $str806$cyc11_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$214));
        }
        return $bathymetric_data_access_path$.getGlobalValue();
    }

    public static SubLObject bathymetric_header_access_path() {
        if (NIL == $bathymetric_header_access_path$.getGlobalValue()) {
            $bathymetric_header_access_path$.setGlobalValue(sksi_access_path.new_db_access_path(NIL, $str822$bathymetric_survey, $$$postgres, $$$postgres, $str806$cyc11_cyc_com, NIL, $str806$cyc11_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$214));
        }
        return $bathymetric_header_access_path$.getGlobalValue();
    }

    public static SubLObject stub_target_access_path() {
        return sksi_access_path.new_db_access_path(NIL, $str823$semantic_etl_target_db, $$$sksi, $str199$, $str806$cyc11_cyc_com, NIL, $str814$astro_cyc_com, $int$9999, $$$postgresql, $$PostgreSQL, $int$212);
    }

    public static SubLObject access_path_pretty_string(final SubLObject access_path) {
        final SubLObject db_name = sksi_access_path.access_path_db(access_path);
        if (db_name.equalp($str804$bln_fusion_test_db_1)) {
            return $$$bln1;
        }
        if (db_name.equalp($str812$bln_fusion_test_db_2)) {
            return $$$bln2;
        }
        if (db_name.equalp($str823$semantic_etl_target_db)) {
            return $$$target;
        }
        return db_name;
    }

    public static SubLObject output_spec_copy_column_data(final SubLObject output_spec, final SubLObject from_column, final SubLObject to_column) {
        assert NIL != database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        assert NIL != column_semantics_p(from_column) : "semantic_etl_bus.column_semantics_p(from_column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(from_column) " + from_column;
        assert NIL != column_semantics_p(to_column) : "semantic_etl_bus.column_semantics_p(to_column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(to_column) " + to_column;
        SubLObject cdolist_list_var = column_semantics_value_semantics_list(from_column);
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == column_semantics_has_valueP(to_column, value)) {
                column_semantics_add_value(to_column, value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return to_column;
    }

    public static SubLObject column_semantics_has_valueP(final SubLObject column_semantics, final SubLObject value_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        assert NIL != value_semantics_p(value_semantics) : "semantic_etl_bus.value_semantics_p(value_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.value_semantics_p(value_semantics) " + value_semantics;
        SubLObject cdolist_list_var = column_semantics_value_semantics_list(column_semantics);
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (v_semant_value(value).equal(v_semant_value(value_semantics))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject column_semantics_add_value(final SubLObject column_semantics, final SubLObject value_semantics) {
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        assert NIL != value_semantics_p(value_semantics) : "semantic_etl_bus.value_semantics_p(value_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.value_semantics_p(value_semantics) " + value_semantics;
        _csetf_c_semant_value_semantics_list(column_semantics, cons(value_semantics, c_semant_value_semantics_list(column_semantics)));
        return column_semantics;
    }

    public static SubLObject table_semantics_get_column(final SubLObject table_semantics, final SubLObject field_name) {
        assert NIL != table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        assert NIL != stringp(field_name) : "Types.stringp(field_name) " + "CommonSymbols.NIL != Types.stringp(field_name) " + field_name;
        SubLObject cdolist_list_var = table_semantics_column_semantics_list(table_semantics);
        SubLObject column = NIL;
        column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (field_name.equal(column_semantics_column_name(column))) {
                return column;
            }
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject table_semantics_append_column(final SubLObject table, final SubLObject column) {
        assert NIL != table_semantics_p(table) : "semantic_etl_bus.table_semantics_p(table) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table) " + table;
        assert NIL != column_semantics_p(column) : "semantic_etl_bus.column_semantics_p(column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column) " + column;
        final SubLObject new_column = new_assimilated_column(table, column);
        _csetf_t_semant_column_semantics_list(table, append(t_semant_column_semantics_list(table), list(new_column)));
        return t_semant_column_semantics_list(table);
    }

    public static SubLObject output_spec_get_tables(final SubLObject output_spec) {
        assert NIL != database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        return semant_table_semantics_list(db_output_spec_semantics(output_spec));
    }

    public static SubLObject output_spec_get_access_paths(final SubLObject output_spec) {
        assert NIL != database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        SubLObject access_paths = NIL;
        SubLObject cdolist_list_var = output_spec_get_tables(output_spec);
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = semant_access_path(t_semant_source_semantics(table));
            if (NIL == member(item_var, access_paths, EQ, symbol_function(IDENTITY))) {
                access_paths = cons(item_var, access_paths);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        return access_paths;
    }

    public static SubLObject output_spec_get_native_column_semantics(final SubLObject output_spec, final SubLObject column_semantics) {
        assert NIL != database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        assert NIL != column_semantics_p(column_semantics) : "semantic_etl_bus.column_semantics_p(column_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column_semantics) " + column_semantics;
        final SubLObject column_name = c_semant_column_name(column_semantics);
        final SubLObject table_semantics = c_semant_table_semantics(column_semantics);
        final SubLObject source_semantics = t_semant_source_semantics(table_semantics);
        final SubLObject source_database = access_path_pretty_string(semant_access_path(source_semantics));
        SubLObject cdolist_list_var = output_spec_get_tables(output_spec);
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = table_semantics_column_semantics_list(table);
            SubLObject column = NIL;
            column = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
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
        Errors.error($str827$Can_t_find_column__a_in__a, column_semantics, output_spec);
        return NIL;
    }

    public static SubLObject output_spec_consolidate_semantic_recipe(final SubLObject output_spec, final SubLObject sql_start_index, final SubLObject sql_end_index) {
        assert NIL != database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        final SubLObject recipe_step_index = position_if(EMPTY_SEMANTIC_RECIPE_STEP_P, db_output_spec_semantic_recipe(output_spec), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject recipe_ingredients = (NIL != recipe_step_index) ? copy_list(nthcdr(recipe_step_index, db_output_spec_semantic_recipe(output_spec))) : NIL;
        final SubLObject drops = NIL;
        SubLObject adds = NIL;
        SubLObject recipe_step = NIL;
        if (NIL == recipe_ingredients) {
            return NIL;
        }
        recipe_step = recipe_ingredients.first();
        recipe_ingredients = recipe_ingredients.rest();
        set_semantic_recipe_step_column_correspondence_list(recipe_step, update_column_correspondence_list_columns(semantic_recipe_step_column_correspondence_list(recipe_step)));
        set_semantic_recipe_step_sql_start_index(recipe_step, sql_start_index);
        set_semantic_recipe_step_sql_end_index(recipe_step, sql_end_index);
        SubLObject cdolist_list_var = recipe_ingredients;
        SubLObject add_or_drop = NIL;
        add_or_drop = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject changed_obj = semantic_recipe_add_or_drop_item(add_or_drop);
            if ((NIL != semantic_recipe_add_p(add_or_drop)) && (NIL != subl_promotions.memberP(semantic_object_comparison_name(changed_obj), drops, EQ, FIRST))) {
                semantic_recipe_remove_from_drops(recipe_step, second(member(semantic_object_comparison_name(changed_obj), drops, EQ, FIRST)));
            } else
                if (NIL != semantic_recipe_add_p(add_or_drop)) {
                    adds = cons(list(semantic_object_comparison_name(changed_obj), changed_obj), adds);
                    semantic_recipe_append_to_adds(recipe_step, changed_obj);
                } else
                    if ((NIL != semantic_recipe_drop_p(add_or_drop)) && (NIL != subl_promotions.memberP(semantic_object_comparison_name(changed_obj), adds, EQ, FIRST))) {
                        semantic_recipe_remove_from_adds(recipe_step, second(member(semantic_object_comparison_name(changed_obj), adds, EQ, FIRST)));
                    } else
                        if (NIL != semantic_recipe_drop_p(add_or_drop)) {
                            adds = cons(list(semantic_object_comparison_name(changed_obj), changed_obj), adds);
                            semantic_recipe_append_to_drops(recipe_step, changed_obj);
                        } else {
                            Errors.warn($str830$unable_to_interpret__S_as_part_of);
                        }



            delete(add_or_drop, db_output_spec_semantic_recipe(output_spec), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            add_or_drop = cdolist_list_var.first();
        } 
        return output_spec;
    }

    public static SubLObject update_column_correspondence_list_columns(final SubLObject c_c_list) {
        SubLObject result_list = NIL;
        SubLObject cdolist_list_var = c_c_list;
        SubLObject column_correspondence = NIL;
        column_correspondence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = column_correspondence;
            SubLObject from_column = NIL;
            SubLObject to_column = NIL;
            SubLObject just = NIL;
            destructuring_bind_must_consp(current, datum, $list831);
            from_column = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list831);
            to_column = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list831);
            just = current.first();
            current = current.rest();
            if (NIL == current) {
                if (to_column.isList() && (to_column.first() == $COLUMN_NAMED)) {
                    final SubLObject semantics = table_semantics_semantics(column_semantics_table_semantics(from_column));
                    result_list = cons(subst(semantics_get_column_named(semantics, second(to_column), third(to_column)), to_column, column_correspondence, EQUAL, UNPROVIDED), result_list);
                } else {
                    result_list = cons(column_correspondence, result_list);
                }
            } else {
                cdestructuring_bind_error(datum, $list831);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondence = cdolist_list_var.first();
        } 
        return result_list;
    }

    public static SubLObject uniquify_columns(final SubLObject table, final SubLObject columns) {
        SubLObject new_column_names = NIL;
        final SubLObject all_names = table_semantics_column_names(table);
        SubLObject cdolist_list_var = columns;
        SubLObject column = NIL;
        column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_column_names = cons(cons(string_utilities.uniquify_string_via_set(c_semant_column_name(column), all_names, UNPROVIDED), c_semant_column_name(column)), new_column_names);
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        } 
        return nreverse(new_column_names);
    }

    public static SubLObject new_assimilated_column(final SubLObject table, final SubLObject column) {
        assert NIL != table_semantics_p(table) : "semantic_etl_bus.table_semantics_p(table) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table) " + table;
        assert NIL != column_semantics_p(column) : "semantic_etl_bus.column_semantics_p(column) " + "CommonSymbols.NIL != semantic_etl_bus.column_semantics_p(column) " + column;
        final SubLObject new_column = make_column_semantics(UNPROVIDED);
        final SubLObject all_names = table_semantics_column_names(table);
        final SubLObject new_name = string_utilities.uniquify_string_via_set(c_semant_column_name(column), all_names, UNPROVIDED);
        final SubLObject new_parses = copy_tree(c_semant_column_parses(column));
        final SubLObject new_values = copy_tree(c_semant_value_semantics_list(column));
        _csetf_c_semant_column_name(new_column, new_name);
        _csetf_c_semant_column_parses(new_column, new_parses);
        _csetf_c_semant_table_semantics(new_column, table);
        _csetf_c_semant_value_semantics_list(new_column, new_values);
        return new_column;
    }

    public static SubLObject table_semantics_column_names(final SubLObject table) {
        assert NIL != table_semantics_p(table) : "semantic_etl_bus.table_semantics_p(table) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table) " + table;
        final SubLObject names = set.new_set(EQUAL, UNPROVIDED);
        SubLObject cdolist_list_var = table_semantics_column_semantics_list(table);
        SubLObject column = NIL;
        column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(c_semant_column_name(column), names);
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        } 
        return names;
    }

    public static SubLObject output_spec_synchronize(final SubLObject output_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject recipe = db_output_spec_recipe(output_spec);
        final SubLObject i = position($recipe_marker$.getDynamicValue(thread), recipe, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject commands = nthcdr(i, recipe).rest();
        SubLObject successP = NIL;
        _csetf_semant_table_aliases(db_output_spec_semantics(output_spec), NIL);
        SubLObject cdolist_list_var = commands;
        SubLObject sql = NIL;
        sql = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            successP = output_spec_apply_sql(output_spec, sql);
            _csetf_semant_table_aliases(db_output_spec_semantics(output_spec), NIL);
            if (NIL == successP) {
                Errors.warn($str833$Didn_t_apply_command__a_to_output, sql);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sql = cdolist_list_var.first();
        } 
        _csetf_db_output_spec_recipe(output_spec, append(delete($recipe_marker$.getDynamicValue(thread), recipe, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list($recipe_marker$.getDynamicValue(thread))));
        output_spec_consolidate_semantic_recipe(output_spec, i, subtract(add(i, length(commands)), ONE_INTEGER));
        return output_spec;
    }

    public static SubLObject output_spec_apply_sql(final SubLObject output_spec, final SubLObject sql) {
        assert NIL != database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        if (NIL != sql_alter_table_p(sql)) {
            return output_spec_alter_table(output_spec, sql);
        }
        if (NIL != sql_update_p(sql)) {
            return output_spec_update(output_spec, sql);
        }
        if (NIL != sql_insert_into_p(sql)) {
            return output_spec_insert_into(output_spec, sql);
        }
        if (NIL != sql_drop_table_p(sql)) {
            return output_spec_drop_table(output_spec, sql);
        }
        if (NIL != sql_table_expression_p(sql)) {
            return output_spec_table_expression(output_spec, sql);
        }
        return NIL;
    }

    public static SubLObject output_spec_alter_table(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject table_name = sql_alter_table_table(sql);
        final SubLObject table = semantics_get_table_named(semantics, table_name);
        final SubLObject action_clause = sql_alter_table_action(sql);
        if (NIL != sql_add_column_p(action_clause)) {
            add_column_to_table(table, action_clause);
        } else
            if (NIL != sql_drop_column_p(action_clause)) {
                drop_column_from_table(table, action_clause);
            } else
                if (NIL != sql_rename_column_p(action_clause)) {
                    rename_column(table, action_clause);
                } else
                    if (NIL != sql_add_constraint_p(action_clause)) {
                        add_constraint_to_table(table, action_clause);
                    } else
                        if (NIL != sql_drop_constraint_p(action_clause)) {
                            drop_constraint_from_table(table, action_clause);
                        } else {
                            Errors.warn($str834$Apply__a_within__a_to_output_spec, action_clause, sql);
                        }




        return output_spec;
    }

    public static SubLObject add_column_to_table(final SubLObject table, final SubLObject add_clause) {
        final SubLObject column_name = sql_add_column_column(add_clause);
        final SubLObject table_name = table_semantics_table_name(table);
        if (NIL != table_semantics_get_column_named(table, column_name)) {
            Errors.error($str835$Can_t_add_new_column__a_to__a_sin, new SubLObject[]{ column_name, table_name, column_name, table_name });
        }
        final SubLObject column_type = sql_add_column_type(add_clause);
        final SubLObject column_size = sql_add_column_size(add_clause);
        final SubLObject column = new_column_semantics(column_name, metadata_parser.semantic_etl_parse_column_name(column_name, UNPROVIDED), column_type, column_size);
        _csetf_c_semant_table_semantics(column, table);
        _csetf_t_semant_column_semantics_list(table, append(t_semant_column_semantics_list(table), list(column)));
        table_semantics_append_to_semantic_recipe(table, new_semantic_recipe_add(column));
        return table;
    }

    public static SubLObject drop_column_from_table(final SubLObject table, final SubLObject drop_clause) {
        final SubLObject column_name = sql_drop_column_column(drop_clause);
        final SubLObject column = table_semantics_get_column_named(table, column_name);
        table_semantics_delete_column(table, column);
        return table;
    }

    public static SubLObject rename_column(final SubLObject table, final SubLObject rename_clause) {
        final SubLObject old_column_name = sql_rename_column_old_column(rename_clause);
        final SubLObject old_column = table_semantics_get_column_named(table, old_column_name);
        final SubLObject new_column_name = sql_rename_column_new_column(rename_clause);
        set_column_semantics_name(old_column, new_column_name);
        return table;
    }

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

    public static SubLObject drop_constraint_from_table(final SubLObject table, final SubLObject drop_clause) {
        final SubLObject table_constraint = sql_drop_constraint_constraint(drop_clause);
        final SubLObject column_constraint = sql_fk_table_constraint_constraint(table_constraint);
        final SubLObject constraint_name = sql_fk_column_constraint_name(column_constraint);
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = table_semantics_foreign_key_constraints(table);
            SubLObject constraint = NIL;
            constraint = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
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

    public static SubLObject output_spec_update(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject target_table_name = sql_update_table(sql);
        final SubLObject target_table = semantics_get_table_named(semantics, target_table_name);
        SubLObject cdolist_list_var;
        final SubLObject settings = cdolist_list_var = sql_update_settings(sql);
        SubLObject setting = NIL;
        setting = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject target_column_name = sql_column_equal_column1(setting);
            final SubLObject target_column = table_semantics_get_column_named(target_table, target_column_name);
            final SubLObject source_table_name = sql_column_equal_table2(setting);
            final SubLObject source_table = semantics_get_table_named(semantics, source_table_name);
            final SubLObject source_column_name = sql_column_equal_column2(setting);
            final SubLObject source_column = table_semantics_get_column_named(source_table, source_column_name);
            SubLObject cdolist_list_var_$9 = column_semantics_value_semantics_list(source_column);
            SubLObject value = NIL;
            value = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                _csetf_c_semant_value_semantics_list(target_column, cons(value, c_semant_value_semantics_list(target_column)));
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                value = cdolist_list_var_$9.first();
            } 
            _csetf_c_semant_value_semantics_list(target_column, remove_duplicates(c_semant_value_semantics_list(target_column), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            setting = cdolist_list_var.first();
        } 
        return output_spec;
    }

    public static SubLObject output_spec_table_expression(final SubLObject output_spec, final SubLObject sql) {
        if (NIL != sql_select_from_p(sql)) {
            return output_spec_select_from(output_spec, sql);
        }
        if (NIL != sql_inner_join_p(sql)) {
            return output_spec_inner_join(output_spec, sql);
        }
        if (NIL != sql_except_p(sql)) {
            return output_spec_except(output_spec, sql);
        }
        if (NIL != sql_alias_p(sql)) {
            return output_spec_alias(output_spec, sql);
        }
        Errors.error($str836$table_expression__a_unimplemented, sql);
        return NIL;
    }

    public static SubLObject output_spec_alias(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject table_expr = sql_alias_table(sql);
        final SubLObject rs = output_spec_table_expression(output_spec, table_expr);
        final SubLObject alias = sql_alias_alias(sql);
        final SubLObject columns = column_semantics_from_result_set(rs);
        final SubLObject aliased_table = new_table_semantics(alias, NIL, columns, NIL);
        _csetf_t_semant_semantics(aliased_table, semantics);
        _csetf_semant_table_aliases(semantics, cons(aliased_table, semant_table_aliases(semantics)));
        return rs;
    }

    public static SubLObject column_semantics_from_result_set(final SubLObject result_set) {
        SubLObject columns = NIL;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject index;
        SubLObject column_value_list;
        SubLObject column;
        for (length = length(result_set), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            index = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            column_value_list = aref(result_set, index);
            column = new_column_semantics(string_utilities.str(index), NIL, UNPROVIDED, UNPROVIDED);
            _csetf_c_semant_value_semantics_list(column, column_value_list);
            columns = cons(column, columns);
        }
        return nreverse(columns);
    }

    public static SubLObject output_spec_except(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject sql2 = sql_except_table1(sql);
        final SubLObject rs1 = output_spec_table_expression(output_spec, sql2);
        return rs1;
    }

    public static SubLObject output_spec_inner_join(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject table_expr1 = sql_inner_join_table1(sql);
        final SubLObject table1 = output_spec_apply_sql(output_spec, table_expr1);
        return table1;
    }

    public static SubLObject output_spec_select_from(final SubLObject output_spec, final SubLObject sql) {
        assert NIL != database_output_spec_p(output_spec) : "semantic_etl_bus.database_output_spec_p(output_spec) " + "CommonSymbols.NIL != semantic_etl_bus.database_output_spec_p(output_spec) " + output_spec;
        assert NIL != sql_select_from_p(sql) : "semantic_etl_bus.sql_select_from_p(sql) " + "CommonSymbols.NIL != semantic_etl_bus.sql_select_from_p(sql) " + sql;
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject column_names = sql_select_from_columns(sql);
        final SubLObject column_count = length(column_names);
        final SubLObject table_names = sql_select_from_tables(sql);
        final SubLObject rs = make_vector(column_count, UNPROVIDED);
        SubLObject columns = NIL;
        SubLObject tables = NIL;
        SubLObject cdolist_list_var = table_names;
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tables = cons(semantics_get_table_named(semantics, name), tables);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        cdolist_list_var = column_names;
        name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject columns_named_identically = NIL;
            SubLObject cdolist_list_var_$10 = tables;
            SubLObject table = NIL;
            table = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                final SubLObject column = table_semantics_get_column_named(table, name);
                if (NIL != column) {
                    columns_named_identically = cons(column, columns_named_identically);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                table = cdolist_list_var_$10.first();
            } 
            if (NIL == list_utilities.singletonP(columns_named_identically)) {
                Errors.error($str837$ambiguity_in_select_clause___a_id, name, columns_named_identically, sql);
            }
            columns = cons(columns_named_identically.first(), columns);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        columns = nreverse(columns);
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = columns;
        SubLObject column2 = NIL;
        column2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            set_aref(rs, i, c_semant_value_semantics_list(column2));
            i = add(i, ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            column2 = cdolist_list_var2.first();
        } 
        return rs;
    }

    public static SubLObject output_spec_insert_into(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject target_table_name = sql_insert_into_table(sql);
        final SubLObject target_table = semantics_get_table_named(semantics, target_table_name);
        final SubLObject target_column_names = sql_insert_into_columns(sql);
        SubLObject target_columns = NIL;
        final SubLObject table_expression = sql_insert_into_data(sql);
        final SubLObject source_columns = output_spec_table_expression(output_spec, table_expression);
        if (!length(target_column_names).numE(length(source_columns))) {
            Errors.error($str838$source_result_set__a_and_target__, new SubLObject[]{ source_columns, target_column_names, length(source_columns), length(target_column_names), sql });
        }
        SubLObject cdolist_list_var = target_column_names;
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            target_columns = cons(table_semantics_get_column_named(target_table, name), target_columns);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        target_columns = nreverse(target_columns);
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = target_columns;
        SubLObject target_column = NIL;
        target_column = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject cdolist_list_var_$11 = aref(source_columns, i);
            SubLObject value = NIL;
            value = cdolist_list_var_$11.first();
            while (NIL != cdolist_list_var_$11) {
                _csetf_c_semant_value_semantics_list(target_column, cons(value, c_semant_value_semantics_list(target_column)));
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                value = cdolist_list_var_$11.first();
            } 
            _csetf_c_semant_value_semantics_list(target_column, remove_duplicates(c_semant_value_semantics_list(target_column), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            i = add(i, ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            target_column = cdolist_list_var2.first();
        } 
        return output_spec;
    }

    public static SubLObject output_spec_drop_table(final SubLObject output_spec, final SubLObject sql) {
        final SubLObject semantics = db_output_spec_semantics(output_spec);
        final SubLObject table_name = sql_drop_table_table(sql);
        final SubLObject table = semantics_get_table_named(semantics, table_name);
        semantics_delete_table(semantics, table);
        return output_spec;
    }

    public static SubLObject declare_semantic_etl_bus_file() {
        declareMacro(me, "do_table_semantics", "DO-TABLE-SEMANTICS");
        declareMacro(me, "do_table_semantics_column_constraints", "DO-TABLE-SEMANTICS-COLUMN-CONSTRAINTS");
        declareFunction(me, "initialize_semantic_etl_infrastructure", "INITIALIZE-SEMANTIC-ETL-INFRASTRUCTURE", 0, 0, false);
        declareFunction(me, "get_db_output_spec", "GET-DB-OUTPUT-SPEC", 1, 0, false);
        declareFunction(me, "put_db_output_spec", "PUT-DB-OUTPUT-SPEC", 2, 0, false);
        declareFunction(me, "remove_db_output_spec", "REMOVE-DB-OUTPUT-SPEC", 1, 0, false);
        declareFunction(me, "clear_db_output_specs", "CLEAR-DB-OUTPUT-SPECS", 0, 0, false);
        declareFunction(me, "database_fusion_loop", "DATABASE-FUSION-LOOP", 2, 0, false);
        declareFunction(me, "clear_semantic_etl_fuse_databases", "CLEAR-SEMANTIC-ETL-FUSE-DATABASES", 0, 0, false);
        declareFunction(me, "remove_semantic_etl_fuse_databases", "REMOVE-SEMANTIC-ETL-FUSE-DATABASES", 1, 0, false);
        declareFunction(me, "semantic_etl_fuse_databases_internal", "SEMANTIC-ETL-FUSE-DATABASES-INTERNAL", 1, 0, false);
        declareFunction(me, "semantic_etl_fuse_databases", "SEMANTIC-ETL-FUSE-DATABASES", 1, 0, false);
        declareFunction(me, "semantic_etl_parse_metadata_and_data", "SEMANTIC-ETL-PARSE-METADATA-AND-DATA", 1, 0, false);
        declareFunction(me, "semantic_etl_get_db_structure", "SEMANTIC-ETL-GET-DB-STRUCTURE", 1, 0, false);
        declareFunction(me, "find_corresponding_item_in_semantics", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS", 2, 0, false);
        declareFunction(me, "semantic_object_comparison_name", "SEMANTIC-OBJECT-COMPARISON-NAME", 1, 0, false);
        declareFunction(me, "semantics_print_function_trampoline", "SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "semantics_p", "SEMANTICS-P", 1, 0, false);
        new semantic_etl_bus.$semantics_p$UnaryFunction();
        declareFunction(me, "semant_access_path", "SEMANT-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "semant_table_semantics_list", "SEMANT-TABLE-SEMANTICS-LIST", 1, 0, false);
        declareFunction(me, "semant_table_aliases", "SEMANT-TABLE-ALIASES", 1, 0, false);
        declareFunction(me, "semant_dict", "SEMANT-DICT", 1, 0, false);
        declareFunction(me, "semant_dropped_items", "SEMANT-DROPPED-ITEMS", 1, 0, false);
        declareFunction(me, "semant_output_spec", "SEMANT-OUTPUT-SPEC", 1, 0, false);
        declareFunction(me, "_csetf_semant_access_path", "_CSETF-SEMANT-ACCESS-PATH", 2, 0, false);
        declareFunction(me, "_csetf_semant_table_semantics_list", "_CSETF-SEMANT-TABLE-SEMANTICS-LIST", 2, 0, false);
        declareFunction(me, "_csetf_semant_table_aliases", "_CSETF-SEMANT-TABLE-ALIASES", 2, 0, false);
        declareFunction(me, "_csetf_semant_dict", "_CSETF-SEMANT-DICT", 2, 0, false);
        declareFunction(me, "_csetf_semant_dropped_items", "_CSETF-SEMANT-DROPPED-ITEMS", 2, 0, false);
        declareFunction(me, "_csetf_semant_output_spec", "_CSETF-SEMANT-OUTPUT-SPEC", 2, 0, false);
        declareFunction(me, "make_semantics", "MAKE-SEMANTICS", 0, 1, false);
        declareFunction(me, "visit_defstruct_semantics", "VISIT-DEFSTRUCT-SEMANTICS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_semantics_method", "VISIT-DEFSTRUCT-OBJECT-SEMANTICS-METHOD", 2, 0, false);
        declareFunction(me, "print_semantics", "PRINT-SEMANTICS", 3, 0, false);
        declareFunction(me, "semantics_access_path", "SEMANTICS-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "semantics_table_semantics_list", "SEMANTICS-TABLE-SEMANTICS-LIST", 1, 0, false);
        declareFunction(me, "semantics_get_table_named", "SEMANTICS-GET-TABLE-NAMED", 2, 0, false);
        declareFunction(me, "semantics_get_column_named", "SEMANTICS-GET-COLUMN-NAMED", 3, 0, false);
        declareFunction(me, "semantics_get_table_with_id", "SEMANTICS-GET-TABLE-WITH-ID", 2, 0, false);
        declareFunction(me, "new_semantics", "NEW-SEMANTICS", 2, 0, false);
        declareFunction(me, "copy_semantics", "COPY-SEMANTICS", 1, 0, false);
        declareFunction(me, "semantics_add_column_constraints", "SEMANTICS-ADD-COLUMN-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "semantics_delete_table", "SEMANTICS-DELETE-TABLE", 2, 0, false);
        declareFunction(me, "semantics_delete_foreign_references_to_table", "SEMANTICS-DELETE-FOREIGN-REFERENCES-TO-TABLE", 2, 0, false);
        declareFunction(me, "semantics_dropped_tables", "SEMANTICS-DROPPED-TABLES", 1, 0, false);
        declareFunction(me, "semantics_dropped_columns", "SEMANTICS-DROPPED-COLUMNS", 1, 0, false);
        declareFunction(me, "semantics_dropped_primary_key_constraints", "SEMANTICS-DROPPED-PRIMARY-KEY-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "semantics_dropped_foreign_key_constraints", "SEMANTICS-DROPPED-FOREIGN-KEY-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "table_semantics_print_function_trampoline", "TABLE-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "table_semantics_p", "TABLE-SEMANTICS-P", 1, 0, false);
        new semantic_etl_bus.$table_semantics_p$UnaryFunction();
        declareFunction(me, "t_semant_table_id", "T-SEMANT-TABLE-ID", 1, 0, false);
        declareFunction(me, "t_semant_table_name", "T-SEMANT-TABLE-NAME", 1, 0, false);
        declareFunction(me, "t_semant_source_semantics", "T-SEMANT-SOURCE-SEMANTICS", 1, 0, false);
        declareFunction(me, "t_semant_semantics", "T-SEMANT-SEMANTICS", 1, 0, false);
        declareFunction(me, "t_semant_points_to_table_ids", "T-SEMANT-POINTS-TO-TABLE-IDS", 1, 0, false);
        declareFunction(me, "t_semant_pointed_to_by_table_ids", "T-SEMANT-POINTED-TO-BY-TABLE-IDS", 1, 0, false);
        declareFunction(me, "t_semant_table_parses", "T-SEMANT-TABLE-PARSES", 1, 0, false);
        declareFunction(me, "t_semant_column_semantics_list", "T-SEMANT-COLUMN-SEMANTICS-LIST", 1, 0, false);
        declareFunction(me, "t_semant_primary_key_columns", "T-SEMANT-PRIMARY-KEY-COLUMNS", 1, 0, false);
        declareFunction(me, "t_semant_column_constraints", "T-SEMANT-COLUMN-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "_csetf_t_semant_table_id", "_CSETF-T-SEMANT-TABLE-ID", 2, 0, false);
        declareFunction(me, "_csetf_t_semant_table_name", "_CSETF-T-SEMANT-TABLE-NAME", 2, 0, false);
        declareFunction(me, "_csetf_t_semant_source_semantics", "_CSETF-T-SEMANT-SOURCE-SEMANTICS", 2, 0, false);
        declareFunction(me, "_csetf_t_semant_semantics", "_CSETF-T-SEMANT-SEMANTICS", 2, 0, false);
        declareFunction(me, "_csetf_t_semant_points_to_table_ids", "_CSETF-T-SEMANT-POINTS-TO-TABLE-IDS", 2, 0, false);
        declareFunction(me, "_csetf_t_semant_pointed_to_by_table_ids", "_CSETF-T-SEMANT-POINTED-TO-BY-TABLE-IDS", 2, 0, false);
        declareFunction(me, "_csetf_t_semant_table_parses", "_CSETF-T-SEMANT-TABLE-PARSES", 2, 0, false);
        declareFunction(me, "_csetf_t_semant_column_semantics_list", "_CSETF-T-SEMANT-COLUMN-SEMANTICS-LIST", 2, 0, false);
        declareFunction(me, "_csetf_t_semant_primary_key_columns", "_CSETF-T-SEMANT-PRIMARY-KEY-COLUMNS", 2, 0, false);
        declareFunction(me, "_csetf_t_semant_column_constraints", "_CSETF-T-SEMANT-COLUMN-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "make_table_semantics", "MAKE-TABLE-SEMANTICS", 0, 1, false);
        declareFunction(me, "visit_defstruct_table_semantics", "VISIT-DEFSTRUCT-TABLE-SEMANTICS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_table_semantics_method", "VISIT-DEFSTRUCT-OBJECT-TABLE-SEMANTICS-METHOD", 2, 0, false);
        declareFunction(me, "print_table_semantics", "PRINT-TABLE-SEMANTICS", 3, 0, false);
        declareMacro(me, "do_column_semantics", "DO-COLUMN-SEMANTICS");
        declareFunction(me, "new_table_semantics", "NEW-TABLE-SEMANTICS", 4, 0, false);
        declareFunction(me, "copy_table_semantics_list", "COPY-TABLE-SEMANTICS-LIST", 1, 0, false);
        declareFunction(me, "get_columns_named", "GET-COLUMNS-NAMED", 2, 0, false);
        declareFunction(me, "table_semantics_list_get_table_semantics_named", "TABLE-SEMANTICS-LIST-GET-TABLE-SEMANTICS-NAMED", 2, 0, false);
        declareFunction(me, "table_semantics_table_id", "TABLE-SEMANTICS-TABLE-ID", 1, 0, false);
        declareFunction(me, "table_semantics_table_name", "TABLE-SEMANTICS-TABLE-NAME", 1, 0, false);
        declareFunction(me, "table_semantics_source_semantics", "TABLE-SEMANTICS-SOURCE-SEMANTICS", 1, 0, false);
        declareFunction(me, "table_semantics_semantics", "TABLE-SEMANTICS-SEMANTICS", 1, 0, false);
        declareFunction(me, "table_semantics_linked_table_ids", "TABLE-SEMANTICS-LINKED-TABLE-IDS", 1, 0, false);
        declareFunction(me, "table_semantics_points_to_table_ids", "TABLE-SEMANTICS-POINTS-TO-TABLE-IDS", 1, 0, false);
        declareFunction(me, "table_semantics_pointed_to_by_table_ids", "TABLE-SEMANTICS-POINTED-TO-BY-TABLE-IDS", 1, 0, false);
        declareFunction(me, "table_semantics_pointed_to_by_tables", "TABLE-SEMANTICS-POINTED-TO-BY-TABLES", 1, 0, false);
        declareFunction(me, "table_semantics_primary_key_columns", "TABLE-SEMANTICS-PRIMARY-KEY-COLUMNS", 1, 0, false);
        declareFunction(me, "table_semantics_table_parses", "TABLE-SEMANTICS-TABLE-PARSES", 1, 0, false);
        declareFunction(me, "table_semantics_column_semantics_list", "TABLE-SEMANTICS-COLUMN-SEMANTICS-LIST", 1, 0, false);
        declareFunction(me, "table_semantics_column_constraints", "TABLE-SEMANTICS-COLUMN-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "set_table_semantics_semantics", "SET-TABLE-SEMANTICS-SEMANTICS", 2, 0, false);
        declareFunction(me, "set_table_semantics_pointed_to_by_table_ids", "SET-TABLE-SEMANTICS-POINTED-TO-BY-TABLE-IDS", 2, 0, false);
        declareFunction(me, "set_table_semantics_points_to_table_ids", "SET-TABLE-SEMANTICS-POINTS-TO-TABLE-IDS", 2, 0, false);
        declareFunction(me, "set_table_semantics_primary_key_columns", "SET-TABLE-SEMANTICS-PRIMARY-KEY-COLUMNS", 2, 0, false);
        declareFunction(me, "set_table_semantics_source_semantics", "SET-TABLE-SEMANTICS-SOURCE-SEMANTICS", 2, 0, false);
        declareFunction(me, "set_table_semantics_column_constraints", "SET-TABLE-SEMANTICS-COLUMN-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "find_corresponding_item_in_semantics_table_semantics_method", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS-TABLE-SEMANTICS-METHOD", 2, 0, false);
        declareFunction(me, "semantic_object_comparison_name_table_semantics_method", "SEMANTIC-OBJECT-COMPARISON-NAME-TABLE-SEMANTICS-METHOD", 1, 0, false);
        declareFunction(me, "table_semantics_append_to_semantic_recipe", "TABLE-SEMANTICS-APPEND-TO-SEMANTIC-RECIPE", 2, 0, false);
        declareFunction(me, "table_semantics_output_spec", "TABLE-SEMANTICS-OUTPUT-SPEC", 1, 0, false);
        declareFunction(me, "table_semantics_imported_key_columns", "TABLE-SEMANTICS-IMPORTED-KEY-COLUMNS", 1, 0, false);
        declareFunction(me, "table_semantics_foreign_key_constraints", "TABLE-SEMANTICS-FOREIGN-KEY-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "table_semantics_primary_key_constraints", "TABLE-SEMANTICS-PRIMARY-KEY-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "table_semantics_column_count", "TABLE-SEMANTICS-COLUMN-COUNT", 1, 0, false);
        declareFunction(me, "table_semantics_get_column_named", "TABLE-SEMANTICS-GET-COLUMN-NAMED", 2, 0, false);
        declareFunction(me, "table_semantics_content_columns", "TABLE-SEMANTICS-CONTENT-COLUMNS", 1, 0, false);
        declareFunction(me, "content_columnP", "CONTENT-COLUMN?", 1, 0, false);
        declareFunction(me, "imported_key_columnP", "IMPORTED-KEY-COLUMN?", 1, 0, false);
        declareFunction(me, "primary_key_columnP", "PRIMARY-KEY-COLUMN?", 1, 0, false);
        declareFunction(me, "table_semantics_add_column_constraint", "TABLE-SEMANTICS-ADD-COLUMN-CONSTRAINT", 2, 0, false);
        declareFunction(me, "table_semantics_remove_column_constraint", "TABLE-SEMANTICS-REMOVE-COLUMN-CONSTRAINT", 2, 0, false);
        declareFunction(me, "update_table_semantics_column_constraints", "UPDATE-TABLE-SEMANTICS-COLUMN-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "table_semantics_delete_column", "TABLE-SEMANTICS-DELETE-COLUMN", 2, 0, false);
        declareFunction(me, "table_semantics_delete_foreign_references_to_column", "TABLE-SEMANTICS-DELETE-FOREIGN-REFERENCES-TO-COLUMN", 2, 0, false);
        declareFunction(me, "table_semantics_delete_column_constraint", "TABLE-SEMANTICS-DELETE-COLUMN-CONSTRAINT", 2, 0, false);
        declareFunction(me, "other_foreign_key_constraints_reference_table", "OTHER-FOREIGN-KEY-CONSTRAINTS-REFERENCE-TABLE", 2, 0, false);
        declareFunction(me, "table_name_to_id_dict", "TABLE-NAME-TO-ID-DICT", 1, 0, false);
        declareFunction(me, "table_id_to_table_semantics_dict", "TABLE-ID-TO-TABLE-SEMANTICS-DICT", 1, 0, false);
        declareFunction(me, "column_constraint_p", "COLUMN-CONSTRAINT-P", 1, 0, false);
        declareFunction(me, "copy_column_constraint", "COPY-COLUMN-CONSTRAINT", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_print_function_trampoline", "FOREIGN-KEY-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "foreign_key_constraint_p", "FOREIGN-KEY-CONSTRAINT-P", 1, 0, false);
        new semantic_etl_bus.$foreign_key_constraint_p$UnaryFunction();
        declareFunction(me, "fk_constraint_constraint_name", "FK-CONSTRAINT-CONSTRAINT-NAME", 1, 0, false);
        declareFunction(me, "fk_constraint_constrained_column", "FK-CONSTRAINT-CONSTRAINED-COLUMN", 1, 0, false);
        declareFunction(me, "fk_constraint_constraining_table", "FK-CONSTRAINT-CONSTRAINING-TABLE", 1, 0, false);
        declareFunction(me, "fk_constraint_constraining_column", "FK-CONSTRAINT-CONSTRAINING-COLUMN", 1, 0, false);
        declareFunction(me, "_csetf_fk_constraint_constraint_name", "_CSETF-FK-CONSTRAINT-CONSTRAINT-NAME", 2, 0, false);
        declareFunction(me, "_csetf_fk_constraint_constrained_column", "_CSETF-FK-CONSTRAINT-CONSTRAINED-COLUMN", 2, 0, false);
        declareFunction(me, "_csetf_fk_constraint_constraining_table", "_CSETF-FK-CONSTRAINT-CONSTRAINING-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_fk_constraint_constraining_column", "_CSETF-FK-CONSTRAINT-CONSTRAINING-COLUMN", 2, 0, false);
        declareFunction(me, "make_foreign_key_constraint", "MAKE-FOREIGN-KEY-CONSTRAINT", 0, 1, false);
        declareFunction(me, "visit_defstruct_foreign_key_constraint", "VISIT-DEFSTRUCT-FOREIGN-KEY-CONSTRAINT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_foreign_key_constraint_method", "VISIT-DEFSTRUCT-OBJECT-FOREIGN-KEY-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction(me, "print_foreign_key_constraint", "PRINT-FOREIGN-KEY-CONSTRAINT", 3, 0, false);
        declareFunction(me, "new_foreign_key_constraint", "NEW-FOREIGN-KEY-CONSTRAINT", 3, 0, false);
        declareFunction(me, "copy_foreign_key_constraint", "COPY-FOREIGN-KEY-CONSTRAINT", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_constraint_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINT-NAME", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_constrained_column", "FOREIGN-KEY-CONSTRAINT-CONSTRAINED-COLUMN", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_constraining_column", "FOREIGN-KEY-CONSTRAINT-CONSTRAINING-COLUMN", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_constraining_table", "FOREIGN-KEY-CONSTRAINT-CONSTRAINING-TABLE", 1, 0, false);
        declareFunction(me, "set_foreign_key_constraint_constraint_name", "SET-FOREIGN-KEY-CONSTRAINT-CONSTRAINT-NAME", 2, 0, false);
        declareFunction(me, "set_foreign_key_constraint_constrained_column", "SET-FOREIGN-KEY-CONSTRAINT-CONSTRAINED-COLUMN", 2, 0, false);
        declareFunction(me, "set_foreign_key_constraint_constraining_column", "SET-FOREIGN-KEY-CONSTRAINT-CONSTRAINING-COLUMN", 2, 0, false);
        declareFunction(me, "set_foreign_key_constraint_constraining_table", "SET-FOREIGN-KEY-CONSTRAINT-CONSTRAINING-TABLE", 2, 0, false);
        declareFunction(me, "find_corresponding_item_in_semantics_foreign_key_constraint_method", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS-FOREIGN-KEY-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction(me, "semantic_object_comparison_name_foreign_key_constraint_method", "SEMANTIC-OBJECT-COMPARISON-NAME-FOREIGN-KEY-CONSTRAINT-METHOD", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_constrained_table", "FOREIGN-KEY-CONSTRAINT-CONSTRAINED-TABLE", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_references_tableP", "FOREIGN-KEY-CONSTRAINT-REFERENCES-TABLE?", 2, 0, false);
        declareFunction(me, "foreign_key_constraint_references_columnP", "FOREIGN-KEY-CONSTRAINT-REFERENCES-COLUMN?", 2, 0, false);
        declareFunction(me, "foreign_key_constraints_reference_columns_other_than_in_table", "FOREIGN-KEY-CONSTRAINTS-REFERENCE-COLUMNS-OTHER-THAN-IN-TABLE", 3, 0, false);
        declareFunction(me, "foreign_key_constraint_constrained_column_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINED-COLUMN-NAME", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_constrained_table_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINED-TABLE-NAME", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_constraining_column_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINING-COLUMN-NAME", 1, 0, false);
        declareFunction(me, "foreign_key_constraint_constraining_table_name", "FOREIGN-KEY-CONSTRAINT-CONSTRAINING-TABLE-NAME", 1, 0, false);
        declareFunction(me, "primary_key_constraint_print_function_trampoline", "PRIMARY-KEY-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "primary_key_constraint_p", "PRIMARY-KEY-CONSTRAINT-P", 1, 0, false);
        new semantic_etl_bus.$primary_key_constraint_p$UnaryFunction();
        declareFunction(me, "pk_constraint_constraint_name", "PK-CONSTRAINT-CONSTRAINT-NAME", 1, 0, false);
        declareFunction(me, "pk_constraint_constraint_type", "PK-CONSTRAINT-CONSTRAINT-TYPE", 1, 0, false);
        declareFunction(me, "pk_constraint_constrained_column", "PK-CONSTRAINT-CONSTRAINED-COLUMN", 1, 0, false);
        declareFunction(me, "_csetf_pk_constraint_constraint_name", "_CSETF-PK-CONSTRAINT-CONSTRAINT-NAME", 2, 0, false);
        declareFunction(me, "_csetf_pk_constraint_constraint_type", "_CSETF-PK-CONSTRAINT-CONSTRAINT-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_pk_constraint_constrained_column", "_CSETF-PK-CONSTRAINT-CONSTRAINED-COLUMN", 2, 0, false);
        declareFunction(me, "make_primary_key_constraint", "MAKE-PRIMARY-KEY-CONSTRAINT", 0, 1, false);
        declareFunction(me, "visit_defstruct_primary_key_constraint", "VISIT-DEFSTRUCT-PRIMARY-KEY-CONSTRAINT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_primary_key_constraint_method", "VISIT-DEFSTRUCT-OBJECT-PRIMARY-KEY-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction(me, "print_primary_key_constraint", "PRINT-PRIMARY-KEY-CONSTRAINT", 3, 0, false);
        declareFunction(me, "new_primary_key_constraint", "NEW-PRIMARY-KEY-CONSTRAINT", 2, 0, false);
        declareFunction(me, "copy_primary_key_constraint", "COPY-PRIMARY-KEY-CONSTRAINT", 1, 0, false);
        declareFunction(me, "primary_key_constraint_constraint_name", "PRIMARY-KEY-CONSTRAINT-CONSTRAINT-NAME", 1, 0, false);
        declareFunction(me, "primary_key_constraint_constrained_column", "PRIMARY-KEY-CONSTRAINT-CONSTRAINED-COLUMN", 1, 0, false);
        declareFunction(me, "set_primary_key_constraint_constraint_name", "SET-PRIMARY-KEY-CONSTRAINT-CONSTRAINT-NAME", 2, 0, false);
        declareFunction(me, "set_primary_key_constraint_constrained_column", "SET-PRIMARY-KEY-CONSTRAINT-CONSTRAINED-COLUMN", 2, 0, false);
        declareFunction(me, "find_corresponding_item_in_semantics_primary_key_constraint_method", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS-PRIMARY-KEY-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction(me, "semantic_object_comparison_name_primary_key_constraint_method", "SEMANTIC-OBJECT-COMPARISON-NAME-PRIMARY-KEY-CONSTRAINT-METHOD", 1, 0, false);
        declareFunction(me, "primary_key_constraint_constrained_table", "PRIMARY-KEY-CONSTRAINT-CONSTRAINED-TABLE", 1, 0, false);
        declareFunction(me, "primary_key_constraint_constrained_table_name", "PRIMARY-KEY-CONSTRAINT-CONSTRAINED-TABLE-NAME", 1, 0, false);
        declareFunction(me, "primary_key_constraint_constrained_column_name", "PRIMARY-KEY-CONSTRAINT-CONSTRAINED-COLUMN-NAME", 1, 0, false);
        declareFunction(me, "column_semantics_print_function_trampoline", "COLUMN-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "column_semantics_p", "COLUMN-SEMANTICS-P", 1, 0, false);
        new semantic_etl_bus.$column_semantics_p$UnaryFunction();
        declareFunction(me, "c_semant_column_name", "C-SEMANT-COLUMN-NAME", 1, 0, false);
        declareFunction(me, "c_semant_column_parses", "C-SEMANT-COLUMN-PARSES", 1, 0, false);
        declareFunction(me, "c_semant_table_semantics", "C-SEMANT-TABLE-SEMANTICS", 1, 0, false);
        declareFunction(me, "c_semant_value_semantics_list", "C-SEMANT-VALUE-SEMANTICS-LIST", 1, 0, false);
        declareFunction(me, "c_semant_column_type", "C-SEMANT-COLUMN-TYPE", 1, 0, false);
        declareFunction(me, "c_semant_column_size", "C-SEMANT-COLUMN-SIZE", 1, 0, false);
        declareFunction(me, "_csetf_c_semant_column_name", "_CSETF-C-SEMANT-COLUMN-NAME", 2, 0, false);
        declareFunction(me, "_csetf_c_semant_column_parses", "_CSETF-C-SEMANT-COLUMN-PARSES", 2, 0, false);
        declareFunction(me, "_csetf_c_semant_table_semantics", "_CSETF-C-SEMANT-TABLE-SEMANTICS", 2, 0, false);
        declareFunction(me, "_csetf_c_semant_value_semantics_list", "_CSETF-C-SEMANT-VALUE-SEMANTICS-LIST", 2, 0, false);
        declareFunction(me, "_csetf_c_semant_column_type", "_CSETF-C-SEMANT-COLUMN-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_c_semant_column_size", "_CSETF-C-SEMANT-COLUMN-SIZE", 2, 0, false);
        declareFunction(me, "make_column_semantics", "MAKE-COLUMN-SEMANTICS", 0, 1, false);
        declareFunction(me, "visit_defstruct_column_semantics", "VISIT-DEFSTRUCT-COLUMN-SEMANTICS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_column_semantics_method", "VISIT-DEFSTRUCT-OBJECT-COLUMN-SEMANTICS-METHOD", 2, 0, false);
        declareFunction(me, "print_column_semantics", "PRINT-COLUMN-SEMANTICS", 3, 0, false);
        declareMacro(me, "do_value_semantics", "DO-VALUE-SEMANTICS");
        declareFunction(me, "new_column_semantics", "NEW-COLUMN-SEMANTICS", 2, 2, false);
        declareFunction(me, "new_column_semantics_list", "NEW-COLUMN-SEMANTICS-LIST", 1, 0, false);
        declareFunction(me, "copy_column_semantics", "COPY-COLUMN-SEMANTICS", 1, 0, false);
        declareFunction(me, "copy_column_semantics_list", "COPY-COLUMN-SEMANTICS-LIST", 1, 0, false);
        declareFunction(me, "column_semantics_column_name", "COLUMN-SEMANTICS-COLUMN-NAME", 1, 0, false);
        declareFunction(me, "column_semantics_column_parses", "COLUMN-SEMANTICS-COLUMN-PARSES", 1, 0, false);
        declareFunction(me, "column_semantics_column_type", "COLUMN-SEMANTICS-COLUMN-TYPE", 1, 0, false);
        declareFunction(me, "column_semantics_expanded_column_type", "COLUMN-SEMANTICS-EXPANDED-COLUMN-TYPE", 1, 0, false);
        declareFunction(me, "column_semantics_column_size", "COLUMN-SEMANTICS-COLUMN-SIZE", 1, 0, false);
        declareFunction(me, "column_semantics_table_semantics", "COLUMN-SEMANTICS-TABLE-SEMANTICS", 1, 0, false);
        declareFunction(me, "column_semantics_value_semantics_list", "COLUMN-SEMANTICS-VALUE-SEMANTICS-LIST", 1, 0, false);
        declareFunction(me, "column_semantics_referencing_foreign_key_constraints", "COLUMN-SEMANTICS-REFERENCING-FOREIGN-KEY-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "column_semantics_foreign_key_constraint", "COLUMN-SEMANTICS-FOREIGN-KEY-CONSTRAINT", 1, 0, false);
        declareFunction(me, "set_column_semantics_column_type", "SET-COLUMN-SEMANTICS-COLUMN-TYPE", 2, 0, false);
        declareFunction(me, "set_column_semantics_column_size", "SET-COLUMN-SEMANTICS-COLUMN-SIZE", 2, 0, false);
        declareFunction(me, "set_column_semantics_table_semantics", "SET-COLUMN-SEMANTICS-TABLE-SEMANTICS", 2, 0, false);
        declareFunction(me, "set_column_semantics_value_semantics_list", "SET-COLUMN-SEMANTICS-VALUE-SEMANTICS-LIST", 2, 0, false);
        declareFunction(me, "set_column_semantics_name", "SET-COLUMN-SEMANTICS-NAME", 2, 0, false);
        declareFunction(me, "find_corresponding_item_in_semantics_column_semantics_method", "FIND-CORRESPONDING-ITEM-IN-SEMANTICS-COLUMN-SEMANTICS-METHOD", 2, 0, false);
        declareFunction(me, "semantic_object_comparison_name_column_semantics_method", "SEMANTIC-OBJECT-COMPARISON-NAME-COLUMN-SEMANTICS-METHOD", 1, 0, false);
        declareFunction(me, "column_semantics_table_name", "COLUMN-SEMANTICS-TABLE-NAME", 1, 0, false);
        declareFunction(me, "column_semantics_foreign_key_constraint_constraining_column", "COLUMN-SEMANTICS-FOREIGN-KEY-CONSTRAINT-CONSTRAINING-COLUMN", 1, 0, false);
        declareFunction(me, "value_semantics_print_function_trampoline", "VALUE-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "value_semantics_p", "VALUE-SEMANTICS-P", 1, 0, false);
        new semantic_etl_bus.$value_semantics_p$UnaryFunction();
        declareFunction(me, "v_semant_value", "V-SEMANT-VALUE", 1, 0, false);
        declareFunction(me, "v_semant_value_parses", "V-SEMANT-VALUE-PARSES", 1, 0, false);
        declareFunction(me, "_csetf_v_semant_value", "_CSETF-V-SEMANT-VALUE", 2, 0, false);
        declareFunction(me, "_csetf_v_semant_value_parses", "_CSETF-V-SEMANT-VALUE-PARSES", 2, 0, false);
        declareFunction(me, "make_value_semantics", "MAKE-VALUE-SEMANTICS", 0, 1, false);
        declareFunction(me, "visit_defstruct_value_semantics", "VISIT-DEFSTRUCT-VALUE-SEMANTICS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_value_semantics_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-SEMANTICS-METHOD", 2, 0, false);
        declareFunction(me, "print_value_semantics", "PRINT-VALUE-SEMANTICS", 3, 0, false);
        declareFunction(me, "new_value_semantics", "NEW-VALUE-SEMANTICS", 2, 0, false);
        declareFunction(me, "value_semantics_value", "VALUE-SEMANTICS-VALUE", 1, 0, false);
        declareFunction(me, "value_semantics_value_parses", "VALUE-SEMANTICS-VALUE-PARSES", 1, 0, false);
        declareFunction(me, "set_value_semantics_value", "SET-VALUE-SEMANTICS-VALUE", 2, 0, false);
        declareFunction(me, "database_output_spec_print_function_trampoline", "DATABASE-OUTPUT-SPEC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "database_output_spec_p", "DATABASE-OUTPUT-SPEC-P", 1, 0, false);
        new semantic_etl_bus.$database_output_spec_p$UnaryFunction();
        declareFunction(me, "db_output_spec_id", "DB-OUTPUT-SPEC-ID", 1, 0, false);
        declareFunction(me, "db_output_spec_semantics1", "DB-OUTPUT-SPEC-SEMANTICS1", 1, 0, false);
        declareFunction(me, "db_output_spec_semantics2", "DB-OUTPUT-SPEC-SEMANTICS2", 1, 0, false);
        declareFunction(me, "db_output_spec_recipe", "DB-OUTPUT-SPEC-RECIPE", 1, 0, false);
        declareFunction(me, "db_output_spec_semantics", "DB-OUTPUT-SPEC-SEMANTICS", 1, 0, false);
        declareFunction(me, "db_output_spec_semantic_recipe", "DB-OUTPUT-SPEC-SEMANTIC-RECIPE", 1, 0, false);
        declareFunction(me, "_csetf_db_output_spec_id", "_CSETF-DB-OUTPUT-SPEC-ID", 2, 0, false);
        declareFunction(me, "_csetf_db_output_spec_semantics1", "_CSETF-DB-OUTPUT-SPEC-SEMANTICS1", 2, 0, false);
        declareFunction(me, "_csetf_db_output_spec_semantics2", "_CSETF-DB-OUTPUT-SPEC-SEMANTICS2", 2, 0, false);
        declareFunction(me, "_csetf_db_output_spec_recipe", "_CSETF-DB-OUTPUT-SPEC-RECIPE", 2, 0, false);
        declareFunction(me, "_csetf_db_output_spec_semantics", "_CSETF-DB-OUTPUT-SPEC-SEMANTICS", 2, 0, false);
        declareFunction(me, "_csetf_db_output_spec_semantic_recipe", "_CSETF-DB-OUTPUT-SPEC-SEMANTIC-RECIPE", 2, 0, false);
        declareFunction(me, "make_database_output_spec", "MAKE-DATABASE-OUTPUT-SPEC", 0, 1, false);
        declareFunction(me, "visit_defstruct_database_output_spec", "VISIT-DEFSTRUCT-DATABASE-OUTPUT-SPEC", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_database_output_spec_method", "VISIT-DEFSTRUCT-OBJECT-DATABASE-OUTPUT-SPEC-METHOD", 2, 0, false);
        declareFunction(me, "print_database_output_spec", "PRINT-DATABASE-OUTPUT-SPEC", 3, 0, false);
        declareFunction(me, "new_database_output_spec", "NEW-DATABASE-OUTPUT-SPEC", 3, 0, false);
        declareFunction(me, "new_trivial_recipe", "NEW-TRIVIAL-RECIPE", 3, 0, false);
        declareFunction(me, "new_trivial_semantics", "NEW-TRIVIAL-SEMANTICS", 3, 0, false);
        declareFunction(me, "copy_database_output_spec", "COPY-DATABASE-OUTPUT-SPEC", 1, 0, false);
        declareFunction(me, "output_spec_append_to_recipe", "OUTPUT-SPEC-APPEND-TO-RECIPE", 2, 0, false);
        declareFunction(me, "output_spec_append_to_semantic_recipe", "OUTPUT-SPEC-APPEND-TO-SEMANTIC-RECIPE", 2, 0, false);
        declareFunction(me, "output_spec_get_table_named", "OUTPUT-SPEC-GET-TABLE-NAMED", 2, 0, false);
        declareFunction(me, "semantics_add_dropped", "SEMANTICS-ADD-DROPPED", 2, 0, false);
        declareFunction(me, "copy_semantic_recipe", "COPY-SEMANTIC-RECIPE", 2, 0, false);
        declareFunction(me, "semantic_recipe_step_p", "SEMANTIC-RECIPE-STEP-P", 1, 0, false);
        declareFunction(me, "empty_semantic_recipe_step_p", "EMPTY-SEMANTIC-RECIPE-STEP-P", 1, 0, false);
        declareFunction(me, "set_semantic_recipe_step_output_spec", "SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC", 2, 0, false);
        declareFunction(me, "semantic_recipe_append_to_drops", "SEMANTIC-RECIPE-APPEND-TO-DROPS", 2, 0, false);
        declareFunction(me, "semantic_recipe_append_to_adds", "SEMANTIC-RECIPE-APPEND-TO-ADDS", 2, 0, false);
        declareFunction(me, "semantic_recipe_remove_from_drops", "SEMANTIC-RECIPE-REMOVE-FROM-DROPS", 2, 0, false);
        declareFunction(me, "semantic_recipe_remove_from_adds", "SEMANTIC-RECIPE-REMOVE-FROM-ADDS", 2, 0, false);
        declareFunction(me, "set_semantic_recipe_step_column_correspondence_list", "SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST", 2, 0, false);
        declareFunction(me, "semantic_recipe_step_column_correspondence_list", "SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST", 1, 0, false);
        declareFunction(me, "set_semantic_recipe_step_sql_start_index", "SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX", 2, 0, false);
        declareFunction(me, "set_semantic_recipe_step_sql_end_index", "SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX", 2, 0, false);
        declareFunction(me, "semantic_recipe_step_copy", "SEMANTIC-RECIPE-STEP-COPY", 2, 0, false);
        declareFunction(me, "table_merger_print_function_trampoline", "TABLE-MERGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "table_merger_p", "TABLE-MERGER-P", 1, 0, false);
        new semantic_etl_bus.$table_merger_p$UnaryFunction();
        declareFunction(me, "table_merger_id", "TABLE-MERGER-ID", 1, 0, false);
        declareFunction(me, "table_merger_output_spec", "TABLE-MERGER-OUTPUT-SPEC", 1, 0, false);
        declareFunction(me, "table_merger_sources", "TABLE-MERGER-SOURCES", 1, 0, false);
        declareFunction(me, "table_merger_target", "TABLE-MERGER-TARGET", 1, 0, false);
        declareFunction(me, "table_merger_column_correspondence_list", "TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST", 1, 0, false);
        declareFunction(me, "table_merger_added", "TABLE-MERGER-ADDED", 1, 0, false);
        declareFunction(me, "table_merger_dropped", "TABLE-MERGER-DROPPED", 1, 0, false);
        declareFunction(me, "table_merger_sql_start_index", "TABLE-MERGER-SQL-START-INDEX", 1, 0, false);
        declareFunction(me, "table_merger_sql_end_index", "TABLE-MERGER-SQL-END-INDEX", 1, 0, false);
        declareFunction(me, "_csetf_table_merger_id", "_CSETF-TABLE-MERGER-ID", 2, 0, false);
        declareFunction(me, "_csetf_table_merger_output_spec", "_CSETF-TABLE-MERGER-OUTPUT-SPEC", 2, 0, false);
        declareFunction(me, "_csetf_table_merger_sources", "_CSETF-TABLE-MERGER-SOURCES", 2, 0, false);
        declareFunction(me, "_csetf_table_merger_target", "_CSETF-TABLE-MERGER-TARGET", 2, 0, false);
        declareFunction(me, "_csetf_table_merger_column_correspondence_list", "_CSETF-TABLE-MERGER-COLUMN-CORRESPONDENCE-LIST", 2, 0, false);
        declareFunction(me, "_csetf_table_merger_added", "_CSETF-TABLE-MERGER-ADDED", 2, 0, false);
        declareFunction(me, "_csetf_table_merger_dropped", "_CSETF-TABLE-MERGER-DROPPED", 2, 0, false);
        declareFunction(me, "_csetf_table_merger_sql_start_index", "_CSETF-TABLE-MERGER-SQL-START-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_table_merger_sql_end_index", "_CSETF-TABLE-MERGER-SQL-END-INDEX", 2, 0, false);
        declareFunction(me, "make_table_merger", "MAKE-TABLE-MERGER", 0, 1, false);
        declareFunction(me, "visit_defstruct_table_merger", "VISIT-DEFSTRUCT-TABLE-MERGER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_table_merger_method", "VISIT-DEFSTRUCT-OBJECT-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "print_table_merger", "PRINT-TABLE-MERGER", 3, 0, false);
        declareFunction(me, "new_table_merger", "NEW-TABLE-MERGER", 3, 0, false);
        declareFunction(me, "semantic_recipe_step_p_table_merger_method", "SEMANTIC-RECIPE-STEP-P-TABLE-MERGER-METHOD", 1, 0, false);
        declareFunction(me, "empty_semantic_recipe_step_p_table_merger_method", "EMPTY-SEMANTIC-RECIPE-STEP-P-TABLE-MERGER-METHOD", 1, 0, false);
        declareFunction(me, "semantic_recipe_append_to_drops_table_merger_method", "SEMANTIC-RECIPE-APPEND-TO-DROPS-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_append_to_adds_table_merger_method", "SEMANTIC-RECIPE-APPEND-TO-ADDS-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_remove_from_drops_table_merger_method", "SEMANTIC-RECIPE-REMOVE-FROM-DROPS-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_remove_from_adds_table_merger_method", "SEMANTIC-RECIPE-REMOVE-FROM-ADDS-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "set_semantic_recipe_step_column_correspondence_list_table_merger_method", "SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_step_column_correspondence_list_table_merger_method", "SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-TABLE-MERGER-METHOD", 1, 0, false);
        declareFunction(me, "set_semantic_recipe_step_output_spec_table_merger_method", "SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "set_semantic_recipe_step_sql_start_index_table_merger_method", "SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "set_semantic_recipe_step_sql_end_index_table_merger_method", "SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_step_copy_table_merger_method", "SEMANTIC-RECIPE-STEP-COPY-TABLE-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "column_merger_print_function_trampoline", "COLUMN-MERGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "column_merger_p", "COLUMN-MERGER-P", 1, 0, false);
        new semantic_etl_bus.$column_merger_p$UnaryFunction();
        declareFunction(me, "column_merger_output_spec", "COLUMN-MERGER-OUTPUT-SPEC", 1, 0, false);
        declareFunction(me, "column_merger_sources", "COLUMN-MERGER-SOURCES", 1, 0, false);
        declareFunction(me, "column_merger_target", "COLUMN-MERGER-TARGET", 1, 0, false);
        declareFunction(me, "column_merger_column_correspondence_list", "COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST", 1, 0, false);
        declareFunction(me, "column_merger_added", "COLUMN-MERGER-ADDED", 1, 0, false);
        declareFunction(me, "column_merger_dropped", "COLUMN-MERGER-DROPPED", 1, 0, false);
        declareFunction(me, "column_merger_sql_start_index", "COLUMN-MERGER-SQL-START-INDEX", 1, 0, false);
        declareFunction(me, "column_merger_sql_end_index", "COLUMN-MERGER-SQL-END-INDEX", 1, 0, false);
        declareFunction(me, "_csetf_column_merger_output_spec", "_CSETF-COLUMN-MERGER-OUTPUT-SPEC", 2, 0, false);
        declareFunction(me, "_csetf_column_merger_sources", "_CSETF-COLUMN-MERGER-SOURCES", 2, 0, false);
        declareFunction(me, "_csetf_column_merger_target", "_CSETF-COLUMN-MERGER-TARGET", 2, 0, false);
        declareFunction(me, "_csetf_column_merger_column_correspondence_list", "_CSETF-COLUMN-MERGER-COLUMN-CORRESPONDENCE-LIST", 2, 0, false);
        declareFunction(me, "_csetf_column_merger_added", "_CSETF-COLUMN-MERGER-ADDED", 2, 0, false);
        declareFunction(me, "_csetf_column_merger_dropped", "_CSETF-COLUMN-MERGER-DROPPED", 2, 0, false);
        declareFunction(me, "_csetf_column_merger_sql_start_index", "_CSETF-COLUMN-MERGER-SQL-START-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_column_merger_sql_end_index", "_CSETF-COLUMN-MERGER-SQL-END-INDEX", 2, 0, false);
        declareFunction(me, "make_column_merger", "MAKE-COLUMN-MERGER", 0, 1, false);
        declareFunction(me, "visit_defstruct_column_merger", "VISIT-DEFSTRUCT-COLUMN-MERGER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_column_merger_method", "VISIT-DEFSTRUCT-OBJECT-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "print_column_merger", "PRINT-COLUMN-MERGER", 3, 0, false);
        declareFunction(me, "new_column_merger", "NEW-COLUMN-MERGER", 3, 0, false);
        declareFunction(me, "semantic_recipe_step_p_column_merger_method", "SEMANTIC-RECIPE-STEP-P-COLUMN-MERGER-METHOD", 1, 0, false);
        declareFunction(me, "empty_semantic_recipe_step_p_column_merger_method", "EMPTY-SEMANTIC-RECIPE-STEP-P-COLUMN-MERGER-METHOD", 1, 0, false);
        declareFunction(me, "semantic_recipe_append_to_drops_column_merger_method", "SEMANTIC-RECIPE-APPEND-TO-DROPS-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_append_to_adds_column_merger_method", "SEMANTIC-RECIPE-APPEND-TO-ADDS-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_remove_from_drops_column_merger_method", "SEMANTIC-RECIPE-REMOVE-FROM-DROPS-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_remove_from_adds_column_merger_method", "SEMANTIC-RECIPE-REMOVE-FROM-ADDS-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "set_semantic_recipe_step_column_correspondence_list_column_merger_method", "SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_step_column_correspondence_list_column_merger_method", "SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-COLUMN-MERGER-METHOD", 1, 0, false);
        declareFunction(me, "set_semantic_recipe_step_output_spec_column_merger_method", "SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "set_semantic_recipe_step_sql_start_index_column_merger_method", "SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "set_semantic_recipe_step_sql_end_index_column_merger_method", "SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_step_copy_column_merger_method", "SEMANTIC-RECIPE-STEP-COPY-COLUMN-MERGER-METHOD", 2, 0, false);
        declareFunction(me, "semantic_recipe_add_or_drop_item", "SEMANTIC-RECIPE-ADD-OR-DROP-ITEM", 1, 0, false);
        declareFunction(me, "semantic_recipe_add_or_drop_p", "SEMANTIC-RECIPE-ADD-OR-DROP-P", 1, 0, false);
        declareFunction(me, "semantic_recipe_add_p", "SEMANTIC-RECIPE-ADD-P", 1, 0, false);
        declareFunction(me, "new_semantic_recipe_add", "NEW-SEMANTIC-RECIPE-ADD", 1, 0, false);
        declareFunction(me, "semantic_recipe_drop_p", "SEMANTIC-RECIPE-DROP-P", 1, 0, false);
        declareFunction(me, "new_semantic_recipe_drop", "NEW-SEMANTIC-RECIPE-DROP", 1, 0, false);
        declareFunction(me, "sql_conjunction_print_function_trampoline", "SQL-CONJUNCTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_conjunction_p", "SQL-CONJUNCTION-P", 1, 0, false);
        new semantic_etl_bus.$sql_conjunction_p$UnaryFunction();
        declareFunction(me, "sql_conjunction_conjuncts", "SQL-CONJUNCTION-CONJUNCTS", 1, 0, false);
        declareFunction(me, "_csetf_sql_conjunction_conjuncts", "_CSETF-SQL-CONJUNCTION-CONJUNCTS", 2, 0, false);
        declareFunction(me, "make_sql_conjunction", "MAKE-SQL-CONJUNCTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_conjunction", "VISIT-DEFSTRUCT-SQL-CONJUNCTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_conjunction_method", "VISIT-DEFSTRUCT-OBJECT-SQL-CONJUNCTION-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_conjunction", "PRINT-SQL-CONJUNCTION", 3, 0, false);
        declareFunction(me, "new_sql_conjunction", "NEW-SQL-CONJUNCTION", 1, 0, false);
        declareFunction(me, "sql_disjunction_print_function_trampoline", "SQL-DISJUNCTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_disjunction_p", "SQL-DISJUNCTION-P", 1, 0, false);
        new semantic_etl_bus.$sql_disjunction_p$UnaryFunction();
        declareFunction(me, "sql_disjunction_disjuncts", "SQL-DISJUNCTION-DISJUNCTS", 1, 0, false);
        declareFunction(me, "_csetf_sql_disjunction_disjuncts", "_CSETF-SQL-DISJUNCTION-DISJUNCTS", 2, 0, false);
        declareFunction(me, "make_sql_disjunction", "MAKE-SQL-DISJUNCTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_disjunction", "VISIT-DEFSTRUCT-SQL-DISJUNCTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_disjunction_method", "VISIT-DEFSTRUCT-OBJECT-SQL-DISJUNCTION-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_disjunction", "PRINT-SQL-DISJUNCTION", 3, 0, false);
        declareFunction(me, "new_sql_disjunction", "NEW-SQL-DISJUNCTION", 1, 0, false);
        declareFunction(me, "sql_copy_table_print_function_trampoline", "SQL-COPY-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_copy_table_p", "SQL-COPY-TABLE-P", 1, 0, false);
        new semantic_etl_bus.$sql_copy_table_p$UnaryFunction();
        declareFunction(me, "sql_copy_table_table", "SQL-COPY-TABLE-TABLE", 1, 0, false);
        declareFunction(me, "sql_copy_table_from", "SQL-COPY-TABLE-FROM", 1, 0, false);
        declareFunction(me, "sql_copy_table_to", "SQL-COPY-TABLE-TO", 1, 0, false);
        declareFunction(me, "_csetf_sql_copy_table_table", "_CSETF-SQL-COPY-TABLE-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_copy_table_from", "_CSETF-SQL-COPY-TABLE-FROM", 2, 0, false);
        declareFunction(me, "_csetf_sql_copy_table_to", "_CSETF-SQL-COPY-TABLE-TO", 2, 0, false);
        declareFunction(me, "make_sql_copy_table", "MAKE-SQL-COPY-TABLE", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_copy_table", "VISIT-DEFSTRUCT-SQL-COPY-TABLE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_copy_table_method", "VISIT-DEFSTRUCT-OBJECT-SQL-COPY-TABLE-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_copy_table", "PRINT-SQL-COPY-TABLE", 3, 0, false);
        declareFunction(me, "new_sql_copy_table", "NEW-SQL-COPY-TABLE", 3, 0, false);
        declareFunction(me, "sql_insert_into_print_function_trampoline", "SQL-INSERT-INTO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_insert_into_p", "SQL-INSERT-INTO-P", 1, 0, false);
        new semantic_etl_bus.$sql_insert_into_p$UnaryFunction();
        declareFunction(me, "sql_insert_into_table", "SQL-INSERT-INTO-TABLE", 1, 0, false);
        declareFunction(me, "sql_insert_into_columns", "SQL-INSERT-INTO-COLUMNS", 1, 0, false);
        declareFunction(me, "sql_insert_into_data", "SQL-INSERT-INTO-DATA", 1, 0, false);
        declareFunction(me, "_csetf_sql_insert_into_table", "_CSETF-SQL-INSERT-INTO-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_insert_into_columns", "_CSETF-SQL-INSERT-INTO-COLUMNS", 2, 0, false);
        declareFunction(me, "_csetf_sql_insert_into_data", "_CSETF-SQL-INSERT-INTO-DATA", 2, 0, false);
        declareFunction(me, "make_sql_insert_into", "MAKE-SQL-INSERT-INTO", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_insert_into", "VISIT-DEFSTRUCT-SQL-INSERT-INTO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_insert_into_method", "VISIT-DEFSTRUCT-OBJECT-SQL-INSERT-INTO-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_insert_into", "PRINT-SQL-INSERT-INTO", 3, 0, false);
        declareFunction(me, "new_sql_insert_into", "NEW-SQL-INSERT-INTO", 3, 0, false);
        declareFunction(me, "sql_select_from_print_function_trampoline", "SQL-SELECT-FROM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_select_from_p", "SQL-SELECT-FROM-P", 1, 0, false);
        new semantic_etl_bus.$sql_select_from_p$UnaryFunction();
        declareFunction(me, "sql_select_from_columns", "SQL-SELECT-FROM-COLUMNS", 1, 0, false);
        declareFunction(me, "sql_select_from_tables", "SQL-SELECT-FROM-TABLES", 1, 0, false);
        declareFunction(me, "sql_select_from_conditions", "SQL-SELECT-FROM-CONDITIONS", 1, 0, false);
        declareFunction(me, "_csetf_sql_select_from_columns", "_CSETF-SQL-SELECT-FROM-COLUMNS", 2, 0, false);
        declareFunction(me, "_csetf_sql_select_from_tables", "_CSETF-SQL-SELECT-FROM-TABLES", 2, 0, false);
        declareFunction(me, "_csetf_sql_select_from_conditions", "_CSETF-SQL-SELECT-FROM-CONDITIONS", 2, 0, false);
        declareFunction(me, "make_sql_select_from", "MAKE-SQL-SELECT-FROM", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_select_from", "VISIT-DEFSTRUCT-SQL-SELECT-FROM", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_select_from_method", "VISIT-DEFSTRUCT-OBJECT-SQL-SELECT-FROM-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_select_from", "PRINT-SQL-SELECT-FROM", 3, 0, false);
        declareFunction(me, "new_sql_select_from", "NEW-SQL-SELECT-FROM", 3, 0, false);
        declareFunction(me, "sql_list_string", "SQL-LIST-STRING", 1, 1, false);
        declareFunction(me, "sql_except_print_function_trampoline", "SQL-EXCEPT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_except_p", "SQL-EXCEPT-P", 1, 0, false);
        new semantic_etl_bus.$sql_except_p$UnaryFunction();
        declareFunction(me, "sql_except_table1", "SQL-EXCEPT-TABLE1", 1, 0, false);
        declareFunction(me, "sql_except_table2", "SQL-EXCEPT-TABLE2", 1, 0, false);
        declareFunction(me, "_csetf_sql_except_table1", "_CSETF-SQL-EXCEPT-TABLE1", 2, 0, false);
        declareFunction(me, "_csetf_sql_except_table2", "_CSETF-SQL-EXCEPT-TABLE2", 2, 0, false);
        declareFunction(me, "make_sql_except", "MAKE-SQL-EXCEPT", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_except", "VISIT-DEFSTRUCT-SQL-EXCEPT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_except_method", "VISIT-DEFSTRUCT-OBJECT-SQL-EXCEPT-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_except", "PRINT-SQL-EXCEPT", 3, 0, false);
        declareFunction(me, "new_sql_except", "NEW-SQL-EXCEPT", 2, 0, false);
        declareFunction(me, "sql_alias_print_function_trampoline", "SQL-ALIAS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_alias_p", "SQL-ALIAS-P", 1, 0, false);
        new semantic_etl_bus.$sql_alias_p$UnaryFunction();
        declareFunction(me, "sql_alias_table", "SQL-ALIAS-TABLE", 1, 0, false);
        declareFunction(me, "sql_alias_alias", "SQL-ALIAS-ALIAS", 1, 0, false);
        declareFunction(me, "_csetf_sql_alias_table", "_CSETF-SQL-ALIAS-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_alias_alias", "_CSETF-SQL-ALIAS-ALIAS", 2, 0, false);
        declareFunction(me, "make_sql_alias", "MAKE-SQL-ALIAS", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_alias", "VISIT-DEFSTRUCT-SQL-ALIAS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_alias_method", "VISIT-DEFSTRUCT-OBJECT-SQL-ALIAS-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_alias", "PRINT-SQL-ALIAS", 3, 0, false);
        declareFunction(me, "new_sql_alias", "NEW-SQL-ALIAS", 2, 0, false);
        declareFunction(me, "sql_column_equal_print_function_trampoline", "SQL-COLUMN-EQUAL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_column_equal_p", "SQL-COLUMN-EQUAL-P", 1, 0, false);
        new semantic_etl_bus.$sql_column_equal_p$UnaryFunction();
        declareFunction(me, "sql_column_equal_table1", "SQL-COLUMN-EQUAL-TABLE1", 1, 0, false);
        declareFunction(me, "sql_column_equal_column1", "SQL-COLUMN-EQUAL-COLUMN1", 1, 0, false);
        declareFunction(me, "sql_column_equal_table2", "SQL-COLUMN-EQUAL-TABLE2", 1, 0, false);
        declareFunction(me, "sql_column_equal_column2", "SQL-COLUMN-EQUAL-COLUMN2", 1, 0, false);
        declareFunction(me, "_csetf_sql_column_equal_table1", "_CSETF-SQL-COLUMN-EQUAL-TABLE1", 2, 0, false);
        declareFunction(me, "_csetf_sql_column_equal_column1", "_CSETF-SQL-COLUMN-EQUAL-COLUMN1", 2, 0, false);
        declareFunction(me, "_csetf_sql_column_equal_table2", "_CSETF-SQL-COLUMN-EQUAL-TABLE2", 2, 0, false);
        declareFunction(me, "_csetf_sql_column_equal_column2", "_CSETF-SQL-COLUMN-EQUAL-COLUMN2", 2, 0, false);
        declareFunction(me, "make_sql_column_equal", "MAKE-SQL-COLUMN-EQUAL", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_column_equal", "VISIT-DEFSTRUCT-SQL-COLUMN-EQUAL", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_column_equal_method", "VISIT-DEFSTRUCT-OBJECT-SQL-COLUMN-EQUAL-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_column_equal", "PRINT-SQL-COLUMN-EQUAL", 3, 0, false);
        declareFunction(me, "new_sql_column_equal", "NEW-SQL-COLUMN-EQUAL", 4, 0, false);
        declareFunction(me, "sql_is_null_print_function_trampoline", "SQL-IS-NULL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_is_null_p", "SQL-IS-NULL-P", 1, 0, false);
        new semantic_etl_bus.$sql_is_null_p$UnaryFunction();
        declareFunction(me, "sql_is_null_table", "SQL-IS-NULL-TABLE", 1, 0, false);
        declareFunction(me, "sql_is_null_column", "SQL-IS-NULL-COLUMN", 1, 0, false);
        declareFunction(me, "_csetf_sql_is_null_table", "_CSETF-SQL-IS-NULL-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_is_null_column", "_CSETF-SQL-IS-NULL-COLUMN", 2, 0, false);
        declareFunction(me, "make_sql_is_null", "MAKE-SQL-IS-NULL", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_is_null", "VISIT-DEFSTRUCT-SQL-IS-NULL", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_is_null_method", "VISIT-DEFSTRUCT-OBJECT-SQL-IS-NULL-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_is_null", "PRINT-SQL-IS-NULL", 3, 0, false);
        declareFunction(me, "new_sql_is_null", "NEW-SQL-IS-NULL", 2, 0, false);
        declareFunction(me, "sql_not_in_print_function_trampoline", "SQL-NOT-IN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_not_in_p", "SQL-NOT-IN-P", 1, 0, false);
        new semantic_etl_bus.$sql_not_in_p$UnaryFunction();
        declareFunction(me, "sql_not_in_column_table", "SQL-NOT-IN-COLUMN-TABLE", 1, 0, false);
        declareFunction(me, "sql_not_in_column", "SQL-NOT-IN-COLUMN", 1, 0, false);
        declareFunction(me, "sql_not_in_table", "SQL-NOT-IN-TABLE", 1, 0, false);
        declareFunction(me, "_csetf_sql_not_in_column_table", "_CSETF-SQL-NOT-IN-COLUMN-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_not_in_column", "_CSETF-SQL-NOT-IN-COLUMN", 2, 0, false);
        declareFunction(me, "_csetf_sql_not_in_table", "_CSETF-SQL-NOT-IN-TABLE", 2, 0, false);
        declareFunction(me, "make_sql_not_in", "MAKE-SQL-NOT-IN", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_not_in", "VISIT-DEFSTRUCT-SQL-NOT-IN", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_not_in_method", "VISIT-DEFSTRUCT-OBJECT-SQL-NOT-IN-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_not_in", "PRINT-SQL-NOT-IN", 3, 0, false);
        declareFunction(me, "new_sql_not_in", "NEW-SQL-NOT-IN", 3, 0, false);
        declareFunction(me, "sql_inner_join_print_function_trampoline", "SQL-INNER-JOIN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_inner_join_p", "SQL-INNER-JOIN-P", 1, 0, false);
        new semantic_etl_bus.$sql_inner_join_p$UnaryFunction();
        declareFunction(me, "sql_inner_join_table1", "SQL-INNER-JOIN-TABLE1", 1, 0, false);
        declareFunction(me, "sql_inner_join_table2", "SQL-INNER-JOIN-TABLE2", 1, 0, false);
        declareFunction(me, "sql_inner_join_on", "SQL-INNER-JOIN-ON", 1, 0, false);
        declareFunction(me, "_csetf_sql_inner_join_table1", "_CSETF-SQL-INNER-JOIN-TABLE1", 2, 0, false);
        declareFunction(me, "_csetf_sql_inner_join_table2", "_CSETF-SQL-INNER-JOIN-TABLE2", 2, 0, false);
        declareFunction(me, "_csetf_sql_inner_join_on", "_CSETF-SQL-INNER-JOIN-ON", 2, 0, false);
        declareFunction(me, "make_sql_inner_join", "MAKE-SQL-INNER-JOIN", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_inner_join", "VISIT-DEFSTRUCT-SQL-INNER-JOIN", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_inner_join_method", "VISIT-DEFSTRUCT-OBJECT-SQL-INNER-JOIN-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_inner_join", "PRINT-SQL-INNER-JOIN", 3, 0, false);
        declareFunction(me, "new_sql_inner_join", "NEW-SQL-INNER-JOIN", 3, 0, false);
        declareFunction(me, "sql_left_join_print_function_trampoline", "SQL-LEFT-JOIN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_left_join_p", "SQL-LEFT-JOIN-P", 1, 0, false);
        new semantic_etl_bus.$sql_left_join_p$UnaryFunction();
        declareFunction(me, "sql_left_join_left_table", "SQL-LEFT-JOIN-LEFT-TABLE", 1, 0, false);
        declareFunction(me, "sql_left_join_right_table", "SQL-LEFT-JOIN-RIGHT-TABLE", 1, 0, false);
        declareFunction(me, "sql_left_join_on", "SQL-LEFT-JOIN-ON", 1, 0, false);
        declareFunction(me, "_csetf_sql_left_join_left_table", "_CSETF-SQL-LEFT-JOIN-LEFT-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_left_join_right_table", "_CSETF-SQL-LEFT-JOIN-RIGHT-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_left_join_on", "_CSETF-SQL-LEFT-JOIN-ON", 2, 0, false);
        declareFunction(me, "make_sql_left_join", "MAKE-SQL-LEFT-JOIN", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_left_join", "VISIT-DEFSTRUCT-SQL-LEFT-JOIN", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_left_join_method", "VISIT-DEFSTRUCT-OBJECT-SQL-LEFT-JOIN-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_left_join", "PRINT-SQL-LEFT-JOIN", 3, 0, false);
        declareFunction(me, "new_sql_left_join", "NEW-SQL-LEFT-JOIN", 3, 0, false);
        declareFunction(me, "sql_union_print_function_trampoline", "SQL-UNION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_union_p", "SQL-UNION-P", 1, 0, false);
        new semantic_etl_bus.$sql_union_p$UnaryFunction();
        declareFunction(me, "sql_union_select1", "SQL-UNION-SELECT1", 1, 0, false);
        declareFunction(me, "sql_union_select2", "SQL-UNION-SELECT2", 1, 0, false);
        declareFunction(me, "_csetf_sql_union_select1", "_CSETF-SQL-UNION-SELECT1", 2, 0, false);
        declareFunction(me, "_csetf_sql_union_select2", "_CSETF-SQL-UNION-SELECT2", 2, 0, false);
        declareFunction(me, "make_sql_union", "MAKE-SQL-UNION", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_union", "VISIT-DEFSTRUCT-SQL-UNION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_union_method", "VISIT-DEFSTRUCT-OBJECT-SQL-UNION-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_union", "PRINT-SQL-UNION", 3, 0, false);
        declareFunction(me, "new_sql_union", "NEW-SQL-UNION", 2, 0, false);
        declareFunction(me, "sql_alter_table_print_function_trampoline", "SQL-ALTER-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_alter_table_p", "SQL-ALTER-TABLE-P", 1, 0, false);
        new semantic_etl_bus.$sql_alter_table_p$UnaryFunction();
        declareFunction(me, "sql_alter_table_table", "SQL-ALTER-TABLE-TABLE", 1, 0, false);
        declareFunction(me, "sql_alter_table_action", "SQL-ALTER-TABLE-ACTION", 1, 0, false);
        declareFunction(me, "_csetf_sql_alter_table_table", "_CSETF-SQL-ALTER-TABLE-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_alter_table_action", "_CSETF-SQL-ALTER-TABLE-ACTION", 2, 0, false);
        declareFunction(me, "make_sql_alter_table", "MAKE-SQL-ALTER-TABLE", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_alter_table", "VISIT-DEFSTRUCT-SQL-ALTER-TABLE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_alter_table_method", "VISIT-DEFSTRUCT-OBJECT-SQL-ALTER-TABLE-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_alter_table", "PRINT-SQL-ALTER-TABLE", 3, 0, false);
        declareFunction(me, "new_sql_alter_table", "NEW-SQL-ALTER-TABLE", 2, 0, false);
        declareFunction(me, "sql_add_column_print_function_trampoline", "SQL-ADD-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_add_column_p", "SQL-ADD-COLUMN-P", 1, 0, false);
        new semantic_etl_bus.$sql_add_column_p$UnaryFunction();
        declareFunction(me, "sql_add_column_column", "SQL-ADD-COLUMN-COLUMN", 1, 0, false);
        declareFunction(me, "sql_add_column_type", "SQL-ADD-COLUMN-TYPE", 1, 0, false);
        declareFunction(me, "sql_add_column_size", "SQL-ADD-COLUMN-SIZE", 1, 0, false);
        declareFunction(me, "sql_add_column_constraints", "SQL-ADD-COLUMN-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "_csetf_sql_add_column_column", "_CSETF-SQL-ADD-COLUMN-COLUMN", 2, 0, false);
        declareFunction(me, "_csetf_sql_add_column_type", "_CSETF-SQL-ADD-COLUMN-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_sql_add_column_size", "_CSETF-SQL-ADD-COLUMN-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_sql_add_column_constraints", "_CSETF-SQL-ADD-COLUMN-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "make_sql_add_column", "MAKE-SQL-ADD-COLUMN", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_add_column", "VISIT-DEFSTRUCT-SQL-ADD-COLUMN", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_add_column_method", "VISIT-DEFSTRUCT-OBJECT-SQL-ADD-COLUMN-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_add_column", "PRINT-SQL-ADD-COLUMN", 3, 0, false);
        declareFunction(me, "new_sql_add_column", "NEW-SQL-ADD-COLUMN", 2, 2, false);
        declareFunction(me, "new_sql_add_column_to_table", "NEW-SQL-ADD-COLUMN-TO-TABLE", 3, 2, false);
        declareFunction(me, "sql_drop_column_print_function_trampoline", "SQL-DROP-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_drop_column_p", "SQL-DROP-COLUMN-P", 1, 0, false);
        new semantic_etl_bus.$sql_drop_column_p$UnaryFunction();
        declareFunction(me, "sql_drop_column_column", "SQL-DROP-COLUMN-COLUMN", 1, 0, false);
        declareFunction(me, "_csetf_sql_drop_column_column", "_CSETF-SQL-DROP-COLUMN-COLUMN", 2, 0, false);
        declareFunction(me, "make_sql_drop_column", "MAKE-SQL-DROP-COLUMN", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_drop_column", "VISIT-DEFSTRUCT-SQL-DROP-COLUMN", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_drop_column_method", "VISIT-DEFSTRUCT-OBJECT-SQL-DROP-COLUMN-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_drop_column", "PRINT-SQL-DROP-COLUMN", 3, 0, false);
        declareFunction(me, "new_sql_drop_column", "NEW-SQL-DROP-COLUMN", 1, 0, false);
        declareFunction(me, "sql_rename_column_print_function_trampoline", "SQL-RENAME-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_rename_column_p", "SQL-RENAME-COLUMN-P", 1, 0, false);
        new semantic_etl_bus.$sql_rename_column_p$UnaryFunction();
        declareFunction(me, "sql_rename_column_old_column", "SQL-RENAME-COLUMN-OLD-COLUMN", 1, 0, false);
        declareFunction(me, "sql_rename_column_new_column", "SQL-RENAME-COLUMN-NEW-COLUMN", 1, 0, false);
        declareFunction(me, "_csetf_sql_rename_column_old_column", "_CSETF-SQL-RENAME-COLUMN-OLD-COLUMN", 2, 0, false);
        declareFunction(me, "_csetf_sql_rename_column_new_column", "_CSETF-SQL-RENAME-COLUMN-NEW-COLUMN", 2, 0, false);
        declareFunction(me, "make_sql_rename_column", "MAKE-SQL-RENAME-COLUMN", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_rename_column", "VISIT-DEFSTRUCT-SQL-RENAME-COLUMN", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_rename_column_method", "VISIT-DEFSTRUCT-OBJECT-SQL-RENAME-COLUMN-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_rename_column", "PRINT-SQL-RENAME-COLUMN", 3, 0, false);
        declareFunction(me, "new_sql_rename_column", "NEW-SQL-RENAME-COLUMN", 2, 0, false);
        declareFunction(me, "sql_add_constraint_print_function_trampoline", "SQL-ADD-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_add_constraint_p", "SQL-ADD-CONSTRAINT-P", 1, 0, false);
        new semantic_etl_bus.$sql_add_constraint_p$UnaryFunction();
        declareFunction(me, "sql_add_constraint_constraint", "SQL-ADD-CONSTRAINT-CONSTRAINT", 1, 0, false);
        declareFunction(me, "_csetf_sql_add_constraint_constraint", "_CSETF-SQL-ADD-CONSTRAINT-CONSTRAINT", 2, 0, false);
        declareFunction(me, "make_sql_add_constraint", "MAKE-SQL-ADD-CONSTRAINT", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_add_constraint", "VISIT-DEFSTRUCT-SQL-ADD-CONSTRAINT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_add_constraint_method", "VISIT-DEFSTRUCT-OBJECT-SQL-ADD-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_add_constraint", "PRINT-SQL-ADD-CONSTRAINT", 3, 0, false);
        declareFunction(me, "new_sql_add_constraint", "NEW-SQL-ADD-CONSTRAINT", 1, 0, false);
        declareFunction(me, "sql_drop_constraint_print_function_trampoline", "SQL-DROP-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_drop_constraint_p", "SQL-DROP-CONSTRAINT-P", 1, 0, false);
        new semantic_etl_bus.$sql_drop_constraint_p$UnaryFunction();
        declareFunction(me, "sql_drop_constraint_constraint", "SQL-DROP-CONSTRAINT-CONSTRAINT", 1, 0, false);
        declareFunction(me, "_csetf_sql_drop_constraint_constraint", "_CSETF-SQL-DROP-CONSTRAINT-CONSTRAINT", 2, 0, false);
        declareFunction(me, "make_sql_drop_constraint", "MAKE-SQL-DROP-CONSTRAINT", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_drop_constraint", "VISIT-DEFSTRUCT-SQL-DROP-CONSTRAINT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_drop_constraint_method", "VISIT-DEFSTRUCT-OBJECT-SQL-DROP-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_drop_constraint", "PRINT-SQL-DROP-CONSTRAINT", 3, 0, false);
        declareFunction(me, "new_sql_drop_constraint", "NEW-SQL-DROP-CONSTRAINT", 1, 0, false);
        declareFunction(me, "sql_fk_column_constraint_print_function_trampoline", "SQL-FK-COLUMN-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_fk_column_constraint_p", "SQL-FK-COLUMN-CONSTRAINT-P", 1, 0, false);
        new semantic_etl_bus.$sql_fk_column_constraint_p$UnaryFunction();
        declareFunction(me, "sql_fk_column_constraint_name", "SQL-FK-COLUMN-CONSTRAINT-NAME", 1, 0, false);
        declareFunction(me, "sql_fk_column_constraint_table", "SQL-FK-COLUMN-CONSTRAINT-TABLE", 1, 0, false);
        declareFunction(me, "sql_fk_column_constraint_column", "SQL-FK-COLUMN-CONSTRAINT-COLUMN", 1, 0, false);
        declareFunction(me, "_csetf_sql_fk_column_constraint_name", "_CSETF-SQL-FK-COLUMN-CONSTRAINT-NAME", 2, 0, false);
        declareFunction(me, "_csetf_sql_fk_column_constraint_table", "_CSETF-SQL-FK-COLUMN-CONSTRAINT-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_fk_column_constraint_column", "_CSETF-SQL-FK-COLUMN-CONSTRAINT-COLUMN", 2, 0, false);
        declareFunction(me, "make_sql_fk_column_constraint", "MAKE-SQL-FK-COLUMN-CONSTRAINT", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_fk_column_constraint", "VISIT-DEFSTRUCT-SQL-FK-COLUMN-CONSTRAINT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_fk_column_constraint_method", "VISIT-DEFSTRUCT-OBJECT-SQL-FK-COLUMN-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_fk_column_constraint", "PRINT-SQL-FK-COLUMN-CONSTRAINT", 3, 0, false);
        declareFunction(me, "new_sql_fk_column_constraint", "NEW-SQL-FK-COLUMN-CONSTRAINT", 3, 0, false);
        declareFunction(me, "sql_fk_table_constraint_print_function_trampoline", "SQL-FK-TABLE-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_fk_table_constraint_p", "SQL-FK-TABLE-CONSTRAINT-P", 1, 0, false);
        new semantic_etl_bus.$sql_fk_table_constraint_p$UnaryFunction();
        declareFunction(me, "sql_fk_table_constraint_column", "SQL-FK-TABLE-CONSTRAINT-COLUMN", 1, 0, false);
        declareFunction(me, "sql_fk_table_constraint_constraint", "SQL-FK-TABLE-CONSTRAINT-CONSTRAINT", 1, 0, false);
        declareFunction(me, "_csetf_sql_fk_table_constraint_column", "_CSETF-SQL-FK-TABLE-CONSTRAINT-COLUMN", 2, 0, false);
        declareFunction(me, "_csetf_sql_fk_table_constraint_constraint", "_CSETF-SQL-FK-TABLE-CONSTRAINT-CONSTRAINT", 2, 0, false);
        declareFunction(me, "make_sql_fk_table_constraint", "MAKE-SQL-FK-TABLE-CONSTRAINT", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_fk_table_constraint", "VISIT-DEFSTRUCT-SQL-FK-TABLE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_fk_table_constraint_method", "VISIT-DEFSTRUCT-OBJECT-SQL-FK-TABLE-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_fk_table_constraint", "PRINT-SQL-FK-TABLE-CONSTRAINT", 3, 0, false);
        declareFunction(me, "new_sql_fk_table_constraint", "NEW-SQL-FK-TABLE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sql_update_print_function_trampoline", "SQL-UPDATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_update_p", "SQL-UPDATE-P", 1, 0, false);
        new semantic_etl_bus.$sql_update_p$UnaryFunction();
        declareFunction(me, "sql_update_table", "SQL-UPDATE-TABLE", 1, 0, false);
        declareFunction(me, "sql_update_settings", "SQL-UPDATE-SETTINGS", 1, 0, false);
        declareFunction(me, "sql_update_conditions", "SQL-UPDATE-CONDITIONS", 1, 0, false);
        declareFunction(me, "_csetf_sql_update_table", "_CSETF-SQL-UPDATE-TABLE", 2, 0, false);
        declareFunction(me, "_csetf_sql_update_settings", "_CSETF-SQL-UPDATE-SETTINGS", 2, 0, false);
        declareFunction(me, "_csetf_sql_update_conditions", "_CSETF-SQL-UPDATE-CONDITIONS", 2, 0, false);
        declareFunction(me, "make_sql_update", "MAKE-SQL-UPDATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_update", "VISIT-DEFSTRUCT-SQL-UPDATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_update_method", "VISIT-DEFSTRUCT-OBJECT-SQL-UPDATE-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_update", "PRINT-SQL-UPDATE", 3, 0, false);
        declareFunction(me, "new_sql_update", "NEW-SQL-UPDATE", 3, 0, false);
        declareFunction(me, "sql_drop_table_print_function_trampoline", "SQL-DROP-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_drop_table_p", "SQL-DROP-TABLE-P", 1, 0, false);
        new semantic_etl_bus.$sql_drop_table_p$UnaryFunction();
        declareFunction(me, "sql_drop_table_table", "SQL-DROP-TABLE-TABLE", 1, 0, false);
        declareFunction(me, "_csetf_sql_drop_table_table", "_CSETF-SQL-DROP-TABLE-TABLE", 2, 0, false);
        declareFunction(me, "make_sql_drop_table", "MAKE-SQL-DROP-TABLE", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_drop_table", "VISIT-DEFSTRUCT-SQL-DROP-TABLE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_drop_table_method", "VISIT-DEFSTRUCT-OBJECT-SQL-DROP-TABLE-METHOD", 2, 0, false);
        declareFunction(me, "print_sql_drop_table", "PRINT-SQL-DROP-TABLE", 3, 0, false);
        declareFunction(me, "new_sql_drop_table", "NEW-SQL-DROP-TABLE", 1, 0, false);
        declareFunction(me, "sql_command_p", "SQL-COMMAND-P", 1, 0, false);
        declareFunction(me, "sql_table_expression_p", "SQL-TABLE-EXPRESSION-P", 1, 0, false);
        declareFunction(me, "sql_condition_p", "SQL-CONDITION-P", 1, 0, false);
        declareFunction(me, "sql_alteration_p", "SQL-ALTERATION-P", 1, 0, false);
        declareFunction(me, "sql_table_constraint_p", "SQL-TABLE-CONSTRAINT-P", 1, 0, false);
        declareFunction(me, "sql_column_constraint_p", "SQL-COLUMN-CONSTRAINT-P", 1, 0, false);
        declareFunction(me, "sql_column_constraint_name", "SQL-COLUMN-CONSTRAINT-NAME", 1, 0, false);
        declareFunction(me, "new_foreign_key_constraint_name", "NEW-FOREIGN-KEY-CONSTRAINT-NAME", 2, 0, false);
        declareFunction(me, "initialize_access_path_map", "INITIALIZE-ACCESS-PATH-MAP", 0, 0, false);
        declareFunction(me, "available_databases", "AVAILABLE-DATABASES", 0, 0, false);
        declareFunction(me, "get_access_path", "GET-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "bln1_access_path", "BLN1-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "bln2_access_path", "BLN2-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "usgs_access_path", "USGS-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "nga_access_path", "NGA-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "gndb_access_path", "GNDB-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "sporting_goods_access_path", "SPORTING-GOODS-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "northwind_access_path", "NORTHWIND-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "bathymetric_data_access_path", "BATHYMETRIC-DATA-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "bathymetric_header_access_path", "BATHYMETRIC-HEADER-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "stub_target_access_path", "STUB-TARGET-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "access_path_pretty_string", "ACCESS-PATH-PRETTY-STRING", 1, 0, false);
        declareFunction(me, "output_spec_copy_column_data", "OUTPUT-SPEC-COPY-COLUMN-DATA", 3, 0, false);
        declareFunction(me, "column_semantics_has_valueP", "COLUMN-SEMANTICS-HAS-VALUE?", 2, 0, false);
        declareFunction(me, "column_semantics_add_value", "COLUMN-SEMANTICS-ADD-VALUE", 2, 0, false);
        declareFunction(me, "table_semantics_get_column", "TABLE-SEMANTICS-GET-COLUMN", 2, 0, false);
        declareFunction(me, "table_semantics_append_column", "TABLE-SEMANTICS-APPEND-COLUMN", 2, 0, false);
        declareFunction(me, "output_spec_get_tables", "OUTPUT-SPEC-GET-TABLES", 1, 0, false);
        declareFunction(me, "output_spec_get_access_paths", "OUTPUT-SPEC-GET-ACCESS-PATHS", 1, 0, false);
        declareFunction(me, "output_spec_get_native_column_semantics", "OUTPUT-SPEC-GET-NATIVE-COLUMN-SEMANTICS", 2, 0, false);
        declareFunction(me, "output_spec_consolidate_semantic_recipe", "OUTPUT-SPEC-CONSOLIDATE-SEMANTIC-RECIPE", 3, 0, false);
        declareFunction(me, "update_column_correspondence_list_columns", "UPDATE-COLUMN-CORRESPONDENCE-LIST-COLUMNS", 1, 0, false);
        declareFunction(me, "uniquify_columns", "UNIQUIFY-COLUMNS", 2, 0, false);
        declareFunction(me, "new_assimilated_column", "NEW-ASSIMILATED-COLUMN", 2, 0, false);
        declareFunction(me, "table_semantics_column_names", "TABLE-SEMANTICS-COLUMN-NAMES", 1, 0, false);
        declareFunction(me, "output_spec_synchronize", "OUTPUT-SPEC-SYNCHRONIZE", 1, 0, false);
        declareFunction(me, "output_spec_apply_sql", "OUTPUT-SPEC-APPLY-SQL", 2, 0, false);
        declareFunction(me, "output_spec_alter_table", "OUTPUT-SPEC-ALTER-TABLE", 2, 0, false);
        declareFunction(me, "add_column_to_table", "ADD-COLUMN-TO-TABLE", 2, 0, false);
        declareFunction(me, "drop_column_from_table", "DROP-COLUMN-FROM-TABLE", 2, 0, false);
        declareFunction(me, "rename_column", "RENAME-COLUMN", 2, 0, false);
        declareFunction(me, "add_constraint_to_table", "ADD-CONSTRAINT-TO-TABLE", 2, 0, false);
        declareFunction(me, "drop_constraint_from_table", "DROP-CONSTRAINT-FROM-TABLE", 2, 0, false);
        declareFunction(me, "output_spec_update", "OUTPUT-SPEC-UPDATE", 2, 0, false);
        declareFunction(me, "output_spec_table_expression", "OUTPUT-SPEC-TABLE-EXPRESSION", 2, 0, false);
        declareFunction(me, "output_spec_alias", "OUTPUT-SPEC-ALIAS", 2, 0, false);
        declareFunction(me, "column_semantics_from_result_set", "COLUMN-SEMANTICS-FROM-RESULT-SET", 1, 0, false);
        declareFunction(me, "output_spec_except", "OUTPUT-SPEC-EXCEPT", 2, 0, false);
        declareFunction(me, "output_spec_inner_join", "OUTPUT-SPEC-INNER-JOIN", 2, 0, false);
        declareFunction(me, "output_spec_select_from", "OUTPUT-SPEC-SELECT-FROM", 2, 0, false);
        declareFunction(me, "output_spec_insert_into", "OUTPUT-SPEC-INSERT-INTO", 2, 0, false);
        declareFunction(me, "output_spec_drop_table", "OUTPUT-SPEC-DROP-TABLE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_semantic_etl_bus_file() {
        defvar("*SEMANTIC-ETL-DEBUG?*", NIL);
        deflexical("*DATABASE-OUTPUT-SPECS*", SubLTrampolineFile.maybeDefault($database_output_specs$, $database_output_specs$, () -> dictionary.new_dictionary(EQL, UNPROVIDED)));
        deflexical("*DATABASE-OUTPUT-SPECS-LOCK*", SubLTrampolineFile.maybeDefault($database_output_specs_lock$, $database_output_specs_lock$, () -> make_lock($$$Database_Output_Specs)));
        deflexical("*SEMANTIC-ETL-FUSE-DATABASES-CACHING-STATE*", NIL);
        deflexical("*FIND-CORRESPONDING-ITEM-IN-SEMANTICS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SEMANTIC-OBJECT-COMPARISON-NAME-METHOD-TABLE*", make_vector($int$256, NIL));
        defconstant("*DTP-SEMANTICS*", SEMANTICS);
        defconstant("*DTP-TABLE-SEMANTICS*", TABLE_SEMANTICS);
        deflexical("*SEMANTIC-ETL-TABLE-ISG*", SubLTrampolineFile.maybeDefault($semantic_etl_table_isg$, $semantic_etl_table_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-FOREIGN-KEY-CONSTRAINT*", FOREIGN_KEY_CONSTRAINT);
        defconstant("*DTP-PRIMARY-KEY-CONSTRAINT*", PRIMARY_KEY_CONSTRAINT);
        defconstant("*DTP-COLUMN-SEMANTICS*", COLUMN_SEMANTICS);
        defconstant("*DTP-VALUE-SEMANTICS*", VALUE_SEMANTICS);
        deflexical("*DB-OUTPUT-SPEC-ISG*", SubLTrampolineFile.maybeDefault($db_output_spec_isg$, $db_output_spec_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-DATABASE-OUTPUT-SPEC*", DATABASE_OUTPUT_SPEC);
        defparameter("*RECIPE-MARKER*", $str257$____________________________);
        deflexical("*SEMANTIC-RECIPE-STEP-P-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*EMPTY-SEMANTIC-RECIPE-STEP-P-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SET-SEMANTIC-RECIPE-STEP-OUTPUT-SPEC-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SEMANTIC-RECIPE-APPEND-TO-DROPS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SEMANTIC-RECIPE-APPEND-TO-ADDS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SEMANTIC-RECIPE-REMOVE-FROM-DROPS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SEMANTIC-RECIPE-REMOVE-FROM-ADDS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SET-SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SEMANTIC-RECIPE-STEP-COLUMN-CORRESPONDENCE-LIST-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SET-SEMANTIC-RECIPE-STEP-SQL-START-INDEX-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SET-SEMANTIC-RECIPE-STEP-SQL-END-INDEX-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*SEMANTIC-RECIPE-STEP-COPY-METHOD-TABLE*", make_vector($int$256, NIL));
        defconstant("*DTP-TABLE-MERGER*", TABLE_MERGER);
        defconstant("*DTP-COLUMN-MERGER*", COLUMN_MERGER);
        defconstant("*DTP-SQL-CONJUNCTION*", SQL_CONJUNCTION);
        defconstant("*DTP-SQL-DISJUNCTION*", SQL_DISJUNCTION);
        defconstant("*DTP-SQL-COPY-TABLE*", SQL_COPY_TABLE);
        defconstant("*DTP-SQL-INSERT-INTO*", SQL_INSERT_INTO);
        defconstant("*DTP-SQL-SELECT-FROM*", SQL_SELECT_FROM);
        defconstant("*DTP-SQL-EXCEPT*", SQL_EXCEPT);
        defconstant("*DTP-SQL-ALIAS*", SQL_ALIAS);
        defconstant("*DTP-SQL-COLUMN-EQUAL*", SQL_COLUMN_EQUAL);
        defconstant("*DTP-SQL-IS-NULL*", SQL_IS_NULL);
        defconstant("*DTP-SQL-NOT-IN*", SQL_NOT_IN);
        defconstant("*DTP-SQL-INNER-JOIN*", SQL_INNER_JOIN);
        defconstant("*DTP-SQL-LEFT-JOIN*", SQL_LEFT_JOIN);
        defconstant("*DTP-SQL-UNION*", SQL_UNION);
        defconstant("*DTP-SQL-ALTER-TABLE*", SQL_ALTER_TABLE);
        defconstant("*DTP-SQL-ADD-COLUMN*", SQL_ADD_COLUMN);
        defconstant("*DTP-SQL-DROP-COLUMN*", SQL_DROP_COLUMN);
        defconstant("*DTP-SQL-RENAME-COLUMN*", SQL_RENAME_COLUMN);
        defconstant("*DTP-SQL-ADD-CONSTRAINT*", SQL_ADD_CONSTRAINT);
        defconstant("*DTP-SQL-DROP-CONSTRAINT*", SQL_DROP_CONSTRAINT);
        defconstant("*DTP-SQL-FK-COLUMN-CONSTRAINT*", SQL_FK_COLUMN_CONSTRAINT);
        defconstant("*DTP-SQL-FK-TABLE-CONSTRAINT*", SQL_FK_TABLE_CONSTRAINT);
        defconstant("*DTP-SQL-UPDATE*", SQL_UPDATE);
        defconstant("*DTP-SQL-DROP-TABLE*", SQL_DROP_TABLE);
        deflexical("*ACCESS-PATH-MAP*", SubLTrampolineFile.maybeDefault($access_path_map$, $access_path_map$, NIL));
        deflexical("*BLN1-ACCESS-PATH*", SubLTrampolineFile.maybeDefault($sym795$_BLN1_ACCESS_PATH_, $bln1_access_path$, NIL));
        deflexical("*BLN2-ACCESS-PATH*", SubLTrampolineFile.maybeDefault($sym796$_BLN2_ACCESS_PATH_, $bln2_access_path$, NIL));
        deflexical("*USGS-ACCESS-PATH*", SubLTrampolineFile.maybeDefault($usgs_access_path$, $usgs_access_path$, NIL));
        deflexical("*NGA-ACCESS-PATH*", SubLTrampolineFile.maybeDefault($nga_access_path$, $nga_access_path$, NIL));
        deflexical("*GNDB-ACCESS-PATH*", SubLTrampolineFile.maybeDefault($gndb_access_path$, $gndb_access_path$, NIL));
        deflexical("*BATHYMETRIC-DATA-ACCESS-PATH*", SubLTrampolineFile.maybeDefault($bathymetric_data_access_path$, $bathymetric_data_access_path$, NIL));
        deflexical("*BATHYMETRIC-HEADER-ACCESS-PATH*", SubLTrampolineFile.maybeDefault($bathymetric_header_access_path$, $bathymetric_header_access_path$, NIL));
        deflexical("*SPORTING-GOODS-ACCESS-PATH*", SubLTrampolineFile.maybeDefault($sporting_goods_access_path$, $sporting_goods_access_path$, NIL));
        deflexical("*NORTHWIND-ACCESS-PATH*", SubLTrampolineFile.maybeDefault($northwind_access_path$, $northwind_access_path$, NIL));
        return NIL;
    }

    public static SubLObject setup_semantic_etl_bus_file() {
        declare_defglobal($database_output_specs$);
        declare_defglobal($database_output_specs_lock$);
        memoization_state.note_globally_cached_function(SEMANTIC_ETL_FUSE_DATABASES);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_semantics$.getGlobalValue(), symbol_function(SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list28);
        def_csetf(SEMANT_ACCESS_PATH, _CSETF_SEMANT_ACCESS_PATH);
        def_csetf(SEMANT_TABLE_SEMANTICS_LIST, _CSETF_SEMANT_TABLE_SEMANTICS_LIST);
        def_csetf(SEMANT_TABLE_ALIASES, _CSETF_SEMANT_TABLE_ALIASES);
        def_csetf(SEMANT_DICT, _CSETF_SEMANT_DICT);
        def_csetf(SEMANT_DROPPED_ITEMS, _CSETF_SEMANT_DROPPED_ITEMS);
        def_csetf(SEMANT_OUTPUT_SPEC, _CSETF_SEMANT_OUTPUT_SPEC);
        identity(SEMANTICS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_semantics$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SEMANTICS_METHOD));
        note_funcall_helper_function(PRINT_SEMANTICS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_table_semantics$.getGlobalValue(), symbol_function(TABLE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list69);
        def_csetf(T_SEMANT_TABLE_ID, _CSETF_T_SEMANT_TABLE_ID);
        def_csetf(T_SEMANT_TABLE_NAME, _CSETF_T_SEMANT_TABLE_NAME);
        def_csetf(T_SEMANT_SOURCE_SEMANTICS, _CSETF_T_SEMANT_SOURCE_SEMANTICS);
        def_csetf(T_SEMANT_SEMANTICS, _CSETF_T_SEMANT_SEMANTICS);
        def_csetf(T_SEMANT_POINTS_TO_TABLE_IDS, _CSETF_T_SEMANT_POINTS_TO_TABLE_IDS);
        def_csetf(T_SEMANT_POINTED_TO_BY_TABLE_IDS, _CSETF_T_SEMANT_POINTED_TO_BY_TABLE_IDS);
        def_csetf(T_SEMANT_TABLE_PARSES, _CSETF_T_SEMANT_TABLE_PARSES);
        def_csetf(T_SEMANT_COLUMN_SEMANTICS_LIST, _CSETF_T_SEMANT_COLUMN_SEMANTICS_LIST);
        def_csetf(T_SEMANT_PRIMARY_KEY_COLUMNS, _CSETF_T_SEMANT_PRIMARY_KEY_COLUMNS);
        def_csetf(T_SEMANT_COLUMN_CONSTRAINTS, _CSETF_T_SEMANT_COLUMN_CONSTRAINTS);
        identity(TABLE_SEMANTICS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_table_semantics$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TABLE_SEMANTICS_METHOD));
        note_funcall_helper_function(PRINT_TABLE_SEMANTICS);
        declare_defglobal($semantic_etl_table_isg$);
        register_method($find_corresponding_item_in_semantics_method_table$.getGlobalValue(), $dtp_table_semantics$.getGlobalValue(), symbol_function(FIND_CORRESPONDING_ITEM_IN_SEMANTICS_TABLE_SEMANTICS_METHOD));
        register_method($semantic_object_comparison_name_method_table$.getGlobalValue(), $dtp_table_semantics$.getGlobalValue(), symbol_function(SEMANTIC_OBJECT_COMPARISON_NAME_TABLE_SEMANTICS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_foreign_key_constraint$.getGlobalValue(), symbol_function(FOREIGN_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list126);
        def_csetf(FK_CONSTRAINT_CONSTRAINT_NAME, _CSETF_FK_CONSTRAINT_CONSTRAINT_NAME);
        def_csetf(FK_CONSTRAINT_CONSTRAINED_COLUMN, _CSETF_FK_CONSTRAINT_CONSTRAINED_COLUMN);
        def_csetf(FK_CONSTRAINT_CONSTRAINING_TABLE, _CSETF_FK_CONSTRAINT_CONSTRAINING_TABLE);
        def_csetf(FK_CONSTRAINT_CONSTRAINING_COLUMN, _CSETF_FK_CONSTRAINT_CONSTRAINING_COLUMN);
        identity(FOREIGN_KEY_CONSTRAINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_foreign_key_constraint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FOREIGN_KEY_CONSTRAINT_METHOD));
        note_funcall_helper_function(PRINT_FOREIGN_KEY_CONSTRAINT);
        register_method($find_corresponding_item_in_semantics_method_table$.getGlobalValue(), $dtp_foreign_key_constraint$.getGlobalValue(), symbol_function($sym142$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_FOREIGN_KEY_CONSTRAINT_METHO));
        register_method($semantic_object_comparison_name_method_table$.getGlobalValue(), $dtp_foreign_key_constraint$.getGlobalValue(), symbol_function(SEMANTIC_OBJECT_COMPARISON_NAME_FOREIGN_KEY_CONSTRAINT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_primary_key_constraint$.getGlobalValue(), symbol_function(PRIMARY_KEY_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list153);
        def_csetf(PK_CONSTRAINT_CONSTRAINT_NAME, _CSETF_PK_CONSTRAINT_CONSTRAINT_NAME);
        def_csetf(PK_CONSTRAINT_CONSTRAINT_TYPE, _CSETF_PK_CONSTRAINT_CONSTRAINT_TYPE);
        def_csetf(PK_CONSTRAINT_CONSTRAINED_COLUMN, _CSETF_PK_CONSTRAINT_CONSTRAINED_COLUMN);
        identity(PRIMARY_KEY_CONSTRAINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_primary_key_constraint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PRIMARY_KEY_CONSTRAINT_METHOD));
        note_funcall_helper_function(PRINT_PRIMARY_KEY_CONSTRAINT);
        register_method($find_corresponding_item_in_semantics_method_table$.getGlobalValue(), $dtp_primary_key_constraint$.getGlobalValue(), symbol_function($sym164$FIND_CORRESPONDING_ITEM_IN_SEMANTICS_PRIMARY_KEY_CONSTRAINT_METHO));
        register_method($semantic_object_comparison_name_method_table$.getGlobalValue(), $dtp_primary_key_constraint$.getGlobalValue(), symbol_function(SEMANTIC_OBJECT_COMPARISON_NAME_PRIMARY_KEY_CONSTRAINT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_column_semantics$.getGlobalValue(), symbol_function(COLUMN_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list174);
        def_csetf(C_SEMANT_COLUMN_NAME, _CSETF_C_SEMANT_COLUMN_NAME);
        def_csetf(C_SEMANT_COLUMN_PARSES, _CSETF_C_SEMANT_COLUMN_PARSES);
        def_csetf(C_SEMANT_TABLE_SEMANTICS, _CSETF_C_SEMANT_TABLE_SEMANTICS);
        def_csetf(C_SEMANT_VALUE_SEMANTICS_LIST, _CSETF_C_SEMANT_VALUE_SEMANTICS_LIST);
        def_csetf(C_SEMANT_COLUMN_TYPE, _CSETF_C_SEMANT_COLUMN_TYPE);
        def_csetf(C_SEMANT_COLUMN_SIZE, _CSETF_C_SEMANT_COLUMN_SIZE);
        identity(COLUMN_SEMANTICS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_column_semantics$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_COLUMN_SEMANTICS_METHOD));
        note_funcall_helper_function(PRINT_COLUMN_SEMANTICS);
        register_method($find_corresponding_item_in_semantics_method_table$.getGlobalValue(), $dtp_column_semantics$.getGlobalValue(), symbol_function(FIND_CORRESPONDING_ITEM_IN_SEMANTICS_COLUMN_SEMANTICS_METHOD));
        register_method($semantic_object_comparison_name_method_table$.getGlobalValue(), $dtp_column_semantics$.getGlobalValue(), symbol_function(SEMANTIC_OBJECT_COMPARISON_NAME_COLUMN_SEMANTICS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_value_semantics$.getGlobalValue(), symbol_function(VALUE_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list213);
        def_csetf(V_SEMANT_VALUE, _CSETF_V_SEMANT_VALUE);
        def_csetf(V_SEMANT_VALUE_PARSES, _CSETF_V_SEMANT_VALUE_PARSES);
        identity(VALUE_SEMANTICS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_value_semantics$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VALUE_SEMANTICS_METHOD));
        note_funcall_helper_function(PRINT_VALUE_SEMANTICS);
        declare_defglobal($db_output_spec_isg$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_database_output_spec$.getGlobalValue(), symbol_function(DATABASE_OUTPUT_SPEC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list233);
        def_csetf(DB_OUTPUT_SPEC_ID, _CSETF_DB_OUTPUT_SPEC_ID);
        def_csetf(DB_OUTPUT_SPEC_SEMANTICS1, _CSETF_DB_OUTPUT_SPEC_SEMANTICS1);
        def_csetf(DB_OUTPUT_SPEC_SEMANTICS2, _CSETF_DB_OUTPUT_SPEC_SEMANTICS2);
        def_csetf(DB_OUTPUT_SPEC_RECIPE, _CSETF_DB_OUTPUT_SPEC_RECIPE);
        def_csetf(DB_OUTPUT_SPEC_SEMANTICS, _CSETF_DB_OUTPUT_SPEC_SEMANTICS);
        def_csetf(DB_OUTPUT_SPEC_SEMANTIC_RECIPE, _CSETF_DB_OUTPUT_SPEC_SEMANTIC_RECIPE);
        identity(DATABASE_OUTPUT_SPEC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_database_output_spec$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DATABASE_OUTPUT_SPEC_METHOD));
        note_funcall_helper_function(PRINT_DATABASE_OUTPUT_SPEC);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(TABLE_MERGER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list274);
        def_csetf(TABLE_MERGER_ID, _CSETF_TABLE_MERGER_ID);
        def_csetf(TABLE_MERGER_OUTPUT_SPEC, _CSETF_TABLE_MERGER_OUTPUT_SPEC);
        def_csetf(TABLE_MERGER_SOURCES, _CSETF_TABLE_MERGER_SOURCES);
        def_csetf(TABLE_MERGER_TARGET, _CSETF_TABLE_MERGER_TARGET);
        def_csetf(TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST, _CSETF_TABLE_MERGER_COLUMN_CORRESPONDENCE_LIST);
        def_csetf(TABLE_MERGER_ADDED, _CSETF_TABLE_MERGER_ADDED);
        def_csetf(TABLE_MERGER_DROPPED, _CSETF_TABLE_MERGER_DROPPED);
        def_csetf(TABLE_MERGER_SQL_START_INDEX, _CSETF_TABLE_MERGER_SQL_START_INDEX);
        def_csetf(TABLE_MERGER_SQL_END_INDEX, _CSETF_TABLE_MERGER_SQL_END_INDEX);
        identity(TABLE_MERGER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TABLE_MERGER_METHOD));
        note_funcall_helper_function(PRINT_TABLE_MERGER);
        register_method($semantic_recipe_step_p_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD));
        register_method($empty_semantic_recipe_step_p_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(EMPTY_SEMANTIC_RECIPE_STEP_P_TABLE_MERGER_METHOD));
        register_method($semantic_recipe_append_to_drops_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_APPEND_TO_DROPS_TABLE_MERGER_METHOD));
        register_method($semantic_recipe_append_to_adds_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_APPEND_TO_ADDS_TABLE_MERGER_METHOD));
        register_method($semantic_recipe_remove_from_drops_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_REMOVE_FROM_DROPS_TABLE_MERGER_METHOD));
        register_method($semantic_recipe_remove_from_adds_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_REMOVE_FROM_ADDS_TABLE_MERGER_METHOD));
        register_method($set_semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function($sym313$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_));
        register_method($semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function($sym314$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_TABLE_MERGER_METH));
        register_method($set_semantic_recipe_step_output_spec_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_TABLE_MERGER_METHOD));
        register_method($set_semantic_recipe_step_sql_start_index_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_TABLE_MERGER_METHOD));
        register_method($set_semantic_recipe_step_sql_end_index_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_TABLE_MERGER_METHOD));
        register_method($semantic_recipe_step_copy_method_table$.getGlobalValue(), $dtp_table_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_STEP_COPY_TABLE_MERGER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(COLUMN_MERGER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list330);
        def_csetf(COLUMN_MERGER_OUTPUT_SPEC, _CSETF_COLUMN_MERGER_OUTPUT_SPEC);
        def_csetf(COLUMN_MERGER_SOURCES, _CSETF_COLUMN_MERGER_SOURCES);
        def_csetf(COLUMN_MERGER_TARGET, _CSETF_COLUMN_MERGER_TARGET);
        def_csetf(COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST, _CSETF_COLUMN_MERGER_COLUMN_CORRESPONDENCE_LIST);
        def_csetf(COLUMN_MERGER_ADDED, _CSETF_COLUMN_MERGER_ADDED);
        def_csetf(COLUMN_MERGER_DROPPED, _CSETF_COLUMN_MERGER_DROPPED);
        def_csetf(COLUMN_MERGER_SQL_START_INDEX, _CSETF_COLUMN_MERGER_SQL_START_INDEX);
        def_csetf(COLUMN_MERGER_SQL_END_INDEX, _CSETF_COLUMN_MERGER_SQL_END_INDEX);
        identity(COLUMN_MERGER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_COLUMN_MERGER_METHOD));
        note_funcall_helper_function(PRINT_COLUMN_MERGER);
        register_method($semantic_recipe_step_p_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD));
        register_method($empty_semantic_recipe_step_p_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(EMPTY_SEMANTIC_RECIPE_STEP_P_COLUMN_MERGER_METHOD));
        register_method($semantic_recipe_append_to_drops_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_APPEND_TO_DROPS_COLUMN_MERGER_METHOD));
        register_method($semantic_recipe_append_to_adds_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_APPEND_TO_ADDS_COLUMN_MERGER_METHOD));
        register_method($semantic_recipe_remove_from_drops_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_REMOVE_FROM_DROPS_COLUMN_MERGER_METHOD));
        register_method($semantic_recipe_remove_from_adds_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_REMOVE_FROM_ADDS_COLUMN_MERGER_METHOD));
        register_method($set_semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function($sym356$SET_SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER));
        register_method($semantic_recipe_step_column_correspondence_list_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function($sym357$SEMANTIC_RECIPE_STEP_COLUMN_CORRESPONDENCE_LIST_COLUMN_MERGER_MET));
        register_method($set_semantic_recipe_step_output_spec_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(SET_SEMANTIC_RECIPE_STEP_OUTPUT_SPEC_COLUMN_MERGER_METHOD));
        register_method($set_semantic_recipe_step_sql_start_index_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(SET_SEMANTIC_RECIPE_STEP_SQL_START_INDEX_COLUMN_MERGER_METHOD));
        register_method($set_semantic_recipe_step_sql_end_index_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(SET_SEMANTIC_RECIPE_STEP_SQL_END_INDEX_COLUMN_MERGER_METHOD));
        register_method($semantic_recipe_step_copy_method_table$.getGlobalValue(), $dtp_column_merger$.getGlobalValue(), symbol_function(SEMANTIC_RECIPE_STEP_COPY_COLUMN_MERGER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_conjunction$.getGlobalValue(), symbol_function(SQL_CONJUNCTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list377);
        def_csetf(SQL_CONJUNCTION_CONJUNCTS, _CSETF_SQL_CONJUNCTION_CONJUNCTS);
        identity(SQL_CONJUNCTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_conjunction$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_CONJUNCTION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_disjunction$.getGlobalValue(), symbol_function(SQL_DISJUNCTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list393);
        def_csetf(SQL_DISJUNCTION_DISJUNCTS, _CSETF_SQL_DISJUNCTION_DISJUNCTS);
        identity(SQL_DISJUNCTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_disjunction$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_DISJUNCTION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_copy_table$.getGlobalValue(), symbol_function(SQL_COPY_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list408);
        def_csetf(SQL_COPY_TABLE_TABLE, _CSETF_SQL_COPY_TABLE_TABLE);
        def_csetf(SQL_COPY_TABLE_FROM, _CSETF_SQL_COPY_TABLE_FROM);
        def_csetf(SQL_COPY_TABLE_TO, _CSETF_SQL_COPY_TABLE_TO);
        identity(SQL_COPY_TABLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_copy_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_COPY_TABLE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_insert_into$.getGlobalValue(), symbol_function(SQL_INSERT_INTO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list429);
        def_csetf(SQL_INSERT_INTO_TABLE, _CSETF_SQL_INSERT_INTO_TABLE);
        def_csetf(SQL_INSERT_INTO_COLUMNS, _CSETF_SQL_INSERT_INTO_COLUMNS);
        def_csetf(SQL_INSERT_INTO_DATA, _CSETF_SQL_INSERT_INTO_DATA);
        identity(SQL_INSERT_INTO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_insert_into$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_INSERT_INTO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_select_from$.getGlobalValue(), symbol_function(SQL_SELECT_FROM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list451);
        def_csetf(SQL_SELECT_FROM_COLUMNS, _CSETF_SQL_SELECT_FROM_COLUMNS);
        def_csetf(SQL_SELECT_FROM_TABLES, _CSETF_SQL_SELECT_FROM_TABLES);
        def_csetf(SQL_SELECT_FROM_CONDITIONS, _CSETF_SQL_SELECT_FROM_CONDITIONS);
        identity(SQL_SELECT_FROM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_select_from$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_SELECT_FROM_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_except$.getGlobalValue(), symbol_function(SQL_EXCEPT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list473);
        def_csetf(SQL_EXCEPT_TABLE1, _CSETF_SQL_EXCEPT_TABLE1);
        def_csetf(SQL_EXCEPT_TABLE2, _CSETF_SQL_EXCEPT_TABLE2);
        identity(SQL_EXCEPT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_except$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_EXCEPT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_alias$.getGlobalValue(), symbol_function(SQL_ALIAS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list491);
        def_csetf(SQL_ALIAS_TABLE, _CSETF_SQL_ALIAS_TABLE);
        def_csetf(SQL_ALIAS_ALIAS, _CSETF_SQL_ALIAS_ALIAS);
        identity(SQL_ALIAS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_alias$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_ALIAS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_column_equal$.getGlobalValue(), symbol_function(SQL_COLUMN_EQUAL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list508);
        def_csetf(SQL_COLUMN_EQUAL_TABLE1, _CSETF_SQL_COLUMN_EQUAL_TABLE1);
        def_csetf(SQL_COLUMN_EQUAL_COLUMN1, _CSETF_SQL_COLUMN_EQUAL_COLUMN1);
        def_csetf(SQL_COLUMN_EQUAL_TABLE2, _CSETF_SQL_COLUMN_EQUAL_TABLE2);
        def_csetf(SQL_COLUMN_EQUAL_COLUMN2, _CSETF_SQL_COLUMN_EQUAL_COLUMN2);
        identity(SQL_COLUMN_EQUAL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_column_equal$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_COLUMN_EQUAL_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_is_null$.getGlobalValue(), symbol_function(SQL_IS_NULL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list530);
        def_csetf(SQL_IS_NULL_TABLE, _CSETF_SQL_IS_NULL_TABLE);
        def_csetf(SQL_IS_NULL_COLUMN, _CSETF_SQL_IS_NULL_COLUMN);
        identity(SQL_IS_NULL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_is_null$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_IS_NULL_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_not_in$.getGlobalValue(), symbol_function(SQL_NOT_IN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list547);
        def_csetf(SQL_NOT_IN_COLUMN_TABLE, _CSETF_SQL_NOT_IN_COLUMN_TABLE);
        def_csetf(SQL_NOT_IN_COLUMN, _CSETF_SQL_NOT_IN_COLUMN);
        def_csetf(SQL_NOT_IN_TABLE, _CSETF_SQL_NOT_IN_TABLE);
        identity(SQL_NOT_IN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_not_in$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_NOT_IN_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_inner_join$.getGlobalValue(), symbol_function(SQL_INNER_JOIN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list566);
        def_csetf(SQL_INNER_JOIN_TABLE1, _CSETF_SQL_INNER_JOIN_TABLE1);
        def_csetf(SQL_INNER_JOIN_TABLE2, _CSETF_SQL_INNER_JOIN_TABLE2);
        def_csetf(SQL_INNER_JOIN_ON, _CSETF_SQL_INNER_JOIN_ON);
        identity(SQL_INNER_JOIN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_inner_join$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_INNER_JOIN_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_left_join$.getGlobalValue(), symbol_function(SQL_LEFT_JOIN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list585);
        def_csetf(SQL_LEFT_JOIN_LEFT_TABLE, _CSETF_SQL_LEFT_JOIN_LEFT_TABLE);
        def_csetf(SQL_LEFT_JOIN_RIGHT_TABLE, _CSETF_SQL_LEFT_JOIN_RIGHT_TABLE);
        def_csetf(SQL_LEFT_JOIN_ON, _CSETF_SQL_LEFT_JOIN_ON);
        identity(SQL_LEFT_JOIN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_left_join$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_LEFT_JOIN_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_union$.getGlobalValue(), symbol_function(SQL_UNION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list605);
        def_csetf(SQL_UNION_SELECT1, _CSETF_SQL_UNION_SELECT1);
        def_csetf(SQL_UNION_SELECT2, _CSETF_SQL_UNION_SELECT2);
        identity(SQL_UNION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_union$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_UNION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_alter_table$.getGlobalValue(), symbol_function(SQL_ALTER_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list623);
        def_csetf(SQL_ALTER_TABLE_TABLE, _CSETF_SQL_ALTER_TABLE_TABLE);
        def_csetf(SQL_ALTER_TABLE_ACTION, _CSETF_SQL_ALTER_TABLE_ACTION);
        identity(SQL_ALTER_TABLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_alter_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_ALTER_TABLE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_add_column$.getGlobalValue(), symbol_function(SQL_ADD_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list641);
        def_csetf(SQL_ADD_COLUMN_COLUMN, _CSETF_SQL_ADD_COLUMN_COLUMN);
        def_csetf(SQL_ADD_COLUMN_TYPE, _CSETF_SQL_ADD_COLUMN_TYPE);
        def_csetf(SQL_ADD_COLUMN_SIZE, _CSETF_SQL_ADD_COLUMN_SIZE);
        def_csetf(SQL_ADD_COLUMN_CONSTRAINTS, _CSETF_SQL_ADD_COLUMN_CONSTRAINTS);
        identity(SQL_ADD_COLUMN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_add_column$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_ADD_COLUMN_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_drop_column$.getGlobalValue(), symbol_function(SQL_DROP_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list667);
        def_csetf(SQL_DROP_COLUMN_COLUMN, _CSETF_SQL_DROP_COLUMN_COLUMN);
        identity(SQL_DROP_COLUMN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_drop_column$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_DROP_COLUMN_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_rename_column$.getGlobalValue(), symbol_function(SQL_RENAME_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list681);
        def_csetf(SQL_RENAME_COLUMN_OLD_COLUMN, _CSETF_SQL_RENAME_COLUMN_OLD_COLUMN);
        def_csetf(SQL_RENAME_COLUMN_NEW_COLUMN, _CSETF_SQL_RENAME_COLUMN_NEW_COLUMN);
        identity(SQL_RENAME_COLUMN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_rename_column$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_RENAME_COLUMN_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_add_constraint$.getGlobalValue(), symbol_function(SQL_ADD_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list699);
        def_csetf(SQL_ADD_CONSTRAINT_CONSTRAINT, _CSETF_SQL_ADD_CONSTRAINT_CONSTRAINT);
        identity(SQL_ADD_CONSTRAINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_add_constraint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_ADD_CONSTRAINT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_drop_constraint$.getGlobalValue(), symbol_function(SQL_DROP_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list713);
        def_csetf(SQL_DROP_CONSTRAINT_CONSTRAINT, _CSETF_SQL_DROP_CONSTRAINT_CONSTRAINT);
        identity(SQL_DROP_CONSTRAINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_drop_constraint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_DROP_CONSTRAINT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_fk_column_constraint$.getGlobalValue(), symbol_function(SQL_FK_COLUMN_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list727);
        def_csetf(SQL_FK_COLUMN_CONSTRAINT_NAME, _CSETF_SQL_FK_COLUMN_CONSTRAINT_NAME);
        def_csetf(SQL_FK_COLUMN_CONSTRAINT_TABLE, _CSETF_SQL_FK_COLUMN_CONSTRAINT_TABLE);
        def_csetf(SQL_FK_COLUMN_CONSTRAINT_COLUMN, _CSETF_SQL_FK_COLUMN_CONSTRAINT_COLUMN);
        identity(SQL_FK_COLUMN_CONSTRAINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_fk_column_constraint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_FK_COLUMN_CONSTRAINT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_fk_table_constraint$.getGlobalValue(), symbol_function(SQL_FK_TABLE_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list746);
        def_csetf(SQL_FK_TABLE_CONSTRAINT_COLUMN, _CSETF_SQL_FK_TABLE_CONSTRAINT_COLUMN);
        def_csetf(SQL_FK_TABLE_CONSTRAINT_CONSTRAINT, _CSETF_SQL_FK_TABLE_CONSTRAINT_CONSTRAINT);
        identity(SQL_FK_TABLE_CONSTRAINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_fk_table_constraint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_FK_TABLE_CONSTRAINT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_update$.getGlobalValue(), symbol_function(SQL_UPDATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list762);
        def_csetf(SQL_UPDATE_TABLE, _CSETF_SQL_UPDATE_TABLE);
        def_csetf(SQL_UPDATE_SETTINGS, _CSETF_SQL_UPDATE_SETTINGS);
        def_csetf(SQL_UPDATE_CONDITIONS, _CSETF_SQL_UPDATE_CONDITIONS);
        identity(SQL_UPDATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_update$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_UPDATE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_drop_table$.getGlobalValue(), symbol_function(SQL_DROP_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list782);
        def_csetf(SQL_DROP_TABLE_TABLE, _CSETF_SQL_DROP_TABLE_TABLE);
        identity(SQL_DROP_TABLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_drop_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_DROP_TABLE_METHOD));
        declare_defglobal($access_path_map$);
        declare_defglobal($sym795$_BLN1_ACCESS_PATH_);
        declare_defglobal($sym796$_BLN2_ACCESS_PATH_);
        declare_defglobal($usgs_access_path$);
        declare_defglobal($nga_access_path$);
        declare_defglobal($gndb_access_path$);
        declare_defglobal($bathymetric_data_access_path$);
        declare_defglobal($bathymetric_header_access_path$);
        declare_defglobal($sporting_goods_access_path$);
        declare_defglobal($northwind_access_path$);
        return NIL;
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







































































































































































































































































































































































































































































































































































































































































































































































































































































































































    }

    public static final class $semantics_native extends SubLStructNative {
        public SubLObject $access_path;

        public SubLObject $table_semantics_list;

        public SubLObject $table_aliases;

        public SubLObject $dict;

        public SubLObject $dropped_items;

        public SubLObject $output_spec;

        private static final SubLStructDeclNative structDecl;

        private $semantics_native() {
            this.$access_path = Lisp.NIL;
            this.$table_semantics_list = Lisp.NIL;
            this.$table_aliases = Lisp.NIL;
            this.$dict = Lisp.NIL;
            this.$dropped_items = Lisp.NIL;
            this.$output_spec = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($semantics_native.class, SEMANTICS, SEMANTICS_P, $list22, $list23, new String[]{ "$access_path", "$table_semantics_list", "$table_aliases", "$dict", "$dropped_items", "$output_spec" }, $list24, $list25, PRINT_SEMANTICS);
        }
    }

    public static final class $semantics_p$UnaryFunction extends UnaryFunction {
        public $semantics_p$UnaryFunction() {
            super(extractFunctionNamed("SEMANTICS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return semantics_p(arg1);
        }
    }

    public static final class $table_semantics_native extends SubLStructNative {
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

        private $table_semantics_native() {
            this.$table_id = Lisp.NIL;
            this.$table_name = Lisp.NIL;
            this.$source_semantics = Lisp.NIL;
            this.$semantics = Lisp.NIL;
            this.$points_to_table_ids = Lisp.NIL;
            this.$pointed_to_by_table_ids = Lisp.NIL;
            this.$table_parses = Lisp.NIL;
            this.$column_semantics_list = Lisp.NIL;
            this.$primary_key_columns = Lisp.NIL;
            this.$column_constraints = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($table_semantics_native.class, TABLE_SEMANTICS, TABLE_SEMANTICS_P, $list63, $list64, new String[]{ "$table_id", "$table_name", "$source_semantics", "$semantics", "$points_to_table_ids", "$pointed_to_by_table_ids", "$table_parses", "$column_semantics_list", "$primary_key_columns", "$column_constraints" }, $list65, $list66, PRINT_TABLE_SEMANTICS);
        }
    }

    public static final class $table_semantics_p$UnaryFunction extends UnaryFunction {
        public $table_semantics_p$UnaryFunction() {
            super(extractFunctionNamed("TABLE-SEMANTICS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return table_semantics_p(arg1);
        }
    }

    public static final class $foreign_key_constraint_native extends SubLStructNative {
        public SubLObject $constraint_name;

        public SubLObject $constrained_column;

        public SubLObject $constraining_table;

        public SubLObject $constraining_column;

        private static final SubLStructDeclNative structDecl;

        private $foreign_key_constraint_native() {
            this.$constraint_name = Lisp.NIL;
            this.$constrained_column = Lisp.NIL;
            this.$constraining_table = Lisp.NIL;
            this.$constraining_column = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($foreign_key_constraint_native.class, FOREIGN_KEY_CONSTRAINT, FOREIGN_KEY_CONSTRAINT_P, $list120, $list121, new String[]{ "$constraint_name", "$constrained_column", "$constraining_table", "$constraining_column" }, $list122, $list123, PRINT_FOREIGN_KEY_CONSTRAINT);
        }
    }

    public static final class $foreign_key_constraint_p$UnaryFunction extends UnaryFunction {
        public $foreign_key_constraint_p$UnaryFunction() {
            super(extractFunctionNamed("FOREIGN-KEY-CONSTRAINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return foreign_key_constraint_p(arg1);
        }
    }

    public static final class $primary_key_constraint_native extends SubLStructNative {
        public SubLObject $constraint_name;

        public SubLObject $constraint_type;

        public SubLObject $constrained_column;

        private static final SubLStructDeclNative structDecl;

        private $primary_key_constraint_native() {
            this.$constraint_name = Lisp.NIL;
            this.$constraint_type = Lisp.NIL;
            this.$constrained_column = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($primary_key_constraint_native.class, PRIMARY_KEY_CONSTRAINT, PRIMARY_KEY_CONSTRAINT_P, $list147, $list148, new String[]{ "$constraint_name", "$constraint_type", "$constrained_column" }, $list149, $list150, PRINT_PRIMARY_KEY_CONSTRAINT);
        }
    }

    public static final class $primary_key_constraint_p$UnaryFunction extends UnaryFunction {
        public $primary_key_constraint_p$UnaryFunction() {
            super(extractFunctionNamed("PRIMARY-KEY-CONSTRAINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return primary_key_constraint_p(arg1);
        }
    }

    public static final class $column_semantics_native extends SubLStructNative {
        public SubLObject $column_name;

        public SubLObject $column_parses;

        public SubLObject $table_semantics;

        public SubLObject $value_semantics_list;

        public SubLObject $column_type;

        public SubLObject $column_size;

        private static final SubLStructDeclNative structDecl;

        private $column_semantics_native() {
            this.$column_name = Lisp.NIL;
            this.$column_parses = Lisp.NIL;
            this.$table_semantics = Lisp.NIL;
            this.$value_semantics_list = Lisp.NIL;
            this.$column_type = Lisp.NIL;
            this.$column_size = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($column_semantics_native.class, COLUMN_SEMANTICS, COLUMN_SEMANTICS_P, $list168, $list169, new String[]{ "$column_name", "$column_parses", "$table_semantics", "$value_semantics_list", "$column_type", "$column_size" }, $list170, $list171, PRINT_COLUMN_SEMANTICS);
        }
    }

    public static final class $column_semantics_p$UnaryFunction extends UnaryFunction {
        public $column_semantics_p$UnaryFunction() {
            super(extractFunctionNamed("COLUMN-SEMANTICS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return column_semantics_p(arg1);
        }
    }

    public static final class $value_semantics_native extends SubLStructNative {
        public SubLObject $value;

        public SubLObject $value_parses;

        private static final SubLStructDeclNative structDecl;

        private $value_semantics_native() {
            this.$value = Lisp.NIL;
            this.$value_parses = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($value_semantics_native.class, VALUE_SEMANTICS, VALUE_SEMANTICS_P, $list207, $list208, new String[]{ "$value", "$value_parses" }, $list209, $list210, PRINT_VALUE_SEMANTICS);
        }
    }

    public static final class $value_semantics_p$UnaryFunction extends UnaryFunction {
        public $value_semantics_p$UnaryFunction() {
            super(extractFunctionNamed("VALUE-SEMANTICS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return value_semantics_p(arg1);
        }
    }

    public static final class $database_output_spec_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $semantics1;

        public SubLObject $semantics2;

        public SubLObject $recipe;

        public SubLObject $semantics;

        public SubLObject $semantic_recipe;

        private static final SubLStructDeclNative structDecl;

        private $database_output_spec_native() {
            this.$id = Lisp.NIL;
            this.$semantics1 = Lisp.NIL;
            this.$semantics2 = Lisp.NIL;
            this.$recipe = Lisp.NIL;
            this.$semantics = Lisp.NIL;
            this.$semantic_recipe = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($database_output_spec_native.class, DATABASE_OUTPUT_SPEC, DATABASE_OUTPUT_SPEC_P, $list227, $list228, new String[]{ "$id", "$semantics1", "$semantics2", "$recipe", "$semantics", "$semantic_recipe" }, $list229, $list230, PRINT_DATABASE_OUTPUT_SPEC);
        }
    }

    public static final class $database_output_spec_p$UnaryFunction extends UnaryFunction {
        public $database_output_spec_p$UnaryFunction() {
            super(extractFunctionNamed("DATABASE-OUTPUT-SPEC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return database_output_spec_p(arg1);
        }
    }

    public static final class $table_merger_native extends SubLStructNative {
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

        private $table_merger_native() {
            this.$id = Lisp.NIL;
            this.$output_spec = Lisp.NIL;
            this.$sources = Lisp.NIL;
            this.$target = Lisp.NIL;
            this.$column_correspondence_list = Lisp.NIL;
            this.$added = Lisp.NIL;
            this.$dropped = Lisp.NIL;
            this.$sql_start_index = Lisp.NIL;
            this.$sql_end_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($table_merger_native.class, TABLE_MERGER, TABLE_MERGER_P, $list268, $list269, new String[]{ "$id", "$output_spec", "$sources", "$target", "$column_correspondence_list", "$added", "$dropped", "$sql_start_index", "$sql_end_index" }, $list270, $list271, PRINT_TABLE_MERGER);
        }
    }

    public static final class $table_merger_p$UnaryFunction extends UnaryFunction {
        public $table_merger_p$UnaryFunction() {
            super(extractFunctionNamed("TABLE-MERGER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return table_merger_p(arg1);
        }
    }

    public static final class $column_merger_native extends SubLStructNative {
        public SubLObject $output_spec;

        public SubLObject $sources;

        public SubLObject $target;

        public SubLObject $column_correspondence_list;

        public SubLObject $added;

        public SubLObject $dropped;

        public SubLObject $sql_start_index;

        public SubLObject $sql_end_index;

        private static final SubLStructDeclNative structDecl;

        private $column_merger_native() {
            this.$output_spec = Lisp.NIL;
            this.$sources = Lisp.NIL;
            this.$target = Lisp.NIL;
            this.$column_correspondence_list = Lisp.NIL;
            this.$added = Lisp.NIL;
            this.$dropped = Lisp.NIL;
            this.$sql_start_index = Lisp.NIL;
            this.$sql_end_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($column_merger_native.class, COLUMN_MERGER, COLUMN_MERGER_P, $list324, $list325, new String[]{ "$output_spec", "$sources", "$target", "$column_correspondence_list", "$added", "$dropped", "$sql_start_index", "$sql_end_index" }, $list326, $list327, PRINT_COLUMN_MERGER);
        }
    }

    public static final class $column_merger_p$UnaryFunction extends UnaryFunction {
        public $column_merger_p$UnaryFunction() {
            super(extractFunctionNamed("COLUMN-MERGER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return column_merger_p(arg1);
        }
    }

    public static final class $sql_conjunction_native extends SubLStructNative {
        public SubLObject $conjuncts;

        private static final SubLStructDeclNative structDecl;

        private $sql_conjunction_native() {
            this.$conjuncts = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_conjunction_native.class, SQL_CONJUNCTION, SQL_CONJUNCTION_P, $list371, $list372, new String[]{ "$conjuncts" }, $list373, $list374, PRINT_SQL_CONJUNCTION);
        }
    }

    public static final class $sql_conjunction_p$UnaryFunction extends UnaryFunction {
        public $sql_conjunction_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-CONJUNCTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_conjunction_p(arg1);
        }
    }

    public static final class $sql_disjunction_native extends SubLStructNative {
        public SubLObject $disjuncts;

        private static final SubLStructDeclNative structDecl;

        private $sql_disjunction_native() {
            this.$disjuncts = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_disjunction_native.class, SQL_DISJUNCTION, SQL_DISJUNCTION_P, $list387, $list388, new String[]{ "$disjuncts" }, $list389, $list390, PRINT_SQL_DISJUNCTION);
        }
    }

    public static final class $sql_disjunction_p$UnaryFunction extends UnaryFunction {
        public $sql_disjunction_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-DISJUNCTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_disjunction_p(arg1);
        }
    }

    public static final class $sql_copy_table_native extends SubLStructNative {
        public SubLObject $table;

        public SubLObject $from;

        public SubLObject $to;

        private static final SubLStructDeclNative structDecl;

        private $sql_copy_table_native() {
            this.$table = Lisp.NIL;
            this.$from = Lisp.NIL;
            this.$to = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_copy_table_native.class, SQL_COPY_TABLE, SQL_COPY_TABLE_P, $list402, $list403, new String[]{ "$table", "$from", "$to" }, $list404, $list405, PRINT_SQL_COPY_TABLE);
        }
    }

    public static final class $sql_copy_table_p$UnaryFunction extends UnaryFunction {
        public $sql_copy_table_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-COPY-TABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_copy_table_p(arg1);
        }
    }

    public static final class $sql_insert_into_native extends SubLStructNative {
        public SubLObject $table;

        public SubLObject $columns;

        public SubLObject $data;

        private static final SubLStructDeclNative structDecl;

        private $sql_insert_into_native() {
            this.$table = Lisp.NIL;
            this.$columns = Lisp.NIL;
            this.$data = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_insert_into_native.class, SQL_INSERT_INTO, SQL_INSERT_INTO_P, $list423, $list424, new String[]{ "$table", "$columns", "$data" }, $list425, $list426, PRINT_SQL_INSERT_INTO);
        }
    }

    public static final class $sql_insert_into_p$UnaryFunction extends UnaryFunction {
        public $sql_insert_into_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-INSERT-INTO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_insert_into_p(arg1);
        }
    }

    public static final class $sql_select_from_native extends SubLStructNative {
        public SubLObject $columns;

        public SubLObject $tables;

        public SubLObject $conditions;

        private static final SubLStructDeclNative structDecl;

        private $sql_select_from_native() {
            this.$columns = Lisp.NIL;
            this.$tables = Lisp.NIL;
            this.$conditions = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_select_from_native.class, SQL_SELECT_FROM, SQL_SELECT_FROM_P, $list445, $list446, new String[]{ "$columns", "$tables", "$conditions" }, $list447, $list448, PRINT_SQL_SELECT_FROM);
        }
    }

    public static final class $sql_select_from_p$UnaryFunction extends UnaryFunction {
        public $sql_select_from_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-SELECT-FROM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_select_from_p(arg1);
        }
    }

    public static final class $sql_except_native extends SubLStructNative {
        public SubLObject $table1;

        public SubLObject $table2;

        private static final SubLStructDeclNative structDecl;

        private $sql_except_native() {
            this.$table1 = Lisp.NIL;
            this.$table2 = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_except_native.class, SQL_EXCEPT, SQL_EXCEPT_P, $list467, $list468, new String[]{ "$table1", "$table2" }, $list469, $list470, PRINT_SQL_EXCEPT);
        }
    }

    public static final class $sql_except_p$UnaryFunction extends UnaryFunction {
        public $sql_except_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-EXCEPT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_except_p(arg1);
        }
    }

    public static final class $sql_alias_native extends SubLStructNative {
        public SubLObject $table;

        public SubLObject $alias;

        private static final SubLStructDeclNative structDecl;

        private $sql_alias_native() {
            this.$table = Lisp.NIL;
            this.$alias = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_alias_native.class, SQL_ALIAS, SQL_ALIAS_P, $list485, $list486, new String[]{ "$table", "$alias" }, $list487, $list488, PRINT_SQL_ALIAS);
        }
    }

    public static final class $sql_alias_p$UnaryFunction extends UnaryFunction {
        public $sql_alias_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-ALIAS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_alias_p(arg1);
        }
    }

    public static final class $sql_column_equal_native extends SubLStructNative {
        public SubLObject $table1;

        public SubLObject $column1;

        public SubLObject $table2;

        public SubLObject $column2;

        private static final SubLStructDeclNative structDecl;

        private $sql_column_equal_native() {
            this.$table1 = Lisp.NIL;
            this.$column1 = Lisp.NIL;
            this.$table2 = Lisp.NIL;
            this.$column2 = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_column_equal_native.class, SQL_COLUMN_EQUAL, SQL_COLUMN_EQUAL_P, $list502, $list503, new String[]{ "$table1", "$column1", "$table2", "$column2" }, $list504, $list505, PRINT_SQL_COLUMN_EQUAL);
        }
    }

    public static final class $sql_column_equal_p$UnaryFunction extends UnaryFunction {
        public $sql_column_equal_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-COLUMN-EQUAL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_column_equal_p(arg1);
        }
    }

    public static final class $sql_is_null_native extends SubLStructNative {
        public SubLObject $table;

        public SubLObject $column;

        private static final SubLStructDeclNative structDecl;

        private $sql_is_null_native() {
            this.$table = Lisp.NIL;
            this.$column = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_is_null_native.class, SQL_IS_NULL, SQL_IS_NULL_P, $list524, $list525, new String[]{ "$table", "$column" }, $list526, $list527, PRINT_SQL_IS_NULL);
        }
    }

    public static final class $sql_is_null_p$UnaryFunction extends UnaryFunction {
        public $sql_is_null_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-IS-NULL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_is_null_p(arg1);
        }
    }

    public static final class $sql_not_in_native extends SubLStructNative {
        public SubLObject $column_table;

        public SubLObject $column;

        public SubLObject $table;

        private static final SubLStructDeclNative structDecl;

        private $sql_not_in_native() {
            this.$column_table = Lisp.NIL;
            this.$column = Lisp.NIL;
            this.$table = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_not_in_native.class, SQL_NOT_IN, SQL_NOT_IN_P, $list541, $list542, new String[]{ "$column_table", "$column", "$table" }, $list543, $list544, PRINT_SQL_NOT_IN);
        }
    }

    public static final class $sql_not_in_p$UnaryFunction extends UnaryFunction {
        public $sql_not_in_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-NOT-IN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_not_in_p(arg1);
        }
    }

    public static final class $sql_inner_join_native extends SubLStructNative {
        public SubLObject $table1;

        public SubLObject $table2;

        public SubLObject $on;

        private static final SubLStructDeclNative structDecl;

        private $sql_inner_join_native() {
            this.$table1 = Lisp.NIL;
            this.$table2 = Lisp.NIL;
            this.$on = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_inner_join_native.class, SQL_INNER_JOIN, SQL_INNER_JOIN_P, $list560, $list561, new String[]{ "$table1", "$table2", "$on" }, $list562, $list563, PRINT_SQL_INNER_JOIN);
        }
    }

    public static final class $sql_inner_join_p$UnaryFunction extends UnaryFunction {
        public $sql_inner_join_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-INNER-JOIN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_inner_join_p(arg1);
        }
    }

    public static final class $sql_left_join_native extends SubLStructNative {
        public SubLObject $left_table;

        public SubLObject $right_table;

        public SubLObject $on;

        private static final SubLStructDeclNative structDecl;

        private $sql_left_join_native() {
            this.$left_table = Lisp.NIL;
            this.$right_table = Lisp.NIL;
            this.$on = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_left_join_native.class, SQL_LEFT_JOIN, SQL_LEFT_JOIN_P, $list579, $list580, new String[]{ "$left_table", "$right_table", "$on" }, $list581, $list582, PRINT_SQL_LEFT_JOIN);
        }
    }

    public static final class $sql_left_join_p$UnaryFunction extends UnaryFunction {
        public $sql_left_join_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-LEFT-JOIN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_left_join_p(arg1);
        }
    }

    public static final class $sql_union_native extends SubLStructNative {
        public SubLObject $select1;

        public SubLObject $select2;

        private static final SubLStructDeclNative structDecl;

        private $sql_union_native() {
            this.$select1 = Lisp.NIL;
            this.$select2 = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_union_native.class, SQL_UNION, SQL_UNION_P, $list599, $list600, new String[]{ "$select1", "$select2" }, $list601, $list602, PRINT_SQL_UNION);
        }
    }

    public static final class $sql_union_p$UnaryFunction extends UnaryFunction {
        public $sql_union_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-UNION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_union_p(arg1);
        }
    }

    public static final class $sql_alter_table_native extends SubLStructNative {
        public SubLObject $table;

        public SubLObject $action;

        private static final SubLStructDeclNative structDecl;

        private $sql_alter_table_native() {
            this.$table = Lisp.NIL;
            this.$action = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_alter_table_native.class, SQL_ALTER_TABLE, SQL_ALTER_TABLE_P, $list617, $list618, new String[]{ "$table", "$action" }, $list619, $list620, PRINT_SQL_ALTER_TABLE);
        }
    }

    public static final class $sql_alter_table_p$UnaryFunction extends UnaryFunction {
        public $sql_alter_table_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-ALTER-TABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_alter_table_p(arg1);
        }
    }

    public static final class $sql_add_column_native extends SubLStructNative {
        public SubLObject $column;

        public SubLObject $type;

        public SubLObject $size;

        public SubLObject $constraints;

        private static final SubLStructDeclNative structDecl;

        private $sql_add_column_native() {
            this.$column = Lisp.NIL;
            this.$type = Lisp.NIL;
            this.$size = Lisp.NIL;
            this.$constraints = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_add_column_native.class, SQL_ADD_COLUMN, SQL_ADD_COLUMN_P, $list635, $list636, new String[]{ "$column", "$type", "$size", "$constraints" }, $list637, $list638, PRINT_SQL_ADD_COLUMN);
        }
    }

    public static final class $sql_add_column_p$UnaryFunction extends UnaryFunction {
        public $sql_add_column_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-ADD-COLUMN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_add_column_p(arg1);
        }
    }

    public static final class $sql_drop_column_native extends SubLStructNative {
        public SubLObject $column;

        private static final SubLStructDeclNative structDecl;

        private $sql_drop_column_native() {
            this.$column = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_drop_column_native.class, SQL_DROP_COLUMN, SQL_DROP_COLUMN_P, $list661, $list662, new String[]{ "$column" }, $list663, $list664, PRINT_SQL_DROP_COLUMN);
        }
    }

    public static final class $sql_drop_column_p$UnaryFunction extends UnaryFunction {
        public $sql_drop_column_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-DROP-COLUMN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_drop_column_p(arg1);
        }
    }

    public static final class $sql_rename_column_native extends SubLStructNative {
        public SubLObject $old_column;

        public SubLObject $new_column;

        private static final SubLStructDeclNative structDecl;

        private $sql_rename_column_native() {
            this.$old_column = Lisp.NIL;
            this.$new_column = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_rename_column_native.class, SQL_RENAME_COLUMN, SQL_RENAME_COLUMN_P, $list675, $list676, new String[]{ "$old_column", "$new_column" }, $list677, $list678, PRINT_SQL_RENAME_COLUMN);
        }
    }

    public static final class $sql_rename_column_p$UnaryFunction extends UnaryFunction {
        public $sql_rename_column_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-RENAME-COLUMN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_rename_column_p(arg1);
        }
    }

    public static final class $sql_add_constraint_native extends SubLStructNative {
        public SubLObject $constraint;

        private static final SubLStructDeclNative structDecl;

        private $sql_add_constraint_native() {
            this.$constraint = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_add_constraint_native.class, SQL_ADD_CONSTRAINT, SQL_ADD_CONSTRAINT_P, $list693, $list694, new String[]{ "$constraint" }, $list695, $list696, PRINT_SQL_ADD_CONSTRAINT);
        }
    }

    public static final class $sql_add_constraint_p$UnaryFunction extends UnaryFunction {
        public $sql_add_constraint_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-ADD-CONSTRAINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_add_constraint_p(arg1);
        }
    }

    public static final class $sql_drop_constraint_native extends SubLStructNative {
        public SubLObject $constraint;

        private static final SubLStructDeclNative structDecl;

        private $sql_drop_constraint_native() {
            this.$constraint = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_drop_constraint_native.class, SQL_DROP_CONSTRAINT, SQL_DROP_CONSTRAINT_P, $list693, $list694, new String[]{ "$constraint" }, $list709, $list710, PRINT_SQL_DROP_CONSTRAINT);
        }
    }

    public static final class $sql_drop_constraint_p$UnaryFunction extends UnaryFunction {
        public $sql_drop_constraint_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-DROP-CONSTRAINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_drop_constraint_p(arg1);
        }
    }

    public static final class $sql_fk_column_constraint_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $table;

        public SubLObject $column;

        private static final SubLStructDeclNative structDecl;

        private $sql_fk_column_constraint_native() {
            this.$name = Lisp.NIL;
            this.$table = Lisp.NIL;
            this.$column = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_fk_column_constraint_native.class, SQL_FK_COLUMN_CONSTRAINT, SQL_FK_COLUMN_CONSTRAINT_P, $list721, $list722, new String[]{ "$name", "$table", "$column" }, $list723, $list724, PRINT_SQL_FK_COLUMN_CONSTRAINT);
        }
    }

    public static final class $sql_fk_column_constraint_p$UnaryFunction extends UnaryFunction {
        public $sql_fk_column_constraint_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-FK-COLUMN-CONSTRAINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_fk_column_constraint_p(arg1);
        }
    }

    public static final class $sql_fk_table_constraint_native extends SubLStructNative {
        public SubLObject $column;

        public SubLObject $constraint;

        private static final SubLStructDeclNative structDecl;

        private $sql_fk_table_constraint_native() {
            this.$column = Lisp.NIL;
            this.$constraint = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_fk_table_constraint_native.class, SQL_FK_TABLE_CONSTRAINT, SQL_FK_TABLE_CONSTRAINT_P, $list740, $list741, new String[]{ "$column", "$constraint" }, $list742, $list743, PRINT_SQL_FK_TABLE_CONSTRAINT);
        }
    }

    public static final class $sql_fk_table_constraint_p$UnaryFunction extends UnaryFunction {
        public $sql_fk_table_constraint_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-FK-TABLE-CONSTRAINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_fk_table_constraint_p(arg1);
        }
    }

    public static final class $sql_update_native extends SubLStructNative {
        public SubLObject $table;

        public SubLObject $settings;

        public SubLObject $conditions;

        private static final SubLStructDeclNative structDecl;

        private $sql_update_native() {
            this.$table = Lisp.NIL;
            this.$settings = Lisp.NIL;
            this.$conditions = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_update_native.class, SQL_UPDATE, SQL_UPDATE_P, $list756, $list757, new String[]{ "$table", "$settings", "$conditions" }, $list758, $list759, PRINT_SQL_UPDATE);
        }
    }

    public static final class $sql_update_p$UnaryFunction extends UnaryFunction {
        public $sql_update_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-UPDATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_update_p(arg1);
        }
    }

    public static final class $sql_drop_table_native extends SubLStructNative {
        public SubLObject $table;

        private static final SubLStructDeclNative structDecl;

        private $sql_drop_table_native() {
            this.$table = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($sql_drop_table_native.class, SQL_DROP_TABLE, SQL_DROP_TABLE_P, $list776, $list777, new String[]{ "$table" }, $list778, $list779, PRINT_SQL_DROP_TABLE);
        }
    }

    public static final class $sql_drop_table_p$UnaryFunction extends UnaryFunction {
        public $sql_drop_table_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-DROP-TABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_drop_table_p(arg1);
        }
    }
}

/**
 * Total time: 5844 ms synthetic
 */
