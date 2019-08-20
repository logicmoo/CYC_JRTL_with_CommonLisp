/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.next_named_var;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      VALUE-TABLES
 * source file: /cyc/top/cycl/value-tables.lisp
 * created:     2019/07/03 17:38:03
 */
public final class value_tables extends SubLTranslatedFile implements V12 {
    public static final SubLObject any_disjoint_with_anyP_memoized_internal(SubLObject cols1, SubLObject cols2, SubLObject mt) {
        return disjoint_with.any_disjoint_with_anyP(cols1, cols2, mt, UNPROVIDED);
    }

    public static final SubLObject any_disjoint_with_anyP_memoized(SubLObject cols1, SubLObject cols2, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return any_disjoint_with_anyP_memoized_internal(cols1, cols2, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym140$ANY_DISJOINT_WITH_ANY__MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym140$ANY_DISJOINT_WITH_ANY__MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym140$ANY_DISJOINT_WITH_ANY__MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(cols1, cols2, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw141$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (cols1.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (cols2.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(any_disjoint_with_anyP_memoized_internal(cols1, cols2, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cols1, cols2, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final class $variable_mapping_table_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$source_query;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$target_query;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$source_variables;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$target_variables;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$incompatibles;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$assignments;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$source_query = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$target_query = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$source_variables = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$target_variables = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$incompatibles = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.this.$assignments = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $source_query = Lisp.NIL;

        public SubLObject $target_query = Lisp.NIL;

        public SubLObject $source_variables = Lisp.NIL;

        public SubLObject $target_variables = Lisp.NIL;

        public SubLObject $incompatibles = Lisp.NIL;

        public SubLObject $assignments = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.class, VARIABLE_MAPPING_TABLE, VARIABLE_MAPPING_TABLE_P, $list_alt85, $list_alt86, new String[]{ "$id", "$source_query", "$target_query", "$source_variables", "$target_variables", "$incompatibles", "$assignments" }, $list_alt87, $list_alt88, PRINT_VARMAP_TABLE);
    }

    public static final class $value_table_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$label;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$input_columns;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$output_column;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$assignments;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$label = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$input_columns = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$output_column = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.value_tables.$value_table_native.this.$assignments = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $label = Lisp.NIL;

        public SubLObject $input_columns = Lisp.NIL;

        public SubLObject $output_column = Lisp.NIL;

        public SubLObject $assignments = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.value_tables.$value_table_native.class, VALUE_TABLE, VALUE_TABLE_P, $list_alt32, $list_alt33, new String[]{ "$id", "$label", "$input_columns", "$output_column", "$assignments" }, $list_alt34, $list_alt35, PRINT_VALUE_TABLE);
    }

    public static final SubLFile me = new value_tables();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_value_table_column$ = makeSymbol("*DTP-VALUE-TABLE-COLUMN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_value_table$ = makeSymbol("*DTP-VALUE-TABLE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_variable_mapping_table$ = makeSymbol("*DTP-VARIABLE-MAPPING-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol VALUE_TABLE_COLUMN = makeSymbol("VALUE-TABLE-COLUMN");

    private static final SubLSymbol VALUE_TABLE_COLUMN_P = makeSymbol("VALUE-TABLE-COLUMN-P");

    static private final SubLList $list2 = list(makeSymbol("QUERY"), makeSymbol("LABEL"), makeSymbol("VALUES"));

    static private final SubLList $list3 = list(makeKeyword("QUERY"), makeKeyword("LABEL"), makeKeyword("VALUES"));

    static private final SubLList $list4 = list(makeSymbol("VALUE-TABLE-COLUMN-QUERY"), makeSymbol("VALUE-TABLE-COLUMN-LABEL"), makeSymbol("VALUE-TABLE-COLUMN-VALUES"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-VALUE-TABLE-COLUMN-QUERY"), makeSymbol("_CSETF-VALUE-TABLE-COLUMN-LABEL"), makeSymbol("_CSETF-VALUE-TABLE-COLUMN-VALUES"));

    private static final SubLSymbol PRINT_VALUE_TABLE_COLUMN = makeSymbol("PRINT-VALUE-TABLE-COLUMN");

    private static final SubLSymbol VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("VALUE-TABLE-COLUMN-P"));

    private static final SubLSymbol VALUE_TABLE_COLUMN_QUERY = makeSymbol("VALUE-TABLE-COLUMN-QUERY");

    private static final SubLSymbol _CSETF_VALUE_TABLE_COLUMN_QUERY = makeSymbol("_CSETF-VALUE-TABLE-COLUMN-QUERY");

    private static final SubLSymbol VALUE_TABLE_COLUMN_LABEL = makeSymbol("VALUE-TABLE-COLUMN-LABEL");

    private static final SubLSymbol _CSETF_VALUE_TABLE_COLUMN_LABEL = makeSymbol("_CSETF-VALUE-TABLE-COLUMN-LABEL");

    private static final SubLSymbol VALUE_TABLE_COLUMN_VALUES = makeSymbol("VALUE-TABLE-COLUMN-VALUES");

    private static final SubLSymbol _CSETF_VALUE_TABLE_COLUMN_VALUES = makeSymbol("_CSETF-VALUE-TABLE-COLUMN-VALUES");

    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_VALUE_TABLE_COLUMN = makeSymbol("MAKE-VALUE-TABLE-COLUMN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_COLUMN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-COLUMN-METHOD");

    private static final SubLString $str24$__ValueTableColumn_ = makeString("#<ValueTableColumn ");

    private static final SubLString $str25$_A___S____supported_values___S = makeString("~A (~S)~% supported values: ~S");

    private static final SubLString $str26$_ = makeString(">");

    private static final SubLString $$$valueTableColumn = makeString("valueTableColumn");

    private static final SubLString $$$valueTableQuery = makeString("valueTableQuery");

    private static final SubLString $$$valueTableLabel = makeString("valueTableLabel");

    private static final SubLString $$$valueTableValues = makeString("valueTableValues");

    private static final SubLString $$$valueTableValue = makeString("valueTableValue");

    static private final SubLList $list33 = list(makeSymbol("THE-SET"), makeSymbol("EL-INFERENCE-BINDING"));

    static private final SubLList $list34 = list(makeSymbol("EL-INFBIND-FN"), makeSymbol("VARIABLE"), makeSymbol("RESULT-VALUE"));



    private static final SubLSymbol VALUE_TABLE = makeSymbol("VALUE-TABLE");

    private static final SubLSymbol VALUE_TABLE_P = makeSymbol("VALUE-TABLE-P");

    private static final SubLList $list39 = list(makeSymbol("ID"), makeSymbol("LABEL"), makeSymbol("INPUT-COLUMNS"), makeSymbol("OUTPUT-COLUMN"), makeSymbol("ASSIGNMENTS"));

    private static final SubLList $list40 = list(makeKeyword("ID"), makeKeyword("LABEL"), makeKeyword("INPUT-COLUMNS"), makeKeyword("OUTPUT-COLUMN"), makeKeyword("ASSIGNMENTS"));

    private static final SubLList $list41 = list(makeSymbol("VALUE-TABLE-ID"), makeSymbol("VALUE-TABLE-LABEL"), makeSymbol("VALUE-TABLE-INPUT-COLUMNS"), makeSymbol("VALUE-TABLE-OUTPUT-COLUMN"), makeSymbol("VALUE-TABLE-ASSIGNMENTS"));

    private static final SubLList $list42 = list(makeSymbol("_CSETF-VALUE-TABLE-ID"), makeSymbol("_CSETF-VALUE-TABLE-LABEL"), makeSymbol("_CSETF-VALUE-TABLE-INPUT-COLUMNS"), makeSymbol("_CSETF-VALUE-TABLE-OUTPUT-COLUMN"), makeSymbol("_CSETF-VALUE-TABLE-ASSIGNMENTS"));

    private static final SubLSymbol PRINT_VALUE_TABLE = makeSymbol("PRINT-VALUE-TABLE");

    private static final SubLSymbol VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list45 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("VALUE-TABLE-P"));

    private static final SubLSymbol VALUE_TABLE_ID = makeSymbol("VALUE-TABLE-ID");

    private static final SubLSymbol _CSETF_VALUE_TABLE_ID = makeSymbol("_CSETF-VALUE-TABLE-ID");

    private static final SubLSymbol VALUE_TABLE_LABEL = makeSymbol("VALUE-TABLE-LABEL");

    private static final SubLSymbol _CSETF_VALUE_TABLE_LABEL = makeSymbol("_CSETF-VALUE-TABLE-LABEL");

    private static final SubLSymbol VALUE_TABLE_INPUT_COLUMNS = makeSymbol("VALUE-TABLE-INPUT-COLUMNS");

    private static final SubLSymbol _CSETF_VALUE_TABLE_INPUT_COLUMNS = makeSymbol("_CSETF-VALUE-TABLE-INPUT-COLUMNS");

    private static final SubLSymbol VALUE_TABLE_OUTPUT_COLUMN = makeSymbol("VALUE-TABLE-OUTPUT-COLUMN");

    private static final SubLSymbol _CSETF_VALUE_TABLE_OUTPUT_COLUMN = makeSymbol("_CSETF-VALUE-TABLE-OUTPUT-COLUMN");

    private static final SubLSymbol VALUE_TABLE_ASSIGNMENTS = makeSymbol("VALUE-TABLE-ASSIGNMENTS");

    private static final SubLSymbol _CSETF_VALUE_TABLE_ASSIGNMENTS = makeSymbol("_CSETF-VALUE-TABLE-ASSIGNMENTS");

    private static final SubLSymbol MAKE_VALUE_TABLE = makeSymbol("MAKE-VALUE-TABLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-METHOD");

    private static final SubLString $str62$__ValueTable_ = makeString("#<ValueTable ");

    private static final SubLString $str63$_S___A___ = makeString("~S (~A)~%");

    private static final SubLString $str64$_Input_Columns__ = makeString(" Input Columns: ");

    private static final SubLString $str65$_____S__ = makeString("    ~S~%");

    private static final SubLString $str66$_Output_Column__ = makeString(" Output Column: ");

    private static final SubLString $str67$_Existing_Assignments__ = makeString(" Existing Assignments: ");

    private static final SubLString $$$valueTable = makeString("valueTable");

    private static final SubLString $$$valueTableId = makeString("valueTableId");

    private static final SubLString $$$valueTableInputColumns = makeString("valueTableInputColumns");

    private static final SubLString $$$valueTableOutputColumns = makeString("valueTableOutputColumns");

    private static final SubLString $$$valueTableAssignments = makeString("valueTableAssignments");

    private static final SubLString $$$valueTableAssignment = makeString("valueTableAssignment");

    static private final SubLList $list76 = cons(makeSymbol("SOURCES"), makeSymbol("TARGETS"));

    private static final SubLString $$$valueTableAssignmentSources = makeString("valueTableAssignmentSources");

    private static final SubLString $$$valueTableAssignmentTuple = makeString("valueTableAssignmentTuple");

    private static final SubLList $list79 = list(makeSymbol("QUERY"), makeSymbol("VALUE"));

    private static final SubLString $$$valueTableAssignmentTargets = makeString("valueTableAssignmentTargets");



    private static final SubLList $list83 = list(makeKeyword("INPUT-QUERIES"));



    static private final SubLList $list86 = list(makeKeyword("OUTPUT-QUERY"));

    static private final SubLList $list87 = list(makeSymbol("?SOURCES"), makeSymbol("?TARGETS"));



    private static final SubLSymbol $sym89$_SOURCES = makeSymbol("?SOURCES");

    private static final SubLSymbol $sym90$_TARGETS = makeSymbol("?TARGETS");

    private static final SubLList $list91 = list(makeSymbol("SOURCES"), makeSymbol("TARGETS"));

    private static final SubLSymbol VARIABLE_MAPPING_TABLE = makeSymbol("VARIABLE-MAPPING-TABLE");

    private static final SubLSymbol VARIABLE_MAPPING_TABLE_P = makeSymbol("VARIABLE-MAPPING-TABLE-P");

    private static final SubLList $list95 = list(makeSymbol("ID"), makeSymbol("SOURCE-QUERY"), makeSymbol("TARGET-QUERY"), makeSymbol("SOURCE-VARIABLES"), makeSymbol("TARGET-VARIABLES"), makeSymbol("INCOMPATIBLES"), makeSymbol("ASSIGNMENTS"));

    private static final SubLList $list96 = list(makeKeyword("ID"), makeKeyword("SOURCE-QUERY"), makeKeyword("TARGET-QUERY"), makeKeyword("SOURCE-VARIABLES"), makeKeyword("TARGET-VARIABLES"), makeKeyword("INCOMPATIBLES"), makeKeyword("ASSIGNMENTS"));

    private static final SubLList $list97 = list(makeSymbol("VARIABLE-MAPPING-TABLE-ID"), makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-QUERY"), makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-QUERY"), makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES"), makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-VARIABLES"), makeSymbol("VARIABLE-MAPPING-TABLE-INCOMPATIBLES"), makeSymbol("VARIABLE-MAPPING-TABLE-ASSIGNMENTS"));

    private static final SubLList $list98 = list(makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ID"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS"));

    private static final SubLSymbol PRINT_VARMAP_TABLE = makeSymbol("PRINT-VARMAP-TABLE");

    private static final SubLSymbol VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list101 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("VARIABLE-MAPPING-TABLE-P"));

    private static final SubLSymbol VARIABLE_MAPPING_TABLE_ID = makeSymbol("VARIABLE-MAPPING-TABLE-ID");

    private static final SubLSymbol _CSETF_VARIABLE_MAPPING_TABLE_ID = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ID");

    private static final SubLSymbol VARIABLE_MAPPING_TABLE_SOURCE_QUERY = makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-QUERY");

    private static final SubLSymbol _CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY");

    private static final SubLSymbol VARIABLE_MAPPING_TABLE_TARGET_QUERY = makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-QUERY");

    private static final SubLSymbol _CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY");

    private static final SubLSymbol VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES = makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES");

    private static final SubLSymbol _CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES");

    private static final SubLSymbol VARIABLE_MAPPING_TABLE_TARGET_VARIABLES = makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-VARIABLES");

    private static final SubLSymbol _CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES");

    private static final SubLSymbol VARIABLE_MAPPING_TABLE_INCOMPATIBLES = makeSymbol("VARIABLE-MAPPING-TABLE-INCOMPATIBLES");

    private static final SubLSymbol _CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES");

    private static final SubLSymbol VARIABLE_MAPPING_TABLE_ASSIGNMENTS = makeSymbol("VARIABLE-MAPPING-TABLE-ASSIGNMENTS");

    private static final SubLSymbol _CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS");

    private static final SubLSymbol MAKE_VARIABLE_MAPPING_TABLE = makeSymbol("MAKE-VARIABLE-MAPPING-TABLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_VARIABLE_MAPPING_TABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-VARIABLE-MAPPING-TABLE-METHOD");

    private static final SubLString $str123$__VariableMappingTable_ = makeString("#<VariableMappingTable ");

    private static final SubLString $str124$_A_for__A_____A__ = makeString("~A for ~A -> ~A~%");

    private static final SubLString $$$anonymous = makeString("anonymous");

    private static final SubLString $$$no_source = makeString("no source");

    private static final SubLString $$$no_target = makeString("no target");

    private static final SubLString $str128$_Source_Variables___A__ = makeString(" Source Variables: ~A~%");

    private static final SubLString $str129$_Target_Variables___A__ = makeString(" Target Variables: ~A~%");

    private static final SubLString $str130$_Incompatibilities__source_view__ = makeString(" Incompatibilities (source view): ~%");

    private static final SubLString $str131$null_dictionary__ = makeString("null dictionary~%");

    private static final SubLString $str132$_Current_Assignments___A__ = makeString(" Current Assignments: ~A~%");

    private static final SubLString $$$varMapTable = makeString("varMapTable");

    private static final SubLString $$$varMapTableId = makeString("varMapTableId");

    private static final SubLString $$$varMapSourceQuery = makeString("varMapSourceQuery");

    private static final SubLString $$$varMapTargetQuery = makeString("varMapTargetQuery");

    private static final SubLString $$$varMapSourceVariables = makeString("varMapSourceVariables");

    private static final SubLString $$$varMapTargetVariables = makeString("varMapTargetVariables");

    private static final SubLString $$$varMapIncompatibles = makeString("varMapIncompatibles");

    private static final SubLString $$$varMapIncompatible = makeString("varMapIncompatible");

    private static final SubLString $$$varMapSourceVariable = makeString("varMapSourceVariable");

    private static final SubLString $$$varMapAssignments = makeString("varMapAssignments");

    private static final SubLString $$$varMapAssignment = makeString("varMapAssignment");

    static private final SubLList $list144 = list(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VAR"));

    private static final SubLString $$$varMapTargetVariable = makeString("varMapTargetVariable");

    private static final SubLSymbol $sym146$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLObject $const148$variableMappingTableSourceFormula = reader_make_constant_shell("variableMappingTableSourceFormula-QuerySpec");

    private static final SubLList $list149 = list(makeKeyword("SOURCE"));

    private static final SubLObject $const151$variableMappingTableTargetFormula = reader_make_constant_shell("variableMappingTableTargetFormula-QuerySpec");

    private static final SubLList $list152 = list(makeKeyword("TARGET"));

    private static final SubLList $list153 = list(makeSymbol("SRC-ISAS"), makeSymbol("SRC-GENLS"), makeSymbol("SRC-QUOTED-ISAS"));

    private static final SubLList $list154 = list(makeSymbol("TRG-ISAS"), makeSymbol("TRG-GENLS"), makeSymbol("TRG-QUOTED-ISAS"));

    private static final SubLList $list155 = list(makeSymbol("?SOURCE-VAR"), makeSymbol("?TARGET-VAR"));

    private static final SubLObject $const156$querySpecVariablesUnifyInTable_Wo = reader_make_constant_shell("querySpecVariablesUnifyInTable-WorkaroundPred");

    private static final SubLList $list157 = list(reader_make_constant_shell("AnalysisOutputBindingsForVarFn"), makeSymbol("?SOURCE-VAR"));

    private static final SubLList $list158 = list(reader_make_constant_shell("AnalysisInputBindingsForVarFn"), makeSymbol("?TARGET-VAR"));



    private static final SubLSymbol $sym160$_SOURCE_VAR = makeSymbol("?SOURCE-VAR");

    private static final SubLSymbol $sym161$_TARGET_VAR = makeSymbol("?TARGET-VAR");

    private static final SubLSymbol VARMAP_UNIQUE_EL_VAR_WRT_VARS = makeSymbol("VARMAP-UNIQUE-EL-VAR-WRT-VARS");

    public static final SubLObject value_table_column_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_value_table_column(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject value_table_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_value_table_column(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject value_table_column_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.value_tables.$value_table_column_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject value_table_column_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.value_tables.$value_table_column_native.class ? T : NIL;
    }

    public static final SubLObject value_table_column_query_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_COLUMN_P);
        return v_object.getField2();
    }

    public static SubLObject value_table_column_query(final SubLObject v_object) {
        assert NIL != value_table_column_p(v_object) : "! value_tables.value_table_column_p(v_object) " + "value_tables.value_table_column_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject value_table_column_label_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_COLUMN_P);
        return v_object.getField3();
    }

    public static SubLObject value_table_column_label(final SubLObject v_object) {
        assert NIL != value_table_column_p(v_object) : "! value_tables.value_table_column_p(v_object) " + "value_tables.value_table_column_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject value_table_column_values_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_COLUMN_P);
        return v_object.getField4();
    }

    public static SubLObject value_table_column_values(final SubLObject v_object) {
        assert NIL != value_table_column_p(v_object) : "! value_tables.value_table_column_p(v_object) " + "value_tables.value_table_column_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_value_table_column_query_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_COLUMN_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_value_table_column_query(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_column_p(v_object) : "! value_tables.value_table_column_p(v_object) " + "value_tables.value_table_column_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_value_table_column_label_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_COLUMN_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_value_table_column_label(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_column_p(v_object) : "! value_tables.value_table_column_p(v_object) " + "value_tables.value_table_column_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_value_table_column_values_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_COLUMN_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_value_table_column_values(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_column_p(v_object) : "! value_tables.value_table_column_p(v_object) " + "value_tables.value_table_column_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_value_table_column_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.value_tables.$value_table_column_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($QUERY)) {
                        _csetf_value_table_column_query(v_new, current_value);
                    } else {
                        if (pcase_var.eql($LABEL)) {
                            _csetf_value_table_column_label(v_new, current_value);
                        } else {
                            if (pcase_var.eql($VALUES)) {
                                _csetf_value_table_column_values(v_new, current_value);
                            } else {
                                Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_value_table_column(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.value_tables.$value_table_column_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($QUERY)) {
                _csetf_value_table_column_query(v_new, current_value);
            } else
                if (pcase_var.eql($LABEL)) {
                    _csetf_value_table_column_label(v_new, current_value);
                } else
                    if (pcase_var.eql($VALUES)) {
                        _csetf_value_table_column_values(v_new, current_value);
                    } else {
                        Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_value_table_column(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_VALUE_TABLE_COLUMN, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $QUERY, value_table_column_query(obj));
        funcall(visitor_fn, obj, $SLOT, $LABEL, value_table_column_label(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUES, value_table_column_values(obj));
        funcall(visitor_fn, obj, $END, MAKE_VALUE_TABLE_COLUMN, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_value_table_column_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_value_table_column(obj, visitor_fn);
    }

    public static final SubLObject print_value_table_column_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        write_string($str_alt18$__ValueTableColumn_, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str_alt19$_A___S____supported_values___S, new SubLObject[]{ value_table_column_query(v_object), value_table_column_label(v_object), value_table_column_values(v_object) });
        write_string($str_alt20$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject print_value_table_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str24$__ValueTableColumn_, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str25$_A___S____supported_values___S, new SubLObject[]{ value_table_column_query(v_object), value_table_column_label(v_object), value_table_column_values(v_object) });
        write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject new_value_table_column_alt(SubLObject query_id) {
        {
            SubLObject column = make_value_table_column(UNPROVIDED);
            _csetf_value_table_column_query(column, query_id);
            return column;
        }
    }

    public static SubLObject new_value_table_column(final SubLObject query_id) {
        final SubLObject column = make_value_table_column(UNPROVIDED);
        _csetf_value_table_column_query(column, query_id);
        return column;
    }

    public static final SubLObject load_value_table_column_from_kb_alt(SubLObject vtable_id, SubLObject query_id, SubLObject elmt) {
        {
            SubLObject column = new_value_table_column(query_id);
            SubLObject values = get_vtbl_query_result_values(vtable_id, query_id, elmt);
            _csetf_value_table_column_values(column, values);
            _csetf_value_table_column_label(column, pph_main.generate_phrase(query_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return column;
        }
    }

    public static SubLObject load_value_table_column_from_kb(final SubLObject vtable_id, final SubLObject query_id, final SubLObject elmt) {
        final SubLObject column = new_value_table_column(query_id);
        final SubLObject values = get_vtbl_query_result_values(vtable_id, query_id, elmt);
        _csetf_value_table_column_values(column, values);
        _csetf_value_table_column_label(column, pph_main.generate_phrase(query_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return column;
    }

    public static final SubLObject xml_serialize_value_table_column_alt(SubLObject column, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(column, VALUE_TABLE_COLUMN_P);
            {
                SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    {
                        SubLObject _prev_bind_0_1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$valueTableColumn, NIL, NIL);
                            {
                                SubLObject _prev_bind_0_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$valueTableQuery, NIL, NIL);
                                    cycml.cycml_serialize_term(value_table_column_query(column));
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_3, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$valueTableQuery);
                            {
                                SubLObject _prev_bind_0_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$valueTableLabel, NIL, NIL);
                                    cycml.cycml_serialize_term(value_table_column_label(column));
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_5, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$valueTableLabel);
                            if (NIL != value_table_column_values(column)) {
                                {
                                    SubLObject _prev_bind_0_6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$valueTableValues, NIL, NIL);
                                        {
                                            SubLObject cdolist_list_var = value_table_column_values(column);
                                            SubLObject value = NIL;
                                            for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                                                {
                                                    SubLObject _prev_bind_0_8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$valueTableValue, NIL, NIL);
                                                        cycml.cycml_serialize_term(value);
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_9, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$valueTableValue);
                                            }
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_7, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$valueTableValues);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$valueTableColumn);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return column;
        }
    }

    public static SubLObject xml_serialize_value_table_column(final SubLObject column, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != value_table_column_p(column) : "! value_tables.value_table_column_p(column) " + ("value_tables.value_table_column_p(column) " + "CommonSymbols.NIL != value_tables.value_table_column_p(column) ") + column;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$valueTableColumn, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$valueTableQuery, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(value_table_column_query(column));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$valueTableQuery);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$valueTableLabel, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(value_table_column_label(column));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$5, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$6, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$valueTableLabel);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                        if (NIL != value_table_column_values(column)) {
                            try {
                                final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$valueTableValues, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = value_table_column_values(column);
                                        SubLObject value = NIL;
                                        value = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$valueTableValue, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        cycml.cycml_serialize_term(value);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values3 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$valueTableValue);
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            value = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$9, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$valueTableValues);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$valueTableColumn);
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return column;
    }

    public static final SubLObject get_vtbl_query_result_values_alt(SubLObject vtable_id, SubLObject query, SubLObject elmt) {
        {
            SubLObject result_values = NIL;
            SubLObject cdolist_list_var = get_vtbl_query_result_sets(vtable_id, query, elmt);
            SubLObject value = NIL;
            for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                {
                    SubLObject datum = value;
                    SubLObject current = datum;
                    SubLObject the_set = NIL;
                    SubLObject el_inference_binding = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    the_set = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    el_inference_binding = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject datum_10 = el_inference_binding;
                            SubLObject current_11 = datum_10;
                            SubLObject el_infbind_fn = NIL;
                            SubLObject variable = NIL;
                            SubLObject result_value = NIL;
                            destructuring_bind_must_consp(current_11, datum_10, $list_alt27);
                            el_infbind_fn = current_11.first();
                            current_11 = current_11.rest();
                            destructuring_bind_must_consp(current_11, datum_10, $list_alt27);
                            variable = current_11.first();
                            current_11 = current_11.rest();
                            destructuring_bind_must_consp(current_11, datum_10, $list_alt27);
                            result_value = current_11.first();
                            current_11 = current_11.rest();
                            if (NIL == current_11) {
                                result_values = cons(result_value, result_values);
                            } else {
                                cdestructuring_bind_error(datum_10, $list_alt27);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt26);
                    }
                }
            }
            return result_values;
        }
    }

    public static SubLObject get_vtbl_query_result_values(final SubLObject vtable_id, final SubLObject query, final SubLObject elmt) {
        SubLObject result_values = NIL;
        SubLObject cdolist_list_var = get_vtbl_query_result_sets(vtable_id, query, elmt);
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = value;
            SubLObject the_set = NIL;
            SubLObject el_inference_binding = NIL;
            destructuring_bind_must_consp(current, datum, $list33);
            the_set = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list33);
            el_inference_binding = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = el_inference_binding;
                SubLObject el_infbind_fn = NIL;
                SubLObject variable = NIL;
                SubLObject result_value = NIL;
                destructuring_bind_must_consp(current_$21, datum_$20, $list34);
                el_infbind_fn = current_$21.first();
                current_$21 = current_$21.rest();
                destructuring_bind_must_consp(current_$21, datum_$20, $list34);
                variable = current_$21.first();
                current_$21 = current_$21.rest();
                destructuring_bind_must_consp(current_$21, datum_$20, $list34);
                result_value = current_$21.first();
                current_$21 = current_$21.rest();
                if (NIL == current_$21) {
                    result_values = cons(result_value, result_values);
                } else {
                    cdestructuring_bind_error(datum_$20, $list34);
                }
            } else {
                cdestructuring_bind_error(datum, $list33);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return result_values;
    }

    public static final SubLObject get_vtbl_query_result_sets_alt(SubLObject vtable_id, SubLObject query, SubLObject elmt) {
        return ask_utilities.ask_variable($RESULT_SET, list($$validQueryResultForTable, query, $RESULT_SET, vtable_id), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_vtbl_query_result_sets(final SubLObject vtable_id, final SubLObject query, final SubLObject elmt) {
        return ask_utilities.ask_variable($RESULT_SET, list($$validQueryResultForTable, query, $RESULT_SET, vtable_id), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject value_table_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_value_table(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject value_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_value_table(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject value_table_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.value_tables.$value_table_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject value_table_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.value_tables.$value_table_native.class ? T : NIL;
    }

    public static final SubLObject value_table_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.getField2();
    }

    public static SubLObject value_table_id(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject value_table_label_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.getField3();
    }

    public static SubLObject value_table_label(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject value_table_input_columns_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.getField4();
    }

    public static SubLObject value_table_input_columns(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject value_table_output_column_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.getField5();
    }

    public static SubLObject value_table_output_column(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject value_table_assignments_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.getField6();
    }

    public static SubLObject value_table_assignments(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_value_table_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_value_table_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_value_table_label_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_value_table_label(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_value_table_input_columns_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_value_table_input_columns(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_value_table_output_column_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_value_table_output_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_value_table_assignments_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VALUE_TABLE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_value_table_assignments(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "! value_tables.value_table_p(v_object) " + "value_tables.value_table_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_value_table_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.value_tables.$value_table_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_value_table_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($LABEL)) {
                            _csetf_value_table_label(v_new, current_value);
                        } else {
                            if (pcase_var.eql($INPUT_COLUMNS)) {
                                _csetf_value_table_input_columns(v_new, current_value);
                            } else {
                                if (pcase_var.eql($OUTPUT_COLUMN)) {
                                    _csetf_value_table_output_column(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ASSIGNMENTS)) {
                                        _csetf_value_table_assignments(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_value_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.value_tables.$value_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_value_table_id(v_new, current_value);
            } else
                if (pcase_var.eql($LABEL)) {
                    _csetf_value_table_label(v_new, current_value);
                } else
                    if (pcase_var.eql($INPUT_COLUMNS)) {
                        _csetf_value_table_input_columns(v_new, current_value);
                    } else
                        if (pcase_var.eql($OUTPUT_COLUMN)) {
                            _csetf_value_table_output_column(v_new, current_value);
                        } else
                            if (pcase_var.eql($ASSIGNMENTS)) {
                                _csetf_value_table_assignments(v_new, current_value);
                            } else {
                                Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_value_table(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_VALUE_TABLE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, value_table_id(obj));
        funcall(visitor_fn, obj, $SLOT, $LABEL, value_table_label(obj));
        funcall(visitor_fn, obj, $SLOT, $INPUT_COLUMNS, value_table_input_columns(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTPUT_COLUMN, value_table_output_column(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSIGNMENTS, value_table_assignments(obj));
        funcall(visitor_fn, obj, $END, MAKE_VALUE_TABLE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_value_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_value_table(obj, visitor_fn);
    }

    public static final SubLObject print_value_table_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        write_string($str_alt52$__ValueTable_, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str_alt53$_S___A___, value_table_id(v_object), value_table_label(v_object));
        write_string($str_alt54$_Input_Columns__, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        {
            SubLObject cdolist_list_var = value_table_input_columns(v_object);
            SubLObject input_column = NIL;
            for (input_column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , input_column = cdolist_list_var.first()) {
                format(stream, $str_alt55$_____S__, input_column);
            }
        }
        write_string($str_alt56$_Output_Column__, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        {
            SubLObject output_column = value_table_output_column(v_object);
            format(stream, $str_alt55$_____S__, output_column);
        }
        if (NIL != value_table_assignments(v_object)) {
            write_string($str_alt57$_Existing_Assignments__, stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
            format(stream, $str_alt55$_____S__, value_table_assignments(v_object));
        }
        write_string($str_alt20$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject print_value_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str62$__ValueTable_, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str63$_S___A___, value_table_id(v_object), value_table_label(v_object));
        write_string($str64$_Input_Columns__, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        SubLObject cdolist_list_var = value_table_input_columns(v_object);
        SubLObject input_column = NIL;
        input_column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str65$_____S__, input_column);
            cdolist_list_var = cdolist_list_var.rest();
            input_column = cdolist_list_var.first();
        } 
        write_string($str66$_Output_Column__, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        final SubLObject output_column = value_table_output_column(v_object);
        format(stream, $str65$_____S__, output_column);
        if (NIL != value_table_assignments(v_object)) {
            write_string($str67$_Existing_Assignments__, stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
            format(stream, $str65$_____S__, value_table_assignments(v_object));
        }
        write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject new_value_table_alt(SubLObject id) {
        {
            SubLObject vtable = make_value_table(UNPROVIDED);
            _csetf_value_table_id(vtable, id);
            return vtable;
        }
    }

    public static SubLObject new_value_table(final SubLObject id) {
        final SubLObject vtable = make_value_table(UNPROVIDED);
        _csetf_value_table_id(vtable, id);
        return vtable;
    }

    public static final SubLObject load_value_table_from_kb_alt(SubLObject vtable_id, SubLObject elmt) {
        SubLTrampolineFile.checkType(vtable_id, FORT_P);
        SubLTrampolineFile.checkType(elmt, HLMT_P);
        {
            SubLObject vtable = new_value_table(vtable_id);
            SubLObject input_queries = get_vtbl_input_queries(vtable_id, elmt);
            SubLObject output_query = get_vtbl_output_query(vtable_id, elmt);
            SubLObject cdolist_list_var = input_queries;
            SubLObject input_query = NIL;
            for (input_query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , input_query = cdolist_list_var.first()) {
                {
                    SubLObject column = load_value_table_column_from_kb(vtable_id, input_query, elmt);
                    _csetf_value_table_input_columns(vtable, cons(column, value_table_input_columns(vtable)));
                }
            }
            _csetf_value_table_output_column(vtable, load_value_table_column_from_kb(vtable_id, output_query, elmt));
            _csetf_value_table_assignments(vtable, load_value_table_assignments_from_kb(vtable_id, elmt));
            _csetf_value_table_label(vtable, pph_main.generate_phrase(vtable_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return vtable;
        }
    }

    public static SubLObject load_value_table_from_kb(final SubLObject vtable_id, final SubLObject elmt) {
        assert NIL != forts.fort_p(vtable_id) : "! forts.fort_p(vtable_id) " + ("forts.fort_p(vtable_id) " + "CommonSymbols.NIL != forts.fort_p(vtable_id) ") + vtable_id;
        assert NIL != hlmt.hlmt_p(elmt) : "! hlmt.hlmt_p(elmt) " + ("hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) ") + elmt;
        final SubLObject vtable = new_value_table(vtable_id);
        final SubLObject input_queries = get_vtbl_input_queries(vtable_id, elmt);
        final SubLObject output_query = get_vtbl_output_query(vtable_id, elmt);
        SubLObject cdolist_list_var = input_queries;
        SubLObject input_query = NIL;
        input_query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject column = load_value_table_column_from_kb(vtable_id, input_query, elmt);
            _csetf_value_table_input_columns(vtable, cons(column, value_table_input_columns(vtable)));
            cdolist_list_var = cdolist_list_var.rest();
            input_query = cdolist_list_var.first();
        } 
        _csetf_value_table_output_column(vtable, load_value_table_column_from_kb(vtable_id, output_query, elmt));
        _csetf_value_table_assignments(vtable, load_value_table_assignments_from_kb(vtable_id, elmt));
        _csetf_value_table_label(vtable, pph_main.generate_phrase(vtable_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return vtable;
    }

    public static final SubLObject xml_serialize_value_table_alt(SubLObject vtable, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(vtable, VALUE_TABLE_P);
            {
                SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    {
                        SubLObject _prev_bind_0_12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$valueTable, NIL, NIL);
                            {
                                SubLObject _prev_bind_0_13 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1_14 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$valueTableId, NIL, NIL);
                                    cycml.cycml_serialize_term(value_table_id(vtable));
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_14, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_13, thread);
                                }
                            }
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$valueTableId);
                            {
                                SubLObject _prev_bind_0_15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1_16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$valueTableLabel, NIL, NIL);
                                    cycml.cycml_serialize_term(value_table_label(vtable));
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_16, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_15, thread);
                                }
                            }
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$valueTableLabel);
                            if (NIL != value_table_input_columns(vtable)) {
                                {
                                    SubLObject _prev_bind_0_17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$valueTableInputColumns, NIL, NIL);
                                        {
                                            SubLObject cdolist_list_var = value_table_input_columns(vtable);
                                            SubLObject column = NIL;
                                            for (column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column = cdolist_list_var.first()) {
                                                xml_serialize_value_table_column(column, stream);
                                            }
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_18, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$valueTableInputColumns);
                            }
                            if (NIL != value_table_output_column(vtable)) {
                                {
                                    SubLObject _prev_bind_0_19 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$valueTableOutputColumns, NIL, NIL);
                                        xml_serialize_value_table_column(value_table_output_column(vtable), stream);
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_20, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$valueTableOutputColumns);
                            }
                            if (NIL != value_table_assignments(vtable)) {
                                {
                                    SubLObject _prev_bind_0_21 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$valueTableAssignments, NIL, NIL);
                                        {
                                            SubLObject cdolist_list_var = value_table_assignments(vtable);
                                            SubLObject assignment = NIL;
                                            for (assignment = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assignment = cdolist_list_var.first()) {
                                                {
                                                    SubLObject _prev_bind_0_23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$valueTableAssignment, NIL, NIL);
                                                        {
                                                            SubLObject datum = assignment;
                                                            SubLObject current = datum;
                                                            SubLObject sources = NIL;
                                                            SubLObject targets = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt66);
                                                            sources = current.first();
                                                            current = current.rest();
                                                            targets = current;
                                                            {
                                                                SubLObject _prev_bind_0_25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$valueTableAssignmentSources, NIL, NIL);
                                                                    {
                                                                        SubLObject cdolist_list_var_27 = sources;
                                                                        SubLObject source = NIL;
                                                                        for (source = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , source = cdolist_list_var_27.first()) {
                                                                            {
                                                                                SubLObject _prev_bind_0_28 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                try {
                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                    xml_utilities.xml_start_tag_internal($$$valueTableAssignmentTuple, NIL, NIL);
                                                                                    {
                                                                                        SubLObject datum_30 = source;
                                                                                        SubLObject current_31 = datum_30;
                                                                                        SubLObject query = NIL;
                                                                                        SubLObject value = NIL;
                                                                                        destructuring_bind_must_consp(current_31, datum_30, $list_alt69);
                                                                                        query = current_31.first();
                                                                                        current_31 = current_31.rest();
                                                                                        destructuring_bind_must_consp(current_31, datum_30, $list_alt69);
                                                                                        value = current_31.first();
                                                                                        current_31 = current_31.rest();
                                                                                        if (NIL == current_31) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_32 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                    xml_utilities.xml_start_tag_internal($$$valueTableQuery, NIL, NIL);
                                                                                                    cycml.cycml_serialize_term(query);
                                                                                                } finally {
                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_33, thread);
                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_32, thread);
                                                                                                }
                                                                                            }
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal($$$valueTableQuery);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_34 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                    xml_utilities.xml_start_tag_internal($$$valueTableValue, NIL, NIL);
                                                                                                    cycml.cycml_serialize_term(value);
                                                                                                } finally {
                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_35, thread);
                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_34, thread);
                                                                                                }
                                                                                            }
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal($$$valueTableValue);
                                                                                        } else {
                                                                                            cdestructuring_bind_error(datum_30, $list_alt69);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_29, thread);
                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_28, thread);
                                                                                }
                                                                            }
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal($$$valueTableAssignmentTuple);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_26, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_25, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$valueTableAssignmentSources);
                                                            {
                                                                SubLObject _prev_bind_0_36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$valueTableAssignmentTargets, NIL, NIL);
                                                                    {
                                                                        SubLObject cdolist_list_var_38 = targets;
                                                                        SubLObject target = NIL;
                                                                        for (target = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , target = cdolist_list_var_38.first()) {
                                                                            {
                                                                                SubLObject _prev_bind_0_39 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                try {
                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                    xml_utilities.xml_start_tag_internal($$$valueTableAssignmentTuple, NIL, NIL);
                                                                                    {
                                                                                        SubLObject datum_41 = target;
                                                                                        SubLObject current_42 = datum_41;
                                                                                        SubLObject query = NIL;
                                                                                        SubLObject value = NIL;
                                                                                        destructuring_bind_must_consp(current_42, datum_41, $list_alt69);
                                                                                        query = current_42.first();
                                                                                        current_42 = current_42.rest();
                                                                                        destructuring_bind_must_consp(current_42, datum_41, $list_alt69);
                                                                                        value = current_42.first();
                                                                                        current_42 = current_42.rest();
                                                                                        if (NIL == current_42) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_43 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_44 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                    xml_utilities.xml_start_tag_internal($$$valueTableQuery, NIL, NIL);
                                                                                                    cycml.cycml_serialize_term(query);
                                                                                                } finally {
                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_44, thread);
                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_43, thread);
                                                                                                }
                                                                                            }
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal($$$valueTableQuery);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_45 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_46 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                    xml_utilities.xml_start_tag_internal($$$valueTableValue, NIL, NIL);
                                                                                                    cycml.cycml_serialize_term(value);
                                                                                                } finally {
                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_46, thread);
                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_45, thread);
                                                                                                }
                                                                                            }
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal($$$valueTableValue);
                                                                                        } else {
                                                                                            cdestructuring_bind_error(datum_41, $list_alt69);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_40, thread);
                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_39, thread);
                                                                                }
                                                                            }
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal($$$valueTableAssignmentTuple);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_37, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_36, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$valueTableAssignmentTargets);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_24, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_23, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$valueTableAssignment);
                                            }
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_22, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_21, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$valueTableAssignments);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_12, thread);
                        }
                    }
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$valueTable);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return vtable;
        }
    }

    public static SubLObject xml_serialize_value_table(final SubLObject vtable, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != value_table_p(vtable) : "! value_tables.value_table_p(vtable) " + ("value_tables.value_table_p(vtable) " + "CommonSymbols.NIL != value_tables.value_table_p(vtable) ") + vtable;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            try {
                final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$valueTable, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        try {
                            final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$valueTableId, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(value_table_id(vtable));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$25, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$25, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$24, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$valueTableId);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$valueTableLabel, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    cycml.cycml_serialize_term(value_table_label(vtable));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$27, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$valueTableLabel);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                            }
                        }
                        if (NIL != value_table_input_columns(vtable)) {
                            try {
                                final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$valueTableInputColumns, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = value_table_input_columns(vtable);
                                        SubLObject column = NIL;
                                        column = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            xml_serialize_value_table_column(column, stream);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            column = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$27, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$valueTableInputColumns);
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                }
                            }
                        }
                        if (NIL != value_table_output_column(vtable)) {
                            try {
                                final SubLObject _prev_bind_0_$33 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$valueTableOutputColumns, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        xml_serialize_value_table_column(value_table_output_column(vtable), stream);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$34, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$28, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$33, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$valueTableOutputColumns);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                }
                            }
                        }
                        if (NIL != value_table_assignments(vtable)) {
                            try {
                                final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$valueTableAssignments, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = value_table_assignments(vtable);
                                        SubLObject assignment = NIL;
                                        assignment = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$valueTableAssignment, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        SubLObject current;
                                                        final SubLObject datum = current = assignment;
                                                        SubLObject v_sources = NIL;
                                                        SubLObject targets = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list76);
                                                        v_sources = current.first();
                                                        current = targets = current.rest();
                                                        try {
                                                            final SubLObject _prev_bind_0_$40 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$valueTableAssignmentSources, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$41 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    SubLObject cdolist_list_var_$49 = v_sources;
                                                                    SubLObject source = NIL;
                                                                    source = cdolist_list_var_$49.first();
                                                                    while (NIL != cdolist_list_var_$49) {
                                                                        try {
                                                                            final SubLObject _prev_bind_0_$42 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal($$$valueTableAssignmentTuple, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                    SubLObject current_$54;
                                                                                    final SubLObject datum_$53 = current_$54 = source;
                                                                                    SubLObject query = NIL;
                                                                                    SubLObject value = NIL;
                                                                                    destructuring_bind_must_consp(current_$54, datum_$53, $list79);
                                                                                    query = current_$54.first();
                                                                                    current_$54 = current_$54.rest();
                                                                                    destructuring_bind_must_consp(current_$54, datum_$53, $list79);
                                                                                    value = current_$54.first();
                                                                                    current_$54 = current_$54.rest();
                                                                                    if (NIL == current_$54) {
                                                                                        try {
                                                                                            final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                            final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                xml_utilities.xml_start_tag_internal($$$valueTableQuery, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                    cycml.cycml_serialize_term(query);
                                                                                                } finally {
                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                                                                                }
                                                                                            } finally {
                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$33, thread);
                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                final SubLObject _values5 = getValuesAsVector();
                                                                                                xml_utilities.xml_terpri();
                                                                                                xml_utilities.xml_end_tag_internal($$$valueTableQuery);
                                                                                                restoreValuesFromVector(_values5);
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                            final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                xml_utilities.xml_start_tag_internal($$$valueTableValue, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                    cycml.cycml_serialize_term(value);
                                                                                                } finally {
                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
                                                                                                }
                                                                                            } finally {
                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$34, thread);
                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$47, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                final SubLObject _values6 = getValuesAsVector();
                                                                                                xml_utilities.xml_terpri();
                                                                                                xml_utilities.xml_end_tag_internal($$$valueTableValue);
                                                                                                restoreValuesFromVector(_values6);
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum_$53, $list79);
                                                                                    }
                                                                                } finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$43, thread);
                                                                                }
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$32, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$42, thread);
                                                                            }
                                                                        } finally {
                                                                            final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                final SubLObject _values7 = getValuesAsVector();
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal($$$valueTableAssignmentTuple);
                                                                                restoreValuesFromVector(_values7);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                                                            }
                                                                        }
                                                                        cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                                        source = cdolist_list_var_$49.first();
                                                                    } 
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$41, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$31, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$40, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values8 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$valueTableAssignmentSources);
                                                                restoreValuesFromVector(_values8);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$52 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$valueTableAssignmentTargets, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$53 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    SubLObject cdolist_list_var_$50 = targets;
                                                                    SubLObject target = NIL;
                                                                    target = cdolist_list_var_$50.first();
                                                                    while (NIL != cdolist_list_var_$50) {
                                                                        try {
                                                                            final SubLObject _prev_bind_0_$54 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal($$$valueTableAssignmentTuple, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                final SubLObject _prev_bind_0_$55 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                    SubLObject current_$55;
                                                                                    final SubLObject datum_$54 = current_$55 = target;
                                                                                    SubLObject query = NIL;
                                                                                    SubLObject value = NIL;
                                                                                    destructuring_bind_must_consp(current_$55, datum_$54, $list79);
                                                                                    query = current_$55.first();
                                                                                    current_$55 = current_$55.rest();
                                                                                    destructuring_bind_must_consp(current_$55, datum_$54, $list79);
                                                                                    value = current_$55.first();
                                                                                    current_$55 = current_$55.rest();
                                                                                    if (NIL == current_$55) {
                                                                                        try {
                                                                                            final SubLObject _prev_bind_0_$56 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                            final SubLObject _prev_bind_1_$37 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                xml_utilities.xml_start_tag_internal($$$valueTableQuery, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                    cycml.cycml_serialize_term(query);
                                                                                                } finally {
                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$57, thread);
                                                                                                }
                                                                                            } finally {
                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$37, thread);
                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$56, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                final SubLObject _values9 = getValuesAsVector();
                                                                                                xml_utilities.xml_terpri();
                                                                                                xml_utilities.xml_end_tag_internal($$$valueTableQuery);
                                                                                                restoreValuesFromVector(_values9);
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            final SubLObject _prev_bind_0_$59 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                            final SubLObject _prev_bind_1_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                xml_utilities.xml_start_tag_internal($$$valueTableValue, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                final SubLObject _prev_bind_0_$60 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                    cycml.cycml_serialize_term(value);
                                                                                                } finally {
                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$60, thread);
                                                                                                }
                                                                                            } finally {
                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$38, thread);
                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$59, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                final SubLObject _values10 = getValuesAsVector();
                                                                                                xml_utilities.xml_terpri();
                                                                                                xml_utilities.xml_end_tag_internal($$$valueTableValue);
                                                                                                restoreValuesFromVector(_values10);
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum_$54, $list79);
                                                                                    }
                                                                                } finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$55, thread);
                                                                                }
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$36, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$54, thread);
                                                                            }
                                                                        } finally {
                                                                            final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                final SubLObject _values11 = getValuesAsVector();
                                                                                xml_utilities.xml_terpri();
                                                                                xml_utilities.xml_end_tag_internal($$$valueTableAssignmentTuple);
                                                                                restoreValuesFromVector(_values11);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                                                            }
                                                                        }
                                                                        cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                                                        target = cdolist_list_var_$50.first();
                                                                    } 
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$53, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$35, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$52, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values12 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$valueTableAssignmentTargets);
                                                                restoreValuesFromVector(_values12);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$30, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values13 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$valueTableAssignment);
                                                    restoreValuesFromVector(_values13);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assignment = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$29, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$36, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values14 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$valueTableAssignments);
                                    restoreValuesFromVector(_values14);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values15 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$valueTable);
                    restoreValuesFromVector(_values15);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return vtable;
    }

    public static final SubLObject get_vtbl_input_queries_alt(SubLObject vtable_id, SubLObject elmt) {
        return ask_utilities.ask_variable($INPUT_QUERIES, listS($$valueTableSourceQueries, vtable_id, $list_alt73), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_vtbl_input_queries(final SubLObject vtable_id, final SubLObject elmt) {
        return ask_utilities.ask_variable($INPUT_QUERIES, listS($$valueTableSourceQueries, vtable_id, $list83), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_vtbl_output_query_alt(SubLObject vtable_id, SubLObject elmt) {
        return ask_utilities.ask_variable($OUTPUT_QUERY, listS($$valueTableTargetQuery, vtable_id, $list_alt76), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject get_vtbl_output_query(final SubLObject vtable_id, final SubLObject elmt) {
        return ask_utilities.ask_variable($OUTPUT_QUERY, listS($$valueTableTargetQuery, vtable_id, $list86), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject load_value_table_assignments_from_kb_alt(SubLObject vtable_id, SubLObject elmt) {
        {
            SubLObject v_bindings = ask_utilities.ask_template($list_alt77, list($$queryResultsCombineInTable, $sym79$_SOURCES, $sym80$_TARGETS, vtable_id), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject assignments = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject datum = binding;
                    SubLObject current = datum;
                    SubLObject sources = NIL;
                    SubLObject targets = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    sources = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    targets = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject assignment = cons(Mapping.mapcar(REST, sources.rest()), Mapping.mapcar(REST, targets.rest()));
                            assignments = cons(assignment, assignments);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt81);
                    }
                }
            }
            return assignments;
        }
    }

    public static SubLObject load_value_table_assignments_from_kb(final SubLObject vtable_id, final SubLObject elmt) {
        final SubLObject v_bindings = ask_utilities.ask_template($list87, list($$queryResultsCombineInTable, $sym89$_SOURCES, $sym90$_TARGETS, vtable_id), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject assignments = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject v_sources = NIL;
            SubLObject targets = NIL;
            destructuring_bind_must_consp(current, datum, $list91);
            v_sources = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list91);
            targets = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject assignment = cons(Mapping.mapcar(REST, v_sources.rest()), Mapping.mapcar(REST, targets.rest()));
                assignments = cons(assignment, assignments);
            } else {
                cdestructuring_bind_error(datum, $list91);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return assignments;
    }

    public static final SubLObject variable_mapping_table_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_varmap_table(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject variable_mapping_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_varmap_table(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject variable_mapping_table_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject variable_mapping_table_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native.class ? T : NIL;
    }

    public static final SubLObject variable_mapping_table_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.getField2();
    }

    public static SubLObject variable_mapping_table_id(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject variable_mapping_table_source_query_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.getField3();
    }

    public static SubLObject variable_mapping_table_source_query(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject variable_mapping_table_target_query_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.getField4();
    }

    public static SubLObject variable_mapping_table_target_query(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject variable_mapping_table_source_variables_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.getField5();
    }

    public static SubLObject variable_mapping_table_source_variables(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject variable_mapping_table_target_variables_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.getField6();
    }

    public static SubLObject variable_mapping_table_target_variables(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject variable_mapping_table_incompatibles_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.getField7();
    }

    public static SubLObject variable_mapping_table_incompatibles(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject variable_mapping_table_assignments_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.getField8();
    }

    public static SubLObject variable_mapping_table_assignments(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_variable_mapping_table_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_variable_mapping_table_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_variable_mapping_table_source_query_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_variable_mapping_table_source_query(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_variable_mapping_table_target_query_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_variable_mapping_table_target_query(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_variable_mapping_table_source_variables_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_variable_mapping_table_source_variables(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_variable_mapping_table_target_variables_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_variable_mapping_table_target_variables(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_variable_mapping_table_incompatibles_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_variable_mapping_table_incompatibles(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_variable_mapping_table_assignments_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VARIABLE_MAPPING_TABLE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_variable_mapping_table_assignments(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "! value_tables.variable_mapping_table_p(v_object) " + "value_tables.variable_mapping_table_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_variable_mapping_table_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_variable_mapping_table_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SOURCE_QUERY)) {
                            _csetf_variable_mapping_table_source_query(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TARGET_QUERY)) {
                                _csetf_variable_mapping_table_target_query(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SOURCE_VARIABLES)) {
                                    _csetf_variable_mapping_table_source_variables(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($TARGET_VARIABLES)) {
                                        _csetf_variable_mapping_table_target_variables(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($INCOMPATIBLES)) {
                                            _csetf_variable_mapping_table_incompatibles(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($ASSIGNMENTS)) {
                                                _csetf_variable_mapping_table_assignments(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_variable_mapping_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_variable_mapping_table_id(v_new, current_value);
            } else
                if (pcase_var.eql($SOURCE_QUERY)) {
                    _csetf_variable_mapping_table_source_query(v_new, current_value);
                } else
                    if (pcase_var.eql($TARGET_QUERY)) {
                        _csetf_variable_mapping_table_target_query(v_new, current_value);
                    } else
                        if (pcase_var.eql($SOURCE_VARIABLES)) {
                            _csetf_variable_mapping_table_source_variables(v_new, current_value);
                        } else
                            if (pcase_var.eql($TARGET_VARIABLES)) {
                                _csetf_variable_mapping_table_target_variables(v_new, current_value);
                            } else
                                if (pcase_var.eql($INCOMPATIBLES)) {
                                    _csetf_variable_mapping_table_incompatibles(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ASSIGNMENTS)) {
                                        _csetf_variable_mapping_table_assignments(v_new, current_value);
                                    } else {
                                        Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_variable_mapping_table(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_VARIABLE_MAPPING_TABLE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, variable_mapping_table_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_QUERY, variable_mapping_table_source_query(obj));
        funcall(visitor_fn, obj, $SLOT, $TARGET_QUERY, variable_mapping_table_target_query(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_VARIABLES, variable_mapping_table_source_variables(obj));
        funcall(visitor_fn, obj, $SLOT, $TARGET_VARIABLES, variable_mapping_table_target_variables(obj));
        funcall(visitor_fn, obj, $SLOT, $INCOMPATIBLES, variable_mapping_table_incompatibles(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSIGNMENTS, variable_mapping_table_assignments(obj));
        funcall(visitor_fn, obj, $END, MAKE_VARIABLE_MAPPING_TABLE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_variable_mapping_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_variable_mapping_table(obj, visitor_fn);
    }

    public static final SubLObject print_varmap_table_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        write_string($str_alt110$__VariableMappingTable_, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str_alt111$_A_for__A_____A__, new SubLObject[]{ NIL != variable_mapping_table_id(v_object) ? ((SubLObject) (variable_mapping_table_id(v_object))) : $$$anonymous, NIL != variable_mapping_table_source_query(v_object) ? ((SubLObject) (variable_mapping_table_source_query(v_object))) : $$$no_source, NIL != variable_mapping_table_target_query(v_object) ? ((SubLObject) (variable_mapping_table_target_query(v_object))) : $$$no_target });
        format(stream, $str_alt115$_Source_Variables___A__, variable_mapping_table_source_variables(v_object));
        format(stream, $str_alt116$_Target_Variables___A__, variable_mapping_table_target_variables(v_object));
        format(stream, $str_alt117$_Incompatibilities__source_view__);
        if (NIL != dictionary.dictionary_p(variable_mapping_table_incompatibles(v_object))) {
            dictionary_utilities.print_dictionary_contents(variable_mapping_table_incompatibles(v_object), stream);
        } else {
            format(stream, $str_alt118$null_dictionary__);
        }
        format(stream, $str_alt119$_Current_Assignments___A__, variable_mapping_table_assignments(v_object));
        write_string($str_alt20$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject print_varmap_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str123$__VariableMappingTable_, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str124$_A_for__A_____A__, new SubLObject[]{ NIL != variable_mapping_table_id(v_object) ? variable_mapping_table_id(v_object) : $$$anonymous, NIL != variable_mapping_table_source_query(v_object) ? variable_mapping_table_source_query(v_object) : $$$no_source, NIL != variable_mapping_table_target_query(v_object) ? variable_mapping_table_target_query(v_object) : $$$no_target });
        format(stream, $str128$_Source_Variables___A__, variable_mapping_table_source_variables(v_object));
        format(stream, $str129$_Target_Variables___A__, variable_mapping_table_target_variables(v_object));
        format(stream, $str130$_Incompatibilities__source_view__);
        if (NIL != dictionary.dictionary_p(variable_mapping_table_incompatibles(v_object))) {
            dictionary_utilities.print_dictionary_contents(variable_mapping_table_incompatibles(v_object), stream);
        } else {
            format(stream, $str131$null_dictionary__);
        }
        format(stream, $str132$_Current_Assignments___A__, variable_mapping_table_assignments(v_object));
        write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject xml_serialize_variable_mapping_table_alt(SubLObject varmap, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    {
                        SubLObject _prev_bind_0_47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$varMapTable, NIL, NIL);
                            if (NIL != variable_mapping_table_id(varmap)) {
                                {
                                    SubLObject _prev_bind_0_48 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_49 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$varMapTableId, NIL, NIL);
                                        cycml.cycml_serialize_term(variable_mapping_table_id(varmap));
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_49, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$varMapTableId);
                            }
                            if (NIL != variable_mapping_table_source_query(varmap)) {
                                {
                                    SubLObject _prev_bind_0_50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$varMapSourceQuery, NIL, NIL);
                                        cycml.cycml_serialize_term(variable_mapping_table_source_query(varmap));
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_51, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_50, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$varMapSourceQuery);
                            }
                            if (NIL != variable_mapping_table_target_query(varmap)) {
                                {
                                    SubLObject _prev_bind_0_52 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$varMapTargetQuery, NIL, NIL);
                                        cycml.cycml_serialize_term(variable_mapping_table_target_query(varmap));
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_53, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$varMapTargetQuery);
                            }
                            if (NIL != variable_mapping_table_source_variables(varmap)) {
                                {
                                    SubLObject _prev_bind_0_54 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$varMapSourceVariables, NIL, NIL);
                                        {
                                            SubLObject cdolist_list_var = variable_mapping_table_source_variables(varmap);
                                            SubLObject variable = NIL;
                                            for (variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable = cdolist_list_var.first()) {
                                                cycml.cycml_serialize_term(variable);
                                            }
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_55, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_54, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$varMapSourceVariables);
                            }
                            if (NIL != variable_mapping_table_target_variables(varmap)) {
                                {
                                    SubLObject _prev_bind_0_56 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_57 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$varMapTargetVariables, NIL, NIL);
                                        {
                                            SubLObject cdolist_list_var = variable_mapping_table_target_variables(varmap);
                                            SubLObject variable = NIL;
                                            for (variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable = cdolist_list_var.first()) {
                                                cycml.cycml_serialize_term(variable);
                                            }
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_57, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_56, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$varMapTargetVariables);
                            }
                            if (NIL != variable_mapping_table_incompatibles(varmap)) {
                                {
                                    SubLObject _prev_bind_0_58 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_59 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$varMapIncompatibles, NIL, NIL);
                                        {
                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(variable_mapping_table_incompatibles(varmap)));
                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject source_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    SubLObject target_vars = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject _prev_bind_0_60 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_61 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$varMapIncompatible, NIL, NIL);
                                                            {
                                                                SubLObject _prev_bind_0_62 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_63 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$varMapSourceVariable, NIL, NIL);
                                                                    cycml.cycml_serialize_term(source_var);
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_63, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_62, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$varMapSourceVariable);
                                                            {
                                                                SubLObject _prev_bind_0_64 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_65 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$varMapTargetVariables, NIL, NIL);
                                                                    {
                                                                        SubLObject cdolist_list_var = target_vars;
                                                                        SubLObject target_var = NIL;
                                                                        for (target_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , target_var = cdolist_list_var.first()) {
                                                                            cycml.cycml_serialize_term(target_var);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_65, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_64, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$varMapTargetVariables);
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_61, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_60, thread);
                                                        }
                                                    }
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$varMapIncompatible);
                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                }
                                            } 
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_59, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_58, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$varMapIncompatibles);
                            }
                            if (NIL != variable_mapping_table_assignments(varmap)) {
                                {
                                    SubLObject _prev_bind_0_66 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_67 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$varMapAssignments, NIL, NIL);
                                        {
                                            SubLObject cdolist_list_var = variable_mapping_table_assignments(varmap);
                                            SubLObject assignment = NIL;
                                            for (assignment = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assignment = cdolist_list_var.first()) {
                                                {
                                                    SubLObject _prev_bind_0_68 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_69 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$varMapAssignment, NIL, NIL);
                                                        {
                                                            SubLObject datum = assignment;
                                                            SubLObject current = datum;
                                                            SubLObject source_var = NIL;
                                                            SubLObject target_var = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt131);
                                                            source_var = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt131);
                                                            target_var = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                {
                                                                    SubLObject _prev_bind_0_70 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_71 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$varMapSourceVariable, NIL, NIL);
                                                                        cycml.cycml_serialize_term(source_var);
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_71, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_70, thread);
                                                                    }
                                                                }
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$varMapSourceVariable);
                                                                {
                                                                    SubLObject _prev_bind_0_72 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_73 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$varMapTargetVariable, NIL, NIL);
                                                                        cycml.cycml_serialize_term(target_var);
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_73, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_72, thread);
                                                                    }
                                                                }
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$varMapTargetVariable);
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt131);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_69, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_68, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$varMapAssignment);
                                            }
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_67, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_66, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$varMapAssignments);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_47, thread);
                        }
                    }
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$varMapTable);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return varmap;
        }
    }

    public static SubLObject xml_serialize_variable_mapping_table(final SubLObject varmap, SubLObject stream) {
        if (stream == UNPROVIDED) {
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
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$varMapTable, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$88 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        if (NIL != variable_mapping_table_id(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$90 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$varMapTableId, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(variable_mapping_table_id(varmap));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$90, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$90, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$89, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$varMapTableId);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                }
                            }
                        }
                        if (NIL != variable_mapping_table_source_query(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$92 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$91 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$varMapSourceQuery, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$93 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(variable_mapping_table_source_query(varmap));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$93, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$91, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$92, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$varMapSourceQuery);
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                                }
                            }
                        }
                        if (NIL != variable_mapping_table_target_query(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$varMapTargetQuery, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        cycml.cycml_serialize_term(variable_mapping_table_target_query(varmap));
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$96, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$92, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$95, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$varMapTargetQuery);
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                                }
                            }
                        }
                        if (NIL != variable_mapping_table_source_variables(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$98 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$varMapSourceVariables, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$99 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = variable_mapping_table_source_variables(varmap);
                                        SubLObject variable = NIL;
                                        variable = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            cycml.cycml_serialize_term(variable);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            variable = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$99, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$93, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$98, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$varMapSourceVariables);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                                }
                            }
                        }
                        if (NIL != variable_mapping_table_target_variables(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$varMapTargetVariables, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = variable_mapping_table_target_variables(varmap);
                                        SubLObject variable = NIL;
                                        variable = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            cycml.cycml_serialize_term(variable);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            variable = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$102, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$94, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$101, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values5 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$varMapTargetVariables);
                                    restoreValuesFromVector(_values5);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                                }
                            }
                        }
                        if (NIL != variable_mapping_table_incompatibles(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$104 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$95 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$varMapIncompatibles, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$105 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(variable_mapping_table_incompatibles(varmap))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject source_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject target_vars = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            try {
                                                final SubLObject _prev_bind_0_$106 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$varMapIncompatible, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$107 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        try {
                                                            final SubLObject _prev_bind_0_$108 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$97 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$varMapSourceVariable, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$109 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_term(source_var);
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$109, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$97, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$108, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$110 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values6 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$varMapSourceVariable);
                                                                restoreValuesFromVector(_values6);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject _prev_bind_0_$111 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$98 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($$$varMapTargetVariables, NIL, NIL, NIL, $UNINITIALIZED);
                                                                final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    SubLObject cdolist_list_var2 = target_vars;
                                                                    SubLObject target_var = NIL;
                                                                    target_var = cdolist_list_var2.first();
                                                                    while (NIL != cdolist_list_var2) {
                                                                        cycml.cycml_serialize_term(target_var);
                                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                                        target_var = cdolist_list_var2.first();
                                                                    } 
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$98, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$111, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values7 = getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal($$$varMapTargetVariables);
                                                                restoreValuesFromVector(_values7);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$107, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$96, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$106, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values8 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$varMapIncompatible);
                                                    restoreValuesFromVector(_values8);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$105, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$95, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$104, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$115 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values9 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$varMapIncompatibles);
                                    restoreValuesFromVector(_values9);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                                }
                            }
                        }
                        if (NIL != variable_mapping_table_assignments(varmap)) {
                            try {
                                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$99 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$varMapAssignments, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var = variable_mapping_table_assignments(varmap);
                                        SubLObject assignment = NIL;
                                        assignment = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            try {
                                                final SubLObject _prev_bind_0_$118 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$100 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$varMapAssignment, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$119 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        SubLObject current;
                                                        final SubLObject datum = current = assignment;
                                                        SubLObject source_var2 = NIL;
                                                        SubLObject target_var2 = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list144);
                                                        source_var2 = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list144);
                                                        target_var2 = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            try {
                                                                final SubLObject _prev_bind_0_$120 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$101 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$varMapSourceVariable, NIL, NIL, NIL, $UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                        cycml.cycml_serialize_term(source_var2);
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$121, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$101, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$120, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$122 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values10 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$varMapSourceVariable);
                                                                    restoreValuesFromVector(_values10);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                                                                }
                                                            }
                                                            try {
                                                                final SubLObject _prev_bind_0_$123 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$102 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$varMapTargetVariable, NIL, NIL, NIL, $UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$124 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                        cycml.cycml_serialize_term(target_var2);
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$124, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$102, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$123, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$125 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values11 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$varMapTargetVariable);
                                                                    restoreValuesFromVector(_values11);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$125, thread);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list144);
                                                        }
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$119, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$100, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$118, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$126 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values12 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$varMapAssignment);
                                                    restoreValuesFromVector(_values12);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$126, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assignment = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$99, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$127 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values13 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$varMapAssignments);
                                    restoreValuesFromVector(_values13);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$127, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$88, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$87, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values14 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$varMapTable);
                    restoreValuesFromVector(_values14);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return varmap;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("QUERY"), makeSymbol("LABEL"), makeSymbol("VALUES"));

    static private final SubLList $list_alt3 = list(makeKeyword("QUERY"), makeKeyword("LABEL"), makeKeyword("VALUES"));

    static private final SubLList $list_alt4 = list(makeSymbol("VALUE-TABLE-COLUMN-QUERY"), makeSymbol("VALUE-TABLE-COLUMN-LABEL"), makeSymbol("VALUE-TABLE-COLUMN-VALUES"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-VALUE-TABLE-COLUMN-QUERY"), makeSymbol("_CSETF-VALUE-TABLE-COLUMN-LABEL"), makeSymbol("_CSETF-VALUE-TABLE-COLUMN-VALUES"));

    static private final SubLString $str_alt17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt18$__ValueTableColumn_ = makeString("#<ValueTableColumn ");

    static private final SubLString $str_alt19$_A___S____supported_values___S = makeString("~A (~S)~% supported values: ~S");

    static private final SubLString $str_alt20$_ = makeString(">");

    static private final SubLList $list_alt26 = list(makeSymbol("THE-SET"), makeSymbol("EL-INFERENCE-BINDING"));

    static private final SubLList $list_alt27 = list(makeSymbol("EL-INFBIND-FN"), makeSymbol("VARIABLE"), makeSymbol("RESULT-VALUE"));

    static private final SubLList $list_alt32 = list(makeSymbol("ID"), makeSymbol("LABEL"), makeSymbol("INPUT-COLUMNS"), makeSymbol("OUTPUT-COLUMN"), makeSymbol("ASSIGNMENTS"));

    static private final SubLList $list_alt33 = list(makeKeyword("ID"), makeKeyword("LABEL"), makeKeyword("INPUT-COLUMNS"), makeKeyword("OUTPUT-COLUMN"), makeKeyword("ASSIGNMENTS"));

    static private final SubLList $list_alt34 = list(makeSymbol("VALUE-TABLE-ID"), makeSymbol("VALUE-TABLE-LABEL"), makeSymbol("VALUE-TABLE-INPUT-COLUMNS"), makeSymbol("VALUE-TABLE-OUTPUT-COLUMN"), makeSymbol("VALUE-TABLE-ASSIGNMENTS"));

    static private final SubLList $list_alt35 = list(makeSymbol("_CSETF-VALUE-TABLE-ID"), makeSymbol("_CSETF-VALUE-TABLE-LABEL"), makeSymbol("_CSETF-VALUE-TABLE-INPUT-COLUMNS"), makeSymbol("_CSETF-VALUE-TABLE-OUTPUT-COLUMN"), makeSymbol("_CSETF-VALUE-TABLE-ASSIGNMENTS"));

    static private final SubLString $str_alt52$__ValueTable_ = makeString("#<ValueTable ");

    static private final SubLString $str_alt53$_S___A___ = makeString("~S (~A)~%");

    static private final SubLString $str_alt54$_Input_Columns__ = makeString(" Input Columns: ");

    static private final SubLString $str_alt55$_____S__ = makeString("    ~S~%");

    static private final SubLString $str_alt56$_Output_Column__ = makeString(" Output Column: ");

    static private final SubLString $str_alt57$_Existing_Assignments__ = makeString(" Existing Assignments: ");

    static private final SubLList $list_alt66 = cons(makeSymbol("SOURCES"), makeSymbol("TARGETS"));

    static private final SubLList $list_alt69 = list(makeSymbol("QUERY"), makeSymbol("VALUE"));

    static private final SubLList $list_alt73 = list(makeKeyword("INPUT-QUERIES"));

    static private final SubLList $list_alt76 = list(makeKeyword("OUTPUT-QUERY"));

    static private final SubLList $list_alt77 = list(makeSymbol("?SOURCES"), makeSymbol("?TARGETS"));

    static private final SubLSymbol $sym79$_SOURCES = makeSymbol("?SOURCES");

    static private final SubLSymbol $sym80$_TARGETS = makeSymbol("?TARGETS");

    static private final SubLList $list_alt81 = list(makeSymbol("SOURCES"), makeSymbol("TARGETS"));

    static private final SubLList $list_alt85 = list(makeSymbol("ID"), makeSymbol("SOURCE-QUERY"), makeSymbol("TARGET-QUERY"), makeSymbol("SOURCE-VARIABLES"), makeSymbol("TARGET-VARIABLES"), makeSymbol("INCOMPATIBLES"), makeSymbol("ASSIGNMENTS"));

    static private final SubLList $list_alt86 = list(makeKeyword("ID"), makeKeyword("SOURCE-QUERY"), makeKeyword("TARGET-QUERY"), makeKeyword("SOURCE-VARIABLES"), makeKeyword("TARGET-VARIABLES"), makeKeyword("INCOMPATIBLES"), makeKeyword("ASSIGNMENTS"));

    static private final SubLList $list_alt87 = list(makeSymbol("VARIABLE-MAPPING-TABLE-ID"), makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-QUERY"), makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-QUERY"), makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES"), makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-VARIABLES"), makeSymbol("VARIABLE-MAPPING-TABLE-INCOMPATIBLES"), makeSymbol("VARIABLE-MAPPING-TABLE-ASSIGNMENTS"));

    static private final SubLList $list_alt88 = list(makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ID"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS"));

    static private final SubLString $str_alt110$__VariableMappingTable_ = makeString("#<VariableMappingTable ");

    static private final SubLString $str_alt111$_A_for__A_____A__ = makeString("~A for ~A -> ~A~%");

    static private final SubLString $str_alt115$_Source_Variables___A__ = makeString(" Source Variables: ~A~%");

    static private final SubLString $str_alt116$_Target_Variables___A__ = makeString(" Target Variables: ~A~%");

    static private final SubLString $str_alt117$_Incompatibilities__source_view__ = makeString(" Incompatibilities (source view): ~%");

    static private final SubLString $str_alt118$null_dictionary__ = makeString("null dictionary~%");

    static private final SubLString $str_alt119$_Current_Assignments___A__ = makeString(" Current Assignments: ~A~%");

    static private final SubLList $list_alt131 = list(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VAR"));

    static private final SubLSymbol $sym133$CYC_VAR_ = makeSymbol("CYC-VAR?");

    public static final SubLObject $const135$variableMappingTableSourceFormula = reader_make_constant_shell("variableMappingTableSourceFormula-QuerySpec");

    static private final SubLList $list_alt136 = list(makeKeyword("SOURCE"));

    public static final SubLObject $const138$variableMappingTableTargetFormula = reader_make_constant_shell("variableMappingTableTargetFormula-QuerySpec");

    static private final SubLList $list_alt139 = list(makeKeyword("TARGET"));

    static private final SubLSymbol $sym140$ANY_DISJOINT_WITH_ANY__MEMOIZED = makeSymbol("ANY-DISJOINT-WITH-ANY?-MEMOIZED");

    public static final SubLSymbol $kw141$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt142$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt143 = list(makeSymbol("SRC-ISAS"), makeSymbol("SRC-GENLS"), makeSymbol("SRC-QUOTED-ISAS"));

    static private final SubLList $list_alt144 = list(makeSymbol("TRG-ISAS"), makeSymbol("TRG-GENLS"), makeSymbol("TRG-QUOTED-ISAS"));

    static private final SubLList $list_alt145 = list(makeSymbol("?SOURCE-VAR"), makeSymbol("?TARGET-VAR"));

    public static final SubLObject $const146$querySpecVariablesUnifyInTable_Wo = reader_make_constant_shell("querySpecVariablesUnifyInTable-WorkaroundPred");

    static private final SubLList $list_alt147 = list(reader_make_constant_shell("AnalysisOutputBindingsForVarFn"), makeSymbol("?SOURCE-VAR"));

    static private final SubLList $list_alt148 = list(reader_make_constant_shell("AnalysisInputBindingsForVarFn"), makeSymbol("?TARGET-VAR"));

    static private final SubLSymbol $sym150$_SOURCE_VAR = makeSymbol("?SOURCE-VAR");

    static private final SubLSymbol $sym151$_TARGET_VAR = makeSymbol("?TARGET-VAR");

    public static final SubLObject new_variable_mapping_table_alt(SubLObject table_id) {
        {
            SubLObject varmap = make_variable_mapping_table(UNPROVIDED);
            _csetf_variable_mapping_table_id(varmap, table_id);
            return varmap;
        }
    }

    public static SubLObject new_variable_mapping_table(final SubLObject table_id) {
        final SubLObject varmap = make_variable_mapping_table(UNPROVIDED);
        _csetf_variable_mapping_table_id(varmap, table_id);
        return varmap;
    }

    public static final SubLObject load_variable_mapping_table_from_kb_alt(SubLObject table_id, SubLObject elmt, SubLObject source_query, SubLObject target_query) {
        if (source_query == UNPROVIDED) {
            source_query = NIL;
        }
        if (target_query == UNPROVIDED) {
            target_query = NIL;
        }
        {
            SubLObject varmap = new_variable_mapping_table(table_id);
            varmaptbl_assign_queries(varmap, source_query, target_query, elmt);
            varmaptbl_assign_variable_information(varmap, elmt);
            varmaptbl_assign_current_assignments(varmap, elmt);
            return varmap;
        }
    }

    public static SubLObject load_variable_mapping_table_from_kb(final SubLObject table_id, final SubLObject elmt, SubLObject source_query, SubLObject target_query) {
        if (source_query == UNPROVIDED) {
            source_query = NIL;
        }
        if (target_query == UNPROVIDED) {
            target_query = NIL;
        }
        final SubLObject varmap = new_variable_mapping_table(table_id);
        varmaptbl_assign_queries(varmap, source_query, target_query, elmt);
        varmaptbl_assign_variable_information(varmap, elmt);
        varmaptbl_assign_current_assignments(varmap, elmt);
        return varmap;
    }

    public static final SubLObject get_variable_mapping_table_for_formulas_alt(SubLObject source_formula, SubLObject target_formula, SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym133$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        {
            SubLObject varmap = new_variable_mapping_table(NIL);
            varmaptbl_assign_variable_information_from_formulas(varmap, elmt, source_formula, target_formula, varP, free_variables_onlyP);
            return varmap;
        }
    }

    public static SubLObject get_variable_mapping_table_for_formulas(final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym146$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        final SubLObject varmap = new_variable_mapping_table(NIL);
        varmaptbl_assign_variable_information_from_formulas(varmap, elmt, source_formula, target_formula, varP, free_variables_onlyP);
        return varmap;
    }

    public static final SubLObject varmaptbl_assign_queries_alt(SubLObject varmap, SubLObject source_query, SubLObject target_query, SubLObject elmt) {
        {
            SubLObject table_id = variable_mapping_table_id(varmap);
            if (NIL == source_query) {
                source_query = varmaptbl_load_source_query_information(table_id, elmt);
            }
            if (NIL == target_query) {
                target_query = varmaptbl_load_target_query_information(table_id, elmt);
            }
        }
        _csetf_variable_mapping_table_source_query(varmap, source_query);
        _csetf_variable_mapping_table_target_query(varmap, target_query);
        return varmap;
    }

    public static SubLObject varmaptbl_assign_queries(final SubLObject varmap, SubLObject source_query, SubLObject target_query, final SubLObject elmt) {
        final SubLObject table_id = variable_mapping_table_id(varmap);
        if (NIL == source_query) {
            source_query = varmaptbl_load_source_query_information(table_id, elmt);
        }
        if (NIL == target_query) {
            target_query = varmaptbl_load_target_query_information(table_id, elmt);
        }
        _csetf_variable_mapping_table_source_query(varmap, source_query);
        _csetf_variable_mapping_table_target_query(varmap, target_query);
        return varmap;
    }

    public static final SubLObject varmaptbl_load_source_query_information_alt(SubLObject table_id, SubLObject elmt) {
        return ask_utilities.ask_variable($SOURCE, listS($const135$variableMappingTableSourceFormula, table_id, $list_alt136), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject varmaptbl_load_source_query_information(final SubLObject table_id, final SubLObject elmt) {
        return ask_utilities.ask_variable($SOURCE, listS($const148$variableMappingTableSourceFormula, table_id, $list149), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject varmaptbl_load_target_query_information_alt(SubLObject table_id, SubLObject elmt) {
        return ask_utilities.ask_variable($TARGET, listS($const138$variableMappingTableTargetFormula, table_id, $list_alt139), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject varmaptbl_load_target_query_information(final SubLObject table_id, final SubLObject elmt) {
        return ask_utilities.ask_variable($TARGET, listS($const151$variableMappingTableTargetFormula, table_id, $list152), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject varmaptbl_assign_variable_information_alt(SubLObject varmap, SubLObject elmt) {
        {
            SubLObject source_constraints = varmaptbl_load_query_variable_information(variable_mapping_table_source_query(varmap), elmt);
            SubLObject target_constraints = varmaptbl_load_query_variable_information(variable_mapping_table_target_query(varmap), elmt);
            varmaptbl_store_variable_information(varmap, elmt, source_constraints, target_constraints);
            return varmap;
        }
    }

    public static SubLObject varmaptbl_assign_variable_information(final SubLObject varmap, final SubLObject elmt) {
        final SubLObject source_constraints = varmaptbl_load_query_variable_information(variable_mapping_table_source_query(varmap), elmt);
        final SubLObject target_constraints = varmaptbl_load_query_variable_information(variable_mapping_table_target_query(varmap), elmt);
        varmaptbl_store_variable_information(varmap, elmt, source_constraints, target_constraints);
        return varmap;
    }

    public static final SubLObject varmaptbl_assign_variable_information_from_formulas_alt(SubLObject varmap, SubLObject elmt, SubLObject source_formula, SubLObject target_formula, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym133$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        {
            SubLObject source_constraints = at_var_types.formula_variables_arg_constraints_dict(source_formula, elmt, varP, free_variables_onlyP);
            SubLObject target_constraints = at_var_types.formula_variables_arg_constraints_dict(target_formula, elmt, varP, free_variables_onlyP);
            return varmaptbl_store_variable_information(varmap, elmt, source_constraints, target_constraints);
        }
    }

    public static SubLObject varmaptbl_assign_variable_information_from_formulas(final SubLObject varmap, final SubLObject elmt, final SubLObject source_formula, final SubLObject target_formula, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym146$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        final SubLObject source_constraints = at_var_types.formula_variables_arg_constraints_dict(source_formula, elmt, varP, free_variables_onlyP);
        final SubLObject target_constraints = at_var_types.formula_variables_arg_constraints_dict(target_formula, elmt, varP, free_variables_onlyP);
        return varmaptbl_store_variable_information(varmap, elmt, source_constraints, target_constraints);
    }

    public static final SubLObject varmaptbl_store_variable_information_alt(SubLObject varmap, SubLObject elmt, SubLObject source_constraints, SubLObject target_constraints) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            _csetf_variable_mapping_table_source_variables(varmap, dictionary.dictionary_keys(source_constraints));
            _csetf_variable_mapping_table_target_variables(varmap, dictionary.dictionary_keys(target_constraints));
            {
                SubLObject incompatible_variables = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
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
                                            Errors.error($str_alt142$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_constraints));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject src_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            SubLObject src_constraint = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject datum = src_constraint;
                                                SubLObject current = datum;
                                                SubLObject src_isas = NIL;
                                                SubLObject src_genls = NIL;
                                                SubLObject src_quoted_isas = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt143);
                                                src_isas = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt143);
                                                src_genls = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt143);
                                                src_quoted_isas = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    {
                                                        SubLObject incompatibles = NIL;
                                                        SubLObject iteration_state_74 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(target_constraints));
                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_74)) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject trg_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_74);
                                                                SubLObject trg_constraint = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject datum_75 = trg_constraint;
                                                                    SubLObject current_76 = datum_75;
                                                                    SubLObject trg_isas = NIL;
                                                                    SubLObject trg_genls = NIL;
                                                                    SubLObject trg_quoted_isas = NIL;
                                                                    destructuring_bind_must_consp(current_76, datum_75, $list_alt144);
                                                                    trg_isas = current_76.first();
                                                                    current_76 = current_76.rest();
                                                                    destructuring_bind_must_consp(current_76, datum_75, $list_alt144);
                                                                    trg_genls = current_76.first();
                                                                    current_76 = current_76.rest();
                                                                    destructuring_bind_must_consp(current_76, datum_75, $list_alt144);
                                                                    trg_quoted_isas = current_76.first();
                                                                    current_76 = current_76.rest();
                                                                    if (NIL == current_76) {
                                                                        if (NIL != any_disjoint_with_anyP_memoized(src_isas, trg_isas, elmt)) {
                                                                            incompatibles = cons(trg_var, incompatibles);
                                                                        } else {
                                                                            if (NIL != any_disjoint_with_anyP_memoized(src_genls, trg_genls, elmt)) {
                                                                                incompatibles = cons(trg_var, incompatibles);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum_75, $list_alt144);
                                                                    }
                                                                }
                                                                iteration_state_74 = dictionary_contents.do_dictionary_contents_next(iteration_state_74);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_74);
                                                        if (NIL != incompatibles) {
                                                            dictionary.dictionary_enter(incompatible_variables, src_var, incompatibles);
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt143);
                                                }
                                            }
                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_77, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                _csetf_variable_mapping_table_incompatibles(varmap, incompatible_variables);
            }
            return varmap;
        }
    }

    public static SubLObject varmaptbl_store_variable_information(final SubLObject varmap, final SubLObject elmt, final SubLObject source_constraints, final SubLObject target_constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        _csetf_variable_mapping_table_source_variables(varmap, dictionary.dictionary_keys(source_constraints));
        _csetf_variable_mapping_table_target_variables(varmap, dictionary.dictionary_keys(target_constraints));
        final SubLObject incompatible_variables = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_constraints)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject src_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject src_constraint = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject current;
                    final SubLObject datum = current = src_constraint;
                    SubLObject src_isas = NIL;
                    SubLObject src_genls = NIL;
                    SubLObject src_quoted_isas = NIL;
                    destructuring_bind_must_consp(current, datum, $list153);
                    src_isas = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list153);
                    src_genls = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list153);
                    src_quoted_isas = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject incompatibles = NIL;
                        SubLObject iteration_state_$142;
                        for (iteration_state_$142 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(target_constraints)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$142); iteration_state_$142 = dictionary_contents.do_dictionary_contents_next(iteration_state_$142)) {
                            thread.resetMultipleValues();
                            final SubLObject trg_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$142);
                            final SubLObject trg_constraint = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject current_$144;
                            final SubLObject datum_$143 = current_$144 = trg_constraint;
                            SubLObject trg_isas = NIL;
                            SubLObject trg_genls = NIL;
                            SubLObject trg_quoted_isas = NIL;
                            destructuring_bind_must_consp(current_$144, datum_$143, $list154);
                            trg_isas = current_$144.first();
                            current_$144 = current_$144.rest();
                            destructuring_bind_must_consp(current_$144, datum_$143, $list154);
                            trg_genls = current_$144.first();
                            current_$144 = current_$144.rest();
                            destructuring_bind_must_consp(current_$144, datum_$143, $list154);
                            trg_quoted_isas = current_$144.first();
                            current_$144 = current_$144.rest();
                            if (NIL == current_$144) {
                                if (NIL != disjoint_with.any_disjoint_with_anyP_memoized(src_isas, trg_isas, elmt, T, UNPROVIDED)) {
                                    incompatibles = cons(trg_var, incompatibles);
                                } else
                                    if (NIL != disjoint_with.any_disjoint_with_anyP_memoized(src_genls, trg_genls, elmt, T, UNPROVIDED)) {
                                        incompatibles = cons(trg_var, incompatibles);
                                    }

                            } else {
                                cdestructuring_bind_error(datum_$143, $list154);
                            }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$142);
                        if (NIL != incompatibles) {
                            dictionary.dictionary_enter(incompatible_variables, src_var, incompatibles);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list153);
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            } finally {
                final SubLObject _prev_bind_0_$145 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        _csetf_variable_mapping_table_incompatibles(varmap, incompatible_variables);
        return varmap;
    }

    public static final SubLObject varmaptbl_load_query_variable_information_alt(SubLObject query_id, SubLObject elmt) {
        if (NIL == query_id) {
            return dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject query_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(query_id, UNPROVIDED);
            SubLObject formula = new_cycl_query_specification.new_cycl_query_specification_formula(query_spec);
            return at_var_types.formula_variables_arg_constraints_dict(formula, elmt, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject varmaptbl_load_query_variable_information(final SubLObject query_id, final SubLObject elmt) {
        if (NIL == query_id) {
            return dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        final SubLObject query_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(query_id, UNPROVIDED);
        final SubLObject formula = new_cycl_query_specification.new_cycl_query_specification_formula(query_spec);
        return at_var_types.formula_variables_arg_constraints_dict(formula, elmt, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject varmaptbl_assign_current_assignments_alt(SubLObject varmap, SubLObject elmt) {
        _csetf_variable_mapping_table_assignments(varmap, varmaptbl_load_current_assignments(variable_mapping_table_id(varmap), variable_mapping_table_source_query(varmap), variable_mapping_table_target_query(varmap), elmt));
        return varmap;
    }

    public static SubLObject varmaptbl_assign_current_assignments(final SubLObject varmap, final SubLObject elmt) {
        _csetf_variable_mapping_table_assignments(varmap, varmaptbl_load_current_assignments(variable_mapping_table_id(varmap), variable_mapping_table_source_query(varmap), variable_mapping_table_target_query(varmap), elmt));
        return varmap;
    }

    public static final SubLObject varmaptbl_load_current_assignments_alt(SubLObject table_id, SubLObject source_query, SubLObject target_query, SubLObject elmt) {
        if (((NIL == table_id) || (NIL == target_query)) || (NIL == source_query)) {
            return NIL;
        }
        {
            SubLObject results = NIL;
            SubLObject workaround = ask_utilities.ask_template($list_alt145, list($const146$querySpecVariablesUnifyInTable_Wo, source_query, $list_alt147, target_query, $list_alt148, table_id), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            results = workaround;
            if (NIL == results) {
                results = ask_utilities.ask_template($list_alt145, list($$querySpecVariablesUnifyInTable, source_query, $sym150$_SOURCE_VAR, target_query, $sym151$_TARGET_VAR, table_id), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return results;
        }
    }

    public static SubLObject varmaptbl_load_current_assignments(final SubLObject table_id, final SubLObject source_query, final SubLObject target_query, final SubLObject elmt) {
        if (((NIL == table_id) || (NIL == target_query)) || (NIL == source_query)) {
            return NIL;
        }
        SubLObject results = NIL;
        final SubLObject workaround = results = ask_utilities.ask_template($list155, list($const156$querySpecVariablesUnifyInTable_Wo, source_query, $list157, target_query, $list158, table_id), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == results) {
            results = ask_utilities.ask_template($list155, list($$querySpecVariablesUnifyInTable, source_query, $sym160$_SOURCE_VAR, target_query, $sym161$_TARGET_VAR, table_id), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return results;
    }

    /**
     * Call JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS multiple times to combine the provided literals, using VARMAP-ATTEMPT-TO-COMBINE-VARIABLES to get the variable mapping and UNIQUIFY-VARIABLES-ACROSS-TWO-SENTENCES to ensure no accidental variable collisions.
     */
    @LispMethod(comment = "Call JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS multiple times to combine the provided literals, using VARMAP-ATTEMPT-TO-COMBINE-VARIABLES to get the variable mapping and UNIQUIFY-VARIABLES-ACROSS-TWO-SENTENCES to ensure no accidental variable collisions.")
    public static final SubLObject varmap_autocombine_literals_alt(SubLObject literals, SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (elmt == UNPROVIDED) {
            elmt = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = $sym133$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        {
            SubLObject result = literals.first();
            SubLObject cdolist_list_var = literals.rest();
            SubLObject other_formula = NIL;
            for (other_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_formula = cdolist_list_var.first()) {
                other_formula = varmap_uniquify_source_vars(other_formula, result);
                {
                    SubLObject varmap = varmap_attempt_to_combine_variables(other_formula, result, elmt, varP, free_variables_onlyP);
                    result = analysis_diagram_tool_widgets.join_formulas_along_variable_mappings(other_formula, result, varmap, UNPROVIDED);
                }
            }
            return result;
        }
    }

    /**
     * Call JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS multiple times to combine the provided literals, using VARMAP-ATTEMPT-TO-COMBINE-VARIABLES to get the variable mapping and UNIQUIFY-VARIABLES-ACROSS-TWO-SENTENCES to ensure no accidental variable collisions.
     */
    @LispMethod(comment = "Call JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS multiple times to combine the provided literals, using VARMAP-ATTEMPT-TO-COMBINE-VARIABLES to get the variable mapping and UNIQUIFY-VARIABLES-ACROSS-TWO-SENTENCES to ensure no accidental variable collisions.")
    public static SubLObject varmap_autocombine_literals(final SubLObject literals, SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (elmt == UNPROVIDED) {
            elmt = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = $sym146$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        SubLObject result = literals.first();
        SubLObject cdolist_list_var = literals.rest();
        SubLObject other_formula = NIL;
        other_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            other_formula = varmap_uniquify_source_vars(other_formula, result);
            final SubLObject varmap = varmap_attempt_to_combine_variables(other_formula, result, elmt, varP, free_variables_onlyP);
            result = analysis_diagram_tool_widgets.join_formulas_along_variable_mappings(other_formula, result, varmap, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            other_formula = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject varmap_uniquify_source_vars_alt(SubLObject source_formula, SubLObject target_formula) {
        {
            SubLObject source_vars = list_utilities.tree_find_all_if($sym133$CYC_VAR_, source_formula, UNPROVIDED);
            SubLObject target_vars = list_utilities.tree_find_all_if($sym133$CYC_VAR_, target_formula, UNPROVIDED);
            SubLObject used_vars = target_vars;
            SubLObject mapping = NIL;
            SubLObject cdolist_list_var = source_vars;
            SubLObject source_var = NIL;
            for (source_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , source_var = cdolist_list_var.first()) {
                if (NIL != subl_promotions.memberP(source_var, used_vars, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject current_source_vars = list_utilities.tree_find_all_if($sym133$CYC_VAR_, source_formula, UNPROVIDED);
                        SubLObject new_var = varmap_unique_el_var_wrt_vars(source_var, cconcatenate(current_source_vars, used_vars));
                        source_formula = list_utilities.tree_substitute(source_formula, source_var, new_var);
                        mapping = cons(cons(source_var, new_var), mapping);
                        used_vars = cons(new_var, used_vars);
                    }
                }
            }
            return values(source_formula, mapping);
        }
    }

    public static SubLObject varmap_uniquify_source_vars(SubLObject source_formula, final SubLObject target_formula) {
        final SubLObject source_vars = list_utilities.tree_find_all_if($sym146$CYC_VAR_, source_formula, UNPROVIDED);
        SubLObject used_vars;
        final SubLObject target_vars = used_vars = list_utilities.tree_find_all_if($sym146$CYC_VAR_, target_formula, UNPROVIDED);
        SubLObject mapping = NIL;
        SubLObject cdolist_list_var = source_vars;
        SubLObject source_var = NIL;
        source_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(source_var, used_vars, UNPROVIDED, UNPROVIDED)) {
                final SubLObject current_source_vars = list_utilities.tree_find_all_if($sym146$CYC_VAR_, source_formula, UNPROVIDED);
                final SubLObject new_var = varmap_unique_el_var_wrt_vars(source_var, cconcatenate(current_source_vars, used_vars));
                source_formula = list_utilities.tree_substitute(source_formula, source_var, new_var);
                mapping = cons(cons(source_var, new_var), mapping);
                used_vars = cons(new_var, used_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            source_var = cdolist_list_var.first();
        } 
        return values(source_formula, mapping);
    }

    /**
     * Checks if ORIGINAL-VAR is unique compared to all variables in KNOWN-VARS.  If
     * it is, returns it, otherwise computes a unique variable using ORIGINAL-VAR
     * and KNOWN-VARS, and returns the new variable.
     *
     * @param ORIGINAL-VAR
    cyc-var?
     * 		
     * @param KNOWN-VARS
     * 		listp; of cyc-var?
     * @return cyc-var?
     */
    @LispMethod(comment = "Checks if ORIGINAL-VAR is unique compared to all variables in KNOWN-VARS.  If\r\nit is, returns it, otherwise computes a unique variable using ORIGINAL-VAR\r\nand KNOWN-VARS, and returns the new variable.\r\n\r\n@param ORIGINAL-VAR\ncyc-var?\r\n\t\t\r\n@param KNOWN-VARS\r\n\t\tlistp; of cyc-var?\r\n@return cyc-var?\nChecks if ORIGINAL-VAR is unique compared to all variables in KNOWN-VARS.  If\nit is, returns it, otherwise computes a unique variable using ORIGINAL-VAR\nand KNOWN-VARS, and returns the new variable.")
    public static final SubLObject varmap_unique_el_var_wrt_vars_alt(SubLObject original_var, SubLObject known_vars) {
        {
            SubLObject result_var = original_var;
            while (NIL != subl_promotions.memberP(result_var, known_vars, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject result_var_str = string_utilities.to_string(result_var);
                    if (NIL != string_utilities.ends_with_number_p(result_var_str)) {
                        {
                            SubLObject var_num = string_utilities.ends_with_number(result_var_str);
                            SubLObject next_num = number_utilities.f_1X(var_num);
                            result_var = cycl_variables.make_el_var(string_utilities.string_subst(string_utilities.str(next_num), string_utilities.str(var_num), result_var_str, UNPROVIDED));
                        }
                    } else {
                        result_var = next_named_var(known_vars, original_var);
                    }
                }
            } 
            return result_var;
        }
    }

    /**
     * Checks if ORIGINAL-VAR is unique compared to all variables in KNOWN-VARS.  If
     * it is, returns it, otherwise computes a unique variable using ORIGINAL-VAR
     * and KNOWN-VARS, and returns the new variable.
     *
     * @param ORIGINAL-VAR
    		cyc-var?
     * 		
     * @param KNOWN-VARS
     * 		listp; of cyc-var?
     * @return cyc-var?
     */
    @LispMethod(comment = "Checks if ORIGINAL-VAR is unique compared to all variables in KNOWN-VARS.  If\r\nit is, returns it, otherwise computes a unique variable using ORIGINAL-VAR\r\nand KNOWN-VARS, and returns the new variable.\r\n\r\n@param ORIGINAL-VAR\n\t\tcyc-var?\r\n\t\t\r\n@param KNOWN-VARS\r\n\t\tlistp; of cyc-var?\r\n@return cyc-var?\nChecks if ORIGINAL-VAR is unique compared to all variables in KNOWN-VARS.  If\nit is, returns it, otherwise computes a unique variable using ORIGINAL-VAR\nand KNOWN-VARS, and returns the new variable.")
    public static SubLObject varmap_unique_el_var_wrt_vars(final SubLObject original_var, final SubLObject known_vars) {
        SubLObject result_var = original_var;
        while (NIL != subl_promotions.memberP(result_var, known_vars, UNPROVIDED, UNPROVIDED)) {
            final SubLObject result_var_str = string_utilities.to_string(result_var);
            if (NIL != string_utilities.ends_with_number_p(result_var_str)) {
                final SubLObject var_num = string_utilities.ends_with_number(result_var_str);
                final SubLObject next_num = number_utilities.f_1X(var_num);
                result_var = cycl_variables.make_el_var(string_utilities.string_subst(string_utilities.str(next_num), string_utilities.str(var_num), result_var_str, UNPROVIDED));
            } else {
                result_var = next_named_var(known_vars, original_var);
            }
        } 
        return result_var;
    }

    /**
     * An implementation on the SubL-side of that Java framework's com.cyc.framework.ui.ql.combine.CombineWorker2.attemptToCombineVariables()
     */
    @LispMethod(comment = "An implementation on the SubL-side of that Java framework\'s com.cyc.framework.ui.ql.combine.CombineWorker2.attemptToCombineVariables()")
    public static final SubLObject varmap_attempt_to_combine_variables_alt(SubLObject source_formula, SubLObject target_formula, SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym133$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        SubLTrampolineFile.checkType(varP, FUNCTION_SPEC_P);
        {
            SubLObject varmap = get_variable_mapping_table_for_formulas(source_formula, target_formula, elmt, varP, free_variables_onlyP);
            SubLObject incompatibles = variable_mapping_table_incompatibles(varmap);
            SubLObject source_vars = variable_mapping_table_source_variables(varmap);
            SubLObject target_vars = variable_mapping_table_target_variables(varmap);
            SubLObject hit_count = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
            SubLObject matches = NIL;
            SubLObject result = NIL;
            {
                SubLObject cdolist_list_var = source_vars;
                SubLObject source_var_i = NIL;
                for (source_var_i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , source_var_i = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_78 = target_vars;
                        SubLObject target_var_j = NIL;
                        for (target_var_j = cdolist_list_var_78.first(); NIL != cdolist_list_var_78; cdolist_list_var_78 = cdolist_list_var_78.rest() , target_var_j = cdolist_list_var_78.first()) {
                            {
                                SubLObject incomp = dictionary.dictionary_lookup(incompatibles, source_var_i, UNPROVIDED);
                                if ((NIL != funcall(varP, source_var_i)) && (NIL != funcall(varP, target_var_j))) {
                                    {
                                        SubLObject possibleP = T;
                                        if (NIL != incomp) {
                                            if (NIL != subl_promotions.memberP(target_var_j, incomp, UNPROVIDED, UNPROVIDED)) {
                                                possibleP = NIL;
                                            }
                                        }
                                        if (NIL != possibleP) {
                                            matches = cons(list(source_var_i, target_var_j), matches);
                                            hash_table_utilities.cinc_hash(source_var_i, hit_count, UNPROVIDED, UNPROVIDED);
                                            hash_table_utilities.cinc_hash(target_var_j, hit_count, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = matches;
                SubLObject match = NIL;
                for (match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , match = cdolist_list_var.first()) {
                    {
                        SubLObject var1 = match.first();
                        SubLObject var2 = second(match);
                        SubLObject var1_count = gethash(var1, hit_count, UNPROVIDED);
                        SubLObject var2_count = gethash(var2, hit_count, UNPROVIDED);
                        if (((var1_count.isInteger() && var2_count.isInteger()) && var1_count.numE(ONE_INTEGER)) && var2_count.numE(ONE_INTEGER)) {
                            result = cons(match, result);
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     * An implementation on the SubL-side of that Java framework's com.cyc.framework.ui.ql.combine.CombineWorker2.attemptToCombineVariables()
     */
    @LispMethod(comment = "An implementation on the SubL-side of that Java framework\'s com.cyc.framework.ui.ql.combine.CombineWorker2.attemptToCombineVariables()")
    public static SubLObject varmap_attempt_to_combine_variables(final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym146$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        assert NIL != function_spec_p(varP) : "! function_spec_p(varP) " + ("Types.function_spec_p(varP) " + "CommonSymbols.NIL != Types.function_spec_p(varP) ") + varP;
        final SubLObject varmap = get_variable_mapping_table_for_formulas(source_formula, target_formula, elmt, varP, free_variables_onlyP);
        final SubLObject incompatibles = variable_mapping_table_incompatibles(varmap);
        final SubLObject source_vars = variable_mapping_table_source_variables(varmap);
        final SubLObject target_vars = variable_mapping_table_target_variables(varmap);
        final SubLObject hit_count = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject matches = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = source_vars;
        SubLObject source_var_i = NIL;
        source_var_i = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$146 = target_vars;
            SubLObject target_var_j = NIL;
            target_var_j = cdolist_list_var_$146.first();
            while (NIL != cdolist_list_var_$146) {
                final SubLObject incomp = dictionary.dictionary_lookup(incompatibles, source_var_i, UNPROVIDED);
                if ((NIL != funcall(varP, source_var_i)) && (NIL != funcall(varP, target_var_j))) {
                    SubLObject possibleP = T;
                    if ((NIL != incomp) && (NIL != subl_promotions.memberP(target_var_j, incomp, UNPROVIDED, UNPROVIDED))) {
                        possibleP = NIL;
                    }
                    if (NIL != possibleP) {
                        matches = cons(list(source_var_i, target_var_j), matches);
                        hash_table_utilities.cinc_hash(source_var_i, hit_count, UNPROVIDED, UNPROVIDED);
                        hash_table_utilities.cinc_hash(target_var_j, hit_count, UNPROVIDED, UNPROVIDED);
                    }
                }
                cdolist_list_var_$146 = cdolist_list_var_$146.rest();
                target_var_j = cdolist_list_var_$146.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            source_var_i = cdolist_list_var.first();
        } 
        cdolist_list_var = matches;
        SubLObject match = NIL;
        match = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var1 = match.first();
            final SubLObject var2 = second(match);
            final SubLObject var1_count = gethash(var1, hit_count, UNPROVIDED);
            final SubLObject var2_count = gethash(var2, hit_count, UNPROVIDED);
            if (((var1_count.isInteger() && var2_count.isInteger()) && var1_count.numE(ONE_INTEGER)) && var2_count.numE(ONE_INTEGER)) {
                result = cons(match, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            match = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject declare_value_tables_file_alt() {
        declareFunction("value_table_column_print_function_trampoline", "VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("value_table_column_p", "VALUE-TABLE-COLUMN-P", 1, 0, false);
        new com.cyc.cycjava.cycl.value_tables.$value_table_column_p$UnaryFunction();
        declareFunction("value_table_column_query", "VALUE-TABLE-COLUMN-QUERY", 1, 0, false);
        declareFunction("value_table_column_label", "VALUE-TABLE-COLUMN-LABEL", 1, 0, false);
        declareFunction("value_table_column_values", "VALUE-TABLE-COLUMN-VALUES", 1, 0, false);
        declareFunction("_csetf_value_table_column_query", "_CSETF-VALUE-TABLE-COLUMN-QUERY", 2, 0, false);
        declareFunction("_csetf_value_table_column_label", "_CSETF-VALUE-TABLE-COLUMN-LABEL", 2, 0, false);
        declareFunction("_csetf_value_table_column_values", "_CSETF-VALUE-TABLE-COLUMN-VALUES", 2, 0, false);
        declareFunction("make_value_table_column", "MAKE-VALUE-TABLE-COLUMN", 0, 1, false);
        declareFunction("print_value_table_column", "PRINT-VALUE-TABLE-COLUMN", 3, 0, false);
        declareFunction("new_value_table_column", "NEW-VALUE-TABLE-COLUMN", 1, 0, false);
        declareFunction("load_value_table_column_from_kb", "LOAD-VALUE-TABLE-COLUMN-FROM-KB", 3, 0, false);
        declareFunction("xml_serialize_value_table_column", "XML-SERIALIZE-VALUE-TABLE-COLUMN", 1, 1, false);
        declareFunction("get_vtbl_query_result_values", "GET-VTBL-QUERY-RESULT-VALUES", 3, 0, false);
        declareFunction("get_vtbl_query_result_sets", "GET-VTBL-QUERY-RESULT-SETS", 3, 0, false);
        declareFunction("value_table_print_function_trampoline", "VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("value_table_p", "VALUE-TABLE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.value_tables.$value_table_p$UnaryFunction();
        declareFunction("value_table_id", "VALUE-TABLE-ID", 1, 0, false);
        declareFunction("value_table_label", "VALUE-TABLE-LABEL", 1, 0, false);
        declareFunction("value_table_input_columns", "VALUE-TABLE-INPUT-COLUMNS", 1, 0, false);
        declareFunction("value_table_output_column", "VALUE-TABLE-OUTPUT-COLUMN", 1, 0, false);
        declareFunction("value_table_assignments", "VALUE-TABLE-ASSIGNMENTS", 1, 0, false);
        declareFunction("_csetf_value_table_id", "_CSETF-VALUE-TABLE-ID", 2, 0, false);
        declareFunction("_csetf_value_table_label", "_CSETF-VALUE-TABLE-LABEL", 2, 0, false);
        declareFunction("_csetf_value_table_input_columns", "_CSETF-VALUE-TABLE-INPUT-COLUMNS", 2, 0, false);
        declareFunction("_csetf_value_table_output_column", "_CSETF-VALUE-TABLE-OUTPUT-COLUMN", 2, 0, false);
        declareFunction("_csetf_value_table_assignments", "_CSETF-VALUE-TABLE-ASSIGNMENTS", 2, 0, false);
        declareFunction("make_value_table", "MAKE-VALUE-TABLE", 0, 1, false);
        declareFunction("print_value_table", "PRINT-VALUE-TABLE", 3, 0, false);
        declareFunction("new_value_table", "NEW-VALUE-TABLE", 1, 0, false);
        declareFunction("load_value_table_from_kb", "LOAD-VALUE-TABLE-FROM-KB", 2, 0, false);
        declareFunction("xml_serialize_value_table", "XML-SERIALIZE-VALUE-TABLE", 1, 1, false);
        declareFunction("get_vtbl_input_queries", "GET-VTBL-INPUT-QUERIES", 2, 0, false);
        declareFunction("get_vtbl_output_query", "GET-VTBL-OUTPUT-QUERY", 2, 0, false);
        declareFunction("load_value_table_assignments_from_kb", "LOAD-VALUE-TABLE-ASSIGNMENTS-FROM-KB", 2, 0, false);
        declareFunction("variable_mapping_table_print_function_trampoline", "VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("variable_mapping_table_p", "VARIABLE-MAPPING-TABLE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.value_tables.$variable_mapping_table_p$UnaryFunction();
        declareFunction("variable_mapping_table_id", "VARIABLE-MAPPING-TABLE-ID", 1, 0, false);
        declareFunction("variable_mapping_table_source_query", "VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 1, 0, false);
        declareFunction("variable_mapping_table_target_query", "VARIABLE-MAPPING-TABLE-TARGET-QUERY", 1, 0, false);
        declareFunction("variable_mapping_table_source_variables", "VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 1, 0, false);
        declareFunction("variable_mapping_table_target_variables", "VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 1, 0, false);
        declareFunction("variable_mapping_table_incompatibles", "VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 1, 0, false);
        declareFunction("variable_mapping_table_assignments", "VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 1, 0, false);
        declareFunction("_csetf_variable_mapping_table_id", "_CSETF-VARIABLE-MAPPING-TABLE-ID", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_source_query", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_target_query", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_source_variables", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_target_variables", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_incompatibles", "_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_assignments", "_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 2, 0, false);
        declareFunction("make_variable_mapping_table", "MAKE-VARIABLE-MAPPING-TABLE", 0, 1, false);
        declareFunction("print_varmap_table", "PRINT-VARMAP-TABLE", 3, 0, false);
        declareFunction("xml_serialize_variable_mapping_table", "XML-SERIALIZE-VARIABLE-MAPPING-TABLE", 1, 1, false);
        declareFunction("new_variable_mapping_table", "NEW-VARIABLE-MAPPING-TABLE", 1, 0, false);
        declareFunction("load_variable_mapping_table_from_kb", "LOAD-VARIABLE-MAPPING-TABLE-FROM-KB", 2, 2, false);
        declareFunction("get_variable_mapping_table_for_formulas", "GET-VARIABLE-MAPPING-TABLE-FOR-FORMULAS", 3, 2, false);
        declareFunction("varmaptbl_assign_queries", "VARMAPTBL-ASSIGN-QUERIES", 4, 0, false);
        declareFunction("varmaptbl_load_source_query_information", "VARMAPTBL-LOAD-SOURCE-QUERY-INFORMATION", 2, 0, false);
        declareFunction("varmaptbl_load_target_query_information", "VARMAPTBL-LOAD-TARGET-QUERY-INFORMATION", 2, 0, false);
        declareFunction("varmaptbl_assign_variable_information", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION", 2, 0, false);
        declareFunction("varmaptbl_assign_variable_information_from_formulas", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION-FROM-FORMULAS", 4, 2, false);
        declareFunction("any_disjoint_with_anyP_memoized_internal", "ANY-DISJOINT-WITH-ANY?-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("any_disjoint_with_anyP_memoized", "ANY-DISJOINT-WITH-ANY?-MEMOIZED", 3, 0, false);
        declareFunction("varmaptbl_store_variable_information", "VARMAPTBL-STORE-VARIABLE-INFORMATION", 4, 0, false);
        declareFunction("varmaptbl_load_query_variable_information", "VARMAPTBL-LOAD-QUERY-VARIABLE-INFORMATION", 2, 0, false);
        declareFunction("varmaptbl_assign_current_assignments", "VARMAPTBL-ASSIGN-CURRENT-ASSIGNMENTS", 2, 0, false);
        declareFunction("varmaptbl_load_current_assignments", "VARMAPTBL-LOAD-CURRENT-ASSIGNMENTS", 4, 0, false);
        declareFunction("varmap_autocombine_literals", "VARMAP-AUTOCOMBINE-LITERALS", 1, 3, false);
        declareFunction("varmap_uniquify_source_vars", "VARMAP-UNIQUIFY-SOURCE-VARS", 2, 0, false);
        declareFunction("varmap_unique_el_var_wrt_vars", "VARMAP-UNIQUE-EL-VAR-WRT-VARS", 2, 0, false);
        declareFunction("varmap_attempt_to_combine_variables", "VARMAP-ATTEMPT-TO-COMBINE-VARIABLES", 3, 2, false);
        return NIL;
    }

    public static SubLObject declare_value_tables_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("value_table_column_print_function_trampoline", "VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("value_table_column_p", "VALUE-TABLE-COLUMN-P", 1, 0, false);
            new value_tables.$value_table_column_p$UnaryFunction();
            declareFunction("value_table_column_query", "VALUE-TABLE-COLUMN-QUERY", 1, 0, false);
            declareFunction("value_table_column_label", "VALUE-TABLE-COLUMN-LABEL", 1, 0, false);
            declareFunction("value_table_column_values", "VALUE-TABLE-COLUMN-VALUES", 1, 0, false);
            declareFunction("_csetf_value_table_column_query", "_CSETF-VALUE-TABLE-COLUMN-QUERY", 2, 0, false);
            declareFunction("_csetf_value_table_column_label", "_CSETF-VALUE-TABLE-COLUMN-LABEL", 2, 0, false);
            declareFunction("_csetf_value_table_column_values", "_CSETF-VALUE-TABLE-COLUMN-VALUES", 2, 0, false);
            declareFunction("make_value_table_column", "MAKE-VALUE-TABLE-COLUMN", 0, 1, false);
            declareFunction("visit_defstruct_value_table_column", "VISIT-DEFSTRUCT-VALUE-TABLE-COLUMN", 2, 0, false);
            declareFunction("visit_defstruct_object_value_table_column_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-COLUMN-METHOD", 2, 0, false);
            declareFunction("print_value_table_column", "PRINT-VALUE-TABLE-COLUMN", 3, 0, false);
            declareFunction("new_value_table_column", "NEW-VALUE-TABLE-COLUMN", 1, 0, false);
            declareFunction("load_value_table_column_from_kb", "LOAD-VALUE-TABLE-COLUMN-FROM-KB", 3, 0, false);
            declareFunction("xml_serialize_value_table_column", "XML-SERIALIZE-VALUE-TABLE-COLUMN", 1, 1, false);
            declareFunction("get_vtbl_query_result_values", "GET-VTBL-QUERY-RESULT-VALUES", 3, 0, false);
            declareFunction("get_vtbl_query_result_sets", "GET-VTBL-QUERY-RESULT-SETS", 3, 0, false);
            declareFunction("value_table_print_function_trampoline", "VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("value_table_p", "VALUE-TABLE-P", 1, 0, false);
            new value_tables.$value_table_p$UnaryFunction();
            declareFunction("value_table_id", "VALUE-TABLE-ID", 1, 0, false);
            declareFunction("value_table_label", "VALUE-TABLE-LABEL", 1, 0, false);
            declareFunction("value_table_input_columns", "VALUE-TABLE-INPUT-COLUMNS", 1, 0, false);
            declareFunction("value_table_output_column", "VALUE-TABLE-OUTPUT-COLUMN", 1, 0, false);
            declareFunction("value_table_assignments", "VALUE-TABLE-ASSIGNMENTS", 1, 0, false);
            declareFunction("_csetf_value_table_id", "_CSETF-VALUE-TABLE-ID", 2, 0, false);
            declareFunction("_csetf_value_table_label", "_CSETF-VALUE-TABLE-LABEL", 2, 0, false);
            declareFunction("_csetf_value_table_input_columns", "_CSETF-VALUE-TABLE-INPUT-COLUMNS", 2, 0, false);
            declareFunction("_csetf_value_table_output_column", "_CSETF-VALUE-TABLE-OUTPUT-COLUMN", 2, 0, false);
            declareFunction("_csetf_value_table_assignments", "_CSETF-VALUE-TABLE-ASSIGNMENTS", 2, 0, false);
            declareFunction("make_value_table", "MAKE-VALUE-TABLE", 0, 1, false);
            declareFunction("visit_defstruct_value_table", "VISIT-DEFSTRUCT-VALUE-TABLE", 2, 0, false);
            declareFunction("visit_defstruct_object_value_table_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-METHOD", 2, 0, false);
            declareFunction("print_value_table", "PRINT-VALUE-TABLE", 3, 0, false);
            declareFunction("new_value_table", "NEW-VALUE-TABLE", 1, 0, false);
            declareFunction("load_value_table_from_kb", "LOAD-VALUE-TABLE-FROM-KB", 2, 0, false);
            declareFunction("xml_serialize_value_table", "XML-SERIALIZE-VALUE-TABLE", 1, 1, false);
            declareFunction("get_vtbl_input_queries", "GET-VTBL-INPUT-QUERIES", 2, 0, false);
            declareFunction("get_vtbl_output_query", "GET-VTBL-OUTPUT-QUERY", 2, 0, false);
            declareFunction("load_value_table_assignments_from_kb", "LOAD-VALUE-TABLE-ASSIGNMENTS-FROM-KB", 2, 0, false);
            declareFunction("variable_mapping_table_print_function_trampoline", "VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("variable_mapping_table_p", "VARIABLE-MAPPING-TABLE-P", 1, 0, false);
            new value_tables.$variable_mapping_table_p$UnaryFunction();
            declareFunction("variable_mapping_table_id", "VARIABLE-MAPPING-TABLE-ID", 1, 0, false);
            declareFunction("variable_mapping_table_source_query", "VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 1, 0, false);
            declareFunction("variable_mapping_table_target_query", "VARIABLE-MAPPING-TABLE-TARGET-QUERY", 1, 0, false);
            declareFunction("variable_mapping_table_source_variables", "VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 1, 0, false);
            declareFunction("variable_mapping_table_target_variables", "VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 1, 0, false);
            declareFunction("variable_mapping_table_incompatibles", "VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 1, 0, false);
            declareFunction("variable_mapping_table_assignments", "VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 1, 0, false);
            declareFunction("_csetf_variable_mapping_table_id", "_CSETF-VARIABLE-MAPPING-TABLE-ID", 2, 0, false);
            declareFunction("_csetf_variable_mapping_table_source_query", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 2, 0, false);
            declareFunction("_csetf_variable_mapping_table_target_query", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY", 2, 0, false);
            declareFunction("_csetf_variable_mapping_table_source_variables", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 2, 0, false);
            declareFunction("_csetf_variable_mapping_table_target_variables", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 2, 0, false);
            declareFunction("_csetf_variable_mapping_table_incompatibles", "_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 2, 0, false);
            declareFunction("_csetf_variable_mapping_table_assignments", "_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 2, 0, false);
            declareFunction("make_variable_mapping_table", "MAKE-VARIABLE-MAPPING-TABLE", 0, 1, false);
            declareFunction("visit_defstruct_variable_mapping_table", "VISIT-DEFSTRUCT-VARIABLE-MAPPING-TABLE", 2, 0, false);
            declareFunction("visit_defstruct_object_variable_mapping_table_method", "VISIT-DEFSTRUCT-OBJECT-VARIABLE-MAPPING-TABLE-METHOD", 2, 0, false);
            declareFunction("print_varmap_table", "PRINT-VARMAP-TABLE", 3, 0, false);
            declareFunction("xml_serialize_variable_mapping_table", "XML-SERIALIZE-VARIABLE-MAPPING-TABLE", 1, 1, false);
            declareFunction("new_variable_mapping_table", "NEW-VARIABLE-MAPPING-TABLE", 1, 0, false);
            declareFunction("load_variable_mapping_table_from_kb", "LOAD-VARIABLE-MAPPING-TABLE-FROM-KB", 2, 2, false);
            declareFunction("get_variable_mapping_table_for_formulas", "GET-VARIABLE-MAPPING-TABLE-FOR-FORMULAS", 3, 2, false);
            declareFunction("varmaptbl_assign_queries", "VARMAPTBL-ASSIGN-QUERIES", 4, 0, false);
            declareFunction("varmaptbl_load_source_query_information", "VARMAPTBL-LOAD-SOURCE-QUERY-INFORMATION", 2, 0, false);
            declareFunction("varmaptbl_load_target_query_information", "VARMAPTBL-LOAD-TARGET-QUERY-INFORMATION", 2, 0, false);
            declareFunction("varmaptbl_assign_variable_information", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION", 2, 0, false);
            declareFunction("varmaptbl_assign_variable_information_from_formulas", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION-FROM-FORMULAS", 4, 2, false);
            declareFunction("varmaptbl_store_variable_information", "VARMAPTBL-STORE-VARIABLE-INFORMATION", 4, 0, false);
            declareFunction("varmaptbl_load_query_variable_information", "VARMAPTBL-LOAD-QUERY-VARIABLE-INFORMATION", 2, 0, false);
            declareFunction("varmaptbl_assign_current_assignments", "VARMAPTBL-ASSIGN-CURRENT-ASSIGNMENTS", 2, 0, false);
            declareFunction("varmaptbl_load_current_assignments", "VARMAPTBL-LOAD-CURRENT-ASSIGNMENTS", 4, 0, false);
            declareFunction("varmap_autocombine_literals", "VARMAP-AUTOCOMBINE-LITERALS", 1, 3, false);
            declareFunction("varmap_uniquify_source_vars", "VARMAP-UNIQUIFY-SOURCE-VARS", 2, 0, false);
            declareFunction("varmap_unique_el_var_wrt_vars", "VARMAP-UNIQUE-EL-VAR-WRT-VARS", 2, 0, false);
            declareFunction("varmap_attempt_to_combine_variables", "VARMAP-ATTEMPT-TO-COMBINE-VARIABLES", 3, 2, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("any_disjoint_with_anyP_memoized_internal", "ANY-DISJOINT-WITH-ANY?-MEMOIZED-INTERNAL", 3, 0, false);
            declareFunction("any_disjoint_with_anyP_memoized", "ANY-DISJOINT-WITH-ANY?-MEMOIZED", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_value_tables_file_Previous() {
        declareFunction("value_table_column_print_function_trampoline", "VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("value_table_column_p", "VALUE-TABLE-COLUMN-P", 1, 0, false);
        new value_tables.$value_table_column_p$UnaryFunction();
        declareFunction("value_table_column_query", "VALUE-TABLE-COLUMN-QUERY", 1, 0, false);
        declareFunction("value_table_column_label", "VALUE-TABLE-COLUMN-LABEL", 1, 0, false);
        declareFunction("value_table_column_values", "VALUE-TABLE-COLUMN-VALUES", 1, 0, false);
        declareFunction("_csetf_value_table_column_query", "_CSETF-VALUE-TABLE-COLUMN-QUERY", 2, 0, false);
        declareFunction("_csetf_value_table_column_label", "_CSETF-VALUE-TABLE-COLUMN-LABEL", 2, 0, false);
        declareFunction("_csetf_value_table_column_values", "_CSETF-VALUE-TABLE-COLUMN-VALUES", 2, 0, false);
        declareFunction("make_value_table_column", "MAKE-VALUE-TABLE-COLUMN", 0, 1, false);
        declareFunction("visit_defstruct_value_table_column", "VISIT-DEFSTRUCT-VALUE-TABLE-COLUMN", 2, 0, false);
        declareFunction("visit_defstruct_object_value_table_column_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-COLUMN-METHOD", 2, 0, false);
        declareFunction("print_value_table_column", "PRINT-VALUE-TABLE-COLUMN", 3, 0, false);
        declareFunction("new_value_table_column", "NEW-VALUE-TABLE-COLUMN", 1, 0, false);
        declareFunction("load_value_table_column_from_kb", "LOAD-VALUE-TABLE-COLUMN-FROM-KB", 3, 0, false);
        declareFunction("xml_serialize_value_table_column", "XML-SERIALIZE-VALUE-TABLE-COLUMN", 1, 1, false);
        declareFunction("get_vtbl_query_result_values", "GET-VTBL-QUERY-RESULT-VALUES", 3, 0, false);
        declareFunction("get_vtbl_query_result_sets", "GET-VTBL-QUERY-RESULT-SETS", 3, 0, false);
        declareFunction("value_table_print_function_trampoline", "VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("value_table_p", "VALUE-TABLE-P", 1, 0, false);
        new value_tables.$value_table_p$UnaryFunction();
        declareFunction("value_table_id", "VALUE-TABLE-ID", 1, 0, false);
        declareFunction("value_table_label", "VALUE-TABLE-LABEL", 1, 0, false);
        declareFunction("value_table_input_columns", "VALUE-TABLE-INPUT-COLUMNS", 1, 0, false);
        declareFunction("value_table_output_column", "VALUE-TABLE-OUTPUT-COLUMN", 1, 0, false);
        declareFunction("value_table_assignments", "VALUE-TABLE-ASSIGNMENTS", 1, 0, false);
        declareFunction("_csetf_value_table_id", "_CSETF-VALUE-TABLE-ID", 2, 0, false);
        declareFunction("_csetf_value_table_label", "_CSETF-VALUE-TABLE-LABEL", 2, 0, false);
        declareFunction("_csetf_value_table_input_columns", "_CSETF-VALUE-TABLE-INPUT-COLUMNS", 2, 0, false);
        declareFunction("_csetf_value_table_output_column", "_CSETF-VALUE-TABLE-OUTPUT-COLUMN", 2, 0, false);
        declareFunction("_csetf_value_table_assignments", "_CSETF-VALUE-TABLE-ASSIGNMENTS", 2, 0, false);
        declareFunction("make_value_table", "MAKE-VALUE-TABLE", 0, 1, false);
        declareFunction("visit_defstruct_value_table", "VISIT-DEFSTRUCT-VALUE-TABLE", 2, 0, false);
        declareFunction("visit_defstruct_object_value_table_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-METHOD", 2, 0, false);
        declareFunction("print_value_table", "PRINT-VALUE-TABLE", 3, 0, false);
        declareFunction("new_value_table", "NEW-VALUE-TABLE", 1, 0, false);
        declareFunction("load_value_table_from_kb", "LOAD-VALUE-TABLE-FROM-KB", 2, 0, false);
        declareFunction("xml_serialize_value_table", "XML-SERIALIZE-VALUE-TABLE", 1, 1, false);
        declareFunction("get_vtbl_input_queries", "GET-VTBL-INPUT-QUERIES", 2, 0, false);
        declareFunction("get_vtbl_output_query", "GET-VTBL-OUTPUT-QUERY", 2, 0, false);
        declareFunction("load_value_table_assignments_from_kb", "LOAD-VALUE-TABLE-ASSIGNMENTS-FROM-KB", 2, 0, false);
        declareFunction("variable_mapping_table_print_function_trampoline", "VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("variable_mapping_table_p", "VARIABLE-MAPPING-TABLE-P", 1, 0, false);
        new value_tables.$variable_mapping_table_p$UnaryFunction();
        declareFunction("variable_mapping_table_id", "VARIABLE-MAPPING-TABLE-ID", 1, 0, false);
        declareFunction("variable_mapping_table_source_query", "VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 1, 0, false);
        declareFunction("variable_mapping_table_target_query", "VARIABLE-MAPPING-TABLE-TARGET-QUERY", 1, 0, false);
        declareFunction("variable_mapping_table_source_variables", "VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 1, 0, false);
        declareFunction("variable_mapping_table_target_variables", "VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 1, 0, false);
        declareFunction("variable_mapping_table_incompatibles", "VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 1, 0, false);
        declareFunction("variable_mapping_table_assignments", "VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 1, 0, false);
        declareFunction("_csetf_variable_mapping_table_id", "_CSETF-VARIABLE-MAPPING-TABLE-ID", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_source_query", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_target_query", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_source_variables", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_target_variables", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_incompatibles", "_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 2, 0, false);
        declareFunction("_csetf_variable_mapping_table_assignments", "_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 2, 0, false);
        declareFunction("make_variable_mapping_table", "MAKE-VARIABLE-MAPPING-TABLE", 0, 1, false);
        declareFunction("visit_defstruct_variable_mapping_table", "VISIT-DEFSTRUCT-VARIABLE-MAPPING-TABLE", 2, 0, false);
        declareFunction("visit_defstruct_object_variable_mapping_table_method", "VISIT-DEFSTRUCT-OBJECT-VARIABLE-MAPPING-TABLE-METHOD", 2, 0, false);
        declareFunction("print_varmap_table", "PRINT-VARMAP-TABLE", 3, 0, false);
        declareFunction("xml_serialize_variable_mapping_table", "XML-SERIALIZE-VARIABLE-MAPPING-TABLE", 1, 1, false);
        declareFunction("new_variable_mapping_table", "NEW-VARIABLE-MAPPING-TABLE", 1, 0, false);
        declareFunction("load_variable_mapping_table_from_kb", "LOAD-VARIABLE-MAPPING-TABLE-FROM-KB", 2, 2, false);
        declareFunction("get_variable_mapping_table_for_formulas", "GET-VARIABLE-MAPPING-TABLE-FOR-FORMULAS", 3, 2, false);
        declareFunction("varmaptbl_assign_queries", "VARMAPTBL-ASSIGN-QUERIES", 4, 0, false);
        declareFunction("varmaptbl_load_source_query_information", "VARMAPTBL-LOAD-SOURCE-QUERY-INFORMATION", 2, 0, false);
        declareFunction("varmaptbl_load_target_query_information", "VARMAPTBL-LOAD-TARGET-QUERY-INFORMATION", 2, 0, false);
        declareFunction("varmaptbl_assign_variable_information", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION", 2, 0, false);
        declareFunction("varmaptbl_assign_variable_information_from_formulas", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION-FROM-FORMULAS", 4, 2, false);
        declareFunction("varmaptbl_store_variable_information", "VARMAPTBL-STORE-VARIABLE-INFORMATION", 4, 0, false);
        declareFunction("varmaptbl_load_query_variable_information", "VARMAPTBL-LOAD-QUERY-VARIABLE-INFORMATION", 2, 0, false);
        declareFunction("varmaptbl_assign_current_assignments", "VARMAPTBL-ASSIGN-CURRENT-ASSIGNMENTS", 2, 0, false);
        declareFunction("varmaptbl_load_current_assignments", "VARMAPTBL-LOAD-CURRENT-ASSIGNMENTS", 4, 0, false);
        declareFunction("varmap_autocombine_literals", "VARMAP-AUTOCOMBINE-LITERALS", 1, 3, false);
        declareFunction("varmap_uniquify_source_vars", "VARMAP-UNIQUIFY-SOURCE-VARS", 2, 0, false);
        declareFunction("varmap_unique_el_var_wrt_vars", "VARMAP-UNIQUE-EL-VAR-WRT-VARS", 2, 0, false);
        declareFunction("varmap_attempt_to_combine_variables", "VARMAP-ATTEMPT-TO-COMBINE-VARIABLES", 3, 2, false);
        return NIL;
    }

    public static SubLObject init_value_tables_file() {
        defconstant("*DTP-VALUE-TABLE-COLUMN*", VALUE_TABLE_COLUMN);
        defconstant("*DTP-VALUE-TABLE*", VALUE_TABLE);
        defconstant("*DTP-VARIABLE-MAPPING-TABLE*", VARIABLE_MAPPING_TABLE);
        return NIL;
    }

    public static final SubLObject setup_value_tables_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_value_table_column$.getGlobalValue(), symbol_function(VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(VALUE_TABLE_COLUMN_QUERY, _CSETF_VALUE_TABLE_COLUMN_QUERY);
        def_csetf(VALUE_TABLE_COLUMN_LABEL, _CSETF_VALUE_TABLE_COLUMN_LABEL);
        def_csetf(VALUE_TABLE_COLUMN_VALUES, _CSETF_VALUE_TABLE_COLUMN_VALUES);
        identity(VALUE_TABLE_COLUMN);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_value_table$.getGlobalValue(), symbol_function(VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(VALUE_TABLE_ID, _CSETF_VALUE_TABLE_ID);
        def_csetf(VALUE_TABLE_LABEL, _CSETF_VALUE_TABLE_LABEL);
        def_csetf(VALUE_TABLE_INPUT_COLUMNS, _CSETF_VALUE_TABLE_INPUT_COLUMNS);
        def_csetf(VALUE_TABLE_OUTPUT_COLUMN, _CSETF_VALUE_TABLE_OUTPUT_COLUMN);
        def_csetf(VALUE_TABLE_ASSIGNMENTS, _CSETF_VALUE_TABLE_ASSIGNMENTS);
        identity(VALUE_TABLE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_variable_mapping_table$.getGlobalValue(), symbol_function(VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(VARIABLE_MAPPING_TABLE_ID, _CSETF_VARIABLE_MAPPING_TABLE_ID);
        def_csetf(VARIABLE_MAPPING_TABLE_SOURCE_QUERY, _CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY);
        def_csetf(VARIABLE_MAPPING_TABLE_TARGET_QUERY, _CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY);
        def_csetf(VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES, _CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES);
        def_csetf(VARIABLE_MAPPING_TABLE_TARGET_VARIABLES, _CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES);
        def_csetf(VARIABLE_MAPPING_TABLE_INCOMPATIBLES, _CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES);
        def_csetf(VARIABLE_MAPPING_TABLE_ASSIGNMENTS, _CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS);
        identity(VARIABLE_MAPPING_TABLE);
        memoization_state.note_memoized_function($sym140$ANY_DISJOINT_WITH_ANY__MEMOIZED);
        register_external_symbol(VARMAP_UNIQUE_EL_VAR_WRT_VARS);
        return NIL;
    }

    public static SubLObject setup_value_tables_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_value_table_column$.getGlobalValue(), symbol_function(VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(VALUE_TABLE_COLUMN_QUERY, _CSETF_VALUE_TABLE_COLUMN_QUERY);
            def_csetf(VALUE_TABLE_COLUMN_LABEL, _CSETF_VALUE_TABLE_COLUMN_LABEL);
            def_csetf(VALUE_TABLE_COLUMN_VALUES, _CSETF_VALUE_TABLE_COLUMN_VALUES);
            identity(VALUE_TABLE_COLUMN);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_value_table_column$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_COLUMN_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_value_table$.getGlobalValue(), symbol_function(VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list45);
            def_csetf(VALUE_TABLE_ID, _CSETF_VALUE_TABLE_ID);
            def_csetf(VALUE_TABLE_LABEL, _CSETF_VALUE_TABLE_LABEL);
            def_csetf(VALUE_TABLE_INPUT_COLUMNS, _CSETF_VALUE_TABLE_INPUT_COLUMNS);
            def_csetf(VALUE_TABLE_OUTPUT_COLUMN, _CSETF_VALUE_TABLE_OUTPUT_COLUMN);
            def_csetf(VALUE_TABLE_ASSIGNMENTS, _CSETF_VALUE_TABLE_ASSIGNMENTS);
            identity(VALUE_TABLE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_value_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_variable_mapping_table$.getGlobalValue(), symbol_function(VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list101);
            def_csetf(VARIABLE_MAPPING_TABLE_ID, _CSETF_VARIABLE_MAPPING_TABLE_ID);
            def_csetf(VARIABLE_MAPPING_TABLE_SOURCE_QUERY, _CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY);
            def_csetf(VARIABLE_MAPPING_TABLE_TARGET_QUERY, _CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY);
            def_csetf(VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES, _CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES);
            def_csetf(VARIABLE_MAPPING_TABLE_TARGET_VARIABLES, _CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES);
            def_csetf(VARIABLE_MAPPING_TABLE_INCOMPATIBLES, _CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES);
            def_csetf(VARIABLE_MAPPING_TABLE_ASSIGNMENTS, _CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS);
            identity(VARIABLE_MAPPING_TABLE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_variable_mapping_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VARIABLE_MAPPING_TABLE_METHOD));
            register_external_symbol(VARMAP_UNIQUE_EL_VAR_WRT_VARS);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym140$ANY_DISJOINT_WITH_ANY__MEMOIZED);
        }
        return NIL;
    }

    public static SubLObject setup_value_tables_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_value_table_column$.getGlobalValue(), symbol_function(VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(VALUE_TABLE_COLUMN_QUERY, _CSETF_VALUE_TABLE_COLUMN_QUERY);
        def_csetf(VALUE_TABLE_COLUMN_LABEL, _CSETF_VALUE_TABLE_COLUMN_LABEL);
        def_csetf(VALUE_TABLE_COLUMN_VALUES, _CSETF_VALUE_TABLE_COLUMN_VALUES);
        identity(VALUE_TABLE_COLUMN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_value_table_column$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_COLUMN_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_value_table$.getGlobalValue(), symbol_function(VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list45);
        def_csetf(VALUE_TABLE_ID, _CSETF_VALUE_TABLE_ID);
        def_csetf(VALUE_TABLE_LABEL, _CSETF_VALUE_TABLE_LABEL);
        def_csetf(VALUE_TABLE_INPUT_COLUMNS, _CSETF_VALUE_TABLE_INPUT_COLUMNS);
        def_csetf(VALUE_TABLE_OUTPUT_COLUMN, _CSETF_VALUE_TABLE_OUTPUT_COLUMN);
        def_csetf(VALUE_TABLE_ASSIGNMENTS, _CSETF_VALUE_TABLE_ASSIGNMENTS);
        identity(VALUE_TABLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_value_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_variable_mapping_table$.getGlobalValue(), symbol_function(VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list101);
        def_csetf(VARIABLE_MAPPING_TABLE_ID, _CSETF_VARIABLE_MAPPING_TABLE_ID);
        def_csetf(VARIABLE_MAPPING_TABLE_SOURCE_QUERY, _CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY);
        def_csetf(VARIABLE_MAPPING_TABLE_TARGET_QUERY, _CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY);
        def_csetf(VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES, _CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES);
        def_csetf(VARIABLE_MAPPING_TABLE_TARGET_VARIABLES, _CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES);
        def_csetf(VARIABLE_MAPPING_TABLE_INCOMPATIBLES, _CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES);
        def_csetf(VARIABLE_MAPPING_TABLE_ASSIGNMENTS, _CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS);
        identity(VARIABLE_MAPPING_TABLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_variable_mapping_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VARIABLE_MAPPING_TABLE_METHOD));
        register_external_symbol(VARMAP_UNIQUE_EL_VAR_WRT_VARS);
        return NIL;
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
    }

    public static final class $value_table_column_native extends SubLStructNative {
        public SubLObject $query;

        public SubLObject $label;

        public SubLObject $values;

        private static final SubLStructDeclNative structDecl;

        public $value_table_column_native() {
            value_tables.$value_table_column_native.this.$query = Lisp.NIL;
            value_tables.$value_table_column_native.this.$label = Lisp.NIL;
            value_tables.$value_table_column_native.this.$values = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return value_tables.$value_table_column_native.this.$query;
        }

        @Override
        public SubLObject getField3() {
            return value_tables.$value_table_column_native.this.$label;
        }

        @Override
        public SubLObject getField4() {
            return value_tables.$value_table_column_native.this.$values;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return value_tables.$value_table_column_native.this.$query = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return value_tables.$value_table_column_native.this.$label = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return value_tables.$value_table_column_native.this.$values = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.value_tables.$value_table_column_native.class, VALUE_TABLE_COLUMN, VALUE_TABLE_COLUMN_P, $list2, $list3, new String[]{ "$query", "$label", "$values" }, $list4, $list5, PRINT_VALUE_TABLE_COLUMN);
        }
    }

    public static final class $value_table_column_p$UnaryFunction extends UnaryFunction {
        public $value_table_column_p$UnaryFunction() {
            super(extractFunctionNamed("VALUE-TABLE-COLUMN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return value_table_column_p(arg1);
        }
    }

    public static final class $value_table_p$UnaryFunction extends UnaryFunction {
        public $value_table_p$UnaryFunction() {
            super(extractFunctionNamed("VALUE-TABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return value_table_p(arg1);
        }
    }

    public static final class $variable_mapping_table_p$UnaryFunction extends UnaryFunction {
        public $variable_mapping_table_p$UnaryFunction() {
            super(extractFunctionNamed("VARIABLE-MAPPING-TABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return variable_mapping_table_p(arg1);
        }
    }
}

/**
 * Total time: 5098 ms
 */
