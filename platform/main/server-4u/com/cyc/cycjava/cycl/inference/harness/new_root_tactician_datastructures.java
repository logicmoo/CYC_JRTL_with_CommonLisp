/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
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
import com.cyc.cycjava.cycl.queues;
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


public final class new_root_tactician_datastructures extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @return nil or problem-p
     */
    @LispMethod(comment = "@return nil or problem-p")
    public static final SubLObject new_root_strategy_peek_new_root(SubLObject strategy) {
        {
            SubLObject new_root_index = com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy);
            if (NIL == queues.queue_empty_p(new_root_index)) {
                return queues.queue_peek(new_root_index);
            }
        }
        return NIL;
    }

    public static final SubLObject new_root_strategy_add_new_root(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject new_root_index = com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy);
            queues.enqueue(problem, new_root_index);
            inference_datastructures_strategy.strategy_note_problem_active(strategy, problem);
        }
        return T;
    }

    public static final SubLFile me = new new_root_tactician_datastructures();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_new_root_strategy_data$ = makeSymbol("*DTP-NEW-ROOT-STRATEGY-DATA*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol NEW_ROOT_STRATEGY_DATA = makeSymbol("NEW-ROOT-STRATEGY-DATA");

    private static final SubLSymbol NEW_ROOT_STRATEGY_DATA_P = makeSymbol("NEW-ROOT-STRATEGY-DATA-P");

    static private final SubLList $list2 = list(makeSymbol("NEW-ROOT-INDEX"));

    static private final SubLList $list3 = list(makeKeyword("NEW-ROOT-INDEX"));

    static private final SubLList $list4 = list(makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX"));

    private static final SubLSymbol NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NEW-ROOT-STRATEGY-DATA-P"));

    private static final SubLSymbol NR_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX");

    private static final SubLSymbol _CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX");

    private static final SubLSymbol $NEW_ROOT_INDEX = makeKeyword("NEW-ROOT-INDEX");

    private static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_NEW_ROOT_STRATEGY_DATA = makeSymbol("MAKE-NEW-ROOT-STRATEGY-DATA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-STRATEGY-DATA-METHOD");

    private static final SubLSymbol NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");

    public static final SubLObject new_root_strategy_data_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject new_root_strategy_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject new_root_strategy_data_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.$new_root_strategy_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject new_root_strategy_data_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.$new_root_strategy_data_native.class ? T : NIL;
    }

    public static final SubLObject nr_strat_data_new_root_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NEW_ROOT_STRATEGY_DATA_P);
        return v_object.getField2();
    }

    public static SubLObject nr_strat_data_new_root_index(final SubLObject v_object) {
        assert NIL != new_root_tactician_datastructures.new_root_strategy_data_p(v_object) : "! new_root_tactician_datastructures.new_root_strategy_data_p(v_object) " + "new_root_tactician_datastructures.new_root_strategy_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_nr_strat_data_new_root_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, NEW_ROOT_STRATEGY_DATA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_nr_strat_data_new_root_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != new_root_tactician_datastructures.new_root_strategy_data_p(v_object) : "! new_root_tactician_datastructures.new_root_strategy_data_p(v_object) " + "new_root_tactician_datastructures.new_root_strategy_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_new_root_strategy_data_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.$new_root_strategy_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NEW_ROOT_INDEX)) {
                        com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures._csetf_nr_strat_data_new_root_index(v_new, current_value);
                    } else {
                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_new_root_strategy_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.$new_root_strategy_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql(new_root_tactician_datastructures.$NEW_ROOT_INDEX)) {
                new_root_tactician_datastructures._csetf_nr_strat_data_new_root_index(v_new, current_value);
            } else {
                Errors.error(new_root_tactician_datastructures.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_new_root_strategy_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, new_root_tactician_datastructures.MAKE_NEW_ROOT_STRATEGY_DATA, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, new_root_tactician_datastructures.$NEW_ROOT_INDEX, new_root_tactician_datastructures.nr_strat_data_new_root_index(obj));
        funcall(visitor_fn, obj, $END, new_root_tactician_datastructures.MAKE_NEW_ROOT_STRATEGY_DATA, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_new_root_strategy_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return new_root_tactician_datastructures.visit_defstruct_new_root_strategy_data(obj, visitor_fn);
    }

    public static final SubLObject new_new_root_strategy_data_alt(SubLObject new_root_index) {
        {
            SubLObject data = com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.make_new_root_strategy_data(UNPROVIDED);
            com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures._csetf_nr_strat_data_new_root_index(data, new_root_index);
            return data;
        }
    }

    public static SubLObject new_new_root_strategy_data(final SubLObject new_root_index) {
        final SubLObject data = new_root_tactician_datastructures.make_new_root_strategy_data(UNPROVIDED);
        new_root_tactician_datastructures._csetf_nr_strat_data_new_root_index(data, new_root_index);
        return data;
    }

    public static final SubLObject new_root_strategy_new_root_index_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, NEW_ROOT_STRATEGY_P);
        {
            SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
            return com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.nr_strat_data_new_root_index(data);
        }
    }

    public static SubLObject new_root_strategy_new_root_index(final SubLObject strategy) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : "! new_root_tactician.new_root_strategy_p(strategy) " + ("new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) ") + strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return new_root_tactician_datastructures.nr_strat_data_new_root_index(data);
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM is actively being considered a new root by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM is actively being considered a new root by STRATEGY.")
    public static final SubLObject new_root_strategy_problem_activeP_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy);
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM is actively being considered a new root by STRATEGY.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM is actively being considered a new root by STRATEGY.")
    public static SubLObject new_root_strategy_problem_activeP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy);
    }

    /**
     * note N
     */
    @LispMethod(comment = "note N")
    public static final SubLObject new_root_strategy_note_problem_motivated_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, NEW_ROOT_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }

    @LispMethod(comment = "note N")
    public static SubLObject new_root_strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : "! new_root_tactician.new_root_strategy_p(strategy) " + ("new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }

    public static final SubLObject new_root_strategy_pop_new_root_alt(SubLObject strategy) {
        {
            SubLObject new_root_index = com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy);
            SubLObject problem = queues.dequeue(new_root_index);
            if (NIL != inference_datastructures_problem.problem_p(problem)) {
                inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
            }
            return problem;
        }
    }

    public static SubLObject new_root_strategy_pop_new_root(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_root_index = new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy);
        thread.resetMultipleValues();
        final SubLObject best_problem = inference_tactician.happiness_index_next(new_root_index);
        final SubLObject expected_happiness = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_datastructures_problem.problem_p(best_problem)) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, best_problem);
        }
        return best_problem;
    }

    public static final SubLObject new_root_strategy_no_new_rootsP_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, NEW_ROOT_STRATEGY_P);
        return queues.queue_empty_p(com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy));
    }

    public static SubLObject new_root_strategy_no_new_rootsP(final SubLObject strategy) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : "! new_root_tactician.new_root_strategy_p(strategy) " + ("new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) ") + strategy;
        return inference_tactician.happiness_index_empty_p(new_root_tactician_datastructures.new_root_strategy_new_root_index(strategy));
    }

    public static final SubLObject declare_new_root_tactician_datastructures_file_alt() {
        declareFunction("new_root_strategy_data_print_function_trampoline", "NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("new_root_strategy_data_p", "NEW-ROOT-STRATEGY-DATA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.$new_root_strategy_data_p$UnaryFunction();
        declareFunction("nr_strat_data_new_root_index", "NR-STRAT-DATA-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction("_csetf_nr_strat_data_new_root_index", "_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX", 2, 0, false);
        declareFunction("make_new_root_strategy_data", "MAKE-NEW-ROOT-STRATEGY-DATA", 0, 1, false);
        declareFunction("new_new_root_strategy_data", "NEW-NEW-ROOT-STRATEGY-DATA", 1, 0, false);
        declareFunction("new_root_strategy_new_root_index", "NEW-ROOT-STRATEGY-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction("new_root_strategy_problem_activeP", "NEW-ROOT-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        declareFunction("new_root_strategy_peek_new_root", "NEW-ROOT-STRATEGY-PEEK-NEW-ROOT", 1, 0, false);
        declareFunction("new_root_strategy_note_problem_motivated", "NEW-ROOT-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction("new_root_strategy_add_new_root", "NEW-ROOT-STRATEGY-ADD-NEW-ROOT", 2, 0, false);
        declareFunction("new_root_strategy_pop_new_root", "NEW-ROOT-STRATEGY-POP-NEW-ROOT", 1, 0, false);
        declareFunction("new_root_strategy_no_new_rootsP", "NEW-ROOT-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_new_root_tactician_datastructures_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("new_root_strategy_data_print_function_trampoline", "NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("new_root_strategy_data_p", "NEW-ROOT-STRATEGY-DATA-P", 1, 0, false);
            new new_root_tactician_datastructures.$new_root_strategy_data_p$UnaryFunction();
            declareFunction("nr_strat_data_new_root_index", "NR-STRAT-DATA-NEW-ROOT-INDEX", 1, 0, false);
            declareFunction("_csetf_nr_strat_data_new_root_index", "_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX", 2, 0, false);
            declareFunction("make_new_root_strategy_data", "MAKE-NEW-ROOT-STRATEGY-DATA", 0, 1, false);
            declareFunction("visit_defstruct_new_root_strategy_data", "VISIT-DEFSTRUCT-NEW-ROOT-STRATEGY-DATA", 2, 0, false);
            declareFunction("visit_defstruct_object_new_root_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-STRATEGY-DATA-METHOD", 2, 0, false);
            declareFunction("new_new_root_strategy_data", "NEW-NEW-ROOT-STRATEGY-DATA", 1, 0, false);
            declareFunction("new_root_strategy_new_root_index", "NEW-ROOT-STRATEGY-NEW-ROOT-INDEX", 1, 0, false);
            declareFunction("new_root_strategy_problem_activeP", "NEW-ROOT-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
            declareFunction("new_root_strategy_note_problem_motivated", "NEW-ROOT-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
            declareFunction("new_root_strategy_pop_new_root", "NEW-ROOT-STRATEGY-POP-NEW-ROOT", 1, 0, false);
            declareFunction("new_root_strategy_no_new_rootsP", "NEW-ROOT-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("new_root_strategy_peek_new_root", "NEW-ROOT-STRATEGY-PEEK-NEW-ROOT", 1, 0, false);
            declareFunction("new_root_strategy_add_new_root", "NEW-ROOT-STRATEGY-ADD-NEW-ROOT", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_new_root_tactician_datastructures_file_Previous() {
        declareFunction("new_root_strategy_data_print_function_trampoline", "NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("new_root_strategy_data_p", "NEW-ROOT-STRATEGY-DATA-P", 1, 0, false);
        new new_root_tactician_datastructures.$new_root_strategy_data_p$UnaryFunction();
        declareFunction("nr_strat_data_new_root_index", "NR-STRAT-DATA-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction("_csetf_nr_strat_data_new_root_index", "_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX", 2, 0, false);
        declareFunction("make_new_root_strategy_data", "MAKE-NEW-ROOT-STRATEGY-DATA", 0, 1, false);
        declareFunction("visit_defstruct_new_root_strategy_data", "VISIT-DEFSTRUCT-NEW-ROOT-STRATEGY-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_new_root_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-STRATEGY-DATA-METHOD", 2, 0, false);
        declareFunction("new_new_root_strategy_data", "NEW-NEW-ROOT-STRATEGY-DATA", 1, 0, false);
        declareFunction("new_root_strategy_new_root_index", "NEW-ROOT-STRATEGY-NEW-ROOT-INDEX", 1, 0, false);
        declareFunction("new_root_strategy_problem_activeP", "NEW-ROOT-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        declareFunction("new_root_strategy_note_problem_motivated", "NEW-ROOT-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction("new_root_strategy_pop_new_root", "NEW-ROOT-STRATEGY-POP-NEW-ROOT", 1, 0, false);
        declareFunction("new_root_strategy_no_new_rootsP", "NEW-ROOT-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("NEW-ROOT-INDEX"));

    static private final SubLList $list_alt3 = list(makeKeyword("NEW-ROOT-INDEX"));

    public static SubLObject init_new_root_tactician_datastructures_file() {
        defconstant("*DTP-NEW-ROOT-STRATEGY-DATA*", new_root_tactician_datastructures.NEW_ROOT_STRATEGY_DATA);
        return NIL;
    }

    static private final SubLList $list_alt4 = list(makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX"));

    public static SubLObject setup_new_root_tactician_datastructures_file() {
        register_method($print_object_method_table$.getGlobalValue(), new_root_tactician_datastructures.$dtp_new_root_strategy_data$.getGlobalValue(), symbol_function(new_root_tactician_datastructures.NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(new_root_tactician_datastructures.$list8);
        def_csetf(new_root_tactician_datastructures.NR_STRAT_DATA_NEW_ROOT_INDEX, new_root_tactician_datastructures._CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX);
        identity(new_root_tactician_datastructures.NEW_ROOT_STRATEGY_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), new_root_tactician_datastructures.$dtp_new_root_strategy_data$.getGlobalValue(), symbol_function(new_root_tactician_datastructures.VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void declareFunctions() {
        new_root_tactician_datastructures.declare_new_root_tactician_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        new_root_tactician_datastructures.init_new_root_tactician_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        new_root_tactician_datastructures.setup_new_root_tactician_datastructures_file();
    }

    static {
    }

    public static final class $new_root_strategy_data_native extends SubLStructNative {
        public SubLObject $new_root_index;

        private static final SubLStructDeclNative structDecl;

        public $new_root_strategy_data_native() {
            new_root_tactician_datastructures.$new_root_strategy_data_native.this.$new_root_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return new_root_tactician_datastructures.$new_root_strategy_data_native.this.$new_root_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return new_root_tactician_datastructures.$new_root_strategy_data_native.this.$new_root_index = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures.$new_root_strategy_data_native.class, new_root_tactician_datastructures.NEW_ROOT_STRATEGY_DATA, new_root_tactician_datastructures.NEW_ROOT_STRATEGY_DATA_P, new_root_tactician_datastructures.$list2, new_root_tactician_datastructures.$list3, new String[]{ "$new_root_index" }, new_root_tactician_datastructures.$list4, new_root_tactician_datastructures.$list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $new_root_strategy_data_p$UnaryFunction extends UnaryFunction {
        public $new_root_strategy_data_p$UnaryFunction() {
            super(extractFunctionNamed("NEW-ROOT-STRATEGY-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return new_root_tactician_datastructures.new_root_strategy_data_p(arg1);
        }
    }
}

/**
 * Total time: 51 ms
 */
