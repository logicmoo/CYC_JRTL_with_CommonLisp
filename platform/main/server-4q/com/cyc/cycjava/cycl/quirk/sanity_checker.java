package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.psp_main;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.reformulator_hub;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sanity_checker extends SubLTranslatedFile {
    public static final SubLFile me = new sanity_checker();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.sanity_checker";

    public static final String myFingerPrint = "3d57d79ef335aa0dc516f83c9c7da25a37caad135271772735a98db0b2192535";

    // defvar
    // Definitions
    private static final SubLSymbol $sanity_checker$ = makeSymbol("*SANITY-CHECKER*");

    // defvar
    private static final SubLSymbol $piquant_sanity_checkers$ = makeSymbol("*PIQUANT-SANITY-CHECKERS*");

    // defvar
    private static final SubLSymbol $scalar_checker_backchain$ = makeSymbol("*SCALAR-CHECKER-BACKCHAIN*");

    // Internal Constants
    public static final SubLSymbol SANITY_CHECKER = makeSymbol("SANITY-CHECKER");



    public static final SubLSymbol PIQUANT_SANITY_CHECKER = makeSymbol("PIQUANT-SANITY-CHECKER");



    public static final SubLSymbol CHECK = makeSymbol("CHECK");



    public static final SubLSymbol CHECK_CYC_INTERPRETATIONS = makeSymbol("CHECK-CYC-INTERPRETATIONS");



    public static final SubLSymbol PROPOSED_VALUE = makeSymbol("PROPOSED-VALUE");



    public static final SubLList $list10 = list(list(makeSymbol("CACHE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SCRATCHPAD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("FUDGE-FACTOR"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("SHOW-DEBUG-INFO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK"), list(makeSymbol("PREDICATE"), makeSymbol("FOCUS"), makeSymbol("ANSWER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-LISTIFIED"), list(makeSymbol("PREDICATE"), makeSymbol("FOCUS"), makeSymbol("ANSWER")), makeKeyword("PUBLIC")));







    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-CLASS");







    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-INSTANCE");



    public static final SubLList $list20 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list21 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("FUDGE-FACTOR"), ZERO_INTEGER), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");

    public static final SubLSymbol SANITY_CHECKER_INITIALIZE_METHOD = makeSymbol("SANITY-CHECKER-INITIALIZE-METHOD");

    public static final SubLList $list24 = list(list(makeSymbol("CSETQ"), makeSymbol("SHOW-DEBUG-INFO"), T), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");

    public static final SubLSymbol SANITY_CHECKER_SHOW_DEBUG_INFO_METHOD = makeSymbol("SANITY-CHECKER-SHOW-DEBUG-INFO-METHOD");

    public static final SubLSymbol HIDE_DEBUG_INFO = makeSymbol("HIDE-DEBUG-INFO");

    public static final SubLList $list28 = list(list(makeSymbol("CSETQ"), makeSymbol("SHOW-DEBUG-INFO"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");

    public static final SubLSymbol SANITY_CHECKER_DEBUG_INFO_METHOD = makeSymbol("SANITY-CHECKER-HIDE-DEBUG-INFO-METHOD");

    public static final SubLList $list31 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list32 = list(makeSymbol("PREDICATE"), makeSymbol("FOCUS"), makeSymbol("ANSWER"));

    public static final SubLList $list33 = list(list(makeSymbol("CSETQ"), makeSymbol("SCRATCHPAD"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-PREDICATE")), makeSymbol("PREDICATE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-FOCUS")), makeSymbol("FOCUS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-ANSWER")), makeSymbol("ANSWER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SLOT"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DEGENERATE-DIAGNOSIS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("INITIALIZE-CHECKERS")), makeSymbol("FUDGE-FACTOR")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DIAGNOSE")))), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("OUTPUT-DIAGNOSES"))))), list(makeSymbol("PWHEN"), makeSymbol("SHOW-DEBUG-INFO"), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), makeSymbol("RESULT")), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ITEM"), list(makeSymbol("QUOTE"), makeSymbol("PLISTIFY")))))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD = makeSymbol("SANITY-CHECKER-SCRATCHPAD");

    public static final SubLSymbol SET_PREDICATE = makeSymbol("SET-PREDICATE");

    public static final SubLSymbol SET_FOCUS = makeSymbol("SET-FOCUS");



    public static final SubLSymbol COMPUTE_DEGENERATE_DIAGNOSIS = makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS");



    public static final SubLSymbol INITIALIZE_CHECKERS = makeSymbol("INITIALIZE-CHECKERS");



    public static final SubLSymbol OUTPUT_DIAGNOSES = makeSymbol("OUTPUT-DIAGNOSES");

    public static final SubLString $str44$___S = makeString("~%~S");



    public static final SubLSymbol SANITY_CHECKER_CHECK_METHOD = makeSymbol("SANITY-CHECKER-CHECK-METHOD");

    public static final SubLList $list47 = list(makeSymbol("PREDICATE"), makeSymbol("CYC-INTERPRETATIONS"), makeSymbol("CYC-ANSWERS"));

    public static final SubLList $list48 = list(list(makeSymbol("CSETQ"), makeSymbol("SCRATCHPAD"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-PREDICATE")), makeSymbol("PREDICATE")), list(makeSymbol("SET-SLOT"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("CYC-FOCUSES")), makeSymbol("CYC-INTERPRETATIONS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-CYC-ANSWERS")), makeSymbol("CYC-ANSWERS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SLOT"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DEGENERATE-DIAGNOSIS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("INITIALIZE-CHECKERS")), makeSymbol("FUDGE-FACTOR")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DIAGNOSE")))), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("OUTPUT-DIAGNOSES"))))), list(makeSymbol("PWHEN"), makeSymbol("SHOW-DEBUG-INFO"), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), makeSymbol("RESULT")), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ITEM"), list(makeSymbol("QUOTE"), makeSymbol("PLISTIFY")))))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");



    public static final SubLSymbol SET_CYC_ANSWERS = makeSymbol("SET-CYC-ANSWERS");

    public static final SubLSymbol SANITY_CHECKER_CHECK_CYC_INTERPRETATIONS_METHOD = makeSymbol("SANITY-CHECKER-CHECK-CYC-INTERPRETATIONS-METHOD");

    public static final SubLSymbol CHECK_LISTIFIED = makeSymbol("CHECK-LISTIFIED");

    public static final SubLList $list54 = list(list(makeSymbol("CSETQ"), makeSymbol("SCRATCHPAD"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-PREDICATE")), makeSymbol("PREDICATE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-PIQUANT-FOCUS")), makeSymbol("FOCUS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-PIQUANT-ANSWER")), makeSymbol("ANSWER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SLOT"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DEGENERATE-DIAGNOSIS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("INITIALIZE-CHECKERS")), makeSymbol("FUDGE-FACTOR")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DIAGNOSE")))), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("OUTPUT-DIAGNOSES")))), makeSymbol("LISTIFIED-RESULT")), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), makeSymbol("RESULT")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ITEM"), list(makeSymbol("QUOTE"), makeSymbol("PLISTIFY"))), makeSymbol("LISTIFIED-RESULT"))), list(makeSymbol("PWHEN"), makeSymbol("SHOW-DEBUG-INFO"), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), makeSymbol("LISTIFIED-RESULT")), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%~S"), makeSymbol("ITEM")))), list(makeSymbol("RET"), makeSymbol("LISTIFIED-RESULT"))));

    public static final SubLSymbol $sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");

    public static final SubLSymbol SET_PIQUANT_FOCUS = makeSymbol("SET-PIQUANT-FOCUS");

    public static final SubLSymbol SET_PIQUANT_ANSWER = makeSymbol("SET-PIQUANT-ANSWER");

    public static final SubLSymbol SANITY_CHECKER_CHECK_LISTIFIED_METHOD = makeSymbol("SANITY-CHECKER-CHECK-LISTIFIED-METHOD");



    public static final SubLList $list60 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK"), list(makeSymbol("PIQUANT-PREDICATE"), makeSymbol("PIQUANT-FOCUS"), makeSymbol("PIQUANT-ANSWER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-LISTIFIED"), list(makeSymbol("PREDICATE"), makeSymbol("FOCUS"), makeSymbol("ANSWER")), makeKeyword("PUBLIC")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-INSTANCE");

    public static final SubLList $list63 = list(makeSymbol("PIQUANT-PREDICATE"), makeSymbol("PIQUANT-FOCUS"), makeSymbol("PIQUANT-ANSWER"));

    public static final SubLList $list64 = list(list(makeSymbol("CSETQ"), makeSymbol("SCRATCHPAD"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-PIQUANT-PREDICATE")), makeSymbol("PIQUANT-PREDICATE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-PIQUANT-FOCUS")), makeSymbol("PIQUANT-FOCUS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-ANSWER")), makeSymbol("PIQUANT-ANSWER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SLOT"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DEGENERATE-DIAGNOSIS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("INITIALIZE-CHECKERS")), makeSymbol("FUDGE-FACTOR")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DIAGNOSE")))), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("OUTPUT-DIAGNOSES"))))), list(makeSymbol("PWHEN"), makeSymbol("SHOW-DEBUG-INFO"), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), makeSymbol("RESULT")), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ITEM"), list(makeSymbol("QUOTE"), makeSymbol("PLISTIFY")))))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PIQUANT-SANITY-CHECKER-METHOD");

    public static final SubLSymbol SET_PIQUANT_PREDICATE = makeSymbol("SET-PIQUANT-PREDICATE");

    public static final SubLSymbol PIQUANT_SANITY_CHECKER_CHECK_METHOD = makeSymbol("PIQUANT-SANITY-CHECKER-CHECK-METHOD");

    public static final SubLList $list68 = list(list(makeSymbol("CSETQ"), makeSymbol("SCRATCHPAD"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-PIQUANT-PREDICATE")), makeSymbol("PIQUANT-PREDICATE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-PIQUANT-FOCUS")), makeSymbol("PIQUANT-FOCUS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("SET-ANSWER")), makeSymbol("PIQUANT-ANSWER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SLOT"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DEGENERATE-DIAGNOSIS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("INITIALIZE-CHECKERS")), makeSymbol("FUDGE-FACTOR")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("DIAGNOSE")))), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SCRATCHPAD"), list(makeSymbol("QUOTE"), makeSymbol("OUTPUT-DIAGNOSES")))), makeSymbol("LISTIFIED-RESULT")), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), makeSymbol("RESULT")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ITEM"), list(makeSymbol("QUOTE"), makeSymbol("PLISTIFY"))), makeSymbol("LISTIFIED-RESULT"))), list(makeSymbol("PWHEN"), makeSymbol("SHOW-DEBUG-INFO"), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), makeSymbol("LISTIFIED-RESULT")), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%~S"), makeSymbol("ITEM")))), list(makeSymbol("RET"), makeSymbol("LISTIFIED-RESULT"))));

    public static final SubLSymbol $sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PIQUANT-SANITY-CHECKER-METHOD");

    public static final SubLSymbol PIQUANT_SANITY_CHECKER_CHECK_LISTIFIED_METHOD = makeSymbol("PIQUANT-SANITY-CHECKER-CHECK-LISTIFIED-METHOD");

    public static final SubLList $list71 = list(new SubLObject[]{ list(makeSymbol("PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("FOCUS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("CYC-FOCUSES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("ANSWER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("CYC-ANSWERS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("CHECKERS-POOL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEGENERATE-DIAGNOSIS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("INITIALIZE-CHECKERS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FOCUS"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PIQUANT-FOCUS"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PREDICATE"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PIQUANT-PREDICATE"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ANSWER"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DIAGNOSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OUTPUT-DIAGNOSES"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLSymbol CHECKERS_POOL = makeSymbol("CHECKERS-POOL");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-CLASS");









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-INSTANCE");

    public static final SubLList $list79 = list(list(makeSymbol("PIF"), makeSymbol("DEGENERATE-DIAGNOSIS"), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("DEGENERATE-DIAGNOSIS"))), list(makeSymbol("CLET"), list(makeSymbol("DIAGNOSES")), list(makeSymbol("CDOLIST"), list(makeSymbol("CHECKER"), makeSymbol("CHECKERS-POOL")), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("CHECKER"), list(makeSymbol("QUOTE"), makeSymbol("DIAGNOSIS"))), makeSymbol("DIAGNOSES"))), list(makeSymbol("RET"), makeSymbol("DIAGNOSES")))));

    public static final SubLSymbol $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");



    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_OUTPUT_DIAGNOSES_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-OUTPUT-DIAGNOSES-METHOD");

    public static final SubLList $list83 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_INITIALIZE_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-INITIALIZE-METHOD");

    public static final SubLList $list85 = list(makeSymbol("STRING"));

    public static final SubLList $list86 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("FOCUS"), makeSymbol("STRING")), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("PS-GET-CYCLS-FOR-NP"), makeSymbol("STRING"))), list(makeSymbol("CLET"), list(list(makeSymbol("REFORMULATED"), list(makeSymbol("REFORMULATE-CYCL"), makeSymbol("DENOT")))), list(makeSymbol("PWHEN"), makeSymbol("REFORMULATED"), list(makeSymbol("CPUSHNEW"), makeSymbol("REFORMULATED"), makeSymbol("CYC-FOCUSES"), list(makeSymbol("FUNCTION"), EQUAL))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_SET_FOCUS_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-FOCUS-METHOD");

    public static final SubLList $list89 = list(makeSymbol("FOCUS-STRING"));

    public static final SubLList $list90 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("FOCUS-STRING"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("DENOTATIONS"), list(makeSymbol("FWHEN"), list(makeSymbol("STARTS-WITH"), makeSymbol("FOCUS-STRING"), makeString("#$")), list(makeSymbol("LIST"), list(makeSymbol("FIND-CONSTANT"), list(makeSymbol("PRE-REMOVE"), makeSymbol("FOCUS-STRING"), makeString("#$"))))))), list(makeSymbol("PWHEN"), makeSymbol("DENOTATIONS"), list(makeSymbol("CSETQ"), makeSymbol("FOCUS"), makeSymbol("FOCUS-STRING")), list(makeSymbol("CSETQ"), makeSymbol("CYC-FOCUSES"), makeSymbol("DENOTATIONS")), list(makeSymbol("RET"), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("GURUQA-OBJECT"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("GURUQA-OBJECT")), list(makeSymbol("QUOTE"), makeSymbol("GURUQA-PARSE-PRECISE")), makeSymbol("FOCUS-STRING")))), list(makeSymbol("CSETQ"), makeSymbol("FOCUS"), makeSymbol("GURUQA-OBJECT")), list(makeSymbol("PWHEN"), makeSymbol("GURUQA-OBJECT"), list(makeSymbol("CSETQ"), makeSymbol("CYC-FOCUSES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GURUQA-OBJECT"), list(makeSymbol("QUOTE"), makeSymbol("DENOTATIONS"))))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");

    public static final SubLString $str92$__ = makeString("#$");

    public static final SubLSymbol GURUQA_OBJECT = makeSymbol("GURUQA-OBJECT");

    public static final SubLSymbol GURUQA_PARSE_PRECISE = makeSymbol("GURUQA-PARSE-PRECISE");

    public static final SubLSymbol DENOTATIONS = makeSymbol("DENOTATIONS");

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_FOCUS_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-FOCUS-METHOD");

    public static final SubLList $list97 = list(makeSymbol("CYC-PREDICATE"));

    public static final SubLList $list98 = list(list(makeSymbol("PIF"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("CYC-PREDICATE"), reader_make_constant_shell(makeString("BinaryPredicate"))), list(makeSymbol("CSETQ"), makeSymbol("PREDICATE"), makeSymbol("CYC-PREDICATE")), list(makeSymbol("WARN"), makeString("~%~S is not a binary predicate."), makeSymbol("CYC-PREDICATE"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");

    private static final SubLObject $$BinaryPredicate = reader_make_constant_shell(makeString("BinaryPredicate"));

    public static final SubLString $str101$___S_is_not_a_binary_predicate_ = makeString("~%~S is not a binary predicate.");

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_SET_PREDICATE_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-PREDICATE-METHOD");

    public static final SubLList $list103 = list(makeSymbol("PIQUANT-PREDICATE"));

    public static final SubLList $list104 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CYC-PREDICATE"), list(makeSymbol("FIND-CONSTANT"), makeSymbol("PIQUANT-PREDICATE")))), list(makeSymbol("PIF"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("CYC-PREDICATE"), reader_make_constant_shell(makeString("BinaryPredicate"))), list(makeSymbol("CSETQ"), makeSymbol("PREDICATE"), makeSymbol("CYC-PREDICATE")), list(makeSymbol("WARN"), makeString("~%~S is not a binary predicate."), makeSymbol("PIQUANT-PREDICATE"))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_PREDICATE_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-PREDICATE-METHOD");

    public static final SubLList $list107 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), makeSymbol("STRING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-CYC-ANSWERS")), makeSymbol("STRING")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");

    public static final SubLSymbol COMPUTE_CYC_ANSWERS = makeSymbol("COMPUTE-CYC-ANSWERS");

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_SET_ANSWER_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-ANSWER-METHOD");

    public static final SubLList $list111 = list(makeSymbol("CYC-CANDIDATE-ANSWERS"));

    public static final SubLList $list112 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("CYC-CANDIDATE-ANSWERS")), list(makeSymbol("PIF"), list(makeSymbol("EL-FORT-P"), makeSymbol("ANSWER")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("CYC-ANSWERS")), list(makeSymbol("PWHEN"), list(makeSymbol("NUMBERP"), makeSymbol("ANSWER")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("Unity")), makeSymbol("ANSWER")), makeSymbol("CYC-ANSWERS"))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");

    private static final SubLObject $$Unity = reader_make_constant_shell(makeString("Unity"));

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_SET_CYC_ANSWERS_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-CYC-ANSWERS-METHOD");

    public static final SubLList $list116 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list117 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-DENOTS"), list(makeSymbol("PS-GET-CYCLS-FOR-NP"), makeSymbol("STRING"))), makeSymbol("GOOD-DENOTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), makeSymbol("ALL-DENOTS")), list(makeSymbol("PIF"), list(makeSymbol("EL-FORT-P"), makeSymbol("DENOT")), list(makeSymbol("CLET"), list(list(makeSymbol("REFORMULATED"), list(makeSymbol("REFORMULATE-CYCL"), makeSymbol("DENOT"))), makeSymbol("WFT")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CSETQ"), makeSymbol("WFT"), list(makeSymbol("EL-WFT?"), makeSymbol("DENOT")))), list(makeSymbol("PWHEN"), makeSymbol("WFT"), list(makeSymbol("CPUSHNEW"), makeSymbol("REFORMULATED"), makeSymbol("GOOD-DENOTS"), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("PWHEN"), list(makeSymbol("NUMBERP"), makeSymbol("DENOT")), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("Unity")), makeSymbol("DENOT")), makeSymbol("GOOD-DENOTS"))))), list(makeSymbol("CSETQ"), makeSymbol("CYC-ANSWERS"), makeSymbol("GOOD-DENOTS")), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_COMPUTE_CYC_ANSWERS_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-COMPUTE-CYC-ANSWERS-METHOD");

    public static final SubLList $list122 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DIAGNOSIS"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SANITY-CHECKER-DIAGNOSIS")))), list(makeSymbol("BASIS"), ZERO_INTEGER)), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("PREDICATE")), list(makeSymbol("CINC"), makeSymbol("BASIS"), makeInteger(100))), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("CYC-FOCUSES")), list(makeSymbol("CINC"), makeSymbol("BASIS"), TEN_INTEGER)), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("CYC-ANSWERS")), list(makeSymbol("CINC"), makeSymbol("BASIS"), ONE_INTEGER)), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("BASIS"), ZERO_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGNOSIS"), list(makeSymbol("QUOTE"), makeSymbol("FAILURE-CODE")), makeSymbol("BASIS")), list(makeSymbol("CSETQ"), makeSymbol("DEGENERATE-DIAGNOSIS"), makeSymbol("DIAGNOSIS"))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");

    public static final SubLSymbol SANITY_CHECKER_DIAGNOSIS = makeSymbol("SANITY-CHECKER-DIAGNOSIS");



    public static final SubLSymbol FAILURE_CODE = makeSymbol("FAILURE-CODE");

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_COMPUTE_DEGENERATE_DIAGNOSIS_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-COMPUTE-DEGENERATE-DIAGNOSIS-METHOD");

    public static final SubLList $list128 = list(makeSymbol("FUDGE-FACTOR"));

    public static final SubLList $list129 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PRED-ARG1-SET"), list(makeSymbol("PRED-VALUES-IN-ANY-MT"), makeSymbol("PREDICATE"), reader_make_constant_shell(makeString("arg1Isa")), ONE_INTEGER, TWO_INTEGER)), list(makeSymbol("PRED-ARG2-SET"), list(makeSymbol("PRED-VALUES-IN-ANY-MT"), makeSymbol("PREDICATE"), reader_make_constant_shell(makeString("arg2Isa")), ONE_INTEGER, TWO_INTEGER)), makeSymbol("GOOD-ARG1S"), makeSymbol("GOOD-ARG2S")), list(makeSymbol("CDOLIST"), list(makeSymbol("ARG"), makeSymbol("CYC-FOCUSES")), list(makeSymbol("CLET"), list(makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("ARG1"), makeSymbol("PRED-ARG1-SET"), makeSymbol("FAIL")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("ARG"), makeSymbol("ARG1")), list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("ARG"), makeSymbol("ARG1"))), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), T))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSHNEW"), makeSymbol("ARG"), makeSymbol("GOOD-ARG1S"), list(makeSymbol("FUNCTION"), EQUAL))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ARG"), makeSymbol("CYC-ANSWERS")), list(makeSymbol("CLET"), list(makeSymbol("FAIL"), makeSymbol("CAST")), list(makeSymbol("CSOME"), list(makeSymbol("ARG2"), makeSymbol("PRED-ARG2-SET"), makeSymbol("FAIL")), list(makeSymbol("CSETQ"), makeSymbol("CAST"), list(makeSymbol("HEURISTICALLY-CAST-UNITY"), makeSymbol("PREDICATE"), makeSymbol("ARG"))), list(makeSymbol("PIF"), list(makeSymbol("EL-FORT-P"), makeSymbol("CAST")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(makeSymbol("CNOT"), list(makeSymbol("COR"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("CAST"), makeSymbol("ARG2")), list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("ARG"), makeSymbol("ARG2"))))), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(makeSymbol("CNOT"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("CAST")), list(makeSymbol("PLUSP"), makeSymbol("CAST"))))))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSHNEW"), makeSymbol("CAST"), makeSymbol("GOOD-ARG2S"), list(makeSymbol("FUNCTION"), EQUAL))))), list(makeSymbol("CDOLIST"), list(makeSymbol("GOOD-ARG1"), makeSymbol("GOOD-ARG1S")), list(makeSymbol("CDOLIST"), list(makeSymbol("GOOD-ARG2"), makeSymbol("GOOD-ARG2S")), list(makeSymbol("CLET"), list(list(makeSymbol("CHECKER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SCALAR-CHECKER"))))), list(makeSymbol("SET-SLOT"), makeSymbol("CHECKER"), list(makeSymbol("QUOTE"), makeSymbol("FUDGE-FACTOR")), makeSymbol("FUDGE-FACTOR")), list(makeSymbol("SET-SLOT"), makeSymbol("CHECKER"), list(makeSymbol("QUOTE"), makeSymbol("PREDICATE")), makeSymbol("PREDICATE")), list(makeSymbol("SET-SLOT"), makeSymbol("CHECKER"), list(makeSymbol("QUOTE"), makeSymbol("ARG1")), makeSymbol("GOOD-ARG1")), list(makeSymbol("SET-SLOT"), makeSymbol("CHECKER"), list(makeSymbol("QUOTE"), makeSymbol("ARG2")), makeSymbol("GOOD-ARG2")), list(makeSymbol("CPUSH"), makeSymbol("CHECKER"), makeSymbol("CHECKERS-POOL"))))), list(makeSymbol("PUNLESS"), makeSymbol("CHECKERS-POOL"), list(makeSymbol("CLET"), list(list(makeSymbol("DIAGNOSIS"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SANITY-CHECKER-DIAGNOSIS"))))), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGNOSIS"), list(makeSymbol("QUOTE"), makeSymbol("FAILURE-CODE")), makeInteger(1000)), list(makeSymbol("CSETQ"), makeSymbol("DEGENERATE-DIAGNOSIS"), makeSymbol("DIAGNOSIS")))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");

    private static final SubLObject $$arg1Isa = reader_make_constant_shell(makeString("arg1Isa"));

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));

    public static final SubLSymbol SCALAR_CHECKER = makeSymbol("SCALAR-CHECKER");







    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_INITIALIZE_CHECKERS_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-INITIALIZE-CHECKERS-METHOD");

    public static final SubLList $list138 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("CHECKER"), makeSymbol("CHECKERS-POOL")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CHECKER"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-RANGE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CHECKER"), list(makeSymbol("QUOTE"), makeSymbol("DIAGNOSE")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");

    public static final SubLSymbol COMPUTE_RANGE = makeSymbol("COMPUTE-RANGE");

    public static final SubLSymbol SANITY_CHECKER_SCRATCHPAD_DIAGNOSE_METHOD = makeSymbol("SANITY-CHECKER-SCRATCHPAD-DIAGNOSE-METHOD");



    public static final SubLList $list143 = list(new SubLObject[]{ list(makeSymbol("FUDGE-FACTOR"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DIAGNOSIS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("BACKCHAIN"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("ARG1"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("ARG2"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("ARG2RANGE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-RANGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")) });



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-CLASS");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-INSTANCE");

    public static final SubLList $list148 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("BACKCHAIN"), makeSymbol("*SCALAR-CHECKER-BACKCHAIN*")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-CHECKER-METHOD");

    public static final SubLSymbol SCALAR_CHECKER_INITIALIZE_METHOD = makeSymbol("SCALAR-CHECKER-INITIALIZE-METHOD");

    public static final SubLList $list151 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ARG"), list(makeSymbol("TYPESHIFT-ARGUMENT"), makeSymbol("ARG1"))), list(makeSymbol("QUERY"), list(makeSymbol("BQ-LIST*"), makeSymbol("PREDICATE"), makeSymbol("ARG"), list(makeSymbol("QUOTE"), list(makeSymbol("?RANGE"))))), list(makeSymbol("ANSWERS"), list(makeSymbol("ASK-TEMPLATE"), list(makeSymbol("QUOTE"), makeSymbol("?RANGE")), makeSymbol("QUERY"), reader_make_constant_shell(makeString("EverythingPSC")), makeSymbol("BACKCHAIN"))), list(makeSymbol("TO-MERGE"), makeSymbol("ANSWERS")), makeSymbol("RANGE")), list(makeSymbol("CSOME"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS"), makeSymbol("RANGE")), list(makeSymbol("CLET"), list(list(makeSymbol("CANDIDATE-RANGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SCALAR-RANGE"))))), list(makeSymbol("FIM"), makeSymbol("CANDIDATE-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("FILL")), makeSymbol("ANSWER")), list(makeSymbol("CSETQ"), makeSymbol("TO-MERGE"), list(makeSymbol("CDR"), makeSymbol("TO-MERGE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("CSETQ"), makeSymbol("RANGE"), makeSymbol("CANDIDATE-RANGE"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("TO-MERGE")), list(makeSymbol("PWHEN"), makeSymbol("RANGE"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-RANGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SCALAR-RANGE"))))), list(makeSymbol("FIM"), makeSymbol("NEW-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("FILL")), makeSymbol("ANSWER")), list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("NEW-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("CSETQ"), makeSymbol("RANGE"), list(makeSymbol("FIM"), makeSymbol("RANGE"), list(makeSymbol("QUOTE"), makeSymbol("MERGE")), makeSymbol("NEW-RANGE"))))))), list(makeSymbol("PWHEN"), makeSymbol("RANGE"), list(makeSymbol("FIM"), makeSymbol("RANGE"), list(makeSymbol("QUOTE"), makeSymbol("FUDGE")), makeSymbol("FUDGE-FACTOR")), list(makeSymbol("CSETQ"), makeSymbol("ARG2RANGE"), makeSymbol("RANGE"))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-CHECKER-METHOD");

    public static final SubLList $list153 = list(makeSymbol("?RANGE"));

    public static final SubLSymbol $sym154$_RANGE = makeSymbol("?RANGE");

    public static final SubLSymbol SCALAR_RANGE = makeSymbol("SCALAR-RANGE");





    public static final SubLSymbol MERGE = makeSymbol("MERGE");

    public static final SubLSymbol FUDGE = makeSymbol("FUDGE");

    public static final SubLSymbol SCALAR_CHECKER_COMPUTE_RANGE_METHOD = makeSymbol("SCALAR-CHECKER-COMPUTE-RANGE-METHOD");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));

    public static final SubLList $list163 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DIAGN"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SANITY-CHECKER-DIAGNOSIS")))), list(makeSymbol("CAST"), list(makeSymbol("HEURISTICALLY-CAST-UNITY"), makeSymbol("PREDICATE"), makeSymbol("ARG2"))), list(makeSymbol("ARG2MIN"), list(makeSymbol("FWHEN"), makeSymbol("ARG2RANGE"), list(makeSymbol("FIM"), makeSymbol("ARG2RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MIN"))))), list(makeSymbol("ARG2MAX"), list(makeSymbol("FWHEN"), makeSymbol("ARG2RANGE"), list(makeSymbol("FIM"), makeSymbol("ARG2RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MAX"))))), list(makeSymbol("RANGE"), list(makeSymbol("FWHEN"), makeSymbol("ARG2RANGE"), list(makeSymbol("FIM"), makeSymbol("ARG2RANGE"), list(makeSymbol("QUOTE"), makeSymbol("LISTIFY"))))), makeSymbol("CYCL-EXPLANATION")), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("PREDICATE")), makeSymbol("PREDICATE")), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("PROPOSED-ARG")), makeSymbol("ARG1")), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("PROPOSED-VALUE")), makeSymbol("ARG2")), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), makeSymbol("ARG2MIN"), makeSymbol("ARG2MAX")), list(makeSymbol("CLET"), list(list(makeSymbol("NEGATIVE-TEST-MIN"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("lessThan")), makeSymbol("CAST"), makeSymbol("ARG2MIN"))), list(makeSymbol("NEGATIVE-TEST-MAX"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("greaterThan")), makeSymbol("CAST"), makeSymbol("ARG2MAX"))), list(makeSymbol("POSITIVE-TEST"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("quantitySubsumes")), makeSymbol("RANGE"), makeSymbol("CAST")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NEW-CYC-QUERY"), makeSymbol("NEGATIVE-TEST-MIN"), reader_make_constant_shell(makeString("EverythingPSC"))), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("COMPLETE")), ONE_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER-KNOWN")), ONE_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER")), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CYCL-EXPLANATION"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("BQ-LIST"), makeSymbol("PREDICATE"), makeSymbol("ARG1"), makeSymbol("RANGE")), makeSymbol("NEGATIVE-TEST-MIN")))), list(list(makeSymbol("NEW-CYC-QUERY"), makeSymbol("NEGATIVE-TEST-MAX"), reader_make_constant_shell(makeString("EverythingPSC"))), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("COMPLETE")), ONE_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER-KNOWN")), ONE_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER")), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CYCL-EXPLANATION"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("BQ-LIST"), makeSymbol("PREDICATE"), makeSymbol("ARG1"), makeSymbol("RANGE")), makeSymbol("NEGATIVE-TEST-MAX")))), list(list(makeSymbol("NEW-CYC-QUERY"), makeSymbol("POSITIVE-TEST"), reader_make_constant_shell(makeString("EverythingPSC"))), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("COMPLETE")), ONE_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER-KNOWN")), ONE_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER")), ONE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CYCL-EXPLANATION"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("BQ-LIST"), makeSymbol("PREDICATE"), makeSymbol("ARG1"), makeSymbol("RANGE")), makeSymbol("POSITIVE-TEST")))))), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("JUSTIFICATION")), list(makeSymbol("GENERATE-PHRASE"), makeSymbol("CYCL-EXPLANATION")))), list(T, list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("COMPLETE")), ONE_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER-KNOWN")), ZERO_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER")), ZERO_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("DIAGN"), list(makeSymbol("QUOTE"), makeSymbol("JUSTIFICATION")), makeString("No information available")))), list(makeSymbol("CSETQ"), makeSymbol("DIAGNOSIS"), makeSymbol("DIAGN")), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-CHECKER-METHOD");

    public static final SubLSymbol GET_MIN = makeSymbol("GET-MIN");

    public static final SubLSymbol GET_MAX = makeSymbol("GET-MAX");



    public static final SubLSymbol PROPOSED_ARG = makeSymbol("PROPOSED-ARG");

    private static final SubLObject $$lessThan = reader_make_constant_shell(makeString("lessThan"));

    private static final SubLObject $$greaterThan = reader_make_constant_shell(makeString("greaterThan"));

    private static final SubLObject $$quantitySubsumes = reader_make_constant_shell(makeString("quantitySubsumes"));

    public static final SubLSymbol COMPLETE = makeSymbol("COMPLETE");

    public static final SubLSymbol ANSWER_KNOWN = makeSymbol("ANSWER-KNOWN");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));



    public static final SubLString $$$No_information_available = makeString("No information available");

    public static final SubLSymbol SCALAR_CHECKER_DIAGNOSE_METHOD = makeSymbol("SCALAR-CHECKER-DIAGNOSE-METHOD");

    public static final SubLList $list178 = list(new SubLObject[]{ list(makeSymbol("FAILURE-CODE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC"), makeKeyword("ESSENTIAL")), list(makeSymbol("COMPLETE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC"), makeKeyword("ESSENTIAL")), list(makeSymbol("ANSWER-KNOWN"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC"), makeKeyword("ESSENTIAL")), list(makeSymbol("ANSWER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC"), makeKeyword("ESSENTIAL")), list(makeSymbol("JUSTIFICATION"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC"), makeKeyword("ESSENTIAL")), list(makeSymbol("PROPOSED-VALUE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC"), makeKeyword("ESSENTIAL")), list(makeSymbol("PROPOSED-ARG"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC"), makeKeyword("ESSENTIAL")), list(makeSymbol("PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC"), makeKeyword("ESSENTIAL")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BOOLEAN"), NIL, makeKeyword("PROTECTED")) });

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-INSTANCE");

    public static final SubLList $list181 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("FAILURE-CODE"), ZERO_INTEGER), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-DIAGNOSIS-METHOD");

    public static final SubLSymbol SANITY_CHECKER_DIAGNOSIS_INITIALIZE_METHOD = makeSymbol("SANITY-CHECKER-DIAGNOSIS-INITIALIZE-METHOD");

    public static final SubLList $list184 = list(makeString("A yes-or-no answer as to whether the diagnosis is favorable (T) or\n   unfavorable (NIL)."), list(makeSymbol("PUNLESS"), list(makeSymbol("INTEGERP"), makeSymbol("ANSWER")), list(makeSymbol("RET"), NIL)), list(makeSymbol("RET"), list(makeSymbol(">"), makeSymbol("ANSWER"), ZERO_INTEGER)));

    public static final SubLSymbol $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-DIAGNOSIS-METHOD");

    public static final SubLSymbol SANITY_CHECKER_DIAGNOSIS_BOOLEAN_METHOD = makeSymbol("SANITY-CHECKER-DIAGNOSIS-BOOLEAN-METHOD");

    public static final SubLList $list187 = list(new SubLObject[]{ list(makeSymbol("UNIT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MIN"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MAX"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("POINT-INFO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FILL"), list(makeSymbol("VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNIT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MIN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MAX"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MIN-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MAX-VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LISTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MERGE"), list(makeSymbol("OTHER-RANGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MERGE-LOOSE"), list(makeSymbol("OTHER-RANGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MERGE-STRICT"), list(makeSymbol("OTHER-RANGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FUDGE"), list(makeSymbol("FUDGE-FACTOR")), makeKeyword("PUBLIC")) });









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-INSTANCE");



    public static final SubLList $list195 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list196 = list(makeString("Prints SCALAR-RANGE to STREAM, ignoring depth"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PRINC"), list(makeSymbol("LIST"), makeSymbol("UNIT"), makeSymbol("MIN"), makeSymbol("MAX"), makeSymbol("POINT-INFO")), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_PRINT_METHOD = makeSymbol("SCALAR-RANGE-PRINT-METHOD");

    public static final SubLList $list199 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("UNIT"), reader_make_constant_shell(makeString("Unity"))), list(makeSymbol("CSETQ"), makeSymbol("MIN"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("MAX"), ZERO_INTEGER), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_INITIALIZE_METHOD = makeSymbol("SCALAR-RANGE-INITIALIZE-METHOD");

    public static final SubLList $list202 = list(list(makeSymbol("RET"), list(makeSymbol("CAND"), list(EQL, makeSymbol("UNIT"), reader_make_constant_shell(makeString("Unity"))), list(makeSymbol("="), makeSymbol("MIN"), ZERO_INTEGER), list(makeSymbol("="), makeSymbol("MAX"), ZERO_INTEGER))));

    public static final SubLSymbol $sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_EMPTY_P_METHOD = makeSymbol("SCALAR-RANGE-EMPTY-P-METHOD");

    public static final SubLList $list205 = list(makeSymbol("VALUE"));

    public static final SubLList $list206 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("NEW-CYC-QUERY"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell(makeString("isa")), makeSymbol("VALUE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("NonNegativeScalarInterval"))))), reader_make_constant_shell(makeString("BaseKB"))), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("PCOND"), list(list(makeSymbol("NUMBERP"), makeSymbol("VALUE")), list(makeSymbol("CSETQ"), makeSymbol("MIN"), makeSymbol("VALUE")), list(makeSymbol("CSETQ"), makeSymbol("MAX"), makeSymbol("VALUE")), list(makeSymbol("CSETQ"), makeSymbol("POINT-INFO"), T)), list(list(makeSymbol("CONSP"), makeSymbol("VALUE")), list(makeSymbol("CLET"), list(list(makeSymbol("VALUE-UNIT"), list(makeSymbol("FIRST"), makeSymbol("VALUE"))), list(makeSymbol("VALUE-MIN"), list(makeSymbol("SECOND"), makeSymbol("VALUE"))), list(makeSymbol("VALUE-MAX"), list(makeSymbol("THIRD"), makeSymbol("VALUE"))), makeSymbol("NEW-UNIT"), makeSymbol("NEW-MIN"), makeSymbol("NEW-MAX")), list(makeSymbol("PWHEN"), list(makeSymbol("ISA?"), makeSymbol("VALUE-UNIT"), reader_make_constant_shell(makeString("UnitOfMeasure"))), list(makeSymbol("CSETQ"), makeSymbol("NEW-UNIT"), makeSymbol("VALUE-UNIT"))), list(makeSymbol("PWHEN"), list(makeSymbol("NUMBERP"), makeSymbol("VALUE-MIN")), list(makeSymbol("CSETQ"), makeSymbol("NEW-MIN"), makeSymbol("VALUE-MIN"))), list(makeSymbol("PIF"), list(makeSymbol("NUMBERP"), makeSymbol("VALUE-MAX")), list(makeSymbol("CSETQ"), makeSymbol("NEW-MAX"), makeSymbol("VALUE-MAX")), list(makeSymbol("CSETQ"), makeSymbol("NEW-MAX"), makeSymbol("NEW-MIN"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("NEW-UNIT"), makeSymbol("NEW-MIN"), makeSymbol("NEW-MAX")), list(makeSymbol("CSETQ"), makeSymbol("UNIT"), makeSymbol("NEW-UNIT")), list(makeSymbol("CSETQ"), makeSymbol("MIN"), makeSymbol("NEW-MIN")), list(makeSymbol("CSETQ"), makeSymbol("MAX"), makeSymbol("NEW-MAX"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("NEW-MIN"), makeSymbol("NEW-MAX")), list(makeSymbol("CSETQ"), makeSymbol("POINT-INFO"), T))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list209 = list(reader_make_constant_shell(makeString("NonNegativeScalarInterval")));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $$UnitOfMeasure = reader_make_constant_shell(makeString("UnitOfMeasure"));

    public static final SubLSymbol SCALAR_RANGE_FILL_METHOD = makeSymbol("SCALAR-RANGE-FILL-METHOD");

    public static final SubLSymbol GET_UNIT = makeSymbol("GET-UNIT");

    public static final SubLList $list214 = list(list(makeSymbol("RET"), makeSymbol("UNIT")));

    public static final SubLSymbol $sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_GET_UNIT_METHOD = makeSymbol("SCALAR-RANGE-GET-UNIT-METHOD");

    public static final SubLList $list217 = list(list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("RET"), NIL), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("UNIT"), makeSymbol("MIN")))));

    public static final SubLSymbol $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_GET_MIN_METHOD = makeSymbol("SCALAR-RANGE-GET-MIN-METHOD");

    public static final SubLSymbol GET_MIN_VALUE = makeSymbol("GET-MIN-VALUE");

    public static final SubLList $list221 = list(list(makeSymbol("RET"), makeSymbol("MIN")));

    public static final SubLSymbol $sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_GET_MIN_VALUE_METHOD = makeSymbol("SCALAR-RANGE-GET-MIN-VALUE-METHOD");

    public static final SubLList $list224 = list(list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("RET"), NIL), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("UNIT"), makeSymbol("MAX")))));

    public static final SubLSymbol $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_GET_MAX_METHOD = makeSymbol("SCALAR-RANGE-GET-MAX-METHOD");

    public static final SubLSymbol GET_MAX_VALUE = makeSymbol("GET-MAX-VALUE");

    public static final SubLList $list228 = list(list(makeSymbol("RET"), makeSymbol("MAX")));

    public static final SubLSymbol $sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_GET_MAX_VALUE_METHOD = makeSymbol("SCALAR-RANGE-GET-MAX-VALUE-METHOD");

    public static final SubLList $list231 = list(list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("UNIT"), makeSymbol("MIN"), makeSymbol("MAX"))));

    public static final SubLSymbol $sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_LISTIFY_METHOD = makeSymbol("SCALAR-RANGE-LISTIFY-METHOD");

    public static final SubLList $list234 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("FUDGE-FACTOR"), makeSymbol("NUMBERP")), list(makeSymbol("CSETQ"), makeSymbol("MIN"), list(makeSymbol("-"), makeSymbol("MIN"), list(makeSymbol("*"), makeSymbol("MIN"), makeSymbol("FUDGE-FACTOR")))), list(makeSymbol("CSETQ"), makeSymbol("MAX"), list(makeSymbol("+"), makeSymbol("MAX"), list(makeSymbol("*"), makeSymbol("MAX"), makeSymbol("FUDGE-FACTOR")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_FUDGE_METHOD = makeSymbol("SCALAR-RANGE-FUDGE-METHOD");

    public static final SubLSymbol CONVERTIBLE_P = makeSymbol("CONVERTIBLE-P");

    public static final SubLList $list238 = list(makeSymbol("OTHER-RANGE"));

    public static final SubLList $list239 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OTHER-RANGE"), makeSymbol("SCALAR-RANGE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("OTHER-UNIT"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-UNIT")))), list(makeSymbol("QUERY"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell(makeString("and")), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell(makeString("isa")), makeSymbol("UNIT"), list(makeSymbol("QUOTE"), list(makeSymbol("?TYPE")))), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell(makeString("isa")), makeSymbol("OTHER-UNIT"), list(makeSymbol("QUOTE"), list(makeSymbol("?TYPE")))), list(makeSymbol("QUOTE"), list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TYPE"), reader_make_constant_shell(makeString("InterconvertibleUnitType")))))))), list(makeSymbol("RET"), list(makeSymbol("NEW-CYC-QUERY"), makeSymbol("QUERY"), reader_make_constant_shell(makeString("EverythingPSC"))))));

    public static final SubLSymbol $sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol SCALAR_RANGE_P = makeSymbol("SCALAR-RANGE-P");

    public static final SubLList $list242 = list(makeSymbol("?TYPE"));

    public static final SubLList $list243 = list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TYPE"), reader_make_constant_shell(makeString("InterconvertibleUnitType"))));

    public static final SubLSymbol SCALAR_RANGE_CONVERTIBLE_P_METHOD = makeSymbol("SCALAR-RANGE-CONVERTIBLE-P-METHOD");

    public static final SubLList $list245 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CONVERTIBLE-P")), makeSymbol("OTHER-RANGE")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("OTHER-POINT"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("POINT-INFO"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), makeSymbol("POINT-INFO"), makeSymbol("OTHER-POINT")), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("MERGE-LOOSE")), makeSymbol("OTHER-RANGE")))), list(makeSymbol("POINT-INFO"), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("OTHER-POINT"), list(makeSymbol("RET"), makeSymbol("OTHER-RANGE"))), list(T, list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("MERGE-STRICT")), makeSymbol("OTHER-RANGE")))))));

    public static final SubLSymbol $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLSymbol MERGE_LOOSE = makeSymbol("MERGE-LOOSE");

    public static final SubLSymbol MERGE_STRICT = makeSymbol("MERGE-STRICT");

    public static final SubLSymbol SCALAR_RANGE_MERGE_METHOD = makeSymbol("SCALAR-RANGE-MERGE-METHOD");

    public static final SubLList $list250 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CONVERTIBLE-P")), makeSymbol("OTHER-RANGE")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("MERGED"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SCALAR-RANGE")))), list(makeSymbol("THIS-MIN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MIN")))), list(makeSymbol("OTHER-MIN"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MIN")))), list(makeSymbol("THIS-MAX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MAX")))), list(makeSymbol("OTHER-MAX"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MAX")))), list(makeSymbol("MIN-TEST"), list(makeSymbol("NEW-CYC-QUERY"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("lessThanOrEqualTo")), makeSymbol("THIS-MIN"), makeSymbol("OTHER-MIN")), reader_make_constant_shell(makeString("EverythingPSC")))), list(makeSymbol("MAX-TEST"), list(makeSymbol("NEW-CYC-QUERY"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("lessThanOrEqualTo")), makeSymbol("OTHER-MAX"), makeSymbol("THIS-MAX")), reader_make_constant_shell(makeString("EverythingPSC")))), list(makeSymbol("OTHER-UNIT"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-UNIT")))), list(makeSymbol("NEW-MIN"), list(makeSymbol("FIF"), makeSymbol("MIN-TEST"), makeSymbol("MIN"), list(makeSymbol("CONVERT-TO-UNITS"), makeSymbol("UNIT"), makeSymbol("OTHER-UNIT"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MIN-VALUE")))))), list(makeSymbol("NEW-MAX"), list(makeSymbol("FIF"), makeSymbol("MAX-TEST"), makeSymbol("MAX"), list(makeSymbol("CONVERT-TO-UNITS"), makeSymbol("UNIT"), makeSymbol("OTHER-UNIT"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MAX-VALUE")))))) }), list(makeSymbol("FIM"), makeSymbol("MERGED"), list(makeSymbol("QUOTE"), makeSymbol("FILL")), list(makeSymbol("LIST"), makeSymbol("UNIT"), makeSymbol("NEW-MIN"), makeSymbol("NEW-MAX"))), list(makeSymbol("RET"), makeSymbol("MERGED"))));

    public static final SubLSymbol $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    private static final SubLObject $$lessThanOrEqualTo = reader_make_constant_shell(makeString("lessThanOrEqualTo"));

    public static final SubLSymbol SCALAR_RANGE_MERGE_LOOSE_METHOD = makeSymbol("SCALAR-RANGE-MERGE-LOOSE-METHOD");

    public static final SubLList $list254 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CONVERTIBLE-P")), makeSymbol("OTHER-RANGE")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("THIS-MIN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MIN")))), list(makeSymbol("OTHER-MIN"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MIN")))), list(makeSymbol("THIS-MAX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MAX")))), list(makeSymbol("OTHER-MAX"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MAX"))))), list(makeSymbol("PWHEN"), list(makeSymbol("NEW-CYC-QUERY"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("lessThan")), makeSymbol("THIS-MAX"), makeSymbol("OTHER-MIN")), reader_make_constant_shell(makeString("EverythingPSC"))), list(makeSymbol("WARN"), makeString("~%Inconsistent ranges: ~S ~S"), makeSymbol("SELF"), makeSymbol("OTHER-RANGE")), list(makeSymbol("RET"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("NEW-CYC-QUERY"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("lessThan")), makeSymbol("OTHER-MAX"), makeSymbol("THIS-MIN")), reader_make_constant_shell(makeString("EverythingPSC"))), list(makeSymbol("WARN"), makeString("~%Inconsistent ranges: ~S ~S"), makeSymbol("SELF"), makeSymbol("OTHER-RANGE")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("OTHER-UNIT"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-UNIT")))), list(makeSymbol("NEW-MAX"), list(makeSymbol("FIF"), list(makeSymbol("NEW-CYC-QUERY"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("lessThan")), makeSymbol("OTHER-MAX"), makeSymbol("THIS-MAX")), reader_make_constant_shell(makeString("EverythingPSC"))), list(makeSymbol("CONVERT-TO-UNITS"), makeSymbol("UNIT"), makeSymbol("OTHER-UNIT"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MAX-VALUE")))), makeSymbol("MAX"))), list(makeSymbol("NEW-MIN"), list(makeSymbol("FIF"), list(makeSymbol("NEW-CYC-QUERY"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("lessThan")), makeSymbol("OTHER-MIN"), makeSymbol("THIS-MIN")), reader_make_constant_shell(makeString("EverythingPSC"))), makeSymbol("MIN"), list(makeSymbol("CONVERT-TO-UNITS"), makeSymbol("UNIT"), makeSymbol("OTHER-UNIT"), list(makeSymbol("FIM"), makeSymbol("OTHER-RANGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MIN-VALUE")))))), list(makeSymbol("MERGED"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("SCALAR-RANGE"))))), list(makeSymbol("FIM"), makeSymbol("MERGED"), list(makeSymbol("QUOTE"), makeSymbol("FILL")), list(makeSymbol("LIST"), makeSymbol("UNIT"), makeSymbol("NEW-MIN"), makeSymbol("NEW-MAX"))), list(makeSymbol("RET"), makeSymbol("MERGED")))));

    public static final SubLSymbol $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");

    public static final SubLString $str256$__Inconsistent_ranges___S__S = makeString("~%Inconsistent ranges: ~S ~S");

    public static final SubLSymbol SCALAR_RANGE_MERGE_STRICT_METHOD = makeSymbol("SCALAR-RANGE-MERGE-STRICT-METHOD");

    private static final SubLObject $$age = reader_make_constant_shell(makeString("age"));

    private static final SubLObject $$numberOfInhabitants = reader_make_constant_shell(makeString("numberOfInhabitants"));

    private static final SubLObject $$YearsDuration = reader_make_constant_shell(makeString("YearsDuration"));

    private static final SubLObject $$NumericalQuant_NLAttrFn = reader_make_constant_shell(makeString("NumericalQuant-NLAttrFn"));

    private static final SubLObject $$HomoSapiens = reader_make_constant_shell(makeString("HomoSapiens"));

    public static SubLObject get_sanity_checker() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $sanity_checker$.getDynamicValue(thread)) {
            $sanity_checker$.setDynamicValue(object.new_class_instance(SANITY_CHECKER), thread);
        }
        return $sanity_checker$.getDynamicValue(thread);
    }

    public static SubLObject get_piquant_sanity_checker(final SubLObject guid_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(guid_string) : "Types.stringp(guid_string) " + "CommonSymbols.NIL != Types.stringp(guid_string) " + guid_string;
        if (!$piquant_sanity_checkers$.getDynamicValue(thread).isHashtable()) {
            $piquant_sanity_checkers$.setDynamicValue(make_hash_table(EIGHT_INTEGER, symbol_function(EQUALP), UNPROVIDED), thread);
        }
        SubLObject checker = gethash(guid_string, $piquant_sanity_checkers$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == checker) {
            checker = object.new_class_instance(PIQUANT_SANITY_CHECKER);
            methods.funcall_instance_method_with_0_args(checker, SHOW_DEBUG_INFO);
            sethash(guid_string, $piquant_sanity_checkers$.getDynamicValue(thread), checker);
        }
        return checker;
    }

    public static SubLObject sanity_check(final SubLObject cyc_predicate, final SubLObject focus, final SubLObject v_answer) {
        return methods.funcall_instance_method_with_3_args(get_sanity_checker(), CHECK, cyc_predicate, focus, v_answer);
    }

    public static SubLObject cyc_sanity_check(final SubLObject cyc_predicate, final SubLObject cyc_focuses, final SubLObject cyc_answers) {
        assert NIL != listp(cyc_focuses) : "Types.listp(cyc_focuses) " + "CommonSymbols.NIL != Types.listp(cyc_focuses) " + cyc_focuses;
        assert NIL != listp(cyc_focuses) : "Types.listp(cyc_focuses) " + "CommonSymbols.NIL != Types.listp(cyc_focuses) " + cyc_focuses;
        return methods.funcall_instance_method_with_3_args(get_sanity_checker(), CHECK_CYC_INTERPRETATIONS, cyc_predicate, cyc_focuses, cyc_answers);
    }

    public static SubLObject cyc_sanity_filter(final SubLObject cyc_predicate, final SubLObject cyc_focuses, final SubLObject cyc_answers) {
        assert NIL != listp(cyc_focuses) : "Types.listp(cyc_focuses) " + "CommonSymbols.NIL != Types.listp(cyc_focuses) " + cyc_focuses;
        assert NIL != listp(cyc_focuses) : "Types.listp(cyc_focuses) " + "CommonSymbols.NIL != Types.listp(cyc_focuses) " + cyc_focuses;
        final SubLObject diagnoses = cyc_sanity_check(cyc_predicate, cyc_focuses, cyc_answers);
        SubLObject sane_answers = NIL;
        SubLObject cdolist_list_var = diagnoses;
        SubLObject diagnosis = NIL;
        diagnosis = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != methods.funcall_instance_method_with_0_args(diagnosis, BOOLEAN)) {
                sane_answers = cons(instances.get_slot(diagnosis, PROPOSED_VALUE), sane_answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            diagnosis = cdolist_list_var.first();
        } 
        return sane_answers;
    }

    public static SubLObject get_sanity_checker_show_debug_info(final SubLObject v_sanity_checker) {
        return classes.subloop_get_access_protected_instance_slot(v_sanity_checker, FOUR_INTEGER, SHOW_DEBUG_INFO);
    }

    public static SubLObject set_sanity_checker_show_debug_info(final SubLObject v_sanity_checker, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sanity_checker, value, FOUR_INTEGER, SHOW_DEBUG_INFO);
    }

    public static SubLObject get_sanity_checker_fudge_factor(final SubLObject v_sanity_checker) {
        return classes.subloop_get_instance_slot(v_sanity_checker, THREE_INTEGER);
    }

    public static SubLObject set_sanity_checker_fudge_factor(final SubLObject v_sanity_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_sanity_checker, value, THREE_INTEGER);
    }

    public static SubLObject get_sanity_checker_scratchpad(final SubLObject v_sanity_checker) {
        return classes.subloop_get_access_protected_instance_slot(v_sanity_checker, TWO_INTEGER, SCRATCHPAD);
    }

    public static SubLObject set_sanity_checker_scratchpad(final SubLObject v_sanity_checker, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sanity_checker, value, TWO_INTEGER, SCRATCHPAD);
    }

    public static SubLObject get_sanity_checker_cache(final SubLObject v_sanity_checker) {
        return classes.subloop_get_access_protected_instance_slot(v_sanity_checker, ONE_INTEGER, CACHE);
    }

    public static SubLObject set_sanity_checker_cache(final SubLObject v_sanity_checker, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sanity_checker, value, ONE_INTEGER, CACHE);
    }

    public static SubLObject subloop_reserved_initialize_sanity_checker_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sanity_checker_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER, CACHE, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER, SCRATCHPAD, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER, FUDGE_FACTOR, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER, SHOW_DEBUG_INFO, NIL);
        return NIL;
    }

    public static SubLObject sanity_checker_p(final SubLObject v_sanity_checker) {
        return classes.subloop_instanceof_class(v_sanity_checker, SANITY_CHECKER);
    }

    public static SubLObject sanity_checker_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = NIL;
        SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        try {
            thread.throwStack.push($sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                object.object_initialize_method(self);
                fudge_factor = ZERO_INTEGER;
                sublisp_throw($sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, $sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }

    public static SubLObject sanity_checker_show_debug_info_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = NIL;
        SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        try {
            thread.throwStack.push($sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                show_debug_info = T;
                sublisp_throw($sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }

    public static SubLObject sanity_checker_hide_debug_info_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = NIL;
        SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        try {
            thread.throwStack.push($sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                show_debug_info = NIL;
                sublisp_throw($sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, $sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }

    public static SubLObject sanity_checker_check_method(final SubLObject self, final SubLObject predicate, final SubLObject focus, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push($sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance(SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_PREDICATE, predicate);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_FOCUS, focus);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_ANSWER, v_answer);
                methods.funcall_instance_method_with_0_args(scratchpad, COMPUTE_DEGENERATE_DIAGNOSIS);
                if (NIL == instances.get_slot(scratchpad, DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, OUTPUT_DIAGNOSES);
                if (NIL != show_debug_info) {
                    SubLObject cdolist_list_var = result;
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str44$___S, methods.funcall_instance_method_with_0_args(item, PLISTIFY));
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, $sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }

    public static SubLObject sanity_checker_check_cyc_interpretations_method(final SubLObject self, final SubLObject predicate, final SubLObject cyc_interpretations, final SubLObject cyc_answers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push($sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance(SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_PREDICATE, predicate);
                instances.set_slot(scratchpad, CYC_FOCUSES, cyc_interpretations);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_CYC_ANSWERS, cyc_answers);
                methods.funcall_instance_method_with_0_args(scratchpad, COMPUTE_DEGENERATE_DIAGNOSIS);
                if (NIL == instances.get_slot(scratchpad, DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, OUTPUT_DIAGNOSES);
                if (NIL != show_debug_info) {
                    SubLObject cdolist_list_var = result;
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str44$___S, methods.funcall_instance_method_with_0_args(item, PLISTIFY));
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, $sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }

    public static SubLObject sanity_checker_check_listified_method(final SubLObject self, final SubLObject predicate, final SubLObject focus, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push($sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance(SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_PREDICATE, predicate);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_PIQUANT_FOCUS, focus);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_PIQUANT_ANSWER, v_answer);
                methods.funcall_instance_method_with_0_args(scratchpad, COMPUTE_DEGENERATE_DIAGNOSIS);
                if (NIL == instances.get_slot(scratchpad, DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, OUTPUT_DIAGNOSES);
                SubLObject listified_result = NIL;
                SubLObject cdolist_list_var = result;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    listified_result = cons(methods.funcall_instance_method_with_0_args(item, PLISTIFY), listified_result);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
                if (NIL != show_debug_info) {
                    cdolist_list_var = listified_result;
                    item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str44$___S, item);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, listified_result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }

    public static SubLObject piquant_sanity_check(final SubLObject pred_string, final SubLObject focus_string, final SubLObject answer_string, final SubLObject guid_string, SubLObject fudge_factor) {
        if (fudge_factor == UNPROVIDED) {
            fudge_factor = NIL;
        }
        assert NIL != stringp(guid_string) : "Types.stringp(guid_string) " + "CommonSymbols.NIL != Types.stringp(guid_string) " + guid_string;
        if (((NIL != fudge_factor) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == numberp(fudge_factor))) {
            throw new AssertionError(fudge_factor);
        }
        if (NIL != fudge_factor) {
            instances.set_slot(get_piquant_sanity_checker(guid_string), FUDGE_FACTOR, fudge_factor);
        }
        return methods.funcall_instance_method_with_3_args(get_piquant_sanity_checker(guid_string), CHECK_LISTIFIED, pred_string, focus_string, answer_string);
    }

    public static SubLObject subloop_reserved_initialize_piquant_sanity_checker_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_piquant_sanity_checker_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER, CACHE, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER, SCRATCHPAD, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER, FUDGE_FACTOR, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER, SHOW_DEBUG_INFO, NIL);
        return NIL;
    }

    public static SubLObject piquant_sanity_checker_p(final SubLObject piquant_sanity_checker) {
        return classes.subloop_instanceof_class(piquant_sanity_checker, PIQUANT_SANITY_CHECKER);
    }

    public static SubLObject piquant_sanity_checker_check_method(final SubLObject self, final SubLObject piquant_predicate, final SubLObject piquant_focus, final SubLObject piquant_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_piquant_sanity_checker_method = NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push($sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance(SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_PIQUANT_PREDICATE, piquant_predicate);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_PIQUANT_FOCUS, piquant_focus);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_ANSWER, piquant_answer);
                methods.funcall_instance_method_with_0_args(scratchpad, COMPUTE_DEGENERATE_DIAGNOSIS);
                if (NIL == instances.get_slot(scratchpad, DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, OUTPUT_DIAGNOSES);
                if (NIL != show_debug_info) {
                    SubLObject cdolist_list_var = result;
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str44$___S, methods.funcall_instance_method_with_0_args(item, PLISTIFY));
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_piquant_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, $sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_piquant_sanity_checker_method;
    }

    public static SubLObject piquant_sanity_checker_check_listified_method(final SubLObject self, final SubLObject piquant_predicate, final SubLObject piquant_focus, final SubLObject piquant_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_piquant_sanity_checker_method = NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push($sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance(SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_PIQUANT_PREDICATE, piquant_predicate);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_PIQUANT_FOCUS, piquant_focus);
                methods.funcall_instance_method_with_1_args(scratchpad, SET_ANSWER, piquant_answer);
                methods.funcall_instance_method_with_0_args(scratchpad, COMPUTE_DEGENERATE_DIAGNOSIS);
                if (NIL == instances.get_slot(scratchpad, DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, OUTPUT_DIAGNOSES);
                SubLObject listified_result = NIL;
                SubLObject cdolist_list_var = result;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    listified_result = cons(methods.funcall_instance_method_with_0_args(item, PLISTIFY), listified_result);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
                if (NIL != show_debug_info) {
                    cdolist_list_var = listified_result;
                    item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str44$___S, item);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD, listified_result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_piquant_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_piquant_sanity_checker_method;
    }

    public static SubLObject get_sanity_checker_scratchpad_degenerate_diagnosis(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_access_protected_instance_slot(sanity_checker_scratchpad, SEVEN_INTEGER, DEGENERATE_DIAGNOSIS);
    }

    public static SubLObject set_sanity_checker_scratchpad_degenerate_diagnosis(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sanity_checker_scratchpad, value, SEVEN_INTEGER, DEGENERATE_DIAGNOSIS);
    }

    public static SubLObject get_sanity_checker_scratchpad_checkers_pool(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_access_protected_instance_slot(sanity_checker_scratchpad, SIX_INTEGER, CHECKERS_POOL);
    }

    public static SubLObject set_sanity_checker_scratchpad_checkers_pool(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sanity_checker_scratchpad, value, SIX_INTEGER, CHECKERS_POOL);
    }

    public static SubLObject get_sanity_checker_scratchpad_cyc_answers(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, FIVE_INTEGER);
    }

    public static SubLObject set_sanity_checker_scratchpad_cyc_answers(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, FIVE_INTEGER);
    }

    public static SubLObject get_sanity_checker_scratchpad_answer(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, FOUR_INTEGER);
    }

    public static SubLObject set_sanity_checker_scratchpad_answer(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, FOUR_INTEGER);
    }

    public static SubLObject get_sanity_checker_scratchpad_cyc_focuses(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, THREE_INTEGER);
    }

    public static SubLObject set_sanity_checker_scratchpad_cyc_focuses(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, THREE_INTEGER);
    }

    public static SubLObject get_sanity_checker_scratchpad_focus(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, TWO_INTEGER);
    }

    public static SubLObject set_sanity_checker_scratchpad_focus(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, TWO_INTEGER);
    }

    public static SubLObject get_sanity_checker_scratchpad_predicate(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, ONE_INTEGER);
    }

    public static SubLObject set_sanity_checker_scratchpad_predicate(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, ONE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_sanity_checker_scratchpad_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sanity_checker_scratchpad_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_SCRATCHPAD, PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_SCRATCHPAD, FOCUS, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_SCRATCHPAD, CYC_FOCUSES, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_SCRATCHPAD, ANSWER, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_SCRATCHPAD, CYC_ANSWERS, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_SCRATCHPAD, CHECKERS_POOL, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_SCRATCHPAD, DEGENERATE_DIAGNOSIS, NIL);
        return NIL;
    }

    public static SubLObject sanity_checker_scratchpad_p(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_instanceof_class(sanity_checker_scratchpad, SANITY_CHECKER_SCRATCHPAD);
    }

    public static SubLObject sanity_checker_scratchpad_output_diagnoses_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        final SubLObject degenerate_diagnosis = get_sanity_checker_scratchpad_degenerate_diagnosis(self);
        final SubLObject checkers_pool = get_sanity_checker_scratchpad_checkers_pool(self);
        try {
            thread.throwStack.push($sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                if (NIL != degenerate_diagnosis) {
                    sublisp_throw($sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, list(degenerate_diagnosis));
                } else {
                    SubLObject diagnoses = NIL;
                    SubLObject cdolist_list_var = checkers_pool;
                    SubLObject checker = NIL;
                    checker = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        diagnoses = cons(instances.get_slot(checker, DIAGNOSIS), diagnoses);
                        cdolist_list_var = cdolist_list_var.rest();
                        checker = cdolist_list_var.first();
                    } 
                    sublisp_throw($sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, diagnoses);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_degenerate_diagnosis(self, degenerate_diagnosis);
                    set_sanity_checker_scratchpad_checkers_pool(self, checkers_pool);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static SubLObject sanity_checker_scratchpad_set_focus_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses(self);
        SubLObject focus = get_sanity_checker_scratchpad_focus(self);
        try {
            thread.throwStack.push($sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                focus = string;
                SubLObject cdolist_list_var = psp_main.ps_get_cycls_for_np(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject denot = NIL;
                denot = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject reformulated = reformulator_hub.reformulate_cycl(denot, UNPROVIDED, UNPROVIDED);
                    if (NIL != reformulated) {
                        final SubLObject item_var = reformulated;
                        if (NIL == member(item_var, cyc_focuses, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            cyc_focuses = cons(item_var, cyc_focuses);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                } 
                sublisp_throw($sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_cyc_focuses(self, cyc_focuses);
                    set_sanity_checker_scratchpad_focus(self, focus);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_set_piquant_focus_method(final SubLObject self, final SubLObject focus_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses(self);
        SubLObject focus = get_sanity_checker_scratchpad_focus(self);
        try {
            thread.throwStack.push($sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                assert NIL != stringp(focus_string) : "Types.stringp(focus_string) " + "CommonSymbols.NIL != Types.stringp(focus_string) " + focus_string;
                final SubLObject denotations = (NIL != string_utilities.starts_with(focus_string, $str92$__)) ? list(constants_high.find_constant(string_utilities.pre_remove(focus_string, $str92$__, UNPROVIDED))) : NIL;
                if (NIL != denotations) {
                    focus = focus_string;
                    cyc_focuses = denotations;
                    sublisp_throw($sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
                }
                final SubLObject guruqa_object = methods.funcall_class_method_with_1_args(GURUQA_OBJECT, GURUQA_PARSE_PRECISE, focus_string);
                if (NIL != (focus = guruqa_object)) {
                    cyc_focuses = methods.funcall_instance_method_with_0_args(guruqa_object, DENOTATIONS);
                }
                sublisp_throw($sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_cyc_focuses(self, cyc_focuses);
                    set_sanity_checker_scratchpad_focus(self, focus);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_set_predicate_method(final SubLObject self, final SubLObject cyc_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        SubLObject predicate = get_sanity_checker_scratchpad_predicate(self);
        try {
            thread.throwStack.push($sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                if (NIL != isa.isa_in_any_mtP(cyc_predicate, $$BinaryPredicate)) {
                    predicate = cyc_predicate;
                } else {
                    Errors.warn($str101$___S_is_not_a_binary_predicate_, cyc_predicate);
                }
                sublisp_throw($sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_predicate(self, predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_set_piquant_predicate_method(final SubLObject self, final SubLObject piquant_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        SubLObject predicate = get_sanity_checker_scratchpad_predicate(self);
        try {
            thread.throwStack.push($sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                final SubLObject cyc_predicate = constants_high.find_constant(piquant_predicate);
                if (NIL != isa.isa_in_any_mtP(cyc_predicate, $$BinaryPredicate)) {
                    predicate = cyc_predicate;
                } else {
                    Errors.warn($str101$___S_is_not_a_binary_predicate_, piquant_predicate);
                }
                sublisp_throw($sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_predicate(self, predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_set_answer_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        SubLObject v_answer = get_sanity_checker_scratchpad_answer(self);
        try {
            thread.throwStack.push($sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                v_answer = string;
                methods.funcall_instance_method_with_1_args(self, COMPUTE_CYC_ANSWERS, string);
                sublisp_throw($sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_answer(self, v_answer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_set_cyc_answers_method(final SubLObject self, final SubLObject cyc_candidate_answers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers(self);
        final SubLObject v_answer = get_sanity_checker_scratchpad_answer(self);
        try {
            thread.throwStack.push($sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                SubLObject cdolist_list_var = cyc_candidate_answers;
                SubLObject v_answer_$1 = NIL;
                v_answer_$1 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != term.el_fort_p(v_answer_$1)) {
                        cyc_answers = cons(v_answer_$1, cyc_answers);
                    } else
                        if (v_answer_$1.isNumber()) {
                            cyc_answers = cons(list($$Unity, v_answer_$1), cyc_answers);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer_$1 = cdolist_list_var.first();
                } 
                sublisp_throw($sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_cyc_answers(self, cyc_answers);
                    set_sanity_checker_scratchpad_answer(self, v_answer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_compute_cyc_answers_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers(self);
        try {
            thread.throwStack.push($sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                final SubLObject all_denots = psp_main.ps_get_cycls_for_np(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject good_denots = NIL;
                SubLObject cdolist_list_var = all_denots;
                SubLObject denot = NIL;
                denot = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != term.el_fort_p(denot)) {
                        final SubLObject reformulated = reformulator_hub.reformulate_cycl(denot, UNPROVIDED, UNPROVIDED);
                        SubLObject wft = NIL;
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            wft = wff.el_wftP(denot, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        if (NIL != wft) {
                            final SubLObject item_var = reformulated;
                            if (NIL == member(item_var, good_denots, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                good_denots = cons(item_var, good_denots);
                            }
                        }
                    } else
                        if (denot.isNumber()) {
                            good_denots = cons(list($$Unity, denot), good_denots);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                } 
                cyc_answers = good_denots;
                sublisp_throw($sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_cyc_answers(self, cyc_answers);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_compute_degenerate_diagnosis_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        SubLObject degenerate_diagnosis = get_sanity_checker_scratchpad_degenerate_diagnosis(self);
        final SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers(self);
        final SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses(self);
        final SubLObject predicate = get_sanity_checker_scratchpad_predicate(self);
        try {
            thread.throwStack.push($sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                final SubLObject diagnosis = object.new_class_instance(SANITY_CHECKER_DIAGNOSIS);
                SubLObject basis = ZERO_INTEGER;
                if (NIL == predicate) {
                    basis = add(basis, $int$100);
                }
                if (NIL == cyc_focuses) {
                    basis = add(basis, TEN_INTEGER);
                }
                if (NIL == cyc_answers) {
                    basis = add(basis, ONE_INTEGER);
                }
                if (basis.numG(ZERO_INTEGER)) {
                    instances.set_slot(diagnosis, FAILURE_CODE, basis);
                    degenerate_diagnosis = diagnosis;
                }
                sublisp_throw($sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_degenerate_diagnosis(self, degenerate_diagnosis);
                    set_sanity_checker_scratchpad_cyc_answers(self, cyc_answers);
                    set_sanity_checker_scratchpad_cyc_focuses(self, cyc_focuses);
                    set_sanity_checker_scratchpad_predicate(self, predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_initialize_checkers_method(final SubLObject self, final SubLObject fudge_factor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        SubLObject degenerate_diagnosis = get_sanity_checker_scratchpad_degenerate_diagnosis(self);
        SubLObject checkers_pool = get_sanity_checker_scratchpad_checkers_pool(self);
        final SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers(self);
        final SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses(self);
        final SubLObject predicate = get_sanity_checker_scratchpad_predicate(self);
        try {
            thread.throwStack.push($sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                final SubLObject pred_arg1_set = kb_mapping_utilities.pred_values_in_any_mt(predicate, $$arg1Isa, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                final SubLObject pred_arg2_set = kb_mapping_utilities.pred_values_in_any_mt(predicate, $$arg2Isa, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                SubLObject good_arg1s = NIL;
                SubLObject good_arg2s = NIL;
                SubLObject cdolist_list_var = cyc_focuses;
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject fail = NIL;
                    if (NIL == fail) {
                        SubLObject csome_list_var = pred_arg1_set;
                        SubLObject arg2 = NIL;
                        arg2 = csome_list_var.first();
                        while ((NIL == fail) && (NIL != csome_list_var)) {
                            if ((NIL == isa.isa_in_any_mtP(arg, arg2)) && (NIL == genls.genl_in_any_mtP(arg, arg2))) {
                                fail = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            arg2 = csome_list_var.first();
                        } 
                    }
                    if (NIL == fail) {
                        final SubLObject item_var = arg;
                        if (NIL == member(item_var, good_arg1s, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            good_arg1s = cons(item_var, good_arg1s);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                cdolist_list_var = cyc_answers;
                arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject fail = NIL;
                    SubLObject cast = NIL;
                    if (NIL == fail) {
                        SubLObject csome_list_var2 = pred_arg2_set;
                        SubLObject arg3 = NIL;
                        arg3 = csome_list_var2.first();
                        while ((NIL == fail) && (NIL != csome_list_var2)) {
                            cast = heuristically_cast_unity(predicate, arg);
                            if (NIL != term.el_fort_p(cast)) {
                                fail = makeBoolean((NIL == isa.isa_in_any_mtP(cast, arg3)) && (NIL == genls.genl_in_any_mtP(arg, arg3)));
                            } else {
                                fail = makeBoolean((!cast.isNumber()) || (!cast.isPositive()));
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            arg3 = csome_list_var2.first();
                        } 
                    }
                    if (NIL == fail) {
                        final SubLObject item_var2 = cast;
                        if (NIL == member(item_var2, good_arg2s, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            good_arg2s = cons(item_var2, good_arg2s);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                cdolist_list_var = good_arg1s;
                SubLObject good_arg1 = NIL;
                good_arg1 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$2 = good_arg2s;
                    SubLObject good_arg2 = NIL;
                    good_arg2 = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        final SubLObject checker = object.new_class_instance(SCALAR_CHECKER);
                        instances.set_slot(checker, FUDGE_FACTOR, fudge_factor);
                        instances.set_slot(checker, PREDICATE, predicate);
                        instances.set_slot(checker, ARG1, good_arg1);
                        instances.set_slot(checker, ARG2, good_arg2);
                        checkers_pool = cons(checker, checkers_pool);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        good_arg2 = cdolist_list_var_$2.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    good_arg1 = cdolist_list_var.first();
                } 
                if (NIL == checkers_pool) {
                    final SubLObject diagnosis = object.new_class_instance(SANITY_CHECKER_DIAGNOSIS);
                    instances.set_slot(diagnosis, FAILURE_CODE, $int$1000);
                    degenerate_diagnosis = diagnosis;
                }
                sublisp_throw($sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_degenerate_diagnosis(self, degenerate_diagnosis);
                    set_sanity_checker_scratchpad_checkers_pool(self, checkers_pool);
                    set_sanity_checker_scratchpad_cyc_answers(self, cyc_answers);
                    set_sanity_checker_scratchpad_cyc_focuses(self, cyc_focuses);
                    set_sanity_checker_scratchpad_predicate(self, predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject sanity_checker_scratchpad_diagnose_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = NIL;
        final SubLObject checkers_pool = get_sanity_checker_scratchpad_checkers_pool(self);
        try {
            thread.throwStack.push($sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                SubLObject cdolist_list_var = checkers_pool;
                SubLObject checker = NIL;
                checker = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_0_args(checker, COMPUTE_RANGE);
                    methods.funcall_instance_method_with_0_args(checker, DIAGNOSE);
                    cdolist_list_var = cdolist_list_var.rest();
                    checker = cdolist_list_var.first();
                } 
                sublisp_throw($sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_scratchpad_checkers_pool(self, checkers_pool);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }

    public static SubLObject set_scalar_checker_backchain_parameter(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(number) : "Types.integerp(number) " + "CommonSymbols.NIL != Types.integerp(number) " + number;
        if (!ZERO_INTEGER.numG(number)) {
            $scalar_checker_backchain$.setDynamicValue(number, thread);
        }
        return $scalar_checker_backchain$.getDynamicValue(thread);
    }

    public static SubLObject get_scalar_checker_arg2range(final SubLObject scalar_checker) {
        return classes.subloop_get_access_protected_instance_slot(scalar_checker, SEVEN_INTEGER, ARG2RANGE);
    }

    public static SubLObject set_scalar_checker_arg2range(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_checker, value, SEVEN_INTEGER, ARG2RANGE);
    }

    public static SubLObject get_scalar_checker_arg2(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, SIX_INTEGER);
    }

    public static SubLObject set_scalar_checker_arg2(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, SIX_INTEGER);
    }

    public static SubLObject get_scalar_checker_arg1(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, FIVE_INTEGER);
    }

    public static SubLObject set_scalar_checker_arg1(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, FIVE_INTEGER);
    }

    public static SubLObject get_scalar_checker_backchain(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, FOUR_INTEGER);
    }

    public static SubLObject set_scalar_checker_backchain(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, FOUR_INTEGER);
    }

    public static SubLObject get_scalar_checker_diagnosis(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, THREE_INTEGER);
    }

    public static SubLObject set_scalar_checker_diagnosis(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, THREE_INTEGER);
    }

    public static SubLObject get_scalar_checker_predicate(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, TWO_INTEGER);
    }

    public static SubLObject set_scalar_checker_predicate(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, TWO_INTEGER);
    }

    public static SubLObject get_scalar_checker_fudge_factor(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, ONE_INTEGER);
    }

    public static SubLObject set_scalar_checker_fudge_factor(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, ONE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_scalar_checker_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_scalar_checker_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_CHECKER, FUDGE_FACTOR, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_CHECKER, PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_CHECKER, DIAGNOSIS, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_CHECKER, BACKCHAIN, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_CHECKER, ARG1, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_CHECKER, ARG2, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_CHECKER, ARG2RANGE, NIL);
        return NIL;
    }

    public static SubLObject scalar_checker_p(final SubLObject scalar_checker) {
        return classes.subloop_instanceof_class(scalar_checker, SCALAR_CHECKER);
    }

    public static SubLObject scalar_checker_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_checker_method = NIL;
        SubLObject backchain = get_scalar_checker_backchain(self);
        try {
            thread.throwStack.push($sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
            try {
                object.object_initialize_method(self);
                backchain = $scalar_checker_backchain$.getDynamicValue(thread);
                sublisp_throw($sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_checker_backchain(self, backchain);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_checker_method = Errors.handleThrowable(ccatch_env_var, $sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_checker_method;
    }

    public static SubLObject scalar_checker_compute_range_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_checker_method = NIL;
        SubLObject arg2range = get_scalar_checker_arg2range(self);
        final SubLObject arg1 = get_scalar_checker_arg1(self);
        final SubLObject backchain = get_scalar_checker_backchain(self);
        final SubLObject predicate = get_scalar_checker_predicate(self);
        final SubLObject fudge_factor = get_scalar_checker_fudge_factor(self);
        try {
            thread.throwStack.push($sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
            try {
                final SubLObject arg2 = typeshift_argument(arg1);
                final SubLObject query = listS(predicate, arg2, $list153);
                SubLObject to_merge;
                final SubLObject answers = to_merge = ask_utilities.ask_template($sym154$_RANGE, query, $$EverythingPSC, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject range = NIL;
                if (NIL == range) {
                    SubLObject csome_list_var = answers;
                    SubLObject v_answer = NIL;
                    v_answer = csome_list_var.first();
                    while ((NIL == range) && (NIL != csome_list_var)) {
                        final SubLObject candidate_range = object.new_class_instance(SCALAR_RANGE);
                        methods.funcall_instance_method_with_1_args(candidate_range, FILL, v_answer);
                        to_merge = to_merge.rest();
                        if (NIL == methods.funcall_instance_method_with_0_args(candidate_range, EMPTY_P)) {
                            range = candidate_range;
                        }
                        csome_list_var = csome_list_var.rest();
                        v_answer = csome_list_var.first();
                    } 
                }
                SubLObject cdolist_list_var = to_merge;
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != range) {
                        final SubLObject new_range = object.new_class_instance(SCALAR_RANGE);
                        methods.funcall_instance_method_with_1_args(new_range, FILL, v_answer);
                        if (NIL == methods.funcall_instance_method_with_0_args(new_range, EMPTY_P)) {
                            range = methods.funcall_instance_method_with_1_args(range, MERGE, new_range);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                } 
                if (NIL != range) {
                    methods.funcall_instance_method_with_1_args(range, FUDGE, fudge_factor);
                    arg2range = range;
                }
                sublisp_throw($sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_checker_arg2range(self, arg2range);
                    set_scalar_checker_arg1(self, arg1);
                    set_scalar_checker_backchain(self, backchain);
                    set_scalar_checker_predicate(self, predicate);
                    set_scalar_checker_fudge_factor(self, fudge_factor);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_checker_method = Errors.handleThrowable(ccatch_env_var, $sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_checker_method;
    }

    public static SubLObject typeshift_argument(final SubLObject arg) {
        if (NIL != isa.isa_in_any_mtP(arg, $$Collection)) {
            return list($$SomeFn, arg);
        }
        return arg;
    }

    public static SubLObject scalar_checker_diagnose_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_checker_method = NIL;
        final SubLObject arg2range = get_scalar_checker_arg2range(self);
        final SubLObject arg2 = get_scalar_checker_arg2(self);
        final SubLObject arg3 = get_scalar_checker_arg1(self);
        SubLObject diagnosis = get_scalar_checker_diagnosis(self);
        final SubLObject predicate = get_scalar_checker_predicate(self);
        try {
            thread.throwStack.push($sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
            try {
                final SubLObject diagn = object.new_class_instance(SANITY_CHECKER_DIAGNOSIS);
                final SubLObject cast = heuristically_cast_unity(predicate, arg2);
                final SubLObject arg2min = (NIL != arg2range) ? methods.funcall_instance_method_with_0_args(arg2range, GET_MIN) : NIL;
                final SubLObject arg2max = (NIL != arg2range) ? methods.funcall_instance_method_with_0_args(arg2range, GET_MAX) : NIL;
                final SubLObject range = (NIL != arg2range) ? methods.funcall_instance_method_with_0_args(arg2range, LISTIFY) : NIL;
                SubLObject cycl_explanation = NIL;
                instances.set_slot(diagn, PREDICATE, predicate);
                instances.set_slot(diagn, PROPOSED_ARG, arg3);
                instances.set_slot(diagn, PROPOSED_VALUE, arg2);
                if ((NIL != arg2min) && (NIL != arg2max)) {
                    final SubLObject negative_test_min = list($$lessThan, cast, arg2min);
                    final SubLObject negative_test_max = list($$greaterThan, cast, arg2max);
                    final SubLObject positive_test = list($$quantitySubsumes, range, cast);
                    if (NIL != inference_kernel.new_cyc_query(negative_test_min, $$EverythingPSC, UNPROVIDED)) {
                        instances.set_slot(diagn, COMPLETE, ONE_INTEGER);
                        instances.set_slot(diagn, ANSWER_KNOWN, ONE_INTEGER);
                        instances.set_slot(diagn, ANSWER, ZERO_INTEGER);
                        cycl_explanation = list($$and, list(predicate, arg3, range), negative_test_min);
                    } else
                        if (NIL != inference_kernel.new_cyc_query(negative_test_max, $$EverythingPSC, UNPROVIDED)) {
                            instances.set_slot(diagn, COMPLETE, ONE_INTEGER);
                            instances.set_slot(diagn, ANSWER_KNOWN, ONE_INTEGER);
                            instances.set_slot(diagn, ANSWER, ZERO_INTEGER);
                            cycl_explanation = list($$and, list(predicate, arg3, range), negative_test_max);
                        } else
                            if (NIL != inference_kernel.new_cyc_query(positive_test, $$EverythingPSC, UNPROVIDED)) {
                                instances.set_slot(diagn, COMPLETE, ONE_INTEGER);
                                instances.set_slot(diagn, ANSWER_KNOWN, ONE_INTEGER);
                                instances.set_slot(diagn, ANSWER, ONE_INTEGER);
                                cycl_explanation = list($$and, list(predicate, arg3, range), positive_test);
                            }


                    instances.set_slot(diagn, JUSTIFICATION, pph_main.generate_phrase(cycl_explanation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } else {
                    instances.set_slot(diagn, COMPLETE, ONE_INTEGER);
                    instances.set_slot(diagn, ANSWER_KNOWN, ZERO_INTEGER);
                    instances.set_slot(diagn, ANSWER, ZERO_INTEGER);
                    instances.set_slot(diagn, JUSTIFICATION, $$$No_information_available);
                }
                diagnosis = diagn;
                sublisp_throw($sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_checker_arg2range(self, arg2range);
                    set_scalar_checker_arg2(self, arg2);
                    set_scalar_checker_arg1(self, arg3);
                    set_scalar_checker_diagnosis(self, diagnosis);
                    set_scalar_checker_predicate(self, predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_checker_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_checker_method;
    }

    public static SubLObject get_sanity_checker_diagnosis_predicate(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, EIGHT_INTEGER);
    }

    public static SubLObject set_sanity_checker_diagnosis_predicate(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, EIGHT_INTEGER);
    }

    public static SubLObject get_sanity_checker_diagnosis_proposed_arg(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, SEVEN_INTEGER);
    }

    public static SubLObject set_sanity_checker_diagnosis_proposed_arg(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, SEVEN_INTEGER);
    }

    public static SubLObject get_sanity_checker_diagnosis_proposed_value(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, SIX_INTEGER);
    }

    public static SubLObject set_sanity_checker_diagnosis_proposed_value(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, SIX_INTEGER);
    }

    public static SubLObject get_sanity_checker_diagnosis_justification(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, FIVE_INTEGER);
    }

    public static SubLObject set_sanity_checker_diagnosis_justification(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, FIVE_INTEGER);
    }

    public static SubLObject get_sanity_checker_diagnosis_answer(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, FOUR_INTEGER);
    }

    public static SubLObject set_sanity_checker_diagnosis_answer(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, FOUR_INTEGER);
    }

    public static SubLObject get_sanity_checker_diagnosis_answer_known(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, THREE_INTEGER);
    }

    public static SubLObject set_sanity_checker_diagnosis_answer_known(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, THREE_INTEGER);
    }

    public static SubLObject get_sanity_checker_diagnosis_complete(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, TWO_INTEGER);
    }

    public static SubLObject set_sanity_checker_diagnosis_complete(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, TWO_INTEGER);
    }

    public static SubLObject get_sanity_checker_diagnosis_failure_code(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, ONE_INTEGER);
    }

    public static SubLObject set_sanity_checker_diagnosis_failure_code(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, ONE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_sanity_checker_diagnosis_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sanity_checker_diagnosis_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_DIAGNOSIS, FAILURE_CODE, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_DIAGNOSIS, COMPLETE, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_DIAGNOSIS, ANSWER_KNOWN, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_DIAGNOSIS, ANSWER, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_DIAGNOSIS, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_DIAGNOSIS, PROPOSED_VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_DIAGNOSIS, PROPOSED_ARG, NIL);
        classes.subloop_initialize_slot(new_instance, SANITY_CHECKER_DIAGNOSIS, PREDICATE, NIL);
        return NIL;
    }

    public static SubLObject sanity_checker_diagnosis_p(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_instanceof_class(sanity_checker_diagnosis, SANITY_CHECKER_DIAGNOSIS);
    }

    public static SubLObject sanity_checker_diagnosis_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_diagnosis_method = NIL;
        SubLObject failure_code = get_sanity_checker_diagnosis_failure_code(self);
        try {
            thread.throwStack.push($sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD);
            try {
                object.object_initialize_method(self);
                failure_code = ZERO_INTEGER;
                sublisp_throw($sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_diagnosis_failure_code(self, failure_code);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_diagnosis_method = Errors.handleThrowable(ccatch_env_var, $sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_diagnosis_method;
    }

    public static SubLObject sanity_checker_diagnosis_boolean_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_diagnosis_method = NIL;
        final SubLObject v_answer = get_sanity_checker_diagnosis_answer(self);
        try {
            thread.throwStack.push($sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD);
            try {
                if (!v_answer.isInteger()) {
                    sublisp_throw($sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD, NIL);
                }
                sublisp_throw($sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD, numG(v_answer, ZERO_INTEGER));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sanity_checker_diagnosis_answer(self, v_answer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_diagnosis_method = Errors.handleThrowable(ccatch_env_var, $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_diagnosis_method;
    }

    public static SubLObject get_scalar_range_point_info(final SubLObject scalar_range) {
        return classes.subloop_get_access_protected_instance_slot(scalar_range, FOUR_INTEGER, POINT_INFO);
    }

    public static SubLObject set_scalar_range_point_info(final SubLObject scalar_range, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_range, value, FOUR_INTEGER, POINT_INFO);
    }

    public static SubLObject get_scalar_range_max(final SubLObject scalar_range) {
        return classes.subloop_get_access_protected_instance_slot(scalar_range, THREE_INTEGER, MAX);
    }

    public static SubLObject set_scalar_range_max(final SubLObject scalar_range, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_range, value, THREE_INTEGER, MAX);
    }

    public static SubLObject get_scalar_range_min(final SubLObject scalar_range) {
        return classes.subloop_get_access_protected_instance_slot(scalar_range, TWO_INTEGER, MIN);
    }

    public static SubLObject set_scalar_range_min(final SubLObject scalar_range, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_range, value, TWO_INTEGER, MIN);
    }

    public static SubLObject get_scalar_range_unit(final SubLObject scalar_range) {
        return classes.subloop_get_access_protected_instance_slot(scalar_range, ONE_INTEGER, UNIT);
    }

    public static SubLObject set_scalar_range_unit(final SubLObject scalar_range, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_range, value, ONE_INTEGER, UNIT);
    }

    public static SubLObject subloop_reserved_initialize_scalar_range_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_scalar_range_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_RANGE, UNIT, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_RANGE, MIN, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_RANGE, MAX, NIL);
        classes.subloop_initialize_slot(new_instance, SCALAR_RANGE, POINT_INFO, NIL);
        return NIL;
    }

    public static SubLObject scalar_range_p(final SubLObject scalar_range) {
        return classes.subloop_instanceof_class(scalar_range, SCALAR_RANGE);
    }

    public static SubLObject scalar_range_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject point_info = get_scalar_range_point_info(self);
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                princ(list(unit, min, max, point_info), stream);
                sublisp_throw($sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_point_info(self, point_info);
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        SubLObject max = get_scalar_range_max(self);
        SubLObject min = get_scalar_range_min(self);
        SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                object.object_initialize_method(self);
                unit = $$Unity;
                min = ZERO_INTEGER;
                max = ZERO_INTEGER;
                sublisp_throw($sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_empty_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                sublisp_throw($sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, makeBoolean((unit.eql($$Unity) && min.numE(ZERO_INTEGER)) && max.numE(ZERO_INTEGER)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_fill_method(final SubLObject self, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        SubLObject point_info = get_scalar_range_point_info(self);
        SubLObject max = get_scalar_range_max(self);
        SubLObject min = get_scalar_range_min(self);
        SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (NIL == inference_kernel.new_cyc_query(listS($$isa, value, $list209), $$BaseKB, UNPROVIDED)) {
                    sublisp_throw($sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
                }
                if (value.isNumber()) {
                    min = value;
                    max = value;
                    point_info = T;
                } else
                    if (value.isCons()) {
                        final SubLObject value_unit = value.first();
                        final SubLObject value_min = second(value);
                        final SubLObject value_max = third(value);
                        SubLObject new_unit = NIL;
                        SubLObject new_min = NIL;
                        SubLObject new_max = NIL;
                        if (NIL != isa.isaP(value_unit, $$UnitOfMeasure, UNPROVIDED, UNPROVIDED)) {
                            new_unit = value_unit;
                        }
                        if (value_min.isNumber()) {
                            new_min = value_min;
                        }
                        if (value_max.isNumber()) {
                            new_max = value_max;
                        } else {
                            new_max = new_min;
                        }
                        if (((NIL != new_unit) && (NIL != new_min)) && (NIL != new_max)) {
                            unit = new_unit;
                            min = new_min;
                            max = new_max;
                        }
                        if (new_min.eql(new_max)) {
                            point_info = T;
                        }
                    }

                sublisp_throw($sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_point_info(self, point_info);
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_get_unit_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                sublisp_throw($sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, unit);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_get_min_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (NIL != methods.funcall_instance_method_with_0_args(self, EMPTY_P)) {
                    sublisp_throw($sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL);
                } else {
                    sublisp_throw($sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, list(unit, min));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_get_min_value_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject min = get_scalar_range_min(self);
        try {
            thread.throwStack.push($sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                sublisp_throw($sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, min);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_min(self, min);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_get_max_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (NIL != methods.funcall_instance_method_with_0_args(self, EMPTY_P)) {
                    sublisp_throw($sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL);
                } else {
                    sublisp_throw($sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, list(unit, max));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_get_max_value_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject max = get_scalar_range_max(self);
        try {
            thread.throwStack.push($sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                sublisp_throw($sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, max);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_max(self, max);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_listify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                sublisp_throw($sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, list(unit, min, max));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_fudge_method(final SubLObject self, final SubLObject fudge_factor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        SubLObject max = get_scalar_range_max(self);
        SubLObject min = get_scalar_range_min(self);
        try {
            thread.throwStack.push($sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                assert NIL != numberp(fudge_factor) : "Types.numberp(fudge_factor) " + "CommonSymbols.NIL != Types.numberp(fudge_factor) " + fudge_factor;
                min = subtract(min, multiply(min, fudge_factor));
                max = add(max, multiply(max, fudge_factor));
                sublisp_throw($sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_convertible_p_method(final SubLObject self, final SubLObject other_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                assert NIL != scalar_range_p(other_range) : "sanity_checker.scalar_range_p(other_range) " + "CommonSymbols.NIL != sanity_checker.scalar_range_p(other_range) " + other_range;
                final SubLObject other_unit = methods.funcall_instance_method_with_0_args(other_range, GET_UNIT);
                final SubLObject query = listS($$and, listS($$isa, unit, $list242), listS($$isa, other_unit, $list242), $list243);
                sublisp_throw($sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, inference_kernel.new_cyc_query(query, $$EverythingPSC, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_merge_method(final SubLObject self, final SubLObject other_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject point_info = get_scalar_range_point_info(self);
        try {
            thread.throwStack.push($sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (NIL == methods.funcall_instance_method_with_1_args(self, CONVERTIBLE_P, other_range)) {
                    sublisp_throw($sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL);
                }
                final SubLObject other_point = instances.get_slot(other_range, POINT_INFO);
                if ((NIL != point_info) && (NIL != other_point)) {
                    sublisp_throw($sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, methods.funcall_instance_method_with_1_args(self, MERGE_LOOSE, other_range));
                } else
                    if (NIL != point_info) {
                        sublisp_throw($sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
                    } else
                        if (NIL != other_point) {
                            sublisp_throw($sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, other_range);
                        } else {
                            sublisp_throw($sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, methods.funcall_instance_method_with_1_args(self, MERGE_STRICT, other_range));
                        }


            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_point_info(self, point_info);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_merge_loose_method(final SubLObject self, final SubLObject other_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (NIL == methods.funcall_instance_method_with_1_args(self, CONVERTIBLE_P, other_range)) {
                    sublisp_throw($sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL);
                }
                final SubLObject merged = object.new_class_instance(SCALAR_RANGE);
                final SubLObject this_min = methods.funcall_instance_method_with_0_args(self, GET_MIN);
                final SubLObject other_min = methods.funcall_instance_method_with_0_args(other_range, GET_MIN);
                final SubLObject this_max = methods.funcall_instance_method_with_0_args(self, GET_MAX);
                final SubLObject other_max = methods.funcall_instance_method_with_0_args(other_range, GET_MAX);
                final SubLObject min_test = inference_kernel.new_cyc_query(list($$lessThanOrEqualTo, this_min, other_min), $$EverythingPSC, UNPROVIDED);
                final SubLObject max_test = inference_kernel.new_cyc_query(list($$lessThanOrEqualTo, other_max, this_max), $$EverythingPSC, UNPROVIDED);
                final SubLObject other_unit = methods.funcall_instance_method_with_0_args(other_range, GET_UNIT);
                final SubLObject new_min = (NIL != min_test) ? min : quantities.convert_to_units(unit, other_unit, methods.funcall_instance_method_with_0_args(other_range, GET_MIN_VALUE), UNPROVIDED);
                final SubLObject new_max = (NIL != max_test) ? max : quantities.convert_to_units(unit, other_unit, methods.funcall_instance_method_with_0_args(other_range, GET_MAX_VALUE), UNPROVIDED);
                methods.funcall_instance_method_with_1_args(merged, FILL, list(unit, new_min, new_max));
                sublisp_throw($sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, merged);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject scalar_range_merge_strict_method(final SubLObject self, final SubLObject other_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push($sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (NIL == methods.funcall_instance_method_with_1_args(self, CONVERTIBLE_P, other_range)) {
                    sublisp_throw($sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL);
                }
                final SubLObject this_min = methods.funcall_instance_method_with_0_args(self, GET_MIN);
                final SubLObject other_min = methods.funcall_instance_method_with_0_args(other_range, GET_MIN);
                final SubLObject this_max = methods.funcall_instance_method_with_0_args(self, GET_MAX);
                final SubLObject other_max = methods.funcall_instance_method_with_0_args(other_range, GET_MAX);
                if (NIL != inference_kernel.new_cyc_query(list($$lessThan, this_max, other_min), $$EverythingPSC, UNPROVIDED)) {
                    Errors.warn($str256$__Inconsistent_ranges___S__S, self, other_range);
                    sublisp_throw($sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL);
                }
                if (NIL != inference_kernel.new_cyc_query(list($$lessThan, other_max, this_min), $$EverythingPSC, UNPROVIDED)) {
                    Errors.warn($str256$__Inconsistent_ranges___S__S, self, other_range);
                    sublisp_throw($sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, NIL);
                }
                final SubLObject other_unit = methods.funcall_instance_method_with_0_args(other_range, GET_UNIT);
                final SubLObject new_max = (NIL != inference_kernel.new_cyc_query(list($$lessThan, other_max, this_max), $$EverythingPSC, UNPROVIDED)) ? quantities.convert_to_units(unit, other_unit, methods.funcall_instance_method_with_0_args(other_range, GET_MAX_VALUE), UNPROVIDED) : max;
                final SubLObject new_min = (NIL != inference_kernel.new_cyc_query(list($$lessThan, other_min, this_min), $$EverythingPSC, UNPROVIDED)) ? min : quantities.convert_to_units(unit, other_unit, methods.funcall_instance_method_with_0_args(other_range, GET_MIN_VALUE), UNPROVIDED);
                final SubLObject merged = object.new_class_instance(SCALAR_RANGE);
                methods.funcall_instance_method_with_1_args(merged, FILL, list(unit, new_min, new_max));
                sublisp_throw($sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, merged);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }

    public static SubLObject heuristically_cast_unity(final SubLObject predicate, final SubLObject unity_term) {
        if (predicate.eql($$age)) {
            return cast_age(unity_term);
        }
        if (predicate.eql($$numberOfInhabitants)) {
            return cast_population(unity_term);
        }
        return unity_term;
    }

    public static SubLObject cast_age(final SubLObject unity_term) {
        if (!unity_term.isCons()) {
            return unity_term;
        }
        final SubLObject old_unit = unity_term.first();
        final SubLObject old_min = second(unity_term);
        final SubLObject old_max = third(unity_term);
        if (!$$Unity.eql(old_unit)) {
            return unity_term;
        }
        if (NIL != old_max) {
            return list($$YearsDuration, old_min, old_max);
        }
        return list($$YearsDuration, old_min);
    }

    public static SubLObject cast_population(final SubLObject unity_term) {
        if (!unity_term.isCons()) {
            return unity_term;
        }
        if ($$Unity.eql(unity_term.first())) {
            return second(unity_term);
        }
        final SubLObject quant = second(unity_term);
        final SubLObject quant_fn = (quant.isCons()) ? quant.first() : NIL;
        final SubLObject quant_head = (quant.isCons()) ? second(quant) : NIL;
        final SubLObject head = third(unity_term);
        final SubLObject head_head = (head.isCons()) ? third(head) : NIL;
        if (!$$NumericalQuant_NLAttrFn.eql(quant_fn)) {
            return unity_term;
        }
        if (NIL == term.el_fort_p(head_head)) {
            return unity_term;
        }
        if (NIL == genls.genl_in_any_mtP(head_head, $$HomoSapiens)) {
            return unity_term;
        }
        return quant_head;
    }

    public static SubLObject declare_sanity_checker_file() {
        declareFunction(me, "get_sanity_checker", "GET-SANITY-CHECKER", 0, 0, false);
        declareFunction(me, "get_piquant_sanity_checker", "GET-PIQUANT-SANITY-CHECKER", 1, 0, false);
        declareFunction(me, "sanity_check", "SANITY-CHECK", 3, 0, false);
        declareFunction(me, "cyc_sanity_check", "CYC-SANITY-CHECK", 3, 0, false);
        declareFunction(me, "cyc_sanity_filter", "CYC-SANITY-FILTER", 3, 0, false);
        declareFunction(me, "get_sanity_checker_show_debug_info", "GET-SANITY-CHECKER-SHOW-DEBUG-INFO", 1, 0, false);
        declareFunction(me, "set_sanity_checker_show_debug_info", "SET-SANITY-CHECKER-SHOW-DEBUG-INFO", 2, 0, false);
        declareFunction(me, "get_sanity_checker_fudge_factor", "GET-SANITY-CHECKER-FUDGE-FACTOR", 1, 0, false);
        declareFunction(me, "set_sanity_checker_fudge_factor", "SET-SANITY-CHECKER-FUDGE-FACTOR", 2, 0, false);
        declareFunction(me, "get_sanity_checker_scratchpad", "GET-SANITY-CHECKER-SCRATCHPAD", 1, 0, false);
        declareFunction(me, "set_sanity_checker_scratchpad", "SET-SANITY-CHECKER-SCRATCHPAD", 2, 0, false);
        declareFunction(me, "get_sanity_checker_cache", "GET-SANITY-CHECKER-CACHE", 1, 0, false);
        declareFunction(me, "set_sanity_checker_cache", "SET-SANITY-CHECKER-CACHE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sanity_checker_class", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sanity_checker_instance", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-INSTANCE", 1, 0, false);
        declareFunction(me, "sanity_checker_p", "SANITY-CHECKER-P", 1, 0, false);
        declareFunction(me, "sanity_checker_initialize_method", "SANITY-CHECKER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sanity_checker_show_debug_info_method", "SANITY-CHECKER-SHOW-DEBUG-INFO-METHOD", 1, 0, false);
        declareFunction(me, "sanity_checker_hide_debug_info_method", "SANITY-CHECKER-HIDE-DEBUG-INFO-METHOD", 1, 0, false);
        declareFunction(me, "sanity_checker_check_method", "SANITY-CHECKER-CHECK-METHOD", 4, 0, false);
        declareFunction(me, "sanity_checker_check_cyc_interpretations_method", "SANITY-CHECKER-CHECK-CYC-INTERPRETATIONS-METHOD", 4, 0, false);
        declareFunction(me, "sanity_checker_check_listified_method", "SANITY-CHECKER-CHECK-LISTIFIED-METHOD", 4, 0, false);
        declareFunction(me, "piquant_sanity_check", "PIQUANT-SANITY-CHECK", 4, 1, false);
        declareFunction(me, "subloop_reserved_initialize_piquant_sanity_checker_class", "SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_piquant_sanity_checker_instance", "SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-INSTANCE", 1, 0, false);
        declareFunction(me, "piquant_sanity_checker_p", "PIQUANT-SANITY-CHECKER-P", 1, 0, false);
        declareFunction(me, "piquant_sanity_checker_check_method", "PIQUANT-SANITY-CHECKER-CHECK-METHOD", 4, 0, false);
        declareFunction(me, "piquant_sanity_checker_check_listified_method", "PIQUANT-SANITY-CHECKER-CHECK-LISTIFIED-METHOD", 4, 0, false);
        declareFunction(me, "get_sanity_checker_scratchpad_degenerate_diagnosis", "GET-SANITY-CHECKER-SCRATCHPAD-DEGENERATE-DIAGNOSIS", 1, 0, false);
        declareFunction(me, "set_sanity_checker_scratchpad_degenerate_diagnosis", "SET-SANITY-CHECKER-SCRATCHPAD-DEGENERATE-DIAGNOSIS", 2, 0, false);
        declareFunction(me, "get_sanity_checker_scratchpad_checkers_pool", "GET-SANITY-CHECKER-SCRATCHPAD-CHECKERS-POOL", 1, 0, false);
        declareFunction(me, "set_sanity_checker_scratchpad_checkers_pool", "SET-SANITY-CHECKER-SCRATCHPAD-CHECKERS-POOL", 2, 0, false);
        declareFunction(me, "get_sanity_checker_scratchpad_cyc_answers", "GET-SANITY-CHECKER-SCRATCHPAD-CYC-ANSWERS", 1, 0, false);
        declareFunction(me, "set_sanity_checker_scratchpad_cyc_answers", "SET-SANITY-CHECKER-SCRATCHPAD-CYC-ANSWERS", 2, 0, false);
        declareFunction(me, "get_sanity_checker_scratchpad_answer", "GET-SANITY-CHECKER-SCRATCHPAD-ANSWER", 1, 0, false);
        declareFunction(me, "set_sanity_checker_scratchpad_answer", "SET-SANITY-CHECKER-SCRATCHPAD-ANSWER", 2, 0, false);
        declareFunction(me, "get_sanity_checker_scratchpad_cyc_focuses", "GET-SANITY-CHECKER-SCRATCHPAD-CYC-FOCUSES", 1, 0, false);
        declareFunction(me, "set_sanity_checker_scratchpad_cyc_focuses", "SET-SANITY-CHECKER-SCRATCHPAD-CYC-FOCUSES", 2, 0, false);
        declareFunction(me, "get_sanity_checker_scratchpad_focus", "GET-SANITY-CHECKER-SCRATCHPAD-FOCUS", 1, 0, false);
        declareFunction(me, "set_sanity_checker_scratchpad_focus", "SET-SANITY-CHECKER-SCRATCHPAD-FOCUS", 2, 0, false);
        declareFunction(me, "get_sanity_checker_scratchpad_predicate", "GET-SANITY-CHECKER-SCRATCHPAD-PREDICATE", 1, 0, false);
        declareFunction(me, "set_sanity_checker_scratchpad_predicate", "SET-SANITY-CHECKER-SCRATCHPAD-PREDICATE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sanity_checker_scratchpad_class", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sanity_checker_scratchpad_instance", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-INSTANCE", 1, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_p", "SANITY-CHECKER-SCRATCHPAD-P", 1, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_output_diagnoses_method", "SANITY-CHECKER-SCRATCHPAD-OUTPUT-DIAGNOSES-METHOD", 1, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_initialize_method", "SANITY-CHECKER-SCRATCHPAD-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_set_focus_method", "SANITY-CHECKER-SCRATCHPAD-SET-FOCUS-METHOD", 2, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_set_piquant_focus_method", "SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-FOCUS-METHOD", 2, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_set_predicate_method", "SANITY-CHECKER-SCRATCHPAD-SET-PREDICATE-METHOD", 2, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_set_piquant_predicate_method", "SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-PREDICATE-METHOD", 2, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_set_answer_method", "SANITY-CHECKER-SCRATCHPAD-SET-ANSWER-METHOD", 2, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_set_cyc_answers_method", "SANITY-CHECKER-SCRATCHPAD-SET-CYC-ANSWERS-METHOD", 2, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_compute_cyc_answers_method", "SANITY-CHECKER-SCRATCHPAD-COMPUTE-CYC-ANSWERS-METHOD", 2, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_compute_degenerate_diagnosis_method", "SANITY-CHECKER-SCRATCHPAD-COMPUTE-DEGENERATE-DIAGNOSIS-METHOD", 1, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_initialize_checkers_method", "SANITY-CHECKER-SCRATCHPAD-INITIALIZE-CHECKERS-METHOD", 2, 0, false);
        declareFunction(me, "sanity_checker_scratchpad_diagnose_method", "SANITY-CHECKER-SCRATCHPAD-DIAGNOSE-METHOD", 1, 0, false);
        declareFunction(me, "set_scalar_checker_backchain_parameter", "SET-SCALAR-CHECKER-BACKCHAIN-PARAMETER", 1, 0, false);
        declareFunction(me, "get_scalar_checker_arg2range", "GET-SCALAR-CHECKER-ARG2RANGE", 1, 0, false);
        declareFunction(me, "set_scalar_checker_arg2range", "SET-SCALAR-CHECKER-ARG2RANGE", 2, 0, false);
        declareFunction(me, "get_scalar_checker_arg2", "GET-SCALAR-CHECKER-ARG2", 1, 0, false);
        declareFunction(me, "set_scalar_checker_arg2", "SET-SCALAR-CHECKER-ARG2", 2, 0, false);
        declareFunction(me, "get_scalar_checker_arg1", "GET-SCALAR-CHECKER-ARG1", 1, 0, false);
        declareFunction(me, "set_scalar_checker_arg1", "SET-SCALAR-CHECKER-ARG1", 2, 0, false);
        declareFunction(me, "get_scalar_checker_backchain", "GET-SCALAR-CHECKER-BACKCHAIN", 1, 0, false);
        declareFunction(me, "set_scalar_checker_backchain", "SET-SCALAR-CHECKER-BACKCHAIN", 2, 0, false);
        declareFunction(me, "get_scalar_checker_diagnosis", "GET-SCALAR-CHECKER-DIAGNOSIS", 1, 0, false);
        declareFunction(me, "set_scalar_checker_diagnosis", "SET-SCALAR-CHECKER-DIAGNOSIS", 2, 0, false);
        declareFunction(me, "get_scalar_checker_predicate", "GET-SCALAR-CHECKER-PREDICATE", 1, 0, false);
        declareFunction(me, "set_scalar_checker_predicate", "SET-SCALAR-CHECKER-PREDICATE", 2, 0, false);
        declareFunction(me, "get_scalar_checker_fudge_factor", "GET-SCALAR-CHECKER-FUDGE-FACTOR", 1, 0, false);
        declareFunction(me, "set_scalar_checker_fudge_factor", "SET-SCALAR-CHECKER-FUDGE-FACTOR", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_scalar_checker_class", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_scalar_checker_instance", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-INSTANCE", 1, 0, false);
        declareFunction(me, "scalar_checker_p", "SCALAR-CHECKER-P", 1, 0, false);
        declareFunction(me, "scalar_checker_initialize_method", "SCALAR-CHECKER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "scalar_checker_compute_range_method", "SCALAR-CHECKER-COMPUTE-RANGE-METHOD", 1, 0, false);
        declareFunction(me, "typeshift_argument", "TYPESHIFT-ARGUMENT", 1, 0, false);
        declareFunction(me, "scalar_checker_diagnose_method", "SCALAR-CHECKER-DIAGNOSE-METHOD", 1, 0, false);
        declareFunction(me, "get_sanity_checker_diagnosis_predicate", "GET-SANITY-CHECKER-DIAGNOSIS-PREDICATE", 1, 0, false);
        declareFunction(me, "set_sanity_checker_diagnosis_predicate", "SET-SANITY-CHECKER-DIAGNOSIS-PREDICATE", 2, 0, false);
        declareFunction(me, "get_sanity_checker_diagnosis_proposed_arg", "GET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-ARG", 1, 0, false);
        declareFunction(me, "set_sanity_checker_diagnosis_proposed_arg", "SET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-ARG", 2, 0, false);
        declareFunction(me, "get_sanity_checker_diagnosis_proposed_value", "GET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-VALUE", 1, 0, false);
        declareFunction(me, "set_sanity_checker_diagnosis_proposed_value", "SET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-VALUE", 2, 0, false);
        declareFunction(me, "get_sanity_checker_diagnosis_justification", "GET-SANITY-CHECKER-DIAGNOSIS-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "set_sanity_checker_diagnosis_justification", "SET-SANITY-CHECKER-DIAGNOSIS-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "get_sanity_checker_diagnosis_answer", "GET-SANITY-CHECKER-DIAGNOSIS-ANSWER", 1, 0, false);
        declareFunction(me, "set_sanity_checker_diagnosis_answer", "SET-SANITY-CHECKER-DIAGNOSIS-ANSWER", 2, 0, false);
        declareFunction(me, "get_sanity_checker_diagnosis_answer_known", "GET-SANITY-CHECKER-DIAGNOSIS-ANSWER-KNOWN", 1, 0, false);
        declareFunction(me, "set_sanity_checker_diagnosis_answer_known", "SET-SANITY-CHECKER-DIAGNOSIS-ANSWER-KNOWN", 2, 0, false);
        declareFunction(me, "get_sanity_checker_diagnosis_complete", "GET-SANITY-CHECKER-DIAGNOSIS-COMPLETE", 1, 0, false);
        declareFunction(me, "set_sanity_checker_diagnosis_complete", "SET-SANITY-CHECKER-DIAGNOSIS-COMPLETE", 2, 0, false);
        declareFunction(me, "get_sanity_checker_diagnosis_failure_code", "GET-SANITY-CHECKER-DIAGNOSIS-FAILURE-CODE", 1, 0, false);
        declareFunction(me, "set_sanity_checker_diagnosis_failure_code", "SET-SANITY-CHECKER-DIAGNOSIS-FAILURE-CODE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sanity_checker_diagnosis_class", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sanity_checker_diagnosis_instance", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-INSTANCE", 1, 0, false);
        declareFunction(me, "sanity_checker_diagnosis_p", "SANITY-CHECKER-DIAGNOSIS-P", 1, 0, false);
        declareFunction(me, "sanity_checker_diagnosis_initialize_method", "SANITY-CHECKER-DIAGNOSIS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sanity_checker_diagnosis_boolean_method", "SANITY-CHECKER-DIAGNOSIS-BOOLEAN-METHOD", 1, 0, false);
        declareFunction(me, "get_scalar_range_point_info", "GET-SCALAR-RANGE-POINT-INFO", 1, 0, false);
        declareFunction(me, "set_scalar_range_point_info", "SET-SCALAR-RANGE-POINT-INFO", 2, 0, false);
        declareFunction(me, "get_scalar_range_max", "GET-SCALAR-RANGE-MAX", 1, 0, false);
        declareFunction(me, "set_scalar_range_max", "SET-SCALAR-RANGE-MAX", 2, 0, false);
        declareFunction(me, "get_scalar_range_min", "GET-SCALAR-RANGE-MIN", 1, 0, false);
        declareFunction(me, "set_scalar_range_min", "SET-SCALAR-RANGE-MIN", 2, 0, false);
        declareFunction(me, "get_scalar_range_unit", "GET-SCALAR-RANGE-UNIT", 1, 0, false);
        declareFunction(me, "set_scalar_range_unit", "SET-SCALAR-RANGE-UNIT", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_scalar_range_class", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_scalar_range_instance", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-INSTANCE", 1, 0, false);
        declareFunction(me, "scalar_range_p", "SCALAR-RANGE-P", 1, 0, false);
        declareFunction(me, "scalar_range_print_method", "SCALAR-RANGE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "scalar_range_initialize_method", "SCALAR-RANGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "scalar_range_empty_p_method", "SCALAR-RANGE-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "scalar_range_fill_method", "SCALAR-RANGE-FILL-METHOD", 2, 0, false);
        declareFunction(me, "scalar_range_get_unit_method", "SCALAR-RANGE-GET-UNIT-METHOD", 1, 0, false);
        declareFunction(me, "scalar_range_get_min_method", "SCALAR-RANGE-GET-MIN-METHOD", 1, 0, false);
        declareFunction(me, "scalar_range_get_min_value_method", "SCALAR-RANGE-GET-MIN-VALUE-METHOD", 1, 0, false);
        declareFunction(me, "scalar_range_get_max_method", "SCALAR-RANGE-GET-MAX-METHOD", 1, 0, false);
        declareFunction(me, "scalar_range_get_max_value_method", "SCALAR-RANGE-GET-MAX-VALUE-METHOD", 1, 0, false);
        declareFunction(me, "scalar_range_listify_method", "SCALAR-RANGE-LISTIFY-METHOD", 1, 0, false);
        declareFunction(me, "scalar_range_fudge_method", "SCALAR-RANGE-FUDGE-METHOD", 2, 0, false);
        declareFunction(me, "scalar_range_convertible_p_method", "SCALAR-RANGE-CONVERTIBLE-P-METHOD", 2, 0, false);
        declareFunction(me, "scalar_range_merge_method", "SCALAR-RANGE-MERGE-METHOD", 2, 0, false);
        declareFunction(me, "scalar_range_merge_loose_method", "SCALAR-RANGE-MERGE-LOOSE-METHOD", 2, 0, false);
        declareFunction(me, "scalar_range_merge_strict_method", "SCALAR-RANGE-MERGE-STRICT-METHOD", 2, 0, false);
        declareFunction(me, "heuristically_cast_unity", "HEURISTICALLY-CAST-UNITY", 2, 0, false);
        declareFunction(me, "cast_age", "CAST-AGE", 1, 0, false);
        declareFunction(me, "cast_population", "CAST-POPULATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sanity_checker_file() {
        defvar("*SANITY-CHECKER*", NIL);
        defvar("*PIQUANT-SANITY-CHECKERS*", make_hash_table(EIGHT_INTEGER, symbol_function(EQUALP), UNPROVIDED));
        defvar("*SCALAR-CHECKER-BACKCHAIN*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_sanity_checker_file() {
        classes.subloop_new_class(SANITY_CHECKER, OBJECT, NIL, NIL, $list10);
        classes.class_set_implements_slot_listeners(SANITY_CHECKER, NIL);
        classes.subloop_note_class_initialization_function(SANITY_CHECKER, SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_CLASS);
        classes.subloop_note_instance_initialization_function(SANITY_CHECKER, SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_INSTANCE);
        subloop_reserved_initialize_sanity_checker_class(SANITY_CHECKER);
        methods.methods_incorporate_instance_method(INITIALIZE, SANITY_CHECKER, $list20, NIL, $list21);
        methods.subloop_register_instance_method(SANITY_CHECKER, INITIALIZE, SANITY_CHECKER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SHOW_DEBUG_INFO, SANITY_CHECKER, $list20, NIL, $list24);
        methods.subloop_register_instance_method(SANITY_CHECKER, SHOW_DEBUG_INFO, SANITY_CHECKER_SHOW_DEBUG_INFO_METHOD);
        methods.methods_incorporate_instance_method(HIDE_DEBUG_INFO, SANITY_CHECKER, $list20, NIL, $list28);
        methods.subloop_register_instance_method(SANITY_CHECKER, HIDE_DEBUG_INFO, SANITY_CHECKER_DEBUG_INFO_METHOD);
        methods.methods_incorporate_instance_method(CHECK, SANITY_CHECKER, $list31, $list32, $list33);
        methods.subloop_register_instance_method(SANITY_CHECKER, CHECK, SANITY_CHECKER_CHECK_METHOD);
        methods.methods_incorporate_instance_method(CHECK_CYC_INTERPRETATIONS, SANITY_CHECKER, $list31, $list47, $list48);
        methods.subloop_register_instance_method(SANITY_CHECKER, CHECK_CYC_INTERPRETATIONS, SANITY_CHECKER_CHECK_CYC_INTERPRETATIONS_METHOD);
        methods.methods_incorporate_instance_method(CHECK_LISTIFIED, SANITY_CHECKER, $list31, $list32, $list54);
        methods.subloop_register_instance_method(SANITY_CHECKER, CHECK_LISTIFIED, SANITY_CHECKER_CHECK_LISTIFIED_METHOD);
        classes.subloop_new_class(PIQUANT_SANITY_CHECKER, SANITY_CHECKER, NIL, NIL, $list60);
        classes.class_set_implements_slot_listeners(PIQUANT_SANITY_CHECKER, NIL);
        classes.subloop_note_class_initialization_function(PIQUANT_SANITY_CHECKER, SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_CLASS);
        classes.subloop_note_instance_initialization_function(PIQUANT_SANITY_CHECKER, SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_INSTANCE);
        subloop_reserved_initialize_piquant_sanity_checker_class(PIQUANT_SANITY_CHECKER);
        methods.methods_incorporate_instance_method(CHECK, PIQUANT_SANITY_CHECKER, $list31, $list63, $list64);
        methods.subloop_register_instance_method(PIQUANT_SANITY_CHECKER, CHECK, PIQUANT_SANITY_CHECKER_CHECK_METHOD);
        methods.methods_incorporate_instance_method(CHECK_LISTIFIED, PIQUANT_SANITY_CHECKER, $list31, $list63, $list68);
        methods.subloop_register_instance_method(PIQUANT_SANITY_CHECKER, CHECK_LISTIFIED, PIQUANT_SANITY_CHECKER_CHECK_LISTIFIED_METHOD);
        classes.subloop_new_class(SANITY_CHECKER_SCRATCHPAD, OBJECT, NIL, NIL, $list71);
        classes.class_set_implements_slot_listeners(SANITY_CHECKER_SCRATCHPAD, NIL);
        classes.subloop_note_class_initialization_function(SANITY_CHECKER_SCRATCHPAD, SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_CLASS);
        classes.subloop_note_instance_initialization_function(SANITY_CHECKER_SCRATCHPAD, SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_INSTANCE);
        subloop_reserved_initialize_sanity_checker_scratchpad_class(SANITY_CHECKER_SCRATCHPAD);
        methods.methods_incorporate_instance_method(OUTPUT_DIAGNOSES, SANITY_CHECKER_SCRATCHPAD, $list31, NIL, $list79);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, OUTPUT_DIAGNOSES, SANITY_CHECKER_SCRATCHPAD_OUTPUT_DIAGNOSES_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SANITY_CHECKER_SCRATCHPAD, $list20, NIL, $list83);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, INITIALIZE, SANITY_CHECKER_SCRATCHPAD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_FOCUS, SANITY_CHECKER_SCRATCHPAD, $list31, $list85, $list86);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, SET_FOCUS, SANITY_CHECKER_SCRATCHPAD_SET_FOCUS_METHOD);
        methods.methods_incorporate_instance_method(SET_PIQUANT_FOCUS, SANITY_CHECKER_SCRATCHPAD, $list31, $list89, $list90);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, SET_PIQUANT_FOCUS, SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_FOCUS_METHOD);
        methods.methods_incorporate_instance_method(SET_PREDICATE, SANITY_CHECKER_SCRATCHPAD, $list31, $list97, $list98);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, SET_PREDICATE, SANITY_CHECKER_SCRATCHPAD_SET_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_PIQUANT_PREDICATE, SANITY_CHECKER_SCRATCHPAD, $list31, $list103, $list104);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, SET_PIQUANT_PREDICATE, SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_ANSWER, SANITY_CHECKER_SCRATCHPAD, $list31, $list85, $list107);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, SET_ANSWER, SANITY_CHECKER_SCRATCHPAD_SET_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(SET_CYC_ANSWERS, SANITY_CHECKER_SCRATCHPAD, $list31, $list111, $list112);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, SET_CYC_ANSWERS, SANITY_CHECKER_SCRATCHPAD_SET_CYC_ANSWERS_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_CYC_ANSWERS, SANITY_CHECKER_SCRATCHPAD, $list116, $list85, $list117);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, COMPUTE_CYC_ANSWERS, SANITY_CHECKER_SCRATCHPAD_COMPUTE_CYC_ANSWERS_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_DEGENERATE_DIAGNOSIS, SANITY_CHECKER_SCRATCHPAD, $list116, NIL, $list122);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, COMPUTE_DEGENERATE_DIAGNOSIS, SANITY_CHECKER_SCRATCHPAD_COMPUTE_DEGENERATE_DIAGNOSIS_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_CHECKERS, SANITY_CHECKER_SCRATCHPAD, $list31, $list128, $list129);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, INITIALIZE_CHECKERS, SANITY_CHECKER_SCRATCHPAD_INITIALIZE_CHECKERS_METHOD);
        methods.methods_incorporate_instance_method(DIAGNOSE, SANITY_CHECKER_SCRATCHPAD, $list31, NIL, $list138);
        methods.subloop_register_instance_method(SANITY_CHECKER_SCRATCHPAD, DIAGNOSE, SANITY_CHECKER_SCRATCHPAD_DIAGNOSE_METHOD);
        classes.subloop_new_class(SCALAR_CHECKER, OBJECT, NIL, NIL, $list143);
        classes.class_set_implements_slot_listeners(SCALAR_CHECKER, NIL);
        classes.subloop_note_class_initialization_function(SCALAR_CHECKER, SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_CLASS);
        classes.subloop_note_instance_initialization_function(SCALAR_CHECKER, SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_INSTANCE);
        subloop_reserved_initialize_scalar_checker_class(SCALAR_CHECKER);
        methods.methods_incorporate_instance_method(INITIALIZE, SCALAR_CHECKER, $list20, NIL, $list148);
        methods.subloop_register_instance_method(SCALAR_CHECKER, INITIALIZE, SCALAR_CHECKER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_RANGE, SCALAR_CHECKER, $list31, NIL, $list151);
        methods.subloop_register_instance_method(SCALAR_CHECKER, COMPUTE_RANGE, SCALAR_CHECKER_COMPUTE_RANGE_METHOD);
        methods.methods_incorporate_instance_method(DIAGNOSE, SCALAR_CHECKER, $list31, NIL, $list163);
        methods.subloop_register_instance_method(SCALAR_CHECKER, DIAGNOSE, SCALAR_CHECKER_DIAGNOSE_METHOD);
        classes.subloop_new_class(SANITY_CHECKER_DIAGNOSIS, OBJECT, NIL, NIL, $list178);
        classes.class_set_implements_slot_listeners(SANITY_CHECKER_DIAGNOSIS, NIL);
        classes.subloop_note_class_initialization_function(SANITY_CHECKER_DIAGNOSIS, SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_CLASS);
        classes.subloop_note_instance_initialization_function(SANITY_CHECKER_DIAGNOSIS, SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_INSTANCE);
        subloop_reserved_initialize_sanity_checker_diagnosis_class(SANITY_CHECKER_DIAGNOSIS);
        methods.methods_incorporate_instance_method(INITIALIZE, SANITY_CHECKER_DIAGNOSIS, $list20, NIL, $list181);
        methods.subloop_register_instance_method(SANITY_CHECKER_DIAGNOSIS, INITIALIZE, SANITY_CHECKER_DIAGNOSIS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(BOOLEAN, SANITY_CHECKER_DIAGNOSIS, $list20, NIL, $list184);
        methods.subloop_register_instance_method(SANITY_CHECKER_DIAGNOSIS, BOOLEAN, SANITY_CHECKER_DIAGNOSIS_BOOLEAN_METHOD);
        classes.subloop_new_class(SCALAR_RANGE, OBJECT, NIL, NIL, $list187);
        classes.class_set_implements_slot_listeners(SCALAR_RANGE, NIL);
        classes.subloop_note_class_initialization_function(SCALAR_RANGE, SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_CLASS);
        classes.subloop_note_instance_initialization_function(SCALAR_RANGE, SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_INSTANCE);
        subloop_reserved_initialize_scalar_range_class(SCALAR_RANGE);
        methods.methods_incorporate_instance_method(PRINT, SCALAR_RANGE, $list20, $list195, $list196);
        methods.subloop_register_instance_method(SCALAR_RANGE, PRINT, SCALAR_RANGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SCALAR_RANGE, $list20, NIL, $list199);
        methods.subloop_register_instance_method(SCALAR_RANGE, INITIALIZE, SCALAR_RANGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, SCALAR_RANGE, $list31, NIL, $list202);
        methods.subloop_register_instance_method(SCALAR_RANGE, EMPTY_P, SCALAR_RANGE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(FILL, SCALAR_RANGE, $list31, $list205, $list206);
        methods.subloop_register_instance_method(SCALAR_RANGE, FILL, SCALAR_RANGE_FILL_METHOD);
        methods.methods_incorporate_instance_method(GET_UNIT, SCALAR_RANGE, $list31, NIL, $list214);
        methods.subloop_register_instance_method(SCALAR_RANGE, GET_UNIT, SCALAR_RANGE_GET_UNIT_METHOD);
        methods.methods_incorporate_instance_method(GET_MIN, SCALAR_RANGE, $list31, NIL, $list217);
        methods.subloop_register_instance_method(SCALAR_RANGE, GET_MIN, SCALAR_RANGE_GET_MIN_METHOD);
        methods.methods_incorporate_instance_method(GET_MIN_VALUE, SCALAR_RANGE, $list31, NIL, $list221);
        methods.subloop_register_instance_method(SCALAR_RANGE, GET_MIN_VALUE, SCALAR_RANGE_GET_MIN_VALUE_METHOD);
        methods.methods_incorporate_instance_method(GET_MAX, SCALAR_RANGE, $list31, NIL, $list224);
        methods.subloop_register_instance_method(SCALAR_RANGE, GET_MAX, SCALAR_RANGE_GET_MAX_METHOD);
        methods.methods_incorporate_instance_method(GET_MAX_VALUE, SCALAR_RANGE, $list31, NIL, $list228);
        methods.subloop_register_instance_method(SCALAR_RANGE, GET_MAX_VALUE, SCALAR_RANGE_GET_MAX_VALUE_METHOD);
        methods.methods_incorporate_instance_method(LISTIFY, SCALAR_RANGE, $list31, NIL, $list231);
        methods.subloop_register_instance_method(SCALAR_RANGE, LISTIFY, SCALAR_RANGE_LISTIFY_METHOD);
        methods.methods_incorporate_instance_method(FUDGE, SCALAR_RANGE, $list31, $list128, $list234);
        methods.subloop_register_instance_method(SCALAR_RANGE, FUDGE, SCALAR_RANGE_FUDGE_METHOD);
        methods.methods_incorporate_instance_method(CONVERTIBLE_P, SCALAR_RANGE, $list31, $list238, $list239);
        methods.subloop_register_instance_method(SCALAR_RANGE, CONVERTIBLE_P, SCALAR_RANGE_CONVERTIBLE_P_METHOD);
        methods.methods_incorporate_instance_method(MERGE, SCALAR_RANGE, $list31, $list238, $list245);
        methods.subloop_register_instance_method(SCALAR_RANGE, MERGE, SCALAR_RANGE_MERGE_METHOD);
        methods.methods_incorporate_instance_method(MERGE_LOOSE, SCALAR_RANGE, $list31, $list238, $list250);
        methods.subloop_register_instance_method(SCALAR_RANGE, MERGE_LOOSE, SCALAR_RANGE_MERGE_LOOSE_METHOD);
        methods.methods_incorporate_instance_method(MERGE_STRICT, SCALAR_RANGE, $list31, $list238, $list254);
        methods.subloop_register_instance_method(SCALAR_RANGE, MERGE_STRICT, SCALAR_RANGE_MERGE_STRICT_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sanity_checker_file();
    }

    @Override
    public void initializeVariables() {
        init_sanity_checker_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sanity_checker_file();
    }

    
}

/**
 * Total time: 1400 ms synthetic
 */
