package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hl_macros";
    public static final String myFingerPrint = "7f5f2375d6d460bf63953eb5b87408d57d40df0fa28089a352422f3555c3be5b";
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 964L)
    public static SubLSymbol $forts_being_removed$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2488L)
    public static SubLSymbol $forward_inference_metric_last_metric_type$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2737L)
    public static SubLSymbol $forward_inference_metric_last_metric$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2821L)
    public static SubLSymbol $forward_inference_metric_last_forward_inference_gaf$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2905L)
    public static SubLSymbol $forward_inference_metric_last_forward_inference_rule$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PWHEN;
    private static final SubLSymbol $sym2$_RECORDING_HL_TRANSCRIPT_OPERATIONS__;
    private static final SubLSymbol $sym3$RECORD_HL_TRANSCRIPT_OPERATION;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$CLET;
    private static final SubLSymbol $sym6$_FORTS_BEING_REMOVED_;
    private static final SubLSymbol $sym7$CONS;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$KBEQ;
    private static final SubLObject $const10$termDependsOn;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$OUTERMOST_INIT_;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$CUNWIND_PROTECT;
    private static final SubLSymbol $sym15$_FORWARD_INFERENCE_LAST_METRIC_TIME_;
    private static final SubLSymbol $sym16$FIF;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$POSSIBLY_WITH_FORWARD_INFERENCE_METRIC_PROFILING;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$PROGN;
    private static final SubLSymbol $sym21$PUNLESS;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$LAST_METRIC_TYPE;
    private static final SubLSymbol $sym25$LAST_METRIC;
    private static final SubLSymbol $sym26$LAST_GAF;
    private static final SubLSymbol $sym27$LAST_RULE;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$CAND;
    private static final SubLSymbol $sym33$INCREMENT_FORWARD_INFERENCE_METRICS;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$_FORWARD_INFERENCE_METRIC_LAST_METRIC_TYPE_;
    private static final SubLSymbol $sym36$_FORWARD_INFERENCE_METRIC_LAST_METRIC_;
    private static final SubLSymbol $sym37$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_GAF_;
    private static final SubLSymbol $sym38$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_RULE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 798L)
    public static SubLObject possibly_record_hl_transcript_operation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = (SubLObject)hl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_macros.$list0);
        form = current.first();
        current = current.rest();
        if (hl_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym1$PWHEN, (SubLObject)hl_macros.$sym2$_RECORDING_HL_TRANSCRIPT_OPERATIONS__, (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym3$RECORD_HL_TRANSCRIPT_OPERATION, form));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_macros.$list0);
        return (SubLObject)hl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1159L)
    public static SubLObject note_fort_being_removed(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_macros.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = (SubLObject)hl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_macros.$list4);
        fort = current.first();
        current = current.rest();
        if (hl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)hl_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym6$_FORTS_BEING_REMOVED_, (SubLObject)ConsesLow.listS((SubLObject)hl_macros.$sym7$CONS, fort, (SubLObject)hl_macros.$list8))), ConsesLow.append(body, (SubLObject)hl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_macros.$list4);
        return (SubLObject)hl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1315L)
    public static SubLObject some_fort_being_removedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(hl_macros.$forts_being_removed$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1462L)
    public static SubLObject fort_being_removedP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.member_kbeqP(fort, hl_macros.$forts_being_removed$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1613L)
    public static SubLObject forts_being_removed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.copy_list(hl_macros.$forts_being_removed$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1698L)
    public static SubLObject forts_that_will_be_removed() {
        SubLObject forts_to_process = forts_being_removed();
        SubLObject result = forts_being_removed();
        while (hl_macros.NIL != forts_to_process) {
            final SubLObject fort_to_process = forts_to_process.first();
            forts_to_process = forts_to_process.rest();
            final SubLObject item_var = fort_to_process;
            if (hl_macros.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)hl_macros.$sym9$KBEQ), Symbols.symbol_function((SubLObject)hl_macros.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(item_var, result);
            }
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(fort_to_process, hl_macros.$const10$termDependsOn, (SubLObject)hl_macros.TWO_INTEGER, (SubLObject)hl_macros.ONE_INTEGER, (SubLObject)hl_macros.UNPROVIDED);
            SubLObject dependent_term = (SubLObject)hl_macros.NIL;
            dependent_term = cdolist_list_var.first();
            while (hl_macros.NIL != cdolist_list_var) {
                if (hl_macros.NIL == list_utilities.member_kbeqP(dependent_term, result)) {
                    final SubLObject item_var2 = dependent_term;
                    if (hl_macros.NIL == conses_high.member(item_var2, forts_to_process, Symbols.symbol_function((SubLObject)hl_macros.EQL), Symbols.symbol_function((SubLObject)hl_macros.IDENTITY))) {
                        forts_to_process = (SubLObject)ConsesLow.cons(item_var2, forts_to_process);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                dependent_term = cdolist_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2327L)
    public static SubLObject fort_being_removed_or_will_be_removedP(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_macros.NIL != fort_being_removedP(fort) || hl_macros.NIL != list_utilities.member_kbeqP(fort, forts_that_will_be_removed()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2989L)
    public static SubLObject with_forward_inference_metric_profiling_initialized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_macros.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject metric_type = (SubLObject)hl_macros.NIL;
        SubLObject metric = (SubLObject)hl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_macros.$list11);
        metric_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_macros.$list11);
        metric = current.first();
        current = current.rest();
        if (hl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject outermost_initP = (SubLObject)hl_macros.$sym12$OUTERMOST_INIT_;
            return (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym5$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(outermost_initP, (SubLObject)hl_macros.$list13)), (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym14$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym15$_FORWARD_INFERENCE_LAST_METRIC_TIME_, (SubLObject)ConsesLow.listS((SubLObject)hl_macros.$sym16$FIF, outermost_initP, (SubLObject)hl_macros.$list17))), (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym18$POSSIBLY_WITH_FORWARD_INFERENCE_METRIC_PROFILING, (SubLObject)ConsesLow.listS(metric_type, metric, (SubLObject)hl_macros.$list19), reader.bq_cons((SubLObject)hl_macros.$sym20$PROGN, ConsesLow.append(body, (SubLObject)hl_macros.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)hl_macros.$sym21$PUNLESS, outermost_initP, (SubLObject)hl_macros.$list22)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_macros.$list11);
        return (SubLObject)hl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 3647L)
    public static SubLObject possibly_with_forward_inference_metric_profiling(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_macros.$list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject metric_type = (SubLObject)hl_macros.NIL;
        SubLObject metric = (SubLObject)hl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_macros.$list23);
        metric_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_macros.$list23);
        metric = current.first();
        current = current.rest();
        final SubLObject gaf = (SubLObject)(current.isCons() ? current.first() : hl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_macros.$list23);
        current = current.rest();
        final SubLObject rule = (SubLObject)(current.isCons() ? current.first() : hl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_macros.$list23);
        current = current.rest();
        final SubLObject count = (SubLObject)(current.isCons() ? current.first() : hl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_macros.$list23);
        current = current.rest();
        if (hl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject last_metric_type = (SubLObject)hl_macros.$sym24$LAST_METRIC_TYPE;
            final SubLObject last_metric = (SubLObject)hl_macros.$sym25$LAST_METRIC;
            final SubLObject last_gaf = (SubLObject)hl_macros.$sym26$LAST_GAF;
            final SubLObject last_rule = (SubLObject)hl_macros.$sym27$LAST_RULE;
            return (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym5$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(last_metric_type, (SubLObject)hl_macros.$list28), reader.bq_cons(last_metric, (SubLObject)hl_macros.$list29), reader.bq_cons(last_gaf, (SubLObject)hl_macros.$list30), reader.bq_cons(last_rule, (SubLObject)hl_macros.$list31)), (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym32$CAND, last_metric_type, last_metric), (SubLObject)ConsesLow.listS((SubLObject)hl_macros.$sym33$INCREMENT_FORWARD_INFERENCE_METRICS, last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)hl_macros.$list34)), (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym35$_FORWARD_INFERENCE_METRIC_LAST_METRIC_TYPE_, metric_type), (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym36$_FORWARD_INFERENCE_METRIC_LAST_METRIC_, metric), (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym37$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_GAF_, gaf), (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym38$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_RULE_, rule)), (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym14$CUNWIND_PROTECT, reader.bq_cons((SubLObject)hl_macros.$sym20$PROGN, ConsesLow.append(body, (SubLObject)hl_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)hl_macros.$sym33$INCREMENT_FORWARD_INFERENCE_METRICS, metric_type, metric, gaf, rule, count))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_macros.$list23);
        return (SubLObject)hl_macros.NIL;
    }
    
    public static SubLObject declare_hl_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_macros", "possibly_record_hl_transcript_operation", "POSSIBLY-RECORD-HL-TRANSCRIPT-OPERATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_macros", "note_fort_being_removed", "NOTE-FORT-BEING-REMOVED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_macros", "some_fort_being_removedP", "SOME-FORT-BEING-REMOVED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_macros", "fort_being_removedP", "FORT-BEING-REMOVED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_macros", "forts_being_removed", "FORTS-BEING-REMOVED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_macros", "forts_that_will_be_removed", "FORTS-THAT-WILL-BE-REMOVED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_macros", "fort_being_removed_or_will_be_removedP", "FORT-BEING-REMOVED-OR-WILL-BE-REMOVED?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_macros", "with_forward_inference_metric_profiling_initialized", "WITH-FORWARD-INFERENCE-METRIC-PROFILING-INITIALIZED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_macros", "possibly_with_forward_inference_metric_profiling", "POSSIBLY-WITH-FORWARD-INFERENCE-METRIC-PROFILING");
        return (SubLObject)hl_macros.NIL;
    }
    
    public static SubLObject init_hl_macros_file() {
        hl_macros.$forts_being_removed$ = SubLFiles.defparameter("*FORTS-BEING-REMOVED*", (SubLObject)hl_macros.NIL);
        hl_macros.$forward_inference_metric_last_metric_type$ = SubLFiles.defparameter("*FORWARD-INFERENCE-METRIC-LAST-METRIC-TYPE*", (SubLObject)hl_macros.NIL);
        hl_macros.$forward_inference_metric_last_metric$ = SubLFiles.defparameter("*FORWARD-INFERENCE-METRIC-LAST-METRIC*", (SubLObject)hl_macros.NIL);
        hl_macros.$forward_inference_metric_last_forward_inference_gaf$ = SubLFiles.defparameter("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-GAF*", (SubLObject)hl_macros.NIL);
        hl_macros.$forward_inference_metric_last_forward_inference_rule$ = SubLFiles.defparameter("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-RULE*", (SubLObject)hl_macros.NIL);
        return (SubLObject)hl_macros.NIL;
    }
    
    public static SubLObject setup_hl_macros_file() {
        return (SubLObject)hl_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_hl_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_hl_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_hl_macros_file();
    }
    
    static {
        me = (SubLFile)new hl_macros();
        hl_macros.$forts_being_removed$ = null;
        hl_macros.$forward_inference_metric_last_metric_type$ = null;
        hl_macros.$forward_inference_metric_last_metric$ = null;
        hl_macros.$forward_inference_metric_last_forward_inference_gaf$ = null;
        hl_macros.$forward_inference_metric_last_forward_inference_rule$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"));
        $sym1$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym2$_RECORDING_HL_TRANSCRIPT_OPERATIONS__ = SubLObjectFactory.makeSymbol("*RECORDING-HL-TRANSCRIPT-OPERATIONS?*");
        $sym3$RECORD_HL_TRANSCRIPT_OPERATION = SubLObjectFactory.makeSymbol("RECORD-HL-TRANSCRIPT-OPERATION");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym5$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym6$_FORTS_BEING_REMOVED_ = SubLObjectFactory.makeSymbol("*FORTS-BEING-REMOVED*");
        $sym7$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FORTS-BEING-REMOVED*"));
        $sym9$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $const10$termDependsOn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termDependsOn"));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METRIC-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("METRIC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym12$OUTERMOST_INIT_ = SubLObjectFactory.makeUninternedSymbol("OUTERMOST-INIT?");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-LAST-METRIC-TIME*")));
        $sym14$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym15$_FORWARD_INFERENCE_LAST_METRIC_TIME_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-LAST-METRIC-TIME*");
        $sym16$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-FORWARD-INFERENCE-METRIC-TIME")), (SubLObject)SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-LAST-METRIC-TIME*"));
        $sym18$POSSIBLY_WITH_FORWARD_INFERENCE_METRIC_PROFILING = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-FORWARD-INFERENCE-METRIC-PROFILING");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-GAF"), (SubLObject)SubLObjectFactory.makeKeyword("NO-RULE"));
        $sym20$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym21$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-LAST-METRIC-TIME*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-FORWARD-INFERENCE-METRIC-TIME"))));
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METRIC-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("METRIC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym24$LAST_METRIC_TYPE = SubLObjectFactory.makeUninternedSymbol("LAST-METRIC-TYPE");
        $sym25$LAST_METRIC = SubLObjectFactory.makeUninternedSymbol("LAST-METRIC");
        $sym26$LAST_GAF = SubLObjectFactory.makeUninternedSymbol("LAST-GAF");
        $sym27$LAST_RULE = SubLObjectFactory.makeUninternedSymbol("LAST-RULE");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-METRIC-TYPE*"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-METRIC*"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-GAF*"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-RULE*"));
        $sym32$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym33$INCREMENT_FORWARD_INFERENCE_METRICS = SubLObjectFactory.makeSymbol("INCREMENT-FORWARD-INFERENCE-METRICS");
        $list34 = ConsesLow.list((SubLObject)hl_macros.ZERO_INTEGER);
        $sym35$_FORWARD_INFERENCE_METRIC_LAST_METRIC_TYPE_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-METRIC-TYPE*");
        $sym36$_FORWARD_INFERENCE_METRIC_LAST_METRIC_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-METRIC*");
        $sym37$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_GAF_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-GAF*");
        $sym38$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_RULE_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-RULE*");
    }
}

/*

	Total time: 124 ms
	
*/