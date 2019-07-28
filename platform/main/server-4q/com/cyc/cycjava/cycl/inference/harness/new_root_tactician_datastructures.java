package com.cyc.cycjava.cycl.inference.harness;


import com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class new_root_tactician_datastructures extends SubLTranslatedFile {
    public static final SubLFile me = new new_root_tactician_datastructures();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures";

    public static final String myFingerPrint = "4d5a8d922f451660de525b94f85b2c83768f2ee2a3002522c16bf2f3b27fad7f";

    // defconstant
    public static final SubLSymbol $dtp_new_root_strategy_data$ = makeSymbol("*DTP-NEW-ROOT-STRATEGY-DATA*");

    // Internal Constants
    public static final SubLSymbol NEW_ROOT_STRATEGY_DATA = makeSymbol("NEW-ROOT-STRATEGY-DATA");

    public static final SubLSymbol NEW_ROOT_STRATEGY_DATA_P = makeSymbol("NEW-ROOT-STRATEGY-DATA-P");

    public static final SubLList $list2 = list(makeSymbol("NEW-ROOT-INDEX"));

    public static final SubLList $list3 = list(makeKeyword("NEW-ROOT-INDEX"));

    public static final SubLList $list4 = list(makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX"));



    public static final SubLSymbol NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NEW-ROOT-STRATEGY-DATA-P"));

    private static final SubLSymbol NR_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX");

    private static final SubLSymbol _CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX");

    private static final SubLSymbol $NEW_ROOT_INDEX = makeKeyword("NEW-ROOT-INDEX");

    private static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_NEW_ROOT_STRATEGY_DATA = makeSymbol("MAKE-NEW-ROOT-STRATEGY-DATA");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-STRATEGY-DATA-METHOD");

    private static final SubLSymbol NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");



    public static SubLObject new_root_strategy_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject new_root_strategy_data_p(final SubLObject v_object) {
        return v_object.getClass() == new_root_tactician_datastructures.$new_root_strategy_data_native.class ? T : NIL;
    }

    public static SubLObject nr_strat_data_new_root_index(final SubLObject v_object) {
        assert NIL != new_root_strategy_data_p(v_object) : "new_root_tactician_datastructures.new_root_strategy_data_p(v_object) " + "CommonSymbols.NIL != new_root_tactician_datastructures.new_root_strategy_data_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_nr_strat_data_new_root_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != new_root_strategy_data_p(v_object) : "new_root_tactician_datastructures.new_root_strategy_data_p(v_object) " + "CommonSymbols.NIL != new_root_tactician_datastructures.new_root_strategy_data_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_new_root_strategy_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new new_root_tactician_datastructures.$new_root_strategy_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NEW_ROOT_INDEX)) {
                _csetf_nr_strat_data_new_root_index(v_new, current_value);
            } else {
                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_new_root_strategy_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_NEW_ROOT_STRATEGY_DATA, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NEW_ROOT_INDEX, nr_strat_data_new_root_index(obj));
        funcall(visitor_fn, obj, $END, MAKE_NEW_ROOT_STRATEGY_DATA, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_new_root_strategy_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_new_root_strategy_data(obj, visitor_fn);
    }

    public static SubLObject new_new_root_strategy_data(final SubLObject new_root_index) {
        final SubLObject data = make_new_root_strategy_data(UNPROVIDED);
        _csetf_nr_strat_data_new_root_index(data, new_root_index);
        return data;
    }

    public static SubLObject new_root_strategy_new_root_index(final SubLObject strategy) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : "new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) " + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return nr_strat_data_new_root_index(data);
    }

    public static SubLObject new_root_strategy_problem_activeP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy);
    }

    public static SubLObject new_root_strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : "new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }

    public static SubLObject new_root_strategy_pop_new_root(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_root_index = new_root_strategy_new_root_index(strategy);
        thread.resetMultipleValues();
        final SubLObject best_problem = inference_tactician.happiness_index_next(new_root_index);
        final SubLObject expected_happiness = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_datastructures_problem.problem_p(best_problem)) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, best_problem);
        }
        return best_problem;
    }

    public static SubLObject new_root_strategy_no_new_rootsP(final SubLObject strategy) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : "new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) " + strategy;
        return inference_tactician.happiness_index_empty_p(new_root_strategy_new_root_index(strategy));
    }

    public static SubLObject declare_new_root_tactician_datastructures_file() {
        declareFunction(me, "new_root_strategy_data_print_function_trampoline", "NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "new_root_strategy_data_p", "NEW-ROOT-STRATEGY-DATA-P", 1, 0, false);
        new new_root_tactician_datastructures.$new_root_strategy_data_p$UnaryFunction();
        declareFunction(me, "nr_strat_data_new_root_index", "NR-STRAT-DATA-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction(me, "_csetf_nr_strat_data_new_root_index", "_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX", 2, 0, false);
        declareFunction(me, "make_new_root_strategy_data", "MAKE-NEW-ROOT-STRATEGY-DATA", 0, 1, false);
        declareFunction(me, "visit_defstruct_new_root_strategy_data", "VISIT-DEFSTRUCT-NEW-ROOT-STRATEGY-DATA", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_new_root_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-STRATEGY-DATA-METHOD", 2, 0, false);
        declareFunction(me, "new_new_root_strategy_data", "NEW-NEW-ROOT-STRATEGY-DATA", 1, 0, false);
        declareFunction(me, "new_root_strategy_new_root_index", "NEW-ROOT-STRATEGY-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction(me, "new_root_strategy_problem_activeP", "NEW-ROOT-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        declareFunction(me, "new_root_strategy_note_problem_motivated", "NEW-ROOT-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction(me, "new_root_strategy_pop_new_root", "NEW-ROOT-STRATEGY-POP-NEW-ROOT", 1, 0, false);
        declareFunction(me, "new_root_strategy_no_new_rootsP", "NEW-ROOT-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_new_root_tactician_datastructures_file() {
        defconstant("*DTP-NEW-ROOT-STRATEGY-DATA*", NEW_ROOT_STRATEGY_DATA);
        return NIL;
    }

    public static SubLObject setup_new_root_tactician_datastructures_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_new_root_strategy_data$.getGlobalValue(), symbol_function(NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(NR_STRAT_DATA_NEW_ROOT_INDEX, _CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX);
        identity(NEW_ROOT_STRATEGY_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_new_root_strategy_data$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_new_root_tactician_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_new_root_tactician_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_new_root_tactician_datastructures_file();
    }

    static {






















    }

    public static final class $new_root_strategy_data_native extends SubLStructNative {
        public SubLObject $new_root_index;

        private static final SubLStructDeclNative structDecl;

        public $new_root_strategy_data_native() {
            this.$new_root_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$new_root_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$new_root_index = value;
        }

        static {
            structDecl = makeStructDeclNative(new_root_tactician_datastructures.$new_root_strategy_data_native.class, NEW_ROOT_STRATEGY_DATA, NEW_ROOT_STRATEGY_DATA_P, $list2, $list3, new String[]{ "$new_root_index" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $new_root_strategy_data_p$UnaryFunction extends UnaryFunction {
        public $new_root_strategy_data_p$UnaryFunction() {
            super(extractFunctionNamed("NEW-ROOT-STRATEGY-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return new_root_strategy_data_p(arg1);
        }
    }
}

/**
 * Total time: 51 ms
 */
