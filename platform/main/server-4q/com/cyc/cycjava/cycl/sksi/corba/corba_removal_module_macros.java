package com.cyc.cycjava.cycl.sksi.corba;


import com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class corba_removal_module_macros extends SubLTranslatedFile {
    public static final SubLFile me = new corba_removal_module_macros();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_removal_module_macros";

    public static final String myFingerPrint = "4cedcda501d0026240f30af695f32e84af3caf0b577f4a551b4482d3aa8d354d";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("SKS"));

    public static final SubLSymbol $sym1$PRED = makeUninternedSymbol("PRED");



    public static final SubLList $list3 = list(list(makeSymbol("GET-CORBA-REMOVAL-PREDICATES")));

    public static final SubLSymbol CORBA_SKS_DECLARE_REMOVAL_MODULE = makeSymbol("CORBA-SKS-DECLARE-REMOVAL-MODULE");

    public static final SubLSymbol $sym5$PRED = makeUninternedSymbol("PRED");

    public static final SubLSymbol CORBA_SKS_UNDECLARE_REMOVAL_MODULE = makeSymbol("CORBA-SKS-UNDECLARE-REMOVAL-MODULE");

    public static final SubLList $list7 = list(makeSymbol("SKS"), makeSymbol("PRED"));

    public static final SubLSymbol $sym8$NAME = makeUninternedSymbol("NAME");

    public static final SubLSymbol $sym9$EXPAND_FN = makeUninternedSymbol("EXPAND-FN");

    public static final SubLSymbol $sym10$REQ_PATTERN = makeUninternedSymbol("REQ-PATTERN");

    public static final SubLSymbol $sym11$CONTENT_MT = makeUninternedSymbol("CONTENT-MT");



    public static final SubLSymbol MAKE_CORBA_MODULE_NAME_KEYWORD = makeSymbol("MAKE-CORBA-MODULE-NAME-KEYWORD");

    public static final SubLSymbol CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL = makeSymbol("CORBA-PRED-GET-REMOVAL-MODULE-EXPAND-FN-SYMBOL");

    public static final SubLSymbol DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN = makeSymbol("DETERMINE-CORBA-REMOVAL-MODULE-REQUIRED-PATTERN");

    public static final SubLSymbol SKS_GET_CONTENT_MT = makeSymbol("SKS-GET-CONTENT-MT");

    public static final SubLSymbol INFERENCE_REMOVAL_MODULE = makeSymbol("INFERENCE-REMOVAL-MODULE");

















    public static final SubLSymbol NOTE_SKSI_CORBA_MODULE = makeSymbol("NOTE-SKSI-CORBA-MODULE");

    public static final SubLSymbol REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE = makeSymbol("REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE");

    public static final SubLSymbol $sym28$NAME = makeUninternedSymbol("NAME");

    public static final SubLSymbol UNDECLARE_INFERENCE_REMOVAL_MODULE = makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE");

    public static final SubLList $list30 = list(NIL);

    public static final SubLSymbol UN_NOTE_SKSI_CORBA_MODULE = makeSymbol("UN-NOTE-SKSI-CORBA-MODULE");

    public static SubLObject corba_sks_declare_removal_module_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        sks = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pred = $sym1$PRED;
            return list(CDOLIST, bq_cons(pred, $list3), list(CORBA_SKS_DECLARE_REMOVAL_MODULE, sks, pred));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject corba_sks_undeclare_removal_module_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        sks = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pred = $sym5$PRED;
            return list(CDOLIST, bq_cons(pred, $list3), list(CORBA_SKS_UNDECLARE_REMOVAL_MODULE, sks, pred));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject corba_sks_declare_removal_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject name = $sym8$NAME;
            final SubLObject expand_fn = $sym9$EXPAND_FN;
            final SubLObject req_pattern = $sym10$REQ_PATTERN;
            final SubLObject content_mt = $sym11$CONTENT_MT;
            return list(CLET, list(list(name, list(MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred)), list(expand_fn, list(CORBA_PRED_GET_REMOVAL_MODULE_EXPAND_FN_SYMBOL, pred)), list(req_pattern, list(DETERMINE_CORBA_REMOVAL_MODULE_REQUIRED_PATTERN, pred)), list(content_mt, list(SKS_GET_CONTENT_MT, sks))), list(INFERENCE_REMOVAL_MODULE, name, list(new SubLObject[]{ LIST, $SENSE, $POS, $PREDICATE, pred, $REQUIRED_PATTERN, req_pattern, $COST_EXPRESSION, FIVE_INTEGER, $EXPAND, expand_fn, $REQUIRED_MT, content_mt })), list(NOTE_SKSI_CORBA_MODULE, name, content_mt), list(REGISTER_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE, pred));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static SubLObject corba_sks_undeclare_removal_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject name = $sym28$NAME;
            return list(CLET, list(list(name, list(MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred))), listS(UNDECLARE_INFERENCE_REMOVAL_MODULE, name, $list30), list(UN_NOTE_SKSI_CORBA_MODULE, name));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static SubLObject declare_corba_removal_module_macros_file() {
        declareMacro(me, "corba_sks_declare_removal_module_suite", "CORBA-SKS-DECLARE-REMOVAL-MODULE-SUITE");
        declareMacro(me, "corba_sks_undeclare_removal_module_suite", "CORBA-SKS-UNDECLARE-REMOVAL-MODULE-SUITE");
        declareMacro(me, "corba_sks_declare_removal_module", "CORBA-SKS-DECLARE-REMOVAL-MODULE");
        declareMacro(me, "corba_sks_undeclare_removal_module", "CORBA-SKS-UNDECLARE-REMOVAL-MODULE");
        return NIL;
    }

    public static SubLObject init_corba_removal_module_macros_file() {
        return NIL;
    }

    public static SubLObject setup_corba_removal_module_macros_file() {
        return NIL;
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

































    }
}

/**
 * Total time: 25 ms
 */
