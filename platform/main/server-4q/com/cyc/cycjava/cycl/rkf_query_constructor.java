/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_general_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_existential;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_initialize_scenario_from_expression;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_act_set_indexical_record_var;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_constraint_record_sentence;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_extract_candidate_scenario_expressions;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_number;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_record_explicit_genls;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_record_explicit_isas;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_record_indexical;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_record_preferred_phrase;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_record_var;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_indexical_type;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_scenario_constraints;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_scenario_terms;
import static com.cyc.cycjava.cycl.rkf_scenario_manipulator.sm_term_requires_types_in_relations;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.user_interaction_agenda.ui_agenda;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_domain_interaction_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_domain_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_ensure_scenario_interaction_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_generation_interaction_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_parsing_interaction_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.user_interaction_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-QUERY-CONSTRUCTOR
 * source file: /cyc/top/cycl/rkf-query-constructor.lisp
 * created:     2019/07/03 17:38:00
 */
public final class rkf_query_constructor extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_query_constructor();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_query_constructor";


    // deflexical
    // Definitions
    @LispMethod(comment = "Lock for controlling modifications to query constructor datastructures.\ndeflexical")
    private static final SubLSymbol $qc_lock$ = makeSymbol("*QC-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_qc_query$ = makeSymbol("*DTP-QC-QUERY*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_qc_state$ = makeSymbol("*DTP-QC-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $rkf_add_object_var_map_entry_method_table$ = makeSymbol("*RKF-ADD-OBJECT-VAR-MAP-ENTRY-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $rkf_rem_object_var_map_method_table$ = makeSymbol("*RKF-REM-OBJECT-VAR-MAP-METHOD-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$Query_Constructor_Lock = makeString("Query Constructor Lock");

    static private final SubLList $list2 = list(makeSymbol("*QC-LOCK*"));

    public static final SubLSymbol $qc_isg$ = makeSymbol("*QC-ISG*");

    public static final SubLSymbol $qc_index$ = makeSymbol("*QC-INDEX*");

    private static final SubLSymbol QC_QUERY = makeSymbol("QC-QUERY");

    private static final SubLSymbol QC_QUERY_P = makeSymbol("QC-QUERY-P");

    static private final SubLList $list7 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("CYCL"), makeSymbol("TERMS"), makeSymbol("RETURN-TERMS"), makeSymbol("CONSTRAINTS"), makeSymbol("VAR-MAP"), makeSymbol("SCENARIO"), makeSymbol("ASSUMED-TERMS"), makeSymbol("ASSUMED-CONSTRAINTS") });

    static private final SubLList $list8 = list(new SubLObject[]{ makeKeyword("ID"), $CYCL, makeKeyword("TERMS"), makeKeyword("RETURN-TERMS"), makeKeyword("CONSTRAINTS"), makeKeyword("VAR-MAP"), makeKeyword("SCENARIO"), makeKeyword("ASSUMED-TERMS"), makeKeyword("ASSUMED-CONSTRAINTS") });

    static private final SubLList $list9 = list(new SubLObject[]{ makeSymbol("QC-QUERY-ID"), makeSymbol("QC-QUERY-CYCL"), makeSymbol("QC-QUERY-TERMS"), makeSymbol("QC-QUERY-RETURN-TERMS"), makeSymbol("QC-QUERY-CONSTRAINTS"), makeSymbol("QC-QUERY-VAR-MAP"), makeSymbol("QC-QUERY-SCENARIO"), makeSymbol("QC-QUERY-ASSUMED-TERMS"), makeSymbol("QC-QUERY-ASSUMED-CONSTRAINTS") });

    static private final SubLList $list10 = list(new SubLObject[]{ makeSymbol("_CSETF-QC-QUERY-ID"), makeSymbol("_CSETF-QC-QUERY-CYCL"), makeSymbol("_CSETF-QC-QUERY-TERMS"), makeSymbol("_CSETF-QC-QUERY-RETURN-TERMS"), makeSymbol("_CSETF-QC-QUERY-CONSTRAINTS"), makeSymbol("_CSETF-QC-QUERY-VAR-MAP"), makeSymbol("_CSETF-QC-QUERY-SCENARIO"), makeSymbol("_CSETF-QC-QUERY-ASSUMED-TERMS"), makeSymbol("_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS") });

    private static final SubLSymbol QC_QUERY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("QC-QUERY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list13 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("QC-QUERY-P"));

    private static final SubLSymbol QC_QUERY_ID = makeSymbol("QC-QUERY-ID");

    private static final SubLSymbol _CSETF_QC_QUERY_ID = makeSymbol("_CSETF-QC-QUERY-ID");

    private static final SubLSymbol QC_QUERY_CYCL = makeSymbol("QC-QUERY-CYCL");

    private static final SubLSymbol _CSETF_QC_QUERY_CYCL = makeSymbol("_CSETF-QC-QUERY-CYCL");

    private static final SubLSymbol QC_QUERY_TERMS = makeSymbol("QC-QUERY-TERMS");

    private static final SubLSymbol _CSETF_QC_QUERY_TERMS = makeSymbol("_CSETF-QC-QUERY-TERMS");

    private static final SubLSymbol QC_QUERY_RETURN_TERMS = makeSymbol("QC-QUERY-RETURN-TERMS");

    private static final SubLSymbol _CSETF_QC_QUERY_RETURN_TERMS = makeSymbol("_CSETF-QC-QUERY-RETURN-TERMS");

    private static final SubLSymbol QC_QUERY_CONSTRAINTS = makeSymbol("QC-QUERY-CONSTRAINTS");

    private static final SubLSymbol _CSETF_QC_QUERY_CONSTRAINTS = makeSymbol("_CSETF-QC-QUERY-CONSTRAINTS");

    private static final SubLSymbol QC_QUERY_VAR_MAP = makeSymbol("QC-QUERY-VAR-MAP");

    private static final SubLSymbol _CSETF_QC_QUERY_VAR_MAP = makeSymbol("_CSETF-QC-QUERY-VAR-MAP");

    private static final SubLSymbol QC_QUERY_SCENARIO = makeSymbol("QC-QUERY-SCENARIO");

    private static final SubLSymbol _CSETF_QC_QUERY_SCENARIO = makeSymbol("_CSETF-QC-QUERY-SCENARIO");

    private static final SubLSymbol QC_QUERY_ASSUMED_TERMS = makeSymbol("QC-QUERY-ASSUMED-TERMS");

    private static final SubLSymbol _CSETF_QC_QUERY_ASSUMED_TERMS = makeSymbol("_CSETF-QC-QUERY-ASSUMED-TERMS");

    private static final SubLSymbol QC_QUERY_ASSUMED_CONSTRAINTS = makeSymbol("QC-QUERY-ASSUMED-CONSTRAINTS");

    private static final SubLSymbol _CSETF_QC_QUERY_ASSUMED_CONSTRAINTS = makeSymbol("_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS");

    private static final SubLString $str41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_QC_QUERY = makeSymbol("MAKE-QC-QUERY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_QC_QUERY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-QC-QUERY-METHOD");

    private static final SubLSymbol SM_INDEXICAL_RECORD_P = makeSymbol("SM-INDEXICAL-RECORD-P");

    private static final SubLSymbol SM_SCENARIO_P = makeSymbol("SM-SCENARIO-P");

    private static final SubLSymbol SM_CONSTRAINT_RECORD_P = makeSymbol("SM-CONSTRAINT-RECORD-P");

    private static final SubLSymbol QC_STATE = makeSymbol("QC-STATE");

    private static final SubLSymbol QC_STATE_P = makeSymbol("QC-STATE-P");

    private static final SubLList $list54 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("TEXT"), makeSymbol("CANDIDATES"), makeSymbol("QUERY"), makeSymbol("INTERACTION"), makeSymbol("PARSING-MT"), makeSymbol("GENERATION-MT"), makeSymbol("DOMAIN-MT"), makeSymbol("DOMAIN-INTERACTION-MT") });

    private static final SubLList $list55 = list(new SubLObject[]{ makeKeyword("ID"), $TEXT, makeKeyword("CANDIDATES"), makeKeyword("QUERY"), makeKeyword("INTERACTION"), makeKeyword("PARSING-MT"), makeKeyword("GENERATION-MT"), makeKeyword("DOMAIN-MT"), makeKeyword("DOMAIN-INTERACTION-MT") });

    private static final SubLList $list56 = list(new SubLObject[]{ makeSymbol("QC-STATE-ID"), makeSymbol("QC-STATE-TEXT"), makeSymbol("QC-STATE-CANDIDATES"), makeSymbol("QC-STATE-QUERY"), makeSymbol("QC-STATE-INTERACTION"), makeSymbol("QC-STATE-PARSING-MT"), makeSymbol("QC-STATE-GENERATION-MT"), makeSymbol("QC-STATE-DOMAIN-MT"), makeSymbol("QC-STATE-DOMAIN-INTERACTION-MT") });

    private static final SubLList $list57 = list(new SubLObject[]{ makeSymbol("_CSETF-QC-STATE-ID"), makeSymbol("_CSETF-QC-STATE-TEXT"), makeSymbol("_CSETF-QC-STATE-CANDIDATES"), makeSymbol("_CSETF-QC-STATE-QUERY"), makeSymbol("_CSETF-QC-STATE-INTERACTION"), makeSymbol("_CSETF-QC-STATE-PARSING-MT"), makeSymbol("_CSETF-QC-STATE-GENERATION-MT"), makeSymbol("_CSETF-QC-STATE-DOMAIN-MT"), makeSymbol("_CSETF-QC-STATE-DOMAIN-INTERACTION-MT") });

    private static final SubLSymbol QC_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("QC-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list59 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("QC-STATE-P"));

    private static final SubLSymbol QC_STATE_ID = makeSymbol("QC-STATE-ID");

    private static final SubLSymbol _CSETF_QC_STATE_ID = makeSymbol("_CSETF-QC-STATE-ID");

    private static final SubLSymbol QC_STATE_TEXT = makeSymbol("QC-STATE-TEXT");

    private static final SubLSymbol _CSETF_QC_STATE_TEXT = makeSymbol("_CSETF-QC-STATE-TEXT");

    private static final SubLSymbol QC_STATE_CANDIDATES = makeSymbol("QC-STATE-CANDIDATES");

    private static final SubLSymbol _CSETF_QC_STATE_CANDIDATES = makeSymbol("_CSETF-QC-STATE-CANDIDATES");

    private static final SubLSymbol QC_STATE_QUERY = makeSymbol("QC-STATE-QUERY");

    private static final SubLSymbol _CSETF_QC_STATE_QUERY = makeSymbol("_CSETF-QC-STATE-QUERY");

    private static final SubLSymbol QC_STATE_INTERACTION = makeSymbol("QC-STATE-INTERACTION");

    private static final SubLSymbol _CSETF_QC_STATE_INTERACTION = makeSymbol("_CSETF-QC-STATE-INTERACTION");

    private static final SubLSymbol QC_STATE_PARSING_MT = makeSymbol("QC-STATE-PARSING-MT");

    private static final SubLSymbol _CSETF_QC_STATE_PARSING_MT = makeSymbol("_CSETF-QC-STATE-PARSING-MT");

    private static final SubLSymbol QC_STATE_GENERATION_MT = makeSymbol("QC-STATE-GENERATION-MT");

    private static final SubLSymbol _CSETF_QC_STATE_GENERATION_MT = makeSymbol("_CSETF-QC-STATE-GENERATION-MT");

    private static final SubLSymbol QC_STATE_DOMAIN_MT = makeSymbol("QC-STATE-DOMAIN-MT");

    private static final SubLSymbol _CSETF_QC_STATE_DOMAIN_MT = makeSymbol("_CSETF-QC-STATE-DOMAIN-MT");

    private static final SubLSymbol QC_STATE_DOMAIN_INTERACTION_MT = makeSymbol("QC-STATE-DOMAIN-INTERACTION-MT");

    private static final SubLSymbol _CSETF_QC_STATE_DOMAIN_INTERACTION_MT = makeSymbol("_CSETF-QC-STATE-DOMAIN-INTERACTION-MT");

    private static final SubLSymbol $DOMAIN_INTERACTION_MT = makeKeyword("DOMAIN-INTERACTION-MT");

    private static final SubLSymbol MAKE_QC_STATE = makeSymbol("MAKE-QC-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_QC_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-QC-STATE-METHOD");

    private static final SubLSymbol RKF_ADD_OBJECT_VAR_MAP_ENTRY_QC_QUERY_METHOD = makeSymbol("RKF-ADD-OBJECT-VAR-MAP-ENTRY-QC-QUERY-METHOD");

    private static final SubLSymbol RKF_REM_OBJECT_VAR_MAP_QC_QUERY_METHOD = makeSymbol("RKF-REM-OBJECT-VAR-MAP-QC-QUERY-METHOD");

    private static final SubLString $str94$_ = makeString("-");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$function = makeString("function");

    private static final SubLString $str97$_A = makeString("~A");

    private static final SubLSymbol SM_CONSTRAINT_RECORD_SENTENCE = makeSymbol("SM-CONSTRAINT-RECORD-SENTENCE");





    private static final SubLList $list101 = list(makeSymbol("EL-VARIABLE"), makeSymbol("INDEXICAL-RECORD"));

    private static final SubLSymbol SM_INDEXICAL_P = makeSymbol("SM-INDEXICAL-P");

    private static final SubLSymbol SM_INDEXICAL_RECORD_INDEXICAL = makeSymbol("SM-INDEXICAL-RECORD-INDEXICAL");

    public static final SubLObject with_qc_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt2, append(body, NIL));
        }
    }

    public static SubLObject with_qc_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list2, append(body, NIL));
    }

    public static final SubLObject qc_find_query_by_id_alt(SubLObject id) {
        return qc_find_object_by_id(id);
    }

    public static SubLObject qc_find_query_by_id(final SubLObject id) {
        return qc_find_object_by_id(id);
    }

    public static final SubLObject qc_find_query_by_id_string_alt(SubLObject id_string) {
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject query = qc_find_query_by_id(id);
            return query;
        }
    }

    public static SubLObject qc_find_query_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject query = qc_find_query_by_id(id);
        return query;
    }

    public static final SubLObject qc_find_state_by_id_alt(SubLObject id) {
        return qc_find_object_by_id(id);
    }

    public static SubLObject qc_find_state_by_id(final SubLObject id) {
        return qc_find_object_by_id(id);
    }

    public static final SubLObject qc_find_state_by_id_string_alt(SubLObject id_string) {
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject state = qc_find_state_by_id(id);
            return state;
        }
    }

    public static SubLObject qc_find_state_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject state = qc_find_state_by_id(id);
        return state;
    }

    public static final SubLObject qc_next_id_alt() {
        return integer_sequence_generator.integer_sequence_generator_next($qc_isg$.getGlobalValue());
    }

    public static SubLObject qc_next_id() {
        return integer_sequence_generator.integer_sequence_generator_next($qc_isg$.getGlobalValue());
    }

    public static final SubLObject qc_add_object_alt(SubLObject id, SubLObject v_object) {
        return dictionary.dictionary_enter($qc_index$.getGlobalValue(), id, v_object);
    }

    public static SubLObject qc_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter($qc_index$.getGlobalValue(), id, v_object);
    }

    public static final SubLObject qc_rem_object_alt(SubLObject id) {
        return dictionary.dictionary_remove($qc_index$.getGlobalValue(), id);
    }

    public static SubLObject qc_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove($qc_index$.getGlobalValue(), id);
    }

    public static final SubLObject qc_find_object_by_id_alt(SubLObject id) {
        return dictionary.dictionary_lookup($qc_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject qc_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup($qc_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static final SubLObject qc_query_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject qc_query_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject qc_query_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_query_constructor.$qc_query_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject qc_query_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_query_constructor.$qc_query_native.class ? T : NIL;
    }

    public static final SubLObject qc_query_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.getField2();
    }

    public static SubLObject qc_query_id(final SubLObject v_object) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject qc_query_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.getField3();
    }

    public static SubLObject qc_query_cycl(final SubLObject v_object) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject qc_query_terms_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.getField4();
    }

    public static SubLObject qc_query_terms(final SubLObject v_object) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject qc_query_return_terms_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.getField5();
    }

    public static SubLObject qc_query_return_terms(final SubLObject v_object) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject qc_query_constraints_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.getField6();
    }

    public static SubLObject qc_query_constraints(final SubLObject v_object) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject qc_query_var_map_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.getField7();
    }

    public static SubLObject qc_query_var_map(final SubLObject v_object) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject qc_query_scenario_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.getField8();
    }

    public static SubLObject qc_query_scenario(final SubLObject v_object) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject qc_query_assumed_terms_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.getField9();
    }

    public static SubLObject qc_query_assumed_terms(final SubLObject v_object) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject qc_query_assumed_constraints_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.getField10();
    }

    public static SubLObject qc_query_assumed_constraints(final SubLObject v_object) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_qc_query_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_qc_query_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_qc_query_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_qc_query_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_qc_query_terms_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_qc_query_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_qc_query_return_terms_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_qc_query_return_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_qc_query_constraints_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_qc_query_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_qc_query_var_map_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_qc_query_var_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_qc_query_scenario_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_qc_query_scenario(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_qc_query_assumed_terms_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_qc_query_assumed_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_qc_query_assumed_constraints_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_QUERY_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_qc_query_assumed_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_query_p(v_object) : "! rkf_query_constructor.qc_query_p(v_object) " + "rkf_query_constructor.qc_query_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_qc_query_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_query_constructor.$qc_query_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_qc_query_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CYCL)) {
                            _csetf_qc_query_cycl(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TERMS)) {
                                _csetf_qc_query_terms(v_new, current_value);
                            } else {
                                if (pcase_var.eql($RETURN_TERMS)) {
                                    _csetf_qc_query_return_terms(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CONSTRAINTS)) {
                                        _csetf_qc_query_constraints(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($VAR_MAP)) {
                                            _csetf_qc_query_var_map(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($SCENARIO)) {
                                                _csetf_qc_query_scenario(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($ASSUMED_TERMS)) {
                                                    _csetf_qc_query_assumed_terms(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($ASSUMED_CONSTRAINTS)) {
                                                        _csetf_qc_query_assumed_constraints(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt40$Invalid_slot__S_for_construction_, current_arg);
                                                    }
                                                }
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

    public static SubLObject make_qc_query(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_query_constructor.$qc_query_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_qc_query_id(v_new, current_value);
            } else
                if (pcase_var.eql($CYCL)) {
                    _csetf_qc_query_cycl(v_new, current_value);
                } else
                    if (pcase_var.eql($TERMS)) {
                        _csetf_qc_query_terms(v_new, current_value);
                    } else
                        if (pcase_var.eql($RETURN_TERMS)) {
                            _csetf_qc_query_return_terms(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONSTRAINTS)) {
                                _csetf_qc_query_constraints(v_new, current_value);
                            } else
                                if (pcase_var.eql($VAR_MAP)) {
                                    _csetf_qc_query_var_map(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SCENARIO)) {
                                        _csetf_qc_query_scenario(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ASSUMED_TERMS)) {
                                            _csetf_qc_query_assumed_terms(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($ASSUMED_CONSTRAINTS)) {
                                                _csetf_qc_query_assumed_constraints(v_new, current_value);
                                            } else {
                                                Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_qc_query(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_QC_QUERY, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, qc_query_id(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCL, qc_query_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $TERMS, qc_query_terms(obj));
        funcall(visitor_fn, obj, $SLOT, $RETURN_TERMS, qc_query_return_terms(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, qc_query_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $VAR_MAP, qc_query_var_map(obj));
        funcall(visitor_fn, obj, $SLOT, $SCENARIO, qc_query_scenario(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSUMED_TERMS, qc_query_assumed_terms(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSUMED_CONSTRAINTS, qc_query_assumed_constraints(obj));
        funcall(visitor_fn, obj, $END, MAKE_QC_QUERY, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_qc_query_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_qc_query(obj, visitor_fn);
    }

    public static final SubLObject qc_new_query_alt() {
        {
            SubLObject query = make_qc_query(UNPROVIDED);
            SubLObject id = qc_next_id();
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_id(query, id);
                qc_add_object(id, query);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return query;
        }
    }

    public static SubLObject qc_new_query() {
        final SubLObject query = make_qc_query(UNPROVIDED);
        final SubLObject id = qc_next_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_id(query, id);
            qc_add_object(id, query);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_cleanup_query_alt(SubLObject query) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        {
            SubLObject id = qc_query_id(query);
            SubLObject success = qc_rem_object(id);
            return success;
        }
    }

    public static SubLObject qc_cleanup_query(final SubLObject query) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        final SubLObject id = qc_query_id(query);
        final SubLObject success = qc_rem_object(id);
        return success;
    }

    public static final SubLObject qc_set_query_cycl_alt(SubLObject query, SubLObject cycl) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(cycl, EL_FORMULA_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_cycl(query, cycl);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_set_query_cycl(final SubLObject query, final SubLObject cycl) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != el_formula_p(cycl) : "! el_utilities.el_formula_p(cycl) " + ("el_utilities.el_formula_p(cycl) " + "CommonSymbols.NIL != el_utilities.el_formula_p(cycl) ") + cycl;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_cycl(query, cycl);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_set_query_terms_alt(SubLObject query, SubLObject indexical_records) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(indexical_records, LISTP);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_terms(query, indexical_records);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_set_query_terms(final SubLObject query, final SubLObject indexical_records) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != listp(indexical_records) : "! listp(indexical_records) " + ("Types.listp(indexical_records) " + "CommonSymbols.NIL != Types.listp(indexical_records) ") + indexical_records;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_terms(query, indexical_records);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_add_query_return_term_alt(SubLObject query, SubLObject indexical_record) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(indexical_record, SM_INDEXICAL_RECORD_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = indexical_record;
                    if (NIL == member(item_var, qc_query_return_terms(query), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_qc_query_return_terms(query, cons(item_var, qc_query_return_terms(query)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_add_query_return_term(final SubLObject query, final SubLObject indexical_record) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) : "! rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + ("rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) ") + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            if (NIL == member(indexical_record, qc_query_return_terms(query), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_qc_query_return_terms(query, cons(indexical_record, qc_query_return_terms(query)));
            }
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_rem_query_return_term_alt(SubLObject query, SubLObject indexical_record) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(indexical_record, SM_INDEXICAL_RECORD_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_return_terms(query, remove(indexical_record, qc_query_return_terms(query), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_rem_query_return_term(final SubLObject query, final SubLObject indexical_record) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) : "! rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + ("rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) ") + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_return_terms(query, remove(indexical_record, qc_query_return_terms(query), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_set_query_return_terms_alt(SubLObject query, SubLObject indexical_records) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(indexical_records, LISTP);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_return_terms(query, indexical_records);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_set_query_return_terms(final SubLObject query, final SubLObject indexical_records) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != listp(indexical_records) : "! listp(indexical_records) " + ("Types.listp(indexical_records) " + "CommonSymbols.NIL != Types.listp(indexical_records) ") + indexical_records;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_return_terms(query, indexical_records);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_set_query_constraints_alt(SubLObject query, SubLObject constraint_records) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(constraint_records, LISTP);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_constraints(query, constraint_records);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_set_query_constraints(final SubLObject query, final SubLObject constraint_records) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != listp(constraint_records) : "! listp(constraint_records) " + ("Types.listp(constraint_records) " + "CommonSymbols.NIL != Types.listp(constraint_records) ") + constraint_records;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_constraints(query, constraint_records);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_add_query_var_map_entry_alt(SubLObject query, SubLObject entry) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(entry, LISTP);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = entry;
                    if (NIL == member(item_var, qc_query_var_map(query), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_qc_query_var_map(query, cons(item_var, qc_query_var_map(query)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_add_query_var_map_entry(final SubLObject query, final SubLObject entry) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != listp(entry) : "! listp(entry) " + ("Types.listp(entry) " + "CommonSymbols.NIL != Types.listp(entry) ") + entry;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            if (NIL == member(entry, qc_query_var_map(query), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_qc_query_var_map(query, cons(entry, qc_query_var_map(query)));
            }
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_rem_query_var_map_alt(SubLObject query) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_var_map(query, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_rem_query_var_map(final SubLObject query) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_var_map(query, NIL);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_set_query_scenario_alt(SubLObject query, SubLObject v_scenario) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(v_scenario, SM_SCENARIO_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_scenario(query, v_scenario);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_set_query_scenario(final SubLObject query, final SubLObject v_scenario) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : "! rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + ("rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) ") + v_scenario;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_scenario(query, v_scenario);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_add_query_assumed_term_alt(SubLObject query, SubLObject indexical_record) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(indexical_record, SM_INDEXICAL_RECORD_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = indexical_record;
                    if (NIL == member(item_var, qc_query_assumed_terms(query), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_qc_query_assumed_terms(query, cons(item_var, qc_query_assumed_terms(query)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_add_query_assumed_term(final SubLObject query, final SubLObject indexical_record) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) : "! rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + ("rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) ") + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            if (NIL == member(indexical_record, qc_query_assumed_terms(query), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_qc_query_assumed_terms(query, cons(indexical_record, qc_query_assumed_terms(query)));
            }
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_rem_query_assumed_term_alt(SubLObject query, SubLObject indexical_record) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(indexical_record, SM_INDEXICAL_RECORD_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_assumed_terms(query, remove(indexical_record, qc_query_assumed_terms(query), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_rem_query_assumed_term(final SubLObject query, final SubLObject indexical_record) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) : "! rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + ("rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) ") + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_assumed_terms(query, remove(indexical_record, qc_query_assumed_terms(query), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_set_query_assumed_terms_alt(SubLObject query, SubLObject indexical_records) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(indexical_records, LISTP);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_assumed_terms(query, indexical_records);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_set_query_assumed_terms(final SubLObject query, final SubLObject indexical_records) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != listp(indexical_records) : "! listp(indexical_records) " + ("Types.listp(indexical_records) " + "CommonSymbols.NIL != Types.listp(indexical_records) ") + indexical_records;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_assumed_terms(query, indexical_records);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_add_query_assumed_constraint_alt(SubLObject query, SubLObject constraint_record) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(constraint_record, SM_CONSTRAINT_RECORD_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = constraint_record;
                    if (NIL == member(item_var, qc_query_assumed_constraints(query), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_qc_query_assumed_constraints(query, cons(item_var, qc_query_assumed_constraints(query)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_add_query_assumed_constraint(final SubLObject query, final SubLObject constraint_record) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) : "! rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + ("rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) ") + constraint_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            if (NIL == member(constraint_record, qc_query_assumed_constraints(query), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_qc_query_assumed_constraints(query, cons(constraint_record, qc_query_assumed_constraints(query)));
            }
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_rem_query_assumed_constraint_alt(SubLObject query, SubLObject constraint_record) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(constraint_record, SM_CONSTRAINT_RECORD_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_assumed_constraints(query, remove(constraint_record, qc_query_assumed_constraints(query), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_rem_query_assumed_constraint(final SubLObject query, final SubLObject constraint_record) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) : "! rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + ("rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) ") + constraint_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_assumed_constraints(query, remove(constraint_record, qc_query_assumed_constraints(query), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_set_query_assumed_constraints_alt(SubLObject query, SubLObject constraint_records) {
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        SubLTrampolineFile.checkType(constraint_records, LISTP);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_query_assumed_constraints(query, constraint_records);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return query;
    }

    public static SubLObject qc_set_query_assumed_constraints(final SubLObject query, final SubLObject constraint_records) {
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        assert NIL != listp(constraint_records) : "! listp(constraint_records) " + ("Types.listp(constraint_records) " + "CommonSymbols.NIL != Types.listp(constraint_records) ") + constraint_records;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_query_assumed_constraints(query, constraint_records);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static final SubLObject qc_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject qc_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject qc_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_query_constructor.$qc_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject qc_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_query_constructor.$qc_state_native.class ? T : NIL;
    }

    public static final SubLObject qc_state_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject qc_state_id(final SubLObject v_object) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject qc_state_text_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject qc_state_text(final SubLObject v_object) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject qc_state_candidates_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject qc_state_candidates(final SubLObject v_object) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject qc_state_query_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject qc_state_query(final SubLObject v_object) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject qc_state_interaction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject qc_state_interaction(final SubLObject v_object) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject qc_state_parsing_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject qc_state_parsing_mt(final SubLObject v_object) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject qc_state_generation_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject qc_state_generation_mt(final SubLObject v_object) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject qc_state_domain_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.getField9();
    }

    public static SubLObject qc_state_domain_mt(final SubLObject v_object) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject qc_state_domain_interaction_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.getField10();
    }

    public static SubLObject qc_state_domain_interaction_mt(final SubLObject v_object) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_qc_state_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_qc_state_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_qc_state_text_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_qc_state_text(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_qc_state_candidates_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_qc_state_candidates(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_qc_state_query_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_qc_state_query(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_qc_state_interaction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_qc_state_interaction(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_qc_state_parsing_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_qc_state_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_qc_state_generation_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_qc_state_generation_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_qc_state_domain_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_qc_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_qc_state_domain_interaction_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QC_STATE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_qc_state_domain_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != qc_state_p(v_object) : "! rkf_query_constructor.qc_state_p(v_object) " + "rkf_query_constructor.qc_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_qc_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_query_constructor.$qc_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_qc_state_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TEXT)) {
                            _csetf_qc_state_text(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CANDIDATES)) {
                                _csetf_qc_state_candidates(v_new, current_value);
                            } else {
                                if (pcase_var.eql($QUERY)) {
                                    _csetf_qc_state_query(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($INTERACTION)) {
                                        _csetf_qc_state_interaction(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PARSING_MT)) {
                                            _csetf_qc_state_parsing_mt(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($GENERATION_MT)) {
                                                _csetf_qc_state_generation_mt(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($DOMAIN_MT)) {
                                                    _csetf_qc_state_domain_mt(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($DOMAIN_INTERACTION_MT)) {
                                                        _csetf_qc_state_domain_interaction_mt(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt40$Invalid_slot__S_for_construction_, current_arg);
                                                    }
                                                }
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

    public static SubLObject make_qc_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_query_constructor.$qc_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_qc_state_id(v_new, current_value);
            } else
                if (pcase_var.eql($TEXT)) {
                    _csetf_qc_state_text(v_new, current_value);
                } else
                    if (pcase_var.eql($CANDIDATES)) {
                        _csetf_qc_state_candidates(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUERY)) {
                            _csetf_qc_state_query(v_new, current_value);
                        } else
                            if (pcase_var.eql($INTERACTION)) {
                                _csetf_qc_state_interaction(v_new, current_value);
                            } else
                                if (pcase_var.eql($PARSING_MT)) {
                                    _csetf_qc_state_parsing_mt(v_new, current_value);
                                } else
                                    if (pcase_var.eql($GENERATION_MT)) {
                                        _csetf_qc_state_generation_mt(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($DOMAIN_MT)) {
                                            _csetf_qc_state_domain_mt(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($DOMAIN_INTERACTION_MT)) {
                                                _csetf_qc_state_domain_interaction_mt(v_new, current_value);
                                            } else {
                                                Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_qc_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_QC_STATE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, qc_state_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TEXT, qc_state_text(obj));
        funcall(visitor_fn, obj, $SLOT, $CANDIDATES, qc_state_candidates(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY, qc_state_query(obj));
        funcall(visitor_fn, obj, $SLOT, $INTERACTION, qc_state_interaction(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSING_MT, qc_state_parsing_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $GENERATION_MT, qc_state_generation_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $DOMAIN_MT, qc_state_domain_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $DOMAIN_INTERACTION_MT, qc_state_domain_interaction_mt(obj));
        funcall(visitor_fn, obj, $END, MAKE_QC_STATE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_qc_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_qc_state(obj, visitor_fn);
    }

    public static final SubLObject qc_new_state_alt() {
        {
            SubLObject state = make_qc_state(UNPROVIDED);
            SubLObject id = qc_next_id();
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_state_id(state, id);
                qc_add_object(id, state);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return state;
        }
    }

    public static SubLObject qc_new_state() {
        final SubLObject state = make_qc_state(UNPROVIDED);
        final SubLObject id = qc_next_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_state_id(state, id);
            qc_add_object(id, state);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject qc_cleanup_state_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, QC_STATE_P);
        {
            SubLObject id = qc_state_id(state);
            SubLObject success = qc_rem_object(id);
            SubLObject cdolist_list_var = qc_state_candidates(state);
            SubLObject candidate = NIL;
            for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                qc_cleanup_query(candidate);
            }
            qc_cleanup_query(qc_state_query(state));
            return success;
        }
    }

    public static SubLObject qc_cleanup_state(final SubLObject state) {
        assert NIL != qc_state_p(state) : "! rkf_query_constructor.qc_state_p(state) " + ("rkf_query_constructor.qc_state_p(state) " + "CommonSymbols.NIL != rkf_query_constructor.qc_state_p(state) ") + state;
        final SubLObject id = qc_state_id(state);
        final SubLObject success = qc_rem_object(id);
        SubLObject cdolist_list_var = qc_state_candidates(state);
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            qc_cleanup_query(candidate);
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        qc_cleanup_query(qc_state_query(state));
        return success;
    }

    public static final SubLObject qc_set_state_text_alt(SubLObject state, SubLObject text) {
        SubLTrampolineFile.checkType(state, QC_STATE_P);
        SubLTrampolineFile.checkType(text, STRINGP);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_state_text(state, text);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject qc_set_state_text(final SubLObject state, final SubLObject text) {
        assert NIL != qc_state_p(state) : "! rkf_query_constructor.qc_state_p(state) " + ("rkf_query_constructor.qc_state_p(state) " + "CommonSymbols.NIL != rkf_query_constructor.qc_state_p(state) ") + state;
        assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_state_text(state, text);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject qc_set_state_candidates_alt(SubLObject state, SubLObject candidates) {
        SubLTrampolineFile.checkType(state, QC_STATE_P);
        SubLTrampolineFile.checkType(candidates, LISTP);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_state_candidates(state, candidates);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject qc_set_state_candidates(final SubLObject state, final SubLObject candidates) {
        assert NIL != qc_state_p(state) : "! rkf_query_constructor.qc_state_p(state) " + ("rkf_query_constructor.qc_state_p(state) " + "CommonSymbols.NIL != rkf_query_constructor.qc_state_p(state) ") + state;
        assert NIL != listp(candidates) : "! listp(candidates) " + ("Types.listp(candidates) " + "CommonSymbols.NIL != Types.listp(candidates) ") + candidates;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_state_candidates(state, candidates);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject qc_set_state_query_alt(SubLObject state, SubLObject query) {
        SubLTrampolineFile.checkType(state, QC_STATE_P);
        SubLTrampolineFile.checkType(query, QC_QUERY_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_state_query(state, query);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject qc_set_state_query(final SubLObject state, final SubLObject query) {
        assert NIL != qc_state_p(state) : "! rkf_query_constructor.qc_state_p(state) " + ("rkf_query_constructor.qc_state_p(state) " + "CommonSymbols.NIL != rkf_query_constructor.qc_state_p(state) ") + state;
        assert NIL != qc_query_p(query) : "! rkf_query_constructor.qc_query_p(query) " + ("rkf_query_constructor.qc_query_p(query) " + "CommonSymbols.NIL != rkf_query_constructor.qc_query_p(query) ") + query;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_state_query(state, query);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject qc_set_state_interaction_alt(SubLObject state, SubLObject interaction) {
        SubLTrampolineFile.checkType(state, QC_STATE_P);
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_state_interaction(state, interaction);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject qc_set_state_interaction(final SubLObject state, final SubLObject interaction) {
        assert NIL != qc_state_p(state) : "! rkf_query_constructor.qc_state_p(state) " + ("rkf_query_constructor.qc_state_p(state) " + "CommonSymbols.NIL != rkf_query_constructor.qc_state_p(state) ") + state;
        assert NIL != user_interaction_agenda.user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_state_interaction(state, interaction);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject qc_set_state_parsing_mt_alt(SubLObject state, SubLObject parsing_mt) {
        SubLTrampolineFile.checkType(state, QC_STATE_P);
        SubLTrampolineFile.checkType(parsing_mt, HLMT_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_state_parsing_mt(state, parsing_mt);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject qc_set_state_parsing_mt(final SubLObject state, final SubLObject parsing_mt) {
        assert NIL != qc_state_p(state) : "! rkf_query_constructor.qc_state_p(state) " + ("rkf_query_constructor.qc_state_p(state) " + "CommonSymbols.NIL != rkf_query_constructor.qc_state_p(state) ") + state;
        assert NIL != hlmt.hlmt_p(parsing_mt) : "! hlmt.hlmt_p(parsing_mt) " + ("hlmt.hlmt_p(parsing_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(parsing_mt) ") + parsing_mt;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_state_parsing_mt(state, parsing_mt);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject qc_set_state_generation_mt_alt(SubLObject state, SubLObject generation_mt) {
        SubLTrampolineFile.checkType(state, QC_STATE_P);
        SubLTrampolineFile.checkType(generation_mt, HLMT_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_state_generation_mt(state, generation_mt);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject qc_set_state_generation_mt(final SubLObject state, final SubLObject generation_mt) {
        assert NIL != qc_state_p(state) : "! rkf_query_constructor.qc_state_p(state) " + ("rkf_query_constructor.qc_state_p(state) " + "CommonSymbols.NIL != rkf_query_constructor.qc_state_p(state) ") + state;
        assert NIL != hlmt.hlmt_p(generation_mt) : "! hlmt.hlmt_p(generation_mt) " + ("hlmt.hlmt_p(generation_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(generation_mt) ") + generation_mt;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_state_generation_mt(state, generation_mt);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject qc_set_state_domain_mt_alt(SubLObject state, SubLObject domain_mt) {
        SubLTrampolineFile.checkType(state, QC_STATE_P);
        SubLTrampolineFile.checkType(domain_mt, HLMT_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_state_domain_mt(state, domain_mt);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject qc_set_state_domain_mt(final SubLObject state, final SubLObject domain_mt) {
        assert NIL != qc_state_p(state) : "! rkf_query_constructor.qc_state_p(state) " + ("rkf_query_constructor.qc_state_p(state) " + "CommonSymbols.NIL != rkf_query_constructor.qc_state_p(state) ") + state;
        assert NIL != hlmt.hlmt_p(domain_mt) : "! hlmt.hlmt_p(domain_mt) " + ("hlmt.hlmt_p(domain_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(domain_mt) ") + domain_mt;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_state_domain_mt(state, domain_mt);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject qc_set_state_domain_interaction_mt_alt(SubLObject state, SubLObject domain_interaction_mt) {
        SubLTrampolineFile.checkType(state, QC_STATE_P);
        SubLTrampolineFile.checkType(domain_interaction_mt, HLMT_P);
        {
            SubLObject lock = $qc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_qc_state_domain_interaction_mt(state, domain_interaction_mt);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject qc_set_state_domain_interaction_mt(final SubLObject state, final SubLObject domain_interaction_mt) {
        assert NIL != qc_state_p(state) : "! rkf_query_constructor.qc_state_p(state) " + ("rkf_query_constructor.qc_state_p(state) " + "CommonSymbols.NIL != rkf_query_constructor.qc_state_p(state) ") + state;
        assert NIL != hlmt.hlmt_p(domain_interaction_mt) : "! hlmt.hlmt_p(domain_interaction_mt) " + ("hlmt.hlmt_p(domain_interaction_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(domain_interaction_mt) ") + domain_interaction_mt;
        SubLObject release = NIL;
        try {
            release = seize_lock($qc_lock$.getGlobalValue());
            _csetf_qc_state_domain_interaction_mt(state, domain_interaction_mt);
        } finally {
            if (NIL != release) {
                release_lock($qc_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject qc_assumable_constraint_p_alt(SubLObject state, SubLObject constraint_record) {
        return T;
    }

    public static SubLObject qc_assumable_constraint_p(final SubLObject state, final SubLObject constraint_record) {
        return T;
    }

    public static final SubLObject qc_act_new_state_alt() {
        {
            SubLObject state = qc_new_state();
            return state;
        }
    }

    public static SubLObject qc_act_new_state() {
        final SubLObject state = qc_new_state();
        return state;
    }

    public static final SubLObject qc_act_new_state_with_text_alt(SubLObject text) {
        {
            SubLObject state = qc_act_new_state();
            qc_set_state_text(state, text);
            return state;
        }
    }

    public static SubLObject qc_act_new_state_with_text(final SubLObject text) {
        final SubLObject state = qc_act_new_state();
        qc_set_state_text(state, text);
        return state;
    }

    public static final SubLObject qc_act_note_state_interaction_alt(SubLObject state, SubLObject interaction) {
        qc_set_state_interaction(state, interaction);
        qc_act_initialize_state_context(state);
        return state;
    }

    public static SubLObject qc_act_note_state_interaction(final SubLObject state, final SubLObject interaction) {
        qc_set_state_interaction(state, interaction);
        qc_act_initialize_state_context(state);
        return state;
    }

    public static final SubLObject qc_act_note_state_query_alt(SubLObject state, SubLObject query) {
        qc_set_state_query(state, query);
        return state;
    }

    public static SubLObject qc_act_note_state_query(final SubLObject state, final SubLObject query) {
        qc_set_state_query(state, query);
        return state;
    }

    public static final SubLObject qc_act_initialize_state_context_alt(SubLObject state) {
        if (NIL != user_interaction_p(qc_state_interaction(state))) {
            {
                SubLObject v_agenda = ui_agenda(qc_state_interaction(state));
                qc_set_state_parsing_mt(state, uia_parsing_interaction_mt(v_agenda));
                qc_set_state_generation_mt(state, uia_generation_interaction_mt(v_agenda, UNPROVIDED));
                qc_set_state_domain_mt(state, uia_domain_mt(v_agenda));
                qc_set_state_domain_interaction_mt(state, uia_domain_interaction_mt(v_agenda));
            }
        }
        return state;
    }

    public static SubLObject qc_act_initialize_state_context(final SubLObject state) {
        if (NIL != user_interaction_agenda.user_interaction_p(qc_state_interaction(state))) {
            final SubLObject v_agenda = user_interaction_agenda.ui_agenda(qc_state_interaction(state));
            qc_set_state_parsing_mt(state, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
            qc_set_state_generation_mt(state, user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED));
            qc_set_state_domain_mt(state, user_interaction_agenda.uia_domain_mt(v_agenda));
            qc_set_state_domain_interaction_mt(state, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
        }
        return state;
    }

    /**
     *
     *
     * @param STATE
    qc-state-p
     * 		
     * @param TEXT
    stringp
     * 		
     * @return list of <sm-scenario-expression-p>
     */
    @LispMethod(comment = "@param STATE\nqc-state-p\r\n\t\t\r\n@param TEXT\nstringp\r\n\t\t\r\n@return list of <sm-scenario-expression-p>")
    public static final SubLObject qc_act_candidate_scenario_expressions_alt(SubLObject state, SubLObject text) {
        {
            SubLObject parsing_mt = qc_state_parsing_mt(state);
            SubLObject domain_interaction_mt = qc_state_domain_interaction_mt(state);
            SubLObject candidates = sm_extract_candidate_scenario_expressions(text, parsing_mt, domain_interaction_mt);
            return candidates;
        }
    }

    /**
     *
     *
     * @param STATE
    qc-state-p
     * 		
     * @param TEXT
    stringp
     * 		
     * @return list of <sm-scenario-expression-p>
     */
    @LispMethod(comment = "@param STATE\nqc-state-p\r\n\t\t\r\n@param TEXT\nstringp\r\n\t\t\r\n@return list of <sm-scenario-expression-p>")
    public static SubLObject qc_act_candidate_scenario_expressions(final SubLObject state, final SubLObject text) {
        final SubLObject parsing_mt = qc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = qc_state_domain_interaction_mt(state);
        final SubLObject candidates = rkf_scenario_manipulator.sm_extract_candidate_scenario_expressions(text, parsing_mt, domain_interaction_mt);
        return candidates;
    }

    /**
     *
     *
     * @param STATE
    qc-state-p
     * 		
     * @param SCENARIO-EXPRESSION
    sm-scenario-expression-p
     * 		
     * @return sm-scenario-p
     */
    @LispMethod(comment = "@param STATE\nqc-state-p\r\n\t\t\r\n@param SCENARIO-EXPRESSION\nsm-scenario-expression-p\r\n\t\t\r\n@return sm-scenario-p")
    public static final SubLObject qc_act_initialize_scenario_from_expression_alt(SubLObject state, SubLObject scenario_expression) {
        {
            SubLObject text = qc_state_text(state);
            SubLObject interaction = qc_state_interaction(state);
            SubLObject v_agenda = (NIL != user_interaction_p(interaction)) ? ((SubLObject) (ui_agenda(interaction))) : NIL;
            SubLObject scenario_interaction_mt = (NIL != v_agenda) ? ((SubLObject) (uia_ensure_scenario_interaction_mt(v_agenda))) : rkf_scenario_constructor.sc_storage_mt();
            SubLObject parsing_mt = qc_state_parsing_mt(state);
            SubLObject v_scenario = sm_act_initialize_scenario_from_expression(scenario_expression, text, scenario_interaction_mt, parsing_mt);
            return v_scenario;
        }
    }

    /**
     *
     *
     * @param STATE
    qc-state-p
     * 		
     * @param SCENARIO-EXPRESSION
    sm-scenario-expression-p
     * 		
     * @return sm-scenario-p
     */
    @LispMethod(comment = "@param STATE\nqc-state-p\r\n\t\t\r\n@param SCENARIO-EXPRESSION\nsm-scenario-expression-p\r\n\t\t\r\n@return sm-scenario-p")
    public static SubLObject qc_act_initialize_scenario_from_expression(final SubLObject state, final SubLObject scenario_expression) {
        final SubLObject text = qc_state_text(state);
        final SubLObject interaction = qc_state_interaction(state);
        final SubLObject v_agenda = (NIL != user_interaction_agenda.user_interaction_p(interaction)) ? user_interaction_agenda.ui_agenda(interaction) : NIL;
        final SubLObject scenario_interaction_mt = (NIL != v_agenda) ? user_interaction_agenda.uia_ensure_scenario_interaction_mt(v_agenda) : rkf_scenario_constructor.sc_storage_mt();
        final SubLObject parsing_mt = qc_state_parsing_mt(state);
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_expression(scenario_expression, text, scenario_interaction_mt, parsing_mt);
        return v_scenario;
    }

    public static final SubLObject qc_act_initialize_query_from_scenario_alt(SubLObject state, SubLObject v_scenario) {
        {
            SubLObject query = qc_state_query(state);
            SubLObject assumed_constraints = (NIL != query) ? ((SubLObject) (qc_query_assumed_constraints(query))) : NIL;
            if (NIL == qc_query_p(query)) {
                query = qc_new_query();
            }
            qc_set_query_scenario(query, v_scenario);
            {
                SubLObject new_terms = sm_scenario_terms(v_scenario);
                SubLObject new_return_terms = sm_scenario_terms(v_scenario);
                qc_set_query_terms(query, new_terms);
                qc_set_query_return_terms(query, new_return_terms);
            }
            {
                SubLObject new_constraints = sm_scenario_constraints(v_scenario);
                SubLObject cdolist_list_var = assumed_constraints;
                SubLObject assumed_constraint = NIL;
                for (assumed_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assumed_constraint = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(assumed_constraint, new_constraints, UNPROVIDED, UNPROVIDED)) {
                        qc_act_deregister_assumed_constraint(state, assumed_constraint);
                    }
                }
                qc_set_query_constraints(query, new_constraints);
            }
            qc_compute_and_record_variables(query);
            qc_compute_and_record_query_cycl(query);
            return query;
        }
    }

    public static SubLObject qc_act_initialize_query_from_scenario(final SubLObject state, final SubLObject v_scenario) {
        SubLObject query = qc_state_query(state);
        final SubLObject assumed_constraints = (NIL != query) ? qc_query_assumed_constraints(query) : NIL;
        if (NIL == qc_query_p(query)) {
            query = qc_new_query();
        }
        qc_set_query_scenario(query, v_scenario);
        final SubLObject new_terms = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        final SubLObject new_return_terms = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        qc_set_query_terms(query, new_terms);
        qc_set_query_return_terms(query, new_return_terms);
        final SubLObject new_constraints = rkf_scenario_manipulator.sm_scenario_constraints(v_scenario);
        SubLObject cdolist_list_var = assumed_constraints;
        SubLObject assumed_constraint = NIL;
        assumed_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(assumed_constraint, new_constraints, UNPROVIDED, UNPROVIDED)) {
                qc_act_deregister_assumed_constraint(state, assumed_constraint);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assumed_constraint = cdolist_list_var.first();
        } 
        qc_set_query_constraints(query, new_constraints);
        qc_compute_and_record_variables(query);
        qc_compute_and_record_query_cycl(query);
        return query;
    }

    public static final SubLObject qc_compute_and_record_variables_alt(SubLObject query) {
        {
            SubLObject query_terms = qc_query_terms(query);
            SubLObject assumed_terms = qc_query_assumed_terms(query);
            SubLObject variable_terms = set_difference(query_terms, assumed_terms, UNPROVIDED, UNPROVIDED);
            return rkf_compute_and_record_variables(query, variable_terms);
        }
    }

    public static SubLObject qc_compute_and_record_variables(final SubLObject query) {
        final SubLObject query_terms = qc_query_terms(query);
        final SubLObject assumed_terms = qc_query_assumed_terms(query);
        final SubLObject variable_terms = set_difference(query_terms, assumed_terms, UNPROVIDED, UNPROVIDED);
        return rkf_compute_and_record_variables(query, variable_terms);
    }

    public static final SubLObject qc_compute_set_difference_alt(SubLObject piece_a, SubLObject piece_b) {
        return set_difference(piece_a, piece_b, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject qc_compute_set_difference(final SubLObject piece_a, final SubLObject piece_b) {
        return set_difference(piece_a, piece_b, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qc_compute_and_record_query_cycl_alt(SubLObject query) {
        {
            SubLObject constraints = qc_query_constraints(query);
            SubLObject assumed_constraints = qc_query_assumed_constraints(query);
            SubLObject query_constraints = qc_compute_set_difference(constraints, assumed_constraints);
            SubLObject all_terms = qc_query_terms(query);
            SubLObject assumed_terms = qc_query_assumed_terms(query);
            SubLObject existential_terms = set_difference(set_difference(all_terms, qc_query_return_terms(query), UNPROVIDED, UNPROVIDED), assumed_terms, UNPROVIDED, UNPROVIDED);
            SubLObject variable_terms = all_terms;
            SubLObject cycl = rkf_compute_cycl_from_parts(query_constraints, variable_terms, existential_terms, assumed_constraints, UNPROVIDED, UNPROVIDED);
            qc_set_query_cycl(query, cycl);
            return cycl;
        }
    }

    public static SubLObject qc_compute_and_record_query_cycl(final SubLObject query) {
        final SubLObject constraints = qc_query_constraints(query);
        final SubLObject assumed_constraints = qc_query_assumed_constraints(query);
        final SubLObject query_constraints = qc_compute_set_difference(constraints, assumed_constraints);
        final SubLObject all_terms = qc_query_terms(query);
        final SubLObject assumed_terms = qc_query_assumed_terms(query);
        final SubLObject existential_terms = set_difference(set_difference(all_terms, qc_query_return_terms(query), UNPROVIDED, UNPROVIDED), assumed_terms, UNPROVIDED, UNPROVIDED);
        final SubLObject variable_terms = all_terms;
        final SubLObject cycl = rkf_compute_cycl_from_parts(query_constraints, variable_terms, existential_terms, assumed_constraints, UNPROVIDED, UNPROVIDED);
        qc_set_query_cycl(query, cycl);
        return cycl;
    }

    public static final SubLObject rkf_compute_and_record_variables_alt(SubLObject v_object, SubLObject indexical_records) {
        rkf_rem_object_var_map(v_object);
        {
            SubLObject cdolist_list_var = indexical_records;
            SubLObject indexical_record = NIL;
            for (indexical_record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical_record = cdolist_list_var.first()) {
                {
                    SubLObject indexical = sm_indexical_record_indexical(indexical_record);
                    SubLObject base = sm_indexical_record_preferred_phrase(indexical_record);
                    SubLObject variable = rkf_make_el_var(indexical, base);
                    sm_act_set_indexical_record_var(indexical_record, variable);
                    rkf_add_object_var_map_entry(v_object, list(variable, indexical_record));
                }
            }
        }
        return v_object;
    }

    public static SubLObject rkf_compute_and_record_variables(final SubLObject v_object, final SubLObject indexical_records) {
        rkf_rem_object_var_map(v_object);
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record);
            final SubLObject base = rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(indexical_record);
            final SubLObject variable = rkf_make_el_var(indexical, base);
            rkf_scenario_manipulator.sm_act_set_indexical_record_var(indexical_record, variable);
            rkf_add_object_var_map_entry(v_object, list(variable, indexical_record));
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return v_object;
    }

    public static final SubLObject rkf_add_object_var_map_entry_alt(SubLObject v_object, SubLObject item) {
        {
            SubLObject method_function = method_func(v_object, $rkf_add_object_var_map_entry_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object, item);
            }
            return item;
        }
    }

    public static SubLObject rkf_add_object_var_map_entry(final SubLObject v_object, final SubLObject item) {
        final SubLObject method_function = method_func(v_object, $rkf_add_object_var_map_entry_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object, item);
        }
        return item;
    }

    public static final SubLObject rkf_add_object_var_map_entry_qc_query_method_alt(SubLObject v_object, SubLObject item) {
        return qc_add_query_var_map_entry(v_object, item);
    }

    public static SubLObject rkf_add_object_var_map_entry_qc_query_method(final SubLObject v_object, final SubLObject item) {
        return qc_add_query_var_map_entry(v_object, item);
    }

    public static final SubLObject rkf_rem_object_var_map_alt(SubLObject v_object) {
        {
            SubLObject method_function = method_func(v_object, $rkf_rem_object_var_map_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object);
            }
            return v_object;
        }
    }

    public static SubLObject rkf_rem_object_var_map(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $rkf_rem_object_var_map_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return v_object;
    }

    public static final SubLObject rkf_rem_object_var_map_qc_query_method_alt(SubLObject v_object) {
        return qc_rem_query_var_map(v_object);
    }

    public static SubLObject rkf_rem_object_var_map_qc_query_method(final SubLObject v_object) {
        return qc_rem_query_var_map(v_object);
    }

    public static final SubLObject rkf_make_el_var_alt(SubLObject indexical, SubLObject base) {
        if (base == UNPROVIDED) {
            base = NIL;
        }
        {
            SubLObject type = sm_indexical_type(indexical);
            SubLObject number = sm_indexical_number(indexical);
            SubLObject basis = NIL;
            if (base.isString()) {
                basis = string_utilities.string_substitute($str_alt85$_, $str_alt86$_, base, UNPROVIDED);
                return cycl_variables.make_el_var(basis);
            } else {
                if (NIL != constant_p(type)) {
                    basis = constants_high.constant_name(type);
                } else {
                    if (NIL != nart_handles.nart_p(type)) {
                        basis = (NIL != constant_p(cycl_utilities.nat_arg0(type))) ? ((SubLObject) (constants_high.constant_name(cycl_utilities.nat_arg0(type)))) : $$$function;
                    }
                }
            }
            return cycl_variables.make_el_var(cconcatenate(basis, new SubLObject[]{ $str_alt85$_, format(NIL, $str_alt88$_A, number) }));
        }
    }

    public static SubLObject rkf_make_el_var(final SubLObject indexical, SubLObject base) {
        if (base == UNPROVIDED) {
            base = NIL;
        }
        final SubLObject type = rkf_scenario_manipulator.sm_indexical_type(indexical);
        final SubLObject number = rkf_scenario_manipulator.sm_indexical_number(indexical);
        SubLObject basis = NIL;
        if (base.isString()) {
            basis = string_utilities.string_substitute($str94$_, $$$_, base, UNPROVIDED);
            return cycl_variables.make_el_var(basis);
        }
        if (NIL != constant_p(type)) {
            basis = constants_high.constant_name(type);
        } else
            if (NIL != nart_handles.nart_p(type)) {
                basis = (NIL != constant_p(cycl_utilities.nat_arg0(type))) ? constants_high.constant_name(cycl_utilities.nat_arg0(type)) : $$$function;
            }

        return cycl_variables.make_el_var(cconcatenate(basis, new SubLObject[]{ $str94$_, format(NIL, $str97$_A, number) }));
    }

    /**
     * QUERY-CONSTRAINTS are conjunctified to form the core of the CycL.
     * VARIABLE-TERMS are indexical records whose indexicals will be turned into variables.
     * EXISTENTIAL-TERMS are a subset of VARIABLE-TERMS which are existentially quantified
     * outside the conjunction formed by the QUERY-CONSTRAINTS.
     * ASSUMED-CONSTRAINTS, if present, are conjunctified and used as the LHS of an implication
     * where the rest of the CycL appears on the RHS.
     */
    @LispMethod(comment = "QUERY-CONSTRAINTS are conjunctified to form the core of the CycL.\r\nVARIABLE-TERMS are indexical records whose indexicals will be turned into variables.\r\nEXISTENTIAL-TERMS are a subset of VARIABLE-TERMS which are existentially quantified\r\noutside the conjunction formed by the QUERY-CONSTRAINTS.\r\nASSUMED-CONSTRAINTS, if present, are conjunctified and used as the LHS of an implication\r\nwhere the rest of the CycL appears on the RHS.\nQUERY-CONSTRAINTS are conjunctified to form the core of the CycL.\nVARIABLE-TERMS are indexical records whose indexicals will be turned into variables.\nEXISTENTIAL-TERMS are a subset of VARIABLE-TERMS which are existentially quantified\noutside the conjunction formed by the QUERY-CONSTRAINTS.\nASSUMED-CONSTRAINTS, if present, are conjunctified and used as the LHS of an implication\nwhere the rest of the CycL appears on the RHS.")
    public static final SubLObject rkf_compute_cycl_from_parts_alt(SubLObject query_constraints, SubLObject variable_terms, SubLObject existential_terms, SubLObject assumed_constraints, SubLObject insert_explicit_typesP, SubLObject mt) {
        if (existential_terms == UNPROVIDED) {
            existential_terms = NIL;
        }
        if (assumed_constraints == UNPROVIDED) {
            assumed_constraints = NIL;
        }
        if (insert_explicit_typesP == UNPROVIDED) {
            insert_explicit_typesP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            SubLObject sentence_list = rkf_compute_cycl_from_terms_and_constraints(query_constraints, variable_terms, insert_explicit_typesP, mt);
            SubLObject cycl = rkf_sentence_from_conjuncts(sentence_list);
            SubLObject assumed_sentences = (NIL != assumed_constraints) ? ((SubLObject) (Mapping.mapcar(symbol_function(SM_CONSTRAINT_RECORD_SENTENCE), assumed_constraints))) : NIL;
            SubLObject assumed_cycl = (NIL != assumed_sentences) ? ((SubLObject) (rkf_sentence_from_conjuncts(assumed_sentences))) : NIL;
            SubLObject cdolist_list_var = variable_terms;
            SubLObject variable_term = NIL;
            for (variable_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_term = cdolist_list_var.first()) {
                {
                    SubLObject indexical = sm_indexical_record_indexical(variable_term);
                    SubLObject el_var = sm_indexical_record_var(variable_term);
                    if (NIL != subl_promotions.memberP(variable_term, existential_terms, UNPROVIDED, UNPROVIDED)) {
                        cycl = make_existential(indexical, cycl);
                    }
                    if (NIL != el_var) {
                        cycl = cycl_utilities.expression_subst(el_var, indexical, cycl, UNPROVIDED, UNPROVIDED);
                        assumed_cycl = cycl_utilities.expression_subst(el_var, indexical, assumed_cycl, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            if (NIL != assumed_cycl) {
                cycl = make_implication(assumed_cycl, cycl);
            }
            return cycl;
        }
    }

    @LispMethod(comment = "QUERY-CONSTRAINTS are conjunctified to form the core of the CycL.\r\nVARIABLE-TERMS are indexical records whose indexicals will be turned into variables.\r\nEXISTENTIAL-TERMS are a subset of VARIABLE-TERMS which are existentially quantified\r\noutside the conjunction formed by the QUERY-CONSTRAINTS.\r\nASSUMED-CONSTRAINTS, if present, are conjunctified and used as the LHS of an implication\r\nwhere the rest of the CycL appears on the RHS.\nQUERY-CONSTRAINTS are conjunctified to form the core of the CycL.\nVARIABLE-TERMS are indexical records whose indexicals will be turned into variables.\nEXISTENTIAL-TERMS are a subset of VARIABLE-TERMS which are existentially quantified\noutside the conjunction formed by the QUERY-CONSTRAINTS.\nASSUMED-CONSTRAINTS, if present, are conjunctified and used as the LHS of an implication\nwhere the rest of the CycL appears on the RHS.")
    public static SubLObject rkf_compute_cycl_from_parts(final SubLObject query_constraints, final SubLObject variable_terms, SubLObject existential_terms, SubLObject assumed_constraints, SubLObject insert_explicit_typesP, SubLObject mt) {
        if (existential_terms == UNPROVIDED) {
            existential_terms = NIL;
        }
        if (assumed_constraints == UNPROVIDED) {
            assumed_constraints = NIL;
        }
        if (insert_explicit_typesP == UNPROVIDED) {
            insert_explicit_typesP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLObject sentence_list = rkf_compute_cycl_from_terms_and_constraints(query_constraints, variable_terms, insert_explicit_typesP, mt);
        SubLObject cycl = rkf_sentence_from_conjuncts(sentence_list);
        final SubLObject assumed_sentences = (NIL != assumed_constraints) ? Mapping.mapcar(symbol_function(SM_CONSTRAINT_RECORD_SENTENCE), assumed_constraints) : NIL;
        SubLObject assumed_cycl = (NIL != assumed_sentences) ? rkf_sentence_from_conjuncts(assumed_sentences) : NIL;
        SubLObject cdolist_list_var = variable_terms;
        SubLObject variable_term = NIL;
        variable_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(variable_term);
            final SubLObject el_var = rkf_scenario_manipulator.sm_indexical_record_var(variable_term);
            if (NIL != subl_promotions.memberP(variable_term, existential_terms, UNPROVIDED, UNPROVIDED)) {
                cycl = make_existential(indexical, cycl);
            }
            if (NIL != el_var) {
                cycl = cycl_utilities.expression_subst(el_var, indexical, cycl, UNPROVIDED, UNPROVIDED);
                assumed_cycl = cycl_utilities.expression_subst(el_var, indexical, assumed_cycl, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable_term = cdolist_list_var.first();
        } 
        if (NIL != assumed_cycl) {
            cycl = make_implication(assumed_cycl, cycl);
        }
        return cycl;
    }

    public static final SubLObject rkf_sentence_from_conjuncts_alt(SubLObject conjuncts) {
        return NIL != list_utilities.singletonP(conjuncts) ? ((SubLObject) (conjuncts.first())) : make_conjunction(conjuncts);
    }

    public static SubLObject rkf_sentence_from_conjuncts(final SubLObject conjuncts) {
        return NIL != list_utilities.singletonP(conjuncts) ? conjuncts.first() : make_conjunction(conjuncts);
    }

    public static final SubLObject rkf_compute_cycl_from_terms_and_constraints_alt(SubLObject query_constraints, SubLObject variable_terms, SubLObject insert_explicit_typesP, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject base_sentences = Mapping.mapcar(symbol_function(SM_CONSTRAINT_RECORD_SENTENCE), query_constraints);
                SubLObject additional_sentences = NIL;
                if (NIL != insert_explicit_typesP) {
                    {
                        SubLObject cdolist_list_var = variable_terms;
                        SubLObject variable_term = NIL;
                        for (variable_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_term = cdolist_list_var.first()) {
                            {
                                SubLObject indexical = sm_indexical_record_indexical(variable_term);
                                thread.resetMultipleValues();
                                {
                                    SubLObject isas = sm_term_requires_types_in_relations(indexical, base_sentences, mt);
                                    SubLObject v_genls = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != isas) {
                                        {
                                            SubLObject cdolist_list_var_1 = sm_indexical_record_explicit_isas(variable_term);
                                            SubLObject v_isa = NIL;
                                            for (v_isa = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , v_isa = cdolist_list_var_1.first()) {
                                                {
                                                    SubLObject tight_constraints = genls.min_cols(cons(v_isa, copy_list(isas)), mt, UNPROVIDED);
                                                    if (NIL != subl_promotions.memberP(v_isa, tight_constraints, UNPROVIDED, UNPROVIDED)) {
                                                        {
                                                            SubLObject cdolist_list_var_2 = tight_constraints;
                                                            SubLObject constraint = NIL;
                                                            for (constraint = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , constraint = cdolist_list_var_2.first()) {
                                                                {
                                                                    SubLObject item_var = make_binary_formula($$isa, indexical, constraint);
                                                                    if (NIL == member(item_var, additional_sentences, EQUAL, symbol_function(IDENTITY))) {
                                                                        additional_sentences = cons(item_var, additional_sentences);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL != v_genls) {
                                        {
                                            SubLObject cdolist_list_var_3 = sm_indexical_record_explicit_genls(variable_term);
                                            SubLObject genl = NIL;
                                            for (genl = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , genl = cdolist_list_var_3.first()) {
                                                {
                                                    SubLObject tight_constraints = genls.min_cols(cons(genl, copy_list(v_genls)), mt, UNPROVIDED);
                                                    if (NIL != subl_promotions.memberP(genl, tight_constraints, UNPROVIDED, UNPROVIDED)) {
                                                        {
                                                            SubLObject cdolist_list_var_4 = tight_constraints;
                                                            SubLObject constraint = NIL;
                                                            for (constraint = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , constraint = cdolist_list_var_4.first()) {
                                                                {
                                                                    SubLObject item_var = make_binary_formula($$genls, indexical, constraint);
                                                                    if (NIL == member(item_var, additional_sentences, EQUAL, symbol_function(IDENTITY))) {
                                                                        additional_sentences = cons(item_var, additional_sentences);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL != additional_sentences ? ((SubLObject) (append(base_sentences, additional_sentences))) : base_sentences;
            }
        }
    }

    public static SubLObject rkf_compute_cycl_from_terms_and_constraints(final SubLObject query_constraints, final SubLObject variable_terms, final SubLObject insert_explicit_typesP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject base_sentences = Mapping.mapcar(symbol_function(SM_CONSTRAINT_RECORD_SENTENCE), query_constraints);
        SubLObject additional_sentences = NIL;
        if (NIL != insert_explicit_typesP) {
            SubLObject cdolist_list_var = variable_terms;
            SubLObject variable_term = NIL;
            variable_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(variable_term);
                thread.resetMultipleValues();
                final SubLObject isas = rkf_scenario_manipulator.sm_term_requires_types_in_relations(indexical, base_sentences, mt);
                final SubLObject v_genls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != isas) {
                    SubLObject cdolist_list_var_$1 = rkf_scenario_manipulator.sm_indexical_record_explicit_isas(variable_term);
                    SubLObject v_isa = NIL;
                    v_isa = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        final SubLObject tight_constraints = genls.min_cols(cons(v_isa, copy_list(isas)), mt, UNPROVIDED);
                        if (NIL != subl_promotions.memberP(v_isa, tight_constraints, UNPROVIDED, UNPROVIDED)) {
                            SubLObject cdolist_list_var_$2 = tight_constraints;
                            SubLObject constraint = NIL;
                            constraint = cdolist_list_var_$2.first();
                            while (NIL != cdolist_list_var_$2) {
                                final SubLObject item_var = make_binary_formula($$isa, indexical, constraint);
                                if (NIL == member(item_var, additional_sentences, EQUAL, symbol_function(IDENTITY))) {
                                    additional_sentences = cons(item_var, additional_sentences);
                                }
                                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                constraint = cdolist_list_var_$2.first();
                            } 
                        }
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        v_isa = cdolist_list_var_$1.first();
                    } 
                }
                if (NIL != v_genls) {
                    SubLObject cdolist_list_var_$3 = rkf_scenario_manipulator.sm_indexical_record_explicit_genls(variable_term);
                    SubLObject genl = NIL;
                    genl = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        final SubLObject tight_constraints = genls.min_cols(cons(genl, copy_list(v_genls)), mt, UNPROVIDED);
                        if (NIL != subl_promotions.memberP(genl, tight_constraints, UNPROVIDED, UNPROVIDED)) {
                            SubLObject cdolist_list_var_$4 = tight_constraints;
                            SubLObject constraint = NIL;
                            constraint = cdolist_list_var_$4.first();
                            while (NIL != cdolist_list_var_$4) {
                                final SubLObject item_var = make_binary_formula($$genls, indexical, constraint);
                                if (NIL == member(item_var, additional_sentences, EQUAL, symbol_function(IDENTITY))) {
                                    additional_sentences = cons(item_var, additional_sentences);
                                }
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                constraint = cdolist_list_var_$4.first();
                            } 
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        genl = cdolist_list_var_$3.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                variable_term = cdolist_list_var.first();
            } 
        }
        return NIL != additional_sentences ? append(base_sentences, additional_sentences) : base_sentences;
    }

    public static final SubLObject qc_act_initialize_query_from_cycl_alt(SubLObject state, SubLObject cycl_query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_interaction_mt = qc_state_domain_interaction_mt(state);
                SubLObject generation_mt = qc_state_generation_mt(state);
                SubLObject lhs = NIL;
                SubLObject rhs = NIL;
                if (NIL != el_general_implication_p(cycl_query)) {
                    lhs = cycl_utilities.formula_arg1(cycl_query, UNPROVIDED);
                    rhs = cycl_utilities.formula_arg2(cycl_query, UNPROVIDED);
                } else {
                    rhs = cycl_query;
                }
                thread.resetMultipleValues();
                {
                    SubLObject v_scenario = sm_act_initialize_scenario_from_cycl(qc_strip_existentials(rhs), domain_interaction_mt, generation_mt);
                    SubLObject var_map = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject query = qc_act_initialize_query_from_scenario(state, v_scenario);
                        SubLObject dont_cares = qc_identify_dont_care_irs(rhs, var_map);
                        qc_set_state_query(state, query);
                        {
                            SubLObject cdolist_list_var = dont_cares;
                            SubLObject dont_care = NIL;
                            for (dont_care = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dont_care = cdolist_list_var.first()) {
                                qc_act_register_dont_care(state, dont_care);
                            }
                        }
                        if (NIL != lhs) {
                            thread.resetMultipleValues();
                            {
                                SubLObject add_scenario = sm_act_initialize_scenario_from_cycl(qc_strip_existentials(lhs), domain_interaction_mt, generation_mt);
                                SubLObject add_var_map = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject cdolist_list_var = sm_scenario_constraints(add_scenario);
                                    SubLObject constraint = NIL;
                                    for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                        {
                                            SubLObject cdolist_list_var_5 = add_var_map;
                                            SubLObject var_rec = NIL;
                                            for (var_rec = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , var_rec = cdolist_list_var_5.first()) {
                                                {
                                                    SubLObject datum = var_rec;
                                                    SubLObject current = datum;
                                                    SubLObject el_variable = NIL;
                                                    SubLObject indexical_record = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt92);
                                                    el_variable = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt92);
                                                    indexical_record = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        {
                                                            SubLObject indexical = sm_indexical_record_indexical(indexical_record);
                                                            SubLObject correct_indexical_record = second(assoc(el_variable, var_map, UNPROVIDED, UNPROVIDED));
                                                            SubLObject correct_indexical = sm_indexical_record_indexical(correct_indexical_record);
                                                            cycl_utilities.expression_nsubst(el_variable, indexical, sm_constraint_record_sentence(constraint), symbol_function(EQUAL), UNPROVIDED);
                                                            cycl_utilities.expression_nsubst(correct_indexical, el_variable, sm_constraint_record_sentence(constraint), symbol_function(EQUAL), UNPROVIDED);
                                                            qc_act_register_assumed_constraint(state, constraint);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt92);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return query;
                    }
                }
            }
        }
    }

    public static SubLObject qc_act_initialize_query_from_cycl(final SubLObject state, final SubLObject cycl_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject domain_interaction_mt = qc_state_domain_interaction_mt(state);
        final SubLObject generation_mt = qc_state_generation_mt(state);
        SubLObject lhs = NIL;
        SubLObject rhs = NIL;
        if (NIL != el_general_implication_p(cycl_query)) {
            lhs = cycl_utilities.formula_arg1(cycl_query, UNPROVIDED);
            rhs = cycl_utilities.formula_arg2(cycl_query, UNPROVIDED);
        } else {
            rhs = cycl_query;
        }
        thread.resetMultipleValues();
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl(qc_strip_existentials(rhs), domain_interaction_mt, generation_mt);
        final SubLObject var_map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject query = qc_act_initialize_query_from_scenario(state, v_scenario);
        final SubLObject dont_cares = qc_identify_dont_care_irs(rhs, var_map);
        qc_set_state_query(state, query);
        SubLObject cdolist_list_var = dont_cares;
        SubLObject dont_care = NIL;
        dont_care = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            qc_act_register_dont_care(state, dont_care);
            cdolist_list_var = cdolist_list_var.rest();
            dont_care = cdolist_list_var.first();
        } 
        if (NIL != lhs) {
            thread.resetMultipleValues();
            final SubLObject add_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl(qc_strip_existentials(lhs), domain_interaction_mt, generation_mt);
            final SubLObject add_var_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var2 = rkf_scenario_manipulator.sm_scenario_constraints(add_scenario);
            SubLObject constraint = NIL;
            constraint = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$5 = add_var_map;
                SubLObject var_rec = NIL;
                var_rec = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    SubLObject current;
                    final SubLObject datum = current = var_rec;
                    SubLObject el_variable = NIL;
                    SubLObject indexical_record = NIL;
                    destructuring_bind_must_consp(current, datum, $list101);
                    el_variable = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list101);
                    indexical_record = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record);
                        final SubLObject correct_indexical_record = second(assoc(el_variable, var_map, UNPROVIDED, UNPROVIDED));
                        final SubLObject correct_indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(correct_indexical_record);
                        cycl_utilities.expression_nsubst(el_variable, indexical, rkf_scenario_manipulator.sm_constraint_record_sentence(constraint), symbol_function(EQUAL), UNPROVIDED);
                        cycl_utilities.expression_nsubst(correct_indexical, el_variable, rkf_scenario_manipulator.sm_constraint_record_sentence(constraint), symbol_function(EQUAL), UNPROVIDED);
                        qc_act_register_assumed_constraint(state, constraint);
                    } else {
                        cdestructuring_bind_error(datum, $list101);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    var_rec = cdolist_list_var_$5.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                constraint = cdolist_list_var2.first();
            } 
        }
        return query;
    }

    public static final SubLObject qc_identify_dont_care_irs_alt(SubLObject cycl_query, SubLObject var_map) {
        {
            SubLObject dont_care_vars = qc_extract_dont_care_vars(cycl_query);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = dont_care_vars;
            SubLObject dont_care_var = NIL;
            for (dont_care_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dont_care_var = cdolist_list_var.first()) {
                {
                    SubLObject indexical_record = second(assoc(dont_care_var, var_map, UNPROVIDED, UNPROVIDED));
                    result = cons(indexical_record, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject qc_identify_dont_care_irs(final SubLObject cycl_query, final SubLObject var_map) {
        final SubLObject dont_care_vars = qc_extract_dont_care_vars(cycl_query);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = dont_care_vars;
        SubLObject dont_care_var = NIL;
        dont_care_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical_record = second(assoc(dont_care_var, var_map, UNPROVIDED, UNPROVIDED));
            result = cons(indexical_record, result);
            cdolist_list_var = cdolist_list_var.rest();
            dont_care_var = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject qc_extract_dont_care_vars_alt(SubLObject cycl_query) {
        if (NIL != el_existential_p(cycl_query)) {
            return cons(cycl_utilities.sentence_arg1(cycl_query, UNPROVIDED), qc_extract_dont_care_vars(cycl_utilities.sentence_arg2(cycl_query, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject qc_extract_dont_care_vars(final SubLObject cycl_query) {
        if (NIL != el_existential_p(cycl_query)) {
            return cons(cycl_utilities.sentence_arg1(cycl_query, UNPROVIDED), qc_extract_dont_care_vars(cycl_utilities.sentence_arg2(cycl_query, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject qc_strip_existentials_alt(SubLObject cycl_query) {
        if (NIL != el_existential_p(cycl_query)) {
            return qc_strip_existentials(cycl_utilities.sentence_arg2(cycl_query, UNPROVIDED));
        }
        return cycl_query;
    }

    public static SubLObject qc_strip_existentials(final SubLObject cycl_query) {
        if (NIL != el_existential_p(cycl_query)) {
            return qc_strip_existentials(cycl_utilities.sentence_arg2(cycl_query, UNPROVIDED));
        }
        return cycl_query;
    }

    public static final SubLObject qc_act_register_query_alt(SubLObject state, SubLObject query) {
        qc_set_state_query(state, query);
        return state;
    }

    public static SubLObject qc_act_register_query(final SubLObject state, final SubLObject query) {
        qc_set_state_query(state, query);
        return state;
    }

    public static final SubLObject qc_act_register_dont_care_alt(SubLObject state, SubLObject dont_care) {
        {
            SubLObject query = qc_state_query(state);
            qc_rem_query_return_term(query, dont_care);
            qc_compute_and_record_query_cycl(query);
            return state;
        }
    }

    public static SubLObject qc_act_register_dont_care(final SubLObject state, final SubLObject dont_care) {
        final SubLObject query = qc_state_query(state);
        qc_rem_query_return_term(query, dont_care);
        qc_compute_and_record_query_cycl(query);
        return state;
    }

    public static final SubLObject qc_act_deregister_dont_care_alt(SubLObject state, SubLObject indexical_record) {
        {
            SubLObject query = qc_state_query(state);
            qc_add_query_return_term(query, indexical_record);
            qc_compute_and_record_query_cycl(query);
            return state;
        }
    }

    public static SubLObject qc_act_deregister_dont_care(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject query = qc_state_query(state);
        qc_add_query_return_term(query, indexical_record);
        qc_compute_and_record_query_cycl(query);
        return state;
    }

    public static final SubLObject qc_act_register_assumed_term_alt(SubLObject state, SubLObject indexical_record) {
        {
            SubLObject query = qc_state_query(state);
            qc_add_query_assumed_term(query, indexical_record);
            qc_rem_query_return_term(query, indexical_record);
            qc_compute_and_record_query_cycl(query);
            return state;
        }
    }

    public static SubLObject qc_act_register_assumed_term(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject query = qc_state_query(state);
        qc_add_query_assumed_term(query, indexical_record);
        qc_rem_query_return_term(query, indexical_record);
        qc_compute_and_record_query_cycl(query);
        return state;
    }

    public static final SubLObject qc_act_deregister_assumed_term_alt(SubLObject state, SubLObject indexical_record) {
        {
            SubLObject query = qc_state_query(state);
            qc_rem_query_assumed_term(query, indexical_record);
            qc_add_query_return_term(query, indexical_record);
            qc_compute_and_record_query_cycl(query);
            return state;
        }
    }

    public static SubLObject qc_act_deregister_assumed_term(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject query = qc_state_query(state);
        qc_rem_query_assumed_term(query, indexical_record);
        qc_add_query_return_term(query, indexical_record);
        qc_compute_and_record_query_cycl(query);
        return state;
    }

    public static final SubLObject qc_act_register_assumed_constraint_alt(SubLObject state, SubLObject constraint_record) {
        {
            SubLObject query = qc_state_query(state);
            qc_add_query_assumed_constraint(query, constraint_record);
            {
                SubLObject sentence = sm_constraint_record_sentence(constraint_record);
                SubLObject assumed_indexicals = cycl_utilities.expression_gather(sentence, symbol_function(SM_INDEXICAL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = assumed_indexicals;
                SubLObject assumed_indexical = NIL;
                for (assumed_indexical = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assumed_indexical = cdolist_list_var.first()) {
                    {
                        SubLObject assumed_term = find(assumed_indexical, qc_query_terms(query), symbol_function(EQ), symbol_function(SM_INDEXICAL_RECORD_INDEXICAL), UNPROVIDED, UNPROVIDED);
                        qc_act_register_assumed_term(state, assumed_term);
                    }
                }
            }
            qc_compute_and_record_query_cycl(query);
            return state;
        }
    }

    public static SubLObject qc_act_register_assumed_constraint(final SubLObject state, final SubLObject constraint_record) {
        final SubLObject query = qc_state_query(state);
        qc_add_query_assumed_constraint(query, constraint_record);
        final SubLObject sentence = rkf_scenario_manipulator.sm_constraint_record_sentence(constraint_record);
        SubLObject cdolist_list_var;
        final SubLObject assumed_indexicals = cdolist_list_var = cycl_utilities.expression_gather(sentence, symbol_function(SM_INDEXICAL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject assumed_indexical = NIL;
        assumed_indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assumed_term = find(assumed_indexical, qc_query_terms(query), symbol_function(EQ), symbol_function(SM_INDEXICAL_RECORD_INDEXICAL), UNPROVIDED, UNPROVIDED);
            qc_act_register_assumed_term(state, assumed_term);
            cdolist_list_var = cdolist_list_var.rest();
            assumed_indexical = cdolist_list_var.first();
        } 
        qc_compute_and_record_query_cycl(query);
        return state;
    }

    public static final SubLObject qc_act_deregister_assumed_constraint_alt(SubLObject state, SubLObject constraint_record) {
        {
            SubLObject query = qc_state_query(state);
            qc_rem_query_assumed_constraint(query, constraint_record);
            {
                SubLObject sentence = sm_constraint_record_sentence(constraint_record);
                SubLObject assumed_indexicals = cycl_utilities.expression_gather(sentence, symbol_function(SM_INDEXICAL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject other_assumed_sentences = Mapping.mapcar(symbol_function(SM_CONSTRAINT_RECORD_SENTENCE), qc_query_assumed_constraints(query));
                SubLObject other_assumed_indexicals = cycl_utilities.expression_gather(other_assumed_sentences, symbol_function(SM_INDEXICAL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = assumed_indexicals;
                SubLObject assumed_indexical = NIL;
                for (assumed_indexical = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assumed_indexical = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(assumed_indexical, other_assumed_indexicals, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject assumed_term = find(assumed_indexical, qc_query_terms(query), symbol_function(EQ), symbol_function(SM_INDEXICAL_RECORD_INDEXICAL), UNPROVIDED, UNPROVIDED);
                            qc_act_deregister_assumed_term(state, assumed_term);
                        }
                    }
                }
            }
            qc_compute_and_record_query_cycl(query);
            return state;
        }
    }

    public static SubLObject qc_act_deregister_assumed_constraint(final SubLObject state, final SubLObject constraint_record) {
        final SubLObject query = qc_state_query(state);
        qc_rem_query_assumed_constraint(query, constraint_record);
        final SubLObject sentence = rkf_scenario_manipulator.sm_constraint_record_sentence(constraint_record);
        final SubLObject assumed_indexicals = cycl_utilities.expression_gather(sentence, symbol_function(SM_INDEXICAL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject other_assumed_sentences = Mapping.mapcar(symbol_function(SM_CONSTRAINT_RECORD_SENTENCE), qc_query_assumed_constraints(query));
        final SubLObject other_assumed_indexicals = cycl_utilities.expression_gather(other_assumed_sentences, symbol_function(SM_INDEXICAL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = assumed_indexicals;
        SubLObject assumed_indexical = NIL;
        assumed_indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(assumed_indexical, other_assumed_indexicals, UNPROVIDED, UNPROVIDED)) {
                final SubLObject assumed_term = find(assumed_indexical, qc_query_terms(query), symbol_function(EQ), symbol_function(SM_INDEXICAL_RECORD_INDEXICAL), UNPROVIDED, UNPROVIDED);
                qc_act_deregister_assumed_term(state, assumed_term);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assumed_indexical = cdolist_list_var.first();
        } 
        qc_compute_and_record_query_cycl(query);
        return state;
    }

    public static final SubLObject qc_act_query_cycl_alt(SubLObject state) {
        {
            SubLObject query = qc_state_query(state);
            return qc_query_cycl(query);
        }
    }

    public static SubLObject qc_act_query_cycl(final SubLObject state) {
        final SubLObject query = qc_state_query(state);
        return qc_query_cycl(query);
    }

    public static SubLObject declare_rkf_query_constructor_file() {
        declareMacro("with_qc_lock", "WITH-QC-LOCK");
        declareFunction("qc_find_query_by_id", "QC-FIND-QUERY-BY-ID", 1, 0, false);
        declareFunction("qc_find_query_by_id_string", "QC-FIND-QUERY-BY-ID-STRING", 1, 0, false);
        declareFunction("qc_find_state_by_id", "QC-FIND-STATE-BY-ID", 1, 0, false);
        declareFunction("qc_find_state_by_id_string", "QC-FIND-STATE-BY-ID-STRING", 1, 0, false);
        declareFunction("qc_next_id", "QC-NEXT-ID", 0, 0, false);
        declareFunction("qc_add_object", "QC-ADD-OBJECT", 2, 0, false);
        declareFunction("qc_rem_object", "QC-REM-OBJECT", 1, 0, false);
        declareFunction("qc_find_object_by_id", "QC-FIND-OBJECT-BY-ID", 1, 0, false);
        declareFunction("qc_query_print_function_trampoline", "QC-QUERY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("qc_query_p", "QC-QUERY-P", 1, 0, false);
        new rkf_query_constructor.$qc_query_p$UnaryFunction();
        declareFunction("qc_query_id", "QC-QUERY-ID", 1, 0, false);
        declareFunction("qc_query_cycl", "QC-QUERY-CYCL", 1, 0, false);
        declareFunction("qc_query_terms", "QC-QUERY-TERMS", 1, 0, false);
        declareFunction("qc_query_return_terms", "QC-QUERY-RETURN-TERMS", 1, 0, false);
        declareFunction("qc_query_constraints", "QC-QUERY-CONSTRAINTS", 1, 0, false);
        declareFunction("qc_query_var_map", "QC-QUERY-VAR-MAP", 1, 0, false);
        declareFunction("qc_query_scenario", "QC-QUERY-SCENARIO", 1, 0, false);
        declareFunction("qc_query_assumed_terms", "QC-QUERY-ASSUMED-TERMS", 1, 0, false);
        declareFunction("qc_query_assumed_constraints", "QC-QUERY-ASSUMED-CONSTRAINTS", 1, 0, false);
        declareFunction("_csetf_qc_query_id", "_CSETF-QC-QUERY-ID", 2, 0, false);
        declareFunction("_csetf_qc_query_cycl", "_CSETF-QC-QUERY-CYCL", 2, 0, false);
        declareFunction("_csetf_qc_query_terms", "_CSETF-QC-QUERY-TERMS", 2, 0, false);
        declareFunction("_csetf_qc_query_return_terms", "_CSETF-QC-QUERY-RETURN-TERMS", 2, 0, false);
        declareFunction("_csetf_qc_query_constraints", "_CSETF-QC-QUERY-CONSTRAINTS", 2, 0, false);
        declareFunction("_csetf_qc_query_var_map", "_CSETF-QC-QUERY-VAR-MAP", 2, 0, false);
        declareFunction("_csetf_qc_query_scenario", "_CSETF-QC-QUERY-SCENARIO", 2, 0, false);
        declareFunction("_csetf_qc_query_assumed_terms", "_CSETF-QC-QUERY-ASSUMED-TERMS", 2, 0, false);
        declareFunction("_csetf_qc_query_assumed_constraints", "_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS", 2, 0, false);
        declareFunction("make_qc_query", "MAKE-QC-QUERY", 0, 1, false);
        declareFunction("visit_defstruct_qc_query", "VISIT-DEFSTRUCT-QC-QUERY", 2, 0, false);
        declareFunction("visit_defstruct_object_qc_query_method", "VISIT-DEFSTRUCT-OBJECT-QC-QUERY-METHOD", 2, 0, false);
        declareFunction("qc_new_query", "QC-NEW-QUERY", 0, 0, false);
        declareFunction("qc_cleanup_query", "QC-CLEANUP-QUERY", 1, 0, false);
        declareFunction("qc_set_query_cycl", "QC-SET-QUERY-CYCL", 2, 0, false);
        declareFunction("qc_set_query_terms", "QC-SET-QUERY-TERMS", 2, 0, false);
        declareFunction("qc_add_query_return_term", "QC-ADD-QUERY-RETURN-TERM", 2, 0, false);
        declareFunction("qc_rem_query_return_term", "QC-REM-QUERY-RETURN-TERM", 2, 0, false);
        declareFunction("qc_set_query_return_terms", "QC-SET-QUERY-RETURN-TERMS", 2, 0, false);
        declareFunction("qc_set_query_constraints", "QC-SET-QUERY-CONSTRAINTS", 2, 0, false);
        declareFunction("qc_add_query_var_map_entry", "QC-ADD-QUERY-VAR-MAP-ENTRY", 2, 0, false);
        declareFunction("qc_rem_query_var_map", "QC-REM-QUERY-VAR-MAP", 1, 0, false);
        declareFunction("qc_set_query_scenario", "QC-SET-QUERY-SCENARIO", 2, 0, false);
        declareFunction("qc_add_query_assumed_term", "QC-ADD-QUERY-ASSUMED-TERM", 2, 0, false);
        declareFunction("qc_rem_query_assumed_term", "QC-REM-QUERY-ASSUMED-TERM", 2, 0, false);
        declareFunction("qc_set_query_assumed_terms", "QC-SET-QUERY-ASSUMED-TERMS", 2, 0, false);
        declareFunction("qc_add_query_assumed_constraint", "QC-ADD-QUERY-ASSUMED-CONSTRAINT", 2, 0, false);
        declareFunction("qc_rem_query_assumed_constraint", "QC-REM-QUERY-ASSUMED-CONSTRAINT", 2, 0, false);
        declareFunction("qc_set_query_assumed_constraints", "QC-SET-QUERY-ASSUMED-CONSTRAINTS", 2, 0, false);
        declareFunction("qc_state_print_function_trampoline", "QC-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("qc_state_p", "QC-STATE-P", 1, 0, false);
        new rkf_query_constructor.$qc_state_p$UnaryFunction();
        declareFunction("qc_state_id", "QC-STATE-ID", 1, 0, false);
        declareFunction("qc_state_text", "QC-STATE-TEXT", 1, 0, false);
        declareFunction("qc_state_candidates", "QC-STATE-CANDIDATES", 1, 0, false);
        declareFunction("qc_state_query", "QC-STATE-QUERY", 1, 0, false);
        declareFunction("qc_state_interaction", "QC-STATE-INTERACTION", 1, 0, false);
        declareFunction("qc_state_parsing_mt", "QC-STATE-PARSING-MT", 1, 0, false);
        declareFunction("qc_state_generation_mt", "QC-STATE-GENERATION-MT", 1, 0, false);
        declareFunction("qc_state_domain_mt", "QC-STATE-DOMAIN-MT", 1, 0, false);
        declareFunction("qc_state_domain_interaction_mt", "QC-STATE-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("_csetf_qc_state_id", "_CSETF-QC-STATE-ID", 2, 0, false);
        declareFunction("_csetf_qc_state_text", "_CSETF-QC-STATE-TEXT", 2, 0, false);
        declareFunction("_csetf_qc_state_candidates", "_CSETF-QC-STATE-CANDIDATES", 2, 0, false);
        declareFunction("_csetf_qc_state_query", "_CSETF-QC-STATE-QUERY", 2, 0, false);
        declareFunction("_csetf_qc_state_interaction", "_CSETF-QC-STATE-INTERACTION", 2, 0, false);
        declareFunction("_csetf_qc_state_parsing_mt", "_CSETF-QC-STATE-PARSING-MT", 2, 0, false);
        declareFunction("_csetf_qc_state_generation_mt", "_CSETF-QC-STATE-GENERATION-MT", 2, 0, false);
        declareFunction("_csetf_qc_state_domain_mt", "_CSETF-QC-STATE-DOMAIN-MT", 2, 0, false);
        declareFunction("_csetf_qc_state_domain_interaction_mt", "_CSETF-QC-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        declareFunction("make_qc_state", "MAKE-QC-STATE", 0, 1, false);
        declareFunction("visit_defstruct_qc_state", "VISIT-DEFSTRUCT-QC-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_qc_state_method", "VISIT-DEFSTRUCT-OBJECT-QC-STATE-METHOD", 2, 0, false);
        declareFunction("qc_new_state", "QC-NEW-STATE", 0, 0, false);
        declareFunction("qc_cleanup_state", "QC-CLEANUP-STATE", 1, 0, false);
        declareFunction("qc_set_state_text", "QC-SET-STATE-TEXT", 2, 0, false);
        declareFunction("qc_set_state_candidates", "QC-SET-STATE-CANDIDATES", 2, 0, false);
        declareFunction("qc_set_state_query", "QC-SET-STATE-QUERY", 2, 0, false);
        declareFunction("qc_set_state_interaction", "QC-SET-STATE-INTERACTION", 2, 0, false);
        declareFunction("qc_set_state_parsing_mt", "QC-SET-STATE-PARSING-MT", 2, 0, false);
        declareFunction("qc_set_state_generation_mt", "QC-SET-STATE-GENERATION-MT", 2, 0, false);
        declareFunction("qc_set_state_domain_mt", "QC-SET-STATE-DOMAIN-MT", 2, 0, false);
        declareFunction("qc_set_state_domain_interaction_mt", "QC-SET-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        declareFunction("qc_assumable_constraint_p", "QC-ASSUMABLE-CONSTRAINT-P", 2, 0, false);
        declareFunction("qc_act_new_state", "QC-ACT-NEW-STATE", 0, 0, false);
        declareFunction("qc_act_new_state_with_text", "QC-ACT-NEW-STATE-WITH-TEXT", 1, 0, false);
        declareFunction("qc_act_note_state_interaction", "QC-ACT-NOTE-STATE-INTERACTION", 2, 0, false);
        declareFunction("qc_act_note_state_query", "QC-ACT-NOTE-STATE-QUERY", 2, 0, false);
        declareFunction("qc_act_initialize_state_context", "QC-ACT-INITIALIZE-STATE-CONTEXT", 1, 0, false);
        declareFunction("qc_act_candidate_scenario_expressions", "QC-ACT-CANDIDATE-SCENARIO-EXPRESSIONS", 2, 0, false);
        declareFunction("qc_act_initialize_scenario_from_expression", "QC-ACT-INITIALIZE-SCENARIO-FROM-EXPRESSION", 2, 0, false);
        declareFunction("qc_act_initialize_query_from_scenario", "QC-ACT-INITIALIZE-QUERY-FROM-SCENARIO", 2, 0, false);
        declareFunction("qc_compute_and_record_variables", "QC-COMPUTE-AND-RECORD-VARIABLES", 1, 0, false);
        declareFunction("qc_compute_set_difference", "QC-COMPUTE-SET-DIFFERENCE", 2, 0, false);
        declareFunction("qc_compute_and_record_query_cycl", "QC-COMPUTE-AND-RECORD-QUERY-CYCL", 1, 0, false);
        declareFunction("rkf_compute_and_record_variables", "RKF-COMPUTE-AND-RECORD-VARIABLES", 2, 0, false);
        declareFunction("rkf_add_object_var_map_entry", "RKF-ADD-OBJECT-VAR-MAP-ENTRY", 2, 0, false);
        declareFunction("rkf_add_object_var_map_entry_qc_query_method", "RKF-ADD-OBJECT-VAR-MAP-ENTRY-QC-QUERY-METHOD", 2, 0, false);
        declareFunction("rkf_rem_object_var_map", "RKF-REM-OBJECT-VAR-MAP", 1, 0, false);
        declareFunction("rkf_rem_object_var_map_qc_query_method", "RKF-REM-OBJECT-VAR-MAP-QC-QUERY-METHOD", 1, 0, false);
        declareFunction("rkf_make_el_var", "RKF-MAKE-EL-VAR", 1, 1, false);
        declareFunction("rkf_compute_cycl_from_parts", "RKF-COMPUTE-CYCL-FROM-PARTS", 2, 4, false);
        declareFunction("rkf_sentence_from_conjuncts", "RKF-SENTENCE-FROM-CONJUNCTS", 1, 0, false);
        declareFunction("rkf_compute_cycl_from_terms_and_constraints", "RKF-COMPUTE-CYCL-FROM-TERMS-AND-CONSTRAINTS", 4, 0, false);
        declareFunction("qc_act_initialize_query_from_cycl", "QC-ACT-INITIALIZE-QUERY-FROM-CYCL", 2, 0, false);
        declareFunction("qc_identify_dont_care_irs", "QC-IDENTIFY-DONT-CARE-IRS", 2, 0, false);
        declareFunction("qc_extract_dont_care_vars", "QC-EXTRACT-DONT-CARE-VARS", 1, 0, false);
        declareFunction("qc_strip_existentials", "QC-STRIP-EXISTENTIALS", 1, 0, false);
        declareFunction("qc_act_register_query", "QC-ACT-REGISTER-QUERY", 2, 0, false);
        declareFunction("qc_act_register_dont_care", "QC-ACT-REGISTER-DONT-CARE", 2, 0, false);
        declareFunction("qc_act_deregister_dont_care", "QC-ACT-DEREGISTER-DONT-CARE", 2, 0, false);
        declareFunction("qc_act_register_assumed_term", "QC-ACT-REGISTER-ASSUMED-TERM", 2, 0, false);
        declareFunction("qc_act_deregister_assumed_term", "QC-ACT-DEREGISTER-ASSUMED-TERM", 2, 0, false);
        declareFunction("qc_act_register_assumed_constraint", "QC-ACT-REGISTER-ASSUMED-CONSTRAINT", 2, 0, false);
        declareFunction("qc_act_deregister_assumed_constraint", "QC-ACT-DEREGISTER-ASSUMED-CONSTRAINT", 2, 0, false);
        declareFunction("qc_act_query_cycl", "QC-ACT-QUERY-CYCL", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("*QC-LOCK*"));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("CYCL"), makeSymbol("TERMS"), makeSymbol("RETURN-TERMS"), makeSymbol("CONSTRAINTS"), makeSymbol("VAR-MAP"), makeSymbol("SCENARIO"), makeSymbol("ASSUMED-TERMS"), makeSymbol("ASSUMED-CONSTRAINTS") });

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeKeyword("ID"), $CYCL, makeKeyword("TERMS"), makeKeyword("RETURN-TERMS"), makeKeyword("CONSTRAINTS"), makeKeyword("VAR-MAP"), makeKeyword("SCENARIO"), makeKeyword("ASSUMED-TERMS"), makeKeyword("ASSUMED-CONSTRAINTS") });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeSymbol("QC-QUERY-ID"), makeSymbol("QC-QUERY-CYCL"), makeSymbol("QC-QUERY-TERMS"), makeSymbol("QC-QUERY-RETURN-TERMS"), makeSymbol("QC-QUERY-CONSTRAINTS"), makeSymbol("QC-QUERY-VAR-MAP"), makeSymbol("QC-QUERY-SCENARIO"), makeSymbol("QC-QUERY-ASSUMED-TERMS"), makeSymbol("QC-QUERY-ASSUMED-CONSTRAINTS") });

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeSymbol("_CSETF-QC-QUERY-ID"), makeSymbol("_CSETF-QC-QUERY-CYCL"), makeSymbol("_CSETF-QC-QUERY-TERMS"), makeSymbol("_CSETF-QC-QUERY-RETURN-TERMS"), makeSymbol("_CSETF-QC-QUERY-CONSTRAINTS"), makeSymbol("_CSETF-QC-QUERY-VAR-MAP"), makeSymbol("_CSETF-QC-QUERY-SCENARIO"), makeSymbol("_CSETF-QC-QUERY-ASSUMED-TERMS"), makeSymbol("_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS") });

    public static final SubLObject init_rkf_query_constructor_file_alt() {
        deflexical("*QC-LOCK*", make_lock($$$Query_Constructor_Lock));
        deflexical("*QC-ISG*", NIL != boundp($qc_isg$) ? ((SubLObject) ($qc_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*QC-INDEX*", NIL != boundp($qc_index$) ? ((SubLObject) ($qc_index$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-QC-QUERY*", QC_QUERY);
        defconstant("*DTP-QC-STATE*", QC_STATE);
        deflexical("*RKF-ADD-OBJECT-VAR-MAP-ENTRY-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*RKF-REM-OBJECT-VAR-MAP-METHOD-TABLE*", make_vector($int$256, NIL));
        return NIL;
    }

    public static SubLObject init_rkf_query_constructor_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*QC-LOCK*", make_lock($$$Query_Constructor_Lock));
            deflexical("*QC-ISG*", SubLTrampolineFile.maybeDefault($qc_isg$, $qc_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            deflexical("*QC-INDEX*", SubLTrampolineFile.maybeDefault($qc_index$, $qc_index$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            defconstant("*DTP-QC-QUERY*", QC_QUERY);
            defconstant("*DTP-QC-STATE*", QC_STATE);
            deflexical("*RKF-ADD-OBJECT-VAR-MAP-ENTRY-METHOD-TABLE*", make_vector($int$256, NIL));
            deflexical("*RKF-REM-OBJECT-VAR-MAP-METHOD-TABLE*", make_vector($int$256, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*QC-ISG*", NIL != boundp($qc_isg$) ? ((SubLObject) ($qc_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            deflexical("*QC-INDEX*", NIL != boundp($qc_index$) ? ((SubLObject) ($qc_index$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_rkf_query_constructor_file_Previous() {
        deflexical("*QC-LOCK*", make_lock($$$Query_Constructor_Lock));
        deflexical("*QC-ISG*", SubLTrampolineFile.maybeDefault($qc_isg$, $qc_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*QC-INDEX*", SubLTrampolineFile.maybeDefault($qc_index$, $qc_index$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-QC-QUERY*", QC_QUERY);
        defconstant("*DTP-QC-STATE*", QC_STATE);
        deflexical("*RKF-ADD-OBJECT-VAR-MAP-ENTRY-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*RKF-REM-OBJECT-VAR-MAP-METHOD-TABLE*", make_vector($int$256, NIL));
        return NIL;
    }

    public static SubLObject setup_rkf_query_constructor_file() {
        declare_defglobal($qc_isg$);
        declare_defglobal($qc_index$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_qc_query$.getGlobalValue(), symbol_function(QC_QUERY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list13);
        def_csetf(QC_QUERY_ID, _CSETF_QC_QUERY_ID);
        def_csetf(QC_QUERY_CYCL, _CSETF_QC_QUERY_CYCL);
        def_csetf(QC_QUERY_TERMS, _CSETF_QC_QUERY_TERMS);
        def_csetf(QC_QUERY_RETURN_TERMS, _CSETF_QC_QUERY_RETURN_TERMS);
        def_csetf(QC_QUERY_CONSTRAINTS, _CSETF_QC_QUERY_CONSTRAINTS);
        def_csetf(QC_QUERY_VAR_MAP, _CSETF_QC_QUERY_VAR_MAP);
        def_csetf(QC_QUERY_SCENARIO, _CSETF_QC_QUERY_SCENARIO);
        def_csetf(QC_QUERY_ASSUMED_TERMS, _CSETF_QC_QUERY_ASSUMED_TERMS);
        def_csetf(QC_QUERY_ASSUMED_CONSTRAINTS, _CSETF_QC_QUERY_ASSUMED_CONSTRAINTS);
        identity(QC_QUERY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_qc_query$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_QC_QUERY_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_qc_state$.getGlobalValue(), symbol_function(QC_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list59);
        def_csetf(QC_STATE_ID, _CSETF_QC_STATE_ID);
        def_csetf(QC_STATE_TEXT, _CSETF_QC_STATE_TEXT);
        def_csetf(QC_STATE_CANDIDATES, _CSETF_QC_STATE_CANDIDATES);
        def_csetf(QC_STATE_QUERY, _CSETF_QC_STATE_QUERY);
        def_csetf(QC_STATE_INTERACTION, _CSETF_QC_STATE_INTERACTION);
        def_csetf(QC_STATE_PARSING_MT, _CSETF_QC_STATE_PARSING_MT);
        def_csetf(QC_STATE_GENERATION_MT, _CSETF_QC_STATE_GENERATION_MT);
        def_csetf(QC_STATE_DOMAIN_MT, _CSETF_QC_STATE_DOMAIN_MT);
        def_csetf(QC_STATE_DOMAIN_INTERACTION_MT, _CSETF_QC_STATE_DOMAIN_INTERACTION_MT);
        identity(QC_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_qc_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_QC_STATE_METHOD));
        register_method($rkf_add_object_var_map_entry_method_table$.getGlobalValue(), $dtp_qc_query$.getGlobalValue(), symbol_function(RKF_ADD_OBJECT_VAR_MAP_ENTRY_QC_QUERY_METHOD));
        register_method($rkf_rem_object_var_map_method_table$.getGlobalValue(), $dtp_qc_query$.getGlobalValue(), symbol_function(RKF_REM_OBJECT_VAR_MAP_QC_QUERY_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt40$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt48 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("TEXT"), makeSymbol("CANDIDATES"), makeSymbol("QUERY"), makeSymbol("INTERACTION"), makeSymbol("PARSING-MT"), makeSymbol("GENERATION-MT"), makeSymbol("DOMAIN-MT"), makeSymbol("DOMAIN-INTERACTION-MT") });

    static private final SubLList $list_alt49 = list(new SubLObject[]{ makeKeyword("ID"), $TEXT, makeKeyword("CANDIDATES"), makeKeyword("QUERY"), makeKeyword("INTERACTION"), makeKeyword("PARSING-MT"), makeKeyword("GENERATION-MT"), makeKeyword("DOMAIN-MT"), makeKeyword("DOMAIN-INTERACTION-MT") });

    static private final SubLList $list_alt50 = list(new SubLObject[]{ makeSymbol("QC-STATE-ID"), makeSymbol("QC-STATE-TEXT"), makeSymbol("QC-STATE-CANDIDATES"), makeSymbol("QC-STATE-QUERY"), makeSymbol("QC-STATE-INTERACTION"), makeSymbol("QC-STATE-PARSING-MT"), makeSymbol("QC-STATE-GENERATION-MT"), makeSymbol("QC-STATE-DOMAIN-MT"), makeSymbol("QC-STATE-DOMAIN-INTERACTION-MT") });

    @Override
    public void declareFunctions() {
        declare_rkf_query_constructor_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_query_constructor_file();
    }

    static private final SubLList $list_alt51 = list(new SubLObject[]{ makeSymbol("_CSETF-QC-STATE-ID"), makeSymbol("_CSETF-QC-STATE-TEXT"), makeSymbol("_CSETF-QC-STATE-CANDIDATES"), makeSymbol("_CSETF-QC-STATE-QUERY"), makeSymbol("_CSETF-QC-STATE-INTERACTION"), makeSymbol("_CSETF-QC-STATE-PARSING-MT"), makeSymbol("_CSETF-QC-STATE-GENERATION-MT"), makeSymbol("_CSETF-QC-STATE-DOMAIN-MT"), makeSymbol("_CSETF-QC-STATE-DOMAIN-INTERACTION-MT") });

    @Override
    public void runTopLevelForms() {
        setup_rkf_query_constructor_file();
    }

    static {
    }

    public static final class $qc_query_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $cycl;

        public SubLObject $terms;

        public SubLObject $return_terms;

        public SubLObject $constraints;

        public SubLObject $var_map;

        public SubLObject $scenario;

        public SubLObject $assumed_terms;

        public SubLObject $assumed_constraints;

        private static final SubLStructDeclNative structDecl;

        public $qc_query_native() {
            rkf_query_constructor.$qc_query_native.this.$id = Lisp.NIL;
            rkf_query_constructor.$qc_query_native.this.$cycl = Lisp.NIL;
            rkf_query_constructor.$qc_query_native.this.$terms = Lisp.NIL;
            rkf_query_constructor.$qc_query_native.this.$return_terms = Lisp.NIL;
            rkf_query_constructor.$qc_query_native.this.$constraints = Lisp.NIL;
            rkf_query_constructor.$qc_query_native.this.$var_map = Lisp.NIL;
            rkf_query_constructor.$qc_query_native.this.$scenario = Lisp.NIL;
            rkf_query_constructor.$qc_query_native.this.$assumed_terms = Lisp.NIL;
            rkf_query_constructor.$qc_query_native.this.$assumed_constraints = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_query_constructor.$qc_query_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return rkf_query_constructor.$qc_query_native.this.$cycl;
        }

        @Override
        public SubLObject getField4() {
            return rkf_query_constructor.$qc_query_native.this.$terms;
        }

        @Override
        public SubLObject getField5() {
            return rkf_query_constructor.$qc_query_native.this.$return_terms;
        }

        @Override
        public SubLObject getField6() {
            return rkf_query_constructor.$qc_query_native.this.$constraints;
        }

        @Override
        public SubLObject getField7() {
            return rkf_query_constructor.$qc_query_native.this.$var_map;
        }

        @Override
        public SubLObject getField8() {
            return rkf_query_constructor.$qc_query_native.this.$scenario;
        }

        @Override
        public SubLObject getField9() {
            return rkf_query_constructor.$qc_query_native.this.$assumed_terms;
        }

        @Override
        public SubLObject getField10() {
            return rkf_query_constructor.$qc_query_native.this.$assumed_constraints;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_query_constructor.$qc_query_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_query_constructor.$qc_query_native.this.$cycl = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rkf_query_constructor.$qc_query_native.this.$terms = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rkf_query_constructor.$qc_query_native.this.$return_terms = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rkf_query_constructor.$qc_query_native.this.$constraints = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return rkf_query_constructor.$qc_query_native.this.$var_map = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return rkf_query_constructor.$qc_query_native.this.$scenario = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return rkf_query_constructor.$qc_query_native.this.$assumed_terms = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return rkf_query_constructor.$qc_query_native.this.$assumed_constraints = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_query_constructor.$qc_query_native.class, QC_QUERY, QC_QUERY_P, $list7, $list8, new String[]{ "$id", "$cycl", "$terms", "$return_terms", "$constraints", "$var_map", "$scenario", "$assumed_terms", "$assumed_constraints" }, $list9, $list10, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLString $str_alt85$_ = makeString("-");

    static private final SubLString $str_alt86$_ = makeString(" ");

    static private final SubLString $str_alt88$_A = makeString("~A");

    static private final SubLList $list_alt92 = list(makeSymbol("EL-VARIABLE"), makeSymbol("INDEXICAL-RECORD"));

    public static final class $qc_query_p$UnaryFunction extends UnaryFunction {
        public $qc_query_p$UnaryFunction() {
            super(extractFunctionNamed("QC-QUERY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return qc_query_p(arg1);
        }
    }

    public static final class $qc_state_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $text;

        public SubLObject $candidates;

        public SubLObject $query;

        public SubLObject $interaction;

        public SubLObject $parsing_mt;

        public SubLObject $generation_mt;

        public SubLObject $domain_mt;

        public SubLObject $domain_interaction_mt;

        private static final SubLStructDeclNative structDecl;

        public $qc_state_native() {
            rkf_query_constructor.$qc_state_native.this.$id = Lisp.NIL;
            rkf_query_constructor.$qc_state_native.this.$text = Lisp.NIL;
            rkf_query_constructor.$qc_state_native.this.$candidates = Lisp.NIL;
            rkf_query_constructor.$qc_state_native.this.$query = Lisp.NIL;
            rkf_query_constructor.$qc_state_native.this.$interaction = Lisp.NIL;
            rkf_query_constructor.$qc_state_native.this.$parsing_mt = Lisp.NIL;
            rkf_query_constructor.$qc_state_native.this.$generation_mt = Lisp.NIL;
            rkf_query_constructor.$qc_state_native.this.$domain_mt = Lisp.NIL;
            rkf_query_constructor.$qc_state_native.this.$domain_interaction_mt = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_query_constructor.$qc_state_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return rkf_query_constructor.$qc_state_native.this.$text;
        }

        @Override
        public SubLObject getField4() {
            return rkf_query_constructor.$qc_state_native.this.$candidates;
        }

        @Override
        public SubLObject getField5() {
            return rkf_query_constructor.$qc_state_native.this.$query;
        }

        @Override
        public SubLObject getField6() {
            return rkf_query_constructor.$qc_state_native.this.$interaction;
        }

        @Override
        public SubLObject getField7() {
            return rkf_query_constructor.$qc_state_native.this.$parsing_mt;
        }

        @Override
        public SubLObject getField8() {
            return rkf_query_constructor.$qc_state_native.this.$generation_mt;
        }

        @Override
        public SubLObject getField9() {
            return rkf_query_constructor.$qc_state_native.this.$domain_mt;
        }

        @Override
        public SubLObject getField10() {
            return rkf_query_constructor.$qc_state_native.this.$domain_interaction_mt;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_query_constructor.$qc_state_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_query_constructor.$qc_state_native.this.$text = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rkf_query_constructor.$qc_state_native.this.$candidates = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rkf_query_constructor.$qc_state_native.this.$query = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rkf_query_constructor.$qc_state_native.this.$interaction = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return rkf_query_constructor.$qc_state_native.this.$parsing_mt = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return rkf_query_constructor.$qc_state_native.this.$generation_mt = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return rkf_query_constructor.$qc_state_native.this.$domain_mt = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return rkf_query_constructor.$qc_state_native.this.$domain_interaction_mt = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_query_constructor.$qc_state_native.class, QC_STATE, QC_STATE_P, $list54, $list55, new String[]{ "$id", "$text", "$candidates", "$query", "$interaction", "$parsing_mt", "$generation_mt", "$domain_mt", "$domain_interaction_mt" }, $list56, $list57, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $qc_state_p$UnaryFunction extends UnaryFunction {
        public $qc_state_p$UnaryFunction() {
            super(extractFunctionNamed("QC-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return qc_state_p(arg1);
        }
    }
}

/**
 * Total time: 386 ms
 */
