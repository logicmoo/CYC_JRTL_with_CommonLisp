package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.value_tables;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.value_tables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class value_tables extends SubLTranslatedFile {
    public static final SubLFile me = new value_tables();

    public static final String myName = "com.cyc.cycjava.cycl.value_tables";

    public static final String myFingerPrint = "afae5de018904beba3a485122de818d5f1e5f8dd69382ced87a797a79c3bc0f0";

    // defconstant
    public static final SubLSymbol $dtp_value_table_column$ = makeSymbol("*DTP-VALUE-TABLE-COLUMN*");

    // defconstant
    public static final SubLSymbol $dtp_value_table$ = makeSymbol("*DTP-VALUE-TABLE*");

    // defconstant
    public static final SubLSymbol $dtp_variable_mapping_table$ = makeSymbol("*DTP-VARIABLE-MAPPING-TABLE*");

    // Internal Constants
    public static final SubLSymbol VALUE_TABLE_COLUMN = makeSymbol("VALUE-TABLE-COLUMN");

    public static final SubLSymbol VALUE_TABLE_COLUMN_P = makeSymbol("VALUE-TABLE-COLUMN-P");

    public static final SubLList $list2 = list(makeSymbol("QUERY"), makeSymbol("LABEL"), makeSymbol("VALUES"));

    public static final SubLList $list3 = list(makeKeyword("QUERY"), makeKeyword("LABEL"), makeKeyword("VALUES"));

    public static final SubLList $list4 = list(makeSymbol("VALUE-TABLE-COLUMN-QUERY"), makeSymbol("VALUE-TABLE-COLUMN-LABEL"), makeSymbol("VALUE-TABLE-COLUMN-VALUES"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-VALUE-TABLE-COLUMN-QUERY"), makeSymbol("_CSETF-VALUE-TABLE-COLUMN-LABEL"), makeSymbol("_CSETF-VALUE-TABLE-COLUMN-VALUES"));

    public static final SubLSymbol PRINT_VALUE_TABLE_COLUMN = makeSymbol("PRINT-VALUE-TABLE-COLUMN");

    public static final SubLSymbol VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE");

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

    public static final SubLList $list33 = list(makeSymbol("THE-SET"), makeSymbol("EL-INFERENCE-BINDING"));

    public static final SubLList $list34 = list(makeSymbol("EL-INFBIND-FN"), makeSymbol("VARIABLE"), makeSymbol("RESULT-VALUE"));



    private static final SubLObject $$validQueryResultForTable = reader_make_constant_shell(makeString("validQueryResultForTable"));

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

    public static final SubLList $list76 = cons(makeSymbol("SOURCES"), makeSymbol("TARGETS"));

    private static final SubLString $$$valueTableAssignmentSources = makeString("valueTableAssignmentSources");

    private static final SubLString $$$valueTableAssignmentTuple = makeString("valueTableAssignmentTuple");

    private static final SubLList $list79 = list(makeSymbol("QUERY"), makeSymbol("VALUE"));

    private static final SubLString $$$valueTableAssignmentTargets = makeString("valueTableAssignmentTargets");



    private static final SubLObject $$valueTableSourceQueries = reader_make_constant_shell(makeString("valueTableSourceQueries"));

    private static final SubLList $list83 = list(makeKeyword("INPUT-QUERIES"));



    private static final SubLObject $$valueTableTargetQuery = reader_make_constant_shell(makeString("valueTableTargetQuery"));

    public static final SubLList $list86 = list(makeKeyword("OUTPUT-QUERY"));

    public static final SubLList $list87 = list(makeSymbol("?SOURCES"), makeSymbol("?TARGETS"));

    private static final SubLObject $$queryResultsCombineInTable = reader_make_constant_shell(makeString("queryResultsCombineInTable"));

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

    public static final SubLList $list144 = list(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VAR"));

    private static final SubLString $$$varMapTargetVariable = makeString("varMapTargetVariable");

    private static final SubLSymbol $sym146$CYC_VAR_ = makeSymbol("CYC-VAR?");



    private static final SubLObject $const148$variableMappingTableSourceFormula = reader_make_constant_shell(makeString("variableMappingTableSourceFormula-QuerySpec"));

    private static final SubLList $list149 = list(makeKeyword("SOURCE"));



    private static final SubLObject $const151$variableMappingTableTargetFormula = reader_make_constant_shell(makeString("variableMappingTableTargetFormula-QuerySpec"));

    private static final SubLList $list152 = list(makeKeyword("TARGET"));

    private static final SubLList $list153 = list(makeSymbol("SRC-ISAS"), makeSymbol("SRC-GENLS"), makeSymbol("SRC-QUOTED-ISAS"));

    private static final SubLList $list154 = list(makeSymbol("TRG-ISAS"), makeSymbol("TRG-GENLS"), makeSymbol("TRG-QUOTED-ISAS"));

    private static final SubLList $list155 = list(makeSymbol("?SOURCE-VAR"), makeSymbol("?TARGET-VAR"));

    private static final SubLObject $const156$querySpecVariablesUnifyInTable_Wo = reader_make_constant_shell(makeString("querySpecVariablesUnifyInTable-WorkaroundPred"));

    private static final SubLList $list157 = list(reader_make_constant_shell(makeString("AnalysisOutputBindingsForVarFn")), makeSymbol("?SOURCE-VAR"));

    private static final SubLList $list158 = list(reader_make_constant_shell(makeString("AnalysisInputBindingsForVarFn")), makeSymbol("?TARGET-VAR"));

    private static final SubLObject $$querySpecVariablesUnifyInTable = reader_make_constant_shell(makeString("querySpecVariablesUnifyInTable"));

    private static final SubLSymbol $sym160$_SOURCE_VAR = makeSymbol("?SOURCE-VAR");

    private static final SubLSymbol $sym161$_TARGET_VAR = makeSymbol("?TARGET-VAR");

    private static final SubLSymbol VARMAP_UNIQUE_EL_VAR_WRT_VARS = makeSymbol("VARMAP-UNIQUE-EL-VAR-WRT-VARS");



    public static SubLObject value_table_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_value_table_column(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject value_table_column_p(final SubLObject v_object) {
        return v_object.getClass() == value_tables.$value_table_column_native.class ? T : NIL;
    }

    public static SubLObject value_table_column_query(final SubLObject v_object) {
        assert NIL != value_table_column_p(v_object) : "value_tables.value_table_column_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_column_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject value_table_column_label(final SubLObject v_object) {
        assert NIL != value_table_column_p(v_object) : "value_tables.value_table_column_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_column_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject value_table_column_values(final SubLObject v_object) {
        assert NIL != value_table_column_p(v_object) : "value_tables.value_table_column_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_column_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_value_table_column_query(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_column_p(v_object) : "value_tables.value_table_column_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_column_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_value_table_column_label(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_column_p(v_object) : "value_tables.value_table_column_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_column_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_value_table_column_values(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_column_p(v_object) : "value_tables.value_table_column_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_column_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_value_table_column(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new value_tables.$value_table_column_native();
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

    public static SubLObject print_value_table_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str24$__ValueTableColumn_, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str25$_A___S____supported_values___S, new SubLObject[]{ value_table_column_query(v_object), value_table_column_label(v_object), value_table_column_values(v_object) });
        write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject new_value_table_column(final SubLObject query_id) {
        final SubLObject column = make_value_table_column(UNPROVIDED);
        _csetf_value_table_column_query(column, query_id);
        return column;
    }

    public static SubLObject load_value_table_column_from_kb(final SubLObject vtable_id, final SubLObject query_id, final SubLObject elmt) {
        final SubLObject column = new_value_table_column(query_id);
        final SubLObject values = get_vtbl_query_result_values(vtable_id, query_id, elmt);
        _csetf_value_table_column_values(column, values);
        _csetf_value_table_column_label(column, pph_main.generate_phrase(query_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return column;
    }

    public static SubLObject xml_serialize_value_table_column(final SubLObject column, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != value_table_column_p(column) : "value_tables.value_table_column_p(column) " + "CommonSymbols.NIL != value_tables.value_table_column_p(column) " + column;
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

    public static SubLObject get_vtbl_query_result_sets(final SubLObject vtable_id, final SubLObject query, final SubLObject elmt) {
        return ask_utilities.ask_variable($RESULT_SET, list($$validQueryResultForTable, query, $RESULT_SET, vtable_id), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject value_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_value_table(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject value_table_p(final SubLObject v_object) {
        return v_object.getClass() == value_tables.$value_table_native.class ? T : NIL;
    }

    public static SubLObject value_table_id(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject value_table_label(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject value_table_input_columns(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject value_table_output_column(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject value_table_assignments(final SubLObject v_object) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_value_table_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_value_table_label(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_value_table_input_columns(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_value_table_output_column(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_value_table_assignments(final SubLObject v_object, final SubLObject value) {
        assert NIL != value_table_p(v_object) : "value_tables.value_table_p(v_object) " + "CommonSymbols.NIL != value_tables.value_table_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_value_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new value_tables.$value_table_native();
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

    public static SubLObject new_value_table(final SubLObject id) {
        final SubLObject vtable = make_value_table(UNPROVIDED);
        _csetf_value_table_id(vtable, id);
        return vtable;
    }

    public static SubLObject load_value_table_from_kb(final SubLObject vtable_id, final SubLObject elmt) {
        assert NIL != forts.fort_p(vtable_id) : "forts.fort_p(vtable_id) " + "CommonSymbols.NIL != forts.fort_p(vtable_id) " + vtable_id;
        assert NIL != hlmt.hlmt_p(elmt) : "hlmt.hlmt_p(elmt) " + "CommonSymbols.NIL != hlmt.hlmt_p(elmt) " + elmt;
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

    public static SubLObject xml_serialize_value_table(final SubLObject vtable, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != value_table_p(vtable) : "value_tables.value_table_p(vtable) " + "CommonSymbols.NIL != value_tables.value_table_p(vtable) " + vtable;
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

    public static SubLObject get_vtbl_input_queries(final SubLObject vtable_id, final SubLObject elmt) {
        return ask_utilities.ask_variable($INPUT_QUERIES, listS($$valueTableSourceQueries, vtable_id, $list83), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_vtbl_output_query(final SubLObject vtable_id, final SubLObject elmt) {
        return ask_utilities.ask_variable($OUTPUT_QUERY, listS($$valueTableTargetQuery, vtable_id, $list86), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
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

    public static SubLObject variable_mapping_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_varmap_table(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject variable_mapping_table_p(final SubLObject v_object) {
        return v_object.getClass() == value_tables.$variable_mapping_table_native.class ? T : NIL;
    }

    public static SubLObject variable_mapping_table_id(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject variable_mapping_table_source_query(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject variable_mapping_table_target_query(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject variable_mapping_table_source_variables(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject variable_mapping_table_target_variables(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject variable_mapping_table_incompatibles(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject variable_mapping_table_assignments(final SubLObject v_object) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_variable_mapping_table_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_variable_mapping_table_source_query(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_variable_mapping_table_target_query(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_variable_mapping_table_source_variables(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_variable_mapping_table_target_variables(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_variable_mapping_table_incompatibles(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_variable_mapping_table_assignments(final SubLObject v_object, final SubLObject value) {
        assert NIL != variable_mapping_table_p(v_object) : "value_tables.variable_mapping_table_p(v_object) " + "CommonSymbols.NIL != value_tables.variable_mapping_table_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_variable_mapping_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new value_tables.$variable_mapping_table_native();
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

    public static SubLObject new_variable_mapping_table(final SubLObject table_id) {
        final SubLObject varmap = make_variable_mapping_table(UNPROVIDED);
        _csetf_variable_mapping_table_id(varmap, table_id);
        return varmap;
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

    public static SubLObject varmaptbl_load_source_query_information(final SubLObject table_id, final SubLObject elmt) {
        return ask_utilities.ask_variable($SOURCE, listS($const148$variableMappingTableSourceFormula, table_id, $list149), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject varmaptbl_load_target_query_information(final SubLObject table_id, final SubLObject elmt) {
        return ask_utilities.ask_variable($TARGET, listS($const151$variableMappingTableTargetFormula, table_id, $list152), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject varmaptbl_assign_variable_information(final SubLObject varmap, final SubLObject elmt) {
        final SubLObject source_constraints = varmaptbl_load_query_variable_information(variable_mapping_table_source_query(varmap), elmt);
        final SubLObject target_constraints = varmaptbl_load_query_variable_information(variable_mapping_table_target_query(varmap), elmt);
        varmaptbl_store_variable_information(varmap, elmt, source_constraints, target_constraints);
        return varmap;
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

    public static SubLObject varmaptbl_load_query_variable_information(final SubLObject query_id, final SubLObject elmt) {
        if (NIL == query_id) {
            return dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        final SubLObject query_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(query_id, UNPROVIDED);
        final SubLObject formula = new_cycl_query_specification.new_cycl_query_specification_formula(query_spec);
        return at_var_types.formula_variables_arg_constraints_dict(formula, elmt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject varmaptbl_assign_current_assignments(final SubLObject varmap, final SubLObject elmt) {
        _csetf_variable_mapping_table_assignments(varmap, varmaptbl_load_current_assignments(variable_mapping_table_id(varmap), variable_mapping_table_source_query(varmap), variable_mapping_table_target_query(varmap), elmt));
        return varmap;
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

    public static SubLObject varmap_attempt_to_combine_variables(final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym146$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        assert NIL != function_spec_p(varP) : "Types.function_spec_p(varP) " + "CommonSymbols.NIL != Types.function_spec_p(varP) " + varP;
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

    public static SubLObject declare_value_tables_file() {
        declareFunction(me, "value_table_column_print_function_trampoline", "VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "value_table_column_p", "VALUE-TABLE-COLUMN-P", 1, 0, false);
        new value_tables.$value_table_column_p$UnaryFunction();
        declareFunction(me, "value_table_column_query", "VALUE-TABLE-COLUMN-QUERY", 1, 0, false);
        declareFunction(me, "value_table_column_label", "VALUE-TABLE-COLUMN-LABEL", 1, 0, false);
        declareFunction(me, "value_table_column_values", "VALUE-TABLE-COLUMN-VALUES", 1, 0, false);
        declareFunction(me, "_csetf_value_table_column_query", "_CSETF-VALUE-TABLE-COLUMN-QUERY", 2, 0, false);
        declareFunction(me, "_csetf_value_table_column_label", "_CSETF-VALUE-TABLE-COLUMN-LABEL", 2, 0, false);
        declareFunction(me, "_csetf_value_table_column_values", "_CSETF-VALUE-TABLE-COLUMN-VALUES", 2, 0, false);
        declareFunction(me, "make_value_table_column", "MAKE-VALUE-TABLE-COLUMN", 0, 1, false);
        declareFunction(me, "visit_defstruct_value_table_column", "VISIT-DEFSTRUCT-VALUE-TABLE-COLUMN", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_value_table_column_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-COLUMN-METHOD", 2, 0, false);
        declareFunction(me, "print_value_table_column", "PRINT-VALUE-TABLE-COLUMN", 3, 0, false);
        declareFunction(me, "new_value_table_column", "NEW-VALUE-TABLE-COLUMN", 1, 0, false);
        declareFunction(me, "load_value_table_column_from_kb", "LOAD-VALUE-TABLE-COLUMN-FROM-KB", 3, 0, false);
        declareFunction(me, "xml_serialize_value_table_column", "XML-SERIALIZE-VALUE-TABLE-COLUMN", 1, 1, false);
        declareFunction(me, "get_vtbl_query_result_values", "GET-VTBL-QUERY-RESULT-VALUES", 3, 0, false);
        declareFunction(me, "get_vtbl_query_result_sets", "GET-VTBL-QUERY-RESULT-SETS", 3, 0, false);
        declareFunction(me, "value_table_print_function_trampoline", "VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "value_table_p", "VALUE-TABLE-P", 1, 0, false);
        new value_tables.$value_table_p$UnaryFunction();
        declareFunction(me, "value_table_id", "VALUE-TABLE-ID", 1, 0, false);
        declareFunction(me, "value_table_label", "VALUE-TABLE-LABEL", 1, 0, false);
        declareFunction(me, "value_table_input_columns", "VALUE-TABLE-INPUT-COLUMNS", 1, 0, false);
        declareFunction(me, "value_table_output_column", "VALUE-TABLE-OUTPUT-COLUMN", 1, 0, false);
        declareFunction(me, "value_table_assignments", "VALUE-TABLE-ASSIGNMENTS", 1, 0, false);
        declareFunction(me, "_csetf_value_table_id", "_CSETF-VALUE-TABLE-ID", 2, 0, false);
        declareFunction(me, "_csetf_value_table_label", "_CSETF-VALUE-TABLE-LABEL", 2, 0, false);
        declareFunction(me, "_csetf_value_table_input_columns", "_CSETF-VALUE-TABLE-INPUT-COLUMNS", 2, 0, false);
        declareFunction(me, "_csetf_value_table_output_column", "_CSETF-VALUE-TABLE-OUTPUT-COLUMN", 2, 0, false);
        declareFunction(me, "_csetf_value_table_assignments", "_CSETF-VALUE-TABLE-ASSIGNMENTS", 2, 0, false);
        declareFunction(me, "make_value_table", "MAKE-VALUE-TABLE", 0, 1, false);
        declareFunction(me, "visit_defstruct_value_table", "VISIT-DEFSTRUCT-VALUE-TABLE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_value_table_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-METHOD", 2, 0, false);
        declareFunction(me, "print_value_table", "PRINT-VALUE-TABLE", 3, 0, false);
        declareFunction(me, "new_value_table", "NEW-VALUE-TABLE", 1, 0, false);
        declareFunction(me, "load_value_table_from_kb", "LOAD-VALUE-TABLE-FROM-KB", 2, 0, false);
        declareFunction(me, "xml_serialize_value_table", "XML-SERIALIZE-VALUE-TABLE", 1, 1, false);
        declareFunction(me, "get_vtbl_input_queries", "GET-VTBL-INPUT-QUERIES", 2, 0, false);
        declareFunction(me, "get_vtbl_output_query", "GET-VTBL-OUTPUT-QUERY", 2, 0, false);
        declareFunction(me, "load_value_table_assignments_from_kb", "LOAD-VALUE-TABLE-ASSIGNMENTS-FROM-KB", 2, 0, false);
        declareFunction(me, "variable_mapping_table_print_function_trampoline", "VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "variable_mapping_table_p", "VARIABLE-MAPPING-TABLE-P", 1, 0, false);
        new value_tables.$variable_mapping_table_p$UnaryFunction();
        declareFunction(me, "variable_mapping_table_id", "VARIABLE-MAPPING-TABLE-ID", 1, 0, false);
        declareFunction(me, "variable_mapping_table_source_query", "VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 1, 0, false);
        declareFunction(me, "variable_mapping_table_target_query", "VARIABLE-MAPPING-TABLE-TARGET-QUERY", 1, 0, false);
        declareFunction(me, "variable_mapping_table_source_variables", "VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 1, 0, false);
        declareFunction(me, "variable_mapping_table_target_variables", "VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 1, 0, false);
        declareFunction(me, "variable_mapping_table_incompatibles", "VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 1, 0, false);
        declareFunction(me, "variable_mapping_table_assignments", "VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 1, 0, false);
        declareFunction(me, "_csetf_variable_mapping_table_id", "_CSETF-VARIABLE-MAPPING-TABLE-ID", 2, 0, false);
        declareFunction(me, "_csetf_variable_mapping_table_source_query", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 2, 0, false);
        declareFunction(me, "_csetf_variable_mapping_table_target_query", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY", 2, 0, false);
        declareFunction(me, "_csetf_variable_mapping_table_source_variables", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 2, 0, false);
        declareFunction(me, "_csetf_variable_mapping_table_target_variables", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 2, 0, false);
        declareFunction(me, "_csetf_variable_mapping_table_incompatibles", "_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 2, 0, false);
        declareFunction(me, "_csetf_variable_mapping_table_assignments", "_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 2, 0, false);
        declareFunction(me, "make_variable_mapping_table", "MAKE-VARIABLE-MAPPING-TABLE", 0, 1, false);
        declareFunction(me, "visit_defstruct_variable_mapping_table", "VISIT-DEFSTRUCT-VARIABLE-MAPPING-TABLE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_variable_mapping_table_method", "VISIT-DEFSTRUCT-OBJECT-VARIABLE-MAPPING-TABLE-METHOD", 2, 0, false);
        declareFunction(me, "print_varmap_table", "PRINT-VARMAP-TABLE", 3, 0, false);
        declareFunction(me, "xml_serialize_variable_mapping_table", "XML-SERIALIZE-VARIABLE-MAPPING-TABLE", 1, 1, false);
        declareFunction(me, "new_variable_mapping_table", "NEW-VARIABLE-MAPPING-TABLE", 1, 0, false);
        declareFunction(me, "load_variable_mapping_table_from_kb", "LOAD-VARIABLE-MAPPING-TABLE-FROM-KB", 2, 2, false);
        declareFunction(me, "get_variable_mapping_table_for_formulas", "GET-VARIABLE-MAPPING-TABLE-FOR-FORMULAS", 3, 2, false);
        declareFunction(me, "varmaptbl_assign_queries", "VARMAPTBL-ASSIGN-QUERIES", 4, 0, false);
        declareFunction(me, "varmaptbl_load_source_query_information", "VARMAPTBL-LOAD-SOURCE-QUERY-INFORMATION", 2, 0, false);
        declareFunction(me, "varmaptbl_load_target_query_information", "VARMAPTBL-LOAD-TARGET-QUERY-INFORMATION", 2, 0, false);
        declareFunction(me, "varmaptbl_assign_variable_information", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION", 2, 0, false);
        declareFunction(me, "varmaptbl_assign_variable_information_from_formulas", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION-FROM-FORMULAS", 4, 2, false);
        declareFunction(me, "varmaptbl_store_variable_information", "VARMAPTBL-STORE-VARIABLE-INFORMATION", 4, 0, false);
        declareFunction(me, "varmaptbl_load_query_variable_information", "VARMAPTBL-LOAD-QUERY-VARIABLE-INFORMATION", 2, 0, false);
        declareFunction(me, "varmaptbl_assign_current_assignments", "VARMAPTBL-ASSIGN-CURRENT-ASSIGNMENTS", 2, 0, false);
        declareFunction(me, "varmaptbl_load_current_assignments", "VARMAPTBL-LOAD-CURRENT-ASSIGNMENTS", 4, 0, false);
        declareFunction(me, "varmap_autocombine_literals", "VARMAP-AUTOCOMBINE-LITERALS", 1, 3, false);
        declareFunction(me, "varmap_uniquify_source_vars", "VARMAP-UNIQUIFY-SOURCE-VARS", 2, 0, false);
        declareFunction(me, "varmap_unique_el_var_wrt_vars", "VARMAP-UNIQUE-EL-VAR-WRT-VARS", 2, 0, false);
        declareFunction(me, "varmap_attempt_to_combine_variables", "VARMAP-ATTEMPT-TO-COMBINE-VARIABLES", 3, 2, false);
        return NIL;
    }

    public static SubLObject init_value_tables_file() {
        defconstant("*DTP-VALUE-TABLE-COLUMN*", VALUE_TABLE_COLUMN);
        defconstant("*DTP-VALUE-TABLE*", VALUE_TABLE);
        defconstant("*DTP-VARIABLE-MAPPING-TABLE*", VARIABLE_MAPPING_TABLE);
        return NIL;
    }

    public static SubLObject setup_value_tables_file() {
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
            this.$query = Lisp.NIL;
            this.$label = Lisp.NIL;
            this.$values = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(value_tables.$value_table_column_native.class, VALUE_TABLE_COLUMN, VALUE_TABLE_COLUMN_P, $list2, $list3, new String[]{ "$query", "$label", "$values" }, $list4, $list5, PRINT_VALUE_TABLE_COLUMN);
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

    public static final class $value_table_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $label;

        public SubLObject $input_columns;

        public SubLObject $output_column;

        public SubLObject $assignments;

        private static final SubLStructDeclNative structDecl;

        public $value_table_native() {
            this.$id = Lisp.NIL;
            this.$label = Lisp.NIL;
            this.$input_columns = Lisp.NIL;
            this.$output_column = Lisp.NIL;
            this.$assignments = Lisp.NIL;
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
            structDecl = makeStructDeclNative(value_tables.$value_table_native.class, VALUE_TABLE, VALUE_TABLE_P, $list39, $list40, new String[]{ "$id", "$label", "$input_columns", "$output_column", "$assignments" }, $list41, $list42, PRINT_VALUE_TABLE);
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

    public static final class $variable_mapping_table_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $source_query;

        public SubLObject $target_query;

        public SubLObject $source_variables;

        public SubLObject $target_variables;

        public SubLObject $incompatibles;

        public SubLObject $assignments;

        private static final SubLStructDeclNative structDecl;

        public $variable_mapping_table_native() {
            this.$id = Lisp.NIL;
            this.$source_query = Lisp.NIL;
            this.$target_query = Lisp.NIL;
            this.$source_variables = Lisp.NIL;
            this.$target_variables = Lisp.NIL;
            this.$incompatibles = Lisp.NIL;
            this.$assignments = Lisp.NIL;
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
            structDecl = makeStructDeclNative(value_tables.$variable_mapping_table_native.class, VARIABLE_MAPPING_TABLE, VARIABLE_MAPPING_TABLE_P, $list95, $list96, new String[]{ "$id", "$source_query", "$target_query", "$source_variables", "$target_variables", "$incompatibles", "$assignments" }, $list97, $list98, PRINT_VARMAP_TABLE);
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
