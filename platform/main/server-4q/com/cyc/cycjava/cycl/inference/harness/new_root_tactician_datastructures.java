package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class new_root_tactician_datastructures extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures";
    public static String myFingerPrint = "4d5a8d922f451660de525b94f85b2c83768f2ee2a3002522c16bf2f3b27fad7f";
    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1000L)
    public static SubLSymbol $dtp_new_root_strategy_data$;
    private static SubLSymbol $sym0$NEW_ROOT_STRATEGY_DATA;
    private static SubLSymbol $sym1$NEW_ROOT_STRATEGY_DATA_P;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym7$NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list8;
    private static SubLSymbol $sym9$NR_STRAT_DATA_NEW_ROOT_INDEX;
    private static SubLSymbol $sym10$_CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX;
    private static SubLSymbol $NEW_ROOT_INDEX;
    private static SubLString $str12$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym14$MAKE_NEW_ROOT_STRATEGY_DATA;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym17$VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD;
    private static SubLSymbol $sym18$NEW_ROOT_STRATEGY_P;
    private static SubLSymbol $sym19$PROBLEM_P;

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1000L)
    public static SubLObject new_root_strategy_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1000L)
    public static SubLObject new_root_strategy_data_p(SubLObject v_object) {
        return (v_object.getClass() == $new_root_strategy_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1000L)
    public static SubLObject nr_strat_data_new_root_index(SubLObject v_object) {
        assert NIL != new_root_strategy_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1000L)
    public static SubLObject _csetf_nr_strat_data_new_root_index(SubLObject v_object, SubLObject value) {
        assert NIL != new_root_strategy_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1000L)
    public static SubLObject make_new_root_strategy_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $new_root_strategy_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NEW_ROOT_INDEX)) {
                _csetf_nr_strat_data_new_root_index(v_new, current_value);
            } else {
                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1000L)
    public static SubLObject visit_defstruct_new_root_strategy_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym14$MAKE_NEW_ROOT_STRATEGY_DATA, ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $NEW_ROOT_INDEX, nr_strat_data_new_root_index(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym14$MAKE_NEW_ROOT_STRATEGY_DATA, ONE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1000L)
    public static SubLObject visit_defstruct_object_new_root_strategy_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_new_root_strategy_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1500L)
    public static SubLObject new_new_root_strategy_data(SubLObject new_root_index) {
        SubLObject data = make_new_root_strategy_data(UNPROVIDED);
        _csetf_nr_strat_data_new_root_index(data, new_root_index);
        return data;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1700L)
    public static SubLObject new_root_strategy_new_root_index(SubLObject strategy) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return nr_strat_data_new_root_index(data);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1900L)
    public static SubLObject new_root_strategy_problem_activeP(SubLObject strategy, SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 2200L)
    public static SubLObject new_root_strategy_note_problem_motivated(SubLObject strategy, SubLObject problem) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 2500L)
    public static SubLObject new_root_strategy_pop_new_root(SubLObject strategy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_root_index = new_root_strategy_new_root_index(strategy);
        thread.resetMultipleValues();
        SubLObject best_problem = inference_tactician.happiness_index_next(new_root_index);
        SubLObject expected_happiness = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_datastructures_problem.problem_p(best_problem)) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, best_problem);
        }
        return best_problem;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 3000L)
    public static SubLObject new_root_strategy_no_new_rootsP(SubLObject strategy) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        return inference_tactician.happiness_index_empty_p(new_root_strategy_new_root_index(strategy));
    }

    public static SubLObject declare_new_root_tactician_datastructures_file() {
        declareFunction(myName, "new_root_strategy_data_print_function_trampoline", "NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "new_root_strategy_data_p", "NEW-ROOT-STRATEGY-DATA-P", 1, 0, false);
        new $new_root_strategy_data_p$UnaryFunction();
        declareFunction(myName, "nr_strat_data_new_root_index", "NR-STRAT-DATA-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction(myName, "_csetf_nr_strat_data_new_root_index", "_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX", 2, 0, false);
        declareFunction(myName, "make_new_root_strategy_data", "MAKE-NEW-ROOT-STRATEGY-DATA", 0, 1, false);
        declareFunction(myName, "visit_defstruct_new_root_strategy_data", "VISIT-DEFSTRUCT-NEW-ROOT-STRATEGY-DATA", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_new_root_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-STRATEGY-DATA-METHOD", 2, 0, false);
        declareFunction(myName, "new_new_root_strategy_data", "NEW-NEW-ROOT-STRATEGY-DATA", 1, 0, false);
        declareFunction(myName, "new_root_strategy_new_root_index", "NEW-ROOT-STRATEGY-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction(myName, "new_root_strategy_problem_activeP", "NEW-ROOT-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        declareFunction(myName, "new_root_strategy_note_problem_motivated", "NEW-ROOT-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction(myName, "new_root_strategy_pop_new_root", "NEW-ROOT-STRATEGY-POP-NEW-ROOT", 1, 0, false);
        declareFunction(myName, "new_root_strategy_no_new_rootsP", "NEW-ROOT-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_new_root_tactician_datastructures_file() {
        $dtp_new_root_strategy_data$ = defconstant("*DTP-NEW-ROOT-STRATEGY-DATA*", $sym0$NEW_ROOT_STRATEGY_DATA);
        return NIL;
    }

    public static SubLObject setup_new_root_tactician_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_new_root_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym7$NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        Structures.def_csetf($sym9$NR_STRAT_DATA_NEW_ROOT_INDEX, $sym10$_CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX);
        Equality.identity($sym0$NEW_ROOT_STRATEGY_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_new_root_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym17$VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD));
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
        me = new new_root_tactician_datastructures();
        $dtp_new_root_strategy_data$ = null;
        $sym0$NEW_ROOT_STRATEGY_DATA = makeSymbol("NEW-ROOT-STRATEGY-DATA");
        $sym1$NEW_ROOT_STRATEGY_DATA_P = makeSymbol("NEW-ROOT-STRATEGY-DATA-P");
        $list2 = list(makeSymbol("NEW-ROOT-INDEX"));
        $list3 = list(makeKeyword("NEW-ROOT-INDEX"));
        $list4 = list(makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX"));
        $list5 = list(makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NEW-ROOT-STRATEGY-DATA-P"));
        $sym9$NR_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX");
        $sym10$_CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX");
        $NEW_ROOT_INDEX = makeKeyword("NEW-ROOT-INDEX");
        $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym14$MAKE_NEW_ROOT_STRATEGY_DATA = makeSymbol("MAKE-NEW-ROOT-STRATEGY-DATA");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym17$VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-STRATEGY-DATA-METHOD");
        $sym18$NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");
        $sym19$PROBLEM_P = makeSymbol("PROBLEM-P");
    }

    public static class $new_root_strategy_data_native extends SubLStructNative {
        public SubLObject $new_root_index;
        private static SubLStructDeclNative structDecl;

        public $new_root_strategy_data_native() {
            this.$new_root_index = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $new_root_strategy_data_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$new_root_index;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$new_root_index = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($new_root_strategy_data_native.class, $sym0$NEW_ROOT_STRATEGY_DATA, $sym1$NEW_ROOT_STRATEGY_DATA_P, $list2, $list3, new String[] { "$new_root_index" }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $new_root_strategy_data_p$UnaryFunction extends UnaryFunction {
        public $new_root_strategy_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NEW-ROOT-STRATEGY-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return new_root_strategy_data_p(arg1);
        }
    }
}
/*
 *
 * Total time: 51 ms
 *
 */