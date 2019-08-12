/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      INFERENCE-BALANCED-TACTICIAN-DATASTRUCTURES
 *  source file: /cyc/top/cycl/inference/harness/inference-balanced-tactician-datastructures.lisp
 *  created:     2019/07/03 17:37:40
 */
public final class inference_balanced_tactician_datastructures extends SubLTranslatedFile implements V02 {
    // // Constructor
    private inference_balanced_tactician_datastructures() {
    }

    public static final SubLFile me = new inference_balanced_tactician_datastructures();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_balanced_tactician_datastructures";

    // // Definitions
    public static final SubLObject balanced_strategy_motivation_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list_alt0);
    }

    public static final class $balanced_strategy_data_native extends SubLStructNative {
        @Override
	public SubLStructDecl getStructDecl() {
            return inference_balanced_tactician_datastructures.$balanced_strategy_data_native.structDecl;
        }

        @Override
	public SubLObject getField2() {
            return $problems_motivated_wrt_new_root_table;
        }

        @Override
	public SubLObject getField3() {
            return $problems_motivated_wrt_removal;
        }

        @Override
	public SubLObject getField4() {
            return $problems_motivated_wrt_transformation;
        }

        @Override
	public SubLObject getField5() {
            return $link_heads_motivated_wrt_removal;
        }

        @Override
	public SubLObject getField6() {
            return $link_heads_motivated_wrt_transformation;
        }

        @Override
	public SubLObject getField7() {
            return $problems_pending_wrt_new_root;
        }

        @Override
	public SubLObject getField8() {
            return $problems_pending_wrt_removal;
        }

        @Override
	public SubLObject getField9() {
            return $problems_pending_wrt_transformation;
        }

        @Override
	public SubLObject getField10() {
            return $new_root_index;
        }

        @Override
	public SubLObject getField11() {
            return $new_root_problems;
        }

        @Override
	public SubLObject getField12() {
            return $removal_strategem_index;
        }

        @Override
	public SubLObject getField13() {
            return $problem_total_strategems_active_wrt_removal;
        }

        @Override
	public SubLObject getField14() {
            return $current_new_root_wrt_removal;
        }

        @Override
	public SubLObject getField15() {
            return $transformation_strategem_index;
        }

        @Override
	public SubLObject getField16() {
            return $problem_total_strategems_active_wrt_transformation;
        }

        @Override
	public SubLObject getField17() {
            return $problem_strategems_set_aside_wrt_removal;
        }

        @Override
	public SubLObject getField18() {
            return $problem_strategems_set_aside_wrt_transformation;
        }

        @Override
	public SubLObject getField19() {
            return $problem_strategems_thrown_away_wrt_removal;
        }

        @Override
	public SubLObject getField20() {
            return $problem_strategems_thrown_away_wrt_transformation;
        }

        @Override
	public SubLObject setField2(SubLObject value) {
            return $problems_motivated_wrt_new_root_table = value;
        }

        @Override
	public SubLObject setField3(SubLObject value) {
            return $problems_motivated_wrt_removal = value;
        }

        @Override
	public SubLObject setField4(SubLObject value) {
            return $problems_motivated_wrt_transformation = value;
        }

        @Override
	public SubLObject setField5(SubLObject value) {
            return $link_heads_motivated_wrt_removal = value;
        }

        @Override
	public SubLObject setField6(SubLObject value) {
            return $link_heads_motivated_wrt_transformation = value;
        }

        @Override
	public SubLObject setField7(SubLObject value) {
            return $problems_pending_wrt_new_root = value;
        }

        @Override
	public SubLObject setField8(SubLObject value) {
            return $problems_pending_wrt_removal = value;
        }

        @Override
	public SubLObject setField9(SubLObject value) {
            return $problems_pending_wrt_transformation = value;
        }

        @Override
	public SubLObject setField10(SubLObject value) {
            return $new_root_index = value;
        }

        @Override
	public SubLObject setField11(SubLObject value) {
            return $new_root_problems = value;
        }

        @Override
	public SubLObject setField12(SubLObject value) {
            return $removal_strategem_index = value;
        }

        @Override
	public SubLObject setField13(SubLObject value) {
            return $problem_total_strategems_active_wrt_removal = value;
        }

        @Override
	public SubLObject setField14(SubLObject value) {
            return $current_new_root_wrt_removal = value;
        }

        @Override
	public SubLObject setField15(SubLObject value) {
            return $transformation_strategem_index = value;
        }

        @Override
	public SubLObject setField16(SubLObject value) {
            return $problem_total_strategems_active_wrt_transformation = value;
        }

        @Override
	public SubLObject setField17(SubLObject value) {
            return $problem_strategems_set_aside_wrt_removal = value;
        }

        @Override
	public SubLObject setField18(SubLObject value) {
            return $problem_strategems_set_aside_wrt_transformation = value;
        }

        @Override
	public SubLObject setField19(SubLObject value) {
            return $problem_strategems_thrown_away_wrt_removal = value;
        }

        @Override
	public SubLObject setField20(SubLObject value) {
            return $problem_strategems_thrown_away_wrt_transformation = value;
        }

        public SubLObject $problems_motivated_wrt_new_root_table = Lisp.NIL;

        public SubLObject $problems_motivated_wrt_removal = Lisp.NIL;

        public SubLObject $problems_motivated_wrt_transformation = Lisp.NIL;

        public SubLObject $link_heads_motivated_wrt_removal = Lisp.NIL;

        public SubLObject $link_heads_motivated_wrt_transformation = Lisp.NIL;

        public SubLObject $problems_pending_wrt_new_root = Lisp.NIL;

        public SubLObject $problems_pending_wrt_removal = Lisp.NIL;

        public SubLObject $problems_pending_wrt_transformation = Lisp.NIL;

        public SubLObject $new_root_index = Lisp.NIL;

        public SubLObject $new_root_problems = Lisp.NIL;

        public SubLObject $removal_strategem_index = Lisp.NIL;

        public SubLObject $problem_total_strategems_active_wrt_removal = Lisp.NIL;

        public SubLObject $current_new_root_wrt_removal = Lisp.NIL;

        public SubLObject $transformation_strategem_index = Lisp.NIL;

        public SubLObject $problem_total_strategems_active_wrt_transformation = Lisp.NIL;

        public SubLObject $problem_strategems_set_aside_wrt_removal = Lisp.NIL;

        public SubLObject $problem_strategems_set_aside_wrt_transformation = Lisp.NIL;

        public SubLObject $problem_strategems_thrown_away_wrt_removal = Lisp.NIL;

        public SubLObject $problem_strategems_thrown_away_wrt_transformation = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(inference_balanced_tactician_datastructures.$balanced_strategy_data_native.class, BALANCED_STRATEGY_DATA, BALANCED_STRATEGY_DATA_P, $list_alt3, $list_alt4, new String[]{ "$problems_motivated_wrt_new_root_table", "$problems_motivated_wrt_removal", "$problems_motivated_wrt_transformation", "$link_heads_motivated_wrt_removal", "$link_heads_motivated_wrt_transformation", "$problems_pending_wrt_new_root", "$problems_pending_wrt_removal", "$problems_pending_wrt_transformation", "$new_root_index", "$new_root_problems", "$removal_strategem_index", "$problem_total_strategems_active_wrt_removal", "$current_new_root_wrt_removal", "$transformation_strategem_index", "$problem_total_strategems_active_wrt_transformation", "$problem_strategems_set_aside_wrt_removal", "$problem_strategems_set_aside_wrt_transformation", "$problem_strategems_thrown_away_wrt_removal", "$problem_strategems_thrown_away_wrt_transformation" }, $list_alt5, $list_alt6, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_balanced_strategy_data$ = makeSymbol("*DTP-BALANCED-STRATEGY-DATA*");

    public static final SubLObject balanced_strategy_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject balanced_strategy_data_p(SubLObject v_object) {
        return v_object.getClass() == inference_balanced_tactician_datastructures.$balanced_strategy_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $balanced_strategy_data_p$UnaryFunction extends UnaryFunction {
        public $balanced_strategy_data_p$UnaryFunction() {
            super(extractFunctionNamed("BALANCED-STRATEGY-DATA-P"));
        }

        @Override
	public SubLObject processItem(SubLObject arg1) {
            return balanced_strategy_data_p(arg1);
        }
    }

    public static final SubLObject bal_strat_data_problems_motivated_wrt_new_root_table(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField2();
    }

    public static final SubLObject bal_strat_data_problems_motivated_wrt_removal(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField3();
    }

    public static final SubLObject bal_strat_data_problems_motivated_wrt_transformation(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField4();
    }

    public static final SubLObject bal_strat_data_link_heads_motivated_wrt_removal(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField5();
    }

    public static final SubLObject bal_strat_data_link_heads_motivated_wrt_transformation(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField6();
    }

    public static final SubLObject bal_strat_data_problems_pending_wrt_new_root(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField7();
    }

    public static final SubLObject bal_strat_data_problems_pending_wrt_removal(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField8();
    }

    public static final SubLObject bal_strat_data_problems_pending_wrt_transformation(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField9();
    }

    public static final SubLObject bal_strat_data_new_root_index(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField10();
    }

    public static final SubLObject bal_strat_data_new_root_problems(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField11();
    }

    public static final SubLObject bal_strat_data_removal_strategem_index(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField12();
    }

    public static final SubLObject bal_strat_data_problem_total_strategems_active_wrt_removal(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField13();
    }

    public static final SubLObject bal_strat_data_current_new_root_wrt_removal(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField14();
    }

    public static final SubLObject bal_strat_data_transformation_strategem_index(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField15();
    }

    public static final SubLObject bal_strat_data_problem_total_strategems_active_wrt_transformation(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField16();
    }

    public static final SubLObject bal_strat_data_problem_strategems_set_aside_wrt_removal(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField17();
    }

    public static final SubLObject bal_strat_data_problem_strategems_set_aside_wrt_transformation(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField18();
    }

    public static final SubLObject bal_strat_data_problem_strategems_thrown_away_wrt_removal(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField19();
    }

    public static final SubLObject bal_strat_data_problem_strategems_thrown_away_wrt_transformation(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.getField20();
    }

    public static final SubLObject _csetf_bal_strat_data_problems_motivated_wrt_new_root_table(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problems_motivated_wrt_removal(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problems_motivated_wrt_transformation(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_bal_strat_data_link_heads_motivated_wrt_removal(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_bal_strat_data_link_heads_motivated_wrt_transformation(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problems_pending_wrt_new_root(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problems_pending_wrt_removal(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problems_pending_wrt_transformation(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_bal_strat_data_new_root_index(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_bal_strat_data_new_root_problems(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_bal_strat_data_removal_strategem_index(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problem_total_strategems_active_wrt_removal(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_bal_strat_data_current_new_root_wrt_removal(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_bal_strat_data_transformation_strategem_index(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problem_total_strategems_active_wrt_transformation(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField16(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problem_strategems_set_aside_wrt_removal(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField17(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problem_strategems_set_aside_wrt_transformation(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField18(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_removal(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField19(value);
    }

    public static final SubLObject _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_transformation(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BALANCED_STRATEGY_DATA_P);
        return v_object.setField20(value);
    }

    public static final SubLObject make_balanced_strategy_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new inference_balanced_tactician_datastructures.$balanced_strategy_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE)) {
                        _csetf_bal_strat_data_problems_motivated_wrt_new_root_table(v_new, current_value);
                    } else
                        if (pcase_var.eql($PROBLEMS_MOTIVATED_WRT_REMOVAL)) {
                            _csetf_bal_strat_data_problems_motivated_wrt_removal(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROBLEMS_MOTIVATED_WRT_TRANSFORMATION)) {
                                _csetf_bal_strat_data_problems_motivated_wrt_transformation(v_new, current_value);
                            } else
                                if (pcase_var.eql($LINK_HEADS_MOTIVATED_WRT_REMOVAL)) {
                                    _csetf_bal_strat_data_link_heads_motivated_wrt_removal(v_new, current_value);
                                } else
                                    if (pcase_var.eql($LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION)) {
                                        _csetf_bal_strat_data_link_heads_motivated_wrt_transformation(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PROBLEMS_PENDING_WRT_NEW_ROOT)) {
                                            _csetf_bal_strat_data_problems_pending_wrt_new_root(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PROBLEMS_PENDING_WRT_REMOVAL)) {
                                                _csetf_bal_strat_data_problems_pending_wrt_removal(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($PROBLEMS_PENDING_WRT_TRANSFORMATION)) {
                                                    _csetf_bal_strat_data_problems_pending_wrt_transformation(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($NEW_ROOT_INDEX)) {
                                                        _csetf_bal_strat_data_new_root_index(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($NEW_ROOT_PROBLEMS)) {
                                                            _csetf_bal_strat_data_new_root_problems(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($REMOVAL_STRATEGEM_INDEX)) {
                                                                _csetf_bal_strat_data_removal_strategem_index(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL)) {
                                                                    _csetf_bal_strat_data_problem_total_strategems_active_wrt_removal(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($CURRENT_NEW_ROOT_WRT_REMOVAL)) {
                                                                        _csetf_bal_strat_data_current_new_root_wrt_removal(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($TRANSFORMATION_STRATEGEM_INDEX)) {
                                                                            _csetf_bal_strat_data_transformation_strategem_index(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION)) {
                                                                                _csetf_bal_strat_data_problem_total_strategems_active_wrt_transformation(v_new, current_value);
                                                                            } else
                                                                                if (pcase_var.eql($PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL)) {
                                                                                    _csetf_bal_strat_data_problem_strategems_set_aside_wrt_removal(v_new, current_value);
                                                                                } else
                                                                                    if (pcase_var.eql($PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMATION)) {
                                                                                        _csetf_bal_strat_data_problem_strategems_set_aside_wrt_transformation(v_new, current_value);
                                                                                    } else
                                                                                        if (pcase_var.eql($PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL)) {
                                                                                            _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_removal(v_new, current_value);
                                                                                        } else
                                                                                            if (pcase_var.eql($PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFORMATION)) {
                                                                                                _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_transformation(v_new, current_value);
                                                                                            } else {
                                                                                                Errors.error($str_alt66$Invalid_slot__S_for_construction_, current_arg);
                                                                                            }


















                }
            }
            return v_new;
        }
    }

    public static final SubLObject balanced_strategy_p(SubLObject v_object) {
	return makeBoolean((NIL != inference_heuristic_balanced_tactician.heuristic_balanced_strategy_p(v_object)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities.abductive_strategy_p(v_object)));
    }

    public static final SubLObject new_balanced_strategy_data(SubLObject removal_index, SubLObject new_root_index, SubLObject transformation_index) {
        {
            SubLObject data = make_balanced_strategy_data(UNPROVIDED);
            _csetf_bal_strat_data_problems_motivated_wrt_new_root_table(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_problems_motivated_wrt_removal(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_problems_motivated_wrt_transformation(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_link_heads_motivated_wrt_removal(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_link_heads_motivated_wrt_transformation(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_problems_pending_wrt_new_root(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_problems_pending_wrt_removal(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_problems_pending_wrt_transformation(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_new_root_index(data, new_root_index);
            _csetf_bal_strat_data_new_root_problems(data, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_removal_strategem_index(data, removal_index);
            _csetf_bal_strat_data_problem_total_strategems_active_wrt_removal(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_current_new_root_wrt_removal(data, NIL);
            _csetf_bal_strat_data_transformation_strategem_index(data, transformation_index);
            _csetf_bal_strat_data_problem_total_strategems_active_wrt_transformation(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_problem_strategems_set_aside_wrt_removal(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_problem_strategems_set_aside_wrt_transformation(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_removal(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_transformation(data, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            return data;
        }
    }

    /**
     *
     *
     * @return set-p of problem-p
     */
    public static final SubLObject balanced_strategy_problems_motivated_wrt_new_root_table(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problems_motivated_wrt_new_root_table(data);
        }
    }

    /**
     *
     *
     * @return set-p of problem-p
     */
    public static final SubLObject balanced_strategy_problems_motivated_wrt_removal(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problems_motivated_wrt_removal(data);
        }
    }

    /**
     *
     *
     * @return set-p of problem-p
     */
    public static final SubLObject balanced_strategy_problems_motivated_wrt_transformation(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problems_motivated_wrt_transformation(data);
        }
    }

    /**
     *
     *
     * @return set-p of motivation-strategem-p
     */
    public static final SubLObject balanced_strategy_link_heads_motivated_wrt_removal(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_link_heads_motivated_wrt_removal(data);
        }
    }

    /**
     *
     *
     * @return set-p of motivation-strategem-p
     */
    public static final SubLObject balanced_strategy_link_heads_motivated_wrt_transformation(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_link_heads_motivated_wrt_transformation(data);
        }
    }

    /**
     *
     *
     * @return set-p of problem-p
     */
    public static final SubLObject balanced_strategy_problems_pending_wrt_new_root(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problems_pending_wrt_new_root(data);
        }
    }

    /**
     *
     *
     * @return set-p of problem-p
     */
    public static final SubLObject balanced_strategy_problems_pending_wrt_removal(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problems_pending_wrt_removal(data);
        }
    }

    /**
     *
     *
     * @return set-p of problem-p
     */
    public static final SubLObject balanced_strategy_problems_pending_wrt_transformation(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problems_pending_wrt_transformation(data);
        }
    }

    public static final SubLObject balanced_strategy_new_root_index(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_new_root_index(data);
        }
    }

    /**
     *
     *
     * @return #'EQ set of problem-p
     */
    public static final SubLObject balanced_strategy_new_root_problems(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_new_root_problems(data);
        }
    }

    public static final SubLObject balanced_strategy_removal_strategem_index(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_removal_strategem_index(data);
        }
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> non-negative-integer-p
     */
    public static final SubLObject balanced_strategy_problem_total_strategems_active_wrt_removal(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problem_total_strategems_active_wrt_removal(data);
        }
    }

    /**
     *
     *
     * @return nil or problem-p; the current new root problem leading to R box activity.
     */
    public static final SubLObject balanced_strategy_current_new_root_wrt_removal(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_current_new_root_wrt_removal(data);
        }
    }

    public static final SubLObject balanced_strategy_transformation_strategem_index(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_transformation_strategem_index(data);
        }
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> non-negative-integer-p
     */
    public static final SubLObject balanced_strategy_problem_total_strategems_active_wrt_transformation(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problem_total_strategems_active_wrt_transformation(data);
        }
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p
     */
    public static final SubLObject balanced_strategy_problem_strategems_set_aside_wrt_removal(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problem_strategems_set_aside_wrt_removal(data);
        }
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p
     */
    public static final SubLObject balanced_strategy_problem_strategems_set_aside_wrt_transformation(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problem_strategems_set_aside_wrt_transformation(data);
        }
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p
     */
    public static final SubLObject balanced_strategy_problem_strategems_thrown_away_wrt_removal(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problem_strategems_thrown_away_wrt_removal(data);
        }
    }

    /**
     *
     *
     * @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p
     */
    public static final SubLObject balanced_strategy_problem_strategems_thrown_away_wrt_transformation(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return bal_strat_data_problem_strategems_thrown_away_wrt_transformation(data);
        }
    }

    public static final SubLObject balanced_strategy_problems_motivated_wrt_new_root_count(SubLObject strategy) {
        return dictionary.dictionary_length(balanced_strategy_problems_motivated_wrt_new_root_table(strategy));
    }

    /**
     * Return T iff PROBLEM is motivated to be a new root by STRATEGY
     */
    public static final SubLObject balanced_strategy_problem_motivated_wrt_new_rootP(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup_without_values(balanced_strategy_problems_motivated_wrt_new_root_table(strategy), problem, UNPROVIDED));
    }

    public static final SubLObject balanced_strategy_historical_new_root_count(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(balanced_strategy_problems_motivated_wrt_new_root_table(strategy)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject new_root = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject start_time = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ($UNACTIVATED != start_time) {
                            total = add(total, ONE_INTEGER);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return total;
            }
        }
    }

    public static final SubLObject balanced_strategy_historical_new_root_time(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject start_time = dictionary.dictionary_lookup_without_values(balanced_strategy_problems_motivated_wrt_new_root_table(strategy), problem, UNPROVIDED);
            if ($UNACTIVATED != start_time) {
                return start_time;
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_historical_new_root_times(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject start_times = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(balanced_strategy_problems_motivated_wrt_new_root_table(strategy)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject new_root = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject start_time = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ($UNACTIVATED != start_time) {
                            start_times = cons(start_time, start_times);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return Sort.sort(start_times, symbol_function($sym70$_), UNPROVIDED);
            }
        }
    }

    public static final SubLObject balanced_strategy_current_new_root_wrt_removal_elapsed_time(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        {
            SubLObject new_root = balanced_strategy_current_new_root_wrt_removal(strategy);
            if (NIL != new_root) {
                {
                    SubLObject new_root_start_time = balanced_strategy_historical_new_root_time(strategy, new_root);
                    if (new_root_start_time.isInteger()) {
                        {
                            SubLObject inference_elapsed_time = inference_datastructures_inference.inference_elapsed_internal_real_time_since_start(inference_datastructures_strategy.strategy_inference(strategy));
                            return subtract(inference_elapsed_time, new_root_start_time);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_new_root_count(SubLObject strategy) {
        return set.set_size(balanced_strategy_new_root_problems(strategy));
    }

    public static final SubLObject balanced_strategy_problems_motivated_wrt_removal_count(SubLObject strategy) {
        return set.set_size(balanced_strategy_problems_motivated_wrt_removal(strategy));
    }

    /**
     * Return T iff removal is motivated on PROBLEM in STRATEGY
     */
    public static final SubLObject balanced_strategy_problem_motivated_wrt_removalP(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_memberP(problem, balanced_strategy_problems_motivated_wrt_removal(strategy));
    }

    public static final SubLObject balanced_strategy_problems_motivated_wrt_transformation_count(SubLObject strategy) {
        return set.set_size(balanced_strategy_problems_motivated_wrt_transformation(strategy));
    }

    /**
     * Return T iff transformation is motivated on PROBLEM in STRATEGY
     */
    public static final SubLObject balanced_strategy_problem_motivated_wrt_transformationP(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_memberP(problem, balanced_strategy_problems_motivated_wrt_transformation(strategy));
    }

    /**
     * Return T iff removal motivation should propagate through LINK-HEAD in STRATEGY
     */
    public static final SubLObject balanced_strategy_link_head_motivated_wrt_removalP(SubLObject strategy, SubLObject link_head) {
        SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
        return set.set_memberP(link_head, balanced_strategy_link_heads_motivated_wrt_removal(strategy));
    }

    /**
     * Return T iff transformation motivation should propagate through LINK-HEAD in STRATEGY
     */
    public static final SubLObject balanced_strategy_link_head_motivated_wrt_transformationP(SubLObject strategy, SubLObject link_head) {
        SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
        return set.set_memberP(link_head, balanced_strategy_link_heads_motivated_wrt_transformation(strategy));
    }

    public static final SubLObject balanced_strategy_link_head_motivatedP(SubLObject strategy, SubLObject motivation, SubLObject link_head) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return balanced_strategy_link_head_motivated_wrt_removalP(strategy, link_head);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    return balanced_strategy_link_head_motivated_wrt_transformationP(strategy, link_head);
                } else {
                    return Errors.error($str_alt74$unexpected_motivation__s, motivation);
                }

        }
    }

    public static final SubLObject balanced_strategy_connected_conjunction_link_motivated_wrt_removalP(SubLObject strategy, SubLObject connected_conjunction_link) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(connected_conjunction_link, CONNECTED_CONJUNCTION_LINK_P);
        {
            SubLObject link_head = inference_worker.connected_conjunction_link_tactic(connected_conjunction_link);
            return balanced_strategy_link_head_motivated_wrt_removalP(strategy, link_head);
        }
    }

    /**
     * Return T iff PROBLEM is pending in STRATEGY wrt MOTIVATION
     */
    public static final SubLObject balanced_strategy_problem_pendingP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($NEW_ROOT)) {
                return set.set_memberP(problem, balanced_strategy_problems_pending_wrt_new_root(strategy));
            } else
                if (pcase_var.eql($REMOVAL)) {
                    return set.set_memberP(problem, balanced_strategy_problems_pending_wrt_removal(strategy));
                } else
                    if (pcase_var.eql($TRANSFORMATION)) {
                        return set.set_memberP(problem, balanced_strategy_problems_pending_wrt_transformation(strategy));
                    } else {
                        return Errors.error($str_alt74$unexpected_motivation__s, motivation);
                    }


        }
    }

    public static final SubLObject balanced_strategy_problem_totally_pendingP(SubLObject strategy, SubLObject problem) {
        return makeBoolean((NIL != balanced_strategy_problem_pendingP(strategy, problem, $REMOVAL)) && (NIL != balanced_strategy_problem_pendingP(strategy, problem, $TRANSFORMATION)));
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM is actively being considered for MOTIVATION by STRATEGY.
     */
    public static final SubLObject balanced_strategy_problem_activeP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($NEW_ROOT)) {
                return balanced_strategy_problem_active_wrt_new_rootP(strategy, problem);
            } else
                if (pcase_var.eql($REMOVAL)) {
                    return balanced_strategy_problem_active_wrt_removalP(strategy, problem);
                } else
                    if (pcase_var.eql($TRANSFORMATION)) {
                        return balanced_strategy_problem_active_wrt_transformationP(strategy, problem);
                    } else {
                        return Errors.error($str_alt74$unexpected_motivation__s, motivation);
                    }


        }
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM is actively being considered a new root by STRATEGY.
     */
    public static final SubLObject balanced_strategy_problem_active_wrt_new_rootP(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_memberP(problem, balanced_strategy_new_root_problems(strategy));
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM is actively being considered for removal by STRATEGY.
     */
    public static final SubLObject balanced_strategy_problem_active_wrt_removalP(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject index = balanced_strategy_problem_total_strategems_active_wrt_removal(strategy);
            return plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
        }
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM is actively being considered for transformation by STRATEGY.
     */
    public static final SubLObject balanced_strategy_problem_active_wrt_transformationP(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject index = balanced_strategy_problem_total_strategems_active_wrt_transformation(strategy);
            return plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
        }
    }

    public static final SubLObject balanced_strategy_problem_set_asideP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($NEW_ROOT)) {
                return NIL;
            } else
                if (pcase_var.eql($REMOVAL)) {
                    return balanced_strategy_problem_set_aside_wrt_removalP(strategy, problem);
                } else
                    if (pcase_var.eql($TRANSFORMATION)) {
                        return balanced_strategy_problem_set_aside_wrt_transformationP(strategy, problem);
                    }


        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM has been set aside for later removal consideration by STRATEGY.
     */
    public static final SubLObject balanced_strategy_problem_set_aside_wrt_removalP(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        if (NIL == balanced_strategy_problem_active_wrt_removalP(strategy, problem)) {
            {
                SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_removal(strategy);
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
    public static final SubLObject balanced_strategy_problem_set_aside_wrt_transformationP(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        if (NIL == balanced_strategy_problem_active_wrt_transformationP(strategy, problem)) {
            {
                SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_transformation(strategy);
                SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
                if ((NIL != v_set) && (NIL == set.set_emptyP(v_set))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_strategem_set_asideP(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
        SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return balanced_strategy_strategem_set_aside_wrt_removalP(strategy, strategem);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    return balanced_strategy_strategem_set_aside_wrt_transformationP(strategy, strategem);
                }

        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGEM has been set aside for later removal consideration by STRATEGY.
     */
    public static final SubLObject balanced_strategy_strategem_set_aside_wrt_removalP(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        {
            SubLObject problem = inference_tactician.strategem_problem(strategem);
            SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_removal(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            return makeBoolean((NIL != set.set_p(v_set)) && (NIL != set.set_memberP(strategem, v_set)));
        }
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGEM has been set aside for later transformation consideration by STRATEGY.
     */
    public static final SubLObject balanced_strategy_strategem_set_aside_wrt_transformationP(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        {
            SubLObject problem = inference_tactician.strategem_problem(strategem);
            SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_transformation(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            return makeBoolean((NIL != set.set_p(v_set)) && (NIL != set.set_memberP(strategem, v_set)));
        }
    }

    public static final SubLObject balanced_strategy_strategem_thrown_awayP(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
        SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return balanced_strategy_strategem_thrown_away_wrt_removalP(strategy, strategem);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    return balanced_strategy_strategem_thrown_away_wrt_transformationP(strategy, strategem);
                }

        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGEM has been thrown away by STRATEGY.
     */
    public static final SubLObject balanced_strategy_strategem_thrown_away_wrt_removalP(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        {
            SubLObject problem = inference_tactician.strategem_problem(strategem);
            SubLObject index = balanced_strategy_problem_strategems_thrown_away_wrt_removal(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            return makeBoolean((NIL != set.set_p(v_set)) && (NIL != set.set_memberP(strategem, v_set)));
        }
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGEM has been thrown away by STRATEGY.
     */
    public static final SubLObject balanced_strategy_strategem_thrown_away_wrt_transformationP(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        {
            SubLObject problem = inference_tactician.strategem_problem(strategem);
            SubLObject index = balanced_strategy_problem_strategems_thrown_away_wrt_transformation(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            return makeBoolean((NIL != set.set_p(v_set)) && (NIL != set.set_memberP(strategem, v_set)));
        }
    }

    // defvar
    private static final SubLSymbol $balanced_strategy_early_removal_productivity_limit$ = makeSymbol("*BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*");

    /**
     *
     *
     * @return nil or productivity-p
     */
    public static final SubLObject balanced_strategy_early_removal_productivity_limit(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $balanced_strategy_early_removal_productivity_limit$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return nil or productivity-p
     */
    public static final SubLObject balanced_strategy_removal_backtracking_productivity_limit(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_removal_backtracking_productivity_limit(strategy);
    }

    public static final SubLObject balanced_strategy_peek_strategem_wrt_removal(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $PEEK_REMOVAL_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject balanced_strategy_peek_new_root(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $PEEK_NEW_ROOT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject balanced_strategy_peek_strategem_wrt_transformation(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $PEEK_TRANSFORMATION_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * note N
     */
    public static final SubLObject balanced_strategy_note_problem_motivated_wrt_new_root(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return dictionary.dictionary_enter(balanced_strategy_problems_motivated_wrt_new_root_table(strategy), problem, $UNACTIVATED);
    }

    public static final SubLObject balanced_strategy_note_new_root_activated_wrt_removal(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        probably_approximately_done.pad_note_new_root();
        {
            SubLObject elapsed = inference_datastructures_inference.inference_elapsed_internal_real_time_since_start(inference_datastructures_strategy.strategy_inference(strategy));
            dictionary.dictionary_enter(balanced_strategy_problems_motivated_wrt_new_root_table(strategy), problem, elapsed);
            balanced_strategy_set_current_new_root_wrt_removal(strategy, problem);
            return problem;
        }
    }

    /**
     * note R
     */
    public static final SubLObject balanced_strategy_note_problem_motivated_wrt_removal(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_add(problem, balanced_strategy_problems_motivated_wrt_removal(strategy));
    }

    /**
     * note T
     */
    public static final SubLObject balanced_strategy_note_problem_motivated_wrt_transformation(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_add(problem, balanced_strategy_problems_motivated_wrt_transformation(strategy));
    }

    /**
     * note R
     */
    public static final SubLObject balanced_strategy_note_link_head_motivated_wrt_removal(SubLObject strategy, SubLObject link_head) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
        return set.set_add(link_head, balanced_strategy_link_heads_motivated_wrt_removal(strategy));
    }

    /**
     * note T
     */
    public static final SubLObject balanced_strategy_note_link_head_motivated_wrt_transformation(SubLObject strategy, SubLObject link_head) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
        return set.set_add(link_head, balanced_strategy_link_heads_motivated_wrt_transformation(strategy));
    }

    public static final SubLObject balanced_strategy_note_link_head_motivated(SubLObject strategy, SubLObject motivation, SubLObject link_head) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return balanced_strategy_note_link_head_motivated_wrt_removal(strategy, link_head);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    return balanced_strategy_note_link_head_motivated_wrt_transformation(strategy, link_head);
                } else {
                    return Errors.error($str_alt74$unexpected_motivation__s, motivation);
                }

        }
    }

    public static final SubLObject balanced_strategy_note_problem_pending_wrt_new_root(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_add(problem, balanced_strategy_problems_pending_wrt_new_root(strategy));
    }

    public static final SubLObject balanced_strategy_note_problem_pending_wrt_removal(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_add(problem, balanced_strategy_problems_pending_wrt_removal(strategy));
    }

    public static final SubLObject balanced_strategy_note_problem_pending_wrt_transformation(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_add(problem, balanced_strategy_problems_pending_wrt_transformation(strategy));
    }

    public static final SubLObject balanced_strategy_note_problem_pending(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($NEW_ROOT)) {
                return balanced_strategy_note_problem_pending_wrt_new_root(strategy, problem);
            } else
                if (pcase_var.eql($REMOVAL)) {
                    return balanced_strategy_note_problem_pending_wrt_removal(strategy, problem);
                } else
                    if (pcase_var.eql($TRANSFORMATION)) {
                        return balanced_strategy_note_problem_pending_wrt_transformation(strategy, problem);
                    }


        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_note_problem_unpending_wrt_removal(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_remove(problem, balanced_strategy_problems_pending_wrt_removal(strategy));
    }

    public static final SubLObject balanced_strategy_note_problem_unpending_wrt_transformation(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return set.set_remove(problem, balanced_strategy_problems_pending_wrt_transformation(strategy));
    }

    public static final SubLObject balanced_strategy_note_problem_unpending(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return balanced_strategy_note_problem_unpending_wrt_removal(strategy, problem);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    return balanced_strategy_note_problem_unpending_wrt_transformation(strategy, problem);
                } else {
                    return Errors.error($str_alt83$new_root_unpending_not_yet_suppor);
                }

        }
    }

    public static final SubLObject balanced_strategy_add_new_root(SubLObject strategy, SubLObject problem) {
        {
            SubLObject addedP = NIL;
            addedP = inference_datastructures_strategy.strategy_dispatch(strategy, $ACTIVATE_NEW_ROOT, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != addedP) {
                set.set_add(problem, balanced_strategy_new_root_problems(strategy));
            }
            return addedP;
        }
    }

    public static final SubLObject balanced_strategy_pop_new_root(SubLObject strategy) {
        {
            SubLObject problem = NIL;
            problem = inference_datastructures_strategy.strategy_dispatch(strategy, $POP_NEW_ROOT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != inference_datastructures_problem.problem_p(problem)) {
                set.set_remove(problem, balanced_strategy_new_root_problems(strategy));
            }
            return problem;
        }
    }

    public static final SubLObject balanced_strategy_clear_current_new_root_wrt_removal(SubLObject strategy) {
        return balanced_strategy_set_current_new_root_wrt_removal(strategy, NIL);
    }

    public static final SubLObject balanced_strategy_set_current_new_root_wrt_removal(SubLObject strategy, SubLObject new_root) {
        if (new_root == UNPROVIDED) {
            new_root = NIL;
        }
        if (NIL != new_root) {
            SubLTrampolineFile.checkType(new_root, PROBLEM_P);
        }
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            _csetf_bal_strat_data_current_new_root_wrt_removal(data, new_root);
        }
        return strategy;
    }

    /**
     * note that REMOVAL-STRATEGEM is in STRATEGY's R-box
     */
    public static final SubLObject balanced_strategy_activate_strategem_wrt_removal(SubLObject strategy, SubLObject removal_strategem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(removal_strategem, REMOVAL_STRATEGEM_P);
        {
            SubLObject result = NIL;
            result = inference_datastructures_strategy.strategy_dispatch(strategy, $ACTIVATE_REMOVAL_STRATEGEM, removal_strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != result) {
                {
                    SubLObject problem = inference_tactician.strategem_problem(removal_strategem);
                    SubLObject index = balanced_strategy_problem_total_strategems_active_wrt_removal(strategy);
                    SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
                    count = add(count, ONE_INTEGER);
                    if (ONE_INTEGER.numE(count)) {
                        balanced_strategy_note_problem_unpending_wrt_removal(strategy, problem);
                    }
                    dictionary.dictionary_enter(index, problem, count);
                    return count;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_pop_strategem_wrt_removal(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $POP_REMOVAL_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * note that TRANSFORMATION-STRATEGEM is in STRATEGY's T-box
     */
    public static final SubLObject balanced_strategy_activate_strategem_wrt_transformation(SubLObject strategy, SubLObject transformation_strategem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(transformation_strategem, TRANSFORMATION_STRATEGEM_P);
        if ((NIL != inference_worker_transformation.transformation_tactic_p(transformation_strategem)) && (NIL != inference_datastructures_tactic.tactic_executedP(transformation_strategem))) {
            return inference_balanced_tactician_motivation.balanced_strategy_activate_transformation_argument_links_wrt_transformation(strategy, inference_datastructures_tactic.tactic_problem(transformation_strategem));
        }
        {
            SubLObject result = NIL;
            result = inference_datastructures_strategy.strategy_dispatch(strategy, $ACTIVATE_TRANSFORMATION_STRATEGEM, transformation_strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != result) {
                {
                    SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
                    SubLObject index = balanced_strategy_problem_total_strategems_active_wrt_transformation(strategy);
                    SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
                    count = add(count, ONE_INTEGER);
                    if (ONE_INTEGER.numE(count)) {
                        balanced_strategy_note_problem_unpending_wrt_transformation(strategy, problem);
                    }
                    dictionary.dictionary_enter(index, problem, count);
                    return count;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_activate_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    return balanced_strategy_activate_strategem_wrt_transformation(strategy, strategem);
                } else {
                    return Errors.error($str_alt91$new_root_strategem_activation_not);
                }

        }
    }

    public static final SubLObject balanced_strategy_pop_strategem_wrt_transformation(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $POP_TRANSFORMATION_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject balanced_strategy_note_strategem_set_aside_wrt_removal(SubLObject strategy, SubLObject removal_strategem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(removal_strategem, REMOVAL_STRATEGEM_P);
        {
            SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_removal(strategy);
            SubLObject problem = inference_tactician.strategem_problem(removal_strategem);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL == set.set_p(v_set)) {
                v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                dictionary.dictionary_enter(index, problem, v_set);
            }
            return set.set_add(removal_strategem, v_set);
        }
    }

    public static final SubLObject balanced_strategy_clear_strategems_set_aside_wrt_removal(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
            {
                SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_removal(strategy);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject strategem_set = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        balanced_strategy_note_problem_unpending_wrt_removal(strategy, problem);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                dictionary.clear_dictionary(index);
            }
            return strategy;
        }
    }

    public static final SubLObject balanced_strategy_note_strategem_set_aside_wrt_transformation(SubLObject strategy, SubLObject transformation_strategem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(transformation_strategem, TRANSFORMATION_STRATEGEM_P);
        {
            SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_transformation(strategy);
            SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL == set.set_p(v_set)) {
                v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                dictionary.dictionary_enter(index, problem, v_set);
            }
            return set.set_add(transformation_strategem, v_set);
        }
    }

    public static final SubLObject balanced_strategy_clear_strategems_set_aside_wrt_transformation(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
            {
                SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_transformation(strategy);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject strategem_set = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        balanced_strategy_note_problem_unpending_wrt_transformation(strategy, problem);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                dictionary.clear_dictionary(index);
            }
            return strategy;
        }
    }

    public static final SubLObject balanced_strategy_note_strategem_set_aside(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return balanced_strategy_note_strategem_set_aside_wrt_removal(strategy, strategem);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    return balanced_strategy_note_strategem_set_aside_wrt_transformation(strategy, strategem);
                } else {
                    return Errors.error($str_alt93$new_root_set_asides_not_yet_suppo);
                }

        }
    }

    public static final SubLObject balanced_strategy_note_strategem_thrown_away_wrt_removal(SubLObject strategy, SubLObject removal_strategem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(removal_strategem, REMOVAL_STRATEGEM_P);
        {
            SubLObject index = balanced_strategy_problem_strategems_thrown_away_wrt_removal(strategy);
            SubLObject problem = inference_tactician.strategem_problem(removal_strategem);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL == set.set_p(v_set)) {
                v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                dictionary.dictionary_enter(index, problem, v_set);
            }
            return set.set_add(removal_strategem, v_set);
        }
    }

    public static final SubLObject balanced_strategy_note_strategem_thrown_away_wrt_transformation(SubLObject strategy, SubLObject transformation_strategem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(transformation_strategem, TRANSFORMATION_STRATEGEM_P);
        {
            SubLObject index = balanced_strategy_problem_strategems_thrown_away_wrt_transformation(strategy);
            SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL == set.set_p(v_set)) {
                v_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                dictionary.dictionary_enter(index, problem, v_set);
            }
            return set.set_add(transformation_strategem, v_set);
        }
    }

    public static final SubLObject balanced_strategy_note_strategem_thrown_away(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return balanced_strategy_note_strategem_thrown_away_wrt_removal(strategy, strategem);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    return balanced_strategy_note_strategem_thrown_away_wrt_transformation(strategy, strategem);
                } else {
                    return Errors.error($str_alt94$new_root_thrown_away_not_yet_supp);
                }

        }
    }

    public static final SubLObject balanced_strategy_no_new_rootsP(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        return inference_datastructures_strategy.strategy_dispatch(strategy, $NO_NEW_ROOTS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject balanced_strategy_no_strategems_active_wrt_removalP(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        return inference_datastructures_strategy.strategy_dispatch(strategy, $NO_ACTIVE_REMOVAL_STRATEGEMS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject balanced_strategy_no_strategems_active_wrt_transformationP(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        return inference_datastructures_strategy.strategy_dispatch(strategy, $NO_ACTIVE_TRANSFORMATION_STRATEGEMS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject balanced_strategy_clear_set_aside_problems(SubLObject strategy) {
        balanced_strategy_clear_strategems_set_aside_wrt_removal(strategy);
        balanced_strategy_clear_strategems_set_aside_wrt_transformation(strategy);
        return strategy;
    }

    public static final SubLObject declare_inference_balanced_tactician_datastructures_file() {
        declareFunction("balanced_strategy_motivation_p", "BALANCED-STRATEGY-MOTIVATION-P", 1, 0, false);
        declareFunction("balanced_strategy_data_print_function_trampoline", "BALANCED-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("balanced_strategy_data_p", "BALANCED-STRATEGY-DATA-P", 1, 0, false);
        new inference_balanced_tactician_datastructures.$balanced_strategy_data_p$UnaryFunction();
        declareFunction("bal_strat_data_problems_motivated_wrt_new_root_table", "BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE", 1, 0, false);
        declareFunction("bal_strat_data_problems_motivated_wrt_removal", "BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL", 1, 0, false);
        declareFunction("bal_strat_data_problems_motivated_wrt_transformation", "BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("bal_strat_data_link_heads_motivated_wrt_removal", "BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL", 1, 0, false);
        declareFunction("bal_strat_data_link_heads_motivated_wrt_transformation", "BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("bal_strat_data_problems_pending_wrt_new_root", "BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT", 1, 0, false);
        declareFunction("bal_strat_data_problems_pending_wrt_removal", "BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL", 1, 0, false);
        declareFunction("bal_strat_data_problems_pending_wrt_transformation", "BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("bal_strat_data_new_root_index", "BAL-STRAT-DATA-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction("bal_strat_data_new_root_problems", "BAL-STRAT-DATA-NEW-ROOT-PROBLEMS", 1, 0, false);
        declareFunction("bal_strat_data_removal_strategem_index", "BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("bal_strat_data_problem_total_strategems_active_wrt_removal", "BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL", 1, 0, false);
        declareFunction("bal_strat_data_current_new_root_wrt_removal", "BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 0, false);
        declareFunction("bal_strat_data_transformation_strategem_index", "BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("bal_strat_data_problem_total_strategems_active_wrt_transformation", "BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("bal_strat_data_problem_strategems_set_aside_wrt_removal", "BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL", 1, 0, false);
        declareFunction("bal_strat_data_problem_strategems_set_aside_wrt_transformation", "BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("bal_strat_data_problem_strategems_thrown_away_wrt_removal", "BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL", 1, 0, false);
        declareFunction("bal_strat_data_problem_strategems_thrown_away_wrt_transformation", "BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("_csetf_bal_strat_data_problems_motivated_wrt_new_root_table", "_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problems_motivated_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problems_motivated_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_link_heads_motivated_wrt_removal", "_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_link_heads_motivated_wrt_transformation", "_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problems_pending_wrt_new_root", "_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problems_pending_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problems_pending_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_new_root_index", "_CSETF-BAL-STRAT-DATA-NEW-ROOT-INDEX", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_new_root_problems", "_CSETF-BAL-STRAT-DATA-NEW-ROOT-PROBLEMS", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_removal_strategem_index", "_CSETF-BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problem_total_strategems_active_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_current_new_root_wrt_removal", "_CSETF-BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_transformation_strategem_index", "_CSETF-BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problem_total_strategems_active_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problem_strategems_set_aside_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problem_strategems_set_aside_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problem_strategems_thrown_away_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
        declareFunction("_csetf_bal_strat_data_problem_strategems_thrown_away_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("make_balanced_strategy_data", "MAKE-BALANCED-STRATEGY-DATA", 0, 1, false);
        declareFunction("balanced_strategy_p", "BALANCED-STRATEGY-P", 1, 0, false);
        declareFunction("new_balanced_strategy_data", "NEW-BALANCED-STRATEGY-DATA", 3, 0, false);
        declareFunction("balanced_strategy_problems_motivated_wrt_new_root_table", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE", 1, 0, false);
        declareFunction("balanced_strategy_problems_motivated_wrt_removal", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_problems_motivated_wrt_transformation", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_link_heads_motivated_wrt_removal", "BALANCED-STRATEGY-LINK-HEADS-MOTIVATED-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_link_heads_motivated_wrt_transformation", "BALANCED-STRATEGY-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_problems_pending_wrt_new_root", "BALANCED-STRATEGY-PROBLEMS-PENDING-WRT-NEW-ROOT", 1, 0, false);
        declareFunction("balanced_strategy_problems_pending_wrt_removal", "BALANCED-STRATEGY-PROBLEMS-PENDING-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_problems_pending_wrt_transformation", "BALANCED-STRATEGY-PROBLEMS-PENDING-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_new_root_index", "BALANCED-STRATEGY-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction("balanced_strategy_new_root_problems", "BALANCED-STRATEGY-NEW-ROOT-PROBLEMS", 1, 0, false);
        declareFunction("balanced_strategy_removal_strategem_index", "BALANCED-STRATEGY-REMOVAL-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("balanced_strategy_problem_total_strategems_active_wrt_removal", "BALANCED-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_current_new_root_wrt_removal", "BALANCED-STRATEGY-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_transformation_strategem_index", "BALANCED-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        declareFunction("balanced_strategy_problem_total_strategems_active_wrt_transformation", "BALANCED-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_problem_strategems_set_aside_wrt_removal", "BALANCED-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_problem_strategems_set_aside_wrt_transformation", "BALANCED-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_problem_strategems_thrown_away_wrt_removal", "BALANCED-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_problem_strategems_thrown_away_wrt_transformation", "BALANCED-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_problems_motivated_wrt_new_root_count", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-COUNT", 1, 0, false);
        declareFunction("balanced_strategy_problem_motivated_wrt_new_rootP", "BALANCED-STRATEGY-PROBLEM-MOTIVATED-WRT-NEW-ROOT?", 2, 0, false);
        declareFunction("balanced_strategy_historical_new_root_count", "BALANCED-STRATEGY-HISTORICAL-NEW-ROOT-COUNT", 1, 0, false);
        declareFunction("balanced_strategy_historical_new_root_time", "BALANCED-STRATEGY-HISTORICAL-NEW-ROOT-TIME", 2, 0, false);
        declareFunction("balanced_strategy_historical_new_root_times", "BALANCED-STRATEGY-HISTORICAL-NEW-ROOT-TIMES", 1, 0, false);
        declareFunction("balanced_strategy_current_new_root_wrt_removal_elapsed_time", "BALANCED-STRATEGY-CURRENT-NEW-ROOT-WRT-REMOVAL-ELAPSED-TIME", 1, 0, false);
        declareFunction("balanced_strategy_new_root_count", "BALANCED-STRATEGY-NEW-ROOT-COUNT", 1, 0, false);
        declareFunction("balanced_strategy_problems_motivated_wrt_removal_count", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-REMOVAL-COUNT", 1, 0, false);
        declareFunction("balanced_strategy_problem_motivated_wrt_removalP", "BALANCED-STRATEGY-PROBLEM-MOTIVATED-WRT-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_problems_motivated_wrt_transformation_count", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION-COUNT", 1, 0, false);
        declareFunction("balanced_strategy_problem_motivated_wrt_transformationP", "BALANCED-STRATEGY-PROBLEM-MOTIVATED-WRT-TRANSFORMATION?", 2, 0, false);
        declareFunction("balanced_strategy_link_head_motivated_wrt_removalP", "BALANCED-STRATEGY-LINK-HEAD-MOTIVATED-WRT-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_link_head_motivated_wrt_transformationP", "BALANCED-STRATEGY-LINK-HEAD-MOTIVATED-WRT-TRANSFORMATION?", 2, 0, false);
        declareFunction("balanced_strategy_link_head_motivatedP", "BALANCED-STRATEGY-LINK-HEAD-MOTIVATED?", 3, 0, false);
        declareFunction("balanced_strategy_connected_conjunction_link_motivated_wrt_removalP", "BALANCED-STRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED-WRT-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_problem_pendingP", "BALANCED-STRATEGY-PROBLEM-PENDING?", 3, 0, false);
        declareFunction("balanced_strategy_problem_totally_pendingP", "BALANCED-STRATEGY-PROBLEM-TOTALLY-PENDING?", 2, 0, false);
        declareFunction("balanced_strategy_problem_activeP", "BALANCED-STRATEGY-PROBLEM-ACTIVE?", 3, 0, false);
        declareFunction("balanced_strategy_problem_active_wrt_new_rootP", "BALANCED-STRATEGY-PROBLEM-ACTIVE-WRT-NEW-ROOT?", 2, 0, false);
        declareFunction("balanced_strategy_problem_active_wrt_removalP", "BALANCED-STRATEGY-PROBLEM-ACTIVE-WRT-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_problem_active_wrt_transformationP", "BALANCED-STRATEGY-PROBLEM-ACTIVE-WRT-TRANSFORMATION?", 2, 0, false);
        declareFunction("balanced_strategy_problem_set_asideP", "BALANCED-STRATEGY-PROBLEM-SET-ASIDE?", 3, 0, false);
        declareFunction("balanced_strategy_problem_set_aside_wrt_removalP", "BALANCED-STRATEGY-PROBLEM-SET-ASIDE-WRT-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_problem_set_aside_wrt_transformationP", "BALANCED-STRATEGY-PROBLEM-SET-ASIDE-WRT-TRANSFORMATION?", 2, 0, false);
        declareFunction("balanced_strategy_strategem_set_asideP", "BALANCED-STRATEGY-STRATEGEM-SET-ASIDE?", 3, 0, false);
        declareFunction("balanced_strategy_strategem_set_aside_wrt_removalP", "BALANCED-STRATEGY-STRATEGEM-SET-ASIDE-WRT-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_strategem_set_aside_wrt_transformationP", "BALANCED-STRATEGY-STRATEGEM-SET-ASIDE-WRT-TRANSFORMATION?", 2, 0, false);
        declareFunction("balanced_strategy_strategem_thrown_awayP", "BALANCED-STRATEGY-STRATEGEM-THROWN-AWAY?", 3, 0, false);
        declareFunction("balanced_strategy_strategem_thrown_away_wrt_removalP", "BALANCED-STRATEGY-STRATEGEM-THROWN-AWAY-WRT-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_strategem_thrown_away_wrt_transformationP", "BALANCED-STRATEGY-STRATEGEM-THROWN-AWAY-WRT-TRANSFORMATION?", 2, 0, false);
        declareFunction("balanced_strategy_early_removal_productivity_limit", "BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction("balanced_strategy_removal_backtracking_productivity_limit", "BALANCED-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction("balanced_strategy_peek_strategem_wrt_removal", "BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_peek_new_root", "BALANCED-STRATEGY-PEEK-NEW-ROOT", 1, 0, false);
        declareFunction("balanced_strategy_peek_strategem_wrt_transformation", "BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_note_problem_motivated_wrt_new_root", "BALANCED-STRATEGY-NOTE-PROBLEM-MOTIVATED-WRT-NEW-ROOT", 2, 0, false);
        declareFunction("balanced_strategy_note_new_root_activated_wrt_removal", "BALANCED-STRATEGY-NOTE-NEW-ROOT-ACTIVATED-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_note_problem_motivated_wrt_removal", "BALANCED-STRATEGY-NOTE-PROBLEM-MOTIVATED-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_note_problem_motivated_wrt_transformation", "BALANCED-STRATEGY-NOTE-PROBLEM-MOTIVATED-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_note_link_head_motivated_wrt_removal", "BALANCED-STRATEGY-NOTE-LINK-HEAD-MOTIVATED-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_note_link_head_motivated_wrt_transformation", "BALANCED-STRATEGY-NOTE-LINK-HEAD-MOTIVATED-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_note_link_head_motivated", "BALANCED-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 3, 0, false);
        declareFunction("balanced_strategy_note_problem_pending_wrt_new_root", "BALANCED-STRATEGY-NOTE-PROBLEM-PENDING-WRT-NEW-ROOT", 2, 0, false);
        declareFunction("balanced_strategy_note_problem_pending_wrt_removal", "BALANCED-STRATEGY-NOTE-PROBLEM-PENDING-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_note_problem_pending_wrt_transformation", "BALANCED-STRATEGY-NOTE-PROBLEM-PENDING-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_note_problem_pending", "BALANCED-STRATEGY-NOTE-PROBLEM-PENDING", 3, 0, false);
        declareFunction("balanced_strategy_note_problem_unpending_wrt_removal", "BALANCED-STRATEGY-NOTE-PROBLEM-UNPENDING-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_note_problem_unpending_wrt_transformation", "BALANCED-STRATEGY-NOTE-PROBLEM-UNPENDING-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_note_problem_unpending", "BALANCED-STRATEGY-NOTE-PROBLEM-UNPENDING", 3, 0, false);
        declareFunction("balanced_strategy_add_new_root", "BALANCED-STRATEGY-ADD-NEW-ROOT", 2, 0, false);
        declareFunction("balanced_strategy_pop_new_root", "BALANCED-STRATEGY-POP-NEW-ROOT", 1, 0, false);
        declareFunction("balanced_strategy_clear_current_new_root_wrt_removal", "BALANCED-STRATEGY-CLEAR-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_set_current_new_root_wrt_removal", "BALANCED-STRATEGY-SET-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 1, false);
        declareFunction("balanced_strategy_activate_strategem_wrt_removal", "BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_pop_strategem_wrt_removal", "BALANCED-STRATEGY-POP-STRATEGEM-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_activate_strategem_wrt_transformation", "BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_activate_strategem", "BALANCED-STRATEGY-ACTIVATE-STRATEGEM", 3, 0, false);
        declareFunction("balanced_strategy_pop_strategem_wrt_transformation", "BALANCED-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_note_strategem_set_aside_wrt_removal", "BALANCED-STRATEGY-NOTE-STRATEGEM-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_clear_strategems_set_aside_wrt_removal", "BALANCED-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_note_strategem_set_aside_wrt_transformation", "BALANCED-STRATEGY-NOTE-STRATEGEM-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_clear_strategems_set_aside_wrt_transformation", "BALANCED-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_note_strategem_set_aside", "BALANCED-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 3, 0, false);
        declareFunction("balanced_strategy_note_strategem_thrown_away_wrt_removal", "BALANCED-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_note_strategem_thrown_away_wrt_transformation", "BALANCED-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_note_strategem_thrown_away", "BALANCED-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 3, 0, false);
        declareFunction("balanced_strategy_no_new_rootsP", "BALANCED-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
        declareFunction("balanced_strategy_no_strategems_active_wrt_removalP", "BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?", 1, 0, false);
        declareFunction("balanced_strategy_no_strategems_active_wrt_transformationP", "BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?", 1, 0, false);
        declareFunction("balanced_strategy_clear_set_aside_problems", "BALANCED-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_balanced_tactician_datastructures_file() {
        defconstant("*DTP-BALANCED-STRATEGY-DATA*", BALANCED_STRATEGY_DATA);
        defvar("*BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
        return NIL;
    }

    public static final SubLObject setup_inference_balanced_tactician_datastructures_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_balanced_strategy_data$.getGlobalValue(), symbol_function(BALANCED_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE, _CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE);
        def_csetf(BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_REMOVAL, _CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_REMOVAL);
        def_csetf(BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_TRANSFORMATION, _CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_TRANSFORMATION);
        def_csetf(BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_REMOVAL, _CSETF_BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_REMOVAL);
        def_csetf(BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION, _CSETF_BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION);
        def_csetf(BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_NEW_ROOT, _CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_NEW_ROOT);
        def_csetf(BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_REMOVAL, _CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_REMOVAL);
        def_csetf(BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_TRANSFORMATION, _CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_TRANSFORMATION);
        def_csetf(BAL_STRAT_DATA_NEW_ROOT_INDEX, _CSETF_BAL_STRAT_DATA_NEW_ROOT_INDEX);
        def_csetf(BAL_STRAT_DATA_NEW_ROOT_PROBLEMS, _CSETF_BAL_STRAT_DATA_NEW_ROOT_PROBLEMS);
        def_csetf(BAL_STRAT_DATA_REMOVAL_STRATEGEM_INDEX, _CSETF_BAL_STRAT_DATA_REMOVAL_STRATEGEM_INDEX);
        def_csetf(BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL, _CSETF_BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL);
        def_csetf(BAL_STRAT_DATA_CURRENT_NEW_ROOT_WRT_REMOVAL, _CSETF_BAL_STRAT_DATA_CURRENT_NEW_ROOT_WRT_REMOVAL);
        def_csetf(BAL_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, _CSETF_BAL_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX);
        def_csetf(BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION, $sym38$_CSETF_BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFO);
        def_csetf(BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL, _CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL);
        def_csetf(BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMATION, $sym42$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMA);
        def_csetf(BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL, _CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL);
        def_csetf(BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFORMATION, $sym46$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFOR);
        identity(BALANCED_STRATEGY_DATA);
        utilities_macros.note_funcall_helper_function(BALANCED_STRATEGY_EARLY_REMOVAL_PRODUCTIVITY_LIMIT);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("NEW-ROOT"), makeKeyword("REMOVAL"), makeKeyword("TRANSFORMATION"));

    private static final SubLSymbol BALANCED_STRATEGY_DATA = makeSymbol("BALANCED-STRATEGY-DATA");

    private static final SubLSymbol BALANCED_STRATEGY_DATA_P = makeSymbol("BALANCED-STRATEGY-DATA-P");

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeSymbol("PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE"), makeSymbol("PROBLEMS-MOTIVATED-WRT-REMOVAL"), makeSymbol("PROBLEMS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("LINK-HEADS-MOTIVATED-WRT-REMOVAL"), makeSymbol("LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("PROBLEMS-PENDING-WRT-NEW-ROOT"), makeSymbol("PROBLEMS-PENDING-WRT-REMOVAL"), makeSymbol("PROBLEMS-PENDING-WRT-TRANSFORMATION"), makeSymbol("NEW-ROOT-INDEX"), makeSymbol("NEW-ROOT-PROBLEMS"), makeSymbol("REMOVAL-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL"), makeSymbol("CURRENT-NEW-ROOT-WRT-REMOVAL"), makeSymbol("TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE"), makeKeyword("PROBLEMS-MOTIVATED-WRT-REMOVAL"), makeKeyword("PROBLEMS-MOTIVATED-WRT-TRANSFORMATION"), makeKeyword("LINK-HEADS-MOTIVATED-WRT-REMOVAL"), makeKeyword("LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION"), makeKeyword("PROBLEMS-PENDING-WRT-NEW-ROOT"), makeKeyword("PROBLEMS-PENDING-WRT-REMOVAL"), makeKeyword("PROBLEMS-PENDING-WRT-TRANSFORMATION"), makeKeyword("NEW-ROOT-INDEX"), makeKeyword("NEW-ROOT-PROBLEMS"), makeKeyword("REMOVAL-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL"), makeKeyword("CURRENT-NEW-ROOT-WRT-REMOVAL"), makeKeyword("TRANSFORMATION-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-NEW-ROOT-INDEX"), makeSymbol("BAL-STRAT-DATA-NEW-ROOT-PROBLEMS"), makeSymbol("BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX"), makeSymbol("BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION") });

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-NEW-ROOT-INDEX"), makeSymbol("_CSETF-BAL-STRAT-DATA-NEW-ROOT-PROBLEMS"), makeSymbol("_CSETF-BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION") });



    private static final SubLSymbol BALANCED_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BALANCED-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE = makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_TRANSFORMATION = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION");

    private static final SubLSymbol BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL");

    private static final SubLSymbol BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION = makeSymbol("_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_NEW_ROOT = makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_NEW_ROOT = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_TRANSFORMATION = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION");

    private static final SubLSymbol BAL_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("BAL-STRAT-DATA-NEW-ROOT-INDEX");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("_CSETF-BAL-STRAT-DATA-NEW-ROOT-INDEX");

    private static final SubLSymbol BAL_STRAT_DATA_NEW_ROOT_PROBLEMS = makeSymbol("BAL-STRAT-DATA-NEW-ROOT-PROBLEMS");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_NEW_ROOT_PROBLEMS = makeSymbol("_CSETF-BAL-STRAT-DATA-NEW-ROOT-PROBLEMS");

    private static final SubLSymbol BAL_STRAT_DATA_REMOVAL_STRATEGEM_INDEX = makeSymbol("BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_REMOVAL_STRATEGEM_INDEX = makeSymbol("_CSETF-BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL");

    private static final SubLSymbol BAL_STRAT_DATA_CURRENT_NEW_ROOT_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_CURRENT_NEW_ROOT_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL");

    private static final SubLSymbol BAL_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("_CSETF-BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION");

    static private final SubLSymbol $sym38$_CSETF_BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFO = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION");

    static private final SubLSymbol $sym42$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMA = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL");

    public static final SubLSymbol _CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL");

    private static final SubLSymbol BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION");

    static private final SubLSymbol $sym46$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFOR = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION");

    private static final SubLSymbol $PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE = makeKeyword("PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE");

    private static final SubLSymbol $PROBLEMS_MOTIVATED_WRT_REMOVAL = makeKeyword("PROBLEMS-MOTIVATED-WRT-REMOVAL");

    private static final SubLSymbol $PROBLEMS_MOTIVATED_WRT_TRANSFORMATION = makeKeyword("PROBLEMS-MOTIVATED-WRT-TRANSFORMATION");

    private static final SubLSymbol $LINK_HEADS_MOTIVATED_WRT_REMOVAL = makeKeyword("LINK-HEADS-MOTIVATED-WRT-REMOVAL");

    private static final SubLSymbol $LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION = makeKeyword("LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION");

    private static final SubLSymbol $PROBLEMS_PENDING_WRT_NEW_ROOT = makeKeyword("PROBLEMS-PENDING-WRT-NEW-ROOT");

    private static final SubLSymbol $PROBLEMS_PENDING_WRT_REMOVAL = makeKeyword("PROBLEMS-PENDING-WRT-REMOVAL");

    private static final SubLSymbol $PROBLEMS_PENDING_WRT_TRANSFORMATION = makeKeyword("PROBLEMS-PENDING-WRT-TRANSFORMATION");

    private static final SubLSymbol $NEW_ROOT_INDEX = makeKeyword("NEW-ROOT-INDEX");

    private static final SubLSymbol $NEW_ROOT_PROBLEMS = makeKeyword("NEW-ROOT-PROBLEMS");

    private static final SubLSymbol $REMOVAL_STRATEGEM_INDEX = makeKeyword("REMOVAL-STRATEGEM-INDEX");

    private static final SubLSymbol $PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL");

    private static final SubLSymbol $CURRENT_NEW_ROOT_WRT_REMOVAL = makeKeyword("CURRENT-NEW-ROOT-WRT-REMOVAL");

    private static final SubLSymbol $TRANSFORMATION_STRATEGEM_INDEX = makeKeyword("TRANSFORMATION-STRATEGEM-INDEX");

    private static final SubLSymbol $PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION");

    private static final SubLSymbol $PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL");

    private static final SubLSymbol $PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMATION = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION");

    private static final SubLSymbol $PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL");

    private static final SubLSymbol $PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFORMATION = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION");

    static private final SubLString $str_alt66$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol BALANCED_STRATEGY_P = makeSymbol("BALANCED-STRATEGY-P");



    private static final SubLSymbol $UNACTIVATED = makeKeyword("UNACTIVATED");

    static private final SubLSymbol $sym70$_ = makeSymbol("<");

    private static final SubLSymbol MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");





    static private final SubLString $str_alt74$unexpected_motivation__s = makeString("unexpected motivation ~s");

    private static final SubLSymbol CONNECTED_CONJUNCTION_LINK_P = makeSymbol("CONNECTED-CONJUNCTION-LINK-P");



    private static final SubLSymbol BALANCED_STRATEGY_MOTIVATION_P = makeSymbol("BALANCED-STRATEGY-MOTIVATION-P");



    private static final SubLSymbol BALANCED_STRATEGY_EARLY_REMOVAL_PRODUCTIVITY_LIMIT = makeSymbol("BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT");

    private static final SubLSymbol $PEEK_REMOVAL_STRATEGEM = makeKeyword("PEEK-REMOVAL-STRATEGEM");

    private static final SubLSymbol $PEEK_NEW_ROOT = makeKeyword("PEEK-NEW-ROOT");

    private static final SubLSymbol $PEEK_TRANSFORMATION_STRATEGEM = makeKeyword("PEEK-TRANSFORMATION-STRATEGEM");

    static private final SubLString $str_alt83$new_root_unpending_not_yet_suppor = makeString("new root unpending not yet supported");

    private static final SubLSymbol $ACTIVATE_NEW_ROOT = makeKeyword("ACTIVATE-NEW-ROOT");

    private static final SubLSymbol $POP_NEW_ROOT = makeKeyword("POP-NEW-ROOT");

    private static final SubLSymbol REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");

    private static final SubLSymbol $ACTIVATE_REMOVAL_STRATEGEM = makeKeyword("ACTIVATE-REMOVAL-STRATEGEM");

    private static final SubLSymbol $POP_REMOVAL_STRATEGEM = makeKeyword("POP-REMOVAL-STRATEGEM");

    private static final SubLSymbol TRANSFORMATION_STRATEGEM_P = makeSymbol("TRANSFORMATION-STRATEGEM-P");

    private static final SubLSymbol $ACTIVATE_TRANSFORMATION_STRATEGEM = makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM");

    static private final SubLString $str_alt91$new_root_strategem_activation_not = makeString("new root strategem activation not yet supported");

    private static final SubLSymbol $POP_TRANSFORMATION_STRATEGEM = makeKeyword("POP-TRANSFORMATION-STRATEGEM");

    static private final SubLString $str_alt93$new_root_set_asides_not_yet_suppo = makeString("new-root set-asides not yet supported");

    static private final SubLString $str_alt94$new_root_thrown_away_not_yet_supp = makeString("new-root thrown-away not yet supported");

    private static final SubLSymbol $NO_NEW_ROOTS = makeKeyword("NO-NEW-ROOTS");

    private static final SubLSymbol $NO_ACTIVE_REMOVAL_STRATEGEMS = makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS");

    private static final SubLSymbol $NO_ACTIVE_TRANSFORMATION_STRATEGEMS = makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_inference_balanced_tactician_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_balanced_tactician_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_balanced_tactician_datastructures_file();
    }
}

