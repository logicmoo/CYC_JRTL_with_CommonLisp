package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.arity;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_removal_module_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_utilities";
    public static final String myFingerPrint = "01eed288164bd55a18d61f5b72b280470dcb63715192b329270d3d60d616a545";
    private static final SubLSymbol $kw0$OPAQUE;
    private static final SubLSymbol $sym1$CORBA_REMOVAL_PREDICATE_P;
    private static final SubLSymbol $kw2$FULLY_BOUND;
    private static final SubLSymbol $kw3$NOT_FULLY_BOUND;
    private static final SubLSymbol $sym4$CORBA_REMOVAL_MODULE_GENERIC_EXPAND_FN;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-utilities.lisp", position = 867L)
    public static SubLObject corba_removal_module_generic_expand_fn(final SubLObject literal, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject content_mt = inference_modules.hl_module_required_mt_result(inference_worker.currently_executing_hl_module());
        final SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
        final SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
        final SubLObject corba_predicate = el_utilities.literal_arg0(literal, (SubLObject)corba_removal_module_utilities.UNPROVIDED);
        final SubLObject arg1_var = el_utilities.literal_arg1(literal, (SubLObject)corba_removal_module_utilities.UNPROVIDED);
        SubLObject args = el_utilities.literal_args(literal, (SubLObject)corba_removal_module_utilities.UNPROVIDED);
        if (corba_removal_module_utilities.NIL == corba_utilities.corba_storage_predicate_p(corba_predicate)) {
            args = args.rest();
        }
        final SubLObject result = corba_utilities.corba_connection_eval(corba_connection, corba_predicate, args);
        if (corba_removal_module_utilities.NIL != result) {
            if (corba_removal_module_utilities.NIL != variables.variable_p(arg1_var)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg1_var, result, (SubLObject)corba_removal_module_utilities.T, (SubLObject)corba_removal_module_utilities.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (corba_removal_module_utilities.NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)corba_removal_module_utilities.$kw0$OPAQUE, (SubLObject)ConsesLow.cons(corba_predicate, (SubLObject)ConsesLow.cons(result, args)), (SubLObject)corba_removal_module_utilities.UNPROVIDED, (SubLObject)corba_removal_module_utilities.UNPROVIDED), v_bindings, unify_justification);
                }
            }
            else {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)corba_removal_module_utilities.$kw0$OPAQUE, (SubLObject)ConsesLow.cons(corba_predicate, (SubLObject)ConsesLow.cons(result, args)), (SubLObject)corba_removal_module_utilities.UNPROVIDED, (SubLObject)corba_removal_module_utilities.UNPROVIDED), (SubLObject)corba_removal_module_utilities.NIL, (SubLObject)corba_removal_module_utilities.UNPROVIDED);
            }
        }
        return (SubLObject)corba_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-utilities.lisp", position = 1901L)
    public static SubLObject determine_corba_removal_module_required_pattern(final SubLObject pred) {
        assert corba_removal_module_utilities.NIL != corba_utilities.corba_removal_predicate_p(pred) : pred;
        SubLObject result = (SubLObject)ConsesLow.list(pred);
        if (corba_removal_module_utilities.NIL != corba_utilities.corba_storage_predicate_p(pred)) {
            result = (SubLObject)ConsesLow.cons((SubLObject)corba_removal_module_utilities.$kw2$FULLY_BOUND, result);
        }
        else {
            result = (SubLObject)ConsesLow.cons((SubLObject)corba_removal_module_utilities.$kw3$NOT_FULLY_BOUND, result);
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Numbers.subtract(arity.arity(pred), (SubLObject)corba_removal_module_utilities.ONE_INTEGER), i = (SubLObject)corba_removal_module_utilities.NIL, i = (SubLObject)corba_removal_module_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)corba_removal_module_utilities.ONE_INTEGER)) {
            result = (SubLObject)ConsesLow.cons((SubLObject)corba_removal_module_utilities.$kw2$FULLY_BOUND, result);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-utilities.lisp", position = 2382L)
    public static SubLObject corba_pred_get_removal_module_expand_fn_symbol(final SubLObject pred) {
        assert corba_removal_module_utilities.NIL != corba_utilities.corba_removal_predicate_p(pred) : pred;
        return (SubLObject)corba_removal_module_utilities.$sym4$CORBA_REMOVAL_MODULE_GENERIC_EXPAND_FN;
    }
    
    public static SubLObject declare_corba_removal_module_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_utilities", "corba_removal_module_generic_expand_fn", "CORBA-REMOVAL-MODULE-GENERIC-EXPAND-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_utilities", "determine_corba_removal_module_required_pattern", "DETERMINE-CORBA-REMOVAL-MODULE-REQUIRED-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_utilities", "corba_pred_get_removal_module_expand_fn_symbol", "CORBA-PRED-GET-REMOVAL-MODULE-EXPAND-FN-SYMBOL", 1, 0, false);
        return (SubLObject)corba_removal_module_utilities.NIL;
    }
    
    public static SubLObject init_corba_removal_module_utilities_file() {
        return (SubLObject)corba_removal_module_utilities.NIL;
    }
    
    public static SubLObject setup_corba_removal_module_utilities_file() {
        return (SubLObject)corba_removal_module_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_corba_removal_module_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_corba_removal_module_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_corba_removal_module_utilities_file();
    }
    
    static {
        me = (SubLFile)new corba_removal_module_utilities();
        $kw0$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $sym1$CORBA_REMOVAL_PREDICATE_P = SubLObjectFactory.makeSymbol("CORBA-REMOVAL-PREDICATE-P");
        $kw2$FULLY_BOUND = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $kw3$NOT_FULLY_BOUND = SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND");
        $sym4$CORBA_REMOVAL_MODULE_GENERIC_EXPAND_FN = SubLObjectFactory.makeSymbol("CORBA-REMOVAL-MODULE-GENERIC-EXPAND-FN");
    }
}

/*

	Total time: 31 ms
	
*/