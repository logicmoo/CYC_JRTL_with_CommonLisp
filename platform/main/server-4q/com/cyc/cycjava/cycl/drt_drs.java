/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class drt_drs extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new drt_drs();

 public static final String myName = "com.cyc.cycjava.cycl.drt_drs";


    // defparameter
    // Definitions
    @LispMethod(comment = "Transformation calls to do on complex-formulas in a DRS to make conditions.  (The list of quantifier processing transformations done in step 1.c. \'quantproc\'.)\ndefparameter")
    public static final SubLSymbol $drt_drs_quant_calls$ = makeSymbol("*DRT-DRS-QUANT-CALLS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $drt_put_available_rms_to_top_level_drs$ = makeSymbol("*DRT-PUT-AVAILABLE-RMS-TO-TOP-LEVEL-DRS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $drt_quantproc_hint_fns$ = makeSymbol("*DRT-QUANTPROC-HINT-FNS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $drt_introduced_var_num_isg$ = makeSymbol("*DRT-INTRODUCED-VAR-NUM-ISG*");

    // defparameter
    /**
     * The weight to give to RMs in the current DRS and then previous DRSs when
     * finding possible coreferences.
     */
    @LispMethod(comment = "The weight to give to RMs in the current DRS and then previous DRSs when\r\nfinding possible coreferences.\ndefparameter\nThe weight to give to RMs in the current DRS and then previous DRSs when\nfinding possible coreferences.")
    private static final SubLSymbol $drt_possible_rm_coreferences_prev_drs_biases$ = makeSymbol("*DRT-POSSIBLE-RM-COREFERENCES-PREV-DRS-BIASES*");

    // defparameter
    // The number of previous DRSs to look when finding possible coreferences.
    /**
     * The number of previous DRSs to look when finding possible coreferences.
     */
    @LispMethod(comment = "The number of previous DRSs to look when finding possible coreferences.\ndefparameter")
    private static final SubLSymbol $drt_possible_rm_coreferences_max_depth$ = makeSymbol("*DRT-POSSIBLE-RM-COREFERENCES-MAX-DEPTH*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeKeyword("QUANTPROC-3"), makeSymbol("TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC-3?"), makeSymbol("REFORMULATE-CYCL-QUANTPROC-3"), makeKeyword("PARSING-MT")), list(makeKeyword("VPPPROC-NONSTATE"), makeSymbol("TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-NONSTATE?"), makeSymbol("REFORMULATE-CYCL-VPPPROC-NONSTATE"), makeKeyword("PARSING-MT")), list(makeKeyword("VPPPROC-STATE"), makeSymbol("TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-STATE?"), makeSymbol("REFORMULATE-CYCL-VPPPROC-STATE"), makeKeyword("PARSING-MT")));

    static private final SubLList $list3 = list(new SubLObject[]{ list(makeSymbol("SPEAKER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AUDIENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AVAILABLE-RMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEFINITE-RMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRONOMIAL-RMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PREV-DRS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NEXT-DRS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUPER-DRS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUB-DRSS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CYCL-FORMULAS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SIMPLE-CONDITIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COMPLEX-CONDITIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INTERACTION-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSING-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-RM"), list(makeSymbol("NEW-RM"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-AVAILABLE-RM"), list(makeSymbol("NEW-RM"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DEFINITE-RM"), list(makeSymbol("NEW-RM"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PRONOMIAL-RM"), list(makeSymbol("NEW-RM"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROCESS"), list(makeSymbol("&OPTIONAL"), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-RM-BY-TARGET"), list(makeSymbol("TARGET"), makeSymbol("TARGET-TYPE"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES"), NIL), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-POSSIBLE-RM-COREFERENCES"), list(makeSymbol("RM"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEPTH"), FIVE_INTEGER), list(makeSymbol("CUTOFF"), NIL))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONSTRUCT-CYCL"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol COMPLEX_CONDITIONS = makeSymbol("COMPLEX-CONDITIONS");

    private static final SubLSymbol SIMPLE_CONDITIONS = makeSymbol("SIMPLE-CONDITIONS");

    private static final SubLSymbol SUB_DRSS = makeSymbol("SUB-DRSS");

    private static final SubLSymbol NEXT_DRS = makeSymbol("NEXT-DRS");

    private static final SubLSymbol PREV_DRS = makeSymbol("PREV-DRS");

    private static final SubLSymbol AUDIENCE = makeSymbol("AUDIENCE");

    private static final SubLSymbol SPEAKER = makeSymbol("SPEAKER");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DRS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DRS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DRS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DRS-INSTANCE");

    private static final SubLSymbol ADD_RM = makeSymbol("ADD-RM");

    static private final SubLList $list25 = list(makeSymbol("NEW-RM"));

    static private final SubLList $list26 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-RM"), makeSymbol("RMS")), list(makeSymbol("CSETQ"), makeSymbol("RMS"), list(makeSymbol("CONS"), makeSymbol("NEW-RM"), makeSymbol("RMS")))), list(RET, makeSymbol("RMS")));

    static private final SubLSymbol $sym27$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");

    private static final SubLSymbol DRS_ADD_RM_METHOD = makeSymbol("DRS-ADD-RM-METHOD");

    private static final SubLSymbol ADD_AVAILABLE_RM = makeSymbol("ADD-AVAILABLE-RM");

    static private final SubLList $list30 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-RM"), makeSymbol("AVAILABLE-RMS")), list(makeSymbol("CSETQ"), makeSymbol("AVAILABLE-RMS"), list(makeSymbol("CONS"), makeSymbol("NEW-RM"), makeSymbol("AVAILABLE-RMS")))), list(RET, makeSymbol("AVAILABLE-RMS")));

    static private final SubLSymbol $sym31$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");

    private static final SubLSymbol DRS_ADD_AVAILABLE_RM_METHOD = makeSymbol("DRS-ADD-AVAILABLE-RM-METHOD");

    private static final SubLSymbol ADD_DEFINITE_RM = makeSymbol("ADD-DEFINITE-RM");

    static private final SubLList $list34 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-RM"), makeSymbol("DEFINITE-RMS")), list(makeSymbol("CSETQ"), makeSymbol("DEFINITE-RMS"), list(makeSymbol("CONS"), makeSymbol("NEW-RM"), makeSymbol("DEFINITE-RMS")))), list(RET, makeSymbol("DEFINITE-RMS")));

    static private final SubLSymbol $sym35$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");

    private static final SubLSymbol DRS_ADD_DEFINITE_RM_METHOD = makeSymbol("DRS-ADD-DEFINITE-RM-METHOD");

    private static final SubLSymbol ADD_PRONOMIAL_RM = makeSymbol("ADD-PRONOMIAL-RM");

    static private final SubLList $list38 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-RM"), makeSymbol("PRONOMIAL-RMS")), list(makeSymbol("CSETQ"), makeSymbol("PRONOMIAL-RMS"), list(makeSymbol("CONS"), makeSymbol("NEW-RM"), makeSymbol("PRONOMIAL-RMS")))), list(RET, makeSymbol("PRONOMIAL-RMS")));

    static private final SubLSymbol $sym39$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");

    private static final SubLSymbol DRS_ADD_PRONOMIAL_RM_METHOD = makeSymbol("DRS-ADD-PRONOMIAL-RM-METHOD");

    static private final SubLString $str42$_______________________INITIAL_RM = makeString("~%******************** INITIAL RMS ********************~%");

    static private final SubLString $str43$__ = makeString("~%");

    private static final SubLSymbol FIND_RM_BY_TARGET = makeSymbol("FIND-RM-BY-TARGET");

    static private final SubLList $list45 = list($ROOT);

    static private final SubLString $str48$_______________________INITIAL_DR = makeString("~%******************** INITIAL DRS ********************~%");

    static private final SubLList $list49 = list(reader_make_constant_shell("NLSemFn"), reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("NLTagFn"), reader_make_constant_shell("SomeFn"), reader_make_constant_shell("NLDefinitenessFn-3"), reader_make_constant_shell("NLQuantFn-3"));









    private static final SubLObject $$explains_PropProp = reader_make_constant_shell("explains-PropProp");

    private static final SubLSymbol DRT_COMPLEX_FORMULA_ELEMENT = makeSymbol("DRT-COMPLEX-FORMULA-ELEMENT");

    static private final SubLList $list57 = list(makeKeyword("READ-ONLY"));

    static private final SubLList $list58 = list(makeSymbol("&OPTIONAL"), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"));

    public static final SubLObject $list59 = _constant_59_initializer();

    static private final SubLString $str60$___drs_process_method__A_ = makeString("~%(drs-process-method ~A)");

    static private final SubLString $str61$drt_process_drs__more_than_one_co = makeString("drt-process-drs: more than one complex formula in drs ~A ~A~%");

    static private final SubLString $str62$1_a__quantifiers___ = makeString("1.a. quantifiers.~%");

    static private final SubLList $list63 = list(makeKeyword("VAR"));

    static private final SubLString $str64$drt_process_drs__A__no_RM_found_f = makeString("drt-process-drs ~A: no RM found for var ~A in complex-formula ~A~%");

    static private final SubLString $str66$_1________________modified_RM_ = makeString("-1--------------- modified RM:");

    static private final SubLString $str67$_1_____________ = makeString("-1-----------~%");

    static private final SubLString $str68$1_b__logical_connectives___ = makeString("1.b. logical connectives.~%");



    static private final SubLString $str70$1_c__quantproc__ = makeString("1.c. quantproc~%");

    static private final SubLString $str71$Attempting_reformulation_on_____A = makeString("Attempting reformulation on: ~%~A~%");

    static private final SubLString $str74$Attempting_reformulation_type__A_ = makeString("Attempting reformulation type ~A, mt=~A~%");

    static private final SubLString $str75$Using_reformulator_result_from__A = makeString("Using reformulator result from ~A: ~A~%");

    static private final SubLString $str76$failed_reformulation_on__A__new_c = makeString("failed reformulation on ~A: new-complex-formula is NULL.");

    static private final SubLString $str77$failed_reformulation_on__A__new_c = makeString("failed reformulation on ~A: new-complex-formula is IDENTICAL.");

    static private final SubLString $str78$DRT__A = makeString("DRT-~A");

    static private final SubLList $list79 = list($ROOT, makeKeyword("FORMULA"));

    static private final SubLString $str81$___2________________modified_RM_ = makeString("~%-2--------------- modified RM:");

    static private final SubLString $str82$_2_____________ = makeString("-2-----------~%");



    static private final SubLString $str84$___3________________modified_RM_ = makeString("~%-3--------------- modified RM:");

    static private final SubLString $str85$_3_____________ = makeString("-3-----------~%");

    static private final SubLString $str86$1_d__subcollection_processing__ = makeString("1.d. subcollection processing~%");

    static private final SubLString $str87$1_e__simple_formulas__ = makeString("1.e. simple formulas~%");

    private static final SubLSymbol RM_P = makeSymbol("RM-P");

    static private final SubLString $str91$_______________________FINAL_DRS_ = makeString("~%******************** FINAL DRS ********************~%");

    private static final SubLSymbol FIND_ALL_POSSIBLE_RM_COREFERENCES = makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES");

    private static final SubLSymbol DRS_PROCESS_METHOD = makeSymbol("DRS-PROCESS-METHOD");

    static private final SubLList $list94 = list(makeString("Returns a list of lists of the form (RM ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...)) indicating the probabiltiy of each possible RM coreference in this DRS."), list(makeSymbol("CLET"), list(makeSymbol("RESULT")), list(makeSymbol("PWHEN"), makeSymbol("SUB-DRSS"), list(makeSymbol("CDOLIST"), list(makeSymbol("SUB-DRS"), makeSymbol("SUB-DRSS")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("APPEND"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUB-DRS"), list(QUOTE, makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES"))))))), list(makeSymbol("PWHEN"), makeSymbol("PRONOMIAL-RMS"), list(makeSymbol("CDOLIST"), list(makeSymbol("PRONOMIAL-RM"), makeSymbol("PRONOMIAL-RMS")), list(makeSymbol("CLET"), list(list(makeSymbol("POSSIBLE-RM-COREFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-POSSIBLE-RM-COREFERENCES")), makeSymbol("PRONOMIAL-RM")))), list(makeSymbol("PWHEN"), makeSymbol("POSSIBLE-RM-COREFERENCES"), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeSymbol("PRONOMIAL-RM"), makeSymbol("POSSIBLE-RM-COREFERENCES")), makeSymbol("RESULT")))))), list(RET, makeSymbol("RESULT"))));

    private static final SubLSymbol FIND_POSSIBLE_RM_COREFERENCES = makeSymbol("FIND-POSSIBLE-RM-COREFERENCES");

    private static final SubLSymbol DRS_FIND_ALL_POSSIBLE_RM_COREFERENCES_METHOD = makeSymbol("DRS-FIND-ALL-POSSIBLE-RM-COREFERENCES-METHOD");

    static private final SubLList $list97 = list(makeDouble(1.0));

    static private final SubLList $list98 = list(makeSymbol("RM"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEPTH"), makeSymbol("*DRT-POSSIBLE-RM-COREFERENCES-MAX-DEPTH*")), list(makeSymbol("CUTOFF"), NIL));

    static private final SubLList $list99 = list(makeString("Returns a list of the form ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...) indicating the possible coreferences of the specified RM in this DRS.  If DEPTH is specified, we look to DEPTH-1 previous DRSs for possible intersentential coreferences."), list(makeSymbol("IGNORE"), makeSymbol("CUTOFF")), list(makeSymbol("CLET"), list(list(makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("RM-FORMULA"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("FORMULA"))))), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("FORMULA-ARG0"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("PronounFn")), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(EQ, list(makeSymbol("FORMULA-ARG1"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("FirstPerson-NLAttr")), list(EQ, list(makeSymbol("FORMULA-ARG2"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("Singular-NLAttr")), list(EQ, list(makeSymbol("FORMULA-ARG3"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("Ungendered-NLAttr")), list(makeSymbol("FORT-P"), makeSymbol("SPEAKER"))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-CONS"), makeSymbol("SPEAKER"), list(QUOTE, list(makeDouble(1.0)))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))), list(list(makeSymbol("CAND"), list(EQ, list(makeSymbol("FORMULA-ARG1"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("SecondPerson-NLAttr")), list(EQ, list(makeSymbol("FORMULA-ARG2"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("Singular-NLAttr")), list(EQ, list(makeSymbol("FORMULA-ARG3"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("Ungendered-NLAttr"))), list(makeSymbol("CDOLIST"), list(makeSymbol("AUDIENCE-MEMBER"), makeSymbol("AUDIENCE")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-CONS"), makeSymbol("AUDIENCE-MEMBER"), list(QUOTE, list(makeDouble(1.0)))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("AVAILABLE-RM"), makeSymbol("AVAILABLE-RMS")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeSymbol("AVAILABLE-RM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RM"), list(QUOTE, makeSymbol("COREFERENCE-PROBABILITY")), makeSymbol("AVAILABLE-RM"))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("DEFINITE-RM"), makeSymbol("DEFINITE-RMS")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeSymbol("DEFINITE-RM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RM"), list(QUOTE, makeSymbol("COREFERENCE-PROBABILITY")), makeSymbol("DEFINITE-RM"))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))), list(makeSymbol("CLET"), list(list(makeSymbol("BACK-DRS"), NIL)), list(makeSymbol("PCOND"), list(makeSymbol("SUPER-DRS"), list(makeSymbol("CSETQ"), makeSymbol("BACK-DRS"), makeSymbol("SUPER-DRS"))), list(makeSymbol("PREV-DRS"), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("DEPTH"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("DEPTH"), list(makeSymbol("-"), makeSymbol("DEPTH"), ONE_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("BACK-DRS"), makeSymbol("PREV-DRS"))))), list(makeSymbol("PWHEN"), makeSymbol("BACK-DRS"), list(makeSymbol("CLET"), list(list(makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("BACK-DRS"), list(QUOTE, makeSymbol("FIND-POSSIBLE-RM-COREFERENCES")), makeSymbol("RM"), makeSymbol("DEPTH")))), list(makeSymbol("CDOLIST"), list(makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR"), makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIRS")), list(makeSymbol("CLET"), list(list(makeSymbol("POSSIBLE-RM"), list(makeSymbol("FIRST"), makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR"))), list(makeSymbol("POSSIBLE-RM-VALUE"), list(makeSymbol("SECOND"), makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR"))), list(makeSymbol("DEPTH-BIAS"), list(makeSymbol("NTH"), makeSymbol("DEPTH"), makeSymbol("*DRT-POSSIBLE-RM-COREFERENCES-PREV-DRS-BIASES*")))), list(makeSymbol("PUNLESS"), makeSymbol("DEPTH-BIAS"), list(makeSymbol("CSETQ"), makeSymbol("DEPTH-BIAS"), makeDouble(0.0))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeSymbol("POSSIBLE-RM"), list(makeSymbol("*"), makeSymbol("POSSIBLE-RM-VALUE"), makeSymbol("DEPTH-BIAS"))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))))))), list(RET, makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))));

    static private final SubLSymbol $sym100$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");



    private static final SubLObject $$FirstPerson_NLAttr = reader_make_constant_shell("FirstPerson-NLAttr");

    private static final SubLObject $$Singular_NLAttr = reader_make_constant_shell("Singular-NLAttr");

    private static final SubLObject $$Ungendered_NLAttr = reader_make_constant_shell("Ungendered-NLAttr");

    private static final SubLObject $$SecondPerson_NLAttr = reader_make_constant_shell("SecondPerson-NLAttr");

    private static final SubLSymbol COREFERENCE_PROBABILITY = makeSymbol("COREFERENCE-PROBABILITY");

    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLSymbol DRS_FIND_POSSIBLE_RM_COREFERENCES_METHOD = makeSymbol("DRS-FIND-POSSIBLE-RM-COREFERENCES-METHOD");

    static private final SubLList $list110 = list($TERM, makeKeyword("VAR"), makeKeyword("FORMULA"));



    private static final SubLObject $const113$SubcollectionOfWithRelationToType = reader_make_constant_shell("SubcollectionOfWithRelationToTypeFn");



    private static final SubLObject $const115$SubcollectionOfWithRelationFromTy = reader_make_constant_shell("SubcollectionOfWithRelationFromTypeFn");

    static private final SubLList $list116 = list(makeSymbol("TARGET"), makeSymbol("TARGET-TYPE"));

    static private final SubLList $list117 = list(makeString("Finds an RM by looking at the slots of the RMs in DRS.  There are 4 methods to look for RMs: by the :term or :var assigned to the RM after processing, by the initial formula the RM was created from, and the :root ('root-term') of the formula the RM was created from.  Any combination of these may be specified.  If both :formula and :root are specified, we allow matching to the RMs :mapped-formula such that contained RMs of which are replaced by those RMs :root's.  Also, there is a hack in here to ignore differences in subcollection functions (see drt-corresponding-type-subcol-fn-3 above)."), list(makeSymbol("CLET"), list(list(makeSymbol("RM-RESULTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RM"), makeSymbol("RMS")), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $TERM, makeSymbol("TARGET-TYPE")), list(makeSymbol("PWHEN"), list(makeSymbol("EQUALS-EL?"), makeSymbol("TARGET"), list(makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TARGET-TERM"))))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("VAR"), makeSymbol("TARGET-TYPE")), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("TARGET"), list(makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TARGET-VAR"))))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("FORMULA"), makeSymbol("TARGET-TYPE")), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("TARGET"), list(makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("FORMULA"))))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $ROOT, makeSymbol("TARGET-TYPE")), list(makeSymbol("PWHEN"), list(makeSymbol("EQUALS-EL?"), makeSymbol("TARGET"), list(makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("ROOT-TERM"))))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NULL"), makeSymbol("RM-RESULTS")), list(makeSymbol("MEMBER"), makeKeyword("FORMULA"), makeSymbol("TARGET-TYPE")), list(makeSymbol("MEMBER"), $ROOT, makeSymbol("TARGET-TYPE"))), list(makeSymbol("CLET"), list(list(makeSymbol("RM-UNMAPPED-FORMULA"), list(makeSymbol("TREE-GATHER-TRANSFORMATIONS"), list(makeSymbol("FUNCTION"), makeSymbol("DRS-RM-ROOT-TERM-METHOD")), list(makeSymbol("COPY-TREE"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("MAPPED-FORMULA")))), list(makeSymbol("FUNCTION"), makeSymbol("RM-P"))))), list(makeSymbol("PWHEN"), list(makeSymbol("EQUALS-EL?"), list(makeSymbol("TREE-GATHER-TRANSFORMATIONS"), list(makeSymbol("FUNCTION"), makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3")), makeSymbol("TARGET"), list(makeSymbol("FUNCTION"), makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3"))), list(makeSymbol("TREE-GATHER-TRANSFORMATIONS"), list(makeSymbol("FUNCTION"), makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3")), makeSymbol("RM-UNMAPPED-FORMULA"), list(makeSymbol("FUNCTION"), makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3")))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))))), list(makeSymbol("PUNLESS"), makeSymbol("RM-RESULTS"), list(makeSymbol("PWHEN"), makeSymbol("SUPER-DRS"), list(makeSymbol("CSETQ"), makeSymbol("RM-RESULTS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUPER-DRS"), list(QUOTE, makeSymbol("FIND-RM-BY-TARGET")), makeSymbol("TARGET"), makeSymbol("TARGET-TYPE"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("RM-RESULTS")), ONE_INTEGER), list(makeSymbol("CLET"), list(makeSymbol("NEW-RM-RESULTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RM-RESULT"), makeSymbol("RM-RESULTS")), list(makeSymbol("PUNLESS"), list(makeSymbol("TREE-FIND"), list(makeSymbol("GET-SLOT"), makeSymbol("RM-RESULT"), list(QUOTE, makeSymbol("FORMULA"))), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("CPUSH"), makeSymbol("RM-RESULT"), makeSymbol("NEW-RM-RESULTS")))), list(makeSymbol("PWHEN"), makeSymbol("NEW-RM-RESULTS"), list(makeSymbol("CSETQ"), makeSymbol("RM-RESULTS"), makeSymbol("NEW-RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("RM-RESULTS")), ONE_INTEGER), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("DRT-WARN"), makeString("find-rm-by-target: ~A maps to multiple rms ~A~%"), makeSymbol("TARGET"), makeSymbol("RM-RESULTS"))))), list(RET, makeSymbol("RM-RESULTS"))));

    static private final SubLSymbol $sym118$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");

    private static final SubLSymbol DRS_RM_ROOT_TERM_METHOD = makeSymbol("DRS-RM-ROOT-TERM-METHOD");

    private static final SubLSymbol MAPPED_FORMULA = makeSymbol("MAPPED-FORMULA");

    private static final SubLSymbol DRT_CORRESPONDING_TYPE_SUBCOL_FN_3 = makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3");

    static private final SubLString $str127$find_rm_by_target___A_maps_to_mul = makeString("find-rm-by-target: ~A maps to multiple rms ~A~%");

    private static final SubLSymbol DRS_FIND_RM_BY_TARGET_METHOD = makeSymbol("DRS-FIND-RM-BY-TARGET-METHOD");





    private static final SubLSymbol CONSTRUCT_CYCL = makeSymbol("CONSTRUCT-CYCL");

    static private final SubLList $list132 = list(makeString("Constructs the CycL output that is ready to be predicate/term strengthened, etc. (i.e. it may still contain underpecified vocab)."), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("SCOPES"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("COMPLEX-CONDITIONS"), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEX-CONDITION"), makeSymbol("COMPLEX-CONDITIONS")), list(makeSymbol("CLET"), list(list(makeSymbol("CF-CYCL"), list(makeSymbol("DRT-COMPLEX-CONDITION-CONSTRUCT-CYCL"), makeSymbol("COMPLEX-CONDITION"), makeSymbol("INTERACTION-MT")))), list(makeSymbol("CPUSH"), makeSymbol("CF-CYCL"), makeSymbol("RESULT"))))), list(makeSymbol("PWHEN"), makeSymbol("SIMPLE-CONDITIONS"), list(makeSymbol("CLET"), list(list(makeSymbol("RELEVANT-RMS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-CONDITION"), makeSymbol("SIMPLE-CONDITIONS")), list(makeSymbol("CDOLIST"), list(makeSymbol("POSS-RELEVANT-RM"), list(makeSymbol("REMOVE-IF-NOT"), list(makeSymbol("FUNCTION"), makeSymbol("RM-P")), makeSymbol("SIMPLE-CONDITION"))), list(makeSymbol("CPUSHNEW"), makeSymbol("POSS-RELEVANT-RM"), makeSymbol("RELEVANT-RMS"))), list(makeSymbol("CPUSH"), list(makeSymbol("DRT-SIMPLE-CONDITION-CONSTRUCT-CYCL"), makeSymbol("SIMPLE-CONDITION")), makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("RELEVANT-RM"), makeSymbol("RELEVANT-RMS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("GET-SLOT"), makeSymbol("RELEVANT-RM"), list(QUOTE, makeSymbol("SCOPE"))), list(makeSymbol("CNOT"), list(EQ, reader_make_constant_shell("forAll"), list(makeSymbol("GET-SLOT"), makeSymbol("RELEVANT-RM"), list(QUOTE, makeSymbol("SCOPE")))))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), list(makeSymbol("GET-SLOT"), makeSymbol("RELEVANT-RM"), list(QUOTE, makeSymbol("SCOPE"))), list(makeSymbol("GET-SLOT"), makeSymbol("RELEVANT-RM"), list(QUOTE, makeSymbol("TARGET-VAR")))), makeSymbol("SCOPES")))))), list(makeSymbol("PIF"), list(makeSymbol("CDR"), makeSymbol("RESULT")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("BQ-CONS"), reader_make_constant_shell("and"), makeSymbol("RESULT"))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("CAR"), makeSymbol("RESULT")))), list(makeSymbol("CDOLIST"), list(makeSymbol("SCOPE"), makeSymbol("SCOPES")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("APPEND"), makeSymbol("SCOPE"), list(makeSymbol("LIST"), makeSymbol("RESULT"))))), list(makeSymbol("DRT-TRACE-PROGN"), TWO_INTEGER, list(makeSymbol("DRT-TRACE-OUT"), TWO_INTEGER, makeString("~%******************** FINAL CYCL FORMULA ********************~%")), list(makeSymbol("DRT-TRACE-OUT"), TWO_INTEGER, makeString("~A~%"), makeSymbol("RESULT"))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym133$OUTER_CATCH_FOR_DRS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");

    static private final SubLString $str134$_______________________FINAL_CYCL = makeString("~%******************** FINAL CYCL FORMULA ********************~%");

    static private final SubLString $str135$_A__ = makeString("~A~%");

    private static final SubLSymbol DRS_CONSTRUCT_CYCL_METHOD = makeSymbol("DRS-CONSTRUCT-CYCL-METHOD");

    /**
     * Gets the QUANT-CALL type from the quant call table.
     */
    @LispMethod(comment = "Gets the QUANT-CALL type from the quant call table.")
    public static final SubLObject drt_drs_quant_call_type_alt(SubLObject quant_call) {
        return quant_call.first();
    }

    /**
     * Gets the QUANT-CALL type from the quant call table.
     */
    @LispMethod(comment = "Gets the QUANT-CALL type from the quant call table.")
    public static SubLObject drt_drs_quant_call_type(final SubLObject quant_call) {
        return quant_call.first();
    }

    /**
     * Gets the QUANT-CALL test from the quant call table.
     */
    @LispMethod(comment = "Gets the QUANT-CALL test from the quant call table.")
    public static final SubLObject drt_drs_quant_call_test_alt(SubLObject quant_call) {
        return second(quant_call);
    }

    /**
     * Gets the QUANT-CALL test from the quant call table.
     */
    @LispMethod(comment = "Gets the QUANT-CALL test from the quant call table.")
    public static SubLObject drt_drs_quant_call_test(final SubLObject quant_call) {
        return second(quant_call);
    }

    /**
     * Gets the QUANT-CALL fn from the quant call table.
     */
    @LispMethod(comment = "Gets the QUANT-CALL fn from the quant call table.")
    public static final SubLObject drt_drs_quant_call_fn_alt(SubLObject quant_call) {
        return third(quant_call);
    }

    /**
     * Gets the QUANT-CALL fn from the quant call table.
     */
    @LispMethod(comment = "Gets the QUANT-CALL fn from the quant call table.")
    public static SubLObject drt_drs_quant_call_fn(final SubLObject quant_call) {
        return third(quant_call);
    }

    /**
     * Gets the QUANT-CALL mt from the quant call table.
     */
    @LispMethod(comment = "Gets the QUANT-CALL mt from the quant call table.")
    public static final SubLObject drt_drs_quant_call_mt_alt(SubLObject quant_call) {
        return fourth(quant_call);
    }

    /**
     * Gets the QUANT-CALL mt from the quant call table.
     */
    @LispMethod(comment = "Gets the QUANT-CALL mt from the quant call table.")
    public static SubLObject drt_drs_quant_call_mt(final SubLObject quant_call) {
        return fourth(quant_call);
    }

    public static final SubLObject get_drs_parsing_mt_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, FIFTEEN_INTEGER, PARSING_MT);
    }

    public static SubLObject get_drs_parsing_mt(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, FIFTEEN_INTEGER, PARSING_MT);
    }

    public static final SubLObject set_drs_parsing_mt_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, FIFTEEN_INTEGER, PARSING_MT);
    }

    public static SubLObject set_drs_parsing_mt(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, FIFTEEN_INTEGER, PARSING_MT);
    }

    public static final SubLObject get_drs_interaction_mt_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, FOURTEEN_INTEGER, INTERACTION_MT);
    }

    public static SubLObject get_drs_interaction_mt(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, FOURTEEN_INTEGER, INTERACTION_MT);
    }

    public static final SubLObject set_drs_interaction_mt_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, FOURTEEN_INTEGER, INTERACTION_MT);
    }

    public static SubLObject set_drs_interaction_mt(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, FOURTEEN_INTEGER, INTERACTION_MT);
    }

    public static final SubLObject get_drs_complex_conditions_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, THIRTEEN_INTEGER, COMPLEX_CONDITIONS);
    }

    public static SubLObject get_drs_complex_conditions(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, THIRTEEN_INTEGER, COMPLEX_CONDITIONS);
    }

    public static final SubLObject set_drs_complex_conditions_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, THIRTEEN_INTEGER, COMPLEX_CONDITIONS);
    }

    public static SubLObject set_drs_complex_conditions(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, THIRTEEN_INTEGER, COMPLEX_CONDITIONS);
    }

    public static final SubLObject get_drs_simple_conditions_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, TWELVE_INTEGER, SIMPLE_CONDITIONS);
    }

    public static SubLObject get_drs_simple_conditions(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, TWELVE_INTEGER, SIMPLE_CONDITIONS);
    }

    public static final SubLObject set_drs_simple_conditions_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, TWELVE_INTEGER, SIMPLE_CONDITIONS);
    }

    public static SubLObject set_drs_simple_conditions(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, TWELVE_INTEGER, SIMPLE_CONDITIONS);
    }

    public static final SubLObject get_drs_cycl_formulas_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, ELEVEN_INTEGER, CYCL_FORMULAS);
    }

    public static SubLObject get_drs_cycl_formulas(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, ELEVEN_INTEGER, CYCL_FORMULAS);
    }

    public static final SubLObject set_drs_cycl_formulas_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, ELEVEN_INTEGER, CYCL_FORMULAS);
    }

    public static SubLObject set_drs_cycl_formulas(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, ELEVEN_INTEGER, CYCL_FORMULAS);
    }

    public static final SubLObject get_drs_sub_drss_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, TEN_INTEGER, SUB_DRSS);
    }

    public static SubLObject get_drs_sub_drss(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, TEN_INTEGER, SUB_DRSS);
    }

    public static final SubLObject set_drs_sub_drss_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, TEN_INTEGER, SUB_DRSS);
    }

    public static SubLObject set_drs_sub_drss(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, TEN_INTEGER, SUB_DRSS);
    }

    public static final SubLObject get_drs_super_drs_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, NINE_INTEGER, SUPER_DRS);
    }

    public static SubLObject get_drs_super_drs(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, NINE_INTEGER, SUPER_DRS);
    }

    public static final SubLObject set_drs_super_drs_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, NINE_INTEGER, SUPER_DRS);
    }

    public static SubLObject set_drs_super_drs(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, NINE_INTEGER, SUPER_DRS);
    }

    public static final SubLObject get_drs_next_drs_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, EIGHT_INTEGER, NEXT_DRS);
    }

    public static SubLObject get_drs_next_drs(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, EIGHT_INTEGER, NEXT_DRS);
    }

    public static final SubLObject set_drs_next_drs_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, EIGHT_INTEGER, NEXT_DRS);
    }

    public static SubLObject set_drs_next_drs(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, EIGHT_INTEGER, NEXT_DRS);
    }

    public static final SubLObject get_drs_prev_drs_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, SEVEN_INTEGER, PREV_DRS);
    }

    public static SubLObject get_drs_prev_drs(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, SEVEN_INTEGER, PREV_DRS);
    }

    public static final SubLObject set_drs_prev_drs_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, SEVEN_INTEGER, PREV_DRS);
    }

    public static SubLObject set_drs_prev_drs(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, SEVEN_INTEGER, PREV_DRS);
    }

    public static final SubLObject get_drs_pronomial_rms_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, SIX_INTEGER, PRONOMIAL_RMS);
    }

    public static SubLObject get_drs_pronomial_rms(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, SIX_INTEGER, PRONOMIAL_RMS);
    }

    public static final SubLObject set_drs_pronomial_rms_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, SIX_INTEGER, PRONOMIAL_RMS);
    }

    public static SubLObject set_drs_pronomial_rms(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, SIX_INTEGER, PRONOMIAL_RMS);
    }

    public static final SubLObject get_drs_definite_rms_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, FIVE_INTEGER, DEFINITE_RMS);
    }

    public static SubLObject get_drs_definite_rms(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, FIVE_INTEGER, DEFINITE_RMS);
    }

    public static final SubLObject set_drs_definite_rms_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, FIVE_INTEGER, DEFINITE_RMS);
    }

    public static SubLObject set_drs_definite_rms(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, FIVE_INTEGER, DEFINITE_RMS);
    }

    public static final SubLObject get_drs_available_rms_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, FOUR_INTEGER, AVAILABLE_RMS);
    }

    public static SubLObject get_drs_available_rms(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, FOUR_INTEGER, AVAILABLE_RMS);
    }

    public static final SubLObject set_drs_available_rms_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, FOUR_INTEGER, AVAILABLE_RMS);
    }

    public static SubLObject set_drs_available_rms(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, FOUR_INTEGER, AVAILABLE_RMS);
    }

    public static final SubLObject get_drs_rms_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, THREE_INTEGER, RMS);
    }

    public static SubLObject get_drs_rms(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, THREE_INTEGER, RMS);
    }

    public static final SubLObject set_drs_rms_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, THREE_INTEGER, RMS);
    }

    public static SubLObject set_drs_rms(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, THREE_INTEGER, RMS);
    }

    public static final SubLObject get_drs_audience_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, TWO_INTEGER, AUDIENCE);
    }

    public static SubLObject get_drs_audience(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, TWO_INTEGER, AUDIENCE);
    }

    public static final SubLObject set_drs_audience_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, TWO_INTEGER, AUDIENCE);
    }

    public static SubLObject set_drs_audience(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, TWO_INTEGER, AUDIENCE);
    }

    public static final SubLObject get_drs_speaker_alt(SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, ONE_INTEGER, SPEAKER);
    }

    public static SubLObject get_drs_speaker(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, ONE_INTEGER, SPEAKER);
    }

    public static final SubLObject set_drs_speaker_alt(SubLObject drs, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, ONE_INTEGER, SPEAKER);
    }

    public static SubLObject set_drs_speaker(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, ONE_INTEGER, SPEAKER);
    }

    public static final SubLObject subloop_reserved_initialize_drs_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_drs_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_drs_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, SPEAKER, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, AUDIENCE, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, RMS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, AVAILABLE_RMS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, DEFINITE_RMS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, PRONOMIAL_RMS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, PREV_DRS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, NEXT_DRS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, SUPER_DRS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, SUB_DRSS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, CYCL_FORMULAS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, SIMPLE_CONDITIONS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, COMPLEX_CONDITIONS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, INTERACTION_MT, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, PARSING_MT, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_drs_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, SPEAKER, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, AUDIENCE, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, RMS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, AVAILABLE_RMS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, DEFINITE_RMS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, PRONOMIAL_RMS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, PREV_DRS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, NEXT_DRS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, SUPER_DRS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, SUB_DRSS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, CYCL_FORMULAS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, SIMPLE_CONDITIONS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, COMPLEX_CONDITIONS, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, INTERACTION_MT, NIL);
        classes.subloop_initialize_slot(new_instance, DRS, PARSING_MT, NIL);
        return NIL;
    }

    public static final SubLObject drs_p_alt(SubLObject drs) {
        return classes.subloop_instanceof_class(drs, DRS);
    }

    public static SubLObject drs_p(final SubLObject drs) {
        return classes.subloop_instanceof_class(drs, DRS);
    }

    public static final SubLObject drs_add_rm_method_alt(SubLObject self, SubLObject new_rm) {
        {
            SubLObject catch_var_for_drs_method = NIL;
            SubLObject rms = com.cyc.cycjava.cycl.drt_drs.get_drs_rms(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(new_rm, rms, UNPROVIDED, UNPROVIDED)) {
                        rms = cons(new_rm, rms);
                    }
                    sublisp_throw($sym27$OUTER_CATCH_FOR_DRS_METHOD, rms);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.drt_drs.set_drs_rms(self, rms);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym27$OUTER_CATCH_FOR_DRS_METHOD);
            }
            return catch_var_for_drs_method;
        }
    }

    public static SubLObject drs_add_rm_method(final SubLObject self, final SubLObject new_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = NIL;
        SubLObject rms = get_drs_rms(self);
        try {
            thread.throwStack.push($sym27$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                if (NIL == subl_promotions.memberP(new_rm, rms, UNPROVIDED, UNPROVIDED)) {
                    rms = cons(new_rm, rms);
                }
                sublisp_throw($sym27$OUTER_CATCH_FOR_DRS_METHOD, rms);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_drs_rms(self, rms);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym27$OUTER_CATCH_FOR_DRS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }

    public static final SubLObject drs_add_available_rm_method_alt(SubLObject self, SubLObject new_rm) {
        {
            SubLObject catch_var_for_drs_method = NIL;
            SubLObject available_rms = com.cyc.cycjava.cycl.drt_drs.get_drs_available_rms(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(new_rm, available_rms, UNPROVIDED, UNPROVIDED)) {
                        available_rms = cons(new_rm, available_rms);
                    }
                    sublisp_throw($sym31$OUTER_CATCH_FOR_DRS_METHOD, available_rms);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.drt_drs.set_drs_available_rms(self, available_rms);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym31$OUTER_CATCH_FOR_DRS_METHOD);
            }
            return catch_var_for_drs_method;
        }
    }

    public static SubLObject drs_add_available_rm_method(final SubLObject self, final SubLObject new_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = NIL;
        SubLObject available_rms = get_drs_available_rms(self);
        try {
            thread.throwStack.push($sym31$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                if (NIL == subl_promotions.memberP(new_rm, available_rms, UNPROVIDED, UNPROVIDED)) {
                    available_rms = cons(new_rm, available_rms);
                }
                sublisp_throw($sym31$OUTER_CATCH_FOR_DRS_METHOD, available_rms);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_drs_available_rms(self, available_rms);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym31$OUTER_CATCH_FOR_DRS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }

    public static final SubLObject drs_add_definite_rm_method_alt(SubLObject self, SubLObject new_rm) {
        {
            SubLObject catch_var_for_drs_method = NIL;
            SubLObject definite_rms = com.cyc.cycjava.cycl.drt_drs.get_drs_definite_rms(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(new_rm, definite_rms, UNPROVIDED, UNPROVIDED)) {
                        definite_rms = cons(new_rm, definite_rms);
                    }
                    sublisp_throw($sym35$OUTER_CATCH_FOR_DRS_METHOD, definite_rms);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.drt_drs.set_drs_definite_rms(self, definite_rms);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym35$OUTER_CATCH_FOR_DRS_METHOD);
            }
            return catch_var_for_drs_method;
        }
    }

    public static SubLObject drs_add_definite_rm_method(final SubLObject self, final SubLObject new_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = NIL;
        SubLObject definite_rms = get_drs_definite_rms(self);
        try {
            thread.throwStack.push($sym35$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                if (NIL == subl_promotions.memberP(new_rm, definite_rms, UNPROVIDED, UNPROVIDED)) {
                    definite_rms = cons(new_rm, definite_rms);
                }
                sublisp_throw($sym35$OUTER_CATCH_FOR_DRS_METHOD, definite_rms);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_drs_definite_rms(self, definite_rms);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym35$OUTER_CATCH_FOR_DRS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }

    public static final SubLObject drs_add_pronomial_rm_method_alt(SubLObject self, SubLObject new_rm) {
        {
            SubLObject catch_var_for_drs_method = NIL;
            SubLObject pronomial_rms = com.cyc.cycjava.cycl.drt_drs.get_drs_pronomial_rms(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(new_rm, pronomial_rms, UNPROVIDED, UNPROVIDED)) {
                        pronomial_rms = cons(new_rm, pronomial_rms);
                    }
                    sublisp_throw($sym39$OUTER_CATCH_FOR_DRS_METHOD, pronomial_rms);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.drt_drs.set_drs_pronomial_rms(self, pronomial_rms);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_DRS_METHOD);
            }
            return catch_var_for_drs_method;
        }
    }

    public static SubLObject drs_add_pronomial_rm_method(final SubLObject self, final SubLObject new_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = NIL;
        SubLObject pronomial_rms = get_drs_pronomial_rms(self);
        try {
            thread.throwStack.push($sym39$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                if (NIL == subl_promotions.memberP(new_rm, pronomial_rms, UNPROVIDED, UNPROVIDED)) {
                    pronomial_rms = cons(new_rm, pronomial_rms);
                }
                sublisp_throw($sym39$OUTER_CATCH_FOR_DRS_METHOD, pronomial_rms);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_drs_pronomial_rms(self, pronomial_rms);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_DRS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }

    /**
     * Create and initialize the starting DRS and RM structures for the formula provided.  The formula is expected to be initial cycl from a parser which includes NL attribute functions.
     */
    @LispMethod(comment = "Create and initialize the starting DRS and RM structures for the formula provided.  The formula is expected to be initial cycl from a parser which includes NL attribute functions.")
    public static final SubLObject create_drs_from_formula_alt(SubLObject formula, SubLObject interaction_mt, SubLObject parsing_mt, SubLObject speaker, SubLObject audience) {
        if (speaker == UNPROVIDED) {
            speaker = NIL;
        }
        if (audience == UNPROVIDED) {
            audience = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject drs = methods.funcall_class_method_with_0_args(DRS, NEW);
                SubLObject rms = NIL;
                SubLObject rm_formulas = drt_rm.drt_find_rm_formulas(formula);
                SubLObject rm_formula_to_rm_mappings = NIL;
                instances.set_slot(drs, INTERACTION_MT, interaction_mt);
                instances.set_slot(drs, PARSING_MT, parsing_mt);
                {
                    SubLObject cdolist_list_var = nreverse(rm_formulas);
                    SubLObject rm_formula = NIL;
                    for (rm_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rm_formula = cdolist_list_var.first()) {
                        {
                            SubLObject rm = drt_rm.create_rm_from_rm_formula(rm_formula, rm_formula_to_rm_mappings);
                            rm_formula_to_rm_mappings = cons(list(rm_formula, rm), rm_formula_to_rm_mappings);
                            rms = cons(rm, rms);
                        }
                    }
                }
                rms = nreverse(rms);
                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    if (NIL != rms) {
                        format(T, $str_alt42$_______________________INITIAL_RM);
                    }
                }
                {
                    SubLObject cdolist_list_var = rms;
                    SubLObject rm = NIL;
                    for (rm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rm = cdolist_list_var.first()) {
                        if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                            object.describe_instance(rm);
                            format(T, $str_alt43$__);
                        }
                        methods.funcall_instance_method_with_1_args(drs, ADD_RM, rm);
                    }
                }
                {
                    SubLObject new_formula = NIL;
                    new_formula = reformulator_utilities_nl.reformulate_cycl_quantunify_3(formula, interaction_mt, UNPROVIDED);
                    if (NIL != new_formula) {
                        {
                            SubLObject cdolist_list_var = new_formula.rest();
                            SubLObject formula_arg = NIL;
                            for (formula_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_arg = cdolist_list_var.first()) {
                                {
                                    SubLObject possible_avail_rms = methods.funcall_instance_method_with_2_args(drs, FIND_RM_BY_TARGET, formula_arg, $list_alt45);
                                    if (length(possible_avail_rms) == ONE_INTEGER) {
                                        {
                                            SubLObject avail_rm = possible_avail_rms.first();
                                            if (NIL != drt_rm.rm_p(avail_rm)) {
                                                instances.set_slot(avail_rm, TYPE, $AVAILABLE);
                                                methods.funcall_instance_method_with_1_args(drs, ADD_AVAILABLE_RM, avail_rm);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        formula = new_formula;
                    }
                }
                instances.set_slot(drs, CYCL_FORMULAS, list(formula));
                instances.set_slot(drs, SPEAKER, speaker);
                instances.set_slot(drs, AUDIENCE, audience);
                instances.set_slot(drs, PREV_DRS, drt.drt_get_last_drs_for_speaker(speaker));
                drt.drt_set_last_drs_for_speaker(speaker, drs);
                {
                    SubLObject cdolist_list_var = audience;
                    SubLObject audience_member = NIL;
                    for (audience_member = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , audience_member = cdolist_list_var.first()) {
                        drt.drt_set_last_drs_for_speaker(audience_member, drs);
                    }
                }
                drt.$drt_drs_list$.setDynamicValue(cons(drs, drt.$drt_drs_list$.getDynamicValue(thread)), thread);
                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    format(T, $str_alt48$_______________________INITIAL_DR);
                    object.describe_instance(drs);
                }
                return drs;
            }
        }
    }

    /**
     * Create and initialize the starting DRS and RM structures for the formula provided.  The formula is expected to be initial cycl from a parser which includes NL attribute functions.
     */
    @LispMethod(comment = "Create and initialize the starting DRS and RM structures for the formula provided.  The formula is expected to be initial cycl from a parser which includes NL attribute functions.")
    public static SubLObject create_drs_from_formula(SubLObject formula, final SubLObject interaction_mt, final SubLObject parsing_mt, SubLObject speaker, SubLObject audience) {
        if (speaker == UNPROVIDED) {
            speaker = NIL;
        }
        if (audience == UNPROVIDED) {
            audience = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject drs = methods.funcall_class_method_with_0_args(DRS, NEW);
        SubLObject rms = NIL;
        final SubLObject rm_formulas = drt_rm.drt_find_rm_formulas(formula);
        SubLObject rm_formula_to_rm_mappings = NIL;
        instances.set_slot(drs, INTERACTION_MT, interaction_mt);
        instances.set_slot(drs, PARSING_MT, parsing_mt);
        SubLObject cdolist_list_var = nreverse(rm_formulas);
        SubLObject rm_formula = NIL;
        rm_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rm = drt_rm.create_rm_from_rm_formula(rm_formula, rm_formula_to_rm_mappings);
            rm_formula_to_rm_mappings = cons(list(rm_formula, rm), rm_formula_to_rm_mappings);
            rms = cons(rm, rms);
            cdolist_list_var = cdolist_list_var.rest();
            rm_formula = cdolist_list_var.first();
        } 
        rms = nreverse(rms);
        if (((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) && (NIL != rms)) {
            format(T, $str42$_______________________INITIAL_RM);
        }
        cdolist_list_var = rms;
        SubLObject rm2 = NIL;
        rm2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                object.describe_instance(rm2);
                format(T, $str43$__);
            }
            methods.funcall_instance_method_with_1_args(drs, ADD_RM, rm2);
            cdolist_list_var = cdolist_list_var.rest();
            rm2 = cdolist_list_var.first();
        } 
        SubLObject new_formula = NIL;
        new_formula = reformulator_utilities_nl.reformulate_cycl_quantunify_3(formula, interaction_mt, UNPROVIDED);
        if (NIL != new_formula) {
            SubLObject cdolist_list_var2 = new_formula.rest();
            SubLObject formula_arg = NIL;
            formula_arg = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject possible_avail_rms = methods.funcall_instance_method_with_2_args(drs, FIND_RM_BY_TARGET, formula_arg, $list45);
                if (length(possible_avail_rms).eql(ONE_INTEGER)) {
                    final SubLObject avail_rm = possible_avail_rms.first();
                    if (NIL != drt_rm.rm_p(avail_rm)) {
                        instances.set_slot(avail_rm, TYPE, $AVAILABLE);
                        methods.funcall_instance_method_with_1_args(drs, ADD_AVAILABLE_RM, avail_rm);
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                formula_arg = cdolist_list_var2.first();
            } 
            formula = new_formula;
        }
        instances.set_slot(drs, CYCL_FORMULAS, list(formula));
        instances.set_slot(drs, SPEAKER, speaker);
        instances.set_slot(drs, AUDIENCE, audience);
        instances.set_slot(drs, PREV_DRS, drt.drt_get_last_drs_for_speaker(speaker));
        drt.drt_set_last_drs_for_speaker(speaker, drs);
        cdolist_list_var = audience;
        SubLObject audience_member = NIL;
        audience_member = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            drt.drt_set_last_drs_for_speaker(audience_member, drs);
            cdolist_list_var = cdolist_list_var.rest();
            audience_member = cdolist_list_var.first();
        } 
        drt.$drt_drs_list$.setDynamicValue(cons(drs, drt.$drt_drs_list$.getDynamicValue(thread)), thread);
        if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
            format(T, $str48$_______________________INITIAL_DR);
            object.describe_instance(drs);
        }
        return drs;
    }

    public static final SubLObject drt_quantproc_hint_fn_p_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishLexiconMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(fort, $drt_quantproc_hint_fns$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject drt_quantproc_hint_fn_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishLexiconMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fort, $drt_quantproc_hint_fns$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject drt_complex_formula_element_alt(SubLObject elem) {
        return makeBoolean((NIL != forts.fort_p(elem)) && (((((NIL != isa.isaP(elem, $$Quantifier, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(elem, $$LogicalConnective, UNPROVIDED, UNPROVIDED))) || (elem == $$NLNegFn)) || (elem == $$explains_PropProp)) || (NIL != com.cyc.cycjava.cycl.drt_drs.drt_quantproc_hint_fn_p(elem, UNPROVIDED))));
    }

    public static SubLObject drt_complex_formula_element(final SubLObject elem) {
        return makeBoolean((NIL != forts.fort_p(elem)) && (((((NIL != isa.isaP(elem, $$Quantifier, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(elem, $$LogicalConnective, UNPROVIDED, UNPROVIDED))) || elem.eql($$NLNegFn)) || elem.eql($$explains_PropProp)) || (NIL != drt_quantproc_hint_fn_p(elem, UNPROVIDED))));
    }

    /**
     * Determines whether FORMULA is complex or not.
     */
    @LispMethod(comment = "Determines whether FORMULA is complex or not.")
    public static final SubLObject drt_complex_formulaP_alt(SubLObject formula) {
        return list_utilities.tree_find_if(symbol_function(DRT_COMPLEX_FORMULA_ELEMENT), formula, UNPROVIDED);
    }

    /**
     * Determines whether FORMULA is complex or not.
     */
    @LispMethod(comment = "Determines whether FORMULA is complex or not.")
    public static SubLObject drt_complex_formulaP(final SubLObject formula) {
        return list_utilities.tree_find_if(symbol_function(DRT_COMPLEX_FORMULA_ELEMENT), formula, UNPROVIDED);
    }

    /**
     * Processes a DRS until the cycl-formulas slot is empty and all the contents have been moved into the relevant RMs, the simple and complex conditions lists, or the this DRS itself.
     */
    @LispMethod(comment = "Processes a DRS until the cycl-formulas slot is empty and all the contents have been moved into the relevant RMs, the simple and complex conditions lists, or the this DRS itself.")
    public static final SubLObject drs_process_method_alt(SubLObject self, SubLObject carry_possible_rm_coreferences) {
        if (carry_possible_rm_coreferences == UNPROVIDED) {
            carry_possible_rm_coreferences = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parsing_mt = com.cyc.cycjava.cycl.drt_drs.get_drs_parsing_mt(self);
                SubLObject interaction_mt = com.cyc.cycjava.cycl.drt_drs.get_drs_interaction_mt(self);
                SubLObject complex_conditions = com.cyc.cycjava.cycl.drt_drs.get_drs_complex_conditions(self);
                SubLObject simple_conditions = com.cyc.cycjava.cycl.drt_drs.get_drs_simple_conditions(self);
                SubLObject cycl_formulas = com.cyc.cycjava.cycl.drt_drs.get_drs_cycl_formulas(self);
                SubLObject sub_drss = com.cyc.cycjava.cycl.drt_drs.get_drs_sub_drss(self);
                SubLObject super_drs = com.cyc.cycjava.cycl.drt_drs.get_drs_super_drs(self);
                SubLObject pronomial_rms = com.cyc.cycjava.cycl.drt_drs.get_drs_pronomial_rms(self);
                SubLObject definite_rms = com.cyc.cycjava.cycl.drt_drs.get_drs_definite_rms(self);
                SubLObject available_rms = com.cyc.cycjava.cycl.drt_drs.get_drs_available_rms(self);
                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                    format(T, $str_alt60$___drs_process_method__A_, self);
                    object.object_describe_instance_method(self, UNPROVIDED, UNPROVIDED);
                    format(T, $str_alt43$__);
                }
                {
                    SubLObject simple_formulas = NIL;
                    SubLObject complex_formulas = NIL;
                    {
                        SubLObject cdolist_list_var = cycl_formulas;
                        SubLObject cycl_formula = NIL;
                        for (cycl_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_formula = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.drt_drs.drt_complex_formulaP(cycl_formula)) {
                                complex_formulas = cons(cycl_formula, complex_formulas);
                            } else {
                                simple_formulas = cons(cycl_formula, simple_formulas);
                            }
                        }
                    }
                    if (NIL != complex_formulas) {
                        if (length(complex_formulas).numG(ONE_INTEGER)) {
                            if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                Errors.warn($str_alt61$drt_process_drs__more_than_one_co, self, complex_formulas);
                            }
                        }
                        {
                            SubLObject complex_formula = complex_formulas.first();
                            SubLObject complex_formula_arg0 = cycl_utilities.formula_arg0(complex_formula);
                            complex_formulas = complex_formulas.rest();
                            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                            if (NIL != isa.isaP(complex_formula_arg0, $$Quantifier, UNPROVIDED, UNPROVIDED)) {
                                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                                    if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                        Errors.warn($str_alt62$1_a__quantifiers___);
                                    }
                                }
                                {
                                    SubLObject target_var = cycl_utilities.formula_arg1(complex_formula, UNPROVIDED);
                                    SubLObject rm = methods.funcall_instance_method_with_2_args(self, FIND_RM_BY_TARGET, target_var, $list_alt63).first();
                                    if (NIL == rm) {
                                        if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            Errors.warn($str_alt64$drt_process_drs__A__no_RM_found_f, self, target_var, complex_formula);
                                        }
                                    }
                                    if (NIL != rm) {
                                        if (NIL == instances.get_slot(rm, SCOPE)) {
                                            instances.set_slot(rm, SCOPE, complex_formula_arg0);
                                        }
                                        if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                                            format(T, $str_alt66$_1________________modified_RM_);
                                            object.describe_instance(rm);
                                            format(T, $str_alt67$_1_____________);
                                        }
                                    }
                                    complex_formulas = cons(cycl_utilities.formula_arg2(complex_formula, UNPROVIDED), complex_formulas);
                                    cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                                }
                            } else {
                                if (((NIL != isa.isaP(complex_formula_arg0, $$LogicalConnective, UNPROVIDED, UNPROVIDED)) || (complex_formula_arg0 == $$NLNegFn)) || (complex_formula_arg0 == $$explains_PropProp)) {
                                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                                        if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            Errors.warn($str_alt68$1_b__logical_connectives___);
                                        }
                                    }
                                    {
                                        SubLObject new_complex_condition = list(complex_formula_arg0);
                                        SubLObject subdrs_list = NIL;
                                        SubLObject pcase_var = complex_formula_arg0;
                                        if (pcase_var.eql($$and)) {
                                            complex_formulas = append(cycl_utilities.formula_args(complex_formula, UNPROVIDED), complex_formulas);
                                            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                                        } else {
                                            {
                                                SubLObject last_new_drs = NIL;
                                                SubLObject formula_args = cycl_utilities.formula_args(complex_formula, UNPROVIDED);
                                                SubLObject cdolist_list_var = formula_args;
                                                SubLObject formula_arg = NIL;
                                                for (formula_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_arg = cdolist_list_var.first()) {
                                                    if (formula_arg.isCons()) {
                                                        {
                                                            SubLObject subdrs = methods.funcall_class_method_with_0_args(DRS, NEW);
                                                            instances.set_slot(subdrs, INTERACTION_MT, interaction_mt);
                                                            instances.set_slot(subdrs, PARSING_MT, parsing_mt);
                                                            instances.set_slot(subdrs, CYCL_FORMULAS, list(formula_arg));
                                                            if (NIL != last_new_drs) {
                                                                instances.set_slot(subdrs, SUPER_DRS, last_new_drs);
                                                                instances.set_slot(last_new_drs, SUB_DRSS, list(subdrs));
                                                            } else {
                                                                instances.set_slot(subdrs, SUPER_DRS, self);
                                                                instances.set_slot(self, SUB_DRSS, list(subdrs));
                                                            }
                                                            last_new_drs = subdrs;
                                                            new_complex_condition = cons(subdrs, new_complex_condition);
                                                            subdrs_list = cons(subdrs, subdrs_list);
                                                        }
                                                    } else {
                                                        new_complex_condition = cons(formula_arg, new_complex_condition);
                                                    }
                                                }
                                            }
                                            new_complex_condition = nreverse(new_complex_condition);
                                            complex_conditions = instances.set_slot(self, COMPLEX_CONDITIONS, cons(new_complex_condition, complex_conditions));
                                            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                                            {
                                                SubLObject possible_rm_coreferences = NIL;
                                                SubLObject cdolist_list_var = subdrs_list;
                                                SubLObject subdrs = NIL;
                                                for (subdrs = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subdrs = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject sub_possible_rm_coreferences = methods.funcall_instance_method_with_0_args(subdrs, PROCESS);
                                                        if (sub_possible_rm_coreferences == T) {
                                                            return T;
                                                        } else {
                                                            possible_rm_coreferences = append(sub_possible_rm_coreferences, possible_rm_coreferences);
                                                        }
                                                    }
                                                }
                                                carry_possible_rm_coreferences = append(carry_possible_rm_coreferences, possible_rm_coreferences);
                                            }
                                        }
                                    }
                                } else {
                                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                                        if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            Errors.warn($str_alt70$1_c__quantproc__);
                                        }
                                        format(T, $str_alt71$Attempting_reformulation_on_____A, complex_formula);
                                    }
                                    {
                                        SubLObject new_complex_formula = NIL;
                                        {
                                            SubLObject doneP = NIL;
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = $drt_drs_quant_calls$.getDynamicValue(thread);
                                                    SubLObject quant_call = NIL;
                                                    for (quant_call = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , quant_call = csome_list_var.first()) {
                                                        {
                                                            SubLObject quant_call_type = com.cyc.cycjava.cycl.drt_drs.drt_drs_quant_call_type(quant_call);
                                                            SubLObject quant_call_test = com.cyc.cycjava.cycl.drt_drs.drt_drs_quant_call_test(quant_call);
                                                            SubLObject quant_call_fn = com.cyc.cycjava.cycl.drt_drs.drt_drs_quant_call_fn(quant_call);
                                                            SubLObject quant_call_mt = com.cyc.cycjava.cycl.drt_drs.drt_drs_quant_call_mt(quant_call);
                                                            SubLObject pcase_var = quant_call_mt;
                                                            if (pcase_var.eql($PARSING_MT)) {
                                                                quant_call_mt = parsing_mt;
                                                            } else {
                                                                if (pcase_var.eql($INTERACTION_MT)) {
                                                                    quant_call_mt = interaction_mt;
                                                                } else {
                                                                    quant_call_mt = interaction_mt;
                                                                }
                                                            }
                                                            if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                                                                format(T, $str_alt74$Attempting_reformulation_type__A_, quant_call_type, quant_call_mt);
                                                            }
                                                            if (quant_call_test.isFunctionSpec() && (NIL != funcall(quant_call_test, complex_formula))) {
                                                                if (quant_call_fn.isFunctionSpec()) {
                                                                    new_complex_formula = funcall(quant_call_fn, complex_formula, quant_call_mt);
                                                                }
                                                            }
                                                            if (!((NIL == new_complex_formula) || new_complex_formula.equal(complex_formula))) {
                                                                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                                                                    format(T, $str_alt75$Using_reformulator_result_from__A, quant_call_type, new_complex_formula);
                                                                }
                                                                doneP = T;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL == new_complex_formula) {
                                            if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                Errors.warn($str_alt76$failed_reformulation_on__A__new_c, complex_formula);
                                            }
                                            return T;
                                        } else {
                                            if (new_complex_formula.equal(complex_formula)) {
                                                if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                    Errors.warn($str_alt77$failed_reformulation_on__A__new_c, complex_formula);
                                                }
                                                return T;
                                            } else {
                                                {
                                                    SubLObject new_complex_formula_arg0 = cycl_utilities.formula_arg0(new_complex_formula);
                                                    if (NIL != isa.isaP(new_complex_formula_arg0, $$Quantifier, UNPROVIDED, UNPROVIDED)) {
                                                        {
                                                            SubLObject introduced_var = cycl_utilities.formula_arg1(new_complex_formula, UNPROVIDED);
                                                            SubLObject unique_var = cycl_variables.make_el_var(format(NIL, $str_alt78$DRT__A, integer_sequence_generator.integer_sequence_generator_next($drt_introduced_var_num_isg$.getGlobalValue())));
                                                            if (NIL != cycl_variables.el_varP(introduced_var)) {
                                                                new_complex_formula = list_utilities.tree_substitute(new_complex_formula, introduced_var, unique_var);
                                                            }
                                                        }
                                                        complex_formulas = cons(new_complex_formula, complex_formulas);
                                                        cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                                                        {
                                                            SubLObject introduced_var = cycl_utilities.formula_arg1(new_complex_formula, UNPROVIDED);
                                                            SubLObject subformula = cycl_utilities.formula_arg2(new_complex_formula, UNPROVIDED);
                                                            SubLObject target_terms = com.cyc.cycjava.cycl.drt_drs.find_terms_for_var_in_formula(introduced_var, subformula);
                                                            SubLObject rm = NIL;
                                                            SubLObject doneP = NIL;
                                                            SubLObject done2P = NIL;
                                                            if (NIL == doneP) {
                                                                {
                                                                    SubLObject csome_list_var = target_terms;
                                                                    SubLObject target_term = NIL;
                                                                    for (target_term = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , target_term = csome_list_var.first()) {
                                                                        {
                                                                            SubLObject poss_rms = methods.funcall_instance_method_with_2_args(self, FIND_RM_BY_TARGET, target_term, $list_alt79);
                                                                            if (NIL == done2P) {
                                                                                {
                                                                                    SubLObject csome_list_var_1 = poss_rms;
                                                                                    SubLObject poss_rm = NIL;
                                                                                    for (poss_rm = csome_list_var_1.first(); !((NIL != done2P) || (NIL == csome_list_var_1)); csome_list_var_1 = csome_list_var_1.rest() , poss_rm = csome_list_var_1.first()) {
                                                                                        if ((NIL != drt_rm.rm_p(poss_rm)) && (NIL == instances.get_slot(poss_rm, TARGET_VAR))) {
                                                                                            rm = poss_rm;
                                                                                            doneP = T;
                                                                                            done2P = T;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (NIL != drt_rm.rm_p(rm)) {
                                                                instances.set_slot(rm, TARGET_VAR, introduced_var);
                                                                instances.set_slot(rm, SCOPE, new_complex_formula_arg0);
                                                                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                                                                    format(T, $str_alt81$___2________________modified_RM_);
                                                                    object.describe_instance(rm);
                                                                    format(T, $str_alt82$_2_____________);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (NIL != isa.isaP(new_complex_formula_arg0, $$LogicalConnective, UNPROVIDED, UNPROVIDED)) {
                                                            {
                                                                SubLObject introduced_var = second(second(new_complex_formula));
                                                                SubLObject unique_var = cycl_variables.make_el_var(format(NIL, $str_alt78$DRT__A, integer_sequence_generator.integer_sequence_generator_next($drt_introduced_var_num_isg$.getGlobalValue())));
                                                                if (NIL != cycl_variables.el_varP(introduced_var)) {
                                                                    new_complex_formula = list_utilities.tree_substitute(new_complex_formula, introduced_var, unique_var);
                                                                }
                                                            }
                                                            complex_formulas = cons(new_complex_formula, complex_formulas);
                                                            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                                                            {
                                                                SubLObject introduced_var = second(second(new_complex_formula));
                                                                SubLObject target_term = third(second(new_complex_formula));
                                                                SubLObject poss_rms = methods.funcall_instance_method_with_2_args(self, FIND_RM_BY_TARGET, target_term, $list_alt45);
                                                                SubLObject rm = NIL;
                                                                SubLObject doneP = NIL;
                                                                if (NIL == doneP) {
                                                                    {
                                                                        SubLObject csome_list_var = poss_rms;
                                                                        SubLObject poss_rm = NIL;
                                                                        for (poss_rm = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , poss_rm = csome_list_var.first()) {
                                                                            if ((NIL != drt_rm.rm_p(poss_rm)) && (NIL == instances.get_slot(poss_rm, TARGET_VAR))) {
                                                                                rm = poss_rm;
                                                                                doneP = T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                instances.set_slot(rm, TARGET_VAR, introduced_var);
                                                                instances.set_slot(rm, SCOPE, $$forAll);
                                                                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                                                                    format(T, $str_alt84$___3________________modified_RM_);
                                                                    object.describe_instance(rm);
                                                                    format(T, $str_alt85$_3_____________);
                                                                }
                                                            }
                                                        } else {
                                                            complex_formulas = cons(new_complex_formula, complex_formulas);
                                                            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != simple_formulas) {
                        if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                            if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                Errors.warn($str_alt86$1_d__subcollection_processing__);
                            }
                        }
                        {
                            SubLObject new_simple_formulas = NIL;
                            SubLObject new_complex_formulas = complex_formulas;
                            SubLObject cdolist_list_var = simple_formulas;
                            SubLObject simple_formula = NIL;
                            for (simple_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , simple_formula = cdolist_list_var.first()) {
                                {
                                    SubLObject poss_new_formula = reformulator_utilities_nl.reformulate_cycl_subcollproc(simple_formula, interaction_mt, UNPROVIDED);
                                    if ((NIL == poss_new_formula) || poss_new_formula.equal(simple_formula)) {
                                        new_simple_formulas = cons(simple_formula, new_simple_formulas);
                                    } else {
                                        new_complex_formulas = cons(poss_new_formula, new_complex_formulas);
                                    }
                                }
                            }
                            simple_formulas = new_simple_formulas;
                            complex_formulas = new_complex_formulas;
                            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                        }
                    }
                    if (NIL != simple_formulas) {
                        if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                            if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                Errors.warn($str_alt87$1_e__simple_formulas__);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = simple_formulas;
                            SubLObject simple_formula = NIL;
                            for (simple_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , simple_formula = cdolist_list_var.first()) {
                                {
                                    SubLObject simple_condition = com.cyc.cycjava.cycl.drt_drs.drt_drs_map_add_rms_to_formula(self, simple_formula);
                                    SubLObject cdolist_list_var_2 = list_utilities.tree_find_all_if(symbol_function(RM_P), simple_condition, UNPROVIDED);
                                    SubLObject rm = NIL;
                                    for (rm = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , rm = cdolist_list_var_2.first()) {
                                        {
                                            SubLObject pcase_var = instances.get_slot(rm, TYPE);
                                            if (pcase_var.eql($DEFINITE)) {
                                                definite_rms = methods.funcall_instance_method_with_1_args(self, ADD_DEFINITE_RM, rm);
                                            } else {
                                                if (pcase_var.eql($PRONOMIAL)) {
                                                    pronomial_rms = methods.funcall_instance_method_with_1_args(self, ADD_PRONOMIAL_RM, rm);
                                                } else {
                                                    available_rms = methods.funcall_instance_method_with_1_args(self, ADD_AVAILABLE_RM, rm);
                                                }
                                            }
                                        }
                                    }
                                    simple_conditions = instances.set_slot(self, SIMPLE_CONDITIONS, cons(simple_condition, simple_conditions));
                                }
                            }
                        }
                        simple_formulas = NIL;
                        cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, complex_formulas);
                    }
                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        if (NIL == cycl_formulas) {
                            format(T, $str_alt91$_______________________FINAL_DRS_);
                            object.object_describe_instance_method(self, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    if (NIL != cycl_formulas) {
                        return methods.funcall_instance_method_with_1_args(self, PROCESS, carry_possible_rm_coreferences);
                    } else {
                        return methods.funcall_instance_method_with_0_args(self, FIND_ALL_POSSIBLE_RM_COREFERENCES);
                    }
                }
            }
        }
    }

    /**
     * Processes a DRS until the cycl-formulas slot is empty and all the contents have been moved into the relevant RMs, the simple and complex conditions lists, or the this DRS itself.
     */
    @LispMethod(comment = "Processes a DRS until the cycl-formulas slot is empty and all the contents have been moved into the relevant RMs, the simple and complex conditions lists, or the this DRS itself.")
    public static SubLObject drs_process_method(final SubLObject self, SubLObject carry_possible_rm_coreferences) {
        if (carry_possible_rm_coreferences == UNPROVIDED) {
            carry_possible_rm_coreferences = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject parsing_mt = get_drs_parsing_mt(self);
        final SubLObject interaction_mt = get_drs_interaction_mt(self);
        SubLObject complex_conditions = get_drs_complex_conditions(self);
        SubLObject simple_conditions = get_drs_simple_conditions(self);
        SubLObject cycl_formulas = get_drs_cycl_formulas(self);
        final SubLObject sub_drss = get_drs_sub_drss(self);
        final SubLObject super_drs = get_drs_super_drs(self);
        SubLObject pronomial_rms = get_drs_pronomial_rms(self);
        SubLObject definite_rms = get_drs_definite_rms(self);
        SubLObject available_rms = get_drs_available_rms(self);
        if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
            format(T, $str60$___drs_process_method__A_, self);
            object.object_describe_instance_method(self, UNPROVIDED, UNPROVIDED);
            format(T, $str43$__);
        }
        SubLObject simple_formulas = NIL;
        SubLObject complex_formulas = NIL;
        SubLObject cdolist_list_var = cycl_formulas;
        SubLObject cycl_formula = NIL;
        cycl_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != drt_complex_formulaP(cycl_formula)) {
                complex_formulas = cons(cycl_formula, complex_formulas);
            } else {
                simple_formulas = cons(cycl_formula, simple_formulas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_formula = cdolist_list_var.first();
        } 
        if (NIL != complex_formulas) {
            if (length(complex_formulas).numG(ONE_INTEGER) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                Errors.warn($str61$drt_process_drs__more_than_one_co, self, complex_formulas);
            }
            final SubLObject complex_formula = complex_formulas.first();
            final SubLObject complex_formula_arg0 = cycl_utilities.formula_arg0(complex_formula);
            complex_formulas = complex_formulas.rest();
            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
            if (NIL != isa.isaP(complex_formula_arg0, $$Quantifier, UNPROVIDED, UNPROVIDED)) {
                if (((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    Errors.warn($str62$1_a__quantifiers___);
                }
                final SubLObject target_var = cycl_utilities.formula_arg1(complex_formula, UNPROVIDED);
                final SubLObject rm = methods.funcall_instance_method_with_2_args(self, FIND_RM_BY_TARGET, target_var, $list63).first();
                if ((NIL == rm) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    Errors.warn($str64$drt_process_drs__A__no_RM_found_f, self, target_var, complex_formula);
                }
                if (NIL != rm) {
                    if (NIL == instances.get_slot(rm, SCOPE)) {
                        instances.set_slot(rm, SCOPE, complex_formula_arg0);
                    }
                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                        format(T, $str66$_1________________modified_RM_);
                        object.describe_instance(rm);
                        format(T, $str67$_1_____________);
                    }
                }
                complex_formulas = cons(cycl_utilities.formula_arg2(complex_formula, UNPROVIDED), complex_formulas);
                cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
            } else
                if (((NIL != isa.isaP(complex_formula_arg0, $$LogicalConnective, UNPROVIDED, UNPROVIDED)) || complex_formula_arg0.eql($$NLNegFn)) || complex_formula_arg0.eql($$explains_PropProp)) {
                    if (((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        Errors.warn($str68$1_b__logical_connectives___);
                    }
                    SubLObject new_complex_condition = list(complex_formula_arg0);
                    SubLObject subdrs_list = NIL;
                    final SubLObject pcase_var = complex_formula_arg0;
                    if (pcase_var.eql($$and)) {
                        complex_formulas = append(cycl_utilities.formula_args(complex_formula, UNPROVIDED), complex_formulas);
                        cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                    } else {
                        SubLObject last_new_drs = NIL;
                        SubLObject cdolist_list_var2;
                        final SubLObject formula_args = cdolist_list_var2 = cycl_utilities.formula_args(complex_formula, UNPROVIDED);
                        SubLObject formula_arg = NIL;
                        formula_arg = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (formula_arg.isCons()) {
                                final SubLObject subdrs = methods.funcall_class_method_with_0_args(DRS, NEW);
                                instances.set_slot(subdrs, INTERACTION_MT, interaction_mt);
                                instances.set_slot(subdrs, PARSING_MT, parsing_mt);
                                instances.set_slot(subdrs, CYCL_FORMULAS, list(formula_arg));
                                if (NIL != last_new_drs) {
                                    instances.set_slot(subdrs, SUPER_DRS, last_new_drs);
                                    instances.set_slot(last_new_drs, SUB_DRSS, list(subdrs));
                                } else {
                                    instances.set_slot(subdrs, SUPER_DRS, self);
                                    instances.set_slot(self, SUB_DRSS, list(subdrs));
                                }
                                last_new_drs = subdrs;
                                new_complex_condition = cons(subdrs, new_complex_condition);
                                subdrs_list = cons(subdrs, subdrs_list);
                            } else {
                                new_complex_condition = cons(formula_arg, new_complex_condition);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            formula_arg = cdolist_list_var2.first();
                        } 
                        new_complex_condition = nreverse(new_complex_condition);
                        complex_conditions = instances.set_slot(self, COMPLEX_CONDITIONS, cons(new_complex_condition, complex_conditions));
                        cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                        SubLObject possible_rm_coreferences = NIL;
                        SubLObject cdolist_list_var3 = subdrs_list;
                        SubLObject subdrs2 = NIL;
                        subdrs2 = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            final SubLObject sub_possible_rm_coreferences = methods.funcall_instance_method_with_0_args(subdrs2, PROCESS);
                            if (sub_possible_rm_coreferences == T) {
                                return T;
                            }
                            possible_rm_coreferences = append(sub_possible_rm_coreferences, possible_rm_coreferences);
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            subdrs2 = cdolist_list_var3.first();
                        } 
                        carry_possible_rm_coreferences = append(carry_possible_rm_coreferences, possible_rm_coreferences);
                    }
                } else {
                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                        if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            Errors.warn($str70$1_c__quantproc__);
                        }
                        format(T, $str71$Attempting_reformulation_on_____A, complex_formula);
                    }
                    SubLObject new_complex_formula = NIL;
                    SubLObject doneP = NIL;
                    if (NIL == doneP) {
                        SubLObject csome_list_var = $drt_drs_quant_calls$.getDynamicValue(thread);
                        SubLObject quant_call = NIL;
                        quant_call = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            final SubLObject quant_call_type = drt_drs_quant_call_type(quant_call);
                            final SubLObject quant_call_test = drt_drs_quant_call_test(quant_call);
                            final SubLObject quant_call_fn = drt_drs_quant_call_fn(quant_call);
                            final SubLObject pcase_var2;
                            SubLObject quant_call_mt = pcase_var2 = drt_drs_quant_call_mt(quant_call);
                            if (pcase_var2.eql($PARSING_MT)) {
                                quant_call_mt = parsing_mt;
                            } else
                                if (pcase_var2.eql($INTERACTION_MT)) {
                                    quant_call_mt = interaction_mt;
                                } else {
                                    quant_call_mt = interaction_mt;
                                }

                            if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                                format(T, $str74$Attempting_reformulation_type__A_, quant_call_type, quant_call_mt);
                            }
                            if ((quant_call_test.isFunctionSpec() && (NIL != funcall(quant_call_test, complex_formula))) && quant_call_fn.isFunctionSpec()) {
                                new_complex_formula = funcall(quant_call_fn, complex_formula, quant_call_mt);
                            }
                            if ((NIL != new_complex_formula) && (!new_complex_formula.equal(complex_formula))) {
                                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                                    format(T, $str75$Using_reformulator_result_from__A, quant_call_type, new_complex_formula);
                                }
                                doneP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            quant_call = csome_list_var.first();
                        } 
                    }
                    if (NIL == new_complex_formula) {
                        if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            Errors.warn($str76$failed_reformulation_on__A__new_c, complex_formula);
                        }
                        return T;
                    }
                    if (new_complex_formula.equal(complex_formula)) {
                        if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            Errors.warn($str77$failed_reformulation_on__A__new_c, complex_formula);
                        }
                        return T;
                    }
                    final SubLObject new_complex_formula_arg0 = cycl_utilities.formula_arg0(new_complex_formula);
                    if (NIL != isa.isaP(new_complex_formula_arg0, $$Quantifier, UNPROVIDED, UNPROVIDED)) {
                        SubLObject introduced_var = cycl_utilities.formula_arg1(new_complex_formula, UNPROVIDED);
                        final SubLObject unique_var = cycl_variables.make_el_var(format(NIL, $str78$DRT__A, integer_sequence_generator.integer_sequence_generator_next($drt_introduced_var_num_isg$.getGlobalValue())));
                        if (NIL != cycl_variables.el_varP(introduced_var)) {
                            new_complex_formula = list_utilities.tree_substitute(new_complex_formula, introduced_var, unique_var);
                        }
                        complex_formulas = cons(new_complex_formula, complex_formulas);
                        cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                        introduced_var = cycl_utilities.formula_arg1(new_complex_formula, UNPROVIDED);
                        final SubLObject subformula = cycl_utilities.formula_arg2(new_complex_formula, UNPROVIDED);
                        final SubLObject target_terms = find_terms_for_var_in_formula(introduced_var, subformula);
                        SubLObject rm2 = NIL;
                        SubLObject doneP2 = NIL;
                        SubLObject done2P = NIL;
                        if (NIL == doneP2) {
                            SubLObject csome_list_var2 = target_terms;
                            SubLObject target_term = NIL;
                            target_term = csome_list_var2.first();
                            while ((NIL == doneP2) && (NIL != csome_list_var2)) {
                                final SubLObject poss_rms = methods.funcall_instance_method_with_2_args(self, FIND_RM_BY_TARGET, target_term, $list79);
                                if (NIL == done2P) {
                                    SubLObject csome_list_var_$1 = poss_rms;
                                    SubLObject poss_rm = NIL;
                                    poss_rm = csome_list_var_$1.first();
                                    while ((NIL == done2P) && (NIL != csome_list_var_$1)) {
                                        if ((NIL != drt_rm.rm_p(poss_rm)) && (NIL == instances.get_slot(poss_rm, TARGET_VAR))) {
                                            rm2 = poss_rm;
                                            doneP2 = T;
                                            done2P = T;
                                        }
                                        csome_list_var_$1 = csome_list_var_$1.rest();
                                        poss_rm = csome_list_var_$1.first();
                                    } 
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                target_term = csome_list_var2.first();
                            } 
                        }
                        if (NIL != drt_rm.rm_p(rm2)) {
                            instances.set_slot(rm2, TARGET_VAR, introduced_var);
                            instances.set_slot(rm2, SCOPE, new_complex_formula_arg0);
                            if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                                format(T, $str81$___2________________modified_RM_);
                                object.describe_instance(rm2);
                                format(T, $str82$_2_____________);
                            }
                        }
                    } else
                        if (NIL != isa.isaP(new_complex_formula_arg0, $$LogicalConnective, UNPROVIDED, UNPROVIDED)) {
                            SubLObject introduced_var = second(second(new_complex_formula));
                            final SubLObject unique_var = cycl_variables.make_el_var(format(NIL, $str78$DRT__A, integer_sequence_generator.integer_sequence_generator_next($drt_introduced_var_num_isg$.getGlobalValue())));
                            if (NIL != cycl_variables.el_varP(introduced_var)) {
                                new_complex_formula = list_utilities.tree_substitute(new_complex_formula, introduced_var, unique_var);
                            }
                            complex_formulas = cons(new_complex_formula, complex_formulas);
                            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                            introduced_var = second(second(new_complex_formula));
                            final SubLObject target_term2 = third(second(new_complex_formula));
                            final SubLObject poss_rms2 = methods.funcall_instance_method_with_2_args(self, FIND_RM_BY_TARGET, target_term2, $list45);
                            SubLObject rm2 = NIL;
                            SubLObject doneP2 = NIL;
                            if (NIL == doneP2) {
                                SubLObject csome_list_var3 = poss_rms2;
                                SubLObject poss_rm2 = NIL;
                                poss_rm2 = csome_list_var3.first();
                                while ((NIL == doneP2) && (NIL != csome_list_var3)) {
                                    if ((NIL != drt_rm.rm_p(poss_rm2)) && (NIL == instances.get_slot(poss_rm2, TARGET_VAR))) {
                                        rm2 = poss_rm2;
                                        doneP2 = T;
                                    }
                                    csome_list_var3 = csome_list_var3.rest();
                                    poss_rm2 = csome_list_var3.first();
                                } 
                            }
                            instances.set_slot(rm2, TARGET_VAR, introduced_var);
                            instances.set_slot(rm2, SCOPE, $$forAll);
                            if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                                format(T, $str84$___3________________modified_RM_);
                                object.describe_instance(rm2);
                                format(T, $str85$_3_____________);
                            }
                        } else {
                            complex_formulas = cons(new_complex_formula, complex_formulas);
                            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
                        }

                }

        }
        if (NIL != simple_formulas) {
            if (((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                Errors.warn($str86$1_d__subcollection_processing__);
            }
            SubLObject new_simple_formulas = NIL;
            SubLObject new_complex_formulas = complex_formulas;
            SubLObject cdolist_list_var4 = simple_formulas;
            SubLObject simple_formula = NIL;
            simple_formula = cdolist_list_var4.first();
            while (NIL != cdolist_list_var4) {
                final SubLObject poss_new_formula = reformulator_utilities_nl.reformulate_cycl_subcollproc(simple_formula, interaction_mt, UNPROVIDED);
                if ((NIL == poss_new_formula) || poss_new_formula.equal(simple_formula)) {
                    new_simple_formulas = cons(simple_formula, new_simple_formulas);
                } else {
                    new_complex_formulas = cons(poss_new_formula, new_complex_formulas);
                }
                cdolist_list_var4 = cdolist_list_var4.rest();
                simple_formula = cdolist_list_var4.first();
            } 
            simple_formulas = new_simple_formulas;
            complex_formulas = new_complex_formulas;
            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, append(complex_formulas, simple_formulas));
        }
        if (NIL != simple_formulas) {
            if (((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                Errors.warn($str87$1_e__simple_formulas__);
            }
            cdolist_list_var = simple_formulas;
            SubLObject simple_formula2 = NIL;
            simple_formula2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject simple_condition = drt_drs_map_add_rms_to_formula(self, simple_formula2);
                SubLObject cdolist_list_var_$2 = list_utilities.tree_find_all_if(symbol_function(RM_P), simple_condition, UNPROVIDED);
                SubLObject rm3 = NIL;
                rm3 = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    final SubLObject pcase_var3 = instances.get_slot(rm3, TYPE);
                    if (pcase_var3.eql($DEFINITE)) {
                        definite_rms = methods.funcall_instance_method_with_1_args(self, ADD_DEFINITE_RM, rm3);
                    } else
                        if (pcase_var3.eql($PRONOMIAL)) {
                            pronomial_rms = methods.funcall_instance_method_with_1_args(self, ADD_PRONOMIAL_RM, rm3);
                        } else {
                            available_rms = methods.funcall_instance_method_with_1_args(self, ADD_AVAILABLE_RM, rm3);
                        }

                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    rm3 = cdolist_list_var_$2.first();
                } 
                simple_conditions = instances.set_slot(self, SIMPLE_CONDITIONS, cons(simple_condition, simple_conditions));
                cdolist_list_var = cdolist_list_var.rest();
                simple_formula2 = cdolist_list_var.first();
            } 
            simple_formulas = NIL;
            cycl_formulas = instances.set_slot(self, CYCL_FORMULAS, complex_formulas);
        }
        if (((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) && (NIL == cycl_formulas)) {
            format(T, $str91$_______________________FINAL_DRS_);
            object.object_describe_instance_method(self, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != cycl_formulas) {
            return methods.funcall_instance_method_with_1_args(self, PROCESS, carry_possible_rm_coreferences);
        }
        return methods.funcall_instance_method_with_0_args(self, FIND_ALL_POSSIBLE_RM_COREFERENCES);
    }

    /**
     * Returns a list of lists of the form (RM ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...)) indicating the probabiltiy of each possible RM coreference in this DRS.
     */
    @LispMethod(comment = "Returns a list of lists of the form (RM ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...)) indicating the probabiltiy of each possible RM coreference in this DRS.")
    public static final SubLObject drs_find_all_possible_rm_coreferences_method_alt(SubLObject self) {
        {
            SubLObject sub_drss = com.cyc.cycjava.cycl.drt_drs.get_drs_sub_drss(self);
            SubLObject pronomial_rms = com.cyc.cycjava.cycl.drt_drs.get_drs_pronomial_rms(self);
            SubLObject result = NIL;
            if (NIL != sub_drss) {
                {
                    SubLObject cdolist_list_var = sub_drss;
                    SubLObject sub_drs = NIL;
                    for (sub_drs = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_drs = cdolist_list_var.first()) {
                        result = append(new SubLObject[]{ methods.funcall_instance_method_with_0_args(sub_drs, FIND_ALL_POSSIBLE_RM_COREFERENCES) });
                    }
                }
            }
            if (NIL != pronomial_rms) {
                {
                    SubLObject cdolist_list_var = pronomial_rms;
                    SubLObject pronomial_rm = NIL;
                    for (pronomial_rm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pronomial_rm = cdolist_list_var.first()) {
                        {
                            SubLObject possible_rm_coreferences = methods.funcall_instance_method_with_1_args(self, FIND_POSSIBLE_RM_COREFERENCES, pronomial_rm);
                            if (NIL != possible_rm_coreferences) {
                                result = cons(list(pronomial_rm, possible_rm_coreferences), result);
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     * Returns a list of lists of the form (RM ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...)) indicating the probabiltiy of each possible RM coreference in this DRS.
     */
    @LispMethod(comment = "Returns a list of lists of the form (RM ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...)) indicating the probabiltiy of each possible RM coreference in this DRS.")
    public static SubLObject drs_find_all_possible_rm_coreferences_method(final SubLObject self) {
        final SubLObject sub_drss = get_drs_sub_drss(self);
        final SubLObject pronomial_rms = get_drs_pronomial_rms(self);
        SubLObject result = NIL;
        if (NIL != sub_drss) {
            SubLObject cdolist_list_var = sub_drss;
            SubLObject sub_drs = NIL;
            sub_drs = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = append(new SubLObject[]{ methods.funcall_instance_method_with_0_args(sub_drs, FIND_ALL_POSSIBLE_RM_COREFERENCES) });
                cdolist_list_var = cdolist_list_var.rest();
                sub_drs = cdolist_list_var.first();
            } 
        }
        if (NIL != pronomial_rms) {
            SubLObject cdolist_list_var = pronomial_rms;
            SubLObject pronomial_rm = NIL;
            pronomial_rm = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject possible_rm_coreferences = methods.funcall_instance_method_with_1_args(self, FIND_POSSIBLE_RM_COREFERENCES, pronomial_rm);
                if (NIL != possible_rm_coreferences) {
                    result = cons(list(pronomial_rm, possible_rm_coreferences), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pronomial_rm = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject possible_rm_coreference_source_rm_alt(SubLObject possible_rm_coreference) {
        return possible_rm_coreference.first();
    }

    public static SubLObject possible_rm_coreference_source_rm(final SubLObject possible_rm_coreference) {
        return possible_rm_coreference.first();
    }

    public static final SubLObject possible_rm_coreference_targets_alt(SubLObject possible_rm_coreference) {
        return second(possible_rm_coreference);
    }

    public static SubLObject possible_rm_coreference_targets(final SubLObject possible_rm_coreference) {
        return second(possible_rm_coreference);
    }

    public static final SubLObject possible_rm_coreference_target_rm_alt(SubLObject possible_rm_coreference_target) {
        return possible_rm_coreference_target.first();
    }

    public static SubLObject possible_rm_coreference_target_rm(final SubLObject possible_rm_coreference_target) {
        return possible_rm_coreference_target.first();
    }

    public static final SubLObject possible_rm_coreference_target_probability_alt(SubLObject possible_rm_coreference_target) {
        return second(possible_rm_coreference_target);
    }

    public static SubLObject possible_rm_coreference_target_probability(final SubLObject possible_rm_coreference_target) {
        return second(possible_rm_coreference_target);
    }

    /**
     * Returns a list of the form ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...) indicating the possible coreferences of the specified RM in this DRS.  If DEPTH is specified, we look to DEPTH-1 previous DRSs for possible intersentential coreferences.
     */
    @LispMethod(comment = "Returns a list of the form ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...) indicating the possible coreferences of the specified RM in this DRS.  If DEPTH is specified, we look to DEPTH-1 previous DRSs for possible intersentential coreferences.")
    public static final SubLObject drs_find_possible_rm_coreferences_method_alt(SubLObject self, SubLObject rm, SubLObject depth, SubLObject cutoff) {
        if (depth == UNPROVIDED) {
            depth = $drt_possible_rm_coreferences_max_depth$.getDynamicValue();
        }
        if (cutoff == UNPROVIDED) {
            cutoff = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_drs_method = NIL;
                SubLObject super_drs = com.cyc.cycjava.cycl.drt_drs.get_drs_super_drs(self);
                SubLObject prev_drs = com.cyc.cycjava.cycl.drt_drs.get_drs_prev_drs(self);
                SubLObject definite_rms = com.cyc.cycjava.cycl.drt_drs.get_drs_definite_rms(self);
                SubLObject available_rms = com.cyc.cycjava.cycl.drt_drs.get_drs_available_rms(self);
                SubLObject audience = com.cyc.cycjava.cycl.drt_drs.get_drs_audience(self);
                SubLObject speaker = com.cyc.cycjava.cycl.drt_drs.get_drs_speaker(self);
                try {
                    try {
                        {
                            SubLObject possible_rm_coreference_value_pairs = NIL;
                            SubLObject rm_formula = instances.get_slot(rm, FORMULA);
                            if (cycl_utilities.formula_arg0(rm_formula) == $$PronounFn) {
                                if ((((cycl_utilities.formula_arg1(rm_formula, UNPROVIDED) == $$FirstPerson_NLAttr) && (cycl_utilities.formula_arg2(rm_formula, UNPROVIDED) == $$Singular_NLAttr)) && (cycl_utilities.formula_arg3(rm_formula, UNPROVIDED) == $$Ungendered_NLAttr)) && (NIL != forts.fort_p(speaker))) {
                                    possible_rm_coreference_value_pairs = cons(bq_cons(speaker, $list_alt97), possible_rm_coreference_value_pairs);
                                } else {
                                    if (((cycl_utilities.formula_arg1(rm_formula, UNPROVIDED) == $$SecondPerson_NLAttr) && (cycl_utilities.formula_arg2(rm_formula, UNPROVIDED) == $$Singular_NLAttr)) && (cycl_utilities.formula_arg3(rm_formula, UNPROVIDED) == $$Ungendered_NLAttr)) {
                                        {
                                            SubLObject cdolist_list_var = audience;
                                            SubLObject audience_member = NIL;
                                            for (audience_member = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , audience_member = cdolist_list_var.first()) {
                                                possible_rm_coreference_value_pairs = cons(bq_cons(audience_member, $list_alt97), possible_rm_coreference_value_pairs);
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = available_rms;
                                SubLObject available_rm = NIL;
                                for (available_rm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , available_rm = cdolist_list_var.first()) {
                                    possible_rm_coreference_value_pairs = cons(list(available_rm, methods.funcall_instance_method_with_1_args(rm, COREFERENCE_PROBABILITY, available_rm)), possible_rm_coreference_value_pairs);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = definite_rms;
                                SubLObject definite_rm = NIL;
                                for (definite_rm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , definite_rm = cdolist_list_var.first()) {
                                    possible_rm_coreference_value_pairs = cons(list(definite_rm, methods.funcall_instance_method_with_1_args(rm, COREFERENCE_PROBABILITY, definite_rm)), possible_rm_coreference_value_pairs);
                                }
                            }
                            {
                                SubLObject back_drs = NIL;
                                if (NIL != super_drs) {
                                    back_drs = super_drs;
                                } else {
                                    if (NIL != prev_drs) {
                                        if (depth.numG(ZERO_INTEGER)) {
                                            depth = subtract(depth, ONE_INTEGER);
                                            back_drs = prev_drs;
                                        }
                                    }
                                }
                                if (NIL != back_drs) {
                                    {
                                        SubLObject more_possible_rm_coreference_value_pairs = methods.funcall_instance_method_with_2_args(back_drs, FIND_POSSIBLE_RM_COREFERENCES, rm, depth);
                                        SubLObject cdolist_list_var = more_possible_rm_coreference_value_pairs;
                                        SubLObject more_possible_rm_coreference_value_pair = NIL;
                                        for (more_possible_rm_coreference_value_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , more_possible_rm_coreference_value_pair = cdolist_list_var.first()) {
                                            {
                                                SubLObject possible_rm = more_possible_rm_coreference_value_pair.first();
                                                SubLObject possible_rm_value = second(more_possible_rm_coreference_value_pair);
                                                SubLObject depth_bias = nth(depth, $drt_possible_rm_coreferences_prev_drs_biases$.getDynamicValue(thread));
                                                if (NIL == depth_bias) {
                                                    depth_bias = $float$0_0;
                                                }
                                                possible_rm_coreference_value_pairs = cons(list(possible_rm, multiply(possible_rm_value, depth_bias)), possible_rm_coreference_value_pairs);
                                            }
                                        }
                                    }
                                }
                            }
                            sublisp_throw($sym100$OUTER_CATCH_FOR_DRS_METHOD, possible_rm_coreference_value_pairs);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_super_drs(self, super_drs);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_prev_drs(self, prev_drs);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_definite_rms(self, definite_rms);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_available_rms(self, available_rms);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_audience(self, audience);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_speaker(self, speaker);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym100$OUTER_CATCH_FOR_DRS_METHOD);
                }
                return catch_var_for_drs_method;
            }
        }
    }

    /**
     * Returns a list of the form ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...) indicating the possible coreferences of the specified RM in this DRS.  If DEPTH is specified, we look to DEPTH-1 previous DRSs for possible intersentential coreferences.
     */
    @LispMethod(comment = "Returns a list of the form ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...) indicating the possible coreferences of the specified RM in this DRS.  If DEPTH is specified, we look to DEPTH-1 previous DRSs for possible intersentential coreferences.")
    public static SubLObject drs_find_possible_rm_coreferences_method(final SubLObject self, final SubLObject rm, SubLObject depth, SubLObject cutoff) {
        if (depth == UNPROVIDED) {
            depth = $drt_possible_rm_coreferences_max_depth$.getDynamicValue();
        }
        if (cutoff == UNPROVIDED) {
            cutoff = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = NIL;
        final SubLObject super_drs = get_drs_super_drs(self);
        final SubLObject prev_drs = get_drs_prev_drs(self);
        final SubLObject definite_rms = get_drs_definite_rms(self);
        final SubLObject available_rms = get_drs_available_rms(self);
        final SubLObject audience = get_drs_audience(self);
        final SubLObject speaker = get_drs_speaker(self);
        try {
            thread.throwStack.push($sym100$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                SubLObject possible_rm_coreference_value_pairs = NIL;
                final SubLObject rm_formula = instances.get_slot(rm, FORMULA);
                if (cycl_utilities.formula_arg0(rm_formula).eql($$PronounFn)) {
                    if (((cycl_utilities.formula_arg1(rm_formula, UNPROVIDED).eql($$FirstPerson_NLAttr) && cycl_utilities.formula_arg2(rm_formula, UNPROVIDED).eql($$Singular_NLAttr)) && cycl_utilities.formula_arg3(rm_formula, UNPROVIDED).eql($$Ungendered_NLAttr)) && (NIL != forts.fort_p(speaker))) {
                        possible_rm_coreference_value_pairs = cons(bq_cons(speaker, $list97), possible_rm_coreference_value_pairs);
                    } else
                        if ((cycl_utilities.formula_arg1(rm_formula, UNPROVIDED).eql($$SecondPerson_NLAttr) && cycl_utilities.formula_arg2(rm_formula, UNPROVIDED).eql($$Singular_NLAttr)) && cycl_utilities.formula_arg3(rm_formula, UNPROVIDED).eql($$Ungendered_NLAttr)) {
                            SubLObject cdolist_list_var = audience;
                            SubLObject audience_member = NIL;
                            audience_member = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                possible_rm_coreference_value_pairs = cons(bq_cons(audience_member, $list97), possible_rm_coreference_value_pairs);
                                cdolist_list_var = cdolist_list_var.rest();
                                audience_member = cdolist_list_var.first();
                            } 
                        }

                }
                SubLObject cdolist_list_var = available_rms;
                SubLObject available_rm = NIL;
                available_rm = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    possible_rm_coreference_value_pairs = cons(list(available_rm, methods.funcall_instance_method_with_1_args(rm, COREFERENCE_PROBABILITY, available_rm)), possible_rm_coreference_value_pairs);
                    cdolist_list_var = cdolist_list_var.rest();
                    available_rm = cdolist_list_var.first();
                } 
                cdolist_list_var = definite_rms;
                SubLObject definite_rm = NIL;
                definite_rm = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    possible_rm_coreference_value_pairs = cons(list(definite_rm, methods.funcall_instance_method_with_1_args(rm, COREFERENCE_PROBABILITY, definite_rm)), possible_rm_coreference_value_pairs);
                    cdolist_list_var = cdolist_list_var.rest();
                    definite_rm = cdolist_list_var.first();
                } 
                SubLObject back_drs = NIL;
                if (NIL != super_drs) {
                    back_drs = super_drs;
                } else
                    if ((NIL != prev_drs) && depth.numG(ZERO_INTEGER)) {
                        depth = subtract(depth, ONE_INTEGER);
                        back_drs = prev_drs;
                    }

                if (NIL != back_drs) {
                    SubLObject cdolist_list_var2;
                    final SubLObject more_possible_rm_coreference_value_pairs = cdolist_list_var2 = methods.funcall_instance_method_with_2_args(back_drs, FIND_POSSIBLE_RM_COREFERENCES, rm, depth);
                    SubLObject more_possible_rm_coreference_value_pair = NIL;
                    more_possible_rm_coreference_value_pair = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject possible_rm = more_possible_rm_coreference_value_pair.first();
                        final SubLObject possible_rm_value = second(more_possible_rm_coreference_value_pair);
                        SubLObject depth_bias = nth(depth, $drt_possible_rm_coreferences_prev_drs_biases$.getDynamicValue(thread));
                        if (NIL == depth_bias) {
                            depth_bias = $float$0_0;
                        }
                        possible_rm_coreference_value_pairs = cons(list(possible_rm, multiply(possible_rm_value, depth_bias)), possible_rm_coreference_value_pairs);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        more_possible_rm_coreference_value_pair = cdolist_list_var2.first();
                    } 
                }
                sublisp_throw($sym100$OUTER_CATCH_FOR_DRS_METHOD, possible_rm_coreference_value_pairs);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_drs_super_drs(self, super_drs);
                    set_drs_prev_drs(self, prev_drs);
                    set_drs_definite_rms(self, definite_rms);
                    set_drs_available_rms(self, available_rms);
                    set_drs_audience(self, audience);
                    set_drs_speaker(self, speaker);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym100$OUTER_CATCH_FOR_DRS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }

    /**
     * For every sub-object in FORMULA that can be said to represent an RM in DRS, replace that sub-object with the RM it represents.
     */
    @LispMethod(comment = "For every sub-object in FORMULA that can be said to represent an RM in DRS, replace that sub-object with the RM it represents.")
    public static final SubLObject drt_drs_map_add_rms_to_formula_alt(SubLObject drs, SubLObject formula) {
        {
            SubLObject poss_rm = methods.funcall_instance_method_with_2_args(drs, FIND_RM_BY_TARGET, formula, $list_alt110).first();
            if (NIL != drt_rm.rm_p(poss_rm)) {
                return poss_rm;
            }
            if (formula.isCons()) {
                {
                    SubLObject new_formula = NIL;
                    SubLObject cdolist_list_var = formula;
                    SubLObject formula_arg = NIL;
                    for (formula_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_arg = cdolist_list_var.first()) {
                        new_formula = cons(com.cyc.cycjava.cycl.drt_drs.drt_drs_map_add_rms_to_formula(drs, formula_arg), new_formula);
                    }
                    return nreverse(new_formula);
                }
            } else {
                return formula;
            }
        }
    }

    /**
     * For every sub-object in FORMULA that can be said to represent an RM in DRS, replace that sub-object with the RM it represents.
     */
    @LispMethod(comment = "For every sub-object in FORMULA that can be said to represent an RM in DRS, replace that sub-object with the RM it represents.")
    public static SubLObject drt_drs_map_add_rms_to_formula(final SubLObject drs, final SubLObject formula) {
        final SubLObject poss_rm = methods.funcall_instance_method_with_2_args(drs, FIND_RM_BY_TARGET, formula, $list110).first();
        if (NIL != drt_rm.rm_p(poss_rm)) {
            return poss_rm;
        }
        if (formula.isCons()) {
            SubLObject new_formula = NIL;
            SubLObject cdolist_list_var = formula;
            SubLObject formula_arg = NIL;
            formula_arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                new_formula = cons(drt_drs_map_add_rms_to_formula(drs, formula_arg), new_formula);
                cdolist_list_var = cdolist_list_var.rest();
                formula_arg = cdolist_list_var.first();
            } 
            return nreverse(new_formula);
        }
        return formula;
    }

    public static final SubLObject drs_rm_root_term_method_alt(SubLObject rm) {
        return instances.get_slot(rm, ROOT_TERM);
    }

    public static SubLObject drs_rm_root_term_method(final SubLObject rm) {
        return instances.get_slot(rm, ROOT_TERM);
    }

    public static final SubLObject drt_corresponding_type_subcol_fn_3_alt(SubLObject instance_subcol_fn) {
        {
            SubLObject pcase_var = instance_subcol_fn;
            if (pcase_var.eql($$SubcollectionOfWithRelationToFn)) {
                return $const113$SubcollectionOfWithRelationToType;
            } else {
                if (pcase_var.eql($$SubcollectionOfWithRelationFromFn)) {
                    return $const115$SubcollectionOfWithRelationFromTy;
                }
            }
        }
        return NIL;
    }

    public static SubLObject drt_corresponding_type_subcol_fn_3(final SubLObject instance_subcol_fn) {
        if (instance_subcol_fn.eql($$SubcollectionOfWithRelationToFn)) {
            return $const113$SubcollectionOfWithRelationToType;
        }
        if (instance_subcol_fn.eql($$SubcollectionOfWithRelationFromFn)) {
            return $const115$SubcollectionOfWithRelationFromTy;
        }
        return NIL;
    }

    /**
     * Finds an RM by looking at the slots of the RMs in DRS.  There are 4 methods to look for RMs: by the :term or :var assigned to the RM after processing, by the initial formula the RM was created from, and the :root ('root-term') of the formula the RM was created from.  Any combination of these may be specified.  If both :formula and :root are specified, we allow matching to the RMs :mapped-formula such that contained RMs of which are replaced by those RMs :root's.  Also, there is a hack in here to ignore differences in subcollection functions (see drt-corresponding-type-subcol-fn-3 above).
     */
    @LispMethod(comment = "Finds an RM by looking at the slots of the RMs in DRS.  There are 4 methods to look for RMs: by the :term or :var assigned to the RM after processing, by the initial formula the RM was created from, and the :root (\'root-term\') of the formula the RM was created from.  Any combination of these may be specified.  If both :formula and :root are specified, we allow matching to the RMs :mapped-formula such that contained RMs of which are replaced by those RMs :root\'s.  Also, there is a hack in here to ignore differences in subcollection functions (see drt-corresponding-type-subcol-fn-3 above).")
    public static final SubLObject drs_find_rm_by_target_method_alt(SubLObject self, SubLObject target, SubLObject target_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_drs_method = NIL;
                SubLObject cycl_formulas = com.cyc.cycjava.cycl.drt_drs.get_drs_cycl_formulas(self);
                SubLObject super_drs = com.cyc.cycjava.cycl.drt_drs.get_drs_super_drs(self);
                SubLObject rms = com.cyc.cycjava.cycl.drt_drs.get_drs_rms(self);
                try {
                    try {
                        {
                            SubLObject rm_results = NIL;
                            {
                                SubLObject cdolist_list_var = rms;
                                SubLObject rm = NIL;
                                for (rm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rm = cdolist_list_var.first()) {
                                    if (NIL != subl_promotions.memberP($TERM, target_type, UNPROVIDED, UNPROVIDED)) {
                                        if (NIL != czer_utilities.equals_elP(target, com.cyc.cycjava.cycl.drt_drs.drt_formula_construct_cycl(instances.get_slot(rm, TARGET_TERM)), UNPROVIDED, UNPROVIDED)) {
                                            rm_results = cons(rm, rm_results);
                                        }
                                    }
                                    if (NIL != subl_promotions.memberP($VAR, target_type, UNPROVIDED, UNPROVIDED)) {
                                        if (target.equal(com.cyc.cycjava.cycl.drt_drs.drt_formula_construct_cycl(instances.get_slot(rm, TARGET_VAR)))) {
                                            rm_results = cons(rm, rm_results);
                                        }
                                    }
                                    if (NIL != subl_promotions.memberP($FORMULA, target_type, UNPROVIDED, UNPROVIDED)) {
                                        if (target.equal(com.cyc.cycjava.cycl.drt_drs.drt_formula_construct_cycl(instances.get_slot(rm, FORMULA)))) {
                                            rm_results = cons(rm, rm_results);
                                        }
                                    }
                                    if (NIL != subl_promotions.memberP($ROOT, target_type, UNPROVIDED, UNPROVIDED)) {
                                        if (NIL != czer_utilities.equals_elP(target, com.cyc.cycjava.cycl.drt_drs.drt_formula_construct_cycl(instances.get_slot(rm, ROOT_TERM)), UNPROVIDED, UNPROVIDED)) {
                                            rm_results = cons(rm, rm_results);
                                        }
                                    }
                                    if (((NIL == rm_results) && (NIL != member($FORMULA, target_type, UNPROVIDED, UNPROVIDED))) && (NIL != member($ROOT, target_type, UNPROVIDED, UNPROVIDED))) {
                                        {
                                            SubLObject rm_unmapped_formula = list_utilities.tree_gather_transformations(symbol_function(DRS_RM_ROOT_TERM_METHOD), copy_tree(instances.get_slot(rm, MAPPED_FORMULA)), symbol_function(RM_P), UNPROVIDED, UNPROVIDED);
                                            if (NIL != czer_utilities.equals_elP(list_utilities.tree_gather_transformations(symbol_function(DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), target, symbol_function(DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), UNPROVIDED, UNPROVIDED), list_utilities.tree_gather_transformations(symbol_function(DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), rm_unmapped_formula, symbol_function(DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                                                rm_results = cons(rm, rm_results);
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL == rm_results) {
                                if (NIL != super_drs) {
                                    rm_results = methods.funcall_instance_method_with_2_args(super_drs, FIND_RM_BY_TARGET, target, target_type);
                                }
                            }
                            if (length(rm_results).numG(ONE_INTEGER)) {
                                {
                                    SubLObject new_rm_results = NIL;
                                    SubLObject cdolist_list_var = rm_results;
                                    SubLObject rm_result = NIL;
                                    for (rm_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rm_result = cdolist_list_var.first()) {
                                        if (NIL == list_utilities.tree_find(instances.get_slot(rm_result, FORMULA), cycl_formulas, symbol_function(EQUAL), UNPROVIDED)) {
                                            new_rm_results = cons(rm_result, new_rm_results);
                                        }
                                    }
                                    if (NIL != new_rm_results) {
                                        rm_results = new_rm_results;
                                    }
                                }
                                if (length(rm_results).numG(ONE_INTEGER)) {
                                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                                        if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            Errors.warn($str_alt127$find_rm_by_target___A_maps_to_mul, target, rm_results);
                                        }
                                    }
                                }
                            }
                            sublisp_throw($sym118$OUTER_CATCH_FOR_DRS_METHOD, rm_results);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_cycl_formulas(self, cycl_formulas);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_super_drs(self, super_drs);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_rms(self, rms);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_DRS_METHOD);
                }
                return catch_var_for_drs_method;
            }
        }
    }

    /**
     * Finds an RM by looking at the slots of the RMs in DRS.  There are 4 methods to look for RMs: by the :term or :var assigned to the RM after processing, by the initial formula the RM was created from, and the :root ('root-term') of the formula the RM was created from.  Any combination of these may be specified.  If both :formula and :root are specified, we allow matching to the RMs :mapped-formula such that contained RMs of which are replaced by those RMs :root's.  Also, there is a hack in here to ignore differences in subcollection functions (see drt-corresponding-type-subcol-fn-3 above).
     */
    @LispMethod(comment = "Finds an RM by looking at the slots of the RMs in DRS.  There are 4 methods to look for RMs: by the :term or :var assigned to the RM after processing, by the initial formula the RM was created from, and the :root (\'root-term\') of the formula the RM was created from.  Any combination of these may be specified.  If both :formula and :root are specified, we allow matching to the RMs :mapped-formula such that contained RMs of which are replaced by those RMs :root\'s.  Also, there is a hack in here to ignore differences in subcollection functions (see drt-corresponding-type-subcol-fn-3 above).")
    public static SubLObject drs_find_rm_by_target_method(final SubLObject self, final SubLObject target, final SubLObject target_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = NIL;
        final SubLObject cycl_formulas = get_drs_cycl_formulas(self);
        final SubLObject super_drs = get_drs_super_drs(self);
        final SubLObject rms = get_drs_rms(self);
        try {
            thread.throwStack.push($sym118$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                SubLObject rm_results = NIL;
                SubLObject cdolist_list_var = rms;
                SubLObject rm = NIL;
                rm = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL != subl_promotions.memberP($TERM, target_type, UNPROVIDED, UNPROVIDED)) && (NIL != czer_utilities.equals_elP(target, drt_formula_construct_cycl(instances.get_slot(rm, TARGET_TERM)), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        rm_results = cons(rm, rm_results);
                    }
                    if ((NIL != subl_promotions.memberP($VAR, target_type, UNPROVIDED, UNPROVIDED)) && target.equal(drt_formula_construct_cycl(instances.get_slot(rm, TARGET_VAR)))) {
                        rm_results = cons(rm, rm_results);
                    }
                    if ((NIL != subl_promotions.memberP($FORMULA, target_type, UNPROVIDED, UNPROVIDED)) && target.equal(drt_formula_construct_cycl(instances.get_slot(rm, FORMULA)))) {
                        rm_results = cons(rm, rm_results);
                    }
                    if ((NIL != subl_promotions.memberP($ROOT, target_type, UNPROVIDED, UNPROVIDED)) && (NIL != czer_utilities.equals_elP(target, drt_formula_construct_cycl(instances.get_slot(rm, ROOT_TERM)), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        rm_results = cons(rm, rm_results);
                    }
                    if (((NIL == rm_results) && (NIL != member($FORMULA, target_type, UNPROVIDED, UNPROVIDED))) && (NIL != member($ROOT, target_type, UNPROVIDED, UNPROVIDED))) {
                        final SubLObject rm_unmapped_formula = list_utilities.tree_gather_transformations(symbol_function(DRS_RM_ROOT_TERM_METHOD), copy_tree(instances.get_slot(rm, MAPPED_FORMULA)), symbol_function(RM_P), UNPROVIDED, UNPROVIDED);
                        if (NIL != czer_utilities.equals_elP(list_utilities.tree_gather_transformations(symbol_function(DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), target, symbol_function(DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), UNPROVIDED, UNPROVIDED), list_utilities.tree_gather_transformations(symbol_function(DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), rm_unmapped_formula, symbol_function(DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            rm_results = cons(rm, rm_results);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rm = cdolist_list_var.first();
                } 
                if ((NIL == rm_results) && (NIL != super_drs)) {
                    rm_results = methods.funcall_instance_method_with_2_args(super_drs, FIND_RM_BY_TARGET, target, target_type);
                }
                if (length(rm_results).numG(ONE_INTEGER)) {
                    SubLObject new_rm_results = NIL;
                    SubLObject cdolist_list_var2 = rm_results;
                    SubLObject rm_result = NIL;
                    rm_result = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL == list_utilities.tree_find(instances.get_slot(rm_result, FORMULA), cycl_formulas, symbol_function(EQUAL), UNPROVIDED)) {
                            new_rm_results = cons(rm_result, new_rm_results);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        rm_result = cdolist_list_var2.first();
                    } 
                    if (NIL != new_rm_results) {
                        rm_results = new_rm_results;
                    }
                    if ((length(rm_results).numG(ONE_INTEGER) && ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER))) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        Errors.warn($str127$find_rm_by_target___A_maps_to_mul, target, rm_results);
                    }
                }
                sublisp_throw($sym118$OUTER_CATCH_FOR_DRS_METHOD, rm_results);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_drs_cycl_formulas(self, cycl_formulas);
                    set_drs_super_drs(self, super_drs);
                    set_drs_rms(self, rms);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_DRS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }

    /**
     * Given a FORMULA and a variable in that formula, find a TERM in that formula such that either (#$genls VAR TERM) or (#$isa VAR TERM) are a sub-formula of FORMULA.
     */
    @LispMethod(comment = "Given a FORMULA and a variable in that formula, find a TERM in that formula such that either (#$genls VAR TERM) or (#$isa VAR TERM) are a sub-formula of FORMULA.")
    public static final SubLObject find_terms_for_var_in_formula_alt(SubLObject var, SubLObject formula) {
        {
            SubLObject result = NIL;
            if (NIL != isa.isaP(cycl_utilities.formula_arg0(formula), $$LogicalConnective, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject cdolist_list_var = formula;
                    SubLObject subformula = NIL;
                    for (subformula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subformula = cdolist_list_var.first()) {
                        result = append(result, com.cyc.cycjava.cycl.drt_drs.find_terms_for_var_in_formula(var, subformula));
                    }
                }
            } else {
                if (formula.isCons() && (THREE_INTEGER == length(formula))) {
                    {
                        SubLObject formula_arg0 = cycl_utilities.formula_arg0(formula);
                        SubLObject formula_arg1 = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                        SubLObject formula_arg2 = cycl_utilities.formula_arg2(formula, UNPROVIDED);
                        if (((formula_arg0 == $$isa) || (formula_arg0 == $$genls)) && (formula_arg1 == var)) {
                            result = cons(formula_arg2, result);
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     * Given a FORMULA and a variable in that formula, find a TERM in that formula such that either (#$genls VAR TERM) or (#$isa VAR TERM) are a sub-formula of FORMULA.
     */
    @LispMethod(comment = "Given a FORMULA and a variable in that formula, find a TERM in that formula such that either (#$genls VAR TERM) or (#$isa VAR TERM) are a sub-formula of FORMULA.")
    public static SubLObject find_terms_for_var_in_formula(final SubLObject var, final SubLObject formula) {
        SubLObject result = NIL;
        if (NIL != isa.isaP(cycl_utilities.formula_arg0(formula), $$LogicalConnective, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = formula;
            SubLObject subformula = NIL;
            subformula = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = append(result, find_terms_for_var_in_formula(var, subformula));
                cdolist_list_var = cdolist_list_var.rest();
                subformula = cdolist_list_var.first();
            } 
        } else
            if (formula.isCons() && THREE_INTEGER.eql(length(formula))) {
                final SubLObject formula_arg0 = cycl_utilities.formula_arg0(formula);
                final SubLObject formula_arg2 = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                final SubLObject formula_arg3 = cycl_utilities.formula_arg2(formula, UNPROVIDED);
                if ((formula_arg0.eql($$isa) || formula_arg0.eql($$genls)) && formula_arg2.eql(var)) {
                    result = cons(formula_arg3, result);
                }
            }

        return result;
    }

    /**
     * Constructs the CycL output that is ready to be predicate/term strengthened, etc. (i.e. it may still contain underpecified vocab).
     */
    @LispMethod(comment = "Constructs the CycL output that is ready to be predicate/term strengthened, etc. (i.e. it may still contain underpecified vocab).")
    public static final SubLObject drs_construct_cycl_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_drs_method = NIL;
                SubLObject interaction_mt = com.cyc.cycjava.cycl.drt_drs.get_drs_interaction_mt(self);
                SubLObject complex_conditions = com.cyc.cycjava.cycl.drt_drs.get_drs_complex_conditions(self);
                SubLObject simple_conditions = com.cyc.cycjava.cycl.drt_drs.get_drs_simple_conditions(self);
                try {
                    try {
                        {
                            SubLObject result = NIL;
                            SubLObject scopes = NIL;
                            if (NIL != complex_conditions) {
                                {
                                    SubLObject cdolist_list_var = complex_conditions;
                                    SubLObject complex_condition = NIL;
                                    for (complex_condition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , complex_condition = cdolist_list_var.first()) {
                                        {
                                            SubLObject cf_cycl = com.cyc.cycjava.cycl.drt_drs.drt_complex_condition_construct_cycl(complex_condition, interaction_mt);
                                            result = cons(cf_cycl, result);
                                        }
                                    }
                                }
                            }
                            if (NIL != simple_conditions) {
                                {
                                    SubLObject relevant_rms = NIL;
                                    {
                                        SubLObject cdolist_list_var = simple_conditions;
                                        SubLObject simple_condition = NIL;
                                        for (simple_condition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , simple_condition = cdolist_list_var.first()) {
                                            {
                                                SubLObject cdolist_list_var_3 = list_utilities.remove_if_not(symbol_function(RM_P), simple_condition, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject poss_relevant_rm = NIL;
                                                for (poss_relevant_rm = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , poss_relevant_rm = cdolist_list_var_3.first()) {
                                                    {
                                                        SubLObject item_var = poss_relevant_rm;
                                                        if (NIL == member(item_var, relevant_rms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            relevant_rms = cons(item_var, relevant_rms);
                                                        }
                                                    }
                                                }
                                            }
                                            result = cons(com.cyc.cycjava.cycl.drt_drs.drt_simple_condition_construct_cycl(simple_condition), result);
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = relevant_rms;
                                        SubLObject relevant_rm = NIL;
                                        for (relevant_rm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relevant_rm = cdolist_list_var.first()) {
                                            if ((NIL != instances.get_slot(relevant_rm, SCOPE)) && ($$forAll != instances.get_slot(relevant_rm, SCOPE))) {
                                                scopes = cons(list(instances.get_slot(relevant_rm, SCOPE), instances.get_slot(relevant_rm, TARGET_VAR)), scopes);
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != result.rest()) {
                                result = bq_cons($$and, result);
                            } else {
                                result = result.first();
                            }
                            {
                                SubLObject cdolist_list_var = scopes;
                                SubLObject scope = NIL;
                                for (scope = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , scope = cdolist_list_var.first()) {
                                    result = append(scope, list(result));
                                }
                            }
                            if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                    drt.drt_tracer_output(TWO_INTEGER, list($str_alt134$_______________________FINAL_CYCL));
                                }
                                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                    drt.drt_tracer_output(TWO_INTEGER, list($str_alt135$_A__, result));
                                }
                            }
                            sublisp_throw($sym133$OUTER_CATCH_FOR_DRS_METHOD, result);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_interaction_mt(self, interaction_mt);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_complex_conditions(self, complex_conditions);
                                com.cyc.cycjava.cycl.drt_drs.set_drs_simple_conditions(self, simple_conditions);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_DRS_METHOD);
                }
                return catch_var_for_drs_method;
            }
        }
    }

    /**
     * Constructs the CycL output that is ready to be predicate/term strengthened, etc. (i.e. it may still contain underpecified vocab).
     */
    @LispMethod(comment = "Constructs the CycL output that is ready to be predicate/term strengthened, etc. (i.e. it may still contain underpecified vocab).")
    public static SubLObject drs_construct_cycl_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = NIL;
        final SubLObject interaction_mt = get_drs_interaction_mt(self);
        final SubLObject complex_conditions = get_drs_complex_conditions(self);
        final SubLObject simple_conditions = get_drs_simple_conditions(self);
        try {
            thread.throwStack.push($sym133$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                SubLObject result = NIL;
                SubLObject scopes = NIL;
                if (NIL != complex_conditions) {
                    SubLObject cdolist_list_var = complex_conditions;
                    SubLObject complex_condition = NIL;
                    complex_condition = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject cf_cycl = drt_complex_condition_construct_cycl(complex_condition, interaction_mt);
                        result = cons(cf_cycl, result);
                        cdolist_list_var = cdolist_list_var.rest();
                        complex_condition = cdolist_list_var.first();
                    } 
                }
                if (NIL != simple_conditions) {
                    SubLObject relevant_rms = NIL;
                    SubLObject cdolist_list_var2 = simple_conditions;
                    SubLObject simple_condition = NIL;
                    simple_condition = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject cdolist_list_var_$3 = list_utilities.remove_if_not(symbol_function(RM_P), simple_condition, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject poss_relevant_rm = NIL;
                        poss_relevant_rm = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            final SubLObject item_var = poss_relevant_rm;
                            if (NIL == member(item_var, relevant_rms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                relevant_rms = cons(item_var, relevant_rms);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            poss_relevant_rm = cdolist_list_var_$3.first();
                        } 
                        result = cons(drt_simple_condition_construct_cycl(simple_condition), result);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        simple_condition = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = relevant_rms;
                    SubLObject relevant_rm = NIL;
                    relevant_rm = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if ((NIL != instances.get_slot(relevant_rm, SCOPE)) && (!$$forAll.eql(instances.get_slot(relevant_rm, SCOPE)))) {
                            scopes = cons(list(instances.get_slot(relevant_rm, SCOPE), instances.get_slot(relevant_rm, TARGET_VAR)), scopes);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        relevant_rm = cdolist_list_var2.first();
                    } 
                }
                if (NIL != result.rest()) {
                    result = bq_cons($$and, result);
                } else {
                    result = result.first();
                }
                SubLObject cdolist_list_var = scopes;
                SubLObject scope = NIL;
                scope = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = append(scope, list(result));
                    cdolist_list_var = cdolist_list_var.rest();
                    scope = cdolist_list_var.first();
                } 
                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        drt.drt_tracer_output(TWO_INTEGER, list($str134$_______________________FINAL_CYCL));
                    }
                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        drt.drt_tracer_output(TWO_INTEGER, list($str135$_A__, result));
                    }
                }
                sublisp_throw($sym133$OUTER_CATCH_FOR_DRS_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_drs_interaction_mt(self, interaction_mt);
                    set_drs_complex_conditions(self, complex_conditions);
                    set_drs_simple_conditions(self, simple_conditions);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_DRS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }

    public static final SubLObject drt_complex_condition_construct_cycl_alt(SubLObject complex_condition, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject cf_cycl = NIL;
            SubLObject cf_arg0 = cycl_utilities.formula_arg0(complex_condition);
            SubLObject cf_drs_args = cycl_utilities.formula_args(complex_condition, UNPROVIDED);
            cf_cycl = cons(cf_arg0, cf_cycl);
            {
                SubLObject cdolist_list_var = cf_drs_args;
                SubLObject cf_drs_arg = NIL;
                for (cf_drs_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cf_drs_arg = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.drt_drs.drs_p(cf_drs_arg)) {
                        cf_cycl = cons(methods.funcall_instance_method_with_0_args(cf_drs_arg, CONSTRUCT_CYCL), cf_cycl);
                    } else {
                        cf_cycl = cons(cf_drs_arg, cf_cycl);
                    }
                }
            }
            cf_cycl = nreverse(cf_cycl);
            if ($$NLNegFn == cycl_utilities.formula_arg0(cf_cycl)) {
                cf_cycl = reformulator_utilities_nl.reformulate_cycl_negproc(list($$NLNegFn, cycl_utilities.formula_arg1(cf_cycl, UNPROVIDED), reformulator_hub.reformulate_cycl(cycl_utilities.formula_arg2(cf_cycl, UNPROVIDED), mt, UNPROVIDED)), mt, UNPROVIDED);
            }
            return cf_cycl;
        }
    }

    public static SubLObject drt_complex_condition_construct_cycl(final SubLObject complex_condition, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject cf_cycl = NIL;
        final SubLObject cf_arg0 = cycl_utilities.formula_arg0(complex_condition);
        final SubLObject cf_drs_args = cycl_utilities.formula_args(complex_condition, UNPROVIDED);
        cf_cycl = cons(cf_arg0, cf_cycl);
        SubLObject cdolist_list_var = cf_drs_args;
        SubLObject cf_drs_arg = NIL;
        cf_drs_arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != drs_p(cf_drs_arg)) {
                cf_cycl = cons(methods.funcall_instance_method_with_0_args(cf_drs_arg, CONSTRUCT_CYCL), cf_cycl);
            } else {
                cf_cycl = cons(cf_drs_arg, cf_cycl);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cf_drs_arg = cdolist_list_var.first();
        } 
        cf_cycl = nreverse(cf_cycl);
        if ($$NLNegFn.eql(cycl_utilities.formula_arg0(cf_cycl))) {
            cf_cycl = reformulator_utilities_nl.reformulate_cycl_negproc(list($$NLNegFn, cycl_utilities.formula_arg1(cf_cycl, UNPROVIDED), reformulator_hub.reformulate_cycl(cycl_utilities.formula_arg2(cf_cycl, UNPROVIDED), mt, UNPROVIDED)), mt, UNPROVIDED);
        }
        return cf_cycl;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeKeyword("QUANTPROC-3"), makeSymbol("TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC-3?"), makeSymbol("REFORMULATE-CYCL-QUANTPROC-3"), makeKeyword("PARSING-MT")), list(makeKeyword("VPPPROC-NONSTATE"), makeSymbol("TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-NONSTATE?"), makeSymbol("REFORMULATE-CYCL-VPPPROC-NONSTATE"), makeKeyword("PARSING-MT")), list(makeKeyword("VPPPROC-STATE"), makeSymbol("TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-STATE?"), makeSymbol("REFORMULATE-CYCL-VPPPROC-STATE"), makeKeyword("PARSING-MT")));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("SPEAKER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AUDIENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AVAILABLE-RMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEFINITE-RMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRONOMIAL-RMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PREV-DRS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NEXT-DRS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUPER-DRS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUB-DRSS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CYCL-FORMULAS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SIMPLE-CONDITIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COMPLEX-CONDITIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INTERACTION-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSING-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-RM"), list(makeSymbol("NEW-RM"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-AVAILABLE-RM"), list(makeSymbol("NEW-RM"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DEFINITE-RM"), list(makeSymbol("NEW-RM"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PRONOMIAL-RM"), list(makeSymbol("NEW-RM"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROCESS"), list(makeSymbol("&OPTIONAL"), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-RM-BY-TARGET"), list(makeSymbol("TARGET"), makeSymbol("TARGET-TYPE"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES"), NIL), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-POSSIBLE-RM-COREFERENCES"), list(makeSymbol("RM"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEPTH"), FIVE_INTEGER), list(makeSymbol("CUTOFF"), NIL))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONSTRUCT-CYCL"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLObject drt_simple_condition_construct_cycl_alt(SubLObject simple_condition) {
        {
            SubLObject sf_cycl = NIL;
            if (simple_condition.isCons()) {
                {
                    SubLObject cdolist_list_var = simple_condition;
                    SubLObject simple_condition_arg = NIL;
                    for (simple_condition_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , simple_condition_arg = cdolist_list_var.first()) {
                        if (NIL != drt_rm.rm_p(simple_condition_arg)) {
                            sf_cycl = cons(methods.funcall_instance_method_with_0_args(drt_rm.real_rm(simple_condition_arg), CONSTRUCT_CYCL), sf_cycl);
                        } else {
                            sf_cycl = cons(com.cyc.cycjava.cycl.drt_drs.drt_simple_condition_construct_cycl(simple_condition_arg), sf_cycl);
                        }
                    }
                }
            } else {
                return simple_condition;
            }
            return nreverse(sf_cycl);
        }
    }

    public static SubLObject drt_simple_condition_construct_cycl(final SubLObject simple_condition) {
        SubLObject sf_cycl = NIL;
        if (simple_condition.isCons()) {
            SubLObject cdolist_list_var = simple_condition;
            SubLObject simple_condition_arg = NIL;
            simple_condition_arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != drt_rm.rm_p(simple_condition_arg)) {
                    sf_cycl = cons(methods.funcall_instance_method_with_0_args(drt_rm.real_rm(simple_condition_arg), CONSTRUCT_CYCL), sf_cycl);
                } else {
                    sf_cycl = cons(drt_simple_condition_construct_cycl(simple_condition_arg), sf_cycl);
                }
                cdolist_list_var = cdolist_list_var.rest();
                simple_condition_arg = cdolist_list_var.first();
            } 
            return nreverse(sf_cycl);
        }
        return simple_condition;
    }

    public static final SubLObject drt_formula_construct_cycl_alt(SubLObject root_term) {
        if (root_term.isCons()) {
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = root_term;
                SubLObject root_term_arg = NIL;
                for (root_term_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , root_term_arg = cdolist_list_var.first()) {
                    result = cons(com.cyc.cycjava.cycl.drt_drs.drt_formula_construct_cycl(root_term_arg), result);
                }
                return nreverse(result);
            }
        } else {
            if (NIL != drt_rm.rm_p(root_term)) {
                return methods.funcall_instance_method_with_0_args(drt_rm.real_rm(root_term), CONSTRUCT_CYCL);
            } else {
                return root_term;
            }
        }
    }

    public static SubLObject drt_formula_construct_cycl(final SubLObject root_term) {
        if (root_term.isCons()) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = root_term;
            SubLObject root_term_arg = NIL;
            root_term_arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(drt_formula_construct_cycl(root_term_arg), result);
                cdolist_list_var = cdolist_list_var.rest();
                root_term_arg = cdolist_list_var.first();
            } 
            return nreverse(result);
        }
        if (NIL != drt_rm.rm_p(root_term)) {
            return methods.funcall_instance_method_with_0_args(drt_rm.real_rm(root_term), CONSTRUCT_CYCL);
        }
        return root_term;
    }

    public static SubLObject declare_drt_drs_file() {
        declareFunction("drt_drs_quant_call_type", "DRT-DRS-QUANT-CALL-TYPE", 1, 0, false);
        declareFunction("drt_drs_quant_call_test", "DRT-DRS-QUANT-CALL-TEST", 1, 0, false);
        declareFunction("drt_drs_quant_call_fn", "DRT-DRS-QUANT-CALL-FN", 1, 0, false);
        declareFunction("drt_drs_quant_call_mt", "DRT-DRS-QUANT-CALL-MT", 1, 0, false);
        declareFunction("get_drs_parsing_mt", "GET-DRS-PARSING-MT", 1, 0, false);
        declareFunction("set_drs_parsing_mt", "SET-DRS-PARSING-MT", 2, 0, false);
        declareFunction("get_drs_interaction_mt", "GET-DRS-INTERACTION-MT", 1, 0, false);
        declareFunction("set_drs_interaction_mt", "SET-DRS-INTERACTION-MT", 2, 0, false);
        declareFunction("get_drs_complex_conditions", "GET-DRS-COMPLEX-CONDITIONS", 1, 0, false);
        declareFunction("set_drs_complex_conditions", "SET-DRS-COMPLEX-CONDITIONS", 2, 0, false);
        declareFunction("get_drs_simple_conditions", "GET-DRS-SIMPLE-CONDITIONS", 1, 0, false);
        declareFunction("set_drs_simple_conditions", "SET-DRS-SIMPLE-CONDITIONS", 2, 0, false);
        declareFunction("get_drs_cycl_formulas", "GET-DRS-CYCL-FORMULAS", 1, 0, false);
        declareFunction("set_drs_cycl_formulas", "SET-DRS-CYCL-FORMULAS", 2, 0, false);
        declareFunction("get_drs_sub_drss", "GET-DRS-SUB-DRSS", 1, 0, false);
        declareFunction("set_drs_sub_drss", "SET-DRS-SUB-DRSS", 2, 0, false);
        declareFunction("get_drs_super_drs", "GET-DRS-SUPER-DRS", 1, 0, false);
        declareFunction("set_drs_super_drs", "SET-DRS-SUPER-DRS", 2, 0, false);
        declareFunction("get_drs_next_drs", "GET-DRS-NEXT-DRS", 1, 0, false);
        declareFunction("set_drs_next_drs", "SET-DRS-NEXT-DRS", 2, 0, false);
        declareFunction("get_drs_prev_drs", "GET-DRS-PREV-DRS", 1, 0, false);
        declareFunction("set_drs_prev_drs", "SET-DRS-PREV-DRS", 2, 0, false);
        declareFunction("get_drs_pronomial_rms", "GET-DRS-PRONOMIAL-RMS", 1, 0, false);
        declareFunction("set_drs_pronomial_rms", "SET-DRS-PRONOMIAL-RMS", 2, 0, false);
        declareFunction("get_drs_definite_rms", "GET-DRS-DEFINITE-RMS", 1, 0, false);
        declareFunction("set_drs_definite_rms", "SET-DRS-DEFINITE-RMS", 2, 0, false);
        declareFunction("get_drs_available_rms", "GET-DRS-AVAILABLE-RMS", 1, 0, false);
        declareFunction("set_drs_available_rms", "SET-DRS-AVAILABLE-RMS", 2, 0, false);
        declareFunction("get_drs_rms", "GET-DRS-RMS", 1, 0, false);
        declareFunction("set_drs_rms", "SET-DRS-RMS", 2, 0, false);
        declareFunction("get_drs_audience", "GET-DRS-AUDIENCE", 1, 0, false);
        declareFunction("set_drs_audience", "SET-DRS-AUDIENCE", 2, 0, false);
        declareFunction("get_drs_speaker", "GET-DRS-SPEAKER", 1, 0, false);
        declareFunction("set_drs_speaker", "SET-DRS-SPEAKER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_drs_class", "SUBLOOP-RESERVED-INITIALIZE-DRS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_drs_instance", "SUBLOOP-RESERVED-INITIALIZE-DRS-INSTANCE", 1, 0, false);
        declareFunction("drs_p", "DRS-P", 1, 0, false);
        declareFunction("drs_add_rm_method", "DRS-ADD-RM-METHOD", 2, 0, false);
        declareFunction("drs_add_available_rm_method", "DRS-ADD-AVAILABLE-RM-METHOD", 2, 0, false);
        declareFunction("drs_add_definite_rm_method", "DRS-ADD-DEFINITE-RM-METHOD", 2, 0, false);
        declareFunction("drs_add_pronomial_rm_method", "DRS-ADD-PRONOMIAL-RM-METHOD", 2, 0, false);
        declareFunction("create_drs_from_formula", "CREATE-DRS-FROM-FORMULA", 3, 2, false);
        declareFunction("drt_quantproc_hint_fn_p", "DRT-QUANTPROC-HINT-FN-P", 1, 1, false);
        declareFunction("drt_complex_formula_element", "DRT-COMPLEX-FORMULA-ELEMENT", 1, 0, false);
        declareFunction("drt_complex_formulaP", "DRT-COMPLEX-FORMULA?", 1, 0, false);
        declareFunction("drs_process_method", "DRS-PROCESS-METHOD", 1, 1, false);
        declareFunction("drs_find_all_possible_rm_coreferences_method", "DRS-FIND-ALL-POSSIBLE-RM-COREFERENCES-METHOD", 1, 0, false);
        declareFunction("possible_rm_coreference_source_rm", "POSSIBLE-RM-COREFERENCE-SOURCE-RM", 1, 0, false);
        declareFunction("possible_rm_coreference_targets", "POSSIBLE-RM-COREFERENCE-TARGETS", 1, 0, false);
        declareFunction("possible_rm_coreference_target_rm", "POSSIBLE-RM-COREFERENCE-TARGET-RM", 1, 0, false);
        declareFunction("possible_rm_coreference_target_probability", "POSSIBLE-RM-COREFERENCE-TARGET-PROBABILITY", 1, 0, false);
        declareFunction("drs_find_possible_rm_coreferences_method", "DRS-FIND-POSSIBLE-RM-COREFERENCES-METHOD", 2, 2, false);
        declareFunction("drt_drs_map_add_rms_to_formula", "DRT-DRS-MAP-ADD-RMS-TO-FORMULA", 2, 0, false);
        declareFunction("drs_rm_root_term_method", "DRS-RM-ROOT-TERM-METHOD", 1, 0, false);
        declareFunction("drt_corresponding_type_subcol_fn_3", "DRT-CORRESPONDING-TYPE-SUBCOL-FN-3", 1, 0, false);
        declareFunction("drs_find_rm_by_target_method", "DRS-FIND-RM-BY-TARGET-METHOD", 3, 0, false);
        declareFunction("find_terms_for_var_in_formula", "FIND-TERMS-FOR-VAR-IN-FORMULA", 2, 0, false);
        declareFunction("drs_construct_cycl_method", "DRS-CONSTRUCT-CYCL-METHOD", 1, 0, false);
        declareFunction("drt_complex_condition_construct_cycl", "DRT-COMPLEX-CONDITION-CONSTRUCT-CYCL", 1, 1, false);
        declareFunction("drt_simple_condition_construct_cycl", "DRT-SIMPLE-CONDITION-CONSTRUCT-CYCL", 1, 0, false);
        declareFunction("drt_formula_construct_cycl", "DRT-FORMULA-CONSTRUCT-CYCL", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt25 = list(makeSymbol("NEW-RM"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-RM"), makeSymbol("RMS")), list(makeSymbol("CSETQ"), makeSymbol("RMS"), list(makeSymbol("CONS"), makeSymbol("NEW-RM"), makeSymbol("RMS")))), list(RET, makeSymbol("RMS")));

    static private final SubLList $list_alt30 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-RM"), makeSymbol("AVAILABLE-RMS")), list(makeSymbol("CSETQ"), makeSymbol("AVAILABLE-RMS"), list(makeSymbol("CONS"), makeSymbol("NEW-RM"), makeSymbol("AVAILABLE-RMS")))), list(RET, makeSymbol("AVAILABLE-RMS")));

    static private final SubLList $list_alt34 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-RM"), makeSymbol("DEFINITE-RMS")), list(makeSymbol("CSETQ"), makeSymbol("DEFINITE-RMS"), list(makeSymbol("CONS"), makeSymbol("NEW-RM"), makeSymbol("DEFINITE-RMS")))), list(RET, makeSymbol("DEFINITE-RMS")));

    static private final SubLList $list_alt38 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-RM"), makeSymbol("PRONOMIAL-RMS")), list(makeSymbol("CSETQ"), makeSymbol("PRONOMIAL-RMS"), list(makeSymbol("CONS"), makeSymbol("NEW-RM"), makeSymbol("PRONOMIAL-RMS")))), list(RET, makeSymbol("PRONOMIAL-RMS")));

    static private final SubLString $str_alt42$_______________________INITIAL_RM = makeString("~%******************** INITIAL RMS ********************~%");

    static private final SubLString $str_alt43$__ = makeString("~%");

    static private final SubLList $list_alt45 = list($ROOT);

    static private final SubLString $str_alt48$_______________________INITIAL_DR = makeString("~%******************** INITIAL DRS ********************~%");

    static private final SubLList $list_alt49 = list(reader_make_constant_shell("NLSemFn"), reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("NLTagFn"), reader_make_constant_shell("SomeFn"), reader_make_constant_shell("NLDefinitenessFn-3"), reader_make_constant_shell("NLQuantFn-3"));

    static private final SubLList $list_alt57 = list(makeKeyword("READ-ONLY"));

    static private final SubLList $list_alt58 = list(makeSymbol("&OPTIONAL"), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"));

    public static final SubLObject $list_alt59 = com.cyc.cycjava.cycl.drt_drs._constant_59_initializer();

    static private final SubLString $str_alt60$___drs_process_method__A_ = makeString("~%(drs-process-method ~A)");

    static private final SubLString $str_alt61$drt_process_drs__more_than_one_co = makeString("drt-process-drs: more than one complex formula in drs ~A ~A~%");

    public static SubLObject init_drt_drs_file() {
        defparameter("*DRT-DRS-QUANT-CALLS*", $list0);
        defparameter("*DRT-PUT-AVAILABLE-RMS-TO-TOP-LEVEL-DRS*", NIL);
        defparameter("*DRT-QUANTPROC-HINT-FNS*", $list49);
        deflexical("*DRT-INTRODUCED-VAR-NUM-ISG*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defparameter("*DRT-POSSIBLE-RM-COREFERENCES-PREV-DRS-BIASES*", nreverse($list97));
        defparameter("*DRT-POSSIBLE-RM-COREFERENCES-MAX-DEPTH*", subtract(length($drt_possible_rm_coreferences_prev_drs_biases$.getDynamicValue()), ONE_INTEGER));
        return NIL;
    }

    static private final SubLString $str_alt62$1_a__quantifiers___ = makeString("1.a. quantifiers.~%");

    static private final SubLList $list_alt63 = list(makeKeyword("VAR"));

    static private final SubLString $str_alt64$drt_process_drs__A__no_RM_found_f = makeString("drt-process-drs ~A: no RM found for var ~A in complex-formula ~A~%");

    static private final SubLString $str_alt66$_1________________modified_RM_ = makeString("-1--------------- modified RM:");

    static private final SubLString $str_alt67$_1_____________ = makeString("-1-----------~%");

    public static SubLObject setup_drt_drs_file() {
        classes.subloop_new_class(DRS, OBJECT, NIL, NIL, $list3);
        classes.class_set_implements_slot_listeners(DRS, NIL);
        classes.subloop_note_class_initialization_function(DRS, SUBLOOP_RESERVED_INITIALIZE_DRS_CLASS);
        classes.subloop_note_instance_initialization_function(DRS, SUBLOOP_RESERVED_INITIALIZE_DRS_INSTANCE);
        subloop_reserved_initialize_drs_class(DRS);
        methods.methods_incorporate_instance_method(ADD_RM, DRS, NIL, $list25, $list26);
        methods.subloop_register_instance_method(DRS, ADD_RM, DRS_ADD_RM_METHOD);
        methods.methods_incorporate_instance_method(ADD_AVAILABLE_RM, DRS, NIL, $list25, $list30);
        methods.subloop_register_instance_method(DRS, ADD_AVAILABLE_RM, DRS_ADD_AVAILABLE_RM_METHOD);
        methods.methods_incorporate_instance_method(ADD_DEFINITE_RM, DRS, NIL, $list25, $list34);
        methods.subloop_register_instance_method(DRS, ADD_DEFINITE_RM, DRS_ADD_DEFINITE_RM_METHOD);
        methods.methods_incorporate_instance_method(ADD_PRONOMIAL_RM, DRS, NIL, $list25, $list38);
        methods.subloop_register_instance_method(DRS, ADD_PRONOMIAL_RM, DRS_ADD_PRONOMIAL_RM_METHOD);
        methods.methods_incorporate_instance_method(PROCESS, DRS, $list57, $list58, $list59);
        methods.subloop_register_instance_method(DRS, PROCESS, DRS_PROCESS_METHOD);
        methods.methods_incorporate_instance_method(FIND_ALL_POSSIBLE_RM_COREFERENCES, DRS, $list57, NIL, $list94);
        methods.subloop_register_instance_method(DRS, FIND_ALL_POSSIBLE_RM_COREFERENCES, DRS_FIND_ALL_POSSIBLE_RM_COREFERENCES_METHOD);
        methods.methods_incorporate_instance_method(FIND_POSSIBLE_RM_COREFERENCES, DRS, NIL, $list98, $list99);
        methods.subloop_register_instance_method(DRS, FIND_POSSIBLE_RM_COREFERENCES, DRS_FIND_POSSIBLE_RM_COREFERENCES_METHOD);
        methods.methods_incorporate_instance_method(FIND_RM_BY_TARGET, DRS, NIL, $list116, $list117);
        methods.subloop_register_instance_method(DRS, FIND_RM_BY_TARGET, DRS_FIND_RM_BY_TARGET_METHOD);
        methods.methods_incorporate_instance_method(CONSTRUCT_CYCL, DRS, NIL, NIL, $list132);
        methods.subloop_register_instance_method(DRS, CONSTRUCT_CYCL, DRS_CONSTRUCT_CYCL_METHOD);
        return NIL;
    }

    static private final SubLString $str_alt68$1_b__logical_connectives___ = makeString("1.b. logical connectives.~%");

    static private final SubLString $str_alt70$1_c__quantproc__ = makeString("1.c. quantproc~%");

    static private final SubLString $str_alt71$Attempting_reformulation_on_____A = makeString("Attempting reformulation on: ~%~A~%");

    static private final SubLString $str_alt74$Attempting_reformulation_type__A_ = makeString("Attempting reformulation type ~A, mt=~A~%");

    static private final SubLString $str_alt75$Using_reformulator_result_from__A = makeString("Using reformulator result from ~A: ~A~%");

    static private final SubLString $str_alt76$failed_reformulation_on__A__new_c = makeString("failed reformulation on ~A: new-complex-formula is NULL.");

    static private final SubLString $str_alt77$failed_reformulation_on__A__new_c = makeString("failed reformulation on ~A: new-complex-formula is IDENTICAL.");

    static private final SubLString $str_alt78$DRT__A = makeString("DRT-~A");

    static private final SubLList $list_alt79 = list($ROOT, makeKeyword("FORMULA"));

    static private final SubLString $str_alt81$___2________________modified_RM_ = makeString("~%-2--------------- modified RM:");

    static private final SubLString $str_alt82$_2_____________ = makeString("-2-----------~%");

    static private final SubLString $str_alt84$___3________________modified_RM_ = makeString("~%-3--------------- modified RM:");

    static private final SubLString $str_alt85$_3_____________ = makeString("-3-----------~%");

    static private final SubLString $str_alt86$1_d__subcollection_processing__ = makeString("1.d. subcollection processing~%");

    static private final SubLString $str_alt87$1_e__simple_formulas__ = makeString("1.e. simple formulas~%");

    static private final SubLString $str_alt91$_______________________FINAL_DRS_ = makeString("~%******************** FINAL DRS ********************~%");

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_59_initializer_alt() {
        return list(makeString("Processes a DRS until the cycl-formulas slot is empty and all the contents have been moved into the relevant RMs, the simple and complex conditions lists, or the this DRS itself."), list(makeSymbol("IGNORE"), makeSymbol("SUPER-DRS"), makeSymbol("AVAILABLE-RMS"), makeSymbol("DEFINITE-RMS"), makeSymbol("PRONOMIAL-RMS"), makeSymbol("SUB-DRSS")), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("FORMAT"), T, makeString("~%(drs-process-method ~A)"), makeSymbol("SELF")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), T, makeString("~%"))), list(makeSymbol("CLET"), list(list(makeSymbol("SIMPLE-FORMULAS"), NIL), list(makeSymbol("COMPLEX-FORMULAS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CYCL-FORMULA"), makeSymbol("CYCL-FORMULAS")), list(makeSymbol("PIF"), list(makeSymbol("DRT-COMPLEX-FORMULA?"), makeSymbol("CYCL-FORMULA")), list(makeSymbol("CPUSH"), makeSymbol("CYCL-FORMULA"), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CPUSH"), makeSymbol("CYCL-FORMULA"), makeSymbol("SIMPLE-FORMULAS")))), list(makeSymbol("PWHEN"), makeSymbol("COMPLEX-FORMULAS"), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("COMPLEX-FORMULAS")), ONE_INTEGER), list(makeSymbol("DRT-WARN"), makeString("drt-process-drs: more than one complex formula in drs ~A ~A~%"), makeSymbol("SELF"), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEX-FORMULA"), list(makeSymbol("CAR"), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("COMPLEX-FORMULA-ARG0"), list(makeSymbol("FORMULA-ARG0"), makeSymbol("COMPLEX-FORMULA")))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEX-FORMULAS"), list(makeSymbol("CDR"), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("ISA?"), makeSymbol("COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("Quantifier")), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.a. quantifiers.~%"))), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-VAR"), list(makeSymbol("FORMULA-ARG1"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("RM"), list(makeSymbol("CAR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-RM-BY-TARGET")), makeSymbol("TARGET-VAR"), list(QUOTE, list(makeKeyword("VAR"))))))), list(makeSymbol("PUNLESS"), makeSymbol("RM"), list(makeSymbol("DRT-WARN"), makeString("drt-process-drs ~A: no RM found for var ~A in complex-formula ~A~%"), makeSymbol("SELF"), makeSymbol("TARGET-VAR"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("PWHEN"), makeSymbol("RM"), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("SCOPE"))), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("SCOPE")), makeSymbol("COMPLEX-FORMULA-ARG0"))), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("FORMAT"), T, makeString("-1--------------- modified RM:")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("RM")), list(makeSymbol("FORMAT"), T, makeString("-1-----------~%")))), list(makeSymbol("PROGN"), list(makeSymbol("CPUSH"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("COMPLEX-FORMULA")), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))))), list(list(makeSymbol("COR"), list(makeSymbol("ISA?"), makeSymbol("COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("LogicalConnective")), list(EQ, makeSymbol("COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("NLNegFn")), list(EQ, makeSymbol("COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("explains-PropProp"))), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.b. logical connectives.~%"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-COMPLEX-CONDITION"), list(makeSymbol("BQ-LIST"), makeSymbol("COMPLEX-FORMULA-ARG0"))), list(makeSymbol("SUBDRS-LIST"))), list(makeSymbol("PCASE"), makeSymbol("COMPLEX-FORMULA-ARG0"), list(reader_make_constant_shell("and"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEX-FORMULAS"), list(makeSymbol("APPEND"), list(makeSymbol("FORMULA-ARGS"), makeSymbol("COMPLEX-FORMULA")), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS")))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CLET"), list(list(makeSymbol("LAST-NEW-DRS"), NIL), list(makeSymbol("FORMULA-ARGS"), list(makeSymbol("FORMULA-ARGS"), makeSymbol("COMPLEX-FORMULA")))), list(makeSymbol("CDOLIST"), list(makeSymbol("FORMULA-ARG"), makeSymbol("FORMULA-ARGS")), list(makeSymbol("PIF"), list(makeSymbol("CONSP"), makeSymbol("FORMULA-ARG")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("SUBDRS"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(QUOTE, makeSymbol("DRS")), list(QUOTE, makeSymbol("NEW"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("INTERACTION-MT")), makeSymbol("INTERACTION-MT")), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("PARSING-MT")), makeSymbol("PARSING-MT")), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("BQ-LIST"), makeSymbol("FORMULA-ARG"))), list(makeSymbol("PIF"), makeSymbol("LAST-NEW-DRS"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("SUPER-DRS")), makeSymbol("LAST-NEW-DRS")), list(makeSymbol("SET-SLOT"), makeSymbol("LAST-NEW-DRS"), list(QUOTE, makeSymbol("SUB-DRSS")), list(makeSymbol("BQ-LIST"), makeSymbol("SUBDRS")))), list(makeSymbol("PROGN"), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("SUPER-DRS")), makeSymbol("SELF")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SUB-DRSS")), list(makeSymbol("BQ-LIST"), makeSymbol("SUBDRS"))))), list(makeSymbol("CSETQ"), makeSymbol("LAST-NEW-DRS"), makeSymbol("SUBDRS")), list(makeSymbol("CPUSH"), makeSymbol("SUBDRS"), makeSymbol("NEW-COMPLEX-CONDITION")), list(makeSymbol("CPUSH"), makeSymbol("SUBDRS"), makeSymbol("SUBDRS-LIST")) }), list(makeSymbol("CPUSH"), makeSymbol("FORMULA-ARG"), makeSymbol("NEW-COMPLEX-CONDITION"))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("NEW-COMPLEX-CONDITION"), list(makeSymbol("NREVERSE"), makeSymbol("NEW-COMPLEX-CONDITION"))), list(makeSymbol("CSETQ"), makeSymbol("COMPLEX-CONDITIONS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPLEX-CONDITIONS")), list(makeSymbol("CONS"), makeSymbol("NEW-COMPLEX-CONDITION"), makeSymbol("COMPLEX-CONDITIONS"))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))), list(makeSymbol("CLET"), list(makeSymbol("POSSIBLE-RM-COREFERENCES")), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBDRS"), makeSymbol("SUBDRS-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("SUB-POSSIBLE-RM-COREFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("PROCESS"))))), list(makeSymbol("PCOND"), list(list(EQ, makeSymbol("SUB-POSSIBLE-RM-COREFERENCES"), T), list(RET, T)), list(T, list(makeSymbol("CSETQ"), makeSymbol("POSSIBLE-RM-COREFERENCES"), list(makeSymbol("APPEND"), makeSymbol("SUB-POSSIBLE-RM-COREFERENCES"), makeSymbol("POSSIBLE-RM-COREFERENCES"))))))), list(makeSymbol("CSETQ"), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"), list(makeSymbol("APPEND"), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"), makeSymbol("POSSIBLE-RM-COREFERENCES")))))))), list(T, list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.c. quantproc~%")), list(makeSymbol("FORMAT"), T, makeString("Attempting reformulation on: ~%~A~%"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-COMPLEX-FORMULA"), NIL)), list(makeSymbol("CLET"), list(makeSymbol("DONE?")), list(makeSymbol("CSOME"), list(makeSymbol("QUANT-CALL"), makeSymbol("*DRT-DRS-QUANT-CALLS*"), makeSymbol("DONE?")), list(makeSymbol("CLET"), list(list(makeSymbol("QUANT-CALL-TYPE"), list(makeSymbol("DRT-DRS-QUANT-CALL-TYPE"), makeSymbol("QUANT-CALL"))), list(makeSymbol("QUANT-CALL-TEST"), list(makeSymbol("DRT-DRS-QUANT-CALL-TEST"), makeSymbol("QUANT-CALL"))), list(makeSymbol("QUANT-CALL-FN"), list(makeSymbol("DRT-DRS-QUANT-CALL-FN"), makeSymbol("QUANT-CALL"))), list(makeSymbol("QUANT-CALL-MT"), list(makeSymbol("DRT-DRS-QUANT-CALL-MT"), makeSymbol("QUANT-CALL")))), list(makeSymbol("PCASE"), makeSymbol("QUANT-CALL-MT"), list(makeKeyword("PARSING-MT"), list(makeSymbol("CSETQ"), makeSymbol("QUANT-CALL-MT"), makeSymbol("PARSING-MT"))), list(makeKeyword("INTERACTION-MT"), list(makeSymbol("CSETQ"), makeSymbol("QUANT-CALL-MT"), makeSymbol("INTERACTION-MT"))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CSETQ"), makeSymbol("QUANT-CALL-MT"), makeSymbol("INTERACTION-MT")))), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("FORMAT"), T, makeString("Attempting reformulation type ~A, mt=~A~%"), makeSymbol("QUANT-CALL-TYPE"), makeSymbol("QUANT-CALL-MT"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("QUANT-CALL-TEST")), list(makeSymbol("FUNCALL"), makeSymbol("QUANT-CALL-TEST"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("QUANT-CALL-FN")), list(makeSymbol("CSETQ"), makeSymbol("NEW-COMPLEX-FORMULA"), list(makeSymbol("FUNCALL"), makeSymbol("QUANT-CALL-FN"), makeSymbol("COMPLEX-FORMULA"), makeSymbol("QUANT-CALL-MT"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-COMPLEX-FORMULA")), list(EQUAL, makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("FORMAT"), T, makeString("Using reformulator result from ~A: ~A~%"), makeSymbol("QUANT-CALL-TYPE"), makeSymbol("NEW-COMPLEX-FORMULA"))), list(makeSymbol("CSETQ"), makeSymbol("DONE?"), T))))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("NEW-COMPLEX-FORMULA")), list(makeSymbol("DRT-WARN"), makeString("failed reformulation on ~A: new-complex-formula is NULL."), makeSymbol("COMPLEX-FORMULA")), list(RET, T)), list(list(EQUAL, makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULA")), list(makeSymbol("DRT-WARN"), makeString("failed reformulation on ~A: new-complex-formula is IDENTICAL."), makeSymbol("COMPLEX-FORMULA")), list(RET, T)), list(T, list(makeSymbol("CLET"), list(list(makeSymbol("NEW-COMPLEX-FORMULA-ARG0"), list(makeSymbol("FORMULA-ARG0"), makeSymbol("NEW-COMPLEX-FORMULA")))), list(makeSymbol("PCOND"), list(list(makeSymbol("ISA?"), makeSymbol("NEW-COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("Quantifier")), list(makeSymbol("CLET"), list(list(makeSymbol("INTRODUCED-VAR"), list(makeSymbol("FORMULA-ARG1"), makeSymbol("NEW-COMPLEX-FORMULA"))), list(makeSymbol("UNIQUE-VAR"), list(makeSymbol("MAKE-EL-VAR"), list(makeSymbol("FORMAT"), NIL, makeString("DRT-~A"), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), makeSymbol("*DRT-INTRODUCED-VAR-NUM-ISG*")))))), list(makeSymbol("PWHEN"), list(makeSymbol("EL-VAR?"), makeSymbol("INTRODUCED-VAR")), list(makeSymbol("CSETQ"), makeSymbol("NEW-COMPLEX-FORMULA"), list(makeSymbol("TREE-SUBSTITUTE"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("INTRODUCED-VAR"), makeSymbol("UNIQUE-VAR"))))), list(makeSymbol("PROGN"), list(makeSymbol("CPUSH"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))), list(makeSymbol("CLET"), list(list(makeSymbol("INTRODUCED-VAR"), list(makeSymbol("FORMULA-ARG1"), makeSymbol("NEW-COMPLEX-FORMULA"))), list(makeSymbol("SUBFORMULA"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("NEW-COMPLEX-FORMULA"))), list(makeSymbol("TARGET-TERMS"), list(makeSymbol("FIND-TERMS-FOR-VAR-IN-FORMULA"), makeSymbol("INTRODUCED-VAR"), makeSymbol("SUBFORMULA"))), list(makeSymbol("RM"), NIL)), list(makeSymbol("CLET"), list(makeSymbol("DONE?"), makeSymbol("DONE2?")), list(makeSymbol("CSOME"), list(makeSymbol("TARGET-TERM"), makeSymbol("TARGET-TERMS"), makeSymbol("DONE?")), list(makeSymbol("CLET"), list(list(makeSymbol("POSS-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-RM-BY-TARGET")), makeSymbol("TARGET-TERM"), list(QUOTE, list($ROOT, makeKeyword("FORMULA")))))), list(makeSymbol("CSOME"), list(makeSymbol("POSS-RM"), makeSymbol("POSS-RMS"), makeSymbol("DONE2?")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("RM-P"), makeSymbol("POSS-RM")), list(makeSymbol("NULL"), list(makeSymbol("GET-SLOT"), makeSymbol("POSS-RM"), list(QUOTE, makeSymbol("TARGET-VAR"))))), list(makeSymbol("CSETQ"), makeSymbol("RM"), makeSymbol("POSS-RM")), list(makeSymbol("CSETQ"), makeSymbol("DONE?"), T), list(makeSymbol("CSETQ"), makeSymbol("DONE2?"), T)))))), list(makeSymbol("PWHEN"), list(makeSymbol("RM-P"), makeSymbol("RM")), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TARGET-VAR")), makeSymbol("INTRODUCED-VAR")), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("SCOPE")), makeSymbol("NEW-COMPLEX-FORMULA-ARG0")), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("FORMAT"), T, makeString("~%-2--------------- modified RM:")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("RM")), list(makeSymbol("FORMAT"), T, makeString("-2-----------~%")))))), list(list(makeSymbol("ISA?"), makeSymbol("NEW-COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("LogicalConnective")), list(makeSymbol("CLET"), list(list(makeSymbol("INTRODUCED-VAR"), list(makeSymbol("SECOND"), list(makeSymbol("SECOND"), makeSymbol("NEW-COMPLEX-FORMULA")))), list(makeSymbol("UNIQUE-VAR"), list(makeSymbol("MAKE-EL-VAR"), list(makeSymbol("FORMAT"), NIL, makeString("DRT-~A"), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), makeSymbol("*DRT-INTRODUCED-VAR-NUM-ISG*")))))), list(makeSymbol("PWHEN"), list(makeSymbol("EL-VAR?"), makeSymbol("INTRODUCED-VAR")), list(makeSymbol("CSETQ"), makeSymbol("NEW-COMPLEX-FORMULA"), list(makeSymbol("TREE-SUBSTITUTE"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("INTRODUCED-VAR"), makeSymbol("UNIQUE-VAR"))))), list(makeSymbol("PROGN"), list(makeSymbol("CPUSH"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))), list(makeSymbol("CLET"), list(list(makeSymbol("INTRODUCED-VAR"), list(makeSymbol("SECOND"), list(makeSymbol("SECOND"), makeSymbol("NEW-COMPLEX-FORMULA")))), list(makeSymbol("TARGET-TERM"), list(makeSymbol("THIRD"), list(makeSymbol("SECOND"), makeSymbol("NEW-COMPLEX-FORMULA")))), list(makeSymbol("POSS-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-RM-BY-TARGET")), makeSymbol("TARGET-TERM"), list(QUOTE, list($ROOT)))), makeSymbol("RM")), list(makeSymbol("CLET"), list(makeSymbol("DONE?")), list(makeSymbol("CSOME"), list(makeSymbol("POSS-RM"), makeSymbol("POSS-RMS"), makeSymbol("DONE?")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("RM-P"), makeSymbol("POSS-RM")), list(makeSymbol("NULL"), list(makeSymbol("GET-SLOT"), makeSymbol("POSS-RM"), list(QUOTE, makeSymbol("TARGET-VAR"))))), list(makeSymbol("CSETQ"), makeSymbol("RM"), makeSymbol("POSS-RM")), list(makeSymbol("CSETQ"), makeSymbol("DONE?"), T)))), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TARGET-VAR")), makeSymbol("INTRODUCED-VAR")), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("SCOPE")), reader_make_constant_shell("forAll")), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("FORMAT"), T, makeString("~%-3--------------- modified RM:")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("RM")), list(makeSymbol("FORMAT"), T, makeString("-3-----------~%"))))), list(T, list(makeSymbol("PROGN"), list(makeSymbol("CPUSH"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))))))))))))), list(makeSymbol("PWHEN"), makeSymbol("SIMPLE-FORMULAS"), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.d. subcollection processing~%"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-SIMPLE-FORMULAS"), NIL), list(makeSymbol("NEW-COMPLEX-FORMULAS"), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-FORMULA"), makeSymbol("SIMPLE-FORMULAS")), list(makeSymbol("CLET"), list(list(makeSymbol("POSS-NEW-FORMULA"), list(makeSymbol("REFORMULATE-CYCL-SUBCOLLPROC"), makeSymbol("SIMPLE-FORMULA"), makeSymbol("INTERACTION-MT")))), list(makeSymbol("PIF"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("POSS-NEW-FORMULA")), list(EQUAL, makeSymbol("POSS-NEW-FORMULA"), makeSymbol("SIMPLE-FORMULA"))), list(makeSymbol("CPUSH"), makeSymbol("SIMPLE-FORMULA"), makeSymbol("NEW-SIMPLE-FORMULAS")), list(makeSymbol("CPUSH"), makeSymbol("POSS-NEW-FORMULA"), makeSymbol("NEW-COMPLEX-FORMULAS"))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("SIMPLE-FORMULAS"), makeSymbol("NEW-SIMPLE-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("NEW-COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))))), list(makeSymbol("PWHEN"), makeSymbol("SIMPLE-FORMULAS"), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.e. simple formulas~%"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-FORMULA"), makeSymbol("SIMPLE-FORMULAS")), list(makeSymbol("CLET"), list(list(makeSymbol("SIMPLE-CONDITION"), list(makeSymbol("DRT-DRS-MAP-ADD-RMS-TO-FORMULA"), makeSymbol("SELF"), makeSymbol("SIMPLE-FORMULA")))), list(makeSymbol("CDOLIST"), list(makeSymbol("RM"), list(makeSymbol("TREE-FIND-ALL-IF"), list(makeSymbol("FUNCTION"), makeSymbol("RM-P")), makeSymbol("SIMPLE-CONDITION"))), list(makeSymbol("PCASE"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TYPE"))), list(makeKeyword("DEFINITE"), list(makeSymbol("CSETQ"), makeSymbol("DEFINITE-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD-DEFINITE-RM")), makeSymbol("RM")))), list(makeKeyword("PRONOMIAL"), list(makeSymbol("CSETQ"), makeSymbol("PRONOMIAL-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD-PRONOMIAL-RM")), makeSymbol("RM")))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CSETQ"), makeSymbol("AVAILABLE-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD-AVAILABLE-RM")), makeSymbol("RM")))))), list(makeSymbol("CSETQ"), makeSymbol("SIMPLE-CONDITIONS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SIMPLE-CONDITIONS")), list(makeSymbol("CONS"), makeSymbol("SIMPLE-CONDITION"), makeSymbol("SIMPLE-CONDITIONS")))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("SIMPLE-FORMULAS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), makeSymbol("COMPLEX-FORMULAS"))))), list(makeSymbol("DRT-TRACE-PROGN"), TWO_INTEGER, list(makeSymbol("PUNLESS"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("FORMAT"), T, makeString("~%******************** FINAL DRS ********************~%")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("CYCL-FORMULAS"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PROCESS")), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"))), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES")))))));
    }

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static SubLObject _constant_59_initializer() {
        return list(makeString("Processes a DRS until the cycl-formulas slot is empty and all the contents have been moved into the relevant RMs, the simple and complex conditions lists, or the this DRS itself."), list(makeSymbol("IGNORE"), makeSymbol("SUPER-DRS"), makeSymbol("AVAILABLE-RMS"), makeSymbol("DEFINITE-RMS"), makeSymbol("PRONOMIAL-RMS"), makeSymbol("SUB-DRSS")), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("FORMAT"), T, makeString("~%(drs-process-method ~A)"), makeSymbol("SELF")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), T, makeString("~%"))), list(makeSymbol("CLET"), list(list(makeSymbol("SIMPLE-FORMULAS"), NIL), list(makeSymbol("COMPLEX-FORMULAS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CYCL-FORMULA"), makeSymbol("CYCL-FORMULAS")), list(makeSymbol("PIF"), list(makeSymbol("DRT-COMPLEX-FORMULA?"), makeSymbol("CYCL-FORMULA")), list(makeSymbol("CPUSH"), makeSymbol("CYCL-FORMULA"), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CPUSH"), makeSymbol("CYCL-FORMULA"), makeSymbol("SIMPLE-FORMULAS")))), list(makeSymbol("PWHEN"), makeSymbol("COMPLEX-FORMULAS"), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("COMPLEX-FORMULAS")), ONE_INTEGER), list(makeSymbol("DRT-WARN"), makeString("drt-process-drs: more than one complex formula in drs ~A ~A~%"), makeSymbol("SELF"), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEX-FORMULA"), list(makeSymbol("CAR"), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("COMPLEX-FORMULA-ARG0"), list(makeSymbol("FORMULA-ARG0"), makeSymbol("COMPLEX-FORMULA")))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEX-FORMULAS"), list(makeSymbol("CDR"), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("ISA?"), makeSymbol("COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("Quantifier")), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.a. quantifiers.~%"))), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-VAR"), list(makeSymbol("FORMULA-ARG1"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("RM"), list(makeSymbol("CAR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-RM-BY-TARGET")), makeSymbol("TARGET-VAR"), list(QUOTE, list(makeKeyword("VAR"))))))), list(makeSymbol("PUNLESS"), makeSymbol("RM"), list(makeSymbol("DRT-WARN"), makeString("drt-process-drs ~A: no RM found for var ~A in complex-formula ~A~%"), makeSymbol("SELF"), makeSymbol("TARGET-VAR"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("PWHEN"), makeSymbol("RM"), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("SCOPE"))), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("SCOPE")), makeSymbol("COMPLEX-FORMULA-ARG0"))), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("FORMAT"), T, makeString("-1--------------- modified RM:")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("RM")), list(makeSymbol("FORMAT"), T, makeString("-1-----------~%")))), list(makeSymbol("PROGN"), list(makeSymbol("CPUSH"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("COMPLEX-FORMULA")), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))))), list(list(makeSymbol("COR"), list(makeSymbol("ISA?"), makeSymbol("COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("LogicalConnective")), list(EQ, makeSymbol("COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("NLNegFn")), list(EQ, makeSymbol("COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("explains-PropProp"))), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.b. logical connectives.~%"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-COMPLEX-CONDITION"), list(makeSymbol("BQ-LIST"), makeSymbol("COMPLEX-FORMULA-ARG0"))), list(makeSymbol("SUBDRS-LIST"))), list(makeSymbol("PCASE"), makeSymbol("COMPLEX-FORMULA-ARG0"), list(reader_make_constant_shell("and"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEX-FORMULAS"), list(makeSymbol("APPEND"), list(makeSymbol("FORMULA-ARGS"), makeSymbol("COMPLEX-FORMULA")), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS")))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CLET"), list(list(makeSymbol("LAST-NEW-DRS"), NIL), list(makeSymbol("FORMULA-ARGS"), list(makeSymbol("FORMULA-ARGS"), makeSymbol("COMPLEX-FORMULA")))), list(makeSymbol("CDOLIST"), list(makeSymbol("FORMULA-ARG"), makeSymbol("FORMULA-ARGS")), list(makeSymbol("PIF"), list(makeSymbol("CONSP"), makeSymbol("FORMULA-ARG")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("SUBDRS"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(QUOTE, makeSymbol("DRS")), list(QUOTE, makeSymbol("NEW"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("INTERACTION-MT")), makeSymbol("INTERACTION-MT")), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("PARSING-MT")), makeSymbol("PARSING-MT")), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("BQ-LIST"), makeSymbol("FORMULA-ARG"))), list(makeSymbol("PIF"), makeSymbol("LAST-NEW-DRS"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("SUPER-DRS")), makeSymbol("LAST-NEW-DRS")), list(makeSymbol("SET-SLOT"), makeSymbol("LAST-NEW-DRS"), list(QUOTE, makeSymbol("SUB-DRSS")), list(makeSymbol("BQ-LIST"), makeSymbol("SUBDRS")))), list(makeSymbol("PROGN"), list(makeSymbol("SET-SLOT"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("SUPER-DRS")), makeSymbol("SELF")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SUB-DRSS")), list(makeSymbol("BQ-LIST"), makeSymbol("SUBDRS"))))), list(makeSymbol("CSETQ"), makeSymbol("LAST-NEW-DRS"), makeSymbol("SUBDRS")), list(makeSymbol("CPUSH"), makeSymbol("SUBDRS"), makeSymbol("NEW-COMPLEX-CONDITION")), list(makeSymbol("CPUSH"), makeSymbol("SUBDRS"), makeSymbol("SUBDRS-LIST")) }), list(makeSymbol("CPUSH"), makeSymbol("FORMULA-ARG"), makeSymbol("NEW-COMPLEX-CONDITION"))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("NEW-COMPLEX-CONDITION"), list(makeSymbol("NREVERSE"), makeSymbol("NEW-COMPLEX-CONDITION"))), list(makeSymbol("CSETQ"), makeSymbol("COMPLEX-CONDITIONS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPLEX-CONDITIONS")), list(makeSymbol("CONS"), makeSymbol("NEW-COMPLEX-CONDITION"), makeSymbol("COMPLEX-CONDITIONS"))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))), list(makeSymbol("CLET"), list(makeSymbol("POSSIBLE-RM-COREFERENCES")), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBDRS"), makeSymbol("SUBDRS-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("SUB-POSSIBLE-RM-COREFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUBDRS"), list(QUOTE, makeSymbol("PROCESS"))))), list(makeSymbol("PCOND"), list(list(EQ, makeSymbol("SUB-POSSIBLE-RM-COREFERENCES"), T), list(RET, T)), list(T, list(makeSymbol("CSETQ"), makeSymbol("POSSIBLE-RM-COREFERENCES"), list(makeSymbol("APPEND"), makeSymbol("SUB-POSSIBLE-RM-COREFERENCES"), makeSymbol("POSSIBLE-RM-COREFERENCES"))))))), list(makeSymbol("CSETQ"), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"), list(makeSymbol("APPEND"), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"), makeSymbol("POSSIBLE-RM-COREFERENCES")))))))), list(T, list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.c. quantproc~%")), list(makeSymbol("FORMAT"), T, makeString("Attempting reformulation on: ~%~A~%"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-COMPLEX-FORMULA"), NIL)), list(makeSymbol("CLET"), list(makeSymbol("DONE?")), list(makeSymbol("CSOME"), list(makeSymbol("QUANT-CALL"), makeSymbol("*DRT-DRS-QUANT-CALLS*"), makeSymbol("DONE?")), list(makeSymbol("CLET"), list(list(makeSymbol("QUANT-CALL-TYPE"), list(makeSymbol("DRT-DRS-QUANT-CALL-TYPE"), makeSymbol("QUANT-CALL"))), list(makeSymbol("QUANT-CALL-TEST"), list(makeSymbol("DRT-DRS-QUANT-CALL-TEST"), makeSymbol("QUANT-CALL"))), list(makeSymbol("QUANT-CALL-FN"), list(makeSymbol("DRT-DRS-QUANT-CALL-FN"), makeSymbol("QUANT-CALL"))), list(makeSymbol("QUANT-CALL-MT"), list(makeSymbol("DRT-DRS-QUANT-CALL-MT"), makeSymbol("QUANT-CALL")))), list(makeSymbol("PCASE"), makeSymbol("QUANT-CALL-MT"), list(makeKeyword("PARSING-MT"), list(makeSymbol("CSETQ"), makeSymbol("QUANT-CALL-MT"), makeSymbol("PARSING-MT"))), list(makeKeyword("INTERACTION-MT"), list(makeSymbol("CSETQ"), makeSymbol("QUANT-CALL-MT"), makeSymbol("INTERACTION-MT"))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CSETQ"), makeSymbol("QUANT-CALL-MT"), makeSymbol("INTERACTION-MT")))), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("FORMAT"), T, makeString("Attempting reformulation type ~A, mt=~A~%"), makeSymbol("QUANT-CALL-TYPE"), makeSymbol("QUANT-CALL-MT"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("QUANT-CALL-TEST")), list(makeSymbol("FUNCALL"), makeSymbol("QUANT-CALL-TEST"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("QUANT-CALL-FN")), list(makeSymbol("CSETQ"), makeSymbol("NEW-COMPLEX-FORMULA"), list(makeSymbol("FUNCALL"), makeSymbol("QUANT-CALL-FN"), makeSymbol("COMPLEX-FORMULA"), makeSymbol("QUANT-CALL-MT"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-COMPLEX-FORMULA")), list(EQUAL, makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULA"))), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("FORMAT"), T, makeString("Using reformulator result from ~A: ~A~%"), makeSymbol("QUANT-CALL-TYPE"), makeSymbol("NEW-COMPLEX-FORMULA"))), list(makeSymbol("CSETQ"), makeSymbol("DONE?"), T))))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("NEW-COMPLEX-FORMULA")), list(makeSymbol("DRT-WARN"), makeString("failed reformulation on ~A: new-complex-formula is NULL."), makeSymbol("COMPLEX-FORMULA")), list(RET, T)), list(list(EQUAL, makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULA")), list(makeSymbol("DRT-WARN"), makeString("failed reformulation on ~A: new-complex-formula is IDENTICAL."), makeSymbol("COMPLEX-FORMULA")), list(RET, T)), list(T, list(makeSymbol("CLET"), list(list(makeSymbol("NEW-COMPLEX-FORMULA-ARG0"), list(makeSymbol("FORMULA-ARG0"), makeSymbol("NEW-COMPLEX-FORMULA")))), list(makeSymbol("PCOND"), list(list(makeSymbol("ISA?"), makeSymbol("NEW-COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("Quantifier")), list(makeSymbol("CLET"), list(list(makeSymbol("INTRODUCED-VAR"), list(makeSymbol("FORMULA-ARG1"), makeSymbol("NEW-COMPLEX-FORMULA"))), list(makeSymbol("UNIQUE-VAR"), list(makeSymbol("MAKE-EL-VAR"), list(makeSymbol("FORMAT"), NIL, makeString("DRT-~A"), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), makeSymbol("*DRT-INTRODUCED-VAR-NUM-ISG*")))))), list(makeSymbol("PWHEN"), list(makeSymbol("EL-VAR?"), makeSymbol("INTRODUCED-VAR")), list(makeSymbol("CSETQ"), makeSymbol("NEW-COMPLEX-FORMULA"), list(makeSymbol("TREE-SUBSTITUTE"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("INTRODUCED-VAR"), makeSymbol("UNIQUE-VAR"))))), list(makeSymbol("PROGN"), list(makeSymbol("CPUSH"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))), list(makeSymbol("CLET"), list(list(makeSymbol("INTRODUCED-VAR"), list(makeSymbol("FORMULA-ARG1"), makeSymbol("NEW-COMPLEX-FORMULA"))), list(makeSymbol("SUBFORMULA"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("NEW-COMPLEX-FORMULA"))), list(makeSymbol("TARGET-TERMS"), list(makeSymbol("FIND-TERMS-FOR-VAR-IN-FORMULA"), makeSymbol("INTRODUCED-VAR"), makeSymbol("SUBFORMULA"))), list(makeSymbol("RM"), NIL)), list(makeSymbol("CLET"), list(makeSymbol("DONE?"), makeSymbol("DONE2?")), list(makeSymbol("CSOME"), list(makeSymbol("TARGET-TERM"), makeSymbol("TARGET-TERMS"), makeSymbol("DONE?")), list(makeSymbol("CLET"), list(list(makeSymbol("POSS-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-RM-BY-TARGET")), makeSymbol("TARGET-TERM"), list(QUOTE, list($ROOT, makeKeyword("FORMULA")))))), list(makeSymbol("CSOME"), list(makeSymbol("POSS-RM"), makeSymbol("POSS-RMS"), makeSymbol("DONE2?")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("RM-P"), makeSymbol("POSS-RM")), list(makeSymbol("NULL"), list(makeSymbol("GET-SLOT"), makeSymbol("POSS-RM"), list(QUOTE, makeSymbol("TARGET-VAR"))))), list(makeSymbol("CSETQ"), makeSymbol("RM"), makeSymbol("POSS-RM")), list(makeSymbol("CSETQ"), makeSymbol("DONE?"), T), list(makeSymbol("CSETQ"), makeSymbol("DONE2?"), T)))))), list(makeSymbol("PWHEN"), list(makeSymbol("RM-P"), makeSymbol("RM")), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TARGET-VAR")), makeSymbol("INTRODUCED-VAR")), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("SCOPE")), makeSymbol("NEW-COMPLEX-FORMULA-ARG0")), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("FORMAT"), T, makeString("~%-2--------------- modified RM:")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("RM")), list(makeSymbol("FORMAT"), T, makeString("-2-----------~%")))))), list(list(makeSymbol("ISA?"), makeSymbol("NEW-COMPLEX-FORMULA-ARG0"), reader_make_constant_shell("LogicalConnective")), list(makeSymbol("CLET"), list(list(makeSymbol("INTRODUCED-VAR"), list(makeSymbol("SECOND"), list(makeSymbol("SECOND"), makeSymbol("NEW-COMPLEX-FORMULA")))), list(makeSymbol("UNIQUE-VAR"), list(makeSymbol("MAKE-EL-VAR"), list(makeSymbol("FORMAT"), NIL, makeString("DRT-~A"), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), makeSymbol("*DRT-INTRODUCED-VAR-NUM-ISG*")))))), list(makeSymbol("PWHEN"), list(makeSymbol("EL-VAR?"), makeSymbol("INTRODUCED-VAR")), list(makeSymbol("CSETQ"), makeSymbol("NEW-COMPLEX-FORMULA"), list(makeSymbol("TREE-SUBSTITUTE"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("INTRODUCED-VAR"), makeSymbol("UNIQUE-VAR"))))), list(makeSymbol("PROGN"), list(makeSymbol("CPUSH"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))), list(makeSymbol("CLET"), list(list(makeSymbol("INTRODUCED-VAR"), list(makeSymbol("SECOND"), list(makeSymbol("SECOND"), makeSymbol("NEW-COMPLEX-FORMULA")))), list(makeSymbol("TARGET-TERM"), list(makeSymbol("THIRD"), list(makeSymbol("SECOND"), makeSymbol("NEW-COMPLEX-FORMULA")))), list(makeSymbol("POSS-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-RM-BY-TARGET")), makeSymbol("TARGET-TERM"), list(QUOTE, list($ROOT)))), makeSymbol("RM")), list(makeSymbol("CLET"), list(makeSymbol("DONE?")), list(makeSymbol("CSOME"), list(makeSymbol("POSS-RM"), makeSymbol("POSS-RMS"), makeSymbol("DONE?")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("RM-P"), makeSymbol("POSS-RM")), list(makeSymbol("NULL"), list(makeSymbol("GET-SLOT"), makeSymbol("POSS-RM"), list(QUOTE, makeSymbol("TARGET-VAR"))))), list(makeSymbol("CSETQ"), makeSymbol("RM"), makeSymbol("POSS-RM")), list(makeSymbol("CSETQ"), makeSymbol("DONE?"), T)))), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TARGET-VAR")), makeSymbol("INTRODUCED-VAR")), list(makeSymbol("SET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("SCOPE")), reader_make_constant_shell("forAll")), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("FORMAT"), T, makeString("~%-3--------------- modified RM:")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("RM")), list(makeSymbol("FORMAT"), T, makeString("-3-----------~%"))))), list(T, list(makeSymbol("PROGN"), list(makeSymbol("CPUSH"), makeSymbol("NEW-COMPLEX-FORMULA"), makeSymbol("COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))))))))))))), list(makeSymbol("PWHEN"), makeSymbol("SIMPLE-FORMULAS"), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.d. subcollection processing~%"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-SIMPLE-FORMULAS"), NIL), list(makeSymbol("NEW-COMPLEX-FORMULAS"), makeSymbol("COMPLEX-FORMULAS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-FORMULA"), makeSymbol("SIMPLE-FORMULAS")), list(makeSymbol("CLET"), list(list(makeSymbol("POSS-NEW-FORMULA"), list(makeSymbol("REFORMULATE-CYCL-SUBCOLLPROC"), makeSymbol("SIMPLE-FORMULA"), makeSymbol("INTERACTION-MT")))), list(makeSymbol("PIF"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("POSS-NEW-FORMULA")), list(EQUAL, makeSymbol("POSS-NEW-FORMULA"), makeSymbol("SIMPLE-FORMULA"))), list(makeSymbol("CPUSH"), makeSymbol("SIMPLE-FORMULA"), makeSymbol("NEW-SIMPLE-FORMULAS")), list(makeSymbol("CPUSH"), makeSymbol("POSS-NEW-FORMULA"), makeSymbol("NEW-COMPLEX-FORMULAS"))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("SIMPLE-FORMULAS"), makeSymbol("NEW-SIMPLE-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("NEW-COMPLEX-FORMULAS")), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), list(makeSymbol("APPEND"), makeSymbol("COMPLEX-FORMULAS"), makeSymbol("SIMPLE-FORMULAS"))))))), list(makeSymbol("PWHEN"), makeSymbol("SIMPLE-FORMULAS"), list(makeSymbol("DRT-TRACE-PROGN"), THREE_INTEGER, list(makeSymbol("DRT-WARN"), makeString("1.e. simple formulas~%"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-FORMULA"), makeSymbol("SIMPLE-FORMULAS")), list(makeSymbol("CLET"), list(list(makeSymbol("SIMPLE-CONDITION"), list(makeSymbol("DRT-DRS-MAP-ADD-RMS-TO-FORMULA"), makeSymbol("SELF"), makeSymbol("SIMPLE-FORMULA")))), list(makeSymbol("CDOLIST"), list(makeSymbol("RM"), list(makeSymbol("TREE-FIND-ALL-IF"), list(makeSymbol("FUNCTION"), makeSymbol("RM-P")), makeSymbol("SIMPLE-CONDITION"))), list(makeSymbol("PCASE"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TYPE"))), list(makeKeyword("DEFINITE"), list(makeSymbol("CSETQ"), makeSymbol("DEFINITE-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD-DEFINITE-RM")), makeSymbol("RM")))), list(makeKeyword("PRONOMIAL"), list(makeSymbol("CSETQ"), makeSymbol("PRONOMIAL-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD-PRONOMIAL-RM")), makeSymbol("RM")))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CSETQ"), makeSymbol("AVAILABLE-RMS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD-AVAILABLE-RM")), makeSymbol("RM")))))), list(makeSymbol("CSETQ"), makeSymbol("SIMPLE-CONDITIONS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SIMPLE-CONDITIONS")), list(makeSymbol("CONS"), makeSymbol("SIMPLE-CONDITION"), makeSymbol("SIMPLE-CONDITIONS")))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("SIMPLE-FORMULAS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCL-FORMULAS")), makeSymbol("COMPLEX-FORMULAS"))))), list(makeSymbol("DRT-TRACE-PROGN"), TWO_INTEGER, list(makeSymbol("PUNLESS"), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("FORMAT"), T, makeString("~%******************** FINAL DRS ********************~%")), list(makeSymbol("DESCRIBE-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("CYCL-FORMULAS"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PROCESS")), makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"))), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES")))))));
    }

    static private final SubLList $list_alt94 = list(makeString("Returns a list of lists of the form (RM ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...)) indicating the probabiltiy of each possible RM coreference in this DRS."), list(makeSymbol("CLET"), list(makeSymbol("RESULT")), list(makeSymbol("PWHEN"), makeSymbol("SUB-DRSS"), list(makeSymbol("CDOLIST"), list(makeSymbol("SUB-DRS"), makeSymbol("SUB-DRSS")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("APPEND"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUB-DRS"), list(QUOTE, makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES"))))))), list(makeSymbol("PWHEN"), makeSymbol("PRONOMIAL-RMS"), list(makeSymbol("CDOLIST"), list(makeSymbol("PRONOMIAL-RM"), makeSymbol("PRONOMIAL-RMS")), list(makeSymbol("CLET"), list(list(makeSymbol("POSSIBLE-RM-COREFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-POSSIBLE-RM-COREFERENCES")), makeSymbol("PRONOMIAL-RM")))), list(makeSymbol("PWHEN"), makeSymbol("POSSIBLE-RM-COREFERENCES"), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeSymbol("PRONOMIAL-RM"), makeSymbol("POSSIBLE-RM-COREFERENCES")), makeSymbol("RESULT")))))), list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt97 = list(makeDouble(1.0));

    static private final SubLList $list_alt98 = list(makeSymbol("RM"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEPTH"), makeSymbol("*DRT-POSSIBLE-RM-COREFERENCES-MAX-DEPTH*")), list(makeSymbol("CUTOFF"), NIL));

    static private final SubLList $list_alt99 = list(makeString("Returns a list of the form ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...) indicating the possible coreferences of the specified RM in this DRS.  If DEPTH is specified, we look to DEPTH-1 previous DRSs for possible intersentential coreferences."), list(makeSymbol("IGNORE"), makeSymbol("CUTOFF")), list(makeSymbol("CLET"), list(list(makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("RM-FORMULA"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("FORMULA"))))), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("FORMULA-ARG0"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("PronounFn")), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(EQ, list(makeSymbol("FORMULA-ARG1"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("FirstPerson-NLAttr")), list(EQ, list(makeSymbol("FORMULA-ARG2"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("Singular-NLAttr")), list(EQ, list(makeSymbol("FORMULA-ARG3"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("Ungendered-NLAttr")), list(makeSymbol("FORT-P"), makeSymbol("SPEAKER"))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-CONS"), makeSymbol("SPEAKER"), list(QUOTE, list(makeDouble(1.0)))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))), list(list(makeSymbol("CAND"), list(EQ, list(makeSymbol("FORMULA-ARG1"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("SecondPerson-NLAttr")), list(EQ, list(makeSymbol("FORMULA-ARG2"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("Singular-NLAttr")), list(EQ, list(makeSymbol("FORMULA-ARG3"), makeSymbol("RM-FORMULA")), reader_make_constant_shell("Ungendered-NLAttr"))), list(makeSymbol("CDOLIST"), list(makeSymbol("AUDIENCE-MEMBER"), makeSymbol("AUDIENCE")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-CONS"), makeSymbol("AUDIENCE-MEMBER"), list(QUOTE, list(makeDouble(1.0)))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("AVAILABLE-RM"), makeSymbol("AVAILABLE-RMS")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeSymbol("AVAILABLE-RM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RM"), list(QUOTE, makeSymbol("COREFERENCE-PROBABILITY")), makeSymbol("AVAILABLE-RM"))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("DEFINITE-RM"), makeSymbol("DEFINITE-RMS")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeSymbol("DEFINITE-RM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RM"), list(QUOTE, makeSymbol("COREFERENCE-PROBABILITY")), makeSymbol("DEFINITE-RM"))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))), list(makeSymbol("CLET"), list(list(makeSymbol("BACK-DRS"), NIL)), list(makeSymbol("PCOND"), list(makeSymbol("SUPER-DRS"), list(makeSymbol("CSETQ"), makeSymbol("BACK-DRS"), makeSymbol("SUPER-DRS"))), list(makeSymbol("PREV-DRS"), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("DEPTH"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("DEPTH"), list(makeSymbol("-"), makeSymbol("DEPTH"), ONE_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("BACK-DRS"), makeSymbol("PREV-DRS"))))), list(makeSymbol("PWHEN"), makeSymbol("BACK-DRS"), list(makeSymbol("CLET"), list(list(makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("BACK-DRS"), list(QUOTE, makeSymbol("FIND-POSSIBLE-RM-COREFERENCES")), makeSymbol("RM"), makeSymbol("DEPTH")))), list(makeSymbol("CDOLIST"), list(makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR"), makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIRS")), list(makeSymbol("CLET"), list(list(makeSymbol("POSSIBLE-RM"), list(makeSymbol("FIRST"), makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR"))), list(makeSymbol("POSSIBLE-RM-VALUE"), list(makeSymbol("SECOND"), makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR"))), list(makeSymbol("DEPTH-BIAS"), list(makeSymbol("NTH"), makeSymbol("DEPTH"), makeSymbol("*DRT-POSSIBLE-RM-COREFERENCES-PREV-DRS-BIASES*")))), list(makeSymbol("PUNLESS"), makeSymbol("DEPTH-BIAS"), list(makeSymbol("CSETQ"), makeSymbol("DEPTH-BIAS"), makeDouble(0.0))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeSymbol("POSSIBLE-RM"), list(makeSymbol("*"), makeSymbol("POSSIBLE-RM-VALUE"), makeSymbol("DEPTH-BIAS"))), makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))))))), list(RET, makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))));

    static private final SubLList $list_alt110 = list($TERM, makeKeyword("VAR"), makeKeyword("FORMULA"));

    static private final SubLList $list_alt116 = list(makeSymbol("TARGET"), makeSymbol("TARGET-TYPE"));

    static private final SubLList $list_alt117 = list(makeString("Finds an RM by looking at the slots of the RMs in DRS.  There are 4 methods to look for RMs: by the :term or :var assigned to the RM after processing, by the initial formula the RM was created from, and the :root ('root-term') of the formula the RM was created from.  Any combination of these may be specified.  If both :formula and :root are specified, we allow matching to the RMs :mapped-formula such that contained RMs of which are replaced by those RMs :root's.  Also, there is a hack in here to ignore differences in subcollection functions (see drt-corresponding-type-subcol-fn-3 above)."), list(makeSymbol("CLET"), list(list(makeSymbol("RM-RESULTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RM"), makeSymbol("RMS")), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $TERM, makeSymbol("TARGET-TYPE")), list(makeSymbol("PWHEN"), list(makeSymbol("EQUALS-EL?"), makeSymbol("TARGET"), list(makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TARGET-TERM"))))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("VAR"), makeSymbol("TARGET-TYPE")), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("TARGET"), list(makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("TARGET-VAR"))))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("FORMULA"), makeSymbol("TARGET-TYPE")), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("TARGET"), list(makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("FORMULA"))))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $ROOT, makeSymbol("TARGET-TYPE")), list(makeSymbol("PWHEN"), list(makeSymbol("EQUALS-EL?"), makeSymbol("TARGET"), list(makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("ROOT-TERM"))))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NULL"), makeSymbol("RM-RESULTS")), list(makeSymbol("MEMBER"), makeKeyword("FORMULA"), makeSymbol("TARGET-TYPE")), list(makeSymbol("MEMBER"), $ROOT, makeSymbol("TARGET-TYPE"))), list(makeSymbol("CLET"), list(list(makeSymbol("RM-UNMAPPED-FORMULA"), list(makeSymbol("TREE-GATHER-TRANSFORMATIONS"), list(makeSymbol("FUNCTION"), makeSymbol("DRS-RM-ROOT-TERM-METHOD")), list(makeSymbol("COPY-TREE"), list(makeSymbol("GET-SLOT"), makeSymbol("RM"), list(QUOTE, makeSymbol("MAPPED-FORMULA")))), list(makeSymbol("FUNCTION"), makeSymbol("RM-P"))))), list(makeSymbol("PWHEN"), list(makeSymbol("EQUALS-EL?"), list(makeSymbol("TREE-GATHER-TRANSFORMATIONS"), list(makeSymbol("FUNCTION"), makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3")), makeSymbol("TARGET"), list(makeSymbol("FUNCTION"), makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3"))), list(makeSymbol("TREE-GATHER-TRANSFORMATIONS"), list(makeSymbol("FUNCTION"), makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3")), makeSymbol("RM-UNMAPPED-FORMULA"), list(makeSymbol("FUNCTION"), makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3")))), list(makeSymbol("CPUSH"), makeSymbol("RM"), makeSymbol("RM-RESULTS")))))), list(makeSymbol("PUNLESS"), makeSymbol("RM-RESULTS"), list(makeSymbol("PWHEN"), makeSymbol("SUPER-DRS"), list(makeSymbol("CSETQ"), makeSymbol("RM-RESULTS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUPER-DRS"), list(QUOTE, makeSymbol("FIND-RM-BY-TARGET")), makeSymbol("TARGET"), makeSymbol("TARGET-TYPE"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("RM-RESULTS")), ONE_INTEGER), list(makeSymbol("CLET"), list(makeSymbol("NEW-RM-RESULTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RM-RESULT"), makeSymbol("RM-RESULTS")), list(makeSymbol("PUNLESS"), list(makeSymbol("TREE-FIND"), list(makeSymbol("GET-SLOT"), makeSymbol("RM-RESULT"), list(QUOTE, makeSymbol("FORMULA"))), makeSymbol("CYCL-FORMULAS"), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("CPUSH"), makeSymbol("RM-RESULT"), makeSymbol("NEW-RM-RESULTS")))), list(makeSymbol("PWHEN"), makeSymbol("NEW-RM-RESULTS"), list(makeSymbol("CSETQ"), makeSymbol("RM-RESULTS"), makeSymbol("NEW-RM-RESULTS")))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("RM-RESULTS")), ONE_INTEGER), list(makeSymbol("DRT-TRACE-PROGN"), FOUR_INTEGER, list(makeSymbol("DRT-WARN"), makeString("find-rm-by-target: ~A maps to multiple rms ~A~%"), makeSymbol("TARGET"), makeSymbol("RM-RESULTS"))))), list(RET, makeSymbol("RM-RESULTS"))));

    static private final SubLString $str_alt127$find_rm_by_target___A_maps_to_mul = makeString("find-rm-by-target: ~A maps to multiple rms ~A~%");

    static private final SubLList $list_alt132 = list(makeString("Constructs the CycL output that is ready to be predicate/term strengthened, etc. (i.e. it may still contain underpecified vocab)."), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL), list(makeSymbol("SCOPES"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("COMPLEX-CONDITIONS"), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEX-CONDITION"), makeSymbol("COMPLEX-CONDITIONS")), list(makeSymbol("CLET"), list(list(makeSymbol("CF-CYCL"), list(makeSymbol("DRT-COMPLEX-CONDITION-CONSTRUCT-CYCL"), makeSymbol("COMPLEX-CONDITION"), makeSymbol("INTERACTION-MT")))), list(makeSymbol("CPUSH"), makeSymbol("CF-CYCL"), makeSymbol("RESULT"))))), list(makeSymbol("PWHEN"), makeSymbol("SIMPLE-CONDITIONS"), list(makeSymbol("CLET"), list(list(makeSymbol("RELEVANT-RMS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-CONDITION"), makeSymbol("SIMPLE-CONDITIONS")), list(makeSymbol("CDOLIST"), list(makeSymbol("POSS-RELEVANT-RM"), list(makeSymbol("REMOVE-IF-NOT"), list(makeSymbol("FUNCTION"), makeSymbol("RM-P")), makeSymbol("SIMPLE-CONDITION"))), list(makeSymbol("CPUSHNEW"), makeSymbol("POSS-RELEVANT-RM"), makeSymbol("RELEVANT-RMS"))), list(makeSymbol("CPUSH"), list(makeSymbol("DRT-SIMPLE-CONDITION-CONSTRUCT-CYCL"), makeSymbol("SIMPLE-CONDITION")), makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("RELEVANT-RM"), makeSymbol("RELEVANT-RMS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("GET-SLOT"), makeSymbol("RELEVANT-RM"), list(QUOTE, makeSymbol("SCOPE"))), list(makeSymbol("CNOT"), list(EQ, reader_make_constant_shell("forAll"), list(makeSymbol("GET-SLOT"), makeSymbol("RELEVANT-RM"), list(QUOTE, makeSymbol("SCOPE")))))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), list(makeSymbol("GET-SLOT"), makeSymbol("RELEVANT-RM"), list(QUOTE, makeSymbol("SCOPE"))), list(makeSymbol("GET-SLOT"), makeSymbol("RELEVANT-RM"), list(QUOTE, makeSymbol("TARGET-VAR")))), makeSymbol("SCOPES")))))), list(makeSymbol("PIF"), list(makeSymbol("CDR"), makeSymbol("RESULT")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("BQ-CONS"), reader_make_constant_shell("and"), makeSymbol("RESULT"))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("CAR"), makeSymbol("RESULT")))), list(makeSymbol("CDOLIST"), list(makeSymbol("SCOPE"), makeSymbol("SCOPES")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("APPEND"), makeSymbol("SCOPE"), list(makeSymbol("LIST"), makeSymbol("RESULT"))))), list(makeSymbol("DRT-TRACE-PROGN"), TWO_INTEGER, list(makeSymbol("DRT-TRACE-OUT"), TWO_INTEGER, makeString("~%******************** FINAL CYCL FORMULA ********************~%")), list(makeSymbol("DRT-TRACE-OUT"), TWO_INTEGER, makeString("~A~%"), makeSymbol("RESULT"))), list(RET, makeSymbol("RESULT"))));

    static private final SubLString $str_alt134$_______________________FINAL_CYCL = makeString("~%******************** FINAL CYCL FORMULA ********************~%");

    static private final SubLString $str_alt135$_A__ = makeString("~A~%");

    @Override
    public void declareFunctions() {
        declare_drt_drs_file();
    }

    @Override
    public void initializeVariables() {
        init_drt_drs_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_drt_drs_file();
    }

    static {
    }
}

/**
 * Total time: 1068 ms
 */
