package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_removal_module_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_macros";
    public static final String myFingerPrint = "4cedcda501d0026240f30af695f32e84af3caf0b577f4a551b4482d3aa8d354d";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PRED;
    private static final SubLSymbol $sym2$CDOLIST;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$CORBA_SKS_DECLARE_REMOVAL_MODULE;
    private static final SubLSymbol $sym5$PRED;
    private static final SubLSymbol $sym6$CORBA_SKS_UNDECLARE_REMOVAL_MODULE;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$NAME;
    private static final SubLSymbol $sym9$EXPAND_FN;
    private static final SubLSymbol $sym10$REQ_PATTERN;
    private static final SubLSymbol $sym11$CONTENT_MT;
    private static final SubLSymbol $sym12$CLET;
    private static final SubLSymbol $sym13$MAKE_CORBA_MODULE_NAME_KEYWORD;
    private static final SubLSymbol $sym14$CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL;
    private static final SubLSymbol $sym15$DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN;
    private static final SubLSymbol $sym16$SKS_GET_CONTENT_MT;
    private static final SubLSymbol $sym17$INFERENCE_REMOVAL_MODULE;
    private static final SubLSymbol $sym18$LIST;
    private static final SubLSymbol $kw19$SENSE;
    private static final SubLSymbol $kw20$POS;
    private static final SubLSymbol $kw21$PREDICATE;
    private static final SubLSymbol $kw22$REQUIRED_PATTERN;
    private static final SubLSymbol $kw23$COST_EXPRESSION;
    private static final SubLSymbol $kw24$EXPAND;
    private static final SubLSymbol $kw25$REQUIRED_MT;
    private static final SubLSymbol $sym26$NOTE_SKSI_CORBA_MODULE;
    private static final SubLSymbol $sym27$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE;
    private static final SubLSymbol $sym28$NAME;
    private static final SubLSymbol $sym29$UNDECLARE_INFERENCE_REMOVAL_MODULE;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$UN_NOTE_SKSI_CORBA_MODULE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-macros.lisp", position = 855L)
    public static SubLObject corba_sks_declare_removal_module_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = (SubLObject)corba_removal_module_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_removal_module_macros.$list0);
        sks = current.first();
        current = current.rest();
        if (corba_removal_module_macros.NIL == current) {
            final SubLObject pred = (SubLObject)corba_removal_module_macros.$sym1$PRED;
            return (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym2$CDOLIST, reader.bq_cons(pred, (SubLObject)corba_removal_module_macros.$list3), (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym4$CORBA_SKS_DECLARE_REMOVAL_MODULE, sks, pred));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)corba_removal_module_macros.$list0);
        return (SubLObject)corba_removal_module_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-macros.lisp", position = 1187L)
    public static SubLObject corba_sks_undeclare_removal_module_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = (SubLObject)corba_removal_module_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_removal_module_macros.$list0);
        sks = current.first();
        current = current.rest();
        if (corba_removal_module_macros.NIL == current) {
            final SubLObject pred = (SubLObject)corba_removal_module_macros.$sym5$PRED;
            return (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym2$CDOLIST, reader.bq_cons(pred, (SubLObject)corba_removal_module_macros.$list3), (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym6$CORBA_SKS_UNDECLARE_REMOVAL_MODULE, sks, pred));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)corba_removal_module_macros.$list0);
        return (SubLObject)corba_removal_module_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-macros.lisp", position = 1395L)
    public static SubLObject corba_sks_declare_removal_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = (SubLObject)corba_removal_module_macros.NIL;
        SubLObject pred = (SubLObject)corba_removal_module_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_removal_module_macros.$list7);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_removal_module_macros.$list7);
        pred = current.first();
        current = current.rest();
        if (corba_removal_module_macros.NIL == current) {
            final SubLObject name = (SubLObject)corba_removal_module_macros.$sym8$NAME;
            final SubLObject expand_fn = (SubLObject)corba_removal_module_macros.$sym9$EXPAND_FN;
            final SubLObject req_pattern = (SubLObject)corba_removal_module_macros.$sym10$REQ_PATTERN;
            final SubLObject content_mt = (SubLObject)corba_removal_module_macros.$sym11$CONTENT_MT;
            return (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(name, (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym13$MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred)), (SubLObject)ConsesLow.list(expand_fn, (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym14$CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL, pred)), (SubLObject)ConsesLow.list(req_pattern, (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym15$DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN, pred)), (SubLObject)ConsesLow.list(content_mt, (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym16$SKS_GET_CONTENT_MT, sks))), (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym17$INFERENCE_REMOVAL_MODULE, name, (SubLObject)ConsesLow.list(new SubLObject[] { corba_removal_module_macros.$sym18$LIST, corba_removal_module_macros.$kw19$SENSE, corba_removal_module_macros.$kw20$POS, corba_removal_module_macros.$kw21$PREDICATE, pred, corba_removal_module_macros.$kw22$REQUIRED_PATTERN, req_pattern, corba_removal_module_macros.$kw23$COST_EXPRESSION, corba_removal_module_macros.FIVE_INTEGER, corba_removal_module_macros.$kw24$EXPAND, expand_fn, corba_removal_module_macros.$kw25$REQUIRED_MT, content_mt })), (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym26$NOTE_SKSI_CORBA_MODULE, name, content_mt), (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym27$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE, pred));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)corba_removal_module_macros.$list7);
        return (SubLObject)corba_removal_module_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-removal-module-macros.lisp", position = 2190L)
    public static SubLObject corba_sks_undeclare_removal_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = (SubLObject)corba_removal_module_macros.NIL;
        SubLObject pred = (SubLObject)corba_removal_module_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_removal_module_macros.$list7);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_removal_module_macros.$list7);
        pred = current.first();
        current = current.rest();
        if (corba_removal_module_macros.NIL == current) {
            final SubLObject name = (SubLObject)corba_removal_module_macros.$sym28$NAME;
            return (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(name, (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym13$MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred))), (SubLObject)ConsesLow.listS((SubLObject)corba_removal_module_macros.$sym29$UNDECLARE_INFERENCE_REMOVAL_MODULE, name, (SubLObject)corba_removal_module_macros.$list30), (SubLObject)ConsesLow.list((SubLObject)corba_removal_module_macros.$sym31$UN_NOTE_SKSI_CORBA_MODULE, name));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)corba_removal_module_macros.$list7);
        return (SubLObject)corba_removal_module_macros.NIL;
    }
    
    public static SubLObject declare_corba_removal_module_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_macros", "corba_sks_declare_removal_module_suite", "CORBA-SKS-DECLARE-REMOVAL-MODULE-SUITE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_macros", "corba_sks_undeclare_removal_module_suite", "CORBA-SKS-UNDECLARE-REMOVAL-MODULE-SUITE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_macros", "corba_sks_declare_removal_module", "CORBA-SKS-DECLARE-REMOVAL-MODULE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_macros", "corba_sks_undeclare_removal_module", "CORBA-SKS-UNDECLARE-REMOVAL-MODULE");
        return (SubLObject)corba_removal_module_macros.NIL;
    }
    
    public static SubLObject init_corba_removal_module_macros_file() {
        return (SubLObject)corba_removal_module_macros.NIL;
    }
    
    public static SubLObject setup_corba_removal_module_macros_file() {
        return (SubLObject)corba_removal_module_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_corba_removal_module_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_corba_removal_module_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_corba_removal_module_macros_file();
    }
    
    static {
        me = (SubLFile)new corba_removal_module_macros();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS"));
        $sym1$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym2$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CORBA-REMOVAL-PREDICATES")));
        $sym4$CORBA_SKS_DECLARE_REMOVAL_MODULE = SubLObjectFactory.makeSymbol("CORBA-SKS-DECLARE-REMOVAL-MODULE");
        $sym5$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym6$CORBA_SKS_UNDECLARE_REMOVAL_MODULE = SubLObjectFactory.makeSymbol("CORBA-SKS-UNDECLARE-REMOVAL-MODULE");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym8$NAME = SubLObjectFactory.makeUninternedSymbol("NAME");
        $sym9$EXPAND_FN = SubLObjectFactory.makeUninternedSymbol("EXPAND-FN");
        $sym10$REQ_PATTERN = SubLObjectFactory.makeUninternedSymbol("REQ-PATTERN");
        $sym11$CONTENT_MT = SubLObjectFactory.makeUninternedSymbol("CONTENT-MT");
        $sym12$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym13$MAKE_CORBA_MODULE_NAME_KEYWORD = SubLObjectFactory.makeSymbol("MAKE-CORBA-MODULE-NAME-KEYWORD");
        $sym14$CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL = SubLObjectFactory.makeSymbol("CORBA-PRED-GET-REMOVAL-MODULE-EXPAND-FN-SYMBOL");
        $sym15$DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN = SubLObjectFactory.makeSymbol("DETERMINE-CORBA-REMOVAL-MODULE-REQUIRED-PATTERN");
        $sym16$SKS_GET_CONTENT_MT = SubLObjectFactory.makeSymbol("SKS-GET-CONTENT-MT");
        $sym17$INFERENCE_REMOVAL_MODULE = SubLObjectFactory.makeSymbol("INFERENCE-REMOVAL-MODULE");
        $sym18$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw19$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $kw20$POS = SubLObjectFactory.makeKeyword("POS");
        $kw21$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw22$REQUIRED_PATTERN = SubLObjectFactory.makeKeyword("REQUIRED-PATTERN");
        $kw23$COST_EXPRESSION = SubLObjectFactory.makeKeyword("COST-EXPRESSION");
        $kw24$EXPAND = SubLObjectFactory.makeKeyword("EXPAND");
        $kw25$REQUIRED_MT = SubLObjectFactory.makeKeyword("REQUIRED-MT");
        $sym26$NOTE_SKSI_CORBA_MODULE = SubLObjectFactory.makeSymbol("NOTE-SKSI-CORBA-MODULE");
        $sym27$REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE = SubLObjectFactory.makeSymbol("REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE");
        $sym28$NAME = SubLObjectFactory.makeUninternedSymbol("NAME");
        $sym29$UNDECLARE_INFERENCE_REMOVAL_MODULE = SubLObjectFactory.makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE");
        $list30 = ConsesLow.list((SubLObject)corba_removal_module_macros.NIL);
        $sym31$UN_NOTE_SKSI_CORBA_MODULE = SubLObjectFactory.makeSymbol("UN-NOTE-SKSI-CORBA-MODULE");
    }
}

/*

	Total time: 25 ms
	
*/