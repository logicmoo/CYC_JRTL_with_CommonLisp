/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_general_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.literalP;
import static com.cyc.cycjava.cycl.el_utilities.literal_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_existential;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_universal;
import static com.cyc.cycjava.cycl.el_utilities.map_formula_terms;
import static com.cyc.cycjava.cycl.el_utilities.nreplace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.quantified_sub_sentence;
import static com.cyc.cycjava.cycl.el_utilities.quantified_var;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.sentence_variables;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      VARIABLE-UNIFICATION
 * source file: /cyc/top/cycl/variable-unification.lisp
 * created:     2019/07/03 17:38:40
 */
public final class variable_unification extends SubLTranslatedFile implements V12 {
    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_61_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("PericardialWindow-SurgicalProcedure")), list(reader_make_constant_shell("cCF-contains"), makeSymbol("?X"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?X"), makeSymbol("?Y")), list(makeSymbol("?Y"), makeSymbol("?X")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("HeartAttack")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?THING"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?THING")), list(makeSymbol("?THING"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFCardiacCathComplication"), makeSymbol("?CCF-EVENT"), reader_make_constant_shell("HeartAttack")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?CCF-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?CCF-EVENT")), list(makeSymbol("?CCF-EVENT"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFHospitalAdmitReason"), makeSymbol("?HOSPITAL-CARE"), reader_make_constant_shell("HeartAttack")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"), makeSymbol("?HOSPITAL-CARE")), list(makeSymbol("?Y"), makeSymbol("?HOSPITAL-CARE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("causeOfDeathEvent"), makeSymbol("?DEATH"), reader_make_constant_shell("HeartAttack")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?DEATH"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?DEATH")), list(makeSymbol("?DEATH"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("causeOfDeathEvent"), makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?DEATH"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION")), list(makeSymbol("?TYPE-OF-SITUATION"), makeSymbol("?DEATH"), makeSymbol("?Y")), list(makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFCardiacCathComplication"), makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?CCF-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION")), list(makeSymbol("?CARDIAC-CATH-COMPLICATION"), makeSymbol("?CCF-EVENT"), makeSymbol("?Y")), list(makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFHospitalAdmitReason"), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?HOSPITAL-ADMIT-REASON")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"), makeSymbol("?HOSPITAL-ADMIT-REASON"), makeSymbol("?HOSPITAL-CARE")), list(makeSymbol("?HOSPITAL-ADMIT-REASON"), makeSymbol("?Y"), makeSymbol("?HOSPITAL-CARE")), list(makeSymbol("?Y"), makeSymbol("?HOSPITAL-ADMIT-REASON"), makeSymbol("?HOSPITAL-CARE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventHasDiagnosis"), makeSymbol("?MEDICALLY-RELATED-EVENT"), reader_make_constant_shell("HeartCondition")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("causeOfDeathEvent"), makeSymbol("?DEATH"), reader_make_constant_shell("HeartCondition")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?DEATH"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?DEATH")), list(makeSymbol("?DEATH"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventHasDiagnosis"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE")), list(makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFLeftVentricleEjectionFraction"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?X"), makeSymbol("?W"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y")), list(makeSymbol("?Y"), makeSymbol("?X"), makeSymbol("?W")), list(makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?W")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFSymptomType"), makeSymbol("?SYMPTOM"), reader_make_constant_shell("Angina")), list(reader_make_constant_shell("eventHasDiagnosisOrFinding"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?SYMPTOM"), makeSymbol("?Y"), makeSymbol("?EVENT")), list(makeSymbol("?EVENT"), makeSymbol("?Y"), makeSymbol("?SYMPTOM")), list(makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFSymptomType"), makeSymbol("?SYMPTOM"), makeSymbol("?SYMPTOM-TYPE")), list(reader_make_constant_shell("eventHasDiagnosisOrFinding"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?SYMPTOM"), makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM-TYPE")), list(makeSymbol("?SYMPTOM-TYPE"), makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")), list(makeSymbol("?EVENT"), makeSymbol("?Y"), makeSymbol("?SYMPTOM-TYPE"), makeSymbol("?SYMPTOM")), list(makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM-TYPE"), makeSymbol("?SYMPTOM")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventHasDiagnosisOrFinding"), makeSymbol("?CCF-EVENT"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(reader_make_constant_shell("cCFAnginaRestPain"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?ANGINA-REST-PAIN")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?CCF-EVENT"), makeSymbol("?ANIMAL"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?CCF-EVENT"), makeSymbol("?ANIMAL"), makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?ANIMAL"), makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?CCF-EVENT")), list(makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?ANIMAL"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?CCF-EVENT")), list(makeSymbol("?ANIMAL"), makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?CCF-EVENT")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFHematocritTestValue"), makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?BLOOD-TEST"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE")), list(makeSymbol("?SCALAR-VALUE"), makeSymbol("?BLOOD-TEST"), makeSymbol("?Y")), list(makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("ElectrophysiologyStudy-CCFManagement")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?THING"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?THING")), list(makeSymbol("?THING"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("SurgicalProcedure_eps")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?THING"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?THING")), list(makeSymbol("?THING"), makeSymbol("?Y")))) });
    }

    public static final SubLFile me = new variable_unification();

 public static final String myName = "com.cyc.cycjava.cycl.variable_unification";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $variable_similarity_default_fudge_factor$ = makeSymbol("*VARIABLE-SIMILARITY-DEFAULT-FUDGE-FACTOR*");

    // defparameter
    // The Mt to use in literal-set-> (if any).
    /**
     * The Mt to use in literal-set-> (if any).
     */
    @LispMethod(comment = "The Mt to use in literal-set-> (if any).\ndefparameter")
    private static final SubLSymbol $literal_set_G_mt$ = makeSymbol("*LITERAL-SET->-MT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("NEGATION-OPERATOR"), makeSymbol("NEGATED-SENTENCE"));

    static private final SubLList $list1 = list(reader_make_constant_shell("or"));

    private static final SubLSymbol APPLY_DEMORGANS = makeSymbol("APPLY-DEMORGANS");

    static private final SubLList $list4 = list(reader_make_constant_shell("and"));



    private static final SubLSymbol CONVERT_TO_DNF_INT = makeSymbol("CONVERT-TO-DNF-INT");





    private static final SubLSymbol COLLAPSE_GROUPS = makeSymbol("COLLAPSE-GROUPS");

    private static final SubLSymbol GATHER_DNF_ARG_CONSTRAINTS_INT = makeSymbol("GATHER-DNF-ARG-CONSTRAINTS-INT");



    static private final SubLList $list13 = list(list($TEST, makeSymbol("IRREFLEXIVE-PREDICATE?")), list(makeKeyword("AND"), list($TEST, makeSymbol("EL-VAR?")), list($BIND, makeSymbol("VAR1"))), list(makeKeyword("AND"), list($TEST, makeSymbol("EL-VAR?")), list($BIND, makeSymbol("VAR2"))));

    private static final SubLSymbol VAR2 = makeSymbol("VAR2");

    private static final SubLSymbol GET_VAR_MAP_FOR_FORMULA = makeSymbol("GET-VAR-MAP-FOR-FORMULA");



    static private final SubLList $list18 = list(list($BIND, makeSymbol("COL")));



    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLSymbol VARIABLE_SIMILARITY = makeSymbol("VARIABLE-SIMILARITY");

    private static final SubLFloat $float$1_1 = makeDouble(1.1);

    static private final SubLSymbol $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_ = makeSymbol("VARIABLE-SIMILARITY-ABOUT-THE-SAME?");

    static private final SubLSymbol $sym26$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLList $list28 = cons(makeSymbol("VAR1"), makeSymbol("VARS"));

    static private final SubLList $list29 = cons(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VARS"));

    private static final SubLList $list31 = cons(reader_make_constant_shell("and"), makeKeyword("ANYTHING"));

    private static final SubLSymbol $sym32$CAR_CDR_EQUAL_ = makeSymbol("CAR-CDR-EQUAL?");

    private static final SubLSymbol FIND_REDUNDANT_LITERALS = makeSymbol("FIND-REDUNDANT-LITERALS");

    private static final SubLList $list34 = cons(reader_make_constant_shell("or"), makeKeyword("ANYTHING"));





    private static final SubLSymbol EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");

    private static final SubLSymbol $sym38$LITERAL_SET__ = makeSymbol("LITERAL-SET->");

    private static final SubLSymbol SET_ELEMENT_LIST = makeSymbol("SET-ELEMENT-LIST");

    private static final SubLSymbol $sym40$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol EL_VAR_NAME = makeSymbol("EL-VAR-NAME");

    private static final SubLSymbol LITERAL_FREE_VARIABLES_CACHED = makeSymbol("LITERAL-FREE-VARIABLES-CACHED");

    private static final SubLSymbol $literal_free_variables_cached_caching_state$ = makeSymbol("*LITERAL-FREE-VARIABLES-CACHED-CACHING-STATE*");

    private static final SubLSymbol FIND_UNCONNECTED_LITERALS = makeSymbol("FIND-UNCONNECTED-LITERALS");

    private static final SubLSymbol FIND_INCONSISTENT_LITERALS = makeSymbol("FIND-INCONSISTENT-LITERALS");

    private static final SubLSymbol ARG_POSITIONS_EQ = makeSymbol("ARG-POSITIONS-EQ");

    private static final SubLList $list51 = list(makeSymbol("CAE-TEST-CASE-TABLES"), makeSymbol("VARIABLE-UNIFICATION-TEST-CASE-TABLES"));

    private static final SubLList $list55 = list(list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")))), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")))), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))))), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Collection"), reader_make_constant_shell("Thing"))))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Collection"), reader_make_constant_shell("Thing"))))));

    private static final SubLSymbol $sym56$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    private static final SubLSymbol GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST = makeSymbol("GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE-AS-ALIST");

    private static final SubLSymbol $sym58$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_ = makeSymbol("INCOMPATIBLE-VAR-MAP-ALISTS-EQUAL?");

    private static final SubLObject $list60 = _constant_60_initializer();

    static private final SubLList $list61 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y"))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Collection"), makeSymbol("?Z")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Collection"), reader_make_constant_shell("Thing")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell("isa"), makeSymbol("?W"), makeSymbol("?V")))), list(list(THREE_INTEGER))), list(list(list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Individual")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Collection")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Individual")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Collection"))))), NIL), list(list(list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Individual")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Collection")))), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell("genls"), reader_make_constant_shell("Individual"), reader_make_constant_shell("Collection"))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell("genls"), reader_make_constant_shell("Individual"), reader_make_constant_shell("Collection")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?W"), makeSymbol("?Z")), list(reader_make_constant_shell("genls"), reader_make_constant_shell("Individual"), reader_make_constant_shell("Collection")))), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("genls"), reader_make_constant_shell("Individual"), reader_make_constant_shell("Collection")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), makeSymbol("?Y")), list(reader_make_constant_shell("genls"), makeSymbol("?X"), reader_make_constant_shell("Thing")))), list(list(TWO_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?V"), makeSymbol("?W"))))), list(list(THREE_INTEGER, ONE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("isa"), makeSymbol("?V"), makeSymbol("?W"))))), list(list(THREE_INTEGER, ONE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Z")), list(reader_make_constant_shell("isa"), makeSymbol("?Z"))), list(reader_make_constant_shell("isa"), makeSymbol("?Z"))))), list(list(TWO_INTEGER, TWO_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("patientTreated"), makeSymbol("?MAIN-PROC"), makeSymbol("?PAT")), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?SURG-PROC"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("concomitantProcedures"), makeSymbol("?MAIN-PROC"), makeSymbol("?SURG-PROC")), list(reader_make_constant_shell("isa"), makeSymbol("?SURG-PROC"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?SURG-PROC"), makeSymbol("?PAT"))))))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("patientTreated"), makeSymbol("?MAIN-PROC"), makeSymbol("?PAT")), list(reader_make_constant_shell("thereExists"), makeSymbol("?SURG-PROC"), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("concomitantProcedures"), makeSymbol("?MAIN-PROC"), makeSymbol("?SURG-PROC")), list(reader_make_constant_shell("isa"), makeSymbol("?SURG-PROC"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?SURG-PROC"), makeSymbol("?PAT")))))), list(list(TWO_INTEGER, TWO_INTEGER, TWO_INTEGER))) });

    static private final SubLList $list62 = list(list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Person"))), reader_make_constant_shell("TerrorismRecommendedWffCheckingMt")), list(list(TWO_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Pi-Number"))), reader_make_constant_shell("TerrorismRecommendedWffCheckingMt")), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Pi-Number")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event"))), reader_make_constant_shell("TerrorismRecommendedWffCheckingMt")), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Pi-Number"))), reader_make_constant_shell("TerrorismRecommendedWffCheckingMt")), list(list(TWO_INTEGER))));

    // Definitions
    /**
     * Apply DeMorgan's rules to FORMULA to move all of the #$nots down to the literal
     * level, so that there will be no (#$not (#$and ...)) or (#$not (#$or ...)) clauses.
     */
    @LispMethod(comment = "Apply DeMorgan\'s rules to FORMULA to move all of the #$nots down to the literal\r\nlevel, so that there will be no (#$not (#$and ...)) or (#$not (#$or ...)) clauses.\nApply DeMorgan\'s rules to FORMULA to move all of the #$nots down to the literal\nlevel, so that there will be no (#$not (#$and ...)) or (#$not (#$or ...)) clauses.")
    public static final SubLObject apply_demorgans_alt(SubLObject formula) {
        if (NIL == el_formula_p(formula)) {
            return formula;
        } else {
            if (NIL != com.cyc.cycjava.cycl.variable_unification.el_negation_or_unknown_sentence_p(formula)) {
                {
                    SubLObject datum = cycl_utilities.formula_terms(formula, UNPROVIDED);
                    SubLObject current = datum;
                    SubLObject negation_operator = NIL;
                    SubLObject negated_sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    negation_operator = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    negated_sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != el_conjunction_p(negated_sentence)) {
                            {
                                SubLObject ans = $list_alt1;
                                SubLObject args = cycl_utilities.formula_args(negated_sentence, $IGNORE);
                                SubLObject cdolist_list_var = args;
                                SubLObject child = NIL;
                                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.variable_unification.el_negation_or_unknown_sentence_p(child)) {
                                        ans = append(ans, Mapping.mapcar(symbol_function(APPLY_DEMORGANS), cycl_utilities.formula_args(child, UNPROVIDED)));
                                    } else {
                                        ans = append(ans, list(com.cyc.cycjava.cycl.variable_unification.apply_demorgans(make_unary_formula(negation_operator, child))));
                                    }
                                }
                                return ans;
                            }
                        } else {
                            if (NIL != el_disjunction_p(negated_sentence)) {
                                {
                                    SubLObject ans = $list_alt4;
                                    SubLObject args = cycl_utilities.formula_args(negated_sentence, $IGNORE);
                                    SubLObject cdolist_list_var = args;
                                    SubLObject child = NIL;
                                    for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                        if (NIL != com.cyc.cycjava.cycl.variable_unification.el_negation_or_unknown_sentence_p(child)) {
                                            ans = append(ans, Mapping.mapcar(symbol_function(APPLY_DEMORGANS), cycl_utilities.formula_args(child, UNPROVIDED)));
                                        } else {
                                            ans = append(ans, list(com.cyc.cycjava.cycl.variable_unification.apply_demorgans(make_unary_formula(negation_operator, child))));
                                        }
                                    }
                                    return ans;
                                }
                            } else {
                                if (NIL != el_existential_p(negated_sentence)) {
                                    return make_universal(quantified_var(negated_sentence), com.cyc.cycjava.cycl.variable_unification.apply_demorgans(list(negation_operator, quantified_sub_sentence(negated_sentence))));
                                } else {
                                    if (NIL != el_universal_p(negated_sentence)) {
                                        return make_existential(quantified_var(negated_sentence), com.cyc.cycjava.cycl.variable_unification.apply_demorgans(list(negation_operator, quantified_sub_sentence(negated_sentence))));
                                    } else {
                                        return formula;
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            } else {
                if (NIL != el_conjunction_p(formula)) {
                    return map_formula_terms(symbol_function(APPLY_DEMORGANS), formula, UNPROVIDED);
                } else {
                    if (NIL != el_disjunction_p(formula)) {
                        return map_formula_terms(symbol_function(APPLY_DEMORGANS), formula, UNPROVIDED);
                    } else {
                        return formula;
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * Apply DeMorgan's rules to FORMULA to move all of the #$nots down to the literal
     * level, so that there will be no (#$not (#$and ...)) or (#$not (#$or ...)) clauses.
     */
    @LispMethod(comment = "Apply DeMorgan\'s rules to FORMULA to move all of the #$nots down to the literal\r\nlevel, so that there will be no (#$not (#$and ...)) or (#$not (#$or ...)) clauses.\nApply DeMorgan\'s rules to FORMULA to move all of the #$nots down to the literal\nlevel, so that there will be no (#$not (#$and ...)) or (#$not (#$or ...)) clauses.")
    public static SubLObject apply_demorgans(final SubLObject formula) {
        if (NIL == el_formula_p(formula)) {
            return formula;
        }
        if (NIL != el_negation_or_unknown_sentence_p(formula)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_terms(formula, UNPROVIDED);
            SubLObject negation_operator = NIL;
            SubLObject negated_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            negation_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            negated_sentence = current.first();
            current = current.rest();
            if (NIL != current) {
                cdestructuring_bind_error(datum, $list0);
                return NIL;
            }
            if (NIL != el_conjunction_p(negated_sentence)) {
                SubLObject ans = $list1;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(negated_sentence, $IGNORE);
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != el_negation_or_unknown_sentence_p(child)) {
                        ans = append(ans, Mapping.mapcar(symbol_function(APPLY_DEMORGANS), cycl_utilities.formula_args(child, UNPROVIDED)));
                    } else {
                        ans = append(ans, list(apply_demorgans(make_unary_formula(negation_operator, child))));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
                return ans;
            }
            if (NIL != el_disjunction_p(negated_sentence)) {
                SubLObject ans = $list4;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(negated_sentence, $IGNORE);
                SubLObject child = NIL;
                child = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != el_negation_or_unknown_sentence_p(child)) {
                        ans = append(ans, Mapping.mapcar(symbol_function(APPLY_DEMORGANS), cycl_utilities.formula_args(child, UNPROVIDED)));
                    } else {
                        ans = append(ans, list(apply_demorgans(make_unary_formula(negation_operator, child))));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                } 
                return ans;
            }
            if (NIL != el_existential_p(negated_sentence)) {
                return make_universal(quantified_var(negated_sentence), apply_demorgans(list(negation_operator, quantified_sub_sentence(negated_sentence))));
            }
            if (NIL != el_universal_p(negated_sentence)) {
                return make_existential(quantified_var(negated_sentence), apply_demorgans(list(negation_operator, quantified_sub_sentence(negated_sentence))));
            }
            return formula;
        } else {
            if (NIL != el_conjunction_p(formula)) {
                return map_formula_terms(symbol_function(APPLY_DEMORGANS), formula, UNPROVIDED);
            }
            if (NIL != el_disjunction_p(formula)) {
                return map_formula_terms(symbol_function(APPLY_DEMORGANS), formula, UNPROVIDED);
            }
            return formula;
        }
    }

    public static final SubLObject el_negation_or_unknown_sentence_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_negation_p(v_object)) || (NIL != el_formula_with_operator_p(v_object, $$unknownSentence)));
    }

    public static SubLObject el_negation_or_unknown_sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_negation_p(v_object)) || (NIL != el_formula_with_operator_p(v_object, $$unknownSentence)));
    }

    /**
     * Removes all existitential and universal quantifications from FORMULA and
     * returns both the new formula, and the list of quantifiers.  Requires that
     * FORMULA has already had the #$nots pushed down using APPLY-DEMORGANS.
     */
    @LispMethod(comment = "Removes all existitential and universal quantifications from FORMULA and\r\nreturns both the new formula, and the list of quantifiers.  Requires that\r\nFORMULA has already had the #$nots pushed down using APPLY-DEMORGANS.\nRemoves all existitential and universal quantifications from FORMULA and\nreturns both the new formula, and the list of quantifiers.  Requires that\nFORMULA has already had the #$nots pushed down using APPLY-DEMORGANS.")
    public static final SubLObject separate_bindings_from_sentence_alt(SubLObject formula) {
        return com.cyc.cycjava.cycl.variable_unification.separate_bindings_recursive(formula);
    }

    /**
     * Removes all existitential and universal quantifications from FORMULA and
     * returns both the new formula, and the list of quantifiers.  Requires that
     * FORMULA has already had the #$nots pushed down using APPLY-DEMORGANS.
     */
    @LispMethod(comment = "Removes all existitential and universal quantifications from FORMULA and\r\nreturns both the new formula, and the list of quantifiers.  Requires that\r\nFORMULA has already had the #$nots pushed down using APPLY-DEMORGANS.\nRemoves all existitential and universal quantifications from FORMULA and\nreturns both the new formula, and the list of quantifiers.  Requires that\nFORMULA has already had the #$nots pushed down using APPLY-DEMORGANS.")
    public static SubLObject separate_bindings_from_sentence(final SubLObject formula) {
        return separate_bindings_recursive(formula);
    }

    public static final SubLObject separate_bindings_recursive_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_term = v_term;
                SubLObject quantifiers = NIL;
                if (NIL == el_formula_p(v_term)) {
                } else {
                    if (NIL != literalP(v_term)) {
                    } else {
                        if ((NIL != el_existential_p(v_term)) || (NIL != el_universal_p(v_term))) {
                            new_term = quantified_sub_sentence(v_term);
                            quantifiers = list(list_utilities.first_n(TWO_INTEGER, v_term));
                        } else {
                            {
                                SubLObject argnum = ZERO_INTEGER;
                                SubLObject args = cycl_utilities.formula_args(v_term, $IGNORE);
                                SubLObject cdolist_list_var = args;
                                SubLObject child = NIL;
                                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                    argnum = add(argnum, ONE_INTEGER);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject new_arg = com.cyc.cycjava.cycl.variable_unification.separate_bindings_recursive(child);
                                        SubLObject v_bindings = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        new_term = nreplace_formula_arg(argnum, new_arg, new_term);
                                        quantifiers = append(quantifiers, v_bindings);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(new_term, quantifiers);
            }
        }
    }

    public static SubLObject separate_bindings_recursive(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_term = v_term;
        SubLObject quantifiers = NIL;
        if (NIL != el_formula_p(v_term)) {
            if (NIL == literalP(v_term)) {
                if ((NIL != el_existential_p(v_term)) || (NIL != el_universal_p(v_term))) {
                    new_term = quantified_sub_sentence(v_term);
                    quantifiers = list(list_utilities.first_n(TWO_INTEGER, v_term));
                } else {
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(v_term, $IGNORE);
                    SubLObject child = NIL;
                    child = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        argnum = add(argnum, ONE_INTEGER);
                        thread.resetMultipleValues();
                        final SubLObject new_arg = separate_bindings_recursive(child);
                        final SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_term = nreplace_formula_arg(argnum, new_arg, new_term);
                        quantifiers = append(quantifiers, v_bindings);
                        cdolist_list_var = cdolist_list_var.rest();
                        child = cdolist_list_var.first();
                    } 
                }
            }
        }
        return values(new_term, quantifiers);
    }

    /**
     * Collapses FORMULA according to the following rules:
     * (#$and X) -> X
     * (#$or X) ->
     * (#$and ... (#$and X ...) ...) -> (#$and ... X ... ...)
     * (#$or ... (#$or X ...) ...) -> (#$or ... X ... ...)
     * Requires that FORMULA has no existential quantifiers and all #$nots appear at the
     * literal level (usually by calling APPLY-DEMORGANS and SEPARATE-BINDINGS-FROM-SENTENCE).
     */
    @LispMethod(comment = "Collapses FORMULA according to the following rules:\r\n(#$and X) -> X\r\n(#$or X) ->\r\n(#$and ... (#$and X ...) ...) -> (#$and ... X ... ...)\r\n(#$or ... (#$or X ...) ...) -> (#$or ... X ... ...)\r\nRequires that FORMULA has no existential quantifiers and all #$nots appear at the\r\nliteral level (usually by calling APPLY-DEMORGANS and SEPARATE-BINDINGS-FROM-SENTENCE).\nCollapses FORMULA according to the following rules:\n(#$and X) -> X\n(#$or X) ->\n(#$and ... (#$and X ...) ...) -> (#$and ... X ... ...)\n(#$or ... (#$or X ...) ...) -> (#$or ... X ... ...)\nRequires that FORMULA has no existential quantifiers and all #$nots appear at the\nliteral level (usually by calling APPLY-DEMORGANS and SEPARATE-BINDINGS-FROM-SENTENCE).")
    public static final SubLObject collapse_groups_alt(SubLObject formula) {
        if (!((NIL != el_formula_p(formula)) && (NIL == narts_high.naut_p(formula)))) {
            return formula;
        }
        if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
            {
                SubLObject children = cycl_utilities.formula_args(formula, UNPROVIDED);
                SubLObject new_children = NIL;
                SubLObject cdolist_list_var = children;
                SubLObject child = NIL;
                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                    child = com.cyc.cycjava.cycl.variable_unification.collapse_groups(child);
                    if (child.isList() && (child.first() == formula.first())) {
                        new_children = append(new_children, child.rest());
                    } else {
                        new_children = append(new_children, list(child));
                    }
                }
                if (NIL != list_utilities.lengthE(new_children, ONE_INTEGER, UNPROVIDED)) {
                    return new_children.first();
                }
                return make_el_formula(formula.first(), new_children, UNPROVIDED);
            }
        }
        return formula;
    }

    /**
     * Collapses FORMULA according to the following rules:
     * (#$and X) -> X
     * (#$or X) ->
     * (#$and ... (#$and X ...) ...) -> (#$and ... X ... ...)
     * (#$or ... (#$or X ...) ...) -> (#$or ... X ... ...)
     * Requires that FORMULA has no existential quantifiers and all #$nots appear at the
     * literal level (usually by calling APPLY-DEMORGANS and SEPARATE-BINDINGS-FROM-SENTENCE).
     */
    @LispMethod(comment = "Collapses FORMULA according to the following rules:\r\n(#$and X) -> X\r\n(#$or X) ->\r\n(#$and ... (#$and X ...) ...) -> (#$and ... X ... ...)\r\n(#$or ... (#$or X ...) ...) -> (#$or ... X ... ...)\r\nRequires that FORMULA has no existential quantifiers and all #$nots appear at the\r\nliteral level (usually by calling APPLY-DEMORGANS and SEPARATE-BINDINGS-FROM-SENTENCE).\nCollapses FORMULA according to the following rules:\n(#$and X) -> X\n(#$or X) ->\n(#$and ... (#$and X ...) ...) -> (#$and ... X ... ...)\n(#$or ... (#$or X ...) ...) -> (#$or ... X ... ...)\nRequires that FORMULA has no existential quantifiers and all #$nots appear at the\nliteral level (usually by calling APPLY-DEMORGANS and SEPARATE-BINDINGS-FROM-SENTENCE).")
    public static SubLObject collapse_groups(final SubLObject formula) {
        if ((NIL == el_formula_p(formula)) || (NIL != narts_high.naut_p(formula))) {
            return formula;
        }
        if ((NIL == el_conjunction_p(formula)) && (NIL == el_disjunction_p(formula))) {
            return formula;
        }
        final SubLObject children = cycl_utilities.formula_args(formula, UNPROVIDED);
        SubLObject new_children = NIL;
        SubLObject cdolist_list_var = children;
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            child = collapse_groups(child);
            if (child.isList() && child.first().eql(formula.first())) {
                new_children = append(new_children, child.rest());
            } else {
                new_children = append(new_children, list(child));
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.lengthE(new_children, ONE_INTEGER, UNPROVIDED)) {
            return new_children.first();
        }
        return make_el_formula(formula.first(), new_children, UNPROVIDED);
    }

    /**
     * The guts of converting FORMULA to disjunctive normal form (DNF) and moving all
     * existential and universal quantifiers to the outside of the sentence.
     */
    @LispMethod(comment = "The guts of converting FORMULA to disjunctive normal form (DNF) and moving all\r\nexistential and universal quantifiers to the outside of the sentence.\nThe guts of converting FORMULA to disjunctive normal form (DNF) and moving all\nexistential and universal quantifiers to the outside of the sentence.")
    public static final SubLObject convert_to_dnf_int_alt(SubLObject formula) {
        if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
            {
                SubLObject old_operator = formula.first();
                SubLObject old_children = formula.rest();
                SubLObject new_children = Mapping.mapcar(symbol_function(CONVERT_TO_DNF_INT), old_children);
                SubLObject new_formula = com.cyc.cycjava.cycl.variable_unification.collapse_groups(cons(old_operator, new_children));
                new_children = new_formula.rest();
                if (new_formula.isList() && (new_formula.first() == $$and)) {
                    {
                        SubLObject or_child = NIL;
                        {
                            SubLObject cdolist_list_var = new_children;
                            SubLObject child = NIL;
                            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                if (child.isList() && (child.first() == $$or)) {
                                    or_child = child;
                                }
                            }
                        }
                        if (NIL == or_child) {
                            return new_formula;
                        }
                        new_children = remove(or_child, new_children, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject or_formula = $list_alt1;
                            SubLObject or_children = or_child.rest();
                            SubLObject cdolist_list_var = or_children;
                            SubLObject child = NIL;
                            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                                child = com.cyc.cycjava.cycl.variable_unification.collapse_groups(append(cons($$and, new_children), list(child)));
                                or_formula = cons(child, or_formula);
                            }
                            or_formula = reverse(or_formula);
                            return com.cyc.cycjava.cycl.variable_unification.collapse_groups(cons(or_formula.first(), Mapping.mapcar(symbol_function(COLLAPSE_GROUPS), Mapping.mapcar(symbol_function(CONVERT_TO_DNF_INT), or_formula.rest()))));
                        }
                    }
                }
                return new_formula;
            }
        } else {
            return formula;
        }
    }

    /**
     * The guts of converting FORMULA to disjunctive normal form (DNF) and moving all
     * existential and universal quantifiers to the outside of the sentence.
     */
    @LispMethod(comment = "The guts of converting FORMULA to disjunctive normal form (DNF) and moving all\r\nexistential and universal quantifiers to the outside of the sentence.\nThe guts of converting FORMULA to disjunctive normal form (DNF) and moving all\nexistential and universal quantifiers to the outside of the sentence.")
    public static SubLObject convert_to_dnf_int(final SubLObject formula) {
        if ((NIL == el_conjunction_p(formula)) && (NIL == el_disjunction_p(formula))) {
            return formula;
        }
        final SubLObject old_operator = formula.first();
        final SubLObject old_children = formula.rest();
        SubLObject new_children = Mapping.mapcar(symbol_function(CONVERT_TO_DNF_INT), old_children);
        final SubLObject new_formula = collapse_groups(cons(old_operator, new_children));
        new_children = new_formula.rest();
        if ((!new_formula.isList()) || (!new_formula.first().eql($$and))) {
            return new_formula;
        }
        SubLObject or_child = NIL;
        SubLObject cdolist_list_var = new_children;
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (child.isList() && child.first().eql($$or)) {
                or_child = child;
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        if (NIL == or_child) {
            return new_formula;
        }
        new_children = remove(or_child, new_children, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject or_formula = $list1;
        SubLObject cdolist_list_var2;
        final SubLObject or_children = cdolist_list_var2 = or_child.rest();
        SubLObject child2 = NIL;
        child2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            child2 = collapse_groups(append(cons($$and, new_children), list(child2)));
            or_formula = cons(child2, or_formula);
            cdolist_list_var2 = cdolist_list_var2.rest();
            child2 = cdolist_list_var2.first();
        } 
        or_formula = reverse(or_formula);
        return collapse_groups(cons(or_formula.first(), Mapping.mapcar(symbol_function(COLLAPSE_GROUPS), Mapping.mapcar(symbol_function(CONVERT_TO_DNF_INT), or_formula.rest()))));
    }

    /**
     * Converts FORMULA to disjunctive normal form (DNF) and moves all existential and universal
     * quantifiers to the outside of the sentence.
     */
    @LispMethod(comment = "Converts FORMULA to disjunctive normal form (DNF) and moves all existential and universal\r\nquantifiers to the outside of the sentence.\nConverts FORMULA to disjunctive normal form (DNF) and moves all existential and universal\nquantifiers to the outside of the sentence.")
    public static final SubLObject convert_to_dnf_alt(SubLObject formula, SubLObject apply_demorgansP) {
        if (apply_demorgansP == UNPROVIDED) {
            apply_demorgansP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject new_formula = com.cyc.cycjava.cycl.variable_unification.separate_bindings_from_sentence(NIL != apply_demorgansP ? ((SubLObject) (com.cyc.cycjava.cycl.variable_unification.apply_demorgans(formula))) : copy_list(formula));
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                new_formula = com.cyc.cycjava.cycl.variable_unification.collapse_groups(new_formula);
                new_formula = com.cyc.cycjava.cycl.variable_unification.convert_to_dnf_int(new_formula);
                {
                    SubLObject cdolist_list_var = v_bindings;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        new_formula = append(binding, list(new_formula));
                    }
                }
                return new_formula;
            }
        }
    }

    /**
     * Converts FORMULA to disjunctive normal form (DNF) and moves all existential and universal
     * quantifiers to the outside of the sentence.
     */
    @LispMethod(comment = "Converts FORMULA to disjunctive normal form (DNF) and moves all existential and universal\r\nquantifiers to the outside of the sentence.\nConverts FORMULA to disjunctive normal form (DNF) and moves all existential and universal\nquantifiers to the outside of the sentence.")
    public static SubLObject convert_to_dnf(final SubLObject formula, SubLObject apply_demorgansP) {
        if (apply_demorgansP == UNPROVIDED) {
            apply_demorgansP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject new_formula = separate_bindings_from_sentence(NIL != apply_demorgansP ? apply_demorgans(formula) : copy_list(formula));
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        new_formula = collapse_groups(new_formula);
        new_formula = convert_to_dnf_int(new_formula);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_formula = append(binding, list(new_formula));
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return new_formula;
    }

    /**
     * Returns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),
     * taking into account #$and, #$or, and #$not.
     */
    @LispMethod(comment = "Returns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),\r\ntaking into account #$and, #$or, and #$not.\nReturns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),\ntaking into account #$and, #$or, and #$not.")
    public static final SubLObject gather_dnf_arg_constraints_int_alt(SubLObject formula, SubLObject mt) {
        if (!formula.isList()) {
            return NIL;
        }
        if (NIL != el_conjunction_p(formula)) {
            formula = simplifier.conjoin(Mapping.mapcar(symbol_function(GATHER_DNF_ARG_CONSTRAINTS_INT), formula.rest(), new SubLObject[]{ make_list(length(formula.rest()), mt) }), UNPROVIDED);
        } else {
            if (NIL != el_disjunction_p(formula)) {
                formula = simplifier.disjoin(Mapping.mapcar(symbol_function(GATHER_DNF_ARG_CONSTRAINTS_INT), formula.rest(), new SubLObject[]{ make_list(length(formula.rest()), mt) }), UNPROVIDED);
            } else {
                if (NIL != el_existential_p(formula)) {
                    formula = replace_formula_arg(TWO_INTEGER, com.cyc.cycjava.cycl.variable_unification.gather_dnf_arg_constraints_int(third(formula), mt), formula);
                } else {
                    if (NIL != el_universal_p(formula)) {
                        formula = replace_formula_arg(TWO_INTEGER, com.cyc.cycjava.cycl.variable_unification.gather_dnf_arg_constraints_int(third(formula), mt), formula);
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.variable_unification.el_negation_or_unknown_sentence_p(formula)) && (NIL != el_formula_with_operator_p(second(formula), $$isa))) {
                            formula = replace_formula_arg(ONE_INTEGER, com.cyc.cycjava.cycl.variable_unification.gather_dnf_arg_constraints_int(second(formula), mt), formula);
                        } else {
                            formula = at_var_types.formula_variables_arg_constraints(formula, mt, UNPROVIDED);
                        }
                    }
                }
            }
        }
        formula = list_utilities.tree_remove_all_if(symbol_function(NULL), formula, UNPROVIDED);
        formula = com.cyc.cycjava.cycl.variable_unification.collapse_groups(formula);
        return formula;
    }

    /**
     * Returns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),
     * taking into account #$and, #$or, and #$not.
     */
    @LispMethod(comment = "Returns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),\r\ntaking into account #$and, #$or, and #$not.\nReturns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),\ntaking into account #$and, #$or, and #$not.")
    public static SubLObject gather_dnf_arg_constraints_int(final SubLObject formula, final SubLObject mt) {
        if (NIL == el_formula_p(formula)) {
            return NIL;
        }
        final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        final SubLObject mt_list = make_list(length(args), mt);
        SubLObject ans = (NIL != el_conjunction_p(formula)) ? simplifier.conjoin(Mapping.mapcar(symbol_function(GATHER_DNF_ARG_CONSTRAINTS_INT), args, new SubLObject[]{ mt_list }), UNPROVIDED) : NIL != el_disjunction_p(formula) ? simplifier.disjoin(Mapping.mapcar(symbol_function(GATHER_DNF_ARG_CONSTRAINTS_INT), args, new SubLObject[]{ mt_list }), UNPROVIDED) : NIL != el_existential_p(formula) ? replace_formula_arg(TWO_INTEGER, gather_dnf_arg_constraints_int(cycl_utilities.formula_arg2(formula, UNPROVIDED), mt), formula) : NIL != el_universal_p(formula) ? replace_formula_arg(TWO_INTEGER, gather_dnf_arg_constraints_int(cycl_utilities.formula_arg2(formula, UNPROVIDED), mt), formula) : NIL != el_negation_or_unknown_sentence_p(formula) ? gather_dnf_arg_constraints_int(cycl_utilities.formula_arg1(formula, UNPROVIDED), mt) : at_var_types.formula_variables_arg_constraints(formula, mt, UNPROVIDED);
        ans = list_utilities.tree_remove_all_if(symbol_function(NULL), ans, UNPROVIDED);
        ans = collapse_groups(ans);
        return ans;
    }

    /**
     * Returns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),
     * taking into account #$and, #$or, and #$not.
     */
    @LispMethod(comment = "Returns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),\r\ntaking into account #$and, #$or, and #$not.\nReturns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),\ntaking into account #$and, #$or, and #$not.")
    public static final SubLObject gather_dnf_arg_constraints_alt(SubLObject formula, SubLObject mt) {
        formula = com.cyc.cycjava.cycl.variable_unification.convert_to_dnf(formula, UNPROVIDED);
        formula = com.cyc.cycjava.cycl.variable_unification.gather_dnf_arg_constraints_int(formula, mt);
        formula = com.cyc.cycjava.cycl.variable_unification.convert_to_dnf(formula, UNPROVIDED);
        return formula;
    }

    /**
     * Returns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),
     * taking into account #$and, #$or, and #$not.
     */
    @LispMethod(comment = "Returns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),\r\ntaking into account #$and, #$or, and #$not.\nReturns the arg constraints of FORMULA in MT in disjunctive normal form (DNF),\ntaking into account #$and, #$or, and #$not.")
    public static SubLObject gather_dnf_arg_constraints(final SubLObject formula, final SubLObject mt) {
        final SubLObject dnf = convert_to_dnf(formula, UNPROVIDED);
        final SubLObject constraints = gather_dnf_arg_constraints_int(dnf, mt);
        return convert_to_dnf(constraints, UNPROVIDED);
    }

    /**
     * Returns whether or not VAR1 and VAR2 can be unified in FORMULA, given MT.
     * If chacking multiple possible unifications, it is cheaper to just call
     * GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE directly.
     */
    @LispMethod(comment = "Returns whether or not VAR1 and VAR2 can be unified in FORMULA, given MT.\r\nIf chacking multiple possible unifications, it is cheaper to just call\r\nGET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE directly.\nReturns whether or not VAR1 and VAR2 can be unified in FORMULA, given MT.\nIf chacking multiple possible unifications, it is cheaper to just call\nGET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE directly.")
    public static final SubLObject can_unifyP_alt(SubLObject formula, SubLObject var1, SubLObject var2, SubLObject mt) {
        return makeBoolean(NIL == find(var2, dictionary.dictionary_lookup(com.cyc.cycjava.cycl.variable_unification.get_incompatible_variables_in_complex_sentence(formula, mt), var1, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Returns whether or not VAR1 and VAR2 can be unified in FORMULA, given MT.
     * If chacking multiple possible unifications, it is cheaper to just call
     * GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE directly.
     */
    @LispMethod(comment = "Returns whether or not VAR1 and VAR2 can be unified in FORMULA, given MT.\r\nIf chacking multiple possible unifications, it is cheaper to just call\r\nGET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE directly.\nReturns whether or not VAR1 and VAR2 can be unified in FORMULA, given MT.\nIf chacking multiple possible unifications, it is cheaper to just call\nGET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE directly.")
    public static SubLObject can_unifyP(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt) {
        return makeBoolean(NIL == find(var2, dictionary.dictionary_lookup(get_incompatible_variables_in_complex_sentence(formula, mt), var1, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Returns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable
     * is mapped to a list of the variables it cannot be unified with.
     */
    @LispMethod(comment = "Returns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\r\nis mapped to a list of the variables it cannot be unified with.\nReturns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\nis mapped to a list of the variables it cannot be unified with.")
    public static final SubLObject get_incompatible_variables_in_complex_sentence_alt(SubLObject formula, SubLObject mt) {
        {
            SubLObject constraint_disjunction = com.cyc.cycjava.cycl.variable_unification.gather_dnf_arg_constraints(formula, mt);
            SubLObject constraints = (NIL != el_disjunction_p(constraint_disjunction)) ? ((SubLObject) (cycl_utilities.formula_args(constraint_disjunction, UNPROVIDED))) : NIL != constraint_disjunction ? ((SubLObject) (list(constraint_disjunction))) : NIL;
            SubLObject incompatibles = com.cyc.cycjava.cycl.variable_unification.find_irreflexive_incompatibles(formula, mt);
            if (NIL != list_utilities.non_empty_list_p(constraints)) {
                {
                    SubLObject vars = sentence_variables(formula, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = vars;
                    SubLObject var1 = NIL;
                    for (var1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var1 = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_1 = vars;
                            SubLObject var2 = NIL;
                            for (var2 = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , var2 = cdolist_list_var_1.first()) {
                                if (NIL == com.cyc.cycjava.cycl.variable_unification.known_incompatible_varsP(incompatibles, var1, var2)) {
                                    {
                                        SubLObject candidateP = NIL;
                                        SubLObject compatibleP = NIL;
                                        SubLObject cdolist_list_var_2 = constraints;
                                        SubLObject possibility = NIL;
                                        for (possibility = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , possibility = cdolist_list_var_2.first()) {
                                            if ((NIL != list_utilities.tree_find(var1, possibility, UNPROVIDED, UNPROVIDED)) && (NIL != list_utilities.tree_find(var2, possibility, UNPROVIDED, UNPROVIDED))) {
                                                candidateP = T;
                                                {
                                                    SubLObject varmap = com.cyc.cycjava.cycl.variable_unification.get_var_map_for_formula(possibility, mt);
                                                    com.cyc.cycjava.cycl.variable_unification.add_incompatibles(value_tables.variable_mapping_table_incompatibles(varmap), incompatibles);
                                                }
                                                if (NIL == com.cyc.cycjava.cycl.variable_unification.known_incompatible_varsP(incompatibles, var1, var2)) {
                                                    compatibleP = T;
                                                }
                                            }
                                        }
                                        if (!((NIL == candidateP) || (NIL != compatibleP))) {
                                            dictionary_utilities.dictionary_pushnew(incompatibles, var1, var2, UNPROVIDED, UNPROVIDED);
                                            dictionary_utilities.dictionary_pushnew(incompatibles, var2, var1, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return incompatibles;
                }
            }
            {
                SubLObject varmap = com.cyc.cycjava.cycl.variable_unification.get_var_map_for_formula(constraints, mt);
                com.cyc.cycjava.cycl.variable_unification.add_incompatibles(value_tables.variable_mapping_table_incompatibles(varmap), incompatibles);
            }
            return incompatibles;
        }
    }

    /**
     * Returns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable
     * is mapped to a list of the variables it cannot be unified with.
     */
    @LispMethod(comment = "Returns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\r\nis mapped to a list of the variables it cannot be unified with.\nReturns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\nis mapped to a list of the variables it cannot be unified with.")
    public static SubLObject get_incompatible_variables_in_complex_sentence(final SubLObject formula, final SubLObject mt) {
        final SubLObject constraint_disjunction = gather_dnf_arg_constraints(formula, mt);
        final SubLObject constraints = (NIL != el_disjunction_p(constraint_disjunction)) ? cycl_utilities.formula_args(constraint_disjunction, UNPROVIDED) : NIL != constraint_disjunction ? list(constraint_disjunction) : NIL;
        final SubLObject incompatibles = find_irreflexive_incompatibles(formula, mt);
        if (NIL != list_utilities.non_empty_list_p(constraints)) {
            SubLObject cdolist_list_var;
            final SubLObject vars = cdolist_list_var = sentence_variables(formula, UNPROVIDED, UNPROVIDED);
            SubLObject var1 = NIL;
            var1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1 = vars;
                SubLObject var2 = NIL;
                var2 = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if (NIL == known_incompatible_varsP(incompatibles, var1, var2)) {
                        SubLObject candidateP = NIL;
                        SubLObject compatibleP = NIL;
                        SubLObject cdolist_list_var_$2 = constraints;
                        SubLObject possibility = NIL;
                        possibility = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            if ((NIL != list_utilities.tree_find(var1, possibility, UNPROVIDED, UNPROVIDED)) && (NIL != list_utilities.tree_find(var2, possibility, UNPROVIDED, UNPROVIDED))) {
                                candidateP = T;
                                final SubLObject varmap = get_var_map_for_formula(possibility, mt);
                                add_incompatibles(value_tables.variable_mapping_table_incompatibles(varmap), incompatibles);
                                if (NIL == known_incompatible_varsP(incompatibles, var1, var2)) {
                                    compatibleP = T;
                                }
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            possibility = cdolist_list_var_$2.first();
                        } 
                        if ((NIL != candidateP) && (NIL == compatibleP)) {
                            dictionary_utilities.dictionary_pushnew(incompatibles, var1, var2, UNPROVIDED, UNPROVIDED);
                            dictionary_utilities.dictionary_pushnew(incompatibles, var2, var1, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    var2 = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                var1 = cdolist_list_var.first();
            } 
            return incompatibles;
        }
        final SubLObject varmap2 = get_var_map_for_formula(constraints, mt);
        add_incompatibles(value_tables.variable_mapping_table_incompatibles(varmap2), incompatibles);
        return incompatibles;
    }

    /**
     * Returns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable
     * is mapped to a list of the variables it cannot be unified with.
     */
    @LispMethod(comment = "Returns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\r\nis mapped to a list of the variables it cannot be unified with.\nReturns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\nis mapped to a list of the variables it cannot be unified with.")
    public static final SubLObject find_irreflexive_incompatibles_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject incompatibles = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = clausifier.cnf_clausal_form(formula, mt);
                SubLObject disjunction = NIL;
                for (disjunction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunction = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_3 = disjunction;
                        SubLObject lits = NIL;
                        for (lits = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , lits = cdolist_list_var_3.first()) {
                            {
                                SubLObject cdolist_list_var_4 = lits;
                                SubLObject lit = NIL;
                                for (lit = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , lit = cdolist_list_var_4.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject success = formula_pattern_match.formula_matches_pattern(lit, $list_alt13);
                                        SubLObject v_bindings = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != success) {
                                            {
                                                SubLObject var2 = list_utilities.alist_lookup_without_values(v_bindings, VAR2, UNPROVIDED, UNPROVIDED);
                                                SubLObject var1 = list_utilities.alist_lookup_without_values(v_bindings, VAR1, UNPROVIDED, UNPROVIDED);
                                                dictionary_utilities.dictionary_pushnew(incompatibles, var1, var2, UNPROVIDED, UNPROVIDED);
                                                dictionary_utilities.dictionary_pushnew(incompatibles, var2, var1, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return incompatibles;
            }
        }
    }

    /**
     * Returns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable
     * is mapped to a list of the variables it cannot be unified with.
     */
    @LispMethod(comment = "Returns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\r\nis mapped to a list of the variables it cannot be unified with.\nReturns a DICTIONARY-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\nis mapped to a list of the variables it cannot be unified with.")
    public static SubLObject find_irreflexive_incompatibles(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject incompatibles = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject clausal_form = clausifier.cnf_clausal_form(formula, mt);
        if (!$$True.eql(clausal_form)) {
            SubLObject cdolist_list_var = clausal_form;
            SubLObject disjunction = NIL;
            disjunction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = disjunction;
                SubLObject lits = NIL;
                lits = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    SubLObject cdolist_list_var_$4 = lits;
                    SubLObject lit = NIL;
                    lit = cdolist_list_var_$4.first();
                    while (NIL != cdolist_list_var_$4) {
                        thread.resetMultipleValues();
                        final SubLObject success = formula_pattern_match.formula_matches_pattern(lit, $list13);
                        final SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            final SubLObject var2 = list_utilities.alist_lookup_without_values(v_bindings, VAR2, UNPROVIDED, UNPROVIDED);
                            final SubLObject var3 = list_utilities.alist_lookup_without_values(v_bindings, VAR1, UNPROVIDED, UNPROVIDED);
                            dictionary_utilities.dictionary_pushnew(incompatibles, var3, var2, UNPROVIDED, UNPROVIDED);
                            dictionary_utilities.dictionary_pushnew(incompatibles, var2, var3, UNPROVIDED, UNPROVIDED);
                        }
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        lit = cdolist_list_var_$4.first();
                    } 
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    lits = cdolist_list_var_$3.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                disjunction = cdolist_list_var.first();
            } 
        }
        return incompatibles;
    }

    public static final SubLObject add_incompatibles_alt(SubLObject source, SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject incompatible_vars = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = incompatible_vars;
                            SubLObject incompatible_var = NIL;
                            for (incompatible_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , incompatible_var = cdolist_list_var.first()) {
                                dictionary_utilities.dictionary_pushnew(target, var, incompatible_var, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return target;
        }
    }

    public static SubLObject add_incompatibles(SubLObject source, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject incompatible_vars = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = incompatible_vars;
            SubLObject incompatible_var = NIL;
            incompatible_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_pushnew(target, var, incompatible_var, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                incompatible_var = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return target;
    }

    public static final SubLObject known_incompatible_varsP_alt(SubLObject incompatibles, SubLObject var1, SubLObject var2) {
        return find(var2, dictionary.dictionary_lookup_without_values(incompatibles, var1, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject known_incompatible_varsP(final SubLObject incompatibles, final SubLObject var1, final SubLObject var2) {
        return find(var2, dictionary.dictionary_lookup_without_values(incompatibles, var1, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_var_map_for_formula_internal_alt(SubLObject formula, SubLObject mt) {
        return value_tables.get_variable_mapping_table_for_formulas(formula, formula, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_var_map_for_formula_internal(final SubLObject formula, final SubLObject mt) {
        return value_tables.get_variable_mapping_table_for_formulas(formula, formula, mt, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_var_map_for_formula_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.variable_unification.get_var_map_for_formula_internal(formula, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_VAR_MAP_FOR_FORMULA, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_VAR_MAP_FOR_FORMULA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GET_VAR_MAP_FOR_FORMULA, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw17$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.variable_unification.get_var_map_for_formula_internal(formula, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject get_var_map_for_formula(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return get_var_map_for_formula_internal(formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_VAR_MAP_FOR_FORMULA, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_VAR_MAP_FOR_FORMULA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GET_VAR_MAP_FOR_FORMULA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(get_var_map_for_formula_internal(formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Returns an ALIST-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable
     * is mapped to a list of the variables it cannot be unified with.
     */
    @LispMethod(comment = "Returns an ALIST-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\r\nis mapped to a list of the variables it cannot be unified with.\nReturns an ALIST-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\nis mapped to a list of the variables it cannot be unified with.")
    public static final SubLObject get_incompatible_variables_in_complex_sentence_as_alist_alt(SubLObject formula, SubLObject mt) {
        {
            SubLObject v_dictionary = com.cyc.cycjava.cycl.variable_unification.get_incompatible_variables_in_complex_sentence(formula, mt);
            return dictionary_utilities.dictionary_to_alist(v_dictionary);
        }
    }

    /**
     * Returns an ALIST-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable
     * is mapped to a list of the variables it cannot be unified with.
     */
    @LispMethod(comment = "Returns an ALIST-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\r\nis mapped to a list of the variables it cannot be unified with.\nReturns an ALIST-P mapping CYC-VAR? -> LISTP of CYC-VAR?, where each variable\nis mapped to a list of the variables it cannot be unified with.")
    public static SubLObject get_incompatible_variables_in_complex_sentence_as_alist(final SubLObject formula, final SubLObject mt) {
        final SubLObject v_dictionary = get_incompatible_variables_in_complex_sentence(formula, mt);
        return dictionary_utilities.dictionary_to_alist(v_dictionary);
    }

    /**
     *
     *
     * @unknown -- Use standard arg-constraint code, e.g. FORMULA-VARIABLES-ARG-CONSTRAINTS-DICT
     */
    @LispMethod(comment = "@unknown -- Use standard arg-constraint code, e.g. FORMULA-VARIABLES-ARG-CONSTRAINTS-DICT")
    public static final SubLObject gather_constraining_types_for_variable_in_constraint_conjunction_alt(SubLObject formula, SubLObject var, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != el_universal_p(formula)) || (NIL != el_general_existential_p(formula))) {
                return com.cyc.cycjava.cycl.variable_unification.gather_constraining_types_for_variable_in_constraint_conjunction(quantified_sub_sentence(formula), var, mt);
            }
            {
                SubLObject literals = (NIL != el_conjunction_p(formula)) ? ((SubLObject) (cycl_utilities.formula_args(formula, UNPROVIDED))) : list(formula);
                SubLObject isa_types = set.new_set(UNPROVIDED, UNPROVIDED);
                SubLObject genls_types = set.new_set(UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = literals;
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.variable_unification.el_negation_or_unknown_sentence_p(literal)) {
                        literal = cycl_utilities.formula_arg1(literal, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject success = formula_pattern_match.formula_matches_pattern(literal, listS($$isa, var, $list_alt18));
                            SubLObject v_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success) {
                                {
                                    SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                                    set_utilities.set_remove_all(genls.all_specs(col, mt, UNPROVIDED), isa_types);
                                }
                            }
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject success = formula_pattern_match.formula_matches_pattern(literal, listS($$genls, var, $list_alt18));
                            SubLObject v_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success) {
                                {
                                    SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                                    set_utilities.set_remove_all(genls.all_specs(col, mt, UNPROVIDED), genls_types);
                                }
                            }
                        }
                    } else {
                        thread.resetMultipleValues();
                        {
                            SubLObject success = formula_pattern_match.formula_matches_pattern(literal, listS($$isa, var, $list_alt18));
                            SubLObject v_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success) {
                                {
                                    SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                                    set_utilities.set_add_all(genls.all_genls(col, mt, UNPROVIDED), isa_types);
                                }
                            }
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject success = formula_pattern_match.formula_matches_pattern(literal, listS($$genls, var, $list_alt18));
                            SubLObject v_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success) {
                                {
                                    SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                                    set_utilities.set_add_all(genls.all_genls(col, mt, UNPROVIDED), genls_types);
                                }
                            }
                        }
                    }
                }
                return values(isa_types, genls_types);
            }
        }
    }

    /**
     *
     *
     * @unknown -- Use standard arg-constraint code, e.g. FORMULA-VARIABLES-ARG-CONSTRAINTS-DICT
     */
    @LispMethod(comment = "@unknown -- Use standard arg-constraint code, e.g. FORMULA-VARIABLES-ARG-CONSTRAINTS-DICT")
    public static SubLObject gather_constraining_types_for_variable_in_constraint_conjunction(final SubLObject formula, final SubLObject var, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_universal_p(formula)) || (NIL != el_general_existential_p(formula))) {
            return gather_constraining_types_for_variable_in_constraint_conjunction(quantified_sub_sentence(formula), var, mt);
        }
        final SubLObject literals = (NIL != el_conjunction_p(formula)) ? cycl_utilities.formula_args(formula, UNPROVIDED) : list(formula);
        final SubLObject isa_types = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject genls_types = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_negation_or_unknown_sentence_p(literal)) {
                literal = cycl_utilities.formula_arg1(literal, UNPROVIDED);
                thread.resetMultipleValues();
                SubLObject success = formula_pattern_match.formula_matches_pattern(literal, listS($$isa, var, $list18));
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                    set_utilities.set_remove_all(genls.all_specs(col, mt, UNPROVIDED), isa_types);
                }
                thread.resetMultipleValues();
                success = formula_pattern_match.formula_matches_pattern(literal, listS($$genls, var, $list18));
                v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                    set_utilities.set_remove_all(genls.all_specs(col, mt, UNPROVIDED), genls_types);
                }
            } else {
                thread.resetMultipleValues();
                SubLObject success = formula_pattern_match.formula_matches_pattern(literal, listS($$isa, var, $list18));
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                    set_utilities.set_add_all(genls.all_genls(col, mt, UNPROVIDED), isa_types);
                }
                thread.resetMultipleValues();
                success = formula_pattern_match.formula_matches_pattern(literal, listS($$genls, var, $list18));
                v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
                    set_utilities.set_add_all(genls.all_genls(col, mt, UNPROVIDED), genls_types);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return values(isa_types, genls_types);
    }

    /**
     * Given a conjunction of arg constraint literals, FORMULA1,
     * computes a score for how 'similar' the arg constraints
     * for VAR1 and VAR2 are in MT.
     */
    @LispMethod(comment = "Given a conjunction of arg constraint literals, FORMULA1,\r\ncomputes a score for how \'similar\' the arg constraints\r\nfor VAR1 and VAR2 are in MT.\nGiven a conjunction of arg constraint literals, FORMULA1,\ncomputes a score for how \'similar\' the arg constraints\nfor VAR1 and VAR2 are in MT.")
    public static final SubLObject variable_similarity_given_constraint_conjunction_alt(SubLObject formula, SubLObject var1, SubLObject var2, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject isa_types1 = com.cyc.cycjava.cycl.variable_unification.gather_constraining_types_for_variable_in_constraint_conjunction(formula, var1, mt);
                SubLObject genls_types1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject isa_types2 = com.cyc.cycjava.cycl.variable_unification.gather_constraining_types_for_variable_in_constraint_conjunction(formula, var2, mt);
                    SubLObject genls_types2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((set.set_size(isa_types1).numG(ZERO_INTEGER) && set.set_size(isa_types2).numG(ZERO_INTEGER)) || (set.set_size(genls_types1).numG(ZERO_INTEGER) && set.set_size(genls_types2).numG(ZERO_INTEGER))) {
                        {
                            SubLObject isa_types = set_utilities.set_intersection(list(isa_types1, isa_types2), UNPROVIDED);
                            SubLObject genls_types = set_utilities.set_intersection(list(genls_types1, genls_types2), UNPROVIDED);
                            SubLObject score = $float$0_0;
                            {
                                SubLObject set_contents_var = set.do_set_internal(isa_types);
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state = NIL;
                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    {
                                        SubLObject type = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                            score = add(score, divide($float$1_0, add(ONE_INTEGER, cardinality_estimates.generality_estimate(type))));
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject set_contents_var = set.do_set_internal(genls_types);
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state = NIL;
                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    {
                                        SubLObject type = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                            score = add(score, divide($float$1_0, add(ONE_INTEGER, cardinality_estimates.generality_estimate(type))));
                                        }
                                    }
                                }
                            }
                            return score;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Given a conjunction of arg constraint literals, FORMULA1,\r\ncomputes a score for how \'similar\' the arg constraints\r\nfor VAR1 and VAR2 are in MT.\nGiven a conjunction of arg constraint literals, FORMULA1,\ncomputes a score for how \'similar\' the arg constraints\nfor VAR1 and VAR2 are in MT.")
    public static SubLObject variable_similarity_given_constraint_conjunction(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject isa_types1 = gather_constraining_types_for_variable_in_constraint_conjunction(formula, var1, mt);
        final SubLObject genls_types1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject isa_types2 = gather_constraining_types_for_variable_in_constraint_conjunction(formula, var2, mt);
        final SubLObject genls_types2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((set.set_size(isa_types1).numG(ZERO_INTEGER) && set.set_size(isa_types2).numG(ZERO_INTEGER)) || (set.set_size(genls_types1).numG(ZERO_INTEGER) && set.set_size(genls_types2).numG(ZERO_INTEGER))) {
            final SubLObject isa_types3 = set_utilities.set_intersection(list(isa_types1, isa_types2), UNPROVIDED);
            final SubLObject genls_types3 = set_utilities.set_intersection(list(genls_types1, genls_types2), UNPROVIDED);
            SubLObject score = $float$0_0;
            SubLObject set_contents_var = set.do_set_internal(isa_types3);
            SubLObject basis_object;
            SubLObject state;
            SubLObject type;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                type = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                    score = add(score, divide($float$1_0, add(ONE_INTEGER, cardinality_estimates.generality_estimate(type))));
                }
            }
            set_contents_var = set.do_set_internal(genls_types3);
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                type = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                    score = add(score, divide($float$1_0, add(ONE_INTEGER, cardinality_estimates.generality_estimate(type))));
                }
            }
            return score;
        }
        return NIL;
    }

    /**
     * Computes a score for how 'similar' the arg constraints for VAR1 and VAR2 are
     * in FORMULA and MT.
     */
    @LispMethod(comment = "Computes a score for how \'similar\' the arg constraints for VAR1 and VAR2 are\r\nin FORMULA and MT.\nComputes a score for how \'similar\' the arg constraints for VAR1 and VAR2 are\nin FORMULA and MT.")
    public static final SubLObject variable_similarity_internal_alt(SubLObject formula, SubLObject var1, SubLObject var2, SubLObject mt) {
        {
            SubLObject total = $float$0_0;
            SubLObject count = ZERO_INTEGER;
            SubLObject constraints = com.cyc.cycjava.cycl.variable_unification.gather_dnf_arg_constraints(formula, mt);
            SubLObject constraint_conjunctions = (constraints.isList() && (constraints.first() == $$or)) ? ((SubLObject) (constraints.rest())) : list(constraints);
            SubLObject cdolist_list_var = constraint_conjunctions;
            SubLObject constraint_conjunction = NIL;
            for (constraint_conjunction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_conjunction = cdolist_list_var.first()) {
                {
                    SubLObject v_similarity = com.cyc.cycjava.cycl.variable_unification.variable_similarity_given_constraint_conjunction(constraint_conjunction, var1, var2, mt);
                    if (NIL != v_similarity) {
                        total = add(v_similarity, total);
                        count = add(count, ONE_INTEGER);
                    }
                }
            }
            if (count.numG(ZERO_INTEGER)) {
                return divide(total, count);
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Computes a score for how \'similar\' the arg constraints for VAR1 and VAR2 are\r\nin FORMULA and MT.\nComputes a score for how \'similar\' the arg constraints for VAR1 and VAR2 are\nin FORMULA and MT.")
    public static SubLObject variable_similarity_internal(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt) {
        SubLObject total = $float$0_0;
        SubLObject count = ZERO_INTEGER;
        final SubLObject constraints = gather_dnf_arg_constraints(formula, mt);
        SubLObject cdolist_list_var;
        final SubLObject constraint_conjunctions = cdolist_list_var = (constraints.isList() && constraints.first().eql($$or)) ? constraints.rest() : list(constraints);
        SubLObject constraint_conjunction = NIL;
        constraint_conjunction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_similarity = variable_similarity_given_constraint_conjunction(constraint_conjunction, var1, var2, mt);
            if (NIL != v_similarity) {
                total = add(v_similarity, total);
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_conjunction = cdolist_list_var.first();
        } 
        if (count.numG(ZERO_INTEGER)) {
            return divide(total, count);
        }
        return NIL;
    }

    public static final SubLObject variable_similarity_alt(SubLObject formula, SubLObject var1, SubLObject var2, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.variable_unification.variable_similarity_internal(formula, var1, var2, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, VARIABLE_SIMILARITY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), VARIABLE_SIMILARITY, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, VARIABLE_SIMILARITY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(formula, var1, var2, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw17$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (var1.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (var2.equal(cached_args.first())) {
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
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.variable_unification.variable_similarity_internal(formula, var1, var2, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, var1, var2, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject variable_similarity(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return variable_similarity_internal(formula, var1, var2, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, VARIABLE_SIMILARITY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), VARIABLE_SIMILARITY, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, VARIABLE_SIMILARITY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(formula, var1, var2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (var1.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (var2.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(variable_similarity_internal(formula, var1, var2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, var1, var2, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject variable_similarity_about_the_sameP_alt(SubLObject sim1, SubLObject sim2, SubLObject fudge_factor) {
        if (fudge_factor == UNPROVIDED) {
            fudge_factor = $variable_similarity_default_fudge_factor$.getGlobalValue();
        }
        if (sim1.numE(sim2)) {
            return T;
        } else {
            if ((fudge_factor.numG(ZERO_INTEGER) && multiply(fudge_factor, sim1).numG(sim2)) && multiply(fudge_factor, sim2).numG(sim1)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject variable_similarity_about_the_sameP(final SubLObject sim1, final SubLObject sim2, SubLObject fudge_factor) {
        if (fudge_factor == UNPROVIDED) {
            fudge_factor = $variable_similarity_default_fudge_factor$.getGlobalValue();
        }
        if (sim1.numE(sim2)) {
            return T;
        }
        if ((fudge_factor.numG(ZERO_INTEGER) && multiply(fudge_factor, sim1).numG(sim2)) && multiply(fudge_factor, sim2).numG(sim1)) {
            return T;
        }
        return NIL;
    }

    /**
     * This function attempts to unify the variables in FORMULA from SOURCE-FORMULA with
     * the variables from TARGET-FORMULA, given that the formulas have been combined to
     * produce FORMULA.  This is different from the non-complex version of the function
     * because the combined query is needed to determine argument constraints when
     * negations are involved in one of the formulas.
     *
     * @param ALLOW-DUPLICATE-LITERALS?;
     * 		if NIL, don't choose to any pair of variables the unification of which
     * 		would result in the formula having two indentical literals in the same
     * 		conjunction that weren't duplicates in the input formulas.
     * @param FREE-VARIABLES-ONLY?;
     * 		if T, don't consider unifying variables that are existentially bound.
     * @return alist-p; list of dotted pairs of variables to unify.
     */
    @LispMethod(comment = "This function attempts to unify the variables in FORMULA from SOURCE-FORMULA with\r\nthe variables from TARGET-FORMULA, given that the formulas have been combined to\r\nproduce FORMULA.  This is different from the non-complex version of the function\r\nbecause the combined query is needed to determine argument constraints when\r\nnegations are involved in one of the formulas.\r\n\r\n@param ALLOW-DUPLICATE-LITERALS?;\r\n\t\tif NIL, don\'t choose to any pair of variables the unification of which\r\n\t\twould result in the formula having two indentical literals in the same\r\n\t\tconjunction that weren\'t duplicates in the input formulas.\r\n@param FREE-VARIABLES-ONLY?;\r\n\t\tif T, don\'t consider unifying variables that are existentially bound.\r\n@return alist-p; list of dotted pairs of variables to unify.\nThis function attempts to unify the variables in FORMULA from SOURCE-FORMULA with\nthe variables from TARGET-FORMULA, given that the formulas have been combined to\nproduce FORMULA.  This is different from the non-complex version of the function\nbecause the combined query is needed to determine argument constraints when\nnegations are involved in one of the formulas.")
    public static final SubLObject attempt_to_combine_variables_in_complex_combination_alt(SubLObject formula, SubLObject source_formula, SubLObject target_formula, SubLObject elmt, SubLObject allow_duplicate_literalsP, SubLObject free_variables_onlyP, SubLObject varP) {
        if (allow_duplicate_literalsP == UNPROVIDED) {
            allow_duplicate_literalsP = NIL;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        if (varP == UNPROVIDED) {
            varP = $sym26$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(varP, FUNCTION_SPEC_P);
            {
                SubLObject result = NIL;
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
                                            Errors.error($str_alt28$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject incompatibles = com.cyc.cycjava.cycl.variable_unification.get_incompatible_variables_in_complex_sentence(formula, elmt);
                                    SubLObject source_vars = (NIL != free_variables_onlyP) ? ((SubLObject) (sentence_free_variables(source_formula, NIL, varP, UNPROVIDED))) : list_utilities.tree_gather(source_formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject target_vars = (NIL != free_variables_onlyP) ? ((SubLObject) (sentence_free_variables(target_formula, NIL, varP, UNPROVIDED))) : list_utilities.tree_gather(target_formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject hit_count = dictionary.new_dictionary(symbol_function(EQL), TEN_INTEGER);
                                    SubLObject matches = NIL;
                                    {
                                        SubLObject cdolist_list_var = source_vars;
                                        SubLObject source_var_i = NIL;
                                        for (source_var_i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , source_var_i = cdolist_list_var.first()) {
                                            {
                                                SubLObject cdolist_list_var_5 = target_vars;
                                                SubLObject target_var_j = NIL;
                                                for (target_var_j = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , target_var_j = cdolist_list_var_5.first()) {
                                                    {
                                                        SubLObject incomp = dictionary.dictionary_lookup(incompatibles, source_var_i, UNPROVIDED);
                                                        SubLObject redundant = com.cyc.cycjava.cycl.variable_unification.new_redundant_literals(formula, elmt, source_var_i, target_var_j);
                                                        if ((NIL != funcall(varP, source_var_i)) && (NIL != funcall(varP, target_var_j))) {
                                                            {
                                                                SubLObject possibleP = makeBoolean((NIL != allow_duplicate_literalsP) || (NIL == redundant));
                                                                if ((NIL != incomp) && (NIL != possibleP)) {
                                                                    if (NIL != subl_promotions.memberP(target_var_j, incomp, UNPROVIDED, UNPROVIDED)) {
                                                                        possibleP = NIL;
                                                                    }
                                                                }
                                                                if ((NIL != possibleP) && (source_var_i != target_var_j)) {
                                                                    matches = list_utilities.alist_enter(matches, source_var_i, target_var_j, UNPROVIDED);
                                                                    dictionary_utilities.dictionary_increment(hit_count, source_var_i, UNPROVIDED);
                                                                    dictionary_utilities.dictionary_increment(hit_count, target_var_j, UNPROVIDED);
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
                                        SubLObject cons = NIL;
                                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum = cons;
                                                SubLObject current = datum;
                                                SubLObject var1 = NIL;
                                                SubLObject var2 = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt29);
                                                var1 = current.first();
                                                current = current.rest();
                                                var2 = current;
                                                {
                                                    SubLObject var1_count = dictionary.dictionary_lookup_without_values(hit_count, var1, UNPROVIDED);
                                                    SubLObject var2_count = dictionary.dictionary_lookup_without_values(hit_count, var2, UNPROVIDED);
                                                    if (((var1_count.isInteger() && var2_count.isInteger()) && var1_count.numE(ONE_INTEGER)) && var2_count.numE(ONE_INTEGER)) {
                                                        result = list_utilities.alist_enter(result, var1, var2, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!((NIL != result) || (NIL != list_utilities.empty_list_p(matches)))) {
                                        result = com.cyc.cycjava.cycl.variable_unification.pick_variable_to_combine(matches, formula, elmt, allow_duplicate_literalsP);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "This function attempts to unify the variables in FORMULA from SOURCE-FORMULA with\r\nthe variables from TARGET-FORMULA, given that the formulas have been combined to\r\nproduce FORMULA.  This is different from the non-complex version of the function\r\nbecause the combined query is needed to determine argument constraints when\r\nnegations are involved in one of the formulas.\r\n\r\n@param ALLOW-DUPLICATE-LITERALS?;\r\n\t\tif NIL, don\'t choose to any pair of variables the unification of which\r\n\t\twould result in the formula having two indentical literals in the same\r\n\t\tconjunction that weren\'t duplicates in the input formulas.\r\n@param FREE-VARIABLES-ONLY?;\r\n\t\tif T, don\'t consider unifying variables that are existentially bound.\r\n@return alist-p; list of dotted pairs of variables to unify.\nThis function attempts to unify the variables in FORMULA from SOURCE-FORMULA with\nthe variables from TARGET-FORMULA, given that the formulas have been combined to\nproduce FORMULA.  This is different from the non-complex version of the function\nbecause the combined query is needed to determine argument constraints when\nnegations are involved in one of the formulas.")
    public static SubLObject attempt_to_combine_variables_in_complex_combination(final SubLObject formula, final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt, SubLObject allow_duplicate_literalsP, SubLObject free_variables_onlyP, SubLObject varP) {
        if (allow_duplicate_literalsP == UNPROVIDED) {
            allow_duplicate_literalsP = NIL;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        if (varP == UNPROVIDED) {
            varP = $sym26$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(varP) : "! function_spec_p(varP) " + ("Types.function_spec_p(varP) " + "CommonSymbols.NIL != Types.function_spec_p(varP) ") + varP;
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject incompatibles = get_incompatible_variables_in_complex_sentence(formula, elmt);
                final SubLObject source_vars = (NIL != free_variables_onlyP) ? sentence_free_variables(source_formula, NIL, varP, UNPROVIDED) : list_utilities.tree_gather(source_formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject target_vars = (NIL != free_variables_onlyP) ? sentence_free_variables(target_formula, NIL, varP, UNPROVIDED) : list_utilities.tree_gather(target_formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject hit_count = dictionary.new_dictionary(symbol_function(EQL), TEN_INTEGER);
                SubLObject matches = NIL;
                SubLObject cdolist_list_var = source_vars;
                SubLObject source_var_i = NIL;
                source_var_i = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$5 = target_vars;
                    SubLObject target_var_j = NIL;
                    target_var_j = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        final SubLObject incomp = dictionary.dictionary_lookup(incompatibles, source_var_i, UNPROVIDED);
                        final SubLObject redundant = new_redundant_literals(formula, elmt, source_var_i, target_var_j);
                        if ((NIL != funcall(varP, source_var_i)) && (NIL != funcall(varP, target_var_j))) {
                            SubLObject possibleP = makeBoolean((NIL != allow_duplicate_literalsP) || (NIL == redundant));
                            if (((NIL != incomp) && (NIL != possibleP)) && (NIL != subl_promotions.memberP(target_var_j, incomp, UNPROVIDED, UNPROVIDED))) {
                                possibleP = NIL;
                            }
                            if ((NIL != possibleP) && (!source_var_i.eql(target_var_j))) {
                                matches = list_utilities.alist_push(matches, source_var_i, target_var_j, UNPROVIDED);
                                dictionary_utilities.dictionary_increment(hit_count, source_var_i, UNPROVIDED);
                                dictionary_utilities.dictionary_increment(hit_count, target_var_j, UNPROVIDED);
                            }
                        }
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        target_var_j = cdolist_list_var_$5.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    source_var_i = cdolist_list_var.first();
                } 
                cdolist_list_var = matches;
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject var1 = NIL;
                    SubLObject vars = NIL;
                    destructuring_bind_must_consp(current, datum, $list28);
                    var1 = current.first();
                    current = vars = current.rest();
                    if (NIL != list_utilities.singletonP(vars)) {
                        final SubLObject var2 = list_utilities.only_one(vars);
                        final SubLObject var1_count = dictionary.dictionary_lookup_without_values(hit_count, var1, UNPROVIDED);
                        final SubLObject var2_count = dictionary.dictionary_lookup_without_values(hit_count, var2, UNPROVIDED);
                        if (var1_count.eql(ONE_INTEGER) && var2_count.eql(ONE_INTEGER)) {
                            result = list_utilities.alist_enter(result, var1, var2, UNPROVIDED);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                } 
                if ((NIL == result) && (NIL == list_utilities.empty_list_p(matches))) {
                    result = pick_variable_to_combine(matches, formula, elmt, allow_duplicate_literalsP);
                }
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject pick_variable_to_combine_alt(SubLObject matches, SubLObject formula, SubLObject elmt, SubLObject allow_duplicate_literalsP) {
        {
            SubLObject scored = NIL;
            {
                SubLObject cdolist_list_var = matches;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject source_var = NIL;
                        SubLObject target_var = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt30);
                        source_var = current.first();
                        current = current.rest();
                        target_var = current;
                        if (!((NIL == allow_duplicate_literalsP) && (NIL != com.cyc.cycjava.cycl.variable_unification.new_redundant_literals(formula, elmt, source_var, target_var)))) {
                            {
                                SubLObject score = com.cyc.cycjava.cycl.variable_unification.variable_similarity(formula, source_var, target_var, elmt);
                                if (NIL != score) {
                                    scored = list_utilities.alist_enter(scored, cons(source_var, target_var), score, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject duplicates = list_utilities.duplicates(scored, $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_, CDR);
                SubLObject non_duplicates = copy_list(scored);
                SubLObject cdolist_list_var = duplicates;
                SubLObject duplicate = NIL;
                for (duplicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , duplicate = cdolist_list_var.first()) {
                    non_duplicates = delete(duplicate.rest(), non_duplicates, $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_, CDR, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != list_utilities.non_empty_list_p(non_duplicates)) {
                    {
                        SubLObject best = number_utilities.maximum(non_duplicates, CDR).first();
                        return list(best);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject pick_variable_to_combine(final SubLObject matches, final SubLObject formula, final SubLObject elmt, final SubLObject allow_duplicate_literalsP) {
        SubLObject scored = NIL;
        SubLObject cdolist_list_var = matches;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject source_var = NIL;
            SubLObject target_vars = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            source_var = current.first();
            current = current.rest();
            SubLObject cdolist_list_var_$7;
            target_vars = cdolist_list_var_$7 = current;
            SubLObject target_var = NIL;
            target_var = cdolist_list_var_$7.first();
            while (NIL != cdolist_list_var_$7) {
                if ((NIL != allow_duplicate_literalsP) || (NIL == new_redundant_literals(formula, elmt, source_var, target_var))) {
                    final SubLObject score = variable_similarity(formula, source_var, target_var, elmt);
                    if (NIL != score) {
                        scored = list_utilities.alist_enter(scored, cons(source_var, target_var), score, UNPROVIDED);
                    }
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                target_var = cdolist_list_var_$7.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        final SubLObject duplicates = list_utilities.duplicates(scored, $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_, CDR);
        SubLObject non_duplicates = copy_list(scored);
        SubLObject cdolist_list_var2 = duplicates;
        SubLObject duplicate = NIL;
        duplicate = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            non_duplicates = delete(duplicate.rest(), non_duplicates, $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_, CDR, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            duplicate = cdolist_list_var2.first();
        } 
        if (NIL != list_utilities.non_empty_list_p(non_duplicates)) {
            final SubLObject best = number_utilities.maximum(non_duplicates, CDR).first();
            return list(best);
        }
        return NIL;
    }

    /**
     *
     *
     * @return T iff LITERAL1 and LITERAL2 are redundant.
    They are redundant if they are identical, or if they
    are identical except one predicate is a specPred of
    the other predicate, or if they would be identical
    if VAR1 and VAR2 were unified.
     */
    @LispMethod(comment = "@return T iff LITERAL1 and LITERAL2 are redundant.\r\nThey are redundant if they are identical, or if they\r\nare identical except one predicate is a specPred of\r\nthe other predicate, or if they would be identical\r\nif VAR1 and VAR2 were unified.")
    public static final SubLObject literals_redundantP_alt(SubLObject literal1, SubLObject literal2, SubLObject mt, SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = NIL;
        }
        if (!length(literal1).numE(length(literal2))) {
            return NIL;
        }
        {
            SubLObject argpos = ZERO_INTEGER;
            SubLObject arg1 = NIL;
            SubLObject arg1_7 = NIL;
            SubLObject arg2 = NIL;
            SubLObject arg2_8 = NIL;
            for (arg1 = literal1, arg1_7 = arg1.first(), arg2 = literal2, arg2_8 = arg2.first(); !((NIL == arg2) && (NIL == arg1)); arg1 = arg1.rest() , arg1_7 = arg1.first() , arg2 = arg2.rest() , arg2_8 = arg2.first()) {
                if (!((((NIL == var1) || (NIL == var2)) || (((NIL != find(var1, literal1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != find(var2, literal1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && ((NIL != find(var1, literal2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != find(var2, literal2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) && ((((argpos.numE(ZERO_INTEGER) && ((NIL != genl_predicates.genl_predP(arg1_7, arg2_8, mt, UNPROVIDED)) || (NIL != genl_predicates.genl_predP(arg2_8, arg1_7, mt, UNPROVIDED)))) || ((NIL != cycl_variables.cyc_varP(arg1_7)) && arg1_7.equal(arg2_8))) || (((NIL != var1) && (NIL != var2)) && ((arg1_7.equal(var1) && arg2_8.equal(var2)) || (arg1_7.equal(var2) && arg2_8.equal(var1))))) || (((NIL == cycl_variables.cyc_varP(arg1_7)) && (NIL == cycl_variables.cyc_varP(arg2_8))) && ((NIL != genls.genlsP(arg1_7, arg2_8, mt, UNPROVIDED)) || (NIL != genls.genlsP(arg2_8, arg1_7, mt, UNPROVIDED))))))) {
                    return NIL;
                }
                argpos = add(argpos, ONE_INTEGER);
            }
        }
        return T;
    }

    /**
     *
     *
     * @return T iff LITERAL1 and LITERAL2 are redundant.
    They are redundant if they are identical, or if they
    are identical except one predicate is a specPred of
    the other predicate, or if they would be identical
    if VAR1 and VAR2 were unified.
     */
    @LispMethod(comment = "@return T iff LITERAL1 and LITERAL2 are redundant.\r\nThey are redundant if they are identical, or if they\r\nare identical except one predicate is a specPred of\r\nthe other predicate, or if they would be identical\r\nif VAR1 and VAR2 were unified.")
    public static SubLObject literals_redundantP(final SubLObject literal1, final SubLObject literal2, final SubLObject mt, SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = NIL;
        }
        if (!length(literal1).numE(length(literal2))) {
            return NIL;
        }
        SubLObject argpos = ZERO_INTEGER;
        SubLObject arg1 = NIL;
        SubLObject arg1_$8 = NIL;
        SubLObject arg2 = NIL;
        SubLObject arg2_$9 = NIL;
        arg1 = literal1;
        arg1_$8 = arg1.first();
        arg2 = literal2;
        arg2_$9 = arg2.first();
        while ((NIL != arg2) || (NIL != arg1)) {
            if ((((NIL != var1) && (NIL != var2)) && (((NIL == find(var1, literal1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find(var2, literal1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || ((NIL == find(var1, literal2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find(var2, literal2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) || (((((!argpos.numE(ZERO_INTEGER)) || ((NIL == genl_predicates.genl_predP(arg1_$8, arg2_$9, mt, UNPROVIDED)) && (NIL == genl_predicates.genl_predP(arg2_$9, arg1_$8, mt, UNPROVIDED)))) && ((NIL == cycl_variables.cyc_varP(arg1_$8)) || (!arg1_$8.equal(arg2_$9)))) && (((NIL == var1) || (NIL == var2)) || (((!arg1_$8.equal(var1)) || (!arg2_$9.equal(var2))) && ((!arg1_$8.equal(var2)) || (!arg2_$9.equal(var1)))))) && (((NIL != cycl_variables.cyc_varP(arg1_$8)) || (NIL != cycl_variables.cyc_varP(arg2_$9))) || ((NIL == genls.genlsP(arg1_$8, arg2_$9, mt, UNPROVIDED)) && (NIL == genls.genlsP(arg2_$9, arg1_$8, mt, UNPROVIDED)))))) {
                return NIL;
            }
            argpos = add(argpos, ONE_INTEGER);
            arg1 = arg1.rest();
            arg1_$8 = arg1.first();
            arg2 = arg2.rest();
            arg2_$9 = arg2.first();
        } 
        return T;
    }

    /**
     * Returns a list of dotted pairs where each pair is a pair of
     * literals that are in FORMULA and are redundant with each other.
     *
     * @param FORMULA
     * 		el-formula-p; MUST MUST MUST be a conjunction of literals.
     * @param VAR1,
     * 		VAR2 cyc-var?; if non-NIL, literals are considered redundant
     * 		if they would be redundant if VAR1 and VAR2 were unified.
     */
    @LispMethod(comment = "Returns a list of dotted pairs where each pair is a pair of\r\nliterals that are in FORMULA and are redundant with each other.\r\n\r\n@param FORMULA\r\n\t\tel-formula-p; MUST MUST MUST be a conjunction of literals.\r\n@param VAR1,\r\n\t\tVAR2 cyc-var?; if non-NIL, literals are considered redundant\r\n\t\tif they would be redundant if VAR1 and VAR2 were unified.\nReturns a list of dotted pairs where each pair is a pair of\nliterals that are in FORMULA and are redundant with each other.")
    public static final SubLObject redundant_literals_in_conjunctionP_alt(SubLObject formula, SubLObject mt, SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = NIL;
        }
        {
            SubLObject redundant_pairs = NIL;
            if (NIL != formula_pattern_match.formula_matches_pattern(formula, $list_alt32)) {
                {
                    SubLObject literals = cycl_utilities.formula_args(formula, UNPROVIDED);
                    SubLObject cdolist_list_var = literals;
                    SubLObject literal1 = NIL;
                    for (literal1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal1 = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_9 = literals;
                            SubLObject literal2 = NIL;
                            for (literal2 = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , literal2 = cdolist_list_var_9.first()) {
                                if (literal1 != literal2) {
                                    if (NIL != com.cyc.cycjava.cycl.variable_unification.literals_redundantP(literal1, literal2, mt, var1, var2)) {
                                        redundant_pairs = cons(cons(literal1, literal2), redundant_pairs);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return redundant_pairs;
        }
    }

    /**
     * Returns a list of dotted pairs where each pair is a pair of
     * literals that are in FORMULA and are redundant with each other.
     *
     * @param FORMULA
     * 		el-formula-p; MUST MUST MUST be a conjunction of literals.
     * @param VAR1,
     * 		VAR2 cyc-var?; if non-NIL, literals are considered redundant
     * 		if they would be redundant if VAR1 and VAR2 were unified.
     */
    @LispMethod(comment = "Returns a list of dotted pairs where each pair is a pair of\r\nliterals that are in FORMULA and are redundant with each other.\r\n\r\n@param FORMULA\r\n\t\tel-formula-p; MUST MUST MUST be a conjunction of literals.\r\n@param VAR1,\r\n\t\tVAR2 cyc-var?; if non-NIL, literals are considered redundant\r\n\t\tif they would be redundant if VAR1 and VAR2 were unified.\nReturns a list of dotted pairs where each pair is a pair of\nliterals that are in FORMULA and are redundant with each other.")
    public static SubLObject redundant_literals_in_conjunctionP(final SubLObject formula, final SubLObject mt, SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = NIL;
        }
        SubLObject redundant_pairs = NIL;
        if (NIL != formula_pattern_match.formula_matches_pattern(formula, $list31)) {
            SubLObject cdolist_list_var;
            final SubLObject literals = cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject literal1 = NIL;
            literal1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$10 = literals;
                SubLObject literal2 = NIL;
                literal2 = cdolist_list_var_$10.first();
                while (NIL != cdolist_list_var_$10) {
                    if ((!literal1.eql(literal2)) && (NIL != literals_redundantP(literal1, literal2, mt, var1, var2))) {
                        redundant_pairs = cons(cons(literal1, literal2), redundant_pairs);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    literal2 = cdolist_list_var_$10.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                literal1 = cdolist_list_var.first();
            } 
        }
        return redundant_pairs;
    }

    /**
     * Returns a list of dotted pairs where each pair is a pair of
     * literals that are in FORMULA and would become redundant with each other if VAR1 and VAR2 were unified.
     *
     * @param FORMULA
     * 		el-formula-p; any formula.
     * @param VAR1,
     * 		VAR2 cyc-var?;
     */
    @LispMethod(comment = "Returns a list of dotted pairs where each pair is a pair of\r\nliterals that are in FORMULA and would become redundant with each other if VAR1 and VAR2 were unified.\r\n\r\n@param FORMULA\r\n\t\tel-formula-p; any formula.\r\n@param VAR1,\r\n\t\tVAR2 cyc-var?;\nReturns a list of dotted pairs where each pair is a pair of\nliterals that are in FORMULA and would become redundant with each other if VAR1 and VAR2 were unified.")
    public static final SubLObject new_redundant_literals_alt(SubLObject formula, SubLObject mt, SubLObject var1, SubLObject var2) {
        return remove_if($sym33$CAR_CDR_EQUAL_, com.cyc.cycjava.cycl.variable_unification.find_redundant_literals_int(formula, mt, var1, var2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns a list of dotted pairs where each pair is a pair of\r\nliterals that are in FORMULA and would become redundant with each other if VAR1 and VAR2 were unified.\r\n\r\n@param FORMULA\r\n\t\tel-formula-p; any formula.\r\n@param VAR1,\r\n\t\tVAR2 cyc-var?;\nReturns a list of dotted pairs where each pair is a pair of\nliterals that are in FORMULA and would become redundant with each other if VAR1 and VAR2 were unified.")
    public static SubLObject new_redundant_literals(final SubLObject formula, final SubLObject mt, final SubLObject var1, final SubLObject var2) {
        return remove_if($sym32$CAR_CDR_EQUAL_, find_redundant_literals_int(formula, mt, var1, var2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns a list of dotted pairs where each pair is a pair of
     * literals that are in FORMULA and would become redundant with each other if VAR1 and VAR2 were unified.
     *
     * @param FORMULA
     * 		el-formula-p; any formula.
     * @param VAR1,
     * 		VAR2 cyc-var?;
     */


    public static final SubLObject car_cdr_equalP_alt(SubLObject pair) {
        return equal(pair.first(), pair.rest());
    }

    public static SubLObject car_cdr_equalP(final SubLObject pair) {
        return equal(pair.first(), pair.rest());
    }

    /**
     * Returns a list of dotted pairs where each pair is a pair of
     * literals that are in FORMULA and are redundant with each other.
     */
    @LispMethod(comment = "Returns a list of dotted pairs where each pair is a pair of\r\nliterals that are in FORMULA and are redundant with each other.\nReturns a list of dotted pairs where each pair is a pair of\nliterals that are in FORMULA and are redundant with each other.")
    public static final SubLObject find_redundant_literals_alt(SubLObject formula, SubLObject mt) {
        return com.cyc.cycjava.cycl.variable_unification.find_redundant_literals_int(formula, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns a list of dotted pairs where each pair is a pair of\r\nliterals that are in FORMULA and are redundant with each other.\nReturns a list of dotted pairs where each pair is a pair of\nliterals that are in FORMULA and are redundant with each other.")
    public static SubLObject find_redundant_literals(final SubLObject formula, final SubLObject mt) {
        return find_redundant_literals_int(formula, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns a list of dotted pairs where each pair is a pair of
     * literals that are in FORMULA and are redundant with each other.
     */


    /**
     * Returns a list of dotted pairs where each pair is a pair of
     * literals that are in FORMULA and are redundant with each other.
     *
     * @param FORMULA
     * 		el-formula-p; any formula.
     * @param VAR1,
     * 		VAR2 cyc-var?; if non-NIL, literals are considered redundant
     * 		if they would be redundant if VAR1 and VAR2 were unified.
     */
    @LispMethod(comment = "Returns a list of dotted pairs where each pair is a pair of\r\nliterals that are in FORMULA and are redundant with each other.\r\n\r\n@param FORMULA\r\n\t\tel-formula-p; any formula.\r\n@param VAR1,\r\n\t\tVAR2 cyc-var?; if non-NIL, literals are considered redundant\r\n\t\tif they would be redundant if VAR1 and VAR2 were unified.\nReturns a list of dotted pairs where each pair is a pair of\nliterals that are in FORMULA and are redundant with each other.")
    public static final SubLObject find_redundant_literals_int_alt(SubLObject formula, SubLObject mt, SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = NIL;
        }
        formula = com.cyc.cycjava.cycl.variable_unification.convert_to_dnf(formula, UNPROVIDED);
        formula = com.cyc.cycjava.cycl.variable_unification.separate_bindings_from_sentence(formula);
        if (NIL != formula_pattern_match.formula_matches_pattern(formula, $list_alt35)) {
            {
                SubLObject redundant_pairs = NIL;
                SubLObject conjunctions = cycl_utilities.formula_args(formula, UNPROVIDED);
                SubLObject cdolist_list_var = conjunctions;
                SubLObject conjunction = NIL;
                for (conjunction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunction = cdolist_list_var.first()) {
                    redundant_pairs = append(redundant_pairs, com.cyc.cycjava.cycl.variable_unification.redundant_literals_in_conjunctionP(conjunction, mt, var1, var2));
                }
                return redundant_pairs;
            }
        }
        return com.cyc.cycjava.cycl.variable_unification.redundant_literals_in_conjunctionP(formula, mt, var1, var2);
    }

    @LispMethod(comment = "Returns a list of dotted pairs where each pair is a pair of\r\nliterals that are in FORMULA and are redundant with each other.\r\n\r\n@param FORMULA\r\n\t\tel-formula-p; any formula.\r\n@param VAR1,\r\n\t\tVAR2 cyc-var?; if non-NIL, literals are considered redundant\r\n\t\tif they would be redundant if VAR1 and VAR2 were unified.\nReturns a list of dotted pairs where each pair is a pair of\nliterals that are in FORMULA and are redundant with each other.")
    public static SubLObject find_redundant_literals_int(SubLObject formula, final SubLObject mt, SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = NIL;
        }
        formula = convert_to_dnf(formula, UNPROVIDED);
        formula = separate_bindings_from_sentence(formula);
        if (NIL != formula_pattern_match.formula_matches_pattern(formula, $list34)) {
            SubLObject redundant_pairs = NIL;
            SubLObject cdolist_list_var;
            final SubLObject conjunctions = cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject conjunction = NIL;
            conjunction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                redundant_pairs = append(redundant_pairs, redundant_literals_in_conjunctionP(conjunction, mt, var1, var2));
                cdolist_list_var = cdolist_list_var.rest();
                conjunction = cdolist_list_var.first();
            } 
            return redundant_pairs;
        }
        return redundant_literals_in_conjunctionP(formula, mt, var1, var2);
    }/**
     * Returns a list of dotted pairs where each pair is a pair of
     * literals that are in FORMULA and are redundant with each other.
     *
     * @param FORMULA
     * 		el-formula-p; any formula.
     * @param VAR1,
     * 		VAR2 cyc-var?; if non-NIL, literals are considered redundant
     * 		if they would be redundant if VAR1 and VAR2 were unified.
     */


    /**
     * Not actually used.  Uses Floyd's algorithm for quickly finding
     * the shortest paths between variables in a conjunction of literals,
     * where the atomic path is that the variables occur together in a
     * literal.
     */
    @LispMethod(comment = "Not actually used.  Uses Floyd\'s algorithm for quickly finding\r\nthe shortest paths between variables in a conjunction of literals,\r\nwhere the atomic path is that the variables occur together in a\r\nliteral.\nNot actually used.  Uses Floyd\'s algorithm for quickly finding\nthe shortest paths between variables in a conjunction of literals,\nwhere the atomic path is that the variables occur together in a\nliteral.")
    public static final SubLObject shortest_paths_between_variables_in_conjunction_alt(SubLObject formula) {
        {
            SubLObject v_variables = sentence_variables(formula, UNPROVIDED, UNPROVIDED);
            SubLObject variable_count = length(v_variables);
            SubLObject literals = (formula.isList() && (formula.first() == $$and)) ? ((SubLObject) (formula.rest())) : list(formula);
            SubLObject shortest_paths = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            {
                SubLObject cdolist_list_var = literals;
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    {
                        SubLObject literal_variables = sentence_variables(literal, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var_10 = literal_variables;
                        SubLObject var1 = NIL;
                        for (var1 = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , var1 = cdolist_list_var_10.first()) {
                            {
                                SubLObject cdolist_list_var_11 = literal_variables;
                                SubLObject var2 = NIL;
                                for (var2 = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , var2 = cdolist_list_var_11.first()) {
                                    if (var1 == var2) {
                                        dictionary.dictionary_enter(shortest_paths, list(var1, var2), ZERO_INTEGER);
                                    } else {
                                        dictionary.dictionary_enter(shortest_paths, list(var1, var2), ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(variable_count); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject cdolist_list_var = v_variables;
                        SubLObject var1 = NIL;
                        for (var1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var1 = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_12 = v_variables;
                                SubLObject var2 = NIL;
                                for (var2 = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , var2 = cdolist_list_var_12.first()) {
                                    if (NIL == dictionary_utilities.dictionary_has_keyP(shortest_paths, list(var1, var2))) {
                                        {
                                            SubLObject shortest_path = NIL;
                                            SubLObject cdolist_list_var_13 = v_variables;
                                            SubLObject var1_2 = NIL;
                                            for (var1_2 = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , var1_2 = cdolist_list_var_13.first()) {
                                                {
                                                    SubLObject d1 = dictionary.dictionary_lookup(shortest_paths, list(var1, var1_2), UNPROVIDED);
                                                    SubLObject d2 = dictionary.dictionary_lookup(shortest_paths, list(var1_2, var2), UNPROVIDED);
                                                    SubLObject path_length = ((NIL != d1) && (NIL != d2)) ? ((SubLObject) (add(d1, d2))) : NIL;
                                                    if ((NIL != path_length) && ((NIL == shortest_path) || path_length.numL(shortest_path))) {
                                                        dictionary.dictionary_enter(shortest_paths, list(var1, var2), path_length);
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
            return dictionary_utilities.dictionary_to_alist(shortest_paths);
        }
    }

    /**
     * Not actually used.  Uses Floyd's algorithm for quickly finding
     * the shortest paths between variables in a conjunction of literals,
     * where the atomic path is that the variables occur together in a
     * literal.
     */
    @LispMethod(comment = "Not actually used.  Uses Floyd\'s algorithm for quickly finding\r\nthe shortest paths between variables in a conjunction of literals,\r\nwhere the atomic path is that the variables occur together in a\r\nliteral.\nNot actually used.  Uses Floyd\'s algorithm for quickly finding\nthe shortest paths between variables in a conjunction of literals,\nwhere the atomic path is that the variables occur together in a\nliteral.")
    public static SubLObject shortest_paths_between_variables_in_conjunction(final SubLObject formula) {
        final SubLObject v_variables = sentence_variables(formula, UNPROVIDED, UNPROVIDED);
        final SubLObject variable_count = length(v_variables);
        final SubLObject literals = (formula.isList() && formula.first().eql($$and)) ? formula.rest() : list(formula);
        final SubLObject shortest_paths = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$11;
            final SubLObject literal_variables = cdolist_list_var_$11 = sentence_variables(literal, UNPROVIDED, UNPROVIDED);
            SubLObject var1 = NIL;
            var1 = cdolist_list_var_$11.first();
            while (NIL != cdolist_list_var_$11) {
                SubLObject cdolist_list_var_$12 = literal_variables;
                SubLObject var2 = NIL;
                var2 = cdolist_list_var_$12.first();
                while (NIL != cdolist_list_var_$12) {
                    if (var1.eql(var2)) {
                        dictionary.dictionary_enter(shortest_paths, list(var1, var2), ZERO_INTEGER);
                    } else {
                        dictionary.dictionary_enter(shortest_paths, list(var1, var2), ONE_INTEGER);
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    var2 = cdolist_list_var_$12.first();
                } 
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                var1 = cdolist_list_var_$11.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        SubLObject i;
        SubLObject cdolist_list_var2;
        SubLObject var3;
        SubLObject cdolist_list_var_$13;
        SubLObject var4;
        SubLObject shortest_path;
        SubLObject cdolist_list_var_$14;
        SubLObject var1_2;
        SubLObject d1;
        SubLObject d2;
        SubLObject path_length;
        for (i = NIL, i = ZERO_INTEGER; i.numL(variable_count); i = add(i, ONE_INTEGER)) {
            cdolist_list_var2 = v_variables;
            var3 = NIL;
            var3 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                cdolist_list_var_$13 = v_variables;
                var4 = NIL;
                var4 = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    if (NIL == dictionary_utilities.dictionary_has_keyP(shortest_paths, list(var3, var4))) {
                        shortest_path = NIL;
                        cdolist_list_var_$14 = v_variables;
                        var1_2 = NIL;
                        var1_2 = cdolist_list_var_$14.first();
                        while (NIL != cdolist_list_var_$14) {
                            d1 = dictionary.dictionary_lookup(shortest_paths, list(var3, var1_2), UNPROVIDED);
                            d2 = dictionary.dictionary_lookup(shortest_paths, list(var1_2, var4), UNPROVIDED);
                            path_length = ((NIL != d1) && (NIL != d2)) ? add(d1, d2) : NIL;
                            if ((NIL != path_length) && ((NIL == shortest_path) || path_length.numL(shortest_path))) {
                                dictionary.dictionary_enter(shortest_paths, list(var3, var4), path_length);
                            }
                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                            var1_2 = cdolist_list_var_$14.first();
                        } 
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    var4 = cdolist_list_var_$13.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                var3 = cdolist_list_var2.first();
            } 
        }
        return dictionary_utilities.dictionary_to_alist(shortest_paths);
    }

    public static final SubLObject find_fully_connected_subsets_in_conjunction_alt(SubLObject formula) {
        {
            SubLObject sets = NIL;
            SubLObject v_variables = sentence_variables(formula, UNPROVIDED, UNPROVIDED);
            SubLObject literals = (formula.isList() && (formula.first() == $$and)) ? ((SubLObject) (formula.rest())) : list(formula);
            {
                SubLObject cdolist_list_var = v_variables;
                SubLObject variable = NIL;
                for (variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable = cdolist_list_var.first()) {
                    {
                        SubLObject v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                        set.set_add(variable, v_set);
                        sets = cons(v_set, sets);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = literals;
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    {
                        SubLObject literal_variables = sentence_variables(literal, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var_14 = literal_variables;
                        SubLObject var1 = NIL;
                        for (var1 = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , var1 = cdolist_list_var_14.first()) {
                            {
                                SubLObject cdolist_list_var_15 = literal_variables;
                                SubLObject var2 = NIL;
                                for (var2 = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , var2 = cdolist_list_var_15.first()) {
                                    if (var1 != var2) {
                                        {
                                            SubLObject var1_set = NIL;
                                            SubLObject var2_set = NIL;
                                            SubLObject cdolist_list_var_16 = sets;
                                            SubLObject v_set = NIL;
                                            for (v_set = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , v_set = cdolist_list_var_16.first()) {
                                                if (NIL != set.set_memberP(var1, v_set)) {
                                                    var1_set = v_set;
                                                }
                                                if (NIL != set.set_memberP(var2, v_set)) {
                                                    var2_set = v_set;
                                                }
                                            }
                                            if (var1_set != var2_set) {
                                                sets = remove(var1_set, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                sets = remove(var2_set, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                sets = cons(set_utilities.set_union(list(var1_set, var2_set), UNPROVIDED), sets);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = literals;
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    if (((literal.first() == $$not) || (literal.first() == $$unknownSentence)) || (literal.first() == $$assertedSentence)) {
                        literal = second(literal);
                    }
                    {
                        SubLObject literal_variables = sentence_variables(literal, UNPROVIDED, UNPROVIDED);
                        if (NIL != literal_variables) {
                            {
                                SubLObject cdolist_list_var_17 = sets;
                                SubLObject v_set = NIL;
                                for (v_set = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , v_set = cdolist_list_var_17.first()) {
                                    if (NIL != set.set_memberP(literal_variables.first(), v_set)) {
                                        set.set_add(literal, v_set);
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                                set.set_add(literal, v_set);
                                sets = cons(v_set, sets);
                            }
                        }
                    }
                }
            }
            {
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = sets;
                SubLObject v_set = NIL;
                for (v_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_set = cdolist_list_var.first()) {
                    {
                        SubLObject set_as_list = set.set_element_list(v_set);
                        ans = cons(remove_if(symbol_function($sym26$CYC_VAR_), set_as_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ans);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject find_fully_connected_subsets_in_conjunction(final SubLObject formula) {
        SubLObject sets = NIL;
        final SubLObject v_variables = sentence_variables(formula, UNPROVIDED, UNPROVIDED);
        final SubLObject literals = (NIL != el_conjunction_p(formula)) ? cycl_utilities.formula_args(formula, UNPROVIDED) : list(formula);
        SubLObject cdolist_list_var = v_variables;
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_set = set.new_set(symbol_function(EQL), UNPROVIDED);
            set.set_add(variable, v_set);
            sets = cons(v_set, sets);
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15;
            final SubLObject literal_variables = cdolist_list_var_$15 = sentence_variables(literal, UNPROVIDED, UNPROVIDED);
            SubLObject var1 = NIL;
            var1 = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                SubLObject cdolist_list_var_$16 = literal_variables;
                SubLObject var2 = NIL;
                var2 = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    if (!var1.eql(var2)) {
                        SubLObject var1_set = NIL;
                        SubLObject var2_set = NIL;
                        SubLObject cdolist_list_var_$17 = sets;
                        SubLObject v_set2 = NIL;
                        v_set2 = cdolist_list_var_$17.first();
                        while (NIL != cdolist_list_var_$17) {
                            if (NIL != set.set_memberP(var1, v_set2)) {
                                var1_set = v_set2;
                            }
                            if (NIL != set.set_memberP(var2, v_set2)) {
                                var2_set = v_set2;
                            }
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            v_set2 = cdolist_list_var_$17.first();
                        } 
                        if (!var1_set.eql(var2_set)) {
                            sets = remove(var1_set, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            sets = remove(var2_set, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            sets = cons(set_utilities.set_union(list(var1_set, var2_set), UNPROVIDED), sets);
                        }
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    var2 = cdolist_list_var_$16.first();
                } 
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                var1 = cdolist_list_var_$15.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        cdolist_list_var = literals;
        literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((cycl_utilities.atomic_sentence_predicate(literal).eql($$not) || cycl_utilities.atomic_sentence_predicate(literal).eql($$unknownSentence)) || cycl_utilities.atomic_sentence_predicate(literal).eql($$assertedSentence)) {
                literal = cycl_utilities.formula_arg1(literal, UNPROVIDED);
            }
            final SubLObject literal_variables = sentence_variables(literal, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.empty_list_p(literal_variables)) {
                sets = cons(set_utilities.new_singleton_set(literal, symbol_function(EQ)), sets);
            } else {
                SubLObject cdolist_list_var_$18 = sets;
                SubLObject v_set3 = NIL;
                v_set3 = cdolist_list_var_$18.first();
                while (NIL != cdolist_list_var_$18) {
                    if ((NIL == literal_variables) || (NIL != set.set_memberP(literal_variables.first(), v_set3))) {
                        set.set_add(literal, v_set3);
                    }
                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                    v_set3 = cdolist_list_var_$18.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        SubLObject ans = NIL;
        SubLObject cdolist_list_var2 = sets;
        SubLObject v_set = NIL;
        v_set = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject set_as_list = set.set_element_list(v_set);
            ans = cons(remove_if(symbol_function($sym26$CYC_VAR_), set_as_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ans);
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_set = cdolist_list_var2.first();
        } 
        return ans;
    }

    public static final SubLObject literal_set_G_alt(SubLObject set1, SubLObject set2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject variables1 = remove_duplicates(list_utilities.tree_gather(set.set_element_list(set1), symbol_function($sym26$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject variables2 = remove_duplicates(list_utilities.tree_gather(set.set_element_list(set2), symbol_function($sym26$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject consistent1 = makeBoolean(!(((NIL != $literal_set_G_mt$.getDynamicValue(thread)) && ONE_INTEGER.numE(set.set_size(set1))) && (NIL == com.cyc.cycjava.cycl.variable_unification.sentence_internally_consistentP(set.set_element_list(set1).first(), $literal_set_G_mt$.getDynamicValue(thread)))));
                SubLObject consistent2 = makeBoolean(!(((NIL != $literal_set_G_mt$.getDynamicValue(thread)) && ONE_INTEGER.numE(set.set_size(set2))) && (NIL == com.cyc.cycjava.cycl.variable_unification.sentence_internally_consistentP(set.set_element_list(set2).first(), $literal_set_G_mt$.getDynamicValue(thread)))));
                if ((NIL != consistent1) && (NIL == consistent2)) {
                    return T;
                } else {
                    if ((NIL != consistent2) && (NIL == consistent1)) {
                        return NIL;
                    } else {
                        if (set.set_size(set1).numG(set.set_size(set2))) {
                            return T;
                        } else {
                            if (set.set_size(set1).numL(set.set_size(set2))) {
                                return NIL;
                            } else {
                                if (length(variables1).numG(length(variables2))) {
                                    return T;
                                } else {
                                    if (length(variables1).numL(length(variables2))) {
                                        return NIL;
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject literal_set_G(final SubLObject set1, final SubLObject set2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variables1 = remove_duplicates(list_utilities.tree_gather(set.set_element_list(set1), symbol_function($sym26$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject variables2 = remove_duplicates(list_utilities.tree_gather(set.set_element_list(set2), symbol_function($sym26$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject consistent1 = makeBoolean(((NIL == $literal_set_G_mt$.getDynamicValue(thread)) || (!ONE_INTEGER.numE(set.set_size(set1)))) || (NIL != sentence_internally_consistentP(set.set_element_list(set1).first(), $literal_set_G_mt$.getDynamicValue(thread))));
        final SubLObject consistent2 = makeBoolean(((NIL == $literal_set_G_mt$.getDynamicValue(thread)) || (!ONE_INTEGER.numE(set.set_size(set2)))) || (NIL != sentence_internally_consistentP(set.set_element_list(set2).first(), $literal_set_G_mt$.getDynamicValue(thread))));
        if ((NIL != consistent1) && (NIL == consistent2)) {
            return T;
        }
        if ((NIL != consistent2) && (NIL == consistent1)) {
            return NIL;
        }
        if (set.set_size(set1).numG(set.set_size(set2))) {
            return T;
        }
        if (set.set_size(set1).numL(set.set_size(set2))) {
            return NIL;
        }
        if (length(variables1).numG(length(variables2))) {
            return T;
        }
        if (length(variables1).numL(length(variables2))) {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject find_fully_connected_subsets_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dnf_formula = com.cyc.cycjava.cycl.variable_unification.convert_to_dnf(formula, NIL);
                thread.resetMultipleValues();
                {
                    SubLObject bare_dnf_formula = com.cyc.cycjava.cycl.variable_unification.separate_bindings_from_sentence(dnf_formula);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject conjunctions = (NIL != el_disjunction_p(bare_dnf_formula)) ? ((SubLObject) (cycl_utilities.el_formula_args(bare_dnf_formula, UNPROVIDED))) : list(bare_dnf_formula);
                        SubLObject simple_disjunctionP = sublisp_null(find_if(EL_CONJUNCTION_P, conjunctions, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        SubLObject sets_of_connected_literals = NIL;
                        SubLObject all_literals = set.new_set(UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = conjunctions;
                            SubLObject conjunction = NIL;
                            for (conjunction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunction = cdolist_list_var.first()) {
                                {
                                    SubLObject sets_of_connected_literals_in_conjunction = com.cyc.cycjava.cycl.variable_unification.find_fully_connected_subsets_in_conjunction(conjunction);
                                    SubLObject cdolist_list_var_18 = sets_of_connected_literals_in_conjunction;
                                    SubLObject set_of_connected_literals_in_conjunction = NIL;
                                    for (set_of_connected_literals_in_conjunction = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , set_of_connected_literals_in_conjunction = cdolist_list_var_18.first()) {
                                        set_utilities.set_add_all(set_of_connected_literals_in_conjunction, all_literals);
                                        {
                                            SubLObject reused_set = (NIL != simple_disjunctionP) ? ((SubLObject) (com.cyc.cycjava.cycl.variable_unification.find_literal_set_with_vars(set_of_connected_literals_in_conjunction, sets_of_connected_literals))) : NIL;
                                            SubLObject v_set = (NIL != reused_set) ? ((SubLObject) (reused_set)) : set.new_set(symbol_function(EQ), UNPROVIDED);
                                            set_utilities.set_add_all(set_of_connected_literals_in_conjunction, v_set);
                                            sets_of_connected_literals = cons(v_set, sets_of_connected_literals);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject set_contents_var = set.do_set_internal(all_literals);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject literal = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, literal)) {
                                        {
                                            SubLObject containing_sets = NIL;
                                            {
                                                SubLObject cdolist_list_var = sets_of_connected_literals;
                                                SubLObject set_of_connected_literals = NIL;
                                                for (set_of_connected_literals = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , set_of_connected_literals = cdolist_list_var.first()) {
                                                    if (NIL != set.set_memberP(literal, set_of_connected_literals)) {
                                                        containing_sets = cons(set_of_connected_literals, containing_sets);
                                                    }
                                                }
                                            }
                                            if (NIL != list_utilities.lengthG(containing_sets, ONE_INTEGER, UNPROVIDED)) {
                                                {
                                                    SubLObject cdolist_list_var = containing_sets;
                                                    SubLObject containing_set = NIL;
                                                    for (containing_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , containing_set = cdolist_list_var.first()) {
                                                        sets_of_connected_literals = remove(containing_set, sets_of_connected_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                                sets_of_connected_literals = cons(set_utilities.set_union(containing_sets, UNPROVIDED), sets_of_connected_literals);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sets_of_connected_literals = Sort.sort(sets_of_connected_literals, symbol_function($sym39$LITERAL_SET__), UNPROVIDED);
                        return Mapping.mapcar(symbol_function(SET_ELEMENT_LIST), sets_of_connected_literals);
                    }
                }
            }
        }
    }

    public static SubLObject find_fully_connected_subsets(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dnf_formula = convert_to_dnf(formula, NIL);
        thread.resetMultipleValues();
        final SubLObject bare_dnf_formula = separate_bindings_from_sentence(dnf_formula);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject conjunctions = (NIL != el_disjunction_p(bare_dnf_formula)) ? cycl_utilities.el_formula_args(bare_dnf_formula, UNPROVIDED) : list(bare_dnf_formula);
        final SubLObject simple_disjunctionP = sublisp_null(find_if(EL_CONJUNCTION_P, conjunctions, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject sets_of_connected_literals = NIL;
        final SubLObject all_literals = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = conjunctions;
        SubLObject conjunction = NIL;
        conjunction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$19;
            final SubLObject sets_of_connected_literals_in_conjunction = cdolist_list_var_$19 = find_fully_connected_subsets_in_conjunction(conjunction);
            SubLObject set_of_connected_literals_in_conjunction = NIL;
            set_of_connected_literals_in_conjunction = cdolist_list_var_$19.first();
            while (NIL != cdolist_list_var_$19) {
                set_utilities.set_add_all(set_of_connected_literals_in_conjunction, all_literals);
                final SubLObject reused_set = (NIL != simple_disjunctionP) ? find_literal_set_with_vars(set_of_connected_literals_in_conjunction, sets_of_connected_literals) : NIL;
                final SubLObject v_set = (NIL != reused_set) ? reused_set : set.new_set(symbol_function(EQ), UNPROVIDED);
                set_utilities.set_add_all(set_of_connected_literals_in_conjunction, v_set);
                sets_of_connected_literals = cons(v_set, sets_of_connected_literals);
                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                set_of_connected_literals_in_conjunction = cdolist_list_var_$19.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            conjunction = cdolist_list_var.first();
        } 
        final SubLObject set_contents_var = set.do_set_internal(all_literals);
        SubLObject basis_object;
        SubLObject state;
        SubLObject literal;
        SubLObject containing_sets;
        SubLObject cdolist_list_var2;
        SubLObject set_of_connected_literals;
        SubLObject containing_set;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            literal = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, literal)) {
                containing_sets = NIL;
                cdolist_list_var2 = sets_of_connected_literals;
                set_of_connected_literals = NIL;
                set_of_connected_literals = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL != set.set_memberP(literal, set_of_connected_literals)) {
                        containing_sets = cons(set_of_connected_literals, containing_sets);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    set_of_connected_literals = cdolist_list_var2.first();
                } 
                if (NIL != list_utilities.lengthG(containing_sets, ONE_INTEGER, UNPROVIDED)) {
                    cdolist_list_var2 = containing_sets;
                    containing_set = NIL;
                    containing_set = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sets_of_connected_literals = remove(containing_set, sets_of_connected_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        containing_set = cdolist_list_var2.first();
                    } 
                    sets_of_connected_literals = cons(set_utilities.set_union(containing_sets, UNPROVIDED), sets_of_connected_literals);
                }
            }
        }
        sets_of_connected_literals = Sort.sort(sets_of_connected_literals, symbol_function($sym38$LITERAL_SET__), UNPROVIDED);
        return Mapping.mapcar(symbol_function(SET_ELEMENT_LIST), sets_of_connected_literals);
    }

    public static final SubLObject find_literal_set_with_vars_alt(SubLObject literals, SubLObject sets) {
        {
            SubLObject match = NIL;
            SubLObject vars = NIL;
            {
                SubLObject cdolist_list_var = literals;
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_19 = com.cyc.cycjava.cycl.variable_unification.literal_free_variables_cached(literal);
                        SubLObject var = NIL;
                        for (var = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , var = cdolist_list_var_19.first()) {
                            {
                                SubLObject item_var = var;
                                if (NIL == member(item_var, vars, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    vars = cons(item_var, vars);
                                }
                            }
                        }
                    }
                }
            }
            vars = Sort.sort(vars, symbol_function($sym41$STRING_), symbol_function(EL_VAR_NAME));
            if (NIL != vars) {
                if (NIL == match) {
                    {
                        SubLObject csome_list_var = sets;
                        SubLObject v_set = NIL;
                        for (v_set = csome_list_var.first(); !((NIL != match) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_set = csome_list_var.first()) {
                            {
                                SubLObject set_vars = NIL;
                                SubLObject set_contents_var = set.do_set_internal(v_set);
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state = NIL;
                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    {
                                        SubLObject literal = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, literal)) {
                                            {
                                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.variable_unification.literal_free_variables_cached(literal);
                                                SubLObject var = NIL;
                                                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject item_var = var;
                                                        if (NIL == member(item_var, set_vars, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            set_vars = cons(item_var, set_vars);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (Sort.sort(remove_duplicates(set_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym41$STRING_), symbol_function(EL_VAR_NAME)).equal(vars)) {
                                    match = v_set;
                                }
                            }
                        }
                    }
                }
            }
            return match;
        }
    }

    public static SubLObject find_literal_set_with_vars(final SubLObject literals, final SubLObject sets) {
        SubLObject match = NIL;
        SubLObject vars = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$20 = literal_free_variables_cached(literal);
            SubLObject var = NIL;
            var = cdolist_list_var_$20.first();
            while (NIL != cdolist_list_var_$20) {
                final SubLObject item_var = var;
                if (NIL == member(item_var, vars, symbol_function(EQL), symbol_function(IDENTITY))) {
                    vars = cons(item_var, vars);
                }
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                var = cdolist_list_var_$20.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        vars = Sort.sort(vars, symbol_function($sym40$STRING_), symbol_function(EL_VAR_NAME));
        if ((NIL != vars) && (NIL == match)) {
            SubLObject csome_list_var = sets;
            SubLObject v_set = NIL;
            v_set = csome_list_var.first();
            while ((NIL == match) && (NIL != csome_list_var)) {
                SubLObject set_vars = NIL;
                final SubLObject set_contents_var = set.do_set_internal(v_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject literal2;
                SubLObject cdolist_list_var2;
                SubLObject var2;
                SubLObject item_var2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    literal2 = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, literal2)) {
                        cdolist_list_var2 = literal_free_variables_cached(literal2);
                        var2 = NIL;
                        var2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            item_var2 = var2;
                            if (NIL == member(item_var2, set_vars, symbol_function(EQL), symbol_function(IDENTITY))) {
                                set_vars = cons(item_var2, set_vars);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            var2 = cdolist_list_var2.first();
                        } 
                    }
                }
                if (Sort.sort(remove_duplicates(set_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym40$STRING_), symbol_function(EL_VAR_NAME)).equal(vars)) {
                    match = v_set;
                }
                csome_list_var = csome_list_var.rest();
                v_set = csome_list_var.first();
            } 
        }
        return match;
    }

    public static final SubLObject clear_literal_free_variables_cached_alt() {
        {
            SubLObject cs = $literal_free_variables_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_literal_free_variables_cached() {
        final SubLObject cs = $literal_free_variables_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_literal_free_variables_cached_alt(SubLObject literal) {
        return memoization_state.caching_state_remove_function_results_with_args($literal_free_variables_cached_caching_state$.getGlobalValue(), list(literal), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_literal_free_variables_cached(final SubLObject literal) {
        return memoization_state.caching_state_remove_function_results_with_args($literal_free_variables_cached_caching_state$.getGlobalValue(), list(literal), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject literal_free_variables_cached_internal_alt(SubLObject literal) {
        return literal_free_variables(literal, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject literal_free_variables_cached_internal(final SubLObject literal) {
        return literal_free_variables(literal, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject literal_free_variables_cached_alt(SubLObject literal) {
        {
            SubLObject caching_state = $literal_free_variables_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(LITERAL_FREE_VARIABLES_CACHED, $literal_free_variables_cached_caching_state$, $int$32, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, literal, $kw17$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw17$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.variable_unification.literal_free_variables_cached_internal(literal)));
                    memoization_state.caching_state_put(caching_state, literal, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject literal_free_variables_cached(final SubLObject literal) {
        SubLObject caching_state = $literal_free_variables_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(LITERAL_FREE_VARIABLES_CACHED, $literal_free_variables_cached_caching_state$, $int$32, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, literal, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(literal_free_variables_cached_internal(literal)));
            memoization_state.caching_state_put(caching_state, literal, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject find_unconnected_literals_alt(SubLObject formula) {
        {
            SubLObject literals = com.cyc.cycjava.cycl.variable_unification.find_fully_connected_subsets(formula);
            SubLObject arg_positions = NIL;
            literals = literals.rest();
            literals = Mapping.mapcan(symbol_function(IDENTITY), literals, EMPTY_SUBL_OBJECT_ARRAY);
            {
                SubLObject cdolist_list_var = literals;
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    arg_positions = append(arg_positions, com.cyc.cycjava.cycl.variable_unification.arg_positions_eq(literal, formula));
                }
            }
            return arg_positions;
        }
    }

    public static SubLObject find_unconnected_literals(final SubLObject formula) {
        final SubLObject literals = find_fully_connected_subsets(formula);
        SubLObject done_oneP = NIL;
        SubLObject arg_positions = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject set_o_literals = NIL;
        set_o_literals = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.tree_find_if($sym26$CYC_VAR_, set_o_literals, UNPROVIDED)) {
                if (NIL == done_oneP) {
                    done_oneP = T;
                } else {
                    SubLObject cdolist_list_var_$21 = set_o_literals;
                    SubLObject literal = NIL;
                    literal = cdolist_list_var_$21.first();
                    while (NIL != cdolist_list_var_$21) {
                        arg_positions = append(arg_positions, arg_positions_eq(literal, formula));
                        cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                        literal = cdolist_list_var_$21.first();
                    } 
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            set_o_literals = cdolist_list_var.first();
        } 
        return arg_positions;
    }

    public static final SubLObject sentences_consistentP_alt(SubLObject sentence1, SubLObject sentence2, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence = list($$and, sentence1, sentence2);
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$storing_cyclifier_wff_results$.currentBinding(thread);
                    try {
                        parsing_vars.$storing_cyclifier_wff_results$.bind(NIL, thread);
                        ans = cyclifier.cyclifier_wffP(sentence, mt);
                    } finally {
                        parsing_vars.$storing_cyclifier_wff_results$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject sentences_consistentP(final SubLObject sentence1, final SubLObject sentence2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence3 = list($$and, sentence1, sentence2);
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$storing_cyclifier_wff_results$.currentBinding(thread);
        try {
            parsing_vars.$storing_cyclifier_wff_results$.bind(NIL, thread);
            ans = cyclifier.cyclifier_wffP(sentence3, mt);
        } finally {
            parsing_vars.$storing_cyclifier_wff_results$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject sentence_internally_consistentP_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$storing_cyclifier_wff_results$.currentBinding(thread);
                    try {
                        parsing_vars.$storing_cyclifier_wff_results$.bind(NIL, thread);
                        {
                            SubLObject wffP = cyclifier.cyclifier_wffP(sentence, mt);
                            ans = wffP;
                        }
                    } finally {
                        parsing_vars.$storing_cyclifier_wff_results$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject sentence_internally_consistentP(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$storing_cyclifier_wff_results$.currentBinding(thread);
        try {
            parsing_vars.$storing_cyclifier_wff_results$.bind(NIL, thread);
            final SubLObject wffP = ans = cyclifier.cyclifier_wffP(sentence, mt);
        } finally {
            parsing_vars.$storing_cyclifier_wff_results$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject find_inconsistent_literals_in_conjunction_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inconsistent_pairs = NIL;
                SubLObject literals = (formula.isList() && (formula.first() == $$and)) ? ((SubLObject) (formula.rest())) : list(formula);
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
                                            Errors.error($str_alt28$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject cdolist_list_var = literals;
                                    SubLObject literal_1 = NIL;
                                    for (literal_1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal_1 = cdolist_list_var.first()) {
                                        {
                                            SubLObject cdolist_list_var_20 = literals;
                                            SubLObject literal_2 = NIL;
                                            for (literal_2 = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , literal_2 = cdolist_list_var_20.first()) {
                                                if (literal_1 != literal_2) {
                                                    if (NIL == com.cyc.cycjava.cycl.variable_unification.sentences_consistentP(literal_1, literal_2, mt)) {
                                                        inconsistent_pairs = cons(list(literal_1, literal_2), inconsistent_pairs);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return inconsistent_pairs;
            }
        }
    }

    public static SubLObject find_inconsistent_literals_in_conjunction(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inconsistent_pairs = NIL;
        final SubLObject literals = (formula.isList() && formula.first().eql($$and)) ? formula.rest() : list(formula);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = literals;
                SubLObject literal_1 = NIL;
                literal_1 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$22 = literals;
                    SubLObject literal_2 = NIL;
                    literal_2 = cdolist_list_var_$22.first();
                    while (NIL != cdolist_list_var_$22) {
                        if ((!literal_1.eql(literal_2)) && (NIL == sentences_consistentP(literal_1, literal_2, mt))) {
                            inconsistent_pairs = cons(list(literal_1, literal_2), inconsistent_pairs);
                        }
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        literal_2 = cdolist_list_var_$22.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    literal_1 = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return inconsistent_pairs;
    }

    public static final SubLObject find_consistent_subsets_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dnf_formula = com.cyc.cycjava.cycl.variable_unification.convert_to_dnf(formula, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject bare_dnf_formula = com.cyc.cycjava.cycl.variable_unification.separate_bindings_from_sentence(dnf_formula);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject conjunctions = (bare_dnf_formula.isList() && (bare_dnf_formula.first() == $$or)) ? ((SubLObject) (bare_dnf_formula.rest())) : list(bare_dnf_formula);
                        SubLObject inconsistent_pairs = NIL;
                        SubLObject sets_of_consistent_literals = NIL;
                        SubLObject all_literals = set.new_set(symbol_function(EQ), UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = conjunctions;
                            SubLObject conjunction = NIL;
                            for (conjunction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunction = cdolist_list_var.first()) {
                                {
                                    SubLObject conjunction_literals = (conjunction.isList() && (conjunction.first() == $$and)) ? ((SubLObject) (conjunction.rest())) : list(conjunction);
                                    inconsistent_pairs = append(inconsistent_pairs, com.cyc.cycjava.cycl.variable_unification.find_inconsistent_literals_in_conjunction(conjunction, mt));
                                    set_utilities.set_add_all(conjunction_literals, all_literals);
                                }
                            }
                        }
                        {
                            SubLObject set_contents_var = set.do_set_internal(all_literals);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject literal = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, literal)) {
                                        {
                                            SubLObject consistent_set = NIL;
                                            {
                                                SubLObject cdolist_list_var = sets_of_consistent_literals;
                                                SubLObject v_set = NIL;
                                                for (v_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_set = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject consistentP = T;
                                                        SubLObject set_contents_var_22 = set.do_set_internal(v_set);
                                                        SubLObject basis_object_23 = set_contents.do_set_contents_basis_object(set_contents_var_22);
                                                        SubLObject state_24 = NIL;
                                                        for (state_24 = set_contents.do_set_contents_initial_state(basis_object_23, set_contents_var_22); NIL == set_contents.do_set_contents_doneP(basis_object_23, state_24); state_24 = set_contents.do_set_contents_update_state(state_24)) {
                                                            {
                                                                SubLObject other_literal = set_contents.do_set_contents_next(basis_object_23, state_24);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state_24, other_literal)) {
                                                                    {
                                                                        SubLObject cdolist_list_var_25 = inconsistent_pairs;
                                                                        SubLObject inconsistent_pair = NIL;
                                                                        for (inconsistent_pair = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , inconsistent_pair = cdolist_list_var_25.first()) {
                                                                            if ((inconsistent_pair.first() == literal) && (second(inconsistent_pair) == other_literal)) {
                                                                                consistentP = NIL;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (NIL != consistentP) {
                                                            consistent_set = v_set;
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL == consistent_set) {
                                                {
                                                    SubLObject v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                                                    sets_of_consistent_literals = cons(v_set, sets_of_consistent_literals);
                                                    consistent_set = v_set;
                                                }
                                            }
                                            set.set_add(literal, consistent_set);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject _prev_bind_0 = $literal_set_G_mt$.currentBinding(thread);
                            try {
                                $literal_set_G_mt$.bind(mt, thread);
                                sets_of_consistent_literals = Sort.sort(sets_of_consistent_literals, symbol_function($sym39$LITERAL_SET__), UNPROVIDED);
                            } finally {
                                $literal_set_G_mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return Mapping.mapcar(symbol_function(SET_ELEMENT_LIST), sets_of_consistent_literals);
                    }
                }
            }
        }
    }

    public static SubLObject find_consistent_subsets(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dnf_formula = convert_to_dnf(formula, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject bare_dnf_formula = separate_bindings_from_sentence(dnf_formula);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject conjunctions = (bare_dnf_formula.isList() && bare_dnf_formula.first().eql($$or)) ? bare_dnf_formula.rest() : list(bare_dnf_formula);
        SubLObject inconsistent_pairs = NIL;
        SubLObject sets_of_consistent_literals = NIL;
        final SubLObject all_literals = set.new_set(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = conjunctions;
        SubLObject conjunction = NIL;
        conjunction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject conjunction_literals = (conjunction.isList() && conjunction.first().eql($$and)) ? conjunction.rest() : list(conjunction);
            inconsistent_pairs = append(inconsistent_pairs, find_inconsistent_literals_in_conjunction(conjunction, mt));
            set_utilities.set_add_all(conjunction_literals, all_literals);
            cdolist_list_var = cdolist_list_var.rest();
            conjunction = cdolist_list_var.first();
        } 
        final SubLObject set_contents_var = set.do_set_internal(all_literals);
        SubLObject basis_object;
        SubLObject state;
        SubLObject literal;
        SubLObject consistent_set;
        SubLObject cdolist_list_var2;
        SubLObject v_set;
        SubLObject consistentP;
        SubLObject set_contents_var_$24;
        SubLObject basis_object_$25;
        SubLObject state_$26;
        SubLObject other_literal;
        SubLObject cdolist_list_var_$27;
        SubLObject inconsistent_pair;
        SubLObject v_set2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            literal = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, literal)) {
                consistent_set = NIL;
                cdolist_list_var2 = sets_of_consistent_literals;
                v_set = NIL;
                v_set = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    consistentP = T;
                    set_contents_var_$24 = set.do_set_internal(v_set);
                    for (basis_object_$25 = set_contents.do_set_contents_basis_object(set_contents_var_$24), state_$26 = NIL, state_$26 = set_contents.do_set_contents_initial_state(basis_object_$25, set_contents_var_$24); NIL == set_contents.do_set_contents_doneP(basis_object_$25, state_$26); state_$26 = set_contents.do_set_contents_update_state(state_$26)) {
                        other_literal = set_contents.do_set_contents_next(basis_object_$25, state_$26);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$26, other_literal)) {
                            cdolist_list_var_$27 = inconsistent_pairs;
                            inconsistent_pair = NIL;
                            inconsistent_pair = cdolist_list_var_$27.first();
                            while (NIL != cdolist_list_var_$27) {
                                if (inconsistent_pair.first().eql(literal) && second(inconsistent_pair).eql(other_literal)) {
                                    consistentP = NIL;
                                }
                                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                inconsistent_pair = cdolist_list_var_$27.first();
                            } 
                        }
                    }
                    if (NIL != consistentP) {
                        consistent_set = v_set;
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    v_set = cdolist_list_var2.first();
                } 
                if (NIL == consistent_set) {
                    v_set2 = set.new_set(symbol_function(EQ), UNPROVIDED);
                    sets_of_consistent_literals = cons(v_set2, sets_of_consistent_literals);
                    consistent_set = v_set2;
                }
                set.set_add(literal, consistent_set);
            }
        }
        final SubLObject _prev_bind_0 = $literal_set_G_mt$.currentBinding(thread);
        try {
            $literal_set_G_mt$.bind(mt, thread);
            sets_of_consistent_literals = Sort.sort(sets_of_consistent_literals, symbol_function($sym38$LITERAL_SET__), UNPROVIDED);
        } finally {
            $literal_set_G_mt$.rebind(_prev_bind_0, thread);
        }
        return Mapping.mapcar(symbol_function(SET_ELEMENT_LIST), sets_of_consistent_literals);
    }

    public static final SubLObject arg_positions_eq_alt(SubLObject item, SubLObject formula) {
        {
            SubLObject arg_positions = cycl_utilities.arg_positions_dfs(item, formula, symbol_function(EQUAL));
            SubLObject arg_positions_not_eq = NIL;
            {
                SubLObject cdolist_list_var = arg_positions;
                SubLObject arg_pos = NIL;
                for (arg_pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_pos = cdolist_list_var.first()) {
                    if (item != cycl_utilities.formula_arg_position(formula, arg_pos, UNPROVIDED)) {
                        arg_positions_not_eq = cons(arg_pos, arg_positions_not_eq);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = arg_positions_not_eq;
                SubLObject arg_pos = NIL;
                for (arg_pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_pos = cdolist_list_var.first()) {
                    arg_positions = remove(arg_pos, arg_positions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return arg_positions;
        }
    }

    public static SubLObject arg_positions_eq(final SubLObject item, final SubLObject formula) {
        SubLObject arg_positions = cycl_utilities.arg_positions_dfs(item, formula, symbol_function(EQUAL));
        SubLObject arg_positions_not_eq = NIL;
        SubLObject cdolist_list_var = arg_positions;
        SubLObject arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!item.eql(cycl_utilities.formula_arg_position(formula, arg_pos, UNPROVIDED))) {
                arg_positions_not_eq = cons(arg_pos, arg_positions_not_eq);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos = cdolist_list_var.first();
        } 
        cdolist_list_var = arg_positions_not_eq;
        arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            arg_positions = remove(arg_pos, arg_positions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos = cdolist_list_var.first();
        } 
        return arg_positions;
    }

    public static SubLObject arg_positions_eql(final SubLObject item, final SubLObject formula) {
        SubLObject arg_positions = cycl_utilities.arg_positions_dfs(item, formula, symbol_function(EQUAL));
        SubLObject arg_positions_not_eql = NIL;
        SubLObject cdolist_list_var = arg_positions;
        SubLObject arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!item.eql(cycl_utilities.formula_arg_position(formula, arg_pos, UNPROVIDED))) {
                arg_positions_not_eql = cons(arg_pos, arg_positions_not_eql);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos = cdolist_list_var.first();
        } 
        cdolist_list_var = arg_positions_not_eql;
        arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            arg_positions = remove(arg_pos, arg_positions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos = cdolist_list_var.first();
        } 
        return arg_positions;
    }

    public static final SubLObject find_inconsistent_literals_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg_positions = NIL;
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
                                            Errors.error($str_alt28$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject literal_subsets = com.cyc.cycjava.cycl.variable_unification.find_consistent_subsets(formula, mt);
                                    if ((NIL == list_utilities.lengthE(literal_subsets.first(), ONE_INTEGER, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.variable_unification.sentence_internally_consistentP(literal_subsets.first().first(), mt))) {
                                        literal_subsets = literal_subsets.rest();
                                    }
                                    {
                                        SubLObject inconsistent_literals = Mapping.mapcan(symbol_function(IDENTITY), literal_subsets, EMPTY_SUBL_OBJECT_ARRAY);
                                        arg_positions = Mapping.mapcan(symbol_function(ARG_POSITIONS_EQ), inconsistent_literals, new SubLObject[]{ make_list(length(inconsistent_literals), formula) });
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return arg_positions;
            }
        }
    }

    public static SubLObject find_inconsistent_literals(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_positions = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject literal_subsets = find_consistent_subsets(formula, mt);
                if ((NIL == list_utilities.lengthE(literal_subsets.first(), ONE_INTEGER, UNPROVIDED)) || (NIL != sentence_internally_consistentP(literal_subsets.first().first(), mt))) {
                    literal_subsets = literal_subsets.rest();
                }
                final SubLObject inconsistent_literals = Mapping.mapcan(symbol_function(IDENTITY), literal_subsets, EMPTY_SUBL_OBJECT_ARRAY);
                arg_positions = Mapping.mapcan(symbol_function(ARG_POSITIONS_EQ), inconsistent_literals, new SubLObject[]{ make_list(length(inconsistent_literals), formula) });
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return arg_positions;
    }

    public static final SubLObject incompatible_var_map_alists_equalP_alt(SubLObject map1, SubLObject map2) {
        return list_utilities.alist_E(map1, map2, symbol_function(EQL), symbol_function($sym58$SETS_EQUAL_));
    }

    public static SubLObject incompatible_var_map_alists_equalP(final SubLObject map1, final SubLObject map2) {
        return list_utilities.alist_E(map1, map2, symbol_function(EQL), symbol_function($sym56$SETS_EQUAL_));
    }

    public static SubLObject declare_variable_unification_file() {
        declareFunction("apply_demorgans", "APPLY-DEMORGANS", 1, 0, false);
        declareFunction("el_negation_or_unknown_sentence_p", "EL-NEGATION-OR-UNKNOWN-SENTENCE-P", 1, 0, false);
        declareFunction("separate_bindings_from_sentence", "SEPARATE-BINDINGS-FROM-SENTENCE", 1, 0, false);
        declareFunction("separate_bindings_recursive", "SEPARATE-BINDINGS-RECURSIVE", 1, 0, false);
        declareFunction("collapse_groups", "COLLAPSE-GROUPS", 1, 0, false);
        declareFunction("convert_to_dnf_int", "CONVERT-TO-DNF-INT", 1, 0, false);
        declareFunction("convert_to_dnf", "CONVERT-TO-DNF", 1, 1, false);
        declareFunction("gather_dnf_arg_constraints_int", "GATHER-DNF-ARG-CONSTRAINTS-INT", 2, 0, false);
        declareFunction("gather_dnf_arg_constraints", "GATHER-DNF-ARG-CONSTRAINTS", 2, 0, false);
        declareFunction("can_unifyP", "CAN-UNIFY?", 4, 0, false);
        declareFunction("get_incompatible_variables_in_complex_sentence", "GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE", 2, 0, false);
        declareFunction("find_irreflexive_incompatibles", "FIND-IRREFLEXIVE-INCOMPATIBLES", 2, 0, false);
        declareFunction("add_incompatibles", "ADD-INCOMPATIBLES", 2, 0, false);
        declareFunction("known_incompatible_varsP", "KNOWN-INCOMPATIBLE-VARS?", 3, 0, false);
        declareFunction("get_var_map_for_formula_internal", "GET-VAR-MAP-FOR-FORMULA-INTERNAL", 2, 0, false);
        declareFunction("get_var_map_for_formula", "GET-VAR-MAP-FOR-FORMULA", 2, 0, false);
        declareFunction("get_incompatible_variables_in_complex_sentence_as_alist", "GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE-AS-ALIST", 2, 0, false);
        declareFunction("gather_constraining_types_for_variable_in_constraint_conjunction", "GATHER-CONSTRAINING-TYPES-FOR-VARIABLE-IN-CONSTRAINT-CONJUNCTION", 3, 0, false);
        declareFunction("variable_similarity_given_constraint_conjunction", "VARIABLE-SIMILARITY-GIVEN-CONSTRAINT-CONJUNCTION", 4, 0, false);
        declareFunction("variable_similarity_internal", "VARIABLE-SIMILARITY-INTERNAL", 4, 0, false);
        declareFunction("variable_similarity", "VARIABLE-SIMILARITY", 4, 0, false);
        declareFunction("variable_similarity_about_the_sameP", "VARIABLE-SIMILARITY-ABOUT-THE-SAME?", 2, 1, false);
        declareFunction("attempt_to_combine_variables_in_complex_combination", "ATTEMPT-TO-COMBINE-VARIABLES-IN-COMPLEX-COMBINATION", 4, 3, false);
        declareFunction("pick_variable_to_combine", "PICK-VARIABLE-TO-COMBINE", 4, 0, false);
        declareFunction("literals_redundantP", "LITERALS-REDUNDANT?", 3, 2, false);
        declareFunction("redundant_literals_in_conjunctionP", "REDUNDANT-LITERALS-IN-CONJUNCTION?", 2, 2, false);
        declareFunction("new_redundant_literals", "NEW-REDUNDANT-LITERALS", 4, 0, false);
        declareFunction("car_cdr_equalP", "CAR-CDR-EQUAL?", 1, 0, false);
        declareFunction("find_redundant_literals", "FIND-REDUNDANT-LITERALS", 2, 0, false);
        declareFunction("find_redundant_literals_int", "FIND-REDUNDANT-LITERALS-INT", 2, 2, false);
        declareFunction("shortest_paths_between_variables_in_conjunction", "SHORTEST-PATHS-BETWEEN-VARIABLES-IN-CONJUNCTION", 1, 0, false);
        declareFunction("find_fully_connected_subsets_in_conjunction", "FIND-FULLY-CONNECTED-SUBSETS-IN-CONJUNCTION", 1, 0, false);
        declareFunction("literal_set_G", "LITERAL-SET->", 2, 0, false);
        declareFunction("find_fully_connected_subsets", "FIND-FULLY-CONNECTED-SUBSETS", 1, 0, false);
        declareFunction("find_literal_set_with_vars", "FIND-LITERAL-SET-WITH-VARS", 2, 0, false);
        declareFunction("clear_literal_free_variables_cached", "CLEAR-LITERAL-FREE-VARIABLES-CACHED", 0, 0, false);
        declareFunction("remove_literal_free_variables_cached", "REMOVE-LITERAL-FREE-VARIABLES-CACHED", 1, 0, false);
        declareFunction("literal_free_variables_cached_internal", "LITERAL-FREE-VARIABLES-CACHED-INTERNAL", 1, 0, false);
        declareFunction("literal_free_variables_cached", "LITERAL-FREE-VARIABLES-CACHED", 1, 0, false);
        declareFunction("find_unconnected_literals", "FIND-UNCONNECTED-LITERALS", 1, 0, false);
        declareFunction("sentences_consistentP", "SENTENCES-CONSISTENT?", 3, 0, false);
        declareFunction("sentence_internally_consistentP", "SENTENCE-INTERNALLY-CONSISTENT?", 2, 0, false);
        declareFunction("find_inconsistent_literals_in_conjunction", "FIND-INCONSISTENT-LITERALS-IN-CONJUNCTION", 2, 0, false);
        declareFunction("find_consistent_subsets", "FIND-CONSISTENT-SUBSETS", 2, 0, false);
        declareFunction("arg_positions_eq", "ARG-POSITIONS-EQ", 2, 0, false);
        declareFunction("arg_positions_eql", "ARG-POSITIONS-EQL", 2, 0, false);
        declareFunction("find_inconsistent_literals", "FIND-INCONSISTENT-LITERALS", 2, 0, false);
        declareFunction("incompatible_var_map_alists_equalP", "INCOMPATIBLE-VAR-MAP-ALISTS-EQUAL?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_variable_unification_file() {
        deflexical("*VARIABLE-SIMILARITY-DEFAULT-FUDGE-FACTOR*", $float$1_1);
        defparameter("*LITERAL-SET->-MT*", NIL);
        deflexical("*LITERAL-FREE-VARIABLES-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_variable_unification_file_alt() {
        memoization_state.note_memoized_function(GET_VAR_MAP_FOR_FORMULA);
        memoization_state.note_memoized_function(VARIABLE_SIMILARITY);
        note_funcall_helper_function($sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_);
        register_external_symbol(FIND_REDUNDANT_LITERALS);
        memoization_state.note_globally_cached_function(LITERAL_FREE_VARIABLES_CACHED);
        register_external_symbol(FIND_UNCONNECTED_LITERALS);
        register_external_symbol(FIND_INCONSISTENT_LITERALS);
        define_test_case_table_int(APPLY_DEMORGANS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, $list_alt53, $KB, $TINY, $WORKING_, T }), $list_alt57);
        define_test_case_table_int(GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST, list(new SubLObject[]{ $TEST, symbol_function($sym60$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_), $OWNER, $$$baxter, $CLASSES, $list_alt53, $KB, $TINY, $WORKING_, T }), $list_alt61);
        define_test_case_table_int(FIND_UNCONNECTED_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, $list_alt53, $KB, $TINY, $WORKING_, T }), $list_alt62);
        define_test_case_table_int(FIND_INCONSISTENT_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, $list_alt53, $KB, $FULL, $WORKING_, T }), $list_alt64);
        return NIL;
    }

    public static SubLObject setup_variable_unification_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(GET_VAR_MAP_FOR_FORMULA);
            memoization_state.note_memoized_function(VARIABLE_SIMILARITY);
            note_funcall_helper_function($sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_);
            register_external_symbol(FIND_REDUNDANT_LITERALS);
            memoization_state.note_globally_cached_function(LITERAL_FREE_VARIABLES_CACHED);
            register_external_symbol(FIND_UNCONNECTED_LITERALS);
            register_external_symbol(FIND_INCONSISTENT_LITERALS);
            define_test_case_table_int(APPLY_DEMORGANS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list51, $KB, $TINY, $WORKING_, T }), $list55);
            define_test_case_table_int(GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST, list(new SubLObject[]{ $TEST, symbol_function($sym58$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_), $OWNER, NIL, $CLASSES, $list51, $KB, $FULL, $WORKING_, T }), $list60);
            define_test_case_table_int(FIND_UNCONNECTED_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list51, $KB, $FULL, $WORKING_, T }), $list61);
            define_test_case_table_int(FIND_INCONSISTENT_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list51, $KB, $FULL, $WORKING_, T }), $list62);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(APPLY_DEMORGANS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, $list_alt53, $KB, $TINY, $WORKING_, T }), $list_alt57);
            define_test_case_table_int(GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST, list(new SubLObject[]{ $TEST, symbol_function($sym60$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_), $OWNER, $$$baxter, $CLASSES, $list_alt53, $KB, $TINY, $WORKING_, T }), $list_alt61);
            define_test_case_table_int(FIND_UNCONNECTED_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, $list_alt53, $KB, $TINY, $WORKING_, T }), $list_alt62);
            define_test_case_table_int(FIND_INCONSISTENT_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$baxter, $CLASSES, $list_alt53, $KB, $FULL, $WORKING_, T }), $list_alt64);
        }
        return NIL;
    }

    public static SubLObject setup_variable_unification_file_Previous() {
        memoization_state.note_memoized_function(GET_VAR_MAP_FOR_FORMULA);
        memoization_state.note_memoized_function(VARIABLE_SIMILARITY);
        note_funcall_helper_function($sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_);
        register_external_symbol(FIND_REDUNDANT_LITERALS);
        memoization_state.note_globally_cached_function(LITERAL_FREE_VARIABLES_CACHED);
        register_external_symbol(FIND_UNCONNECTED_LITERALS);
        register_external_symbol(FIND_INCONSISTENT_LITERALS);
        define_test_case_table_int(APPLY_DEMORGANS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list51, $KB, $TINY, $WORKING_, T }), $list55);
        define_test_case_table_int(GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST, list(new SubLObject[]{ $TEST, symbol_function($sym58$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_), $OWNER, NIL, $CLASSES, $list51, $KB, $FULL, $WORKING_, T }), $list60);
        define_test_case_table_int(FIND_UNCONNECTED_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list51, $KB, $FULL, $WORKING_, T }), $list61);
        define_test_case_table_int(FIND_INCONSISTENT_LITERALS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list51, $KB, $FULL, $WORKING_, T }), $list62);
        return NIL;
    }

    private static SubLObject _constant_60_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("PericardialWindow-SurgicalProcedure")), list(reader_make_constant_shell("cCF-contains"), makeSymbol("?X"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?X"), makeSymbol("?Y")), list(makeSymbol("?Y"), makeSymbol("?X")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("HeartAttack")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?THING"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?THING")), list(makeSymbol("?THING"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFCardiacCathComplication"), makeSymbol("?CCF-EVENT"), reader_make_constant_shell("HeartAttack")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?CCF-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?CCF-EVENT")), list(makeSymbol("?CCF-EVENT"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFHospitalAdmitReason"), makeSymbol("?HOSPITAL-CARE"), reader_make_constant_shell("HeartAttack")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"), makeSymbol("?HOSPITAL-CARE")), list(makeSymbol("?Y"), makeSymbol("?HOSPITAL-CARE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("causeOfDeathEvent"), makeSymbol("?DEATH"), reader_make_constant_shell("HeartAttack")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?DEATH"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?DEATH")), list(makeSymbol("?DEATH"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("causeOfDeathEvent"), makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?DEATH"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION")), list(makeSymbol("?TYPE-OF-SITUATION"), makeSymbol("?DEATH"), makeSymbol("?Y")), list(makeSymbol("?DEATH"), makeSymbol("?TYPE-OF-SITUATION"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFCardiacCathComplication"), makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?CCF-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION")), list(makeSymbol("?CARDIAC-CATH-COMPLICATION"), makeSymbol("?CCF-EVENT"), makeSymbol("?Y")), list(makeSymbol("?CCF-EVENT"), makeSymbol("?CARDIAC-CATH-COMPLICATION"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFHospitalAdmitReason"), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?HOSPITAL-ADMIT-REASON")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?HOSPITAL-CARE"), makeSymbol("?Y"), makeSymbol("?HOSPITAL-ADMIT-REASON"), makeSymbol("?HOSPITAL-CARE")), list(makeSymbol("?HOSPITAL-ADMIT-REASON"), makeSymbol("?Y"), makeSymbol("?HOSPITAL-CARE")), list(makeSymbol("?Y"), makeSymbol("?HOSPITAL-ADMIT-REASON"), makeSymbol("?HOSPITAL-CARE")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventHasDiagnosis"), makeSymbol("?MEDICALLY-RELATED-EVENT"), reader_make_constant_shell("HeartCondition")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?MEDICALLY-RELATED-EVENT")), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("causeOfDeathEvent"), makeSymbol("?DEATH"), reader_make_constant_shell("HeartCondition")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?DEATH"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?DEATH")), list(makeSymbol("?DEATH"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventHasDiagnosis"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE")), list(makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE"), makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?Y")), list(makeSymbol("?MEDICALLY-RELATED-EVENT"), makeSymbol("?CCF-DIAGNOSIS-OR-DISORDER-TYPE"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFLeftVentricleEjectionFraction"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?X"), makeSymbol("?W"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y")), list(makeSymbol("?Y"), makeSymbol("?X"), makeSymbol("?W")), list(makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?W")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFSymptomType"), makeSymbol("?SYMPTOM"), reader_make_constant_shell("Angina")), list(reader_make_constant_shell("eventHasDiagnosisOrFinding"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?SYMPTOM"), makeSymbol("?Y"), makeSymbol("?EVENT")), list(makeSymbol("?EVENT"), makeSymbol("?Y"), makeSymbol("?SYMPTOM")), list(makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFSymptomType"), makeSymbol("?SYMPTOM"), makeSymbol("?SYMPTOM-TYPE")), list(reader_make_constant_shell("eventHasDiagnosisOrFinding"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?EVENT"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?SYMPTOM"), makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM-TYPE")), list(makeSymbol("?SYMPTOM-TYPE"), makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM")), list(makeSymbol("?EVENT"), makeSymbol("?Y"), makeSymbol("?SYMPTOM-TYPE"), makeSymbol("?SYMPTOM")), list(makeSymbol("?Y"), makeSymbol("?EVENT"), makeSymbol("?SYMPTOM-TYPE"), makeSymbol("?SYMPTOM")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventHasDiagnosisOrFinding"), makeSymbol("?CCF-EVENT"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(reader_make_constant_shell("cCFAnginaRestPain"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?ANGINA-REST-PAIN")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?CCF-EVENT"), makeSymbol("?ANIMAL"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?CCF-EVENT"), makeSymbol("?ANIMAL"), makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?ANIMAL"), makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?CCF-EVENT")), list(makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?ANIMAL"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?CCF-EVENT")), list(makeSymbol("?ANIMAL"), makeSymbol("?ANGINA-REST-PAIN"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), makeSymbol("?CCF-EVENT")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("cCFHematocritTestValue"), makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?BLOOD-TEST"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE")), list(makeSymbol("?SCALAR-VALUE"), makeSymbol("?BLOOD-TEST"), makeSymbol("?Y")), list(makeSymbol("?BLOOD-TEST"), makeSymbol("?SCALAR-VALUE"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("ElectrophysiologyStudy-CCFManagement")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?THING"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?THING")), list(makeSymbol("?THING"), makeSymbol("?Y")))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?THING"), reader_make_constant_shell("SurgicalProcedure_eps")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?THING"), makeSymbol("?Y"))), reader_make_constant_shell("MedicalResearchRecommendedWFFCheckingMt")), list(list(makeSymbol("?Y"), makeSymbol("?THING")), list(makeSymbol("?THING"), makeSymbol("?Y")))) });
    }

    @Override
    public void declareFunctions() {
        declare_variable_unification_file();
    }

    @Override
    public void initializeVariables() {
        init_variable_unification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_variable_unification_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("NEGATION-OPERATOR"), makeSymbol("NEGATED-SENTENCE"));

    static private final SubLList $list_alt1 = list(reader_make_constant_shell("or"));

    static private final SubLList $list_alt4 = list(reader_make_constant_shell("and"));

    static private final SubLList $list_alt13 = list(list($TEST, makeSymbol("IRREFLEXIVE-PREDICATE?")), list(makeKeyword("AND"), list($TEST, makeSymbol("EL-VAR?")), list($BIND, makeSymbol("VAR1"))), list(makeKeyword("AND"), list($TEST, makeSymbol("EL-VAR?")), list($BIND, makeSymbol("VAR2"))));

    public static final SubLSymbol $kw17$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt18 = list(list($BIND, makeSymbol("COL")));

    static private final SubLString $str_alt28$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt29 = cons(makeSymbol("VAR1"), makeSymbol("VAR2"));

    static private final SubLList $list_alt30 = cons(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VAR"));

    static private final SubLList $list_alt32 = cons(reader_make_constant_shell("and"), makeKeyword("ANYTHING"));

    static private final SubLSymbol $sym33$CAR_CDR_EQUAL_ = makeSymbol("CAR-CDR-EQUAL?");

    static private final SubLList $list_alt35 = cons(reader_make_constant_shell("or"), makeKeyword("ANYTHING"));

    static private final SubLSymbol $sym39$LITERAL_SET__ = makeSymbol("LITERAL-SET->");

    static private final SubLSymbol $sym41$STRING_ = makeSymbol("STRING<");

    static private final SubLString $$$baxter = makeString("baxter");

    static private final SubLList $list_alt53 = list(makeSymbol("CAE-TEST-CASE-TABLES"), makeSymbol("VARIABLE-UNIFICATION-TEST-CASE-TABLES"));

    static private final SubLList $list_alt57 = list(list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")))), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")))), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))))), list(list(list(reader_make_constant_shell("not"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Collection"), reader_make_constant_shell("Thing"))))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Collection"), reader_make_constant_shell("Thing"))))));

    static private final SubLSymbol $sym58$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    static private final SubLSymbol $sym60$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_ = makeSymbol("INCOMPATIBLE-VAR-MAP-ALISTS-EQUAL?");

    public static final SubLObject $list_alt61 = com.cyc.cycjava.cycl.variable_unification._constant_61_initializer();

    static private final SubLList $list_alt62 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y"))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell("isa"), makeSymbol("?W"), makeSymbol("?V")))), list(list(THREE_INTEGER))), list(list(list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Individual")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Collection")))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Individual")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Collection"))))), NIL), list(list(list(reader_make_constant_shell("or"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Individual")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Collection")))), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell("genls"), reader_make_constant_shell("Individual"), reader_make_constant_shell("Collection"))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell("genls"), reader_make_constant_shell("Individual"), reader_make_constant_shell("Collection")))), list(list(THREE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("genls"), reader_make_constant_shell("Individual"), reader_make_constant_shell("Collection")))), list(list(TWO_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("isa"), makeSymbol("?V"), makeSymbol("?W"))))), list(list(THREE_INTEGER, ONE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), makeSymbol("?Z")), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("isa"), makeSymbol("?V"), makeSymbol("?W"))))), list(list(THREE_INTEGER, ONE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Z")), list(reader_make_constant_shell("isa"), makeSymbol("?Z"))), list(reader_make_constant_shell("isa"), makeSymbol("?Z"))))), list(list(TWO_INTEGER, TWO_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("patientTreated"), makeSymbol("?MAIN-PROC"), makeSymbol("?PAT")), list(reader_make_constant_shell("not"), list(reader_make_constant_shell("thereExists"), makeSymbol("?SURG-PROC"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("concomitantProcedures"), makeSymbol("?MAIN-PROC"), makeSymbol("?SURG-PROC")), list(reader_make_constant_shell("isa"), makeSymbol("?SURG-PROC"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?SURG-PROC"), makeSymbol("?PAT"))))))), NIL), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("patientTreated"), makeSymbol("?MAIN-PROC"), makeSymbol("?PAT")), list(reader_make_constant_shell("thereExists"), makeSymbol("?SURG-PROC"), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("concomitantProcedures"), makeSymbol("?MAIN-PROC"), makeSymbol("?SURG-PROC")), list(reader_make_constant_shell("isa"), makeSymbol("?SURG-PROC"), reader_make_constant_shell("Thing")), list(reader_make_constant_shell("patientTreated"), makeSymbol("?SURG-PROC"), makeSymbol("?PAT")))))), list(list(TWO_INTEGER, TWO_INTEGER, TWO_INTEGER))) });

    static private final SubLList $list_alt64 = list(list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Person"))), reader_make_constant_shell("TerrorismRecommendedWffCheckingMt")), list(list(TWO_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Pi-Number"))), reader_make_constant_shell("TerrorismRecommendedWffCheckingMt")), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Pi-Number")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event"))), reader_make_constant_shell("TerrorismRecommendedWffCheckingMt")), list(list(ONE_INTEGER))), list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("Event")), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Pi-Number"))), reader_make_constant_shell("TerrorismRecommendedWffCheckingMt")), list(list(TWO_INTEGER))));
}

/**
 * Total time: 682 ms
 */
