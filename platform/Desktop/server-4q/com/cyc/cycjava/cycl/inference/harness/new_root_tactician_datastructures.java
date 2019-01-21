package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class new_root_tactician_datastructures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures";
    public static final String myFingerPrint = "4d5a8d922f451660de525b94f85b2c83768f2ee2a3002522c16bf2f3b27fad7f";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1094L)
    public static SubLSymbol $dtp_new_root_strategy_data$;
    private static final SubLSymbol $sym0$NEW_ROOT_STRATEGY_DATA;
    private static final SubLSymbol $sym1$NEW_ROOT_STRATEGY_DATA_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$NR_STRAT_DATA_NEW_ROOT_INDEX;
    private static final SubLSymbol $sym10$_CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX;
    private static final SubLSymbol $kw11$NEW_ROOT_INDEX;
    private static final SubLString $str12$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw13$BEGIN;
    private static final SubLSymbol $sym14$MAKE_NEW_ROOT_STRATEGY_DATA;
    private static final SubLSymbol $kw15$SLOT;
    private static final SubLSymbol $kw16$END;
    private static final SubLSymbol $sym17$VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD;
    private static final SubLSymbol $sym18$NEW_ROOT_STRATEGY_P;
    private static final SubLSymbol $sym19$PROBLEM_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1094L)
    public static SubLObject new_root_strategy_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)new_root_tactician_datastructures.ZERO_INTEGER);
        return (SubLObject)new_root_tactician_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1094L)
    public static SubLObject new_root_strategy_data_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $new_root_strategy_data_native.class) ? new_root_tactician_datastructures.T : new_root_tactician_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1094L)
    public static SubLObject nr_strat_data_new_root_index(final SubLObject v_object) {
        assert new_root_tactician_datastructures.NIL != new_root_strategy_data_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1094L)
    public static SubLObject _csetf_nr_strat_data_new_root_index(final SubLObject v_object, final SubLObject value) {
        assert new_root_tactician_datastructures.NIL != new_root_strategy_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1094L)
    public static SubLObject make_new_root_strategy_data(SubLObject arglist) {
        if (arglist == new_root_tactician_datastructures.UNPROVIDED) {
            arglist = (SubLObject)new_root_tactician_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $new_root_strategy_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)new_root_tactician_datastructures.NIL, next = arglist; new_root_tactician_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)new_root_tactician_datastructures.$kw11$NEW_ROOT_INDEX)) {
                _csetf_nr_strat_data_new_root_index(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)new_root_tactician_datastructures.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1094L)
    public static SubLObject visit_defstruct_new_root_strategy_data(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)new_root_tactician_datastructures.$kw13$BEGIN, (SubLObject)new_root_tactician_datastructures.$sym14$MAKE_NEW_ROOT_STRATEGY_DATA, (SubLObject)new_root_tactician_datastructures.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)new_root_tactician_datastructures.$kw15$SLOT, (SubLObject)new_root_tactician_datastructures.$kw11$NEW_ROOT_INDEX, nr_strat_data_new_root_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)new_root_tactician_datastructures.$kw16$END, (SubLObject)new_root_tactician_datastructures.$sym14$MAKE_NEW_ROOT_STRATEGY_DATA, (SubLObject)new_root_tactician_datastructures.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1094L)
    public static SubLObject visit_defstruct_object_new_root_strategy_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_new_root_strategy_data(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1520L)
    public static SubLObject new_new_root_strategy_data(final SubLObject new_root_index) {
        final SubLObject data = make_new_root_strategy_data((SubLObject)new_root_tactician_datastructures.UNPROVIDED);
        _csetf_nr_strat_data_new_root_index(data, new_root_index);
        return data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1726L)
    public static SubLObject new_root_strategy_new_root_index(final SubLObject strategy) {
        assert new_root_tactician_datastructures.NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
        return nr_strat_data_new_root_index(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1996L)
    public static SubLObject new_root_strategy_problem_activeP(final SubLObject strategy, final SubLObject problem) {
        assert new_root_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 2262L)
    public static SubLObject new_root_strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem) {
        assert new_root_tactician_datastructures.NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        assert new_root_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 2503L)
    public static SubLObject new_root_strategy_pop_new_root(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_root_index = new_root_strategy_new_root_index(strategy);
        thread.resetMultipleValues();
        final SubLObject best_problem = inference_tactician.happiness_index_next(new_root_index);
        final SubLObject expected_happiness = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (new_root_tactician_datastructures.NIL != inference_datastructures_problem.problem_p(best_problem)) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, best_problem);
        }
        return best_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 3030L)
    public static SubLObject new_root_strategy_no_new_rootsP(final SubLObject strategy) {
        assert new_root_tactician_datastructures.NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        return inference_tactician.happiness_index_empty_p(new_root_strategy_new_root_index(strategy));
    }
    
    public static SubLObject declare_new_root_tactician_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "new_root_strategy_data_print_function_trampoline", "NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "new_root_strategy_data_p", "NEW-ROOT-STRATEGY-DATA-P", 1, 0, false);
        new $new_root_strategy_data_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "nr_strat_data_new_root_index", "NR-STRAT-DATA-NEW-ROOT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "_csetf_nr_strat_data_new_root_index", "_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "make_new_root_strategy_data", "MAKE-NEW-ROOT-STRATEGY-DATA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "visit_defstruct_new_root_strategy_data", "VISIT-DEFSTRUCT-NEW-ROOT-STRATEGY-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "visit_defstruct_object_new_root_strategy_data_method", "VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-STRATEGY-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "new_new_root_strategy_data", "NEW-NEW-ROOT-STRATEGY-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "new_root_strategy_new_root_index", "NEW-ROOT-STRATEGY-NEW-ROOT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "new_root_strategy_problem_activeP", "NEW-ROOT-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "new_root_strategy_note_problem_motivated", "NEW-ROOT-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "new_root_strategy_pop_new_root", "NEW-ROOT-STRATEGY-POP-NEW-ROOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_datastructures", "new_root_strategy_no_new_rootsP", "NEW-ROOT-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
        return (SubLObject)new_root_tactician_datastructures.NIL;
    }
    
    public static SubLObject init_new_root_tactician_datastructures_file() {
        new_root_tactician_datastructures.$dtp_new_root_strategy_data$ = SubLFiles.defconstant("*DTP-NEW-ROOT-STRATEGY-DATA*", (SubLObject)new_root_tactician_datastructures.$sym0$NEW_ROOT_STRATEGY_DATA);
        return (SubLObject)new_root_tactician_datastructures.NIL;
    }
    
    public static SubLObject setup_new_root_tactician_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), new_root_tactician_datastructures.$dtp_new_root_strategy_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)new_root_tactician_datastructures.$sym7$NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)new_root_tactician_datastructures.$list8);
        Structures.def_csetf((SubLObject)new_root_tactician_datastructures.$sym9$NR_STRAT_DATA_NEW_ROOT_INDEX, (SubLObject)new_root_tactician_datastructures.$sym10$_CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX);
        Equality.identity((SubLObject)new_root_tactician_datastructures.$sym0$NEW_ROOT_STRATEGY_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), new_root_tactician_datastructures.$dtp_new_root_strategy_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)new_root_tactician_datastructures.$sym17$VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD));
        return (SubLObject)new_root_tactician_datastructures.NIL;
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
        me = (SubLFile)new new_root_tactician_datastructures();
        new_root_tactician_datastructures.$dtp_new_root_strategy_data$ = null;
        $sym0$NEW_ROOT_STRATEGY_DATA = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-DATA");
        $sym1$NEW_ROOT_STRATEGY_DATA_P = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-DATA-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ROOT-INDEX"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-ROOT-INDEX"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-DATA-P"));
        $sym9$NR_STRAT_DATA_NEW_ROOT_INDEX = SubLObjectFactory.makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX");
        $sym10$_CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX = SubLObjectFactory.makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX");
        $kw11$NEW_ROOT_INDEX = SubLObjectFactory.makeKeyword("NEW-ROOT-INDEX");
        $str12$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw13$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym14$MAKE_NEW_ROOT_STRATEGY_DATA = SubLObjectFactory.makeSymbol("MAKE-NEW-ROOT-STRATEGY-DATA");
        $kw15$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw16$END = SubLObjectFactory.makeKeyword("END");
        $sym17$VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_STRATEGY_DATA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-STRATEGY-DATA-METHOD");
        $sym18$NEW_ROOT_STRATEGY_P = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-P");
        $sym19$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
    }
    
    public static final class $new_root_strategy_data_native extends SubLStructNative
    {
        public SubLObject $new_root_index;
        private static final SubLStructDeclNative structDecl;
        
        public $new_root_strategy_data_native() {
            this.$new_root_index = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$new_root_strategy_data_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$new_root_strategy_data_native.class, new_root_tactician_datastructures.$sym0$NEW_ROOT_STRATEGY_DATA, new_root_tactician_datastructures.$sym1$NEW_ROOT_STRATEGY_DATA_P, new_root_tactician_datastructures.$list2, new_root_tactician_datastructures.$list3, new String[] { "$new_root_index" }, new_root_tactician_datastructures.$list4, new_root_tactician_datastructures.$list5, new_root_tactician_datastructures.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $new_root_strategy_data_p$UnaryFunction extends UnaryFunction
    {
        public $new_root_strategy_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NEW-ROOT-STRATEGY-DATA-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return new_root_tactician_datastructures.new_root_strategy_data_p(arg1);
        }
    }
}

/*

	Total time: 51 ms
	
*/