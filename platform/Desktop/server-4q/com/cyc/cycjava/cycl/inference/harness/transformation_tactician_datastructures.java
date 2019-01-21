package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transformation_tactician_datastructures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures";
    public static final String myFingerPrint = "6ad4b0ffb58b93181d8313911c6e993da5e26c9bedeb6e22b1c5d626f18d475c";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLSymbol $dtp_transformation_strategy_data$;
    private static final SubLSymbol $kw0$TRANSFORMATION;
    private static final SubLSymbol $sym1$TRANSFORMATION_STRATEGY_DATA;
    private static final SubLSymbol $sym2$TRANSFORMATION_STRATEGY_DATA_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED;
    private static final SubLSymbol $sym11$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED;
    private static final SubLSymbol $sym12$TRANS_STRAT_DATA_PROBLEMS_PENDING;
    private static final SubLSymbol $sym13$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING;
    private static final SubLSymbol $sym14$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX;
    private static final SubLSymbol $sym15$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX;
    private static final SubLSymbol $sym16$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
    private static final SubLSymbol $sym17$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
    private static final SubLSymbol $sym18$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE;
    private static final SubLSymbol $sym19$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE;
    private static final SubLSymbol $sym20$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY;
    private static final SubLSymbol $sym21$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY;
    private static final SubLSymbol $kw22$LINK_HEADS_MOTIVATED;
    private static final SubLSymbol $kw23$PROBLEMS_PENDING;
    private static final SubLSymbol $kw24$TRANSFORMATION_STRATEGEM_INDEX;
    private static final SubLSymbol $kw25$PROBLEM_TOTAL_STRATEGEMS_ACTIVE;
    private static final SubLSymbol $kw26$PROBLEM_STRATEGEMS_SET_ASIDE;
    private static final SubLSymbol $kw27$PROBLEM_STRATEGEMS_THROWN_AWAY;
    private static final SubLString $str28$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw29$BEGIN;
    private static final SubLSymbol $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA;
    private static final SubLSymbol $kw31$SLOT;
    private static final SubLSymbol $kw32$END;
    private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD;
    private static final SubLSymbol $sym34$TRANSFORMATION_STRATEGY_P;
    private static final SubLSymbol $sym35$PROBLEM_P;
    private static final SubLSymbol $sym36$MOTIVATION_STRATEGEM_P;
    private static final SubLSymbol $sym37$STRATEGEM_P;
    private static final SubLSymbol $sym38$TRANSFORMATION_STRATEGEM_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 910L)
    public static SubLObject transformation_strategy_motivation_p(final SubLObject v_object) {
        return Equality.eq(v_object, (SubLObject)transformation_tactician_datastructures.$kw0$TRANSFORMATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject transformation_strategy_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)transformation_tactician_datastructures.ZERO_INTEGER);
        return (SubLObject)transformation_tactician_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject transformation_strategy_data_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $transformation_strategy_data_native.class) ? transformation_tactician_datastructures.T : transformation_tactician_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject trans_strat_data_link_heads_motivated(final SubLObject v_object) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject trans_strat_data_problems_pending(final SubLObject v_object) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject trans_strat_data_transformation_strategem_index(final SubLObject v_object) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject trans_strat_data_problem_total_strategems_active(final SubLObject v_object) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject trans_strat_data_problem_strategems_set_aside(final SubLObject v_object) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject trans_strat_data_problem_strategems_thrown_away(final SubLObject v_object) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject _csetf_trans_strat_data_link_heads_motivated(final SubLObject v_object, final SubLObject value) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject _csetf_trans_strat_data_problems_pending(final SubLObject v_object, final SubLObject value) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject _csetf_trans_strat_data_transformation_strategem_index(final SubLObject v_object, final SubLObject value) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject _csetf_trans_strat_data_problem_total_strategems_active(final SubLObject v_object, final SubLObject value) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject _csetf_trans_strat_data_problem_strategems_set_aside(final SubLObject v_object, final SubLObject value) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject _csetf_trans_strat_data_problem_strategems_thrown_away(final SubLObject v_object, final SubLObject value) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_data_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject make_transformation_strategy_data(SubLObject arglist) {
        if (arglist == transformation_tactician_datastructures.UNPROVIDED) {
            arglist = (SubLObject)transformation_tactician_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $transformation_strategy_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)transformation_tactician_datastructures.NIL, next = arglist; transformation_tactician_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)transformation_tactician_datastructures.$kw22$LINK_HEADS_MOTIVATED)) {
                _csetf_trans_strat_data_link_heads_motivated(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_tactician_datastructures.$kw23$PROBLEMS_PENDING)) {
                _csetf_trans_strat_data_problems_pending(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_tactician_datastructures.$kw24$TRANSFORMATION_STRATEGEM_INDEX)) {
                _csetf_trans_strat_data_transformation_strategem_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_tactician_datastructures.$kw25$PROBLEM_TOTAL_STRATEGEMS_ACTIVE)) {
                _csetf_trans_strat_data_problem_total_strategems_active(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_tactician_datastructures.$kw26$PROBLEM_STRATEGEMS_SET_ASIDE)) {
                _csetf_trans_strat_data_problem_strategems_set_aside(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)transformation_tactician_datastructures.$kw27$PROBLEM_STRATEGEMS_THROWN_AWAY)) {
                _csetf_trans_strat_data_problem_strategems_thrown_away(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)transformation_tactician_datastructures.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject visit_defstruct_transformation_strategy_data(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_tactician_datastructures.$kw29$BEGIN, (SubLObject)transformation_tactician_datastructures.$sym30$MAKE_TRANSFORMATION_STRATEGY_DATA, (SubLObject)transformation_tactician_datastructures.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_tactician_datastructures.$kw31$SLOT, (SubLObject)transformation_tactician_datastructures.$kw22$LINK_HEADS_MOTIVATED, trans_strat_data_link_heads_motivated(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_tactician_datastructures.$kw31$SLOT, (SubLObject)transformation_tactician_datastructures.$kw23$PROBLEMS_PENDING, trans_strat_data_problems_pending(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_tactician_datastructures.$kw31$SLOT, (SubLObject)transformation_tactician_datastructures.$kw24$TRANSFORMATION_STRATEGEM_INDEX, trans_strat_data_transformation_strategem_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_tactician_datastructures.$kw31$SLOT, (SubLObject)transformation_tactician_datastructures.$kw25$PROBLEM_TOTAL_STRATEGEMS_ACTIVE, trans_strat_data_problem_total_strategems_active(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_tactician_datastructures.$kw31$SLOT, (SubLObject)transformation_tactician_datastructures.$kw26$PROBLEM_STRATEGEMS_SET_ASIDE, trans_strat_data_problem_strategems_set_aside(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_tactician_datastructures.$kw31$SLOT, (SubLObject)transformation_tactician_datastructures.$kw27$PROBLEM_STRATEGEMS_THROWN_AWAY, trans_strat_data_problem_strategems_thrown_away(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)transformation_tactician_datastructures.$kw32$END, (SubLObject)transformation_tactician_datastructures.$sym30$MAKE_TRANSFORMATION_STRATEGY_DATA, (SubLObject)transformation_tactician_datastructures.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1471L)
    public static SubLObject visit_defstruct_object_transformation_strategy_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_transformation_strategy_data(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 2898L)
    public static SubLObject transformation_strategy_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((transformation_tactician_datastructures.NIL != inference_datastructures_strategy.strategy_p(v_object) && transformation_tactician_datastructures.$kw0$TRANSFORMATION == inference_datastructures_strategy.strategy_type(v_object)) || transformation_tactician_datastructures.NIL != abductive_tactician.abductive_strategy_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 3196L)
    public static SubLObject new_transformation_strategy_data(final SubLObject transformation_index) {
        final SubLObject data = make_transformation_strategy_data((SubLObject)transformation_tactician_datastructures.UNPROVIDED);
        _csetf_trans_strat_data_link_heads_motivated(data, set.new_set(Symbols.symbol_function((SubLObject)transformation_tactician_datastructures.EQ), (SubLObject)transformation_tactician_datastructures.UNPROVIDED));
        _csetf_trans_strat_data_problems_pending(data, set.new_set(Symbols.symbol_function((SubLObject)transformation_tactician_datastructures.EQ), (SubLObject)transformation_tactician_datastructures.UNPROVIDED));
        _csetf_trans_strat_data_transformation_strategem_index(data, transformation_index);
        _csetf_trans_strat_data_problem_total_strategems_active(data, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)transformation_tactician_datastructures.EQ), (SubLObject)transformation_tactician_datastructures.UNPROVIDED));
        _csetf_trans_strat_data_problem_strategems_set_aside(data, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)transformation_tactician_datastructures.EQ), (SubLObject)transformation_tactician_datastructures.UNPROVIDED));
        _csetf_trans_strat_data_problem_strategems_thrown_away(data, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)transformation_tactician_datastructures.EQ), (SubLObject)transformation_tactician_datastructures.UNPROVIDED));
        return data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 3946L)
    public static SubLObject transformation_strategy_link_heads_motivated(final SubLObject strategy) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_link_heads_motivated(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 4248L)
    public static SubLObject transformation_strategy_problems_pending(final SubLObject strategy) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problems_pending(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 4493L)
    public static SubLObject transformation_strategy_transformation_strategem_index(final SubLObject strategy) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_transformation_strategem_index(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 4775L)
    public static SubLObject transformation_strategy_problem_total_strategems_active(final SubLObject strategy) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problem_total_strategems_active(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 5088L)
    public static SubLObject transformation_strategy_problem_strategems_set_aside(final SubLObject strategy) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problem_strategems_set_aside(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 5397L)
    public static SubLObject transformation_strategy_problem_strategems_thrown_away(final SubLObject strategy) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return trans_strat_data_problem_strategems_thrown_away(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 5707L)
    public static SubLObject transformation_strategy_problem_motivatedP(final SubLObject strategy, final SubLObject problem) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return inference_datastructures_strategy.problem_motivatedP(problem, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6000L)
    public static SubLObject transformation_strategy_link_head_motivatedP(final SubLObject strategy, final SubLObject link_head) {
        assert transformation_tactician_datastructures.NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        return set.set_memberP(link_head, transformation_strategy_link_heads_motivated(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6312L)
    public static SubLObject transformation_strategy_problem_pendingP(final SubLObject strategy, final SubLObject problem) {
        assert transformation_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return set.set_memberP(problem, transformation_strategy_problems_pending(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6555L)
    public static SubLObject transformation_strategy_problem_activeP(final SubLObject strategy, final SubLObject problem) {
        assert transformation_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        final SubLObject index = transformation_strategy_problem_total_strategems_active(strategy);
        return Numbers.plusp(dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)transformation_tactician_datastructures.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 6923L)
    public static SubLObject transformation_strategy_problem_set_asideP(final SubLObject strategy, final SubLObject problem) {
        assert transformation_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        if (transformation_tactician_datastructures.NIL == transformation_strategy_problem_activeP(strategy, problem)) {
            final SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
            final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)transformation_tactician_datastructures.NIL);
            if (transformation_tactician_datastructures.NIL != v_set && transformation_tactician_datastructures.NIL == set.set_emptyP(v_set)) {
                return (SubLObject)transformation_tactician_datastructures.T;
            }
        }
        return (SubLObject)transformation_tactician_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 7990L)
    public static SubLObject transformation_strategy_strategem_set_asideP(final SubLObject strategy, final SubLObject strategem) {
        assert transformation_tactician_datastructures.NIL != inference_tactician.strategem_p(strategem) : strategem;
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        final SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
        final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)transformation_tactician_datastructures.NIL);
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_tactician_datastructures.NIL != set.set_p(v_set) && transformation_tactician_datastructures.NIL != set.set_memberP(strategem, v_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 8481L)
    public static SubLObject transformation_strategy_strategem_thrown_awayP(final SubLObject strategy, final SubLObject strategem) {
        assert transformation_tactician_datastructures.NIL != inference_tactician.strategem_p(strategem) : strategem;
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        final SubLObject index = transformation_strategy_problem_strategems_thrown_away(strategy);
        final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)transformation_tactician_datastructures.NIL);
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_tactician_datastructures.NIL != set.set_p(v_set) && transformation_tactician_datastructures.NIL != set.set_memberP(strategem, v_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 8939L)
    public static SubLObject transformation_strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9192L)
    public static SubLObject transformation_strategy_note_link_head_motivated(final SubLObject strategy, final SubLObject link_head) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_datastructures.NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        return set.set_add(link_head, transformation_strategy_link_heads_motivated(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9475L)
    public static SubLObject transformation_strategy_note_problem_pending(final SubLObject strategy, final SubLObject problem) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return set.set_add(problem, transformation_strategy_problems_pending(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9720L)
    public static SubLObject transformation_strategy_note_problem_unpending(final SubLObject strategy, final SubLObject problem) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return set.set_remove(problem, transformation_strategy_problems_pending(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 9970L)
    public static SubLObject transformation_strategy_activate_strategem(final SubLObject strategy, final SubLObject transformation_strategem) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_datastructures.NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : transformation_strategem;
        if (transformation_tactician_datastructures.NIL != inference_worker_transformation.transformation_tactic_p(transformation_strategem) && transformation_tactician_datastructures.NIL != inference_datastructures_tactic.tactic_executedP(transformation_strategem)) {
            return transformation_tactician_motivation.transformation_strategy_activate_transformation_argument_links(strategy, inference_datastructures_tactic.tactic_problem(transformation_strategem));
        }
        SubLObject result = (SubLObject)transformation_tactician_datastructures.NIL;
        result = transformation_tactician.transformation_strategy_activate_strategem_low(strategy, transformation_strategem);
        if (transformation_tactician_datastructures.NIL != result) {
            final SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
            final SubLObject index = transformation_strategy_problem_total_strategems_active(strategy);
            SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)transformation_tactician_datastructures.ZERO_INTEGER);
            count = Numbers.add(count, (SubLObject)transformation_tactician_datastructures.ONE_INTEGER);
            if (transformation_tactician_datastructures.ONE_INTEGER.numE(count)) {
                transformation_strategy_note_problem_unpending(strategy, problem);
            }
            dictionary.dictionary_enter(index, problem, count);
            return count;
        }
        return (SubLObject)transformation_tactician_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 11587L)
    public static SubLObject transformation_strategy_note_strategem_set_aside(final SubLObject strategy, final SubLObject transformation_strategem) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_datastructures.NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : transformation_strategem;
        final SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
        final SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)transformation_tactician_datastructures.NIL);
        if (transformation_tactician_datastructures.NIL == set.set_p(v_set)) {
            v_set = set.new_set(Symbols.symbol_function((SubLObject)transformation_tactician_datastructures.EQ), (SubLObject)transformation_tactician_datastructures.UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set.set_add(transformation_strategem, v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 12181L)
    public static SubLObject transformation_strategy_clear_strategems_set_aside(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        final SubLObject index = transformation_strategy_problem_strategems_set_aside(strategy);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index)); transformation_tactician_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject strategem_set = thread.secondMultipleValue();
            thread.resetMultipleValues();
            transformation_strategy_note_problem_unpending(strategy, problem);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(index);
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 12591L)
    public static SubLObject transformation_strategy_note_strategem_thrown_away(final SubLObject strategy, final SubLObject transformation_strategem) {
        assert transformation_tactician_datastructures.NIL != transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_datastructures.NIL != inference_tactician.transformation_strategem_p(transformation_strategem) : transformation_strategem;
        final SubLObject index = transformation_strategy_problem_strategems_thrown_away(strategy);
        final SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)transformation_tactician_datastructures.NIL);
        if (transformation_tactician_datastructures.NIL == set.set_p(v_set)) {
            v_set = set.new_set(Symbols.symbol_function((SubLObject)transformation_tactician_datastructures.EQ), (SubLObject)transformation_tactician_datastructures.UNPROVIDED);
            dictionary.dictionary_enter(index, problem, v_set);
        }
        return set.set_add(transformation_strategem, v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 13175L)
    public static SubLObject transformation_strategy_clear_set_aside_problems(final SubLObject strategy) {
        transformation_strategy_clear_strategems_set_aside(strategy);
        return strategy;
    }
    
    public static SubLObject declare_transformation_tactician_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_motivation_p", "TRANSFORMATION-STRATEGY-MOTIVATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_data_print_function_trampoline", "TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_data_p", "TRANSFORMATION-STRATEGY-DATA-P", 1, 0, false);
        new $transformation_strategy_data_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "trans_strat_data_link_heads_motivated", "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "trans_strat_data_problems_pending", "TRANS-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "trans_strat_data_transformation_strategem_index", "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "trans_strat_data_problem_total_strategems_active", "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "trans_strat_data_problem_strategems_set_aside", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "trans_strat_data_problem_strategems_thrown_away", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "_csetf_trans_strat_data_link_heads_motivated", "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "_csetf_trans_strat_data_problems_pending", "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "_csetf_trans_strat_data_transformation_strategem_index", "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "_csetf_trans_strat_data_problem_total_strategems_active", "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "_csetf_trans_strat_data_problem_strategems_set_aside", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "_csetf_trans_strat_data_problem_strategems_thrown_away", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "make_transformation_strategy_data", "MAKE-TRANSFORMATION-STRATEGY-DATA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "visit_defstruct_transformation_strategy_data", "VISIT-DEFSTRUCT-TRANSFORMATION-STRATEGY-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "visit_defstruct_object_transformation_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_p", "TRANSFORMATION-STRATEGY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "new_transformation_strategy_data", "NEW-TRANSFORMATION-STRATEGY-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_link_heads_motivated", "TRANSFORMATION-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_problems_pending", "TRANSFORMATION-STRATEGY-PROBLEMS-PENDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_transformation_strategem_index", "TRANSFORMATION-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_problem_total_strategems_active", "TRANSFORMATION-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_problem_strategems_set_aside", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_problem_strategems_thrown_away", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_problem_motivatedP", "TRANSFORMATION-STRATEGY-PROBLEM-MOTIVATED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_link_head_motivatedP", "TRANSFORMATION-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_problem_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-PENDING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_problem_activeP", "TRANSFORMATION-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_problem_set_asideP", "TRANSFORMATION-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_strategem_set_asideP", "TRANSFORMATION-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_strategem_thrown_awayP", "TRANSFORMATION-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_note_problem_motivated", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_note_link_head_motivated", "TRANSFORMATION-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_note_problem_pending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_note_problem_unpending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_activate_strategem", "TRANSFORMATION-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_note_strategem_set_aside", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_clear_strategems_set_aside", "TRANSFORMATION-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_note_strategem_thrown_away", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures", "transformation_strategy_clear_set_aside_problems", "TRANSFORMATION-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
        return (SubLObject)transformation_tactician_datastructures.NIL;
    }
    
    public static SubLObject init_transformation_tactician_datastructures_file() {
        transformation_tactician_datastructures.$dtp_transformation_strategy_data$ = SubLFiles.defconstant("*DTP-TRANSFORMATION-STRATEGY-DATA*", (SubLObject)transformation_tactician_datastructures.$sym1$TRANSFORMATION_STRATEGY_DATA);
        return (SubLObject)transformation_tactician_datastructures.NIL;
    }
    
    public static SubLObject setup_transformation_tactician_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), transformation_tactician_datastructures.$dtp_transformation_strategy_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)transformation_tactician_datastructures.$sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)transformation_tactician_datastructures.$list9);
        Structures.def_csetf((SubLObject)transformation_tactician_datastructures.$sym10$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED, (SubLObject)transformation_tactician_datastructures.$sym11$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED);
        Structures.def_csetf((SubLObject)transformation_tactician_datastructures.$sym12$TRANS_STRAT_DATA_PROBLEMS_PENDING, (SubLObject)transformation_tactician_datastructures.$sym13$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING);
        Structures.def_csetf((SubLObject)transformation_tactician_datastructures.$sym14$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, (SubLObject)transformation_tactician_datastructures.$sym15$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX);
        Structures.def_csetf((SubLObject)transformation_tactician_datastructures.$sym16$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, (SubLObject)transformation_tactician_datastructures.$sym17$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE);
        Structures.def_csetf((SubLObject)transformation_tactician_datastructures.$sym18$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, (SubLObject)transformation_tactician_datastructures.$sym19$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE);
        Structures.def_csetf((SubLObject)transformation_tactician_datastructures.$sym20$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, (SubLObject)transformation_tactician_datastructures.$sym21$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY);
        Equality.identity((SubLObject)transformation_tactician_datastructures.$sym1$TRANSFORMATION_STRATEGY_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), transformation_tactician_datastructures.$dtp_transformation_strategy_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)transformation_tactician_datastructures.$sym33$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD));
        return (SubLObject)transformation_tactician_datastructures.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_transformation_tactician_datastructures_file();
    }
    
    @Override
	public void initializeVariables() {
        init_transformation_tactician_datastructures_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_transformation_tactician_datastructures_file();
    }
    
    static {
        me = (SubLFile)new transformation_tactician_datastructures();
        transformation_tactician_datastructures.$dtp_transformation_strategy_data$ = null;
        $kw0$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $sym1$TRANSFORMATION_STRATEGY_DATA = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-DATA");
        $sym2$TRANSFORMATION_STRATEGY_DATA_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-DATA-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-HEADS-MOTIVATED"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEMS-PENDING"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGEM-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-HEADS-MOTIVATED"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEMS-PENDING"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-STRATEGEM-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-DATA-P"));
        $sym10$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");
        $sym11$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");
        $sym12$TRANS_STRAT_DATA_PROBLEMS_PENDING = SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING");
        $sym13$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING = SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING");
        $sym14$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");
        $sym15$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");
        $sym16$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $sym17$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $sym18$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
        $sym19$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
        $sym20$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = SubLObjectFactory.makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
        $sym21$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = SubLObjectFactory.makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
        $kw22$LINK_HEADS_MOTIVATED = SubLObjectFactory.makeKeyword("LINK-HEADS-MOTIVATED");
        $kw23$PROBLEMS_PENDING = SubLObjectFactory.makeKeyword("PROBLEMS-PENDING");
        $kw24$TRANSFORMATION_STRATEGEM_INDEX = SubLObjectFactory.makeKeyword("TRANSFORMATION-STRATEGEM-INDEX");
        $kw25$PROBLEM_TOTAL_STRATEGEMS_ACTIVE = SubLObjectFactory.makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $kw26$PROBLEM_STRATEGEMS_SET_ASIDE = SubLObjectFactory.makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE");
        $kw27$PROBLEM_STRATEGEMS_THROWN_AWAY = SubLObjectFactory.makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY");
        $str28$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw29$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym30$MAKE_TRANSFORMATION_STRATEGY_DATA = SubLObjectFactory.makeSymbol("MAKE-TRANSFORMATION-STRATEGY-DATA");
        $kw31$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw32$END = SubLObjectFactory.makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_TRANSFORMATION_STRATEGY_DATA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSFORMATION-STRATEGY-DATA-METHOD");
        $sym34$TRANSFORMATION_STRATEGY_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-P");
        $sym35$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $sym36$MOTIVATION_STRATEGEM_P = SubLObjectFactory.makeSymbol("MOTIVATION-STRATEGEM-P");
        $sym37$STRATEGEM_P = SubLObjectFactory.makeSymbol("STRATEGEM-P");
        $sym38$TRANSFORMATION_STRATEGEM_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGEM-P");
    }
    
    public static final class $transformation_strategy_data_native extends SubLStructNative
    {
        public SubLObject $link_heads_motivated;
        public SubLObject $problems_pending;
        public SubLObject $transformation_strategem_index;
        public SubLObject $problem_total_strategems_active;
        public SubLObject $problem_strategems_set_aside;
        public SubLObject $problem_strategems_thrown_away;
        private static final SubLStructDeclNative structDecl;
        
        public $transformation_strategy_data_native() {
            this.$link_heads_motivated = (SubLObject)CommonSymbols.NIL;
            this.$problems_pending = (SubLObject)CommonSymbols.NIL;
            this.$transformation_strategem_index = (SubLObject)CommonSymbols.NIL;
            this.$problem_total_strategems_active = (SubLObject)CommonSymbols.NIL;
            this.$problem_strategems_set_aside = (SubLObject)CommonSymbols.NIL;
            this.$problem_strategems_thrown_away = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$transformation_strategy_data_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$link_heads_motivated;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$problems_pending;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$transformation_strategem_index;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$problem_total_strategems_active;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$problem_strategems_set_aside;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$problem_strategems_thrown_away;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$link_heads_motivated = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$problems_pending = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$transformation_strategem_index = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$problem_total_strategems_active = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$problem_strategems_set_aside = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$problem_strategems_thrown_away = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$transformation_strategy_data_native.class, transformation_tactician_datastructures.$sym1$TRANSFORMATION_STRATEGY_DATA, transformation_tactician_datastructures.$sym2$TRANSFORMATION_STRATEGY_DATA_P, transformation_tactician_datastructures.$list3, transformation_tactician_datastructures.$list4, new String[] { "$link_heads_motivated", "$problems_pending", "$transformation_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away" }, transformation_tactician_datastructures.$list5, transformation_tactician_datastructures.$list6, transformation_tactician_datastructures.$sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $transformation_strategy_data_p$UnaryFunction extends UnaryFunction
    {
        public $transformation_strategy_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRANSFORMATION-STRATEGY-DATA-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return transformation_tactician_datastructures.transformation_strategy_data_p(arg1);
        }
    }
}

/*

	Total time: 167 ms
	
*/