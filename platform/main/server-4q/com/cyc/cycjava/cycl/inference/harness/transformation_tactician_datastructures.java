/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.inference.harness.inference_tactician.strategem_problem;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_emptyP;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.set.set_p;
import static com.cyc.cycjava.cycl.set.set_remove;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.set;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class transformation_tactician_datastructures extends SubLTranslatedFile implements V12 {
    public static final SubLObject transformation_strategy_problem_totally_pendingP(SubLObject strategy, SubLObject problem) {
        return NIL;
    }

    public static final class $transformation_strategy_data_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$link_heads_motivated;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$problems_pending;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$transformation_strategem_index;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$problem_total_strategems_active;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$problem_strategems_set_aside;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$problem_strategems_thrown_away;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$link_heads_motivated = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$problems_pending = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$transformation_strategem_index = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$problem_total_strategems_active = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$problem_strategems_set_aside = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.this.$problem_strategems_thrown_away = value;
        }

        public SubLObject $link_heads_motivated = Lisp.NIL;

        public SubLObject $problems_pending = Lisp.NIL;

        public SubLObject $transformation_strategem_index = Lisp.NIL;

        public SubLObject $problem_total_strategems_active = Lisp.NIL;

        public SubLObject $problem_strategems_set_aside = Lisp.NIL;

        public SubLObject $problem_strategems_thrown_away = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.class, TRANSFORMATION_STRATEGY_DATA, TRANSFORMATION_STRATEGY_DATA_P, $list_alt3, $list_alt4, new String[]{ "$link_heads_motivated", "$problems_pending", "$transformation_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away" }, $list_alt5, $list_alt6, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new transformation_tactician_datastructures();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_transformation_strategy_data$ = makeSymbol("*DTP-TRANSFORMATION-STRATEGY-DATA*");

    private static final SubLSymbol TRANSFORMATION_STRATEGY_DATA = makeSymbol("TRANSFORMATION-STRATEGY-DATA");

    private static final SubLSymbol TRANSFORMATION_STRATEGY_DATA_P = makeSymbol("TRANSFORMATION-STRATEGY-DATA-P");

    static private final SubLList $list3 = list(makeSymbol("LINK-HEADS-MOTIVATED"), makeSymbol("PROBLEMS-PENDING"), makeSymbol("TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY"));

    static private final SubLList $list4 = list(makeKeyword("LINK-HEADS-MOTIVATED"), makeKeyword("PROBLEMS-PENDING"), makeKeyword("TRANSFORMATION-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));

    static private final SubLList $list5 = list(makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));

    private static final SubLSymbol TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TRANSFORMATION-STRATEGY-DATA-P"));

    private static final SubLSymbol TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");

    private static final SubLSymbol TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING");

    private static final SubLSymbol TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");

    private static final SubLSymbol TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");

    private static final SubLSymbol TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");

    private static final SubLSymbol TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");

    private static final SubLSymbol _CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");

    private static final SubLSymbol $LINK_HEADS_MOTIVATED = makeKeyword("LINK-HEADS-MOTIVATED");

    private static final SubLSymbol $TRANSFORMATION_STRATEGEM_INDEX = makeKeyword("TRANSFORMATION-STRATEGEM-INDEX");

    private static final SubLSymbol $PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE");

    private static final SubLSymbol $PROBLEM_STRATEGEMS_SET_ASIDE = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE");

    private static final SubLSymbol $PROBLEM_STRATEGEMS_THROWN_AWAY = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY");

    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TRANSFORMATION_STRATEGY_DATA = makeSymbol("MAKE-TRANSFORMATION-STRATEGY-DATA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD");

    private static final SubLSymbol TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");

    private static final SubLSymbol MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");

    private static final SubLSymbol TRANSFORMATION_STRATEGEM_P = makeSymbol("TRANSFORMATION-STRATEGEM-P");

    // Definitions
    public static final SubLObject transformation_strategy_motivation_p_alt(SubLObject v_object) {
        return eq(v_object, $TRANSFORMATION);
    }

    // Definitions
    public static SubLObject transformation_strategy_motivation_p(final SubLObject v_object) {
        return eq(v_object, $TRANSFORMATION);
    }

    public static final SubLObject transformation_strategy_data_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject transformation_strategy_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject transformation_strategy_data_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject transformation_strategy_data_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native.class ? T : NIL;
    }

    public static final SubLObject trans_strat_data_link_heads_motivated_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.getField2();
    }

    public static SubLObject trans_strat_data_link_heads_motivated(final SubLObject v_object) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject trans_strat_data_problems_pending_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.getField3();
    }

    public static SubLObject trans_strat_data_problems_pending(final SubLObject v_object) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject trans_strat_data_transformation_strategem_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.getField4();
    }

    public static SubLObject trans_strat_data_transformation_strategem_index(final SubLObject v_object) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject trans_strat_data_problem_total_strategems_active_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.getField5();
    }

    public static SubLObject trans_strat_data_problem_total_strategems_active(final SubLObject v_object) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject trans_strat_data_problem_strategems_set_aside_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.getField6();
    }

    public static SubLObject trans_strat_data_problem_strategems_set_aside(final SubLObject v_object) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject trans_strat_data_problem_strategems_thrown_away_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.getField7();
    }

    public static SubLObject trans_strat_data_problem_strategems_thrown_away(final SubLObject v_object) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_trans_strat_data_link_heads_motivated_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_trans_strat_data_link_heads_motivated(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_trans_strat_data_problems_pending_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_trans_strat_data_problems_pending(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_trans_strat_data_transformation_strategem_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_trans_strat_data_transformation_strategem_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_trans_strat_data_problem_total_strategems_active_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_trans_strat_data_problem_total_strategems_active(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_trans_strat_data_problem_strategems_set_aside_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_trans_strat_data_problem_strategems_set_aside(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_trans_strat_data_problem_strategems_thrown_away_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANSFORMATION_STRATEGY_DATA_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_trans_strat_data_problem_strategems_thrown_away(final SubLObject v_object, final SubLObject value) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_data_p(v_object) : "! transformation_tactician_datastructures.transformation_strategy_data_p(v_object) " + "transformation_tactician_datastructures.transformation_strategy_data_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_transformation_strategy_data_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LINK_HEADS_MOTIVATED)) {
                        com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_link_heads_motivated(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PROBLEMS_PENDING)) {
                            com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_problems_pending(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TRANSFORMATION_STRATEGEM_INDEX)) {
                                com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_transformation_strategem_index(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PROBLEM_TOTAL_STRATEGEMS_ACTIVE)) {
                                    com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_problem_total_strategems_active(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PROBLEM_STRATEGEMS_SET_ASIDE)) {
                                        com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_problem_strategems_set_aside(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PROBLEM_STRATEGEMS_THROWN_AWAY)) {
                                            com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_problem_strategems_thrown_away(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt27$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_transformation_strategy_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql(transformation_tactician_datastructures.$LINK_HEADS_MOTIVATED)) {
                transformation_tactician_datastructures._csetf_trans_strat_data_link_heads_motivated(v_new, current_value);
            } else
                if (pcase_var.eql($PROBLEMS_PENDING)) {
                    transformation_tactician_datastructures._csetf_trans_strat_data_problems_pending(v_new, current_value);
                } else
                    if (pcase_var.eql(transformation_tactician_datastructures.$TRANSFORMATION_STRATEGEM_INDEX)) {
                        transformation_tactician_datastructures._csetf_trans_strat_data_transformation_strategem_index(v_new, current_value);
                    } else
                        if (pcase_var.eql(transformation_tactician_datastructures.$PROBLEM_TOTAL_STRATEGEMS_ACTIVE)) {
                            transformation_tactician_datastructures._csetf_trans_strat_data_problem_total_strategems_active(v_new, current_value);
                        } else
                            if (pcase_var.eql(transformation_tactician_datastructures.$PROBLEM_STRATEGEMS_SET_ASIDE)) {
                                transformation_tactician_datastructures._csetf_trans_strat_data_problem_strategems_set_aside(v_new, current_value);
                            } else
                                if (pcase_var.eql(transformation_tactician_datastructures.$PROBLEM_STRATEGEMS_THROWN_AWAY)) {
                                    transformation_tactician_datastructures._csetf_trans_strat_data_problem_strategems_thrown_away(v_new, current_value);
                                } else {
                                    Errors.error(transformation_tactician_datastructures.$str28$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_transformation_strategy_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, transformation_tactician_datastructures.MAKE_TRANSFORMATION_STRATEGY_DATA, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, transformation_tactician_datastructures.$LINK_HEADS_MOTIVATED, transformation_tactician_datastructures.trans_strat_data_link_heads_motivated(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEMS_PENDING, transformation_tactician_datastructures.trans_strat_data_problems_pending(obj));
        funcall(visitor_fn, obj, $SLOT, transformation_tactician_datastructures.$TRANSFORMATION_STRATEGEM_INDEX, transformation_tactician_datastructures.trans_strat_data_transformation_strategem_index(obj));
        funcall(visitor_fn, obj, $SLOT, transformation_tactician_datastructures.$PROBLEM_TOTAL_STRATEGEMS_ACTIVE, transformation_tactician_datastructures.trans_strat_data_problem_total_strategems_active(obj));
        funcall(visitor_fn, obj, $SLOT, transformation_tactician_datastructures.$PROBLEM_STRATEGEMS_SET_ASIDE, transformation_tactician_datastructures.trans_strat_data_problem_strategems_set_aside(obj));
        funcall(visitor_fn, obj, $SLOT, transformation_tactician_datastructures.$PROBLEM_STRATEGEMS_THROWN_AWAY, transformation_tactician_datastructures.trans_strat_data_problem_strategems_thrown_away(obj));
        funcall(visitor_fn, obj, $END, transformation_tactician_datastructures.MAKE_TRANSFORMATION_STRATEGY_DATA, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_transformation_strategy_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return transformation_tactician_datastructures.visit_defstruct_transformation_strategy_data(obj, visitor_fn);
    }

    public static final SubLObject transformation_strategy_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(v_object)) && ($TRANSFORMATION == inference_datastructures_strategy.strategy_type(v_object))) || (NIL != inference_abduction_utilities.abductive_strategy_p(v_object)));
    }

    public static SubLObject transformation_strategy_p(final SubLObject v_object) {
        return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(v_object)) && ($TRANSFORMATION == inference_datastructures_strategy.strategy_type(v_object))) || (NIL != abductive_tactician.abductive_strategy_p(v_object)));
    }

    public static final SubLObject new_transformation_strategy_data_alt(SubLObject transformation_index) {
        {
            SubLObject data = com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.make_transformation_strategy_data(UNPROVIDED);
            com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_link_heads_motivated(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_problems_pending(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_transformation_strategem_index(data, transformation_index);
            com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_problem_total_strategems_active(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_problem_strategems_set_aside(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures._csetf_trans_strat_data_problem_strategems_thrown_away(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            return data;
        }
    }

    public static SubLObject new_transformation_strategy_data(final SubLObject transformation_index) {
        final SubLObject data = transformation_tactician_datastructures.make_transformation_strategy_data(UNPROVIDED);
        transformation_tactician_datastructures._csetf_trans_strat_data_link_heads_motivated(data, new_set(symbol_function(EQ), UNPROVIDED));
        transformation_tactician_datastructures._csetf_trans_strat_data_problems_pending(data, new_set(symbol_function(EQ), UNPROVIDED));
        transformation_tactician_datastructures._csetf_trans_strat_data_transformation_strategem_index(data, transformation_index);
        transformation_tactician_datastructures._csetf_trans_strat_data_problem_total_strategems_active(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        transformation_tactician_datastructures._csetf_trans_strat_data_problem_strategems_set_aside(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        transformation_tactician_datastructures._csetf_trans_strat_data_problem_strategems_thrown_away(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        return data;
    }

    /**
     *
     *
     * @return set-p of motivation-strategem-p
     */
    @LispMethod(comment = "@return set-p of motivation-strategem-p")
    public static final SubLObject transformation_strategy_link_heads_motivated_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.trans_strat_data_link_heads_motivated(data);
        }
    }

    /**
     *
     *
     * @return set-p of motivation-strategem-p
     */
    @LispMethod(comment = "@return set-p of motivation-strategem-p")
    public static SubLObject transformation_strategy_link_heads_motivated(final SubLObject strategy) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return transformation_tactician_datastructures.trans_strat_data_link_heads_motivated(data);
    }

    /**
     *
     *
     * @return set-p of problem-p
     */
    @LispMethod(comment = "@return set-p of problem-p")
    public static final SubLObject transformation_strategy_problems_pending_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.trans_strat_data_problems_pending(data);
        }
    }

    /**
     *
     *
     * @return set-p of problem-p
     */
    @LispMethod(comment = "@return set-p of problem-p")
    public static SubLObject transformation_strategy_problems_pending(final SubLObject strategy) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return transformation_tactician_datastructures.trans_strat_data_problems_pending(data);
    }

    public static final SubLObject transformation_strategy_transformation_strategem_index_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.trans_strat_data_transformation_strategem_index(data);
        }
    }

    public static SubLObject transformation_strategy_transformation_strategem_index(final SubLObject strategy) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return transformation_tactician_datastructures.trans_strat_data_transformation_strategem_index(data);
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> non-negative-integer-p
     */
    @LispMethod(comment = "@return #\'EQ dictionary of problem-p -> non-negative-integer-p")
    public static final SubLObject transformation_strategy_problem_total_strategems_active_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.trans_strat_data_problem_total_strategems_active(data);
        }
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> non-negative-integer-p
     */
    @LispMethod(comment = "@return #\'EQ dictionary of problem-p -> non-negative-integer-p")
    public static SubLObject transformation_strategy_problem_total_strategems_active(final SubLObject strategy) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return transformation_tactician_datastructures.trans_strat_data_problem_total_strategems_active(data);
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p
     */
    @LispMethod(comment = "@return #\'EQ dictionary of problem-p -> #\'EQ set of strategem-p")
    public static final SubLObject transformation_strategy_problem_strategems_set_aside_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.trans_strat_data_problem_strategems_set_aside(data);
        }
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p
     */
    @LispMethod(comment = "@return #\'EQ dictionary of problem-p -> #\'EQ set of strategem-p")
    public static SubLObject transformation_strategy_problem_strategems_set_aside(final SubLObject strategy) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return transformation_tactician_datastructures.trans_strat_data_problem_strategems_set_aside(data);
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p
     */
    @LispMethod(comment = "@return #\'EQ dictionary of problem-p -> #\'EQ set of strategem-p")
    public static final SubLObject transformation_strategy_problem_strategems_thrown_away_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.trans_strat_data_problem_strategems_thrown_away(data);
        }
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p
     */
    @LispMethod(comment = "@return #\'EQ dictionary of problem-p -> #\'EQ set of strategem-p")
    public static SubLObject transformation_strategy_problem_strategems_thrown_away(final SubLObject strategy) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return transformation_tactician_datastructures.trans_strat_data_problem_strategems_thrown_away(data);
    }

    /**
     * Return T iff transformation is motivated on PROBLEM in STRATEGY
     */
    @LispMethod(comment = "Return T iff transformation is motivated on PROBLEM in STRATEGY")
    public static final SubLObject transformation_strategy_problem_motivatedP_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return inference_datastructures_strategy.problem_motivatedP(problem, strategy);
    }

    @LispMethod(comment = "Return T iff transformation is motivated on PROBLEM in STRATEGY")
    public static SubLObject transformation_strategy_problem_motivatedP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return inference_datastructures_strategy.problem_motivatedP(problem, strategy);
    }

    /**
     * Return T iff transformation motivation should propagate through LINK-HEAD in STRATEGY
     */
    @LispMethod(comment = "Return T iff transformation motivation should propagate through LINK-HEAD in STRATEGY")
    public static final SubLObject transformation_strategy_link_head_motivatedP_alt(SubLObject strategy, SubLObject link_head) {
        SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
        return set.set_memberP(link_head, com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_link_heads_motivated(strategy));
    }

    @LispMethod(comment = "Return T iff transformation motivation should propagate through LINK-HEAD in STRATEGY")
    public static SubLObject transformation_strategy_link_head_motivatedP(final SubLObject strategy, final SubLObject link_head) {
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : "! inference_tactician.motivation_strategem_p(link_head) " + ("inference_tactician.motivation_strategem_p(link_head) " + "CommonSymbols.NIL != inference_tactician.motivation_strategem_p(link_head) ") + link_head;
        return set_memberP(link_head, transformation_tactician_datastructures.transformation_strategy_link_heads_motivated(strategy));
    }

    /**
     * Return T iff PROBLEM is pending in STRATEGY
     */
    @LispMethod(comment = "Return T iff PROBLEM is pending in STRATEGY")
    public static final SubLObject transformation_strategy_problem_pendingP_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_memberP(problem, com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problems_pending(strategy));
    }

    @LispMethod(comment = "Return T iff PROBLEM is pending in STRATEGY")
    public static SubLObject transformation_strategy_problem_pendingP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return set_memberP(problem, transformation_tactician_datastructures.transformation_strategy_problems_pending(strategy));
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM is actively being considered for transformation by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM is actively being considered for transformation by STRATEGY.")
    public static final SubLObject transformation_strategy_problem_activeP_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problem_total_strategems_active(strategy);
            return plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
        }
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM is actively being considered for transformation by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM is actively being considered for transformation by STRATEGY.")
    public static SubLObject transformation_strategy_problem_activeP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        final SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_total_strategems_active(strategy);
        return plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM has been set aside for later transformation consideration by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM has been set aside for later transformation consideration by STRATEGY.")
    public static final SubLObject transformation_strategy_problem_set_asideP_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        if (NIL == com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problem_activeP(strategy, problem)) {
            {
                SubLObject index = com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
                SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
                if ((NIL != v_set) && (NIL == set.set_emptyP(v_set))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM has been set aside for later transformation consideration by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM has been set aside for later transformation consideration by STRATEGY.")
    public static SubLObject transformation_strategy_problem_set_asideP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        if (NIL == transformation_tactician_datastructures.transformation_strategy_problem_activeP(strategy, problem)) {
            final SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
            final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if ((NIL != v_set) && (NIL == set_emptyP(v_set))) {
                return T;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGEM has been set aside for later transformation consideration by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGEM has been set aside for later transformation consideration by STRATEGY.")
    public static final SubLObject transformation_strategy_strategem_set_asideP_alt(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        {
            SubLObject problem = strategem_problem(strategem);
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            return makeBoolean((NIL != set.set_p(v_set)) && (NIL != set.set_memberP(strategem, v_set)));
        }
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGEM has been set aside for later transformation consideration by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGEM has been set aside for later transformation consideration by STRATEGY.")
    public static SubLObject transformation_strategy_strategem_set_asideP(final SubLObject strategy, final SubLObject strategem) {
        assert NIL != inference_tactician.strategem_p(strategem) : "! inference_tactician.strategem_p(strategem) " + ("inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) ") + strategem;
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        final SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
        final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        return makeBoolean((NIL != set_p(v_set)) && (NIL != set_memberP(strategem, v_set)));
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGEM has been thrown away by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGEM has been thrown away by STRATEGY.")
    public static final SubLObject transformation_strategy_strategem_thrown_awayP_alt(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        {
            SubLObject problem = strategem_problem(strategem);
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problem_strategems_thrown_away(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            return makeBoolean((NIL != set.set_p(v_set)) && (NIL != set.set_memberP(strategem, v_set)));
        }
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGEM has been thrown away by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGEM has been thrown away by STRATEGY.")
    public static SubLObject transformation_strategy_strategem_thrown_awayP(final SubLObject strategy, final SubLObject strategem) {
        assert NIL != inference_tactician.strategem_p(strategem) : "! inference_tactician.strategem_p(strategem) " + ("inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) ") + strategem;
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        final SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_strategems_thrown_away(strategy);
        final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        return makeBoolean((NIL != set_p(v_set)) && (NIL != set_memberP(strategem, v_set)));
    }

    /**
     * note T
     */
    @LispMethod(comment = "note T")
    public static final SubLObject transformation_strategy_note_problem_motivated_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }

    @LispMethod(comment = "note T")
    public static SubLObject transformation_strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }

    /**
     * note T
     */
    @LispMethod(comment = "note T")
    public static final SubLObject transformation_strategy_note_link_head_motivated_alt(SubLObject strategy, SubLObject link_head) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
        return set.set_add(link_head, com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_link_heads_motivated(strategy));
    }

    @LispMethod(comment = "note T")
    public static SubLObject transformation_strategy_note_link_head_motivated(final SubLObject strategy, final SubLObject link_head) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : "! inference_tactician.motivation_strategem_p(link_head) " + ("inference_tactician.motivation_strategem_p(link_head) " + "CommonSymbols.NIL != inference_tactician.motivation_strategem_p(link_head) ") + link_head;
        return set_add(link_head, transformation_tactician_datastructures.transformation_strategy_link_heads_motivated(strategy));
    }

    public static final SubLObject transformation_strategy_note_problem_pending_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_add(problem, com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problems_pending(strategy));
    }

    public static SubLObject transformation_strategy_note_problem_pending(final SubLObject strategy, final SubLObject problem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return set_add(problem, transformation_tactician_datastructures.transformation_strategy_problems_pending(strategy));
    }

    public static final SubLObject transformation_strategy_note_problem_unpending_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_remove(problem, com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problems_pending(strategy));
    }

    public static SubLObject transformation_strategy_note_problem_unpending(final SubLObject strategy, final SubLObject problem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return set_remove(problem, transformation_tactician_datastructures.transformation_strategy_problems_pending(strategy));
    }

    /**
     * note that TRANSFORMATION-STRATEGEM is in STRATEGY's T-box
     */
    @LispMethod(comment = "note that TRANSFORMATION-STRATEGEM is in STRATEGY\'s T-box")
    public static final SubLObject transformation_strategy_activate_strategem_alt(SubLObject strategy, SubLObject transformation_strategem) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(transformation_strategem, TRANSFORMATION_STRATEGEM_P);
        if ((NIL != inference_worker_transformation.transformation_tactic_p(transformation_strategem)) && (NIL != inference_datastructures_tactic.tactic_executedP(transformation_strategem))) {
            return transformation_tactician_motivation.transformation_strategy_activate_transformation_argument_links(strategy, inference_datastructures_tactic.tactic_problem(transformation_strategem));
        }
        {
            SubLObject result = NIL;
            result = transformation_tactician.transformation_strategy_activate_strategem_low(strategy, transformation_strategem);
            if (NIL != result) {
                {
                    SubLObject problem = strategem_problem(transformation_strategem);
                    SubLObject index = com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problem_total_strategems_active(strategy);
                    SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
                    count = add(count, ONE_INTEGER);
                    if (ONE_INTEGER.numE(count)) {
                        com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_note_problem_unpending(strategy, problem);
                    }
                    dictionary.dictionary_enter(index, problem, count);
                    return count;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "note that TRANSFORMATION-STRATEGEM is in STRATEGY\'s T-box")
    public static SubLObject transformation_strategy_activate_strategem(final SubLObject strategy, final SubLObject transformation_strategem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        assert NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : "! inference_tactician.transformation_strategem_p(transformation_strategem) " + ("inference_tactician.transformation_strategem_p(transformation_strategem) " + "CommonSymbols.NIL != inference_tactician.transformation_strategem_p(transformation_strategem) ") + transformation_strategem;
        if ((NIL != inference_worker_transformation.transformation_tactic_p(transformation_strategem)) && (NIL != inference_datastructures_tactic.tactic_executedP(transformation_strategem))) {
            return transformation_tactician_motivation.transformation_strategy_activate_transformation_argument_links(strategy, inference_datastructures_tactic.tactic_problem(transformation_strategem));
        }
        SubLObject result = NIL;
        result = transformation_tactician.transformation_strategy_activate_strategem_low(strategy, transformation_strategem);
        if (NIL != result) {
            final SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
            final SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_total_strategems_active(strategy);
            SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
            count = add(count, ONE_INTEGER);
            if (ONE_INTEGER.numE(count)) {
                transformation_tactician_datastructures.transformation_strategy_note_problem_unpending(strategy, problem);
            }
            dictionary.dictionary_enter(index, problem, count);
            return count;
        }
        return NIL;
    }

    public static final SubLObject transformation_strategy_note_strategem_set_aside_alt(SubLObject strategy, SubLObject transformation_strategem) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(transformation_strategem, TRANSFORMATION_STRATEGEM_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
            SubLObject problem = strategem_problem(transformation_strategem);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL == set.set_p(v_set)) {
                v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                dictionary.dictionary_enter(index, problem, v_set);
            }
            return set.set_add(transformation_strategem, v_set);
        }
    }

    public static SubLObject transformation_strategy_note_strategem_set_aside(final SubLObject strategy, final SubLObject transformation_strategem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        assert NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : "! inference_tactician.transformation_strategem_p(transformation_strategem) " + ("inference_tactician.transformation_strategem_p(transformation_strategem) " + "CommonSymbols.NIL != inference_tactician.transformation_strategem_p(transformation_strategem) ") + transformation_strategem;
        final SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
        final SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (NIL == set_p(v_set)) {
            v_set = new_set(symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set_add(transformation_strategem, v_set);
    }

    public static final SubLObject transformation_strategy_clear_strategems_set_aside_alt(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
            {
                SubLObject index = com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject strategem_set = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_note_problem_unpending(strategy, problem);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                dictionary.clear_dictionary(index);
            }
            return strategy;
        }
    }

    public static SubLObject transformation_strategy_clear_strategems_set_aside(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        final SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject strategem_set = thread.secondMultipleValue();
            thread.resetMultipleValues();
            transformation_tactician_datastructures.transformation_strategy_note_problem_unpending(strategy, problem);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(index);
        return strategy;
    }

    public static final SubLObject transformation_strategy_note_strategem_thrown_away_alt(SubLObject strategy, SubLObject transformation_strategem) {
        SubLTrampolineFile.checkType(strategy, TRANSFORMATION_STRATEGY_P);
        SubLTrampolineFile.checkType(transformation_strategem, TRANSFORMATION_STRATEGEM_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_problem_strategems_thrown_away(strategy);
            SubLObject problem = strategem_problem(transformation_strategem);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL == set.set_p(v_set)) {
                v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                dictionary.dictionary_enter(index, problem, v_set);
            }
            return set.set_add(transformation_strategem, v_set);
        }
    }

    public static SubLObject transformation_strategy_note_strategem_thrown_away(final SubLObject strategy, final SubLObject transformation_strategem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "! transformation_tactician_datastructures.transformation_strategy_p(strategy) " + ("transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) ") + strategy;
        assert NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : "! inference_tactician.transformation_strategem_p(transformation_strategem) " + ("inference_tactician.transformation_strategem_p(transformation_strategem) " + "CommonSymbols.NIL != inference_tactician.transformation_strategem_p(transformation_strategem) ") + transformation_strategem;
        final SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_strategems_thrown_away(strategy);
        final SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (NIL == set_p(v_set)) {
            v_set = new_set(symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set_add(transformation_strategem, v_set);
    }

    public static final SubLObject transformation_strategy_clear_set_aside_problems_alt(SubLObject strategy) {
        com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.transformation_strategy_clear_strategems_set_aside(strategy);
        return strategy;
    }

    public static SubLObject transformation_strategy_clear_set_aside_problems(final SubLObject strategy) {
        transformation_tactician_datastructures.transformation_strategy_clear_strategems_set_aside(strategy);
        return strategy;
    }

    public static final SubLObject declare_transformation_tactician_datastructures_file_alt() {
        declareFunction("transformation_strategy_motivation_p", "TRANSFORMATION-STRATEGY-MOTIVATION-P", 1, 0, false);
        declareFunction("transformation_strategy_data_print_function_trampoline", "TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("transformation_strategy_data_p", "TRANSFORMATION-STRATEGY-DATA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures.$transformation_strategy_data_p$UnaryFunction();
        declareFunction("trans_strat_data_link_heads_motivated", "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction("trans_strat_data_problems_pending", "TRANS-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false);
        declareFunction("trans_strat_data_transformation_strategem_index", "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("trans_strat_data_problem_total_strategems_active", "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction("trans_strat_data_problem_strategems_set_aside", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("trans_strat_data_problem_strategems_thrown_away", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction("_csetf_trans_strat_data_link_heads_motivated", "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problems_pending", "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_transformation_strategem_index", "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problem_total_strategems_active", "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problem_strategems_set_aside", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problem_strategems_thrown_away", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false);
        declareFunction("make_transformation_strategy_data", "MAKE-TRANSFORMATION-STRATEGY-DATA", 0, 1, false);
        declareFunction("transformation_strategy_p", "TRANSFORMATION-STRATEGY-P", 1, 0, false);
        declareFunction("new_transformation_strategy_data", "NEW-TRANSFORMATION-STRATEGY-DATA", 1, 0, false);
        declareFunction("transformation_strategy_link_heads_motivated", "TRANSFORMATION-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction("transformation_strategy_problems_pending", "TRANSFORMATION-STRATEGY-PROBLEMS-PENDING", 1, 0, false);
        declareFunction("transformation_strategy_transformation_strategem_index", "TRANSFORMATION-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("transformation_strategy_problem_total_strategems_active", "TRANSFORMATION-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction("transformation_strategy_problem_strategems_set_aside", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("transformation_strategy_problem_strategems_thrown_away", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction("transformation_strategy_problem_motivatedP", "TRANSFORMATION-STRATEGY-PROBLEM-MOTIVATED?", 2, 0, false);
        declareFunction("transformation_strategy_link_head_motivatedP", "TRANSFORMATION-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
        declareFunction("transformation_strategy_problem_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-PENDING?", 2, 0, false);
        declareFunction("transformation_strategy_problem_totally_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-TOTALLY-PENDING?", 2, 0, false);
        declareFunction("transformation_strategy_problem_activeP", "TRANSFORMATION-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        declareFunction("transformation_strategy_problem_set_asideP", "TRANSFORMATION-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false);
        declareFunction("transformation_strategy_strategem_set_asideP", "TRANSFORMATION-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false);
        declareFunction("transformation_strategy_strategem_thrown_awayP", "TRANSFORMATION-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false);
        declareFunction("transformation_strategy_note_problem_motivated", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction("transformation_strategy_note_link_head_motivated", "TRANSFORMATION-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false);
        declareFunction("transformation_strategy_note_problem_pending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false);
        declareFunction("transformation_strategy_note_problem_unpending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false);
        declareFunction("transformation_strategy_activate_strategem", "TRANSFORMATION-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("transformation_strategy_note_strategem_set_aside", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false);
        declareFunction("transformation_strategy_clear_strategems_set_aside", "TRANSFORMATION-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("transformation_strategy_note_strategem_thrown_away", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false);
        declareFunction("transformation_strategy_clear_set_aside_problems", "TRANSFORMATION-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_transformation_tactician_datastructures_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("transformation_strategy_motivation_p", "TRANSFORMATION-STRATEGY-MOTIVATION-P", 1, 0, false);
            declareFunction("transformation_strategy_data_print_function_trampoline", "TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("transformation_strategy_data_p", "TRANSFORMATION-STRATEGY-DATA-P", 1, 0, false);
            new transformation_tactician_datastructures.$transformation_strategy_data_p$UnaryFunction();
            declareFunction("trans_strat_data_link_heads_motivated", "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false);
            declareFunction("trans_strat_data_problems_pending", "TRANS-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false);
            declareFunction("trans_strat_data_transformation_strategem_index", "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
            declareFunction("trans_strat_data_problem_total_strategems_active", "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
            declareFunction("trans_strat_data_problem_strategems_set_aside", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
            declareFunction("trans_strat_data_problem_strategems_thrown_away", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
            declareFunction("_csetf_trans_strat_data_link_heads_motivated", "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false);
            declareFunction("_csetf_trans_strat_data_problems_pending", "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false);
            declareFunction("_csetf_trans_strat_data_transformation_strategem_index", "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false);
            declareFunction("_csetf_trans_strat_data_problem_total_strategems_active", "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false);
            declareFunction("_csetf_trans_strat_data_problem_strategems_set_aside", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false);
            declareFunction("_csetf_trans_strat_data_problem_strategems_thrown_away", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false);
            declareFunction("make_transformation_strategy_data", "MAKE-TRANSFORMATION-STRATEGY-DATA", 0, 1, false);
            declareFunction("visit_defstruct_transformation_strategy_data", "VISIT-DEFSTRUCT-TRANSFORMATION-STRATEGY-DATA", 2, 0, false);
            declareFunction("visit_defstruct_object_transformation_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD", 2, 0, false);
            declareFunction("transformation_strategy_p", "TRANSFORMATION-STRATEGY-P", 1, 0, false);
            declareFunction("new_transformation_strategy_data", "NEW-TRANSFORMATION-STRATEGY-DATA", 1, 0, false);
            declareFunction("transformation_strategy_link_heads_motivated", "TRANSFORMATION-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false);
            declareFunction("transformation_strategy_problems_pending", "TRANSFORMATION-STRATEGY-PROBLEMS-PENDING", 1, 0, false);
            declareFunction("transformation_strategy_transformation_strategem_index", "TRANSFORMATION-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
            declareFunction("transformation_strategy_problem_total_strategems_active", "TRANSFORMATION-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
            declareFunction("transformation_strategy_problem_strategems_set_aside", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
            declareFunction("transformation_strategy_problem_strategems_thrown_away", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
            declareFunction("transformation_strategy_problem_motivatedP", "TRANSFORMATION-STRATEGY-PROBLEM-MOTIVATED?", 2, 0, false);
            declareFunction("transformation_strategy_link_head_motivatedP", "TRANSFORMATION-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
            declareFunction("transformation_strategy_problem_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-PENDING?", 2, 0, false);
            declareFunction("transformation_strategy_problem_activeP", "TRANSFORMATION-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
            declareFunction("transformation_strategy_problem_set_asideP", "TRANSFORMATION-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false);
            declareFunction("transformation_strategy_strategem_set_asideP", "TRANSFORMATION-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false);
            declareFunction("transformation_strategy_strategem_thrown_awayP", "TRANSFORMATION-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false);
            declareFunction("transformation_strategy_note_problem_motivated", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
            declareFunction("transformation_strategy_note_link_head_motivated", "TRANSFORMATION-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false);
            declareFunction("transformation_strategy_note_problem_pending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false);
            declareFunction("transformation_strategy_note_problem_unpending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false);
            declareFunction("transformation_strategy_activate_strategem", "TRANSFORMATION-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
            declareFunction("transformation_strategy_note_strategem_set_aside", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false);
            declareFunction("transformation_strategy_clear_strategems_set_aside", "TRANSFORMATION-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false);
            declareFunction("transformation_strategy_note_strategem_thrown_away", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false);
            declareFunction("transformation_strategy_clear_set_aside_problems", "TRANSFORMATION-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("transformation_strategy_problem_totally_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-TOTALLY-PENDING?", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_transformation_tactician_datastructures_file_Previous() {
        declareFunction("transformation_strategy_motivation_p", "TRANSFORMATION-STRATEGY-MOTIVATION-P", 1, 0, false);
        declareFunction("transformation_strategy_data_print_function_trampoline", "TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("transformation_strategy_data_p", "TRANSFORMATION-STRATEGY-DATA-P", 1, 0, false);
        new transformation_tactician_datastructures.$transformation_strategy_data_p$UnaryFunction();
        declareFunction("trans_strat_data_link_heads_motivated", "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction("trans_strat_data_problems_pending", "TRANS-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false);
        declareFunction("trans_strat_data_transformation_strategem_index", "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("trans_strat_data_problem_total_strategems_active", "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction("trans_strat_data_problem_strategems_set_aside", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("trans_strat_data_problem_strategems_thrown_away", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction("_csetf_trans_strat_data_link_heads_motivated", "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problems_pending", "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_transformation_strategem_index", "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problem_total_strategems_active", "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problem_strategems_set_aside", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false);
        declareFunction("_csetf_trans_strat_data_problem_strategems_thrown_away", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false);
        declareFunction("make_transformation_strategy_data", "MAKE-TRANSFORMATION-STRATEGY-DATA", 0, 1, false);
        declareFunction("visit_defstruct_transformation_strategy_data", "VISIT-DEFSTRUCT-TRANSFORMATION-STRATEGY-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_transformation_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD", 2, 0, false);
        declareFunction("transformation_strategy_p", "TRANSFORMATION-STRATEGY-P", 1, 0, false);
        declareFunction("new_transformation_strategy_data", "NEW-TRANSFORMATION-STRATEGY-DATA", 1, 0, false);
        declareFunction("transformation_strategy_link_heads_motivated", "TRANSFORMATION-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false);
        declareFunction("transformation_strategy_problems_pending", "TRANSFORMATION-STRATEGY-PROBLEMS-PENDING", 1, 0, false);
        declareFunction("transformation_strategy_transformation_strategem_index", "TRANSFORMATION-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("transformation_strategy_problem_total_strategems_active", "TRANSFORMATION-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        declareFunction("transformation_strategy_problem_strategems_set_aside", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("transformation_strategy_problem_strategems_thrown_away", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        declareFunction("transformation_strategy_problem_motivatedP", "TRANSFORMATION-STRATEGY-PROBLEM-MOTIVATED?", 2, 0, false);
        declareFunction("transformation_strategy_link_head_motivatedP", "TRANSFORMATION-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
        declareFunction("transformation_strategy_problem_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-PENDING?", 2, 0, false);
        declareFunction("transformation_strategy_problem_activeP", "TRANSFORMATION-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        declareFunction("transformation_strategy_problem_set_asideP", "TRANSFORMATION-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false);
        declareFunction("transformation_strategy_strategem_set_asideP", "TRANSFORMATION-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false);
        declareFunction("transformation_strategy_strategem_thrown_awayP", "TRANSFORMATION-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false);
        declareFunction("transformation_strategy_note_problem_motivated", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction("transformation_strategy_note_link_head_motivated", "TRANSFORMATION-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false);
        declareFunction("transformation_strategy_note_problem_pending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false);
        declareFunction("transformation_strategy_note_problem_unpending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false);
        declareFunction("transformation_strategy_activate_strategem", "TRANSFORMATION-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("transformation_strategy_note_strategem_set_aside", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false);
        declareFunction("transformation_strategy_clear_strategems_set_aside", "TRANSFORMATION-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false);
        declareFunction("transformation_strategy_note_strategem_thrown_away", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false);
        declareFunction("transformation_strategy_clear_set_aside_problems", "TRANSFORMATION-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("LINK-HEADS-MOTIVATED"), makeSymbol("PROBLEMS-PENDING"), makeSymbol("TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY"));

    static private final SubLList $list_alt4 = list(makeKeyword("LINK-HEADS-MOTIVATED"), makeKeyword("PROBLEMS-PENDING"), makeKeyword("TRANSFORMATION-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));

    static private final SubLList $list_alt5 = list(makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));

    static private final SubLString $str_alt27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLSymbol $sym31$TRANSFORMATION_STRATEGY_PROBLEM_TOTALLY_PENDING_ = makeSymbol("TRANSFORMATION-STRATEGY-PROBLEM-TOTALLY-PENDING?");

    public static SubLObject init_transformation_tactician_datastructures_file() {
        defconstant("*DTP-TRANSFORMATION-STRATEGY-DATA*", transformation_tactician_datastructures.TRANSFORMATION_STRATEGY_DATA);
        return NIL;
    }

    public static final SubLObject setup_transformation_tactician_datastructures_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_transformation_strategy_data$.getGlobalValue(), symbol_function(TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED, _CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED);
        def_csetf(TRANS_STRAT_DATA_PROBLEMS_PENDING, _CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING);
        def_csetf(TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, _CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX);
        def_csetf(TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, _CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE);
        def_csetf(TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, _CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE);
        def_csetf(TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, _CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY);
        identity(TRANSFORMATION_STRATEGY_DATA);
        note_funcall_helper_function($sym31$TRANSFORMATION_STRATEGY_PROBLEM_TOTALLY_PENDING_);
        return NIL;
    }

    public static SubLObject setup_transformation_tactician_datastructures_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), transformation_tactician_datastructures.$dtp_transformation_strategy_data$.getGlobalValue(), symbol_function(transformation_tactician_datastructures.TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(transformation_tactician_datastructures.$list9);
            def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED);
            def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_PROBLEMS_PENDING, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING);
            def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX);
            def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE);
            def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE);
            def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY);
            identity(transformation_tactician_datastructures.TRANSFORMATION_STRATEGY_DATA);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), transformation_tactician_datastructures.$dtp_transformation_strategy_data$.getGlobalValue(), symbol_function(transformation_tactician_datastructures.VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD));
        }
        if (SubLFiles.USE_V2) {
            note_funcall_helper_function($sym31$TRANSFORMATION_STRATEGY_PROBLEM_TOTALLY_PENDING_);
        }
        return NIL;
    }

    public static SubLObject setup_transformation_tactician_datastructures_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), transformation_tactician_datastructures.$dtp_transformation_strategy_data$.getGlobalValue(), symbol_function(transformation_tactician_datastructures.TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(transformation_tactician_datastructures.$list9);
        def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED);
        def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_PROBLEMS_PENDING, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING);
        def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX);
        def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE);
        def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE);
        def_csetf(transformation_tactician_datastructures.TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, transformation_tactician_datastructures._CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY);
        identity(transformation_tactician_datastructures.TRANSFORMATION_STRATEGY_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), transformation_tactician_datastructures.$dtp_transformation_strategy_data$.getGlobalValue(), symbol_function(transformation_tactician_datastructures.VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        transformation_tactician_datastructures.declare_transformation_tactician_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        transformation_tactician_datastructures.init_transformation_tactician_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        transformation_tactician_datastructures.setup_transformation_tactician_datastructures_file();
    }

    static {
    }

    public static final class $transformation_strategy_data_p$UnaryFunction extends UnaryFunction {
        public $transformation_strategy_data_p$UnaryFunction() {
            super(extractFunctionNamed("TRANSFORMATION-STRATEGY-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return transformation_tactician_datastructures.transformation_strategy_data_p(arg1);
        }
    }
}

/**
 * Total time: 167 ms
 */
