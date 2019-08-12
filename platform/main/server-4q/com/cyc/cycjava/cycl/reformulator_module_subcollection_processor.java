/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REFORMULATOR-MODULE-SUBCOLLECTION-PROCESSOR
 * source file: /cyc/top/cycl/reformulator-module-subcollection-processor.lisp
 * created:     2019/07/03 17:37:33
 */
public final class reformulator_module_subcollection_processor extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_isa_subcol_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, ISA_SUBCOL, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, ISA_SUBCOL, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, ISA_SUBCOL, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_isa_subcol_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_isa_perfbytype_subcol_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, ISA_PERFBYTYPE_SUBCOL, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, ISA_PERFBYTYPE_SUBCOL, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, ISA_PERFBYTYPE_SUBCOL, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_isa_perfbytype_subcol_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_isa_difference_subcol_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, ISA_DIFFERENCE_SUBCOL, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, ISA_DIFFERENCE_SUBCOL, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, ISA_DIFFERENCE_SUBCOL, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_isa_difference_subcol_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_genls_subcol_type_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, GENLS_SUBCOL_TYPE, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, GENLS_SUBCOL_TYPE, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, GENLS_SUBCOL_TYPE, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_genls_subcol_type_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_genls_subcol_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, GENLS_SUBCOL, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, GENLS_SUBCOL, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, GENLS_SUBCOL, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_genls_subcol_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_genls_intersect_subcol_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, GENLS_INTERSECT_SUBCOL, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, GENLS_INTERSECT_SUBCOL, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, GENLS_INTERSECT_SUBCOL, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_genls_intersect_subcol_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_isa_subcol_out_cycl(SubLObject isa_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(isa_subcol, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_isa_subcol_mt(SubLObject isa_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(isa_subcol, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_isa_subcol_in_cycl(SubLObject isa_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(isa_subcol, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_isa_perfbytype_subcol_out_cycl(SubLObject isa_perfbytype_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(isa_perfbytype_subcol, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_isa_perfbytype_subcol_mt(SubLObject isa_perfbytype_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(isa_perfbytype_subcol, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_isa_perfbytype_subcol_in_cycl(SubLObject isa_perfbytype_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(isa_perfbytype_subcol, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_isa_difference_subcol_out_cycl(SubLObject isa_difference_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(isa_difference_subcol, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_isa_difference_subcol_mt(SubLObject isa_difference_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(isa_difference_subcol, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_isa_difference_subcol_in_cycl(SubLObject isa_difference_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(isa_difference_subcol, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_genls_subcol_type_out_cycl(SubLObject genls_subcol_type, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(genls_subcol_type, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_genls_subcol_type_mt(SubLObject genls_subcol_type, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(genls_subcol_type, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_genls_subcol_type_in_cycl(SubLObject genls_subcol_type, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(genls_subcol_type, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_genls_subcol_out_cycl(SubLObject genls_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(genls_subcol, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_genls_subcol_mt(SubLObject genls_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(genls_subcol, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_genls_subcol_in_cycl(SubLObject genls_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(genls_subcol, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_genls_intersect_subcol_out_cycl(SubLObject genls_intersect_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(genls_intersect_subcol, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_genls_intersect_subcol_mt(SubLObject genls_intersect_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(genls_intersect_subcol, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_genls_intersect_subcol_in_cycl(SubLObject genls_intersect_subcol, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(genls_intersect_subcol, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject isa_subcol_p(SubLObject isa_subcol) {
        return classes.subloop_instanceof_class(isa_subcol, ISA_SUBCOL);
    }

    public static final SubLObject isa_perfbytype_subcol_p(SubLObject isa_perfbytype_subcol) {
        return classes.subloop_instanceof_class(isa_perfbytype_subcol, ISA_PERFBYTYPE_SUBCOL);
    }

    public static final SubLObject isa_difference_subcol_p(SubLObject isa_difference_subcol) {
        return classes.subloop_instanceof_class(isa_difference_subcol, ISA_DIFFERENCE_SUBCOL);
    }

    public static final SubLObject get_isa_subcol_out_cycl(SubLObject isa_subcol) {
        return classes.subloop_get_access_protected_instance_slot(isa_subcol, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_isa_subcol_mt(SubLObject isa_subcol) {
        return classes.subloop_get_access_protected_instance_slot(isa_subcol, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_isa_subcol_in_cycl(SubLObject isa_subcol) {
        return classes.subloop_get_access_protected_instance_slot(isa_subcol, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_isa_perfbytype_subcol_out_cycl(SubLObject isa_perfbytype_subcol) {
        return classes.subloop_get_access_protected_instance_slot(isa_perfbytype_subcol, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_isa_perfbytype_subcol_mt(SubLObject isa_perfbytype_subcol) {
        return classes.subloop_get_access_protected_instance_slot(isa_perfbytype_subcol, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_isa_perfbytype_subcol_in_cycl(SubLObject isa_perfbytype_subcol) {
        return classes.subloop_get_access_protected_instance_slot(isa_perfbytype_subcol, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_isa_difference_subcol_out_cycl(SubLObject isa_difference_subcol) {
        return classes.subloop_get_access_protected_instance_slot(isa_difference_subcol, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_isa_difference_subcol_mt(SubLObject isa_difference_subcol) {
        return classes.subloop_get_access_protected_instance_slot(isa_difference_subcol, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_isa_difference_subcol_in_cycl(SubLObject isa_difference_subcol) {
        return classes.subloop_get_access_protected_instance_slot(isa_difference_subcol, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_genls_subcol_type_out_cycl(SubLObject genls_subcol_type) {
        return classes.subloop_get_access_protected_instance_slot(genls_subcol_type, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_genls_subcol_type_mt(SubLObject genls_subcol_type) {
        return classes.subloop_get_access_protected_instance_slot(genls_subcol_type, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_genls_subcol_type_in_cycl(SubLObject genls_subcol_type) {
        return classes.subloop_get_access_protected_instance_slot(genls_subcol_type, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_genls_subcol_out_cycl(SubLObject genls_subcol) {
        return classes.subloop_get_access_protected_instance_slot(genls_subcol, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_genls_subcol_mt(SubLObject genls_subcol) {
        return classes.subloop_get_access_protected_instance_slot(genls_subcol, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_genls_subcol_in_cycl(SubLObject genls_subcol) {
        return classes.subloop_get_access_protected_instance_slot(genls_subcol, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_genls_intersect_subcol_out_cycl(SubLObject genls_intersect_subcol) {
        return classes.subloop_get_access_protected_instance_slot(genls_intersect_subcol, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_genls_intersect_subcol_mt(SubLObject genls_intersect_subcol) {
        return classes.subloop_get_access_protected_instance_slot(genls_intersect_subcol, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_genls_intersect_subcol_in_cycl(SubLObject genls_intersect_subcol) {
        return classes.subloop_get_access_protected_instance_slot(genls_intersect_subcol, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject genls_subcol_type_p(SubLObject genls_subcol_type) {
        return classes.subloop_instanceof_class(genls_subcol_type, GENLS_SUBCOL_TYPE);
    }

    public static final SubLObject genls_subcol_p(SubLObject genls_subcol) {
        return classes.subloop_instanceof_class(genls_subcol, GENLS_SUBCOL);
    }

    public static final SubLObject genls_intersect_subcol_p(SubLObject genls_intersect_subcol) {
        return classes.subloop_instanceof_class(genls_intersect_subcol, GENLS_INTERSECT_SUBCOL);
    }

    public static final SubLFile me = new reformulator_module_subcollection_processor();

 public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_subcollection_processor";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $scfn_microseconds$ = makeSymbol("*SCFN-MICROSECONDS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rl_scfn_data$ = makeSymbol("*DTP-RL-SCFN-DATA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $subcollection_macros$ = makeSymbol("*SUBCOLLECTION-MACROS*");



    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("SCFN-EXPRESSION-REQUIRED"), $COST, makeSymbol("SCFN-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("SCFN-EXPRESSION-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Distributes info from a #$SubcollectionFunction NAUT into a conjunctive clause"), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$isa ?VAR0 (#$SubcollectionOfWithRelationToFn #$Sheep #$hates #$Bertolo))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$and (#$isa ?VAR0 #$Sheep) (#$hates ?VAR0 #$Bertolo))") });

    private static final SubLInteger $int$2300 = makeInteger(2300);

    private static final SubLSymbol RL_SCFN_DATA = makeSymbol("RL-SCFN-DATA");

    private static final SubLSymbol RL_SCFN_DATA_P = makeSymbol("RL-SCFN-DATA-P");

    static private final SubLList $list5 = list(makeSymbol("HIERARCHY-PRED"), makeSymbol("VAR-NAME"), makeSymbol("NAUT"), makeSymbol("SUBCOLLECTION-FN"), makeSymbol("ARG-FROM"), makeSymbol("PRED"), makeSymbol("ARG-TO"));

    static private final SubLList $list6 = list(makeKeyword("HIERARCHY-PRED"), makeKeyword("VAR-NAME"), $NAUT, makeKeyword("SUBCOLLECTION-FN"), makeKeyword("ARG-FROM"), $PRED, makeKeyword("ARG-TO"));

    static private final SubLList $list7 = list(makeSymbol("RL-SCFN-DATA-HIERARCHY-PRED"), makeSymbol("RL-SCFN-DATA-VAR-NAME"), makeSymbol("RL-SCFN-DATA-NAUT"), makeSymbol("RL-SCFN-DATA-SUBCOLLECTION-FN"), makeSymbol("RL-SCFN-DATA-ARG-FROM"), makeSymbol("RL-SCFN-DATA-PRED"), makeSymbol("RL-SCFN-DATA-ARG-TO"));

    static private final SubLList $list8 = list(makeSymbol("_CSETF-RL-SCFN-DATA-HIERARCHY-PRED"), makeSymbol("_CSETF-RL-SCFN-DATA-VAR-NAME"), makeSymbol("_CSETF-RL-SCFN-DATA-NAUT"), makeSymbol("_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN"), makeSymbol("_CSETF-RL-SCFN-DATA-ARG-FROM"), makeSymbol("_CSETF-RL-SCFN-DATA-PRED"), makeSymbol("_CSETF-RL-SCFN-DATA-ARG-TO"));

    private static final SubLSymbol PRINT_RL_SCFN_DATA = makeSymbol("PRINT-RL-SCFN-DATA");

    private static final SubLSymbol RL_SCFN_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RL-SCFN-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RL-SCFN-DATA-P"));

    private static final SubLSymbol RL_SCFN_DATA_HIERARCHY_PRED = makeSymbol("RL-SCFN-DATA-HIERARCHY-PRED");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_HIERARCHY_PRED = makeSymbol("_CSETF-RL-SCFN-DATA-HIERARCHY-PRED");

    private static final SubLSymbol RL_SCFN_DATA_VAR_NAME = makeSymbol("RL-SCFN-DATA-VAR-NAME");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_VAR_NAME = makeSymbol("_CSETF-RL-SCFN-DATA-VAR-NAME");

    private static final SubLSymbol RL_SCFN_DATA_NAUT = makeSymbol("RL-SCFN-DATA-NAUT");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_NAUT = makeSymbol("_CSETF-RL-SCFN-DATA-NAUT");

    private static final SubLSymbol RL_SCFN_DATA_SUBCOLLECTION_FN = makeSymbol("RL-SCFN-DATA-SUBCOLLECTION-FN");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_SUBCOLLECTION_FN = makeSymbol("_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN");

    private static final SubLSymbol RL_SCFN_DATA_ARG_FROM = makeSymbol("RL-SCFN-DATA-ARG-FROM");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_ARG_FROM = makeSymbol("_CSETF-RL-SCFN-DATA-ARG-FROM");

    private static final SubLSymbol RL_SCFN_DATA_PRED = makeSymbol("RL-SCFN-DATA-PRED");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_PRED = makeSymbol("_CSETF-RL-SCFN-DATA-PRED");

    private static final SubLSymbol RL_SCFN_DATA_ARG_TO = makeSymbol("RL-SCFN-DATA-ARG-TO");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_ARG_TO = makeSymbol("_CSETF-RL-SCFN-DATA-ARG-TO");

    private static final SubLString $str33$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_RL_SCFN_DATA = makeSymbol("MAKE-RL-SCFN-DATA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RL_SCFN_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RL-SCFN-DATA-METHOD");

    private static final SubLString $str39$__RL_Scfn_Data__H_Pred____S__ = makeString("#<RL-Scfn-Data: H-Pred:  ~S~%");

    private static final SubLString $str40$___________________Var____S__ = makeString("                   Var:  ~S~%");

    private static final SubLString $str41$__________________NAUT____S__ = makeString("                  NAUT:  ~S~%");

    private static final SubLString $str42$_______________SubC_fn____S__ = makeString("               SubC-fn:  ~S~%");

    private static final SubLString $str43$______________Arg_from____S__ = makeString("              Arg-from:  ~S~%");

    private static final SubLString $str44$__________________Pred____S__ = makeString("                  Pred:  ~S~%");

    private static final SubLString $str45$________________Arg_To____S___ = makeString("                Arg-To:  ~S>~%");

    static private final SubLList $list46 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));



    static private final SubLList $list48 = list(reader_make_constant_shell("SubcollectionPerformedByTypeFn"), reader_make_constant_shell("SubcollectionPerformedByFn"));

    static private final SubLList $list49 = list(makeSymbol("SCFN"), makeSymbol("ARG1"), makeSymbol("PRED"), makeSymbol("ARG2"));

    private static final SubLList $list50 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"));

    private static final SubLList $list51 = list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"));

    private static final SubLList $list52 = list(list(reader_make_constant_shell("isa"), list(list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), list($PRED, $TERM, makeKeyword("ARG"))), list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), list($PRED, makeKeyword("ARG"), $TERM)), list(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), list(reader_make_constant_shell("relationInstanceExists"), $PRED, $TERM, makeKeyword("ARG"))), list(reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), list(reader_make_constant_shell("relationExistsInstance"), $PRED, makeKeyword("ARG"), $TERM)))), list(reader_make_constant_shell("genls"), list(list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), list(reader_make_constant_shell("relationAllInstance"), $PRED, $TERM, makeKeyword("ARG"))), list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), list(reader_make_constant_shell("relationInstanceAll"), $PRED, makeKeyword("ARG"), $TERM)), list(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), list(reader_make_constant_shell("relationAllExists"), $PRED, $TERM, makeKeyword("ARG"))), list(reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), list(reader_make_constant_shell("relationExistsAll"), $PRED, makeKeyword("ARG"), $TERM)))));

    private static final SubLList $list53 = list(makeKeyword("MODES"), list(reader_make_constant_shell("ReformulatorMode-Verbosify")), makeKeyword("RECURSION-LIMIT"), ZERO_INTEGER);

    private static final SubLList $list54 = list(makeSymbol("SCFN"), makeSymbol("ARG-FROM"), makeSymbol("PRED"), makeSymbol("ARG-TO"));

    private static final SubLList $list55 = list(reader_make_constant_shell("CollectionIntersection2Fn"), reader_make_constant_shell("CollectionDifferenceFn"));

















    private static final SubLString $str68$Reformulator_Subcollection_Proces = makeString("Reformulator Subcollection Processing");

    private static final SubLString $str69$subcoll_proc_test_suite = makeString("subcoll-proc-test-suite");

    /**
     *
     *
     * @param expression;
     * 		EL FORM
     * @return INTEGER
    Estimates the cost of calling the Subcollection Functions RL module
    on EXPRESSION.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param expression;\r\n\t\tEL FORM\r\n@return INTEGER\r\nEstimates the cost of calling the Subcollection Functions RL module\r\non EXPRESSION.\r\n@unknown bertolo")
    public static final SubLObject scfn_cost_estimate_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return $scfn_microseconds$.getGlobalValue();
    }

    /**
     *
     *
     * @param expression;
     * 		EL FORM
     * @return INTEGER
    Estimates the cost of calling the Subcollection Functions RL module
    on EXPRESSION.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param expression;\r\n\t\tEL FORM\r\n@return INTEGER\r\nEstimates the cost of calling the Subcollection Functions RL module\r\non EXPRESSION.\r\n@unknown bertolo")
    public static SubLObject scfn_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $scfn_microseconds$.getGlobalValue();
    }

    public static final SubLObject rl_scfn_data_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_rl_scfn_data(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rl_scfn_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rl_scfn_data(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rl_scfn_data_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.reformulator_module_subcollection_processor.$rl_scfn_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rl_scfn_data_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.reformulator_module_subcollection_processor.$rl_scfn_data_native.class ? T : NIL;
    }

    public static final SubLObject rl_scfn_data_hierarchy_pred_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.getField2();
    }

    public static SubLObject rl_scfn_data_hierarchy_pred(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rl_scfn_data_var_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.getField3();
    }

    public static SubLObject rl_scfn_data_var_name(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rl_scfn_data_naut_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.getField4();
    }

    public static SubLObject rl_scfn_data_naut(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rl_scfn_data_subcollection_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.getField5();
    }

    public static SubLObject rl_scfn_data_subcollection_fn(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rl_scfn_data_arg_from_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.getField6();
    }

    public static SubLObject rl_scfn_data_arg_from(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject rl_scfn_data_pred_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.getField7();
    }

    public static SubLObject rl_scfn_data_pred(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject rl_scfn_data_arg_to_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.getField8();
    }

    public static SubLObject rl_scfn_data_arg_to(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_rl_scfn_data_hierarchy_pred_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rl_scfn_data_hierarchy_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rl_scfn_data_var_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rl_scfn_data_var_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rl_scfn_data_naut_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rl_scfn_data_naut(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rl_scfn_data_subcollection_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rl_scfn_data_subcollection_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rl_scfn_data_arg_from_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rl_scfn_data_arg_from(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_rl_scfn_data_pred_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rl_scfn_data_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_rl_scfn_data_arg_to_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RL_SCFN_DATA_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rl_scfn_data_arg_to(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "! reformulator_module_subcollection_processor.rl_scfn_data_p(v_object) " + "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_rl_scfn_data_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.reformulator_module_subcollection_processor.$rl_scfn_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HIERARCHY_PRED)) {
                        _csetf_rl_scfn_data_hierarchy_pred(v_new, current_value);
                    } else {
                        if (pcase_var.eql($VAR_NAME)) {
                            _csetf_rl_scfn_data_var_name(v_new, current_value);
                        } else {
                            if (pcase_var.eql($NAUT)) {
                                _csetf_rl_scfn_data_naut(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SUBCOLLECTION_FN)) {
                                    _csetf_rl_scfn_data_subcollection_fn(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ARG_FROM)) {
                                        _csetf_rl_scfn_data_arg_from(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PRED)) {
                                            _csetf_rl_scfn_data_pred(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($ARG_TO)) {
                                                _csetf_rl_scfn_data_arg_to(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt32$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_rl_scfn_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.reformulator_module_subcollection_processor.$rl_scfn_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HIERARCHY_PRED)) {
                _csetf_rl_scfn_data_hierarchy_pred(v_new, current_value);
            } else
                if (pcase_var.eql($VAR_NAME)) {
                    _csetf_rl_scfn_data_var_name(v_new, current_value);
                } else
                    if (pcase_var.eql($NAUT)) {
                        _csetf_rl_scfn_data_naut(v_new, current_value);
                    } else
                        if (pcase_var.eql($SUBCOLLECTION_FN)) {
                            _csetf_rl_scfn_data_subcollection_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($ARG_FROM)) {
                                _csetf_rl_scfn_data_arg_from(v_new, current_value);
                            } else
                                if (pcase_var.eql($PRED)) {
                                    _csetf_rl_scfn_data_pred(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ARG_TO)) {
                                        _csetf_rl_scfn_data_arg_to(v_new, current_value);
                                    } else {
                                        Errors.error($str33$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rl_scfn_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RL_SCFN_DATA, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HIERARCHY_PRED, rl_scfn_data_hierarchy_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $VAR_NAME, rl_scfn_data_var_name(obj));
        funcall(visitor_fn, obj, $SLOT, $NAUT, rl_scfn_data_naut(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBCOLLECTION_FN, rl_scfn_data_subcollection_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_FROM, rl_scfn_data_arg_from(obj));
        funcall(visitor_fn, obj, $SLOT, $PRED, rl_scfn_data_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_TO, rl_scfn_data_arg_to(obj));
        funcall(visitor_fn, obj, $END, MAKE_RL_SCFN_DATA, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rl_scfn_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rl_scfn_data(obj, visitor_fn);
    }

    public static final SubLObject print_rl_scfn_data_alt(SubLObject rl_scfn_data, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt33$__RL_Scfn_Data__H_Pred____S__, rl_scfn_data_hierarchy_pred(rl_scfn_data));
        format(stream, $str_alt34$___________________Var____S__, rl_scfn_data_var_name(rl_scfn_data));
        format(stream, $str_alt35$__________________NAUT____S__, rl_scfn_data_naut(rl_scfn_data));
        format(stream, $str_alt36$_______________SubC_fn____S__, rl_scfn_data_subcollection_fn(rl_scfn_data));
        format(stream, $str_alt37$______________Arg_from____S__, rl_scfn_data_arg_from(rl_scfn_data));
        format(stream, $str_alt38$__________________Pred____S__, rl_scfn_data_pred(rl_scfn_data));
        format(stream, $str_alt39$________________Arg_To____S___, rl_scfn_data_arg_to(rl_scfn_data));
        return rl_scfn_data;
    }

    public static SubLObject print_rl_scfn_data(final SubLObject rl_scfn_data, final SubLObject stream, final SubLObject depth) {
        format(stream, $str39$__RL_Scfn_Data__H_Pred____S__, rl_scfn_data_hierarchy_pred(rl_scfn_data));
        format(stream, $str40$___________________Var____S__, rl_scfn_data_var_name(rl_scfn_data));
        format(stream, $str41$__________________NAUT____S__, rl_scfn_data_naut(rl_scfn_data));
        format(stream, $str42$_______________SubC_fn____S__, rl_scfn_data_subcollection_fn(rl_scfn_data));
        format(stream, $str43$______________Arg_from____S__, rl_scfn_data_arg_from(rl_scfn_data));
        format(stream, $str44$__________________Pred____S__, rl_scfn_data_pred(rl_scfn_data));
        format(stream, $str45$________________Arg_To____S___, rl_scfn_data_arg_to(rl_scfn_data));
        return rl_scfn_data;
    }

    public static final SubLObject new_rl_scfn_data_alt(SubLObject hier, SubLObject var, SubLObject naut, SubLObject scfn, SubLObject arg_from, SubLObject pred, SubLObject arg_to) {
        {
            SubLObject rl_scfn_data = make_rl_scfn_data(UNPROVIDED);
            _csetf_rl_scfn_data_hierarchy_pred(rl_scfn_data, hier);
            _csetf_rl_scfn_data_var_name(rl_scfn_data, var);
            _csetf_rl_scfn_data_naut(rl_scfn_data, naut);
            _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, scfn);
            _csetf_rl_scfn_data_arg_from(rl_scfn_data, arg_from);
            _csetf_rl_scfn_data_pred(rl_scfn_data, pred);
            _csetf_rl_scfn_data_arg_to(rl_scfn_data, arg_to);
            return rl_scfn_data;
        }
    }

    public static SubLObject new_rl_scfn_data(final SubLObject hier, final SubLObject var, final SubLObject naut, final SubLObject scfn, final SubLObject arg_from, final SubLObject pred, final SubLObject arg_to) {
        final SubLObject rl_scfn_data = make_rl_scfn_data(UNPROVIDED);
        _csetf_rl_scfn_data_hierarchy_pred(rl_scfn_data, hier);
        _csetf_rl_scfn_data_var_name(rl_scfn_data, var);
        _csetf_rl_scfn_data_naut(rl_scfn_data, naut);
        _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, scfn);
        _csetf_rl_scfn_data_arg_from(rl_scfn_data, arg_from);
        _csetf_rl_scfn_data_pred(rl_scfn_data, pred);
        _csetf_rl_scfn_data_arg_to(rl_scfn_data, arg_to);
        return rl_scfn_data;
    }

    public static final SubLObject scfn_expression_required_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            {
                SubLObject sentence = clause_utilities.gaf_cnf_literal(expression.first());
                return makeBoolean((((NIL != possibly_atomic_sentence_p(sentence)) && (NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED))) && (NIL != member(cycl_utilities.atomic_sentence_predicate(sentence), $list_alt40, UNPROVIDED, UNPROVIDED))) && ((NIL != nart_handles.nart_p(cycl_utilities.sentence_arg2(sentence, UNPROVIDED))) || (NIL != possibly_naut_p(cycl_utilities.sentence_arg2(sentence, UNPROVIDED)))));
            }
        }
        return NIL;
    }

    public static SubLObject scfn_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            final SubLObject sentence = clause_utilities.gaf_cnf_literal(expression.first());
            return makeBoolean((((NIL != possibly_atomic_sentence_p(sentence)) && (NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED))) && (NIL != member(cycl_utilities.atomic_sentence_predicate(sentence), $list46, UNPROVIDED, UNPROVIDED))) && ((NIL != nart_handles.nart_p(cycl_utilities.sentence_arg2(sentence, UNPROVIDED))) || (NIL != possibly_naut_p(cycl_utilities.sentence_arg2(sentence, UNPROVIDED)))));
        }
        return NIL;
    }

    /**
     *
     *
     * @param expression;
     * 		EL FORM
     * @return RL-SCFN-DATA/NIL
    Determines whether the Subcollection Functions RL module applies to
    the EL form EXPRESSION. Returns a rl-scfn-data structure if it does and
    NIL otherwise.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param expression;\r\n\t\tEL FORM\r\n@return RL-SCFN-DATA/NIL\r\nDetermines whether the Subcollection Functions RL module applies to\r\nthe EL form EXPRESSION. Returns a rl-scfn-data structure if it does and\r\nNIL otherwise.\r\n@unknown bertolo")
    public static final SubLObject deconstruct_rl_scfn_expression_alt(SubLObject expression, SubLObject mt) {
        {
            SubLObject sentence = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject hier_pred = cycl_utilities.formula_arg0(sentence);
            SubLObject var = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            SubLObject nat = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
            SubLObject naut_candidate = function_terms.nart_to_naut(nat);
            SubLObject naut_fn = cycl_utilities.nat_functor(naut_candidate);
            if (!((NIL != isa.isaP(naut_fn, $$SubcollectionFunction, mt, UNPROVIDED)) || (NIL != member(naut_fn, $list_alt42, UNPROVIDED, UNPROVIDED)))) {
                return NIL;
            }
            if (NIL != formula_arityE(naut_candidate, THREE_INTEGER, UNPROVIDED)) {
                {
                    SubLObject datum = naut_candidate;
                    SubLObject current = datum;
                    SubLObject scfn = NIL;
                    SubLObject arg1 = NIL;
                    SubLObject pred = NIL;
                    SubLObject arg2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    scfn = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    arg1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    arg2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject arg_from = NIL;
                            SubLObject arg_to = NIL;
                            if (NIL != member(scfn, $list_alt44, UNPROVIDED, UNPROVIDED)) {
                                arg_from = arg1;
                                arg_to = arg2;
                            } else {
                                if (NIL != member(scfn, $list_alt45, UNPROVIDED, UNPROVIDED)) {
                                    arg_from = arg2;
                                    arg_to = arg1;
                                }
                            }
                            return new_rl_scfn_data(hier_pred, var, naut_candidate, scfn, arg_from, pred, arg_to);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt43);
                    }
                }
            } else {
                {
                    SubLObject rl_scfn_data = make_rl_scfn_data(UNPROVIDED);
                    _csetf_rl_scfn_data_hierarchy_pred(rl_scfn_data, hier_pred);
                    _csetf_rl_scfn_data_var_name(rl_scfn_data, var);
                    _csetf_rl_scfn_data_naut(rl_scfn_data, naut_candidate);
                    _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, cycl_utilities.nat_functor(naut_candidate));
                    return rl_scfn_data;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param expression;
     * 		EL FORM
     * @return RL-SCFN-DATA/NIL
    Determines whether the Subcollection Functions RL module applies to
    the EL form EXPRESSION. Returns a rl-scfn-data structure if it does and
    NIL otherwise.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param expression;\r\n\t\tEL FORM\r\n@return RL-SCFN-DATA/NIL\r\nDetermines whether the Subcollection Functions RL module applies to\r\nthe EL form EXPRESSION. Returns a rl-scfn-data structure if it does and\r\nNIL otherwise.\r\n@unknown bertolo")
    public static SubLObject deconstruct_rl_scfn_expression(final SubLObject expression, final SubLObject mt) {
        final SubLObject sentence = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject hier_pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject var = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        final SubLObject nat = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject naut_candidate = function_terms.nart_to_naut(nat);
        final SubLObject naut_fn = cycl_utilities.nat_functor(naut_candidate);
        if ((NIL == isa.isaP(naut_fn, $$SubcollectionFunction, mt, UNPROVIDED)) && (NIL == member(naut_fn, $list48, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if (NIL == formula_arityE(naut_candidate, THREE_INTEGER, UNPROVIDED)) {
            final SubLObject rl_scfn_data = make_rl_scfn_data(UNPROVIDED);
            _csetf_rl_scfn_data_hierarchy_pred(rl_scfn_data, hier_pred);
            _csetf_rl_scfn_data_var_name(rl_scfn_data, var);
            _csetf_rl_scfn_data_naut(rl_scfn_data, naut_candidate);
            _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, cycl_utilities.nat_functor(naut_candidate));
            return rl_scfn_data;
        }
        SubLObject current;
        final SubLObject datum = current = naut_candidate;
        SubLObject scfn = NIL;
        SubLObject arg1 = NIL;
        SubLObject pred = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        scfn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject arg_from = NIL;
            SubLObject arg_to = NIL;
            if (NIL != member(scfn, $list50, UNPROVIDED, UNPROVIDED)) {
                arg_from = arg1;
                arg_to = arg2;
            } else
                if (NIL != member(scfn, $list51, UNPROVIDED, UNPROVIDED)) {
                    arg_from = arg2;
                    arg_to = arg1;
                }

            return new_rl_scfn_data(hier_pred, var, naut_candidate, scfn, arg_from, pred, arg_to);
        }
        cdestructuring_bind_error(datum, $list49);
        return NIL;
    }

    public static final SubLObject scfn_expression_reformulate_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            SubLObject thesentence = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject rl_scfn_data = deconstruct_rl_scfn_expression(expression, mt);
            if (NIL != rl_scfn_data) {
                {
                    SubLObject result = reconstruct_rl_scfn_expression(rl_scfn_data);
                    if (NIL != result) {
                        {
                            SubLObject modifiedP = makeBoolean(!expression.equal(result));
                            if (!thesentence.equal(cycl_utilities.formula_arg1(result, UNPROVIDED))) {
                                return values(result, modifiedP);
                            }
                        }
                    }
                }
            }
        }
        return values(expression, NIL);
    }

    public static SubLObject scfn_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject thesentence = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject rl_scfn_data = deconstruct_rl_scfn_expression(expression, mt);
        if (NIL != rl_scfn_data) {
            final SubLObject result = reconstruct_rl_scfn_expression(rl_scfn_data);
            if (NIL != result) {
                final SubLObject modifiedP = makeBoolean(!expression.equal(result));
                if (!thesentence.equal(cycl_utilities.formula_arg1(result, UNPROVIDED))) {
                    return values(result, modifiedP);
                }
            }
        }
        return values(expression, NIL);
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return nil or RL-SCFN-DATA
    Calls the Reformulator in order to turn the NAUT in the NAUT slot
    into a NAUT of the desired kind (ternary #$SubcollectionFunction
    followed by #$Collection, followed by #$BinaryPredicate, followed by FORT).
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return nil or RL-SCFN-DATA\r\nCalls the Reformulator in order to turn the NAUT in the NAUT slot\r\ninto a NAUT of the desired kind (ternary #$SubcollectionFunction\r\nfollowed by #$Collection, followed by #$BinaryPredicate, followed by FORT).\r\n@unknown bertolo")
    public static final SubLObject reformulate_rl_scfn_data_alt(SubLObject rl_scfn_data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
                SubLObject new_naut = reformulator_hub.reformulate_cycl(naut, mt_relevance_macros.$mt$.getDynamicValue(thread), $list_alt47);
                if ((NIL != possibly_naut_p(new_naut)) && (NIL != formula_arityE(new_naut, THREE_INTEGER, UNPROVIDED))) {
                    {
                        SubLObject datum = new_naut;
                        SubLObject current = datum;
                        SubLObject scfn = NIL;
                        SubLObject arg_from = NIL;
                        SubLObject pred = NIL;
                        SubLObject arg_to = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt48);
                        scfn = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt48);
                        arg_from = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt48);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt48);
                        arg_to = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            _csetf_rl_scfn_data_naut(rl_scfn_data, new_naut);
                            _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, scfn);
                            _csetf_rl_scfn_data_arg_from(rl_scfn_data, arg_from);
                            _csetf_rl_scfn_data_pred(rl_scfn_data, pred);
                            _csetf_rl_scfn_data_arg_to(rl_scfn_data, arg_to);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt48);
                        }
                    }
                    return rl_scfn_data;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return nil or RL-SCFN-DATA
    Calls the Reformulator in order to turn the NAUT in the NAUT slot
    into a NAUT of the desired kind (ternary #$SubcollectionFunction
    followed by #$Collection, followed by #$BinaryPredicate, followed by FORT).
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return nil or RL-SCFN-DATA\r\nCalls the Reformulator in order to turn the NAUT in the NAUT slot\r\ninto a NAUT of the desired kind (ternary #$SubcollectionFunction\r\nfollowed by #$Collection, followed by #$BinaryPredicate, followed by FORT).\r\n@unknown bertolo")
    public static SubLObject reformulate_rl_scfn_data(final SubLObject rl_scfn_data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
        final SubLObject new_naut = reformulator_hub.reformulate_cycl(naut, mt_relevance_macros.$mt$.getDynamicValue(thread), $list53);
        if ((NIL != possibly_naut_p(new_naut)) && (NIL != formula_arityE(new_naut, THREE_INTEGER, UNPROVIDED))) {
            SubLObject current;
            final SubLObject datum = current = new_naut;
            SubLObject scfn = NIL;
            SubLObject arg_from = NIL;
            SubLObject pred = NIL;
            SubLObject arg_to = NIL;
            destructuring_bind_must_consp(current, datum, $list54);
            scfn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list54);
            arg_from = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list54);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list54);
            arg_to = current.first();
            current = current.rest();
            if (NIL == current) {
                _csetf_rl_scfn_data_naut(rl_scfn_data, new_naut);
                _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, scfn);
                _csetf_rl_scfn_data_arg_from(rl_scfn_data, arg_from);
                _csetf_rl_scfn_data_pred(rl_scfn_data, pred);
                _csetf_rl_scfn_data_arg_to(rl_scfn_data, arg_to);
            } else {
                cdestructuring_bind_error(datum, $list54);
            }
            return rl_scfn_data;
        }
        return NIL;
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return nil or el-conjunction-p
    Reassembles all the data in RL-SCFN-DATA into the desired
    conjunction of literals after testing for special cases.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return nil or el-conjunction-p\r\nReassembles all the data in RL-SCFN-DATA into the desired\r\nconjunction of literals after testing for special cases.\r\n@unknown bertolo")
    public static final SubLObject reconstruct_rl_scfn_expression_alt(SubLObject rl_scfn_data) {
        if (NIL != set_operation_scfn(rl_scfn_data)) {
            return set_reconstruct(rl_scfn_data);
        } else {
            if (NIL != prospective_collection_scfn(rl_scfn_data)) {
                return prospective_collection_reconstruct(rl_scfn_data);
            } else {
                if (NIL == rl_scfn_data_pred(rl_scfn_data)) {
                    {
                        SubLObject new_data = reformulate_rl_scfn_data(rl_scfn_data);
                        if (NIL != new_data) {
                            return reconstruct_rl_scfn_expression_int(rl_scfn_data);
                        } else {
                            return NIL;
                        }
                    }
                } else {
                    return reconstruct_rl_scfn_expression_int(rl_scfn_data);
                }
            }
        }
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return nil or el-conjunction-p
    Reassembles all the data in RL-SCFN-DATA into the desired
    conjunction of literals after testing for special cases.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return nil or el-conjunction-p\r\nReassembles all the data in RL-SCFN-DATA into the desired\r\nconjunction of literals after testing for special cases.\r\n@unknown bertolo")
    public static SubLObject reconstruct_rl_scfn_expression(final SubLObject rl_scfn_data) {
        if (NIL != set_operation_scfn(rl_scfn_data)) {
            return set_reconstruct(rl_scfn_data);
        }
        if (NIL != prospective_collection_scfn(rl_scfn_data)) {
            return prospective_collection_reconstruct(rl_scfn_data);
        }
        if (NIL != rl_scfn_data_pred(rl_scfn_data)) {
            return reconstruct_rl_scfn_expression_int(rl_scfn_data);
        }
        final SubLObject new_data = reformulate_rl_scfn_data(rl_scfn_data);
        if (NIL != new_data) {
            return reconstruct_rl_scfn_expression_int(rl_scfn_data);
        }
        return NIL;
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return el-conjunction-p
    Reassembles all the data in RL-SCFN-DATA into the desired
    conjunction of literals.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return el-conjunction-p\r\nReassembles all the data in RL-SCFN-DATA into the desired\r\nconjunction of literals.\r\n@unknown bertolo")
    public static final SubLObject reconstruct_rl_scfn_expression_int_alt(SubLObject rl_scfn_data) {
        {
            SubLObject scfn = rl_scfn_data_subcollection_fn(rl_scfn_data);
            SubLObject var_coll = find_var_coll_from_scfn(scfn, rl_scfn_data);
            SubLObject other_coll = find_other_coll_from_scfn(scfn, rl_scfn_data);
            SubLObject pred = rl_scfn_data_pred(rl_scfn_data);
            SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
            SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
            SubLObject macro = find_macro_pred_from_scfn(scfn, hier_pred);
            SubLObject sentence1 = make_binary_formula(hier_pred, var, var_coll);
            SubLObject sentence2 = replace_into_scfn_macro(macro, pred, var, other_coll);
            return make_conjunction(list(sentence1, sentence2));
        }
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return el-conjunction-p
    Reassembles all the data in RL-SCFN-DATA into the desired
    conjunction of literals.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return el-conjunction-p\r\nReassembles all the data in RL-SCFN-DATA into the desired\r\nconjunction of literals.\r\n@unknown bertolo")
    public static SubLObject reconstruct_rl_scfn_expression_int(final SubLObject rl_scfn_data) {
        final SubLObject scfn = rl_scfn_data_subcollection_fn(rl_scfn_data);
        final SubLObject var_coll = find_var_coll_from_scfn(scfn, rl_scfn_data);
        final SubLObject other_coll = find_other_coll_from_scfn(scfn, rl_scfn_data);
        final SubLObject pred = rl_scfn_data_pred(rl_scfn_data);
        final SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
        final SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
        final SubLObject macro = find_macro_pred_from_scfn(scfn, hier_pred);
        final SubLObject sentence1 = make_binary_formula(hier_pred, var, var_coll);
        final SubLObject sentence2 = replace_into_scfn_macro(macro, pred, var, other_coll);
        return make_conjunction(list(sentence1, sentence2));
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return BOOLEAN
    Test to see if special case of predicateless set based NAUTs applies.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return BOOLEAN\r\nTest to see if special case of predicateless set based NAUTs applies.\r\n@unknown bertolo")
    public static final SubLObject set_operation_scfn_alt(SubLObject rl_scfn_data) {
        return member(rl_scfn_data_subcollection_fn(rl_scfn_data), $list_alt49, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return BOOLEAN
    Test to see if special case of predicateless set based NAUTs applies.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return BOOLEAN\r\nTest to see if special case of predicateless set based NAUTs applies.\r\n@unknown bertolo")
    public static SubLObject set_operation_scfn(final SubLObject rl_scfn_data) {
        return member(rl_scfn_data_subcollection_fn(rl_scfn_data), $list55, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return EL-FORM
    Unpacks RL-SCFN-DATA assuming it represents the special case of a
    predicateless set based NAUT.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return EL-FORM\r\nUnpacks RL-SCFN-DATA assuming it represents the special case of a\r\npredicateless set based NAUT.\r\n@unknown bertolo")
    public static final SubLObject set_reconstruct_alt(SubLObject rl_scfn_data) {
        {
            SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
            SubLObject scfn = rl_scfn_data_subcollection_fn(rl_scfn_data);
            SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
            SubLObject col1 = cycl_utilities.formula_arg1(naut, UNPROVIDED);
            SubLObject col2 = cycl_utilities.formula_arg2(naut, UNPROVIDED);
            SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
            SubLObject literal1 = make_binary_formula(hier_pred, var, col1);
            SubLObject literal2 = NIL;
            SubLObject pcase_var = scfn;
            if (pcase_var.eql($$CollectionIntersection2Fn)) {
                literal2 = make_binary_formula(hier_pred, var, col2);
            } else {
                if (pcase_var.eql($$CollectionDifferenceFn)) {
                    {
                        SubLObject pcase_var_1 = hier_pred;
                        if (pcase_var_1.eql($$isa)) {
                            literal2 = make_negation(make_binary_formula($$isa, var, col2));
                        } else {
                            if (pcase_var_1.eql($$genls)) {
                                literal2 = make_binary_formula($$disjointWith, var, col2);
                            }
                        }
                    }
                }
            }
            return make_conjunction(list(literal1, literal2));
        }
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return EL-FORM
    Unpacks RL-SCFN-DATA assuming it represents the special case of a
    predicateless set based NAUT.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return EL-FORM\r\nUnpacks RL-SCFN-DATA assuming it represents the special case of a\r\npredicateless set based NAUT.\r\n@unknown bertolo")
    public static SubLObject set_reconstruct(final SubLObject rl_scfn_data) {
        final SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
        final SubLObject scfn = rl_scfn_data_subcollection_fn(rl_scfn_data);
        final SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
        final SubLObject col1 = cycl_utilities.formula_arg1(naut, UNPROVIDED);
        final SubLObject col2 = cycl_utilities.formula_arg2(naut, UNPROVIDED);
        final SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
        final SubLObject literal1 = make_binary_formula(hier_pred, var, col1);
        SubLObject literal2 = NIL;
        final SubLObject pcase_var = scfn;
        if (pcase_var.eql($$CollectionIntersection2Fn)) {
            literal2 = make_binary_formula(hier_pred, var, col2);
        } else
            if (pcase_var.eql($$CollectionDifferenceFn)) {
                final SubLObject pcase_var_$1 = hier_pred;
                if (pcase_var_$1.eql($$isa)) {
                    literal2 = make_negation(make_binary_formula($$isa, var, col2));
                } else
                    if (pcase_var_$1.eql($$genls)) {
                        literal2 = make_binary_formula($$disjointWith, var, col2);
                    }

            }

        return make_conjunction(list(literal1, literal2));
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return BOOLEAN
    Test to see if special case of #$ProspectiveCollectionFn applies.
     * @unknown pace
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return BOOLEAN\r\nTest to see if special case of #$ProspectiveCollectionFn applies.\r\n@unknown pace")
    public static final SubLObject prospective_collection_scfn_alt(SubLObject rl_scfn_data) {
        return eql(rl_scfn_data_subcollection_fn(rl_scfn_data), $$ProspectiveCollectionFn);
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return BOOLEAN
    Test to see if special case of #$ProspectiveCollectionFn applies.
     * @unknown pace
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return BOOLEAN\r\nTest to see if special case of #$ProspectiveCollectionFn applies.\r\n@unknown pace")
    public static SubLObject prospective_collection_scfn(final SubLObject rl_scfn_data) {
        return eql(rl_scfn_data_subcollection_fn(rl_scfn_data), $$ProspectiveCollectionFn);
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return EL-FORM
    Unpacks RL-SCFN-DATA assuming it represents the special case of a
    prospective collection naut.
     * @unknown pace
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return EL-FORM\r\nUnpacks RL-SCFN-DATA assuming it represents the special case of a\r\nprospective collection naut.\r\n@unknown pace")
    public static final SubLObject prospective_collection_reconstruct_alt(SubLObject rl_scfn_data) {
        {
            SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
            SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
            SubLObject col1 = cycl_utilities.formula_arg1(naut, UNPROVIDED);
            SubLObject col2 = cycl_utilities.formula_arg2(naut, UNPROVIDED);
            SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
            SubLObject literal1 = make_binary_formula(hier_pred, var, col1);
            SubLObject literal2 = NIL;
            SubLObject pcase_var = hier_pred;
            if (pcase_var.eql($$isa)) {
                literal2 = make_binary_formula($$prospectiveMembers, var, col2);
            } else {
                if (pcase_var.eql($$genls)) {
                    literal2 = make_ternary_formula($$relationAllInstance, $$prospectiveMembers, var, col2);
                }
            }
            return make_conjunction(list(literal1, literal2));
        }
    }

    /**
     *
     *
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return EL-FORM
    Unpacks RL-SCFN-DATA assuming it represents the special case of a
    prospective collection naut.
     * @unknown pace
     */
    @LispMethod(comment = "@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return EL-FORM\r\nUnpacks RL-SCFN-DATA assuming it represents the special case of a\r\nprospective collection naut.\r\n@unknown pace")
    public static SubLObject prospective_collection_reconstruct(final SubLObject rl_scfn_data) {
        final SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
        final SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
        final SubLObject col1 = cycl_utilities.formula_arg1(naut, UNPROVIDED);
        final SubLObject col2 = cycl_utilities.formula_arg2(naut, UNPROVIDED);
        final SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
        final SubLObject literal1 = make_binary_formula(hier_pred, var, col1);
        SubLObject literal2 = NIL;
        final SubLObject pcase_var = hier_pred;
        if (pcase_var.eql($$isa)) {
            literal2 = make_binary_formula($$prospectiveMembers, var, col2);
        } else
            if (pcase_var.eql($$genls)) {
                literal2 = make_ternary_formula($$relationAllInstance, $$prospectiveMembers, var, col2);
            }

        return make_conjunction(list(literal1, literal2));
    }

    /**
     *
     *
     * @param scfn;
    #$SubcollectionFunction
     * 		
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @unknown COLLECTION
    Finds the collection that SCFN subclasses in RL-SCFN-DATA.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param scfn;\n#$SubcollectionFunction\r\n\t\t\r\n@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@unknown COLLECTION\r\nFinds the collection that SCFN subclasses in RL-SCFN-DATA.\r\n@unknown bertolo")
    public static final SubLObject find_var_coll_from_scfn_alt(SubLObject scfn, SubLObject rl_scfn_data) {
        {
            SubLObject direction = (NIL != member(scfn, $list_alt44, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($TO)) : $FROM;
            if (direction.eql($TO)) {
                return rl_scfn_data_arg_from(rl_scfn_data);
            } else {
                return rl_scfn_data_arg_to(rl_scfn_data);
            }
        }
    }

    /**
     *
     *
     * @param scfn;
    #$SubcollectionFunction
     * 		
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @unknown COLLECTION
    Finds the collection that SCFN subclasses in RL-SCFN-DATA.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param scfn;\n#$SubcollectionFunction\r\n\t\t\r\n@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@unknown COLLECTION\r\nFinds the collection that SCFN subclasses in RL-SCFN-DATA.\r\n@unknown bertolo")
    public static SubLObject find_var_coll_from_scfn(final SubLObject scfn, final SubLObject rl_scfn_data) {
        final SubLObject direction = (NIL != member(scfn, $list50, UNPROVIDED, UNPROVIDED)) ? $TO : $FROM;
        if (direction.eql($TO)) {
            return rl_scfn_data_arg_from(rl_scfn_data);
        }
        return rl_scfn_data_arg_to(rl_scfn_data);
    }

    /**
     *
     *
     * @param scfn;
    #$SubcollectionFunction
     * 		
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return FORT
    Finds the FORT that SCFN does *not* subclass in RL-SCFN-DATA.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param scfn;\n#$SubcollectionFunction\r\n\t\t\r\n@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return FORT\r\nFinds the FORT that SCFN does *not* subclass in RL-SCFN-DATA.\r\n@unknown bertolo")
    public static final SubLObject find_other_coll_from_scfn_alt(SubLObject scfn, SubLObject rl_scfn_data) {
        {
            SubLObject direction = (NIL != member(scfn, $list_alt44, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($TO)) : $FROM;
            if (direction.eql($TO)) {
                return rl_scfn_data_arg_to(rl_scfn_data);
            } else {
                return rl_scfn_data_arg_from(rl_scfn_data);
            }
        }
    }

    /**
     *
     *
     * @param scfn;
    #$SubcollectionFunction
     * 		
     * @param rl-scfn-data;
    RL-SCFN-DATA
     * 		
     * @return FORT
    Finds the FORT that SCFN does *not* subclass in RL-SCFN-DATA.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param scfn;\n#$SubcollectionFunction\r\n\t\t\r\n@param rl-scfn-data;\nRL-SCFN-DATA\r\n\t\t\r\n@return FORT\r\nFinds the FORT that SCFN does *not* subclass in RL-SCFN-DATA.\r\n@unknown bertolo")
    public static SubLObject find_other_coll_from_scfn(final SubLObject scfn, final SubLObject rl_scfn_data) {
        final SubLObject direction = (NIL != member(scfn, $list50, UNPROVIDED, UNPROVIDED)) ? $TO : $FROM;
        if (direction.eql($TO)) {
            return rl_scfn_data_arg_to(rl_scfn_data);
        }
        return rl_scfn_data_arg_from(rl_scfn_data);
    }

    /**
     *
     *
     * @param scfn;
    #$SubcollectionFunction
     * 		
     * @param hier-pred;
    #$isa/#$genls
     * 		
     * @return LIST
    Returns a subcollection macro appropriate for the input from the variable
    subcollection-macros*.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param scfn;\n#$SubcollectionFunction\r\n\t\t\r\n@param hier-pred;\n#$isa/#$genls\r\n\t\t\r\n@return LIST\r\nReturns a subcollection macro appropriate for the input from the variable\r\nsubcollection-macros*.\r\n@unknown bertolo")
    public static final SubLObject find_macro_pred_from_scfn_alt(SubLObject scfn, SubLObject hier_pred) {
        return second(assoc(scfn, second(assoc(hier_pred, $subcollection_macros$.getGlobalValue(), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @param scfn;
    #$SubcollectionFunction
     * 		
     * @param hier-pred;
    #$isa/#$genls
     * 		
     * @return LIST
    Returns a subcollection macro appropriate for the input from the variable
    subcollection-macros*.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param scfn;\n#$SubcollectionFunction\r\n\t\t\r\n@param hier-pred;\n#$isa/#$genls\r\n\t\t\r\n@return LIST\r\nReturns a subcollection macro appropriate for the input from the variable\r\nsubcollection-macros*.\r\n@unknown bertolo")
    public static SubLObject find_macro_pred_from_scfn(final SubLObject scfn, final SubLObject hier_pred) {
        return second(assoc(scfn, second(assoc(hier_pred, $subcollection_macros$.getGlobalValue(), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @param macro;
    LIST
     * 		
     * @param pred;
    PREDICATE
     * 		
     * @param term;
    TERM
     * 		
     * @param coll;
    COLLECTION
     * 		
     * @return EL-FORMULA
    Substitutes appropriate arguments into macro list.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param macro;\nLIST\r\n\t\t\r\n@param pred;\nPREDICATE\r\n\t\t\r\n@param term;\nTERM\r\n\t\t\r\n@param coll;\nCOLLECTION\r\n\t\t\r\n@return EL-FORMULA\r\nSubstitutes appropriate arguments into macro list.\r\n@unknown bertolo")
    public static final SubLObject replace_into_scfn_macro_alt(SubLObject macro, SubLObject pred, SubLObject v_term, SubLObject coll) {
        return substitute(pred, $PRED, substitute(v_term, $TERM, substitute(coll, $ARG, macro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param macro;
    LIST
     * 		
     * @param pred;
    PREDICATE
     * 		
     * @param term;
    TERM
     * 		
     * @param coll;
    COLLECTION
     * 		
     * @return EL-FORMULA
    Substitutes appropriate arguments into macro list.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param macro;\nLIST\r\n\t\t\r\n@param pred;\nPREDICATE\r\n\t\t\r\n@param term;\nTERM\r\n\t\t\r\n@param coll;\nCOLLECTION\r\n\t\t\r\n@return EL-FORMULA\r\nSubstitutes appropriate arguments into macro list.\r\n@unknown bertolo")
    public static SubLObject replace_into_scfn_macro(final SubLObject macro, final SubLObject pred, final SubLObject v_term, final SubLObject coll) {
        return substitute(pred, $PRED, substitute(v_term, $TERM, substitute(coll, $ARG, macro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject declare_reformulator_module_subcollection_processor_file_alt() {
        declareFunction("scfn_cost_estimate", "SCFN-COST-ESTIMATE", 3, 0, false);
        declareFunction("rl_scfn_data_print_function_trampoline", "RL-SCFN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rl_scfn_data_p", "RL-SCFN-DATA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.reformulator_module_subcollection_processor.$rl_scfn_data_p$UnaryFunction();
        declareFunction("rl_scfn_data_hierarchy_pred", "RL-SCFN-DATA-HIERARCHY-PRED", 1, 0, false);
        declareFunction("rl_scfn_data_var_name", "RL-SCFN-DATA-VAR-NAME", 1, 0, false);
        declareFunction("rl_scfn_data_naut", "RL-SCFN-DATA-NAUT", 1, 0, false);
        declareFunction("rl_scfn_data_subcollection_fn", "RL-SCFN-DATA-SUBCOLLECTION-FN", 1, 0, false);
        declareFunction("rl_scfn_data_arg_from", "RL-SCFN-DATA-ARG-FROM", 1, 0, false);
        declareFunction("rl_scfn_data_pred", "RL-SCFN-DATA-PRED", 1, 0, false);
        declareFunction("rl_scfn_data_arg_to", "RL-SCFN-DATA-ARG-TO", 1, 0, false);
        declareFunction("_csetf_rl_scfn_data_hierarchy_pred", "_CSETF-RL-SCFN-DATA-HIERARCHY-PRED", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_var_name", "_CSETF-RL-SCFN-DATA-VAR-NAME", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_naut", "_CSETF-RL-SCFN-DATA-NAUT", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_subcollection_fn", "_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_arg_from", "_CSETF-RL-SCFN-DATA-ARG-FROM", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_pred", "_CSETF-RL-SCFN-DATA-PRED", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_arg_to", "_CSETF-RL-SCFN-DATA-ARG-TO", 2, 0, false);
        declareFunction("make_rl_scfn_data", "MAKE-RL-SCFN-DATA", 0, 1, false);
        declareFunction("print_rl_scfn_data", "PRINT-RL-SCFN-DATA", 3, 0, false);
        declareFunction("new_rl_scfn_data", "NEW-RL-SCFN-DATA", 7, 0, false);
        declareFunction("scfn_expression_required", "SCFN-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction("deconstruct_rl_scfn_expression", "DECONSTRUCT-RL-SCFN-EXPRESSION", 2, 0, false);
        declareFunction("scfn_expression_reformulate", "SCFN-EXPRESSION-REFORMULATE", 4, 0, false);
        declareFunction("reformulate_rl_scfn_data", "REFORMULATE-RL-SCFN-DATA", 1, 0, false);
        declareFunction("reconstruct_rl_scfn_expression", "RECONSTRUCT-RL-SCFN-EXPRESSION", 1, 0, false);
        declareFunction("reconstruct_rl_scfn_expression_int", "RECONSTRUCT-RL-SCFN-EXPRESSION-INT", 1, 0, false);
        declareFunction("set_operation_scfn", "SET-OPERATION-SCFN", 1, 0, false);
        declareFunction("set_reconstruct", "SET-RECONSTRUCT", 1, 0, false);
        declareFunction("prospective_collection_scfn", "PROSPECTIVE-COLLECTION-SCFN", 1, 0, false);
        declareFunction("prospective_collection_reconstruct", "PROSPECTIVE-COLLECTION-RECONSTRUCT", 1, 0, false);
        declareFunction("find_var_coll_from_scfn", "FIND-VAR-COLL-FROM-SCFN", 2, 0, false);
        declareFunction("find_other_coll_from_scfn", "FIND-OTHER-COLL-FROM-SCFN", 2, 0, false);
        declareFunction("find_macro_pred_from_scfn", "FIND-MACRO-PRED-FROM-SCFN", 2, 0, false);
        declareFunction("replace_into_scfn_macro", "REPLACE-INTO-SCFN-MACRO", 4, 0, false);
        declareFunction("get_isa_subcol_mt", "GET-ISA-SUBCOL-MT", 1, 0, false);
        declareFunction("set_isa_subcol_mt", "SET-ISA-SUBCOL-MT", 2, 0, false);
        declareFunction("get_isa_subcol_out_cycl", "GET-ISA-SUBCOL-OUT-CYCL", 1, 0, false);
        declareFunction("set_isa_subcol_out_cycl", "SET-ISA-SUBCOL-OUT-CYCL", 2, 0, false);
        declareFunction("get_isa_subcol_in_cycl", "GET-ISA-SUBCOL-IN-CYCL", 1, 0, false);
        declareFunction("set_isa_subcol_in_cycl", "SET-ISA-SUBCOL-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_isa_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-ISA-SUBCOL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_isa_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-ISA-SUBCOL-INSTANCE", 1, 0, false);
        declareFunction("isa_subcol_p", "ISA-SUBCOL-P", 1, 0, false);
        declareFunction("get_genls_subcol_mt", "GET-GENLS-SUBCOL-MT", 1, 0, false);
        declareFunction("set_genls_subcol_mt", "SET-GENLS-SUBCOL-MT", 2, 0, false);
        declareFunction("get_genls_subcol_out_cycl", "GET-GENLS-SUBCOL-OUT-CYCL", 1, 0, false);
        declareFunction("set_genls_subcol_out_cycl", "SET-GENLS-SUBCOL-OUT-CYCL", 2, 0, false);
        declareFunction("get_genls_subcol_in_cycl", "GET-GENLS-SUBCOL-IN-CYCL", 1, 0, false);
        declareFunction("set_genls_subcol_in_cycl", "SET-GENLS-SUBCOL-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_genls_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_genls_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-INSTANCE", 1, 0, false);
        declareFunction("genls_subcol_p", "GENLS-SUBCOL-P", 1, 0, false);
        declareFunction("get_genls_subcol_type_mt", "GET-GENLS-SUBCOL-TYPE-MT", 1, 0, false);
        declareFunction("set_genls_subcol_type_mt", "SET-GENLS-SUBCOL-TYPE-MT", 2, 0, false);
        declareFunction("get_genls_subcol_type_out_cycl", "GET-GENLS-SUBCOL-TYPE-OUT-CYCL", 1, 0, false);
        declareFunction("set_genls_subcol_type_out_cycl", "SET-GENLS-SUBCOL-TYPE-OUT-CYCL", 2, 0, false);
        declareFunction("get_genls_subcol_type_in_cycl", "GET-GENLS-SUBCOL-TYPE-IN-CYCL", 1, 0, false);
        declareFunction("set_genls_subcol_type_in_cycl", "SET-GENLS-SUBCOL-TYPE-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_genls_subcol_type_class", "SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-TYPE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_genls_subcol_type_instance", "SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-TYPE-INSTANCE", 1, 0, false);
        declareFunction("genls_subcol_type_p", "GENLS-SUBCOL-TYPE-P", 1, 0, false);
        declareFunction("get_genls_intersect_subcol_mt", "GET-GENLS-INTERSECT-SUBCOL-MT", 1, 0, false);
        declareFunction("set_genls_intersect_subcol_mt", "SET-GENLS-INTERSECT-SUBCOL-MT", 2, 0, false);
        declareFunction("get_genls_intersect_subcol_out_cycl", "GET-GENLS-INTERSECT-SUBCOL-OUT-CYCL", 1, 0, false);
        declareFunction("set_genls_intersect_subcol_out_cycl", "SET-GENLS-INTERSECT-SUBCOL-OUT-CYCL", 2, 0, false);
        declareFunction("get_genls_intersect_subcol_in_cycl", "GET-GENLS-INTERSECT-SUBCOL-IN-CYCL", 1, 0, false);
        declareFunction("set_genls_intersect_subcol_in_cycl", "SET-GENLS-INTERSECT-SUBCOL-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_genls_intersect_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-GENLS-INTERSECT-SUBCOL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_genls_intersect_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-GENLS-INTERSECT-SUBCOL-INSTANCE", 1, 0, false);
        declareFunction("genls_intersect_subcol_p", "GENLS-INTERSECT-SUBCOL-P", 1, 0, false);
        declareFunction("get_isa_difference_subcol_mt", "GET-ISA-DIFFERENCE-SUBCOL-MT", 1, 0, false);
        declareFunction("set_isa_difference_subcol_mt", "SET-ISA-DIFFERENCE-SUBCOL-MT", 2, 0, false);
        declareFunction("get_isa_difference_subcol_out_cycl", "GET-ISA-DIFFERENCE-SUBCOL-OUT-CYCL", 1, 0, false);
        declareFunction("set_isa_difference_subcol_out_cycl", "SET-ISA-DIFFERENCE-SUBCOL-OUT-CYCL", 2, 0, false);
        declareFunction("get_isa_difference_subcol_in_cycl", "GET-ISA-DIFFERENCE-SUBCOL-IN-CYCL", 1, 0, false);
        declareFunction("set_isa_difference_subcol_in_cycl", "SET-ISA-DIFFERENCE-SUBCOL-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_isa_difference_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-ISA-DIFFERENCE-SUBCOL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_isa_difference_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-ISA-DIFFERENCE-SUBCOL-INSTANCE", 1, 0, false);
        declareFunction("isa_difference_subcol_p", "ISA-DIFFERENCE-SUBCOL-P", 1, 0, false);
        declareFunction("get_isa_perfbytype_subcol_mt", "GET-ISA-PERFBYTYPE-SUBCOL-MT", 1, 0, false);
        declareFunction("set_isa_perfbytype_subcol_mt", "SET-ISA-PERFBYTYPE-SUBCOL-MT", 2, 0, false);
        declareFunction("get_isa_perfbytype_subcol_out_cycl", "GET-ISA-PERFBYTYPE-SUBCOL-OUT-CYCL", 1, 0, false);
        declareFunction("set_isa_perfbytype_subcol_out_cycl", "SET-ISA-PERFBYTYPE-SUBCOL-OUT-CYCL", 2, 0, false);
        declareFunction("get_isa_perfbytype_subcol_in_cycl", "GET-ISA-PERFBYTYPE-SUBCOL-IN-CYCL", 1, 0, false);
        declareFunction("set_isa_perfbytype_subcol_in_cycl", "SET-ISA-PERFBYTYPE-SUBCOL-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_isa_perfbytype_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-ISA-PERFBYTYPE-SUBCOL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_isa_perfbytype_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-ISA-PERFBYTYPE-SUBCOL-INSTANCE", 1, 0, false);
        declareFunction("isa_perfbytype_subcol_p", "ISA-PERFBYTYPE-SUBCOL-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_reformulator_module_subcollection_processor_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("scfn_cost_estimate", "SCFN-COST-ESTIMATE", 3, 0, false);
            declareFunction("rl_scfn_data_print_function_trampoline", "RL-SCFN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("rl_scfn_data_p", "RL-SCFN-DATA-P", 1, 0, false);
            new reformulator_module_subcollection_processor.$rl_scfn_data_p$UnaryFunction();
            declareFunction("rl_scfn_data_hierarchy_pred", "RL-SCFN-DATA-HIERARCHY-PRED", 1, 0, false);
            declareFunction("rl_scfn_data_var_name", "RL-SCFN-DATA-VAR-NAME", 1, 0, false);
            declareFunction("rl_scfn_data_naut", "RL-SCFN-DATA-NAUT", 1, 0, false);
            declareFunction("rl_scfn_data_subcollection_fn", "RL-SCFN-DATA-SUBCOLLECTION-FN", 1, 0, false);
            declareFunction("rl_scfn_data_arg_from", "RL-SCFN-DATA-ARG-FROM", 1, 0, false);
            declareFunction("rl_scfn_data_pred", "RL-SCFN-DATA-PRED", 1, 0, false);
            declareFunction("rl_scfn_data_arg_to", "RL-SCFN-DATA-ARG-TO", 1, 0, false);
            declareFunction("_csetf_rl_scfn_data_hierarchy_pred", "_CSETF-RL-SCFN-DATA-HIERARCHY-PRED", 2, 0, false);
            declareFunction("_csetf_rl_scfn_data_var_name", "_CSETF-RL-SCFN-DATA-VAR-NAME", 2, 0, false);
            declareFunction("_csetf_rl_scfn_data_naut", "_CSETF-RL-SCFN-DATA-NAUT", 2, 0, false);
            declareFunction("_csetf_rl_scfn_data_subcollection_fn", "_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN", 2, 0, false);
            declareFunction("_csetf_rl_scfn_data_arg_from", "_CSETF-RL-SCFN-DATA-ARG-FROM", 2, 0, false);
            declareFunction("_csetf_rl_scfn_data_pred", "_CSETF-RL-SCFN-DATA-PRED", 2, 0, false);
            declareFunction("_csetf_rl_scfn_data_arg_to", "_CSETF-RL-SCFN-DATA-ARG-TO", 2, 0, false);
            declareFunction("make_rl_scfn_data", "MAKE-RL-SCFN-DATA", 0, 1, false);
            declareFunction("visit_defstruct_rl_scfn_data", "VISIT-DEFSTRUCT-RL-SCFN-DATA", 2, 0, false);
            declareFunction("visit_defstruct_object_rl_scfn_data_method", "VISIT-DEFSTRUCT-OBJECT-RL-SCFN-DATA-METHOD", 2, 0, false);
            declareFunction("print_rl_scfn_data", "PRINT-RL-SCFN-DATA", 3, 0, false);
            declareFunction("new_rl_scfn_data", "NEW-RL-SCFN-DATA", 7, 0, false);
            declareFunction("scfn_expression_required", "SCFN-EXPRESSION-REQUIRED", 3, 0, false);
            declareFunction("deconstruct_rl_scfn_expression", "DECONSTRUCT-RL-SCFN-EXPRESSION", 2, 0, false);
            declareFunction("scfn_expression_reformulate", "SCFN-EXPRESSION-REFORMULATE", 4, 0, false);
            declareFunction("reformulate_rl_scfn_data", "REFORMULATE-RL-SCFN-DATA", 1, 0, false);
            declareFunction("reconstruct_rl_scfn_expression", "RECONSTRUCT-RL-SCFN-EXPRESSION", 1, 0, false);
            declareFunction("reconstruct_rl_scfn_expression_int", "RECONSTRUCT-RL-SCFN-EXPRESSION-INT", 1, 0, false);
            declareFunction("set_operation_scfn", "SET-OPERATION-SCFN", 1, 0, false);
            declareFunction("set_reconstruct", "SET-RECONSTRUCT", 1, 0, false);
            declareFunction("prospective_collection_scfn", "PROSPECTIVE-COLLECTION-SCFN", 1, 0, false);
            declareFunction("prospective_collection_reconstruct", "PROSPECTIVE-COLLECTION-RECONSTRUCT", 1, 0, false);
            declareFunction("find_var_coll_from_scfn", "FIND-VAR-COLL-FROM-SCFN", 2, 0, false);
            declareFunction("find_other_coll_from_scfn", "FIND-OTHER-COLL-FROM-SCFN", 2, 0, false);
            declareFunction("find_macro_pred_from_scfn", "FIND-MACRO-PRED-FROM-SCFN", 2, 0, false);
            declareFunction("replace_into_scfn_macro", "REPLACE-INTO-SCFN-MACRO", 4, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_isa_subcol_mt", "GET-ISA-SUBCOL-MT", 1, 0, false);
            declareFunction("set_isa_subcol_mt", "SET-ISA-SUBCOL-MT", 2, 0, false);
            declareFunction("get_isa_subcol_out_cycl", "GET-ISA-SUBCOL-OUT-CYCL", 1, 0, false);
            declareFunction("set_isa_subcol_out_cycl", "SET-ISA-SUBCOL-OUT-CYCL", 2, 0, false);
            declareFunction("get_isa_subcol_in_cycl", "GET-ISA-SUBCOL-IN-CYCL", 1, 0, false);
            declareFunction("set_isa_subcol_in_cycl", "SET-ISA-SUBCOL-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_isa_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-ISA-SUBCOL-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_isa_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-ISA-SUBCOL-INSTANCE", 1, 0, false);
            declareFunction("isa_subcol_p", "ISA-SUBCOL-P", 1, 0, false);
            declareFunction("get_genls_subcol_mt", "GET-GENLS-SUBCOL-MT", 1, 0, false);
            declareFunction("set_genls_subcol_mt", "SET-GENLS-SUBCOL-MT", 2, 0, false);
            declareFunction("get_genls_subcol_out_cycl", "GET-GENLS-SUBCOL-OUT-CYCL", 1, 0, false);
            declareFunction("set_genls_subcol_out_cycl", "SET-GENLS-SUBCOL-OUT-CYCL", 2, 0, false);
            declareFunction("get_genls_subcol_in_cycl", "GET-GENLS-SUBCOL-IN-CYCL", 1, 0, false);
            declareFunction("set_genls_subcol_in_cycl", "SET-GENLS-SUBCOL-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_genls_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_genls_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-INSTANCE", 1, 0, false);
            declareFunction("genls_subcol_p", "GENLS-SUBCOL-P", 1, 0, false);
            declareFunction("get_genls_subcol_type_mt", "GET-GENLS-SUBCOL-TYPE-MT", 1, 0, false);
            declareFunction("set_genls_subcol_type_mt", "SET-GENLS-SUBCOL-TYPE-MT", 2, 0, false);
            declareFunction("get_genls_subcol_type_out_cycl", "GET-GENLS-SUBCOL-TYPE-OUT-CYCL", 1, 0, false);
            declareFunction("set_genls_subcol_type_out_cycl", "SET-GENLS-SUBCOL-TYPE-OUT-CYCL", 2, 0, false);
            declareFunction("get_genls_subcol_type_in_cycl", "GET-GENLS-SUBCOL-TYPE-IN-CYCL", 1, 0, false);
            declareFunction("set_genls_subcol_type_in_cycl", "SET-GENLS-SUBCOL-TYPE-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_genls_subcol_type_class", "SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-TYPE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_genls_subcol_type_instance", "SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-TYPE-INSTANCE", 1, 0, false);
            declareFunction("genls_subcol_type_p", "GENLS-SUBCOL-TYPE-P", 1, 0, false);
            declareFunction("get_genls_intersect_subcol_mt", "GET-GENLS-INTERSECT-SUBCOL-MT", 1, 0, false);
            declareFunction("set_genls_intersect_subcol_mt", "SET-GENLS-INTERSECT-SUBCOL-MT", 2, 0, false);
            declareFunction("get_genls_intersect_subcol_out_cycl", "GET-GENLS-INTERSECT-SUBCOL-OUT-CYCL", 1, 0, false);
            declareFunction("set_genls_intersect_subcol_out_cycl", "SET-GENLS-INTERSECT-SUBCOL-OUT-CYCL", 2, 0, false);
            declareFunction("get_genls_intersect_subcol_in_cycl", "GET-GENLS-INTERSECT-SUBCOL-IN-CYCL", 1, 0, false);
            declareFunction("set_genls_intersect_subcol_in_cycl", "SET-GENLS-INTERSECT-SUBCOL-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_genls_intersect_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-GENLS-INTERSECT-SUBCOL-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_genls_intersect_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-GENLS-INTERSECT-SUBCOL-INSTANCE", 1, 0, false);
            declareFunction("genls_intersect_subcol_p", "GENLS-INTERSECT-SUBCOL-P", 1, 0, false);
            declareFunction("get_isa_difference_subcol_mt", "GET-ISA-DIFFERENCE-SUBCOL-MT", 1, 0, false);
            declareFunction("set_isa_difference_subcol_mt", "SET-ISA-DIFFERENCE-SUBCOL-MT", 2, 0, false);
            declareFunction("get_isa_difference_subcol_out_cycl", "GET-ISA-DIFFERENCE-SUBCOL-OUT-CYCL", 1, 0, false);
            declareFunction("set_isa_difference_subcol_out_cycl", "SET-ISA-DIFFERENCE-SUBCOL-OUT-CYCL", 2, 0, false);
            declareFunction("get_isa_difference_subcol_in_cycl", "GET-ISA-DIFFERENCE-SUBCOL-IN-CYCL", 1, 0, false);
            declareFunction("set_isa_difference_subcol_in_cycl", "SET-ISA-DIFFERENCE-SUBCOL-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_isa_difference_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-ISA-DIFFERENCE-SUBCOL-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_isa_difference_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-ISA-DIFFERENCE-SUBCOL-INSTANCE", 1, 0, false);
            declareFunction("isa_difference_subcol_p", "ISA-DIFFERENCE-SUBCOL-P", 1, 0, false);
            declareFunction("get_isa_perfbytype_subcol_mt", "GET-ISA-PERFBYTYPE-SUBCOL-MT", 1, 0, false);
            declareFunction("set_isa_perfbytype_subcol_mt", "SET-ISA-PERFBYTYPE-SUBCOL-MT", 2, 0, false);
            declareFunction("get_isa_perfbytype_subcol_out_cycl", "GET-ISA-PERFBYTYPE-SUBCOL-OUT-CYCL", 1, 0, false);
            declareFunction("set_isa_perfbytype_subcol_out_cycl", "SET-ISA-PERFBYTYPE-SUBCOL-OUT-CYCL", 2, 0, false);
            declareFunction("get_isa_perfbytype_subcol_in_cycl", "GET-ISA-PERFBYTYPE-SUBCOL-IN-CYCL", 1, 0, false);
            declareFunction("set_isa_perfbytype_subcol_in_cycl", "SET-ISA-PERFBYTYPE-SUBCOL-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_isa_perfbytype_subcol_class", "SUBLOOP-RESERVED-INITIALIZE-ISA-PERFBYTYPE-SUBCOL-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_isa_perfbytype_subcol_instance", "SUBLOOP-RESERVED-INITIALIZE-ISA-PERFBYTYPE-SUBCOL-INSTANCE", 1, 0, false);
            declareFunction("isa_perfbytype_subcol_p", "ISA-PERFBYTYPE-SUBCOL-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_reformulator_module_subcollection_processor_file_Previous() {
        declareFunction("scfn_cost_estimate", "SCFN-COST-ESTIMATE", 3, 0, false);
        declareFunction("rl_scfn_data_print_function_trampoline", "RL-SCFN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rl_scfn_data_p", "RL-SCFN-DATA-P", 1, 0, false);
        new reformulator_module_subcollection_processor.$rl_scfn_data_p$UnaryFunction();
        declareFunction("rl_scfn_data_hierarchy_pred", "RL-SCFN-DATA-HIERARCHY-PRED", 1, 0, false);
        declareFunction("rl_scfn_data_var_name", "RL-SCFN-DATA-VAR-NAME", 1, 0, false);
        declareFunction("rl_scfn_data_naut", "RL-SCFN-DATA-NAUT", 1, 0, false);
        declareFunction("rl_scfn_data_subcollection_fn", "RL-SCFN-DATA-SUBCOLLECTION-FN", 1, 0, false);
        declareFunction("rl_scfn_data_arg_from", "RL-SCFN-DATA-ARG-FROM", 1, 0, false);
        declareFunction("rl_scfn_data_pred", "RL-SCFN-DATA-PRED", 1, 0, false);
        declareFunction("rl_scfn_data_arg_to", "RL-SCFN-DATA-ARG-TO", 1, 0, false);
        declareFunction("_csetf_rl_scfn_data_hierarchy_pred", "_CSETF-RL-SCFN-DATA-HIERARCHY-PRED", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_var_name", "_CSETF-RL-SCFN-DATA-VAR-NAME", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_naut", "_CSETF-RL-SCFN-DATA-NAUT", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_subcollection_fn", "_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_arg_from", "_CSETF-RL-SCFN-DATA-ARG-FROM", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_pred", "_CSETF-RL-SCFN-DATA-PRED", 2, 0, false);
        declareFunction("_csetf_rl_scfn_data_arg_to", "_CSETF-RL-SCFN-DATA-ARG-TO", 2, 0, false);
        declareFunction("make_rl_scfn_data", "MAKE-RL-SCFN-DATA", 0, 1, false);
        declareFunction("visit_defstruct_rl_scfn_data", "VISIT-DEFSTRUCT-RL-SCFN-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_rl_scfn_data_method", "VISIT-DEFSTRUCT-OBJECT-RL-SCFN-DATA-METHOD", 2, 0, false);
        declareFunction("print_rl_scfn_data", "PRINT-RL-SCFN-DATA", 3, 0, false);
        declareFunction("new_rl_scfn_data", "NEW-RL-SCFN-DATA", 7, 0, false);
        declareFunction("scfn_expression_required", "SCFN-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction("deconstruct_rl_scfn_expression", "DECONSTRUCT-RL-SCFN-EXPRESSION", 2, 0, false);
        declareFunction("scfn_expression_reformulate", "SCFN-EXPRESSION-REFORMULATE", 4, 0, false);
        declareFunction("reformulate_rl_scfn_data", "REFORMULATE-RL-SCFN-DATA", 1, 0, false);
        declareFunction("reconstruct_rl_scfn_expression", "RECONSTRUCT-RL-SCFN-EXPRESSION", 1, 0, false);
        declareFunction("reconstruct_rl_scfn_expression_int", "RECONSTRUCT-RL-SCFN-EXPRESSION-INT", 1, 0, false);
        declareFunction("set_operation_scfn", "SET-OPERATION-SCFN", 1, 0, false);
        declareFunction("set_reconstruct", "SET-RECONSTRUCT", 1, 0, false);
        declareFunction("prospective_collection_scfn", "PROSPECTIVE-COLLECTION-SCFN", 1, 0, false);
        declareFunction("prospective_collection_reconstruct", "PROSPECTIVE-COLLECTION-RECONSTRUCT", 1, 0, false);
        declareFunction("find_var_coll_from_scfn", "FIND-VAR-COLL-FROM-SCFN", 2, 0, false);
        declareFunction("find_other_coll_from_scfn", "FIND-OTHER-COLL-FROM-SCFN", 2, 0, false);
        declareFunction("find_macro_pred_from_scfn", "FIND-MACRO-PRED-FROM-SCFN", 2, 0, false);
        declareFunction("replace_into_scfn_macro", "REPLACE-INTO-SCFN-MACRO", 4, 0, false);
        return NIL;
    }

    public static final SubLObject init_reformulator_module_subcollection_processor_file_alt() {
        deflexical("*SCFN-MICROSECONDS*", $int$2300);
        defconstant("*DTP-RL-SCFN-DATA*", RL_SCFN_DATA);
        deflexical("*SUBCOLLECTION-MACROS*", $list_alt46);
        return NIL;
    }

    public static SubLObject init_reformulator_module_subcollection_processor_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SCFN-MICROSECONDS*", $int$2300);
            defconstant("*DTP-RL-SCFN-DATA*", RL_SCFN_DATA);
            deflexical("*SUBCOLLECTION-MACROS*", $list52);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SUBCOLLECTION-MACROS*", $list_alt46);
        }
        return NIL;
    }

    public static SubLObject init_reformulator_module_subcollection_processor_file_Previous() {
        deflexical("*SCFN-MICROSECONDS*", $int$2300);
        defconstant("*DTP-RL-SCFN-DATA*", RL_SCFN_DATA);
        deflexical("*SUBCOLLECTION-MACROS*", $list52);
        return NIL;
    }

    public static final SubLObject setup_reformulator_module_subcollection_processor_file_alt() {
        reformulator_module_harness.declare_rl_module($$SubcollectionProcessorRLModule, $list_alt1);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rl_scfn_data$.getGlobalValue(), symbol_function(RL_SCFN_DATA_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(RL_SCFN_DATA_HIERARCHY_PRED, _CSETF_RL_SCFN_DATA_HIERARCHY_PRED);
        def_csetf(RL_SCFN_DATA_VAR_NAME, _CSETF_RL_SCFN_DATA_VAR_NAME);
        def_csetf(RL_SCFN_DATA_NAUT, _CSETF_RL_SCFN_DATA_NAUT);
        def_csetf(RL_SCFN_DATA_SUBCOLLECTION_FN, _CSETF_RL_SCFN_DATA_SUBCOLLECTION_FN);
        def_csetf(RL_SCFN_DATA_ARG_FROM, _CSETF_RL_SCFN_DATA_ARG_FROM);
        def_csetf(RL_SCFN_DATA_PRED, _CSETF_RL_SCFN_DATA_PRED);
        def_csetf(RL_SCFN_DATA_ARG_TO, _CSETF_RL_SCFN_DATA_ARG_TO);
        identity(RL_SCFN_DATA);
        sunit_external.define_test_category($str_alt62$Reformulator_Subcollection_Proces, UNPROVIDED);
        sunit_external.define_test_suite($str_alt63$subcoll_proc_test_suite, list($str_alt62$Reformulator_Subcollection_Proces), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(ISA_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(ISA_SUBCOL);
        classes.subloop_new_class(ISA_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
        classes.class_set_implements_slot_listeners(ISA_SUBCOL, NIL);
        classes.subloop_note_class_initialization_function(ISA_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_SUBCOL_CLASS);
        classes.subloop_note_instance_initialization_function(ISA_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_SUBCOL_INSTANCE);
        subloop_reserved_initialize_isa_subcol_class(ISA_SUBCOL);
        sunit_macros.define_test_case_postamble(ISA_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
        sunit_macros.def_test_method_register(ISA_SUBCOL, SUBCOL_TEST_REFORMULATION);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GENLS_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(GENLS_SUBCOL);
        classes.subloop_new_class(GENLS_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
        classes.class_set_implements_slot_listeners(GENLS_SUBCOL, NIL);
        classes.subloop_note_class_initialization_function(GENLS_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_CLASS);
        classes.subloop_note_instance_initialization_function(GENLS_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_INSTANCE);
        subloop_reserved_initialize_genls_subcol_class(GENLS_SUBCOL);
        sunit_macros.define_test_case_postamble(GENLS_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
        sunit_macros.def_test_method_register(GENLS_SUBCOL, SUBCOL_TEST_REFORMULATION);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GENLS_SUBCOL_TYPE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(GENLS_SUBCOL_TYPE);
        classes.subloop_new_class(GENLS_SUBCOL_TYPE, TEST_CASE, NIL, NIL, $list_alt66);
        classes.class_set_implements_slot_listeners(GENLS_SUBCOL_TYPE, NIL);
        classes.subloop_note_class_initialization_function(GENLS_SUBCOL_TYPE, SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_TYPE_CLASS);
        classes.subloop_note_instance_initialization_function(GENLS_SUBCOL_TYPE, SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_TYPE_INSTANCE);
        subloop_reserved_initialize_genls_subcol_type_class(GENLS_SUBCOL_TYPE);
        sunit_macros.define_test_case_postamble(GENLS_SUBCOL_TYPE, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
        sunit_macros.def_test_method_register(GENLS_SUBCOL_TYPE, SUBCOL_TEST_REFORMULATION);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GENLS_INTERSECT_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(GENLS_INTERSECT_SUBCOL);
        classes.subloop_new_class(GENLS_INTERSECT_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
        classes.class_set_implements_slot_listeners(GENLS_INTERSECT_SUBCOL, NIL);
        classes.subloop_note_class_initialization_function(GENLS_INTERSECT_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_GENLS_INTERSECT_SUBCOL_CLASS);
        classes.subloop_note_instance_initialization_function(GENLS_INTERSECT_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_GENLS_INTERSECT_SUBCOL_INSTANCE);
        subloop_reserved_initialize_genls_intersect_subcol_class(GENLS_INTERSECT_SUBCOL);
        sunit_macros.define_test_case_postamble(GENLS_INTERSECT_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
        sunit_macros.def_test_method_register(GENLS_INTERSECT_SUBCOL, SUBCOL_TEST_REFORMULATION);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(ISA_DIFFERENCE_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(ISA_DIFFERENCE_SUBCOL);
        classes.subloop_new_class(ISA_DIFFERENCE_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
        classes.class_set_implements_slot_listeners(ISA_DIFFERENCE_SUBCOL, NIL);
        classes.subloop_note_class_initialization_function(ISA_DIFFERENCE_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_DIFFERENCE_SUBCOL_CLASS);
        classes.subloop_note_instance_initialization_function(ISA_DIFFERENCE_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_DIFFERENCE_SUBCOL_INSTANCE);
        subloop_reserved_initialize_isa_difference_subcol_class(ISA_DIFFERENCE_SUBCOL);
        sunit_macros.define_test_case_postamble(ISA_DIFFERENCE_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
        sunit_macros.def_test_method_register(ISA_DIFFERENCE_SUBCOL, SUBCOL_TEST_REFORMULATION);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(ISA_PERFBYTYPE_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(ISA_PERFBYTYPE_SUBCOL);
        classes.subloop_new_class(ISA_PERFBYTYPE_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
        classes.class_set_implements_slot_listeners(ISA_PERFBYTYPE_SUBCOL, NIL);
        classes.subloop_note_class_initialization_function(ISA_PERFBYTYPE_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_PERFBYTYPE_SUBCOL_CLASS);
        classes.subloop_note_instance_initialization_function(ISA_PERFBYTYPE_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_PERFBYTYPE_SUBCOL_INSTANCE);
        subloop_reserved_initialize_isa_perfbytype_subcol_class(ISA_PERFBYTYPE_SUBCOL);
        sunit_macros.define_test_case_postamble(ISA_PERFBYTYPE_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
        sunit_macros.def_test_method_register(ISA_PERFBYTYPE_SUBCOL, SUBCOL_TEST_REFORMULATION);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_subcollection_processor_file() {
        if (SubLFiles.USE_V1) {
            reformulator_module_harness.declare_rl_module($$SubcollectionProcessorRLModule, $list1);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_rl_scfn_data$.getGlobalValue(), symbol_function(RL_SCFN_DATA_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list11);
            def_csetf(RL_SCFN_DATA_HIERARCHY_PRED, _CSETF_RL_SCFN_DATA_HIERARCHY_PRED);
            def_csetf(RL_SCFN_DATA_VAR_NAME, _CSETF_RL_SCFN_DATA_VAR_NAME);
            def_csetf(RL_SCFN_DATA_NAUT, _CSETF_RL_SCFN_DATA_NAUT);
            def_csetf(RL_SCFN_DATA_SUBCOLLECTION_FN, _CSETF_RL_SCFN_DATA_SUBCOLLECTION_FN);
            def_csetf(RL_SCFN_DATA_ARG_FROM, _CSETF_RL_SCFN_DATA_ARG_FROM);
            def_csetf(RL_SCFN_DATA_PRED, _CSETF_RL_SCFN_DATA_PRED);
            def_csetf(RL_SCFN_DATA_ARG_TO, _CSETF_RL_SCFN_DATA_ARG_TO);
            identity(RL_SCFN_DATA);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rl_scfn_data$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RL_SCFN_DATA_METHOD));
            sunit_external.define_test_category($str68$Reformulator_Subcollection_Proces, UNPROVIDED);
            sunit_external.define_test_suite($str69$subcoll_proc_test_suite, list($str68$Reformulator_Subcollection_Proces), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            sunit_external.define_test_category($str_alt62$Reformulator_Subcollection_Proces, UNPROVIDED);
            sunit_external.define_test_suite($str_alt63$subcoll_proc_test_suite, list($str_alt62$Reformulator_Subcollection_Proces), UNPROVIDED, UNPROVIDED);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(ISA_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(ISA_SUBCOL);
            classes.subloop_new_class(ISA_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
            classes.class_set_implements_slot_listeners(ISA_SUBCOL, NIL);
            classes.subloop_note_class_initialization_function(ISA_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_SUBCOL_CLASS);
            classes.subloop_note_instance_initialization_function(ISA_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_SUBCOL_INSTANCE);
            subloop_reserved_initialize_isa_subcol_class(ISA_SUBCOL);
            sunit_macros.define_test_case_postamble(ISA_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
            sunit_macros.def_test_method_register(ISA_SUBCOL, SUBCOL_TEST_REFORMULATION);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GENLS_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(GENLS_SUBCOL);
            classes.subloop_new_class(GENLS_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
            classes.class_set_implements_slot_listeners(GENLS_SUBCOL, NIL);
            classes.subloop_note_class_initialization_function(GENLS_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_CLASS);
            classes.subloop_note_instance_initialization_function(GENLS_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_INSTANCE);
            subloop_reserved_initialize_genls_subcol_class(GENLS_SUBCOL);
            sunit_macros.define_test_case_postamble(GENLS_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
            sunit_macros.def_test_method_register(GENLS_SUBCOL, SUBCOL_TEST_REFORMULATION);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GENLS_SUBCOL_TYPE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(GENLS_SUBCOL_TYPE);
            classes.subloop_new_class(GENLS_SUBCOL_TYPE, TEST_CASE, NIL, NIL, $list_alt66);
            classes.class_set_implements_slot_listeners(GENLS_SUBCOL_TYPE, NIL);
            classes.subloop_note_class_initialization_function(GENLS_SUBCOL_TYPE, SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_TYPE_CLASS);
            classes.subloop_note_instance_initialization_function(GENLS_SUBCOL_TYPE, SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_TYPE_INSTANCE);
            subloop_reserved_initialize_genls_subcol_type_class(GENLS_SUBCOL_TYPE);
            sunit_macros.define_test_case_postamble(GENLS_SUBCOL_TYPE, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
            sunit_macros.def_test_method_register(GENLS_SUBCOL_TYPE, SUBCOL_TEST_REFORMULATION);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(GENLS_INTERSECT_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(GENLS_INTERSECT_SUBCOL);
            classes.subloop_new_class(GENLS_INTERSECT_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
            classes.class_set_implements_slot_listeners(GENLS_INTERSECT_SUBCOL, NIL);
            classes.subloop_note_class_initialization_function(GENLS_INTERSECT_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_GENLS_INTERSECT_SUBCOL_CLASS);
            classes.subloop_note_instance_initialization_function(GENLS_INTERSECT_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_GENLS_INTERSECT_SUBCOL_INSTANCE);
            subloop_reserved_initialize_genls_intersect_subcol_class(GENLS_INTERSECT_SUBCOL);
            sunit_macros.define_test_case_postamble(GENLS_INTERSECT_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
            sunit_macros.def_test_method_register(GENLS_INTERSECT_SUBCOL, SUBCOL_TEST_REFORMULATION);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(ISA_DIFFERENCE_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(ISA_DIFFERENCE_SUBCOL);
            classes.subloop_new_class(ISA_DIFFERENCE_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
            classes.class_set_implements_slot_listeners(ISA_DIFFERENCE_SUBCOL, NIL);
            classes.subloop_note_class_initialization_function(ISA_DIFFERENCE_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_DIFFERENCE_SUBCOL_CLASS);
            classes.subloop_note_instance_initialization_function(ISA_DIFFERENCE_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_DIFFERENCE_SUBCOL_INSTANCE);
            subloop_reserved_initialize_isa_difference_subcol_class(ISA_DIFFERENCE_SUBCOL);
            sunit_macros.define_test_case_postamble(ISA_DIFFERENCE_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
            sunit_macros.def_test_method_register(ISA_DIFFERENCE_SUBCOL, SUBCOL_TEST_REFORMULATION);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(ISA_PERFBYTYPE_SUBCOL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(ISA_PERFBYTYPE_SUBCOL);
            classes.subloop_new_class(ISA_PERFBYTYPE_SUBCOL, TEST_CASE, NIL, NIL, $list_alt66);
            classes.class_set_implements_slot_listeners(ISA_PERFBYTYPE_SUBCOL, NIL);
            classes.subloop_note_class_initialization_function(ISA_PERFBYTYPE_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_PERFBYTYPE_SUBCOL_CLASS);
            classes.subloop_note_instance_initialization_function(ISA_PERFBYTYPE_SUBCOL, SUBLOOP_RESERVED_INITIALIZE_ISA_PERFBYTYPE_SUBCOL_INSTANCE);
            subloop_reserved_initialize_isa_perfbytype_subcol_class(ISA_PERFBYTYPE_SUBCOL);
            sunit_macros.define_test_case_postamble(ISA_PERFBYTYPE_SUBCOL, $str_alt84$reformulator_module_subcollection, $$$cycl, $list_alt86);
            sunit_macros.def_test_method_register(ISA_PERFBYTYPE_SUBCOL, SUBCOL_TEST_REFORMULATION);
        }
        return NIL;
    }

    public static SubLObject setup_reformulator_module_subcollection_processor_file_Previous() {
        reformulator_module_harness.declare_rl_module($$SubcollectionProcessorRLModule, $list1);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rl_scfn_data$.getGlobalValue(), symbol_function(RL_SCFN_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(RL_SCFN_DATA_HIERARCHY_PRED, _CSETF_RL_SCFN_DATA_HIERARCHY_PRED);
        def_csetf(RL_SCFN_DATA_VAR_NAME, _CSETF_RL_SCFN_DATA_VAR_NAME);
        def_csetf(RL_SCFN_DATA_NAUT, _CSETF_RL_SCFN_DATA_NAUT);
        def_csetf(RL_SCFN_DATA_SUBCOLLECTION_FN, _CSETF_RL_SCFN_DATA_SUBCOLLECTION_FN);
        def_csetf(RL_SCFN_DATA_ARG_FROM, _CSETF_RL_SCFN_DATA_ARG_FROM);
        def_csetf(RL_SCFN_DATA_PRED, _CSETF_RL_SCFN_DATA_PRED);
        def_csetf(RL_SCFN_DATA_ARG_TO, _CSETF_RL_SCFN_DATA_ARG_TO);
        identity(RL_SCFN_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rl_scfn_data$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RL_SCFN_DATA_METHOD));
        sunit_external.define_test_category($str68$Reformulator_Subcollection_Proces, UNPROVIDED);
        sunit_external.define_test_suite($str69$subcoll_proc_test_suite, list($str68$Reformulator_Subcollection_Proces), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_subcollection_processor_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_subcollection_processor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_subcollection_processor_file();
    }

    static {
    }

    public static final class $rl_scfn_data_native extends SubLStructNative {
        public SubLObject $hierarchy_pred;

        public SubLObject $var_name;

        public SubLObject $naut;

        public SubLObject $subcollection_fn;

        public SubLObject $arg_from;

        public SubLObject $pred;

        public SubLObject $arg_to;

        private static final SubLStructDeclNative structDecl;

        public $rl_scfn_data_native() {
            reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$hierarchy_pred = Lisp.NIL;
            reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$var_name = Lisp.NIL;
            reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$naut = Lisp.NIL;
            reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$subcollection_fn = Lisp.NIL;
            reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$arg_from = Lisp.NIL;
            reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$pred = Lisp.NIL;
            reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$arg_to = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$hierarchy_pred;
        }

        @Override
        public SubLObject getField3() {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$var_name;
        }

        @Override
        public SubLObject getField4() {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$naut;
        }

        @Override
        public SubLObject getField5() {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$subcollection_fn;
        }

        @Override
        public SubLObject getField6() {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$arg_from;
        }

        @Override
        public SubLObject getField7() {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$pred;
        }

        @Override
        public SubLObject getField8() {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$arg_to;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$hierarchy_pred = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$var_name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$naut = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$subcollection_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$arg_from = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$pred = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return reformulator_module_subcollection_processor.$rl_scfn_data_native.this.$arg_to = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.reformulator_module_subcollection_processor.$rl_scfn_data_native.class, RL_SCFN_DATA, RL_SCFN_DATA_P, $list5, $list6, new String[]{ "$hierarchy_pred", "$var_name", "$naut", "$subcollection_fn", "$arg_from", "$pred", "$arg_to" }, $list7, $list8, PRINT_RL_SCFN_DATA);
        }
    }

    public static final class $rl_scfn_data_p$UnaryFunction extends UnaryFunction {
        public $rl_scfn_data_p$UnaryFunction() {
            super(extractFunctionNamed("RL-SCFN-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rl_scfn_data_p(arg1);
        }
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("SCFN-EXPRESSION-REQUIRED"), $COST, makeSymbol("SCFN-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("SCFN-EXPRESSION-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Distributes info from a #$SubcollectionFunction NAUT into a conjunctive clause"), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$isa ?VAR0 (#$SubcollectionOfWithRelationToFn #$Sheep #$hates #$Bertolo))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$and (#$isa ?VAR0 #$Sheep) (#$hates ?VAR0 #$Bertolo))") });

    static private final SubLList $list_alt5 = list(makeSymbol("HIERARCHY-PRED"), makeSymbol("VAR-NAME"), makeSymbol("NAUT"), makeSymbol("SUBCOLLECTION-FN"), makeSymbol("ARG-FROM"), makeSymbol("PRED"), makeSymbol("ARG-TO"));

    static private final SubLList $list_alt6 = list(makeKeyword("HIERARCHY-PRED"), makeKeyword("VAR-NAME"), $NAUT, makeKeyword("SUBCOLLECTION-FN"), makeKeyword("ARG-FROM"), $PRED, makeKeyword("ARG-TO"));

    static private final SubLList $list_alt7 = list(makeSymbol("RL-SCFN-DATA-HIERARCHY-PRED"), makeSymbol("RL-SCFN-DATA-VAR-NAME"), makeSymbol("RL-SCFN-DATA-NAUT"), makeSymbol("RL-SCFN-DATA-SUBCOLLECTION-FN"), makeSymbol("RL-SCFN-DATA-ARG-FROM"), makeSymbol("RL-SCFN-DATA-PRED"), makeSymbol("RL-SCFN-DATA-ARG-TO"));

    static private final SubLList $list_alt8 = list(makeSymbol("_CSETF-RL-SCFN-DATA-HIERARCHY-PRED"), makeSymbol("_CSETF-RL-SCFN-DATA-VAR-NAME"), makeSymbol("_CSETF-RL-SCFN-DATA-NAUT"), makeSymbol("_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN"), makeSymbol("_CSETF-RL-SCFN-DATA-ARG-FROM"), makeSymbol("_CSETF-RL-SCFN-DATA-PRED"), makeSymbol("_CSETF-RL-SCFN-DATA-ARG-TO"));

    static private final SubLString $str_alt32$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt33$__RL_Scfn_Data__H_Pred____S__ = makeString("#<RL-Scfn-Data: H-Pred:  ~S~%");

    static private final SubLString $str_alt34$___________________Var____S__ = makeString("                   Var:  ~S~%");

    static private final SubLString $str_alt35$__________________NAUT____S__ = makeString("                  NAUT:  ~S~%");

    static private final SubLString $str_alt36$_______________SubC_fn____S__ = makeString("               SubC-fn:  ~S~%");

    static private final SubLString $str_alt37$______________Arg_from____S__ = makeString("              Arg-from:  ~S~%");

    static private final SubLString $str_alt38$__________________Pred____S__ = makeString("                  Pred:  ~S~%");

    static private final SubLString $str_alt39$________________Arg_To____S___ = makeString("                Arg-To:  ~S>~%");

    static private final SubLList $list_alt40 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLList $list_alt42 = list(reader_make_constant_shell("SubcollectionPerformedByTypeFn"), reader_make_constant_shell("SubcollectionPerformedByFn"));

    static private final SubLList $list_alt43 = list(makeSymbol("SCFN"), makeSymbol("ARG1"), makeSymbol("PRED"), makeSymbol("ARG2"));

    static private final SubLList $list_alt44 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"));

    static private final SubLList $list_alt45 = list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"));

    static private final SubLList $list_alt46 = list(list(reader_make_constant_shell("isa"), list(list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), list($PRED, $TERM, makeKeyword("ARG"))), list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), list($PRED, makeKeyword("ARG"), $TERM)), list(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), list(reader_make_constant_shell("relationInstanceExists"), $PRED, $TERM, makeKeyword("ARG"))), list(reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), list(reader_make_constant_shell("relationExistsInstance"), $PRED, makeKeyword("ARG"), $TERM)))), list(reader_make_constant_shell("genls"), list(list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), list(reader_make_constant_shell("relationAllInstance"), $PRED, $TERM, makeKeyword("ARG"))), list(reader_make_constant_shell("SubcollectionOfWithRelationFromFn"), list(reader_make_constant_shell("relationInstanceAll"), $PRED, makeKeyword("ARG"), $TERM)), list(reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn"), list(reader_make_constant_shell("relationAllExists"), $PRED, $TERM, makeKeyword("ARG"))), list(reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn"), list(reader_make_constant_shell("relationExistsAll"), $PRED, makeKeyword("ARG"), $TERM)))));

    static private final SubLList $list_alt47 = list(makeKeyword("MODES"), list(reader_make_constant_shell("ReformulatorMode-Verbosify")), makeKeyword("RECURSION-LIMIT"), ZERO_INTEGER);

    static private final SubLList $list_alt48 = list(makeSymbol("SCFN"), makeSymbol("ARG-FROM"), makeSymbol("PRED"), makeSymbol("ARG-TO"));

    static private final SubLList $list_alt49 = list(reader_make_constant_shell("CollectionIntersection2Fn"), reader_make_constant_shell("CollectionDifferenceFn"));

    static private final SubLString $str_alt62$Reformulator_Subcollection_Proces = makeString("Reformulator Subcollection Processing");

    static private final SubLString $str_alt63$subcoll_proc_test_suite = makeString("subcoll-proc-test-suite");

    private static final SubLSymbol ISA_SUBCOL = makeSymbol("ISA-SUBCOL");

    static private final SubLList $list_alt66 = list(list(makeSymbol("IN-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OUT-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUBCOL-TEST-REFORMULATION"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISA_SUBCOL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISA-SUBCOL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISA_SUBCOL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISA-SUBCOL-INSTANCE");

    static private final SubLString $str_alt84$reformulator_module_subcollection = makeString("reformulator-module-subcollection-processor");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt86 = list(makeString("Reformulator Subcollection Processing"));

    private static final SubLSymbol SUBCOL_TEST_REFORMULATION = makeSymbol("SUBCOL-TEST-REFORMULATION");

    private static final SubLSymbol GENLS_SUBCOL = makeSymbol("GENLS-SUBCOL");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-INSTANCE");

    private static final SubLSymbol GENLS_SUBCOL_TYPE = makeSymbol("GENLS-SUBCOL-TYPE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_TYPE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-TYPE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GENLS_SUBCOL_TYPE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GENLS-SUBCOL-TYPE-INSTANCE");

    private static final SubLSymbol GENLS_INTERSECT_SUBCOL = makeSymbol("GENLS-INTERSECT-SUBCOL");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GENLS_INTERSECT_SUBCOL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GENLS-INTERSECT-SUBCOL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GENLS_INTERSECT_SUBCOL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GENLS-INTERSECT-SUBCOL-INSTANCE");

    private static final SubLSymbol ISA_DIFFERENCE_SUBCOL = makeSymbol("ISA-DIFFERENCE-SUBCOL");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISA_DIFFERENCE_SUBCOL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISA-DIFFERENCE-SUBCOL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISA_DIFFERENCE_SUBCOL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISA-DIFFERENCE-SUBCOL-INSTANCE");

    private static final SubLSymbol ISA_PERFBYTYPE_SUBCOL = makeSymbol("ISA-PERFBYTYPE-SUBCOL");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISA_PERFBYTYPE_SUBCOL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISA-PERFBYTYPE-SUBCOL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISA_PERFBYTYPE_SUBCOL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISA-PERFBYTYPE-SUBCOL-INSTANCE");
}

/**
 * Total time: 135 ms
 */
